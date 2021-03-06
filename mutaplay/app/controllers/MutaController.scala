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

  val sha256Protocol = "sha256://"


  def labelByCurrentHost(label: String) = Action { implicit req =>

    //TODO Embed the hashes into the names of the files

    PRINT | s"${req.remoteAddress} ${req.headers.get("X-Real-IP")} ${req.uri} $label"

    val host = if (req.host.split(":")(0) == "localhost") {
      PRINT | "localhost override"
      "tal.jackman.biz"
    } else {
      req.host
    }


    labelCacher.resolveDns(host, label) match {
      case Some(url) =>
        if (url.startsWith(sha256Protocol)) {
          req.headers.get(IF_NONE_MATCH) match {
            case Some(etags) =>
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

  def getBySha256(rawSha256: String) = Action { req =>
    val sha256 = rawSha256.takeWhile(c => (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z'))
    def get() = sha256Cacher.get(sha256) match {
      case Some(f) =>
        var resp = Ok.sendFile(f, inline = true)
        MimeTypes.forFileName(rawSha256).foreach(mt => resp = resp.withHeaders(CONTENT_TYPE -> mt))
        resp = resp.withHeaders(
          CACHE_CONTROL -> "public, max-age=31536000",
          ETAG -> ("\"" + sha256 + "\"")
        )
        resp
      case None => NotFound
    }

    req.headers.get(IF_NONE_MATCH) match {
      case Some(etags) =>
        if (etags.contains(sha256)) {
          //More throrough but tottally unneeded version
          //        if (etags.replaceAll("\"", "").split(",").map(_.trim).contains(sha256)) {
          NotModified
        } else {
          get()
        }
      case _ =>
        get()
    }

  }

  def getByHashUrl(hashUrl: String, filename: String) = {
    if (hashUrl.startsWith(sha256Protocol)) {
      val sha256 = hashUrl.drop(sha256Protocol.length)
      sha256Cacher.get(sha256).map { f =>
        var resp = Ok.sendFile(f, inline = true)
        MimeTypes.forFileName(filename).foreach(mt => resp = resp.withHeaders(CONTENT_TYPE -> mt))
        resp = resp.withHeaders(
          ETAG -> ("\"" + hashUrl + "\""),
          //TODO Consider not using no-cache
          //See this for more detail: https://developers.google.com/web/fundamentals/performance/optimizing-content-efficiency/http-caching#cache-control
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