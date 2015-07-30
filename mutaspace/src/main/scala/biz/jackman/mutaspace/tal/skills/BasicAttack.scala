package biz.jackman.mutaspace
package tal.skills

import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mobs.Mob
import biz.jackman.facades.phaser

import scala.scalajs.js


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
  var sprite: Sprite = null

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
      gm.mobManager.getMobNearestCursor(weapon.range).foreach { mob =>
        mob.takeDamage(dmgs)
        if (weaponSlot =?= 0) {
          mob.sprite.body.velocity.x += 25
        } else {
          mob.sprite.body.velocity.x -= 25
        }

        mob.sprite.body.velocity.y = mob.sprite.body.velocity.y - 25
      }
      val attackDurMs = weapon.attackDurMs
      cooldownUntilMs = t + attackDurMs
      def playWeaponSound() {
        val baseSound = weapon.sound.key
        val sound = gm.game.sound.add(baseSound)
        sound.onPlay.addOnce({ (x: js.Any) =>
          //Vary the pitch and speed of the sound
          sound._sound.playbackRate.value = gm.randy.getDblIE(.8, 1.2)
        }: js.Function)
        sound.play()
      }
      playWeaponSound()

      def playWeaponAnimation() {
        sprite = weapon.playAttackSpriteAnimation(gm, weaponSlot)
      }
      playWeaponAnimation()

    }
  }

  override def currentSkillUpdate() {
    //Move the weapon icon around on the screen

  }


  //  val cooldownMs = 200.0
  //  var lastShotMs = 0.0
  //  val damages = Array(1,1,1,2,3,4,5,6,12,12)
  //
  //

}