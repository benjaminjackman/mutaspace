package biz.jackman.mutaspace
package tal

import biz.jackman.mutaspace.tal.mechanics.DamageAmounts
import biz.jackman.mutaspace.tal.mechanics.DamageRanges

import biz.jackman.facades.phaser



import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/27/15 8:18 PM
//////////////////////////////////////////////////////////////

object RandomManager {
  def weightIndexedSeq[A](weight_values_itr : Iterator[(Double, A)])(loc : Double) : Option[A] = {
    var remW = loc
    var done = false
    var v : Option[A] = None
    while(weight_values_itr.hasNext && !done) {
      val (cw, cv) = weight_values_itr.next()
      v = Some(cv)
      remW -= cw
      done = remW <= 0
    }
    v
  }
}

class RandomManager extends IManager {

  def getByWeight[A](weight_value_* : (Double, A)*) : A = {
    val totW = weight_value_*.iterator.map(_._1).sum
    val loc = getDblIE(0.0, totW)
    RandomManager.weightIndexedSeq(weight_value_*.iterator)(loc).get
  }

  //inclusive to exclusive
  def getDblIE(min: Double, max: Double): Double = {
    js.Math.random() * (max - min) + min
  }
  def getIntIE(min: Int, max: Int): Int = {
    js.Math.floor(js.Math.random() * (max - min)).asInstanceOf[Int] + min
  }
  def getIntII(min: Int, max: Int): Int = {
    js.Math.floor(js.Math.random() * (max - min + 1)).asInstanceOf[Int] + min
  }

  def getIntMR(mid: Int, rng: Int): Int = {
    getIntII(mid - rng, mid + rng)
  }

  def roll(damageRanges: DamageRanges) : DamageAmounts = {
    DamageAmounts(physical = getIntII(damageRanges.physical.min, damageRanges.physical.max))
  }

  def getRandomColor : Double = {
    val c = phaser.Color.HSLtoRGB(getDblIE(0, 1), getDblIE(.4, .9), getDblIE(.4, .9))
    phaser.Color.getColor(c.r.asInstanceOf[Double], c.g.asInstanceOf[Double], c.b.asInstanceOf[Double])
  }

}