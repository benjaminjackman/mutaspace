package biz.jackman.facades

import scala.scalajs.js
import scala.scalajs.js.|
import js.annotation._
import org.scalajs.dom.raw._
import scala.scalajs.js.typedarray._

package phaser {

@JSName("PIXI.PIXI")
@js.native
object PIXI extends js.Object {
  var WEBGL_RENDERER: Double = js.native
  var CANVAS_RENDERER: Double = js.native
  var VERSION: String = js.native

@js.native
sealed trait blendModes extends js.Object {
}

@JSName("PIXI.blendModes")
@js.native
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

@js.native
sealed trait scaleModes extends js.Object {
}

@JSName("PIXI.scaleModes")
@js.native
object scaleModes extends js.Object {
  var DEFAULT: scaleModes = js.native
  var LINEAR: scaleModes = js.native
  var NEAREST: scaleModes = js.native
  @JSBracketAccess
  def apply(value: scaleModes): String = js.native
}
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

@JSName("PIXI.BaseTextureCache")
@js.native
object BaseTextureCache extends js.Object {
  @JSBracketAccess
  def apply(key: String): BaseTexture = js.native
  @JSBracketAccess
  def update(key: String, v: BaseTexture): Unit = js.native
}

@JSName("PIXI.TextureCache")
@js.native
object TextureCache extends js.Object {
  @JSBracketAccess
  def apply(key: String): Texture = js.native
  @JSBracketAccess
  def update(key: String, v: Texture): Unit = js.native
}
  var TextureSilentFail: Boolean = js.native

@JSName("PIXI.BitmapText")
@js.native
object BitmapText extends js.Object {
}
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

@js.native
trait IEventCallback extends js.Object {
  def apply(e: IEvent = ???): Unit = js.native
}

@js.native
trait IEvent extends js.Object {
}

@js.native
trait HitArea extends js.Object {
  def contains(x: Double, y: Double): Boolean = js.native
}

@js.native
trait IInteractionDataCallback extends js.Object {
  def apply(interactionData: InteractionData): Unit = js.native
}

@js.native
trait PixiRenderer extends js.Object {
  def destroy(): Unit = js.native
  def render(stage: Stage): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
}

@js.native
trait PixiRendererOptions extends js.Object {
}

@js.native
trait BitmapTextStyle extends js.Object {
}

@js.native
trait TextStyle extends js.Object {
}

@js.native
trait Loader extends js.Object {
  def load(): Unit = js.native
}

@js.native
trait MaskData extends js.Object {
}

@js.native
trait RenderSession extends js.Object {
}

@js.native
trait ShaderAttribute extends js.Object {
}

@js.native
trait FilterBlock extends js.Object {
}

@JSName("PIXI.AbstractFilter")
@js.native
class AbstractFilter protected () extends js.Object {
  def this(fragmentSrc: js.Any, uniforms: js.Any) = this()
  @JSName("apply")
  def apply(frameBuffer: WebGLFramebuffer): Unit = js.native
  def syncUniforms(): Unit = js.native
}

@JSName("PIXI.AlphaMaskFilter")
@js.native
class AlphaMaskFilter protected () extends AbstractFilter {
  def this(texture: Texture) = this()
  def onTextureLoaded(): Unit = js.native
}

@JSName("PIXI.AsciiFilter")
@js.native
class AsciiFilter extends AbstractFilter {
}

@JSName("PIXI.AssetLoader")
@js.native
class AssetLoader protected () extends Mixin {
  def this(assetURLs: js.Array[String], crossorigin: Boolean) = this()
  def load(): Unit = js.native
}

@JSName("PIXI.AtlasLoader")
@js.native
class AtlasLoader protected () extends Mixin {
  def this(url: String, crossorigin: Boolean) = this()
  def load(): Unit = js.native
}

@JSName("PIXI.BaseTexture")
@js.native
class BaseTexture protected () extends Mixin {
  def this(source: HTMLImageElement, scaleMode: scaleModes) = this()
  def forceLoaded(width: Double, height: Double): Unit = js.native
  def destroy(): Unit = js.native
  def dirty(): Unit = js.native
  def updateSourceImage(newSrc: String): Unit = js.native
  def unloadFromGPU(): Unit = js.native
}

@JSName("PIXI.BaseTexture")
@js.native
object BaseTexture extends js.Object {
  def fromImage(imageUrl: String, crossorigin: Boolean = ???, scaleMode: scaleModes = ???): BaseTexture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: scaleModes = ???): BaseTexture = js.native
}

@JSName("PIXI.BitmapFontLoader")
@js.native
class BitmapFontLoader protected () extends Mixin {
  def this(url: String, crossorigin: Boolean) = this()
  def load(): Unit = js.native
}

@JSName("PIXI.BlurFilter")
@js.native
class BlurFilter extends AbstractFilter {
}

@JSName("PIXI.BlurXFilter")
@js.native
class BlurXFilter extends AbstractFilter {
}

@JSName("PIXI.BlurYFilter")
@js.native
class BlurYFilter extends AbstractFilter {
}

@JSName("PIXI.CanvasBuffer")
@js.native
class CanvasBuffer protected () extends js.Object {
  def this(width: Double, height: Double) = this()
  def clear(): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
}

@JSName("PIXI.CanvasMaskManager")
@js.native
class CanvasMaskManager extends js.Object {
  def pushMask(maskData: MaskData, renderSession: RenderSession): Unit = js.native
  def popMask(renderSession: RenderSession): Unit = js.native
}

@JSName("PIXI.CanvasRenderer")
@js.native
class CanvasRenderer protected () extends PixiRenderer {
  def this(width: Double = ???, height: Double = ???, options: PixiRendererOptions = ???) = this()
}

@JSName("PIXI.CanvasTinter")
@js.native
class CanvasTinter extends js.Object {
}

@JSName("PIXI.CanvasTinter")
@js.native
object CanvasTinter extends js.Object {
  def getTintedTexture(sprite: Sprite, color: Double): HTMLCanvasElement = js.native
  def tintWithMultiply(texture: Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  def tintWithOverlay(texture: Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  def tintWithPerPixel(texture: Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  var canUseMultiply: Boolean = js.native
  var tintMethod: js.Any = js.native
}

@JSName("PIXI.Circle")
@js.native
class Circle protected () extends HitArea {
  def this(x: Double, y: Double, radius: Double) = this()
  def getBounds(): Rectangle = js.native
}

@JSName("PIXI.ColorMatrixFilter")
@js.native
class ColorMatrixFilter extends AbstractFilter {
}

@JSName("PIXI.ColorStepFilter")
@js.native
class ColorStepFilter extends AbstractFilter {
}

@JSName("PIXI.ConvolutionFilter")
@js.native
class ConvolutionFilter protected () extends AbstractFilter {
  def this(matrix: js.Array[Double], width: Double, height: Double) = this()
}

@JSName("PIXI.CrossHatchFilter")
@js.native
class CrossHatchFilter extends AbstractFilter {
}

@JSName("PIXI.DisplacementFilter")
@js.native
class DisplacementFilter protected () extends AbstractFilter {
  def this(texture: Texture) = this()
}

@JSName("PIXI.DotScreenFilter")
@js.native
class DotScreenFilter extends AbstractFilter {
}

@JSName("PIXI.DisplayObject")
@js.native
class DisplayObject extends js.Object {
  def click(e: InteractionData): Unit = js.native
  def displayObjectUpdateTransform(): Unit = js.native
  def getBounds(matrix: Matrix = ???): Rectangle = js.native
  def getLocalBounds(): Rectangle = js.native
  def generateTexture(resolution: Double = ???, scaleMode: Double = ???, renderer: PixiRenderer = ???): Texture = js.native
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
  def updateTransform(parent: PIXI.DisplayObjectContainer = ???): Unit = js.native
}

@JSName("PIXI.DisplayObjectContainer")
@js.native
class DisplayObjectContainer extends DisplayObject {
  def addChild(child: DisplayObject): DisplayObject = js.native
  def addChildAt(child: DisplayObject, index: Double): DisplayObject = js.native
  def getChildAt(index: Double): DisplayObject = js.native
  def getChildIndex(child: DisplayObject): Double = js.native
  def removeChild(child: DisplayObject): DisplayObject = js.native
  def removeChildAt(index: Double): DisplayObject = js.native
  def removeChildren(beginIndex: Double = ???, endIndex: Double = ???): js.Array[DisplayObject] = js.native
  def removeStageReference(): Unit = js.native
  def setChildIndex(child: DisplayObject, index: Double): Unit = js.native
  def swapChildren(child: DisplayObject, child2: DisplayObject): Unit = js.native
}

@JSName("PIXI.Ellipse")
@js.native
class Ellipse protected () extends HitArea {
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def getBounds(): Rectangle = js.native
}

@JSName("PIXI.Event")
@js.native
class Event protected () extends js.Object {
  def this(target: js.Any, name: String, data: js.Any) = this()
  def stopPropagation(): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
}

@JSName("PIXI.EventTarget")
@js.native
class EventTarget extends js.Object {
}

@JSName("PIXI.EventTarget")
@js.native
object EventTarget extends js.Object {
  def mixin(obj: js.Any): Unit = js.native
}

@JSName("PIXI.FilterTexture")
@js.native
class FilterTexture protected () extends js.Object {
  def this(gl: WebGLRenderingContext, width: Double, height: Double, scaleMode: scaleModes) = this()
  def clear(): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def destroy(): Unit = js.native
}

@JSName("PIXI.GraphicsData")
@js.native
class GraphicsData protected () extends js.Object {
  def this(lineWidth: Double = ???, lineColor: Double = ???, lineAlpha: Double = ???, fillColor: Double = ???, fillAlpha: Double = ???, fill: Boolean = ???, shape: js.Any = ???) = this()
}

@JSName("PIXI.Graphics")
@js.native
class Graphics extends DisplayObjectContainer {
  def arc(cx: Double, cy: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Graphics = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Graphics = js.native
  def beginFill(color: Double = ???, alpha: Double = ???): Graphics = js.native
  def bezierCurveTo(cpX: Double, cpY: Double, cpX2: Double, cpY2: Double, toX: Double, toY: Double): Graphics = js.native
  def clear(): Graphics = js.native
  def destroyCachedSprite(): Unit = js.native
  def drawCircle(x: Double, y: Double, diameter: Double): Graphics = js.native
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
@js.native
object Graphics extends js.Object {
  var POLY: Double = js.native
  var RECT: Double = js.native
  var CIRC: Double = js.native
  var ELIP: Double = js.native
  var RREC: Double = js.native
}

@JSName("PIXI.GrayFilter")
@js.native
class GrayFilter extends AbstractFilter {
}

@JSName("PIXI.ImageLoader")
@js.native
class ImageLoader protected () extends Mixin {
  def this(url: String, crossorigin: Boolean = ???) = this()
  def load(): Unit = js.native
  def loadFramedSpriteSheet(frameWidth: Double, frameHeight: Double, textureName: String): Unit = js.native
}

@JSName("PIXI.InteractionData")
@js.native
class InteractionData extends js.Object {
  def getLocalPosition(displayObject: DisplayObject, point: Point = ???, globalPos: Point = ???): Point = js.native
}

@JSName("PIXI.InteractionManager")
@js.native
class InteractionManager protected () extends js.Object {
  def this(stage: Stage) = this()
}

@JSName("PIXI.InvertFilter")
@js.native
class InvertFilter extends AbstractFilter {
}

@JSName("PIXI.JsonLoader")
@js.native
class JsonLoader protected () extends Mixin {
  def this(url: String, crossorigin: Boolean = ???) = this()
  def load(): Unit = js.native
}

@JSName("PIXI.Matrix")
@js.native
class Matrix extends js.Object {
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

@js.native
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
@js.native
class MovieClip protected () extends Sprite {
  def this(textures: js.Array[Texture]) = this()
  def gotoAndPlay(frameNumber: Double): Unit = js.native
  def gotoAndStop(frameNumber: Double): Unit = js.native
  def onComplete(): Unit = js.native
  def play(): Unit = js.native
  def stop(): Unit = js.native
}

@JSName("PIXI.MovieClip")
@js.native
object MovieClip extends js.Object {
  def fromFrames(frames: js.Array[String]): MovieClip = js.native
  def fromImages(images: js.Array[HTMLImageElement]): HTMLImageElement = js.native
}

@JSName("PIXI.NoiseFilter")
@js.native
class NoiseFilter extends AbstractFilter {
}

@JSName("PIXI.NormalMapFilter")
@js.native
class NormalMapFilter extends AbstractFilter {
}

@JSName("PIXI.PixelateFilter")
@js.native
class PixelateFilter extends AbstractFilter {
}

@js.native
trait IPixiShader extends js.Object {
  def destroy(): Unit = js.native
  def init(): Unit = js.native
}

@JSName("PIXI.PixiShader")
@js.native
class PixiShader protected () extends IPixiShader {
  def this(gl: WebGLRenderingContext) = this()
  def initSampler2D(): Unit = js.native
  def initUniforms(): Unit = js.native
  def syncUniforms(): Unit = js.native
}

@JSName("PIXI.PixiFastShader")
@js.native
class PixiFastShader protected () extends IPixiShader {
  def this(gl: WebGLRenderingContext) = this()
}

@JSName("PIXI.PrimitiveShader")
@js.native
class PrimitiveShader protected () extends IPixiShader {
  def this(gl: WebGLRenderingContext) = this()
}

@JSName("PIXI.ComplexPrimitiveShader")
@js.native
class ComplexPrimitiveShader protected () extends IPixiShader {
  def this(gl: WebGLRenderingContext) = this()
}

@JSName("PIXI.StripShader")
@js.native
class StripShader protected () extends IPixiShader {
  def this(gl: WebGLRenderingContext) = this()
}

@JSName("PIXI.Point")
@js.native
class Point protected () extends js.Object {
  def this(x: Double = ???, y: Double = ???) = this()
  def set(x: Double, y: Double): Unit = js.native
}

@JSName("PIXI.Polygon")
@js.native
class Polygon protected () extends HitArea {
  def this(points: js.Array[Point]) = this()
}

@JSName("PIXI.Rectangle")
@js.native
class Rectangle protected () extends HitArea {
  def this(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???) = this()
}

@JSName("PIXI.RGBSplitFilter")
@js.native
class RGBSplitFilter extends AbstractFilter {
}

@JSName("PIXI.Rope")
@js.native
class Rope protected () extends Strip {
  def this(texture: Texture, points: js.Array[Point]) = this()
  def refresh(): Unit = js.native
  def setTexture(texture: Texture): Unit = js.native
}

@JSName("PIXI.RoundedRectangle")
@js.native
class RoundedRectangle protected () extends HitArea {
  def this(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???, radius: Double = ???) = this()
}

@JSName("PIXI.SepiaFilter")
@js.native
class SepiaFilter extends AbstractFilter {
}

@JSName("PIXI.SmartBlurFilter")
@js.native
class SmartBlurFilter extends AbstractFilter {
}

@JSName("PIXI.SpineLoader")
@js.native
class SpineLoader protected () extends Mixin {
  def this(url: String, crossOrigin: Boolean) = this()
  def load(): Unit = js.native
}

@JSName("PIXI.SpineTextureLoader")
@js.native
class SpineTextureLoader protected () extends js.Object {
  def this(basePath: String, crossorigin: Boolean) = this()
  def load(page: AtlasPage, file: String): Unit = js.native
  def unload(texture: BaseTexture): Unit = js.native
}

@JSName("PIXI.Sprite")
@js.native
class Sprite protected () extends DisplayObjectContainer {
  def this(texture: Texture) = this()
  def setTexture(texture: Texture): Unit = js.native
}

@JSName("PIXI.Sprite")
@js.native
object Sprite extends js.Object {
  def fromFrame(frameId: String): Sprite = js.native
  def fromImage(url: String, crossorigin: Boolean = ???, scaleMode: scaleModes = ???): Sprite = js.native
}

@JSName("PIXI.SpriteBatch")
@js.native
class SpriteBatch protected () extends DisplayObjectContainer {
  def this(texture: Texture = ???) = this()
  def initWebGL(gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.SpriteSheetLoader")
@js.native
class SpriteSheetLoader protected () extends Mixin {
  def this(url: String, crossorigin: Boolean = ???) = this()
  def load(): Unit = js.native
}

@JSName("PIXI.Stage")
@js.native
class Stage protected () extends DisplayObjectContainer {
  def this(backgroundColor: Double) = this()
  def getMousePosition(): Point = js.native
  def setBackgroundColor(backgroundColor: Double): Unit = js.native
  def setInteractionDelegate(domElement: HTMLElement): Unit = js.native
}

@JSName("PIXI.Strip")
@js.native
class Strip protected () extends DisplayObjectContainer {
  def this(texture: Texture) = this()
}

@JSName("PIXI.Strip")
@js.native
object Strip extends js.Object {
  var DrawModes: js.Any = js.native
}

@JSName("PIXI.Texture")
@js.native
class Texture protected () extends Mixin {
  def this(baseTexture: BaseTexture, frame: Rectangle = ???, crop: Rectangle = ???, trim: Rectangle = ???) = this()
  def destroy(destroyBase: Boolean): Unit = js.native
  def setFrame(frame: Rectangle): Unit = js.native
}

@JSName("PIXI.Texture")
@js.native
object Texture extends js.Object {
  var emptyTexture: Texture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: scaleModes = ???): Texture = js.native
  def fromFrame(frameId: String): Texture = js.native
  def fromImage(imageUrl: String, crossorigin: Boolean = ???, scaleMode: scaleModes = ???): Texture = js.native
  def addTextureToCache(texture: Texture, id: String): Unit = js.native
  def removeTextureFromCache(id: String): Texture = js.native
}

@JSName("PIXI.TilingSprite")
@js.native
class TilingSprite protected () extends Sprite {
  def this(texture: Texture, width: Double, height: Double) = this()
  def destroy(): Unit = js.native
  def generateTilingTexture(forcePowerOfTwo: Boolean = ???): Unit = js.native
}

@JSName("PIXI.TiltShiftFilter")
@js.native
class TiltShiftFilter extends AbstractFilter {
}

@JSName("PIXI.TiltShiftXFilter")
@js.native
class TiltShiftXFilter extends AbstractFilter {
  def updateDelta(): Unit = js.native
}

@JSName("PIXI.TiltShiftYFilter")
@js.native
class TiltShiftYFilter extends AbstractFilter {
  def updateDelta(): Unit = js.native
}

@JSName("PIXI.TwistFilter")
@js.native
class TwistFilter extends AbstractFilter {
}

@JSName("PIXI.VideoTexture")
@js.native
class VideoTexture extends BaseTexture {
  def changeSource(src: String, `type`: String, loop: Boolean): Unit = js.native
  def play(): Unit = js.native
  def stop(): Unit = js.native
  def updateBound(): Unit = js.native
}

@JSName("PIXI.VideoTexture")
@js.native
object VideoTexture extends js.Object {
  def baseTextureFromVideo(video: HTMLVideoElement, scaleMode: Double): BaseTexture = js.native
  def textureFromVideo(video: HTMLVideoElement, scaleMode: Double): Texture = js.native
  def fromUrl(videoSrc: String, scaleMode: Double = ???, autoPlay: Boolean = ???, `type`: String = ???, loop: Boolean = ???): Texture = js.native
}

@JSName("PIXI.WebGLBlendModeManager")
@js.native
class WebGLBlendModeManager extends js.Object {
  def destroy(): Unit = js.native
  def setBlendMode(blendMode: Double): Boolean = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.WebGLFastSpriteBatch")
@js.native
class WebGLFastSpriteBatch protected () extends js.Object {
  def this(gl: CanvasRenderingContext2D) = this()
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
@js.native
class WebGLFilterManager extends js.Object {
  def applyFilterPass(filter: AbstractFilter, filterArea: Texture, width: Double, height: Double): Unit = js.native
  def begin(renderSession: RenderSession, buffer: ArrayBuffer): Unit = js.native
  def destroy(): Unit = js.native
  def initShaderBuffers(): Unit = js.native
  def popFilter(): Unit = js.native
  def pushFilter(filterBlock: FilterBlock): Unit = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.WebGLGraphics")
@js.native
class WebGLGraphics extends js.Object {
  def reset(): Unit = js.native
  def upload(): Unit = js.native
}

@JSName("PIXI.WebGLGraphics")
@js.native
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
@js.native
class WebGLGraphicsData protected () extends js.Object {
  def this(gl: WebGLRenderingContext) = this()
  def reset(): Unit = js.native
  def upload(): Unit = js.native
}

@JSName("PIXI.WebGLMaskManager")
@js.native
class WebGLMaskManager extends js.Object {
  def destroy(): Unit = js.native
  def popMask(renderSession: RenderSession): Unit = js.native
  def pushMask(maskData: js.Array[js.Any], renderSession: RenderSession): Unit = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.WebGLRenderer")
@js.native
class WebGLRenderer protected () extends PixiRenderer {
  def this(width: Double = ???, height: Double = ???, options: PixiRendererOptions = ???) = this()
  def initContext(): Unit = js.native
  def mapBlendModes(): Unit = js.native
  def renderDisplayObject(displayObject: DisplayObject, projection: Point, buffer: WebGLBuffer): Unit = js.native
  def updateTexture(texture: Texture): Unit = js.native
}

@JSName("PIXI.WebGLRenderer")
@js.native
object WebGLRenderer extends js.Object {
  def createWebGLTexture(texture: Texture, gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.WebGLShaderManager")
@js.native
class WebGLShaderManager extends js.Object {
  def destroy(): Unit = js.native
  def setAttribs(attribs: js.Array[ShaderAttribute]): Unit = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
  def setShader(shader: IPixiShader): Boolean = js.native
}

@JSName("PIXI.WebGLStencilManager")
@js.native
class WebGLStencilManager extends js.Object {
  def bindGraphics(graphics: Graphics, webGLData: js.Array[js.Any], renderSession: RenderSession): Unit = js.native
  def destroy(): Unit = js.native
  def popStencil(graphics: Graphics, webGLData: js.Array[js.Any], renderSession: RenderSession): Unit = js.native
  def pushStencil(graphics: Graphics, webGLData: js.Array[js.Any], renderSession: RenderSession): Unit = js.native
  def setContext(gl: WebGLRenderingContext): Unit = js.native
}

@JSName("PIXI.WebGLSpriteBatch")
@js.native
class WebGLSpriteBatch extends js.Object {
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
@js.native
class RenderTexture protected () extends Texture {
  def this(width: Double = ???, height: Double = ???, renderer: PixiRenderer = ???, scaleMode: scaleModes = ???, resolution: Double = ???) = this()
  def clear(): Unit = js.native
  def getBase64(): String = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def getImage(): HTMLImageElement = js.native
  def resize(width: Double, height: Double, updateBase: Boolean): Unit = js.native
  def render(displayObject: DisplayObject, matrix: Matrix = ???, clear: Boolean = ???): Unit = js.native
}

@JSName("PIXI.BoneData")
@js.native
class BoneData protected () extends js.Object {
  def this(name: String, parent: js.Any = ???) = this()
}

@JSName("PIXI.SlotData")
@js.native
class SlotData protected () extends js.Object {
  def this(name: String, boneData: BoneData) = this()
}

@JSName("PIXI.Bone")
@js.native
class Bone protected () extends js.Object {
  def this(boneData: BoneData, parent: js.Any = ???) = this()
  def updateWorldTransform(flipX: Boolean, flip: Boolean): Unit = js.native
  def setToSetupPose(): Unit = js.native
}

@JSName("PIXI.Slot")
@js.native
class Slot protected () extends js.Object {
  def this(slotData: SlotData, skeleton: Skeleton, bone: Bone) = this()
  def setAttachment(attachment: RegionAttachment): Unit = js.native
  def setAttachmentTime(time: Double): Unit = js.native
  def getAttachmentTime(): Double = js.native
  def setToSetupPose(): Unit = js.native
}

@JSName("PIXI.Skin")
@js.native
class Skin protected () extends js.Object {
  def this(name: String) = this()
  def addAttachment(slotIndex: Double, name: String, attachment: RegionAttachment): Unit = js.native
  def getAttachment(slotIndex: Double, name: String): Unit = js.native
}

@JSName("PIXI.Animation")
@js.native
class Animation protected () extends js.Object {
  def this(name: String, timelines: js.Array[ISpineTimeline], duration: Double) = this()
  @JSName("apply")
  def apply(skeleton: Skeleton, time: Double, loop: Boolean): Unit = js.native
  def min(skeleton: Skeleton, time: Double, loop: Boolean, alpha: Double): Unit = js.native
}

@JSName("PIXI.Curves")
@js.native
class Curves protected () extends js.Object {
  def this(frameCount: Double) = this()
  def setLinear(frameIndex: Double): Unit = js.native
  def setStepped(frameIndex: Double): Unit = js.native
  def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  def getCurvePercent(frameIndex: Double, percent: Double): Double = js.native
}

@js.native
trait ISpineTimeline extends js.Object {
  def getFrameCount(): Double = js.native
  @JSName("apply")
  def apply(skeleton: Skeleton, time: Double, alpha: Double): Unit = js.native
}

@JSName("PIXI.RotateTimeline")
@js.native
class RotateTimeline protected () extends ISpineTimeline {
  def this(frameCount: Double) = this()
  def setFrame(frameIndex: Double, time: Double, angle: Double): Unit = js.native
}

@JSName("PIXI.TranslateTimeline")
@js.native
class TranslateTimeline protected () extends ISpineTimeline {
  def this(frameCount: Double) = this()
  def setFrame(frameIndex: Double, time: Double, x: Double, y: Double): Unit = js.native
}

@JSName("PIXI.ScaleTimeline")
@js.native
class ScaleTimeline protected () extends ISpineTimeline {
  def this(frameCount: Double) = this()
  def setFrame(frameIndex: Double, time: Double, x: Double, y: Double): Unit = js.native
}

@JSName("PIXI.ColorTimeline")
@js.native
class ColorTimeline protected () extends ISpineTimeline {
  def this(frameCount: Double) = this()
  def setFrame(frameIndex: Double, time: Double, r: Double, g: Double, b: Double, a: Double): Unit = js.native
}

@JSName("PIXI.AttachmentTimeline")
@js.native
class AttachmentTimeline protected () extends ISpineTimeline {
  def this(frameCount: Double) = this()
  def setFrame(frameIndex: Double, time: Double, attachmentName: String): Unit = js.native
}

@JSName("PIXI.SkeletonData")
@js.native
class SkeletonData extends js.Object {
  def findBone(boneName: String): Bone = js.native
  def findBoneIndex(boneName: String): Double = js.native
  def findSlot(slotName: String): Slot = js.native
  def findSlotIndex(slotName: String): Double = js.native
  def findSkin(skinName: String): Skin = js.native
  def findAnimation(animationName: String): Animation = js.native
}

@JSName("PIXI.Skeleton")
@js.native
class Skeleton protected () extends js.Object {
  def this(skeletonData: SkeletonData) = this()
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
@js.native
class RegionAttachment extends js.Object {
  def setUVs(u: Double, v: Double, u2: Double, v2: Double, rotate: Double): Unit = js.native
  def updateOffset(): Unit = js.native
  def computeVertices(x: Double, y: Double, bone: Bone, vertices: js.Array[Double]): Unit = js.native
}

@JSName("PIXI.AnimationStateData")
@js.native
class AnimationStateData protected () extends js.Object {
  def this(skeletonData: SkeletonData) = this()
  def setMixByName(fromName: String, toName: String, duration: Double): Unit = js.native
  def setMix(from: String, to: String): Double = js.native
}

@JSName("PIXI.AnimationState")
@js.native
class AnimationState protected () extends js.Object {
  def this(stateData: js.Any) = this()
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
@js.native
class SkeletonJson protected () extends js.Object {
  def this(attachmentLoader: AtlasAttachmentLoader) = this()
  def readSkeletonData(root: js.Any): SkeletonData = js.native
  def readAttachment(skin: Skin, name: String, map: js.Any): RegionAttachment = js.native
  def readAnimation(name: String, map: js.Any, skeletonData: SkeletonData): Unit = js.native
  def readCurve(timeline: ISpineTimeline, frameIndex: Double, valueMap: js.Any): Unit = js.native
  def toColor(hexString: String, colorIndex: Double): Double = js.native
}

@JSName("PIXI.Atlas")
@js.native
class Atlas protected () extends js.Object {
  def this(atlasText: String, textureLoader: AtlasLoader) = this()
  def findRegion(name: String): AtlasRegion = js.native
  def dispose(): Unit = js.native
  def updateUVs(page: AtlasPage): Unit = js.native
}

@JSName("PIXI.Atlas")
@js.native
object Atlas extends js.Object {
  var FORMAT: js.Any = js.native
  var TextureFilter: js.Any = js.native
  var textureWrap: js.Any = js.native
}

@JSName("PIXI.AtlasPage")
@js.native
class AtlasPage extends js.Object {
}

@JSName("PIXI.AtlasRegion")
@js.native
class AtlasRegion extends js.Object {
}

@JSName("PIXI.AtlasReader")
@js.native
class AtlasReader protected () extends js.Object {
  def this(text: String) = this()
  def trim(value: String): String = js.native
  def readLine(): String = js.native
  def readValue(): String = js.native
  def readTuple(tuple: Double): Double = js.native
}

@JSName("PIXI.AtlasAttachmentLoader")
@js.native
class AtlasAttachmentLoader protected () extends js.Object {
  def this(atlas: Atlas) = this()
  def newAttachment(skin: Skin, `type`: Double, name: String): RegionAttachment = js.native
}

@JSName("PIXI.Spine")
@js.native
class Spine protected () extends DisplayObjectContainer {
  def this(url: String) = this()
  def createSprite(slot: Slot, descriptor: js.Any): js.Array[Sprite] = js.native
  def update(dt: Double): Unit = js.native
}

@JSName("PIXI.PolyK.PolyK")
@js.native
object PolyK extends js.Object {
  def Triangulate(p: js.Array[Double]): js.Array[Double] = js.native
}
}

}

package object phaser extends js.GlobalScope {
  def requestAnimFrame(callback: js.Function): Unit = js.native
}
