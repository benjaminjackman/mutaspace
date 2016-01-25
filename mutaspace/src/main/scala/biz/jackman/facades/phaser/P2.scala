package biz.jackman.facades

import scala.scalajs.js
import scala.scalajs.js.|
import js.annotation._
import org.scalajs.dom.raw._
import scala.scalajs.js.typedarray._

package phaser {

@JSName("p2.p2")
@js.native
object p2 extends js.Object {

@JSName("p2.AABB")
@js.native
class AABB protected () extends js.Object {
  def this(options: js.Any = ???) = this()
  def setFromPoints(points: js.Array[js.Array[Double]], position: js.Array[Double], angle: Double, skinSize: Double): Unit = js.native
  def copy(aabb: AABB): Unit = js.native
  def extend(aabb: AABB): Unit = js.native
  def overlaps(aabb: AABB): Boolean = js.native
}

@JSName("p2.Broadphase")
@js.native
class Broadphase protected () extends js.Object {
  def this(`type`: Double) = this()
  def setWorld(world: World): Unit = js.native
  def getCollisionPairs(world: World): js.Array[Body] = js.native
  def boundingVolumeCheck(bodyA: Body, bodyB: Body): Boolean = js.native
}

@JSName("p2.Broadphase")
@js.native
object Broadphase extends js.Object {
  var AABB: Double = js.native
  var BOUNDING_CIRCLE: Double = js.native
  var NAIVE: Double = js.native
  var SAP: Double = js.native
  def boundingRadiusCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  def aabbCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  def canCollide(bodyA: Body, bodyB: Body): Boolean = js.native
}

@JSName("p2.GridBroadphase")
@js.native
class GridBroadphase protected () extends Broadphase {
  def this(options: js.Any = ???) = this()
}

@JSName("p2.NativeBroadphase")
@js.native
class NativeBroadphase extends Broadphase {
}

@JSName("p2.Narrowphase")
@js.native
class Narrowphase extends js.Object {
  def collidedLastStep(bodyA: Body, bodyB: Body): Boolean = js.native
  def reset(): Unit = js.native
  def createContactEquation(bodyA: Body, bodyB: Body, shapeA: Shape, shapeB: Shape): ContactEquation = js.native
  def createFrictionFromContact(c: ContactEquation): FrictionEquation = js.native
}

@JSName("p2.SAPBroadphase")
@js.native
class SAPBroadphase extends Broadphase {
}

@JSName("p2.Constraint")
@js.native
class Constraint protected () extends js.Object {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  def update(): Unit = js.native
  def setStiffness(stiffness: Double): Unit = js.native
  def setRelaxation(relaxation: Double): Unit = js.native
}

@JSName("p2.Constraint")
@js.native
object Constraint extends js.Object {
  var DISTANCE: Double = js.native
  var GEAR: Double = js.native
  var LOCK: Double = js.native
  var PRISMATIC: Double = js.native
  var REVOLUTE: Double = js.native
}

@JSName("p2.DistanceConstraint")
@js.native
class DistanceConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  def setMaxForce(f: Double): Unit = js.native
  def getMaxForce(): Double = js.native
}

@JSName("p2.GearConstraint")
@js.native
class GearConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  def setMaxTorque(torque: Double): Unit = js.native
  def getMaxTorque(): Double = js.native
}

@JSName("p2.LockConstraint")
@js.native
class LockConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  def setMaxForce(force: Double): Unit = js.native
  def getMaxForce(): Double = js.native
}

@JSName("p2.PrismaticConstraint")
@js.native
class PrismaticConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  def enableMotor(): Unit = js.native
  def disableMotor(): Unit = js.native
  def setLimits(lower: Double, upper: Double): Unit = js.native
}

@JSName("p2.RevoluteConstraint")
@js.native
class RevoluteConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  def enableMotor(): Unit = js.native
  def disableMotor(): Unit = js.native
  def motorIsEnabled(): Boolean = js.native
  def setLimits(lower: Double, upper: Double): Unit = js.native
  def setMotorSpeed(speed: Double): Unit = js.native
  def getMotorSpeed(): Double = js.native
}

@JSName("p2.AngleLockEquation")
@js.native
class AngleLockEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body, options: js.Any = ???) = this()
  def setRatio(ratio: Double): Double = js.native
  def setMaxTorque(torque: Double): Double = js.native
}

@JSName("p2.ContactEquation")
@js.native
class ContactEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body) = this()
}

@JSName("p2.Equation")
@js.native
class Equation protected () extends js.Object {
  def this(bodyA: Body, bodyB: Body, minForce: Double = ???, maxForce: Double = ???) = this()
  def gmult(G: js.Array[Double], vi: js.Array[Double], wi: js.Array[Double], vj: js.Array[Double], wj: js.Array[Double]): Double = js.native
  def computeB(a: Double, b: Double, h: Double): Double = js.native
  def computeGq(): Double = js.native
  def computeGW(): Double = js.native
  def computeGWlambda(): Double = js.native
  def computeGiMf(): Double = js.native
  def computeGiMGt(): Double = js.native
  def addToWlambda(deltalambda: Double): Double = js.native
  def computeInvC(eps: Double): Double = js.native
}

@JSName("p2.Equation")
@js.native
object Equation extends js.Object {
  var DEFAULT_STIFFNESS: Double = js.native
  var DEFAULT_RELAXATION: Double = js.native
}

@JSName("p2.FrictionEquation")
@js.native
class FrictionEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body, slipForce: Double) = this()
  def setSlipForce(slipForce: Double): Double = js.native
  def getSlipForce(): Double = js.native
}

@JSName("p2.RotationalLockEquation")
@js.native
class RotationalLockEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body, options: js.Any = ???) = this()
}

@JSName("p2.RotationalVelocityEquation")
@js.native
class RotationalVelocityEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body) = this()
}

@JSName("p2.EventEmitter")
@js.native
class EventEmitter extends js.Object {
  def on(`type`: String, listener: js.Function, context: js.Any): EventEmitter = js.native
  def has(`type`: String, listener: js.Function): Boolean = js.native
  def off(`type`: String, listener: js.Function): EventEmitter = js.native
  def emit(event: js.Any): EventEmitter = js.native
}

@JSName("p2.ContactMaterialOptions")
@js.native
class ContactMaterialOptions extends js.Object {
}

@JSName("p2.ContactMaterial")
@js.native
class ContactMaterial protected () extends js.Object {
  def this(materialA: Material, materialB: Material, options: ContactMaterialOptions = ???) = this()
}

@JSName("p2.ContactMaterial")
@js.native
object ContactMaterial extends js.Object {
  var idCounter: Double = js.native
}

@JSName("p2.Material")
@js.native
class Material protected () extends js.Object {
  def this(id: Double) = this()
}

@JSName("p2.Material")
@js.native
object Material extends js.Object {
  var idCounter: Double = js.native
}

@JSName("p2.vec2")
@js.native
class vec2 extends js.Object {
}

@JSName("p2.vec2")
@js.native
object vec2 extends js.Object {
  def crossLength(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def crossVZ(out: js.Array[Double], vec: js.Array[Double], zcomp: Double): Double = js.native
  def crossZV(out: js.Array[Double], zcomp: Double, vec: js.Array[Double]): Double = js.native
  def rotate(out: js.Array[Double], a: js.Array[Double], angle: Double): Unit = js.native
  def rotate90cw(out: js.Array[Double], a: js.Array[Double]): Double = js.native
  def centroid(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], c: js.Array[Double]): js.Array[Double] = js.native
  def create(): js.Array[Double] = js.native
  def clone(a: js.Array[Double]): js.Array[Double] = js.native
  def fromValues(x: Double, y: Double): js.Array[Double] = js.native
  def copy(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def set(out: js.Array[Double], x: Double, y: Double): js.Array[Double] = js.native
  def toLocalFrame(out: js.Array[Double], worldPoint: js.Array[Double], framePosition: js.Array[Double], frameAngle: Double): Unit = js.native
  def toGlobalFrame(out: js.Array[Double], localPoint: js.Array[Double], framePosition: js.Array[Double], frameAngle: Double): Unit = js.native
  def add(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def subtract(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def sub(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def multiply(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def mul(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def divide(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def div(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def scale(out: js.Array[Double], a: js.Array[Double], b: Double): js.Array[Double] = js.native
  def distance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def dist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def squaredDistance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def sqrDist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def length(a: js.Array[Double]): Double = js.native
  def len(a: js.Array[Double]): Double = js.native
  def squaredLength(a: js.Array[Double]): Double = js.native
  def sqrLen(a: js.Array[Double]): Double = js.native
  def negate(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def normalize(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def dot(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def str(a: js.Array[Double]): String = js.native
}

@JSName("p2.BodyOptions")
@js.native
class BodyOptions extends js.Object {
}

@JSName("p2.Body")
@js.native
class Body protected () extends EventEmitter {
  def this(options: BodyOptions = ???) = this()
  def updateSolveMassProperties(): Unit = js.native
  def setDensity(density: Double): Unit = js.native
  def getArea(): Double = js.native
  def getAABB(): AABB = js.native
  def updateAABB(): Unit = js.native
  def updateBoundingRadius(): Unit = js.native
  def addShape(shape: Shape, offset: js.Array[Double] = ???, angle: Double = ???): Unit = js.native
  def removeShape(shape: Shape): Boolean = js.native
  def updateMassProperties(): Unit = js.native
  def applyForce(force: js.Array[Double], worldPoint: js.Array[Double]): Unit = js.native
  def toLocalFrame(out: js.Array[Double], worldPoint: js.Array[Double]): Unit = js.native
  def toWorldFrame(out: js.Array[Double], localPoint: js.Array[Double]): Unit = js.native
  def fromPolygon(path: js.Array[js.Array[Double]], options: js.Any = ???): Boolean = js.native
  def adjustCenterOfMass(): Unit = js.native
  def setZeroForce(): Unit = js.native
  def resetConstraintVelocity(): Unit = js.native
  def applyDamping(dy: Double): Unit = js.native
  def wakeUp(): Unit = js.native
  def sleep(): Unit = js.native
  def sleepTick(time: Double, dontSleep: Boolean, dt: Double): Unit = js.native
  def getVelocityFromPosition(story: js.Array[Double], dt: Double): js.Array[Double] = js.native
  def getAngularVelocityFromPosition(timeStep: Double): Double = js.native
  def overlaps(body: Body): Boolean = js.native
}

@JSName("p2.Body")
@js.native
object Body extends js.Object {
  var DYNAMIC: Double = js.native
  var STATIC: Double = js.native
  var KINEMATIC: Double = js.native
  var AWAKE: Double = js.native
  var SLEEPY: Double = js.native
  var SLEEPING: Double = js.native
}

@JSName("p2.Spring")
@js.native
class Spring protected () extends js.Object {
  def this(bodyA: Body, bodyB: Body, options: js.Any = ???) = this()
  def applyForce(): Unit = js.native
}

@JSName("p2.LinearSpring")
@js.native
class LinearSpring extends Spring {
  def setWorldAnchorA(worldAnchorA: js.Array[Double]): Unit = js.native
  def setWorldAnchorB(worldAnchorB: js.Array[Double]): Unit = js.native
  def getWorldAnchorA(result: js.Array[Double]): js.Array[Double] = js.native
  def getWorldAnchorB(result: js.Array[Double]): js.Array[Double] = js.native
}

@JSName("p2.RotationalSpring")
@js.native
class RotationalSpring protected () extends Spring {
  def this(bodyA: Body, bodyB: Body, options: js.Any = ???) = this()
}

@JSName("p2.Capsule")
@js.native
class Capsule protected () extends Shape {
  def this(length: Double = ???, radius: Double = ???) = this()
}

@JSName("p2.Circle")
@js.native
class Circle protected () extends Shape {
  def this(radius: Double) = this()
}

@JSName("p2.Convex")
@js.native
class Convex protected () extends Shape {
  def this(vertices: js.Array[js.Array[Double]], axes: js.Array[Double]) = this()
  def projectOntoLocalAxis(localAxis: js.Array[Double], result: js.Array[Double]): Unit = js.native
  def projectOntoWorldAxis(localAxis: js.Array[Double], shapeOffset: js.Array[Double], shapeAngle: Double, result: js.Array[Double]): Unit = js.native
  def updateCenterOfMass(): Unit = js.native
}

@JSName("p2.Convex")
@js.native
object Convex extends js.Object {
  def triangleArea(a: js.Array[Double], b: js.Array[Double], c: js.Array[Double]): Double = js.native
}

@JSName("p2.Heightfield")
@js.native
class Heightfield protected () extends Shape {
  def this(data: js.Array[Double], options: js.Any = ???) = this()
}

@JSName("p2.Shape")
@js.native
class Shape protected () extends js.Object {
  def this(`type`: Double) = this()
  def computeMomentOfInertia(mass: Double): Double = js.native
  def updateBoundingRadius(): Double = js.native
  def updateArea(): Unit = js.native
  def computeAABB(out: AABB, position: js.Array[Double], angle: Double): Unit = js.native
}

@JSName("p2.Shape")
@js.native
object Shape extends js.Object {
  var idCounter: Double = js.native
  var CIRCLE: Double = js.native
  var PARTICLE: Double = js.native
  var PLANE: Double = js.native
  var CONVEX: Double = js.native
  var LINE: Double = js.native
  var RECTANGLE: Double = js.native
  var CAPSULE: Double = js.native
  var HEIGHTFIELD: Double = js.native
}

@JSName("p2.Line")
@js.native
class Line protected () extends Shape {
  def this(length: Double = ???) = this()
}

@JSName("p2.Particle")
@js.native
class Particle extends Shape {
}

@JSName("p2.Plane")
@js.native
class Plane extends Shape {
}

@JSName("p2.Rectangle")
@js.native
class Rectangle protected () extends Shape {
  def this(width: Double = ???, height: Double = ???) = this()
}

@JSName("p2.Rectangle")
@js.native
object Rectangle extends js.Object {
  def sameDimensions(a: Rectangle, b: Rectangle): Boolean = js.native
}

@JSName("p2.Solver")
@js.native
class Solver protected () extends EventEmitter {
  def this(options: js.Any = ???, `type`: Double = ???) = this()
  def solve(dy: Double, world: World): Unit = js.native
  def solveIsland(dy: Double, island: Island): Unit = js.native
  def sortEquations(): Unit = js.native
  def addEquation(eq: Equation): Unit = js.native
  def addEquations(eqs: js.Array[Equation]): Unit = js.native
  def removeEquation(eq: Equation): Unit = js.native
  def removeAllEquations(): Unit = js.native
}

@JSName("p2.Solver")
@js.native
object Solver extends js.Object {
  var GS: Double = js.native
  var ISLAND: Double = js.native
}

@JSName("p2.GSSolver")
@js.native
class GSSolver protected () extends Solver {
  def this(options: js.Any = ???) = this()
}

@JSName("p2.OverlapKeeper")
@js.native
class OverlapKeeper protected () extends js.Object {
  def this(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Shape) = this()
  def tick(): Unit = js.native
  def setOverlapping(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Body): Unit = js.native
  def bodiesAreOverlapping(bodyA: Body, bodyB: Body): Boolean = js.native
  def set(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Shape): Unit = js.native
}

@JSName("p2.TupleDictionary")
@js.native
class TupleDictionary extends js.Object {
  def getKey(id1: Double, id2: Double): String = js.native
  def getByKey(key: Double): Double = js.native
  def get(i: Double, j: Double): Double = js.native
  def set(i: Double, j: Double, value: Double): Double = js.native
  def reset(): Unit = js.native
  def copy(dict: TupleDictionary): Unit = js.native
}

@JSName("p2.Utils")
@js.native
class Utils extends js.Object {
}

@JSName("p2.Utils")
@js.native
object Utils extends js.Object {
  def appendArray[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = js.native
  def chanceRoll(chance: Double): Boolean = js.native
  def defaults(options: js.Any, defaults: js.Any): js.Dynamic = js.native
  def extend(a: js.Any, b: js.Any): Unit = js.native
  def randomChoice(choice1: js.Any, choice2: js.Any): js.Dynamic = js.native
  def rotateArray(matrix: js.Array[js.Any], direction: js.Any): js.Array[js.Any] = js.native
  def splice[T](array: js.Array[T], index: Double, howMany: Double): Unit = js.native
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
  def transposeArray[T](array: js.Array[T]): js.Array[T] = js.native
}

@JSName("p2.Island")
@js.native
class Island extends js.Object {
  def reset(): Unit = js.native
  def getBodies(result: js.Any): js.Array[Body] = js.native
  def wantsToSleep(): Boolean = js.native
  def sleep(): Boolean = js.native
}

@JSName("p2.IslandManager")
@js.native
class IslandManager extends Solver {
  def visit(node: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): Unit = js.native
  def bfs(root: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): Unit = js.native
  def split(world: World): js.Array[Island] = js.native
}

@JSName("p2.IslandManager")
@js.native
object IslandManager extends js.Object {
  def getUnvisitedNode(nodes: js.Array[Node]): IslandNode = js.native
}

@JSName("p2.IslandNode")
@js.native
class IslandNode protected () extends js.Object {
  def this(body: Body) = this()
  def reset(): Unit = js.native
}

@JSName("p2.World")
@js.native
class World protected () extends EventEmitter {
  def this(options: js.Any = ???) = this()
  def addConstraint(c: Constraint): Unit = js.native
  def addContactMaterial(contactMaterial: ContactMaterial): Unit = js.native
  def removeContactMaterial(cm: ContactMaterial): Unit = js.native
  def getContactMaterial(materialA: Material, materialB: Material): ContactMaterial = js.native
  def removeConstraint(c: Constraint): Unit = js.native
  def step(dy: Double, timeSinceLastCalled: Double = ???, maxSubSteps: Double = ???): Unit = js.native
  def runNarrowphase(np: Narrowphase, bi: Body, si: Shape, xi: js.Array[js.Any], ai: Double, bj: Body, sj: Shape, xj: js.Array[js.Any], aj: Double, cm: Double, glen: Double): Unit = js.native
  def addSpring(s: Spring): Unit = js.native
  def removeSpring(s: Spring): Unit = js.native
  def addBody(body: Body): Unit = js.native
  def removeBody(body: Body): Unit = js.native
  def getBodyByID(id: Double): Body = js.native
  def disableBodyCollision(bodyA: Body, bodyB: Body): Unit = js.native
  def enableBodyCollision(bodyA: Body, bodyB: Body): Unit = js.native
  def clear(): Unit = js.native
  def hitTest(worldPoint: js.Array[Double], bodies: js.Array[Body], precision: Double): js.Array[Body] = js.native
  def setGlobalEquationParameters(parameters: js.Any): Unit = js.native
  def setGlobalStiffness(stiffness: Double): Unit = js.native
  def setGlobalRelaxation(relaxation: Double): Unit = js.native
}

@JSName("p2.World")
@js.native
object World extends js.Object {
  var NO_SLEEPING: Double = js.native
  var BODY_SLEEPING: Double = js.native
  var ISLAND_SLEEPING: Double = js.native
  def integrateBody(body: Body, dy: Double): Unit = js.native
}
}

}
