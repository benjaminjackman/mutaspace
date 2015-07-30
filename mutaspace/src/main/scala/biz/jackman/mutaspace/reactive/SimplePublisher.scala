package biz.jackman.mutaspace.reactive

import scala.annotation.tailrec
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 2/15/15 10:57 PM
//////////////////////////////////////////////////////////////

class SimplePublisher[A] extends Publisher[A] {
  var subs = Set.empty[SimpleSubscription[A]]
  override def subscribe(s: Subscriber[A]): Unit = {
    val ss = new SimpleSubscription[A](s)(subs -= _)
    subs += ss
    s.onSubscribe(ss.Sub)
  }
  def add(e: A) {
    subs.foreach(_ add e)
  }
}

class SimpleSubscription[A](s: Subscriber[A])(onCancel: (SimpleSubscription[A]) => Unit) {outer =>
  val q    = mutable.Queue.empty[A]
  //When rem is < 0 it is assumed it has overflowed, in which case the other side is assumed to be accepting
  //an unlimited amount of data
  var rem  = 0L
  var dead = false
  def add(a: A*): Unit = if (!dead) {
    q.enqueue(a: _*)
    distribute()
  }
  def errored(t: Throwable) = {
    s.onError(t)
  }
  def completed() = {
    s.onComplete()
  }

  object Sub extends Subscription {
    override def request(n: Long): Unit = if (!dead) {
      if (n <= 0) throw new IllegalArgumentException(s"request(n) must be > 0, n was $n")
      require(n > 0)
      if (rem >= 0) {rem += n}
      distribute()
    }
    override def cancel(): Unit = {
      val justDied = !dead
      dead = true
      if (justDied) {
        onCancel(outer)
      }
    }
  }


  private def distribute() {
    if (rem != 0 && q.nonEmpty) {
      val buf = new ArrayBuffer[A]
      @tailrec
      def loop() {
        if (rem >= 0) {rem -= 1}
        buf += q.dequeue()
        if (rem != 0 && q.nonEmpty) {
          loop()
        }
      }
      loop()
      s.onNext(buf.toVector)
    }
  }


}