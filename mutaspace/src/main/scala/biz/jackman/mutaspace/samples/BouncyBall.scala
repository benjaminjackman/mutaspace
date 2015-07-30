package biz.jackman.mutaspace
package samples

import biz.jackman.facades.threejs.Mesh
import biz.jackman.facades.threejs.MeshLambertMaterial
import biz.jackman.facades.threejs.MeshLambertMaterialParameters
import biz.jackman.facades.threejs.PerspectiveCamera
import biz.jackman.facades.threejs.PlaneGeometry
import biz.jackman.facades.threejs.PointLight
import biz.jackman.facades.threejs.Scene
import biz.jackman.facades.threejs.WebGLRenderer
import biz.jackman.mutaspace.newObj
import org.scalajs.dom


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 2/15/15 7:04 PM
//////////////////////////////////////////////////////////////

class BouncyBall(el: dom.Element) {

  var w = el.clientWidth
  var h = (dom.window.innerHeight - el.getBoundingClientRect().top).toInt

  val engine = Engine(
    new WebGLRenderer(),
    new Scene(),
    new PerspectiveCamera(fov = 50, aspect = w / h, near = 0.1, far = 10000)
  )

  el.appendChild(engine.renderer.domElement)
  engine.init(w, h)

  def draw() {
    engine.render()
  }


  def init() {
    import engine.scene
    import engine.camera

    camera.position.z = 320

    val ball = Ball(10, 0)

    scene.add(ball.mesh)

    scene.add(new PointLight().oEff { o =>
      o.position.x = -1000
      o.position.y = 0
      o.position.z = 1000
      o.intensity = 2.9
      o.distance = 10000
    })

  }

}