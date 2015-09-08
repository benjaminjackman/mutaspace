package biz.jackman.mutaspace
package tal.skills.primary

import biz.jackman.facades.phaser
import biz.jackman.facades.phaser.Game
import biz.jackman.facades.phaser.Particle
import biz.jackman.facades.phaser.Polygon
import biz.jackman.facades.phaser.Sprite
import biz.jackman.mutaspace.tal.GameManager
import biz.jackman.mutaspace.tal.mob.CircleMobFactory
import biz.jackman.mutaspace.tal.skills.Skill

import scala.scalajs.js


//////////////////////////////////////////////////////////////
// Copyright (c) 2015 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 8/25/15 5:07 PM
//////////////////////////////////////////////////////////////

object MagicMissileSkill {

}

class MagicMissileSkill(implicit gm : GameManager) extends Skill {
  override def currentSkillUpdate(): Unit = {}
  override def execute(): Unit = {
    val r = 10
    val center = gm.playerManager.Player.sprite

    val sprite = gm.projectileManager.getSprite()
    sprite.reset(center.x, center.y)

    gm.game.physics.arcade.enable(sprite)
    sprite.body.width = r
    sprite.body.height = r

    val graphics = gm.game.add.graphics(0,0)
//    graphics.beginFill(0x9370DB)
//    graphics.drawCircle(0,0,r)
    val c = 5
    graphics.beginFill(0x9370DB)
    graphics.drawPolygon(new Polygon(js.Array(2 * c, 0, -c, c, -c, -c)))

    sprite.addChild(graphics)



    val texture= locally {
      val particle = gm.game.make.graphics(0, 0)

      val tint = locally {
        val c = phaser.Color.HSLtoRGB(gm.randy.getDblIE(0, 1), gm.randy.getDblIE(.4, .9), gm.randy.getDblIE(.4, .9))
        phaser.Color.getColor(c.r.asInstanceOf[Double], c.g.asInstanceOf[Double], c.b.asInstanceOf[Double])
      }

      def draw(color : Double) {
        particle.clear()
        particle.beginFill(color, .5)
        particle.drawCircle(0, 0, gm.randy.getDblIE(1,8))
      }
      draw(tint)
      particle.generateTexture()
    }

    //Add a particle emitter
    //See also http://www.html5gamedevs.com/topic/5683-add-bitmapdata-to-cache-as-image/
    //http://www.html5gamedevs.com/topic/5549-anchor-emitter-to-sprite/
    val emitter = gm.game.add.emitter(-10,0,10)
    emitter.particleSendToBack = true
    emitter.particleClass = (game : Game, x : Double, y : Double) => {
      val p = new Particle(game, x, y)
      p.setTexture(texture)
      p
    }
    emitter.makeParticles()

    sprite.addChild(emitter)
    emitter.start(explode = false, 500, 50)

    sprite.outOfBoundsKill = true
    sprite.checkWorldBounds = true



    val rot = phaser.Math.degToRad(gm.randy.getDblIE(-30,30)) + gm.playerManager.angleToPointer
    sprite.rotation = rot
    gm.game.physics.arcade.velocityFromRotation(rot, 400, sprite.body.velocity)
    emitter.minParticleSpeed.set(-100, 50)
    emitter.maxParticleSpeed.set(-200, -50)


    sprite.events.onKilled.addOnce(() => {graphics.destroy(); emitter.destroy()})
  }
}