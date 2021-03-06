package biz.jackman.mutaspace
package tal.items.weapons

import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.gutil.ResourceSet
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mechanics.DamageRanges


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/30/15 12:34 AM
//////////////////////////////////////////////////////////////


object Weapon {


}

trait Weapon {

  def getSpread : Double
  def getHitCnt: Int
  def damageRanges : DamageRanges
  def attackDurMs : Double
  def hitSound : ResourceSet#Audio
  def missSound : ResourceSet#Audio
  def image: ResourceSet#Image
  def playAttackSpriteAnimation(gm : GameManager, slot : Int)
}