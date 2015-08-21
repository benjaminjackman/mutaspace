package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Physics
import biz.jackman.mutaspace.tal.mechanics.DamageAmounts
import biz.jackman.mutaspace.tal.mob.Cardinal
import biz.jackman.mutaspace.tal.mob.Doge
import biz.jackman.mutaspace.tal.mob.Mob
import biz.jackman.facades.phaser
import biz.jackman.mutaspace.tal.mob.MobCfg
import biz.jackman.mutaspace.tal.mob.MobCfgFactory
import biz.jackman.mutaspace.tal.mob.Pirate


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/27/15 8:17 PM
//////////////////////////////////////////////////////////////

class MobManager(gm: GameManager, cfgs : Seq[MobCfg]) {

  val cardinalFactory = MobCfgFactory(cfgs.find(_.name == "cardinal").getOrElse(sys.error("Can't find cardinal")))

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

  def damageTo(mob: Mob, amount: DamageAmounts) = {
    gm.scoreManager.displayDamage(amount, mob.sprite)
    mob.takeDamage(amount)
  }


  def getMobNearestCursor(range: Double) : Option[Mob] = {
    def distance(mob : Mob) = {
      val ap = gm.game.input.activePointer
      phaser.Math.distance(ap.x, ap.y, mob.sprite.x , mob.sprite.y)
    }
    Mobs.mobs.minByOpt(distance).filter(distance(_) < range)
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

      if (mob.sprite.y + mob.sprite.height > gm.game.height - 200) {
        if (mob.sprite.body.velocity.y > 0 ) {
          mob.sprite.body.velocity.y *= -1
        }
      }
      if (mob.sprite.y < 0 ) {
        if (mob.sprite.body.velocity.y < 0 && mob.life() > 0) {
          mob.sprite.body.velocity.y *= -1
        }
      }
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

  def getRandomMob() : Mob = {
    val randomMob = gm.randy.getByWeight[GameManager => Mob](
      2.0 -> ((gm) => Doge.apply(gm)),
      2.0 -> ((gm) => Pirate.apply(gm)),
      2.0 -> ((gm) => cardinalFactory.create(gm))
    )
    randomMob(gm)
  }

  def spawnRandomMobPack(): Unit = {
    val cnt = gm.randy.getIntII(3, 8)
    cnt times {
      val mob = getRandomMob()
      Mobs += mob
      mob.sprite.x = gm.randy.getIntII(1, gm.game.width.toInt - mob.sprite.width.toInt)
      mob.sprite.y = gm.randy.getIntII(1, 50)
    }
  }
}