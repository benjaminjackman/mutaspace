package biz.jackman.mutaspace
package tal

import biz.jackman.mutaspace.tal.mobs.Doge
import biz.jackman.mutaspace.tal.mobs.Mob
import biz.jackman.facades.phaser


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/27/15 8:17 PM
//////////////////////////////////////////////////////////////

class MobManager(gm: GameManager, player: PlayerManager, randy: RandomManager) {


  object Mobs {
    lazy val group = gm.game.add.group()
    private var mobLst: List[Mob] = Nil
    def mobs: Iterator[Mob] = mobLst.iterator
    def create() {
      group
    }
    def +=(m: Mob) {
      mobLst ::= m
      group.add(m.sprite)
    }
  }


  val mobDelayMs = 1000
  var lastUpdateMs = 0.0
  var lastMobMs = 0.0

  def inBBRange(range : Double, mob: Mob): Boolean = {
    val ap = gm.game.input.activePointer
    phaser.Math.distance(ap.x, ap.y, mob.sprite.x + mob.sprite.width / 2, mob.sprite.y + mob.sprite.height / 2) <= range
  }


  def getMobNearestCursor(range: Double) : Option[Mob] = {
    Mobs.mobs.find(inBBRange(range, _))

  }

  def preload() {
    Doge.preload(gm)
  }

  def create() {
    Mobs.create()
  }

  def update() {
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
      if (mob.sprite.y > gm.game.height - 200) {
        mob.sprite.y = 0
        //Player takes damage when the mobs wrap
        mob.attack(player)
      }
      mob.update()
    }

    Mobs.mobs.foreach(updateChild)
  }

  def spawnRandomMob() {
    Mobs += Doge(gm)
  }

  def spawnRandomMobPack(): Unit = {
    val cnt = randy.getIntII(3, 8)
    cnt times {
      val mob = Doge(gm)
      Mobs += mob
      mob.sprite.x = randy.getIntII(0, gm.game.width.toInt - mob.sprite.width.toInt)
      mob.sprite.y = randy.getIntII(0, 100)
    }
  }
}