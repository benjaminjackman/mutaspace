package biz.jackman.mutaspace
package tal

import biz.jackman.mutaspace.tal.items.weapons.Fist
import biz.jackman.mutaspace.tal.items.weapons.Shotgun
import biz.jackman.mutaspace.tal.items.weapons.Weapon


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/28/15 12:35 AM
//////////////////////////////////////////////////////////////

class PlayerManager(gm: GameManager) {
  lazy val fist = Fist(gm)
  lazy val shotgun = Shotgun(gm)


  def getWeapon(slot: Int) : Weapon = {
    if (slot == 0) {
     fist
    } else{
      shotgun
    }
  }

  def takeDamage(x: Int) = {
    life -= x
  }

  var life = 100
  var mana = 100
  var score = 0
}