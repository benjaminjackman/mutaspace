package biz.jackman.mutaspace
package tal.mobs


import biz.jackman.facades.phaser
import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.gutil.ResourceSet
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.PlayerManager
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts
import cgta.cenum.CEnum
import cgta.oscala.util.debugging.PRINT

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/27/15 3:24 PM
//////////////////////////////////////////////////////////////


object Doge {
  object Resources extends ResourceSet {
    override def soundBasePath = super.soundBasePath + "/dog"

    case object doge extends Image()
    case object van extends Image()
    case object xbite extends Audio()
    case object xgrowl extends Audio()
    case object xwhimper extends Audio()
    case object xwhine extends Audio()
    final override val elements = CEnum.getElements(this)
  }
  def preload(gm: GameManager) {
    Resources.preload(gm.game)
  }


  def apply(gm: GameManager): Doge = {
    val text = gm.game.add.text(1, 1, "cujo", OBJ(font = "100px Arial", fill = "red"))
    val sprite = gm.game.add.sprite(100, 50, Resources.doge)
    sprite.addChild(text)
    sprite.height = 100
    sprite.width = 100
    gm.game.physics.arcade.enable(sprite)
    sprite.body.velocity.set(0, 20)
    sprite.body.bounce.y = 0.7 * js.Math.random() * 0.2
    sprite.anchor.set(0.5,0.5)
    new Doge(gm, sprite)
  }
}

class Doge(val gm: GameManager, val sprite: Sprite) extends Mob {
  import Doge.Resources
  val maxLife = 12
  var life = maxLife
  var runningAway = false
  var damageEndMs = 0.0
  var canAttackAtMs = 0.0


  def attack() {
    if (gm.game.time.now >= canAttackAtMs) {
      val attackDurMs = 100
      val tween = gm.game.add.tween(sprite).to(OBJ(angle = 30), attackDurMs, phaser.easing.Linear.None _)
        .to(OBJ(angle = -30), attackDurMs*2, phaser.easing.Linear.None _)
        .to(OBJ(angle = 0), attackDurMs*3, phaser.easing.Linear.None _)

      tween.start()

      canAttackAtMs = gm.game.time.now + 1000
      gm.audioManager.playRandom(Resources.xbite)
      gm.playerManager.takeDamage(gm.randy.getIntMR(5, 2).max(0))
    }
  }
  override def takeDamage(amount: DamageAmounts) {
    damageEndMs = gm.game.time.now + 250
    life -= amount.total.floor.toInt

    if (life <= 0) {
      //      gm.game.sound.play(Resources.whine, gm.randy.getDblIE(0.05, 0.2))
      life = 0
      gm.levelManager.enemiesAlive -= 1
      sprite.body.velocity.y = -400
      runningAway = true
      gm.audioManager.playRandom(Resources.xwhine)
    } else {
      gm.audioManager.playRandom(Resources.xwhimper)
    }
  }
  override def update() {
    def setTint() {
      if (gm.game.time.now < damageEndMs) {
        sprite.tint = 0xff0000
      } else if (runningAway) {
        sprite.tint = 0xffff00
      } else if (life < maxLife) {
        val red = ((1 - (life / maxLife.toDouble)) * 255).toInt.min(255).max(0)
        val tint = (red << 16) | ((red / 2) << 8) | (red / 2)
        sprite.tint = tint
      } else {
        sprite.tint = 0x00ffaa
      }
    }
    setTint()
    if (runningAway && sprite.y + sprite.height <= 0) {
      sprite.kill()
    }

    if (sprite.y >=  (gm.game.height - 200) / 4) {
      attack()
    }

  }
}