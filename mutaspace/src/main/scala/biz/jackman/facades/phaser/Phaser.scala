package biz.jackman.facades.phaser


import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.annotation.JSName


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 7/13/15 8:51 PM
//////////////////////////////////////////////////////////////


object Phaser {


  @JSName("Phaser.AUTO")
  object AUTO extends js.Object


  object Easing {
    @JSName("Phaser.Easing.Linear")
    object Linear extends js.Object {
      val None: js.Any = js.native

    }

  }


  trait PhaserCallbacks {
    @JSExport def preload(): Unit
    @JSExport def create(): Unit
    @JSExport def update(): Unit
  }

  @JSName("Phaser.Game")
  class Game(width: Int, height: Int, a1: js.Any, a2: String, init: PhaserCallbacks) extends js.Object {
    val input: Input = js.native
    val load: Loader = js.native
    val add: Adder = js.native
    val physics: Physics = js.native
    val world: World = js.native
    val sound: Sound = js.native
  }

  trait Pointer extends js.Object {
    def x: Double = js.native
    def y: Double = js.native

  }

  trait Signal extends js.Object {
    def add(f: js.Function1[Pointer, Unit]): Unit = js.native
  }

  trait Input extends js.Object {
    val onDown: Signal = js.native

    val keyboard: KeyboardInput = js.native
  }

  trait KeyboardInput extends js.Object {
    def createCursorKeys(): CursorKeys = js.native
  }

  trait CursorKeys extends js.Object {
    val left: Key = js.native
    val right: Key = js.native
    val up: Key = js.native
    val down: Key = js.native
  }

  trait Key extends js.Object {
    val isDown: Boolean = js.native
  }

  trait Loader extends js.Object {
    def audio(s: String, s1: String): Unit = js.native
    def spritesheet(name: String, url: String, x: Int, y: Int): Unit = js.native
    def image(name: String, url: String): Unit = js.native
  }

  trait Tween extends js.Object {
    def to(properties: Any, duration: Double, ease: Any, autoStart: Boolean): Unit = js.native
  }

  trait Adder extends js.Object {
    def tween(entity: Sprite): Tween = js.native

    def text(x: Double, y: Double, value: String, styling: js.Any): Text = js.native
    def group(): Group = js.native
    def sprite(x: Int, y: Int, name: String): Sprite = js.native
  }

  trait Text extends js.Object {
    var text: String = js.native
  }

  trait Physical extends js.Object

  trait Group extends js.Object with Physical {
    def create(x: Int, y: Int, name: String): Sprite = js.native
    var enableBody: Boolean = js.native
  }

  trait Sprite extends js.Object with Physical {
    var rotation: Double = js.native

    var frame: Int = js.native
    val animations: Animations = js.native
    val scale: Scale = js.native
    val body: ArcadePhysicsBody = js.native
    def kill(): Unit = js.native
    var x: Double = js.native
    var y: Double = js.native
  }

  trait Animations extends js.Object {
    def add(name: String, frames: js.Array[Int], fps: Int, loop: Boolean): Unit = js.native
    def play(name: String): Unit = js.native
    def stop(): Unit = js.native
  }

  trait Scale extends js.Object {
    def setTo(x: Double, y: Double): Unit = js.native
  }

  trait DirectionalBoolean extends js.Object {
    val down: Boolean = js.native
  }

  trait ArcadePhysicsBody extends js.Object {
    val touching: DirectionalBoolean = js.native

    var immovable: Boolean = js.native
    var collideWorldBounds: Boolean = js.native
    val bounce: Vec2d = js.native
    val gravity: Vec2d = js.native
    val velocity: Vec2d = js.native
  }

  trait Vec2d extends js.Object {
    var x: Double = js.native
    var y: Double = js.native
  }

  object Physics {
    trait Style extends js.Object
    @JSName("Phaser.Physics.ARCADE")
    object ARCADE extends Style
  }

  trait ArcadePhysics extends js.Object {
    def angleToPointer(entity: Sprite, pointer: Pointer): Double = js.native
    def distanceToPointer(entity: Sprite, pointer: Pointer): Double = js.native

    def overlap(a: Physical, b: Physical, value: js.Function2[Sprite, Sprite, Unit], a1: js.Any, a2: Any): Unit = js.native
    def collide(a: Physical, b: Physical): Unit = js.native
    def enable(a: Physical): Unit = js.native
  }
  trait Physics extends js.Object {


    val arcade: ArcadePhysics = js.native

    def startSystem(style: Physics.Style): Unit = js.native
  }


  trait World extends js.Object {
    val height: Int = js.native
  }

  trait Sound extends js.Object {
    def play(s: String): Unit = js.native
  }


}