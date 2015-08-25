package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Game
import biz.jackman.mutaspace.tal.items.ItemManager


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/28/15 12:36 AM
//////////////////////////////////////////////////////////////

trait GameManager {


  def game: Game
  def randy: RandomManager
  def inputManager: InputManager
  def skillManager: SkillManager
  def mobManager : MobManager
  def playerManager: PlayerManager
  def projectileManager: ProjectileManager
  def itemManager: ItemManager
  def scoreManager: ScoreManager
  def levelManager: LevelManager
  def audioManager: AudioManager
  def storeManager: StoreManager

  def die(): Unit
  def win(): Unit

  lazy val managers : Array[IManager] = Array(
    randy,
    inputManager,
    skillManager,
    mobManager,
    playerManager,
    projectileManager,
    itemManager,
    scoreManager,
    levelManager,
    audioManager,
    storeManager)


  def preload() {
    mobManager.preload()
    itemManager.preload()
  }
}