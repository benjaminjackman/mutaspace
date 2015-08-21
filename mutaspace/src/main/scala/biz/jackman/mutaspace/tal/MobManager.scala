package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Physics
import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts
import biz.jackman.mutaspace.tal.mob.Cardinal
import biz.jackman.mutaspace.tal.mob.Doge
import biz.jackman.mutaspace.tal.mob.Mob
import biz.jackman.facades.phaser
import biz.jackman.mutaspace.tal.mob.MobCfg
import biz.jackman.mutaspace.tal.mob.MobCfgFactory
import biz.jackman.mutaspace.tal.mob.Pirate
import cgta.oscala.util.debugging.PRINT


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/27/15 8:17 PM
//////////////////////////////////////////////////////////////

class MobManager(cfgs : Seq[MobCfg])(implicit gm: GameManager) {

  val factoryMap = IMap() ++ cfgs.map(cfg=>cfg.name -> MobCfgFactory(cfg))

  object Mobs {
    lazy val group = gm.game.add.physicsGroup(Physics.ARCADE)
    private var mobLst: List[Mob] = Nil
    def mobs: List[Mob] = mobLst
    def create() {
      group
    }
    def +=(m: Mob) {
      mobLst ::= m
      group.add(m.sprite)
    }
    def clearDead() {
      mobLst.filterNot(_.sprite.alive).foreach(m=>group.remove(m.sprite))
      mobLst = mobLst.filter(_.sprite.alive)
    }
  }


  val mobDelayMs = 1000
  var lastUpdateMs = 0.0
  var lastMobMs = 0.0

  def damageTo(sprite: Sprite, amount: DamageAmounts) = {
    gm.scoreManager.displayDamage(amount, sprite)
    sprite.health -= amount.total
  }


  def getSpriteNearestCursor(range: Double) : Option[Sprite] = {
    val ap = gm.game.input.activePointer
    val mobs = gm.game.physics.arcade.getObjectsAtLocation(ap.x, ap.y, Mobs.group)
    console.log(mobs)

//    def distance(mob : Mob) = {
//      val ap = gm.game.input.activePointer
//      phaser.Math.distance(ap.x, ap.y, mob.sprite.x , mob.sprite.y)
//    }
//    Mobs.mobs.minByOpt(distance).filter(distance(_) < range)

    mobs.headOption
  }

  def preload() {
    Doge.Resources.preload(gm.game)
    Cardinal.Resources.preload(gm.game)
    Pirate.Resources.preload(gm.game)
  }

  def create() {
    Mobs.create()
  }

  def update() {
    gm.game.physics.arcade.collide(Mobs.group)

    val curMs = gm.game.time.now
    if (lastUpdateMs == 0) {
      lastUpdateMs = curMs
    }
    val mobCnt = Mobs.group.countLiving()
    val msSinceMobFullOrSpawn = curMs - lastMobMs
    if (mobCnt < 10) {
      if (msSinceMobFullOrSpawn > mobDelayMs) {
        //Spawn a random enemy roughly every X frames
        spawnRandomMobPack()
        lastMobMs = curMs
      }
    } else {
      lastMobMs = curMs
    }
    lastUpdateMs = curMs

    def updateChild(mob: Mob) {

//      if (mob.sprite.y + mob.sprite.height > gm.game.height - 200) {
//        if (mob.sprite.body.velocity.y > 0 ) {
//          mob.sprite.body.velocity.y *= -1
//        }
//      }
//      if (mob.sprite.y < 0 ) {
//        if (mob.sprite.body.velocity.y < 0 && mob.life() > 0) {
//          mob.sprite.body.velocity.y *= -1
//        }
//      }
      if (mob.sprite.x + mob.sprite.width >= gm.game.width) {
        if (mob.sprite.body.velocity.x > 0) {
          mob.sprite.body.velocity.x *= -1
        }
      }
      if (mob.sprite.x <= 0) {
        if (mob.sprite.body.velocity.x < 0) {
          mob.sprite.body.velocity.x *= -1
        }
      }

      val hans = mob.onUpdateHandlers
      val len = hans.length
      var i = 0
      while (i < len) {
        hans(i)()
        i+=1
      }
    }

    Mobs.clearDead()
    Mobs.mobs.foreach(updateChild)
  }

  def getRandomMobFactory() : MobCfgFactory = {
    gm.randy.getByWeight[MobCfgFactory](
      2.0 -> factoryMap("cardinal")
    )
  }

  def spawnRandomMobPack(): Unit = {
    val cnt = gm.randy.getIntII(3, 8)
    val factory = getRandomMobFactory()
    val x = gm.randy.getIntII(100, gm.game.width.toInt - 100)
    val eliteMob = factory.create()
    eliteMob.sprite.x = x
    eliteMob.sprite.y = 100
    eliteMob.sprite.tint = 0x33FF00
    eliteMob.sprite.scale.set(2,2)
    eliteMob.sprite.maxHealth = eliteMob.sprite.maxHealth * 5
    eliteMob.sprite.health = eliteMob.sprite.maxHealth
    eliteMob.sprite.scale.set(2,2)
    PRINT | eliteMob.sprite.body.halfHeight
    Mobs += eliteMob
    cnt times {
      val mob = factory.create()
      Mobs += mob
      mob.sprite.x = gm.randy.getIntII(x - 100, x + 100)
      mob.sprite.y = gm.randy.getIntII(0,200)
    }
  }
}