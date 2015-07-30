package biz.jackman.mutaspace.reactive


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 2/17/15 6:47 AM
//////////////////////////////////////////////////////////////

object ReactiveHelp {
  def mapSubscriber[A, B](s: Subscriber[A], f: Seq[B] => Seq[A]): Subscriber[B] = new Subscriber[B] {
    override def onError(t: Throwable): Unit = s.onError(t)
    override def onSubscribe(ss: Subscription): Unit = s.onSubscribe(ss)
    override def onComplete(): Unit = s.onComplete()
    override def onNext(xs: Seq[B]): Unit = s.onNext(f(xs))
  }

  class SubscriberExtensions[A](val s: Subscriber[A]) extends AnyVal {
    def map[B](f: Seq[B] => Seq[A]) = mapSubscriber(s, f)
  }
  trait Implicits {
    implicit def addSubscriberExtensions[A](s: Subscriber[A]): SubscriberExtensions[A] = new SubscriberExtensions[A](s)
  }
  object Implicits extends Implicits


}