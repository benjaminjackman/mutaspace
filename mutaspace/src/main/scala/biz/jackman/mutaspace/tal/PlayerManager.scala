package biz.jackman.mutaspace
package tal


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/28/15 12:35 AM
//////////////////////////////////////////////////////////////

class PlayerManager(gm: GameManager) {
  def takeDamage(x: Int) = {
    life -= x
    if (life < 0) {
      gm.die()
    }
  }

  var life = 100
  var mana = 100
  var score = 0
}