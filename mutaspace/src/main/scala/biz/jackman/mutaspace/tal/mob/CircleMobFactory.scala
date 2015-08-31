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
    val defaultColor= 0x00AA00

    def draw(color : Int) {
      graphics.clear()
      graphics.beginFill(color, 1)
      graphics.drawCircle(0, 0, 25)
    }
    draw(defaultColor)

    val ss = sprite

    ss.addChild(graphics)

    val mob = new Mob {
      var dying = false
      var redrawMs = -1.0
      override def takeDamage(amount: DamageAmounts): Unit = {
        draw(0xFFFFFF)
        redrawMs = gm.game.time.now + 50
      }
      override def sprite: Sprite = ss
      addUpdateHandler {
        if (redrawMs > 0 && gm.game.time.now > redrawMs) {
          draw(defaultColor)
          redrawMs = -1.0
        }
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

