package biz.jackman.mutaspace
package tal

import biz.jackman.mutaspace.tal.skills.BasicAttack
import biz.jackman.mutaspace.tal.skills.Skill


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/30/15 12:49 AM
//////////////////////////////////////////////////////////////

class SkillManager(gm: GameManager) {
  val skills = Array[Skill](BasicAttack(gm))
  var currentSkillIdx = 0

  def setCurrentSkill(n : Int) {

  }
  
  def executeSkill() {
    skills(currentSkillIdx).execute()
  }

  def update() {
    val skill = skills(currentSkillIdx)
    skill.currentSkillUpdate()
  }

}