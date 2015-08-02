package biz.jackman.mutaspace
package tal

import biz.jackman.mutaspace.gutil.ResourceSet

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/1/15 9:40 PM
//////////////////////////////////////////////////////////////

class AudioManager(gm: GameManager) {

  //gm.game.sound.play(Resources.whimper, gm.randy.getDblIE(0.05, 0.2))
  //TODO DREAM Make the sounds be harmonic be locking the pitches to semitones corresponing to steps in the major or minor (or whatever scale)
  //TODO FOR Each mob pack assingn a root note and for each hit to the MOB in that group play upwards on the scale
  //Skip steps for larger chunks of damage,
  //Death will always be the last step in the scale
  //      val semitone = 1.0/12
  def play(clip: ResourceSet#Audio, vol: Double = 1.0, rate: Double = 1.0) {
    val sound = gm.game.sound.add(clip.key)
    if (rate != 1.0) {
      sound.onPlay.addOnce({ (x: js.Any) =>
        //Increases the pitch of the sound
        sound._sound.playbackRate.value = rate
      }: js.Function)
    }
    sound.play()
  }
  def playRandom(clip: ResourceSet#Audio, vol: Double = 1.0) = play(clip, vol = vol, rate = gm.randy.getDblIE(0.8, 1.2))

}