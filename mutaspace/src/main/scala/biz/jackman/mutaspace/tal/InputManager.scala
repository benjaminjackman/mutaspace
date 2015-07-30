package biz.jackman.mutaspace
package tal


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/28/15 12:35 AM
//////////////////////////////////////////////////////////////



class InputManager(gm: GameManager) {
  def update() {
    val ap = gm.game.input.activePointer
    if (ap.isDown) {
      gm.skillManager.executeSkill()
    }
  }
}