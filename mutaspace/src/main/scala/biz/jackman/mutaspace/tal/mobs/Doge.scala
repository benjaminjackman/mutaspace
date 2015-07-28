package biz.jackman.mutaspace
package tal.mobs


import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.PlayerManager

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 7/27/15 3:24 PM
//////////////////////////////////////////////////////////////


object Doge {
  def preload(gm: GameManager) {
    gm.game.load.image("doge", "assets/images/doge.png")
    gm.game.load.audio("bite", "assets/sounds/bite.mp3")
    gm.game.load.audio("growl", "assets/sounds/growl.mp3")

  }

  def apply(gm: GameManager): Doge = {
    val sprite = gm.game.add.sprite(100, 50, "doge")
    sprite.height = 50
    sprite.width = 50
    gm.game.physics.arcade.enable(sprite)
    sprite.body.velocity.set(0, 100)
    sprite.body.bounce.y = 0.7 * js.Math.random() * 0.2
    new Doge(gm, sprite)
  }
}

class Doge(val gm: GameManager, val sprite: Sprite) extends Mob {
  var life = 10
  var runningAway = false
  override def attack(player: PlayerManager) {
    gm.game.sound.play("bite", .1)
    player.takeDamage(gm.randy.getIntMR(5, 2).max(0))
  }
  override def takeDamage(amount: Int) {
    life -= amount
    if (life <= 0) {
      life = 0
      gm.game.sound.play("whine", gm.randy.getDblIE(0.05, 0.2))
      gm.scoreManager.dogPower -= gm.randy.getIntII(1, 5)
      sprite.body.velocity.y = -400
      runningAway = true
    }
    sprite.tint = 0x000000 | (255 - (life / 10.0) * 255).toInt
  }
  override def update() {
    if (runningAway && sprite.y + sprite.height <= 0) {
      sprite.kill()
    }
  }
}