package biz.jackman.mutaspace
package tal


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/25/15 10:11 AM
//////////////////////////////////////////////////////////////

trait IManager {

  def preload(): Unit = {}
  def create(): Unit = {}
  def update(): Unit = {}

}