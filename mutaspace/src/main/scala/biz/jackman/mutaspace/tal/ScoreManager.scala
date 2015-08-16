package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts

import scala.scalajs.js
import biz.jackman.facades.phaser


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/28/15 12:36 AM
//////////////////////////////////////////////////////////////

class ScoreManager(gm: GameManager, playerManager: PlayerManager) {


  lazy val lifeText: phaser.Text = gm.game.add.text(16, 16, "Life", OBJ()).oEff { text =>
    text.font = "24 px sans"
    text.fill = "red"
    text.stroke = "black"
    text.strokeThickness = 2
  }
  //  lazy val manaText: phaser.Text = gm.game.add.text(400, 16, "Mana: 0", js.Dynamic.literal(font = "32px sans", fill = "#00F"))
  lazy val enemyText: phaser.Text = gm.game.add.text(200, 16, s"Enemies", OBJ()).oEff { text =>
    text.font = "24 px sans"
    text.fill = "yellow"
    text.stroke = "black"
    text.strokeThickness = 2
  }


  def create() {
    lifeText
    enemyText
  }

  def update() {
    val life = playerManager.life
    val mana = playerManager.mana
    val enemies = gm.levelManager.remainingEnemies

    lifeText.text = s"Life: $life%"
    enemyText.text = s"Enemies: $enemies"
  }

  def displayDamage(amount: DamageAmounts, sprite: Sprite): Unit = {
    val startY = sprite.y - sprite.height / 2 - 10
    val endY = startY - 50
    val text = gm.game.add.text(sprite.x, startY, amount.total.toInt.toString, OBJ())
    text.font = "12 px sans"
    text.fill = "#ffffff"
    text.stroke = "#000"
    text.strokeThickness = 2

    val tween = gm.game.add.tween(text).to(OBJ(y = endY, alpha = 0.0), 2000, phaser.easing.Linear.None _)
    tween.onComplete.addOnce(() => {gm.game.world.remove(text)})
    tween.start()
  }

}