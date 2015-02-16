package biz.jackman.mutaspace
package reactive

import cgta.cenum.CEnum
import org.scalajs.dom
import org.scalajs.dom.EventTarget
import org.scalajs.dom.raw.KeyboardEvent

import scala.annotation.tailrec
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 2/15/15 10:39 PM
//////////////////////////////////////////////////////////////

object KeyEventTypes extends CEnum {
  final type EET = KeyEventType
  sealed trait KeyEventType extends EnumElement
  case object Keydown extends KeyEventType
  case object Keyup extends KeyEventType
  final override val elements = CEnum.getElements(this)
}

case class KeyEvent(tpe: KeyEventTypes.KeyEventType, event: KeyboardEvent)

object KeyPublisher {
  lazy val window = new KeyPublisher(dom.window)
}

class KeyPublisher(et: EventTarget) extends Publisher[KeyEvent] {
  private lazy val keyup   = et.addEventListener[KeyboardEvent]("keyup", onKey(KeyEventTypes.Keyup) _)
  private lazy val keydown = et.addEventListener[KeyboardEvent]("keydown", onKey(KeyEventTypes.Keydown) _)

  private def onKey(tpe: KeyEventTypes.KeyEventType)(e: KeyboardEvent) {
    publisher.add(KeyEvent(tpe, e))
  }
  private val publisher = new SimplePublisher[KeyEvent]
  override def subscribe(s: Subscriber[KeyEvent]): Unit = {
    keyup
    keydown
    publisher.subscribe(s)
  }
}

class SimplePublisher[A] extends Publisher[A] {
  var subs = Set.empty[SimpleSubscription[A]]
  override def subscribe(s: Subscriber[A]): Unit = {
    val ss = new SimpleSubscription[A](s)(subs -= _)
    subs += ss
    s.onSubscribe(ss)
  }
  def add(e: A) {
    subs.foreach(_ add e)
  }
}

class SimpleSubscription[A](s: Subscriber[A])(onCancel: (SimpleSubscription[A]) => Unit) extends Subscription {
  val q        = mutable.Queue.empty[A]
  var rem      = 0L
  var canceled = false
  def add(a: A): Unit = if (!canceled) {
    q.enqueue(a)
    distribute()
  }

  override def request(n: Long): Unit = if (!canceled) {
    rem += n
    distribute()
  }

  private def distribute() {
    if (rem > 0 && q.nonEmpty) {
      val buf = new ArrayBuffer[A]
      @tailrec
      def loop() {
        rem -= 1
        buf += q.dequeue()
        if (rem > 0 && q.nonEmpty) {
          loop()
        }
      }
      loop()
      s.onNext(buf.toVector)
    }
  }

  override def cancel(): Unit = {
    canceled = true
    onCancel(this)
  }
}