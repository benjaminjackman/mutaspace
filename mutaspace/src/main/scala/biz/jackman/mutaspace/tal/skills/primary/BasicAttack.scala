package biz.jackman.mutaspace
package tal.skills.primary

import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.skills.Skill
import biz.jackman.mutaspace.tal.skills.SkillBuilder


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/30/15 12:20 AM
//////////////////////////////////////////////////////////////


object BasicAttack extends SkillBuilder {
  def apply(gm: GameManager): BasicAttack = {
    new BasicAttack(gm)
  }
}

class BasicAttack(gm: GameManager) extends Skill {
  gm.playerManager
  var cooldownUntilMs = 0.0
  var nextWeaponSlot = 0


  //  def inBBRange(mob: Mob): Boolean = {
  //    val ap = gm.game.input.activePointer
  //    phaser.Math.distance(ap.x, ap.y, mob.sprite.x + mob.sprite.width / 2, mob.sprite.y + mob.sprite.height / 2) <= 50
  //  }

  override def execute() {
    val t = gm.game.time.now
    if (t >= cooldownUntilMs) {
      //Actually perform the attack
      val weaponSlot = nextWeaponSlot
      val weapon = gm.playerManager.getWeapon(weaponSlot)

      nextWeaponSlot = (nextWeaponSlot + 1) & 1
      val dmgs = gm.randy.roll(weapon.damageRanges)

      var isHit = false
      gm.mobManager.getMobNearestCursor(25).foreach { mob =>
        isHit = true
        gm.mobManager.damageTo(mob, dmgs)

        val vel = gm.randy.getIntII(10, 30)
        //        val avel = gm.randy.getIntII(0,720)
        if (weaponSlot =?= 0) {
          mob.sprite.body.velocity.x += vel
          //          mob.sprite.body.angularVelocity = avel
        } else {
          mob.sprite.body.velocity.x -= vel
          //          mob.sprite.body.angularVelocity = -avel
        }

        mob.sprite.body.velocity.y = mob.sprite.body.velocity.y - 25
      }
      val attackDurMs = weapon.attackDurMs
      cooldownUntilMs = t + attackDurMs
      if (isHit) {
        gm.audioManager.play(weapon.hitSound, rate = gm.randy.getDblIE(.8, 1.2))
      } else {
        gm.audioManager.play(weapon.missSound, rate = gm.randy.getDblIE(.8, 1.2))
      }


      def playWeaponAnimation() {
        weapon.playAttackSpriteAnimation(gm, weaponSlot)
      }
      playWeaponAnimation()

    }
  }

  override def currentSkillUpdate() {

  }
}