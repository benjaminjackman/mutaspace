package controllers

import java.io.File


import cgta.oscala.util.Slurp
import play.Play
import play.api.libs.MimeTypes
import play.api.mvc.Action
import play.api.mvc.Controller


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/5/15 7:21 AM
//////////////////////////////////////////////////////////////

case class VersionManifestEntry(name: String, sha256: String)
case class VersionManifest(shaToName: IMap[String, Set[String]], nameToSha: IMap[String, String])

class VersionCacher(versionDir: File) {
  val lock = OLock()
  val manifestExt = "manifest"
  var versionCache: Map[String, VersionManifest] = _
  def getVersionManifest(version: String): Option[VersionManifest] = {
    versionCache.get(version) match {
      case Some(manifest) => Some(manifest)
      case None =>
        val manifestOpt = versionDir.listFiles().find(f => f.isFile && f.getName == s"$version.$manifestExt") map { f =>
          val sha_names = Slurp.asString(f.getPath).split("\n").flatMap {
            _.split(" ").toList match {
              case sha :: path :: Nil => Some(sha -> path)
              case _ => None
            }
          }
          VersionManifest(
            shaToName = sha_names.groupBy(_._1).mapValues(_.map(_._2).toSet),
            nameToSha = IMap() ++ sha_names.map(sn => sn._2 -> sn._1)
          )
        }
        manifestOpt.foreach { manifest =>
          lock.using {
            versionCache += version -> manifest
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


object VersionedController extends Controller {
  val manifestDir = System.getProperty("manifestdir").nullSafe
  val sha256Dir = System.getProperty("sha256dir").nullSafe

  val versionCacher = new VersionCacher(manifestDir.get.toFile)

  def lookup(version: String, file: String) = Action {
    versionCacher.getVersionManifest(version) match {
      case Some(manifest) =>
        manifest.nameToSha.get(file).map(sha => getBySha256(sha256 = sha, file)).getOrElse(NotFound)
      case None =>
        NotFound
    }
  }

  def getBySha256(sha256: String, filename: String) =
    sha256Dir match {
      case Some(dir) =>
        val f = new File(Play.application().getFile(dir), sha256)
        if (f.exists()) {
          val resp = Ok.sendFile(f, inline = true)
          MimeTypes.forFileName(filename).map(mt => resp.withHeaders(CONTENT_TYPE -> mt)).getOrElse(resp)
        } else {
          NotFound
        }
      case None =>
        NotFound
    }


}