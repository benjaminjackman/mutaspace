package biz.jackman.mutaspace
package tal.skills.enhancer

import biz.jackman.mutaspace.tal.skills.EnhancerSkill
import biz.jackman.mutaspace.tal.skills.EquippedSkill
import biz.jackman.mutaspace.tal.skills.PrimarySkill


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/14/15 10:50 PM
//////////////////////////////////////////////////////////////

//Causes the enhanced skill to
class Burst extends EnhancerSkill {
  //Causes enhanced attack to fire at 300% of normal speed then
  def getBurstCnt : Int = 3
  def getBurstSpeedMultiplier : Double = 3.0
  def getDamagerMultiplier: Double = 0.5
  
  def applyTo(that : EquippedSkill) : Option[EquippedSkill] = {
    Some {
      new EquippedSkill {
        override def primary: PrimarySkill = that.primary
        override def execute() {

          that.execute()
        }
      }
    }
  }
}