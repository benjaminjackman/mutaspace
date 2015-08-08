package controllers

import java.io.File

import cgta.oscala.util.Slurp
import cgta.oscala.util.debugging.PRINT
import play.api.libs.MimeTypes
import play.api.mvc.Action
import play.api.mvc.Controller

import scala.annotation.tailrec
import scala.util.Properties


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/5/15 7:21 AM
//////////////////////////////////////////////////////////////


case class CachedLabelFile(lastMod: Long, labels: IMap[String, String])

class LabelCacher(labelDir: File) {
  val lock = OLock()
  var fileCache = new java.util.LinkedHashMap[String, CachedLabelFile]()

  def resolveDns(host: String, rpath: String): Option[String] = {
    resolve(s"/dns/$host/$rpath")
  }

  def resolve(label: String): Option[String] = {
    def resolveInFile(f: File, xs: List[String]): Option[String] = {
      def reload(): Option[CachedLabelFile] = {
        val cf = CachedLabelFile(
          f.lastModified(),
          IMap() ++ Slurp.asString(f.getPath).split("\n").flatMap { line =>
            val i = line.indexOf(' ')
            if (i > 0) {
              val label = line.substring(0, i)
              val value = line.substring(i + 1)
              Some(label -> value)
            } else {
              None
            }
          }
        )
        lock.using(fileCache.put(f.getPath, cf))
        Some(cf)
      }

      (fileCache.get(f.getPath) match {
        case null =>
          reload()
        case fc if f.lastModified() == fc.lastMod =>
          Some(fc)
        case _ =>
          reload()
      }) flatMap { fc =>
        val label = xs match {
          case Nil =>
            "."
          case xs =>
            xs.mkString("/")
        }
        fc.labels.get(label)
      }

    }

    @tailrec
    def loopDir(cwd: File, xs: List[String]): Option[String] = {
      xs match {
        case Nil => None
        case x :: xs if x.isEmpty || x == "." =>
          loopDir(cwd, xs)
        case x :: xs if x != ".." =>
          val f = new File(cwd, x)
          if (f.exists()) {
            if (f.isDirectory) {
              loopDir(f, xs)
            } else {
              resolveInFile(f, xs)
            }
          } else {
            None
          }
        case _ =>
          None
      }
    }
    if (label.endsWith("/")) {
      //Labels cannot end with a /
      None
    } else {
      loopDir(labelDir, label.split("/").toList)
    }
  }

}


class Sha256Cacher(sha256Dir: File) {
  require(sha256Dir.exists())
  val canon = sha256Dir.getCanonicalFile
  val canonPath = sha256Dir.getCanonicalPath
  val lock = OLock()
  var shaCache = IMap.empty[String, File]

  def get(sha256: String): Option[File] = {
    shaCache.get(sha256).orElse {
      val f = new File(sha256Dir, sha256)
      if (f.getParentFile.getCanonicalPath == canonPath) {
        lock.using(shaCache += sha256 -> f)
        Some(f)
      } else {
        None
      }
    }
  }
}


object MutaController extends Controller {
  val labelDir = (Properties.userHome + "/muta/label").toFile
  val sha256Dir = (Properties.userHome + "/muta/hash/sha256").toFile

  val labelCacher = new LabelCacher(labelDir)
  val sha256Cacher = new Sha256Cacher(sha256Dir)


  def labelByCurrentHost(label: String) = Action { implicit req =>

    PRINT | s"${req.remoteAddress} ${req.uri} $label"

    val host = if (req.host.split(":")(0) == "localhost") {
      PRINT | "localhost override"
      "tal.jackman.biz"
    } else {
      req.host
    }


    labelCacher.resolveDns(host, label) match {
      case Some(url) =>
        if (url.startsWith(sha256Protocol)) {
          req.headers.get(IF_NONE_MATCH).foreach(PRINT | _)
          req.headers.get(IF_NONE_MATCH) match {
            case Some(etags)  =>
              if (etags.replaceAll("\"", "").split(",").map(_.trim).contains(url)) {
                NotModified
              } else {
                getByHashUrl(hashUrl = url, label)
              }
            case _ => getByHashUrl(hashUrl = url, label)
          }
        } else {
          Redirect(url)
        }
      case None =>
        PRINT | s"NO LABEL: $host $label"
        NotFound
    }
  }
  val sha256Protocol = "sha256://"

  def getByHashUrl(hashUrl: String, filename: String) = {
    if (hashUrl.startsWith(sha256Protocol)) {
      val sha256 = hashUrl.drop(sha256Protocol.length)
      sha256Cacher.get(sha256).map { f =>
        var resp = Ok.sendFile(f, inline = true)
        MimeTypes.forFileName(filename).foreach(mt => resp = resp.withHeaders(CONTENT_TYPE -> mt))
        resp = resp.withHeaders(
          ETAG -> ("\"" + hashUrl + "\""),
          CACHE_CONTROL -> "public, no-cache, max-age=31536000"
        )
        resp
      } getOrElse {
        NotFound
      }
    } else {
      NotFound
    }

  }

}


//case class VersionManifestEntry(path: String, hash: String)
//case class VersionManifest(urlToHash: IMap[String, Set[String]], nameToHash: IMap[String, String])
//
//class VersionCacher(versionDir: File) {
//  val lock = OLock()
//  val manifestExt = "manifest"
//  var versionCache = IMap.empty[String, VersionManifest]
//  def getVersionManifest(version: String): Option[VersionManifest] = {
//    versionCache.get(version) match {
//      case Some(manifest) => Some(manifest)
//      case None =>
//        val manifestOpt = versionDir.listFiles().find(f => f.isFile && f.getName == s"$version.$manifestExt") map { f =>
//          val hash_paths = Slurp.asString(f.getPath).split("\n").flatMap {
//            _.split(" ").toList match {
//              case path :: hash :: Nil => Some(hash -> path)
//              case _ => None
//            }
//          }
//          VersionManifest(
//            urlToHash = hash_paths.groupBy(_._1).mapValues(_.map(_._2).toSet),
//            nameToHash = IMap() ++ hash_paths.map(sn => sn._2 -> sn._1)
//          )
//        }
//
//        manifestOpt.foreach { manifest =>
//          //Dont cache the head version!
//          if (!version.startsWith("HEAD")) {
//            lock.using(versionCache += version -> manifest)
//          }
//        }
//        manifestOpt
//    }
//
//  }
//  def getAllVersions(): List[String] = {
//    versionDir
//      .listFiles()
//      .filter(f => f.isFile && f.getName.endsWith(s".$manifestExt"))
//      .map(_.getName.dropRight(manifestExt.length + 1))
//      .toList
//  }
//}