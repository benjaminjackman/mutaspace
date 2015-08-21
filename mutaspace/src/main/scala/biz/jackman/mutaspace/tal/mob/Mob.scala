package biz.jackman.mutaspace
package tal.mob

import biz.jackman.facades.phaser
import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts
import cgta.serland.SerBuilder

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/27/15 3:38 PM
//////////////////////////////////////////////////////////////


object Mob {
}

trait Mob {
  def life() : Double
  def maxLife() : Double
  def takeDamage(amount: DamageAmounts): Unit
  def sprite: Sprite
  var onUpdateHandlers = new js.Array[() => Unit]()
}

trait MobFactory {
  def preload(implicit gm : GameManager) : Unit
  def create(implicit gm : GameManager) : Mob

}

object MobImageCfg {implicit val ser = SerBuilder.forCase(this.apply _)}
case class MobImageCfg(base: String) {
  def baseKey : String = base.split("/").last.split("\\.").head
}


object MobCfg {implicit val ser = SerBuilder.forCase(this.apply _)}
case class MobCfg(
  name: String,
  maxLife: String,
  image: MobImageCfg
  ) {
  def getMaxLife : Double = {
    //val RangeRegex = "^(\\d+)-(\\d+)$".r
    val NumberRegex = "^(\\d+)$".r
    maxLife.trim match {
      case NumberRegex(n) => n.toDouble
      case x =>
        console.error("Not a number", x)
        sys.error(s"Not a number $x")
    }
  }
}


case class MobCfgFactory(cfg : MobCfg) extends MobFactory {
  override def preload(implicit gm : GameManager) : Unit = {
    gm.game.load.image(cfg.image.baseKey, cfg.image.base)
  }
  override def create(implicit gm : GameManager) : Mob = {
    val sprite = gm.game.add.sprite(100, 50, cfg.image.baseKey)
    sprite.texture.frame.width = 50
    sprite.texture.frame.height = 60
    gm.game.physics.arcade.enable(sprite)
    sprite.body.velocity.set(0, 20)
    sprite.anchor.set(0.5, 0.5)
    val ss = sprite
    val mob = new Mob {
      override val sprite: Sprite = ss
      var maxLife = cfg.getMaxLife
      var life = maxLife
      var lastLife = life
      var dying = false

      onUpdateHandlers += { () =>
        if (life <= 0 && !dying) {
          dying = true
          def done() = {
            sprite.kill()
          }
          val tween = gm.game.add.tween(sprite.scale).to(OBJ(x = 0.0, y = 0.0), 1000, phaser.easing.Elastic.Out _)
          tween.onComplete.addOnce(done _)
          tween.start()

          //Show some feathers or something
        }
      }

      override def takeDamage(amount: DamageAmounts): Unit = {
        //Show some read feathers randomly or something
        life -= amount.total.toInt
      }
    }
    MobHelp.addLifeBar(mob)
    mob
  }
}






