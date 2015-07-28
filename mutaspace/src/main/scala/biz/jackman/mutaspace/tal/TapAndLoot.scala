package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Game
import biz.jackman.facades.phaser.State
import biz.jackman.facades.Phaser
import biz.jackman.facades.phaser
import biz.jackman.mutaspace.gutil.RandomManager

//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 7/21/15 8:47 PM
//////////////////////////////////////////////////////////////


//TODO READ THIS
//http://invrse.co/phaser-cheatsheet/
object TapAndLoot {

  def start() {
    var game: phaser.Game = null
    val s = new TapAndLoot(() => game)
    val state = new State()
    state.asJsDyn.preload = () => s.preload()
    state.asJsDyn.create = () => s.create()
    state.asJsDyn.update = () => s.update()

    document.body.classList.add("cursor-crosshair")
    val el = document.getElementById("content")
    game = new phaser.Game(600, 800, Phaser.AUTO, el, state)

    val foot = document.getElementById("footer")
    el.textContent = "SAVE THE TURKEY! (The dogs are zombies and they don't even die)"
  }
}

class TapAndLoot(gameFn: () => Game) {tal =>

  lazy val game = gameFn()

  lazy val randy = new RandomManager
  lazy val gm: GameManager = new GameManager {
    override def game: Game = tal.game
    override def randy: RandomManager = tal.randy
    override def scoreManager: ScoreManager = tal.scoreManager
  }
  lazy val playerManager = new PlayerManager(gm)
  lazy val mobManager = new MobManager(gm, playerManager, randy)
  lazy val inputManager = new InputManager(gm, mobManager)
  lazy val scoreManager = new ScoreManager(gm, playerManager)

  def preload() {
    game.load
      .image("sky", "assets/images/sky.png")
      .image("ground", "assets/images/platform.png")
      .image("star", "assets/images/doge.png")
      .image("turkey", "assets/images/turkey.jpg")
      .audio("bite", "assets/sounds/bite.mp3")
      .audio("growl", "assets/sounds/growl.mp3")
      .audio("whine", "assets/sounds/whine.mp3")
      .audio("woah", "assets/sounds/woah.mp3")
      .audio("shot", "assets/sounds/bb-gun-shot.mp3")
      .spritesheet("dude", "assets/images/dude.png", 32, 48)

    mobManager.preload()
  }

  def create() {
    if (game.device.iOS || game.device.android) {
      game.scale.setGameSize(window.innerWidth, window.innerHeight)
      game.scale.scaleMode = phaser.ScaleManager.SHOW_ALL
    }

    game.canvas.classList.add("noselect")
    game.canvas.classList.add("cursor-crosshair")
    game.add.sprite(0, 0, "sky")

    game.physics.startSystem(phaser.Physics.ARCADE)
    mobManager.create()
    scoreManager.create()

    val turkey = game.add.sprite(0, 0, "turkey")
    turkey.width = game.width - 200
    turkey.height = 200
    turkey.x = 100
    turkey.y = game.height - 200

  }


  def update() {
    mobManager.update()
    inputManager.update()
    scoreManager.update()
  }

}
