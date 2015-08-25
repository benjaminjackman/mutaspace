package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Physics
import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts
import biz.jackman.mutaspace.tal.mechanics.DamageRanges
import cgta.oscala.util.debugging.PRINT


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/25/15 5:33 PM
//////////////////////////////////////////////////////////////

class ProjectileManager(implicit gm: GameManager) extends IManager {

  object Projectiles {
    val playerProjs = gm.game.add.physicsGroup(Physics.ARCADE)
  }

  def add(sprite: Sprite) {
    Projectiles.playerProjs.add(sprite)
  }

  override def update() {
    gm.game.physics.arcade.overlap(Projectiles.playerProjs, gm.mobManager.Mobs.group, projectileHitMob _)
  }

  def projectileHitMob(projectile: Sprite, mob: Sprite) {
    PRINT | Projectiles.playerProjs.countLiving()
    projectile.kill()
    gm.mobManager.damageTo(mob, gm.randy.roll(DamageRanges(20->40)))
  }

}