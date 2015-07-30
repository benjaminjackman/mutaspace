package biz.jackman.mutaspace
package tal.items.weapons

import biz.jackman.mutaspace.gutil.ResourceSet
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mechanics.DamageRanges
import cgta.cenum.CEnum

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/30/15 12:52 AM
//////////////////////////////////////////////////////////////

object Fist {
  object Resources extends ResourceSet {
    override def soundBasePath = super.soundBasePath + "/weapons"
    override def imageBasePath = super.imageBasePath + "/weapons"
    //case object doge extends Image()
    case object punch extends Audio()
    case object fistl extends Image()
    final override val elements = CEnum.getElements(this)
  }

  def apply(gm: GameManager): Fist = new Fist()

}

class Fist extends Weapon {
  import Fist.Resources
  override def range: Double = 50
  override def damageRanges: DamageRanges = DamageRanges(physical = 4 -> 10)
  override def attackDurMs: Double = 350
  override def sound: ResourceSet#Audio = Resources.punch
  override def image: ResourceSet#Image = Resources.fistl
}