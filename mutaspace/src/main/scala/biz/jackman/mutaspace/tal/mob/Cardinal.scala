package biz.jackman.mutaspace
package tal.mob

import biz.jackman.facades.phaser
import biz.jackman.facades.phaser.Sprite
import biz.jackman.facades.phaser.Tween
import biz.jackman.mutaspace.gutil.ResourceSet
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts
import cgta.cenum.CEnum
import cgta.oscala.util.debugging.PRINT


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/15/15 12:30 PM
//////////////////////////////////////////////////////////////

object Cardinal {
  object Resources extends ResourceSet {
    override def imageBasePath = super.mobBasePath + "/cardinal"

    case object cardinal_100x120 extends Image()
    final override val elements = CEnum.getElements(this)
  }

  def apply(gm: GameManager): Cardinal = {
    val sprite = gm.game.add.sprite(100, 50, Resources.cardinal_100x120.key)
    sprite.width = 50
    sprite.height = 60
    gm.game.physics.arcade.enable(sprite)
    sprite.body.velocity.set(0, 20)
    sprite.anchor.set(0.5, 0.5)
    new Cardinal(gm, sprite)
  }

}

class Cardinal(gm: GameManager, val sprite: Sprite) extends Mob {
  var life = 10
  var dying = false

  override def update(): Unit = {
    if (life <= 0 && !dying) {
      dying = true
      def done() = {
        sprite.kill()
      }
      val tween = gm.game.add.tween(sprite.scale).to(OBJ(x=0.0,y=0.0), 1000, phaser.easing.Elastic.Out _)
      tween.onComplete.addOnce(done _)
//
      tween.start()

      //Show some feathers or something
    }
  }
  override def takeDamage(amount: DamageAmounts): Unit = {
    //Show some read feathers randomly or something
    life -= amount.total.toInt
  }
}