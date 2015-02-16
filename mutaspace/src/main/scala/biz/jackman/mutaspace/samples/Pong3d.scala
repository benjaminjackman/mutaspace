package biz.jackman.mutaspace
package samples

import biz.jackman.facades.threejs.BoxGeometry
import biz.jackman.facades.threejs.Mesh
import biz.jackman.facades.threejs.MeshLambertMaterial
import biz.jackman.facades.threejs.MeshLambertMaterialParameters
import biz.jackman.facades.threejs.PerspectiveCamera
import biz.jackman.facades.threejs.PlaneGeometry
import biz.jackman.facades.threejs.PointLight
import biz.jackman.facades.threejs.Scene
import biz.jackman.facades.threejs.SphereGeometry
import biz.jackman.facades.threejs.WebGLRenderer
import org.scalajs.dom


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 2/15/15 2:41 PM
//////////////////////////////////////////////////////////////


case class Ball(x: Double, y: Double) {
  val mesh = new Mesh(
    new SphereGeometry(radius = 5, widthSegments = 6, heightSegments = 6),
    new MeshLambertMaterial(newObj[MeshLambertMaterialParameters].oEff { o =>
      o.color = 0xCC0000
    })
  ).oEff { o =>
    o.position.x = x
    o.position.y = y
    o.position.z = 10
  }
}

case class Paddle(x: Double, y: Double) {
  val material = new MeshLambertMaterial(newObj[MeshLambertMaterialParameters].oEff { o =>
    o.color = 0xCC0000
  })
  val mesh     = new Mesh(
    new BoxGeometry(
      width = 10,
      height = 30,
      depth = 10,
      1,
      1,
      1),
    material
  ).oEff { o =>
    o.position.x = x
    o.position.y = y
    o.position.z = 10
  }
}

class Pong3d(el: dom.Element) {

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

    val fw = 400.0
    val fh = 200.0

    val ball = Ball(10, 0)
    val paddle1 = Paddle(-fw / 2, 0)
    val paddle2 = Paddle(+fw / 2, 0)

    camera.position.z = 500

    scene.add(ball.mesh)
    scene.add(paddle1.mesh)
    scene.add(paddle2.mesh)

    scene.add(new PointLight().oEff { o =>
      o.position.x = -1000
      o.position.y = 0
      o.position.z = 1000
      o.intensity = 2.9
      o.distance = 10000
    })

    scene.add(new Mesh(
      new PlaneGeometry(
        fw * .95,
        fh,
        10,
        10
      ),
      new MeshLambertMaterial(newObj[MeshLambertMaterialParameters].oEff { o =>
        o.color = 0x4BD121
        o.wireframe = true
      })
    ))

    dom.window.onkeydown = { (e: dom.KeyboardEvent) =>
      val Down = 40
      val Up = 38
      if (e.keyCode == dom.ext.KeyCode.up) {
        //camera.position.z += 25
        camera.position.y += 1
        e.stopPropagation()
      } else if (e.keyCode  == dom.ext.KeyCode.down) {
        camera.position.y -= 1
        e.stopPropagation()
      } else {
        true
      }
    }

  }

}