package biz.jackman.facades


import scala.scalajs.js
import js.annotation._
import org.scalajs.dom.raw._
import scala.scalajs.js.typedarray._
import biz.jackman.facades.phaser.Physics


object Phaser extends js.Object {
  var VERSION: String = js.native
  var DEV_VERSION: String = js.native
  var GAMES: js.Array[phaser.Game] = js.native
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
  var NONE: Double = js.native
  var LEFT: Double = js.native
  var RIGHT: Double = js.native
  var UP: Double = js.native
  var DOWN: Double = js.native
}

package phaser {
import importedjs.PIXI

@JSName("Phaser.Animation")
class Animation protected() extends js.Object {
  def this(game: phaser.Game, parent: phaser.Sprite, name: String, frameData: phaser.FrameData, frames: js.Any, frameRate: Double = ???, loop: Boolean = ???) = this()
  var currentFrame: phaser.Frame = js.native
  var delay: Double = js.native
  var enableUpdate: Boolean = js.native
  var frame: Double = js.native
  var frameTotal: Double = js.native
  var game: phaser.Game = js.native
  var isFinished: Boolean = js.native
  var isPaused: Boolean = js.native
  var isPlaying: Boolean = js.native
  var killOnComplete: Boolean = js.native
  var loop: Boolean = js.native
  var loopCount: Double = js.native
  var name: String = js.native
  var onComplete: phaser.Signal = js.native
  var onLoop: phaser.Signal = js.native
  var onStart: phaser.Signal = js.native
  var onUpdate: phaser.Signal = js.native
  var paused: Boolean = js.native
  var speed: Double = js.native
  def complete(): Unit = js.native
  def destroy(): Unit = js.native
  def next(quantity: Double = ???): Unit = js.native
  def onPause(): Unit = js.native
  def onResume(): Unit = js.native
  def play(frameRate: Double = ???, loop: Boolean = ???, killOnComplete: Boolean = ???): phaser.Animation = js.native
  def previous(quantity: Double = ???): Unit = js.native
  def restart(): Unit = js.native
  def setFrame(frameId: js.Any = ???, useLocalFrameIndex: Boolean = ???): Unit = js.native
  def stop(resetFrame: Boolean = ???, dispatchComplete: Boolean = ???): Unit = js.native
  def update(): Boolean = js.native
  def updateFrameData(frameData: FrameData): Unit = js.native
}

@JSName("Phaser.Animation")
object Animation extends js.Object {
  def generateFrameNames(prefix: String, start: Double, stop: Double, suffix: String = ???, zeroPad: Double = ???): js.Array[String] = js.native
}

@JSName("Phaser.AnimationManager")
class AnimationManager protected() extends js.Object {
  def this(sprite: phaser.Sprite) = this()
  var currentAnim: phaser.Animation = js.native
  var currentFrame: phaser.Frame = js.native
  var frame: Double = js.native
  var frameData: phaser.FrameData = js.native
  var frameName: String = js.native
  var frameTotal: Double = js.native
  var game: phaser.Game = js.native
  var isLoaded: Boolean = js.native
  var name: String = js.native
  var paused: Boolean = js.native
  var sprite: phaser.Sprite = js.native
  var updateIfVisible: Boolean = js.native
  def add(name: String, frames: js.Any = ???, frameRate: Double = ???, loop: Boolean = ???, useNumericIndex: Boolean = ???): phaser.Animation = js.native
  def copyFrameData(frameData: phaser.FrameData, frame: js.Any): Boolean = js.native
  def destroy(): Unit = js.native
  def getAnimation(name: String): phaser.Animation = js.native
  def next(quantity: Double = ???): Unit = js.native
  def play(name: String, frameRate: Double = ???, loop: Boolean = ???, killOnComplete: Boolean = ???): phaser.Animation = js.native
  def previous(quantity: Double = ???): Unit = js.native
  def refreshFrame(): Unit = js.native
  def stop(name: String = ???, resetFrame: Boolean = ???): Unit = js.native
  def update(): Boolean = js.native
  def validateFrames(frames: js.Array[phaser.Frame], useNumericIndex: Boolean = ???): Boolean = js.native
}

@JSName("Phaser.AnimationParser")
class AnimationParser extends js.Object {
}

@JSName("Phaser.AnimationParser")
object AnimationParser extends js.Object {
  def JSONData(game: phaser.Game, json: js.Any, cacheKey: String): phaser.FrameData = js.native
  def JSONDataHash(game: phaser.Game, json: js.Any, cacheKey: String): phaser.FrameData = js.native
  def spriteSheet(game: phaser.Game, key: String, frameWidth: Double, frameHeight: Double, frameMax: Double = ???, margin: Double = ???, spacing: Double = ???): phaser.FrameData = js.native
  def XMLData(game: phaser.Game, xml: js.Any, cacheKey: String): phaser.FrameData = js.native
}

@JSName("Phaser.AudioSprite")
class AudioSprite protected() extends js.Object {
  def this(game: phaser.Game, key: String) = this()
  var game: phaser.Game = js.native
  var key: String = js.native
  var config: js.Any = js.native
  var autoplayKey: String = js.native
  var autoplay: Boolean = js.native
  var sounds: js.Any = js.native
  def get(marker: String): phaser.Sound = js.native
  def play(marker: String, volume: Double = ???): phaser.Sound = js.native
  def stop(marker: String): phaser.Sound = js.native
}

@JSName("Phaser.ArraySet")
class ArraySet protected() extends js.Object {
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

@JSName("Phaser.ArrayUtils")
class ArrayUtils extends js.Object {
}

@JSName("Phaser.ArrayUtils")
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

@JSName("Phaser.BitmapData")
class BitmapData protected() extends js.Object {
  def this(game: phaser.Game, key: String, width: Double = ???, height: Double = ???) = this()
  var baseTexture: PIXI.BaseTexture = js.native
  var buffer: ArrayBuffer = js.native
  var canvas: HTMLCanvasElement = js.native
  var context: CanvasRenderingContext2D = js.native
  var ctx: CanvasRenderingContext2D = js.native
  var data: Uint8Array = js.native
  var dirty: Boolean = js.native
  var disableTextureUpload: Boolean = js.native
  var game: phaser.Game = js.native
  var height: Double = js.native
  var imageData: ImageData = js.native
  var key: String = js.native
  var pixels: Uint32Array = js.native
  var smoothed: Boolean = js.native
  var texture: PIXI.Texture = js.native
  var textureFrame: phaser.Frame = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  def add(`object`: js.Any): phaser.BitmapData = js.native
  def addToWorld(x: Double = ???, y: Double = ???, anchorX: Double = ???, anchorY: Double = ???, scaleX: Double = ???, scaleY: Double = ???): phaser.Image = js.native
  def alphaMask(source: js.Any, mask: js.Any = ???, sourceRect: phaser.Rectangle = ???, maskRect: phaser.Rectangle = ???): phaser.BitmapData = js.native
  def blendAdd(): phaser.BitmapData = js.native
  def blendColor(): phaser.BitmapData = js.native
  def blendColorBurn(): phaser.BitmapData = js.native
  def blendColorDodge(): phaser.BitmapData = js.native
  def blendDarken(): phaser.BitmapData = js.native
  def blendDestinationAtop(): phaser.BitmapData = js.native
  def blendDestinationIn(): phaser.BitmapData = js.native
  def blendDestinationOut(): phaser.BitmapData = js.native
  def blendDestinationOver(): phaser.BitmapData = js.native
  def blendDifference(): phaser.BitmapData = js.native
  def blendExclusion(): phaser.BitmapData = js.native
  def blendHardLight(): phaser.BitmapData = js.native
  def blendHue(): phaser.BitmapData = js.native
  def blendLighten(): phaser.BitmapData = js.native
  def blendLuminosity(): phaser.BitmapData = js.native
  def blendMultiply(): phaser.BitmapData = js.native
  def blendOverlay(): phaser.BitmapData = js.native
  def blendReset(): phaser.BitmapData = js.native
  def blendSaturation(): phaser.BitmapData = js.native
  def blendScreen(): phaser.BitmapData = js.native
  def blendSoftLight(): phaser.BitmapData = js.native
  def blendSourceAtop(): phaser.BitmapData = js.native
  def blendSourceIn(): phaser.BitmapData = js.native
  def blendSourceOut(): phaser.BitmapData = js.native
  def blendSourceOver(): phaser.BitmapData = js.native
  def blendXor(): phaser.BitmapData = js.native
  def circle(x: Double, y: Double, radius: Double, fillStyle: String = ???): phaser.BitmapData = js.native
  def clear(): phaser.BitmapData = js.native
  def cls(): phaser.BitmapData = js.native
  def copy(source: js.Any = ???, x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???, tx: Double = ???, ty: Double = ???, newWidth: Double = ???, newHeight: Double = ???, rotate: Double = ???, anchorX: Double = ???, anchorY: Double = ???, scaleX: Double = ???, scaleY: Double = ???, alpha: Double = ???, blendMode: Double = ???, roundPx: Boolean = ???): phaser.BitmapData = js.native
  def copyPixels(source: js.Any, area: phaser.Rectangle, x: Double, y: Double, alpha: Double = ???): Unit = js.native
  def copyRect(source: js.Any, area: phaser.Rectangle, x: Double = ???, y: Double = ???, alpha: Double = ???, blendMode: Double = ???, roundPx: Boolean = ???): phaser.BitmapData = js.native
  def draw(source: js.Any, x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???, blendMode: Double = ???, roundPx: Boolean = ???): phaser.BitmapData = js.native
  def drawGroup(group: phaser.Group, blendMode: Double = ???, roundPx: Boolean = ???): phaser.BitmapData = js.native
  def extract(destination: phaser.BitmapData, r: Double, g: Double, b: Double, a: Double = ???, resize: Boolean = ???, r2: Double = ???, g2: Double = ???, b2: Double = ???): phaser.BitmapData = js.native
  def fill(r: Double, g: Double, b: Double, a: Double = ???): phaser.BitmapData = js.native
  def getBounds(rect: phaser.Rectangle = ???): phaser.Rectangle = js.native
  def getFirstPixel(direction: Double): js.Any = js.native
  def getPixel(x: Double, y: Double, out: js.Any = ???): Double = js.native
  def getPixelRGB(x: Double, y: Double, out: js.Any = ???, hsl: Boolean = ???, hsv: Boolean = ???): js.Dynamic = js.native
  def getPixel32(x: Double, y: Double): Double = js.native
  def getPixels(rect: phaser.Rectangle): ImageData = js.native
  def getTransform(translateX: Double, translateY: Double, scaleX: Double, scaleY: Double, skewX: Double, skewY: Double): js.Dynamic = js.native
  def load(source: js.Any): phaser.BitmapData = js.native
  def processPixel(callback: js.Function, callbackContext: js.Any, x: Double = ???, y: Number = ???, width: Double = ???, height: Double = ???): phaser.BitmapData = js.native
  def processPixelRGB(callback: js.Function, callbackContext: js.Any, x: Double = ???, y: Number = ???, width: Double = ???, height: Double = ???): phaser.BitmapData = js.native
  def rect(x: Double, y: Double, width: Double, height: Double, fillStyle: String = ???): phaser.BitmapData = js.native
  def render(): phaser.BitmapData = js.native
  def replaceRGB(r1: Double, g1: Double, b1: Double, a1: Double, r2: Double, g2: Double, b2: Double, a2: Double, region: phaser.Rectangle): phaser.BitmapData = js.native
  def resize(width: Double, height: Double): phaser.BitmapData = js.native
  def setHSL(h: Double = ???, s: Double = ???, l: Double = ???, region: phaser.Rectangle = ???): phaser.BitmapData = js.native
  def setPixel(x: Double, y: Double, red: Double, green: Double, blue: Double, immediate: Boolean = ???): phaser.BitmapData = js.native
  def setPixel32(x: Double, y: Double, red: Double, green: Double, blue: Double, alpha: Double, immediate: Boolean = ???): phaser.BitmapData = js.native
  def shadow(color: String, blur: Double = ???, x: Double = ???, y: Double = ???): phaser.BitmapData = js.native
  def shiftHSL(h: Double = ???, s: Double = ???, l: Double = ???, region: phaser.Rectangle = ???): phaser.BitmapData = js.native
  def text(text: String, x: Double = ???, y: Double = ???, font: String = ???, color: String = ???, shadow: Boolean = ???): phaser.BitmapData = js.native
  def textureLine(line: phaser.Line, key: String, repeat: String = ???): phaser.BitmapData = js.native
  def update(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???): phaser.BitmapData = js.native
}

@JSName("Phaser.BitmapData")
object BitmapData extends js.Object {
  def getTransform(translateX: Double, translateY: Double, scaleX: Double, scaleY: Double, skewX: Double, skewY: Double): js.Dynamic = js.native
}

@JSName("Phaser.BitmapText")
class BitmapText protected() extends PIXI.BitmapText {
  def this(game: phaser.Game, x: Double, y: Double, font: String, text: String = ???, size: Double = ???) = this()
  var align: String = js.native
  var angle: Double = js.native
  var cameraOffset: phaser.Point = js.native
  var destroyPhase: Boolean = js.native
  var events: phaser.Events = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var font: String = js.native
  var game: phaser.Game = js.native
  var input: phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var name: String = js.native
  var physicsType: Double = js.native
  var previousPosition: phaser.Point = js.native
  var previousRotation: phaser.Point = js.native
  var renderOrderID: Double = js.native
  var text: String = js.native
  var `type`: Double = js.native
  var world: phaser.Point = js.native
  var z: Double = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def update(): Unit = js.native
  def updateText(): Unit = js.native
}

@JSName("Phaser.Button")
class Button protected() extends phaser.Image {
  def this(game: phaser.Game, x: Double = ???, y: Double = ???, key: String = ???, callback: js.Function = ???, callbackContext: js.Any = ???, overFrame: js.Any = ???, outFrame: js.Any = ???, downFrame: js.Any = ???, upFrame: js.Any = ???) = this()
  var forceOut: Boolean = js.native
  var freezeFrames: Boolean = js.native
  var onDownSound: js.Any = js.native
  var onDownSoundMarker: String = js.native
  var onInputDown: phaser.Signal = js.native
  var onInputOut: phaser.Signal = js.native
  var onInputOver: phaser.Signal = js.native
  var onInputUp: phaser.Signal = js.native
  var onOutSound: js.Any = js.native
  var onOutSoundMarker: String = js.native
  var onOverSound: js.Any = js.native
  var onOverSoundMarker: String = js.native
  var onOverMouseOnly: Boolean = js.native
  var onUpSound: js.Any = js.native
  var onUpSoundMaker: String = js.native
  var physicsType: Double = js.native
  def clearFrames(): Unit = js.native
  def setDownSound(sound: js.Any, marker: String = ???): Unit = js.native
  def setFrames(overFrame: js.Any = ???, outFrame: js.Any = ???, downFrame: js.Any = ???, upFrame: js.Any = ???): Unit = js.native
  def onInputDownHandler(sprite: phaser.Button, pointer: phaser.Pointer): Unit = js.native
  def onInputUpHandler(sprite: phaser.Button, pointer: phaser.Pointer, isOver: Boolean): Unit = js.native
  def removedFromWorld(): Unit = js.native
  def setOutSound(sound: js.Any, marker: String = ???): Unit = js.native
  def setOverSound(sound: js.Any, marker: String = ???): Unit = js.native
  def setSounds(overSound: js.Any = ???, overMarker: String = ???, downSound: js.Any = ???, downMarker: String = ???, outSound: js.Any = ???, outMarker: String = ???, upSound: js.Any = ???, upMarker: String = ???): Unit = js.native
  def setState(newState: Double): Unit = js.native
  def setUpSound(sound: js.Any, marker: String = ???): Unit = js.native
}

@JSName("Phaser.Cache")
class Cache protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var autoResolveURL: Boolean = js.native
  var game: phaser.Game = js.native
  var onSoundUnlock: phaser.Signal = js.native
  def addBinary(key: String, binaryData: js.Any): Unit = js.native
  def addBitmapData(key: String, bitmapData: phaser.BitmapData, frameData: phaser.FrameData = ???): phaser.BitmapData = js.native
  def addBitmapFont(key: String, texture: phaser.RetroFont): Unit = js.native
  def addBitmapFont(key: String, url: String, data: js.Any, xmlData: js.Any, xSpacing: Double = ???, ySpacing: Double = ???): Unit = js.native
  def addCanvas(key: String, canvas: HTMLCanvasElement, context: CanvasRenderingContext2D): Unit = js.native
  def addDefaultImage(): Unit = js.native
  def addImage(key: String, url: String, data: js.Any): Unit = js.native
  def addJSON(key: String, urL: String, data: js.Any): Unit = js.native
  def addMissingImage(): Unit = js.native
  def addPhysicsData(key: String, url: String, JSONData: js.Any, format: Double): Unit = js.native
  def addRenderTexture(key: String, texture: RenderTexture): Unit = js.native
  def addSound(key: String, url: String, data: js.Any, webAudio: Boolean, audioTag: Boolean): Unit = js.native
  def addSpriteSheet(key: String, url: String, data: js.Any, frameWidth: Double, frameHeight: Double, frameMax: Double = ???, margin: Double = ???, spacing: Double = ???): Unit = js.native
  def addText(key: String, url: String, data: js.Any): Unit = js.native
  def addTextureAtlas(key: String, url: String, data: js.Any, atlasData: js.Any, format: Double): Unit = js.native
  def addTilemap(key: String, url: String, mapData: js.Any, format: Double): Unit = js.native
  def addXML(key: String, url: String, data: js.Any): Unit = js.native
  def checkBinaryKey(key: String): Boolean = js.native
  def checkBitmapDataKey(key: String): Boolean = js.native
  def checkBitmapFontKey(key: String): Boolean = js.native
  def checkCanvasKey(key: String): Boolean = js.native
  def checkImageKey(key: String): Boolean = js.native
  def checkJSONKey(key: String): Boolean = js.native
  def checkKey(`type`: Double, key: String): Boolean = js.native
  def checkPhysicsKey(key: String): Boolean = js.native
  def checkSoundKey(key: String): Boolean = js.native
  def checkTextKey(key: String): Boolean = js.native
  def checkTextureKey(key: String): Boolean = js.native
  def checkTilemapKey(key: String): Boolean = js.native
  def checkURL(url: String): js.Dynamic = js.native
  def checkUrl(url: String): js.Dynamic = js.native
  def checkXMLKey(key: String): Boolean = js.native
  def decodedSound(key: String, data: js.Any): Unit = js.native
  def destroy(): Unit = js.native
  def getBinary(key: String): js.Dynamic = js.native
  def getBitmapData(key: String): phaser.BitmapData = js.native
  def getBitmapFont(key: String): phaser.RetroFont = js.native
  def getCanvas(key: String): js.Dynamic = js.native
  def getFrame(key: String): phaser.Frame = js.native
  def getFrameByIndex(key: String, frame: String): phaser.Frame = js.native
  def getFrameByName(key: String, frame: String): phaser.Frame = js.native
  def getFrameCount(key: String): Double = js.native
  def getFrameData(key: String, map: String = ???): phaser.FrameData = js.native
  def getImage(key: String): phaser.Image = js.native
  def getJSON(key: String): js.Dynamic = js.native
  def getKeys(array: js.Array[String]): js.Array[String] = js.native
  def getPhysicsData(key: String, `object`: String = ???, fixtureKey: String = ???): js.Array[js.Any] = js.native
  def getRenderTexture(key: String): phaser.RenderTexture = js.native
  def getSound(key: String): phaser.Sound = js.native
  def getSoundData(key: String): js.Dynamic = js.native
  def getText(key: String): String = js.native
  def getTextKeys(): js.Array[String] = js.native
  def getTexture(key: String): phaser.RenderTexture = js.native
  def getTextureFrame(key: String): phaser.Frame = js.native
  def getTilemap(key: String): js.Dynamic = js.native
  def getTilemapData(key: String): js.Dynamic = js.native
  def getURL(url: String): js.Dynamic = js.native
  def getUrl(url: String): js.Dynamic = js.native
  def getXML(key: String): js.Dynamic = js.native
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
  def removeSound(key: String): Unit = js.native
  def removeText(key: String): Unit = js.native
  def removeTilemap(key: String): Unit = js.native
  def removeXML(key: String): Unit = js.native
  def updateFrameData(key: String, frameData: js.Any): Unit = js.native
  def updateSound(key: String, property: String, value: phaser.Sound): Unit = js.native
}

@JSName("Phaser.Cache")
object Cache extends js.Object {
  var BINARY: Double = js.native
  var BITMAPDATA: Double = js.native
  var BITMAPFONT: Double = js.native
  var CANVAS: Double = js.native
  var IMAGE: Double = js.native
  var JSON: Double = js.native
  var PHYSICS: Double = js.native
  var SOUND: Double = js.native
  var TEXT: Double = js.native
  var TEXTURE: Double = js.native
  var TILEMAP: Double = js.native
  var XML: Double = js.native
}

@JSName("Phaser.Camera")
class Camera protected() extends js.Object {
  def this(game: phaser.Game, id: Double, x: Double, y: Double, width: Double, height: Double) = this()
  var atLimit: js.Any = js.native
  var bounds: phaser.Rectangle = js.native
  var deadzone: phaser.Rectangle = js.native
  var displayObject: PIXI.DisplayObject = js.native
  var id: Double = js.native
  var game: phaser.Game = js.native
  var height: Double = js.native
  var position: phaser.Point = js.native
  var roundPx: Boolean = js.native
  var scale: phaser.Point = js.native
  var screenView: phaser.Rectangle = js.native
  var target: phaser.Sprite = js.native
  var totalInView: Double = js.native
  var view: phaser.Rectangle = js.native
  var visible: Boolean = js.native
  var width: Double = js.native
  var world: phaser.World = js.native
  var x: Double = js.native
  var y: Double = js.native
  def checkBounds(): Unit = js.native
  def focusOn(displayObject: PIXI.DisplayObject): Unit = js.native
  def focusOnXY(x: Double, y: Double): Unit = js.native
  def follow(target: phaser.Sprite, style: Double = ???): Unit = js.native
  def reset(): Unit = js.native
  def setBoundsToWorld(): Unit = js.native
  def setPosition(x: Double, y: Double): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def unfollow(): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.Camera")
object Camera extends js.Object {
  var FOLLOW_LOCKON: Double = js.native
  var FOLLOW_PLATFORMER: Double = js.native
  var FOLLOW_TOPDOWN: Double = js.native
  var FOLLOW_TOPDOWN_TIGHT: Double = js.native
}

@JSName("Phaser.Canvas")
class Canvas extends js.Object {
}

@JSName("Phaser.Canvas")
object Canvas extends js.Object {
  def addToDOM(canvas: HTMLCanvasElement, parent: HTMLElement, overflowHidden: Boolean = ???): HTMLCanvasElement = js.native
  def create(width: Double = ???, height: Double = ???, id: String = ???): HTMLCanvasElement = js.native
  def getAspectRatio(canvas: HTMLCanvasElement): Double = js.native
  def getOffset(element: HTMLElement, point: phaser.Point = ???): phaser.Point = js.native
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

@JSName("Phaser.Circle")
class Circle protected() extends js.Object {
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
  def circumferencePoint(angle: Double, asDegrees: Boolean = ???, out: phaser.Point = ???): phaser.Point = js.native
  def clone(output: phaser.Circle): phaser.Circle = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def copyFrom(source: js.Any): Circle = js.native
  def copyTo(dest: js.Any): js.Dynamic = js.native
  def distance(dest: js.Any, round: Boolean = ???): Double = js.native
  def getBounds(): phaser.Rectangle = js.native
  def offset(dx: Double, dy: Double): phaser.Circle = js.native
  def offsetPoint(point: phaser.Point): phaser.Circle = js.native
  def scale(x: Double, y: Double = ???): phaser.Rectangle = js.native
  def setTo(x: Double, y: Double, diameter: Double): Circle = js.native
  override def toString(): String = js.native
}

@JSName("Phaser.Circle")
object Circle extends js.Object {
  def circumferencePoint(a: phaser.Circle, angle: Double, asDegrees: Boolean, out: phaser.Point = ???): phaser.Point = js.native
  def contains(a: phaser.Circle, x: Double, y: Double): Boolean = js.native
  def equals(a: phaser.Circle, b: phaser.Circle): Boolean = js.native
  def intersects(a: phaser.Circle, b: phaser.Circle): Boolean = js.native
  def intersectsRectangle(c: phaser.Circle, r: phaser.Rectangle): Boolean = js.native
}

@JSName("Phaser.Color")
class Color extends js.Object {
}

@JSName("Phaser.Color")
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
}

trait CursorKeys extends js.Object {
  var up: phaser.Key = js.native
  var down: phaser.Key = js.native
  var left: phaser.Key = js.native
  var right: phaser.Key = js.native
}

@JSName("Phaser.Device")
class Device extends js.Object {
  var android: Boolean = js.native
  var arora: Boolean = js.native
  var audioData: Boolean = js.native
  var cancelFullScreen: String = js.native
  var canvas: Boolean = js.native
  var chrome: Boolean = js.native
  var chromeOS: Boolean = js.native
  var cocoonJS: Boolean = js.native
  var cocoonJSApp: Boolean = js.native
  var cordova: Boolean = js.native
  var crosswalk: Boolean = js.native
  var css3D: Boolean = js.native
  var desktop: Boolean = js.native
  var deviceReadyAt: Double = js.native
  var ejecta: Boolean = js.native
  var epiphany: Boolean = js.native
  var file: Boolean = js.native
  var fileSystem: Boolean = js.native
  var firefox: Boolean = js.native
  var fullScreen: Boolean = js.native
  var fullScreenKeyboard: Boolean = js.native
  var getUserMedia: Boolean = js.native
  var game: phaser.Game = js.native
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
  var mspointer: Boolean = js.native
  var node: Boolean = js.native
  var nodeWebkit: Boolean = js.native
  var ogg: Boolean = js.native
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
  var windows: Boolean = js.native
  var windowsPhone: Boolean = js.native
  var wheelEvent: String = js.native
  var worker: Boolean = js.native
}

@JSName("Phaser.Device")
object Device extends js.Object {
  var LITTLE_ENDIAN: Boolean = js.native
  var onInitialized: phaser.Signal = js.native
  def checkFullScreenSupport(): Unit = js.native
  def canPlayAudio(`type`: String): Boolean = js.native
  def isConsoleOpen(): Boolean = js.native
  def isAndroidStockBrowser(): String = js.native
  var whenReady: js.Function2[js.Function, js.Any, Unit] = js.native
}

package easing {

@JSName("Phaser.Easing.Back")
class Back extends js.Object {
}

@JSName("Phaser.Easing.Back")
object Back extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@JSName("Phaser.Easing.Bounce")
class Bounce extends js.Object {
}

@JSName("Phaser.Easing.Bounce")
object Bounce extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@JSName("Phaser.Easing.Circular")
class Circular extends js.Object {
}

@JSName("Phaser.Easing.Circular")
object Circular extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@JSName("Phaser.Easing.Cubic")
class Cubic extends js.Object {
}

@JSName("Phaser.Easing.Cubic")
object Cubic extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@JSName("Phaser.Easing.Elastic")
class Elastic extends js.Object {
}

@JSName("Phaser.Easing.Elastic")
object Elastic extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@JSName("Phaser.Easing.Exponential")
class Exponential extends js.Object {
}

@JSName("Phaser.Easing.Exponential")
object Exponential extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@JSName("Phaser.Easing.Linear")
class Linear extends js.Object {
}

@JSName("Phaser.Easing.Linear")
object Linear extends js.Object {
  def None(k: Double): Double = js.native
}

@JSName("Phaser.Easing.Quadratic")
class Quadratic extends js.Object {
}

@JSName("Phaser.Easing.Quadratic")
object Quadratic extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@JSName("Phaser.Easing.Quartic")
class Quartic extends js.Object {
}

@JSName("Phaser.Easing.Quartic")
object Quartic extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@JSName("Phaser.Easing.Quintic")
class Quintic extends js.Object {
}

@JSName("Phaser.Easing.Quintic")
object Quintic extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

@JSName("Phaser.Easing.Sinusoidal")
class Sinusoidal extends js.Object {
}

@JSName("Phaser.Easing.Sinusoidal")
object Sinusoidal extends js.Object {
  def In(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
}

}

//@JSName("Phaser.Easing")
package object easing extends js.Object {
  var Default: js.Function = js.native
  var Power0: js.Function = js.native
  var Power1: js.Function = js.native
  var power2: js.Function = js.native
  var power3: js.Function = js.native
  var power4: js.Function = js.native
}

@JSName("Phaser.Ellipse")
class Ellipse protected() extends js.Object {
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
  def clone(output: phaser.Ellipse): phaser.Ellipse = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def copyFrom(source: js.Any): phaser.Ellipse = js.native
  def copyTo(dest: js.Any): js.Dynamic = js.native
  def getBounds(): phaser.Rectangle = js.native
  def setTo(x: Double, y: Double, width: Double, height: Double): phaser.Ellipse = js.native
  override def toString(): String = js.native
}

@JSName("Phaser.Ellipse")
object Ellipse extends js.Object {
  def constains(a: phaser.Ellipse, x: Double, y: Double): Boolean = js.native
}

@JSName("Phaser.Events")
class Events protected() extends js.Object {
  def this(sprite: phaser.Sprite) = this()
  var parent: phaser.Sprite = js.native
  var onAddedToGroup: phaser.Signal = js.native
  var onRemovedFromGroup: phaser.Signal = js.native
  var onRemovedFromWorld: phaser.Signal = js.native
  var onKilled: phaser.Signal = js.native
  var onRevived: phaser.Signal = js.native
  var onOutOfBounds: phaser.Signal = js.native
  var onEnterBounds: phaser.Signal = js.native
  var onInputOver: phaser.Signal = js.native
  var onInputOut: phaser.Signal = js.native
  var onInputDown: phaser.Signal = js.native
  var onInputUp: phaser.Signal = js.native
  var onDestroy: phaser.Signal = js.native
  var onDragStart: phaser.Signal = js.native
  var onDragStop: phaser.Signal = js.native
  var onAnimationStart: phaser.Signal = js.native
  var onAnimationComplete: phaser.Signal = js.native
  var onAnimationLoop: phaser.Signal = js.native
  def destroy(): Unit = js.native
}

@JSName("Phaser.Filter")
class Filter protected() extends PIXI.AbstractFilter {
  def this(game: phaser.Game, args: js.Any*) = this()
  var game: phaser.Game = js.native
  var height: Double = js.native
  var prevPoint: phaser.Point = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  def destroy(): Unit = js.native
  def init(args: js.Any*): Unit = js.native
  def setResolution(width: Double, height: Double): Unit = js.native
  def update(pointer: phaser.Pointer = ???): Unit = js.native
}

package filter {

@JSName("Phaser.Filter.BinarySerpents")
class BinarySerpents protected() extends phaser.Filter {
  def this(game: phaser.Game, width: Double, height: Double, march: Double = ???, maxDistance: Double = ???) = this()
  var fog: Double = js.native
}

@JSName("Phaser.Filter.BlurX")
class BlurX extends phaser.Filter {
  var blur: Double = js.native
}

@JSName("Phaser.Filter.BlurY")
class BlurY extends phaser.Filter {
  var blur: Double = js.native
}

@JSName("Phaser.Filter.CausticLight")
class CausticLight protected() extends phaser.Filter {
  def this(game: phaser.Game, width: Double, height: Double, divisor: Double = ???) = this()
  def init(width: Double, height: Double, divisor: Double = ???): Unit = js.native
}

@JSName("Phaser.Filter.CheckerWave")
class CheckerWave protected() extends phaser.Filter {
  def this(game: phaser.Game, width: Double, height: Double) = this()
  var alpha: Double = js.native
  var cameraX: Double = js.native
  var cameraY: Double = js.native
  var cameraZ: Double = js.native
  def init(width: Double, height: Double): Unit = js.native
  def setColor1(red: Double, green: Double, blue: Double): Unit = js.native
  def setColor2(red: Double, green: Double, blue: Double): Unit = js.native
}

@JSName("Phaser.Filter.ColorBars")
class ColorBars protected() extends phaser.Filter {
  def this(game: phaser.Game, width: Double, height: Double) = this()
  var alpha: Double = js.native
  def init(width: Double, height: Double): Unit = js.native
}

@JSName("Phaser.Filter.Fire")
class Fire protected() extends phaser.Filter {
  def this(width: Double, height: Double, alpha: Double = ???, shift: Double = ???) = this()
  var alpha: Double = js.native
  var shift: Double = js.native
  var speed: Double = js.native
  def init(width: Double, height: Double, alpha: Double = ???, shift: Double = ???): Unit = js.native
}

@JSName("Phaser.Filter.Gray")
class Gray extends phaser.Filter {
  var gray: Double = js.native
}

@JSName("Phaser.Filter.HueRotate")
class HueRotate protected() extends phaser.Filter {
  def this(game: phaser.Game, width: Double, height: Double, texture: js.Any) = this()
  var alpha: Double = js.native
  def init(width: Double, height: Double, texture: js.Any): Unit = js.native
}

@JSName("Phaser.Filter.LazerBeam")
class LazerBeam extends phaser.Filter {
  def init(width: Double, height: Double, divisor: Double = ???): Unit = js.native
}

@JSName("Phaser.Filter.LightBeam")
class LightBeam protected() extends phaser.Filter {
  def this(game: phaser.Game, width: Double, height: Double) = this()
  var alpha: Double = js.native
  var blue: Double = js.native
  var green: Double = js.native
  var red: Double = js.native
  var thickness: Double = js.native
  var speed: Double = js.native
  def init(width: Double, height: Double): Unit = js.native
}

@JSName("Phaser.Filter.Marble")
class Marble protected() extends phaser.Filter {
  def this(game: phaser.Game, width: Double, height: Double, speed: Double = ???, intensity: Double = ???) = this()
  var alpha: Double = js.native
  var intensity: Double = js.native
  var speed: Double = js.native
  def init(width: Double, height: Double, speed: Double = ???, intensity: Double = ???): Unit = js.native
}

@JSName("Phaser.Filter.Pixelate")
class Pixelate extends phaser.Filter {
  var size: Double = js.native
}

@JSName("Phaser.Filter.Plasma")
class Plasma protected() extends phaser.Filter {
  def this(game: phaser.Game, width: Double, height: Double, alpha: Double = ???, size: Double = ???) = this()
  var alpha: Double = js.native
  var blueShift: Double = js.native
  var greenShift: Double = js.native
  var redShift: Double = js.native
  var size: Double = js.native
  def init(width: Double, height: Double, alpha: Double = ???, size: Double = ???): Unit = js.native
}

@JSName("Phaser.Filter.SampleFilter")
class SampleFilter protected() extends phaser.Filter {
  def this(game: phaser.Game, width: Double, height: Double, divisor: Double = ???) = this()
  def init(width: Double, height: Double, divisor: Double = ???): Unit = js.native
}

@JSName("Phaser.Filter.Tunnel")
class Tunnel protected() extends phaser.Filter {
  def this(game: phaser.Game, width: Double, height: Double, texture: js.Any) = this()
  var alpha: Double = js.native
  var origin: Double = js.native
  def init(width: Double, height: Double, texture: js.Any): Unit = js.native
}

}

@JSName("Phaser.FlexGrid")
class FlexGrid protected() extends js.Object {
  def this(manager: phaser.ScaleManager, width: Double, height: Double) = this()
  var game: phaser.Game = js.native
  var manager: phaser.ScaleManager = js.native
  var width: Double = js.native
  var height: Double = js.native
  var boundsCustom: phaser.Rectangle = js.native
  var boundsFluid: phaser.Rectangle = js.native
  var boundsFull: phaser.Rectangle = js.native
  var boundsNone: phaser.Rectangle = js.native
  var customWidth: Double = js.native
  var customHeight: Double = js.native
  var customOffsetX: Double = js.native
  var customOffsetY: Double = js.native
  var positionCustom: phaser.Point = js.native
  var positionFluid: phaser.Point = js.native
  var positionFull: phaser.Point = js.native
  var positionNone: phaser.Point = js.native
  var scaleCustom: phaser.Point = js.native
  var scaleFluid: phaser.Point = js.native
  var scaleFluidInversed: phaser.Point = js.native
  var scaleFull: phaser.Point = js.native
  var scaleNone: phaser.Point = js.native
  var ratioH: Double = js.native
  var ratioV: Double = js.native
  var multiplier: Double = js.native
  def createCustomLayer(width: Double, height: Double, children: js.Array[PIXI.DisplayObject] = ???, addToWorld: Boolean = ???): phaser.FlexLayer = js.native
  def createFluidLayer(children: js.Array[PIXI.DisplayObject]): phaser.FlexLayer = js.native
  def createFullLayer(children: js.Array[PIXI.DisplayObject]): phaser.FlexLayer = js.native
  def createFixedLayer(children: js.Array[PIXI.DisplayObject]): phaser.FlexLayer = js.native
  def debug(): Unit = js.native
  def fitSprite(sprite: phaser.Sprite): Unit = js.native
  def onResize(width: Double, height: Double): Unit = js.native
  def refresh(): Unit = js.native
  def reset(): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
}

@JSName("Phaser.FlexLayer")
class FlexLayer protected() extends phaser.Group {
  def this(manager: phaser.ScaleManager, position: phaser.Point, bounds: phaser.Rectangle, scale: phaser.Point) = this()
  var grid: phaser.FlexGrid = js.native
  var manager: phaser.ScaleManager = js.native
  var bottomLeft: phaser.Point = js.native
  var bottomMiddle: phaser.Point = js.native
  var bottomRight: phaser.Point = js.native
  var bounds: phaser.Rectangle = js.native
  var persist: Boolean = js.native
  var topLeft: phaser.Point = js.native
  var topMiddle: phaser.Point = js.native
  var topRight: phaser.Point = js.native
  def debug(): Unit = js.native
  def resize(): Unit = js.native
}

@JSName("Phaser.Frame")
class Frame protected() extends js.Object {
  def this(index: Double, x: Double, y: Double, width: Double, height: Double, name: String, uuid: String) = this()
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
  override def clone(): phaser.Frame = js.native
  def getRect(out: phaser.Rectangle = ???): phaser.Rectangle = js.native
  def setTrim(trimmed: Boolean, actualWidth: Double, actualHeight: Double, destX: Double, destY: Double, destWidth: Double, destHeight: Double): Unit = js.native
}

@JSName("Phaser.FrameData")
class FrameData extends js.Object {
  var total: Double = js.native
  def addFrame(frame: Frame): phaser.Frame = js.native
  def checkFrameName(name: String): Boolean = js.native
  override def clone(): phaser.FrameData = js.native
  def getFrame(index: Double): phaser.Frame = js.native
  def getFrameByName(name: String): phaser.Frame = js.native
  def getFrameIndexes(frames: js.Array[Double], useNumericIndex: Boolean = ???, output: js.Array[Double] = ???): js.Array[Double] = js.native
  def getFrameRange(start: Double, end: Double, output: js.Array[phaser.Frame]): js.Array[phaser.Frame] = js.native
  def getFrames(frames: js.Array[Double], useNumericIndex: Boolean = ???, output: js.Array[phaser.Frame] = ???): js.Array[phaser.Frame] = js.native
}

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
  var state: phaser.State = js.native
}

@JSName("Phaser.Game")
class Game protected() extends js.Object {
  def this(width: js.Any = ???, height: js.Any = ???, renderer: Double = ???, parent: js.Any = ???, state: js.Any = ???, transparent: Boolean = ???, antialias: Boolean = ???, physicsConfig: js.Any = ???) = this()
  def this(config: IGameConfig) = this()
  var add: phaser.GameObjectFactory = js.native
  var antialias: Boolean = js.native
  var cache: phaser.Cache = js.native
  var camera: phaser.Camera = js.native
  var canvas: HTMLCanvasElement = js.native
  var config: IGameConfig = js.native
  var context: CanvasRenderingContext2D = js.native
  var count: Double = js.native
  var debug: phaser.Utils.Debug = js.native
  var device: phaser.Device = js.native
  var forceSingleUpdate: Boolean = js.native
  var fpsProblemNotifier: phaser.Signal = js.native
  var height: Double = js.native
  var id: Double = js.native
  var input: phaser.Input = js.native
  var isBooted: Boolean = js.native
  var isRunning: Boolean = js.native
  var load: phaser.Loader = js.native
  var lockRender: Boolean = js.native
  var make: phaser.GameObjectCreator = js.native
  var math: phaser.Math = js.native
  var net: phaser.Net = js.native
  var onBlur: phaser.Signal = js.native
  var onFocus: phaser.Signal = js.native
  var onPause: phaser.Signal = js.native
  var onResume: phaser.Signal = js.native
  var parent: HTMLElement = js.native
  var particles: phaser.Particles = js.native
  var paused: Boolean = js.native
  var pendingStep: Boolean = js.native
  var physics: phaser.Physics = js.native
  var physicsConfig: js.Any = js.native
  var plugins: PluginManager = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var raf: phaser.RequestAnimationFrame = js.native
  var renderer: Double = js.native
  var renderType: Double = js.native
  var resolution: Double = js.native
  var rnd: phaser.RandomDataGenerator = js.native
  var scale: phaser.ScaleManager = js.native
  var scratch: phaser.BitmapData = js.native
  var sound: phaser.SoundManager = js.native
  var stage: phaser.Stage = js.native
  var state: phaser.StateManager = js.native
  var stepCount: Double = js.native
  var stepping: Boolean = js.native
  var time: phaser.Time = js.native
  var transparent: Boolean = js.native
  var tweens: phaser.TweenManager = js.native
  var currentUpdateID: Double = js.native
  var updatesThisFrame: Double = js.native
  var width: Double = js.native
  var world: phaser.World = js.native
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

@JSName("Phaser.GameObjectCreator")
class GameObjectCreator protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var game: phaser.Game = js.native
  var world: phaser.World = js.native
  def audio(key: String, volume: Double = ???, loop: Boolean = ???, connect: Boolean = ???): phaser.Sound = js.native
  def audioSprite(key: String): phaser.AudioSprite = js.native
  def bitmapData(width: Double = ???, height: Double = ???, key: String = ???, addToCache: Boolean = ???): phaser.BitmapData = js.native
  def bitmapText(x: Double, y: Double, font: String, text: String = ???, size: Double = ???): phaser.BitmapText = js.native
  def button(x: Double = ???, y: Double = ???, key: String = ???, callback: js.Function = ???, callbackContext: js.Any = ???, overFrame: js.Any = ???, outFrame: js.Any = ???, downFrame: js.Any = ???, upFrame: js.Any = ???): phaser.Button = js.native
  def emitter(x: Double = ???, y: Double = ???, maxParticles: Double = ???): phaser.particles.arcade.Emitter = js.native
  def filter(filter: js.Any, args: js.Any*): phaser.Filter = js.native
  def graphics(x: Double, y: Double): phaser.Graphics = js.native
  def group(parent: js.Any = ???, name: String = ???, addToStage: Boolean = ???, enableBody: Boolean = ???, physicsBodyType: Double = ???): phaser.Group = js.native
  def image(x: Double, y: Double, key: js.Any = ???, frame: js.Any = ???): phaser.Image = js.native
  def renderTexture(width: Double = ???, height: Double = ???, key: js.Any = ???, addToCache: Boolean = ???): phaser.RenderTexture = js.native
  def retroFont(font: String, characterWidth: Double, characterHeight: Double, chars: String, charsPerRow: Double, xSpacing: Double = ???, ySpacing: Double = ???, xOffset: Double = ???, yOffset: Double = ???): phaser.RetroFont = js.native
  def rope(x: Double, y: Double, key: js.Any, frame: js.Any = ???, points: js.Array[phaser.Point] = ???): phaser.Rope = js.native
  def sound(key: String, volume: Double = ???, loop: Boolean = ???, connect: Boolean = ???): phaser.Sound = js.native
  def sprite(x: Double, y: Double, key: js.Any = ???, frame: js.Any = ???): phaser.Sprite = js.native
  def spriteBatch(parent: js.Any, name: String = ???, addToStage: Boolean = ???): phaser.SpriteBatch = js.native
  def text(x: Double, y: Double, text: String = ???, style: js.Any = ???): phaser.Text = js.native
  def tilemap(key: String, tileWidth: Double = ???, tileHeight: Double = ???, width: Double = ???, height: Double = ???): phaser.Tilemap = js.native
  def tileSprite(x: Double, y: Double, width: Double, height: Double, key: js.Any, frame: js.Any): phaser.TileSprite = js.native
  def tween(obj: js.Any): phaser.Tween = js.native
}

@JSName("Phaser.GameObjectFactory")
class GameObjectFactory protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var game: phaser.Game = js.native
  var world: phaser.World = js.native
  def audio(key: String, volume: Double = ???, loop: Boolean = ???, connect: Boolean = ???): phaser.Sound = js.native
  def audioSprite(key: String): phaser.AudioSprite = js.native
  def bitmapData(width: Double = ???, height: Double = ???, key: String = ???, addToCache: Boolean = ???): phaser.BitmapData = js.native
  def bitmapText(x: Double, y: Double, font: String, text: String = ???, size: Double = ???, group: phaser.Group = ???): phaser.BitmapText = js.native
  def button(x: Double = ???, y: Double = ???, key: String = ???, callback: js.Function = ???, callbackContext: js.Any = ???, overFrame: js.Any = ???, outFrame: js.Any = ???, downFrame: js.Any = ???, upFrame: js.Any = ???, group: phaser.Group = ???): phaser.Button = js.native
  def emitter(x: Double = ???, y: Double = ???, maxParticles: Double = ???): phaser.particles.arcade.Emitter = js.native
  def existing(`object`: js.Any): js.Dynamic = js.native
  def filter(filter: String, args: js.Any*): phaser.Filter = js.native
  def graphics(x: Double, y: Double, group: phaser.Group = ???): phaser.Graphics = js.native
  def group(parent: js.Any = ???, name: String = ???, addToStage: Boolean = ???, enableBody: Boolean = ???, physicsBodyType: Double = ???): phaser.Group = js.native
  def image(x: Double, y: Double, key: js.Any = ???, frame: js.Any = ???, group: phaser.Group = ???): phaser.Image = js.native
  def physicsGroup(physicsBodyType: Double, parent: js.Any = ???, name: String = ???, addToStage: Boolean = ???): phaser.Group = js.native
  def plugin(plugin: phaser.Plugin, parameter: js.Any*): phaser.Plugin = js.native
  def renderTexture(width: Double = ???, height: Double = ???, key: String = ???, addToCache: Boolean = ???): phaser.RenderTexture = js.native
  def retroFont(font: String, characterWidth: Double, characterHeight: Double, chars: String, charsPerRow: Double, xSpacing: Double = ???, ySpacing: Double = ???, xOffset: Double = ???, yOffset: Double = ???): phaser.RetroFont = js.native
  def rope(x: Double, y: Double, key: js.Any, frame: js.Any = ???, points: js.Array[phaser.Point] = ???): phaser.Rope = js.native
  def sound(key: String, volume: Double = ???, loop: Double = ???, connect: Boolean = ???): phaser.Sound = js.native
  def sprite(x: Double, y: Double, key: js.Any = ???, frame: js.Any = ???, group: phaser.Group = ???): phaser.Sprite = js.native
  def spriteBatch(parent: js.Any, name: String = ???, addToStage: Boolean = ???): phaser.Group = js.native
  def text(x: Double, y: Double, text: String, style: js.Any, group: phaser.Group = ???): phaser.Text = js.native
  def tilemap(key: String = ???, tileWidth: Double = ???, tileHeight: Double = ???, width: Double = ???, height: Double = ???): phaser.Tilemap = js.native
  def tileSprite(x: Double, y: Double, width: Double, height: Double, key: js.Any = ???, frame: js.Any = ???, group: phaser.Group = ???): phaser.TileSprite = js.native
  def tween(obj: js.Any): phaser.Tween = js.native
}

@JSName("Phaser.Gamepad")
class Gamepad protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var active: Boolean = js.native
  var callbackContext: js.Any = js.native
  var disabled: Boolean = js.native
  var enabled: Boolean = js.native
  var game: phaser.Game = js.native
  var onAxisCallBack: js.Function = js.native
  var onConnectCallback: js.Function = js.native
  var onDisconnectCallback: js.Function = js.native
  var onDownCallback: js.Function = js.native
  var onFloatCallback: js.Function = js.native
  var onUpCallback: js.Function = js.native
  var pad1: phaser.SinglePad = js.native
  var pad2: phaser.SinglePad = js.native
  var pad3: phaser.SinglePad = js.native
  var pad4: phaser.SinglePad = js.native
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

@JSName("Phaser.GamepadButton")
class GamepadButton protected() extends js.Object {
  def this(pad: phaser.SinglePad, buttonCode: Double) = this()
  var buttonCode: Double = js.native
  var duration: Double = js.native
  var game: phaser.Game = js.native
  var isDown: Boolean = js.native
  var isUp: Boolean = js.native
  var onDown: phaser.Signal = js.native
  var onFloat: phaser.Signal = js.native
  var onUp: phaser.Signal = js.native
  var pad: phaser.Gamepad = js.native
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

@JSName("Phaser.Graphics")
class Graphics protected() extends PIXI.Graphics {
  def this(game: phaser.Game, x: Double, y: Double) = this()
  var angle: Double = js.native
  var cameraOffset: phaser.Point = js.native
  var destroyPhase: Boolean = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var game: phaser.Game = js.native
  var name: String = js.native
  var physicsType: Double = js.native
  var previousPosition: Point = js.native
  var previousRotation: Double = js.native
  var `type`: Double = js.native
  var world: phaser.Point = js.native
  var z: Double = js.native
  def destroy(): Unit = js.native
  def drawTriangle(points: js.Array[phaser.Point], cull: Boolean = ???): Unit = js.native
  def drawTriangles(vertices: js.Array[js.Any], indices: js.Array[Double] = ???, cull: Boolean = ???): Unit = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.Group")
class Group protected() extends PIXI.DisplayObjectContainer {
  def this(game: phaser.Game, parent: PIXI.DisplayObjectContainer = ???, name: String = ???, addToStage: Boolean = ???, enableBody: Boolean = ???, physicsBodyType: Double = ???) = this()
  var angle: Double = js.native
  var alive: Boolean = js.native
  var cameraOffset: phaser.Point = js.native
  var classType: js.Any = js.native
  var cursor: js.Any = js.native
  var cursorIndex: Double = js.native
  var enableBody: Boolean = js.native
  var enableBodyDebug: Boolean = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var game: phaser.Game = js.native
  var ignoreDestroy: Boolean = js.native
  var length: Double = js.native
  var name: String = js.native
  var onDestroy: phaser.Signal = js.native
  var physicsBodyType: Double = js.native
  var physicsType: Double = js.native
  var total: Double = js.native
  var `type`: Double = js.native
  var z: Double = js.native
  def add(child: js.Any, silent: Boolean = ???): js.Dynamic = js.native
  def addAll(property: String, amount: Double, checkAlive: Boolean, checkVisible: Boolean): Unit = js.native
  def addAt(child: js.Any, index: Double, silent: Boolean = ???): js.Dynamic = js.native
  def addMultiple(children: js.Array[js.Any], silent: Boolean = ???): js.Array[js.Any] = js.native
  def bringToTop(): PIXI.DisplayObject = js.native
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
  //  def forEach(callback: js.Function, callbackContext: js.Any, checkExists: Boolean = ???, args: js.Any*): Unit = js.native
  def forEachAlive(callback: js.Function, callbackContext: js.Any, args: js.Any*): Unit = js.native
  def forEachDead(callback: js.Function, callbackContext: js.Any, args: js.Any*): Unit = js.native
  def forEachExists(callback: js.Function, callbackContext: js.Any): Unit = js.native
  def filter(predicate: js.Function, checkExists: Boolean = ???): ArraySet = js.native
  def getAt(index: Double): js.Dynamic = js.native
  def getBottom(): js.Dynamic = js.native
  def getFirstAlive(): js.Dynamic = js.native
  def getFirstDead(): js.Dynamic = js.native
  def getFirstExists(exists: Boolean): js.Dynamic = js.native
  def getIndex(child: js.Any): Double = js.native
  def getRandom(startIndex: Double = ???, length: Double = ???): js.Dynamic = js.native
  def getTop(): js.Dynamic = js.native
  def hasProperty(child: js.Any, key: js.Array[String]): Boolean = js.native
  //  def iterate(key: String, value: js.Any, returnType: Double, callback: js.Function = ???, callbackContext: js.Any = ???, args: js.Any*): js.Dynamic = js.native
  def moveDown(): PIXI.DisplayObject = js.native
  def moveUp(child: js.Any): js.Dynamic = js.native
  def multiplyAll(property: String, amount: Double, checkAlive: Boolean, checkVisible: Boolean): Unit = js.native
  def next(): Unit = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def previous(): Unit = js.native
  def remove(child: js.Any, destroy: Boolean = ???, silent: Boolean = ???): Boolean = js.native
  def removeAll(destroy: Boolean = ???, silent: Boolean = ???): Unit = js.native
  def removeBetween(startIndex: Double, endIndex: Double = ???, destroy: Boolean = ???, silent: Boolean = ???): Unit = js.native
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
object Group extends js.Object {
  var RETURN_CHILD: Double = js.native
  var RETURN_NONE: Double = js.native
  var RETURN_TOTAL: Double = js.native
  var SORT_ASCENDING: Double = js.native
  var SORT_DESCENDING: Double = js.native
}

@JSName("Phaser.Image")
class Image protected() extends PIXI.Sprite {
  def this(game: phaser.Game, x: Double, y: Double, key: js.Any, frame: js.Any) = this()
  var alive: Boolean = js.native
  var angle: Double = js.native
  var animations: phaser.AnimationManager = js.native
  var autoCull: Boolean = js.native
  var bottom: Double = js.native
  var cameraOffset: phaser.Point = js.native
  var cropRect: phaser.Rectangle = js.native
  var debug: Boolean = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var deltaZ: Double = js.native
  var destroyPhase: Boolean = js.native
  var events: phaser.Events = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var frame: js.Any = js.native
  var frameName: String = js.native
  var fresh: Boolean = js.native
  var game: phaser.Game = js.native
  var inCamera: Boolean = js.native
  var input: phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var inWorld: Boolean = js.native
  var key: js.Any = js.native
  var left: Double = js.native
  var name: String = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var previousPosition: phaser.Point = js.native
  var previousRotation: Double = js.native
  var renderOrderID: Double = js.native
  var right: Double = js.native
  var smoothed: Boolean = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var world: phaser.Point = js.native
  var z: Double = js.native
  def bringToTop(): phaser.Image = js.native
  def crop(rect: phaser.Rectangle, copy: Boolean = ???): Unit = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def kill(): phaser.Image = js.native
  def loadTexture(key: js.Any, frame: js.Any): Unit = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def reset(x: Double, y: Double): phaser.Image = js.native
  def resetFrame(): Unit = js.native
  def revive(): phaser.Image = js.native
  def setFrame(frame: phaser.Frame): Unit = js.native
  def setScaleMinMax(minX: Double = ???, minY: Double = ???, maxX: Double = ???, maxY: Double = ???): Unit = js.native
  def update(): Unit = js.native
  def updateCrop(): Unit = js.native
}

@JSName("Phaser.Input")
class Input protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var activePointer: phaser.Pointer = js.native
  var circle: phaser.Circle = js.native
  var currentPointers: Double = js.native
  var disabled: Boolean = js.native
  var enabled: Boolean = js.native
  var doubleTapRate: Double = js.native
  var game: phaser.Game = js.native
  var gamepad: phaser.Gamepad = js.native
  var hitCanvas: HTMLCanvasElement = js.native
  var hitContext: CanvasRenderingContext2D = js.native
  var holdRate: Double = js.native
  var interactiveItems: phaser.ArraySet = js.native
  var justPressedRate: Double = js.native
  var justReleasedRate: Double = js.native
  var keyboard: phaser.Keyboard = js.native
  var maxPointers: Double = js.native
  var minPriorityID: Double = js.native
  var mouse: phaser.Mouse = js.native
  var mousePointer: phaser.Pointer = js.native
  var moveCallback: js.Function3[phaser.Pointer, Double, Double, Unit] = js.native
  var moveCallbacks: js.Array[js.Function3[phaser.Pointer, Double, Double, Unit]] = js.native
  var moveCallbackContext: js.Any = js.native
  //  var mspointer: phaser.MSPointer = js.native
  var multiInputOverride: Double = js.native
  var onDown: phaser.Signal = js.native
  var onHold: phaser.Signal = js.native
  var onTap: phaser.Signal = js.native
  var onUp: phaser.Signal = js.native
  var pointer1: phaser.Pointer = js.native
  var pointer2: phaser.Pointer = js.native
  var pointer3: phaser.Pointer = js.native
  var pointer4: phaser.Pointer = js.native
  var pointer5: phaser.Pointer = js.native
  var pointer6: phaser.Pointer = js.native
  var pointer7: phaser.Pointer = js.native
  var pointer8: phaser.Pointer = js.native
  var pointer9: phaser.Pointer = js.native
  var pointer10: phaser.Pointer = js.native
  var pollLocked: Boolean = js.native
  var pollRate: Double = js.native
  var position: phaser.Point = js.native
  var pointer: js.Array[phaser.Pointer] = js.native
  var recordLimit: Double = js.native
  var recordPointerHistory: Boolean = js.native
  var recordRate: Double = js.native
  var resetLocked: Boolean = js.native
  var scale: phaser.Point = js.native
  var speed: phaser.Point = js.native
  var tapRate: Double = js.native
  var totalActivePointers: Double = js.native
  var totalInactivePointers: Double = js.native
  var touch: phaser.Touch = js.native
  var worldX: Double = js.native
  var worldY: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def addPointer(): phaser.Pointer = js.native
  def addMoveCallback(callback: js.Function, context: js.Any): Double = js.native
  def boot(): Unit = js.native
  def countActivePointers(limit: Double = ???): Double = js.native
  def deleteMoveCallback(index: Double): Unit = js.native
  def destroy(): Unit = js.native
  def getLocalPosition(displayObject: js.Any, pointer: phaser.Pointer): phaser.Point = js.native
  def getPointer(isActive: Boolean = ???): phaser.Pointer = js.native
  def getPointerFromId(pointerID: Double): phaser.Pointer = js.native
  def getPointerFromIdentifier(identifier: Double): phaser.Pointer = js.native
  def hitTest(displayObject: PIXI.DisplayObject, pointer: phaser.Pointer, localPoint: phaser.Point): Unit = js.native
  def reset(hard: Boolean = ???): Unit = js.native
  def resetSpeed(x: Double, y: Double): Unit = js.native
  def startPointer(event: js.Any): phaser.Pointer = js.native
  def stopPointer(event: js.Any): phaser.Pointer = js.native
  def update(): Unit = js.native
  def updatePointer(event: js.Any): phaser.Pointer = js.native
}

@JSName("Phaser.Input")
object Input extends js.Object {
  var MAX_POINTERS: Double = js.native
  var MOUSE_OVERRIDES_TOUCH: Double = js.native
  var MOUSE_TOUCH_COMBINE: Double = js.native
  var TOUCH_OVERRIDES_MOUSE: Double = js.native
}

@JSName("Phaser.InputHandler")
class InputHandler protected() extends js.Object {
  def this(sprite: phaser.Sprite) = this()
  var allowHorizontalDrag: Boolean = js.native
  var allowVerticalDrag: Boolean = js.native
  var boundsRect: phaser.Rectangle = js.native
  var boundsSprite: phaser.Sprite = js.native
  var bringToTop: Boolean = js.native
  var consumePointerEvent: Boolean = js.native
  var dragOffset: phaser.Point = js.native
  var dragFromCenter: Boolean = js.native
  var draggable: Boolean = js.native
  var dragStartPoint: phaser.Point = js.native
  var enabled: Boolean = js.native
  var game: phaser.Game = js.native
  def globalToLocalX(x: Double): Double = js.native
  def globalToLocalY(y: Double): Double = js.native
  var isDragged: Boolean = js.native
  var pixelPerfectAlpha: Double = js.native
  var pixelPerfectClick: Boolean = js.native
  var pixelPerfectOver: Boolean = js.native
  var priorityID: Double = js.native
  var scaleLayer: Boolean = js.native
  var snapOffset: phaser.Point = js.native
  var snapOffsetX: Double = js.native
  var snapOffsetY: Double = js.native
  var snapOnDrag: Boolean = js.native
  var snapOnRelease: Boolean = js.native
  var snapX: Double = js.native
  var snapY: Double = js.native
  var sprite: phaser.Sprite = js.native
  var useHandCursor: Boolean = js.native
  def checkBoundsRect(): Unit = js.native
  def checkBoundsSprite(): Unit = js.native
  def checkPixel(x: Double, y: Double, pointer: phaser.Pointer = ???): Boolean = js.native
  def checkPointerDown(pointer: phaser.Pointer, fastTest: Boolean = ???): Boolean = js.native
  def checkPointerOver(pointer: phaser.Pointer, fastTest: Boolean = ???): Boolean = js.native
  def destroy(): Unit = js.native
  def disableDrag(): Unit = js.native
  def disableSnap(): Unit = js.native
  def downDuration(pointer: phaser.Pointer): Double = js.native
  def enableDrag(lockCenter: Boolean = ???, bringToTop: Boolean = ???, pixelPerfect: Boolean = ???, alphaThreshold: Double = ???, boundsRect: phaser.Rectangle = ???, boundsSprite: phaser.Sprite = ???): Unit = js.native
  def enableSnap(snapX: Double, snapY: Double, onDrag: Boolean = ???, onRelease: Boolean = ???, snapOffsetX: Double = ???, snapOffsetY: Double = ???): Unit = js.native
  def isPixelPerfect(): Boolean = js.native
  def justOut(pointer: Double, delay: Double): Boolean = js.native
  def justOver(pointer: Double, delay: Double): Boolean = js.native
  def justPressed(pointer: Double, delay: Double): Boolean = js.native
  def justReleased(pointer: Double, delay: Double): Boolean = js.native
  def overDuration(pointer: phaser.Pointer): Double = js.native
  def pointerDown(pointer: Double): Boolean = js.native
  def pointerDragged(pointer: phaser.Pointer): Boolean = js.native
  def pointerOut(index: Double): Boolean = js.native
  def pointerOver(index: Double): Boolean = js.native
  def pointerTimeDown(pointer: phaser.Pointer): Double = js.native
  def pointerTimeOut(pointer: phaser.Pointer): Double = js.native
  def pointerTimeOver(pointer: Double): Double = js.native
  def pointerTimeUp(pointer: Double): Double = js.native
  def pointerUp(pointer: Double): Boolean = js.native
  def pointerX(pointer: Double): Double = js.native
  def pointerY(pointer: Double): Double = js.native
  def reset(): Unit = js.native
  def setDragLock(allowHorizontal: Boolean = ???, allowVertical: Boolean = ???): Unit = js.native
  def start(priority: Double, useHandCursor: Boolean): phaser.Sprite = js.native
  def startDrag(pointer: phaser.Pointer): Unit = js.native
  def stop(): Unit = js.native
  def stopDrag(pointer: phaser.Pointer): Unit = js.native
  def update(pointer: phaser.Pointer): Unit = js.native
  def updateDrag(pointer: phaser.Pointer): Boolean = js.native
  def validForInput(highestID: Double, highestRenderID: Double, includePixelPerfect: Boolean = ???): Boolean = js.native
}

@JSName("Phaser.Key")
class Key protected() extends js.Object {
  def this(game: phaser.Game, keycode: Double) = this()
  var altKey: Boolean = js.native
  var ctrlKey: Boolean = js.native
  var duration: Double = js.native
  var enabled: Boolean = js.native
  var event: js.Any = js.native
  var game: phaser.Game = js.native
  var isDown: Boolean = js.native
  var isUp: Boolean = js.native
  var _justDown: Boolean = js.native
  var justDown: Boolean = js.native
  var _justUp: Boolean = js.native
  var justUp: Boolean = js.native
  var keyCode: Double = js.native
  var onDown: phaser.Signal = js.native
  var onHoldCallback: js.Function = js.native
  var onHoldContext: js.Any = js.native
  var onUp: phaser.Signal = js.native
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

@JSName("Phaser.Keyboard")
class Keyboard protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var callbackContext: js.Any = js.native
  var disabled: Boolean = js.native
  var enabled: Boolean = js.native
  var event: js.Any = js.native
  var game: phaser.Game = js.native
  var lastChar: String = js.native
  var lastKey: phaser.Key = js.native
  var onDownCallback: js.Function = js.native
  var onPressCallback: js.Function = js.native
  var onUpCallback: js.Function = js.native
  var pressEvent: js.Any = js.native
  def addCallbacks(context: js.Any, onDown: js.Function = ???, onUp: js.Function = ???, onPress: js.Function = ???): Unit = js.native
  def addKey(keycode: Double): phaser.Key = js.native
  def addKeyCapture(keycode: js.Any): Unit = js.native
  def createCursorKeys(): phaser.CursorKeys = js.native
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
  var UNDERSCORE: Double = js.native
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

@JSName("Phaser.Line")
class Line protected() extends js.Object {
  def this(x1: Double = ???, y1: Double = ???, x2: Double = ???, y2: Double = ???) = this()
  var angle: Double = js.native
  var end: phaser.Point = js.native
  var height: Double = js.native
  var left: Double = js.native
  var length: Double = js.native
  var normalAngle: Double = js.native
  var normalX: Double = js.native
  var normalY: Double = js.native
  var perpSlope: Double = js.native
  var right: Double = js.native
  var slope: Double = js.native
  var start: phaser.Point = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def clone(output: phaser.Line): phaser.Line = js.native
  def coordinatesOnLine(stepRate: Double, results: js.Array[js.Any]): js.Array[js.Any] = js.native
  def fromAngle(x: Double, y: Double, angle: Double, length: Double): phaser.Line = js.native
  def fromSprite(startSprite: phaser.Sprite, endSprite: phaser.Sprite, useCenter: Boolean = ???): phaser.Line = js.native
  def intersects(line: phaser.Line, asSegment: Boolean = ???, result: phaser.Point = ???): phaser.Point = js.native
  def pointOnLine(x: Double, y: Double): Boolean = js.native
  def pointOnSegment(x: Double, y: Double): Boolean = js.native
  def reflect(line: phaser.Line): Double = js.native
  def setTo(x1: Double = ???, y1: Double = ???, x2: Double = ???, y2: Double = ???): phaser.Line = js.native
}

@JSName("Phaser.Line")
object Line extends js.Object {
  def intersectsPoints(a: phaser.Point, b: phaser.Point, e: phaser.Point, f: phaser.Point, asSegment: Boolean = ???, result: phaser.Point = ???): phaser.Point = js.native
  def intersects(a: phaser.Line, b: phaser.Line, asSegment: Boolean = ???, result: phaser.Point = ???): phaser.Point = js.native
  def reflect(a: phaser.Line, b: phaser.Line): Double = js.native
}

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

@JSName("Phaser.Loader")
class Loader protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var baseURL: String = js.native
  var crossOrigin: js.Any = js.native
  var enableParallel: Boolean = js.native
  var game: phaser.Game = js.native
  var hasLoaded: Boolean = js.native
  var isLoading: Boolean = js.native
  var maxParallelDownloads: Double = js.native
  var onFileStart: phaser.Signal = js.native
  var onFileComplete: phaser.Signal = js.native
  var onFileError: phaser.Signal = js.native
  var onLoadComplete: phaser.Signal = js.native
  var onLoadStart: phaser.Signal = js.native
  var onPackComplete: phaser.Signal = js.native
  var preloadSprite: js.Any = js.native
  var progress: Double = js.native
  var progressFloat: Double = js.native
  var resetLocked: Boolean = js.native
  var useXDomainRequest: Boolean = js.native
  def asyncComplete(file: js.Any, errorMessage: String = ???): Unit = js.native
  def addSyncPoint(`type`: String, key: String): phaser.Loader = js.native
  def addToFileList(`type`: String, key: String, url: String, properties: js.Any, overwrite: Boolean): Unit = js.native
  def atlas(key: String, textureURL: String, atlasURL: String = ???, atlasData: js.Any = ???, format: Double = ???): phaser.Loader = js.native
  def atlasJSONArray(key: String, textureURL: String, atlasURL: String = ???, atlasData: js.Any = ???): phaser.Loader = js.native
  def atlasJSONHash(key: String, textureURL: String, atlasURL: String = ???, atlasData: js.Any = ???): phaser.Loader = js.native
  def atlasXML(key: String, textureURL: String, atlasURL: String = ???, atlasData: js.Any = ???): phaser.Loader = js.native
  def audio(key: String, urls: js.Any, autoDecode: Boolean = ???): phaser.Loader = js.native
  def audiosprite(key: String, urls: js.Array[String], jsonURL: String = ???, jsonData: js.Any = ???, autoDecode: Boolean = ???): phaser.Loader = js.native
  def binary(key: String, url: String, callback: js.Function = ???, callbackContext: js.Any = ???): phaser.Loader = js.native
  def bitmapFont(key: String, textureURL: String, xmlURL: String = ???, xmlData: js.Any = ???, xSpacing: Double = ???, ySpacing: Double = ???): phaser.Loader = js.native
  def checkKeyExists(`type`: String, key: String): Boolean = js.native
  def csvLoadComplete(file: js.Any, xhr: XMLHttpRequest): Unit = js.native
  def fileComplete(file: js.Any, xhr: XMLHttpRequest): Unit = js.native
  def fileError(file: js.Any, xhr: XMLHttpRequest, reason: String): Unit = js.native
  def finishedLoading(abnormal: Boolean = ???): Unit = js.native
  def getAsset(`type`: String, key: String): js.Dynamic = js.native
  def getAssetIndex(`type`: String, key: String): Double = js.native
  def getAudioURL(urls: js.Array[js.Any]): Unit = js.native
  def image(key: String, url: String, overwrite: Boolean = ???): phaser.Loader = js.native
  def json(key: String, url: String, overwrite: Boolean = ???): phaser.Loader = js.native
  def jsonLoadComplete(file: js.Any, xhr: XMLHttpRequest): Unit = js.native
  def loadAudioTag(file: js.Any): Unit = js.native
  def loadFile(file: js.Any): Unit = js.native
  def loadImageTag(file: js.Any): Unit = js.native
  def pack(key: String, url: String = ???, data: js.Any = ???, callbackContext: js.Any = ???): phaser.Loader = js.native
  //  def parseXml(data: String): XMLDocument = js.native
  def physics(key: String, url: String = ???, data: js.Any = ???, format: String = ???): phaser.Loader = js.native
  def processLoadQueue(): Unit = js.native
  def processPack(pack: js.Any): Unit = js.native
  def removeAll(): Unit = js.native
  def removeFile(`type`: String, key: String): Unit = js.native
  def replaceInFileList(`type`: String, key: String, url: String, properties: js.Any): Unit = js.native
  def reset(hard: Boolean = ???, clearEvents: Boolean = ???): Unit = js.native
  def resize(): Unit = js.native
  def script(key: String, url: String, callback: js.Function = ???, callbackContext: js.Any = ???): phaser.Loader = js.native
  def setPreloadSprite(sprite: js.Any, direction: Double = ???): Unit = js.native
  def spritesheet(key: String, url: String, frameWidth: Double, frameHeight: Double, frameMax: Double = ???, margin: Double = ???, spacing: Double = ???): phaser.Loader = js.native
  def start(): Unit = js.native
  def text(key: String, url: String, overwrite: Boolean = ???): phaser.Loader = js.native
  def tilemap(key: String, url: String = ???, data: js.Any = ???, format: Double = ???): phaser.Loader = js.native
  def totalLoadedFiles(): Double = js.native
  def totalLoadedPacks(): Double = js.native
  def totalQueuedFiles(): Double = js.native
  def totalQueuedPacks(): Double = js.native
  def transformUrl(url: String): String = js.native
  def updateProgress(): Unit = js.native
  def withSyncPoint(callback: js.Function, callbackContext: js.Any = ???): phaser.Loader = js.native
  def xml(key: String, url: String, overwrite: Boolean = ???): phaser.Loader = js.native
  def xhrLoad(file: js.Any, url: String, `type`: String, onload: js.Function, onerror: js.Function = ???): Unit = js.native
  def xhrLoadWithXDR(file: js.Any, url: String, `type`: String, onload: js.Function, onerror: js.Function = ???): Unit = js.native
  def xmlLoadComplete(file: js.Any, xhr: XMLHttpRequest): Unit = js.native
}

@JSName("Phaser.Loader")
object Loader extends js.Object {
  var PHYSICS_LIME_CORONA_JSON: Double = js.native
  var PHYSICS_PHASER_JSON: Double = js.native
  var TEXTURE_ATLAS_JSON_ARRAY: Double = js.native
  var TEXTURE_ATLAS_JSON_HASH: Double = js.native
  var TEXTURE_ATLAS_XML_STARLING: Double = js.native
}

@JSName("Phaser.LoaderParser")
class LoaderParser extends js.Object {
}

@JSName("Phaser.LoaderParser")
object LoaderParser extends js.Object {
  def bitmapFont(game: phaser.Game, xml: js.Any, cacheKey: String, xSpacing: Double, ySpacing: Double): phaser.FrameData = js.native
}

@JSName("Phaser.Matrix")
class Matrix extends PIXI.Matrix {
  var `type`: Double = js.native
  @JSName("apply")
  def apply(pos: phaser.Point, newPos: phaser.Point = ???): phaser.Point = js.native
  def applyInverse(pos: phaser.Point, newPos: phaser.Point = ???): phaser.Point = js.native
  def append(matrix: phaser.Matrix): phaser.Matrix = js.native
}

@JSName("Phaser.Math")
class Math extends js.Object {
}

@JSName("Phaser.Math")
object Math extends js.Object {
  def angleBetween(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def angleBetweenPoints(point1: phaser.Point, point2: phaser.Point): Double = js.native
  def angleBetweenY(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def angleBetweenPointsY(point1: phaser.Point, point2: phaser.Point): Double = js.native
  def angleLimit(angle: Double, min: Double, max: Double): Double = js.native
  def average(numbers: Double*): Double = js.native
  def bernstein(n: Double, i: Double): Double = js.native
  def bezierInterpolation(v: js.Array[Double], k: Double): Double = js.native
  def catmullRom(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
  def catmullRomInterpolation(v: js.Array[Double], k: Double): Double = js.native
  def ceil(value: Double): Double = js.native
  def ceilTo(value: Double, place: Double = ???, base: Double = ???): Double = js.native
  def chanceRoll(chance: Double): Boolean = js.native
  def clamp(x: Double, a: Double, b: Double): Double = js.native
  def clampBottom(x: Double, a: Double): Double = js.native
  def degToRad(degrees: Double): Double = js.native
  def difference(a: Double, b: Double): Double = js.native
  def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def distancePow(xy: Double, y1: Double, x2: Double, y2: Double, pow: Double = ???): Double = js.native
  def distanceRounded(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def factorial(value: Double): Double = js.native
  def floor(value: Double): Double = js.native
  def floorTo(value: Double, place: Double, base: Double): Double = js.native
  def fuzzyCeil(`val`: Double, epsilon: Double = ???): Boolean = js.native
  def fuzzyEqual(a: Double, b: Double, epsilon: Double = ???): Boolean = js.native
  def fuzzyLessThan(a: Number, b: Double, epsilon: Double = ???): Boolean = js.native
  def fuzzyFloor(`val`: Double, epsilon: Double = ???): Boolean = js.native
  def fuzzyGreaterThan(a: Double, b: Double, epsilon: Double = ???): Boolean = js.native
  def getRandom[T](objects: js.Array[T], startIndex: Double = ???, length: Double = ???): T = js.native
  def interpolateFloat(a: Double, b: Double, weight: Double): Double = js.native
  def isEven(n: Double): Boolean = js.native
  def isOdd(n: Double): Boolean = js.native
  def linear(p0: Double, p1: Double, t: Double): Double = js.native
  def linearInterpolation(v: js.Array[Double], k: Double): Double = js.native
  def limitValue(value: Double, min: Double, max: Double): Double = js.native
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double = js.native
  def max(numbers: Double*): Double = js.native
  def maxAdd(value: Double, amount: Double, max: Double): Double = js.native
  def maxProperty(numbers: Double*): Double = js.native
  def min(numbers: Double*): Double = js.native
  def minProperty(numbers: Double*): Double = js.native
  def minSub(value: Double, amount: Double, min: Double): Double = js.native
  def normalizeAngle(angle: Double, radians: Boolean = ???): Double = js.native
  def normalizeLatitude(lat: Double): Double = js.native
  def normalizeLongitude(lng: Double): Double = js.native
  def numberArray(start: Double, end: Double): js.Array[Double] = js.native
  def numberArrayStep(start: Double, end: Double, step: Double = ???): js.Array[Double] = js.native
  def percent(a: Double, b: Double, base: Double = ???): Double = js.native
  def p2px(v: Double): Double = js.native
  var PI2: Double = js.native
  def radToDeg(radians: Double): Double = js.native
  def randomSign(): Double = js.native
  def reverseAngle(angleRed: Double): Double = js.native
  def removeRandom[T](objects: js.Array[T], startIndex: Double = ???, length: Double = ???): T = js.native
  def roundAwayFromZero(value: Double): Double = js.native
  def roundTo(value: Double, place: Double = ???, base: Double = ???): Double = js.native
  def shear(n: Double): Double = js.native
  def shift(stack: js.Array[js.Any]): js.Dynamic = js.native
  def shuffleArray[T](array: js.Array[T]): js.Array[T] = js.native
  def sign(x: Double): Double = js.native
  def sinCosGenerator(length: Double, sinAmplitude: Double = ???, cosAmplitude: Double = ???, frequency: Double = ???): js.Any = js.native
  def smootherstep(x: Double, min: Double, max: Double): Double = js.native
  def smoothstep(x: Double, min: Double, max: Double): Double = js.native
  def snapTo(input: Double, gap: Double, start: Double = ???): Double = js.native
  def snapToCeil(input: Double, gap: Double, start: Double = ???): Double = js.native
  def snapToFloor(input: Double, gap: Double, start: Double = ???): Double = js.native
  def snapToInArray(input: Double, arr: js.Array[Double], sort: Boolean = ???): Double = js.native
  def truncate(n: Double): Double = js.native
  def within(a: Double, b: Double, tolerance: Double): Boolean = js.native
  def wrap(value: Double, min: Double, max: Double): Double = js.native
  def wrapAngle(angle: Double, radians: Boolean = ???): Double = js.native
  def wrapValue(value: Double, amount: Double, max: Double): Double = js.native
}

trait WheelEventProxy extends js.Object {
  def bindEvent(event: js.Any): WheelEventProxy = js.native
  var `type`: String = js.native
  var deltaMode: Double = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var deltaZ: Double = js.native
}

@JSName("Phaser.Mouse")
class Mouse protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var button: Double = js.native
  var callbackContext: js.Any = js.native
  var capture: Boolean = js.native
  var disabled: Boolean = js.native
  var enabled: Boolean = js.native
  var event: MouseEvent = js.native
  var game: phaser.Game = js.native
  var locked: Boolean = js.native
  var mouseDownCallback: js.Function1[MouseEvent, Unit] = js.native
  var mouseMoveCallback: js.Function1[MouseEvent, Unit] = js.native
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
  var pointerLock: phaser.Signal = js.native
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
object Mouse extends js.Object {
  var LEFT_BUTTON: Double = js.native
  var MIDDLE_BUTTON: Double = js.native
  var NO_BUTTON: Double = js.native
  var RIGHT_BUTTON: Double = js.native
  var WHEEL_DOWN: Double = js.native
  var WHEEL_UP: Double = js.native
}

//@JSName("Phaser.MSPointer")
//class MSPointer protected () extends js.Object {
//  def this(game: phaser.Game) = this()
//  var button: Double = js.native
//  var capture: Boolean = js.native
//  var callbackContext: js.Any = js.native
//  var event: MSPointerEvent = js.native
//  var disabled: Boolean = js.native
//  var game: phaser.Game = js.native
//  var onPointerDown: js.Function1[MSPointerEvent, Unit] = js.native
//  var onPointerMove: js.Function1[MSPointerEvent, Unit] = js.native
//  var onPointerUp: js.Function1[MSPointerEvent, Unit] = js.native
//  var mouseDownCallback: js.Function1[MSPointerEvent, Unit] = js.native
//  var mouseMoveCallback: js.Function1[MSPointerEvent, Unit] = js.native
//  var mouseUpCallback: js.Function1[MSPointerEvent, Unit] = js.native
//  var pointerDownCallback: js.Function1[MSPointerEvent, Unit] = js.native
//  var pointerMoveCallback: js.Function1[MSPointerEvent, Unit] = js.native
//  var pointerUpCallback: js.Function1[MSPointerEvent, Unit] = js.native
//  def start(): Unit = js.native
//  def stop(): Unit = js.native
//}

@JSName("Phaser.Net")
class Net protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var game: phaser.Game = js.native
  def checkDomainName(domain: String): Boolean = js.native
  def decodeURI(value: String): String = js.native
  def getHostName(): String = js.native
  def getQueryString(parameter: String = ???): String = js.native
  def updateQueryString(key: String, value: js.Any, redirect: Boolean = ???, url: String = ???): String = js.native
}

@JSName("Phaser.Particle")
class Particle protected() extends phaser.Sprite {
  def this(game: phaser.Game, x: Double, y: Double, key: js.Any = ???, frame: js.Any = ???) = this()
  def onEmit(): Unit = js.native
  def setAlphaData(data: js.Array[js.Any]): Unit = js.native
  def setScaleData(data: js.Array[js.Any]): Unit = js.native
}

@JSName("Phaser.Particles")
class Particles protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var emitters: js.Any = js.native
  var game: phaser.Game = js.native
  var ID: Double = js.native
  def add(emitter: phaser.particles.arcade.Emitter): phaser.particles.arcade.Emitter = js.native
  def remove(emitter: phaser.particles.arcade.Emitter): Unit = js.native
  def update(): Unit = js.native
}

package particles {

package arcade {

@JSName("Phaser.Particles.Arcade.Emitter")
class Emitter protected() extends phaser.Group {
  def this(game: phaser.Game, x: Double = ???, y: Double = ???, maxParticles: Double = ???) = this()
  var alphaData: js.Array[js.Any] = js.native
  var autoAlpha: Boolean = js.native
  var autoScale: Boolean = js.native
  var angularDrag: Double = js.native
  var bottom: Double = js.native
  var bounce: phaser.Point = js.native
  var emitX: Double = js.native
  var emitY: Double = js.native
  var frequency: Double = js.native
  var gravity: Double = js.native
  var group: phaser.Group = js.native
  var left: Double = js.native
  var lifespan: Double = js.native
  var maxParticles: Double = js.native
  var maxParticleScale: Double = js.native
  var maxParticleSpeed: phaser.Point = js.native
  var maxRotation: Double = js.native
  var minParticleScale: Double = js.native
  var minParticleSpeed: phaser.Point = js.native
  var minRotation: Double = js.native
  var on: Boolean = js.native
  var particleBringToTop: Boolean = js.native
  var particleSendToBack: Boolean = js.native
  var particleClass: phaser.Sprite = js.native
  var particleDrag: phaser.Point = js.native
  var right: Double = js.native
  var scaleData: js.Array[js.Any] = js.native
  var top: Double = js.native
  def at(`object`: js.Any): Unit = js.native
  def emitParticle(): Unit = js.native
  def explode(lifespan: Double = ???, quantity: Double = ???): Unit = js.native
  def flow(lifespan: Double = ???, frequency: Double = ???, quantity: Double = ???, total: Double = ???, immediate: Boolean = ???): Unit = js.native
  def kill(): Unit = js.native
  def makeParticles(keys: js.Any, frames: js.Any = ???, quantity: Double = ???, collide: Boolean = ???, collideWorldBounds: Boolean = ???): phaser.particles.arcade.Emitter = js.native
  def reset(x: Double, y: Double, health: Double = ???): phaser.Particles = js.native
  def setAlpha(min: Double = ???, max: Double = ???, rate: Double = ???, ease: js.Function1[Double, Double] = ???, yoyo: Boolean = ???): Unit = js.native
  def setRotation(min: Double = ???, max: Double = ???): Unit = js.native
  def setScale(minX: Double = ???, maxX: Double = ???, minY: Double = ???, maxY: Double = ???, rate: Double = ???, ease: js.Function1[Double, Double] = ???, yoyo: Boolean = ???): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def setXSpeed(min: Double, max: Double): Unit = js.native
  def setYSpeed(min: Double, max: Double): Unit = js.native
  def start(explode: Boolean = ???, lifespan: Double = ???, frequency: Double = ???, quantity: Double = ???, forceQuantity: Boolean = ???): Unit = js.native
  def revive(): Unit = js.native
}

}

}

@JSName("Phaser.Physics")
class Physics protected() extends js.Object {
  def this(game: phaser.Game, config: js.Any = ???) = this()
  var arcade: phaser.physics.Arcade = js.native
  var config: js.Any = js.native
  var game: phaser.Game = js.native
  var ninja: phaser.physics.Ninja = js.native
  //  var p2: phaser.physics.P2 = js.native
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
object Physics extends js.Object {
  var ARCADE: Double = js.native
  var P2JS: Double = js.native
  var NINJA: Double = js.native
  var BOX2D: Double = js.native
  var CHIPMUNK: Double = js.native
}

package physics {

@JSName("phaser.physics.arcade")
class Arcade protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var bounds: phaser.Rectangle = js.native
  var checkCollision: js.Any = js.native
  var forceX: Boolean = js.native
  var game: phaser.Game = js.native
  var gravity: phaser.Point = js.native
  var quadTree: phaser.QuadTree = js.native
  var maxObjects: Double = js.native
  var maxLevels: Double = js.native
  var skipQuadTree: Boolean = js.native
  var sortDirection: Double = js.native
  def accelerationFromRotation(rotation: Double, speed: Double = ???, point: phaser.Point = ???): phaser.Point = js.native
  def accelerateToObject(displayObject: js.Any, destination: js.Any, speed: Double = ???, xSpeedMax: Double = ???, ySpeedMax: Double = ???): Double = js.native
  def accelerateToPointer(displayObject: js.Any, pointer: phaser.Pointer = ???, speed: Double = ???, xSpeedMax: Double = ???, ySpeedMax: Double = ???): Double = js.native
  def accelerateToXY(displayObject: js.Any, x: Double, y: Double, speed: Double = ???, xSpeedMax: Double = ???, ySpeedMax: Double = ???): Double = js.native
  def angleBetween(source: js.Any, target: js.Any): Double = js.native
  def angleToPointer(displayObject: js.Any, pointer: phaser.Pointer = ???): Double = js.native
  def angleToXY(displayObject: js.Any, x: Double, y: Double): Double = js.native
  def collide(object1: js.Any, object2: js.Any, collideCallback: js.Function = ???, processCallback: js.Function = ???, callbackContext: js.Any = ???): Boolean = js.native
  def computeVelocity(axis: Double, body: phaser.physics.arcade.Body, velocity: Double, acceleration: Double, drag: Double, max: Double = ???): Double = js.native
  def distanceBetween(source: js.Any, target: js.Any): Double = js.native
  def distanceToPointer(displayObject: js.Any, pointer: phaser.Pointer = ???): Double = js.native
  def distanceToXY(displayObject: js.Any, x: Double, y: Double): Double = js.native
  def enable(`object`: js.Any, children: Boolean = ???): Unit = js.native
  def enableBody(`object`: js.Any): Unit = js.native
  def getObjectsAtLocation(x: Double, y: Double, group: phaser.Group, callback: js.Function2[js.Any, js.Any, Unit] = ???, callbackContext: js.Any = ???, callbackArg: js.Any = ???): js.Array[Sprite] = js.native
  def intersects(body1: phaser.physics.arcade.Body, body2: phaser.physics.arcade.Body): Boolean = js.native
  def moveToObject(displayObject: js.Any, destination: js.Any, speed: Double = ???, maxTime: Double = ???): Double = js.native
  def moveToPointer(displayObject: js.Any, speed: Double = ???, pointer: phaser.Pointer = ???, maxTime: Double = ???): Double = js.native
  def moveToXY(displayObject: js.Any, x: Double, y: Double, speed: Double = ???, maxTime: Double = ???): Double = js.native
  def overlap(object1: js.Any, object2: js.Any, overlapCallback: js.Function = ???, processCallback: js.Function = ???, callbackContext: js.Any = ???): Boolean = js.native
  def processTileSeparationX(body: phaser.physics.arcade.Body, x: Double): Boolean = js.native
  def processTileSeparationY(body: phaser.physics.arcade.Body, y: Double): Unit = js.native
  def setBounds(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def setBoundsToWorld(): Unit = js.native
  def separate(body1: phaser.physics.arcade.Body, body2: phaser.physics.arcade.Body, processCallback: js.Function = ???, callbackContext: js.Any = ???, overlapOnly: Boolean = ???): Boolean = js.native
  def separateX(body1: phaser.physics.arcade.Body, body2: phaser.physics.arcade.Body, overlapOnly: Boolean): Boolean = js.native
  def separateY(body1: phaser.physics.arcade.Body, body2: phaser.physics.arcade.Body, overlapOnly: Boolean): Boolean = js.native
  def separateTile(i: Double, body: phaser.physics.arcade.Body, tile: phaser.Tile): Boolean = js.native
  def sort(group: phaser.Group): Unit = js.native
  def tileCheckX(body: phaser.physics.arcade.Body, tile: phaser.Tile): Double = js.native
  def tileCheckY(body: phaser.physics.arcade.Body, tile: phaser.Tile): Double = js.native
  def updateMotion(body: phaser.physics.arcade.Body): Unit = js.native
  def velocityFromAngle(angle: Double, speed: Double = ???, point: phaser.Point = ???): phaser.Point = js.native
  def velocityFromRotation(rotation: Double, speed: Double = ???, point: phaser.Point = ???): phaser.Point = js.native
}

@JSName("phaser.physics.arcade")
object Arcade extends js.Object {
  var SORT_NONE: Double = js.native
  var LEFT_RIGHT: Double = js.native
  var RIGHT_LEFT: Double = js.native
  var TOP_BOTTOM: Double = js.native
  var BOTTOM_TOP: Double = js.native
  var OVERLAP_BIAS: Double = js.native
  var TILE_BIAS: Double = js.native
}

package arcade {

@JSName("phaser.physics.arcade.Body")
class Body protected() extends js.Object {
  def this(sprite: phaser.Sprite) = this()
  var acceleration: phaser.Point = js.native
  var allowGravity: Boolean = js.native
  var allowRotation: Boolean = js.native
  var angle: Double = js.native
  var angularAcceleration: Double = js.native
  var angularDrag: Double = js.native
  var angularVelocity: Double = js.native
  var blocked: FaceChoices = js.native
  var bottom: Double = js.native
  var bounce: phaser.Point = js.native
  var center: phaser.Point = js.native
  var checkCollision: FaceChoices = js.native
  var collideWorldBounds: Boolean = js.native
  var customSeparateX: Boolean = js.native
  var customSeparateY: Boolean = js.native
  var deltaMax: phaser.Point = js.native
  var dirty: Boolean = js.native
  var drag: phaser.Point = js.native
  var embedded: Boolean = js.native
  var enable: Boolean = js.native
  var facing: Double = js.native
  var friction: phaser.Point = js.native
  var game: phaser.Game = js.native
  var gravity: phaser.Point = js.native
  var halfWidth: Double = js.native
  var halfHeight: Double = js.native
  var immovable: Boolean = js.native
  var mass: Double = js.native
  var maxAngular: Double = js.native
  var maxVelocity: phaser.Point = js.native
  var moves: Boolean = js.native
  var newVelocity: phaser.Point = js.native
  var offset: phaser.Point = js.native
  var overlapX: Double = js.native
  var overlapY: Double = js.native
  var phase: Double = js.native
  var position: phaser.Point = js.native
  var preRotation: Double = js.native
  var prev: phaser.Point = js.native
  var right: Double = js.native
  var rotation: Double = js.native
  var skipQuadTree: Boolean = js.native
  var sourceWidth: Double = js.native
  var sourceHeight: Double = js.native
  var speed: Double = js.native
  var sprite: phaser.Sprite = js.native
  var tilePadding: phaser.Point = js.native
  var touching: FaceChoices = js.native
  var `type`: Double = js.native
  var wasTouching: FaceChoices = js.native
  var width: Double = js.native
  var velocity: phaser.Point = js.native
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
  def render(context: js.Any, body: phaser.physics.arcade.Body, color: String = ???, filled: Boolean = ???): Unit = js.native
  def renderBodyInfo(debug: phaser.Utils.Debug, body: phaser.physics.arcade.Body): Unit = js.native
  def reset(x: Double, y: Double): Unit = js.native
  def setSize(width: Double, height: Double, offsetX: Double = ???, offsetY: Double = ???): Unit = js.native
  def updateBounds(): Boolean = js.native
}

@JSName("phaser.physics.arcade.FaceChoices")
class FaceChoices extends js.Object {
  var none: Boolean = js.native
  var any: Boolean = js.native
  var up: Boolean = js.native
  var down: Boolean = js.native
  var left: Boolean = js.native
  var right: Boolean = js.native
}

}

@JSName("Phaser.Physics.Ninja")
class Ninja protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var game: phaser.Game = js.native
  var gravity: Double = js.native
  var bounds: phaser.Rectangle = js.native
  var maxObjects: Double = js.native
  var maxLevels: Double = js.native
  var quadTree: phaser.QuadTree = js.native
  var time: phaser.Time = js.native
  def clearTilemapLayerBodies(map: phaser.Tilemap, layer: js.Any): Unit = js.native
  def collide(object1: js.Any, object2: js.Any, collideCallback: js.Function = ???, processCallback: js.Function = ???, callbackContext: js.Any = ???): Boolean = js.native
  def convertTilemap(map: phaser.Tilemap, layer: js.Any = ???, slopeMap: js.Any = ???): js.Array[phaser.physics.ninja.Tile] = js.native
  def enableAABB(`object`: js.Any, children: Boolean = ???): Unit = js.native
  def enableCircle(`object`: js.Any, radius: Double, children: Boolean = ???): Unit = js.native
  def enableTile(`object`: js.Any, id: Double, children: Boolean = ???): Unit = js.native
  def enable(`object`: js.Any, `type`: Double = ???, id: Double = ???, radius: Double = ???, children: Boolean = ???): Unit = js.native
  def enableBody(`object`: js.Any, `type`: Double = ???, id: Double = ???, radius: Double = ???): Unit = js.native
  def overlap(object1: js.Any, object2: js.Any, overlapCallback: js.Function = ???, processCallback: js.Function = ???, callbackContext: js.Any = ???): Boolean = js.native
  def separate(body1: phaser.physics.ninja.Body, body2: phaser.physics.ninja.Body, processCallback: js.Function = ???, callbackContext: js.Any = ???, overlapOnly: Boolean = ???): Boolean = js.native
  def setBounds(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def setBoundsToWorld(): Unit = js.native
}

package ninja {

@JSName("Phaser.Physics.Ninja.Body")
class Body protected() extends js.Object {
  def this(system: phaser.physics.Ninja, sprite: phaser.Sprite, `type`: Double = ???, id: Double = ???, radius: Double = ???, x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???) = this()
  var aabb: phaser.physics.ninja.AABB = js.native
  var angle: Double = js.native
  var bottom: Double = js.native
  var bounce: Double = js.native
  var checkCollision: phaser.physics.arcade.FaceChoices = js.native
  var circle: phaser.physics.ninja.Circle = js.native
  var collideWorldBounds: Boolean = js.native
  var drag: Double = js.native
  var facing: Double = js.native
  var friction: Double = js.native
  var game: phaser.Game = js.native
  var gravityScale: Double = js.native
  var height: Double = js.native
  var immovable: Boolean = js.native
  var maxSpeed: Double = js.native
  var right: Double = js.native
  var sprite: phaser.Sprite = js.native
  var system: phaser.physics.Ninja = js.native
  var tile: phaser.physics.ninja.Tile = js.native
  var touching: phaser.physics.arcade.FaceChoices = js.native
  var `type`: Double = js.native
  var shape: js.Any = js.native
  var speed: Double = js.native
  var velocity: phaser.Point = js.native
  var wasTouching: phaser.physics.arcade.FaceChoices = js.native
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
  def render(context: js.Any, body: phaser.physics.ninja.Body, color: String = ???, filled: Boolean = ???): Unit = js.native
  def reset(): Unit = js.native
}

@JSName("Phaser.Physics.Ninja.AABB")
class AABB protected() extends js.Object {
  def this(body: phaser.physics.ninja.Body, x: Double, y: Double, width: Double, height: Double) = this()
  var aabbTileProjections: js.Any = js.native
  var body: phaser.physics.ninja.Body = js.native
  var height: Double = js.native
  var oldPos: phaser.Point = js.native
  var pos: phaser.Point = js.native
  var system: phaser.physics.Ninja = js.native
  var width: Double = js.native
  var velocity: phaser.Point = js.native
  var xw: Double = js.native
  var yw: Double = js.native
  def collideWorldBounds(): Unit = js.native
  def collideAABBVsAABB(aabb: phaser.physics.ninja.AABB): Boolean = js.native
  def collideAABBVsTile(tile: phaser.physics.ninja.Tile): Boolean = js.native
  def destroy(): Unit = js.native
  def integrate(): Unit = js.native
  def render(context: js.Any, xOffset: Double, yOffset: Double, color: String, filled: Boolean): Unit = js.native
  def reportCollisionVsWorld(px: Double, py: Double, dx: Double, dy: Double, obj: js.Any): Unit = js.native
  def reportCollisionVsBody(px: Double, py: Double, dx: Double, dy: Double, obj: js.Any): Unit = js.native
  def resolveTile(x: Double, y: Double, body: phaser.physics.ninja.AABB, tile: phaser.physics.ninja.Tile): Boolean = js.native
  def reverse(): Unit = js.native
}

@JSName("Phaser.Physics.Ninja.AABB")
object AABB extends js.Object {
  var COL_NONE: Double = js.native
  var COL_AXIS: Double = js.native
  var COL_OTHER: Double = js.native
}

@JSName("Phaser.Physics.Ninja.Circle")
class Circle protected() extends js.Object {
  def this(body: phaser.physics.ninja.Body, x: Double, y: Double, radius: Double) = this()
  var COL_NONE: Double = js.native
  var COL_AXIS: Double = js.native
  var COL_OTHER: Double = js.native
  var body: phaser.physics.ninja.Body = js.native
  var circleTileProjections: js.Any = js.native
  var oldPos: phaser.Point = js.native
  var height: Double = js.native
  var pos: phaser.Point = js.native
  var radius: Double = js.native
  var system: phaser.physics.Ninja = js.native
  var `type`: Double = js.native
  var velocity: phaser.Point = js.native
  var width: Double = js.native
  var xw: Double = js.native
  var yw: Double = js.native
  def collideCircleVsTile(tile: phaser.physics.ninja.Tile): Boolean = js.native
  def collideWorldBounds(): Unit = js.native
  def destroy(): Unit = js.native
  def distance(dest: Double, round: Boolean = ???): Double = js.native
  def integrate(): Unit = js.native
  def render(context: js.Any, xOffset: Double, yOffset: Double, color: String, filled: Boolean): Unit = js.native
  def reportCollisionVsWorld(px: Double, py: Double, dx: Double, dy: Double, obj: js.Any): Unit = js.native
  def reportCollisionVsBody(px: Double, py: Double, dx: Double, dy: Double, obj: js.Any): Unit = js.native
  def resolveCircleTile(x: Double, y: Double, oH: Double, oV: Double, obj: phaser.physics.ninja.Circle, t: phaser.physics.ninja.Tile): Boolean = js.native
}

sealed trait TileType extends js.Object {
}

@JSName("Phaser.Physics.Ninja.TileType")
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

@JSName("Phaser.Physics.Ninja.Tile")
class Tile protected() extends js.Object {
  def this(body: phaser.physics.ninja.Body, x: Double, y: Double, width: Double, height: Double, `type`: Double = ???) = this()
  var body: phaser.physics.ninja.Body = js.native
  var bottom: Double = js.native
  var flipped: Boolean = js.native
  var height: Double = js.native
  var id: Double = js.native
  var oldpos: phaser.Point = js.native
  var pos: phaser.Point = js.native
  var right: Double = js.native
  var rotation: Double = js.native
  var system: phaser.physics.Ninja = js.native
  var `type`: phaser.physics.ninja.TileType = js.native
  var velocity: phaser.Point = js.native
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

//@JSName("Phaser.Physics.P2")
//class P2 protected () extends js.Object {
//  def this(game: phaser.Game, config: js.Any = ???) = this()
//  var applyDamping: Boolean = js.native
//  var applyGravity: Boolean = js.native
//  var applySpringForces: Boolean = js.native
//  var boundsCollidesWith: js.Array[phaser.physics.p2.Body] = js.native
//  var boundsCollisionGroup: phaser.physics.p2.CollisionGroup = js.native
//  var config: js.Any = js.native
//  var callbackContext: js.Any = js.native
//  var collisionGroups: js.Array[phaser.physics.p2.CollisionGroup] = js.native
//  var contactMaterial: phaser.physics.p2.ContactMaterial = js.native
//  var emitImpactEvent: Boolean = js.native
//  var everythingCollisionGroup: phaser.physics.p2.CollisionGroup = js.native
//  var frameRate: Double = js.native
//  var friction: Double = js.native
//  var game: phaser.Game = js.native
//  var gravity: phaser.physics.p2.InversePointProxy = js.native
//  var materials: js.Array[phaser.physics.p2.Material] = js.native
//  var nothingCollisionGroup: phaser.physics.p2.CollisionGroup = js.native
//  var onBodyAdded: phaser.Signal = js.native
//  var onBodyRemoved: phaser.Signal = js.native
//  var onBeginContact: phaser.Signal = js.native
//  var onConstraintAdded: phaser.Signal = js.native
//  var onConstraintRemoved: phaser.Signal = js.native
//  var onContactMaterialAdded: phaser.Signal = js.native
//  var onContactMaterialRemoved: phaser.Signal = js.native
//  var onEndContact: phaser.Signal = js.native
//  var onSpringAdded: phaser.Signal = js.native
//  var onSpringRemoved: phaser.Signal = js.native
//  var paused: Boolean = js.native
//  var postBroaddphaseCallback: js.Function = js.native
//  var restitution: Double = js.native
//  var solveConstraints: Boolean = js.native
//  var time: js.Any = js.native
//  var total: Double = js.native
//  var useElapsedTime: Boolean = js.native
//  var walls: js.Any = js.native
//  var world: p2.World = js.native
//  def addBody(body: phaser.physics.p2.Body): Boolean = js.native
//  def addContactMaterial(material: phaser.physics.p2.ContactMaterial): phaser.physics.p2.ContactMaterial = js.native
//  def addConstraint[T](constraint: T): T = js.native
//  def addSpring(spring: phaser.physics.p2.Spring): phaser.physics.p2.Spring = js.native
//  def beginContactHandler(event: js.Any): Unit = js.native
//  def clear(): Unit = js.native
//  def clearTilemapLayerBodies(map: phaser.Tilemap, layer: js.Any = ???): Unit = js.native
//  def convertCollisionObjects(map: phaser.Tilemap, layer: js.Any = ???, addToWorld: Boolean = ???): js.Array[phaser.physics.p2.Body] = js.native
//  def convertTilemap(map: phaser.Tilemap, layer: js.Any = ???, addToWorld: Boolean = ???, optimize: Boolean = ???): js.Array[phaser.physics.p2.Body] = js.native
//  def createBody(x: Double, y: Double, mass: Double, addToWorld: Boolean = ???, options: p2.BodyOptions = ???, data: js.Array[js.Array[Double]] = ???): phaser.physics.p2.Body = js.native
//  def createCollisionGroup(group: phaser.Group = ???): phaser.physics.p2.CollisionGroup = js.native
//  def createContactMaterial(materialA: phaser.physics.p2.Material, materialB: phaser.physics.p2.Material, options: p2.ContactMaterialOptions = ???): phaser.physics.p2.ContactMaterial = js.native
//  def createDistanceConstraint(bodyA: js.Any, bodyB: js.Any, distance: Double, localAnchorA: js.Array[Double] = ???, localAnchorB: js.Array[Double] = ???, maxForce: Double = ???): phaser.physics.p2.DistanceConstraint = js.native
//  def createGearConstraint(bodyA: js.Any, bodyB: js.Any, angle: Double = ???, ratio: Double = ???): phaser.physics.p2.GearConstraint = js.native
//  def createLockConstraint(bodyA: js.Any, bodyB: js.Any, offset: js.Array[Double] = ???, angle: Double = ???, maxForce: Double = ???): phaser.physics.p2.LockConstraint = js.native
//  def createMaterial(name: String = ???, body: phaser.physics.p2.Body = ???): phaser.physics.p2.Material = js.native
//  def createParticle(x: Double, y: Double, mass: Double, addToWorld: Boolean = ???, options: p2.BodyOptions = ???, data: js.Array[js.Array[Double]] = ???): phaser.physics.p2.Body = js.native
//  def createPrismaticConstraint(body: js.Any, bodyB: js.Any, lockRotation: Boolean = ???, anchorA: js.Array[Double] = ???, anchorB: js.Array[Double] = ???, axis: Float32Array = ???, maxForce: Double = ???): phaser.physics.p2.PrismaticConstraint = js.native
//  def createRevoluteConstraint(bodyA: js.Any, pivotA: js.Array[Double], bodyB: js.Any, pivotB: js.Array[Double], maxForce: Double = ???, worldPivot: js.Array[Double] = ???): phaser.physics.p2.RevoluteConstraint = js.native
//  def createRotationalSpring(bodyA: js.Any, bodyB: js.Any, restAngle: Double = ???, stiffness: Double = ???, damping: Double = ???): p2.RotationalSpring = js.native
//  def createSpring(bodyA: js.Any, bodyB: js.Any, restLength: Double = ???, stiffness: Double = ???, damping: Double = ???, worldA: js.Array[Double] = ???, worldB: js.Array[Double] = ???, localA: js.Array[Double] = ???, localB: js.Array[Double] = ???): phaser.physics.p2.Spring = js.native
//  def destroy(): Unit = js.native
//  def enable(`object`: js.Any, debug: Boolean = ???, children: Boolean = ???): Unit = js.native
//  def enableBody(`object`: js.Any, debug: Boolean): Unit = js.native
//  def endContactHandler(event: js.Any): Unit = js.native
//  def getBodies(): js.Array[phaser.physics.p2.Body] = js.native
//  def getBody(`object`: js.Any): phaser.physics.p2.Body = js.native
//  def getConstraints(): js.Array[p2.Constraint] = js.native
//  def getSprings(): js.Array[phaser.physics.p2.Spring] = js.native
//  def getContactMaterial(materialA: phaser.physics.p2.Material, materialB: phaser.physics.p2.Material): phaser.physics.p2.ContactMaterial = js.native
//  def hitTest(worldPoint: phaser.Point, bodies: js.Array[js.Any] = ???, precision: Double = ???, filterStatic: Boolean = ???): js.Array[phaser.physics.p2.Body] = js.native
//  def mpx(v: Double): Double = js.native
//  def mpxi(v: Double): Double = js.native
//  def pause(): Unit = js.native
//  def preUpdate(): Unit = js.native
//  def pxm(v: Double): Double = js.native
//  def pxmi(v: Double): Double = js.native
//  def removeBody(body: phaser.physics.p2.Body): phaser.physics.p2.Body = js.native
//  def removeBodyNextStep(body: phaser.physics.p2.Body): Unit = js.native
//  def removeConstraint[T](constraint: T): T = js.native
//  def removeContactMaterial(material: phaser.physics.p2.ContactMaterial): phaser.physics.p2.ContactMaterial = js.native
//  def removeSpring(spring: phaser.physics.p2.Spring): phaser.physics.p2.Spring = js.native
//  def reset(): Unit = js.native
//  def resume(): Unit = js.native
//  def setBounds(x: Double, y: Double, width: Double, height: Double, left: Boolean = ???, right: Boolean = ???, top: Boolean = ???, bottom: Boolean = ???, setCollisionGroup: Boolean = ???): Unit = js.native
//  def setBoundsToWorld(left: Boolean = ???, right: Boolean = ???, top: Boolean = ???, bottom: Boolean = ???, setCollisionGroup: Boolean = ???): Unit = js.native
//  def setCollisionGroup(`object`: js.Any, group: phaser.physics.p2.CollisionGroup): Unit = js.native
//  def setImpactEvents(state: Boolean): Unit = js.native
//  def setMaterial(material: phaser.physics.p2.Material, bodies: js.Array[phaser.physics.p2.Body] = ???): Unit = js.native
//  def setPostBroadphaseCallback(callback: js.Function, context: js.Any): Unit = js.native
//  def setWorldMaterial(material: phaser.physics.p2.Material, left: Boolean = ???, right: Boolean = ???, top: Boolean = ???, bottom: Boolean = ???): Unit = js.native
//  def toJSON(): js.Dynamic = js.native
//  def update(): Unit = js.native
//  def updateBoundsCollisionGroup(setCollisionGroup: Boolean = ???): Unit = js.native
//}
//
//package p2 {
//
//@JSName("Phaser.Physics.P2.Body")
//class Body protected () extends js.Object {
//  def this(game: phaser.Game, sprite: phaser.Sprite = ???, x: Double = ???, y: Double = ???, mass: Double = ???) = this()
//  var allowSleep: Boolean = js.native
//  var angle: Double = js.native
//  var angularDamping: Double = js.native
//  var angularForce: Double = js.native
//  var angularVelocity: Double = js.native
//  var collidesWith: js.Array[phaser.physics.p2.CollisionGroup] = js.native
//  var collideWorldBounds: Boolean = js.native
//  var damping: Double = js.native
//  var data: p2.Body = js.native
//  var debug: Boolean = js.native
//  var debugBody: phaser.physics.p2.BodyDebug = js.native
//  var dynamic: Boolean = js.native
//  var fixedRotation: Boolean = js.native
//  var force: phaser.physics.p2.InversePointProxy = js.native
//  var kinematic: Boolean = js.native
//  var game: phaser.Game = js.native
//  var gravity: phaser.Point = js.native
//  var id: Double = js.native
//  var inertia: Double = js.native
//  var mass: Double = js.native
//  var motionState: Double = js.native
//  var offset: phaser.Point = js.native
//  var onBeginContact: phaser.Signal = js.native
//  var onEndContact: phaser.Signal = js.native
//  var rotation: Double = js.native
//  var removeNextStep: Boolean = js.native
//  var sprite: phaser.Sprite = js.native
//  var sleepSpeedLimit: Double = js.native
//  var static: Boolean = js.native
//  var `type`: Double = js.native
//  var velocity: phaser.physics.p2.InversePointProxy = js.native
//  var world: phaser.physics.P2 = js.native
//  var x: Double = js.native
//  var y: Double = js.native
//  def addToWorld(): Unit = js.native
//  def addCapsule(length: Double, radius: Double, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Capsule = js.native
//  def addCircle(radius: Double, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Circle = js.native
//  def addFixture(fixtureData: String): js.Array[p2.Shape] = js.native
//  def addLine(length: Double, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Line = js.native
//  def addParticle(offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Particle = js.native
//  def addPolygon(options: js.Any, points: js.Array[js.Array[Double]]): Boolean = js.native
//  def addPhaserPolygon(key: String, `object`: String): phaser.physics.p2.FixtureList = js.native
//  def addPlane(offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Plane = js.native
//  def addRectangle(width: Double, height: Double, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Rectangle = js.native
//  def addShape(shape: p2.Shape, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Shape = js.native
//  def adjustCenterOfMass(): Unit = js.native
//  def applyDamping(dt: Double): Unit = js.native
//  def applyForce(force: js.Array[Double], worldX: Double, worldY: Double): Unit = js.native
//  def clearCollision(clearGroup: Boolean = ???, cleanMask: Boolean = ???, shape: p2.Shape = ???): Unit = js.native
//  def clearShapes(): Unit = js.native
//  def collides(group: js.Any, callback: js.Function = ???, callbackContext: js.Any = ???, shape: p2.Shape = ???): Unit = js.native
//  def createBodyCallback(`object`: js.Any, callback: js.Function, callbackContext: js.Any): Unit = js.native
//  def createGroupCallback(group: phaser.physics.p2.CollisionGroup, callback: js.Function, callbackContext: js.Any): Unit = js.native
//  def destroy(): Unit = js.native
//  def getCollisionMask(): Double = js.native
//  def loadPolygon(key: String, `object`: String): Boolean = js.native
//  def moveBackward(speed: Double): Unit = js.native
//  def moveDown(speed: Double): Unit = js.native
//  def moveForward(speed: Double): Unit = js.native
//  def moveLeft(speed: Double): Unit = js.native
//  def moveRight(speed: Double): Unit = js.native
//  def moveUp(speed: Double): Unit = js.native
//  def preUpdate(): Unit = js.native
//  def postUpdate(): Unit = js.native
//  def removeFromWorld(): Unit = js.native
//  def removeShape(shape: p2.Shape): Boolean = js.native
//  def reverse(speed: Double): Unit = js.native
//  def rotateLeft(speed: Double): Unit = js.native
//  def rotateRight(speed: Double): Unit = js.native
//  def reset(x: Double, y: Double, resetDamping: Boolean = ???, resetMass: Boolean = ???): Unit = js.native
//  def shapeChanged(): Unit = js.native
//  def setCircle(radius: Double, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Circle = js.native
//  def setCollisionGroup(group: phaser.physics.p2.CollisionGroup, shape: p2.Shape = ???): Unit = js.native
//  def setRectangle(width: Double = ???, height: Double = ???, offsetX: Double = ???, offsetY: Double = ???, rotation: Double = ???): p2.Rectangle = js.native
//  def setRectangleFromSprite(sprite: js.Any): p2.Rectangle = js.native
//  def setMaterial(material: phaser.physics.p2.Material, shape: p2.Shape = ???): Unit = js.native
//  def setZeroDamping(): Unit = js.native
//  def setZeroForce(): Unit = js.native
//  def setZeroRotation(): Unit = js.native
//  def setZeroVelocity(): Unit = js.native
//  def toLocalFrame(out: js.Array[Double], worldPoint: js.Array[Double]): Unit = js.native
//  def thrust(speed: Double): Unit = js.native
//  def toWorldFrame(out: js.Array[Double], localPoint: js.Array[Double]): Unit = js.native
//  def updateCollisionMask(shape: p2.Shape = ???): Unit = js.native
//}
//
//@JSName("Phaser.Physics.P2.Body")
//object Body extends js.Object {
//  var DYNAMIC: Double = js.native
//  var STATIC: Double = js.native
//  var KINEMATIC: Double = js.native
//}
//
//@JSName("Phaser.Physics.P2.BodyDebug")
//class BodyDebug protected () extends phaser.Group {
//  def this(game: phaser.Game, body: phaser.physics.p2.Body, settings: js.Any) = this()
//  var body: phaser.physics.p2.Body = js.native
//  var canvas: phaser.Graphics = js.native
//  var ppu: Double = js.native
//  def updateSpriteTransform(): Unit = js.native
//  def draw(): Unit = js.native
//}
//
//@JSName("Phaser.Physics.P2.CollisionGroup")
//class CollisionGroup protected () extends js.Object {
//  def this(bitmask: Double) = this()
//  var mask: Double = js.native
//}
//
//@JSName("Phaser.Physics.P2.ContactMaterial")
//class ContactMaterial extends p2.ContactMaterial {
//}
//
//@JSName("Phaser.Physics.P2.DistanceConstraint")
//class DistanceConstraint protected () extends p2.DistanceConstraint {
//  def this(world: phaser.physics.P2, bodyA: phaser.physics.p2.Body, bodyB: phaser.physics.p2.Body, distance: Double, maxForce: Double) = this()
//  var game: phaser.Game = js.native
//  var world: phaser.physics.P2 = js.native
//}
//
//@JSName("Phaser.Physics.P2.FixtureList")
//class FixtureList protected () extends js.Object {
//  def this(list: js.Array[js.Any]) = this()
//  def flatten(array: js.Array[js.Any]): js.Array[js.Any] = js.native
//  def getFixtures(keys: String): js.Array[js.Any] = js.native
//  def getFixtureByKey(key: String): js.Array[js.Any] = js.native
//  def getGroup(groupID: Double): js.Array[js.Any] = js.native
//  def init(): Unit = js.native
//  def parse(): Unit = js.native
//  def setCategory(bit: Double, fictureKey: String): Unit = js.native
//  def setMask(bit: Double, fixtureKey: String): Unit = js.native
//  def setMaterial(material: js.Any, fixtureKey: String): Unit = js.native
//  def setSensor(value: Boolean, fixtureKey: String): Unit = js.native
//}
//
//@JSName("Phaser.Physics.P2.GearConstraint")
//class GearConstraint protected () extends p2.GearConstraint {
//  def this(world: phaser.physics.P2, bodyA: phaser.physics.p2.Body, bodyB: phaser.physics.p2.Body, angle: Double = ???, ratio: Double = ???) = this()
//  var game: phaser.Game = js.native
//  var world: phaser.physics.P2 = js.native
//}
//
//@JSName("Phaser.Physics.P2.InversePointProxy")
//class InversePointProxy protected () extends js.Object {
//  def this(world: phaser.physics.P2, destination: js.Any) = this()
//  var x: Double = js.native
//  var y: Double = js.native
//  var mx: Double = js.native
//  var my: Double = js.native
//}
//
//@JSName("Phaser.Physics.P2.LockConstraint")
//class LockConstraint protected () extends p2.LockConstraint {
//  def this(world: phaser.physics.P2, bodyA: phaser.physics.p2.Body, bodyB: phaser.physics.p2.Body, offset: js.Array[Double] = ???, angle: Double = ???, maxForce: Double = ???) = this()
//  var game: phaser.Game = js.native
//  var world: phaser.physics.P2 = js.native
//}
//
//@JSName("Phaser.Physics.P2.Material")
//class Material protected () extends p2.Material {
//  def this(name: String) = this()
//  var name: String = js.native
//}
//
//@JSName("Phaser.Physics.P2.PointProxy")
//class PointProxy protected () extends js.Object {
//  def this(world: phaser.physics.P2, destination: js.Any) = this()
//  var x: Double = js.native
//  var y: Double = js.native
//  var mx: Double = js.native
//  var my: Double = js.native
//}
//
//@JSName("Phaser.Physics.P2.PrismaticConstraint")
//class PrismaticConstraint protected () extends p2.PrismaticConstraint {
//  def this(world: phaser.physics.P2, bodyA: phaser.physics.p2.Body = ???, bodyB: phaser.physics.p2.Body = ???, lockRotation: Boolean = ???, anchorA: js.Array[Double] = ???, anchorB: js.Array[Double] = ???, axis: js.Array[Double] = ???, maxForce: Double = ???) = this()
//  var game: phaser.Game = js.native
//  var world: phaser.physics.P2 = js.native
//}
//
//@JSName("Phaser.Physics.P2.RevoluteConstraint")
//class RevoluteConstraint protected () extends p2.RevoluteConstraint {
//  def this(world: phaser.physics.P2, bodyA: phaser.physics.p2.Body, pivotA: js.Array[Double], bodyB: phaser.physics.p2.Body, pivotB: js.Array[Double], maxForce: Double = ???) = this()
//  var game: phaser.Game = js.native
//  var world: phaser.physics.P2 = js.native
//}
//
//@JSName("Phaser.Physics.P2.Spring")
//class Spring protected () extends js.Object {
//  def this(world: phaser.physics.P2, bodyA: phaser.physics.p2.Body, bodyB: phaser.physics.p2.Body, restLength: Double = ???, stiffness: Double = ???, damping: Double = ???, worldA: js.Array[Double] = ???, worldB: js.Array[Double] = ???, localA: js.Array[Double] = ???, localB: js.Array[Double] = ???) = this()
//  var data: p2.LinearSpring = js.native
//  var game: phaser.Game = js.native
//  var world: phaser.physics.P2 = js.native
//}
//
////}

}

@JSName("Phaser.Plugin")
class Plugin protected() extends IStateCycle {
  def this(game: phaser.Game, parent: PIXI.DisplayObject) = this()
  var active: Boolean = js.native
  var game: phaser.Game = js.native
  var hasPostRender: Boolean = js.native
  var hasPostUpdate: Boolean = js.native
  var hasPreUpdate: Boolean = js.native
  var hasRender: Boolean = js.native
  var hasUpdate: Boolean = js.native
  var parent: PIXI.DisplayObject = js.native
  var visible: Boolean = js.native
}

package plugin {

@JSName("Phaser.Plugin.AStar")
class AStar protected() extends phaser.Plugin {
  def this(parent: PIXI.DisplayObject) = this()
  var version: String = js.native
  def findPath(startPoint: phaser.Point, goalPoint: phaser.Point): phaser.plugin.aStar.AStarPath = js.native
  def isWalkable(x: Double, y: Double): Boolean = js.native
  def setAStarMap(map: phaser.Tilemap, layerName: String, tilesetName: String): phaser.plugin.AStar = js.native
}

@JSName("Phaser.Plugin.AStar")
object _AStar extends js.Object {
  var VERSION: String = js.native
  var COST_ORTHAGONAL: Double = js.native
  var COST_DIAGAONAL: Double = js.native
  var DISTANCE_MANHATTEN: String = js.native
  var DISTANCE_EUCLIDIAN: String = js.native
}

package aStar {

@JSName("Phaser.Plugin.AStar.AStarNode")
class AStarNode protected() extends js.Object {
  def this(x: Double, y: Double, isWalkable: Boolean) = this()
  var x: Double = js.native
  var y: Double = js.native
  var g: Double = js.native
  var h: Double = js.native
  var f: Double = js.native
  var parent: phaser.plugin.aStar.AStarNode = js.native
  var travelCost: Double = js.native
  var walkable: Boolean = js.native
}

@JSName("Phaser.Plugin.AStar.AStarPath")
class AStarPath protected() extends js.Object {
  def this(nodes: js.Array[phaser.plugin.aStar.AStarNode], start: phaser.plugin.aStar.AStarNode, goal: phaser.plugin.aStar.AStarNode) = this()
  var nodes: js.Array[phaser.plugin.aStar.AStarNode] = js.native
  var start: phaser.plugin.aStar.AStarNode = js.native
  var goal: phaser.plugin.aStar.AStarNode = js.native
  var visited: js.Array[phaser.plugin.aStar.AStarNode] = js.native
}

}

@JSName("Phaser.Plugin.ColorHarmony")
class ColorHarmony extends phaser.Plugin {
  def getAnalogousHarmony(color: Double, threshold: Double = ???): js.Dynamic = js.native
  def getComplementHarmony(color: Double): Double = js.native
  def getSplitComplementHarmony(color: Double, threshold: Double): js.Dynamic = js.native
  def getTriadicHarmony(color: Double): js.Dynamic = js.native
}

@JSName("Phaser.Plugin.CSS3Filters")
class CSS3Filters protected() extends phaser.Plugin {
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

@JSName("Phaser.Plugin.TilemapWalker")
class TilemapWalker protected() extends phaser.Plugin {
  def this(game: phaser.Game, map: phaser.Tilemap, layer: js.Any = ???, x: Double = ???, y: Double = ???) = this()
  var collides: Boolean = js.native
  var history: Boolean = js.native
  var facing: Double = js.native
  var map: phaser.Tilemap = js.native
  var location: phaser.Point = js.native
  var locationLayer: Double = js.native
  def checkTile(x: Double, y: Double): Boolean = js.native
  def getTileFromLocation(x: Double, y: Double): phaser.Tile = js.native
  def getTiles(width: Double, height: Double, center: Boolean = ???): js.Array[js.Any] = js.native
  def getTileBehind(distance: Double = ???): phaser.Tile = js.native
  def getTileBehindLeft(distance: Double = ???): phaser.Tile = js.native
  def getTileBehindRight(distance: Double = ???): phaser.Tile = js.native
  def getTileAhead(distance: Double = ???): phaser.Tile = js.native
  def getTileAheadLeft(distance: Double = ???): phaser.Tile = js.native
  def getTileAheadRight(distance: Double = ???): phaser.Tile = js.native
  def getTileLeft(distance: Double): phaser.Tile = js.native
  def getTileRight(distance: Double): phaser.Tile = js.native
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

@JSName("Phaser.Plugin.SamplePlugin")
class SamplePlugin protected() extends phaser.Plugin {
  def this(game: phaser.Game, parent: PIXI.DisplayObject) = this()
  def addSprite(sprite: phaser.Sprite): Unit = js.native
}

@JSName("Phaser.Plugin.VirtualJoystick")
class VirtualJoystick protected() extends phaser.Plugin {
  def this(game: phaser.Game, parent: js.Any) = this()
  var angle: Double = js.native
  var base: phaser.Sprite = js.native
  var baseBMD: phaser.BitmapData = js.native
  var baseCircle: phaser.Circle = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var distance: Double = js.native
  var force: Double = js.native
  var isDragging: Boolean = js.native
  var limit: Double = js.native
  var limitPoint: phaser.Point = js.native
  var location: phaser.Point = js.native
  var nub: phaser.Sprite = js.native
  var nubBMD: phaser.BitmapData = js.native
  var speed: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def init(x: Double, y: Double, diameter: Double = ???, limit: Double = ???): Unit = js.native
  def move(pointer: phaser.Pointer, x: Double, y: Double): Unit = js.native
  def setVelocity(sprite: phaser.Sprite, minSpeed: Double = ???, maxSpeed: Double = ???): phaser.Sprite = js.native
  def startDrag(): Unit = js.native
  def stopDrag(nub: phaser.Sprite, pointer: phaser.Pointer): Unit = js.native
}

@JSName("Phaser.Plugin.Webcam")
class Webcam protected() extends phaser.Plugin {
  def this(game: phaser.Game, parent: PIXI.DisplayObject) = this()
  var context: js.Any = js.native
  var stream: js.Any = js.native
  var video: HTMLVideoElement = js.native
  var connectCallback: js.Function1[js.Any, Unit] = js.native
  var errorCallback: js.Function1[js.Any, Unit] = js.native
  var grab: js.Function3[js.Any, Double, Double, Unit] = js.native
  def start(width: Double, height: Double, context: js.Any): Unit = js.native
  def stop(): Unit = js.native
}

@JSName("Phaser.Plugin.Juicy")
class Juicy protected() extends phaser.Plugin {
  def this(game: phaser.Game) = this()
  def createScreenFlash(color: String = ???): phaser.plugin.juicy.ScreenFlash = js.native
  def createTrail(length: Double = ???, color: Double = ???): phaser.plugin.juicy.Trail = js.native
  def overScale(`object`: phaser.Sprite, scale: Double = ???, initialScale: phaser.Point = ???): Unit = js.native
  def jelly(`object`: phaser.Sprite, strength: Double = ???, delay: Double = ???, initialScale: phaser.Point = ???): Unit = js.native
  def mouseStretch(`object`: phaser.Sprite, strength: Double = ???, initialScale: phaser.Point = ???): Unit = js.native
  def shake(duration: Double = ???, strength: Double = ???): Unit = js.native
}

package juicy {

@JSName("Phaser.Plugin.Juicy.Trail")
class Trail protected() extends js.Object {
  def this(game: phaser.Game, trailLength: Double = ???, color: Double = ???) = this()
  var target: phaser.Sprite = js.native
  var trailLength: Double = js.native
  var trailWidth: Double = js.native
  var trailScaling: Boolean = js.native
  var trailColor: Double = js.native
  def update(): Unit = js.native
  def addSegment(x: Double, y: Double): Unit = js.native
  def redrawSegments(offsetX: Double, offsetY: Double): Unit = js.native
}

@JSName("Phaser.Plugin.Juicy.ScreenFlash")
class ScreenFlash protected() extends js.Object {
  def this(game: phaser.Game, color: String = ???) = this()
  def flash(maxAlpha: Double = ???, duration: Double = ???): Unit = js.native
}

}

}

@JSName("Phaser.PluginManager")
class PluginManager protected() extends IStateCycle {
  def this(game: phaser.Game) = this()
  var game: phaser.Game = js.native
  var plugins: js.Array[phaser.Plugin] = js.native
  def add(plugin: js.Any, parameter: js.Any*): phaser.Plugin = js.native
  override def destroy(): Unit = js.native
  override def postRender(): Unit = js.native
  def postUpdate(): Unit = js.native
  override def preUpdate(): Unit = js.native
  def remove(plugin: phaser.Plugin): Unit = js.native
  def removeAll(): Unit = js.native
  override def render(): Unit = js.native
  override def update(): Unit = js.native
}

@JSName("Phaser.Point")
class Point protected() extends PIXI.Point {
  def this(x: Double = ???, y: Double = ???) = this()
  var `type`: Double = js.native
  def add(x: Double, y: Double): phaser.Point = js.native
  def angle(a: phaser.Point, asDegrees: Boolean = ???): Double = js.native
  def angleSq(a: phaser.Point): Double = js.native
  def clamp(min: Double, max: Double): phaser.Point = js.native
  def clampX(min: Double, max: Double): phaser.Point = js.native
  def clampY(min: Double, max: Double): phaser.Point = js.native
  def clone(output: phaser.Point = ???): phaser.Point = js.native
  def copyFrom(source: phaser.Point): phaser.Point = js.native
  def copyTo[T](dest: T): T = js.native
  def ceil(): phaser.Point = js.native
  def cross(a: phaser.Point): Double = js.native
  def divide(x: Double, y: Double): phaser.Point = js.native
  def distance(dest: phaser.Point, round: Boolean = ???): Double = js.native
  def dot(a: phaser.Point): Double = js.native
  def equals(a: phaser.Point): Boolean = js.native
  def floor(): phaser.Point = js.native
  def getMagnitude(): Double = js.native
  def getMagnitudeSq(): Double = js.native
  def invert(): phaser.Point = js.native
  def isZero(): Boolean = js.native
  def multiply(x: Double, y: Double): phaser.Point = js.native
  def normalize(): phaser.Point = js.native
  def normalRightHand(): phaser.Point = js.native
  def perp(): phaser.Point = js.native
  def rperp(): phaser.Point = js.native
  def rotate(x: Double, y: Double, angle: Double, asDegrees: Boolean = ???, distance: Double = ???): phaser.Point = js.native
  override def set(x: Double, y: Double = ???): phaser.Point = js.native
  def setMagnitude(magnitude: Double): phaser.Point = js.native
  def setTo(x: Double, y: Double = ???): phaser.Point = js.native
  def subtract(x: Double, y: Double): phaser.Point = js.native
  override def toString(): String = js.native
}

@JSName("Phaser.Point")
object Point extends js.Object {
  def add(a: phaser.Point, b: phaser.Point, out: phaser.Point = ???): phaser.Point = js.native
  def subtract(a: phaser.Point, b: phaser.Point, out: phaser.Point = ???): phaser.Point = js.native
  def multiply(a: phaser.Point, b: phaser.Point, out: phaser.Point = ???): phaser.Point = js.native
  def divide(a: phaser.Point, b: phaser.Point, out: phaser.Point = ???): phaser.Point = js.native
  def equals(a: phaser.Point, b: phaser.Point): Boolean = js.native
  def angle(a: phaser.Point, b: phaser.Point): Double = js.native
  def angleSq(a: phaser.Point, b: phaser.Point): Double = js.native
  def negative(a: phaser.Point, out: phaser.Point = ???): phaser.Point = js.native
  def multiplyAdd(a: phaser.Point, b: phaser.Point, scale: Double, out: phaser.Point = ???): phaser.Point = js.native
  def interpolate(a: phaser.Point, b: phaser.Point, alpha: Double, out: phaser.Point = ???): phaser.Point = js.native
  def parse(obj: js.Any, xProp: String = ???, yProp: String = ???): phaser.Point = js.native
  def perp(a: phaser.Point, out: phaser.Point = ???): phaser.Point = js.native
  def rperp(a: phaser.Point, out: phaser.Point = ???): phaser.Point = js.native
  def distance(a: js.Any, b: js.Any, round: Boolean = ???): Double = js.native
  def project(a: phaser.Point, b: phaser.Point, out: phaser.Point = ???): phaser.Point = js.native
  def projectUnit(a: phaser.Point, b: phaser.Point, out: phaser.Point = ???): phaser.Point = js.native
  def normalRightHand(a: phaser.Point, out: phaser.Point = ???): phaser.Point = js.native
  def normalize(a: phaser.Point, out: phaser.Point = ???): phaser.Point = js.native
  def rotate(a: phaser.Point, x: Double, y: Double, angle: Double, asDegrees: Boolean = ???, distance: Double = ???): phaser.Point = js.native
  def centroid(points: js.Array[phaser.Point], out: phaser.Point = ???): phaser.Point = js.native
}

@JSName("Phaser.Pointer")
class Pointer protected() extends js.Object {
  def this(game: phaser.Game, id: Double) = this()
  var active: Boolean = js.native
  var button: js.Any = js.native
  var circle: phaser.Circle = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var dirty: Boolean = js.native
  var duration: Double = js.native
  var exists: Boolean = js.native
  var game: phaser.Game = js.native
  var id: Double = js.native
  var identifier: Double = js.native
  var isDown: Boolean = js.native
  var isMouse: Boolean = js.native
  var isUp: Boolean = js.native
  var movementX: Double = js.native
  var movementY: Double = js.native
  var msSinceLastClick: Double = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var pointerId: Double = js.native
  var position: phaser.Point = js.native
  var positionDown: phaser.Point = js.native
  var positionUp: phaser.Point = js.native
  var previousTapTime: Double = js.native
  var rawMovementX: Double = js.native
  var rawMovementY: Double = js.native
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
  def resetMovement(): Unit = js.native
  def start(event: js.Any): Unit = js.native
  def stop(event: js.Any): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.Polygon")
class Polygon protected() extends js.Object {
  def this(points: js.Any) = this()
  var area: Double = js.native
  var points: js.Any = js.native
  var `type`: Double = js.native
  def clone(output: phaser.Polygon): phaser.Polygon = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def flatten(): phaser.Polygon = js.native
  def setTo(points: js.Any): Unit = js.native
  def toNumberArray(output: js.Array[Double] = ???): js.Array[Double] = js.native
}

@JSName("Phaser.QuadTree")
class QuadTree protected() extends js.Object {
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
  def populate(group: phaser.Group): Unit = js.native
  def populateHandler(sprite: phaser.Sprite): Unit = js.native
  def reset(x: Double, y: Double, width: Double, height: Double, maxObject: Double = ???, maxLevels: Double = ???, level: Double = ???): Unit = js.native
  def retrieve(source: js.Any): js.Array[js.Any] = js.native
  def split(): Unit = js.native
}

@JSName("Phaser.RandomDataGenerator")
class RandomDataGenerator protected() extends js.Object {
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

@JSName("Phaser.Rectangle")
class Rectangle protected() extends js.Object {
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  var bottom: Double = js.native
  var bottomRight: phaser.Point = js.native
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
  var topLeft: phaser.Point = js.native
  var topRight: phaser.Point = js.native
  var `type`: Double = js.native
  var volume: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def centerOn(x: Double, y: Double): phaser.Rectangle = js.native
  def clone(output: phaser.Rectangle): phaser.Rectangle = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def containsRect(b: phaser.Rectangle): Boolean = js.native
  def copyFrom(source: js.Any): phaser.Rectangle = js.native
  def copyTo(dest: js.Any): js.Dynamic = js.native
  def equals(b: phaser.Rectangle): Boolean = js.native
  def floor(): Unit = js.native
  def floorAll(): Unit = js.native
  def inflate(dx: Double, dy: Double): phaser.Rectangle = js.native
  def intersection(b: phaser.Rectangle, out: phaser.Rectangle): phaser.Rectangle = js.native
  def intersects(b: phaser.Rectangle, tolerance: Double): Boolean = js.native
  def intersectsRaw(left: Double, right: Double, top: Double, bottom: Double, tolerance: Double): Boolean = js.native
  def offset(dx: Double, dy: Double): phaser.Rectangle = js.native
  def offsetPoint(point: phaser.Point): phaser.Rectangle = js.native
  def setTo(x: Double, y: Double, width: Double, height: Double): phaser.Rectangle = js.native
  def scale(x: Double, y: Double = ???): phaser.Rectangle = js.native
  def size(output: phaser.Point = ???): phaser.Point = js.native
  override def toString(): String = js.native
  def union(b: phaser.Rectangle, out: phaser.Rectangle = ???): phaser.Rectangle = js.native
}

@JSName("Phaser.Rectangle")
object Rectangle extends js.Object {
  def aabb(points: js.Array[phaser.Point], out: phaser.Rectangle = ???): phaser.Rectangle = js.native
  def clone(a: phaser.Rectangle, output: phaser.Rectangle = ???): phaser.Rectangle = js.native
  def contains(a: phaser.Rectangle, x: Double, y: Double): Boolean = js.native
  def containsPoint(a: phaser.Rectangle, point: phaser.Point): Boolean = js.native
  def containsRaw(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double): Boolean = js.native
  def containsRect(a: phaser.Rectangle, b: phaser.Rectangle): Boolean = js.native
  def equals(a: phaser.Rectangle, b: phaser.Rectangle): Boolean = js.native
  def inflate(a: phaser.Rectangle, dx: Double, dy: Double): phaser.Rectangle = js.native
  def inflatePoint(a: phaser.Rectangle, point: phaser.Point): phaser.Rectangle = js.native
  def intersection(a: phaser.Rectangle, b: phaser.Rectangle, out: phaser.Rectangle = ???): phaser.Rectangle = js.native
  def intersects(a: phaser.Rectangle, b: phaser.Rectangle): Boolean = js.native
  def intersectsRaw(left: Double, right: Double, top: Double, bottom: Double, tolerance: Double): Boolean = js.native
  def size(a: phaser.Rectangle, output: phaser.Point = ???): phaser.Point = js.native
  def union(a: phaser.Rectangle, b: phaser.Rectangle, out: phaser.Rectangle = ???): phaser.Rectangle = js.native
}

@JSName("Phaser.RenderTexture")
class RenderTexture protected() extends PIXI.RenderTexture {
  def this(game: phaser.Game, width: Double = ???, height: Double = ???, key: String = ???, scaleMode: Double = ???, resolution: Double = ???) = this()
  var game: phaser.Game = js.native
  var key: String = js.native
  var matrix: PIXI.Matrix = js.native
  var `type`: Double = js.native
  //  def render(displayObject: PIXI.DisplayObject, position: phaser.Point, clear: Boolean = ???): Unit = js.native
  def renderXY(displayObject: PIXI.DisplayObject, x: Double, y: Double, clear: Boolean = ???): Unit = js.native
}

@JSName("Phaser.RequestAnimationFrame")
class RequestAnimationFrame protected() extends js.Object {
  def this(game: phaser.Game, forceSetTimeOut: Boolean = ???) = this()
  var forceSetTimeOut: Boolean = js.native
  var game: phaser.Game = js.native
  var isRunning: Boolean = js.native
  def isRAF(): Boolean = js.native
  def isSetTimeOut(): Boolean = js.native
  def start(): Boolean = js.native
  def stop(): Unit = js.native
  def updateRAF(rafTime: Double): Unit = js.native
  def updateSetTimeout(): Unit = js.native
}

@JSName("Phaser.RetroFont")
class RetroFont protected() extends phaser.RenderTexture {
  def this(game: phaser.Game, key: String, characterWidth: Double, characterHeight: Double, chars: String, charsPerRow: Double = ???, xSpacing: Double = ???, ySpacing: Double = ???, xOffset: Double = ???, yOffset: Double = ???) = this()
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
  var frameData: phaser.FrameData = js.native
  var multiLine: Boolean = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var smoothed: String = js.native
  var stamp: phaser.Image = js.native
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

@JSName("Phaser.Rope")
class Rope protected() extends PIXI.Rope {
  def this(game: phaser.Game, x: Double, y: Double, key: js.Any, frame: js.Any = ???, points: js.Array[phaser.Point] = ???) = this()
  var angle: Double = js.native
  var animations: AnimationManager = js.native
  var autoCull: Boolean = js.native
  var body: js.Any = js.native
  var cameraOffset: phaser.Point = js.native
  var checkWorldBounds: Boolean = js.native
  var destroyPhase: Boolean = js.native
  var exists: Boolean = js.native
  var events: phaser.Events = js.native
  var fixedToCamera: Boolean = js.native
  var frame: js.Any = js.native
  var frameName: String = js.native
  var fresh: Boolean = js.native
  var game: phaser.Game = js.native
  var input: phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var key: js.Any = js.native
  var name: String = js.native
  var previousPosition: phaser.Point = js.native
  var previousRotation: Double = js.native
  var renderOrderID: Double = js.native
  var segments: js.Array[phaser.Rectangle] = js.native
  var `type`: Double = js.native
  var updateAnimation: js.Function = js.native
  var world: phaser.Point = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def loadTexture(key: js.Any, frame: js.Any = ???): Unit = js.native
  def play(): Unit = js.native
  def preUpdate(): Unit = js.native
  def postUpdate(): Unit = js.native
  def reset(x: Double, y: Double): Unit = js.native
  def setFrame(frame: phaser.Frame): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.RoundedRectangle")
class RoundedRectangle extends PIXI.RoundedRectangle {
  var `type`: Double = js.native
}

@JSName("Phaser.Signal")
class Signal extends js.Object {
  var active: Boolean = js.native
  var boundDispatch: js.Function = js.native
  var memorize: Boolean = js.native
  def add(listener: js.Function, listenerContext: js.Any = ???, priority: Double = ???): phaser.SignalBinding = js.native
  def addOnce(listener: js.Function, listenerContext: js.Any = ???, priority: Double = ???): phaser.SignalBinding = js.native
  def dispatch(params: js.Any*): Unit = js.native
  def dispose(): Unit = js.native
  def forget(): Unit = js.native
  def getNumListeners(): Double = js.native
  def halt(): Unit = js.native
  def has(listener: js.Function, context: js.Any = ???): Boolean = js.native
  def remove(listener: js.Function, context: js.Any = ???): js.Function = js.native
  def removeAll(context: js.Any = ???): Unit = js.native
  def validateListener(listener: js.Function, fnName: String): Unit = js.native
}

@JSName("Phaser.SignalBinding")
class SignalBinding protected() extends js.Object {
  def this(signal: phaser.Signal, listener: js.Function, isOnce: Boolean, listenerContext: js.Any = ???, priority: Double = ???) = this()
  var active: Boolean = js.native
  var callCount: Double = js.native
  var context: js.Any = js.native
  var params: js.Array[js.Any] = js.native
  def execute(paramsArr: js.Array[js.Any] = ???): Unit = js.native
  def detach(): js.Function = js.native
  def isBound(): Boolean = js.native
  def isOnce(): Boolean = js.native
  def getListener(): js.Function = js.native
  def getSignal(): phaser.Signal = js.native
}

@JSName("Phaser.SinglePad")
class SinglePad protected() extends js.Object {
  def this(game: phaser.Game, padParent: js.Any) = this()
  var callbackContext: js.Any = js.native
  var connected: Boolean = js.native
  var deadZone: Double = js.native
  var game: phaser.Game = js.native
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
  def getButton(buttonCode: Double): phaser.GamepadButton = js.native
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

@JSName("Phaser.Sound")
class Sound protected() extends js.Object {
  def this(game: phaser.Game, key: String, volume: Double = ???, loop: Boolean = ???, connect: Boolean = ???) = this()
  var _sound: js.Dynamic with js.Object = js.native
  var autoplay: Boolean = js.native
  var allowMultiple: Boolean = js.native
  var context: js.Any = js.native
  var currentMarker: String = js.native
  var currentTime: Double = js.native
  def destroy(remove: Boolean = ???): Unit = js.native
  var duration: Double = js.native
  var durationMS: Double = js.native
  var externalNode: js.Any = js.native
  var fadeTween: phaser.Tween = js.native
  var game: phaser.Game = js.native
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
  var onDecoded: phaser.Signal = js.native
  var onEndedHandler: js.Function0[Unit] = js.native
  var onFadeComplete: phaser.Signal = js.native
  var onLoop: phaser.Signal = js.native
  var onMarkerComplete: phaser.Signal = js.native
  var onMute: phaser.Signal = js.native
  var onPause: phaser.Signal = js.native
  var onPlay: phaser.Signal = js.native
  var onResume: phaser.Signal = js.native
  var onStop: phaser.Signal = js.native
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
  def loopFull(volume: Double = ???): phaser.Sound = js.native
  def pause(): Unit = js.native
  def play(marker: String = ???, position: Double = ???, volume: Double = ???, loop: Boolean = ???, forceRestart: Boolean = ???): phaser.Sound = js.native
  def removeMarker(name: String): Unit = js.native
  def restart(marker: String, position: Double, volume: Double = ???, loop: Boolean = ???): Unit = js.native
  def resume(): Unit = js.native
  def soundHasUnlocked(key: String): Unit = js.native
  def stop(): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.SoundManager")
class SoundManager protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var channels: Double = js.native
  var connectToMaster: Boolean = js.native
  var context: js.Any = js.native
  var game: phaser.Game = js.native
  var mute: Boolean = js.native
  var noAudio: Boolean = js.native
  var onSoundDecode: phaser.Signal = js.native
  var touchLocked: Boolean = js.native
  var usingAudioTag: Boolean = js.native
  var usingWebAudio: Boolean = js.native
  var volume: Double = js.native
  def add(key: String, volume: Double = ???, loop: Boolean = ???, connect: Boolean = ???): phaser.Sound = js.native
  def addSprite(key: String): phaser.AudioSprite = js.native
  def boot(): Unit = js.native
  def decode(key: String, sound: phaser.Sound = ???): Unit = js.native
  def destroy(): Unit = js.native
  def pauseAll(): Unit = js.native
  def play(key: String, volume: Double = ???, loop: Boolean = ???): phaser.Sound = js.native
  def remove(sound: phaser.Sound): Boolean = js.native
  def removeByKey(key: String): Double = js.native
  def resumeAll(): Unit = js.native
  def setDecodedCallback(files: js.Any, callback: js.Function, callbackContext: js.Any): Unit = js.native
  def stopAll(): Unit = js.native
  def unlock(): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.Sprite")
class Sprite protected() extends PIXI.Sprite {
  def this(game: phaser.Game, x: Double, y: Double, key: js.Any = ???, frame: js.Any = ???) = this()
  var alive: Boolean = js.native
  var angle: Double = js.native
  var animations: phaser.AnimationManager = js.native
  var autoCull: Boolean = js.native
  var body: phaser.physics.arcade.Body = js.native
  var bottom: Double = js.native
  var cameraOffset: phaser.Point = js.native
  var checkWorldBounds: Boolean = js.native
  var cropRect: phaser.Rectangle = js.native
  var debug: Boolean = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var deltaZ: Double = js.native
  var destroyPhase: Boolean = js.native
  var events: phaser.Events = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var frame: js.Any = js.native
  var frameName: String = js.native
  var fresh: Boolean = js.native
  var game: phaser.Game = js.native
  var health: Double = js.native
  var inCamera: Boolean = js.native
  var input: phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var inWorld: Boolean = js.native
  var key: js.Any = js.native
  var left: Double = js.native
  var lifespan: Double = js.native
  var name: String = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var outOfBoundsKill: Boolean = js.native
  var previousPosition: phaser.Point = js.native
  var previousRotation: Double = js.native
  var physicsEnabled: Boolean = js.native
  var physicsType: Double = js.native
  var renderOrderID: Double = js.native
  var right: Double = js.native
  var scaleMin: phaser.Point = js.native
  var scaleMax: phaser.Point = js.native
  var smoothed: Boolean = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var world: phaser.Point = js.native
  var z: Double = js.native
  def bringToTop(): phaser.Sprite = js.native
  def crop(rect: phaser.Rectangle, copy: Boolean): Unit = js.native
  def damage(amount: Double): phaser.Sprite = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def drawPolygon(): Unit = js.native
  def kill(): phaser.Sprite = js.native
  def loadTexture(key: js.Any, frame: js.Any = ???, stopAnimation: Boolean = ???): Unit = js.native
  def overlap(displayObject: PIXI.DisplayObject): Boolean = js.native
  def play(name: String, frameRate: Double = ???, loop: Boolean = ???, killOnComplete: Boolean = ???): phaser.Animation = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def reset(x: Double, y: Double, health: Double = ???): phaser.Sprite = js.native
  def resetFrame(): Unit = js.native
  def revive(health: Double = ???): phaser.Sprite = js.native
  def setFrame(frame: phaser.Frame): Unit = js.native
  def setScaleMinMax(minX: Double = ???, minY: Double = ???, maxX: Double = ???, maxY: Double = ???): Unit = js.native
  def update(): Unit = js.native
  def updateCrop(): Unit = js.native
}

@JSName("Phaser.SpriteBatch")
class SpriteBatch protected() extends phaser.Group {
  def this(game: phaser.Game, parent: PIXI.DisplayObjectContainer, name: String = ???, addedToStage: Boolean = ???) = this()
}

@JSName("Phaser.Stage")
class Stage protected() extends PIXI.Stage {
  def this(game: phaser.Game) = this()
  var backgroundColor: js.Any = js.native
  var currentRenderOrderID: Double = js.native
  var disableVisibilityChange: Boolean = js.native
  var exists: Boolean = js.native
  var game: phaser.Game = js.native
  var name: String = js.native
  var smoothed: Boolean = js.native
  def boot(): Unit = js.native
  def checkVisibility(): Unit = js.native
  def destroy(): Unit = js.native
  def parseConfig(config: js.Any): Unit = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def setBackgroundColor(backgroundColor: js.Any): Unit = js.native
  def update(): Unit = js.native
  def visibilityChange(event: Event): Unit = js.native
}

trait ResizeCallback extends js.Object {
  def apply(scale: ScaleManager, parentBounds: Rectangle): js.Dynamic = js.native
}

@JSName("Phaser.ScaleManager")
class ScaleManager protected() extends js.Object {
  def this(game: phaser.Game, width: js.Any, height: js.Any) = this()
  var aspectRatio: Double = js.native
  var bounds: Rectangle = js.native
  var boundingParent: HTMLElement = js.native
  var compatibility: js.Any = js.native
  var currentScaleMode: Double = js.native
  var dom: phaser.DOM = js.native
  var enterIncorrectOrientation: Signal = js.native
  var enterFullScreen: Signal = js.native
  var enterLandscape: Signal = js.native
  var enterPortrait: Signal = js.native
  var event: js.Any = js.native
  var forceLandscape: Boolean = js.native
  var forcePortrait: Boolean = js.native
  var fullScreenScaleMode: Double = js.native
  var fullScreenFailed: Signal = js.native
  var fullScreenTarget: HTMLElement = js.native
  var game: phaser.Game = js.native
  var grid: phaser.FlexGrid = js.native
  var height: Double = js.native
  var incorrectOrientation: Boolean = js.native
  var isFullScreen: Boolean = js.native
  var isGameLandscape: Boolean = js.native
  var isGamePortrait: Boolean = js.native
  var isPortrait: Boolean = js.native
  var isLandscape: Boolean = js.native
  var leaveFullScreen: Signal = js.native
  var leaveIncorrectOrientation: Signal = js.native
  var margin: js.Any = js.native
  var maxIterations: Double = js.native
  var maxHeight: Double = js.native
  var maxWidth: Double = js.native
  var minHeight: Double = js.native
  var minWidth: Double = js.native
  var offset: Point = js.native
  var onFullScreenInit: phaser.Signal = js.native
  var onFullScreenChange: phaser.Signal = js.native
  var onFullScreenError: phaser.Signal = js.native
  var onOrientationChange: phaser.Signal = js.native
  var onSizeChange: Signal = js.native
  var orientation: Double = js.native
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
  def checkOrientationState(): Boolean = js.native
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
  def scaleSprite(sprite: Sprite, width: Double = ???, height: Double = ???, letterBox: Boolean = ???): Sprite = js.native
  def startFullScreen(antialias: Boolean = ???, allowTrampoline: Boolean = ???): Boolean = js.native
  def stopFullScreen(): Boolean = js.native
}

@JSName("Phaser.ScaleManager")
object ScaleManager extends js.Object {
  var EXACT_FIT: Double = js.native
  var NO_SCALE: Double = js.native
  var SHOW_ALL: Double = js.native
  var RESIZE: Double = js.native
  var USER_SCALE: Double = js.native
}

@JSName("Phaser.DOM")
class DOM extends js.Object {
}

@JSName("Phaser.DOM")
object DOM extends js.Object {
  var visualBounds: phaser.Rectangle = js.native
  var layoutBounds: phaser.Rectangle = js.native
  var documentBounds: phaser.Rectangle = js.native
  def calibrate(coords: js.Any, cushion: Double = ???): js.Dynamic = js.native
  def getAspectRatio(`object`: js.Any): Double = js.native
  def getScreenOrientation(primaryFallback: String = ???): String = js.native
  def getBounds(element: js.Any, cushion: Double = ???): js.Dynamic = js.native
  def getOffset(element: js.Any, point: Point = ???): Point = js.native
  def inLayoutViewport(element: js.Any, cushion: Double = ???): Boolean = js.native
}

@JSName("Phaser.State")
class State extends js.Object {
  var add: phaser.GameObjectFactory = js.native
  var cache: phaser.Cache = js.native
  var camera: phaser.Camera = js.native
  var game: phaser.Game = js.native
  var input: phaser.Input = js.native
  var key: String = js.native
  var load: phaser.Loader = js.native
  var make: phaser.GameObjectCreator = js.native
  var math: phaser.Math = js.native
  var particles: phaser.Particles = js.native
  var physics: phaser.Physics = js.native
  var rnd: phaser.RandomDataGenerator = js.native
  var scale: phaser.ScaleManager = js.native
  var sound: phaser.SoundManager = js.native
  var stage: phaser.Stage = js.native
  var time: phaser.Time = js.native
  var tweens: phaser.TweenManager = js.native
  var world: phaser.World = js.native
  def create(): Unit = js.native
  def init(): Unit = js.native
  def loadRender(): Unit = js.native
  def loadUpdate(): Unit = js.native
  def paused(): Unit = js.native
  def pauseUpdate(): Unit = js.native
  def preload(): Unit = js.native
  def render(): Unit = js.native
  def resize(): Unit = js.native
  def shutdown(): Unit = js.native
  def update(): Unit = js.native
}

trait IStateCycle extends js.Object {
  def preUpdate(): Unit = js.native
  def update(): Unit = js.native
  def render(): Unit = js.native
  def postRender(): Unit = js.native
  def destroy(): Unit = js.native
}

@JSName("Phaser.StateManager")
class StateManager protected() extends js.Object {
  def this(game: phaser.Game, pendingState: phaser.State = ???) = this()
  var current: String = js.native
  var game: phaser.Game = js.native
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
  def add(key: String, state: js.Any, autoStart: Boolean = ???): Unit = js.native
  def checkState(key: String): Boolean = js.native
  def clearCurrentState(): Unit = js.native
  def destroy(): Unit = js.native
  def getCurrentState(): phaser.State = js.native
  def link(key: String): Unit = js.native
  def loadComplete(): Unit = js.native
  def preRender(elapsedTime: Double): Unit = js.native
  def preUpdate(): Unit = js.native
  def render(): Unit = js.native
  def remove(key: String): Unit = js.native
  def resume(): Unit = js.native
  def restart(clearWorld: Boolean = ???, clearCache: Boolean = ???): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  //  def start(key: String, clearWorld: Boolean = ???, clearCache: Boolean = ???, args: js.Any*): Unit = js.native
  def update(): Unit = js.native
  def unlink(key: String): Unit = js.native
}

@JSName("Phaser.Text")
class Text protected() extends PIXI.Text {
  def this(game: phaser.Game, x: Double, y: Double, text: String, style: js.Any) = this()
  var align: String = js.native
  var angle: Double = js.native
  var cameraOffset: phaser.Point = js.native
  var colors: js.Array[String] = js.native
  var cssFont: String = js.native
  var destroyPhase: Boolean = js.native
  var events: phaser.Events = js.native
  var exists: Boolean = js.native
  var fill: js.Any = js.native
  var fixedToCamera: Boolean = js.native
  var font: String = js.native
  var fontSize: js.Any = js.native
  var fontWeight: String = js.native
  var fontStyle: String = js.native
  var fontVariant: String = js.native
  var game: phaser.Game = js.native
  var input: phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var lineSpacing: Double = js.native
  var name: String = js.native
  var padding: phaser.Point = js.native
  var physicsType: Double = js.native
  var previousPosition: phaser.Point = js.native
  var previousRotation: Double = js.native
  var renderOrderID: Double = js.native
  var shadowBlur: Double = js.native
  var shadowColor: String = js.native
  var shadowOffsetX: Double = js.native
  var shadowOffsetY: Double = js.native
  var stroke: String = js.native
  var strokeThickness: Double = js.native
  var text: String = js.native
  var `type`: Double = js.native
  var world: phaser.Point = js.native
  var wordWrap: Boolean = js.native
  var wordWrapWidth: Double = js.native
  var z: Double = js.native
  def addColor(color: String, position: Double): Unit = js.native
  def clearColors(): Unit = js.native
  def componentsToFont(components: js.Any): String = js.native
  def fontToComponents(font: String): js.Dynamic = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def setShadow(x: Double = ???, y: Double = ???, color: js.Any = ???, blur: Double = ???): Unit = js.native
  def setStyle(style: js.Any = ???): Unit = js.native
  def update(): Unit = js.native
  def updateFont(components: js.Any): Unit = js.native
  def updateTexture(): Unit = js.native
  def updateLine(text: String, x: Double = ???, y: Double = ???): Unit = js.native
}

@JSName("Phaser.Tile")
class Tile protected() extends js.Object {
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
  var game: phaser.Game = js.native
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
  def copy(tile: phaser.Tile): phaser.Tile = js.native
  def containsPoint(x: Double, y: Double): Boolean = js.native
  def destroy(): Unit = js.native
  def intersects(x: Double, y: Double, right: Double, bottom: Double): Boolean = js.native
  def isInterested(collides: Boolean, faces: Boolean): Boolean = js.native
  def resetCollision(): Unit = js.native
  def setCollision(left: Boolean, right: Boolean, up: Boolean, down: Boolean): Unit = js.native
  def setCollisionCallback(callback: js.Function, context: js.Any): Unit = js.native
}

@JSName("Phaser.Tilemap")
class Tilemap protected() extends js.Object {
  def this(game: phaser.Game, key: String = ???, tileWidth: Double = ???, tileHeight: Double = ???, width: Double = ???, height: Double = ???) = this()
  var collision: js.Array[js.Any] = js.native
  var collideIndexes: js.Array[js.Any] = js.native
  var currentLayer: Double = js.native
  var debugMap: js.Array[js.Any] = js.native
  var format: Double = js.native
  var game: phaser.Game = js.native
  var height: Double = js.native
  var heightInPixels: Double = js.native
  var images: js.Array[js.Any] = js.native
  var key: String = js.native
  var layer: js.Array[phaser.TilemapLayer] = js.native
  var layers: js.Array[js.Any] = js.native
  var objects: js.Array[js.Any] = js.native
  var orientation: String = js.native
  var properties: js.Any = js.native
  var tileHeight: Double = js.native
  var tiles: js.Array[phaser.Tile] = js.native
  var tilesets: js.Array[phaser.Tileset] = js.native
  var tileWidth: Double = js.native
  var version: Double = js.native
  var width: Double = js.native
  var widthInPixels: Double = js.native
  def addTilesetImage(tileset: String, key: String = ???, tileWidth: Double = ???, tileHeight: Double = ???, tileMargin: Double = ???, tileSpacing: Double = ???, gid: Double = ???): phaser.Tileset = js.native
  def calculateFaces(layer: Double): Unit = js.native
  def copy(x: Double, y: Double, width: Double, height: Double, layer: js.Any = ???): js.Array[phaser.Tile] = js.native
  def create(name: String, width: Double, height: Double, tileWidth: Double, tileHeight: Double, group: phaser.Group = ???): phaser.TilemapLayer = js.native
  def createBlankLayer(name: String, width: Double, height: Double, tileWidth: Double, tileHeight: Double, group: phaser.Group = ???): phaser.TilemapLayer = js.native
  def createFromObjects(name: String, gid: Double, key: String, frame: js.Any = ???, exists: Boolean = ???, autoCull: Boolean = ???, group: phaser.Group = ???, CustomClass: js.Any = ???, adjustY: Boolean = ???): Unit = js.native
  def createFromTiles(tiles: js.Any, replacements: js.Any, key: String, layer: js.Any = ???, group: phaser.Group = ???, properties: js.Any = ???): Double = js.native
  def createLayer(layer: js.Any, width: Double = ???, height: Double = ???, group: phaser.Group = ???): phaser.TilemapLayer = js.native
  def destroy(): Unit = js.native
  def dump(): Unit = js.native
  def fill(index: Double, x: Double, y: Double, width: Double, height: Double, layer: js.Any = ???): Unit = js.native
  def forEach(callback: js.Function, context: js.Any, x: Double, y: Number, width: Double, height: Double, layer: js.Any = ???): Unit = js.native
  def getImageIndex(name: String): Double = js.native
  def getIndex(location: js.Array[js.Any], name: String): Double = js.native
  def getLayer(layer: js.Any): Double = js.native
  def getLayerIndex(name: String): Double = js.native
  def getObjectIndex(name: String): Double = js.native
  def getTile(x: Double, y: Double, layer: js.Any = ???, nonNull: Boolean = ???): phaser.Tile = js.native
  def getTileAbove(layer: Double, x: Double, y: Double): phaser.Tile = js.native
  def getTileBelow(layer: Double, x: Double, y: Double): phaser.Tile = js.native
  def getTileLeft(layer: Double, x: Double, y: Double): phaser.Tile = js.native
  def getTileRight(layer: Double, x: Double, y: Double): phaser.Tile = js.native
  def getTilesetIndex(name: String): Double = js.native
  def getTileWorldXY(x: Double, y: Double, tileWidth: Double = ???, tileHeight: Double = ???, layer: js.Any = ???): phaser.Tile = js.native
  def hasTile(x: Double, y: Double, layer: phaser.TilemapLayer): Boolean = js.native
  def paste(x: Double, y: Double, tileblock: js.Array[phaser.Tile], layer: js.Any = ???): Unit = js.native
  def putTile(tile: js.Any, x: Double, y: Double, layer: js.Any = ???): phaser.Tile = js.native
  def putTileWorldXY(tile: js.Any, x: Double, y: Double, tileWidth: Double, tileHeight: Double, layer: js.Any = ???): Unit = js.native
  def random(x: Double, y: Double, width: Double, height: Double, layer: js.Any = ???): Unit = js.native
  def removeAllLayers(): Unit = js.native
  def removeTile(x: Double, y: Double, layer: js.Any = ???): phaser.Tile = js.native
  def removeTileWorldXY(x: Double, y: Double, tileWidth: Double, tileHeight: Double, layer: js.Any = ???): phaser.Tile = js.native
  def replace(source: Double, dest: Double, x: Double, y: Double, width: Double, height: Double, layer: js.Any = ???): Unit = js.native
  def searchTileIndex(index: Double, skip: Double = ???, reverse: Boolean = ???, layer: js.Any = ???): phaser.Tile = js.native
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
object Tilemap extends js.Object {
  var CSV: Double = js.native
  var TILED_JSON: Double = js.native
  var NORTH: Double = js.native
  var EAST: Double = js.native
  var SOUTH: Double = js.native
  var WEST: Double = js.native
}

@JSName("Phaser.TilemapLayer")
class TilemapLayer protected() extends phaser.Image {
  def this(game: phaser.Game, tilemap: phaser.Tilemap, index: Double, width: Double = ???, height: Double = ???) = this()
  var baseTexture: PIXI.BaseTexture = js.native
  var canvas: HTMLCanvasElement = js.native
  var collisionHeight: Double = js.native
  var collisionWidth: Double = js.native
  var context: CanvasRenderingContext2D = js.native
  var debugAlpha: Double = js.native
  var debugCallbackColor: String = js.native
  var debugColor: String = js.native
  var debugSettings: js.Any = js.native
  var dirty: Boolean = js.native
  var index: Double = js.native
  var layer: phaser.TilemapLayer = js.native
  var map: phaser.Tilemap = js.native
  var physicsType: Double = js.native
  var rayStepRate: Double = js.native
  var renderSettings: js.Any = js.native
  var scrollFactorX: Double = js.native
  var scrollFactorY: Double = js.native
  var scrollX: Double = js.native
  var scrollY: Double = js.native
  var textureFrame: phaser.Frame = js.native
  var tileColor: String = js.native
  var wrap: Boolean = js.native
  def getRayCastTiles(line: phaser.Line, stepRate: Double = ???, collides: Boolean = ???, interestingFace: Boolean = ???): js.Array[phaser.Tile] = js.native
  def getTiles(x: Double, y: Double, width: Double, height: Double, collides: Boolean = ???, interestingFace: Boolean = ???): js.Array[phaser.Tile] = js.native
  def getTileX(x: Double): Double = js.native
  def getTileXY(x: Double, y: Double, point: phaser.Point): phaser.Point = js.native
  def getTileY(y: Double): Double = js.native
  def render(): Unit = js.native
  def resizeWorld(): Unit = js.native
  def resetTilesetCache(): Unit = js.native
  def setScale(xScale: Double = ???, yScale: Double = ???): Unit = js.native
  def updateMax(): Unit = js.native
}

@JSName("Phaser.TilemapParser")
class TilemapParser extends js.Object {
}

@JSName("Phaser.TilemapParser")
object TilemapParser extends js.Object {
  def getEmptyData(tileWidth: Double = ???, tileHeight: Double = ???, width: Double = ???, height: Double = ???): js.Dynamic = js.native
  def parse(game: phaser.Game, key: String, tileWidth: Double = ???, tileHeight: Double = ???, width: Double = ???, height: Double = ???): js.Dynamic = js.native
  def parseCSV(key: String, data: String, tileWidth: Double = ???, tileHeight: Double = ???): js.Dynamic = js.native
  def parseJSON(json: js.Any): js.Dynamic = js.native
}

@JSName("Phaser.Tileset")
class Tileset protected() extends js.Object {
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

@JSName("Phaser.TileSprite")
class TileSprite protected() extends PIXI.TilingSprite {
  def this(game: phaser.Game, x: Double, y: Double, width: Double, height: Double, key: js.Any = ???, frame: js.Any = ???) = this()
  var alive: Boolean = js.native
  var angle: Double = js.native
  var animations: phaser.AnimationManager = js.native
  var autoCull: Boolean = js.native
  var body: js.Any = js.native
  var cameraOffset: phaser.Point = js.native
  var checkWorldBounds: Boolean = js.native
  var destroyPhase: Boolean = js.native
  var events: phaser.Events = js.native
  var exists: Boolean = js.native
  var fixedToCamera: Boolean = js.native
  var frame: js.Any = js.native
  var frameName: String = js.native
  var fresh: Boolean = js.native
  var game: phaser.Game = js.native
  var input: phaser.InputHandler = js.native
  var inputEnabled: Boolean = js.native
  var key: js.Any = js.native
  var name: String = js.native
  var previousPosition: phaser.Point = js.native
  var previousRoation: Double = js.native
  var renderOrderID: Double = js.native
  var `type`: Double = js.native
  var world: phaser.Point = js.native
  var z: Double = js.native
  def autoScroll(x: Double, y: Double): Unit = js.native
  def destroy(destroyChildren: Boolean = ???): Unit = js.native
  def loadTexture(key: js.Any, frame: js.Any): Unit = js.native
  def play(name: String, frameRate: Double = ???, loop: Boolean = ???, killOnComplete: Boolean = ???): phaser.Animation = js.native
  def postUpdate(): Unit = js.native
  def preUpdate(): Unit = js.native
  def reset(x: Double, y: Double): phaser.TileSprite = js.native
  def setFrame(frame: phaser.Frame): Unit = js.native
  def stopScroll(): Unit = js.native
  def update(): Unit = js.native
}

@JSName("Phaser.Time")
class Time protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var advancedTiming: Boolean = js.native
  var desiredFps: Double = js.native
  var elapsed: Double = js.native
  var events: phaser.Timer = js.native
  var elapsedMS: Double = js.native
  var fps: Double = js.native
  var fpsMax: Double = js.native
  var fpsMin: Double = js.native
  var frames: Double = js.native
  var game: phaser.Game = js.native
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
  def add(timer: phaser.Timer): phaser.Timer = js.native
  def boot(): Unit = js.native
  def create(autoDestroy: Boolean = ???): phaser.Timer = js.native
  def elapsedSecondsSince(since: Double): Double = js.native
  def elapsedSince(since: Double): Double = js.native
  def removeAll(): Unit = js.native
  def reset(): Unit = js.native
  def totalElapsedSeconds(): Double = js.native
  def update(time: Double): Unit = js.native
}

@JSName("Phaser.Timer")
class Timer protected() extends js.Object {
  def this(game: phaser.Game, autoDestroy: Boolean = ???) = this()
  var autoDestroy: Boolean = js.native
  var duration: Double = js.native
  var events: js.Array[phaser.TimerEvent] = js.native
  var expired: Boolean = js.native
  var game: phaser.Game = js.native
  var length: Double = js.native
  var ms: Double = js.native
  var next: Double = js.native
  var nextTick: Double = js.native
  var onComplete: phaser.Signal = js.native
  var running: Boolean = js.native
  var paused: Boolean = js.native
  var seconds: Double = js.native
  def add(delay: Double, callback: js.Function, callbackContext: js.Any, args: js.Any*): phaser.TimerEvent = js.native
  def clearPendingEvents(): Unit = js.native
  def destroy(): Unit = js.native
  def loop(delay: Double, callback: js.Function, callbackContext: js.Any, args: js.Any*): phaser.TimerEvent = js.native
  def order(): Unit = js.native
  def pause(): Unit = js.native
  def remove(event: phaser.TimerEvent): Boolean = js.native
  def removeAll(): Unit = js.native
  def repeat(delay: Double, repeatCount: Double, callback: js.Function, callbackContext: js.Any, args: js.Any*): phaser.TimerEvent = js.native
  def resume(): Unit = js.native
  def sortHandler(a: js.Any, b: js.Any): Double = js.native
  def start(startDelay: Double = ???): Unit = js.native
  def stop(clearEvents: Boolean = ???): Unit = js.native
  def update(time: Double): Boolean = js.native
}

@JSName("Phaser.Timer")
object Timer extends js.Object {
  var HALF: Double = js.native
  var MINUTE: Double = js.native
  var QUARTER: Double = js.native
  var SECOND: Double = js.native
}

@JSName("Phaser.TimerEvent")
class TimerEvent protected() extends js.Object {
  def this(timer: phaser.Timer, delay: Double, tick: Double, repeatCount: Double, loop: Boolean, callback: js.Function, callbackContext: js.Any, args: js.Any*) = this()
  var args: js.Array[js.Any] = js.native
  var callback: js.Function = js.native
  var callbackContext: js.Any = js.native
  var delay: Double = js.native
  var loop: Boolean = js.native
  var pendingDelete: Boolean = js.native
  var repeatCount: Double = js.native
  var tick: Double = js.native
  var timer: phaser.Timer = js.native
}

@JSName("Phaser.Touch")
class Touch protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var callbackContext: js.Any = js.native
  var disabled: Boolean = js.native
  var enabled: Boolean = js.native
  var event: js.Any = js.native
  var game: phaser.Game = js.native
  var preventDefault: Boolean = js.native
  var touchCancelCallback: js.Function = js.native
  var touchEndCallback: js.Function = js.native
  var touchEnterCallback: js.Function = js.native
  var touchLeaveCallback: js.Function = js.native
  var touchMoveCallback: js.Function = js.native
  var touchStartCallback: js.Function = js.native
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

@JSName("Phaser.Tween")
class Tween protected() extends js.Object {
  def this(target: js.Any, game: phaser.Game, manager: phaser.TweenManager) = this()
  var chainedTween: phaser.Tween = js.native
  var current: Double = js.native
  var game: phaser.Game = js.native
  var isRunning: Boolean = js.native
  var isPaused: Boolean = js.native
  var manager: phaser.TweenManager = js.native
  var onChildComplete: phaser.Signal = js.native
  var onComplete: phaser.Signal = js.native
  var onLoop: phaser.Signal = js.native
  var onRepeat: phaser.Signal = js.native
  var onStart: phaser.Signal = js.native
  var pendingDelete: Boolean = js.native
  var properties: js.Any = js.native
  var repeatCounter: Double = js.native
  var reverse: Boolean = js.native
  var target: js.Any = js.native
  var timeline: js.Array[phaser.TweenData] = js.native
  var timeScale: Double = js.native
  var totalDuration: Double = js.native
  def chain(args: js.Any*): phaser.Tween = js.native
  def delay(duration: Double, index: Double = ???): phaser.Tween = js.native
  def easing(ease: js.Function, index: Double = ???): phaser.Tween = js.native
  def from(properties: js.Any, duration: Double = ???, ease: js.Function = ???, autoStart: Boolean = ???, delay: Double = ???, repeat: Double = ???, yoyo: Boolean = ???): phaser.Tween = js.native
  def generateData(frameRate: Double = ???, data: js.Any = ???): js.Array[js.Any] = js.native
  def interpolation(interpolation: js.Function, context: js.Any = ???, index: Double = ???): phaser.Tween = js.native
  def loop(value: Boolean = ???): phaser.Tween = js.native
  def onUpdateCallback(callback: js.Function, callbackContext: js.Any): phaser.Tween = js.native
  def pause(): Unit = js.native
  def repeat(total: Double, repeatDelay: Double = ???, index: Double = ???): phaser.Tween = js.native
  def repeatDelay(duration: Double, index: Double = ???): phaser.Tween = js.native
  def repeatAll(total: Double = ???): phaser.Tween = js.native
  def resume(): Unit = js.native
  def start(index: Double = ???): phaser.Tween = js.native
  def stop(complete: Boolean = ???): phaser.Tween = js.native
  def to(properties: js.Any, duration: Double = ???, ease: js.Function = ???, autoStart: Boolean = ???, delay: Double = ???, repeat: Double = ???, yoyo: Boolean = ???): phaser.Tween = js.native
  def update(time: Double): Boolean = js.native
  def updateTweenData(property: String, value: js.Any, index: Double = ???): phaser.Tween = js.native
  def yoyo(enable: Boolean, yoyoDelay: Double = ???, index: Double = ???): phaser.Tween = js.native
  def yoyoDelay(duration: Double, index: Double = ???): phaser.Tween = js.native
}

@JSName("Phaser.TweenData")
class TweenData protected() extends js.Object {
  def this(parent: phaser.Tween) = this()
  var delay: Double = js.native
  var dt: Double = js.native
  var duration: Double = js.native
  var easingFunction: js.Function = js.native
  var game: phaser.Game = js.native
  var inReverse: Boolean = js.native
  var interpolate: Boolean = js.native
  var interpolateFunctionContext: phaser.Math = js.native
  var interpolationContext: phaser.Math = js.native
  var interpolationFunction: js.Function = js.native
  var isRunning: Boolean = js.native
  var isFrom: Boolean = js.native
  var parent: phaser.Tween = js.native
  var percent: Double = js.native
  var repeatCounter: Double = js.native
  var startTime: Double = js.native
  var value: Double = js.native
  var yoyo: Boolean = js.native
  var yoyoDelay: Double = js.native
  def from(properties: js.Any, duration: Double = ???, ease: js.Function = ???, delay: Double = ???, repeat: Double = ???, yoyo: Boolean = ???): phaser.TweenData = js.native
  def generateData(frameRate: Double = ???): js.Array[js.Any] = js.native
  def repeat(): Double = js.native
  def start(): phaser.TweenData = js.native
  def to(properties: js.Any, duration: Double = ???, ease: js.Function = ???, delay: Double = ???, repeat: Double = ???, yoyo: Boolean = ???): phaser.TweenData = js.native
  def update(): Double = js.native
}

@JSName("Phaser.TweenData")
object TweenData extends js.Object {
  var COMPLETE: Double = js.native
  var LOOPED: Double = js.native
  var PENDING: Double = js.native
  var RUNNING: Double = js.native
}

@JSName("Phaser.TweenManager")
class TweenManager protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var game: phaser.Game = js.native
  def add(tween: phaser.Tween): phaser.Tween = js.native
  def create(`object`: js.Any): phaser.Tween = js.native
  def getAll(): js.Array[phaser.Tween] = js.native
  def isTweening(`object`: js.Any): Boolean = js.native
  def remove(tween: phaser.Tween): phaser.Tween = js.native
  def removeAll(): Unit = js.native
  def removeFrom(obj: js.Any, children: Boolean = ???): Unit = js.native
  def resumeAll(): Unit = js.native
  def update(): Boolean = js.native
  def pauseAll(): Unit = js.native
}


package object Utils extends js.Object {
  def extend(deep: Boolean, target: js.Any): js.Dynamic = js.native
  def getProperty(obj: js.Any, prop: String): js.Dynamic = js.native
  def isPlainObject(`object`: js.Any): Boolean = js.native
  def mixin(from: js.Any, to: js.Any): js.Dynamic = js.native
  def pad(str: String, len: Double, pad: Double, dir: Double = ???): String = js.native
  def parseDimension(size: js.Any, dimension: Double): Double = js.native
  def randomChoice(choice1: js.Any, choice2: js.Any): js.Dynamic = js.native
  def rotateArray[T](array: js.Array[T], direction: js.Any): T = js.native
  def setProperty(obj: js.Any, prop: String, value: js.Any): js.Dynamic = js.native
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
  def transposeArray[T](array: js.Array[T]): js.Array[T] = js.native
}

package Utils {

@JSName("Phaser.Utils.Debug")
class Debug protected() extends js.Object {
  def this(game: phaser.Game) = this()
  var bmd: phaser.BitmapData = js.native
  var canvas: HTMLCanvasElement = js.native
  var columnWidth: Double = js.native
  var context: CanvasRenderingContext2D = js.native
  var currentAlpha: Double = js.native
  var currentX: Double = js.native
  var currentY: Double = js.native
  var dirty: Boolean = js.native
  var font: String = js.native
  var game: phaser.Game = js.native
  var lineHeight: Double = js.native
  var renderShadow: Boolean = js.native
  var sprite: phaser.Image = js.native
  def AStar(astar: phaser.plugin.AStar, x: Double, y: Double, showVisited: Boolean): Unit = js.native
  def boot(): Unit = js.native
  def body(sprite: phaser.Sprite, color: String = ???, filled: Boolean = ???): Unit = js.native
  def bodyInfo(sprite: phaser.Sprite, x: Double, y: Number, color: String = ???): Unit = js.native
  def box2dBody(body: phaser.Sprite, color: String = ???): Unit = js.native
  def box2dWorld(): Unit = js.native
  def cameraInfo(camera: phaser.Camera, x: Double, y: Double, color: String = ???): Unit = js.native
  def geom(`object`: js.Any, color: String = ???, fiiled: Boolean = ???, forceType: Double = ???): Unit = js.native
  def inputInfo(x: Double, y: Double, color: String = ???): Unit = js.native
  def lineInfo(line: phaser.Line, x: Double, y: Double, color: String = ???): Unit = js.native
  def key(key: phaser.Key, x: Double = ???, y: Double = ???, color: String = ???): Unit = js.native
  def line(): Unit = js.native
  def preUpdate(): Unit = js.native
  def pixel(x: Double, y: Double, color: String = ???, size: Double = ???): Unit = js.native
  def pointer(pointer: phaser.Pointer, hideIfUp: Boolean = ???, downColor: String = ???, upColor: String = ???, color: String = ???): Unit = js.native
  def quadTree(quadtree: phaser.QuadTree, color: String = ???): Unit = js.native
  def rectangle(`object`: phaser.Rectangle, color: String = ???, filled: Boolean = ???): Unit = js.native
  def reset(): Unit = js.native
  def ropeSegments(rope: phaser.Rope, color: Double = ???, filled: Boolean = ???): Unit = js.native
  def soundInfo(sound: phaser.Sound, x: Double, y: Double, color: String = ???): Unit = js.native
  def spriteBounds(sprite: js.Any, color: String = ???, filled: Boolean = ???): Unit = js.native
  def spriteCoords(sprite: js.Any, x: Double, y: Double, color: String = ???): Unit = js.native
  def spriteInfo(sprite: phaser.Sprite, x: Double, y: Double, color: String = ???): Unit = js.native
  def spriteInputInfo(sprite: phaser.Sprite, x: Double, y: Double, color: String = ???): Unit = js.native
  def start(x: Double = ???, y: Double = ???, color: String = ???, columnWidth: Double = ???): Unit = js.native
  def stop(): Unit = js.native
  def text(text: String, x: Double, y: Double, color: String = ???, font: String = ???): Unit = js.native
  def timer(timer: phaser.Timer, x: Double, y: Double, color: String = ???): Unit = js.native
}

}

@JSName("Phaser.World")
class World protected() extends phaser.Group {
  def this(game: phaser.Game) = this()
  var bounds: phaser.Rectangle = js.native
  var camera: phaser.Camera = js.native
  var centerX: Double = js.native
  var centerY: Double = js.native
  var isPaused: Boolean = js.native
  var randomX: Double = js.native
  var randomY: Double = js.native
  var stats: js.Any = js.native
  def boot(): Unit = js.native
  def getObjectsUnderPointer(pointer: phaser.Pointer, group: phaser.Group, callback: js.Function = ???, callbackContext: js.Any = ???): phaser.Sprite = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def setBounds(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def shutdown(): Unit = js.native
  def wrap(sprite: js.Any, padding: Double = ???, useBounds: Boolean = ???, horizontal: Boolean = ???, vertical: Boolean = ???): Unit = js.native
}

}


