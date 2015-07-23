package biz.jackman.mutaspace
package samples

//import biz.jackman.facades.phaser.Phaser
//import biz.jackman.facades.phaser.Phaser.Sprite
//import biz.jackman.facades.phaser.Phaser.Pointer
//
//import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 7/13/15 9:14 PM
//////////////////////////////////////////////////////////////


//object PhaserStarGameSample2 {
//
//  def start() {
//    var game: Phaser.Game = null
//    game = new Phaser.Game(600, 800, Phaser.AUTO, document.getElementById("#content"), new PhaserStarGameSample2())
//  }
//
//
//}
//
//class PhaserStarGameSample2() extends Phaser.State {
//
//
//  lazy val player: Phaser.Sprite = game.add.sprite(32, game.world.height - 150, "dude")
//  lazy val platforms: Phaser.Group = game.add.group()
//  lazy val cursors: Phaser.CursorKeys = game.input.keyboard.createCursorKeys()
//  lazy val stars: Phaser.Group = game.add.group()
//  lazy val scoreText: Phaser.Text = game.add.text(16, 16, "Score: 0", js.Dynamic.literal(font = "sans", fontSize = "32px", fill = "#000"))
//  var score = 0
//
//
//  def preload() {
//    game.load.image("sky", "assets/images/sky.png")
//    game.load.image("ground", "assets/images/platform.png")
//    game.load.image("star", "assets/images/doge.png")
//
//    game.load.audio("bite", "assets/sounds/bite.mp3")
//    game.load.audio("growl", "assets/sounds/growl.mp3")
//    game.load.audio("woah", "assets/sounds/woah.mp3")
//
//    game.load.spritesheet("dude", "assets/images/dude.png", 32, 48)
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
//    platforms.create(400, 400, "ground").oEff(_.body.immovable = true)
//    platforms.create(-150, 250, "ground").oEff(_.body.immovable = true)
//
//    game.physics.arcade.enable(player)
//
//
//
//    js.Dynamic.global.player = player
//    js.Dynamic.global.platforms = platforms
//    //    player.body.bounce.y = 0.2
//    //player.body.gravity.y = 300
//    player.body.collideWorldBounds = true
//
//    player.animations.add("left", js.Array(0, 1, 2, 3), 10, loop = true)
//    player.animations.add("right", js.Array(5, 6, 7, 8), 10, loop = true)
//
//
//    cursors
//
//    stars
//
//    stars.enableBody = true
//
//    (0 until 15) foreach { i =>
//      val star = stars.create(i * 50, 0, "star")
//      star.body.gravity.y = 6
//      star.scale.setTo(.2, .2)
//      star.body.bounce.y = 0.7 * js.Math.random() * 0.2
//    }
//
//    scoreText
//  }
//
//  val phrases = Array("such wow!", "so amaze", "much good", "very wow!", "many cool", "lol", "gabe is ok")
//  def randomPhrase() = phrases((js.Math.random() * phrases.length).toInt)
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
//    player.rotation = game.physics.arcade.angleToPointer(player, pointer)
//    val duration = (game.physics.arcade.distanceToPointer(this.player, pointer) / 300) * 1000
//    if (duration > 0) {
//      val tween = game.add.tween(player).to(js.Dynamic.literal(x = pointer.x, y = pointer.y), duration, Phaser.Easing.Linear.None, true)
//    }
//  }
//
//  def update() {
//    game.physics.arcade.collide(player, platforms)
//    game.physics.arcade.collide(stars, platforms)
//    game.physics.arcade.overlap(player, stars, collectStar _, null, this)
//    player.body.velocity.x = 0
//    player.body.velocity.y = 0
//
//    game.input.onDown.add(moveSprite _)
//
//    if (cursors.left.isDown) {
//      player.body.velocity.x = -150
//      player.animations.play("left")
//    } else if (cursors.right.isDown) {
//      player.body.velocity.x = 150
//      player.animations.play("right")
//    } else {
//      player.animations.stop()
//      player.frame = 4
//    }
//
//    if (cursors.up.isDown) {
//      player.body.velocity.y = -150
//    } else if (cursors.down.isDown) {
//      player.body.velocity.y = 150
//    }
//
//
//  }
//
//}
//
//
