package biz.jackman.mutaspace
package tal.mobs

import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.PlayerManager


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 7/27/15 3:38 PM
//////////////////////////////////////////////////////////////

trait Mob {
  def takeDamage(amount: Int): Unit
  def attack(player: PlayerManager)
  def sprite : Sprite

  def update(): Unit
}