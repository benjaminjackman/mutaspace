package biz.jackman.mutaspace
package gutil

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/20/15 8:12 PM
//////////////////////////////////////////////////////////////

object YamlHelp {

  //See: https://github.com/nodeca/js-yaml
  def load(s : String) : js.Array[js.Any] = {
    val arr = new js.Array[js.Any]()
    def addItem(x : js.Any) {
      arr.push(x)
    }
    global.jsyaml.safeLoadAll(s, addItem _ : js.Function, OBJ(schema=global.jsyaml.FAILSAFE_SCHEMA))
    arr
  }

}