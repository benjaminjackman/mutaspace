package biz.jackman.mutaspace
package reactive

//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 2/15/15 10:37 PM
//////////////////////////////////////////////////////////////

trait Subscriber[-A] {
  def onSubscribe(s: Subscription): Unit
  def onNext(a: Seq[A]): Unit
  def onError(t: Throwable): Unit
  def onComplete(): Unit
}
trait Publisher[+A] {
  def subscribe(s: Subscriber[A]): Unit
}

trait Subscription {
  def request(n: Long): Unit
  def cancel(): Unit
}

trait Processor[-T, +R] extends Subscriber[T] with Publisher[R]

