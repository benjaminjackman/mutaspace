package biz.jackman.mutaspace

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 2/15/15 1:01 PM
//////////////////////////////////////////////////////////////

trait MutaspaceExportsSjs {
  def newObj[A <: js.Object] : A = js.Object().asInstanceOf[A]
}