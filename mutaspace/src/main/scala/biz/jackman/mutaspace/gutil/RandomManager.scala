package biz.jackman.mutaspace
package gutil

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/27/15 8:18 PM
//////////////////////////////////////////////////////////////

class RandomManager {

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

}