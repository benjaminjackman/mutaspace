package biz.jackman.mutaspace
package tal.skills

import biz.jackman.mutaspace.tal.GameManager


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/30/15 12:20 AM
//////////////////////////////////////////////////////////////


object BasicAttack extends SkillBuilder {
  def apply(gm : GameManager) : BasicAttack = {
    new BasicAttack(gm)
  }
}

class BasicAttack(gm : GameManager) extends Skill {
  gm.playerManager
  var cooldownUntilMs = 0.0
  var nextWeaponSlot = WeaponSlot.

  override def execute() {
    val t = gm.game.time.now
    if (t >= cooldownUntilMs) {
      //Actually perform the attack
      gm.playerManager.getWeapon(0)
    }

    if (elapsed > cooldownMs) {
      val dmg = damages(gm.randy.getIntIE(0, damages.size))
      gm.game.sound.play("shot", dmg / 24.0)
      lastShotMs = gm.game.time.now
      gm.mobManager.Mobs.mobs.find(inBBRange).foreach { mob =>

        mob.takeDamage(dmg)
      }
    }

  }
//  val cooldownMs = 200.0
//  var lastShotMs = 0.0
//  def inBBRange(mob: Mob): Boolean = {
//    val ap = gm.game.input.activePointer
//    phaser.Math.distance(ap.x, ap.y, mob.sprite.x + mob.sprite.width / 2, mob.sprite.y + mob.sprite.height / 2) <= 50
//  }
//  val damages = Array(1,1,1,2,3,4,5,6,12,12)
//
//

}