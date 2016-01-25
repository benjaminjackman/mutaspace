package biz.jackman.facades

import scala.scalajs.js
import js.annotation._
import js.|
import org.scalajs.dom.raw._
import scala.scalajs.js.typedarray._

package phaser {

@js.native
class Phaser extends js.Object {
}

@JSName("Phaser")
@js.native
object Phaser extends js.Object {
  var VERSION: String = js.native
  var DEV_VERSION: String = js.native
  var GAMES: js.Array[Phaser.Game] = js.native
  var AUTO: Double = js.native
  var CANVAS: Double = js.native
  var WEBGL: Double = js.native
  var HEADLESS: Double = js.native
  var BITMAPDATA: Double = js.native
  var BITMAPTEXT: Double = js.native
  var BUTTON: Double = js.native
  var CANVAS_FILTER: Double = js.native
  var CIRCLE: Double = js.native
  var ELLIPSE: Double = js.native
  var EMITTER: Double = js.native
  var GRAPHICS: Double = js.native
  var GROUP: Double = js.native
  var IMAGE: Double = js.native
  var LINE: Double = js.native
  var MATRIX: Double = js.native
  var POINT: Double = js.native
  var POINTER: Double = js.native
  var POLYGON: Double = js.native
  var RECTANGLE: Double = js.native
  var ROUNDEDRECTANGLE: Double = js.native
  var RENDERTEXTURE: Double = js.native
  var RETROFONT: Double = js.native
  var SPRITE: Double = js.native
  var SPRITEBATCH: Double = js.native
  var TEXT: Double = js.native
  var TILEMAP: Double = js.native
  var TILEMAPLAYER: Double = js.native
  var TILESPRITE: Double = js.native
  var WEBGL_FILTER: Double = js.native
  var ROPE: Double = js.native
  var CREATURE: Double = js.native
  var VIDEO: Double = js.native
  var NONE: Double = js.native
  var LEFT: Double = js.native
  var RIGHT: Double = js.native
  var UP: Double = js.native
  var DOWN: Double = js.native

@js.native
@JSName("Phaser.Animation")
class Animation protected () extends js.Object {
  def this(game: Phaser.Game, parent: Phaser.Sprite, name: String, frameData: Phaser.FrameData, frames: js.Array[Double] | js.Array[String], frameRate: Double = ???, loop: Boolean = ???) = this()
  var currentFrame: Phaser.Frame = js.native
  var delay: Double = js.native
  var enableUpdate: Boolean = js.native
  var frame: Double = js.native
  var frameTotal: Double = js.native
  var game: Phaser.Game = js.native
  var isFinished: Boolean = js.native
  var isPaused: Boolean = js.native
  var isPlaying: Boolean = js.native
  var killOnComplete: Boolean = js.native
  var loop: Boolean = js.native
  var loopCount: Double = js.native
  var name: String = js.native
  var onComplete: Phaser.Signal = js.native
  var onLoop: Phaser.Signal = js.native
  var onStart: Phaser.Signal = js.native
  var onUpdate: Phaser.Signal = js.native
  var paused: Boolean = js.native
  var speed: Double = js.native
  def complete(): Unit = js.native
  def destroy(): Unit = js.native
  def next(quantity: Double = ???): Unit = js.native
  def onPause(): Unit = js.native
  def onResume(): Unit = js.native
  def play(frameRate: Double = ???, loop: Boolean = ???, killOnComplete: Boolean = ???): Phaser.Animation = js.native
  def previous(quantity: Double = ???): Unit = js.native
  def restart(): Unit = js.native
  def setFrame(frameId: String | Double = ???, useLocalFrameIndex: Boolean = ???): Unit = js.native
  def stop(resetFrame: Boolean = ???, dispatchComplete: Boolean = ???): Unit = js.native
  def update(): Boolean = js.native
  def updateCurrentFrame(signalUpdate: Boolean, fromPlay: Boolean = ???): Boolean = js.native
  def updateFrameData(frameData: FrameData): Unit = js.native
}

@JSName("Phaser.Animation")
@js.native
object Animation extends js.Object {
  def generateFrameNames(prefix: String, start: Double, stop: Double, suffix: String = ???, zeroPad: Double = ???): js.Array[String] = js.native
}

@js.native
@JSName("Phaser.AnimationManager")
class AnimationManager protected () extends js.Object {
  def this(sprite: Phaser.Sprite) = this()
  var currentAnim: Phaser.Animation = js.native
  var currentFrame: Phaser.Frame = js.native
  var frame: Double = js.native
  var frameData: Phaser.FrameData = js.native
  var frameName: String = js.native
  var frameTotal: Double = js.native
  var game: Phaser.Game = js.native
  var isLoaded: Boolean = js.native
  var name: String = js.native
  var paused: Boolean = js.native
  var sprite: Phaser.Sprite = js.native
  var updateIfVisible: Boolean = js.native
  def add(name: String, frames: js.Array[Double] | js.Array[String] = ???, frameRate: Double = ???, loop: Boolean = ???, useNumericIndex: Boolean = ???): Phaser.Animation = js.native
  def copyFrameData(frameData: Phaser.FrameData, frame: String | Double): Boolean = js.native
  def destroy(): Unit = js.native
  def getAnimation(name: String): Phaser.Animation = js.native
  def next(quantity: Double = ???): Unit = js.native
  def play(name: String, frameRate: Double = ???, loop: Boolean = ???, killOnComplete: Boolean = ???): Phaser.Animation = js.native
  def previous(quantity: Double = ???): Unit = js.native
  def refreshFrame(): Unit = js.native
  def stop(name: String = ???, resetFrame: Boolean = ???): Unit = js.native
  def update(): Boolean = js.native
  def validateFrames(frames: js.Array[Phaser.Frame], useNumericIndex: Boolean = ???): Boolean = js.native
}

@js.native
@JSName("Phaser.AnimationParser")
class AnimationParser extends js.Object {
}

@JSName("Phaser.AnimationParser")
@js.native
object AnimationParser extends js.Object {
  def JSONData(game: Phaser.Game, json: js.Any): Phaser.FrameData = js.native
  def JSONDataHash(game: Phaser.Game, json: js.Any): Phaser.FrameData = js.native
  def spriteSheet(game: Phaser.Game, key: String, frameWidth: Double, frameHeight: Double, frameMax: Double = ???, margin: Double = ???, spacing: Double = ???): Phaser.FrameData = js.native
  def XMLData(game: Phaser.Game, xml: js.Any): Phaser.FrameData = js.native
}

@js.native
@JSName("Phaser.AudioSprite")
class AudioSprite protected () extends js.Object {
  def this(game: Phaser.Game, key: String) = this()
  var game: Phaser.Game = js.native
  var key: String = js.native
  var config: js.Any = js.native
  var autoplayKey: String = js.native
  var autoplay: Boolean = js.native
  var sounds: js.Any = js.native
  def get(marker: String): Phaser.Sound = js.native
  def play(marker: String, volume: Double = ???): Phaser.Sound = js.native
  def stop(marker: String): Phaser.Sound = js.native
}

@js.native
@JSName("Phaser.ArraySet")
class ArraySet protected () extends js.Object {
  def this(list: js.Array[js.Any]) = this()
  var position: Double = js.native
  var list: js.Array[js.Any] = js.native
  var total: Double = js.native
  var first: js.Any = js.native
  var next: js.Any = js.native
  def add(item: js.Any): js.Dynamic = js.native
  def getByKey(property: String, value: js.Any): js.Dynamic = js.native
  def getIndex(item: js.Any): Double = js.native
  def exists(item: js.Any): Boolean = js.native
  def reset(): Unit = js.native
  def remove(item: js.Any): js.Dynamic = js.native
  def removeAll(destoy: Boolean = ???): Unit = js.native
  def setAll(key: js.Any, value: js.Any): Unit = js.native
  def callAll(key: String, parameter: js.Any*): Unit = js.native
}

@js.native
@JSName("Phaser.ArrayUtils")
class ArrayUtils extends js.Object {
}

@JSName("Phaser.ArrayUtils")
@js.native
object ArrayUtils extends js.Object {
  def getRandomItem[T](objects: js.Array[T], startIndex: Double = ???, length: Double = ???): T = js.native
  def removeRandomItem[T](objects: js.Array[T], startIndex: Double = ???, length: Double = ???): T = js.native
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
  def transposeMatrix[T](array: js.Array[T]): T = js.native
  def rotateMatrix(matrix: js.Any, direction: Double): js.Dynamic = js.native
  def findClosest(value: Double, arr: js.Array[Double]): Double = js.native
  def rotate(array: js.Array[js.Any]): js.Dynamic = js.native
  def numberArray(start: Double, end: Double): js.Array[Double] = js.native
  def numberArrayStep(start: Double, end: Double, step: Double = ???): js.Array[Double] = js.native
}

@js.native
@JSName("Phaser.BitmapData")
class BitmapData protected () extends js.Object {
  def this(game: Phaser.Game, key: String, width: Double = ???, height: Double = ???) = this()
  var baseTexture: PIXI.BaseTexture = js.native
  var buffer: ArrayBuffer = js.native
  var canvas: HTMLCanvasElement = js.native
  var context: CanvasRenderingContext2D = js.native
  var ctx: CanvasRenderingContext2D = js.native
  var data: Uint8Array = js.native
  var dirty: Boolean = js.native
  var disableTextureUpload: Boolean = js.native
  var game: Phaser.Game = js.native
  var height: Double = js.native
  var imageData: ImageData = js.native
  var key: String = js.native
  var op: String = js.native
  var pixels: Uint32Array = js.native
  var smoothed: Boolean = js.native
  var texture: PIXI.Texture = js.native
  var textureFrame: Phaser.Frame = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  def add(`object`: js.Any): Phaser.BitmapData = js.native
  def addToWorld(x: Double = ???, y: Double = ???, anchorX: Double = ???, anchorY: Double = ???, scaleX: Double = ???, scaleY: Double = ???): Phaser.Image = js.native
  def alphaMask(source: js.Any, mask: js.Any = ???, sourceRect: Phaser.Rectangle = ???, maskRect: Phaser.Rectangle = ???): Phaser.BitmapData = js.native
  def blendAdd(): Phaser.BitmapData = js.native
  def blendColor(): Phaser.BitmapData = js.native
  def blendColorBurn(): Phaser.BitmapData = js.native
  def blendColorDodge(): Phaser.BitmapData = js.native
  def blendDarken(): Phaser.BitmapData = js.native
  def blendDestinationAtop(): Phaser.BitmapData = js.native
  def blendDestinationIn(): Phaser.BitmapData = js.native
  def blendDestinationOut(): Phaser.BitmapData = js.native
  def blendDestinationOver(): Phaser.BitmapData = js.native
  def blendDifference(): Phaser.BitmapData = js.native
  def blendExclusion(): Phaser.BitmapData = js.native
  def blendHardLight(): Phaser.BitmapData = js.native
  def blendHue(): Phaser.BitmapData = js.native
  def blendLighten(): Phaser.BitmapData = js.native
  def blendLuminosity(): Phaser.BitmapData = js.native
  def blendMultiply(): Phaser.BitmapData = js.native
  def blendOverlay(): Phaser.BitmapData = js.native
  def blendReset(): Phaser.BitmapData = js.native
  def blendSaturation(): Phaser.BitmapData = js.native
  def blendScreen(): Phaser.BitmapData = js.native
  def blendSoftLight(): Phaser.BitmapData = js.native
  def blendSourceAtop(): Phaser.BitmapData = js.native
  def blendSourceIn(): Phaser.BitmapData = js.native
  def blendSourceOut(): Phaser.BitmapData = js.native
  def blendSourceOver(): Phaser.BitmapData = js.native
  def blendXor(): Phaser.BitmapData = js.native
  def circle(x: Double, y: Double, radius: Double, fillStyle: String = ???): Phaser.BitmapData = js.native
  def clear(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???): Phaser.BitmapData = js.native
  def cls(): Phaser.BitmapData = js.native
  def copy(source: js.Any = ???, x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???, tx: Double = ???, ty: Double = ???, newWidth: Double = ???, newHeight: Double = ???, rotate: Double = ???, anchorX: Double = ???, anchorY: Double = ???, scaleX: Double = ???, scaleY: Double = ???, alpha: Double = ???, blendMode: Double = ???, roundPx: Boolean = ???): Phaser.BitmapData = js.native
  def copyPixels(source: js.Any, area: Phaser.Rectangle, x: Double, y: Double, alpha: Double = ???): Unit = js.native
  def copyRect(source: js.Any, area: Phaser.Rectangle, x: Double = ???, y: Double = ???, alpha: Double = ???, blendMode: Double = ???, roundPx: Boolean = ???): Phaser.BitmapData = js.native
  def draw(source: js.Any, x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???, blendMode: Double = ???, roundPx: Boolean = ???): Phaser.BitmapData = js.native
  def drawFull(parent: js.Any, blendMode: Double = ???, roundPx: Boolean = ???): Phaser.BitmapData = js.native
  def drawGroup(group: Phaser.Group, blendMode: Double = ???, roundPx: Boolean = ???): Phaser.BitmapData = js.native
  def extract(destination: Phaser.BitmapData, r: Double, g: Double, b: Double, a: Double = ???, resize: Boolean = ???, r2: Double = ???, g2: Double = ???, b2: Double = ???): Phaser.BitmapData = js.native
  def fill(r: Double, g: Double, b: Double, a: Double = ???): Phaser.BitmapData = js.native
  def generateTexture(key: String): PIXI.Texture = js.native
  def getBounds(rect: Phaser.Rectangle = ???): Phaser.Rectangle = js.native
  def getFirstPixel(direction: Double): js.Any = js.native
  def getPixel(x: Double, y: Double, out: js.Any = ???): Double = js.native
  def getPixelRGB(x: Double, y: Double, out: js.Any = ???, hsl: Boolean = ???, hsv: Boolean = ???): js.Dynamic = js.native
  def getPixel32(x: Double, y: Double): Double = js.native
  def getPixels(rect: Phaser.Rectangle): ImageData = js.native
  def getTransform(translateX: Double, translateY: Double, scaleX: Double, scaleY: Double, skewX: Double, skewY: Double): js.Dynamic = js.native
  def line(x1: Double, y1: Double, x2: Double, y2: Double, color: String = ???, width: Double = ???): Phaser.BitmapData = js.native
  def load(source: js.Any): Phaser.BitmapData = js.native
  def move(x: Double, y: Double): Phaser.BitmapData = js.native
  def moveH(distance: Double): Phaser.BitmapData = js.native
  def moveV(distance: Double): Phaser.BitmapData = js.native
  def processPixel(callback: js.Function, callbackContext: js.Any, x: Double = ???, y: Number = ???, width: Double = ???, height: Double = ???): Phaser.BitmapData = js.native
  def processPixelRGB(callback: js.Function, callbackContext: js.Any, x: Double = ???, y: Number = ???, width: Double = ???, height: Double = ???): Phaser.BitmapData = js.native
  def rect(x: Double, y: Double, width: Double, height: Double, fillStyle: String = ???): Phaser.BitmapData = js.native
  def render(): Phaser.BitmapData = js.native
  def replaceRGB(r1: Double, g1: Double, b1: Double, a1: Double, r2: Double, g2: Double, b2: Double, a2: Double, region: Phaser.Rectangle): Phaser.BitmapData = js.native
  def resize(width: Double, height: Double): Phaser.BitmapData = js.native
  def resizeFrame(parent: js.Any, width: Double, height: Double): Unit = js.native
  def setHSL(h: Double = ???, s: Double = ???, l: Double = ???, region: Phaser.Rectangle = ???): Phaser.BitmapData = js.native
  def setPixel(x: Double, y: Double, red: Double, green: Double, blue: Double, immediate: Boolean = ???): Phaser.BitmapData = js.native
  def setPixel32(x: Double, y: Double, red: Double, green: Double, blue: Double, alpha: Double, immediate: Boolean = ???): Phaser.BitmapData = js.native
  def shadow(color: String, blur: Double = ???, x: Double = ???, y: Double = ???): Phaser.BitmapData = js.native
  def shiftHSL(h: Double = ???, s: Double = ???, l: Double = ???, region: Phaser.Rectangle = ???): Phaser.BitmapData = js.native
  def text(text: String, x: Double = ???, y: Double = ???, font: String = ???, color: String = ???, shadow: Boolean = ???): Phaser.BitmapData = js.native
  def textureLine(line: Phaser.Line, key: String, repeat: String = ???): Phaser.BitmapData = js.native
  def update(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???): Phaser.BitmapData = js.native
}

@JSName("Phaser.BitmapData")
@js.native
object BitmapData extends js.Object {
  def getTransform(translateX: Double, translateY: Double, scaleX: Double, scaleY: Double, skewX: Double, skewY: Double): js.Dynamic = js.native
}

@js.native
@JSName("Phaser.BitmapText")
class BitmapText protected () extends PIXI.DisplayObjectContainer {
  def this(game: Phaser.Game, x: Double, y: Double, font: String, text: String = ???, size: Double = ???, align: String = ???) = this()
  var align: String = js.native
  var alive: Boolean = js.native
  var anchor: Phaser.Point = js.native
  var animations: Phaser.AnimationManager = js.native
  var angle: Double = js.native
  var autoCull: Boolean = js.native
  var body: Phaser.Physics.Arcade.Body | Phaser.Physics.P2.Body | Phaser.Physics.Ninja.Body | js.Any = js.native
  var bottom: Double = js.native
  var cameraOffset: Phaser.Point = js.native
  var checkWorldBounds: Boolean = js.native
  var destroyPhase: Boolean = js.native
  var debug: Boolean = js.native
  var dirty: Boolean = js.native
  var events: Phaser.Events = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var font: String = js.native
  var fontSize: Double = js.native
  var fresh: Boolean = js.native
  var game: Phaser.Game = js.native
  var input: Phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var inCamera: Boolean = js.native
  var inWorld: Boolean = js.native
  var key: String | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture = js.native
  var left: Double = js.native
  var name: String = js.native
  var components: js.Any = js.native
  var lifespan: Double = js.native
  var maxWidth: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var outOfBoundsKill: Boolean = js.native
  var pendingDestroy: Boolean = js.native
  var physicsType: Double = js.native
  var previousPosition: Phaser.Point = js.native
  var previousRotation: Double = js.native
  var position: Phaser.Point = js.native
  var renderOrderID: Double = js.native
  var right: Double = js.native
  var text: String = js.native
  var smoothed: Boolean = js.native
  var textWidth: Double = js.native
  var textHeight: Double = js.native
  var tint: Double = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var world: Phaser.Point = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def kill(): Unit = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def purgeGlyphs(): Double = js.native
  def reset(x: Double, y: Double, health: Double = ???): Phaser.BitmapText = js.native
  def revive(health: Double = ???): Phaser.BitmapText = js.native
  def scanLine(data: js.Any, scale: Double, text: String): js.Any = js.native
  def setText(text: String): Unit = js.native
  def update(): Unit = js.native
  def updateText(): Unit = js.native
  def updateTransform(): Unit = js.native
}

@js.native
@JSName("Phaser.Button")
class Button protected () extends Phaser.Image {
  def this(game: Phaser.Game, x: Double = ???, y: Double = ???, key: String = ???, callback: js.Function = ???, callbackContext: js.Any = ???, overFrame: String | Double = ???, outFrame: String | Double = ???, downFrame: String | Double = ???, upFrame: String | Double = ???) = this()
  var forceOut: Boolean = js.native
  var freezeFrames: Boolean = js.native
  var onDownSound: Phaser.Sound | Phaser.AudioSprite = js.native
  var onDownSoundMarker: String = js.native
  var onInputDown: Phaser.Signal = js.native
  var onInputOut: Phaser.Signal = js.native
  var onInputOver: Phaser.Signal = js.native
  var onInputUp: Phaser.Signal = js.native
  var onOutSound: Phaser.Sound | Phaser.AudioSprite = js.native
  var onOutSoundMarker: String = js.native
  var onOverSound: Phaser.Sound | Phaser.AudioSprite = js.native
  var onOverSoundMarker: String = js.native
  var onOverMouseOnly: Boolean = js.native
  var onUpSound: Phaser.Sound | Phaser.AudioSprite = js.native
  var onUpSoundMaker: String = js.native
  var physicsType: Double = js.native
  var `type`: Double = js.native
  def clearFrames(): Unit = js.native
  def setDownSound(sound: Phaser.Sound | Phaser.AudioSprite, marker: String = ???): Unit = js.native
  def setFrames(overFrame: String | Double = ???, outFrame: String | Double = ???, downFrame: String | Double = ???, upFrame: String | Double = ???): Unit = js.native
  def onInputOverHandler(sprite: Phaser.Button, pointer: Phaser.Pointer): Unit = js.native
  def onInputOutHandler(sprite: Phaser.Button, pointer: Phaser.Pointer): Unit = js.native
  def onInputDownHandler(sprite: Phaser.Button, pointer: Phaser.Pointer): Unit = js.native
  def onInputUpHandler(sprite: Phaser.Button, pointer: Phaser.Pointer, isOver: Boolean): Unit = js.native
  def removedFromWorld(): Unit = js.native
  def setOutSound(sound: Phaser.Sound | Phaser.AudioSprite, marker: String = ???): Unit = js.native
  def setOverSound(sound: Phaser.Sound | Phaser.AudioSprite, marker: String = ???): Unit = js.native
  def setSounds(overSound: Phaser.Sound | Phaser.AudioSprite = ???, overMarker: String = ???, downSound: Phaser.Sound | Phaser.AudioSprite = ???, downMarker: String = ???, outSound: Phaser.Sound | Phaser.AudioSprite = ???, outMarker: String = ???, upSound: Phaser.Sound | Phaser.AudioSprite = ???, upMarker: String = ???): Unit = js.native
  def setState(newState: Double): Unit = js.native
  def setUpSound(sound: Phaser.Sound | Phaser.AudioSprite, marker: String = ???): Unit = js.native
}

@js.native
@JSName("Phaser.Cache")
class Cache protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var autoResolveURL: Boolean = js.native
  var game: Phaser.Game = js.native
  var onSoundUnlock: Phaser.Signal = js.native
  def addBinary(key: String, binaryData: js.Any): Unit = js.native
  def addBitmapData(key: String, bitmapData: Phaser.BitmapData, frameData: Phaser.FrameData = ???): Phaser.BitmapData = js.native
  def addBitmapFont(key: String, texture: Phaser.RetroFont): Unit = js.native
  def addBitmapFont(key: String, url: String, data: js.Any, atlasData: js.Any, atlasType: String, xSpacing: Double = ???, ySpacing: Double = ???): Unit = js.native
  def addCanvas(key: String, canvas: HTMLCanvasElement, context: CanvasRenderingContext2D = ???): Unit = js.native
  def addDefaultImage(): Unit = js.native
  def addImage(key: String, url: String, data: js.Any): Phaser.CachedImage = js.native
  def addJSON(key: String, urL: String, data: js.Any): Unit = js.native
  def addMissingImage(): Unit = js.native
  def addPhysicsData(key: String, url: String, JSONData: js.Any, format: Double): Unit = js.native
  def addRenderTexture(key: String, texture: RenderTexture): Unit = js.native
  def addShader(key: String, url: String, data: js.Any): Unit = js.native
  def addSound(key: String, url: String, data: js.Any, webAudio: Boolean, audioTag: Boolean): Unit = js.native
  def addSpriteSheet(key: String, url: String, data: js.Any, frameWidth: Double, frameHeight: Double, frameMax: Double = ???, margin: Double = ???, spacing: Double = ???): Unit = js.native
  def addText(key: String, url: String, data: js.Any): Unit = js.native
  def addTextureAtlas(key: String, url: String, data: js.Any, atlasData: js.Any, format: Double): Unit = js.native
  def addTilemap(key: String, url: String, mapData: js.Any, format: Double): Unit = js.native
  def addVideo(key: String, url: String, data: js.Any, isBlob: Boolean = ???): Unit = js.native
  def addXML(key: String, url: String, data: js.Any): Unit = js.native
  def checkBinaryKey(key: String): Boolean = js.native
  def checkBitmapDataKey(key: String): Boolean = js.native
  def checkBitmapFontKey(key: String): Boolean = js.native
  def checkCanvasKey(key: String): Boolean = js.native
  def checkImageKey(key: String): Boolean = js.native
  def checkJSONKey(key: String): Boolean = js.native
  def checkKey(cache: Double, key: String): Boolean = js.native
  def checkPhysicsKey(key: String): Boolean = js.native
  def checkRenderTextureKey(key: String): Boolean = js.native
  def checkShaderKey(key: String): Boolean = js.native
  def checkSoundKey(key: String): Boolean = js.native
  def checkTextKey(key: String): Boolean = js.native
  def checkTextureKey(key: String): Boolean = js.native
  def checkTilemapKey(key: String): Boolean = js.native
  def checkURL(url: String): js.Dynamic = js.native
  def checkUrl(url: String): js.Dynamic = js.native
  def checkXMLKey(key: String): Boolean = js.native
  def checkVideoKey(key: String): Boolean = js.native
  def clearGLTextures(): Unit = js.native
  def decodedSound(key: String, data: js.Any): Unit = js.native
  def destroy(): Unit = js.native
  def getBaseTexture(key: String, cache: Double = ???): PIXI.BaseTexture = js.native
  def getBinary(key: String): js.Dynamic = js.native
  def getBitmapData(key: String): Phaser.BitmapData = js.native
  def getBitmapFont(key: String): Phaser.RetroFont = js.native
  def getCanvas(key: String): HTMLCanvasElement = js.native
  def getFrame(key: String, cache: Double = ???): Phaser.Frame = js.native
  def getFrameByIndex(key: String, index: Double, cache: Double = ???): Phaser.Frame = js.native
  def getFrameByName(key: String, name: String, cache: Double = ???): Phaser.Frame = js.native
  def getFrameCount(key: String, cache: Double = ???): Double = js.native
  def getFrameData(key: String, cache: Double = ???): Phaser.FrameData = js.native
  def getImage(key: String, full: Boolean = ???): Phaser.CachedImage = js.native
  def getItem(key: String, cache: Double, method: String = ???, property: String = ???): js.Dynamic = js.native
  def getJSON(key: String, clone: Boolean = ???): js.Dynamic = js.native
  def getKeys(cache: Double): js.Array[String] = js.native
  def getPixiTexture(key: String): PIXI.Texture = js.native
  def getPixiBaseTexture(key: String): PIXI.BaseTexture = js.native
  def getPhysicsData(key: String, `object`: String = ???, fixtureKey: String = ???): js.Array[js.Any] = js.native
  def getRenderTexture(key: String): Phaser.CachedRenderTexture = js.native
  def getShader(key: String): String = js.native
  def getSound(key: String): Phaser.Sound = js.native
  def getSoundData(key: String): js.Dynamic = js.native
  def getSpriteSheetKey(key: String): Boolean = js.native
  def getText(key: String): String = js.native
  def getTextKeys(): js.Array[String] = js.native
  def getTexture(key: String): Phaser.RenderTexture = js.native
  def getTextureAtlasKey(key: String): Boolean = js.native
  def getTextureFrame(key: String): Phaser.Frame = js.native
  def getTilemap(key: String): js.Dynamic = js.native
  def getTilemapData(key: String): js.Dynamic = js.native
  def getURL(url: String): js.Dynamic = js.native
  def getXML(key: String): js.Dynamic = js.native
  def getVideo(key: String): Phaser.Video = js.native
  def hasFrameData(key: String, cache: Double = ???): Boolean = js.native
  def isSoundDecoded(key: String): Boolean = js.native
  def isSoundReady(key: String): Boolean = js.native
  def isSpriteSheet(key: String): Boolean = js.native
  def reloadSound(key: String): Unit = js.native
  def reloadSoundComplete(key: String): Unit = js.native
  def removeBinary(key: String): Unit = js.native
  def removeBitmapData(key: String): Unit = js.native
  def removeBitmapFont(key: String): Unit = js.native
  def removeCanvas(key: String): Unit = js.native
  def removeImage(key: String, removeFromPixi: Boolean = ???): Unit = js.native
  def removeJSON(key: String): Unit = js.native
  def removePhysics(key: String): Unit = js.native
  def removeRenderTexture(key: String): Unit = js.native
  def removeShader(key: String): Unit = js.native
  def removeSound(key: String): Unit = js.native
  def removeSpriteSheet(key: String): Unit = js.native
  def removeText(key: String): Unit = js.native
  def removeTextureAtlas(key: String): Unit = js.native
  def removeTilemap(key: String): Unit = js.native
  def removeXML(key: String): Unit = js.native
  def removeVideo(key: String): Unit = js.native
  def updateFrameData(key: String, frameData: js.Any, cache: Double = ???): Unit = js.native
  def updateSound(key: String, property: String, value: Phaser.Sound): Unit = js.native
}

@JSName("Phaser.Cache")
@js.native
object Cache extends js.Object {
  var BINARY: Double = js.native
  var BITMAPDATA: Double = js.native
  var BITMAPFONT: Double = js.native
  var CANVAS: Double = js.native
  var IMAGE: Double = js.native
  var JSON: Double = js.native
  var PHYSICS: Double = js.native
  var RENDER_TEXTURE: Double = js.native
  var SHADER: Double = js.native
  var SOUND: Double = js.native
  var SPRITE_SHEET: Double = js.native
  var TEXT: Double = js.native
  var TEXTURE: Double = js.native
  var TEXTURE_ATLAS: Double = js.native
  var TILEMAP: Double = js.native
  var XML: Double = js.native
  var VIDEO: Double = js.native
}

@js.native
trait CachedImage extends js.Object {
  var key: String = js.native
  var url: String = js.native
  var data: HTMLImageElement = js.native
  var base: PIXI.BaseTexture = js.native
  var frame: Phaser.Frame = js.native
  var frameData: Phaser.FrameData = js.native
}

@js.native
trait CachedRenderTexture extends js.Object {
  var frame: Phaser.Frame = js.native
  var texture: Phaser.RenderTexture = js.native
}

@js.native
@JSName("Phaser.Camera")
class Camera protected () extends js.Object {
  def this(game: Phaser.Game, id: Double, x: Double, y: Double, width: Double, height: Double) = this()
  var atLimit: js.Any = js.native
  var bounds: Phaser.Rectangle = js.native
  var deadzone: Phaser.Rectangle = js.native
  var displayObject: PIXI.DisplayObject = js.native
  var id: Double = js.native
  var game: Phaser.Game = js.native
  var height: Double = js.native
  var position: Phaser.Point = js.native
  var roundPx: Boolean = js.native
  var scale: Phaser.Point = js.native
  var target: Phaser.Sprite = js.native
  var totalInView: Double = js.native
  var view: Phaser.Rectangle = js.native
  var visible: Boolean = js.native
  var width: Double = js.native
  var world: Phaser.World = js.native
  var x: Double = js.native
  var y: Double = js.native
  def checkBounds(): Unit = js.native
  def focusOn(displayObject: PIXI.DisplayObject): Unit = js.native
  def focusOnXY(x: Double, y: Double): Unit = js.native
  def follow(target: Phaser.Sprite, style: Double = ???): Unit = js.native
  def reset(): Unit = js.native
  def setBoundsToWorld(): Unit = js.native
  def setPosition(x: Double, y: Double): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def unfollow(): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.Camera")
@js.native
object Camera extends js.Object {
  var FOLLOW_LOCKON: Double = js.native
  var FOLLOW_PLATFORMER: Double = js.native
  var FOLLOW_TOPDOWN: Double = js.native
  var FOLLOW_TOPDOWN_TIGHT: Double = js.native
}

@js.native
@JSName("Phaser.Canvas")
class Canvas extends js.Object {
}

@JSName("Phaser.Canvas")
@js.native
object Canvas extends js.Object {
  def addToDOM(canvas: HTMLCanvasElement, parent: HTMLElement, overflowHidden: Boolean = ???): HTMLCanvasElement = js.native
  def create(width: Double = ???, height: Double = ???, id: String = ???): HTMLCanvasElement = js.native
  def getSmoothngEnabled(context: CanvasRenderingContext2D): Boolean = js.native
  def removeFromDOM(canvas: HTMLCanvasElement): Unit = js.native
  def setBackgroundColor(canvas: HTMLCanvasElement, color: String): HTMLCanvasElement = js.native
  def setImageRenderingBicubic(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
  def setImageRenderingCrisp(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
  def setSmoothingEnabled(context: CanvasRenderingContext2D, value: Boolean): CanvasRenderingContext2D = js.native
  def setTouchAction(canvas: HTMLCanvasElement, value: String): HTMLCanvasElement = js.native
  def setTransform(context: CanvasRenderingContext2D, translateX: Double, translateY: Double, scaleX: Double, scaleY: Double, skewX: Double, skewY: Double): CanvasRenderingContext2D = js.native
  def setUserSelect(canvas: HTMLCanvasElement, value: String = ???): HTMLCanvasElement = js.native
}

@js.native
@JSName("Phaser.Circle")
class Circle protected () extends js.Object {
  def this(x: Double = ???, y: Double = ???, diameter: Double = ???) = this()
  var area: Double = js.native
  var bottom: Double = js.native
  var diameter: Double = js.native
  var empty: Boolean = js.native
  var left: Double = js.native
  var radius: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def circumference(): Double = js.native
  def circumferencePoint(angle: Double, asDegrees: Boolean = ???, out: Phaser.Point = ???): Phaser.Point = js.native
  def clone(output: Phaser.Circle): Phaser.Circle = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def copyFrom(source: js.Any): Circle = js.native
  def copyTo(dest: js.Any): js.Dynamic = js.native
  def distance(dest: js.Any, round: Boolean = ???): Double = js.native
  def getBounds(): Phaser.Rectangle = js.native
  def offset(dx: Double, dy: Double): Phaser.Circle = js.native
  def offsetPoint(point: Phaser.Point): Phaser.Circle = js.native
  def random(out: Phaser.Point = ???): Phaser.Point = js.native
  def scale(x: Double, y: Double = ???): Phaser.Rectangle = js.native
  def setTo(x: Double, y: Double, diameter: Double): Circle = js.native
  def toString(): String = js.native
}

@JSName("Phaser.Circle")
@js.native
object Circle extends js.Object {
  def circumferencePoint(a: Phaser.Circle, angle: Double, asDegrees: Boolean, out: Phaser.Point = ???): Phaser.Point = js.native
  def contains(a: Phaser.Circle, x: Double, y: Double): Boolean = js.native
  def equals(a: Phaser.Circle, b: Phaser.Circle): Boolean = js.native
  def intersects(a: Phaser.Circle, b: Phaser.Circle): Boolean = js.native
  def intersectsRectangle(c: Phaser.Circle, r: Phaser.Rectangle): Boolean = js.native
}

@js.native
@JSName("Phaser.Color")
class Color extends js.Object {
}

@JSName("Phaser.Color")
@js.native
object Color extends js.Object {
  def componentToHex(color: Double): String = js.native
  def createColor(r: Double = ???, g: Double = ???, b: Double = ???, a: Double = ???, h: Double = ???, s: Double = ???, l: Double = ???, v: Double = ???): js.Dynamic = js.native
  def fromRGBA(rgba: Double, out: js.Any = ???): js.Dynamic = js.native
  def getAlpha(color: Double): Double = js.native
  def getAlphaFloat(color: Double): Double = js.native
  def getBlue(color: Double): Double = js.native
  def getColor(red: Double, green: Double, blue: Double): Double = js.native
  def getColor32(alpha: Double, red: Double, green: Double, blue: Double): Double = js.native
  def getGreen(color: Double): Double = js.native
  def getRandomColor(min: Double = ???, max: Double = ???, alpha: Double = ???): Double = js.native
  def getRed(color: Double): Double = js.native
  def getRGB(color: Double): js.Dynamic = js.native
  def getWebRGB(color: js.Any): String = js.native
  def hexToRGB(h: String): Double = js.native
  def hexToColor(hex: String, out: js.Any = ???): js.Dynamic = js.native
  def HSLtoRGB(h: Double, s: Double, l: Double, out: js.Any = ???): js.Dynamic = js.native
  def HSLColorWheel(s: Double = ???, l: Double = ???): js.Array[js.Any] = js.native
  def HSVtoRGB(h: Double, s: Double, v: Double, out: js.Any = ???): js.Dynamic = js.native
  def HSVColorWheel(s: Double = ???, v: Double = ???): js.Array[js.Any] = js.native
  def hueToColor(p: Double, q: Double, t: Double): Double = js.native
  def interpolateColor(color1: Double, color2: Double, steps: Double, currentStep: Double, alpha: Double): Double = js.native
  def interpolateColorWithRGB(color: Double, r: Double, g: Double, b: Double, steps: Double, currentStep: Double): Double = js.native
  def interpolateRGB(r1: Double, g1: Double, b1: Double, r2: Double, g2: Double, b2: Double, steps: Double, currentStep: Double): Double = js.native
  def packPixel(r: Double, g: Double, b: Double, a: Double): Double = js.native
  def RGBtoHSL(r: Double, g: Double, b: Double, out: js.Any = ???): js.Dynamic = js.native
  def RGBtoHSV(r: Double, g: Double, b: Double, out: js.Any = ???): js.Dynamic = js.native
  def RGBtoString(r: Double, g: Double, b: Double, a: Double = ???, prefix: String = ???): String = js.native
  def toRGBA(r: Double, g: Double, b: Double, a: Double): Double = js.native
  def unpackPixel(rgba: Double, out: js.Any = ???, hsl: Boolean = ???, hsv: Boolean = ???): js.Dynamic = js.native
  def updateColor(out: js.Any): Double = js.native
  def valueToColor(value: String, out: js.Any = ???): js.Any = js.native
  def webToColor(web: String, out: js.Any = ???): js.Any = js.native
  def blendNormal(a: Double): Double = js.native
  def blendLighten(a: Double, b: Double): Double = js.native
  def blendDarken(a: Double, b: Double): Double = js.native
  def blendMultiply(a: Double, b: Double): Double = js.native
  def blendAverage(a: Double, b: Double): Double = js.native
  def blendAdd(a: Double, b: Double): Double = js.native
  def blendSubtract(a: Double, b: Double): Double = js.native
  def blendDifference(a: Double, b: Double): Double = js.native
  def blendNegation(a: Double, b: Double): Double = js.native
  def blendScreen(a: Double, b: Double): Double = js.native
  def blendExclusion(a: Double, b: Double): Double = js.native
  def blendOverlay(a: Double, b: Double): Double = js.native
  def blendSoftLight(a: Double, b: Double): Double = js.native
  def blendHardLight(a: Double, b: Double): Double = js.native
  def blendColorDodge(a: Double, b: Double): Double = js.native
  def blendColorBurn(a: Double, b: Double): Double = js.native
  def blendLinearDodge(a: Double, b: Double): Double = js.native
  def blendLinearBurn(a: Double, b: Double): Double = js.native
  def blendLinearLight(a: Double, b: Double): Double = js.native
  def blendVividLight(a: Double, b: Double): Double = js.native
  def blendPinLight(a: Double, b: Double): Double = js.native
  def blendHardMix(a: Double, b: Double): Double = js.native
  def blendReflect(a: Double, b: Double): Double = js.native
  def blendGlow(a: Double, b: Double): Double = js.native
  def blendPhoenix(a: Double, b: Double): Double = js.native
}

@js.native
@JSName("Phaser.Create")
class Create protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var bmd: Phaser.BitmapData = js.native
  var canvas: HTMLCanvasElement = js.native
  var ctx: CanvasRenderingContext2D = js.native
  var game: Phaser.Game = js.native
  var palettes: js.Any = js.native
  def grid(key: String, width: Double, height: Double, cellWidth: Double, cellHeight: Double, color: String): PIXI.Texture = js.native
  def texture(key: String, data: js.Any, pixelWidth: Double = ???, pixelHeight: Double = ???, palette: Double = ???): PIXI.Texture = js.native
}

@JSName("Phaser.Create")
@js.native
object Create extends js.Object {
  var PALETTE_ARNE: Double = js.native
  var PALETTE_JMP: Double = js.native
  var PALETTE_CGA: Double = js.native
  var PALETTE_C64: Double = js.native
  var PALETTE_JAPANESE_MACHINE: Double = js.native
}

@js.native
trait CursorKeys extends js.Object {
  var up: Phaser.Key = js.native
  var down: Phaser.Key = js.native
  var left: Phaser.Key = js.native
  var right: Phaser.Key = js.native
}

@js.native
@JSName("Phaser.Device")
class Device extends js.Object {
  var android: Boolean = js.native
  var arora: Boolean = js.native
  var audioData: Boolean = js.native
  var cancelFullScreen: String = js.native
  var canvas: Boolean = js.native
  var chrome: Boolean = js.native
  var chromeOS: Boolean = js.native
  var chromeVersion: Double = js.native
  var cocoonJS: Boolean = js.native
  var cocoonJSApp: Boolean = js.native
  var cordova: Boolean = js.native
  var crosswalk: Boolean = js.native
  var css3D: Boolean = js.native
  var desktop: Boolean = js.native
  var deviceReadyAt: Double = js.native
  var electron: Boolean = js.native
  var ejecta: Boolean = js.native
  var epiphany: Boolean = js.native
  var file: Boolean = js.native
  var fileSystem: Boolean = js.native
  var firefox: Boolean = js.native
  var firefoxVersion: Double = js.native
  var fullScreen: Boolean = js.native
  var fullScreenKeyboard: Boolean = js.native
  var getUserMedia: Boolean = js.native
  var game: Phaser.Game = js.native
  var h264Video: Boolean = js.native
  var hlsVideo: Boolean = js.native
  var ie: Boolean = js.native
  var ieVersion: Double = js.native
  var iOS: Boolean = js.native
  var initialized: Boolean = js.native
  var iPad: Boolean = js.native
  var iPhone: Boolean = js.native
  var iPhone4: Boolean = js.native
  var kindle: Boolean = js.native
  var linux: Boolean = js.native
  var littleEndian: Boolean = js.native
  var localStorage: Boolean = js.native
  var m4a: Boolean = js.native
  var macOS: Boolean = js.native
  var midori: Boolean = js.native
  var mobileSafari: Boolean = js.native
  var mp3: Boolean = js.native
  var mp4Video: Boolean = js.native
  var mspointer: Boolean = js.native
  var node: Boolean = js.native
  var nodeWebkit: Boolean = js.native
  var ogg: Boolean = js.native
  var oggVideo: Double = js.native
  var opera: Boolean = js.native
  var opus: Boolean = js.native
  var pixelRatio: Double = js.native
  var pointerLock: Boolean = js.native
  var quirksMode: Boolean = js.native
  var requestFullScreen: String = js.native
  var safari: Boolean = js.native
  var silk: Boolean = js.native
  var support32bit: Boolean = js.native
  var touch: Boolean = js.native
  var trident: Boolean = js.native
  var tridentVersion: Double = js.native
  var typedArray: Boolean = js.native
  var vibration: Boolean = js.native
  var vita: Boolean = js.native
  var wav: Boolean = js.native
  var webApp: Boolean = js.native
  var webAudio: Boolean = js.native
  var webGL: Boolean = js.native
  var webm: Boolean = js.native
  var webmVideo: Boolean = js.native
  var windows: Boolean = js.native
  var windowsPhone: Boolean = js.native
  var wheelEvent: String = js.native
  var worker: Boolean = js.native
  var wp9Video: Boolean = js.native
}

@JSName("Phaser.Device")
@js.native
object Device extends js.Object {
  var LITTLE_ENDIAN: Boolean = js.native
  var onInitialized: Phaser.Signal = js.native
  def checkFullScreenSupport(): Unit = js.native
  def canPlayAudio(`type`: String): Boolean = js.native
  def canPlayVideo(`type`: String): Boolean = js.native
  def isConsoleOpen(): Boolean = js.native
  def isAndroidStockBrowser(): String = js.native
  var whenReady: js.Function2[js.Function, js.Any, Unit] = js.native
}

@JSName("Phaser.Easing")
@js.native
object Easing extends js.Object {
  var Default: js.Function = js.native
  var Power0: js.Function = js.native
  var Power1: js.Function = js.native
  var power2: js.Function = js.native
  var power3: js.Function = js.native
  var power4: js.Function = js.native

@js.native
@JSName("Phaser.Easing.Back")
class Back extends js.Object {
}

@JSName("Phaser.Easing.Back")
@js.native
object Back extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@js.native
@JSName("Phaser.Easing.Bounce")
class Bounce extends js.Object {
}

@JSName("Phaser.Easing.Bounce")
@js.native
object Bounce extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@js.native
@JSName("Phaser.Easing.Circular")
class Circular extends js.Object {
}

@JSName("Phaser.Easing.Circular")
@js.native
object Circular extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@js.native
@JSName("Phaser.Easing.Cubic")
class Cubic extends js.Object {
}

@JSName("Phaser.Easing.Cubic")
@js.native
object Cubic extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@js.native
@JSName("Phaser.Easing.Elastic")
class Elastic extends js.Object {
}

@JSName("Phaser.Easing.Elastic")
@js.native
object Elastic extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@js.native
@JSName("Phaser.Easing.Exponential")
class Exponential extends js.Object {
}

@JSName("Phaser.Easing.Exponential")
@js.native
object Exponential extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@js.native
@JSName("Phaser.Easing.Linear")
class Linear extends js.Object {
}

@JSName("Phaser.Easing.Linear")
@js.native
object Linear extends js.Object {
  def None(k: Double): Double = js.native
}

@js.native
@JSName("Phaser.Easing.Quadratic")
class Quadratic extends js.Object {
}

@JSName("Phaser.Easing.Quadratic")
@js.native
object Quadratic extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@js.native
@JSName("Phaser.Easing.Quartic")
class Quartic extends js.Object {
}

@JSName("Phaser.Easing.Quartic")
@js.native
object Quartic extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@js.native
@JSName("Phaser.Easing.Quintic")
class Quintic extends js.Object {
}

@JSName("Phaser.Easing.Quintic")
@js.native
object Quintic extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@js.native
@JSName("Phaser.Easing.Sinusoidal")
class Sinusoidal extends js.Object {
}

@JSName("Phaser.Easing.Sinusoidal")
@js.native
object Sinusoidal extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}
}

@js.native
@JSName("Phaser.Ellipse")
class Ellipse protected () extends js.Object {
  def this(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???) = this()
  var bottom: Double = js.native
  var empty: Boolean = js.native
  var height: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def clone(output: Phaser.Ellipse): Phaser.Ellipse = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def copyFrom(source: js.Any): Phaser.Ellipse = js.native
  def copyTo(dest: js.Any): js.Dynamic = js.native
  def getBounds(): Phaser.Rectangle = js.native
  def random(out: Phaser.Point = ???): Phaser.Point = js.native
  def setTo(x: Double, y: Double, width: Double, height: Double): Phaser.Ellipse = js.native
  def toString(): String = js.native
}

@JSName("Phaser.Ellipse")
@js.native
object Ellipse extends js.Object {
  def constains(a: Phaser.Ellipse, x: Double, y: Double): Boolean = js.native
}

@js.native
@JSName("Phaser.Events")
class Events protected () extends js.Object {
  def this(sprite: Phaser.Sprite) = this()
  var parent: Phaser.Sprite = js.native
  var onAddedToGroup: Phaser.Signal = js.native
  var onRemovedFromGroup: Phaser.Signal = js.native
  var onRemovedFromWorld: Phaser.Signal = js.native
  var onKilled: Phaser.Signal = js.native
  var onRevived: Phaser.Signal = js.native
  var onOutOfBounds: Phaser.Signal = js.native
  var onEnterBounds: Phaser.Signal = js.native
  var onInputOver: Phaser.Signal = js.native
  var onInputOut: Phaser.Signal = js.native
  var onInputDown: Phaser.Signal = js.native
  var onInputUp: Phaser.Signal = js.native
  var onDestroy: Phaser.Signal = js.native
  var onDragStart: Phaser.Signal = js.native
  var onDragStop: Phaser.Signal = js.native
  var onDragUpdate: Phaser.Signal = js.native
  var onAnimationStart: Phaser.Signal = js.native
  var onAnimationComplete: Phaser.Signal = js.native
  var onAnimationLoop: Phaser.Signal = js.native
  def destroy(): Unit = js.native
}

@js.native
@JSName("Phaser.Filter")
class Filter protected () extends PIXI.AbstractFilter {
  def this(game: Phaser.Game, uniforms: js.Any, fragmentSrc: String | js.Array[String]) = this()
  var dirty: Boolean = js.native
  var game: Phaser.Game = js.native
  var height: Double = js.native
  var fragmentSrc: String | js.Array[String] = js.native
  var padding: Double = js.native
  var prevPoint: Phaser.Point = js.native
  var `type`: Double = js.native
  var uniforms: js.Any = js.native
  var width: Double = js.native
  @JSName("apply")
  def apply(frameBuffer: WebGLFramebuffer): Unit = js.native
  def destroy(): Unit = js.native
  def init(args: js.Any*): Unit = js.native
  def setResolution(width: Double, height: Double): Unit = js.native
  def syncUniforms(): Unit = js.native
  def update(pointer: Phaser.Pointer = ???): Unit = js.native
}

@JSName("Phaser.Filter")
@js.native
object Filter extends js.Object {

@js.native
@JSName("Phaser.Filter.BinarySerpents")
class BinarySerpents protected () extends Phaser.Filter {
  def this(game: Phaser.Game, width: Double, height: Double, march: Double = ???, maxDistance: Double = ???) = this()
  var fog: Double = js.native
}

@js.native
@JSName("Phaser.Filter.BlurX")
class BlurX extends Phaser.Filter {
  var blur: Double = js.native
}

@js.native
@JSName("Phaser.Filter.BlurY")
class BlurY extends Phaser.Filter {
  var blur: Double = js.native
}

@js.native
@JSName("Phaser.Filter.CausticLight")
class CausticLight protected () extends Phaser.Filter {
  def this(game: Phaser.Game, width: Double, height: Double, divisor: Double = ???) = this()
  def init(width: Double, height: Double, divisor: Double = ???): Unit = js.native
}

@js.native
@JSName("Phaser.Filter.CheckerWave")
class CheckerWave protected () extends Phaser.Filter {
  def this(game: Phaser.Game, width: Double, height: Double) = this()
  var alpha: Double = js.native
  var cameraX: Double = js.native
  var cameraY: Double = js.native
  var cameraZ: Double = js.native
  def init(width: Double, height: Double): Unit = js.native
  def setColor1(red: Double, green: Double, blue: Double): Unit = js.native
  def setColor2(red: Double, green: Double, blue: Double): Unit = js.native
}

@js.native
@JSName("Phaser.Filter.ColorBars")
class ColorBars protected () extends Phaser.Filter {
  def this(game: Phaser.Game, width: Double, height: Double) = this()
  var alpha: Double = js.native
  def init(width: Double, height: Double): Unit = js.native
}

@js.native
@JSName("Phaser.Filter.Fire")
class Fire protected () extends Phaser.Filter {
  def this(width: Double, height: Double, alpha: Double = ???, shift: Double = ???) = this()
  var alpha: Double = js.native
  var shift: Double = js.native
  var speed: Double = js.native
  def init(width: Double, height: Double, alpha: Double = ???, shift: Double = ???): Unit = js.native
}

@js.native
@JSName("Phaser.Filter.Gray")
class Gray extends Phaser.Filter {
  var gray: Double = js.native
}

@js.native
@JSName("Phaser.Filter.HueRotate")
class HueRotate protected () extends Phaser.Filter {
  def this(game: Phaser.Game, width: Double, height: Double, texture: js.Any) = this()
  var alpha: Double = js.native
  def init(width: Double, height: Double, texture: js.Any): Unit = js.native
}

@js.native
@JSName("Phaser.Filter.LazerBeam")
class LazerBeam extends Phaser.Filter {
  def init(width: Double, height: Double, divisor: Double = ???): Unit = js.native
}

@js.native
@JSName("Phaser.Filter.LightBeam")
class LightBeam protected () extends Phaser.Filter {
  def this(game: Phaser.Game, width: Double, height: Double) = this()
  var alpha: Double = js.native
  var blue: Double = js.native
  var green: Double = js.native
  var red: Double = js.native
  var thickness: Double = js.native
  var speed: Double = js.native
  def init(width: Double, height: Double): Unit = js.native
}

@js.native
@JSName("Phaser.Filter.Marble")
class Marble protected () extends Phaser.Filter {
  def this(game: Phaser.Game, width: Double, height: Double, speed: Double = ???, intensity: Double = ???) = this()
  var alpha: Double = js.native
  var intensity: Double = js.native
  var speed: Double = js.native
  def init(width: Double, height: Double, speed: Double = ???, intensity: Double = ???): Unit = js.native
}

@js.native
@JSName("Phaser.Filter.Pixelate")
class Pixelate extends Phaser.Filter {
  var size: Double = js.native
  var sizeX: Double = js.native
  var sizeY: Double = js.native
}

@js.native
@JSName("Phaser.Filter.Plasma")
class Plasma protected () extends Phaser.Filter {
  def this(game: Phaser.Game, width: Double, height: Double, alpha: Double = ???, size: Double = ???) = this()
  var alpha: Double = js.native
  var blueShift: Double = js.native
  var greenShift: Double = js.native
  var redShift: Double = js.native
  var size: Double = js.native
  def init(width: Double, height: Double, alpha: Double = ???, size: Double = ???): Unit = js.native
}

@js.native
@JSName("Phaser.Filter.SampleFilter")
class SampleFilter protected () extends Phaser.Filter {
  def this(game: Phaser.Game, width: Double, height: Double, divisor: Double = ???) = this()
  def init(width: Double, height: Double, divisor: Double = ???): Unit = js.native
}

@js.native
@JSName("Phaser.Filter.Tunnel")
class Tunnel protected () extends Phaser.Filter {
  def this(game: Phaser.Game, width: Double, height: Double, texture: js.Any) = this()
  var alpha: Double = js.native
  var origin: Double = js.native
  def init(width: Double, height: Double, texture: js.Any): Unit = js.native
}
}

@js.native
@JSName("Phaser.FlexGrid")
class FlexGrid protected () extends js.Object {
  def this(manager: Phaser.ScaleManager, width: Double, height: Double) = this()
  var game: Phaser.Game = js.native
  var manager: Phaser.ScaleManager = js.native
  var width: Double = js.native
  var height: Double = js.native
  var boundsCustom: Phaser.Rectangle = js.native
  var boundsFluid: Phaser.Rectangle = js.native
  var boundsFull: Phaser.Rectangle = js.native
  var boundsNone: Phaser.Rectangle = js.native
  var customWidth: Double = js.native
  var customHeight: Double = js.native
  var customOffsetX: Double = js.native
  var customOffsetY: Double = js.native
  var positionCustom: Phaser.Point = js.native
  var positionFluid: Phaser.Point = js.native
  var positionFull: Phaser.Point = js.native
  var positionNone: Phaser.Point = js.native
  var scaleCustom: Phaser.Point = js.native
  var scaleFluid: Phaser.Point = js.native
  var scaleFluidInversed: Phaser.Point = js.native
  var scaleFull: Phaser.Point = js.native
  var scaleNone: Phaser.Point = js.native
  var ratioH: Double = js.native
  var ratioV: Double = js.native
  var multiplier: Double = js.native
  def createCustomLayer(width: Double, height: Double, children: js.Array[PIXI.DisplayObject] = ???, addToWorld: Boolean = ???): Phaser.FlexLayer = js.native
  def createFluidLayer(children: js.Array[PIXI.DisplayObject]): Phaser.FlexLayer = js.native
  def createFullLayer(children: js.Array[PIXI.DisplayObject]): Phaser.FlexLayer = js.native
  def createFixedLayer(children: js.Array[PIXI.DisplayObject]): Phaser.FlexLayer = js.native
  def debug(): Unit = js.native
  def fitSprite(sprite: Phaser.Sprite): Unit = js.native
  def onResize(width: Double, height: Double): Unit = js.native
  def refresh(): Unit = js.native
  def reset(): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
}

@js.native
@JSName("Phaser.FlexLayer")
class FlexLayer protected () extends Phaser.Group {
  def this(manager: Phaser.ScaleManager, position: Phaser.Point, bounds: Phaser.Rectangle, scale: Phaser.Point) = this()
  var grid: Phaser.FlexGrid = js.native
  var manager: Phaser.ScaleManager = js.native
  var bottomLeft: Phaser.Point = js.native
  var bottomMiddle: Phaser.Point = js.native
  var bottomRight: Phaser.Point = js.native
  var bounds: Phaser.Rectangle = js.native
  var persist: Boolean = js.native
  var position: Phaser.Point = js.native
  var scale: Phaser.Point = js.native
  var topLeft: Phaser.Point = js.native
  var topMiddle: Phaser.Point = js.native
  var topRight: Phaser.Point = js.native
  def debug(): Unit = js.native
  def resize(): Unit = js.native
}

@js.native
@JSName("Phaser.Frame")
class Frame protected () extends js.Object {
  def this(index: Double, x: Double, y: Double, width: Double, height: Double, name: String) = this()
  var bottom: Double = js.native
  var centerX: Double = js.native
  var centerY: Double = js.native
  var distance: Double = js.native
  var height: Double = js.native
  var index: Double = js.native
  var name: String = js.native
  var right: Double = js.native
  var rotated: Boolean = js.native
  var rotationDirection: String = js.native
  var sourceSizeH: Double = js.native
  var sourceSizeW: Double = js.native
  var spriteSourceSizeH: Double = js.native
  var spriteSourceSizeW: Double = js.native
  var spriteSourceSizeX: Double = js.native
  var spriteSourceSizeY: Double = js.native
  var trimmed: Boolean = js.native
  var uuid: String = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def clone(): Phaser.Frame = js.native
  def getRect(out: Phaser.Rectangle = ???): Phaser.Rectangle = js.native
  def setTrim(trimmed: Boolean, actualWidth: Double, actualHeight: Double, destX: Double, destY: Double, destWidth: Double, destHeight: Double): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
}

@js.native
@JSName("Phaser.FrameData")
class FrameData extends js.Object {
  var total: Double = js.native
  def addFrame(frame: Frame): Phaser.Frame = js.native
  def checkFrameName(name: String): Boolean = js.native
  def clone(): Phaser.FrameData = js.native
  def getFrame(index: Double): Phaser.Frame = js.native
  def getFrameByName(name: String): Phaser.Frame = js.native
  def getFrameIndexes(frames: js.Array[Double] = ???, useNumericIndex: Boolean = ???, output: js.Array[Double] = ???): js.Array[Double] = js.native
  def getFrameRange(start: Double, end: Double, output: js.Array[Phaser.Frame]): js.Array[Phaser.Frame] = js.native
  def getFrames(frames: js.Array[Double] = ???, useNumericIndex: Boolean = ???, output: js.Array[Phaser.Frame] = ???): js.Array[Phaser.Frame] = js.native
}

@js.native
trait IGameConfig extends js.Object {
  var enableDebug: Boolean = js.native
  var width: Double = js.native
  var height: Double = js.native
  var renderer: Double = js.native
  var parent: js.Any = js.native
  var transparent: Boolean = js.native
  var antialias: Boolean = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var physicsConfig: js.Any = js.native
  var seed: String = js.native
  var state: Phaser.State = js.native
}

@js.native
@JSName("Phaser.Game")
class Game protected () extends js.Object {
  def this(width: Double | String = ???, height: Double | String = ???, renderer: Double = ???, parent: js.Any = ???, state: js.Any = ???, transparent: Boolean = ???, antialias: Boolean = ???, physicsConfig: js.Any = ???) = this()
  def this(config: IGameConfig) = this()
  var add: Phaser.GameObjectFactory = js.native
  var antialias: Boolean = js.native
  var cache: Phaser.Cache = js.native
  var camera: Phaser.Camera = js.native
  var canvas: HTMLCanvasElement = js.native
  var config: IGameConfig = js.native
  var context: CanvasRenderingContext2D = js.native
  var count: Double = js.native
  var debug: Phaser.Utils.Debug = js.native
  var device: Phaser.Device = js.native
  var forceSingleUpdate: Boolean = js.native
  var fpsProblemNotifier: Phaser.Signal = js.native
  var height: Double = js.native
  var id: Double = js.native
  var input: Phaser.Input = js.native
  var isBooted: Boolean = js.native
  var isRunning: Boolean = js.native
  var load: Phaser.Loader = js.native
  var lockRender: Boolean = js.native
  var make: Phaser.GameObjectCreator = js.native
  var math: Phaser.Math = js.native
  var net: Phaser.Net = js.native
  var onBlur: Phaser.Signal = js.native
  var onFocus: Phaser.Signal = js.native
  var onPause: Phaser.Signal = js.native
  var onResume: Phaser.Signal = js.native
  var parent: HTMLElement = js.native
  var particles: Phaser.Particles = js.native
  var paused: Boolean = js.native
  var pendingStep: Boolean = js.native
  var physics: Phaser.Physics = js.native
  var physicsConfig: js.Any = js.native
  var plugins: PluginManager = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var raf: Phaser.RequestAnimationFrame = js.native
  var renderer: PIXI.CanvasRenderer | PIXI.WebGLRenderer = js.native
  var renderType: Double = js.native
  var resolution: Double = js.native
  var rnd: Phaser.RandomDataGenerator = js.native
  var scale: Phaser.ScaleManager = js.native
  var scratch: Phaser.BitmapData = js.native
  var sound: Phaser.SoundManager = js.native
  var stage: Phaser.Stage = js.native
  var state: Phaser.StateManager = js.native
  var stepCount: Double = js.native
  var stepping: Boolean = js.native
  var time: Phaser.Time = js.native
  var transparent: Boolean = js.native
  var tweens: Phaser.TweenManager = js.native
  var currentUpdateID: Double = js.native
  var updatesThisFrame: Double = js.native
  var width: Double = js.native
  var world: Phaser.World = js.native
  def boot(): Unit = js.native
  def destroy(): Unit = js.native
  def disableStep(): Unit = js.native
  def enableStep(): Unit = js.native
  def focusGain(event: js.Any): Unit = js.native
  def focusLoss(event: js.Any): Unit = js.native
  def gamePaused(event: js.Any): Unit = js.native
  def gameResumed(event: js.Any): Unit = js.native
  def parseConfig(config: js.Any): Unit = js.native
  def removeFromDOM(canvas: HTMLCanvasElement): Unit = js.native
  def setUpRenderer(): Unit = js.native
  def showDebugHeader(): Unit = js.native
  def step(): Unit = js.native
  def update(time: Double): Unit = js.native
  def updateLogic(timeStep: Double): Unit = js.native
  def updateRender(timeStep: Double): Unit = js.native
}

@js.native
@JSName("Phaser.GameObjectCreator")
class GameObjectCreator protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var game: Phaser.Game = js.native
  var world: Phaser.World = js.native
  def audio(key: String, volume: Double = ???, loop: Boolean = ???, connect: Boolean = ???): Phaser.Sound = js.native
  def audioSprite(key: String): Phaser.AudioSprite = js.native
  def bitmapData(width: Double = ???, height: Double = ???, key: String = ???, addToCache: Boolean = ???): Phaser.BitmapData = js.native
  def bitmapText(x: Double, y: Double, font: String, text: String = ???, size: Double = ???, align: String = ???): Phaser.BitmapText = js.native
  def button(x: Double = ???, y: Double = ???, key: String = ???, callback: js.Function = ???, callbackContext: js.Any = ???, overFrame: js.Any = ???, outFrame: js.Any = ???, downFrame: js.Any = ???, upFrame: js.Any = ???): Phaser.Button = js.native
  def emitter(x: Double = ???, y: Double = ???, maxParticles: Double = ???): Phaser.Particles.Arcade.Emitter = js.native
  def filter(filter: js.Any, args: js.Any*): Phaser.Filter = js.native
  def graphics(x: Double = ???, y: Double = ???): Phaser.Graphics = js.native
  def group(parent: js.Any = ???, name: String = ???, addToStage: Boolean = ???, enableBody: Boolean = ???, physicsBodyType: Double = ???): Phaser.Group = js.native
  def image(x: Double, y: Double, key: js.Any = ???, frame: js.Any = ???): Phaser.Image = js.native
  def renderTexture(width: Double = ???, height: Double = ???, key: js.Any = ???, addToCache: Boolean = ???): Phaser.RenderTexture = js.native
  def retroFont(font: String, characterWidth: Double, characterHeight: Double, chars: String, charsPerRow: Double, xSpacing: Double = ???, ySpacing: Double = ???, xOffset: Double = ???, yOffset: Double = ???): Phaser.RetroFont = js.native
  def rope(x: Double, y: Double, key: js.Any, frame: js.Any = ???, points: js.Array[Phaser.Point] = ???): Phaser.Rope = js.native
  def sound(key: String, volume: Double = ???, loop: Boolean = ???, connect: Boolean = ???): Phaser.Sound = js.native
  def sprite(x: Double, y: Double, key: js.Any = ???, frame: js.Any = ???): Phaser.Sprite = js.native
  def spriteBatch(parent: js.Any, name: String = ???, addToStage: Boolean = ???): Phaser.SpriteBatch = js.native
  def text(x: Double, y: Double, text: String = ???, style: js.Any = ???): Phaser.Text = js.native
  def tilemap(key: String, tileWidth: Double = ???, tileHeight: Double = ???, width: Double = ???, height: Double = ???): Phaser.Tilemap = js.native
  def tileSprite(x: Double, y: Double, width: Double, height: Double, key: js.Any, frame: js.Any): Phaser.TileSprite = js.native
  def tween(obj: js.Any): Phaser.Tween = js.native
}

@js.native
@JSName("Phaser.GameObjectFactory")
class GameObjectFactory protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var game: Phaser.Game = js.native
  var world: Phaser.World = js.native
  def audio(key: String, volume: Double = ???, loop: Boolean = ???, connect: Boolean = ???): Phaser.Sound = js.native
  def audioSprite(key: String): Phaser.AudioSprite = js.native
  def bitmapData(width: Double = ???, height: Double = ???, key: String = ???, addToCache: Boolean = ???): Phaser.BitmapData = js.native
  def bitmapText(x: Double, y: Double, font: String, text: String = ???, size: Double = ???, align: String = ???, group: Phaser.Group = ???): Phaser.BitmapText = js.native
  def button(x: Double = ???, y: Double = ???, key: String = ???, callback: js.Function = ???, callbackContext: js.Any = ???, overFrame: js.Any = ???, outFrame: js.Any = ???, downFrame: js.Any = ???, upFrame: js.Any = ???, group: Phaser.Group = ???): Phaser.Button = js.native
  def emitter(x: Double = ???, y: Double = ???, maxParticles: Double = ???): Phaser.Particles.Arcade.Emitter = js.native
  def existing(`object`: js.Any): js.Dynamic = js.native
  def filter(filter: String, args: js.Any*): Phaser.Filter = js.native
  def graphics(x: Double, y: Double, group: Phaser.Group = ???): Phaser.Graphics = js.native
  def group(parent: js.Any = ???, name: String = ???, addToStage: Boolean = ???, enableBody: Boolean = ???, physicsBodyType: Double = ???): Phaser.Group = js.native
  def image(x: Double, y: Double, key: js.Any = ???, frame: js.Any = ???, group: Phaser.Group = ???): Phaser.Image = js.native
  def physicsGroup(physicsBodyType: Double, parent: js.Any = ???, name: String = ???, addToStage: Boolean = ???): Phaser.Group = js.native
  def plugin(plugin: Phaser.Plugin, parameter: js.Any*): Phaser.Plugin = js.native
  def renderTexture(width: Double = ???, height: Double = ???, key: String = ???, addToCache: Boolean = ???): Phaser.RenderTexture = js.native
  def retroFont(font: String, characterWidth: Double, characterHeight: Double, chars: String, charsPerRow: Double, xSpacing: Double = ???, ySpacing: Double = ???, xOffset: Double = ???, yOffset: Double = ???): Phaser.RetroFont = js.native
  def rope(x: Double, y: Double, key: js.Any, frame: js.Any = ???, points: js.Array[Phaser.Point] = ???): Phaser.Rope = js.native
  def sound(key: String, volume: Double = ???, loop: Double = ???, connect: Boolean = ???): Phaser.Sound = js.native
  def sprite(x: Double, y: Double, key: js.Any = ???, frame: js.Any = ???, group: Phaser.Group = ???): Phaser.Sprite = js.native
  def spriteBatch(parent: js.Any, name: String = ???, addToStage: Boolean = ???): Phaser.Group = js.native
  def text(x: Double, y: Double, text: String, style: js.Any, group: Phaser.Group = ???): Phaser.Text = js.native
  def tilemap(key: String = ???, tileWidth: Double = ???, tileHeight: Double = ???, width: Double = ???, height: Double = ???): Phaser.Tilemap = js.native
  def tileSprite(x: Double, y: Double, width: Double, height: Double, key: js.Any = ???, frame: js.Any = ???, group: Phaser.Group = ???): Phaser.TileSprite = js.native
  def tween(obj: js.Any): Phaser.Tween = js.native
  def video(key: String = ???, url: String = ???): Phaser.Video = js.native
  def videoSprite(): Unit = js.native
}

@js.native
@JSName("Phaser.Gamepad")
class Gamepad protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var active: Boolean = js.native
  var callbackContext: js.Any = js.native
  var enabled: Boolean = js.native
  var game: Phaser.Game = js.native
  var onAxisCallBack: js.Function = js.native
  var onConnectCallback: js.Function = js.native
  var onDisconnectCallback: js.Function = js.native
  var onDownCallback: js.Function = js.native
  var onFloatCallback: js.Function = js.native
  var onUpCallback: js.Function = js.native
  var pad1: Phaser.SinglePad = js.native
  var pad2: Phaser.SinglePad = js.native
  var pad3: Phaser.SinglePad = js.native
  var pad4: Phaser.SinglePad = js.native
  var padsConnected: Double = js.native
  var supported: Boolean = js.native
  def addCallbacks(context: js.Any, callbacks: js.Any): Unit = js.native
  def isDown(buttonCode: Double): Boolean = js.native
  def justPressed(buttonCode: Double, duration: Double = ???): Boolean = js.native
  def justReleased(buttonCode: Double, duration: Double = ???): Boolean = js.native
  def reset(): Unit = js.native
  def setDeadZones(value: js.Any): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.Gamepad")
@js.native
object Gamepad extends js.Object {
  var BUTTON_0: Double = js.native
  var BUTTON_1: Double = js.native
  var BUTTON_2: Double = js.native
  var BUTTON_3: Double = js.native
  var BUTTON_4: Double = js.native
  var BUTTON_5: Double = js.native
  var BUTTON_6: Double = js.native
  var BUTTON_7: Double = js.native
  var BUTTON_8: Double = js.native
  var BUTTON_9: Double = js.native
  var BUTTON_10: Double = js.native
  var BUTTON_11: Double = js.native
  var BUTTON_12: Double = js.native
  var BUTTON_13: Double = js.native
  var BUTTON_14: Double = js.native
  var BUTTON_15: Double = js.native
  var AXIS_0: Double = js.native
  var AXIS_1: Double = js.native
  var AXIS_2: Double = js.native
  var AXIS_3: Double = js.native
  var AXIS_4: Double = js.native
  var AXIS_5: Double = js.native
  var AXIS_6: Double = js.native
  var AXIS_7: Double = js.native
  var AXIS_8: Double = js.native
  var AXIS_9: Double = js.native
  var XBOX360_A: Double = js.native
  var XBOX360_B: Double = js.native
  var XBOX360_X: Double = js.native
  var XBOX360_Y: Double = js.native
  var XBOX360_LEFT_BUMPER: Double = js.native
  var XBOX360_RIGHT_BUMPER: Double = js.native
  var XBOX360_LEFT_TRIGGER: Double = js.native
  var XBOX360_RIGHT_TRIGGER: Double = js.native
  var XBOX360_BACK: Double = js.native
  var XBOX360_START: Double = js.native
  var XBOX360_STICK_LEFT_BUTTON: Double = js.native
  var XBOX360_STICK_RIGHT_BUTTON: Double = js.native
  var XBOX360_DPAD_LEFT: Double = js.native
  var XBOX360_DPAD_RIGHT: Double = js.native
  var XBOX360_DPAD_UP: Double = js.native
  var XBOX360_DPAD_DOWN: Double = js.native
  var XBOX360_STICK_LEFT_X: Double = js.native
  var XBOX360_STICK_LEFT_Y: Double = js.native
  var XBOX360_STICK_RIGHT_X: Double = js.native
  var XBOX360_STICK_RIGHT_Y: Double = js.native
  var PS3XC_X: Double = js.native
  var PS3XC_CIRCLE: Double = js.native
  var PS3XC_SQUARE: Double = js.native
  var PS3XC_TRIANGLE: Double = js.native
  var PS3XC_L1: Double = js.native
  var PS3XC_R1: Double = js.native
  var PS3XC_L2: Double = js.native
  var PS3XC_R2: Double = js.native
  var PS3XC_SELECT: Double = js.native
  var PS3XC_START: Double = js.native
  var PS3XC_STICK_LEFT_BUTTON: Double = js.native
  var PS3XC_STICK_RIGHT_BUTTON: Double = js.native
  var PS3XC_DPAD_UP: Double = js.native
  var PS3XC_DPAD_DOWN: Double = js.native
  var PS3XC_DPAD_LEFT: Double = js.native
  var PS3XC_DPAD_RIGHT: Double = js.native
  var PS3XC_STICK_LEFT_X: Double = js.native
  var PS3XC_STICK_LEFT_Y: Double = js.native
  var PS3XC_STICK_RIGHT_X: Double = js.native
  var PS3XC_STICK_RIGHT_Y: Double = js.native
}

@js.native
@JSName("Phaser.GamepadButton")
class GamepadButton protected () extends js.Object {
  def this(pad: Phaser.SinglePad, buttonCode: Double) = this()
  var buttonCode: Double = js.native
  var duration: Double = js.native
  var game: Phaser.Game = js.native
  var isDown: Boolean = js.native
  var isUp: Boolean = js.native
  var onDown: Phaser.Signal = js.native
  var onFloat: Phaser.Signal = js.native
  var onUp: Phaser.Signal = js.native
  var pad: Phaser.Gamepad = js.native
  var repeats: Double = js.native
  var timeDown: Double = js.native
  var timeUp: Double = js.native
  var value: Double = js.native
  def destroy(): Unit = js.native
  def justPressed(duration: Double = ???): Boolean = js.native
  def justReleased(duration: Double = ???): Boolean = js.native
  def processButtonDown(value: Double): Unit = js.native
  def processButtonFloat(value: Double): Unit = js.native
  def processButtonUp(value: Double): Unit = js.native
  def reset(): Unit = js.native
}

@js.native
@JSName("Phaser.Graphics")
class Graphics protected () extends PIXI.Graphics {
  def this(game: Phaser.Game, x: Double = ???, y: Double = ???) = this()
  var angle: Double = js.native
  var alive: Boolean = js.native
  var animations: Phaser.AnimationManager = js.native
  var autoCull: Boolean = js.native
  var body: Phaser.Physics.Arcade.Body | Phaser.Physics.P2.Body | Phaser.Physics.Ninja.Body | js.Any = js.native
  var bottom: Double = js.native
  var cameraOffset: Phaser.Point = js.native
  var checkWorldBounds: Boolean = js.native
  var components: js.Any = js.native
  var debug: Boolean = js.native
  var destroyPhase: Boolean = js.native
  var exists: Boolean = js.native
  var events: Phaser.Events = js.native
  var fixedToCamera: Boolean = js.native
  var key: String | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture = js.native
  var fresh: Boolean = js.native
  var game: Phaser.Game = js.native
  var height: Double = js.native
  var input: Phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var inCamera: Boolean = js.native
  var inWorld: Boolean = js.native
  var left: Double = js.native
  var name: String = js.native
  var lifespan: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var outOfBoundsKill: Boolean = js.native
  var pendingDestroy: Boolean = js.native
  var physicsType: Double = js.native
  var position: Phaser.Point = js.native
  var previousPosition: Phaser.Point = js.native
  var previousRotation: Double = js.native
  var renderOrderID: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var world: Phaser.Point = js.native
  var width: Double = js.native
  var z: Double = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def drawTriangle(points: js.Array[Phaser.Point], cull: Boolean = ???): Unit = js.native
  def drawTriangles(vertices: js.Array[Phaser.Point] | js.Array[Double], indices: js.Array[Double] = ???, cull: Boolean = ???): Unit = js.native
  def kill(): Phaser.Graphics = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def reset(x: Double, y: Double, health: Double = ???): Phaser.Graphics = js.native
  def revive(health: Double = ???): Phaser.Graphics = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("Phaser.Group")
class Group protected () extends PIXI.DisplayObjectContainer {
  def this(game: Phaser.Game, parent: PIXI.DisplayObjectContainer = ???, name: String = ???, addToStage: Boolean = ???, enableBody: Boolean = ???, physicsBodyType: Double = ???) = this()
  var alpha: Double = js.native
  var angle: Double = js.native
  var alive: Boolean = js.native
  var cameraOffset: Phaser.Point = js.native
  var classType: js.Any = js.native
  var cursor: js.Any = js.native
  var cursorIndex: Double = js.native
  var enableBody: Boolean = js.native
  var enableBodyDebug: Boolean = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var game: Phaser.Game = js.native
  var hash: js.Array[PIXI.DisplayObject] = js.native
  var ignoreDestroy: Boolean = js.native
  var length: Double = js.native
  var name: String = js.native
  var onDestroy: Phaser.Signal = js.native
  var pendingDestroy: Boolean = js.native
  var physicsBodyType: Double = js.native
  var physicsType: Double = js.native
  var physicsSortDirection: Double = js.native
  var position: Phaser.Point = js.native
  var rotation: Double = js.native
  var scale: Phaser.Point = js.native
  var total: Double = js.native
  var `type`: Double = js.native
  var visible: Boolean = js.native
  var z: Double = js.native
  def add(child: js.Any, silent: Boolean = ???): js.Dynamic = js.native
  def addAll(property: String, amount: Double, checkAlive: Boolean, checkVisible: Boolean): Unit = js.native
  def addAt(child: js.Any, index: Double, silent: Boolean = ???): js.Dynamic = js.native
  def addMultiple(children: js.Array[js.Any], silent: Boolean = ???): js.Array[js.Any] = js.native
  def addToHash(child: PIXI.DisplayObject): Boolean = js.native
  def bringToTop(child: js.Any): js.Dynamic = js.native
  def callAll(method: String, context: js.Any, parameters: js.Any*): Unit = js.native
  def callAllExists(callback: js.Function, existsValue: Boolean, parameters: js.Any*): Unit = js.native
  def callbackFromArray(child: js.Any, callback: js.Function, length: Double): Unit = js.native
  def checkAll(key: js.Array[String], value: js.Any, checkAlive: Boolean = ???, checkVisible: Boolean = ???, force: Boolean = ???): Boolean = js.native
  def checkProperty(child: js.Any, key: js.Array[String], value: js.Any, force: Boolean = ???): Boolean = js.native
  def countDead(): Double = js.native
  def countLiving(): Double = js.native
  def create(x: Double, y: Double, key: String, frame: js.Any = ???, exists: Boolean = ???): js.Dynamic = js.native
  def createMultiple(quantity: Double, key: String, frame: js.Any = ???, exists: Boolean = ???): Unit = js.native
  def customSort(sortHandler: js.Function, context: js.Any = ???): Unit = js.native
  def destroy(destroyChildren: Boolean = ???, soft: Boolean = ???): Unit = js.native
  def divideAll(property: String, amount: Double, checkAlive: Boolean = ???, checkVisible: Boolean = ???): Unit = js.native
  def forEachAlive(callback: js.Function, callbackContext: js.Any, args: js.Any*): Unit = js.native
  def forEachDead(callback: js.Function, callbackContext: js.Any, args: js.Any*): Unit = js.native
  def forEachExists(callback: js.Function, callbackContext: js.Any): Unit = js.native
  def filter(predicate: js.Function, checkExists: Boolean = ???): ArraySet = js.native
  def getAt(index: Double): PIXI.DisplayObject | Double = js.native
  def getBottom(): js.Dynamic = js.native
  def getFirstAlive(): js.Dynamic = js.native
  def getFirstDead(): js.Dynamic = js.native
  def getFirstExists(exists: Boolean): js.Dynamic = js.native
  def getIndex(child: js.Any): Double = js.native
  def getRandom(startIndex: Double = ???, length: Double = ???): js.Dynamic = js.native
  def getTop(): js.Dynamic = js.native
  def hasProperty(child: js.Any, key: js.Array[String]): Boolean = js.native
  def moveAll(group: Phaser.Group, silent: Boolean = ???): Phaser.Group = js.native
  def moveDown(child: js.Any): js.Dynamic = js.native
  def moveUp(child: js.Any): js.Dynamic = js.native
  def multiplyAll(property: String, amount: Double, checkAlive: Boolean, checkVisible: Boolean): Unit = js.native
  def next(): Unit = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def previous(): Unit = js.native
  def remove(child: js.Any, destroy: Boolean = ???, silent: Boolean = ???): Boolean = js.native
  def removeAll(destroy: Boolean = ???, silent: Boolean = ???): Unit = js.native
  def removeBetween(startIndex: Double, endIndex: Double = ???, destroy: Boolean = ???, silent: Boolean = ???): Unit = js.native
  def removeFromHash(child: PIXI.DisplayObject): Boolean = js.native
  def replace(oldChild: js.Any, newChild: js.Any): js.Dynamic = js.native
  def resetCursor(index: Double = ???): js.Dynamic = js.native
  def reverse(): Unit = js.native
  def sendToBack(child: js.Any): js.Dynamic = js.native
  def set(child: js.Any, key: js.Array[String], value: js.Any, operation: Double = ???, force: Boolean = ???): Boolean = js.native
  def setAll(key: String, value: js.Any, checkAlive: Boolean = ???, checkVisible: Boolean = ???, operation: Double = ???, force: Boolean = ???): Unit = js.native
  def setAllChildren(key: String, value: js.Any, checkAlive: Boolean = ???, checkVisible: Boolean = ???, operation: Double = ???, force: Boolean = ???): Unit = js.native
  def setProperty(child: js.Any, key: js.Array[String], value: js.Any, operation: Double = ???, force: Boolean = ???): Boolean = js.native
  def sort(key: String = ???, order: Double = ???): Unit = js.native
  def subAll(property: String, amount: Double, checkAlive: Boolean, checkVisible: Boolean): Unit = js.native
  def swap(child1: js.Any, child2: js.Any): Boolean = js.native
  def update(): Unit = js.native
  def updateZ(): Unit = js.native
  def xy(index: Double, x: Double, y: Double): Unit = js.native
}

@JSName("Phaser.Group")
@js.native
object Group extends js.Object {
  var RETURN_CHILD: Double = js.native
  var RETURN_NONE: Double = js.native
  var RETURN_TOTAL: Double = js.native
  var SORT_ASCENDING: Double = js.native
  var SORT_DESCENDING: Double = js.native
}

@js.native
@JSName("Phaser.Image")
class Image protected () extends PIXI.Sprite {
  def this(game: Phaser.Game, x: Double, y: Double, key: String | Phaser.RenderTexture | Phaser.BitmapData | PIXI.Texture, frame: String | Double) = this()
  var alive: Boolean = js.native
  var angle: Double = js.native
  var anchor: Phaser.Point = js.native
  var animations: Phaser.AnimationManager = js.native
  var autoCull: Boolean = js.native
  var bottom: Double = js.native
  var cameraOffset: Phaser.Point = js.native
  var components: js.Any = js.native
  var cropRect: Phaser.Rectangle = js.native
  var customRender: Boolean = js.native
  var debug: Boolean = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var deltaZ: Double = js.native
  var destroyPhase: Boolean = js.native
  var events: Phaser.Events = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var frame: String | Double = js.native
  var frameName: String = js.native
  var fresh: Boolean = js.native
  var game: Phaser.Game = js.native
  var inCamera: Boolean = js.native
  var input: Phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var inWorld: Boolean = js.native
  var key: String | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture = js.native
  var lifespan: Double = js.native
  var left: Double = js.native
  var name: String = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var pendingDestroy: Boolean = js.native
  var position: Phaser.Point = js.native
  var previousPosition: Phaser.Point = js.native
  var previousRotation: Double = js.native
  var renderOrderID: Double = js.native
  var right: Double = js.native
  var scale: Phaser.Point = js.native
  var smoothed: Boolean = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var world: Phaser.Point = js.native
  var z: Double = js.native
  def bringToTop(): Phaser.Image = js.native
  def crop(rect: Phaser.Rectangle, copy: Boolean = ???): Unit = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def kill(): Phaser.Image = js.native
  def loadTexture(key: String | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture, frame: String | Double = ???, stopAnimation: Boolean = ???): Unit = js.native
  def resizeFrame(parent: js.Any, width: Double, height: Double): Unit = js.native
  def moveDown(): Phaser.Image = js.native
  def moveUp(): Phaser.Image = js.native
  def overlap(displayObject: Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Button | PIXI.DisplayObject): Boolean = js.native
  def play(name: String, frameRate: Double = ???, loop: Boolean = ???, killOnComplete: Boolean = ???): Phaser.Animation = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def reset(x: Double, y: Double, health: Double = ???): Phaser.Image = js.native
  def resetFrame(): Unit = js.native
  def revive(health: Double = ???): Phaser.Image = js.native
  def sendToBack(): Phaser.Image = js.native
  def setFrame(frame: Phaser.Frame): Unit = js.native
  def update(): Unit = js.native
  def updateCrop(): Unit = js.native
}

@js.native
@JSName("Phaser.ImageCollection")
class ImageCollection protected () extends js.Object {
  def this(name: String, firstgid: Double, width: Double = ???, height: Double = ???, margin: Double = ???, spacing: Double = ???, properties: js.Any = ???) = this()
  var name: String = js.native
  var firstgid: Double = js.native
  var imageWidth: Double = js.native
  var imageHeight: Double = js.native
  var imageMargin: Double = js.native
  var imageSpacing: Double = js.native
  var properties: js.Any = js.native
  var images: js.Array[js.Any] = js.native
  var total: Double = js.native
  def addImage(gid: Double, image: String): Unit = js.native
  def containsImageIndex(imageIndex: Double): Boolean = js.native
}

@js.native
@JSName("Phaser.Input")
class Input protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var activePointer: Phaser.Pointer = js.native
  var circle: Phaser.Circle = js.native
  var enabled: Boolean = js.native
  var doubleTapRate: Double = js.native
  var game: Phaser.Game = js.native
  var gamepad: Phaser.Gamepad = js.native
  var hitCanvas: HTMLCanvasElement = js.native
  var hitContext: CanvasRenderingContext2D = js.native
  var holdRate: Double = js.native
  var interactiveItems: Phaser.ArraySet = js.native
  var justPressedRate: Double = js.native
  var justReleasedRate: Double = js.native
  var keyboard: Phaser.Keyboard = js.native
  var maxPointers: Double = js.native
  var minPriorityID: Double = js.native
  var mouse: Phaser.Mouse = js.native
  var mousePointer: Phaser.Pointer = js.native
  var moveCallbacks: js.Array[js.Function3[Phaser.Pointer, Double, Double, Unit]] = js.native
  var mspointer: Phaser.MSPointer = js.native
  var multiInputOverride: Double = js.native
  var onDown: Phaser.Signal = js.native
  var onHold: Phaser.Signal = js.native
  var onTap: Phaser.Signal = js.native
  var onUp: Phaser.Signal = js.native
  var pointer1: Phaser.Pointer = js.native
  var pointer2: Phaser.Pointer = js.native
  var pointer3: Phaser.Pointer = js.native
  var pointer4: Phaser.Pointer = js.native
  var pointer5: Phaser.Pointer = js.native
  var pointer6: Phaser.Pointer = js.native
  var pointer7: Phaser.Pointer = js.native
  var pointer8: Phaser.Pointer = js.native
  var pointer9: Phaser.Pointer = js.native
  var pointer10: Phaser.Pointer = js.native
  var pollLocked: Boolean = js.native
  var pollRate: Double = js.native
  var position: Phaser.Point = js.native
  var pointer: js.Array[Phaser.Pointer] = js.native
  var recordLimit: Double = js.native
  var recordPointerHistory: Boolean = js.native
  var recordRate: Double = js.native
  var resetLocked: Boolean = js.native
  var scale: Phaser.Point = js.native
  var speed: Phaser.Point = js.native
  var tapRate: Double = js.native
  var totalActivePointers: Double = js.native
  var totalInactivePointers: Double = js.native
  var touch: Phaser.Touch = js.native
  var worldX: Double = js.native
  var worldY: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def addPointer(): Phaser.Pointer = js.native
  def addMoveCallback(callback: js.Function, context: js.Any): Double = js.native
  def boot(): Unit = js.native
  def countActivePointers(limit: Double = ???): Double = js.native
  def deleteMoveCallback(callback: js.Function, context: js.Any = ???): Unit = js.native
  def destroy(): Unit = js.native
  def getLocalPosition(displayObject: js.Any, pointer: Phaser.Pointer): Phaser.Point = js.native
  def getPointer(isActive: Boolean = ???): Phaser.Pointer = js.native
  def getPointerFromId(pointerID: Double): Phaser.Pointer = js.native
  def getPointerFromIdentifier(identifier: Double): Phaser.Pointer = js.native
  def hitTest(displayObject: PIXI.DisplayObject, pointer: Phaser.Pointer, localPoint: Phaser.Point): Unit = js.native
  def reset(hard: Boolean = ???): Unit = js.native
  def resetSpeed(x: Double, y: Double): Unit = js.native
  def startPointer(event: js.Any): Phaser.Pointer = js.native
  def stopPointer(event: js.Any): Phaser.Pointer = js.native
  def update(): Unit = js.native
  def updatePointer(event: js.Any): Phaser.Pointer = js.native
}

@JSName("Phaser.Input")
@js.native
object Input extends js.Object {
  var MAX_POINTERS: Double = js.native
  var MOUSE_OVERRIDES_TOUCH: Double = js.native
  var MOUSE_TOUCH_COMBINE: Double = js.native
  var TOUCH_OVERRIDES_MOUSE: Double = js.native
}

@js.native
@JSName("Phaser.InputHandler")
class InputHandler protected () extends js.Object {
  def this(sprite: Phaser.Sprite) = this()
  var allowHorizontalDrag: Boolean = js.native
  var allowVerticalDrag: Boolean = js.native
  var boundsRect: Phaser.Rectangle = js.native
  var boundsSprite: Phaser.Sprite = js.native
  var bringToTop: Boolean = js.native
  var consumePointerEvent: Boolean = js.native
  var dragOffset: Phaser.Point = js.native
  var dragFromCenter: Boolean = js.native
  var draggable: Boolean = js.native
  var dragStartPoint: Phaser.Point = js.native
  var enabled: Boolean = js.native
  var game: Phaser.Game = js.native
  def globalToLocalX(x: Double): Double = js.native
  def globalToLocalY(y: Double): Double = js.native
  var isDragged: Boolean = js.native
  var pixelPerfectAlpha: Double = js.native
  var pixelPerfectClick: Boolean = js.native
  var pixelPerfectOver: Boolean = js.native
  var priorityID: Double = js.native
  var scaleLayer: Boolean = js.native
  var snapOffset: Phaser.Point = js.native
  var snapOffsetX: Double = js.native
  var snapOffsetY: Double = js.native
  var snapOnDrag: Boolean = js.native
  var snapOnRelease: Boolean = js.native
  var snapPoint: Phaser.Point = js.native
  var snapX: Double = js.native
  var snapY: Double = js.native
  var sprite: Phaser.Sprite = js.native
  var useHandCursor: Boolean = js.native
  def checkBoundsRect(): Unit = js.native
  def checkBoundsSprite(): Unit = js.native
  def checkPixel(x: Double, y: Double, pointer: Phaser.Pointer = ???): Boolean = js.native
  def checkPointerDown(pointer: Phaser.Pointer, fastTest: Boolean = ???): Boolean = js.native
  def checkPointerOver(pointer: Phaser.Pointer, fastTest: Boolean = ???): Boolean = js.native
  def destroy(): Unit = js.native
  def disableDrag(): Unit = js.native
  def disableSnap(): Unit = js.native
  def downDuration(pointer: Phaser.Pointer): Double = js.native
  def enableDrag(lockCenter: Boolean = ???, bringToTop: Boolean = ???, pixelPerfect: Boolean = ???, alphaThreshold: Double = ???, boundsRect: Phaser.Rectangle = ???, boundsSprite: Phaser.Sprite = ???): Unit = js.native
  def enableSnap(snapX: Double, snapY: Double, onDrag: Boolean = ???, onRelease: Boolean = ???, snapOffsetX: Double = ???, snapOffsetY: Double = ???): Unit = js.native
  def isPixelPerfect(): Boolean = js.native
  def justOut(pointer: Double, delay: Double): Boolean = js.native
  def justOver(pointer: Double, delay: Double): Boolean = js.native
  def justPressed(pointer: Double, delay: Double): Boolean = js.native
  def justReleased(pointer: Double, delay: Double): Boolean = js.native
  def overDuration(pointer: Phaser.Pointer): Double = js.native
  def pointerDown(pointer: Double): Boolean = js.native
  def pointerDragged(pointer: Phaser.Pointer): Boolean = js.native
  def pointerOut(index: Double): Boolean = js.native
  def pointerOver(index: Double): Boolean = js.native
  def pointerTimeDown(pointer: Phaser.Pointer): Double = js.native
  def pointerTimeOut(pointer: Phaser.Pointer): Double = js.native
  def pointerTimeOver(pointer: Double): Double = js.native
  def pointerTimeUp(pointer: Double): Double = js.native
  def pointerUp(pointer: Double): Boolean = js.native
  def pointerX(pointer: Double): Double = js.native
  def pointerY(pointer: Double): Double = js.native
  def reset(): Unit = js.native
  def setDragLock(allowHorizontal: Boolean = ???, allowVertical: Boolean = ???): Unit = js.native
  def start(priority: Double, useHandCursor: Boolean): Phaser.Sprite = js.native
  def startDrag(pointer: Phaser.Pointer): Unit = js.native
  def stop(): Unit = js.native
  def stopDrag(pointer: Phaser.Pointer): Unit = js.native
  def update(pointer: Phaser.Pointer): Unit = js.native
  def updateDrag(pointer: Phaser.Pointer): Boolean = js.native
  def validForInput(highestID: Double, highestRenderID: Double, includePixelPerfect: Boolean = ???): Boolean = js.native
}

@js.native
@JSName("Phaser.Key")
class Key protected () extends js.Object {
  def this(game: Phaser.Game, keycode: Double) = this()
  var altKey: Boolean = js.native
  var ctrlKey: Boolean = js.native
  var duration: Double = js.native
  var enabled: Boolean = js.native
  var event: js.Any = js.native
  var game: Phaser.Game = js.native
  var isDown: Boolean = js.native
  var isUp: Boolean = js.native
  var _justDown: Boolean = js.native
  var justDown: Boolean = js.native
  var _justUp: Boolean = js.native
  var justUp: Boolean = js.native
  var keyCode: Double = js.native
  var onDown: Phaser.Signal = js.native
  var onHoldCallback: js.Function = js.native
  var onHoldContext: js.Any = js.native
  var onUp: Phaser.Signal = js.native
  var repeats: Double = js.native
  var shiftKey: Boolean = js.native
  var timeDown: Double = js.native
  var timeUp: Double = js.native
  def downDuration(duration: Double = ???): Boolean = js.native
  def processKeyDown(event: KeyboardEvent): Unit = js.native
  def processKeyUp(event: KeyboardEvent): Unit = js.native
  def reset(hard: Boolean = ???): Unit = js.native
  def update(): Unit = js.native
  def upDuration(duration: Double = ???): Boolean = js.native
}

@js.native
@JSName("Phaser.Keyboard")
class Keyboard protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var callbackContext: js.Any = js.native
  var enabled: Boolean = js.native
  var event: js.Any = js.native
  var game: Phaser.Game = js.native
  var lastChar: String = js.native
  var lastKey: Phaser.Key = js.native
  var onDownCallback: js.Function = js.native
  var onPressCallback: js.Function = js.native
  var onUpCallback: js.Function = js.native
  var pressEvent: js.Any = js.native
  def addCallbacks(context: js.Any, onDown: js.Function = ???, onUp: js.Function = ???, onPress: js.Function = ???): Unit = js.native
  def addKey(keycode: Double): Phaser.Key = js.native
  def addKeys(keys: js.Array[js.Any]): js.Dynamic = js.native
  def addKeyCapture(keycode: js.Any): Unit = js.native
  def createCursorKeys(): Phaser.CursorKeys = js.native
  def clearCaptures(): Unit = js.native
  def destroy(): Unit = js.native
  def downDuration(keycode: Double, duration: Double = ???): Boolean = js.native
  def isDown(keycode: Double): Boolean = js.native
  def processKeyDown(event: KeyboardEvent): Unit = js.native
  def processKeyPress(event: KeyboardEvent): Unit = js.native
  def processKeyUp(event: KeyboardEvent): Unit = js.native
  def removeKey(keycode: Double): Unit = js.native
  def removeKeyCapture(keycode: Double): Unit = js.native
  def reset(hard: Boolean = ???): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def update(): Unit = js.native
  def upDuration(keycode: Double, duration: Double = ???): Boolean = js.native
}

@JSName("Phaser.Keyboard")
@js.native
object Keyboard extends js.Object {
  var A: Double = js.native
  var B: Double = js.native
  var C: Double = js.native
  var D: Double = js.native
  var E: Double = js.native
  var F: Double = js.native
  var G: Double = js.native
  var H: Double = js.native
  var I: Double = js.native
  var J: Double = js.native
  var K: Double = js.native
  var L: Double = js.native
  var M: Double = js.native
  var N: Double = js.native
  var O: Double = js.native
  var P: Double = js.native
  var Q: Double = js.native
  var R: Double = js.native
  var S: Double = js.native
  var T: Double = js.native
  var U: Double = js.native
  var V: Double = js.native
  var W: Double = js.native
  var X: Double = js.native
  var Y: Double = js.native
  var Z: Double = js.native
  var ZERO: Double = js.native
  var ONE: Double = js.native
  var TWO: Double = js.native
  var THREE: Double = js.native
  var FOUR: Double = js.native
  var FIVE: Double = js.native
  var SIX: Double = js.native
  var SEVEN: Double = js.native
  var EIGHT: Double = js.native
  var NINE: Double = js.native
  var NUMPAD_0: Double = js.native
  var NUMPAD_1: Double = js.native
  var NUMPAD_2: Double = js.native
  var NUMPAD_3: Double = js.native
  var NUMPAD_4: Double = js.native
  var NUMPAD_5: Double = js.native
  var NUMPAD_6: Double = js.native
  var NUMPAD_7: Double = js.native
  var NUMPAD_8: Double = js.native
  var NUMPAD_9: Double = js.native
  var NUMPAD_MULTIPLY: Double = js.native
  var NUMPAD_ADD: Double = js.native
  var NUMPAD_ENTER: Double = js.native
  var NUMPAD_SUBTRACT: Double = js.native
  var NUMPAD_DECIMAL: Double = js.native
  var NUMPAD_DIVIDE: Double = js.native
  var F1: Double = js.native
  var F2: Double = js.native
  var F3: Double = js.native
  var F4: Double = js.native
  var F5: Double = js.native
  var F6: Double = js.native
  var F7: Double = js.native
  var F8: Double = js.native
  var F9: Double = js.native
  var F10: Double = js.native
  var F11: Double = js.native
  var F12: Double = js.native
  var F13: Double = js.native
  var F14: Double = js.native
  var F15: Double = js.native
  var COLON: Double = js.native
  var EQUALS: Double = js.native
  var COMMA: Double = js.native
  var UNDERSCORE: Double = js.native
  var PERIOD: Double = js.native
  var QUESTION_MARK: Double = js.native
  var TILDE: Double = js.native
  var OPEN_BRACKET: Double = js.native
  var BACKWARD_SLASH: Double = js.native
  var CLOSED_BRACKET: Double = js.native
  var QUOTES: Double = js.native
  var BACKSPACE: Double = js.native
  var TAB: Double = js.native
  var CLEAR: Double = js.native
  var ENTER: Double = js.native
  var SHIFT: Double = js.native
  var CONTROL: Double = js.native
  var ALT: Double = js.native
  var CAPS_LOCK: Double = js.native
  var ESC: Double = js.native
  var SPACEBAR: Double = js.native
  var PAGE_UP: Double = js.native
  var PAGE_DOWN: Double = js.native
  var END: Double = js.native
  var HOME: Double = js.native
  var LEFT: Double = js.native
  var UP: Double = js.native
  var RIGHT: Double = js.native
  var DOWN: Double = js.native
  var INSERT: Double = js.native
  var DELETE: Double = js.native
  var HELP: Double = js.native
  var NUM_LOCK: Double = js.native
  var PLUS: Double = js.native
  var MINUS: Double = js.native
}

@js.native
@JSName("Phaser.Line")
class Line protected () extends js.Object {
  def this(x1: Double = ???, y1: Double = ???, x2: Double = ???, y2: Double = ???) = this()
  var angle: Double = js.native
  var end: Phaser.Point = js.native
  var height: Double = js.native
  var left: Double = js.native
  var length: Double = js.native
  var normalAngle: Double = js.native
  var normalX: Double = js.native
  var normalY: Double = js.native
  var perpSlope: Double = js.native
  var right: Double = js.native
  var slope: Double = js.native
  var start: Phaser.Point = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def centerOn(x: Double, y: Double): Phaser.Line = js.native
  def clone(output: Phaser.Line): Phaser.Line = js.native
  def coordinatesOnLine(stepRate: Double, results: js.Array[js.Any]): js.Array[js.Any] = js.native
  def fromAngle(x: Double, y: Double, angle: Double, length: Double): Phaser.Line = js.native
  def fromSprite(startSprite: Phaser.Sprite, endSprite: Phaser.Sprite, useCenter: Boolean = ???): Phaser.Line = js.native
  def intersects(line: Phaser.Line, asSegment: Boolean = ???, result: Phaser.Point = ???): Phaser.Point = js.native
  def midPoint(out: Phaser.Point = ???): Phaser.Point = js.native
  def pointOnLine(x: Double, y: Double): Boolean = js.native
  def pointOnSegment(x: Double, y: Double): Boolean = js.native
  def random(out: Phaser.Point = ???): Phaser.Point = js.native
  def reflect(line: Phaser.Line): Double = js.native
  def rotate(angle: Double, asDegrees: Boolean = ???): Phaser.Line = js.native
  def rotateAround(x: Double, y: Double, angle: Double, asDegrees: Boolean = ???): Phaser.Line = js.native
  def setTo(x1: Double = ???, y1: Double = ???, x2: Double = ???, y2: Double = ???): Phaser.Line = js.native
}

@JSName("Phaser.Line")
@js.native
object Line extends js.Object {
  def intersectsPoints(a: Phaser.Point, b: Phaser.Point, e: Phaser.Point, f: Phaser.Point, asSegment: Boolean = ???, result: Phaser.Point = ???): Phaser.Point = js.native
  def intersects(a: Phaser.Line, b: Phaser.Line, asSegment: Boolean = ???, result: Phaser.Point = ???): Phaser.Point = js.native
  def reflect(a: Phaser.Line, b: Phaser.Line): Double = js.native
}

@js.native
@JSName("Phaser.LinkedList")
class LinkedList extends js.Object {
  var first: js.Any = js.native
  var last: js.Any = js.native
  var next: js.Any = js.native
  var prev: js.Any = js.native
  var total: Double = js.native
  def add(item: js.Any): js.Dynamic = js.native
  def callAll(callback: js.Function): Unit = js.native
  def remove(item: js.Any): Unit = js.native
  def reset(): Unit = js.native
}

@js.native
@JSName("Phaser.Loader")
class Loader protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var baseURL: String = js.native
  var cache: Phaser.Cache = js.native
  var crossOrigin: Boolean | String = js.native
  var enableParallel: Boolean = js.native
  var game: Phaser.Game = js.native
  var hasLoaded: Boolean = js.native
  var isLoading: Boolean = js.native
  var maxParallelDownloads: Double = js.native
  var onFileStart: Phaser.Signal = js.native
  var onFileComplete: Phaser.Signal = js.native
  var onFileError: Phaser.Signal = js.native
  var onLoadComplete: Phaser.Signal = js.native
  var onLoadStart: Phaser.Signal = js.native
  var onPackComplete: Phaser.Signal = js.native
  var path: String = js.native
  var preloadSprite: js.Any = js.native
  var progress: Double = js.native
  var progressFloat: Double = js.native
  var resetLocked: Boolean = js.native
  var useXDomainRequest: Boolean = js.native
  def asyncComplete(file: js.Any, errorMessage: String = ???): Unit = js.native
  def addSyncPoint(`type`: String, key: String): Phaser.Loader = js.native
  def addToFileList(`type`: String, key: String, url: String = ???, properties: js.Any = ???, overwrite: Boolean = ???, extension: String = ???): Phaser.Loader = js.native
  def atlas(key: String, textureURL: String = ???, atlasURL: String = ???, atlasData: js.Any = ???, format: Double = ???): Phaser.Loader = js.native
  def atlasJSONArray(key: String, textureURL: String = ???, atlasURL: String = ???, atlasData: js.Any = ???): Phaser.Loader = js.native
  def atlasJSONHash(key: String, textureURL: String = ???, atlasURL: String = ???, atlasData: js.Any = ???): Phaser.Loader = js.native
  def atlasXML(key: String, textureURL: String = ???, atlasURL: String = ???, atlasData: js.Any = ???): Phaser.Loader = js.native
  def audio(key: String, urls: String | js.Array[String] | js.Any, autoDecode: Boolean = ???): Phaser.Loader = js.native
  def audiosprite(key: String, urls: js.Array[String], jsonURL: String = ???, jsonData: String | js.Any = ???, autoDecode: Boolean = ???): Phaser.Loader = js.native
  def binary(key: String, url: String = ???, callback: js.Function = ???, callbackContext: js.Any = ???): Phaser.Loader = js.native
  def bitmapFont(key: String, textureURL: String = ???, atlasURL: String = ???, atlasData: js.Any = ???, xSpacing: Double = ???, ySpacing: Double = ???): Phaser.Loader = js.native
  def checkKeyExists(`type`: String, key: String): Boolean = js.native
  def csvLoadComplete(file: js.Any, xhr: XMLHttpRequest): Unit = js.native
  def fileComplete(file: js.Any, xhr: XMLHttpRequest): Unit = js.native
  def fileError(file: js.Any, xhr: XMLHttpRequest, reason: String): Unit = js.native
  def finishedLoading(abnormal: Boolean = ???): Unit = js.native
  def getAsset(`type`: String, key: String): js.Dynamic = js.native
  def getAssetIndex(`type`: String, key: String): Double = js.native
  def getAudioURL(urls: js.Array[js.Any]): Unit = js.native
  def image(key: String, url: String = ???, overwrite: Boolean = ???): Phaser.Loader = js.native
  def images(keys: js.Array[String], urls: js.Array[String] = ???): Phaser.Loader = js.native
  def json(key: String, url: String = ???, overwrite: Boolean = ???): Phaser.Loader = js.native
  def jsonLoadComplete(file: js.Any, xhr: XMLHttpRequest): Unit = js.native
  def loadAudioTag(file: js.Any): Unit = js.native
  def loadFile(file: js.Any): Unit = js.native
  def loadImageTag(file: js.Any): Unit = js.native
  def pack(key: String, url: String = ???, data: js.Any = ???, callbackContext: js.Any = ???): Phaser.Loader = js.native
  def parseXml(data: String): XMLDocument = js.native
  def physics(key: String, url: String = ???, data: js.Any = ???, format: String = ???): Phaser.Loader = js.native
  def processLoadQueue(): Unit = js.native
  def processPack(pack: js.Any): Unit = js.native
  def removeAll(): Unit = js.native
  def removeFile(`type`: String, key: String): Unit = js.native
  def replaceInFileList(`type`: String, key: String, url: String, properties: js.Any): Unit = js.native
  def reset(hard: Boolean = ???, clearEvents: Boolean = ???): Unit = js.native
  def resize(): Unit = js.native
  def script(key: String, url: String = ???, callback: js.Function = ???, callbackContext: js.Any = ???): Phaser.Loader = js.native
  def shader(key: String, url: String = ???, overwrite: Boolean = ???): Phaser.Loader = js.native
  def setPreloadSprite(sprite: Phaser.Sprite | Phaser.Image, direction: Double = ???): Unit = js.native
  def spritesheet(key: String, url: String, frameWidth: Double, frameHeight: Double, frameMax: Double = ???, margin: Double = ???, spacing: Double = ???): Phaser.Loader = js.native
  def start(): Unit = js.native
  def text(key: String, url: String = ???, overwrite: Boolean = ???): Phaser.Loader = js.native
  def tilemap(key: String, url: String = ???, data: js.Any = ???, format: Double = ???): Phaser.Loader = js.native
  def totalLoadedFiles(): Double = js.native
  def totalLoadedPacks(): Double = js.native
  def totalQueuedFiles(): Double = js.native
  def totalQueuedPacks(): Double = js.native
  def transformUrl(url: String, file: js.Any = ???): String = js.native
  def updateProgress(): Unit = js.native
  def video(key: String, urls: String | js.Array[String] | js.Any, loadEvent: String = ???, asBlob: Boolean = ???): Phaser.Loader = js.native
  def withSyncPoint(callback: js.Function, callbackContext: js.Any = ???): Phaser.Loader = js.native
  def xml(key: String, url: String = ???, overwrite: Boolean = ???): Phaser.Loader = js.native
  def xhrLoad(file: js.Any, url: String, `type`: String, onload: js.Function, onerror: js.Function = ???): Unit = js.native
  def xhrLoadWithXDR(file: js.Any, url: String, `type`: String, onload: js.Function, onerror: js.Function = ???): Unit = js.native
  def xmlLoadComplete(file: js.Any, xhr: XMLHttpRequest): Unit = js.native
}

@JSName("Phaser.Loader")
@js.native
object Loader extends js.Object {
  var PHYSICS_LIME_CORONA_JSON: Double = js.native
  var PHYSICS_PHASER_JSON: Double = js.native
  var TEXTURE_ATLAS_JSON_ARRAY: Double = js.native
  var TEXTURE_ATLAS_JSON_HASH: Double = js.native
  var TEXTURE_ATLAS_XML_STARLING: Double = js.native
}

@js.native
@JSName("Phaser.LoaderParser")
class LoaderParser extends js.Object {
}

@JSName("Phaser.LoaderParser")
@js.native
object LoaderParser extends js.Object {
  def bitmapFont(xml: js.Any, baseTexture: PIXI.BaseTexture, xSpacing: Double = ???, ySpacing: Double = ???): js.Dynamic = js.native
  def xmlBitmapFont(xml: js.Any, baseTexture: PIXI.BaseTexture, xSpacing: Double = ???, ySpacing: Double = ???): js.Dynamic = js.native
  def jsonBitmapFont(json: js.Any, baseTexture: PIXI.BaseTexture, xSpacing: Double = ???, ySpacing: Double = ???): js.Dynamic = js.native
}

@js.native
@JSName("Phaser.Matrix")
class Matrix protected () extends PIXI.Matrix {
  def this(a: Double = ???, b: Double = ???, c: Double = ???, d: Double = ???, tx: Double = ???, ty: Double = ???) = this()
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var tx: Double = js.native
  var ty: Double = js.native
  var `type`: Double = js.native
  @JSName("apply")
  def apply(pos: Phaser.Point, newPos: Phaser.Point = ???): Phaser.Point = js.native
  def applyInverse(pos: Phaser.Point, newPos: Phaser.Point = ???): Phaser.Point = js.native
  def clone(output: Phaser.Matrix = ???): Phaser.Matrix = js.native
  def copyFrom(matrix: Phaser.Matrix): Phaser.Matrix = js.native
  def copyTo(matrix: Phaser.Matrix): Phaser.Matrix = js.native
  def fromArray(array: js.Array[Double]): Phaser.Matrix = js.native
  def setTo(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Phaser.Matrix = js.native
  def toArray(transpose: Boolean = ???, array: js.Array[Double] = ???): js.Array[Double] = js.native
  def translate(x: Double, y: Double): Phaser.Matrix = js.native
  def scale(x: Double, y: Double): Phaser.Matrix = js.native
  def rotate(angle: Double): Phaser.Matrix = js.native
  def append(matrix: Phaser.Matrix): Phaser.Matrix = js.native
  def identity(): Phaser.Matrix = js.native
}

@js.native
@JSName("Phaser.Math")
class Math extends js.Object {
}

@JSName("Phaser.Math")
@js.native
object Math extends js.Object {
  def angleBetween(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def angleBetweenPoints(point1: Phaser.Point, point2: Phaser.Point): Double = js.native
  def angleBetweenY(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def angleBetweenPointsY(point1: Phaser.Point, point2: Phaser.Point): Double = js.native
  def average(numbers: Double*): Double = js.native
  def bernstein(n: Double, i: Double): Double = js.native
  def bezierInterpolation(v: js.Array[Double], k: Double): Double = js.native
  def catmullRom(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
  def catmullRomInterpolation(v: js.Array[Double], k: Double): Double = js.native
  def ceilTo(value: Double, place: Double = ???, base: Double = ???): Double = js.native
  def clamp(x: Double, a: Double, b: Double): Double = js.native
  def clampBottom(x: Double, a: Double): Double = js.native
  def degToRad(degrees: Double): Double = js.native
  def difference(a: Double, b: Double): Double = js.native
  def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def distanceSq(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def distancePow(xy: Double, y1: Double, x2: Double, y2: Double, pow: Double = ???): Double = js.native
  def factorial(value: Double): Double = js.native
  def floorTo(value: Double, place: Double, base: Double): Double = js.native
  def fuzzyCeil(`val`: Double, epsilon: Double = ???): Boolean = js.native
  def fuzzyEqual(a: Double, b: Double, epsilon: Double = ???): Boolean = js.native
  def fuzzyLessThan(a: Number, b: Double, epsilon: Double = ???): Boolean = js.native
  def fuzzyFloor(`val`: Double, epsilon: Double = ???): Boolean = js.native
  def fuzzyGreaterThan(a: Double, b: Double, epsilon: Double = ???): Boolean = js.native
  def fuzzyLessThan(a: Double, b: Double, epsilon: Double = ???): Boolean = js.native
  def isEven(n: Double): Boolean = js.native
  def isOdd(n: Double): Boolean = js.native
  def linear(p0: Double, p1: Double, t: Double): Double = js.native
  def linearInterpolation(v: js.Array[Double], k: Double): Double = js.native
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double = js.native
  def max(numbers: Double*): Double = js.native
  def maxAdd(value: Double, amount: Double, max: Double): Double = js.native
  def maxProperty(numbers: Double*): Double = js.native
  def min(numbers: Double*): Double = js.native
  def minProperty(numbers: Double*): Double = js.native
  def minSub(value: Double, amount: Double, min: Double): Double = js.native
  def normalizeAngle(angle: Double, radians: Boolean = ???): Double = js.native
  def percent(a: Double, b: Double, base: Double = ???): Double = js.native
  def p2px(v: Double): Double = js.native
  var PI2: Double = js.native
  def radToDeg(radians: Double): Double = js.native
  def reverseAngle(angleRed: Double): Double = js.native
  def roundAwayFromZero(value: Double): Double = js.native
  def roundTo(value: Double, place: Double = ???, base: Double = ???): Double = js.native
  def shear(n: Double): Double = js.native
  def sign(x: Double): Double = js.native
  def sinCosGenerator(length: Double, sinAmplitude: Double = ???, cosAmplitude: Double = ???, frequency: Double = ???): js.Any = js.native
  def smootherstep(x: Double, min: Double, max: Double): Double = js.native
  def smoothstep(x: Double, min: Double, max: Double): Double = js.native
  def snapTo(input: Double, gap: Double, start: Double = ???): Double = js.native
  def snapToCeil(input: Double, gap: Double, start: Double = ???): Double = js.native
  def snapToFloor(input: Double, gap: Double, start: Double = ???): Double = js.native
  def within(a: Double, b: Double, tolerance: Double): Boolean = js.native
  def wrap(value: Double, min: Double, max: Double): Double = js.native
  def wrapAngle(angle: Double, radians: Boolean = ???): Double = js.native
  def wrapValue(value: Double, amount: Double, max: Double): Double = js.native
}

@js.native
trait WheelEventProxy extends js.Object {
  def bindEvent(event: js.Any): WheelEventProxy = js.native
  var `type`: String = js.native
  var deltaMode: Double = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var deltaZ: Double = js.native
}

@js.native
@JSName("Phaser.Mouse")
class Mouse protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var button: Double = js.native
  var callbackContext: js.Any = js.native
  var capture: Boolean = js.native
  var enabled: Boolean = js.native
  var event: MouseEvent = js.native
  var game: Phaser.Game = js.native
  var input: Phaser.Input = js.native
  var locked: Boolean = js.native
  var mouseDownCallback: js.Function1[MouseEvent, Unit] = js.native
  var mouseOutCallback: js.Function1[MouseEvent, Unit] = js.native
  var mouseOverCallback: js.Function1[MouseEvent, Unit] = js.native
  var mouseUpCallback: js.Function1[MouseEvent, Unit] = js.native
  var mouseWheelCallback: js.Function1[MouseEvent, Unit] = js.native
  var _onMouseDown: js.Function1[MouseEvent, Unit] = js.native
  var _onMouseMove: js.Function1[MouseEvent, Unit] = js.native
  var _onMouseUp: js.Function1[MouseEvent, Unit] = js.native
  var _onMouseOut: js.Function1[MouseEvent, Unit] = js.native
  var _onMouseOver: js.Function1[MouseEvent, Unit] = js.native
  var _onMouseWheel: js.Function1[MouseEvent, Unit] = js.native
  var _wheelEvent: WheelEventProxy = js.native
  var pointerLock: Phaser.Signal = js.native
  var stopOnGameOut: Boolean = js.native
  var wheelDelta: Double = js.native
  def onMouseDown(event: MouseEvent): Unit = js.native
  def onMouseMove(event: MouseEvent): Unit = js.native
  def onMouseOut(event: MouseEvent): Unit = js.native
  def onMouseOver(event: MouseEvent): Unit = js.native
  def onMouseUp(event: MouseEvent): Unit = js.native
  def onMouseUpGlobal(event: MouseEvent): Unit = js.native
  def onMouseWheel(event: MouseEvent): Unit = js.native
  def pointerLockChange(event: MouseEvent): Unit = js.native
  def releasePointerLock(): Unit = js.native
  def requestPointerLock(): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

@JSName("Phaser.Mouse")
@js.native
object Mouse extends js.Object {
  var NO_BUTTON: Double = js.native
  var LEFT_BUTTON: Double = js.native
  var MIDDLE_BUTTON: Double = js.native
  var RIGHT_BUTTON: Double = js.native
  var BACK_BUTTON: Double = js.native
  var FORWARD_BUTTON: Double = js.native
  var WHEEL_DOWN: Double = js.native
  var WHEEL_UP: Double = js.native
}

@js.native
@JSName("Phaser.MSPointer")
class MSPointer protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var button: Double = js.native
  var capture: Boolean = js.native
  var callbackContext: js.Any = js.native
  var event: MSPointerEvent = js.native
  var game: Phaser.Game = js.native
  var input: Phaser.Input = js.native
  var onPointerDown: js.Function1[MSPointerEvent, Unit] = js.native
  var onPointerMove: js.Function1[MSPointerEvent, Unit] = js.native
  var onPointerUp: js.Function1[MSPointerEvent, Unit] = js.native
  var mouseDownCallback: js.Function1[MSPointerEvent, Unit] = js.native
  var mouseMoveCallback: js.Function1[MSPointerEvent, Unit] = js.native
  var mouseUpCallback: js.Function1[MSPointerEvent, Unit] = js.native
  var pointerDownCallback: js.Function1[MSPointerEvent, Unit] = js.native
  var pointerMoveCallback: js.Function1[MSPointerEvent, Unit] = js.native
  var pointerUpCallback: js.Function1[MSPointerEvent, Unit] = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

@js.native
@JSName("Phaser.Net")
class Net protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var game: Phaser.Game = js.native
  def checkDomainName(domain: String): Boolean = js.native
  def decodeURI(value: String): String = js.native
  def getHostName(): String = js.native
  def getQueryString(parameter: String = ???): String = js.native
  def updateQueryString(key: String, value: js.Any, redirect: Boolean = ???, url: String = ???): String = js.native
}

@js.native
@JSName("Phaser.Particle")
class Particle protected () extends Phaser.Sprite {
  def this(game: Phaser.Game, x: Double, y: Double, key: js.Any = ???, frame: js.Any = ???) = this()
  var fresh: Boolean = js.native
  def onEmit(): Unit = js.native
  def reset(x: Double, y: Double, health: Double = ???): Phaser.Particle = js.native
  def setAlphaData(data: js.Array[js.Any]): Unit = js.native
  def setScaleData(data: js.Array[js.Any]): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("Phaser.Particles")
class Particles protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var emitters: js.Any = js.native
  var game: Phaser.Game = js.native
  var ID: Double = js.native
  def add(emitter: Phaser.Particles.Arcade.Emitter): Phaser.Particles.Arcade.Emitter = js.native
  def remove(emitter: Phaser.Particles.Arcade.Emitter): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.Particles")
@js.native
object Particles extends js.Object {

@JSName("Phaser.Particles.Arcade")
@js.native
object Arcade extends js.Object {

@js.native
@JSName("Phaser.Particles.Arcade.Emitter")
class Emitter protected () extends Phaser.Group {
  def this(game: Phaser.Game, x: Double = ???, y: Double = ???, maxParticles: Double = ???) = this()
  var alphaData: js.Array[js.Any] = js.native
  var autoAlpha: Boolean = js.native
  var autoScale: Boolean = js.native
  var angle: Double = js.native
  var angularDrag: Double = js.native
  var bottom: Double = js.native
  var bounce: Phaser.Point = js.native
  var emitX: Double = js.native
  var emitY: Double = js.native
  var exists: Boolean = js.native
  var frequency: Double = js.native
  var gravity: Double = js.native
  var group: Phaser.Group = js.native
  var height: Double = js.native
  var left: Double = js.native
  var lifespan: Double = js.native
  var maxParticles: Double = js.native
  var maxParticleScale: Double = js.native
  var maxParticleSpeed: Phaser.Point = js.native
  var maxRotation: Double = js.native
  var minParticleScale: Double = js.native
  var minParticleSpeed: Phaser.Point = js.native
  var minRotation: Double = js.native
  var name: String = js.native
  var on: Boolean = js.native
  var particleBringToTop: Boolean = js.native
  var particleSendToBack: Boolean = js.native
  var particleClass: Phaser.Sprite = js.native
  var particleDrag: Phaser.Point = js.native
  var physicsType: Double = js.native
  var position: Phaser.Point = js.native
  var right: Double = js.native
  var scaleData: js.Array[js.Any] = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def at(`object`: js.Any): Unit = js.native
  def emitParticle(): Unit = js.native
  def explode(lifespan: Double = ???, quantity: Double = ???): Unit = js.native
  def flow(lifespan: Double = ???, frequency: Double = ???, quantity: Double = ???, total: Double = ???, immediate: Boolean = ???): Unit = js.native
  def kill(): Unit = js.native
  def makeParticles(keys: js.Any, frames: js.Any = ???, quantity: Double = ???, collide: Boolean = ???, collideWorldBounds: Boolean = ???): Phaser.Particles.Arcade.Emitter = js.native
  def reset(x: Double, y: Double, health: Double = ???): Phaser.Particles = js.native
  def setAlpha(min: Double = ???, max: Double = ???, rate: Double = ???, ease: js.Function1[Double, Double] = ???, yoyo: Boolean = ???): Unit = js.native
  def setRotation(min: Double = ???, max: Double = ???): Unit = js.native
  def setScale(minX: Double = ???, maxX: Double = ???, minY: Double = ???, maxY: Double = ???, rate: Double = ???, ease: js.Function1[Double, Double] = ???, yoyo: Boolean = ???): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def setXSpeed(min: Double, max: Double): Unit = js.native
  def setYSpeed(min: Double, max: Double): Unit = js.native
  def start(explode: Boolean = ???, lifespan: Double = ???, frequency: Double = ???, quantity: Double = ???, forceQuantity: Boolean = ???): Unit = js.native
  def update(): Unit = js.native
  def revive(): Unit = js.native
}
}
}

@js.native
@JSName("Phaser.Physics")
class Physics protected () extends js.Object {
  def this(game: Phaser.Game, config: js.Any = ???) = this()
  var arcade: Phaser.Physics.Arcade = js.native
  var config: js.Any = js.native
  var game: Phaser.Game = js.native
  var ninja: Phaser.Physics.Ninja = js.native
  var p2: Phaser.Physics.P2 = js.native
  var box2d: js.Any = js.native
  def clear(): Unit = js.native
  def destroy(): Unit = js.native
  def enable(`object`: js.Any, system: Double = ???, debug: Boolean = ???): Unit = js.native
  def parseConfig(): Unit = js.native
  def preUpdate(): Unit = js.native
  def reset(): Unit = js.native
  def setBoundsToWorld(): Unit = js.native
  def startSystem(system: Double): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.Physics")
@js.native
object Physics extends js.Object {
  var ARCADE: Double = js.native
  var P2JS: Double = js.native
  var NINJA: Double = js.native
  var BOX2D: Double = js.native
  var CHIPMUNK: Double = js.native
  var MATTERJS: Double = js.native

@js.native
@JSName("Phaser.Physics.Arcade")
class Arcade protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var bounds: Phaser.Rectangle = js.native
  var checkCollision: js.Any = js.native
  var forceX: Boolean = js.native
  var game: Phaser.Game = js.native
  var gravity: Phaser.Point = js.native
  var quadTree: Phaser.QuadTree = js.native
  var maxObjects: Double = js.native
  var maxLevels: Double = js.native
  var skipQuadTree: Boolean = js.native
  var sortDirection: Double = js.native
  def accelerationFromRotation(rotation: Double, speed: Double = ???, point: Phaser.Point = ???): Phaser.Point = js.native
  def accelerateToObject(displayObject: js.Any, destination: js.Any, speed: Double = ???, xSpeedMax: Double = ???, ySpeedMax: Double = ???): Double = js.native
  def accelerateToPointer(displayObject: js.Any, pointer: Phaser.Pointer = ???, speed: Double = ???, xSpeedMax: Double = ???, ySpeedMax: Double = ???): Double = js.native
  def accelerateToXY(displayObject: js.Any, x: Double, y: Double, speed: Double = ???, xSpeedMax: Double = ???, ySpeedMax: Double = ???): Double = js.native
  def angleBetween(source: js.Any, target: js.Any): Double = js.native
  def angleToPointer(displayObject: js.Any, pointer: Phaser.Pointer = ???): Double = js.native
  def angleToXY(displayObject: js.Any, x: Double, y: Double): Double = js.native
  def collide(object1: js.Any, object2: js.Any, collideCallback: js.Function = ???, processCallback: js.Function = ???, callbackContext: js.Any = ???): Boolean = js.native
  def computeVelocity(axis: Double, body: Phaser.Physics.Arcade.Body, velocity: Double, acceleration: Double, drag: Double, max: Double = ???): Double = js.native
  def distanceBetween(source: js.Any, target: js.Any): Double = js.native
  def distanceToPointer(displayObject: js.Any, pointer: Phaser.Pointer = ???): Double = js.native
  def distanceToXY(displayObject: js.Any, x: Double, y: Double): Double = js.native
  def enable(`object`: js.Any, children: Boolean = ???): Unit = js.native
  def enableBody(`object`: js.Any): Unit = js.native
  def getObjectsAtLocation(x: Double, y: Double, group: Phaser.Group, callback: js.Function2[js.Any, js.Any, Unit] = ???, callbackContext: js.Any = ???, callbackArg: js.Any = ???): js.Array[Sprite] = js.native
  def intersects(body1: Phaser.Physics.Arcade.Body, body2: Phaser.Physics.Arcade.Body): Boolean = js.native
  def moveToObject(displayObject: js.Any, destination: js.Any, speed: Double = ???, maxTime: Double = ???): Double = js.native
  def moveToPointer(displayObject: js.Any, speed: Double = ???, pointer: Phaser.Pointer = ???, maxTime: Double = ???): Double = js.native
  def moveToXY(displayObject: js.Any, x: Double, y: Double, speed: Double = ???, maxTime: Double = ???): Double = js.native
  def overlap(object1: js.Any, object2: js.Any, overlapCallback: js.Function = ???, processCallback: js.Function = ???, callbackContext: js.Any = ???): Boolean = js.native
  def processTileSeparationX(body: Phaser.Physics.Arcade.Body, x: Double): Boolean = js.native
  def processTileSeparationY(body: Phaser.Physics.Arcade.Body, y: Double): Unit = js.native
  def setBounds(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def setBoundsToWorld(): Unit = js.native
  def separate(body1: Phaser.Physics.Arcade.Body, body2: Phaser.Physics.Arcade.Body, processCallback: js.Function = ???, callbackContext: js.Any = ???, overlapOnly: Boolean = ???): Boolean = js.native
  def separateX(body1: Phaser.Physics.Arcade.Body, body2: Phaser.Physics.Arcade.Body, overlapOnly: Boolean): Boolean = js.native
  def separateY(body1: Phaser.Physics.Arcade.Body, body2: Phaser.Physics.Arcade.Body, overlapOnly: Boolean): Boolean = js.native
  def separateTile(i: Double, body: Phaser.Physics.Arcade.Body, tile: Phaser.Tile): Boolean = js.native
  def sort(group: Phaser.Group): Unit = js.native
  def tileCheckX(body: Phaser.Physics.Arcade.Body, tile: Phaser.Tile): Double = js.native
  def tileCheckY(body: Phaser.Physics.Arcade.Body, tile: Phaser.Tile): Double = js.native
  def updateMotion(body: Phaser.Physics.Arcade.Body): Unit = js.native
  def velocityFromAngle(angle: Double, speed: Double = ???, point: Phaser.Point = ???): Phaser.Point = js.native
  def velocityFromRotation(rotation: Double, speed: Double = ???, point: Phaser.Point = ???): Phaser.Point = js.native
}

@JSName("Phaser.Physics.Arcade")
@js.native
object Arcade extends js.Object {
  var SORT_NONE: Double = js.native
  var LEFT_RIGHT: Double = js.native
  var RIGHT_LEFT: Double = js.native
  var TOP_BOTTOM: Double = js.native
  var BOTTOM_TOP: Double = js.native
  var OVERLAP_BIAS: Double = js.native
  var TILE_BIAS: Double = js.native

@js.native
@JSName("Phaser.Physics.Arcade.Body")
class Body protected () extends js.Object {
  def this(sprite: Phaser.Sprite) = this()
  var acceleration: Phaser.Point = js.native
  var allowGravity: Boolean = js.native
  var allowRotation: Boolean = js.native
  var angle: Double = js.native
  var angularAcceleration: Double = js.native
  var angularDrag: Double = js.native
  var angularVelocity: Double = js.native
  var blocked: FaceChoices = js.native
  var bottom: Double = js.native
  var bounce: Phaser.Point = js.native
  var center: Phaser.Point = js.native
  var checkCollision: FaceChoices = js.native
  var collideWorldBounds: Boolean = js.native
  var customSeparateX: Boolean = js.native
  var customSeparateY: Boolean = js.native
  var deltaMax: Phaser.Point = js.native
  var dirty: Boolean = js.native
  var drag: Phaser.Point = js.native
  var embedded: Boolean = js.native
  var enable: Boolean = js.native
  var facing: Double = js.native
  var friction: Phaser.Point = js.native
  var game: Phaser.Game = js.native
  var gravity: Phaser.Point = js.native
  var halfWidth: Double = js.native
  var halfHeight: Double = js.native
  var immovable: Boolean = js.native
  var mass: Double = js.native
  var maxAngular: Double = js.native
  var maxVelocity: Phaser.Point = js.native
  var moves: Boolean = js.native
  var newVelocity: Phaser.Point = js.native
  var offset: Phaser.Point = js.native
  var overlapX: Double = js.native
  var overlapY: Double = js.native
  var phase: Double = js.native
  var position: Phaser.Point = js.native
  var preRotation: Double = js.native
  var prev: Phaser.Point = js.native
  var right: Double = js.native
  var rotation: Double = js.native
  var skipQuadTree: Boolean = js.native
  var sourceWidth: Double = js.native
  var sourceHeight: Double = js.native
  var speed: Double = js.native
  var sprite: Phaser.Sprite = js.native
  var syncBounds: Boolean = js.native
  var tilePadding: Phaser.Point = js.native
  var touching: FaceChoices = js.native
  var `type`: Double = js.native
  var wasTouching: FaceChoices = js.native
  var width: Double = js.native
  var velocity: Phaser.Point = js.native
  var x: Double = js.native
  var y: Double = js.native
  def checkWorldBounds(): Unit = js.native
  def deltaX(): Double = js.native
  def deltaY(): Double = js.native
  def deltaZ(): Double = js.native
  def deltaAbsX(): Unit = js.native
  def deltaAbsY(): Unit = js.native
  def destroy(): Unit = js.native
  def hitTest(x: Double, y: Double): Boolean = js.native
  def onFloor(): Unit = js.native
  def onWall(): Unit = js.native
  def preUpdate(): Unit = js.native
  def postUpdate(): Unit = js.native
  def render(context: js.Any, body: Phaser.Physics.Arcade.Body, color: String = ???, filled: Boolean = ???): Unit = js.native
  def renderBodyInfo(debug: Phaser.Utils.Debug, body: Phaser.Physics.Arcade.Body): Unit = js.native
  def reset(x: Double, y: Double): Unit = js.native
  def setSize(width: Double, height: Double, offsetX: Double = ???, offsetY: Double = ???): Unit = js.native
  def updateBounds(): Boolean = js.native
}

@js.native
@JSName("Phaser.Physics.Arcade.FaceChoices")
class FaceChoices extends js.Object {
  var none: Boolean = js.native
  var any: Boolean = js.native
  var up: Boolean = js.native
  var down: Boolean = js.native
  var left: Boolean = js.native
  var right: Boolean = js.native
}
}

@js.native
@JSName("Phaser.Physics.Ninja")
class Ninja protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var game: Phaser.Game = js.native
  var gravity: Double = js.native
  var bounds: Phaser.Rectangle = js.native
  var maxObjects: Double = js.native
  var maxLevels: Double = js.native
  var quadTree: Phaser.QuadTree = js.native
  var time: Phaser.Time = js.native
  def clearTilemapLayerBodies(map: Phaser.Tilemap, layer: js.Any): Unit = js.native
  def collide(object1: js.Any, object2: js.Any, collideCallback: js.Function = ???, processCallback: js.Function = ???, callbackContext: js.Any = ???): Boolean = js.native
  def convertTilemap(map: Phaser.Tilemap, layer: js.Any, slopeMap: js.Any): js.Array[Phaser.Physics.Ninja.Tile] = js.native
  def enableAABB(`object`: js.Any, children: Boolean = ???): Unit = js.native
  def enableCircle(`object`: js.Any, radius: Double, children: Boolean = ???): Unit = js.native
  def enableTile(`object`: js.Any, id: Double, children: Boolean = ???): Unit = js.native
  def enable(`object`: js.Any, `type`: Double = ???, id: Double = ???, radius: Double = ???, children: Boolean = ???): Unit = js.native
  def enableBody(`object`: js.Any, `type`: Double = ???, id: Double = ???, radius: Double = ???): Unit = js.native
  def overlap(object1: js.Any, object2: js.Any, overlapCallback: js.Function = ???, processCallback: js.Function = ???, callbackContext: js.Any = ???): Boolean = js.native
  def separate(body1: Phaser.Physics.Ninja.Body, body2: Phaser.Physics.Ninja.Body, processCallback: js.Function = ???, callbackContext: js.Any = ???, overlapOnly: Boolean = ???): Boolean = js.native
  def setBounds(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def setBoundsToWorld(): Unit = js.native
}

@JSName("Phaser.Physics.Ninja")
@js.native
object Ninja extends js.Object {

@js.native
@JSName("Phaser.Physics.Ninja.Body")
class Body protected () extends js.Object {
  def this(system: Phaser.Physics.Ninja, sprite: Phaser.Sprite, `type`: Double = ???, id: Double = ???, radius: Double = ???, x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???) = this()
  var aabb: Phaser.Physics.Ninja.AABB = js.native
  var angle: Double = js.native
  var bottom: Double = js.native
  var bounce: Double = js.native
  var checkCollision: Phaser.Physics.Arcade.FaceChoices = js.native
  var circle: Phaser.Physics.Ninja.Circle = js.native
  var collideWorldBounds: Boolean = js.native
  var drag: Double = js.native
  var facing: Double = js.native
  var friction: Double = js.native
  var game: Phaser.Game = js.native
  var gravityScale: Double = js.native
  var height: Double = js.native
  var immovable: Boolean = js.native
  var maxSpeed: Double = js.native
  var right: Double = js.native
  var sprite: Phaser.Sprite = js.native
  var system: Phaser.Physics.Ninja = js.native
  var tile: Phaser.Physics.Ninja.Tile = js.native
  var touching: Phaser.Physics.Arcade.FaceChoices = js.native
  var `type`: Double = js.native
  var shape: js.Any = js.native
  var speed: Double = js.native
  var velocity: Phaser.Point = js.native
  var wasTouching: Phaser.Physics.Arcade.FaceChoices = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def deltaAbsX(): Double = js.native
  def deltaAbsY(): Double = js.native
  def deltaX(): Double = js.native
  def deltaY(): Double = js.native
  def destroy(): Unit = js.native
  def setZeroVelocity(): Unit = js.native
  def moveTo(speed: Double, angle: Double): Unit = js.native
  def moveFrom(speed: Double, angle: Double): Unit = js.native
  def moveLeft(speed: Double): Unit = js.native
  def moveRight(speed: Double): Unit = js.native
  def moveUp(speed: Double): Unit = js.native
  def moveDown(speed: Double): Unit = js.native
  def poseUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def render(context: js.Any, body: Phaser.Physics.Ninja.Body, color: String = ???, filled: Boolean = ???): Unit = js.native
  def reset(): Unit = js.native
}

@js.native
@JSName("Phaser.Physics.Ninja.AABB")
class AABB protected () extends js.Object {
  def this(body: Phaser.Physics.Ninja.Body, x: Double, y: Double, width: Double, height: Double) = this()
  var aabbTileProjections: js.Any = js.native
  var body: Phaser.Physics.Ninja.Body = js.native
  var height: Double = js.native
  var oldPos: Phaser.Point = js.native
  var pos: Phaser.Point = js.native
  var system: Phaser.Physics.Ninja = js.native
  var width: Double = js.native
  var velocity: Phaser.Point = js.native
  var xw: Double = js.native
  var yw: Double = js.native
  def collideWorldBounds(): Unit = js.native
  def collideAABBVsAABB(aabb: Phaser.Physics.Ninja.AABB): Boolean = js.native
  def collideAABBVsTile(tile: Phaser.Physics.Ninja.Tile): Boolean = js.native
  def destroy(): Unit = js.native
  def integrate(): Unit = js.native
  def render(context: js.Any, xOffset: Double, yOffset: Double, color: String, filled: Boolean): Unit = js.native
  def reportCollision(px: Double, py: Double, dx: Double, dy: Double): Unit = js.native
  def reportCollisionVsWorld(px: Double, py: Double, dx: Double, dy: Double, obj: js.Any): Unit = js.native
  def reportCollisionVsBody(px: Double, py: Double, dx: Double, dy: Double, obj: js.Any): Unit = js.native
  def resolveTile(x: Double, y: Double, body: Phaser.Physics.Ninja.AABB, tile: Phaser.Physics.Ninja.Tile): Boolean = js.native
  def reverse(): Unit = js.native
}

@JSName("Phaser.Physics.Ninja.AABB")
@js.native
object AABB extends js.Object {
  var COL_NONE: Double = js.native
  var COL_AXIS: Double = js.native
  var COL_OTHER: Double = js.native
}

@js.native
@JSName("Phaser.Physics.Ninja.Circle")
class Circle protected () extends js.Object {
  def this(body: Phaser.Physics.Ninja.Body, x: Double, y: Double, radius: Double) = this()
  var COL_NONE: Double = js.native
  var COL_AXIS: Double = js.native
  var COL_OTHER: Double = js.native
  var body: Phaser.Physics.Ninja.Body = js.native
  var circleTileProjections: js.Any = js.native
  var oldPos: Phaser.Point = js.native
  var height: Double = js.native
  var pos: Phaser.Point = js.native
  var radius: Double = js.native
  var system: Phaser.Physics.Ninja = js.native
  var `type`: Double = js.native
  var velocity: Phaser.Point = js.native
  var width: Double = js.native
  var xw: Double = js.native
  var yw: Double = js.native
  def collideCircleVsTile(tile: Phaser.Physics.Ninja.Tile): Boolean = js.native
  def collideWorldBounds(): Unit = js.native
  def destroy(): Unit = js.native
  def distance(dest: Double, round: Boolean = ???): Double = js.native
  def integrate(): Unit = js.native
  def render(context: js.Any, xOffset: Double, yOffset: Double, color: String, filled: Boolean): Unit = js.native
  def reportCollisionVsWorld(px: Double, py: Double, dx: Double, dy: Double, obj: js.Any): Unit = js.native
  def reportCollisionVsBody(px: Double, py: Double, dx: Double, dy: Double, obj: js.Any): Unit = js.native
  def resolveCircleTile(x: Double, y: Double, oH: Double, oV: Double, obj: Phaser.Physics.Ninja.Circle, t: Phaser.Physics.Ninja.Tile): Boolean = js.native
}

@js.native
sealed trait TileType extends js.Object {
}

@JSName("Phaser.Physics.Ninja.TileType")
@js.native
object TileType extends js.Object {
  var TYPE_EMPTY: TileType = js.native
  var TYPE_FULL: TileType = js.native
  var TYPE_45DEG: TileType = js.native
  var TYPE_CONCAVE: TileType = js.native
  var TYPE_CONVEX: TileType = js.native
  var TYPE_22DEGs: TileType = js.native
  var TYPE_22DEGb: TileType = js.native
  var TYPE_67DEGs: TileType = js.native
  var TYPE_67DEGb: TileType = js.native
  var TYPE_HALF: TileType = js.native
  @JSBracketAccess
  def apply(value: TileType): String = js.native
}

@js.native
@JSName("Phaser.Physics.Ninja.Tile")
class Tile protected () extends js.Object {
  def this(body: Phaser.Physics.Ninja.Body, x: Double, y: Double, width: Double, height: Double, `type`: Double = ???) = this()
  var body: Phaser.Physics.Ninja.Body = js.native
  var bottom: Double = js.native
  var flipped: Boolean = js.native
  var height: Double = js.native
  var id: Double = js.native
  var oldpos: Phaser.Point = js.native
  var pos: Phaser.Point = js.native
  var right: Double = js.native
  var rotation: Double = js.native
  var system: Phaser.Physics.Ninja = js.native
  var `type`: Phaser.Physics.Ninja.TileType = js.native
  var velocity: Phaser.Point = js.native
  var width: Double = js.native
  var xw: Double = js.native
  var yw: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def clear(): Unit = js.native
  def collideWorldBounds(): Unit = js.native
  def destroy(): Unit = js.native
  def integrate(): Unit = js.native
  def reportCollisionVsWorld(px: Double, py: Double, dx: Double, dy: Double, obj: js.Any): Unit = js.native
  def setType(id: Double): Double = js.native
}
}

@js.native
@JSName("Phaser.Physics.P2")
class P2 protected () extends js.Object {
  def this(game: Phaser.Game, config: js.Any = ???) = this()
  var applyDamping: Boolean = js.native
  var applyGravity: Boolean = js.native
  var applySpringForces: Boolean = js.native
  var boundsCollidesWith: js.Array[Phaser.Physics.P2.Body] = js.native
  var boundsCollisionGroup: Phaser.Physics.P2.CollisionGroup = js.native
  var config: js.Any = js.native
  var callbackContext: js.Any = js.native
  var collisionGroups: js.Array[Phaser.Physics.P2.CollisionGroup] = js.native
  var contactMaterial: Phaser.Physics.P2.ContactMaterial = js.native
  var emitImpactEvent: Boolean = js.native
  var everythingCollisionGroup: Phaser.Physics.P2.CollisionGroup = js.native
  var frameRate: Double = js.native
  var friction: Double = js.native
  var game: Phaser.Game = js.native
  var gravity: Phaser.Physics.P2.InversePointProxy = js.native
  var materials: js.Array[Phaser.Physics.P2.Material] = js.native
  var nothingCollisionGroup: Phaser.Physics.P2.CollisionGroup = js.native
  var onBodyAdded: Phaser.Signal = js.native
  var onBodyRemoved: Phaser.Signal = js.native
  var onBeginContact: Phaser.Signal = js.native
  var onConstraintAdded: Phaser.Signal = js.native
  var onConstraintRemoved: Phaser.Signal = js.native
  var onContactMaterialAdded: Phaser.Signal = js.native
  var onContactMaterialRemoved: Phaser.Signal = js.native
  var onEndContact: Phaser.Signal = js.native
  var onSpringAdded: Phaser.Signal = js.native
  var onSpringRemoved: Phaser.Signal = js.native
  var paused: Boolean = js.native
  var postBroaddphaseCallback: js.Function = js.native
  var restitution: Double = js.native
  var solveConstraints: Boolean = js.native
  var time: js.Any = js.native
  var total: Double = js.native
  var useElapsedTime: Boolean = js.native
  var walls: js.Any = js.native
  var world: p2.World = js.native
  def addBody(body: Phaser.Physics.P2.Body): Boolean = js.native
  def addContactMaterial(material: Phaser.Physics.P2.ContactMaterial): Phaser.Physics.P2.ContactMaterial = js.native
  def addConstraint[T](constraint: T): T = js.native
  def addSpring(spring: Phaser.Physics.P2.Spring): Phaser.Physics.P2.Spring = js.native
  def beginContactHandler(event: js.Any): Unit = js.native
  def clear(): Unit = js.native
  def clearTilemapLayerBodies(map: Phaser.Tilemap, layer: js.Any = ???): Unit = js.native
  def convertCollisionObjects(map: Phaser.Tilemap, layer: js.Any = ???, addToWorld: Boolean = ???): js.Array[Phaser.Physics.P2.Body] = js.native
  def convertTilemap(map: Phaser.Tilemap, layer: js.Any = ???, addToWorld: Boolean = ???, optimize: Boolean = ???): js.Array[Phaser.Physics.P2.Body] = js.native
  def createBody(x: Double, y: Double, mass: Double, addToWorld: Boolean = ???, options: p2.BodyOptions = ???, data: js.Array[js.Array[Double]] = ???): Phaser.Physics.P2.Body = js.native
  def createBody(x: Double, y: Double, mass: Double, addToWorld: Boolean = ???, options: p2.BodyOptions = ???, data: js.Array[Double] = ???): Phaser.Physics.P2.Body = js.native
  def createCollisionGroup(group: Phaser.Group = ???): Phaser.Physics.P2.CollisionGroup = js.native
  def createCollisionGroup(group: Phaser.Sprite = ???): Phaser.Physics.P2.CollisionGroup = js.native
  def createContactMaterial(materialA: Phaser.Physics.P2.Material, materialB: Phaser.Physics.P2.Material, options: p2.ContactMaterialOptions = ???): Phaser.Physics.P2.ContactMaterial = js.native
  def createDistanceConstraint(bodyA: js.Any, bodyB: js.Any, distance: Double, localAnchorA: js.Array[Double] = ???, localAnchorB: js.Array[Double] = ???, maxForce: Double = ???): Phaser.Physics.P2.DistanceConstraint = js.native
  def createGearConstraint(bodyA: js.Any, bodyB: js.Any, angle: Double = ???, ratio: Double = ???): Phaser.Physics.P2.GearConstraint = js.native
  def createLockConstraint(bodyA: js.Any, bodyB: js.Any, offset: js.Array[Double] = ???, angle: Double = ???, maxForce: Double = ???): Phaser.Physics.P2.LockConstraint = js.native
  def createMaterial(name: String = ???, body: Phaser.Physics.P2.Body = ???): Phaser.Physics.P2.Material = js.native
  def createParticle(x: Double, y: Double, mass: Double, addToWorld: Boolean = ???, options: p2.BodyOptions = ???, data: js.Array[js.Array[Double]] = ???): Phaser.Physics.P2.Body = js.native
  def createParticle(x: Double, y: Double, mass: Double, addToWorld: Boolean = ???, options: p2.BodyOptions = ???, data: js.Array[Double] = ???): Phaser.Physics.P2.Body = js.native
  def createPrismaticConstraint(body: js.Any, bodyB: js.Any, lockRotation: Boolean = ???, anchorA: js.Array[Double] = ???, anchorB: js.Array[Double] = ???, axis: Float32Array = ???, maxForce: Double = ???): Phaser.Physics.P2.PrismaticConstraint = js.native
  def createRevoluteConstraint(bodyA: js.Any, pivotA: js.Array[Double], bodyB: js.Any, pivotB: js.Array[Double], maxForce: Double = ???, worldPivot: js.Array[Double] = ???): Phaser.Physics.P2.RevoluteConstraint = js.native
  def createRotationalSpring(bodyA: js.Any, bodyB: js.Any, restAngle: Double = ???, stiffness: Double = ???, damping: Double = ???): p2.RotationalSpring = js.native
  def createSpring(bodyA: js.Any, bodyB: js.Any, restLength: Double = ???, stiffness: Double = ???, damping: Double = ???, worldA: js.Array[Double] = ???, worldB: js.Array[Double] = ???, localA: js.Array[Double] = ???, localB: js.Array[Double] = ???): Phaser.Physics.P2.Spring = js.native
  def destroy(): Unit = js.native
  def enable(`object`: js.Any, debug: Boolean = ???, children: Boolean = ???): Unit = js.native
  def enableBody(`object`: js.Any, debug: Boolean): Unit = js.native
  def endContactHandler(event: js.Any): Unit = js.native
  def getBodies(): js.Array[Phaser.Physics.P2.Body] = js.native
  def getBody(`object`: js.Any): Phaser.Physics.P2.Body = js.native
  def getConstraints(): js.Array[p2.Constraint] = js.native
  def getSprings(): js.Array[Phaser.Physics.P2.Spring] = js.native
  def getContactMaterial(materialA: Phaser.Physics.P2.Material, materialB: Phaser.Physics.P2.Material): Phaser.Physics.P2.ContactMaterial = js.native
  def hitTest(worldPoint: Phaser.Point, bodies: js.Array[js.Any] = ???, precision: Double = ???, filterStatic: Boolean = ???): js.Array[Phaser.Physics.P2.Body] = js.native
  def mpx(v: Double): Double = js.native
  def mpxi(v: Double): Double = js.native
  def pause(): Unit = js.native
  def preUpdate(): Unit = js.native
  def pxm(v: Double): Double = js.native
  def pxmi(v: Double): Double = js.native
  def removeBody(body: Phaser.Physics.P2.Body): Phaser.Physics.P2.Body = js.native
  def removeBodyNextStep(body: Phaser.Physics.P2.Body): Unit = js.native
  def removeConstraint[T](constraint: T): T = js.native
  def removeContactMaterial(material: Phaser.Physics.P2.ContactMaterial): Phaser.Physics.P2.ContactMaterial = js.native
  def removeSpring(spring: Phaser.Physics.P2.Spring): Phaser.Physics.P2.Spring = js.native
  def reset(): Unit = js.native
  def resume(): Unit = js.native
  def setBounds(x: Double, y: Double, width: Double, height: Double, left: Boolean = ???, right: Boolean = ???, top: Boolean = ???, bottom: Boolean = ???, setCollisionGroup: Boolean = ???): Unit = js.native
  def setBoundsToWorld(left: Boolean = ???, right: Boolean = ???, top: Boolean = ???, bottom: Boolean = ???, setCollisionGroup: Boolean = ???): Unit = js.native
  def setCollisionGroup(`object`: js.Any, group: Phaser.Physics.P2.CollisionGroup): Unit = js.native
  def setImpactEvents(state: Boolean): Unit = js.native
  def setMaterial(material: Phaser.Physics.P2.Material, bodies: js.Array[Phaser.Physics.P2.Body] = ???): Unit = js.native
  def setPostBroadphaseCallback(callback: js.Function, context: js.Any): Unit = js.native
  def setWorldMaterial(material: Phaser.Physics.P2.Material, left: Boolean = ???, right: Boolean = ???, top: Boolean = ???, bottom: Boolean = ???): Unit = js.native
  def toJSON(): js.Dynamic = js.native
  def update(): Unit = js.native
  def updateBoundsCollisionGroup(setCollisionGroup: Boolean = ???): Unit = js.native
}

@JSName("Phaser.Physics.P2")
@js.native
object P2 extends js.Object {

@js.native
@JSName("Phaser.Physics.P2.Body")
class Body protected () extends js.Object {
  def this(game: Phaser.Game, sprite: Phaser.Sprite = ???, x: Double = ???, y: Double = ???, mass: Double = ???) = this()
  var allowSleep: Boolean = js.native
  var angle: Double = js.native
  var angularDamping: Double = js.native
  var angularForce: Double = js.native
  var angularVelocity: Double = js.native
  var collidesWith: js.Array[Phaser.Physics.P2.CollisionGroup] = js.native
  var collideWorldBounds: Boolean = js.native
  var damping: Double = js.native
  var data: p2.Body = js.native
  var debug: Boolean = js.native
  var debugBody: Phaser.Physics.P2.BodyDebug = js.native
  var dynamic: Boolean = js.native
  var fixedRotation: Boolean = js.native
  var force: Phaser.Physics.P2.InversePointProxy = js.native
  var kinematic: Boolean = js.native
  var game: Phaser.Game = js.native
  var gravity: Phaser.Point = js.native
  var id: Double = js.native
  var inertia: Double = js.native
  var mass: Double = js.native
  var motionState: Double = js.native
  var offset: Phaser.Point = js.native
  var onBeginContact: Phaser.Signal = js.native
  var onEndContact: Phaser.Signal = js.native
  var rotation: Double = js.native
  var removeNextStep: Boolean = js.native
  var sprite: Phaser.Sprite = js.native
  var sleepSpeedLimit: Double = js.native
  var static: Boolean = js.native
  var `type`: Double = js.native
  var velocity: Phaser.Physics.P2.InversePointProxy = js.native
  var world: Phaser.Physics.P2 = js.native
  var x: Double = js.native
  var y: Double = js.native
  def addToWorld(): Unit = js.native
  def addCapsule(length: Double, radius: Double, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Capsule = js.native
  def addCircle(radius: Double, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Circle = js.native
  def addFixture(fixtureData: String): js.Array[p2.Shape] = js.native
  def addLine(length: Double, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Line = js.native
  def addParticle(offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Particle = js.native
  def addPolygon(options: js.Any, points: js.Array[js.Array[Double]]): Boolean = js.native
  def addPhaserPolygon(key: String, `object`: String): Phaser.Physics.P2.FixtureList = js.native
  def addPlane(offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Plane = js.native
  def addRectangle(width: Double, height: Double, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Rectangle = js.native
  def addShape(shape: p2.Shape, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Shape = js.native
  def adjustCenterOfMass(): Unit = js.native
  def applyDamping(dt: Double): Unit = js.native
  def applyForce(force: js.Array[Double], worldX: Double, worldY: Double): Unit = js.native
  def applyImpulse(impulse: js.Array[Double], worldX: Double, worldY: Double): Unit = js.native
  def applyImpulseLocal(impulse: js.Array[Double], localX: Double, localY: Double): Unit = js.native
  def clearCollision(clearGroup: Boolean = ???, cleanMask: Boolean = ???, shape: p2.Shape = ???): Unit = js.native
  def clearShapes(): Unit = js.native
  def collides(group: js.Any, callback: js.Function = ???, callbackContext: js.Any = ???, shape: p2.Shape = ???): Unit = js.native
  def createBodyCallback(`object`: js.Any, callback: js.Function, callbackContext: js.Any): Unit = js.native
  def createGroupCallback(group: Phaser.Physics.P2.CollisionGroup, callback: js.Function, callbackContext: js.Any): Unit = js.native
  def destroy(): Unit = js.native
  def getCollisionMask(): Double = js.native
  def getVelocityAtPoint(result: js.Array[Double], relativePoint: js.Array[Double]): js.Array[Double] = js.native
  def loadPolygon(key: String, `object`: String): Boolean = js.native
  def moveBackward(speed: Double): Unit = js.native
  def moveDown(speed: Double): Unit = js.native
  def moveForward(speed: Double): Unit = js.native
  def moveLeft(speed: Double): Unit = js.native
  def moveRight(speed: Double): Unit = js.native
  def moveUp(speed: Double): Unit = js.native
  def preUpdate(): Unit = js.native
  def postUpdate(): Unit = js.native
  def removeFromWorld(): Unit = js.native
  def removeShape(shape: p2.Shape): Boolean = js.native
  def reverse(speed: Double): Unit = js.native
  def rotateLeft(speed: Double): Unit = js.native
  def rotateRight(speed: Double): Unit = js.native
  def reset(x: Double, y: Double, resetDamping: Boolean = ???, resetMass: Boolean = ???): Unit = js.native
  def shapeChanged(): Unit = js.native
  def setCircle(radius: Double, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Circle = js.native
  def setCollisionGroup(group: Phaser.Physics.P2.CollisionGroup, shape: p2.Shape = ???): Unit = js.native
  def setRectangle(width: Double = ???, height: Double = ???, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Rectangle = js.native
  def setRectangleFromSprite(sprite: js.Any): p2.Rectangle = js.native
  def setMaterial(material: Phaser.Physics.P2.Material, shape: p2.Shape = ???): Unit = js.native
  def setZeroDamping(): Unit = js.native
  def setZeroForce(): Unit = js.native
  def setZeroRotation(): Unit = js.native
  def setZeroVelocity(): Unit = js.native
  def toLocalFrame(out: js.Array[Double], worldPoint: js.Array[Double]): Unit = js.native
  def thrust(speed: Double): Unit = js.native
  def toWorldFrame(out: js.Array[Double], localPoint: js.Array[Double]): Unit = js.native
  def updateCollisionMask(shape: p2.Shape = ???): Unit = js.native
}

@JSName("Phaser.Physics.P2.Body")
@js.native
object Body extends js.Object {
  var DYNAMIC: Double = js.native
  var STATIC: Double = js.native
  var KINEMATIC: Double = js.native
}

@js.native
@JSName("Phaser.Physics.P2.BodyDebug")
class BodyDebug protected () extends Phaser.Group {
  def this(game: Phaser.Game, body: Phaser.Physics.P2.Body, settings: js.Any) = this()
  var body: Phaser.Physics.P2.Body = js.native
  var canvas: Phaser.Graphics = js.native
  var ppu: Double = js.native
  def updateSpriteTransform(): Unit = js.native
  def draw(): Unit = js.native
}

@js.native
@JSName("Phaser.Physics.P2.CollisionGroup")
class CollisionGroup protected () extends js.Object {
  def this(bitmask: Double) = this()
  var mask: Double = js.native
}

@js.native
@JSName("Phaser.Physics.P2.ContactMaterial")
class ContactMaterial extends p2.ContactMaterial {
}

@js.native
@JSName("Phaser.Physics.P2.DistanceConstraint")
class DistanceConstraint protected () extends p2.DistanceConstraint {
  def this(world: Phaser.Physics.P2, bodyA: Phaser.Physics.P2.Body, bodyB: Phaser.Physics.P2.Body, distance: Double, maxForce: Double) = this()
  var game: Phaser.Game = js.native
  var world: Phaser.Physics.P2 = js.native
}

@js.native
@JSName("Phaser.Physics.P2.FixtureList")
class FixtureList protected () extends js.Object {
  def this(list: js.Array[js.Any]) = this()
  def flatten(array: js.Array[js.Any]): js.Array[js.Any] = js.native
  def getFixtures(keys: String): js.Array[js.Any] = js.native
  def getFixtureByKey(key: String): js.Array[js.Any] = js.native
  def getGroup(groupID: Double): js.Array[js.Any] = js.native
  def init(): Unit = js.native
  def parse(): Unit = js.native
  def setCategory(bit: Double, fictureKey: String): Unit = js.native
  def setMask(bit: Double, fixtureKey: String): Unit = js.native
  def setMaterial(material: js.Any, fixtureKey: String): Unit = js.native
  def setSensor(value: Boolean, fixtureKey: String): Unit = js.native
}

@js.native
@JSName("Phaser.Physics.P2.GearConstraint")
class GearConstraint protected () extends p2.GearConstraint {
  def this(world: Phaser.Physics.P2, bodyA: Phaser.Physics.P2.Body, bodyB: Phaser.Physics.P2.Body, angle: Double = ???, ratio: Double = ???) = this()
  var game: Phaser.Game = js.native
  var world: Phaser.Physics.P2 = js.native
}

@js.native
@JSName("Phaser.Physics.P2.InversePointProxy")
class InversePointProxy protected () extends js.Object {
  def this(world: Phaser.Physics.P2, destination: js.Any) = this()
  var x: Double = js.native
  var y: Double = js.native
  var mx: Double = js.native
  var my: Double = js.native
}

@js.native
@JSName("Phaser.Physics.P2.LockConstraint")
class LockConstraint protected () extends p2.LockConstraint {
  def this(world: Phaser.Physics.P2, bodyA: Phaser.Physics.P2.Body, bodyB: Phaser.Physics.P2.Body, offset: js.Array[Double] = ???, angle: Double = ???, maxForce: Double = ???) = this()
  var game: Phaser.Game = js.native
  var world: Phaser.Physics.P2 = js.native
}

@js.native
@JSName("Phaser.Physics.P2.Material")
class Material protected () extends p2.Material {
  def this(name: String) = this()
  var name: String = js.native
}

@js.native
@JSName("Phaser.Physics.P2.PointProxy")
class PointProxy protected () extends js.Object {
  def this(world: Phaser.Physics.P2, destination: js.Any) = this()
  var x: Double = js.native
  var y: Double = js.native
  var mx: Double = js.native
  var my: Double = js.native
}

@js.native
@JSName("Phaser.Physics.P2.PrismaticConstraint")
class PrismaticConstraint protected () extends p2.PrismaticConstraint {
  def this(world: Phaser.Physics.P2, bodyA: Phaser.Physics.P2.Body = ???, bodyB: Phaser.Physics.P2.Body = ???, lockRotation: Boolean = ???, anchorA: js.Array[Double] = ???, anchorB: js.Array[Double] = ???, axis: js.Array[Double] = ???, maxForce: Double = ???) = this()
  var game: Phaser.Game = js.native
  var world: Phaser.Physics.P2 = js.native
}

@js.native
@JSName("Phaser.Physics.P2.RevoluteConstraint")
class RevoluteConstraint protected () extends p2.RevoluteConstraint {
  def this(world: Phaser.Physics.P2, bodyA: Phaser.Physics.P2.Body, pivotA: js.Array[Double], bodyB: Phaser.Physics.P2.Body, pivotB: js.Array[Double], maxForce: Double = ???) = this()
  var game: Phaser.Game = js.native
  var world: Phaser.Physics.P2 = js.native
}

@js.native
@JSName("Phaser.Physics.P2.Spring")
class Spring protected () extends js.Object {
  def this(world: Phaser.Physics.P2, bodyA: Phaser.Physics.P2.Body, bodyB: Phaser.Physics.P2.Body, restLength: Double = ???, stiffness: Double = ???, damping: Double = ???, worldA: js.Array[Double] = ???, worldB: js.Array[Double] = ???, localA: js.Array[Double] = ???, localB: js.Array[Double] = ???) = this()
  var data: p2.LinearSpring = js.native
  var game: Phaser.Game = js.native
  var world: Phaser.Physics.P2 = js.native
}
}
}

@js.native
@JSName("Phaser.Video")
class Video protected () extends js.Object {
  def this(game: Phaser.Game, key: String = ???, url: String = ???) = this()
  var game: Phaser.Game = js.native
  var key: String = js.native
  var video: HTMLVideoElement = js.native
  var baseTexture: PIXI.BaseTexture = js.native
  var texture: PIXI.Texture = js.native
  var textureFrame: Phaser.Frame = js.native
  var `type`: Double = js.native
  var disableTextureUpload: Boolean = js.native
  var dirty: Boolean = js.native
  var currentTime: Double = js.native
  var duration: Double = js.native
  var progress: Double = js.native
  var mute: Boolean = js.native
  var paused: Boolean = js.native
  var volume: Boolean = js.native
  var playbackRate: Boolean = js.native
  var playing: Boolean = js.native
  var loop: Boolean = js.native
  var width: Double = js.native
  var height: Double = js.native
  var videoStream: js.Any = js.native
  var isStreaming: Boolean = js.native
  var snapshot: Phaser.BitmapData = js.native
  var timeout: Double = js.native
  var retryLimit: Double = js.native
  var retry: Double = js.native
  var retryInterval: Double = js.native
  var onAccess: Phaser.Signal = js.native
  var onError: Phaser.Signal = js.native
  var onPlay: Phaser.Signal = js.native
  var onComplete: Phaser.Signal = js.native
  var onUpdate: Phaser.Signal = js.native
  var onTimeout: Phaser.Signal = js.native
  var touchLocked: Boolean = js.native
  var complete: js.Function0[Unit] = js.native
  def add(`object`: Phaser.Sprite | js.Array[Phaser.Sprite] | Phaser.Image | js.Array[Phaser.Image]): Phaser.Video = js.native
  def addToWorld(x: Double = ???, y: Double = ???, anchorX: Double = ???, anchorY: Number = ???, scaleX: Double = ???, scaleY: Double = ???): Phaser.Image = js.native
  def createVideoFromBlob(blob: Blob): Phaser.Video = js.native
  def startMediaStream(captureAudio: Boolean = ???, width: Double = ???, height: Double = ???): Phaser.Video = js.native
  def createVideoFromURL(url: String, autoplay: Boolean = ???): Phaser.Video = js.native
  def changeSource(src: String, autoplay: Boolean = ???): Phaser.Video = js.native
  def connectToMediaStram(video: js.Any, stream: js.Any): Phaser.Video = js.native
  def destroy(): Unit = js.native
  def play(loop: Boolean = ???, playbackRate: Double = ???): Phaser.Video = js.native
  def playHandler(): Unit = js.native
  def render(): Unit = js.native
  def removeVideoElement(): Unit = js.native
  def resizeFrame(parent: js.Any, width: Double, height: Double): Unit = js.native
  def setTouchLock(): Unit = js.native
  def grab(clear: Boolean = ???, alpha: Double = ???, blendMode: String = ???): Phaser.BitmapData = js.native
  def stop(): Unit = js.native
  def unlock(): Boolean = js.native
  def updateTexture(event: js.Any = ???, width: Double = ???, height: Double = ???): Unit = js.native
}

@js.native
@JSName("Phaser.Plugin")
class Plugin protected () extends IStateCycle {
  def this(game: Phaser.Game, parent: PIXI.DisplayObject) = this()
  var active: Boolean = js.native
  var game: Phaser.Game = js.native
  var hasPostRender: Boolean = js.native
  var hasPostUpdate: Boolean = js.native
  var hasPreUpdate: Boolean = js.native
  var hasRender: Boolean = js.native
  var hasUpdate: Boolean = js.native
  var parent: PIXI.DisplayObject = js.native
  var visible: Boolean = js.native
  def destroy(): Unit = js.native
  def postRender(): Unit = js.native
  def preUpdate(): Unit = js.native
  def render(): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.Plugin")
@js.native
object Plugin extends js.Object {

@js.native
@JSName("Phaser.Plugin.AStar")
class AStar protected () extends Phaser.Plugin {
  def this(parent: PIXI.DisplayObject) = this()
  var parent: PIXI.DisplayObject = js.native
  var version: String = js.native
  def findPath(startPoint: Phaser.Point, goalPoint: Phaser.Point): Phaser.Plugin.AStar.AStarPath = js.native
  def isWalkable(x: Double, y: Double): Boolean = js.native
  def setAStarMap(map: Phaser.Tilemap, layerName: String, tilesetName: String): Phaser.Plugin.AStar = js.native
}

@JSName("Phaser.Plugin.AStar")
@js.native
object AStar extends js.Object {
  var VERSION: String = js.native
  var COST_ORTHAGONAL: Double = js.native
  var COST_DIAGAONAL: Double = js.native
  var DISTANCE_MANHATTEN: String = js.native
  var DISTANCE_EUCLIDIAN: String = js.native

@js.native
@JSName("Phaser.Plugin.AStar.AStarNode")
class AStarNode protected () extends js.Object {
  def this(x: Double, y: Double, isWalkable: Boolean) = this()
  var x: Double = js.native
  var y: Double = js.native
  var g: Double = js.native
  var h: Double = js.native
  var f: Double = js.native
  var parent: Phaser.Plugin.AStar.AStarNode = js.native
  var travelCost: Double = js.native
  var walkable: Boolean = js.native
}

@js.native
@JSName("Phaser.Plugin.AStar.AStarPath")
class AStarPath protected () extends js.Object {
  def this(nodes: js.Array[Phaser.Plugin.AStar.AStarNode], start: Phaser.Plugin.AStar.AStarNode, goal: Phaser.Plugin.AStar.AStarNode) = this()
  var nodes: js.Array[Phaser.Plugin.AStar.AStarNode] = js.native
  var start: Phaser.Plugin.AStar.AStarNode = js.native
  var goal: Phaser.Plugin.AStar.AStarNode = js.native
  var visited: js.Array[Phaser.Plugin.AStar.AStarNode] = js.native
}
}

@js.native
@JSName("Phaser.Plugin.ColorHarmony")
class ColorHarmony extends Phaser.Plugin {
  def getAnalogousHarmony(color: Double, threshold: Double = ???): js.Dynamic = js.native
  def getComplementHarmony(color: Double): Double = js.native
  def getSplitComplementHarmony(color: Double, threshold: Double): js.Dynamic = js.native
  def getTriadicHarmony(color: Double): js.Dynamic = js.native
}

@js.native
@JSName("Phaser.Plugin.CSS3Filters")
class CSS3Filters protected () extends Phaser.Plugin {
  def this(parent: PIXI.DisplayObject) = this()
  var blur: Double = js.native
  var brightness: Double = js.native
  var contrast: Double = js.native
  var grayscale: Double = js.native
  var hueRotate: Double = js.native
  var invert: Double = js.native
  var opacity: Double = js.native
  var saturate: Double = js.native
  var sepia: Double = js.native
}

@js.native
@JSName("Phaser.Plugin.TilemapWalker")
class TilemapWalker protected () extends Phaser.Plugin {
  def this(game: Phaser.Game, map: Phaser.Tilemap, layer: js.Any = ???, x: Double = ???, y: Double = ???) = this()
  var collides: Boolean = js.native
  var game: Phaser.Game = js.native
  var history: Boolean = js.native
  var facing: Double = js.native
  var map: Phaser.Tilemap = js.native
  var location: Phaser.Point = js.native
  var locationLayer: Double = js.native
  def checkTile(x: Double, y: Double): Boolean = js.native
  def getTileFromLocation(x: Double, y: Double): Phaser.Tile = js.native
  def getTiles(width: Double, height: Double, center: Boolean = ???): js.Array[js.Any] = js.native
  def getTileBehind(distance: Double = ???): Phaser.Tile = js.native
  def getTileBehindLeft(distance: Double = ???): Phaser.Tile = js.native
  def getTileBehindRight(distance: Double = ???): Phaser.Tile = js.native
  def getTileAhead(distance: Double = ???): Phaser.Tile = js.native
  def getTileAheadLeft(distance: Double = ???): Phaser.Tile = js.native
  def getTileAheadRight(distance: Double = ???): Phaser.Tile = js.native
  def getTileLeft(distance: Double): Phaser.Tile = js.native
  def getTileRight(distance: Double): Phaser.Tile = js.native
  def moveForward(): Boolean = js.native
  def moveBackward(): Boolean = js.native
  def moveLeft(): Boolean = js.native
  def moveRight(): Boolean = js.native
  def putTile(index: Double): Unit = js.native
  def setLocation(x: Double, y: Double, layer: js.Any = ???): Boolean = js.native
  def turnLeft(): Unit = js.native
  def turnRight(): Unit = js.native
  def updateLocation(x: Double, y: Double): Boolean = js.native
}

@js.native
@JSName("Phaser.Plugin.SamplePlugin")
class SamplePlugin protected () extends Phaser.Plugin {
  def this(game: Phaser.Game, parent: PIXI.DisplayObject) = this()
  def addSprite(sprite: Phaser.Sprite): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("Phaser.Plugin.VirtualJoystick")
class VirtualJoystick protected () extends Phaser.Plugin {
  def this(game: Phaser.Game, parent: js.Any) = this()
  var angle: Double = js.native
  var base: Phaser.Sprite = js.native
  var baseBMD: Phaser.BitmapData = js.native
  var baseCircle: Phaser.Circle = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var distance: Double = js.native
  var force: Double = js.native
  var isDragging: Boolean = js.native
  var limit: Double = js.native
  var limitPoint: Phaser.Point = js.native
  var location: Phaser.Point = js.native
  var nub: Phaser.Sprite = js.native
  var nubBMD: Phaser.BitmapData = js.native
  var speed: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def init(x: Double, y: Double, diameter: Double = ???, limit: Double = ???): Unit = js.native
  def move(pointer: Phaser.Pointer, x: Double, y: Double): Unit = js.native
  def render(): Unit = js.native
  def setVelocity(sprite: Phaser.Sprite, minSpeed: Double = ???, maxSpeed: Double = ???): Phaser.Sprite = js.native
  def startDrag(): Unit = js.native
  def stopDrag(nub: Phaser.Sprite, pointer: Phaser.Pointer): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("Phaser.Plugin.Webcam")
class Webcam protected () extends Phaser.Plugin {
  def this(game: Phaser.Game, parent: PIXI.DisplayObject) = this()
  var active: Boolean = js.native
  var context: js.Any = js.native
  var stream: js.Any = js.native
  var video: HTMLVideoElement = js.native
  var connectCallback: js.Function1[js.Any, Unit] = js.native
  var errorCallback: js.Function1[js.Any, Unit] = js.native
  var grab: js.Function3[js.Any, Double, Double, Unit] = js.native
  def start(width: Double, height: Double, context: js.Any): Unit = js.native
  def stop(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("Phaser.Plugin.Juicy")
class Juicy protected () extends Phaser.Plugin {
  def this(game: Phaser.Game) = this()
  def createScreenFlash(color: String = ???): Phaser.Plugin.Juicy.ScreenFlash = js.native
  def createTrail(length: Double = ???, color: Double = ???): Phaser.Plugin.Juicy.Trail = js.native
  def overScale(`object`: Phaser.Sprite, scale: Double = ???, initialScale: Phaser.Point = ???): Unit = js.native
  def jelly(`object`: Phaser.Sprite, strength: Double = ???, delay: Double = ???, initialScale: Phaser.Point = ???): Unit = js.native
  def mouseStretch(`object`: Phaser.Sprite, strength: Double = ???, initialScale: Phaser.Point = ???): Unit = js.native
  def update(): Unit = js.native
  def shake(duration: Double = ???, strength: Double = ???): Unit = js.native
}

@JSName("Phaser.Plugin.Juicy")
@js.native
object Juicy extends js.Object {

@js.native
@JSName("Phaser.Plugin.Juicy.Trail")
class Trail protected () extends js.Object {
  def this(game: Phaser.Game, trailLength: Double = ???, color: Double = ???) = this()
  var target: Phaser.Sprite = js.native
  var trailLength: Double = js.native
  var trailWidth: Double = js.native
  var trailScaling: Boolean = js.native
  var trailColor: Double = js.native
  def update(): Unit = js.native
  def addSegment(x: Double, y: Double): Unit = js.native
  def redrawSegments(offsetX: Double, offsetY: Double): Unit = js.native
}

@js.native
@JSName("Phaser.Plugin.Juicy.ScreenFlash")
class ScreenFlash protected () extends js.Object {
  def this(game: Phaser.Game, color: String = ???) = this()
  def flash(maxAlpha: Double = ???, duration: Double = ???): Unit = js.native
}
}
}

@js.native
@JSName("Phaser.PluginManager")
class PluginManager protected () extends IStateCycle {
  def this(game: Phaser.Game) = this()
  var game: Phaser.Game = js.native
  var plugins: js.Array[Phaser.Plugin] = js.native
  def add(plugin: Phaser.Plugin | Phaser.Plugin.type, parameter: js.Any*): Phaser.Plugin = js.native
  def destroy(): Unit = js.native
  def postRender(): Unit = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def remove(plugin: Phaser.Plugin): Unit = js.native
  def removeAll(): Unit = js.native
  def render(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("Phaser.Point")
class Point protected () extends PIXI.Point {
  def this(x: Double = ???, y: Double = ???) = this()
  var x: Double = js.native
  var y: Double = js.native
  var `type`: Double = js.native
  def add(x: Double, y: Double): Phaser.Point = js.native
  def angle(a: Phaser.Point, asDegrees: Boolean = ???): Double = js.native
  def angleSq(a: Phaser.Point): Double = js.native
  def clamp(min: Double, max: Double): Phaser.Point = js.native
  def clampX(min: Double, max: Double): Phaser.Point = js.native
  def clampY(min: Double, max: Double): Phaser.Point = js.native
  def clone(output: Phaser.Point = ???): Phaser.Point = js.native
  def copyFrom(source: Phaser.Point): Phaser.Point = js.native
  def copyTo[T](dest: T): T = js.native
  def ceil(): Phaser.Point = js.native
  def cross(a: Phaser.Point): Double = js.native
  def divide(x: Double, y: Double): Phaser.Point = js.native
  def distance(dest: Phaser.Point, round: Boolean = ???): Double = js.native
  def dot(a: Phaser.Point): Double = js.native
  def equals(a: Phaser.Point): Boolean = js.native
  def floor(): Phaser.Point = js.native
  def getMagnitude(): Double = js.native
  def getMagnitudeSq(): Double = js.native
  def invert(): Phaser.Point = js.native
  def isZero(): Boolean = js.native
  def multiply(x: Double, y: Double): Phaser.Point = js.native
  def normalize(): Phaser.Point = js.native
  def normalRightHand(): Phaser.Point = js.native
  def perp(): Phaser.Point = js.native
  def rperp(): Phaser.Point = js.native
  def rotate(x: Double, y: Double, angle: Double, asDegrees: Boolean = ???, distance: Double = ???): Phaser.Point = js.native
  def set(x: Double, y: Double = ???): Phaser.Point = js.native
  def setMagnitude(magnitude: Double): Phaser.Point = js.native
  def setTo(x: Double, y: Double = ???): Phaser.Point = js.native
  def subtract(x: Double, y: Double): Phaser.Point = js.native
  def toString(): String = js.native
}

@JSName("Phaser.Point")
@js.native
object Point extends js.Object {
  def add(a: Phaser.Point, b: Phaser.Point, out: Phaser.Point = ???): Phaser.Point = js.native
  def subtract(a: Phaser.Point, b: Phaser.Point, out: Phaser.Point = ???): Phaser.Point = js.native
  def multiply(a: Phaser.Point, b: Phaser.Point, out: Phaser.Point = ???): Phaser.Point = js.native
  def divide(a: Phaser.Point, b: Phaser.Point, out: Phaser.Point = ???): Phaser.Point = js.native
  def equals(a: Phaser.Point, b: Phaser.Point): Boolean = js.native
  def angle(a: Phaser.Point, b: Phaser.Point): Double = js.native
  def angleSq(a: Phaser.Point, b: Phaser.Point): Double = js.native
  def negative(a: Phaser.Point, out: Phaser.Point = ???): Phaser.Point = js.native
  def multiplyAdd(a: Phaser.Point, b: Phaser.Point, scale: Double, out: Phaser.Point = ???): Phaser.Point = js.native
  def interpolate(a: Phaser.Point, b: Phaser.Point, alpha: Double, out: Phaser.Point = ???): Phaser.Point = js.native
  def parse(obj: js.Any, xProp: String = ???, yProp: String = ???): Phaser.Point = js.native
  def perp(a: Phaser.Point, out: Phaser.Point = ???): Phaser.Point = js.native
  def rperp(a: Phaser.Point, out: Phaser.Point = ???): Phaser.Point = js.native
  def distance(a: js.Any, b: js.Any, round: Boolean = ???): Double = js.native
  def project(a: Phaser.Point, b: Phaser.Point, out: Phaser.Point = ???): Phaser.Point = js.native
  def projectUnit(a: Phaser.Point, b: Phaser.Point, out: Phaser.Point = ???): Phaser.Point = js.native
  def normalRightHand(a: Phaser.Point, out: Phaser.Point = ???): Phaser.Point = js.native
  def normalize(a: Phaser.Point, out: Phaser.Point = ???): Phaser.Point = js.native
  def rotate(a: Phaser.Point, x: Double, y: Double, angle: Double, asDegrees: Boolean = ???, distance: Double = ???): Phaser.Point = js.native
  def centroid(points: js.Array[Phaser.Point], out: Phaser.Point = ???): Phaser.Point = js.native
}

@js.native
@JSName("Phaser.Pointer")
class Pointer protected () extends js.Object {
  def this(game: Phaser.Game, id: Double) = this()
  var active: Boolean = js.native
  var backButton: Boolean = js.native
  var button: js.Any = js.native
  var circle: Phaser.Circle = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var dirty: Boolean = js.native
  var duration: Double = js.native
  var eraserButton: Boolean = js.native
  var exists: Boolean = js.native
  var forwardButton: Boolean = js.native
  var game: Phaser.Game = js.native
  var id: Double = js.native
  var identifier: Double = js.native
  var isDown: Boolean = js.native
  var isMouse: Boolean = js.native
  var isUp: Boolean = js.native
  var leftButton: Boolean = js.native
  var middleButton: Boolean = js.native
  var movementX: Double = js.native
  var movementY: Double = js.native
  var msSinceLastClick: Double = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var pointerId: Double = js.native
  var position: Phaser.Point = js.native
  var positionDown: Phaser.Point = js.native
  var positionUp: Phaser.Point = js.native
  var previousTapTime: Double = js.native
  var rawMovementX: Double = js.native
  var rawMovementY: Double = js.native
  var rightButton: Boolean = js.native
  var screenX: Double = js.native
  var screenY: Double = js.native
  var target: js.Any = js.native
  var targetObject: js.Any = js.native
  var timeDown: Double = js.native
  var timeUp: Double = js.native
  var totalTouches: Double = js.native
  var `type`: Double = js.native
  var withinGame: Boolean = js.native
  var worldX: Double = js.native
  var worldY: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def addClickTrampoline(name: String, callback: js.Function, callbackContext: js.Any, callbackArgs: js.Any*): Unit = js.native
  def justPressed(duration: Double = ???): Boolean = js.native
  def justReleased(duration: Double = ???): Boolean = js.native
  def leave(event: js.Any): Unit = js.native
  def move(event: js.Any, fromClick: Boolean = ???): Unit = js.native
  def reset(): Unit = js.native
  def resetButtons(): Unit = js.native
  def resetMovement(): Unit = js.native
  def start(event: js.Any): Unit = js.native
  def stop(event: js.Any): Unit = js.native
  def update(): Unit = js.native
  def updateButtons(event: MouseEvent): Unit = js.native
}

@JSName("Phaser.Pointer")
@js.native
object Pointer extends js.Object {
  var NO_BUTTON: Double = js.native
  var LEFT_BUTTON: Double = js.native
  var RIGHT_BUTTON: Double = js.native
  var MIDDLE_BUTTON: Double = js.native
  var BACK_BUTTON: Double = js.native
  var FORWARD_BUTTON: Double = js.native
  var ERASER_BUTTON: Double = js.native
}

@js.native
@JSName("Phaser.Polygon")
class Polygon protected () extends js.Object {
  def this(points: js.Array[Phaser.Point] | js.Array[Double]) = this()
  def this(points: Phaser.Point*) = this()
  def this(points: Double*) = this()
  var area: Double = js.native
  var points: js.Array[Double] | js.Array[Phaser.Point] = js.native
  var `type`: Double = js.native
  def clone(output: Phaser.Polygon): Phaser.Polygon = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def flatten(): Phaser.Polygon = js.native
  def setTo(points: js.Array[Phaser.Point] | js.Array[Double]): Unit = js.native
  def setTo(points: Phaser.Point*): Unit = js.native
  def setTo(points: Double*): Unit = js.native
  def toNumberArray(output: js.Array[Double] = ???): js.Array[Double] = js.native
}

@js.native
@JSName("Phaser.QuadTree")
class QuadTree protected () extends js.Object {
  def this(x: Double, y: Double, width: Double, height: Double, maxObject: Double = ???, maxLevels: Double = ???, level: Double = ???) = this()
  var bounds: js.Any = js.native
  var level: Double = js.native
  var maxObjects: Double = js.native
  var maxLevels: Double = js.native
  var objects: js.Array[js.Any] = js.native
  var nodes: js.Array[js.Any] = js.native
  def clear(): Unit = js.native
  def getIndex(rect: js.Any): Double = js.native
  def insert(body: js.Any): Unit = js.native
  def populate(group: Phaser.Group): Unit = js.native
  def populateHandler(sprite: Phaser.Sprite): Unit = js.native
  def reset(x: Double, y: Double, width: Double, height: Double, maxObject: Double = ???, maxLevels: Double = ???, level: Double = ???): Unit = js.native
  def retrieve(source: js.Any): js.Array[js.Any] = js.native
  def split(): Unit = js.native
}

@js.native
@JSName("Phaser.RandomDataGenerator")
class RandomDataGenerator protected () extends js.Object {
  def this(seeds: js.Array[Double]) = this()
  def angle(): Double = js.native
  def between(min: Double, max: Double): Double = js.native
  def frac(): Double = js.native
  def integer(): Double = js.native
  def integerInRange(min: Double, max: Double): Double = js.native
  def normal(): Double = js.native
  def pick[T](ary: js.Array[T]): T = js.native
  def real(): Double = js.native
  def realInRange(min: Double, max: Double): Double = js.native
  def sow(seeds: js.Array[Double]): Unit = js.native
  def timestamp(min: Double, max: Double): Double = js.native
  def uuid(): Double = js.native
  def weightedPick[T](ary: js.Array[T]): T = js.native
}

@js.native
@JSName("Phaser.Rectangle")
class Rectangle protected () extends js.Object {
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  var bottom: Double = js.native
  var bottomRight: Phaser.Point = js.native
  var bottomLeft: Phaser.Point = js.native
  var centerX: Double = js.native
  var centerY: Double = js.native
  var empty: Boolean = js.native
  var halfHeight: Double = js.native
  var halfWidth: Double = js.native
  var height: Double = js.native
  var left: Double = js.native
  var perimeter: Double = js.native
  var randomX: Double = js.native
  var randomY: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  var topLeft: Phaser.Point = js.native
  var topRight: Phaser.Point = js.native
  var `type`: Double = js.native
  var volume: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def ceil(): Unit = js.native
  def ceilAll(): Unit = js.native
  def centerOn(x: Double, y: Double): Phaser.Rectangle = js.native
  def clone(output: Phaser.Rectangle): Phaser.Rectangle = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def containsRect(b: Phaser.Rectangle): Boolean = js.native
  def copyFrom(source: js.Any): Phaser.Rectangle = js.native
  def copyTo(dest: js.Any): js.Dynamic = js.native
  def equals(b: Phaser.Rectangle): Boolean = js.native
  def floor(): Unit = js.native
  def floorAll(): Unit = js.native
  def inflate(dx: Double, dy: Double): Phaser.Rectangle = js.native
  def intersection(b: Phaser.Rectangle, out: Phaser.Rectangle): Phaser.Rectangle = js.native
  def intersects(b: Phaser.Rectangle, tolerance: Double): Boolean = js.native
  def intersectsRaw(left: Double, right: Double, top: Double, bottom: Double, tolerance: Double): Boolean = js.native
  def offset(dx: Double, dy: Double): Phaser.Rectangle = js.native
  def offsetPoint(point: Phaser.Point): Phaser.Rectangle = js.native
  def random(out: Phaser.Point = ???): Phaser.Point = js.native
  def resize(width: Double, height: Double): Phaser.Rectangle = js.native
  def setTo(x: Double, y: Double, width: Double, height: Double): Phaser.Rectangle = js.native
  def scale(x: Double, y: Double = ???): Phaser.Rectangle = js.native
  def size(output: Phaser.Point = ???): Phaser.Point = js.native
  def toString(): String = js.native
  def union(b: Phaser.Rectangle, out: Phaser.Rectangle = ???): Phaser.Rectangle = js.native
}

@JSName("Phaser.Rectangle")
@js.native
object Rectangle extends js.Object {
  def aabb(points: js.Array[Phaser.Point], out: Phaser.Rectangle = ???): Phaser.Rectangle = js.native
  def clone(a: Phaser.Rectangle, output: Phaser.Rectangle = ???): Phaser.Rectangle = js.native
  def contains(a: Phaser.Rectangle, x: Double, y: Double): Boolean = js.native
  def containsPoint(a: Phaser.Rectangle, point: Phaser.Point): Boolean = js.native
  def containsRaw(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double): Boolean = js.native
  def containsRect(a: Phaser.Rectangle, b: Phaser.Rectangle): Boolean = js.native
  def equals(a: Phaser.Rectangle, b: Phaser.Rectangle): Boolean = js.native
  def inflate(a: Phaser.Rectangle, dx: Double, dy: Double): Phaser.Rectangle = js.native
  def inflatePoint(a: Phaser.Rectangle, point: Phaser.Point): Phaser.Rectangle = js.native
  def intersection(a: Phaser.Rectangle, b: Phaser.Rectangle, out: Phaser.Rectangle = ???): Phaser.Rectangle = js.native
  def intersects(a: Phaser.Rectangle, b: Phaser.Rectangle): Boolean = js.native
  def intersectsRaw(left: Double, right: Double, top: Double, bottom: Double, tolerance: Double): Boolean = js.native
  def size(a: Phaser.Rectangle, output: Phaser.Point = ???): Phaser.Point = js.native
  def union(a: Phaser.Rectangle, b: Phaser.Rectangle, out: Phaser.Rectangle = ???): Phaser.Rectangle = js.native
}

@js.native
@JSName("Phaser.RenderTexture")
class RenderTexture protected () extends PIXI.RenderTexture {
  def this(game: Phaser.Game, width: Double = ???, height: Double = ???, key: String = ???, scaleMode: Double = ???, resolution: Double = ???) = this()
  var crop: PIXI.Rectangle = js.native
  var game: Phaser.Game = js.native
  var key: String = js.native
  var `type`: Double = js.native
  def render(displayObject: PIXI.DisplayObject, matrix: Phaser.Matrix = ???, clear: Boolean = ???): Unit = js.native
  def renderXY(displayObject: PIXI.DisplayObject, x: Double, y: Double, clear: Boolean = ???): Unit = js.native
  def renderRawXY(displayObject: PIXI.DisplayObject, x: Double, y: Double, clear: Boolean = ???): Unit = js.native
}

@js.native
@JSName("Phaser.RequestAnimationFrame")
class RequestAnimationFrame protected () extends js.Object {
  def this(game: Phaser.Game, forceSetTimeOut: Boolean = ???) = this()
  var forceSetTimeOut: Boolean = js.native
  var game: Phaser.Game = js.native
  var isRunning: Boolean = js.native
  def isRAF(): Boolean = js.native
  def isSetTimeOut(): Boolean = js.native
  def start(): Boolean = js.native
  def stop(): Unit = js.native
  def updateRAF(rafTime: Double): Unit = js.native
  def updateSetTimeout(time: Double): Unit = js.native
}

@js.native
@JSName("Phaser.RetroFont")
class RetroFont protected () extends Phaser.RenderTexture {
  def this(game: Phaser.Game, key: String, characterWidth: Double, characterHeight: Double, chars: String, charsPerRow: Double = ???, xSpacing: Double = ???, ySpacing: Double = ???, xOffset: Double = ???, yOffset: Double = ???) = this()
  var align: String = js.native
  var autoUpperCase: Boolean = js.native
  var characterHeight: Double = js.native
  var characterPerRow: Double = js.native
  var characterSpacingX: Double = js.native
  var characterSpacingY: Double = js.native
  var characterWidth: Double = js.native
  var customSpacingX: Double = js.native
  var customSpacingY: Double = js.native
  var fixedWidth: Double = js.native
  var fontSet: Image = js.native
  var frameData: Phaser.FrameData = js.native
  var multiLine: Boolean = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var smoothed: String = js.native
  var stamp: Phaser.Image = js.native
  var text: String = js.native
  def buildRetroFontText(): Unit = js.native
  def getLongestLine(): Double = js.native
  def pasteLine(line: String, x: Double, y: Double, customSpacingX: Double): Unit = js.native
  def removeUnsupportedCharacters(stripCR: Boolean = ???): String = js.native
  def setFixedWidth(width: Double, lineAlignment: String = ???): Unit = js.native
  def setText(content: String, multiLine: Boolean = ???, characterSpacing: Double = ???, lineSpacing: Double = ???, lineAlignment: String = ???, allowLowerCase: Boolean = ???): Unit = js.native
  def updateOffset(x: Double = ???, y: Double = ???): Unit = js.native
}

@JSName("Phaser.RetroFont")
@js.native
object RetroFont extends js.Object {
  var ALIGN_CENTER: String = js.native
  var ALIGN_LEFT: String = js.native
  var ALIGN_RIGHT: String = js.native
  var TEXT_SET1: String = js.native
  var TEXT_SET2: String = js.native
  var TEXT_SET3: String = js.native
  var TEXT_SET4: String = js.native
  var TEXT_SET5: String = js.native
  var TEXT_SET6: String = js.native
  var TEXT_SET7: String = js.native
  var TEXT_SET8: String = js.native
  var TEXT_SET9: String = js.native
  var TEXT_SET10: String = js.native
  var TEXT_SET11: String = js.native
}

@js.native
@JSName("Phaser.Rope")
class Rope protected () extends PIXI.Rope {
  def this(game: Phaser.Game, x: Double, y: Double, key: String | Phaser.RenderTexture | Phaser.BitmapData | PIXI.Texture | Phaser.Video, frame: String | Double = ???, points: js.Array[Phaser.Point] = ???) = this()
  var angle: Double = js.native
  var animations: Phaser.AnimationManager = js.native
  var alive: Boolean = js.native
  var autoCull: Boolean = js.native
  var body: Phaser.Physics.Arcade.Body | Phaser.Physics.P2.Body | Phaser.Physics.Ninja.Body | js.Any = js.native
  var bottom: Double = js.native
  var cameraOffset: Phaser.Point = js.native
  var checkWorldBounds: Boolean = js.native
  var cropRect: Phaser.Rectangle = js.native
  var components: js.Any = js.native
  var customRender: Boolean = js.native
  var debug: Boolean = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var deltaZ: Double = js.native
  var destroyPhase: Boolean = js.native
  var exists: Boolean = js.native
  var events: Phaser.Events = js.native
  var fixedToCamera: Boolean = js.native
  var frame: String | Double = js.native
  var frameName: String = js.native
  var fresh: Boolean = js.native
  var game: Phaser.Game = js.native
  var inCamera: Boolean = js.native
  var input: Phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var inWorld: Boolean = js.native
  var left: Double = js.native
  var lifespan: Double = js.native
  var key: String | Phaser.RenderTexture | Phaser.BitmapData | PIXI.Texture | Phaser.Video = js.native
  var name: String = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var outOfBoundsKill: Boolean = js.native
  def overlap(displayObject: Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Button | PIXI.DisplayObject): Boolean = js.native
  var pendingDestroy: Boolean = js.native
  var points: js.Array[Phaser.Point] = js.native
  var position: Phaser.Point = js.native
  var previousPosition: Phaser.Point = js.native
  var previousRotation: Double = js.native
  var right: Double = js.native
  var renderOrderID: Double = js.native
  var segments: js.Array[Phaser.Rectangle] = js.native
  var smoothed: Boolean = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var transformCallback: js.Function = js.native
  var transformCallbackContent: js.Any = js.native
  var scaleMin: Phaser.Point = js.native
  var scaleMax: Phaser.Point = js.native
  var updateAnimation: js.Function = js.native
  var world: Phaser.Point = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def bringToTop(): Phaser.Rope = js.native
  def checkTransform(wt: PIXI.Matrix): Unit = js.native
  def crop(rect: Phaser.Rectangle, copy: Boolean = ???): Unit = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def kill(): Phaser.Rope = js.native
  def loadTexture(key: String | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture, frame: String | Double = ???, stopAnimation: Boolean = ???): Unit = js.native
  def moveUp(): Phaser.Rope = js.native
  def moveDown(): Phaser.Rope = js.native
  def play(name: String, frameRate: Double = ???, loop: Boolean = ???, killOnComplete: Boolean = ???): Phaser.Animation = js.native
  def preUpdate(): Unit = js.native
  def postUpdate(): Unit = js.native
  def reset(x: Double, y: Double, health: Double = ???): Phaser.Rope = js.native
  def resizeFrame(parent: js.Any, width: Double, height: Double): Unit = js.native
  def resetFrame(): Unit = js.native
  def revive(health: Double = ???): Phaser.Rope = js.native
  def sendToBack(): Phaser.Rope = js.native
  def setFrame(frame: Phaser.Frame): Unit = js.native
  def setScaleMinMax(minX: Double = ???, minY: Double = ???, maxX: Double = ???, maxY: Double = ???): Unit = js.native
  def updateCrop(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("Phaser.RoundedRectangle")
class RoundedRectangle extends PIXI.RoundedRectangle {
  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var radius: Double = js.native
  var `type`: Double = js.native
  def clone(): RoundedRectangle = js.native
  def contains(x: Double, y: Double): Boolean = js.native
}

@js.native
@JSName("Phaser.Signal")
class Signal extends js.Object {
  var active: Boolean = js.native
  var boundDispatch: js.Function = js.native
  var memorize: Boolean = js.native
  def dispatch(params: js.Any*): Unit = js.native
  def dispose(): Unit = js.native
  def forget(): Unit = js.native
  def getNumListeners(): Double = js.native
  def halt(): Unit = js.native
  def has(listener: js.Function, context: js.Any = ???): Boolean = js.native
  def remove(listener: js.Function, context: js.Any = ???): js.Function = js.native
  def removeAll(context: js.Any = ???): Unit = js.native
  def toString(): String = js.native
  def validateListener(listener: js.Function, fnName: String): Unit = js.native
}

@js.native
@JSName("Phaser.SignalBinding")
class SignalBinding protected () extends js.Object {
  var active: Boolean = js.native
  var callCount: Double = js.native
  var context: js.Any = js.native
  var params: js.Array[js.Any] = js.native
  def execute(paramsArr: js.Array[js.Any] = ???): Unit = js.native
  def detach(): js.Function = js.native
  def isBound(): Boolean = js.native
  def isOnce(): Boolean = js.native
  def getListener(): js.Function = js.native
  def getSignal(): Phaser.Signal = js.native
  def toString(): String = js.native
}

@js.native
@JSName("Phaser.SinglePad")
class SinglePad protected () extends js.Object {
  def this(game: Phaser.Game, padParent: js.Any) = this()
  var callbackContext: js.Any = js.native
  var connected: Boolean = js.native
  var deadZone: Double = js.native
  var game: Phaser.Game = js.native
  var index: Double = js.native
  var onAxisCallback: js.Function = js.native
  var onConnectCallback: js.Function = js.native
  var onDisconnectCallback: js.Function = js.native
  var onDownCallback: js.Function = js.native
  var onFloatCallback: js.Function = js.native
  var onUpCallback: js.Function = js.native
  def axis(axisCode: Double): Double = js.native
  def addCallbacks(context: js.Any, callbacks: js.Any): Unit = js.native
  def buttonValue(buttonCode: Double): Double = js.native
  def connect(rawPad: js.Any): Unit = js.native
  def destroy(): Unit = js.native
  def disconnect(): Unit = js.native
  def getButton(buttonCode: Double): Phaser.GamepadButton = js.native
  def isDown(buttonCode: Double): Boolean = js.native
  def isUp(buttonCode: Double): Boolean = js.native
  def justPressed(buttonCode: Double, duration: Double = ???): Boolean = js.native
  def justReleased(buttonCode: Double, duration: Double = ???): Boolean = js.native
  def pollStatus(): Unit = js.native
  def processAxisChange(axisState: js.Any): Unit = js.native
  def processButtonDown(buttonCode: Double, value: js.Any): Unit = js.native
  def processButtonFloat(buttonCode: Double, value: js.Any): Unit = js.native
  def processButtonUp(buttonCode: Double, value: js.Any): Unit = js.native
  def reset(): Unit = js.native
}

@js.native
@JSName("Phaser.Sound")
class Sound protected () extends js.Object {
  def this(game: Phaser.Game, key: String, volume: Double = ???, loop: Boolean = ???, connect: Boolean = ???) = this()
  var autoplay: Boolean = js.native
  var allowMultiple: Boolean = js.native
  var context: js.Any = js.native
  var currentMarker: String = js.native
  var currentTime: Double = js.native
  def destroy(remove: Boolean = ???): Unit = js.native
  var duration: Double = js.native
  var durationMS: Double = js.native
  var externalNode: js.Any = js.native
  var fadeTween: Phaser.Tween = js.native
  var game: Phaser.Game = js.native
  var gainNode: js.Any = js.native
  var isDecoded: Boolean = js.native
  var isDecoding: Boolean = js.native
  var isPlaying: Boolean = js.native
  var key: String = js.native
  var loop: Boolean = js.native
  var markers: js.Any = js.native
  var masterGainNode: js.Any = js.native
  var mute: Boolean = js.native
  var name: String = js.native
  var onDecoded: Phaser.Signal = js.native
  var onEndedHandler: js.Function0[Unit] = js.native
  var onFadeComplete: Phaser.Signal = js.native
  var onLoop: Phaser.Signal = js.native
  var onMarkerComplete: Phaser.Signal = js.native
  var onMute: Phaser.Signal = js.native
  var onPause: Phaser.Signal = js.native
  var onPlay: Phaser.Signal = js.native
  var onResume: Phaser.Signal = js.native
  var onStop: Phaser.Signal = js.native
  var `override`: Boolean = js.native
  var paused: Boolean = js.native
  var pausedPosition: Double = js.native
  var pausedTime: Double = js.native
  var pendingPlayback: Boolean = js.native
  var position: Double = js.native
  var startTime: Double = js.native
  var stopTime: Double = js.native
  var totalDuration: Double = js.native
  var usingAudioTag: Boolean = js.native
  var usingWebAudio: Boolean = js.native
  var volume: Double = js.native
  def addMarker(name: String, start: Double, duration: Double, volume: Double = ???, loop: Boolean = ???): Unit = js.native
  def destroy(): Unit = js.native
  def fadeIn(duration: Double = ???, loop: Boolean = ???, marker: String = ???): Unit = js.native
  def fadeOut(duration: Double = ???): Unit = js.native
  def fadeTo(duration: Double = ???, volume: Double = ???): Unit = js.native
  def loopFull(volume: Double = ???): Phaser.Sound = js.native
  def pause(): Unit = js.native
  def play(marker: String = ???, position: Double = ???, volume: Double = ???, loop: Boolean = ???, forceRestart: Boolean = ???): Phaser.Sound = js.native
  def removeMarker(name: String): Unit = js.native
  def restart(marker: String, position: Double, volume: Double = ???, loop: Boolean = ???): Unit = js.native
  def resume(): Unit = js.native
  def soundHasUnlocked(key: String): Unit = js.native
  def stop(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("Phaser.SoundManager")
class SoundManager protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var channels: Double = js.native
  var connectToMaster: Boolean = js.native
  var context: js.Any = js.native
  var game: Phaser.Game = js.native
  var mute: Boolean = js.native
  var noAudio: Boolean = js.native
  var onSoundDecode: Phaser.Signal = js.native
  var onVolumeChange: Phaser.Signal = js.native
  var onMute: Phaser.Signal = js.native
  var onUnMute: Phaser.Signal = js.native
  var touchLocked: Boolean = js.native
  var usingAudioTag: Boolean = js.native
  var usingWebAudio: Boolean = js.native
  var volume: Double = js.native
  def add(key: String, volume: Double = ???, loop: Boolean = ???, connect: Boolean = ???): Phaser.Sound = js.native
  def addSprite(key: String): Phaser.AudioSprite = js.native
  def boot(): Unit = js.native
  def decode(key: String, sound: Phaser.Sound = ???): Unit = js.native
  def destroy(): Unit = js.native
  def pauseAll(): Unit = js.native
  def play(key: String, volume: Double = ???, loop: Boolean = ???): Phaser.Sound = js.native
  def remove(sound: Phaser.Sound): Boolean = js.native
  def removeByKey(key: String): Double = js.native
  def resumeAll(): Unit = js.native
  def setDecodedCallback(files: js.Array[String] | js.Array[Phaser.Sound], callback: js.Function, callbackContext: js.Any): Unit = js.native
  def setTouchLock(): Unit = js.native
  def stopAll(): Unit = js.native
  def unlock(): Boolean = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("Phaser.Sprite")
class Sprite protected () extends PIXI.Sprite {
  def this(game: Phaser.Game, x: Double, y: Double, key: String | Phaser.RenderTexture | Phaser.BitmapData | PIXI.Texture = ???, frame: String | Double = ???) = this()
  var alive: Boolean = js.native
  var anchor: Phaser.Point = js.native
  var angle: Double = js.native
  var animations: Phaser.AnimationManager = js.native
  var autoCull: Boolean = js.native
  var body: Phaser.Physics.Arcade.Body | Phaser.Physics.P2.Body | Phaser.Physics.Ninja.Body | js.Any = js.native
  var bottom: Double = js.native
  var cameraOffset: Phaser.Point = js.native
  var checkWorldBounds: Boolean = js.native
  var components: js.Any = js.native
  var cropRect: Phaser.Rectangle = js.native
  var customRender: Boolean = js.native
  var debug: Boolean = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var deltaZ: Double = js.native
  var destroyPhase: Boolean = js.native
  var events: Phaser.Events = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var frame: String | Double = js.native
  var frameName: String = js.native
  var fresh: Boolean = js.native
  var game: Phaser.Game = js.native
  var health: Double = js.native
  var inCamera: Boolean = js.native
  var input: Phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var inWorld: Boolean = js.native
  var key: String | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture = js.native
  var left: Double = js.native
  var lifespan: Double = js.native
  var maxHealth: Double = js.native
  var name: String = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var outOfBoundsKill: Boolean = js.native
  var pendingDestroy: Boolean = js.native
  var previousPosition: Phaser.Point = js.native
  var previousRotation: Double = js.native
  var position: Phaser.Point = js.native
  var physicsEnabled: Boolean = js.native
  var physicsType: Double = js.native
  var renderOrderID: Double = js.native
  var right: Double = js.native
  var scale: Phaser.Point = js.native
  var scaleMin: Phaser.Point = js.native
  var scaleMax: Phaser.Point = js.native
  var smoothed: Boolean = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var tintedTexture: HTMLCanvasElement = js.native
  var transformCallback: js.Function = js.native
  var transformCallbackContent: js.Any = js.native
  var world: Phaser.Point = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def bringToTop(): Phaser.Sprite = js.native
  def crop(rect: Phaser.Rectangle, copy: Boolean): Unit = js.native
  def checkTransform(wt: PIXI.Matrix): Unit = js.native
  def damage(amount: Double): Phaser.Sprite = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def drawPolygon(): Unit = js.native
  def heal(amount: Double): Phaser.Sprite = js.native
  def kill(): Phaser.Sprite = js.native
  def loadTexture(key: String | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture, frame: String | Double = ???, stopAnimation: Boolean = ???): Unit = js.native
  def moveUp(): Phaser.Sprite = js.native
  def moveDown(): Phaser.Sprite = js.native
  def overlap(displayObject: Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Button | PIXI.DisplayObject): Boolean = js.native
  def play(name: String, frameRate: Double = ???, loop: Boolean = ???, killOnComplete: Boolean = ???): Phaser.Animation = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def reset(x: Double, y: Double, health: Double = ???): Phaser.Sprite = js.native
  def resetFrame(): Unit = js.native
  def resizeFrame(parent: js.Any, width: Double, height: Double): Unit = js.native
  def revive(health: Double = ???): Phaser.Sprite = js.native
  def sendToBack(): Phaser.Sprite = js.native
  def setFrame(frame: Phaser.Frame): Unit = js.native
  def setScaleMinMax(minX: Double = ???, minY: Double = ???, maxX: Double = ???, maxY: Double = ???): Unit = js.native
  def update(): Unit = js.native
  def updateCrop(): Unit = js.native
}

@js.native
@JSName("Phaser.SpriteBatch")
class SpriteBatch protected () extends Phaser.Group {
  def this(game: Phaser.Game, parent: PIXI.DisplayObjectContainer, name: String = ???, addedToStage: Boolean = ???) = this()
  var `type`: Double = js.native
}

@js.native
@JSName("Phaser.Stage")
class Stage protected () extends PIXI.Stage {
  def this(game: Phaser.Game) = this()
  var backgroundColor: js.Any = js.native
  var currentRenderOrderID: Double = js.native
  var disableVisibilityChange: Boolean = js.native
  var exists: Boolean = js.native
  var game: Phaser.Game = js.native
  var name: String = js.native
  var smoothed: Boolean = js.native
  def boot(): Unit = js.native
  def checkVisibility(): Unit = js.native
  def destroy(): Unit = js.native
  def parseConfig(config: js.Any): Unit = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def setBackgroundColor(backgroundColor: Double | String): Unit = js.native
  def update(): Unit = js.native
  def updateTransform(): Unit = js.native
  def visibilityChange(event: Event): Unit = js.native
}

@js.native
trait ResizeCallback extends js.Object {
  def apply(scale: ScaleManager, parentBounds: Rectangle): js.Dynamic = js.native
}

@js.native
@JSName("Phaser.ScaleManager")
class ScaleManager protected () extends js.Object {
  def this(game: Phaser.Game, width: Double | String, height: Double | String) = this()
  var aspectRatio: Double = js.native
  var bounds: Rectangle = js.native
  var boundingParent: HTMLElement = js.native
  var compatibility: js.Any = js.native
  var currentScaleMode: Double = js.native
  var dom: Phaser.DOM = js.native
  var enterIncorrectOrientation: Signal = js.native
  var event: js.Any = js.native
  var forceLandscape: Boolean = js.native
  var forcePortrait: Boolean = js.native
  var fullScreenScaleMode: Double = js.native
  var fullScreenTarget: HTMLElement = js.native
  var game: Phaser.Game = js.native
  var grid: Phaser.FlexGrid = js.native
  var height: Double = js.native
  var incorrectOrientation: Boolean = js.native
  var isFullScreen: Boolean = js.native
  var isGameLandscape: Boolean = js.native
  var isGamePortrait: Boolean = js.native
  var isPortrait: Boolean = js.native
  var isLandscape: Boolean = js.native
  var leaveIncorrectOrientation: Signal = js.native
  var margin: js.Any = js.native
  var maxHeight: Double = js.native
  var maxWidth: Double = js.native
  var minHeight: Double = js.native
  var minWidth: Double = js.native
  var offset: Point = js.native
  var onFullScreenInit: Phaser.Signal = js.native
  var onFullScreenChange: Phaser.Signal = js.native
  var onFullScreenError: Phaser.Signal = js.native
  var onOrientationChange: Phaser.Signal = js.native
  var onSizeChange: Signal = js.native
  var pageAlignHorizontally: Boolean = js.native
  var pageAlignVertically: Boolean = js.native
  var parentNode: HTMLElement = js.native
  var parentIsWindow: Boolean = js.native
  var parentScaleFactor: Point = js.native
  var scaleFactor: Point = js.native
  var scaleFactorInversed: Point = js.native
  var scaleMode: Double = js.native
  var screenOrientation: String = js.native
  var sourceAspectRatio: Double = js.native
  var trackParentInterval: Double = js.native
  var width: Double = js.native
  var windowConstraints: js.Any = js.native
  def boot(): Unit = js.native
  def createFullScreenTarget(): HTMLDivElement = js.native
  def destroy(): Unit = js.native
  def forceOrientation(forceLandscape: Boolean, forcePortrait: Boolean = ???): Unit = js.native
  def getParentBounds(target: Rectangle = ???): Rectangle = js.native
  def parseConfig(config: js.Any): Unit = js.native
  def preUpdate(): Unit = js.native
  def pauseUpdate(): Unit = js.native
  def refresh(): Unit = js.native
  def setGameSize(width: Double, height: Double): Unit = js.native
  def setResizeCallback(callback: ResizeCallback, context: js.Any): Unit = js.native
  def setUserScale(hScale: Double, vScale: Double, hTrim: Double = ???, vTrim: Double = ???): Unit = js.native
  def setMinMax(minWidth: Double, minHeight: Double, maxWidth: Double = ???, maxHeight: Double = ???): Unit = js.native
  def setupScale(width: Double, height: Double): Unit = js.native
  def setupScale(width: String, height: String): Unit = js.native
  def scaleSprite(sprite: Sprite, width: Double = ???, height: Double = ???, letterBox: Boolean = ???): Sprite = js.native
  def scaleSprite(sprite: Image, width: Double = ???, height: Double = ???, letterBox: Boolean = ???): Sprite = js.native
  def startFullScreen(antialias: Boolean = ???, allowTrampoline: Boolean = ???): Boolean = js.native
  def stopFullScreen(): Boolean = js.native
}

@JSName("Phaser.ScaleManager")
@js.native
object ScaleManager extends js.Object {
  var EXACT_FIT: Double = js.native
  var NO_SCALE: Double = js.native
  var SHOW_ALL: Double = js.native
  var RESIZE: Double = js.native
  var USER_SCALE: Double = js.native
}

@js.native
@JSName("Phaser.DOM")
class DOM extends js.Object {
}

@JSName("Phaser.DOM")
@js.native
object DOM extends js.Object {
  var visualBounds: Phaser.Rectangle = js.native
  var layoutBounds: Phaser.Rectangle = js.native
  var documentBounds: Phaser.Rectangle = js.native
  def calibrate(coords: js.Any, cushion: Double = ???): js.Dynamic = js.native
  def getAspectRatio(`object`: js.Any): Double = js.native
  def getScreenOrientation(primaryFallback: String = ???): String = js.native
  def getBounds(element: js.Any, cushion: Double = ???): js.Dynamic = js.native
  def getOffset(element: js.Any, point: Point = ???): Point = js.native
  def inLayoutViewport(element: js.Any, cushion: Double = ???): Boolean = js.native
}

@js.native
@JSName("Phaser.State")
class State extends js.Object {
  var add: Phaser.GameObjectFactory = js.native
  var cache: Phaser.Cache = js.native
  var camera: Phaser.Camera = js.native
  var game: Phaser.Game = js.native
  var input: Phaser.Input = js.native
  var key: String = js.native
  var load: Phaser.Loader = js.native
  var make: Phaser.GameObjectCreator = js.native
  var particles: Phaser.Particles = js.native
  var physics: Phaser.Physics = js.native
  var rnd: Phaser.RandomDataGenerator = js.native
  var scale: Phaser.ScaleManager = js.native
  var sound: Phaser.SoundManager = js.native
  var stage: Phaser.Stage = js.native
  var time: Phaser.Time = js.native
  var tweens: Phaser.TweenManager = js.native
  var world: Phaser.World = js.native
  def create(): Unit = js.native
  def init(args: js.Any*): Unit = js.native
  def loadRender(): Unit = js.native
  def loadUpdate(): Unit = js.native
  def paused(): Unit = js.native
  def pauseUpdate(): Unit = js.native
  def preload(): Unit = js.native
  def preRender(): Unit = js.native
  def render(): Unit = js.native
  def resize(): Unit = js.native
  def resumed(): Unit = js.native
  def shutdown(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
trait IStateCycle extends js.Object {
  def preUpdate(): Unit = js.native
  def update(): Unit = js.native
  def render(): Unit = js.native
  def postRender(): Unit = js.native
  def destroy(): Unit = js.native
}

@js.native
@JSName("Phaser.StateManager")
class StateManager protected () extends js.Object {
  def this(game: Phaser.Game, pendingState: Phaser.State = ???) = this()
  var created: Boolean = js.native
  var current: String = js.native
  var game: Phaser.Game = js.native
  var onCreateCallback: js.Function = js.native
  var onInitCallback: js.Function = js.native
  var onLoadRenderCallback: js.Function = js.native
  var onLoadUpdateCallback: js.Function = js.native
  var onPausedCallback: js.Function = js.native
  var onPauseUpdateCallback: js.Function = js.native
  var onPreloadCallback: js.Function = js.native
  var onPreRenderCallback: js.Function = js.native
  var onRenderCallback: js.Function = js.native
  var onResumedCallback: js.Function = js.native
  var onResizeCallback: js.Function = js.native
  var onShutDownCallback: js.Function = js.native
  var onUpdateCallback: js.Function = js.native
  var states: js.Any = js.native
  var onStateChange: Phaser.Signal = js.native
  def add(key: String, state: js.Any, autoStart: Boolean = ???): Unit = js.native
  def checkState(key: String): Boolean = js.native
  def clearCurrentState(): Unit = js.native
  def destroy(): Unit = js.native
  def getCurrentState(): Phaser.State = js.native
  def link(key: String): Unit = js.native
  def loadComplete(): Unit = js.native
  def preRender(elapsedTime: Double): Unit = js.native
  def preUpdate(): Unit = js.native
  def render(): Unit = js.native
  def remove(key: String): Unit = js.native
  def resume(): Unit = js.native
  def restart(clearWorld: Boolean = ???, clearCache: Boolean = ???): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def update(): Unit = js.native
  def unlink(key: String): Unit = js.native
}

@js.native
trait PhaserTextStyle extends js.Object {
  var font: String = js.native
  var fill: js.Any = js.native
  var align: String = js.native
  var stroke: String = js.native
  var strokeThickness: Double = js.native
  var wordWrap: Boolean = js.native
  var wordWrapWidth: Double = js.native
  var shadowOffsetX: Double = js.native
  var shadowOffsetY: Double = js.native
  var shadowColor: String = js.native
  var shadowBlur: Double = js.native
  var valign: String = js.native
  var tab: Double = js.native
  var tabs: Double = js.native
  var fontStyle: String = js.native
  var fontVariant: String = js.native
  var fontWeight: String = js.native
  var backgroundColor: String = js.native
  var boundsAlignH: String = js.native
  var boundsAlignV: String = js.native
}

@js.native
@JSName("Phaser.Text")
class Text protected () extends Phaser.Sprite {
  def this(game: Phaser.Game, x: Double, y: Double, text: String, style: PhaserTextStyle = ???) = this()
  var align: String = js.native
  var angle: Double = js.native
  var autoRound: Boolean = js.native
  var boundsAlignH: String = js.native
  var boundsAlignV: String = js.native
  var cameraOffset: Phaser.Point = js.native
  var canvas: HTMLCanvasElement = js.native
  var colors: js.Array[String] = js.native
  var context: CanvasRenderingContext2D = js.native
  var cssFont: String = js.native
  var destroyPhase: Boolean = js.native
  var events: Phaser.Events = js.native
  var exists: Boolean = js.native
  var fill: js.Any = js.native
  var fixedToCamera: Boolean = js.native
  var font: String = js.native
  var fontSize: Double | String = js.native
  var fontStyle: String = js.native
  var fontStyles: js.Array[String] = js.native
  var fontVariant: String = js.native
  var fontWeight: String = js.native
  var fontWeights: js.Array[String] = js.native
  var game: Phaser.Game = js.native
  var input: Phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var lineSpacing: Double = js.native
  var name: String = js.native
  var padding: Phaser.Point = js.native
  var pendingDestroy: Boolean = js.native
  var physicsType: Double = js.native
  var position: Phaser.Point = js.native
  var previousPosition: Phaser.Point = js.native
  var previousRotation: Double = js.native
  var renderOrderID: Double = js.native
  var resolution: Double = js.native
  var shadowBlur: Double = js.native
  var shadowColor: String = js.native
  var shadowFill: Boolean = js.native
  var shadowOffsetX: Double = js.native
  var shadowOffsetY: Double = js.native
  var shadowStroke: Boolean = js.native
  var stroke: String = js.native
  var strokeColors: js.Array[String] = js.native
  var strokeThickness: Double = js.native
  var scale: Phaser.Point = js.native
  var tab: Double = js.native
  var tabs: Double | js.Array[Double] = js.native
  var text: String = js.native
  var textBounds: Phaser.Rectangle = js.native
  var `type`: Double = js.native
  var world: Phaser.Point = js.native
  var wordWrap: Boolean = js.native
  var wordWrapWidth: Double = js.native
  var z: Double = js.native
  def addColor(color: String, position: Double): Phaser.Text = js.native
  def addFontStyle(style: String, position: Double): Phaser.Text = js.native
  def addFontWeight(weight: String, position: Double): Phaser.Text = js.native
  def addStrokeColor(color: String, position: Double): Phaser.Text = js.native
  def clearColors(): Phaser.Text = js.native
  def clearFontValues(): Phaser.Text = js.native
  def componentsToFont(components: js.Any): String = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def fontToComponents(font: String): js.Dynamic = js.native
  def postUpdate(): Unit = js.native
  def parseList(list: js.Array[js.Any]): Phaser.Text = js.native
  def preUpdate(): Unit = js.native
  def renderTabLine(line: String, x: Double, y: Double, fill: Boolean = ???): Unit = js.native
  def setShadow(x: Double = ???, y: Double = ???, color: js.Any = ???, blur: Double = ???, shadowStroke: Boolean = ???, shadowFill: Boolean = ???): Phaser.Text = js.native
  def setStyle(style: PhaserTextStyle = ???): Phaser.Text = js.native
  def setText(text: String): Phaser.Text = js.native
  def setTextBounds(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???): Phaser.Text = js.native
  def update(): Unit = js.native
  def updateFont(components: js.Any): Unit = js.native
  def updateLine(text: String, x: Double = ???, y: Double = ???): Unit = js.native
  def updateShadow(state: Boolean = ???): Unit = js.native
  def updateTexture(): Unit = js.native
}

@JSName("Phaser.Text")
@js.native
object Text extends js.Object {
  var fontPropertiesCanvas: js.Any = js.native
  var fontPropertiesContext: js.Any = js.native
  var fontPropertiesCache: js.Any = js.native
}

@js.native
@JSName("Phaser.Tile")
class Tile protected () extends js.Object {
  def this(layer: js.Any, index: Double, x: Double, y: Number, width: Double, height: Double) = this()
  var alpha: Double = js.native
  var bottom: Double = js.native
  var callback: js.Function = js.native
  var callbackContext: js.Any = js.native
  var centerX: Double = js.native
  var centerY: Double = js.native
  var canCollide: Boolean = js.native
  var collideDown: Boolean = js.native
  var collideLeft: Boolean = js.native
  var collideNone: Boolean = js.native
  var collideRight: Boolean = js.native
  var collisionCallback: js.Function = js.native
  var collisionCallbackContext: js.Any = js.native
  var collides: Boolean = js.native
  var collideUp: Boolean = js.native
  var faceBottom: Boolean = js.native
  var faceLeft: Boolean = js.native
  var faceRight: Boolean = js.native
  var faceTop: Boolean = js.native
  var game: Phaser.Game = js.native
  var height: Double = js.native
  var index: Double = js.native
  var layer: js.Any = js.native
  var left: Double = js.native
  var properties: js.Any = js.native
  var right: Double = js.native
  var scanned: Boolean = js.native
  var top: Double = js.native
  var width: Double = js.native
  var worldX: Double = js.native
  var worldY: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def copy(tile: Phaser.Tile): Phaser.Tile = js.native
  def containsPoint(x: Double, y: Double): Boolean = js.native
  def destroy(): Unit = js.native
  def intersects(x: Double, y: Double, right: Double, bottom: Double): Boolean = js.native
  def isInterested(collides: Boolean, faces: Boolean): Boolean = js.native
  def resetCollision(): Unit = js.native
  def setCollision(left: Boolean, right: Boolean, up: Boolean, down: Boolean): Unit = js.native
  def setCollisionCallback(callback: js.Function, context: js.Any): Unit = js.native
}

@js.native
@JSName("Phaser.Tilemap")
class Tilemap protected () extends js.Object {
  def this(game: Phaser.Game, key: String = ???, tileWidth: Double = ???, tileHeight: Double = ???, width: Double = ???, height: Double = ???) = this()
  var collision: js.Array[js.Any] = js.native
  var collideIndexes: js.Array[js.Any] = js.native
  var currentLayer: Double = js.native
  var debugMap: js.Array[js.Any] = js.native
  var format: Double = js.native
  var game: Phaser.Game = js.native
  var height: Double = js.native
  var heightInPixels: Double = js.native
  var images: js.Array[js.Any] = js.native
  var imagecollections: js.Array[ImageCollection] = js.native
  var key: String = js.native
  var layer: js.Array[Phaser.TilemapLayer] = js.native
  var layers: js.Array[js.Any] = js.native
  var objects: js.Array[js.Any] = js.native
  var orientation: String = js.native
  var properties: js.Any = js.native
  var tileHeight: Double = js.native
  var tiles: js.Array[Phaser.Tile] = js.native
  var tilesets: js.Array[Phaser.Tileset] = js.native
  var tileWidth: Double = js.native
  var version: Double = js.native
  var width: Double = js.native
  var widthInPixels: Double = js.native
  def addTilesetImage(tileset: String, key: String | Phaser.BitmapData = ???, tileWidth: Double = ???, tileHeight: Double = ???, tileMargin: Double = ???, tileSpacing: Double = ???, gid: Double = ???): Phaser.Tileset = js.native
  def calculateFaces(layer: Double): Unit = js.native
  def copy(x: Double, y: Double, width: Double, height: Double, layer: js.Any = ???): js.Array[Phaser.Tile] = js.native
  def create(name: String, width: Double, height: Double, tileWidth: Double, tileHeight: Double, group: Phaser.Group = ???): Phaser.TilemapLayer = js.native
  def createBlankLayer(name: String, width: Double, height: Double, tileWidth: Double, tileHeight: Double, group: Phaser.Group = ???): Phaser.TilemapLayer = js.native
  def createFromObjects(name: String, gid: Double, key: String, frame: js.Any = ???, exists: Boolean = ???, autoCull: Boolean = ???, group: Phaser.Group = ???, CustomClass: js.Any = ???, adjustY: Boolean = ???): Unit = js.native
  def createFromTiles(tiles: js.Any, replacements: js.Any, key: String, layer: js.Any = ???, group: Phaser.Group = ???, properties: js.Any = ???): Double = js.native
  def createLayer(layer: js.Any, width: Double = ???, height: Double = ???, group: Phaser.Group = ???): Phaser.TilemapLayer = js.native
  def destroy(): Unit = js.native
  def dump(): Unit = js.native
  def fill(index: Double, x: Double, y: Double, width: Double, height: Double, layer: js.Any = ???): Unit = js.native
  def forEach(callback: js.Function, context: js.Any, x: Double, y: Number, width: Double, height: Double, layer: js.Any = ???): Unit = js.native
  def getImageIndex(name: String): Double = js.native
  def getIndex(location: js.Array[js.Any], name: String): Double = js.native
  def getLayer(layer: js.Any): Double = js.native
  def getLayerIndex(name: String): Double = js.native
  def getObjectIndex(name: String): Double = js.native
  def getTile(x: Double, y: Double, layer: js.Any = ???, nonNull: Boolean = ???): Phaser.Tile = js.native
  def getTileAbove(layer: Double, x: Double, y: Double): Phaser.Tile = js.native
  def getTileBelow(layer: Double, x: Double, y: Double): Phaser.Tile = js.native
  def getTileLeft(layer: Double, x: Double, y: Double): Phaser.Tile = js.native
  def getTileRight(layer: Double, x: Double, y: Double): Phaser.Tile = js.native
  def getTilesetIndex(name: String): Double = js.native
  def getTileWorldXY(x: Double, y: Double, tileWidth: Double = ???, tileHeight: Double = ???, layer: Double | String | Phaser.TilemapLayer = ???, nonNull: Boolean = ???): Phaser.Tile = js.native
  def hasTile(x: Double, y: Double, layer: Phaser.TilemapLayer): Boolean = js.native
  def paste(x: Double, y: Double, tileblock: js.Array[Phaser.Tile], layer: js.Any = ???): Unit = js.native
  def putTile(tile: js.Any, x: Double, y: Double, layer: js.Any = ???): Phaser.Tile = js.native
  def putTileWorldXY(tile: js.Any, x: Double, y: Double, tileWidth: Double, tileHeight: Double, layer: js.Any = ???): Unit = js.native
  def random(x: Double, y: Double, width: Double, height: Double, layer: js.Any = ???): Unit = js.native
  def removeAllLayers(): Unit = js.native
  def removeTile(x: Double, y: Double, layer: js.Any = ???): Phaser.Tile = js.native
  def removeTileWorldXY(x: Double, y: Double, tileWidth: Double, tileHeight: Double, layer: js.Any = ???): Phaser.Tile = js.native
  def replace(source: Double, dest: Double, x: Double, y: Double, width: Double, height: Double, layer: js.Any = ???): Unit = js.native
  def searchTileIndex(index: Double, skip: Double = ???, reverse: Boolean = ???, layer: js.Any = ???): Phaser.Tile = js.native
  def setCollision(indexes: js.Any, collides: Boolean = ???, layer: js.Any = ???, recalculate: Boolean = ???): Unit = js.native
  def setCollisionBetween(start: Double, stop: Double, collides: Boolean = ???, layer: js.Any = ???, recalculate: Boolean = ???): Unit = js.native
  def setCollisionByExclusion(indexes: js.Array[js.Any], collides: Boolean = ???, layer: js.Any = ???, recalculate: Boolean = ???): Unit = js.native
  def setCollisionByIndex(index: Double, collides: Boolean = ???, layer: Double = ???, recalculate: Boolean = ???): Unit = js.native
  def setLayer(layer: js.Any): Unit = js.native
  def setPreventRecalculate(value: Boolean): Unit = js.native
  def setTileIndexCallback(indexes: js.Any, callback: js.Function, callbackContext: js.Any, layer: js.Any = ???): Unit = js.native
  def setTileLocationCallback(x: Double, y: Double, width: Double, height: Double, callback: js.Function, callbackContext: js.Any, layer: js.Any = ???): Unit = js.native
  def setTileSize(tileWidth: Double, tileHeight: Double): Unit = js.native
  def shuffle(x: Double, y: Double, width: Double, height: Double, layer: js.Any): Unit = js.native
  def swap(tileA: Double, tileB: Double, x: Double, y: Double, width: Double, height: Double, layer: js.Any = ???): Unit = js.native
}

@JSName("Phaser.Tilemap")
@js.native
object Tilemap extends js.Object {
  var CSV: Double = js.native
  var TILED_JSON: Double = js.native
  var NORTH: Double = js.native
  var EAST: Double = js.native
  var SOUTH: Double = js.native
  var WEST: Double = js.native
}

@js.native
@JSName("Phaser.TilemapLayer")
class TilemapLayer protected () extends Phaser.Sprite {
  def this(game: Phaser.Game, tilemap: Phaser.Tilemap, index: Double, width: Double = ???, height: Double = ???) = this()
  var cameraOffset: Phaser.Point = js.native
  var canvas: HTMLCanvasElement = js.native
  var collisionHeight: Double = js.native
  var collisionWidth: Double = js.native
  var context: CanvasRenderingContext2D = js.native
  var debug: Boolean = js.native
  var debugAlpha: Double = js.native
  var debugCallbackColor: String = js.native
  var debugColor: String = js.native
  var debugSettings: js.Any = js.native
  var dirty: Boolean = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var game: Phaser.Game = js.native
  var index: Double = js.native
  var layer: Phaser.TilemapLayer = js.native
  var map: Phaser.Tilemap = js.native
  var name: String = js.native
  var physicsType: Double = js.native
  var rayStepRate: Double = js.native
  var renderSettings: js.Any = js.native
  var scrollFactorX: Double = js.native
  var scrollFactorY: Double = js.native
  var scrollX: Double = js.native
  var scrollY: Double = js.native
  var `type`: Double = js.native
  var wrap: Boolean = js.native
  def getRayCastTiles(line: Phaser.Line, stepRate: Double = ???, collides: Boolean = ???, interestingFace: Boolean = ???): js.Array[Phaser.Tile] = js.native
  def getTiles(x: Double, y: Double, width: Double, height: Double, collides: Boolean = ???, interestingFace: Boolean = ???): js.Array[Phaser.Tile] = js.native
  def getTileX(x: Double): Double = js.native
  def getTileXY(x: Double, y: Double, point: Phaser.Point): Phaser.Point = js.native
  def getTileY(y: Double): Double = js.native
  def postUpdate(): Unit = js.native
  def render(): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def resizeWorld(): Unit = js.native
  def resetTilesetCache(): Unit = js.native
  def setScale(xScale: Double = ???, yScale: Double = ???): Unit = js.native
  def updateMax(): Unit = js.native
}

@js.native
@JSName("Phaser.TilemapParser")
class TilemapParser extends js.Object {
}

@JSName("Phaser.TilemapParser")
@js.native
object TilemapParser extends js.Object {
  var INSERT_NULL: Boolean = js.native
  def getEmptyData(tileWidth: Double = ???, tileHeight: Double = ???, width: Double = ???, height: Double = ???): js.Dynamic = js.native
  def parse(game: Phaser.Game, key: String, tileWidth: Double = ???, tileHeight: Double = ???, width: Double = ???, height: Double = ???): js.Dynamic = js.native
  def parseCSV(key: String, data: String, tileWidth: Double = ???, tileHeight: Double = ???): js.Dynamic = js.native
  def parseJSON(json: js.Any): js.Dynamic = js.native
}

@js.native
@JSName("Phaser.Tileset")
class Tileset protected () extends js.Object {
  def this(name: String, firstgid: Double, width: Double = ???, height: Double = ???, margin: Double = ???, spacing: Double = ???, properties: js.Any = ???) = this()
  var columns: Double = js.native
  var firstgid: Double = js.native
  var image: js.Any = js.native
  var name: String = js.native
  var properties: js.Any = js.native
  var rows: Double = js.native
  var tileHeight: Double = js.native
  var tileMargin: Double = js.native
  var tileSpacing: Double = js.native
  var tileWidth: Double = js.native
  var total: Double = js.native
  def containsTileIndex(tileIndex: Double): Boolean = js.native
  def draw(context: CanvasRenderingContext2D, x: Double, y: Double, index: Double): Unit = js.native
  def setImage(image: js.Any): Unit = js.native
  def setSpacing(margin: Double = ???, spacing: Double = ???): Unit = js.native
}

@js.native
@JSName("Phaser.TileSprite")
class TileSprite protected () extends PIXI.TilingSprite {
  def this(game: Phaser.Game, x: Double, y: Double, width: Double, height: Double, key: String | Phaser.RenderTexture | Phaser.BitmapData | PIXI.Texture = ???, frame: String | Double = ???) = this()
  var alive: Boolean = js.native
  var angle: Double = js.native
  var animations: Phaser.AnimationManager = js.native
  var autoCull: Boolean = js.native
  var body: Phaser.Physics.Arcade.Body | Phaser.Physics.P2.Body | Phaser.Physics.Ninja.Body | js.Any = js.native
  var bottom: Double = js.native
  var cameraOffset: Phaser.Point = js.native
  var checkWorldBounds: Boolean = js.native
  var components: js.Any = js.native
  var customRender: Boolean = js.native
  var debug: Boolean = js.native
  var destroyPhase: Boolean = js.native
  var events: Phaser.Events = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var frame: String | Double = js.native
  var frameName: String = js.native
  var fresh: Boolean = js.native
  var game: Phaser.Game = js.native
  var inCamera: Boolean = js.native
  var input: Phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var inWorld: Boolean = js.native
  var key: String | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture = js.native
  var left: Double = js.native
  var name: String = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var outOfBoundsKill: Boolean = js.native
  var pendingDestroy: Boolean = js.native
  var physicsType: Double = js.native
  var position: Phaser.Point = js.native
  var smoothed: Boolean = js.native
  var previousPosition: Phaser.Point = js.native
  var previousRoation: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  var renderOrderID: Double = js.native
  var `type`: Double = js.native
  var world: Phaser.Point = js.native
  var z: Double = js.native
  def autoScroll(x: Double, y: Double): Unit = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def loadTexture(key: String | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture, frame: String | Double = ???, stopAnimation: Boolean = ???): Unit = js.native
  def play(name: String, frameRate: Double = ???, loop: Boolean = ???, killOnComplete: Boolean = ???): Phaser.Animation = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def overlap(displayObject: Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Button | PIXI.DisplayObject): Boolean = js.native
  def reset(x: Double, y: Double, health: Double = ???): Phaser.TileSprite = js.native
  def resizeFrame(parent: js.Any, width: Double, height: Double): Unit = js.native
  def resetFrame(): Unit = js.native
  def setFrame(frame: Phaser.Frame): Unit = js.native
  def stopScroll(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("Phaser.Time")
class Time protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var advancedTiming: Boolean = js.native
  var desiredFps: Double = js.native
  var elapsed: Double = js.native
  var events: Phaser.Timer = js.native
  var elapsedMS: Double = js.native
  var fps: Double = js.native
  var fpsMax: Double = js.native
  var fpsMin: Double = js.native
  var frames: Double = js.native
  var game: Phaser.Game = js.native
  var lastTime: Double = js.native
  var msMax: Double = js.native
  var msMin: Double = js.native
  var now: Double = js.native
  var pausedTime: Double = js.native
  var pauseDuration: Double = js.native
  var physicsElapsed: Double = js.native
  var physicsElapsedMS: Double = js.native
  var prevTime: Double = js.native
  var slowMotion: Double = js.native
  var suggestedFps: Double = js.native
  var time: Double = js.native
  var timeExpected: Double = js.native
  var timeToCall: Double = js.native
  def add(timer: Phaser.Timer): Phaser.Timer = js.native
  def boot(): Unit = js.native
  def create(autoDestroy: Boolean = ???): Phaser.Timer = js.native
  def elapsedSecondsSince(since: Double): Double = js.native
  def elapsedSince(since: Double): Double = js.native
  def removeAll(): Unit = js.native
  def reset(): Unit = js.native
  def totalElapsedSeconds(): Double = js.native
  def update(time: Double): Unit = js.native
}

@js.native
@JSName("Phaser.Timer")
class Timer protected () extends js.Object {
  def this(game: Phaser.Game, autoDestroy: Boolean = ???) = this()
  var autoDestroy: Boolean = js.native
  var duration: Double = js.native
  var events: js.Array[Phaser.TimerEvent] = js.native
  var expired: Boolean = js.native
  var game: Phaser.Game = js.native
  var length: Double = js.native
  var ms: Double = js.native
  var next: Double = js.native
  var nextTick: Double = js.native
  var onComplete: Phaser.Signal = js.native
  var running: Boolean = js.native
  var paused: Boolean = js.native
  var seconds: Double = js.native
  def clearPendingEvents(): Unit = js.native
  def destroy(): Unit = js.native
  def order(): Unit = js.native
  def pause(): Unit = js.native
  def remove(event: Phaser.TimerEvent): Boolean = js.native
  def removeAll(): Unit = js.native
  def resume(): Unit = js.native
  def sortHandler(a: js.Any, b: js.Any): Double = js.native
  def start(startDelay: Double = ???): Unit = js.native
  def stop(clearEvents: Boolean = ???): Unit = js.native
  def update(time: Double): Boolean = js.native
}

@JSName("Phaser.Timer")
@js.native
object Timer extends js.Object {
  var HALF: Double = js.native
  var MINUTE: Double = js.native
  var QUARTER: Double = js.native
  var SECOND: Double = js.native
}

@js.native
@JSName("Phaser.TimerEvent")
class TimerEvent protected () extends js.Object {
  def this(timer: Phaser.Timer, delay: Double, tick: Double, repeatCount: Double, loop: Boolean, callback: js.Function, callbackContext: js.Any, args: js.Any*) = this()
  var args: js.Array[js.Any] = js.native
  var callback: js.Function = js.native
  var callbackContext: js.Any = js.native
  var delay: Double = js.native
  var loop: Boolean = js.native
  var pendingDelete: Boolean = js.native
  var repeatCount: Double = js.native
  var tick: Double = js.native
  var timer: Phaser.Timer = js.native
}

@js.native
@JSName("Phaser.Touch")
class Touch protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var callbackContext: js.Any = js.native
  var enabled: Boolean = js.native
  var event: js.Any = js.native
  var game: Phaser.Game = js.native
  var preventDefault: Boolean = js.native
  var touchCancelCallback: js.Function = js.native
  var touchEndCallback: js.Function = js.native
  var touchEnterCallback: js.Function = js.native
  var touchLeaveCallback: js.Function = js.native
  var touchMoveCallback: js.Function = js.native
  var touchStartCallback: js.Function = js.native
  var touchLockCallbacks: js.Array[js.Function] = js.native
  def addTouchLockCallback(callback: js.Function, context: js.Any = ???): Unit = js.native
  def removeTouchLockCallback(callback: js.Function, context: js.Any = ???): Boolean = js.native
  def consumeTouchMove(): Unit = js.native
  def onTouchCancel(event: js.Any): Unit = js.native
  def onTouchEnd(event: js.Any): Unit = js.native
  def onTouchEnter(event: js.Any): Unit = js.native
  def onTouchLeave(event: js.Any): Unit = js.native
  def onTouchMove(event: js.Any): Unit = js.native
  def onTouchStart(event: js.Any): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

@js.native
@JSName("Phaser.Tween")
class Tween protected () extends js.Object {
  def this(target: js.Any, game: Phaser.Game, manager: Phaser.TweenManager) = this()
  var chainedTween: Phaser.Tween = js.native
  var current: Double = js.native
  var frameBased: Boolean = js.native
  var game: Phaser.Game = js.native
  var isRunning: Boolean = js.native
  var isPaused: Boolean = js.native
  var manager: Phaser.TweenManager = js.native
  var onChildComplete: Phaser.Signal = js.native
  var onComplete: Phaser.Signal = js.native
  var onLoop: Phaser.Signal = js.native
  var onRepeat: Phaser.Signal = js.native
  var onStart: Phaser.Signal = js.native
  var pendingDelete: Boolean = js.native
  var properties: js.Any = js.native
  var repeatCounter: Double = js.native
  var reverse: Boolean = js.native
  var target: js.Any = js.native
  var timeline: js.Array[Phaser.TweenData] = js.native
  var timeScale: Double = js.native
  var totalDuration: Double = js.native
  def chain(args: js.Any*): Phaser.Tween = js.native
  def delay(duration: Double, index: Double = ???): Phaser.Tween = js.native
  def easing(ease: js.Function, index: Double = ???): Phaser.Tween = js.native
  def easing(ease: String, index: Double = ???): Phaser.Tween = js.native
  def from(properties: js.Any, duration: Double = ???, ease: js.Function = ???, autoStart: Boolean = ???, delay: Double = ???, repeat: Double = ???, yoyo: Boolean = ???): Phaser.Tween = js.native
  def from(properties: js.Any, duration: Double = ???, ease: String = ???, autoStart: Boolean = ???, delay: Double = ???, repeat: Double = ???, yoyo: Boolean = ???): Phaser.Tween = js.native
  def generateData(frameRate: Double = ???, data: js.Any = ???): js.Array[js.Any] = js.native
  def interpolation(interpolation: js.Function, context: js.Any = ???, index: Double = ???): Phaser.Tween = js.native
  def loop(value: Boolean = ???): Phaser.Tween = js.native
  def onUpdateCallback(callback: js.Function, callbackContext: js.Any = ???): Phaser.Tween = js.native
  def pause(): Unit = js.native
  def repeat(total: Double, repeatDelay: Double = ???, index: Double = ???): Phaser.Tween = js.native
  def repeatDelay(duration: Double, index: Double = ???): Phaser.Tween = js.native
  def repeatAll(total: Double = ???): Phaser.Tween = js.native
  def resume(): Unit = js.native
  def start(index: Double = ???): Phaser.Tween = js.native
  def stop(complete: Boolean = ???): Phaser.Tween = js.native
  def to(properties: js.Any, duration: Double = ???, ease: js.Function = ???, autoStart: Boolean = ???, delay: Double = ???, repeat: Double = ???, yoyo: Boolean = ???): Phaser.Tween = js.native
  def to(properties: js.Any, duration: Double = ???, ease: String = ???, autoStart: Boolean = ???, delay: Double = ???, repeat: Double = ???, yoyo: Boolean = ???): Phaser.Tween = js.native
  def update(time: Double): Boolean = js.native
  def updateTweenData(property: String, value: Double | js.Function, index: Double = ???): Phaser.Tween = js.native
  def yoyo(enable: Boolean, yoyoDelay: Double = ???, index: Double = ???): Phaser.Tween = js.native
  def yoyoDelay(duration: Double, index: Double = ???): Phaser.Tween = js.native
}

@js.native
@JSName("Phaser.TweenData")
class TweenData protected () extends js.Object {
  def this(parent: Phaser.Tween) = this()
  var delay: Double = js.native
  var dt: Double = js.native
  var duration: Double = js.native
  var easingFunction: js.Function = js.native
  var game: Phaser.Game = js.native
  var inReverse: Boolean = js.native
  var interpolate: Boolean = js.native
  var interpolateFunctionContext: Phaser.Math = js.native
  var interpolationContext: Phaser.Math = js.native
  var interpolationFunction: js.Function = js.native
  var isRunning: Boolean = js.native
  var isFrom: Boolean = js.native
  var parent: Phaser.Tween = js.native
  var percent: Double = js.native
  var repeatCounter: Double = js.native
  var startTime: Double = js.native
  var value: Double = js.native
  var yoyo: Boolean = js.native
  var yoyoDelay: Double = js.native
  def from(properties: js.Any, duration: Double = ???, ease: js.Function = ???, delay: Double = ???, repeat: Double = ???, yoyo: Boolean = ???): Phaser.TweenData = js.native
  def generateData(frameRate: Double = ???): js.Array[js.Any] = js.native
  def repeat(): Double = js.native
  def start(): Phaser.TweenData = js.native
  def to(properties: js.Any, duration: Double = ???, ease: js.Function = ???, delay: Double = ???, repeat: Double = ???, yoyo: Boolean = ???): Phaser.TweenData = js.native
  def update(time: Double): Double = js.native
}

@JSName("Phaser.TweenData")
@js.native
object TweenData extends js.Object {
  var COMPLETE: Double = js.native
  var LOOPED: Double = js.native
  var PENDING: Double = js.native
  var RUNNING: Double = js.native
}

@js.native
@JSName("Phaser.TweenManager")
class TweenManager protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var frameBased: Boolean = js.native
  var game: Phaser.Game = js.native
  def add(tween: Phaser.Tween): Phaser.Tween = js.native
  def create(`object`: js.Any): Phaser.Tween = js.native
  def getAll(): js.Array[Phaser.Tween] = js.native
  def isTweening(`object`: js.Any): Boolean = js.native
  def remove(tween: Phaser.Tween): Phaser.Tween = js.native
  def removeAll(): Unit = js.native
  def removeFrom(obj: js.Any, children: Boolean = ???): Unit = js.native
  def resumeAll(): Unit = js.native
  def update(): Boolean = js.native
  def pauseAll(): Unit = js.native
}

@js.native
@JSName("Phaser.Utils")
class Utils extends js.Object {
}

@JSName("Phaser.Utils")
@js.native
object Utils extends js.Object {
  def getProperty(obj: js.Any, prop: String): js.Dynamic = js.native
  def setProperty(obj: js.Any, prop: String, value: js.Any): js.Dynamic = js.native
  def chanceRoll(chance: Double): Boolean = js.native
  def randomChoice(choice1: String | Double, choice2: js.Any): js.Dynamic = js.native
  def parseDimension(size: js.Any, dimension: Double): Double = js.native
  def pad(str: String, len: Double = ???, pad: String = ???, dir: Double = ???): String = js.native
  def isPlainObject(`object`: js.Any): Boolean = js.native
  def extend(deep: Boolean, target: js.Any): js.Dynamic = js.native
  def mixinPrototype(target: js.Any, mixin: js.Any, replace: Boolean = ???): Unit = js.native
  def mixin[T](from: T, to: js.Any): T = js.native

@js.native
@JSName("Phaser.Utils.Debug")
class Debug protected () extends js.Object {
  def this(game: Phaser.Game) = this()
  var bmd: Phaser.BitmapData = js.native
  var canvas: HTMLCanvasElement = js.native
  var columnWidth: Double = js.native
  var context: CanvasRenderingContext2D = js.native
  var currentAlpha: Double = js.native
  var currentX: Double = js.native
  var currentY: Double = js.native
  var dirty: Boolean = js.native
  var font: String = js.native
  var game: Phaser.Game = js.native
  var lineHeight: Double = js.native
  var renderShadow: Boolean = js.native
  var sprite: Phaser.Image = js.native
  def AStar(astar: Phaser.Plugin.AStar, x: Double, y: Double, showVisited: Boolean): Unit = js.native
  def boot(): Unit = js.native
  def body(sprite: Phaser.Sprite, color: String = ???, filled: Boolean = ???): Unit = js.native
  def bodyInfo(sprite: Phaser.Sprite, x: Double, y: Number, color: String = ???): Unit = js.native
  def box2dBody(body: Phaser.Sprite, color: String = ???): Unit = js.native
  def box2dWorld(): Unit = js.native
  def cameraInfo(camera: Phaser.Camera, x: Double, y: Double, color: String = ???): Unit = js.native
  def geom(`object`: js.Any, color: String = ???, fiiled: Boolean = ???, forceType: Double = ???): Unit = js.native
  def inputInfo(x: Double, y: Double, color: String = ???): Unit = js.native
  def lineInfo(line: Phaser.Line, x: Double, y: Double, color: String = ???): Unit = js.native
  def key(key: Phaser.Key, x: Double = ???, y: Double = ???, color: String = ???): Unit = js.native
  def line(): Unit = js.native
  def preUpdate(): Unit = js.native
  def pixel(x: Double, y: Double, color: String = ???, size: Double = ???): Unit = js.native
  def pointer(pointer: Phaser.Pointer, hideIfUp: Boolean = ???, downColor: String = ???, upColor: String = ???, color: String = ???): Unit = js.native
  def quadTree(quadtree: Phaser.QuadTree, color: String = ???): Unit = js.native
  def rectangle(`object`: Phaser.Rectangle, color: String = ???, filled: Boolean = ???): Unit = js.native
  def reset(): Unit = js.native
  def ropeSegments(rope: Phaser.Rope, color: Double = ???, filled: Boolean = ???): Unit = js.native
  def soundInfo(sound: Phaser.Sound, x: Double, y: Double, color: String = ???): Unit = js.native
  def spriteBounds(sprite: js.Any, color: String = ???, filled: Boolean = ???): Unit = js.native
  def spriteCoords(sprite: js.Any, x: Double, y: Double, color: String = ???): Unit = js.native
  def spriteInfo(sprite: Phaser.Sprite, x: Double, y: Double, color: String = ???): Unit = js.native
  def spriteInputInfo(sprite: Phaser.Sprite, x: Double, y: Double, color: String = ???): Unit = js.native
  def start(x: Double = ???, y: Double = ???, color: String = ???, columnWidth: Double = ???): Unit = js.native
  def stop(): Unit = js.native
  def text(text: String, x: Double, y: Double, color: String = ???, font: String = ???): Unit = js.native
  def timer(timer: Phaser.Timer, x: Double, y: Double, color: String = ???): Unit = js.native
}
}

@js.native
@JSName("Phaser.World")
class World protected () extends Phaser.Group {
  def this(game: Phaser.Game) = this()
  var bounds: Phaser.Rectangle = js.native
  var camera: Phaser.Camera = js.native
  var centerX: Double = js.native
  var centerY: Double = js.native
  var game: Phaser.Game = js.native
  var height: Double = js.native
  var isPaused: Boolean = js.native
  var randomX: Double = js.native
  var randomY: Double = js.native
  var stats: js.Any = js.native
  var width: Double = js.native
  def boot(): Unit = js.native
  def getObjectsUnderPointer(pointer: Phaser.Pointer, group: Phaser.Group, callback: js.Function = ???, callbackContext: js.Any = ???): Phaser.Sprite = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def setBounds(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def sortLeftRight(a: Phaser.Sprite, b: Phaser.Sprite): Double = js.native
  def sortRightLeft(a: Phaser.Sprite, b: Phaser.Sprite): Double = js.native
  def sortTopBottom(a: Phaser.Sprite, b: Phaser.Sprite): Double = js.native
  def sortBottomTop(a: Phaser.Sprite, b: Phaser.Sprite): Double = js.native
  def sort(group: Phaser.Group, sortDirection: Double = ???): Unit = js.native
  def sort(key: String = ???, order: Double = ???): Unit = js.native
  def shutdown(): Unit = js.native
  def wrap(sprite: js.Any, padding: Double = ???, useBounds: Boolean = ???, horizontal: Boolean = ???, vertical: Boolean = ???): Unit = js.native
}
}

}
