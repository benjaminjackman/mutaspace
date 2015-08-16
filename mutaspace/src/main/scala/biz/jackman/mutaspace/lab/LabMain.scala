package biz.jackman.mutaspace
package lab

import scala.scalajs.js.annotation.JSExport


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/15/15 6:20 PM
//////////////////////////////////////////////////////////////

@JSExport
object LabMain {

  @JSExport
  def main() {
    import Scalatags._
    val el = <.div("Hello World!").render
    document.body.innerHTML = ""
    document.body.appendChild(el)
  }

}