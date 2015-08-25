package biz.jackman.mutaspace
package tal

import biz.jackman.mutaspace.tal.skills.Skill
import biz.jackman.mutaspace.tal.skills.primary.BasicAttack


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/30/15 12:49 AM
//////////////////////////////////////////////////////////////

class SkillManager(gm: GameManager) extends IManager {
  val skills = Array[Skill](
    BasicAttack(gm)
  )
  var currentSkillSlot = 0

  def setCurrentSkill(n : Int) {

  }
  
  def executeSkill() {
    skills(currentSkillSlot).execute()
  }

  override def update() {
    val skill = skills(currentSkillSlot)
    skill.currentSkillUpdate()
  }

}