package biz.jackman.mutaspace
package tal

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