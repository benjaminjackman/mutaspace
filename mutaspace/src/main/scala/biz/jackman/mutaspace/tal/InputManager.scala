package biz.jackman.mutaspace
package tal

import biz.jackman.mutaspace.tal.mobs.Mob

import biz.jackman.facades.phaser
import cgta.oscala.util.debugging.PRINT

//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/28/15 12:35 AM
//////////////////////////////////////////////////////////////

class SkillManager(gm: GameManager) {

}

class InputManager(gm: GameManager) {
  val cooldownMs = 200.0
  var lastShotMs = 0.0
  def inBBRange(mob: Mob): Boolean = {
    val ap = gm.game.input.activePointer
    phaser.Math.distance(ap.x, ap.y, mob.sprite.x + mob.sprite.width / 2, mob.sprite.y + mob.sprite.height / 2) <= 50
  }
  val damages = Array(1,1,1,2,3,4,5,6,12,12)
  def update() {
    val ap = gm.game.input.activePointer
    if (ap.isDown) {
      val elapsed = gm.game.time.now - lastShotMs
      if (elapsed > cooldownMs) {
        val dmg = damages(gm.randy.getIntIE(0, damages.size))
        gm.game.sound.play("shot", dmg/24.0)
        lastShotMs = gm.game.time.now
        gm.mobManager.Mobs.mobs.find(inBBRange).foreach { mob =>

          mob.takeDamage(dmg)
        }
      }



    }

//    mobManager.Mobs.mobs.foreach { mob =>
//      if (inBBRange(mob)) {
//        mob.sprite.tint = mob.sprite.tint.toInt | 0x0f0000
//      } else {
//        mob.sprite.tint = mob.sprite.tint.toInt & 0x00ffff
//      }
//    }
  }
}