package biz.jackman.mutaspace
package tal.skills.primary

import biz.jackman.facades.phaser
import biz.jackman.facades.phaser.Polygon
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.skills.Skill

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/25/15 5:07 PM
//////////////////////////////////////////////////////////////

class MagicMissileSkill(implicit gm : GameManager) extends Skill {
  override def currentSkillUpdate(): Unit = {}
  override def execute(): Unit = {
    val r = 10
    val center = gm.playerManager.Player.sprite

    val sprite = gm.projectileManager.getSprite()
    sprite.reset(center.x, center.y)

    gm.game.physics.arcade.enable(sprite)
    sprite.body.width = r
    sprite.body.height = r

    val graphics = gm.game.add.graphics(0,0)
//    graphics.beginFill(0x9370DB)
//    graphics.drawCircle(0,0,r)
    val c = 5
    graphics.beginFill(0x9370DB)
    graphics.drawPolygon(new Polygon(js.Array(2 * c, 0, -c, c, -c, -c)))

    sprite.addChild(graphics)
    sprite.outOfBoundsKill = true
    sprite.checkWorldBounds = true


    val rot = phaser.Math.degToRad(gm.randy.getDblIE(-90,90)) + gm.playerManager.angleToPointer
    sprite.rotation = rot
    gm.game.physics.arcade.velocityFromRotation(rot, 400,  sprite.body.velocity)

    sprite.events.onKilled.addOnce(() => graphics.destroy())
  }
}