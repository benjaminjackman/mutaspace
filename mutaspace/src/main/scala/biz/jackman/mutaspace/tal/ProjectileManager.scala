package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Physics
import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.mechanics.DamageRanges


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
    val unused = locally {
      val g = gm.game.add.group()
      def addSprite() = {
        val s = gm.game.add.sprite(0, 0)
        s.kill()
        s.exists = false
        s.anchor.x = 0.5
        s.anchor.y = 0.5
        s.outOfBoundsKill = true
        s.checkWorldBounds = true
        g.add(s)
      }
      (0 until 200).map(i => addSprite())
      g
    }
  }

  def getSprite(): Sprite = {
    val p = Projectiles.unused.getFirstExists(false).asInstanceOf[Sprite]
    Projectiles.playerProjs.add(p)
    p.events.onKilled.addOnce(() => {Projectiles.playerProjs.remove(p);Projectiles.unused.add(p)})
    p
  }

  override def update() {
    gm.game.physics.arcade.overlap(Projectiles.playerProjs, gm.mobManager.Mobs.group, projectileHitMob _)
  }

  def projectileHitMob(projectile: Sprite, mob: Sprite) {
    projectile.kill()
    gm.mobManager.damageTo(mob, gm.randy.roll(DamageRanges(20 -> 40)))
  }

}