
import scala.scalajs.js
import js.annotation._
import org.scalajs.dom.raw._
import scala.scalajs.js.typedarray._


package importedjs {

package PIXI {

sealed trait blendModes extends js.Object {
}

@JSName("PIXI.blendModes")
object blendModes extends js.Object {
  var NORMAL: blendModes = js.native
  var ADD: blendModes = js.native
  var MULTIPLY: blendModes = js.native
  var SCREEN: blendModes = js.native
  var OVERLAY: blendModes = js.native
  var DARKEN: blendModes = js.native
  var LIGHTEN: blendModes = js.native
  var COLOR_DODGE: blendModes = js.native
  var COLOR_BURN: blendModes = js.native
  var HARD_LIGHT: blendModes = js.native
  var SOFT_LIGHT: blendModes = js.native
  var DIFFERENCE: blendModes = js.native
  var EXCLUSION: blendModes = js.native
  var HUE: blendModes = js.native
  var SATURATION: blendModes = js.native
  var COLOR: blendModes = js.native
  var LUMINOSITY: blendModes = js.native
  @JSBracketAccess
  def apply(value: blendModes): String = js.native
}

sealed trait scaleModes extends js.Object {
}

@JSName("PIXI.scaleModes")
object scaleModes extends js.Object {
  var DEFAULT: scaleModes = js.native
  var LINEAR: scaleModes = js.native
  var NEAREST: scaleModes = js.native
  @JSBracketAccess
  def apply(value: scaleModes): String = js.native
}

@JSName("PIXI.BaseTextureCache")
object BaseTextureCache extends js.Object {
  @JSBracketAccess
  def apply(key: String): BaseTexture = js.native
  @JSBracketAccess
  def update(key: String, v: BaseTexture): Unit = js.native
}

@JSName("PIXI.TextureCache")
object TextureCache extends js.Object {
  @JSBracketAccess
  def apply(key: String): Texture = js.native
  @JSBracketAccess
  def update(key: String, v: Texture): Unit = js.native
}

trait IEventCallback extends js.Object {
  def apply(e: IEvent = ???): Unit = js.native
}

trait IEvent extends js.Object {
  var `type`: String = js.native
  var content: js.Any = js.native
}

trait HitArea extends js.Object {
  def contains(x: Double, y: Double): Boolean = js.native
}

trait IInteractionDataCallback extends js.Object {
  def apply(interactionData: InteractionData): Unit = js.native
}

trait PixiRenderer extends js.Object {
  var autoResize: Boolean = js.native
  var clearBeforeRender: Boolean = js.native
  var height: Double = js.native
  var resolution: Double = js.native
  var transparent: Boolean = js.native
  var `type`: Double = js.native
  var view: HTMLCanvasElement = js.native
  var width: Double = js.native
  def destroy(): Unit = js.native
  def render(stage: Stage): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
}

trait PixiRendererOptions extends js.Object {
  var autoResize: Boolean = js.native
  var antialias: Boolean = js.native
  var clearBeforeRender: Boolean = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var resolution: Double = js.native
  var transparent: Boolean = js.native
  var view: HTMLCanvasElement = js.native
}

trait BitmapTextStyle extends js.Object {
  var font: String = js.native
  var align: String = js.native
  var tint: String = js.native
}

trait TextStyle extends js.Object {
  var align: String = js.native
  var dropShadow: Boolean = js.native
  var dropShadowColor: String = js.native
  var dropShadowAngle: Double = js.native
  var dropShadowDistance: Double = js.native
  var fill: String = js.native
  var font: String = js.native
  var lineJoin: String = js.native
  var stroke: String = js.native
  var strokeThickness: Double = js.native
  var wordWrap: Boolean = js.native
  var wordWrapWidth: Double = js.native
}

trait Loader extends js.Object {
  def load(): Unit = js.native
}

trait MaskData extends js.Object {
  var alpha: Double = js.native
  var worldTransform: js.Array[Double] = js.native
}

trait RenderSession extends js.Object {
  var context: CanvasRenderingContext2D = js.native
  var maskManager: CanvasMaskManager = js.native
  var scaleMode: scaleModes = js.native
  var smoothProperty: String = js.native
  var roundPixels: Boolean = js.native
}

trait ShaderAttribute extends js.Object {
}

trait FilterBlock extends js.Object {
  var visible: Boolean = js.native
  var renderable: Boolean = js.native
}

@JSName("PIXI.AbstractFilter")
class AbstractFilter protected () extends js.Object {
  def this(fragmentSrc: js.Array[String], uniforms: js.Any) = this()
  var dirty: Boolean = js.native
  var padding: Double = js.native
  var uniforms: js.Any = js.native
  var fragmentSrc: js.Array[String] = js.native
  @JSName("apply")
  def apply(frameBuffer: WebGLFramebuffer): Unit = js.native
  def syncUniforms(): Unit = js.native
}

@JSName("PIXI.AlphaMaskFilter")
class AlphaMaskFilter protected () extends AbstractFilter {
  def this(texture: Texture) = this()
  var map: Texture = js.native
  def onTextureLoaded(): Unit = js.native
}

@JSName("PIXI.AsciiFilter")
class AsciiFilter extends AbstractFilter {
  var size: Double = js.native
}

@JSName("PIXI.AssetLoader")
class AssetLoader protected () extends Mixin {
  def this(assetURLs: js.Array[String], crossorigin: Boolean) = this()
  var assetURLs: js.Array[String] = js.native
  var crossorigin: Boolean = js.native
  var loadersByType: js.Any = js.native
  override def listeners(eventName: String): js.Array[js.Function] = js.native
  override def emit(eventName: String, data: js.Any = ???): Boolean = js.native
  override def dispatchEvent(eventName: String, data: js.Any = ???): Boolean = js.native
  override def on(eventName: String, fn: js.Function): js.Function = js.native
  override def addEventListener(eventName: String, fn: js.Function): js.Function = js.native
  override def once(eventName: String, fn: js.Function): js.Function = js.native
  override def off(eventName: String, fn: js.Function): js.Function = js.native
  override def removeAllEventListeners(eventName: String): Unit = js.native
  def load(): Unit = js.native
}

@JSName("PIXI.AtlasLoader")
class AtlasLoader protected () extends Mixin {
  def this(url: String, crossorigin: Boolean) = this()
  var url: String = js.native
  var baseUrl: String = js.native
  var crossorigin: Boolean = js.native
  var loaded: Boolean = js.native
  override def listeners(eventName: String): js.Array[js.Function] = js.native
  override def emit(eventName: String, data: js.Any = ???): Boolean = js.native
  override def dispatchEvent(eventName: String, data: js.Any = ???): Boolean = js.native
  override def on(eventName: String, fn: js.Function): js.Function = js.native
  override def addEventListener(eventName: String, fn: js.Function): js.Function = js.native
  override def once(eventName: String, fn: js.Function): js.Function = js.native
  override def off(eventName: String, fn: js.Function): js.Function = js.native
  override def removeAllEventListeners(eventName: String): Unit = js.native
  def load(): Unit = js.native
}

@JSName("PIXI.BaseTexture")
class BaseTexture protected () extends Mixin {
  def this(source: HTMLImageElement, scaleMode: scaleModes) = this()
  var height: Double = js.native
  var hasLoaded: Boolean = js.native
  var mipmap: Boolean = js.native
  var premultipliedAlpha: Boolean = js.native
  var resolution: Double = js.native
  var scaleMode: scaleModes = js.native
  var source: HTMLImageElement = js.native
  var width: Double = js.native
  override def listeners(eventName: String): js.Array[js.Function] = js.native
  override def emit(eventName: String, data: js.Any = ???): Boolean = js.native
  override def dispatchEvent(eventName: String, data: js.Any = ???): Boolean = js.native
  override def on(eventName: String, fn: js.Function): js.Function = js.native
  override def addEventListener(eventName: String, fn: js.Function): js.Function = js.native
  override def once(eventName: String, fn: js.Function): js.Function = js.native
  override def off(eventName: String, fn: js.Function): js.Function = js.native
  override def removeAllEventListeners(eventName: String): Unit = js.native
  def destroy(): Unit = js.native
  def dirty(): Unit = js.native
  def updateSourceImage(newSrc: String): Unit = js.native
  def unloadFromGPU(): Unit = js.native
}

@JSName("PIXI.BaseTexture")
object BaseTexture extends js.Object {
  def fromImage(imageUrl: String, crossorigin: Boolean = ???, scaleMode: scaleModes = ???): BaseTexture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: scaleModes = ???): BaseTexture = js.native
}

@JSName("PIXI.BitmapFontLoader")
class BitmapFontLoader protected () extends Mixin {
  def this(url: String, crossorigin: Boolean) = this()
  var baseUrl: String = js.native
  var crossorigin: Boolean = js.native
  var texture: Texture = js.native
  var url: String = js.native
  override def listeners(eventName: String): js.Array[js.Function] = js.native
  override def emit(eventName: String, data: js.Any = ???): Boolean = js.native
  override def dispatchEvent(eventName: String, data: js.Any = ???): Boolean = js.native
  override def on(eventName: String, fn: js.Function): js.Function = js.native
  override def addEventListener(eventName: String, fn: js.Function): js.Function = js.native
  override def once(eventName: String, fn: js.Function): js.Function = js.native
  override def off(eventName: String, fn: js.Function): js.Function = js.native
  override def removeAllEventListeners(eventName: String): Unit = js.native
  def load(): Unit = js.native
}

@JSName("PIXI.BitmapText")
class BitmapText protected () extends DisplayObjectContainer {
  def this(text: String, style: BitmapTextStyle) = this()
  var dirty: Boolean = js.native
  var fontName: String = js.native
  var fontSize: Double = js.native
  var maxWidth: Double = js.native
  var textWidth: Double = js.native
  var textHeight: Double = js.native
  var tint: Double = js.native
  var style: BitmapTextStyle = js.native
  def setText(text: String): Unit = js.native
  def setStyle(style: BitmapTextStyle): Unit = js.native
}

@JSName("PIXI.BitmapText")
object BitmapText extends js.Object {
  var fonts: js.Any = js.native
}

@JSName("PIXI.BlurFilter")
class BlurFilter extends AbstractFilter {
  var blur: Double = js.native
  var blurX: Double = js.native
  var blurY: Double = js.native
}

@JSName("PIXI.BlurXFilter")
class BlurXFilter extends AbstractFilter {
  var blur: Double = js.native
}

@JSName("PIXI.BlurYFilter")
class BlurYFilter extends AbstractFilter {
  var blur: Double = js.native
}

@JSName("PIXI.CanvasBuffer")
class CanvasBuffer protected () extends js.Object {
  def this(width: Double, height: Double) = this()
  var canvas: HTMLCanvasElement = js.native
  var context: CanvasRenderingContext2D = js.native
  var height: Double = js.native
  var width: Double = js.native
  def clear(): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
}

@JSName("PIXI.CanvasMaskManager")
class CanvasMaskManager extends js.Object {
  def pushMask(maskData: MaskData, renderSession: RenderSession): Unit = js.native
  def popMask(renderSession: RenderSession): Unit = js.native
}

@JSName("PIXI.CanvasRenderer")
class CanvasRenderer protected () extends PixiRenderer {
  def this(width: Double = ???, height: Double = ???, options: PixiRendererOptions = ???) = this()
  var context: CanvasRenderingContext2D = js.native
  var count: Double = js.native
  var maskManager: CanvasMaskManager = js.native
  var refresh: Boolean = js.native
  var renderSession: RenderSession = js.native
  def destroy(removeView: Boolean = ???): Unit = js.native
  override def render(stage: Stage): Unit = js.native
  override def resize(width: Double, height: Double): Unit = js.native
}

@JSName("PIXI.CanvasTinter")
class CanvasTinter extends js.Object {
}

@JSName("PIXI.CanvasTinter")
object CanvasTinter extends js.Object {
  def getTintedTexture(sprite: Sprite, color: Double): HTMLCanvasElement = js.native
  def tintWithMultiply(texture: Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  def tintWithOverlay(texture: Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  def tintWithPerPixel(texture: Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  def roundColor(color: Double): Unit = js.native
  var cacheStepsPerColorChannel: Double = js.native
  var convertTintToImage: Boolean = js.native
  var canUseMultiply: Boolean = js.native
  var tintMethod: js.Any = js.native
}

@JSName("PIXI.Circle")
class Circle protected () extends HitArea {
  def this(x: Double, y: Double, radius: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var radius: Double = js.native
  override def clone(): Circle = js.native
  override def contains(x: Double, y: Double): Boolean = js.native
  def getBounds(): Rectangle = js.native
}

@JSName("PIXI.ColorMatrixFilter")
class ColorMatrixFilter extends AbstractFilter {
  var matrix: Matrix = js.native
}

@JSName("PIXI.ColorStepFilter")
class ColorStepFilter extends AbstractFilter {
  var step: Double = js.native
}

@JSName("PIXI.ConvolutionFilter")
class ConvolutionFilter protected () extends AbstractFilter {
  def this(matrix: js.Array[Double], width: Double, height: Double) = this()
  var matrix: Matrix = js.native
  var width: Double = js.native
  var height: Double = js.native
}

@JSName("PIXI.CrossHatchFilter")
class CrossHatchFilter extends AbstractFilter {
  var blur: Double = js.native
}

@JSName("PIXI.DisplacementFilter")
class DisplacementFilter protected () extends AbstractFilter {
  def this(texture: Texture) = this()
  var map: Texture = js.native
  var offset: Point = js.native
  var scale: Point = js.native
}

@JSName("PIXI.DotScreenFilter")
class DotScreenFilter extends AbstractFilter {
  var angle: Double = js.native
  var scale: Point = js.native
}

@JSName("PIXI.DisplayObject")
class DisplayObject extends js.Object {
  var alpha: Double = js.native
  var buttonMode: Boolean = js.native
  var cacheAsBitmap: Boolean = js.native
  var defaultCursor: String = js.native
  var filterArea: Rectangle = js.native
  var filters: js.Array[AbstractFilter] = js.native
  var hitArea: HitArea = js.native
  var interactive: Boolean = js.native
  var mask: Graphics = js.native
  var parent: DisplayObjectContainer = js.native
  var pivot: Point = js.native
  var position: Point = js.native
  var renderable: Boolean = js.native
  var rotation: Double = js.native
  var scale: Point = js.native
  var stage: Stage = js.native
  var visible: Boolean = js.native
  var worldAlpha: Double = js.native
  var worldVisible: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
  def click(e: InteractionData): Unit = js.native
  def displayObjectUpdateTransform(): Unit = js.native
  def getBounds(matrix: Matrix = ???): Rectangle = js.native
  def getLocalBounds(): Rectangle = js.native
  def generateTexture(resolution: Double, scaleMode: scaleModes, renderer: PixiRenderer): RenderTexture = js.native
  def mousedown(e: InteractionData): Unit = js.native
  def mouseout(e: InteractionData): Unit = js.native
  def mouseover(e: InteractionData): Unit = js.native
  def mouseup(e: InteractionData): Unit = js.native
  def mousemove(e: InteractionData): Unit = js.native
  def mouseupoutside(e: InteractionData): Unit = js.native
  def rightclick(e: InteractionData): Unit = js.native
  def rightdown(e: InteractionData): Unit = js.native
  def rightup(e: InteractionData): Unit = js.native
  def rightupoutside(e: InteractionData): Unit = js.native
  def setStageReference(stage: Stage): Unit = js.native
  def tap(e: InteractionData): Unit = js.native
  def toGlobal(position: Point): Point = js.native
  def toLocal(position: Point, from: DisplayObject): Point = js.native
  def touchend(e: InteractionData): Unit = js.native
  def touchendoutside(e: InteractionData): Unit = js.native
  def touchstart(e: InteractionData): Unit = js.native
  def touchmove(e: InteractionData): Unit = js.native
  def updateTransform(): Unit = js.native
}

@JSName("PIXI.DisplayObjectContainer")
class DisplayObjectContainer extends DisplayObject {
  var children: js.Array[DisplayObject] = js.native
  var height: Double = js.native
  var width: Double = js.native
  def addChild(child: DisplayObject): DisplayObject = js.native
  def addChildAt(child: DisplayObject, index: Double): DisplayObject = js.native
  def getBounds(): Rectangle = js.native
  def getChildAt(index: Double): DisplayObject = js.native
  def getChildIndex(child: DisplayObject): Double = js.native
  override def getLocalBounds(): Rectangle = js.native
  def removeChild(child: DisplayObject): DisplayObject = js.native
  def removeChildAt(index: Double): DisplayObject = js.native
  def removeChildren(beginIndex: Double = ???, endIndex: Double = ???): js.Array[DisplayObject] = js.native
  def removeStageReference(): Unit = js.native
  def setChildIndex(child: DisplayObject, index: Double): Unit = js.native
  def swapChildren(child: DisplayObject, child2: DisplayObject): Unit = js.native
}

@JSName("PIXI.Ellipse")
class Ellipse protected () extends HitArea {
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  override def clone(): Ellipse = js.native
  override def contains(x: Double, y: Double): Boolean = js.native
  def getBounds(): Rectangle = js.native
}

@JSName("PIXI.Event")
class Event protected () extends js.Object {
  def this(target: js.Any, name: String, data: js.Any) = this()
  var target: js.Any = js.native
  var `type`: String = js.native
  var data: js.Any = js.native
  var timeStamp: Double = js.native
  def stopPropagation(): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
}

@JSName("PIXI.EventTarget")
class EventTarget extends js.Object {
}

@JSName("PIXI.EventTarget")
object EventTarget extends js.Object {
  def mixin(obj: js.Any): Unit = js.native
}

@JSName("PIXI.FilterTexture")
class FilterTexture protected () extends js.Object {
  def this(gl: WebGLRenderingContext, width: Double, height: Double, scaleMode: scaleModes) = this()
  var fragmentSrc: js.Array[String] = js.native
  var frameBuffer: WebGLFramebuffer = js.native
  var gl: WebGLRenderingContext = js.native
  var program: WebGLProgram = js.native
  var scaleMode: Double = js.native
  var texture: WebGLTexture = js.native
  def clear(): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def destroy(): Unit = js.native
}

@JSName("PIXI.GraphicsData")
class GraphicsData protected () extends js.Object {
  def this(lineWidth: Double = ???, lineColor: Double = ???, lineAlpha: Double = ???, fillColor: Double = ???, fillAlpha: Double = ???, fill: Boolean = ???, shape: js.Any = ???) = this()
  var lineWidth: Double = js.native
  var lineColor: Double = js.native
  var lineAlpha: Double = js.native
  var fillColor: Double = js.native
  var fillAlpha: Double = js.native
  var fill: Boolean = js.native
  var shape: js.Any = js.native
  var `type`: Double = js.native
}

@JSName("PIXI.Graphics")
class Graphics extends DisplayObjectContainer {
  var blendMode: Double = js.native
  var boundsPadding: Double = js.native
  var fillAlpha: Double = js.native
  var isMask: Boolean = js.native
  var lineWidth: Double = js.native
  var lineColor: Double = js.native
  var tint: Double = js.native
  def arc(cx: Double, cy: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Graphics = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Graphics = js.native
  def beginFill(color: Double = ???, alpha: Double = ???): Graphics = js.native
  def bezierCurveTo(cpX: Double, cpY: Double, cpX2: Double, cpY2: Double, toX: Double, toY: Double): Graphics = js.native
  def clear(): Graphics = js.native
  def destroyCachedSprite(): Unit = js.native
  def drawCircle(x: Double, y: Double, radius: Double): Graphics = js.native
  def drawEllipse(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def drawPolygon(path: js.Any*): Graphics = js.native
  def drawRect(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def drawRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): Graphics = js.native
  def drawShape(shape: Circle): GraphicsData = js.native
  def endFill(): Graphics = js.native
  def lineStyle(lineWidth: Double = ???, color: Double = ???, alpha: Double = ???): Graphics = js.native
  def lineTo(x: Double, y: Double): Graphics = js.native
  def moveTo(x: Double, y: Double): Graphics = js.native
  def quadraticCurveTo(cpX: Double, cpY: Double, toX: Double, toY: Double): Graphics = js.native
}

@JSName("PIXI.Graphics")
object Graphics extends js.Object {
  var POLY: Double = js.native
  var RECT: Double = js.native
  var CIRC: Double = js.native
  var ELIP: Double = js.native
  var RREC: Double = js.native
}

@JSName("PIXI.GrayFilter")
class GrayFilter extends AbstractFilter {
  var gray: Double = js.native
}

@JSName("PIXI.ImageLoader")
class ImageLoader protected () extends Mixin {
  def this(url: String, crossorigin: Boolean = ???) = this()
  var texture: Texture = js.native
  override def listeners(eventName: String): js.Array[js.Function] = js.native
  override def emit(eventName: String, data: js.Any = ???): Boolean = js.native
  override def dispatchEvent(eventName: String, data: js.Any = ???): Boolean = js.native
  override def on(eventName: String, fn: js.Function): js.Function = js.native
  override def addEventListener(eventName: String, fn: js.Function): js.Function = js.native
  override def once(eventName: String, fn: js.Function): js.Function = js.native
  override def off(eventName: String, fn: js.Function): js.Function = js.native
  override def removeAllEventListeners(eventName: String): Unit = js.native
  def load(): Unit = js.native
  def loadFramedSpriteSheet(frameWidth: Double, frameHeight: Double, textureName: String): Unit = js.native
}

@JSName("PIXI.InteractionData")
class InteractionData extends js.Object {
  var global: Point = js.native
  var target: Sprite = js.native
  var originalEvent: Event = js.native
  def getLocalPosition(displayObject: DisplayObject, point: Point = ???, globalPos: Point = ???): Point = js.native
}

@JSName("PIXI.InteractionManager")
class InteractionManager protected () extends js.Object {
  def this(stage: Stage) = this()
  var currentCursorStyle: String = js.native
  var last: Double = js.native
  var mouse: InteractionData = js.native
  var mouseOut: Boolean = js.native
  var mouseoverEnabled: Boolean = js.native
  var onMouseMove: js.Function = js.native
  var onMouseDown: js.Function = js.native
  var onMouseOut: js.Function = js.native
  var onMouseUp: js.Function = js.native
  var onTouchStart: js.Function = js.native
  var onTouchEnd: js.Function = js.native
  var onTouchMove: js.Function = js.native
  var pool: js.Array[InteractionData] = js.native
  var resolution: Double = js.native
  var stage: Stage = js.native
  var touches: js.Any = js.native
}

@JSName("PIXI.InvertFilter")
class InvertFilter extends AbstractFilter {
  var invert: Double = js.native
}

@JSName("PIXI.JsonLoader")
class JsonLoader protected () extends Mixin {
  def this(url: String, crossorigin: Boolean = ???) = this()
  var baseUrl: String = js.native
  var crossorigin: Boolean = js.native
  var loaded: Boolean = js.native
  var url: String = js.native
  override def listeners(eventName: String): js.Array[js.Function] = js.native
  override def emit(eventName: String, data: js.Any = ???): Boolean = js.native
  override def dispatchEvent(eventName: String, data: js.Any = ???): Boolean = js.native
  override def on(eventName: String, fn: js.Function): js.Function = js.native
  override def addEventListener(eventName: String, fn: js.Function): js.Function = js.native
  override def once(eventName: String, fn: js.Function): js.Function = js.native
  override def off(eventName: String, fn: js.Function): js.Function = js.native
  override def removeAllEventListeners(eventName: String): Unit = js.native
  def load(): Unit = js.native
}

@JSName("PIXI.Matrix")
class Matrix extends js.Object {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var tx: Double = js.native
  var ty: Double = js.native
  def append(matrix: Matrix): Matrix = js.native
  @JSName("apply")
  def apply(pos: Point, newPos: Point): Point = js.native
  def applyInverse(pos: Point, newPos: Point): Point = js.native
  def determineMatrixArrayType(): js.Array[Double] = js.native
  def identity(): Matrix = js.native
  def rotate(angle: Double): Matrix = js.native
  def fromArray(array: js.Array[Double]): Unit = js.native
  def translate(x: Double, y: Double): Matrix = js.native
  def toArray(transpose: Boolean): js.Array[Double] = js.native
  def scale(x: Double, y: Double): Matrix = js.native
}

trait Mixin extends js.Object {
  def listeners(eventName: String): js.Array[js.Function] = js.native
  def emit(eventName: String, data: js.Any = ???): Boolean = js.native
  def dispatchEvent(eventName: String, data: js.Any = ???): Boolean = js.native
  def on(eventName: String, fn: js.Function): js.Function = js.native
  def addEventListener(eventName: String, fn: js.Function): js.Function = js.native
  def once(eventName: String, fn: js.Function): js.Function = js.native
  def off(eventName: String, fn: js.Function): js.Function = js.native
  def removeAllEventListeners(eventName: String): Unit = js.native
}

@JSName("PIXI.MovieClip")
class MovieClip protected () extends Sprite {
  def this(textures: js.Array[Texture]) = this()
  var animationSpeed: Double = js.native
  var currentFrame: Double = js.native
  var loop: Boolean = js.native
  var playing: Boolean = js.native
  var textures: js.Array[Texture] = js.native
  var totalFrames: Double = js.native
  def gotoAndPlay(frameNumber: Double): Unit = js.native
  def gotoAndStop(frameNumber: Double): Unit = js.native
  def onComplete(): Unit = js.native
  def play(): Unit = js.native
  def stop(): Unit = js.native
}

@JSName("PIXI.MovieClip")
object MovieClip extends js.Object {
  def fromFrames(frames: js.Array[String]): MovieClip = js.native
  def fromImages(images: js.Array[HTMLImageElement]): HTMLImageElement = js.native
}

@JSName("PIXI.NoiseFilter")
class NoiseFilter extends AbstractFilter {
  var noise: Double = js.native
}

@JSName("PIXI.NormalMapFilter")
class NormalMapFilter extends AbstractFilter {
  var map: Texture = js.native
  var offset: Point = js.native
  var scale: Point = js.native
}

@JSName("PIXI.PixelateFilter")
class PixelateFilter extends AbstractFilter {
  var size: Double = js.native
}

trait IPixiShader extends js.Object {
  var fragmentSrc: js.Array[String] = js.native
  var gl: WebGLRenderingContext = js.native
  var program: WebGLProgram = js.native
  var vertexSrc: js.Array[String] = js.native
  def destroy(): Unit = js.native
  def init(): Unit = js.native
}

@JSName("PIXI.PixiShader")
class PixiShader protected () extends IPixiShader {
  def this(gl: WebGLRenderingContext) = this()
  var attributes: js.Array[ShaderAttribute] = js.native
  var defaultVertexSrc: js.Array[String] = js.native
  var dirty: Boolean = js.native
  var firstRun: Boolean = js.native
  var textureCount: Double = js.native
  def initSampler2D(): Unit = js.native
  def initUniforms(): Unit = js.native
  def syncUniforms(): Unit = js.native
  override def destroy(): Unit = js.native
  override def init(): Unit = js.native
}

@JSName("PIXI.PixiFastShader")
class PixiFastShader protected () extends IPixiShader {
  def this(gl: WebGLRenderingContext) = this()
  var textureCount: Double = js.native
  override def destroy(): Unit = js.native
  override def init(): Unit = js.native
}

@JSName("PIXI.PrimitiveShader")
class PrimitiveShader protected () extends IPixiShader {
  def this(gl: WebGLRenderingContext) = this()
  override def destroy(): Unit = js.native
  override def init(): Unit = js.native
}

@JSName("PIXI.ComplexPrimitiveShader")
class ComplexPrimitiveShader protected () extends IPixiShader {
  def this(gl: WebGLRenderingContext) = this()
  override def destroy(): Unit = js.native
  override def init(): Unit = js.native
}

@JSName("PIXI.StripShader")
class StripShader protected () extends IPixiShader {
  def this(gl: WebGLRenderingContext) = this()
  override def destroy(): Unit = js.native
  override def init(): Unit = js.native
}

@JSName("PIXI.Point")
class Point protected () extends js.Object {
  def this(x: Double = ???, y: Double = ???) = this()
  var x: Double = js.native
  var y: Double = js.native
  override def clone(): Point = js.native
  def set(x: Double, y: Double): Unit = js.native
}

@JSName("PIXI.Polygon")
class Polygon protected () extends HitArea {
  def this(points: js.Array[Point]) = this()
  var points: js.Array[js.Any] = js.native
  override def clone(): Polygon = js.native
  override def contains(x: Double, y: Double): Boolean = js.native
}

@JSName("PIXI.Rectangle")
class Rectangle protected () extends HitArea {
  def this(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???) = this()
  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  override def clone(): Rectangle = js.native
  override def contains(x: Double, y: Double): Boolean = js.native
}

@JSName("PIXI.RGBSplitFilter")
class RGBSplitFilter extends AbstractFilter {
  var red: Point = js.native
  var green: Point = js.native
  var blue: Point = js.native
}

@JSName("PIXI.Rope")
class Rope protected () extends Strip {
  def this(texture: Texture, points: js.Array[Point]) = this()
  var points: js.Array[Point] = js.native
  def refresh(): Unit = js.native
  def setTexture(texture: Texture): Unit = js.native
}

@JSName("PIXI.RoundedRectangle")
class RoundedRectangle protected () extends HitArea {
  def this(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???, radius: Double = ???) = this()
  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var radius: Double = js.native
  override def clone(): RoundedRectangle = js.native
  override def contains(x: Double, y: Double): Boolean = js.native
}

@JSName("PIXI.SepiaFilter")
class SepiaFilter extends AbstractFilter {
  var sepia: Double = js.native
}

@JSName("PIXI.SmartBlurFilter")
class SmartBlurFilter extends AbstractFilter {
  var blur: Double = js.native
}

@JSName("PIXI.SpineLoader")
class SpineLoader protected () extends Mixin {
  def this(url: String, crossOrigin: Boolean) = this()
  var url: String = js.native
  var crossorigin: Boolean = js.native
  var loaded: Boolean = js.native
  override def listeners(eventName: String): js.Array[js.Function] = js.native
  override def emit(eventName: String, data: js.Any = ???): Boolean = js.native
  override def dispatchEvent(eventName: String, data: js.Any = ???): Boolean = js.native
  override def on(eventName: String, fn: js.Function): js.Function = js.native
  override def addEventListener(eventName: String, fn: js.Function): js.Function = js.native
  override def once(eventName: String, fn: js.Function): js.Function = js.native
  override def off(eventName: String, fn: js.Function): js.Function = js.native
  override def removeAllEventListeners(eventName: String): Unit = js.native
  def load(): Unit = js.native
}

@JSName("PIXI.SpineTextureLoader")
class SpineTextureLoader protected () extends js.Object {
  def this(basePath: String, crossorigin: Boolean) = this()
  def load(page: AtlasPage, file: String): Unit = js.native
  def unload(texture: BaseTexture): Unit = js.native
}

@JSName("PIXI.Sprite")
class Sprite protected () extends DisplayObjectContainer {
  def this(texture: Texture) = this()
  var anchor: Point = js.native
  var blendMode: blendModes = js.native
  var shader: IPixiShader = js.native
  var texture: Texture = js.native
  var tint: Double = js.native
  def setTexture(texture: Texture): Unit = js.native
}

@JSName("PIXI.Sprite")
object Sprite extends js.Object {
  def fromFrame(frameId: String): Sprite = js.native
  def fromImage(url: String, crossorigin: Boolean = ???, scaleMode: scaleModes = ???): Sprite = js.native
}

@JSName("PIXI.SpriteBatch")
class SpriteBatch protected () extends DisplayObjectContainer {
  def this(texture: Texture = ???) = this()
  var ready: Boolean = js.native
  var textureThing: Texture = js.native
  def initWebGL(gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.SpriteSheetLoader")
class SpriteSheetLoader protected () extends Mixin {
  def this(url: String, crossorigin: Boolean = ???) = this()
  var baseUrl: String = js.native
  var crossorigin: Boolean = js.native
  var frames: js.Any = js.native
  var texture: Texture = js.native
  var url: String = js.native
  override def listeners(eventName: String): js.Array[js.Function] = js.native
  override def emit(eventName: String, data: js.Any = ???): Boolean = js.native
  override def dispatchEvent(eventName: String, data: js.Any = ???): Boolean = js.native
  override def on(eventName: String, fn: js.Function): js.Function = js.native
  override def addEventListener(eventName: String, fn: js.Function): js.Function = js.native
  override def once(eventName: String, fn: js.Function): js.Function = js.native
  override def off(eventName: String, fn: js.Function): js.Function = js.native
  override def removeAllEventListeners(eventName: String): Unit = js.native
  def load(): Unit = js.native
}

@JSName("PIXI.Stage")
class Stage protected () extends DisplayObjectContainer {
  def this(backgroundColor: Double) = this()
  var interactionManager: InteractionManager = js.native
  def getMousePosition(): Point = js.native
  def setBackgroundColor(backgroundColor: Double): Unit = js.native
  def setInteractionDelegate(domElement: HTMLElement): Unit = js.native
}

@JSName("PIXI.Strip")
class Strip protected () extends DisplayObjectContainer {
  def this(texture: Texture) = this()
  var blendMode: Double = js.native
  var colors: js.Array[Double] = js.native
  var dirty: Boolean = js.native
  var indices: js.Array[Double] = js.native
  var canvasPadding: Double = js.native
  var texture: Texture = js.native
  var uvs: js.Array[Double] = js.native
  var vertices: js.Array[Double] = js.native
  override def getBounds(matrix: Matrix = ???): Rectangle = js.native
}

@JSName("PIXI.Strip")
object Strip extends js.Object {
  var DrawModes: js.Any = js.native
}

@JSName("PIXI.Text")
class Text protected () extends Sprite {
  def this(text: String, style: TextStyle = ???) = this()
  var context: CanvasRenderingContext2D = js.native
  var resolution: Double = js.native
  def destroy(destroyTexture: Boolean): Unit = js.native
  def setStyle(style: TextStyle): Unit = js.native
  def setText(text: String): Unit = js.native
}

@JSName("PIXI.Text")
object Text extends js.Object {
  var fontPropertiesCanvas: js.Any = js.native
  var fontPropertiesContext: js.Any = js.native
  var fontPropertiesCache: js.Any = js.native
}

@JSName("PIXI.Texture")
class Texture protected () extends Mixin {
  def this(baseTexture: BaseTexture, frame: Rectangle = ???, crop: Rectangle = ???, trim: Rectangle = ???) = this()
  var baseTexture: BaseTexture = js.native
  var crop: Rectangle = js.native
  var frame: Rectangle = js.native
  var height: Double = js.native
  var noFrame: Boolean = js.native
  var requiresUpdate: Boolean = js.native
  var trim: Point = js.native
  var width: Double = js.native
  var scope: js.Any = js.native
  var valid: Boolean = js.native
  override def listeners(eventName: String): js.Array[js.Function] = js.native
  override def emit(eventName: String, data: js.Any = ???): Boolean = js.native
  override def dispatchEvent(eventName: String, data: js.Any = ???): Boolean = js.native
  override def on(eventName: String, fn: js.Function): js.Function = js.native
  override def addEventListener(eventName: String, fn: js.Function): js.Function = js.native
  override def once(eventName: String, fn: js.Function): js.Function = js.native
  override def off(eventName: String, fn: js.Function): js.Function = js.native
  override def removeAllEventListeners(eventName: String): Unit = js.native
  def destroy(destroyBase: Boolean): Unit = js.native
  def setFrame(frame: Rectangle): Unit = js.native
}

@JSName("PIXI.Texture")
object Texture extends js.Object {
  var emptyTexture: Texture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: scaleModes = ???): Texture = js.native
  def fromFrame(frameId: String): Texture = js.native
  def fromImage(imageUrl: String, crossorigin: Boolean = ???, scaleMode: scaleModes = ???): Texture = js.native
  def addTextureToCache(texture: Texture, id: String): Unit = js.native
  def removeTextureFromCache(id: String): Texture = js.native
}

@JSName("PIXI.TilingSprite")
class TilingSprite protected () extends Sprite {
  def this(texture: Texture, width: Double, height: Double) = this()
  var tilePosition: Point = js.native
  var tileScale: Point = js.native
  var tileScaleOffset: Point = js.native
  def destroy(): Unit = js.native
  def generateTilingTexture(forcePowerOfTwo: Boolean = ???): Unit = js.native
  override def setTexture(texture: Texture): Unit = js.native
}

@JSName("PIXI.TiltShiftFilter")
class TiltShiftFilter extends AbstractFilter {
  var blur: Double = js.native
  var gradientBlur: Double = js.native
  var start: Double = js.native
  var end: Double = js.native
}

@JSName("PIXI.TiltShiftXFilter")
class TiltShiftXFilter extends AbstractFilter {
  var blur: Double = js.native
  var gradientBlur: Double = js.native
  var start: Double = js.native
  var end: Double = js.native
  def updateDelta(): Unit = js.native
}

@JSName("PIXI.TiltShiftYFilter")
class TiltShiftYFilter extends AbstractFilter {
  var blur: Double = js.native
  var gradientBlur: Double = js.native
  var start: Double = js.native
  var end: Double = js.native
  def updateDelta(): Unit = js.native
}

@JSName("PIXI.TwistFilter")
class TwistFilter extends AbstractFilter {
  var angle: Double = js.native
  var offset: Point = js.native
  var radius: Double = js.native
}

@JSName("PIXI.VideoTexture")
class VideoTexture extends BaseTexture {
  var autoUpdate: Boolean = js.native
  override def destroy(): Unit = js.native
  def updateBound(): Unit = js.native
  def onPlayStart(): Unit = js.native
  def onPlayStop(): Unit = js.native
  def onCanPlay(): Unit = js.native
}

@JSName("PIXI.VideoTexture")
object VideoTexture extends js.Object {
  def baseTextureFromVideo(video: HTMLVideoElement, scaleMode: Double): BaseTexture = js.native
  def textureFromVideo(video: HTMLVideoElement, scaleMode: Double): Texture = js.native
  def fromUrl(videoSrc: String, scaleMode: Double): Texture = js.native
}

@JSName("PIXI.WebGLBlendModeManager")
class WebGLBlendModeManager extends js.Object {
  var currentBlendMode: Double = js.native
  def destroy(): Unit = js.native
  def setBlendMode(blendMode: Double): Boolean = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.WebGLFastSpriteBatch")
class WebGLFastSpriteBatch protected () extends js.Object {
  def this(gl: CanvasRenderingContext2D) = this()
  var currentBatchSize: Double = js.native
  var currentBaseTexture: BaseTexture = js.native
  var currentBlendMode: Double = js.native
  var renderSession: RenderSession = js.native
  var drawing: Boolean = js.native
  var indexBuffer: js.Any = js.native
  var indices: js.Array[Double] = js.native
  var lastIndexCount: Double = js.native
  var matrix: Matrix = js.native
  var maxSize: Double = js.native
  var shader: IPixiShader = js.native
  var size: Double = js.native
  var vertexBuffer: js.Any = js.native
  var vertices: js.Array[Double] = js.native
  var vertSize: Double = js.native
  def end(): Unit = js.native
  def begin(spriteBatch: SpriteBatch, renderSession: RenderSession): Unit = js.native
  def destroy(removeView: Boolean = ???): Unit = js.native
  def flush(): Unit = js.native
  def render(spriteBatch: SpriteBatch): Unit = js.native
  def renderSprite(sprite: Sprite): Unit = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

@JSName("PIXI.WebGLFilterManager")
class WebGLFilterManager extends js.Object {
  var filterStack: js.Array[AbstractFilter] = js.native
  var transparent: Boolean = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  def applyFilterPass(filter: AbstractFilter, filterArea: Texture, width: Double, height: Double): Unit = js.native
  def begin(renderSession: RenderSession, buffer: ArrayBuffer): Unit = js.native
  def destroy(): Unit = js.native
  def initShaderBuffers(): Unit = js.native
  def popFilter(): Unit = js.native
  def pushFilter(filterBlock: FilterBlock): Unit = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.WebGLGraphics")
class WebGLGraphics extends js.Object {
  def reset(): Unit = js.native
  def upload(): Unit = js.native
}

@JSName("PIXI.WebGLGraphics")
object WebGLGraphics extends js.Object {
  var graphicsDataPool: js.Array[js.Any] = js.native
  def renderGraphics(graphics: Graphics, renderRession: RenderSession): Unit = js.native
  def updateGraphics(graphics: Graphics, gl: WebGLRenderingContext): Unit = js.native
  def switchMode(webGL: WebGLRenderingContext, `type`: Double): js.Dynamic = js.native
  def buildRectangle(graphicsData: GraphicsData, webGLData: js.Any): Unit = js.native
  def buildRoundedRectangle(graphicsData: GraphicsData, webGLData: js.Any): Unit = js.native
  def quadraticBezierCurve(fromX: Double, fromY: Double, cpX: Double, cpY: Double, toX: Double, toY: Double): js.Array[Double] = js.native
  def buildCircle(graphicsData: GraphicsData, webGLData: js.Any): Unit = js.native
  def buildLine(graphicsData: GraphicsData, webGLData: js.Any): Unit = js.native
  def buildComplexPoly(graphicsData: GraphicsData, webGLData: js.Any): Unit = js.native
  def buildPoly(graphicsData: GraphicsData, webGLData: js.Any): Boolean = js.native
}

@JSName("PIXI.WebGLGraphicsData")
class WebGLGraphicsData protected () extends js.Object {
  def this(gl: WebGLRenderingContext) = this()
  var gl: WebGLRenderingContext = js.native
  var glPoints: js.Array[js.Any] = js.native
  var color: js.Array[Double] = js.native
  var points: js.Array[js.Any] = js.native
  var indices: js.Array[js.Any] = js.native
  var buffer: WebGLBuffer = js.native
  var indexBuffer: WebGLBuffer = js.native
  var mode: Double = js.native
  var alpha: Double = js.native
  var dirty: Boolean = js.native
  def reset(): Unit = js.native
  def upload(): Unit = js.native
}

@JSName("PIXI.WebGLMaskManager")
class WebGLMaskManager extends js.Object {
  def destroy(): Unit = js.native
  def popMask(renderSession: RenderSession): Unit = js.native
  def pushMask(maskData: js.Array[js.Any], renderSession: RenderSession): Unit = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.WebGLRenderer")
class WebGLRenderer protected () extends PixiRenderer {
  def this(width: Double = ???, height: Double = ???, options: PixiRendererOptions = ???) = this()
  var contextLost: Boolean = js.native
  var contextLostBound: js.Function = js.native
  var contextRestoreLost: Boolean = js.native
  var contextRestoredBound: js.Function = js.native
  var gl: WebGLRenderingContext = js.native
  var offset: Point = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var projection: Point = js.native
  var renderSession: RenderSession = js.native
  var shaderManager: WebGLShaderManager = js.native
  var spriteBatch: WebGLSpriteBatch = js.native
  var maskManager: WebGLMaskManager = js.native
  var filterManager: WebGLFilterManager = js.native
  var stencilManager: WebGLStencilManager = js.native
  var blendModeManager: WebGLBlendModeManager = js.native
  override def destroy(): Unit = js.native
  def initContext(): Unit = js.native
  def mapBlendModes(): Unit = js.native
  override def render(stage: Stage): Unit = js.native
  def renderDisplayObject(displayObject: DisplayObject, projection: Point, buffer: WebGLBuffer): Unit = js.native
  override def resize(width: Double, height: Double): Unit = js.native
  def updateTexture(texture: Texture): Unit = js.native
}

@JSName("PIXI.WebGLRenderer")
object WebGLRenderer extends js.Object {
  def createWebGLTexture(texture: Texture, gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.WebGLShaderManager")
class WebGLShaderManager extends js.Object {
  var maxAttibs: Double = js.native
  var attribState: js.Array[js.Any] = js.native
  var stack: js.Array[js.Any] = js.native
  var tempAttribState: js.Array[js.Any] = js.native
  def destroy(): Unit = js.native
  def setAttribs(attribs: js.Array[ShaderAttribute]): Unit = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
  def setShader(shader: IPixiShader): Boolean = js.native
}

@JSName("PIXI.WebGLStencilManager")
class WebGLStencilManager extends js.Object {
  var stencilStack: js.Array[js.Any] = js.native
  var reverse: Boolean = js.native
  var count: Double = js.native
  def bindGraphics(graphics: Graphics, webGLData: js.Array[js.Any], renderSession: RenderSession): Unit = js.native
  def destroy(): Unit = js.native
  def popStencil(graphics: Graphics, webGLData: js.Array[js.Any], renderSession: RenderSession): Unit = js.native
  def pushStencil(graphics: Graphics, webGLData: js.Array[js.Any], renderSession: RenderSession): Unit = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.WebGLSpriteBatch")
class WebGLSpriteBatch extends js.Object {
  var blendModes: js.Array[Double] = js.native
  var colors: js.Array[Double] = js.native
  var currentBatchSize: Double = js.native
  var currentBaseTexture: Texture = js.native
  var defaultShader: AbstractFilter = js.native
  var dirty: Boolean = js.native
  var drawing: Boolean = js.native
  var indices: js.Array[Double] = js.native
  var lastIndexCount: Double = js.native
  var positions: js.Array[Double] = js.native
  var textures: js.Array[Texture] = js.native
  var shaders: js.Array[IPixiShader] = js.native
  var size: Double = js.native
  var sprites: js.Array[js.Any] = js.native
  var vertices: js.Array[Double] = js.native
  var vertSize: Double = js.native
  def begin(renderSession: RenderSession): Unit = js.native
  def destroy(): Unit = js.native
  def end(): Unit = js.native
  def flush(shader: IPixiShader = ???): Unit = js.native
  def render(sprite: Sprite): Unit = js.native
  def renderBatch(texture: Texture, size: Double, startIndex: Double): Unit = js.native
  def renderTilingSprite(sprite: TilingSprite): Unit = js.native
  def setBlendMode(blendMode: blendModes): Unit = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

@JSName("PIXI.RenderTexture")
class RenderTexture protected () extends Texture {
  def this(width: Double = ???, height: Double = ???, renderer: PixiRenderer = ???, scaleMode: scaleModes = ???, resolution: Double = ???) = this()
  var renderer: PixiRenderer = js.native
  var resolution: Double = js.native
  def clear(): Unit = js.native
  def getBase64(): String = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def getImage(): HTMLImageElement = js.native
  def resize(width: Double, height: Double, updateBase: Boolean): Unit = js.native
  def render(displayObject: DisplayObject, position: Point = ???, clear: Boolean = ???): Unit = js.native
}

@JSName("PIXI.BoneData")
class BoneData protected () extends js.Object {
  def this(name: String, parent: js.Any = ???) = this()
  var name: String = js.native
  var parent: js.Any = js.native
  var length: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var rotation: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
}

@JSName("PIXI.SlotData")
class SlotData protected () extends js.Object {
  def this(name: String, boneData: BoneData) = this()
  var name: String = js.native
  var boneData: BoneData = js.native
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  var a: Double = js.native
  var attachmentName: String = js.native
}

@JSName("PIXI.Bone")
class Bone protected () extends js.Object {
  def this(boneData: BoneData, parent: js.Any = ???) = this()
  var data: BoneData = js.native
  var parent: js.Any = js.native
  var yDown: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
  var rotation: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var worldRotation: Double = js.native
  var worldScaleX: Double = js.native
  var worldScaleY: Double = js.native
  def updateWorldTransform(flipX: Boolean, flip: Boolean): Unit = js.native
  def setToSetupPose(): Unit = js.native
}

@JSName("PIXI.Slot")
class Slot protected () extends js.Object {
  def this(slotData: SlotData, skeleton: Skeleton, bone: Bone) = this()
  var data: SlotData = js.native
  var skeleton: Skeleton = js.native
  var bone: Bone = js.native
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  var a: Double = js.native
  var attachment: RegionAttachment = js.native
  def setAttachment(attachment: RegionAttachment): Unit = js.native
  def setAttachmentTime(time: Double): Unit = js.native
  def getAttachmentTime(): Double = js.native
  def setToSetupPose(): Unit = js.native
}

@JSName("PIXI.Skin")
class Skin protected () extends js.Object {
  def this(name: String) = this()
  var name: String = js.native
  var attachments: js.Any = js.native
  def addAttachment(slotIndex: Double, name: String, attachment: RegionAttachment): Unit = js.native
  def getAttachment(slotIndex: Double, name: String): Unit = js.native
}

@JSName("PIXI.Animation")
class Animation protected () extends js.Object {
  def this(name: String, timelines: js.Array[ISpineTimeline], duration: Double) = this()
  var name: String = js.native
  var timelines: js.Array[ISpineTimeline] = js.native
  var duration: Double = js.native
  @JSName("apply")
  def apply(skeleton: Skeleton, time: Double, loop: Boolean): Unit = js.native
  def min(skeleton: Skeleton, time: Double, loop: Boolean, alpha: Double): Unit = js.native
}

@JSName("PIXI.Curves")
class Curves protected () extends js.Object {
  def this(frameCount: Double) = this()
  var curves: js.Array[Double] = js.native
  def setLinear(frameIndex: Double): Unit = js.native
  def setStepped(frameIndex: Double): Unit = js.native
  def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  def getCurvePercent(frameIndex: Double, percent: Double): Double = js.native
}

trait ISpineTimeline extends js.Object {
  var curves: Curves = js.native
  var frames: js.Array[Double] = js.native
  def getFrameCount(): Double = js.native
  @JSName("apply")
  def apply(skeleton: Skeleton, time: Double, alpha: Double): Unit = js.native
}

@JSName("PIXI.RotateTimeline")
class RotateTimeline protected () extends ISpineTimeline {
  def this(frameCount: Double) = this()
  var boneIndex: Double = js.native
  override def getFrameCount(): Double = js.native
  def setFrame(frameIndex: Double, time: Double, angle: Double): Unit = js.native
  @JSName("apply")
  override def apply(skeleton: Skeleton, time: Double, alpha: Double): Unit = js.native
}

@JSName("PIXI.TranslateTimeline")
class TranslateTimeline protected () extends ISpineTimeline {
  def this(frameCount: Double) = this()
  override def getFrameCount(): Double = js.native
  def setFrame(frameIndex: Double, time: Double, x: Double, y: Double): Unit = js.native
  @JSName("apply")
  override def apply(skeleton: Skeleton, time: Double, alpha: Double): Unit = js.native
}

@JSName("PIXI.ScaleTimeline")
class ScaleTimeline protected () extends ISpineTimeline {
  def this(frameCount: Double) = this()
  var boneIndex: Double = js.native
  override def getFrameCount(): Double = js.native
  def setFrame(frameIndex: Double, time: Double, x: Double, y: Double): Unit = js.native
  @JSName("apply")
  override def apply(skeleton: Skeleton, time: Double, alpha: Double): Unit = js.native
}

@JSName("PIXI.ColorTimeline")
class ColorTimeline protected () extends ISpineTimeline {
  def this(frameCount: Double) = this()
  var boneIndex: Double = js.native
  override def getFrameCount(): Double = js.native
  def setFrame(frameIndex: Double, time: Double, r: Double, g: Double, b: Double, a: Double): Unit = js.native
  @JSName("apply")
  override def apply(skeleton: Skeleton, time: Double, alpha: Double): Unit = js.native
}

@JSName("PIXI.AttachmentTimeline")
class AttachmentTimeline protected () extends ISpineTimeline {
  def this(frameCount: Double) = this()
  var attachmentNames: js.Array[String] = js.native
  var slotIndex: Double = js.native
  override def getFrameCount(): Double = js.native
  def setFrame(frameIndex: Double, time: Double, attachmentName: String): Unit = js.native
  @JSName("apply")
  override def apply(skeleton: Skeleton, time: Double, alpha: Double): Unit = js.native
}

@JSName("PIXI.SkeletonData")
class SkeletonData extends js.Object {
  var bones: js.Array[Bone] = js.native
  var slots: js.Array[Slot] = js.native
  var skins: js.Array[Skin] = js.native
  var animations: js.Array[Animation] = js.native
  var defaultSkin: Skin = js.native
  def findBone(boneName: String): Bone = js.native
  def findBoneIndex(boneName: String): Double = js.native
  def findSlot(slotName: String): Slot = js.native
  def findSlotIndex(slotName: String): Double = js.native
  def findSkin(skinName: String): Skin = js.native
  def findAnimation(animationName: String): Animation = js.native
}

@JSName("PIXI.Skeleton")
class Skeleton protected () extends js.Object {
  def this(skeletonData: SkeletonData) = this()
  var data: SkeletonData = js.native
  var bones: js.Array[Bone] = js.native
  var slots: js.Array[Slot] = js.native
  var drawOrder: js.Array[js.Any] = js.native
  var x: Double = js.native
  var y: Double = js.native
  var skin: Skin = js.native
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  var a: Double = js.native
  var time: Double = js.native
  var flipX: Boolean = js.native
  var flipY: Boolean = js.native
  def updateWorldTransform(): Unit = js.native
  def setToSetupPose(): Unit = js.native
  def setBonesToSetupPose(): Unit = js.native
  def setSlotsToSetupPose(): Unit = js.native
  def getRootBone(): Bone = js.native
  def findBone(boneName: String): Bone = js.native
  def fineBoneIndex(boneName: String): Double = js.native
  def findSlot(slotName: String): Slot = js.native
  def findSlotIndex(slotName: String): Double = js.native
  def setSkinByName(skinName: String): Unit = js.native
  def setSkin(newSkin: Skin): Unit = js.native
  def getAttachmentBySlotName(slotName: String, attachmentName: String): RegionAttachment = js.native
  def getAttachmentBySlotIndex(slotIndex: Double, attachmentName: String): RegionAttachment = js.native
  def setAttachment(slotName: String, attachmentName: String): Unit = js.native
  def update(data: Double): Unit = js.native
}

@JSName("PIXI.RegionAttachment")
class RegionAttachment extends js.Object {
  var offset: js.Array[Double] = js.native
  var uvs: js.Array[Double] = js.native
  var x: Double = js.native
  var y: Double = js.native
  var rotation: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var rendererObject: js.Any = js.native
  var regionOffsetX: Double = js.native
  var regionOffsetY: Double = js.native
  var regionWidth: Double = js.native
  var regionHeight: Double = js.native
  var regionOriginalWidth: Double = js.native
  var regionOriginalHeight: Double = js.native
  def setUVs(u: Double, v: Double, u2: Double, v2: Double, rotate: Double): Unit = js.native
  def updateOffset(): Unit = js.native
  def computeVertices(x: Double, y: Double, bone: Bone, vertices: js.Array[Double]): Unit = js.native
}

@JSName("PIXI.AnimationStateData")
class AnimationStateData protected () extends js.Object {
  def this(skeletonData: SkeletonData) = this()
  var skeletonData: SkeletonData = js.native
  var animationToMixTime: js.Any = js.native
  var defaultMix: Double = js.native
  def setMixByName(fromName: String, toName: String, duration: Double): Unit = js.native
  def setMix(from: String, to: String): Double = js.native
}

@JSName("PIXI.AnimationState")
class AnimationState protected () extends js.Object {
  def this(stateData: js.Any) = this()
  var animationSpeed: Double = js.native
  var current: js.Any = js.native
  var previous: js.Any = js.native
  var currentTime: Double = js.native
  var previousTime: Double = js.native
  var currentLoop: Boolean = js.native
  var previousLoop: Boolean = js.native
  var mixTime: Double = js.native
  var mixDuration: Double = js.native
  var queue: js.Array[Animation] = js.native
  def update(delta: Double): Unit = js.native
  @JSName("apply")
  def apply(skeleton: js.Any): Unit = js.native
  def clearAnimation(): Unit = js.native
  def setAnimation(animation: js.Any, loop: Boolean): Unit = js.native
  def setAnimationByName(animationName: String, loop: Boolean): Unit = js.native
  def addAnimationByName(animationName: String, loop: Boolean, delay: Double): Unit = js.native
  def addAnimation(animation: js.Any, loop: Boolean, delay: Double): Unit = js.native
  def isComplete(): Double = js.native
}

@JSName("PIXI.SkeletonJson")
class SkeletonJson protected () extends js.Object {
  def this(attachmentLoader: AtlasAttachmentLoader) = this()
  var attachmentLoader: AtlasAttachmentLoader = js.native
  var scale: Double = js.native
  def readSkeletonData(root: js.Any): SkeletonData = js.native
  def readAttachment(skin: Skin, name: String, map: js.Any): RegionAttachment = js.native
  def readAnimation(name: String, map: js.Any, skeletonData: SkeletonData): Unit = js.native
  def readCurve(timeline: ISpineTimeline, frameIndex: Double, valueMap: js.Any): Unit = js.native
  def toColor(hexString: String, colorIndex: Double): Double = js.native
}

@JSName("PIXI.Atlas")
class Atlas protected () extends js.Object {
  def this(atlasText: String, textureLoader: AtlasLoader) = this()
  var textureLoader: AtlasLoader = js.native
  var pages: js.Array[AtlasPage] = js.native
  var regions: js.Array[AtlasRegion] = js.native
  def findRegion(name: String): AtlasRegion = js.native
  def dispose(): Unit = js.native
  def updateUVs(page: AtlasPage): Unit = js.native
}

@JSName("PIXI.Atlas")
object Atlas extends js.Object {
  var FORMAT: js.Any = js.native
  var TextureFilter: js.Any = js.native
  var textureWrap: js.Any = js.native
}

@JSName("PIXI.AtlasPage")
class AtlasPage extends js.Object {
  var name: String = js.native
  var format: Double = js.native
  var minFilter: Double = js.native
  var magFilter: Double = js.native
  var uWrap: Double = js.native
  var vWrap: Double = js.native
  var rendererObject: js.Any = js.native
  var width: Double = js.native
  var height: Double = js.native
}

@JSName("PIXI.AtlasRegion")
class AtlasRegion extends js.Object {
  var page: AtlasPage = js.native
  var name: String = js.native
  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var u: Double = js.native
  var v: Double = js.native
  var u2: Double = js.native
  var v2: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var originalWidth: Double = js.native
  var originalHeight: Double = js.native
  var index: Double = js.native
  var rotate: Boolean = js.native
  var splits: js.Array[js.Any] = js.native
  var pads: js.Array[js.Any] = js.native
}

@JSName("PIXI.AtlasReader")
class AtlasReader protected () extends js.Object {
  def this(text: String) = this()
  var lines: js.Array[String] = js.native
  var index: Double = js.native
  def trim(value: String): String = js.native
  def readLine(): String = js.native
  def readValue(): String = js.native
  def readTuple(tuple: Double): Double = js.native
}

@JSName("PIXI.AtlasAttachmentLoader")
class AtlasAttachmentLoader protected () extends js.Object {
  def this(atlas: Atlas) = this()
  var atlas: Atlas = js.native
  def newAttachment(skin: Skin, `type`: Double, name: String): RegionAttachment = js.native
}

@JSName("PIXI.Spine")
class Spine protected () extends DisplayObjectContainer {
  def this(url: String) = this()
  var autoUpdate: Boolean = js.native
  var spineData: js.Any = js.native
  var skeleton: Skeleton = js.native
  var stateData: AnimationStateData = js.native
  var state: AnimationState = js.native
  var slotContainers: js.Array[DisplayObjectContainer] = js.native
  def createSprite(slot: Slot, descriptor: js.Any): js.Array[Sprite] = js.native
  def update(dt: Double): Unit = js.native
}

@JSName("PIXI.PolyK")
object PolyK extends js.Object {
  def Triangulate(p: js.Array[Double]): js.Array[Double] = js.native
}

}


package object PIXI extends js.Object {
  var WEBGL_RENDERER: Double = js.native
  var CANVAS_RENDERER: Double = js.native
  var VERSION: String = js.native
  var defaultRenderOptions: PixiRendererOptions = js.native
  var INTERACTION_REQUENCY: Double = js.native
  var AUTO_PREVENT_DEFAULT: Boolean = js.native
  var PI_2: Double = js.native
  var RAD_TO_DEG: Double = js.native
  var DEG_TO_RAD: Double = js.native
  var RETINA_PREFIX: String = js.native
  var identityMatrix: Matrix = js.native
  var glContexts: js.Array[WebGLRenderingContext] = js.native
  var instances: js.Array[js.Any] = js.native
  def isPowerOfTwo(width: Double, height: Double): Boolean = js.native
  def rgb2hex(rgb: js.Array[Double]): String = js.native
  def hex2rgb(hex: String): js.Array[Double] = js.native
  def autoDetectRenderer(width: Double = ???, height: Double = ???, options: PixiRendererOptions = ???): PixiRenderer = js.native
  def autoDetectRecommendedRenderer(width: Double = ???, height: Double = ???, options: PixiRendererOptions = ???): PixiRenderer = js.native
  def canUseNewCanvasBlendModes(): Boolean = js.native
  def getNextPowerOfTwo(number: Double): Double = js.native
  def AjaxRequest(): XMLHttpRequest = js.native
  def CompileFragmentShader(gl: WebGLRenderingContext, shaderSrc: js.Array[String]): js.Dynamic = js.native
  def CompileProgram(gl: WebGLRenderingContext, vertexSrc: js.Array[String], fragmentSrc: js.Array[String]): js.Dynamic = js.native
}

}

package object importedjs extends js.GlobalScope {
  def requestAnimFrame(callback: js.Function): Unit = js.native
}
