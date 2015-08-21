package biz.jackman.mutaspace
package lab

import biz.jackman.mutaspace.gutil.YamlHelp
import cgta.oscala.util.debugging.PRINT
import org.scalajs.dom.ext.Ajax

import scala.scalajs.js
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
    document.getElementById("content").appendChild(el)
    Ajax.get("assets/mob/cardinal/cardinal.yml").foreach { r =>
      PRINT | r.responseText
      PRINT| YamlHelp.load(r.responseText)
    }

    PRINT| YamlHelp.load("greeting: hello\nname: world\n---\nhi:mom")
  }
}