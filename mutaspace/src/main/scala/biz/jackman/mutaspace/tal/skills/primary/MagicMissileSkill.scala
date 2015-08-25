package biz.jackman.mutaspace
package tal.skills.primary

import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.skills.Skill


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
    val sprite = gm.game.add.sprite(center.x, center.y)
    gm.game.physics.arcade.enable(sprite)
    sprite.body.width = r
    sprite.body.height = r

    val circle = gm.game.add.graphics(0,0)
    circle.beginFill(0x9370DB)
    circle.drawCircle(0,0,r)
    sprite.addChild(circle)

    val dx = gm.game.input.activePointer.x - center.x
    val dy = gm.game.input.activePointer.y - center.y

    sprite.body.velocity.set(dx, dy)
    sprite.body.velocity.setMagnitude(500)
    sprite.outOfBoundsKill = true
    sprite.checkWorldBounds = true

    gm.projectileManager.add(sprite)
  }
}