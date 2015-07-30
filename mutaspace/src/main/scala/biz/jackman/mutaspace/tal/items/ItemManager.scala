package biz.jackman.mutaspace
package tal.items

import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.items.weapons.Fist


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/30/15 1:50 AM
//////////////////////////////////////////////////////////////

class ItemManager(gm : GameManager) {
  val weapons = List(Fist.Resources)
  def preload() = {
    weapons.foreach(_.preload(gm.game))
  }

}