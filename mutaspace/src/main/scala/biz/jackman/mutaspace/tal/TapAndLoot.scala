package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Game

import biz.jackman.facades.phaser.State
import biz.jackman.facades.Phaser
import biz.jackman.facades.phaser
import biz.jackman.mutaspace.gutil.RandomManager
import biz.jackman.mutaspace.tal.mobs.Mob
import biz.jackman.mutaspace.tal.mobs.MobManager
import org.scalajs.dom
import org.scalajs.dom.raw.HTMLIFrameElement
import org.scalajs.dom.raw.HTMLScriptElement

import scala.scalajs.js

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


class InputManager(gm: GameManager, mobManager: MobManager) {
  val cooldownMs = 200.0
  var lastShotMs = 0.0
  def inBBRange(mob: Mob): Boolean = {
    val ap = gm.game.input.activePointer
    phaser.Math.distance(ap.x, ap.y, mob.sprite.x + mob.sprite.width / 2, mob.sprite.y + mob.sprite.height / 2) <= 25
  }
  def update() {
    val ap = gm.game.input.activePointer
    if (ap.isDown) {
      val elapsed = gm.game.time.now - lastShotMs
      if (elapsed > cooldownMs) {
        gm.game.sound.play("shot", gm.randy.getDblIE(.2, .5))
        lastShotMs = gm.game.time.now
        mobManager.Mobs.mobs.find(inBBRange).foreach { mob =>
          mob.takeDamage(gm.randy.getIntMR(8, 4))
        }
      }
    }

    mobManager.Mobs.mobs.foreach { mob =>
      if (inBBRange(mob)) {
        mob.sprite.tint = mob.sprite.tint.toInt | 0x0f0000
      } else {
        mob.sprite.tint = mob.sprite.tint.toInt & 0x00ffff
      }
    }
  }
}

class ScoreManager(gm: GameManager, playerManager: PlayerManager) {

  var dogPower = 100
  lazy val lifeText: phaser.Text = gm.game.add.text(16, 16, "Turkey Edibility 100%", js.Dynamic.literal(font = "24px sans", fill = "#F00"))
  //  lazy val manaText: phaser.Text = gm.game.add.text(400, 16, "Mana: 0", js.Dynamic.literal(font = "32px sans", fill = "#00F"))
  lazy val scoreText: phaser.Text = gm.game.add.text(200, 16, s"Zombie Bumpus Dog Power $dogPower%", js.Dynamic.literal(font = "24px sans", fill = "#00F"))


  def create() {
    lifeText
    scoreText
  }

  def update() {
    val life = playerManager.life
    val mana = playerManager.mana

    lifeText.text = s"Turkey $life%"
    scoreText.text = s"Zombie Bumpus Dog Power $dogPower%"

    if (dogPower <= 0) {
      gm.win()
    }

  }
}

class PlayerManager(gm: GameManager) {
  def takeDamage(x: Int) = {
    life -= x
    if (life < 0) {
      gm.die()
    }
  }

  var life = 100
  var mana = 100
  var score = 0
}

trait GameManager {
  def game: Game
  def randy: RandomManager
  def scoreManager: ScoreManager

  def die() {
    game.destroy()
    val el = document.getElementById("content")
    el.innerHTML = """<iframe id="ytplayer" type="text/html" width="640" height="390" src="https://www.youtube.com/embed/9cFHAJ5asMk?autoplay=1&t=15s" frameborder="0"/>"""
  }

  def win() {
    game.destroy()
    val el = document.getElementById("content")
    el.setAttribute("style", "font-size:50px;background-color:red;color:white")
    el.textContent = "PLAYING WITH GUNS IS ALWAYS A BAD IDEA EVEN WHEN " +
      "ZOMBIE DOGS ARE TRYING TO EAT YOUR TURKEY JUST GET SOME CHINESE FOOD. ITS ACTUALLY QUITE GOOD. " +
      "ESPECIALLY THE DUCK."

    dom.setTimeout(() => {
      val tag = dom.document.createElement("iframe").asInstanceOf[HTMLIFrameElement]
      el.innerHTML = """
      <iframe id="ytplayer" type="text/html" width="640" height="390" src="https://www.youtube.com/embed/v=kZUTkgfZqZc?autoplay=1&t=18s" frameborder="0"/>"""
    }, 1000)
    //dom.location.assign("http://img.costumecraze.com/images/vendors/forum/65703-Deluxe-Plush-Turkey-Costume-large.jpg")
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
