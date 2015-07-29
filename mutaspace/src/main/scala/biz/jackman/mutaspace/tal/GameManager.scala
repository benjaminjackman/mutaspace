package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Game
import biz.jackman.mutaspace.gutil.RandomManager
import org.scalajs.dom
import org.scalajs.dom.raw.HTMLIFrameElement


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/28/15 12:36 AM
//////////////////////////////////////////////////////////////

trait GameManager {
  def game: Game
  def randy: RandomManager
  def scoreManager: ScoreManager
  def die(): Unit
  def win(): Unit

}