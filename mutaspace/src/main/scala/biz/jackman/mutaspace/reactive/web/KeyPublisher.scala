package biz.jackman.mutaspace
package reactive.web

import biz.jackman.mutaspace.reactive.Publisher
import biz.jackman.mutaspace.reactive.SimplePublisher
import biz.jackman.mutaspace.reactive.Subscriber
import cgta.cenum.CEnum
import org.scalajs.dom
import org.scalajs.dom.EventTarget
import org.scalajs.dom.raw.KeyboardEvent


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
  private lazy val keyup     = et.addEventListener[KeyboardEvent]("keyup", onKey(KeyEventTypes.Keyup) _)
  private lazy val keydown   = et.addEventListener[KeyboardEvent]("keydown", onKey(KeyEventTypes.Keydown) _)
  private      val publisher = new SimplePublisher[KeyEvent]

  private def onKey(tpe: KeyEventTypes.KeyEventType)(e: KeyboardEvent) {
    publisher.add(KeyEvent(tpe, e))
  }

  override def subscribe(s: Subscriber[KeyEvent]): Unit = {
    keyup
    keydown
    publisher.subscribe(s)
  }
}

