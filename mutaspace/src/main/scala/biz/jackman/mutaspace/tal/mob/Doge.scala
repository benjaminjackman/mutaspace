package biz.jackman.mutaspace
package tal.mob


import biz.jackman.facades.phaser
import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.gutil.ResourceSet
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts
import cgta.cenum.CEnum

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
    case object xbite extends Audio()
    case object xgrowl extends Audio()
    case object xwhimper extends Audio()
    case object xwhine extends Audio()
    final override val elements = CEnum.getElements(this)
  }


  def apply(implicit gm: GameManager): Doge = {
    val text = gm.game.add.text(1, 1, "cujo", OBJ(font = "10px Arial", fill = "red"))
    val sprite = gm.game.add.sprite(100, 50, Resources.doge.key)
    sprite.texture.frame.width = 50
    sprite.texture.frame.height = 50
    sprite.addChild(text)
    gm.game.physics.arcade.enable(sprite)
    sprite.body.velocity.set(0, 20)
    sprite.body.bounce.y = 0.7 * js.Math.random() * 0.2
    sprite.anchor.set(0.5,0.5)
    val doge = new Doge(gm, sprite)
    MobHelp.addLifeBar(doge)(gm)
    doge
  }
}

class Doge(val gm: GameManager, val sprite: Sprite) extends Mob {
  import Doge.Resources
  val maxLife = 50.0
  var life = maxLife
  var runningAway = false
  var damageEndMs = 0.0
  var canAttackAtMs = 0.0


  def attack() {
    if (gm.game.time.now >= canAttackAtMs) {
      val attackDurMs = 500
      gm.game.add.tween(sprite.scale).oEff { tween =>
        tween.to(OBJ(x = 2, y=2), attackDurMs, phaser.easing.Bounce.InOut _)
        tween.to(OBJ(x = 1, y=1), attackDurMs, phaser.easing.Bounce.InOut _)
      }.start()

      canAttackAtMs = gm.game.time.now + gm.randy.getDblIE(1000, 5000)
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
      sprite.body.velocity.y = -400
      runningAway = true
      gm.audioManager.playRandom(Resources.xwhine)
    } else {
      gm.audioManager.playRandom(Resources.xwhimper)
    }
  }

  onUpdateHandlers += update

  private def update() {
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