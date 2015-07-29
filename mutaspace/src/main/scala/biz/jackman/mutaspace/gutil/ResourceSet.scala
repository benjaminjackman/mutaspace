package biz.jackman.mutaspace
package gutil

import biz.jackman.facades.phaser.Game
import cgta.cenum.CEnum

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 7/29/15 2:52 PM
//////////////////////////////////////////////////////////////

trait ResourceSet extends CEnum {
  final override type EET = Resource
  object Resource {
    implicit def resourceAsKey(r: Resource): String = r.key
  }

  trait Resource extends EnumElement {
    def path: String
    def key: String = toString
    def preload(game: Game): Unit
  }
  def imageBasePath = "assets/images"
  def soundBasePath = "assets/sounds"

  object Image {
    implicit def resourceAsJsAny(r: Image): js.Any = r.key
  }

  abstract class Image(cpath: String = "", ext: String = "png") extends Resource {
    override def preload(game: Game) { game.load.image(toString, path) }
    override def path = if (cpath.isEmpty) s"$imageBasePath/$key.$ext" else cpath
  }

  abstract class Audio(cpath: String = "", ext: String = "mp3") extends Resource {
    override def preload(game: Game) { game.load.audio(key, path) }
    override def path = if (cpath.isEmpty) s"$soundBasePath/$key.$ext" else cpath
  }

  def preload(game: Game) = toIVec.foreach(_.preload(game))

}