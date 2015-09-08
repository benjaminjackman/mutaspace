package biz.jackman.mutaspace
package tal.mob

import biz.jackman.facades.phaser
import biz.jackman.facades.phaser.Game
import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/25/15 1:16 PM
//////////////////////////////////////////////////////////////

object CircleMobFactory {
  lazy val MonsterParticle = {
    def make(self : js.Any, game : Game, x : Double, y : Double) = {
      console.log("XXXX")
      global.Phaser.Particle.call(self, game, x, y, game.cache.getBitmapData("particleShade"))
    }
    val ctor : js.ThisFunction = make _
    ctor.asJsDyn.prototype = js.Object.create(global.Phaser.Particle.prototype.asInstanceOf[js.Object])
    ctor.asJsDyn.prototype.constructor = ctor
    ctor
  }
}

class CircleMobFactory(implicit gm: GameManager) extends MobFactory {
  override def preload(): Unit = {
    val bmd = gm.game.add.bitmapData(64, 64)
    val radgrad = bmd.ctx.createRadialGradient(32, 32, 4, 32, 32, 32)

    radgrad.addColorStop(0, "rgba(1, 159, 98, 1)")
    radgrad.addColorStop(1, "rgba(1, 159, 98, 0)")

    bmd.context.fillStyle = radgrad
    bmd.context.fillRect(0, 0, 64, 64)
    gm.game.cache.addBitmapData("particleShade", bmd)

    gm.game.add.sprite(0,0,bmd)




    val graphics = gm.game.make.graphics(0, 0)
    def draw(color : Int) {
      graphics.clear()
      graphics.beginFill(color, 1)
      graphics.drawCircle(0, 0, 20)
    }
    draw(0xFF0000)
    val texture= graphics.generateTexture()
    val i = gm.game.make.image(0,0, texture)
    i.key = "circle"
    i.update
  }
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

