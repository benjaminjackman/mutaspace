package biz.jackman.facades
package threejs
package extensions

import org.scalajs.dom
import org.scalajs.dom.html

trait SceneContainer{

  val container: html.Element

  def width:Double

  def height:Double

  type RendererType <:Renderer

  val scene = new Scene()

  def distance:Double = 2000

  lazy val renderer: RendererType = this.initRenderer()


  lazy val camera = initCamera()


  def aspectRatio = width /height


  protected def initRenderer():RendererType


  protected def initCamera() =
  {
    val camera = new PerspectiveCamera(40, this.aspectRatio, 1, 1000000)
    camera.position.z = distance
    camera
  }



  protected def onEnterFrameFunction(double: Double): Unit = {
    onEnterFrame()
    render()
  }

  def onEnterFrame():Unit = {
      renderer.render(scene, camera)
  }



  def render() =  dom.requestAnimationFrame(  onEnterFrameFunction _ )


}


