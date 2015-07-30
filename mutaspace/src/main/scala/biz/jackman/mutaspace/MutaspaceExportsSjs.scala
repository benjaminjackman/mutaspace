package biz.jackman.mutaspace

import scala.scalajs.js
import scalatags.JsDom
import scalatags.jsdom


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 2/15/15 1:01 PM
//////////////////////////////////////////////////////////////

trait MutaspaceExportsSjs {
  def newObj[A <: js.Object] : A = js.Object().asInstanceOf[A]
  object Scalatags extends JsDom.Cap with JsDom.Aggregate  with scalatags.LowPriorityImplicits {
    object < extends JsDom.Cap with jsdom.Tags with jsdom.Tags2 with JsDom.Aggregate
    object ^ extends JsDom.Cap with JsDom.Styles with JsDom.Attrs
  }

}