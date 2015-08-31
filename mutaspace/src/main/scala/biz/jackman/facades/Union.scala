package biz.jackman.facades

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/23/15 8:16 PM
//////////////////////////////////////////////////////////////

object Union

object | {
  implicit def t1ToU2[T](x: T): T | Nothing = x.asInstanceOf[T | Nothing]
  implicit def t2ToU2[T](x: T): Nothing | T = x.asInstanceOf[Nothing | T]

  implicit def t1ToU3[T](x: T): T | Nothing | Nothing = x.asInstanceOf[T | Nothing | Nothing]
  implicit def t2ToU3[T](x: T): Nothing | T | Nothing = x.asInstanceOf[Nothing | T | Nothing]

  implicit def t1ToU4[T](x: T): T | Nothing | Nothing | Nothing = x.asInstanceOf[T | Nothing | Nothing | Nothing]
  implicit def t2ToU4[T](x: T): Nothing | T | Nothing | Nothing = x.asInstanceOf[Nothing | T | Nothing | Nothing]
}

@js.native
trait |[+T1, +T2] extends js.Object

class A
class B
class C
class D

@js.native
trait Foo extends js.Object {
  def ab(x: A | B): js.Any = js.native
  def abc(x: A | B | C): js.Any = js.native
  def abcd(x: A | B | C | D): js.Any = js.native
}

object Bar {

  val a = new A
  val b = new B
  val c = new C
  val d = new D

  val x: Foo = null

  x.ab(a) //Compiles
  x.ab(b) //This too

  //  x.stringOrInt(5.0) //Nope

  x.abc(a) //Ok
  x.abc(b) //Ok
  x.abc(c) //Ok

  x.abcd(a) //Ok
  x.abcd(b) //Ok
  x.abcd(c) //Ok
  x.abcd(d) //Ok
}
