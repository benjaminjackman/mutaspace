package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Game
import biz.jackman.facades.phaser.Sprite
import biz.jackman.facades.phaser.State
import biz.jackman.facades.Phaser
import biz.jackman.facades.phaser
import biz.jackman.mutaspace.tal.mobs.Doge
import cgta.oscala.util.debugging.PRINT

import scala.scalajs.js

//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 7/21/15 8:47 PM
//////////////////////////////////////////////////////////////


object TapAndLoot {

  def start() {
    var game: phaser.Game = null
    val s = new TapAndLoot(() => game)
    val state = new State()
    state.asJsDyn.preload = () => s.preload()
    state.asJsDyn.create = () => s.create()
    state.asJsDyn.update = () => s.update()
    game = new phaser.Game(600, 800, Phaser.AUTO, document.getElementById("#content"), state)

  }
}

class MobManager(game: Game) {
  lazy val mobs = game.add.group()
  val mobDelayMs = 1000
  var lastUpdateMs = 0.0
  var lastMobMs = 0.0

  def preload() {
    Doge.preload(game)
  }

  def create() {
    mobs
  }

  def update() {
    val curMs = game.time.now
    if (lastUpdateMs == 0) {
      lastUpdateMs = curMs
    }
    val mobCnt = mobs.countLiving()
    val msSinceMobFullOrSpawn = curMs - lastMobMs
    if (mobCnt < 10) {
      if (msSinceMobFullOrSpawn > mobDelayMs) {
        //Spawn a random enemy roughly every X frames
        PRINT | s"spawning $mobCnt"
        spawnRandomMob()
        lastMobMs = curMs
      }
    } else {
      lastMobMs = curMs
    }
    lastUpdateMs = curMs
  }

  def spawnRandomMob() {
    mobs.add(Doge(game))
  }
}

class InputManager(game: Game, mobManager: MobManager) {
  def update() {

  }
}

class TapAndLoot(gameFn: () => Game) {

  lazy val game = gameFn()

  lazy val scoreText: phaser.Text = game.add.text(16, 16, "Score: 0", js.Dynamic.literal(font = "sans", fontSize = "32px", fill = "#000"))
  var score = 0
  lazy val mobManager = new MobManager(game)
  lazy val inputManager = new InputManager(game, mobManager)

  def preload() {
    game.load
      .image("sky", "assets/images/sky.png")
      .image("ground", "assets/images/platform.png")
      .image("star", "assets/images/doge.png")
      .audio("bite", "assets/sounds/bite.mp3")
      .audio("growl", "assets/sounds/growl.mp3")
      .audio("woah", "assets/sounds/woah.mp3")
      .spritesheet("dude", "assets/images/dude.png", 32, 48)

    mobManager.preload()
  }

  def create() {
    game.add.sprite(0, 0, "sky")
    game.physics.startSystem(phaser.Physics.ARCADE)
    mobManager.create()
    scoreText
  }


  def update() {
    mobManager.update()
    inputManager.update()
  }

}


//
//import biz.jackman.facades.phaser.Phaser
//import biz.jackman.facades.phaser.Phaser.Sprite
//import biz.jackman.facades.phaser.Phaser.Pointer
//
//import scala.scalajs.js
//
//
////////////////////////////////////////////////////////////////
//// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
//// All Rights Reserved
//// please contact ben@jackman.biz or jeff@cgtanalytics.com
//// for licensing inquiries
//// Created by bjackman @ 7/21/15 8:47 PM
////////////////////////////////////////////////////////////////
//
//
//object TapAndLoot {
//
//  def start() {
//    var game: Phaser.Game = null
//    game = new Phaser.Game(600, 800, Phaser.AUTO, document.getElementById("#content"), new TapAndLoot())
//  }
//
//
//}
//
//class TapAndLoot extends Phaser.State {
//
//  val phrases = Array("such wow!", "so amaze", "much good", "very wow!", "many cool", "lol", "gabe is ok")
//  def randomPhrase() = phrases((js.Math.random() * phrases.length).toInt)
//
//
//  lazy val gun: Phaser.Sprite = game.add.sprite(game.world.width / 2, game.world.height - 150, "arrow")
//  lazy val platforms: Phaser.Group = game.add.group()
//  lazy val cursors: Phaser.CursorKeys = game.input.keyboard.createCursorKeys()
//  lazy val enemies: Phaser.Group = game.add.group()
//  lazy val scoreText: Phaser.Text = game.add.text(16, 16, "Score: 0", js.Dynamic.literal(font = "sans", fontSize = "32px", fill = "#000"))
//  var score = 0
//
//
//  def preload() {
//    game.load.image("sky", "assets/images/sky.png")
//    game.load.image("ground", "assets/images/platform.png")
//    game.load.image("doge", "assets/images/doge.png")
//    game.load.image("arrow", "assets/images/arrow.png")
//
//    game.load.audio("bite", "assets/sounds/bite.mp3")
//    game.load.audio("growl", "assets/sounds/growl.mp3")
//    game.load.audio("woah", "assets/sounds/woah.mp3")
//
//
//  }
//
//  def create() {
//    game.physics.startSystem(Phaser.Physics.ARCADE)
//
//    game.add.sprite(0, 0, "sky")
//
//    platforms.enableBody = true
//    platforms.create(0, game.world.height - 64, "ground").oEff { ground =>
//      ground.scale.setTo(2, 2)
//      ground.body.immovable = true
//    }
//
//    gun
//    gun.anchor.set(0.5)
//
//    //    platforms.create(400, 400, "ground").oEff(_.body.immovable = true)
//    //    platforms.create(-150, 250, "ground").oEff(_.body.immovable = true)
//    //    game.physics.arcade.enable(player)
//    cursors
//    enemies
//    enemies.enableBody = true
//
//    (0 until 1) foreach { i =>
//      val star = enemies.create(i * 50, 0, "doge")
//      star.scale.setTo(.2, .2)
//      star.body.velocity.set(20,20)
//
//    }
//
//    scoreText
//  }
//
//
//  def collectStar(player: Sprite, star: Sprite) {
//
//    val size = 16 + 20 * js.Math.random()
//    val r = (js.Math.random() * 10).toInt
//    val g = (js.Math.random() * 10).toInt
//    val b = (js.Math.random() * 10).toInt
//    val color = s"#$r$g$b"
//
//    (js.Math.random() * 3).toInt match {
//      case 0 => game.sound.play("bite")
//      case 1 => game.sound.play("growl")
//      case _ => game.sound.play("woah")
//    }
//
//    game.add.text(star.x, star.y, randomPhrase(), js.Dynamic.literal(fontSize = s"${size}px", fill = color))
//    star.kill()
//    score += 1
//
//    if (score >= 15) {
//      import org.scalajs.dom
//      dom.location.assign("http://fanaru.com/doge/image/18361-doge-follow-your-dreams.jpg")
//    }
//
//    scoreText.text = s"Score: $score"
//  }
//
//  def moveSprite(pointer: Pointer) {
//    //    player.rotation = game.physics.arcade.angleToPointer(player, pointer)
//    //    val duration = (game.physics.arcade.distanceToPointer(this.player, pointer) / 300) * 1000
//    //    if (duration > 0) {
//    //      val tween = game.add.tween(player).to(js.Dynamic.literal(x = pointer.x, y = pointer.y), duration, Phaser.Easing.Linear.None, true)
//    //    }
//  }
//
//  def fire() {
//
//  }
//
//  def update() {
//
//    gun.rotation = game.physics.arcade.angleToPointer(gun)
//
//    if (game.input.activePointer.isDown) {
//      fire()
//    }
//
//    //    game.physics.arcade.collide(player, platforms)
//    game.physics.arcade.collide(enemies, platforms)
//    //    game.physics.arcade.overlap(player, stars, collectStar _, null, this)
//    //    player.body.velocity.x = 0
//    //    player.body.velocity.y = 0
//    //
//    //    game.input.onDown.add(moveSprite _)
//    //
//    //    if (cursors.left.isDown) {
//    //      player.body.velocity.x = -150
//    //      player.animations.play("left")
//    //    } else if (cursors.right.isDown) {
//    //      player.body.velocity.x = 150
//    //      player.animations.play("right")
//    //    } else {
//    //      player.animations.stop()
//    //      player.frame = 4
//    //    }
//    //
//    //    if (cursors.up.isDown) {
//    //      player.body.velocity.y = -150
//    //    } else if (cursors.down.isDown) {
//    //      player.body.velocity.y = 150
//    //    }
//
//
//  }
//
//}
//
//
