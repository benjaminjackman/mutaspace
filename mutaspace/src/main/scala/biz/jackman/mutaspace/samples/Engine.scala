package biz.jackman.mutaspace.samples

import biz.jackman.facades.threejs.Camera
import biz.jackman.facades.threejs.Renderer
import biz.jackman.facades.threejs.Scene


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 2/15/15 7:04 PM
//////////////////////////////////////////////////////////////

case class Engine(renderer: Renderer, scene: Scene, camera: Camera) {
  def render() { renderer.render(scene, camera) }
  def init(w: Int, h: Int) {
    scene.add(camera)
    renderer.setSize(w, h)
  }
}