
import scala.scalajs.js
import js.annotation._
import org.scalajs.dom.raw._

package importedjs {

package p2 {


@JSName("p2.AABB")
class AABB protected () extends js.Object {
  def this(options: js.Any = ???) = this()
  def setFromPoints(points: js.Array[js.Array[Double]], position: js.Array[Double], angle: Double, skinSize: Double): Unit = js.native
  def copy(aabb: AABB): Unit = js.native
  def extend(aabb: AABB): Unit = js.native
  def overlaps(aabb: AABB): Boolean = js.native
}

@JSName("p2.Broadphase")
class Broadphase protected () extends js.Object {
  def this(`type`: Double) = this()
  var `type`: Double = js.native
  var result: js.Array[Body] = js.native
  var world: World = js.native
  var boundingVolumeType: Double = js.native
  def setWorld(world: World): Unit = js.native
  def getCollisionPairs(world: World): js.Array[Body] = js.native
  def boundingVolumeCheck(bodyA: Body, bodyB: Body): Boolean = js.native
}

@JSName("p2.Broadphase")
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
class GridBroadphase protected () extends Broadphase {
  def this(options: js.Any = ???) = this()
  var xmin: Double = js.native
  var xmax: Double = js.native
  var ymin: Double = js.native
  var ymax: Double = js.native
  var nx: Double = js.native
  var ny: Double = js.native
  var binsizeX: Double = js.native
  var binsizeY: Double = js.native
}

@JSName("p2.NativeBroadphase")
class NativeBroadphase extends Broadphase {
}

@JSName("p2.Narrowphase")
class Narrowphase extends js.Object {
  var contactEquations: js.Array[ContactEquation] = js.native
  var frictionEquations: js.Array[FrictionEquation] = js.native
  var enableFriction: Boolean = js.native
  var slipForce: Double = js.native
  var frictionCoefficient: Double = js.native
  var surfaceVelocity: Double = js.native
  var reuseObjects: Boolean = js.native
  var resuableContactEquations: js.Array[js.Any] = js.native
  var reusableFrictionEquations: js.Array[js.Any] = js.native
  var restitution: Double = js.native
  var stiffness: Double = js.native
  var relaxation: Double = js.native
  var frictionStiffness: Double = js.native
  var frictionRelaxation: Double = js.native
  var enableFrictionReduction: Boolean = js.native
  var contactSkinSize: Double = js.native
  def collidedLastStep(bodyA: Body, bodyB: Body): Boolean = js.native
  def reset(): Unit = js.native
  def createContactEquation(bodyA: Body, bodyB: Body, shapeA: Shape, shapeB: Shape): ContactEquation = js.native
  def createFrictionFromContact(c: ContactEquation): FrictionEquation = js.native
}

@JSName("p2.SAPBroadphase")
class SAPBroadphase extends Broadphase {
  var axisList: js.Array[Body] = js.native
  var axisIndex: Double = js.native
}

@JSName("p2.Constraint")
class Constraint protected () extends js.Object {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  var `type`: Double = js.native
  var equeations: js.Array[Equation] = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var collideConnected: Boolean = js.native
  def update(): Unit = js.native
  def setStiffness(stiffness: Double): Unit = js.native
  def setRelaxation(relaxation: Double): Unit = js.native
}

@JSName("p2.Constraint")
object Constraint extends js.Object {
  var DISTANCE: Double = js.native
  var GEAR: Double = js.native
  var LOCK: Double = js.native
  var PRISMATIC: Double = js.native
  var REVOLUTE: Double = js.native
}

@JSName("p2.DistanceConstraint")
class DistanceConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  var localAnchorA: js.Array[Double] = js.native
  var localAnchorB: js.Array[Double] = js.native
  var distance: Double = js.native
  var maxForce: Double = js.native
  var upperLimitEnabled: Boolean = js.native
  var upperLimit: Double = js.native
  var lowerLimitEnabled: Boolean = js.native
  var lowerLimit: Double = js.native
  var position: Double = js.native
  def setMaxForce(f: Double): Unit = js.native
  def getMaxForce(): Double = js.native
}

@JSName("p2.GearConstraint")
class GearConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  var ratio: Double = js.native
  var angle: Double = js.native
  def setMaxTorque(torque: Double): Unit = js.native
  def getMaxTorque(): Double = js.native
}

@JSName("p2.LockConstraint")
class LockConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  def setMaxForce(force: Double): Unit = js.native
  def getMaxForce(): Double = js.native
}

@JSName("p2.PrismaticConstraint")
class PrismaticConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  var localAnchorA: js.Array[Double] = js.native
  var localAnchorB: js.Array[Double] = js.native
  var localAxisA: js.Array[Double] = js.native
  var position: Double = js.native
  var velocity: Double = js.native
  var lowerLimitEnabled: Boolean = js.native
  var upperLimitEnabled: Boolean = js.native
  var lowerLimit: Double = js.native
  var upperLimit: Double = js.native
  var upperLimitEquation: ContactEquation = js.native
  var lowerLimitEquation: ContactEquation = js.native
  var motorEquation: Equation = js.native
  var motorEnabled: Boolean = js.native
  var motorSpeed: Double = js.native
  def enableMotor(): Unit = js.native
  def disableMotor(): Unit = js.native
  def setLimits(lower: Double, upper: Double): Unit = js.native
}

@JSName("p2.RevoluteConstraint")
class RevoluteConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: js.Any = ???) = this()
  var pivotA: js.Array[Double] = js.native
  var pivotB: js.Array[Double] = js.native
  var motorEquation: RotationalVelocityEquation = js.native
  var motorEnabled: Boolean = js.native
  var angle: Double = js.native
  var lowerLimitEnabled: Boolean = js.native
  var upperLimitEnabled: Boolean = js.native
  var lowerLimit: Double = js.native
  var upperLimit: Double = js.native
  var upperLimitEquation: ContactEquation = js.native
  var lowerLimitEquation: ContactEquation = js.native
  def enableMotor(): Unit = js.native
  def disableMotor(): Unit = js.native
  def motorIsEnabled(): Boolean = js.native
  def setLimits(lower: Double, upper: Double): Unit = js.native
  def setMotorSpeed(speed: Double): Unit = js.native
  def getMotorSpeed(): Double = js.native
}

@JSName("p2.AngleLockEquation")
class AngleLockEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body, options: js.Any = ???) = this()
  def setRatio(ratio: Double): Double = js.native
  def setMaxTorque(torque: Double): Double = js.native
}

@JSName("p2.ContactEquation")
class ContactEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body) = this()
  var contactPointA: js.Array[Double] = js.native
  var penetrationVec: js.Array[Double] = js.native
  var contactPointB: js.Array[Double] = js.native
  var normalA: js.Array[Double] = js.native
  var restitution: Double = js.native
  var firstImpact: Boolean = js.native
  var shapeA: Shape = js.native
  var shapeB: Shape = js.native
}

@JSName("p2.Equation")
class Equation protected () extends js.Object {
  def this(bodyA: Body, bodyB: Body, minForce: Double = ???, maxForce: Double = ???) = this()
  var minForce: Double = js.native
  var maxForce: Double = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var stiffness: Double = js.native
  var relaxation: Double = js.native
  var G: js.Array[Double] = js.native
  var offset: Double = js.native
  var a: Double = js.native
  var b: Double = js.native
  var epsilon: Double = js.native
  var timeStep: Double = js.native
  var needsUpdate: Boolean = js.native
  var multiplier: Double = js.native
  var relativeVelocity: Double = js.native
  var enabled: Boolean = js.native
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
object Equation extends js.Object {
  var DEFAULT_STIFFNESS: Double = js.native
  var DEFAULT_RELAXATION: Double = js.native
}

@JSName("p2.FrictionEquation")
class FrictionEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body, slipForce: Double) = this()
  var contactPointA: js.Array[Double] = js.native
  var contactPointB: js.Array[Double] = js.native
  var t: js.Array[Double] = js.native
  var shapeA: Shape = js.native
  var shapeB: Shape = js.native
  var frictionCoefficient: Double = js.native
  def setSlipForce(slipForce: Double): Double = js.native
  def getSlipForce(): Double = js.native
}

@JSName("p2.RotationalLockEquation")
class RotationalLockEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body, options: js.Any = ???) = this()
  var angle: Double = js.native
}

@JSName("p2.RotationalVelocityEquation")
class RotationalVelocityEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body) = this()
}

@JSName("p2.EventEmitter")
class EventEmitter extends js.Object {
  def on(`type`: String, listener: js.Function, context: js.Any): EventEmitter = js.native
  def has(`type`: String, listener: js.Function): Boolean = js.native
  def off(`type`: String, listener: js.Function): EventEmitter = js.native
  def emit(event: js.Any): EventEmitter = js.native
}

@JSName("p2.ContactMaterialOptions")
class ContactMaterialOptions extends js.Object {
  var friction: Double = js.native
  var restitution: Double = js.native
  var stiffness: Double = js.native
  var relaxation: Double = js.native
  var frictionStiffness: Double = js.native
  var frictionRelaxation: Double = js.native
  var surfaceVelocity: Double = js.native
}

@JSName("p2.ContactMaterial")
class ContactMaterial protected () extends js.Object {
  def this(materialA: Material, materialB: Material, options: ContactMaterialOptions = ???) = this()
  var id: Double = js.native
  var materialA: Material = js.native
  var materialB: Material = js.native
  var friction: Double = js.native
  var restitution: Double = js.native
  var stiffness: Double = js.native
  var relaxation: Double = js.native
  var frictionStuffness: Double = js.native
  var frictionRelaxation: Double = js.native
  var surfaceVelocity: Double = js.native
  var contactSkinSize: Double = js.native
}

@JSName("p2.ContactMaterial")
object ContactMaterial extends js.Object {
  var idCounter: Double = js.native
}

@JSName("p2.Material")
class Material protected () extends js.Object {
  def this(id: Double) = this()
  var id: Double = js.native
}

@JSName("p2.Material")
object Material extends js.Object {
  var idCounter: Double = js.native
}

@JSName("p2.vec2")
class vec2 extends js.Object {
}

@JSName("p2.vec2")
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
class BodyOptions extends js.Object {
  var mass: Double = js.native
  var position: js.Array[Double] = js.native
  var velocity: js.Array[Double] = js.native
  var angle: Double = js.native
  var angularVelocity: Double = js.native
  var force: js.Array[Double] = js.native
  var angularForce: Double = js.native
  var fixedRotation: Double = js.native
}

@JSName("p2.Body")
class Body protected () extends EventEmitter {
  def this(options: BodyOptions = ???) = this()
  var sleepyEvent: js.Any = js.native
  var sleepEvent: js.Any = js.native
  var wakeUpEvent: js.Any = js.native
  var id: Double = js.native
  var world: World = js.native
  var shapes: js.Array[Shape] = js.native
  var shapeOffsets: js.Array[js.Array[Double]] = js.native
  var shapeAngles: js.Array[Double] = js.native
  var mass: Double = js.native
  var invMass: Double = js.native
  var inertia: Double = js.native
  var invInertia: Double = js.native
  var invMassSolve: Double = js.native
  var invInertiaSolve: Double = js.native
  var fixedRotation: Double = js.native
  var position: js.Array[Double] = js.native
  var interpolatedPosition: js.Array[Double] = js.native
  var interpolatedAngle: Double = js.native
  var previousPosition: js.Array[Double] = js.native
  var previousAngle: Double = js.native
  var velocity: js.Array[Double] = js.native
  var vlambda: js.Array[Double] = js.native
  var wlambda: js.Array[Double] = js.native
  var angle: Double = js.native
  var angularVelocity: Double = js.native
  var force: js.Array[Double] = js.native
  var angularForce: Double = js.native
  var damping: Double = js.native
  var angularDamping: Double = js.native
  var `type`: Double = js.native
  var boundingRadius: Double = js.native
  var aabb: AABB = js.native
  var aabbNeedsUpdate: Boolean = js.native
  var allowSleep: Boolean = js.native
  var wantsToSleep: Boolean = js.native
  var sleepState: Double = js.native
  var sleepSpeedLimit: Double = js.native
  var sleepTimeLimit: Double = js.native
  var gravityScale: Double = js.native
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
object Body extends js.Object {
  var DYNAMIC: Double = js.native
  var STATIC: Double = js.native
  var KINEMATIC: Double = js.native
  var AWAKE: Double = js.native
  var SLEEPY: Double = js.native
  var SLEEPING: Double = js.native
}

@JSName("p2.Spring")
class Spring protected () extends js.Object {
  def this(bodyA: Body, bodyB: Body, options: js.Any = ???) = this()
  var stiffness: Double = js.native
  var damping: Double = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  def applyForce(): Unit = js.native
}

@JSName("p2.LinearSpring")
class LinearSpring extends Spring {
  var localAnchorA: js.Array[Double] = js.native
  var localAnchorB: js.Array[Double] = js.native
  var restLength: Double = js.native
  def setWorldAnchorA(worldAnchorA: js.Array[Double]): Unit = js.native
  def setWorldAnchorB(worldAnchorB: js.Array[Double]): Unit = js.native
  def getWorldAnchorA(result: js.Array[Double]): js.Array[Double] = js.native
  def getWorldAnchorB(result: js.Array[Double]): js.Array[Double] = js.native
}

@JSName("p2.RotationalSpring")
class RotationalSpring protected () extends Spring {
  def this(bodyA: Body, bodyB: Body, options: js.Any = ???) = this()
  var restAngle: Double = js.native
}

@JSName("p2.Capsule")
class Capsule protected () extends Shape {
  def this(length: Double = ???, radius: Double = ???) = this()
  var length: Double = js.native
  var radius: Double = js.native
}

@JSName("p2.Circle")
class Circle protected () extends Shape {
  def this(radius: Double) = this()
  var radius: Double = js.native
}

@JSName("p2.Convex")
class Convex protected () extends Shape {
  def this(vertices: js.Array[js.Array[Double]], axes: js.Array[Double]) = this()
  var vertices: js.Array[js.Array[Double]] = js.native
  var axes: js.Array[Double] = js.native
  var centerOfMass: js.Array[Double] = js.native
  var triangles: js.Array[Double] = js.native
  def projectOntoLocalAxis(localAxis: js.Array[Double], result: js.Array[Double]): Unit = js.native
  def projectOntoWorldAxis(localAxis: js.Array[Double], shapeOffset: js.Array[Double], shapeAngle: Double, result: js.Array[Double]): Unit = js.native
  def updateCenterOfMass(): Unit = js.native
}

@JSName("p2.Convex")
object Convex extends js.Object {
  def triangleArea(a: js.Array[Double], b: js.Array[Double], c: js.Array[Double]): Double = js.native
}

@JSName("p2.Heightfield")
class Heightfield protected () extends Shape {
  def this(data: js.Array[Double], options: js.Any = ???) = this()
  var data: js.Array[Double] = js.native
  var maxValue: Double = js.native
  var minValue: Double = js.native
  var elementWidth: Double = js.native
}

@JSName("p2.Shape")
class Shape protected () extends js.Object {
  def this(`type`: Double) = this()
  var `type`: Double = js.native
  var id: Double = js.native
  var boundingRadius: Double = js.native
  var collisionGroup: Double = js.native
  var collisionMask: Double = js.native
  var material: Material = js.native
  var area: Double = js.native
  var sensor: Boolean = js.native
  def computeMomentOfInertia(mass: Double): Double = js.native
  def updateBoundingRadius(): Double = js.native
  def updateArea(): Unit = js.native
  def computeAABB(out: AABB, position: js.Array[Double], angle: Double): Unit = js.native
}

@JSName("p2.Shape")
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
class Line protected () extends Shape {
  def this(length: Double = ???) = this()
  var length: Double = js.native
}

@JSName("p2.Particle")
class Particle extends Shape {
}

@JSName("p2.Plane")
class Plane extends Shape {
}

@JSName("p2.Rectangle")
class Rectangle protected () extends Shape {
  def this(width: Double = ???, height: Double = ???) = this()
  var width: Double = js.native
  var height: Double = js.native
}

@JSName("p2.Rectangle")
object Rectangle extends js.Object {
  def sameDimensions(a: Rectangle, b: Rectangle): Boolean = js.native
}

@JSName("p2.Solver")
class Solver protected () extends EventEmitter {
  def this(options: js.Any = ???, `type`: Double = ???) = this()
  var `type`: Double = js.native
  var equations: js.Array[Equation] = js.native
  var equationSortFunction: Equation = js.native
  def solve(dy: Double, world: World): Unit = js.native
  def solveIsland(dy: Double, island: Island): Unit = js.native
  def sortEquations(): Unit = js.native
  def addEquation(eq: Equation): Unit = js.native
  def addEquations(eqs: js.Array[Equation]): Unit = js.native
  def removeEquation(eq: Equation): Unit = js.native
  def removeAllEquations(): Unit = js.native
}

@JSName("p2.Solver")
object Solver extends js.Object {
  var GS: Double = js.native
  var ISLAND: Double = js.native
}

@JSName("p2.GSSolver")
class GSSolver protected () extends Solver {
  def this(options: js.Any = ???) = this()
  var iterations: Double = js.native
  var tolerance: Double = js.native
  var useZeroRHS: Boolean = js.native
  var frictionIterations: Double = js.native
  var usedIterations: Double = js.native
}

@JSName("p2.OverlapKeeper")
class OverlapKeeper protected () extends js.Object {
  def this(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Shape) = this()
  var shapeA: Shape = js.native
  var shapeB: Shape = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  def tick(): Unit = js.native
  def setOverlapping(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Body): Unit = js.native
  def bodiesAreOverlapping(bodyA: Body, bodyB: Body): Boolean = js.native
  def set(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Shape): Unit = js.native
}

@JSName("p2.TupleDictionary")
class TupleDictionary extends js.Object {
  var data: js.Array[Double] = js.native
  var keys: js.Array[Double] = js.native
  def getKey(id1: Double, id2: Double): String = js.native
  def getByKey(key: Double): Double = js.native
  def get(i: Double, j: Double): Double = js.native
  def set(i: Double, j: Double, value: Double): Double = js.native
  def reset(): Unit = js.native
  def copy(dict: TupleDictionary): Unit = js.native
}

@JSName("p2.Utils")
class Utils extends js.Object {
}

@JSName("p2.Utils")
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
class Island extends js.Object {
  var equations: js.Array[Equation] = js.native
  var bodies: js.Array[Body] = js.native
  def reset(): Unit = js.native
  def getBodies(result: js.Any): js.Array[Body] = js.native
  def wantsToSleep(): Boolean = js.native
  def sleep(): Boolean = js.native
}

@JSName("p2.IslandManager")
class IslandManager extends Solver {
  var islands: js.Array[Island] = js.native
  var nodes: js.Array[IslandNode] = js.native
  def visit(node: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): Unit = js.native
  def bfs(root: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): Unit = js.native
  def split(world: World): js.Array[Island] = js.native
}

@JSName("p2.IslandManager")
object IslandManager extends js.Object {
  def getUnvisitedNode(nodes: js.Array[Node]): IslandNode = js.native
}

@JSName("p2.IslandNode")
class IslandNode protected () extends js.Object {
  def this(body: Body) = this()
  var body: Body = js.native
  var neighbors: js.Array[IslandNode] = js.native
  var equations: js.Array[Equation] = js.native
  var visited: Boolean = js.native
  def reset(): Unit = js.native
}

@JSName("p2.World")
class World protected () extends EventEmitter {
  def this(options: js.Any = ???) = this()
  var postStepEvent: js.Any = js.native
  var addBodyEvent: js.Any = js.native
  var removeBodyEvent: js.Any = js.native
  var addSpringEvent: js.Any = js.native
  var impactEvent: js.Any = js.native
  var postBroadphaseEvent: js.Any = js.native
  var beginContactEvent: js.Any = js.native
  var endContactEvent: js.Any = js.native
  var preSolveEvent: js.Any = js.native
  var springs: js.Array[Spring] = js.native
  var bodies: js.Array[Body] = js.native
  var solver: Solver = js.native
  var narrowphase: Narrowphase = js.native
  var islandManager: IslandManager = js.native
  var gravity: js.Array[Double] = js.native
  var frictionGravity: Double = js.native
  var useWorldGravityAsFrictionGravity: Boolean = js.native
  var useFrictionGravityOnZeroGravity: Boolean = js.native
  var doProfiling: Boolean = js.native
  var lastStepTime: Double = js.native
  var broadphase: Broadphase = js.native
  var constraints: js.Array[Constraint] = js.native
  var defaultMaterial: Material = js.native
  var defaultContactMaterial: ContactMaterial = js.native
  var lastTimeStep: Double = js.native
  var applySpringForces: Boolean = js.native
  var applyDamping: Boolean = js.native
  var applyGravity: Boolean = js.native
  var solveConstraints: Boolean = js.native
  var contactMaterials: js.Array[ContactMaterial] = js.native
  var time: Double = js.native
  var stepping: Boolean = js.native
  var islandSplit: Boolean = js.native
  var emitImpactEvent: Boolean = js.native
  var sleepMode: Double = js.native
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
  override def clone(): World = js.native
  def hitTest(worldPoint: js.Array[Double], bodies: js.Array[Body], precision: Double): js.Array[Body] = js.native
  def setGlobalEquationParameters(parameters: js.Any): Unit = js.native
  def setGlobalStiffness(stiffness: Double): Unit = js.native
  def setGlobalRelaxation(relaxation: Double): Unit = js.native
}

@JSName("p2.World")
object World extends js.Object {
  var NO_SLEEPING: Double = js.native
  var BODY_SLEEPING: Double = js.native
  var ISLAND_SLEEPING: Double = js.native
  def integrateBody(body: Body, dy: Double): Unit = js.native
}

}

}
