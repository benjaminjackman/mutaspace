package biz.jackman.facades.phaser

import biz.jackman.mutaspace.samples.PhaserStarGameSample

import scala.scalajs.js
import scala.scalajs.js
import scala.scalajs.js
import scala.scalajs.js.Dynamic
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

  trait PhaserInit extends js.Object {
    var preload: js.Function0[Unit] = js.native
    var create: js.Function0[Unit] = js.native
    var update: js.Function0[Unit] = js.native
  }

  @JSName("Phaser.Game")
  class Game(width: Int, height: Int, a1: js.Any, a2: String, init: PhaserInit) extends js.Object {
    val input: Input = js.native
    val load: Loader = js.native
    val add: Adder = js.native
    val physics: Physics = js.native
    val world: World = js.native
  }

  trait Input extends js.Object {
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
    def spritesheet(name: String, url: String, x: Int, y: Int): Unit = js.native
    def image(name: String, url: String): Unit = js.native
  }

  trait Adder extends js.Object {
    def text(x: Int, y: Int, value: String, styling: js.Any): Text = js.native
    def group(): Group = js.native
    def sprite(x: Int, y: Int, name: String): Entity = js.native
  }

  trait Text extends js.Object {
    var text : String = js.native
  }

  trait Physical extends js.Object

  trait Group extends js.Object with Physical {
    def create(x: Int, y: Int, name: String): Entity = js.native
    var enableBody: Boolean = js.native
  }

  trait Entity extends js.Object with Physical {
    var frame: Int = js.native
    val animations: Animations = js.native
    val scale: Scale = js.native
    val body: ArcadePhysicsBody = js.native
    def kill(): Unit = js.native
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
    def overlap(a: Physical, b: Physical, value: js.Function2[Entity, Entity, Unit], a1: js.Any, a2: Any): Unit = js.native
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

}