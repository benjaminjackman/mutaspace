package biz.jackman.mutaspace
package tal.mechanics


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/30/15 1:25 AM
//////////////////////////////////////////////////////////////

object DamageRange {
  implicit def fromTuple(t: (Int, Int)) : DamageRange = DamageRange(t._1, t._2)
}
case class DamageRange(min : Int, max : Int)

case class DamageRanges(physical : DamageRange)