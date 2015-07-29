package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Game
import biz.jackman.facades.phaser.State
import biz.jackman.facades.Phaser
import biz.jackman.facades.phaser
import biz.jackman.mutaspace.gutil.RandomManager

import scalatags.Text
import scalatags.Text.TypedTag
import scalatags.text

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
    foot.textContent = "SAVE THE TURKEY! (The dogs are zombies and they don't even die)"


    import Scalatags._
    val ee = <.span(^.color := "red", ^.backgroundColor := "black", "hi mom")
    foot.appendChild(ee.render)

  }
}

class TapAndLoot(gameFn: () => Game) {tal =>

  lazy val game = gameFn()

  lazy val randy = new RandomManager
  lazy val gm: GameManager = new GameManager {
    override def game: Game = tal.game
    override def randy: RandomManager = tal.randy
    override def scoreManager: ScoreManager = tal.scoreManager
    override def die() {
//      game.destroy()
//      val el = document.getElementById("content")
//      el.innerHTML = """<iframe id="ytplayer" type="text/html" width="640" height="390" src="https://www.youtube.com/embed/9cFHAJ5asMk?autoplay=1&start=15" frameborder="0"/>"""
    }

    override def win() {
//      game.destroy()
//      val el = document.getElementById("content")
//      el.setAttribute("style", "font-size:50px;background-color:red;color:white")
//      el.innerHTML = "PLAYING WITH GUNS IS ALWAYS<br> " +
//        "A BAD IDEA. EVEN WHEN <br>" +
//        "ZOMBIE DOGS ARE TRYING TO EAT <br>" +
//        "YOUR TURKEY. <br>" +
//        "JUST GET SOME CHINESE FOOD. <br>" +
//        "IT'S ACTUALLY QUITE GOOD. <br>" +
//        "ESPECIALLY THE DUCK."
//
//      dom.setTimeout(() => {
//        val tag = dom.document.createElement("iframe").asInstanceOf[HTMLIFrameElement]
//
//        el.innerHTML = """
//          <iframe width="560" height="315" src="https://www.youtube.com/embed/mrAwb9ptu9U?autoplay=1&start=14" frameborder="0" allowfullscreen></iframe>
//          """
//      }, 10000)
//      //dom.location.assign("http://img.costumecraze.com/images/vendors/forum/65703-Deluxe-Plush-Turkey-Costume-large.jpg")
    }
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
      game.scale.scaleMode = phaser.ScaleManager.SHOW_ALL
      game.scale.pageAlignHorizontally = true
      game.scale.pageAlignVertically = true
      game.scale.refresh()
    }

    game.canvas.classList.add("noselect")
    game.canvas.classList.add("cursor-crosshair")
    game.add.sprite(0, 0, "sky")

    game.physics.startSystem(phaser.Physics.ARCADE)
    mobManager.create()
    scoreManager.create()

    val turkey = game.add.image(0, 0, "turkey")
    turkey.tint = 0x606060
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
