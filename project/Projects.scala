
import com.typesafe.sbt.less.Import.LessKeys
import com.typesafe.sbt.packager.universal.UniversalKeys
import com.typesafe.sbt.web.Import._
import com.typesafe.sbt.web.SbtWeb
import org.sbtidea.SbtIdeaPlugin
import sbt.Keys._
import sbt._
import sbtassembly.Plugin.{MergeStrategy, AssemblyKeys}
import sbtrelease.ReleasePlugin

object Projects extends Build with UniversalKeys {
  import BaseBuild._
  import LibsHelp.Implicits._
  import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._


  import spray.revolver.RevolverPlugin._


  // //Various Utilities and Libraries for Trading and Wrappers around 3rd party libraries like date
  // lazy val (pintX, pint, pintJvm, pintSjs, pintJvmTest, pintSjsTest) = cdpCrossProject("pint", "olib")
  //   .dependsOn(cenumX)
  //   .mapJvm(_.dependsOn(protogen))
  //   .settingsAll(SbtIdeaPlugin.ideaBasePackage := Some("cgta.olib"))
  //   .settingsSjs(requiresDOM := true)
  //   .settingsJvm(libraryDependencies ++= OldLibs.slickAll)
  //   .settingsJvm(libraryDependencies ++= OldLibs.h2)
  //   .settingsJvm(libraryDependencies ++= OldLibs.postgresql)
  //   .settingsJvm(libraryDependencies ++= OldLibs.mongo)
  //   .settingsJvm(libraryDependencies ++= OldLibs.CdpOnly.slf4jApi)
  //   .settingsJvm(libraryDependencies ++= OldLibs.CdpOnly.jetty)
  //   .settingsJvm(libraryDependencies ++= OldLibs.CdpOnly.jackson)
  //   .settingsJvm(libraryDependencies ++= OldLibs.CdpOnly.paranamer)
  //   .addLibs(Libs.Async,
  //     Libs.Autowire,
  //     Libs.AmazonAws,
  //     Libs.TwitterLibs,
  //     Libs.Akka,
  //     Libs.Spray,
  //     Libs.Time,
  //     Libs.SbtIO,
  //     Libs.Jedis,
  //     Libs.ApacheCommons)
  //   .settingsJvm(Revolver.settings: _*)
  //   .settingsJvm(LoopMain.loopMain)
  //   .tupledWithTests

  lazy val sjsOutDir = Def.settingKey[File]("directory for javascript files output by scalajs")
  lazy val sjsTasks = List(fastOptJS, fullOptJS)


  //Scala JS visualizations
  lazy val mutaspace = sjsProject("mutaspace", Project("mutaspace", file("mutaspace")))
    .enablePlugins(SbtWeb)
    .settings(requiresDOM := true)
    .settings(libraryDependencies ++= List("org.scala-lang.modules" %% "scala-async" % "0.9.1"))
    .settings(Libs.Scalatags.settings : _*)
    .settings(Libs.Cgta.settingsSjs : _*)
    .settings(Libs.Dom.settings : _*)
    .settings(
      includeFilter in (Assets, LessKeys.less) := "*.less",
      excludeFilter in (Assets, LessKeys.less) := "_*.less"
    )
    .settings((fastOptJS in Compile) <<= (fastOptJS in Compile).dependsOn(WebKeys.assets in Assets))
    .settings((fullOptJS in Compile) <<= (fullOptJS in Compile).dependsOn(WebKeys.assets in Assets))
    .settings(sjsOutDir := WebKeys.webTarget.value / "public" / "main" )
    .settings(sjsTasks.map(t => crossTarget in(Compile, t) := sjsOutDir.value): _*)


  //Aggregate project
  lazy val root = Project("root", file("."))
    .aggregate(
      mutaspace
    )
    .settings(BaseBuild.basicSettings: _*)
    .settings(ReleasePlugin.releaseSettings: _*)
    .settings(Publish.settings: _*)
    .settings(publish := {})

}
