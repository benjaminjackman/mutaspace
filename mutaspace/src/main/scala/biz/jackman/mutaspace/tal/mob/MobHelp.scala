package biz.jackman.mutaspace
package tal.mob

import biz.jackman.facades.phaser
import biz.jackman.mutaspace.tal.GameManager
import cgta.oscala.util.debugging.PRINT


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/18/15 8:31 PM
//////////////////////////////////////////////////////////////

object MobHelp {

  def addLifeBar(mob: Mob)(implicit gm: GameManager) {
    val width = 38.0
    val height = 6.0
    val pad = 1.0
    val bgWidth = width + 2 * pad
    val bgHeight = height + 2 * pad
    val sW = mob.sprite.width
    val y = -(mob.sprite.height * mob.sprite.anchor.y ) - 10

    val bgSprite = gm.game.add.sprite( - (bgWidth * mob.sprite.anchor.x ), y,
      gm.game.add.bitmapData(bgWidth, bgHeight).oEff { bmd =>
        bmd.ctx.beginPath()
        bmd.ctx.rect(0, 0, bgWidth, bgHeight)
        bmd.ctx.fillStyle = "rgba(0,0,0,.7)"
        bmd.ctx.fill()
      }
    )
    mob.sprite.addChild(bgSprite)

    val lifeSprite = gm.game.add.sprite(- (width / 2), y,
      gm.game.add.bitmapData(width, height).oEff { bmd =>
        bmd.ctx.beginPath()
        bmd.ctx.rect(pad, pad, width, height)
        bmd.ctx.fillStyle = "rgba(255,0,0,.7)"
        bmd.ctx.fill()
      }
    )
    mob.sprite.addChild(lifeSprite)


    var lastLife = Double.NaN
    val rect = new phaser.Rectangle(1, 0, width, height)
    lifeSprite.crop(rect, copy = false)

    def onUpdate() {
      if (lastLife != mob.life()) {
        PRINT | "LIFE DIFF"
        lastLife = mob.life()
        rect.width = (width * (mob.life() / mob.maxLife())).ceil
        lifeSprite.updateCrop()
      }
    }

    mob.onUpdateHandlers += onUpdate

  }

}