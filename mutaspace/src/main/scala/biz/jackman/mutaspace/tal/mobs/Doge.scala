package biz.jackman.mutaspace
package tal.mobs



import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.gutil.ResourceSet
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.PlayerManager
import cgta.cenum.CEnum

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 7/27/15 3:24 PM
//////////////////////////////////////////////////////////////


object Doge {
  object Resources extends ResourceSet {
    override def soundBasePath = super.soundBasePath + "/dog"

    case object doge extends Image()
    case object van extends Image()
    case object bite extends Audio()
    case object growl extends Audio()
    case object whimper extends Audio()
    case object whine extends Audio()
    final override val elements = CEnum.getElements(this)
  }
  def preload(gm: GameManager) {
    Resources.preload(gm.game)
  }



  def apply(gm: GameManager): Doge = {
    val text = gm.game.add.text(1,1,"fluffy", OBJ(font="100px Arial", fill="red"))
    val sprite = gm.game.add.sprite(100, 50, Resources.doge)
    sprite.addChild(text)
    sprite.height = 100
    sprite.width = 100
    gm.game.physics.arcade.enable(sprite)
    sprite.body.velocity.set(0, 100)
    sprite.body.bounce.y = 0.7 * js.Math.random() * 0.2
    new Doge(gm, sprite)
  }
}

class Doge(val gm: GameManager, val sprite: Sprite) extends Mob {
  import Doge.Resources
  val maxLife = 12
  var life = maxLife
  var runningAway = false
  var damageEndMs = 0.0

  def init() {

  }

  override def attack(player: PlayerManager) {
    gm.game.sound.play(Resources.bite, .1)
    player.takeDamage(gm.randy.getIntMR(5, 2).max(0))
  }
  override def takeDamage(amount: Int) {
    damageEndMs = gm.game.time.now + 100
    life -= amount

    if (life <= 0) {
      gm.game.sound.play(Resources.whine, gm.randy.getDblIE(0.05, 0.2))
      life = 0
      gm.scoreManager.dogPower -= gm.randy.getIntII(1, 5)
      sprite.body.velocity.y = -400
      runningAway = true
    } else {
      gm.game.sound.play(Resources.whimper, gm.randy.getDblIE(0.05, 0.2))
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
  }
}