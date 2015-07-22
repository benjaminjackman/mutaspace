package biz.jackman.mutaspace
package samples

import biz.jackman.facades.phaser.Phaser
import biz.jackman.facades.phaser.Phaser.Sprite
import biz.jackman.facades.phaser.Phaser.Physical

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 7/13/15 9:14 PM
//////////////////////////////////////////////////////////////

//object PhaserStarGameSample {
//  var game: Phaser.Game = _
//  var player: Phaser.Entity = _
//  var platforms: Phaser.Group = _
//  var cursors: Phaser.CursorKeys = _
//  var stars: Phaser.Group = _
//  var score = 0
//  var scoreText : Phaser.Text = _
//
//  def preload() {
//    game.load.image("sky", "assets/images/sky.png")
//    game.load.image("ground", "assets/images/platform.png")
//    game.load.image("star", "assets/images/star.png")
//    game.load.spritesheet("dude", "assets/images/dude.png", 32, 48)
//  }
//  def create() {
//    game.physics.startSystem(Phaser.Physics.ARCADE)
//
//    game.add.sprite(0, 0, "sky")
//    platforms = game.add.group()
//    platforms.enableBody = true
//    val ground = platforms.create(0, game.world.height - 64, "ground")
//    ground.scale.setTo(2, 2)
//    ground.body.immovable = true
//
//    var ledge = platforms.create(400, 400, "ground")
//    ledge.body.immovable = true
//
//    ledge = platforms.create(-150, 250, "ground")
//    ledge.body.immovable = true
//
//    player = game.add.sprite(32, game.world.height - 150, "dude")
//
//    game.physics.arcade.enable(player)
//
//    //    player.body.bounce.y = 0.2
//    player.body.gravity.y = 300
//    player.body.collideWorldBounds = true
//
//    player.animations.add("left", js.Array(0, 1, 2, 30), 10, loop = true)
//    player.animations.add("right", js.Array(5, 6, 7, 8), 10, loop = true)
//
//    cursors = game.input.keyboard.createCursorKeys()
//
//    stars = game.add.group()
//
//    stars.enableBody = true
//
//    (0 until 12) foreach { i =>
//      val star = stars.create(i * 70, 0, "star")
//      star.body.gravity.y = 6
//      star.scale.setTo(5,5)
//      star.body.bounce.y = 0.7 * js.Math.random() * 0.2
//    }
//
//    scoreText = game.add.text(16, 16, "Score: 0", js.Dynamic.literal(fontSize = "32px", fill = "#000"))
//  }
//
//  def collectStar(player: Entity, star: Entity) {
//    star.kill()
//    score += 1
//    scoreText.text = s"Score: $score"
//  }
//
//  def update() {
//    game.physics.arcade.collide(player, platforms)
//    game.physics.arcade.collide(stars, platforms)
//    game.physics.arcade.overlap(player, stars, collectStar _, null, this)
//    player.body.velocity.x = 0
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
//    if (cursors.up.isDown && player.body.touching.down) {
//      player.body.velocity.y = -300
//    }
//
//
//  }
//
//
//  def start() {
//    val init = newObj[Phaser.PhaserInit]
//      .oEff(_.preload = preload _)
//      .oEff(_.create = create _)
//      .oEff(_.update = update _)
//
//    game = new Phaser.Game(800, 600, Phaser.AUTO, "", init)
//
//    console.log(game.asInstanceOf[js.Any])
//  }
//}