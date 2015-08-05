package controllers

import java.io.File

import play.api.mvc.Action
import play.api.mvc.Controller


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/5/15 7:21 AM
//////////////////////////////////////////////////////////////

class VersionCacher(versionDir : File) {
  def getVersionManifest(version: String) : Map[String, String] = {
    ???
  }
  def getAllVersions() : List[String] = {
    ???
  }
}


object VersionedController extends Controller {

  def lookup(version : String, file: String) = Action {
//    getVersionManifest(version) match {
//      case Some(manifest) =>
//        Ok()
//      case None =>
//        Ok()
//    }
    NoContent
  }

}