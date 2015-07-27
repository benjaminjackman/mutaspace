package biz.jackman.mutaspace
package tal.mobs

import biz.jackman.facades.phaser.Game
import importedjs.PIXI.Sprite

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 7/27/15 3:24 PM
//////////////////////////////////////////////////////////////


object Doge {
  def preload(game: Game) {
    game.load.image("doge", "assets/images/doge.png")
    game.load.audio("bite", "assets/sounds/bite.mp3")
    game.load.audio("growl", "assets/sounds/growl.mp3")

  }

  def apply(game: Game): Sprite = {
    val doge = game.add.sprite(100, 50, "doge")
    doge.scale.set(.2, .2)
    game.physics.arcade.enable(doge)
    doge.body.velocity.set(0, 100)
    doge.body.bounce.y = 0.7 * js.Math.random() * 0.2
    doge
  }
}

class Doge extends Mob {

}