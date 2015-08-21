package biz.jackman.mutaspace
package tal.items.weapons

import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.gutil.ResourceSet
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mechanics.DamageRanges
import cgta.cenum.CEnum

//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/28/15 11:10 PM
//////////////////////////////////////////////////////////////

object Shotgun {
  object Resources extends ResourceSet {
    override def soundBasePath = super.soundBasePath + "/weapons"
    override def imageBasePath = super.imageBasePath + "/weapons"
    //case object doge extends Image()
    case object shotgun_and_reload extends Audio()
    final override val elements = CEnum.getElements(this)
  }

  def apply(gm: GameManager): Shotgun = new Shotgun()

}

class Shotgun extends Weapon {
  import Shotgun.Resources
  override def getSpread: Double = 100
  override def getHitCnt: Int = 50
  override val damageRanges: DamageRanges = DamageRanges(physical = 20 -> 50)
  override val attackDurMs: Double = 1000
  override val hitSound: ResourceSet#Audio = Resources.shotgun_and_reload
  override val missSound: ResourceSet#Audio = Resources.shotgun_and_reload
  override val image: ResourceSet#Image = Fist.Resources.fistl
  override def playAttackSpriteAnimation(gm: GameManager, slot: Int): Unit = {

  }

}