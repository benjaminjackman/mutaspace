package biz.jackman.mutaspace
package tal.skills

import biz.jackman.mutaspace.tal.skills.enhancer.Burst
import biz.jackman.mutaspace.tal.skills.enhancer.Quicken


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/14/15 10:48 PM
//////////////////////////////////////////////////////////////

object EquippedSkill{

  def combine(skill : Skill, enhancerSkill: EnhancerSkill) {

  }

}

trait EquippedSkill {
  def primary : PrimarySkill
  def execute()
}

