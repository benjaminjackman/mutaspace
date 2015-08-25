package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser
import biz.jackman.facades.phaser.Polygon
import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.items.weapons.Fist
import biz.jackman.mutaspace.tal.items.weapons.Shotgun
import biz.jackman.mutaspace.tal.items.weapons.Weapon

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/28/15 12:35 AM
//////////////////////////////////////////////////////////////

class PlayerManager(gm: GameManager) extends IManager {
  lazy val fist = Fist(gm)
  lazy val shotgun = Shotgun(gm)


  def getWeapon(slot: Int): Weapon = {
    if (slot == 0) {
      fist
    } else {
      shotgun
    }
  }

  def takeDamage(x: Int) = {
    Player.sprite.health -= x
  }

  object Player {

    var sprite: Sprite = locally {
      val s = gm.game.add.sprite(gm.game.world.bounds.width / 2, gm.game.world.bounds.height / 2)
      val triangle = gm.game.add.graphics(0, 0)
      triangle.beginFill(0x008888, 1)
      val c = 10
      triangle.drawPolygon(new Polygon(js.Array(2 * c, 0, -c, c, -c, -c)))
      s.addChild(triangle)
      s.maxHealth = 100
      s.health = s.maxHealth
      s
    }
  }

  def angleToPointer = {
    phaser.Math.angleBetween(Player.sprite.x, Player.sprite.y, gm.game.input.activePointer.x, gm.game.input.activePointer.y)
  }

  override def update() {
    Player.sprite.rotation = angleToPointer
  }


}