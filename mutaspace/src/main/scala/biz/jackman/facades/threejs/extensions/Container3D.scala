package biz.jackman.facades
package threejs
package extensions


import biz.jackman.facades.threejs.extensions.controls.CameraControls
import biz.jackman.facades.threejs.extensions.controls.HoverControls
import biz.jackman.facades.threejs.extras.HtmlRenderer

import scala.scalajs.js.Dynamic


trait Container3D extends SceneContainer
{


  container.style.width = width.toString
  container.style.height = height.toString
  container.style.position = "relative"

  override type RendererType =  WebGLRenderer


  protected def initRenderer= {
    val params = Dynamic.literal(
      antialias = true,
      alpha = true
      //canvas = container
    ).asInstanceOf[ WebGLRendererParameters]
    val vr = new WebGLRenderer(params)

    vr.domElement.style.position = "absolute"
    vr.domElement.style.top	  = "0"
    vr.domElement.style.margin	  = "0"
    vr.domElement.style.padding  = "0"
    vr.setSize(width,height)
    vr
  }
  val  cssScene = new Scene()

  val cssRenderer:HtmlRenderer = this.initCSSRenderer


  protected def initCSSRenderer = {
    val rendererCSS = new HtmlRenderer()
    rendererCSS.setSize(width,height)
    rendererCSS.domElement.style.position = "absolute"
    rendererCSS.domElement.style.top	  = "0"
    rendererCSS.domElement.style.margin	  = "0"
    rendererCSS.domElement.style.padding  = "0"
    rendererCSS
  }


  //val controls = new OrbitControls(camera,this.container)
  val controls:CameraControls = new HoverControls(camera,this.container)


  container.appendChild( renderer.domElement )
  container.appendChild( cssRenderer.domElement )
  //cssRenderer.domElement.appendChild( renderer.domElement )



  override def onEnterFrame() = {
    controls.update()
    renderer.render( scene, camera )
    cssRenderer.render( cssScene, camera )

  }


}
