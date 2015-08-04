package biz.jackman.mutaspace
package tal.mobs

import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/27/15 3:38 PM
//////////////////////////////////////////////////////////////

trait Mob {
  def life() : Int
  def takeDamage(amount: DamageAmounts): Unit
  def sprite: Sprite
  def update(): Unit
}