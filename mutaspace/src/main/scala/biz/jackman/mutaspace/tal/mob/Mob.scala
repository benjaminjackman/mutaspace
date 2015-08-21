package biz.jackman.mutaspace
package tal.mob

import biz.jackman.facades.phaser
import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts
import cgta.serland.SerBuilder
import cgta.serland.SerClass

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
  def takeDamage(amount: DamageAmounts): Unit
  def sprite: Sprite
  var onUpdateHandlers = new js.Array[() => Unit]()
}

trait MobFactory {
  def preload() : Unit
  def create() : Mob

}

object MobImageCfg {implicit val ser: SerClass[MobImageCfg] = SerBuilder.forCase(this.apply _)}
case class MobImageCfg(base: String) {
  def baseKey : String = base.split("/").last.split("\\.").head
}

object HeightWidthCfg{implicit val ser: SerClass[HeightWidthCfg] = SerBuilder.forCase(this.apply _)}
case class HeightWidthCfg(height: String, width: String)

object MobSpriteCfg {implicit val ser: SerClass[MobSpriteCfg] = SerBuilder.forCase(this.apply _)}
case class MobSpriteCfg(texture_frame: HeightWidthCfg)

object MobStatsCfg {implicit val ser: SerClass[MobStatsCfg] = SerBuilder.forCase(this.apply _)}
case class MobStatsCfg(maxHealth: String) {
  def getMaxHealth : Double = {
    //val RangeRegex = "^(\\d+)-(\\d+)$".r
    val NumberRegex = "^(\\d+)$".r
    maxHealth.trim match {
      case NumberRegex(n) => n.toDouble
      case x =>
        console.error("Not a number", x)
        sys.error(s"Not a number $x")
    }
  }

}

object MobCfg {implicit val ser: SerClass[MobCfg] = SerBuilder.forCase(this.apply _)}
case class MobCfg(
  name: String,
  stats: MobStatsCfg,
  image: MobImageCfg,
  sprite: MobSpriteCfg
  ) {
  var mobYml : js.Any = null
}


case class MobCfgFactory(cfg : MobCfg)(implicit gm : GameManager) extends MobFactory {
  override def preload() : Unit = {
    gm.game.load.image(cfg.image.baseKey, cfg.image.base)
  }
  override def create() : Mob = {
    val sprite = gm.game.add.sprite(0, 0, cfg.image.baseKey)
    sprite.texture.frame.width = cfg.sprite.texture_frame.width.toDouble
    sprite.texture.frame.height = cfg.sprite.texture_frame.height.toDouble
    gm.game.physics.arcade.enable(sprite)
    sprite.anchor.set(0.5, 0.5)
    sprite.maxHealth = cfg.stats.getMaxHealth
    sprite.health = sprite.maxHealth
    sprite.body.collideWorldBounds = true
    sprite.body.setSize(cfg.sprite.texture_frame.width.toDouble, cfg.sprite.texture_frame.height.toDouble)

    val ss = sprite
    val mob = new Mob {
      override val sprite: Sprite = ss
      var dying = false

      onUpdateHandlers += { () =>
        if (sprite.health <= 0 && !dying) {
          dying = true
          def done() = {
            sprite.kill()
          }
          val tween = gm.game.add.tween(sprite.scale).to(OBJ(x = 0.0, y = 0.0), 1000, phaser.easing.Elastic.Out _)
          tween.onComplete.addOnce(done _)
          tween.start()

          //Show some feathers or something
        }

        gm.game.physics.arcade.accelerateToXY(sprite, 300, 600, 5, 20, 20)
      }

      override def takeDamage(amount: DamageAmounts): Unit = {
        //Show some read feathers randomly or something
        sprite.health -= amount.total.toInt
      }
    }
    MobHelp.addLifeBar(mob)
    mob
  }
}






