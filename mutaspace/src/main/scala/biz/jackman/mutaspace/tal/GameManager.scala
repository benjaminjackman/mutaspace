package biz.jackman.mutaspace
package tal

import biz.jackman.facades.phaser.Game
import biz.jackman.mutaspace.gutil.RandomManager
import org.scalajs.dom
import org.scalajs.dom.raw.HTMLIFrameElement


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 7/28/15 12:36 AM
//////////////////////////////////////////////////////////////

trait GameManager {
  def game: Game
  def randy: RandomManager
  def scoreManager: ScoreManager

  def die() {
    game.destroy()
    val el = document.getElementById("content")
    el.innerHTML = """<iframe id="ytplayer" type="text/html" width="640" height="390" src="https://www.youtube.com/embed/9cFHAJ5asMk?autoplay=1&start=15" frameborder="0"/>"""
  }

  def win() {
    game.destroy()
    val el = document.getElementById("content")
    el.setAttribute("style", "font-size:50px;background-color:red;color:white")
    el.innerHTML = "PLAYING WITH GUNS IS ALWAYS<br> " +
      "A BAD IDEA. EVEN WHEN <br>" +
      "ZOMBIE DOGS ARE TRYING TO EAT <br>" +
      "YOUR TURKEY. <br>" +
      "JUST GET SOME CHINESE FOOD. <br>" +
      "IT'S ACTUALLY QUITE GOOD. <br>" +
      "ESPECIALLY THE DUCK."

    dom.setTimeout(() => {
      val tag = dom.document.createElement("iframe").asInstanceOf[HTMLIFrameElement]
      el.innerHTML = """
      <iframe width="560" height="315" src="https://www.youtube.com/embed/mrAwb9ptu9U?autoplay=1&start=14" frameborder="0" allowfullscreen></iframe>
      """
    }, 10000)
    //dom.location.assign("http://img.costumecraze.com/images/vendors/forum/65703-Deluxe-Plush-Turkey-Costume-large.jpg")
  }
}