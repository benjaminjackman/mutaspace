package biz.jackman.mutaspace
package tal.mob

import biz.jackman.facades.phaser
import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/25/15 1:16 PM
//////////////////////////////////////////////////////////////

class CircleMobFactory(implicit gm: GameManager) extends MobFactory {
  override def preload(): Unit = {}
  override def create(mobId: Double): Mob = {
    val sprite = gm.game.add.sprite(0, 0)
    gm.game.physics.arcade.enable(sprite)
    sprite.anchor.set(0.5, 0.5)
    sprite.maxHealth = 50
    sprite.health = sprite.maxHealth
    sprite.body.collideWorldBounds = true
    sprite.body.setSize(25, 25)
    sprite.body.velocity.set(gm.randy.getIntIE(-20, 20), gm.randy.getIntIE(-20, 20))

    val graphics = gm.game.add.graphics(0, 0)
    graphics.beginFill(0x008800, 1)
    graphics.drawCircle(0, 0, 25)

    val ss = sprite

    ss.addChild(graphics)

    val mob = new Mob {
      var dying = false
      override def takeDamage(amount: DamageAmounts): Unit = sprite.health -= amount.total.toInt
      override def sprite: Sprite = ss
      addUpdateHandler {
        if (sprite.health <= 0 && !dying) {
          dying = true
          val tween = gm.game.add.tween(sprite.scale).to(OBJ(x = 0.0, y = 0.0), 1000, phaser.easing.Elastic.Out _)
          tween.onComplete.addOnce(() => sprite.kill())
          tween.start()
        }
      }
    }

    sprite.asJsDyn.mob = mob.asJsAny

    sprite.events.onKilled.addOnce(() => graphics.destroy())

    MobHelp.addLifeBar(mob)

    mob
  }
}

