package biz.jackman.mutaspace
package tal.mob

import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/27/15 3:38 PM
//////////////////////////////////////////////////////////////

trait HandlerSet {
}

trait Mob {
  def life() : Double
  def maxLife() : Double
  def takeDamage(amount: DamageAmounts): Unit
  def sprite: Sprite
  var onUpdateHandlers = new js.Array[() => Unit]()
}