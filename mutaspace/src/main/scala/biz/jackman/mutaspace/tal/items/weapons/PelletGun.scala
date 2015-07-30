package biz.jackman.mutaspace
package tal.items.weapons

import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.skills.Skill


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/28/15 11:10 PM
//////////////////////////////////////////////////////////////

object PelletGun {
  def apply(gm: GameManager) : PelletGun = {
    new PelletGun
  }
}

class PelletGun extends Skill {

}