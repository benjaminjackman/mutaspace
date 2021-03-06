package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Game
import biz.jackman.facades.phaser.Rectangle
import biz.jackman.facades.phaser.ScaleManager
import biz.jackman.facades.phaser.State
import biz.jackman.facades.Phaser
import biz.jackman.facades.phaser
import biz.jackman.mutaspace.gutil.YamlHelp
import biz.jackman.mutaspace.tal.items.ItemManager
import biz.jackman.mutaspace.tal.mob.MobCfg
import cgta.oscala.util.debugging.PRINT
import org.scalajs.dom
import org.scalajs.dom.ext.Ajax
import scala.async.Async


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/21/15 8:47 PM
//////////////////////////////////////////////////////////////

trait TalResources {
  val mobCfgs : Seq[MobCfg]
}


//TODO READ THIS
//http://invrse.co/phaser-cheatsheet/
object TalGame {

  def start(showVideos: Boolean) {

    Async.async {
      val mobCfgs_ = locally {
        val mobTxt = Async.await(Ajax.get("assets/mob/mob.yml").map(_.responseText))
        val mobYmls = YamlHelp.load(mobTxt)
        mobYmls.flatMap { mobYml =>
          val json = JSON.stringify(mobYml)
          try {
            val obj = json.fromJson[MobCfg]
            obj.mobYml = mobYml
            Some(obj)
          } catch {
            case e : Throwable =>
              PRINT | "ERROROR"
              e.printStackTrace()
              Nil
          }
        }
      }

      val ress = new TalResources {
        override val mobCfgs: Seq[MobCfg] = mobCfgs_
      }

      var game: phaser.Game = null

      val tal = new TalGame(showVideos, () => game, ress)
      val state = new State()
      state.asJsDyn.preload = () => tal.preload()
      state.asJsDyn.create = () => tal.create()
      state.asJsDyn.update = () => tal.update()


      import Scalatags._
      val contentEl = document.getElementById("content")

      val phaserEl = <.div(^.height := "90%").render
      val footer = <.div(
        <.a("[RESTART]", ^.color := "red", ^.onclick := { () => document.location.reload(true) }),
        <.a("[PAUSE]", ^.color := "blue", ^.onclick := { () => {game.paused = !game.paused} }),
        <.a("[INVENTORY]", ^.color := "blue", ^.onclick := { () => {tal.displayInventory()} })
      )

      val gameEl = <.div(^.height := "100vh").render
      gameEl.appendChild(phaserEl)
      gameEl.appendChild(footer.render)

      contentEl.appendChild(gameEl)
      phaserEl.classList.add("noselect")
      phaserEl.classList.add("cursor-crosshair")


      game = new phaser.Game(600, 800, Phaser.AUTO, phaserEl, state)
    }



    //    foot.textContent = "SAVE THE TURKEY! (The dogs are zombies and they don't even die)"
    //document.body.onclick = { (e: MouseEvent) => {game.paused = false; true} }
    //foot.innerHTML = """<iframe width="100" height="100" src="https://www.youtube.com/embed/SaH8WMuP7LM?autoplay=1" frameborder="0" allowfullscreen></iframe>"""
    //    foot.innerHTML = """<iframe width="420" height="315" src="https://www.youtube.com/embed/7_rBidCkJxo?autoplay=1&start=35" frameborder="0" allowfullscreen></iframe>"""
  }
}

class TalGame(showVidoes: Boolean, gameFn: () => Game, resources : TalResources) {tal =>

  lazy val game = gameFn()


  lazy val randy = new RandomManager
  implicit lazy val gm: GameManager = new GameManager {
    override def game: Game = tal.game
    override def randy: RandomManager = tal.randy
    override def scoreManager: ScoreManager = tal.scoreManager
    override def skillManager: SkillManager = tal.skillManager
    override def mobManager: MobManager = tal.mobManager
    override def playerManager: PlayerManager = tal.playerManager
    override def itemManager: ItemManager = tal.itemManager
    override def projectileManager: ProjectileManager = tal.projectileManager
    override def inputManager: InputManager = tal.inputManager
    override def levelManager: LevelManager = tal.levelManager
    override def audioManager: AudioManager = tal.audioManager
    override def storeManager: StoreManager = tal.storeManager

    override def die() {
      if (showVidoes) {
        game.destroy()
        val el = document.getElementById("content")
        el.innerHTML = """<iframe id="ytplayer" type="text/html" width="640" height="390" src="https://www.youtube.com/embed/9cFHAJ5asMk?autoplay=1&start=15" frameborder="0"/>"""

      }
    }

    override def win() {
      if (showVidoes) {
        game.destroy()
        val el = document.getElementById("content")
        el.setAttribute("style", "font-size:50px;background-color:red;color:white")
        el.innerHTML = "PLAYING WITH GUNS IS ALWAYS<br> " +
          "A BAD IDEA. EVEN WHEN <br>" +
          "ZOMBIE DOGS ARE TRYING TO EAT <br>" +
          "YOUR TURKEY. <br>" +
          "JUST GET SOME CHINESE FOOD. <br>" +
          "IT'S ACTUALLY QUITE GOOD. <br>" +
          "ESPECIALLY THE DUCK."

        dom.setTimeout(() => {
          el.innerHTML = """
          <iframe width="560" height="315" src="https://www.youtube.com/embed/mrAwb9ptu9U?autoplay=1&start=14" frameborder="0" allowfullscreen></iframe>
          """
        }, 5000)
        //dom.location.assign("http://img.costumecraze.com/images/vendors/forum/65703-Deluxe-Plush-Turkey-Costume-large.jpg")
      }
    }

  }
  lazy val playerManager = new PlayerManager(gm)
  lazy val mobManager = new MobManager(resources.mobCfgs)
  lazy val inputManager = new InputManager(gm)
  lazy val scoreManager = new ScoreManager(gm)
  lazy val skillManager = new SkillManager
  lazy val itemManager = new ItemManager(gm)
  lazy val projectileManager = new ProjectileManager
  lazy val levelManager = new LevelManager(gm)
  lazy val audioManager = new AudioManager(gm)
  lazy val storeManager = new StoreManager

  def preload() {
    game.load
      .image("sky", "assets/images/sky.png")
      .image("ground", "assets/images/platform.png")
      .image("star", "assets/images/doge.png")
      .image("turkey", "assets/images/turkey.jpg")
      .spritesheet("dude", "assets/images/dude.png", 32, 48)

    gm.preload()
  }

  def create() {
    if (game.device.iOS || game.device.android) {
      game.scale.scaleMode = phaser.ScaleManager.SHOW_ALL
      game.scale.pageAlignHorizontally = true
      game.scale.pageAlignVertically = true
      game.scale.refresh()
    } else {
      game.scale.scaleMode = phaser.ScaleManager.SHOW_ALL
      game.scale.refresh()
    }

    game.world.setBounds(0,0,600,600)
    game.add.sprite(0, 0, "sky")

    game.physics.startSystem(phaser.Physics.ARCADE)
    gm.managers.foreach(_.create())
  }


  def update() {
    gm.managers.foreach(_.update())
//    mobManager.update()
//    inputManager.update()
//    scoreManager.update()
//    skillManager.update()
  }

  def displayInventory() {

  }

}
