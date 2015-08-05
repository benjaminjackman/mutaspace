package controllers

import java.io.File


import cgta.oscala.util.Slurp
import cgta.oscala.util.debugging.PRINT
import play.api.libs.MimeTypes
import play.api.mvc.Action
import play.api.mvc.Controller

import scala.util.Properties


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/5/15 7:21 AM
//////////////////////////////////////////////////////////////

case class VersionManifestEntry(path: String, hash: String)
case class VersionManifest(urlToHash: IMap[String, Set[String]], nameToHash: IMap[String, String])

class VersionCacher(versionDir: File) {
  val lock = OLock()
  val manifestExt = "manifest"
  var versionCache =  IMap.empty[String, VersionManifest]
  def getVersionManifest(version: String): Option[VersionManifest] = {
    versionCache.get(version) match {
      case Some(manifest) => Some(manifest)
      case None =>
        val manifestOpt = versionDir.listFiles().find(f => f.isFile && f.getName == s"$version.$manifestExt") map { f =>
          val hash_paths = Slurp.asString(f.getPath).split("\n").flatMap {
            _.split(" ").toList match {
              case path :: hash :: Nil => Some(hash -> path)
              case _ => None
            }
          }
          VersionManifest(
            urlToHash = hash_paths.groupBy(_._1).mapValues(_.map(_._2).toSet),
            nameToHash = IMap() ++ hash_paths.map(sn => sn._2 -> sn._1)
          )
        }

        manifestOpt.foreach { manifest =>
          //Dont cache the head version!
          if (!version.startsWith("HEAD")) {
            lock.using(versionCache += version -> manifest)
          }
        }
        manifestOpt
    }

  }
  def getAllVersions(): List[String] = {
    versionDir
      .listFiles()
      .filter(f => f.isFile && f.getName.endsWith(s".$manifestExt"))
      .map(_.getName.dropRight(manifestExt.length + 1))
      .toList
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


object VersionedController extends Controller {
  val manifestDir = (Properties.userHome + "/muta/label/dns/mutaspace.jackman.biz/version").toFile
  val sha256Dir = (Properties.userHome + "/muta/hash/sha256").toFile

  val versionCacher = new VersionCacher(manifestDir)
  val sha256Cacher = new Sha256Cacher(sha256Dir)

  def lookup(version: String, file: String) = Action { req =>
    versionCacher.getVersionManifest(version) match {
      case Some(manifest) =>
        val hash = manifest.nameToHash.get(file)
        hash match {
          case Some(hash) =>
            req.headers.get(IF_NONE_MATCH).foreach(PRINT | _)
            req.headers.get(IF_NONE_MATCH) match {
              case Some(etags) if etags.split(",").map(_.trim).contains(hash) => NotModified
              case None => getByUrl(hash = hash, file)
            }
          case None =>
            PRINT | "NO HASH: " + version + " " + file
            NotFound
        }
      case None =>
        PRINT | "NO VERSION"
        NotFound
    }
  }
  val sha256Protocol = "sha256://"

  def getByUrl(hash: String, filename: String) = {
    if (hash.startsWith(sha256Protocol)) {
      val sha256 = hash.drop(sha256Protocol.length)
      sha256Cacher.get(sha256).map { f =>
        var resp = Ok.sendFile(f, inline = true)
        MimeTypes.forFileName(filename).foreach(mt => resp = resp.withHeaders(CONTENT_TYPE -> mt))
        resp = resp.withHeaders(
          ETAG -> ("\"" + hash + "\""),
          CACHE_CONTROL -> "public, max-age=31536000"
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