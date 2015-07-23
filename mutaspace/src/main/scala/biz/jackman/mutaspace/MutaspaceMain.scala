package biz.jackman.mutaspace


import biz.jackman.facades.phaser
import biz.jackman.facades.threejs.Mesh
import biz.jackman.facades.threejs.MeshLambertMaterial
import biz.jackman.facades.threejs.MeshLambertMaterialParameters
import biz.jackman.facades.threejs.PerspectiveCamera
import biz.jackman.facades.threejs.PointLight
import biz.jackman.facades.threejs.Scene
import biz.jackman.facades.threejs.SphereGeometry
import biz.jackman.facades.threejs.WebGLRenderer
import biz.jackman.mutaspace.reactive.Subscriber
import biz.jackman.mutaspace.reactive.Subscription
import biz.jackman.mutaspace.reactive.web.KeyEvent
import biz.jackman.mutaspace.reactive.web.KeyPublisher
import biz.jackman.mutaspace.samples.BouncyBall
import biz.jackman.mutaspace.samples.TapAndLoot

import biz.jackman.mutaspace.samples.Pong3d
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 2/14/15 7:04 PM
//////////////////////////////////////////////////////////////


@JSExport
object MutaspaceMain {

  @JSExport
  def main() {
    console.log("Hello World!")
    //    three()
    //pong3d()
    //    bouncyBall()
    //    keyJib()
    //incremental()
    TapAndLoot.start()
    //TapAndLoot.start()
  }






  def incremental() {
    console.log("Hello Mom")
  }


  def keyJib() {
    val pub = KeyPublisher.window
    pub.subscribe(new Subscriber[KeyEvent] {
      private var sp: Subscription = null
      override def onError(t: Throwable): Unit = console.error(t.asJsAny)
      override def onSubscribe(s: Subscription): Unit = {
        console.log("Subscribed")
        sp = s
        sp.request(Long.MaxValue)
      }
      override def onComplete(): Unit = {
        console.log("Completed")
      }
      override def onNext(a: Seq[KeyEvent]): Unit = {
        console.log("Keys were pressed", a.map(_.event).toJsArr)
      }
    })
  }

  def pong3d() {
    val p = new Pong3d(dom.document.querySelector("#content"))
    p.init()
    def renderLoop(d: Double) {
      p.draw()
      dom.requestAnimationFrame(renderLoop _)
    }
    dom.requestAnimationFrame(renderLoop _)
  }

  def bouncyBall() {
    val p = new BouncyBall(dom.document.querySelector("#content"))
    p.init()
    def renderLoop(d: Double) {
      p.draw()
      dom.requestAnimationFrame(renderLoop _)
    }
    dom.requestAnimationFrame(renderLoop _)
  }


  def three() {
    val el = dom.document.querySelector("#content")
    val w = el.clientWidth
    val h = dom.window.innerHeight - el.getBoundingClientRect().top
    val renderer = new WebGLRenderer()
    val camera = new PerspectiveCamera(fov = 45, aspect = w / h, near = 0.1, far = 10000)
    val scene = new Scene().oEff { scene =>
      scene.add(camera)
      camera.position.z = 300
      renderer.setSize(w, h)
      el.appendChild(renderer.domElement)

      scene.add(new Mesh(
        new SphereGeometry(radius = 50, widthSegments = 16, heightSegments = 16),
        new MeshLambertMaterial(newObj[MeshLambertMaterialParameters].oEff { o =>
          o.color = 0xCC0000
        })
      ))

      scene.add(new PointLight().oEff { o =>
        o.position.x = 10
        o.position.y = 50
        o.position.z = 130
      })
    }

    def renderLoop(d: Double) {
      renderer.render(scene, camera)
      dom.requestAnimationFrame(renderLoop _)
    }
    dom.requestAnimationFrame(renderLoop _)

  }


}