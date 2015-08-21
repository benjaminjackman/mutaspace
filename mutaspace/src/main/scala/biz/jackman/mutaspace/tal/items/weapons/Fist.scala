package biz.jackman.mutaspace
package tal.items.weapons

import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.gutil.ResourceSet
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mechanics.DamageRanges
import biz.jackman.facades.phaser
import cgta.cenum.CEnum


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
    case object whiffs extends Audio(startMs = 100, endMs = 400)
    case object fistl extends Image()
    final override val elements = CEnum.getElements(this)
  }

  def apply(gm: GameManager): Fist = new Fist()

}

class Fist extends Weapon {
  import Fist.Resources
  override def getSpread: Double = 1
  override def getHitCnt: Int = 1
  override val damageRanges: DamageRanges = DamageRanges(physical = 4 -> 10)
  override val attackDurMs: Double = 500
  override val hitSound: ResourceSet#Audio = Resources.punch
  override val missSound: ResourceSet#Audio = Resources.whiffs
  override val image: ResourceSet#Image = Resources.fistl
  override def playAttackSpriteAnimation(gm: GameManager, slot: Int){
    val ap = gm.game.input.activePointer
    val sprite = gm.game.add.sprite(x = ap.x, y = ap.y + 60, image.key)
    sprite.alpha = 1

    val endX = if (slot =?= 0) {
      //left
      val spriteOnCursorX = ap.x - sprite.width
      sprite.x = spriteOnCursorX - 30
      spriteOnCursorX
    } else {
      //right
      sprite.scale.x = -1
      //mirrored sprites have a negative width
      val spriteOnCursorX = ap.x + sprite.width.abs
      sprite.x = spriteOnCursorX + 30
      spriteOnCursorX
    }
    val end = OBJ(x = endX, y = ap.y - 10, alpha = .7)

    gm.game.add.tween(sprite).to(end, attackDurMs, phaser.easing.Linear.None _, autoStart = true).onComplete.addOnce(() => {
      sprite.alpha = 0
      sprite.kill()
    })
  }

}