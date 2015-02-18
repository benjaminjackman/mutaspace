import cgta.sbtxsjs.SbtXSjsPlugin.XSjsProjects
import com.typesafe.sbt.packager.universal.UniversalKeys
import com.typesafe.sbt.web.SbtWeb
import org.sbtidea.SbtIdeaPlugin
import sbt.Keys._
import sbt._
import sbtassembly.Plugin.AssemblyKeys

import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
//import org.scalajs.sbtplugin.ScalaJSPlugin.ScalaJSKeys
import com.typesafe.sbt.less.Import.LessKeys
import com.typesafe.sbt.web.Import.Assets


object BaseBuild extends Build with UniversalKeys {
  //  sys.props("scalac.patmat.analysisBudget") = "512"
  //org.slf4j.LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME).asInstanceOf[ch.qos.logback.classic.Logger].setLevel(ch.qos.logback.classic.Level.INFO)

  lazy val basicSettings = scalacSettings ++
    promptSettings ++
    noScaladocSettings

  lazy val noScaladocSettings = Seq[Setting[_]](publishArtifact in(Compile, packageDoc) := Publish.includeScaladoc)

  lazy val promptSettings = Seq[Setting[_]](
    shellPrompt <<= (thisProjectRef, version) { (id, v) => _ => "mutaspace:%s:%s> ".format(id.project, v)}
  )

  lazy val scalacSettings = Seq[Setting[_]](
    scalaVersion := "2.11.5",
    scalacOptions += "-deprecation",
    scalacOptions += "-unchecked",
    scalacOptions += "-feature",
    scalacOptions += "-language:implicitConversions",
    scalacOptions += "-language:higherKinds",
    scalacOptions += "-language:existentials",
    scalacOptions += "-language:postfixOps",
    scalacOptions += "-Xfatal-warnings"
  )

  def getBasePackageName(projectName: String, suffix: String = null) = {
    val root = "biz.jackman"
    val name = Option(suffix).map(projectName.split(_)(0)).getOrElse(projectName)
    root + "." + name
  }

  def sjsProject(name: String, p: Project) = {
    p.settings(basicSettings: _*)
      .enablePlugins(ScalaJSPlugin)
      .settings(scalacOptions += "-language:reflectiveCalls")
      .settings(SbtIdeaPlugin.ideaBasePackage := Some(getBasePackageName(name, "-sjs")))
      .settings(Libs.Otest.settingsSjs: _*)
      .settings(Publish.settingsSjs: _*)
      .settings(net.virtualvoid.sbt.graph.Plugin.graphSettings: _*)
  }

  def jvmProject(name: String, p: Project) = {
    p.settings(basicSettings: _*)
      .settings(SbtIdeaPlugin.ideaBasePackage := Some(getBasePackageName(name, "-jvm")))
      .settings(testFrameworks := Nil)
      .settings(Libs.Otest.settingsJvm: _*)
      .settings(Publish.settingsJvm: _*)
      .settings(net.virtualvoid.sbt.graph.Plugin.graphSettings: _*)
      .settings(
        unmanagedSourceDirectories in Compile += baseDirectory.value / ".." / "java",
        unmanagedSourceDirectories in Test += baseDirectory.value / ".." / ".." / "test" / "java"
      )
  }

  def crossProject(name: String) = XSjsProjects(name, file(name))
    .settingsBase(basicSettings: _*)
    .settingsBase(Libs.Otest.settingsJvm: _*)
    .settingsBase(SbtIdeaPlugin.ideaBasePackage := Some(getBasePackageName(name)))
    .settingsBase(test := {})
    .settingsBase(testQuick := {})
    .settingsBase(testOnly := {})
    .settingsBase(compile := {sbt.inc.Analysis.Empty})
    .settingsBase(compile in Test := {sbt.inc.Analysis.Empty})
    .mapJvm(jvmProject(name, _))
    .mapSjs(sjsProject(name, _))
    .settingsJvmTest(basicSettings: _*)
    .settingsSjsTest(basicSettings: _*)


  def playProject(sjsProjects: Seq[sbt.ProjectReference]) = {
    lazy val sjsForPlayOutDir = Def.settingKey[File]("directory for javascript files output by scalajs")
    lazy val lastSjsProject = sjsProjects.last

    lazy val sjsTasks = List(fastOptJS, fullOptJS)

    Project("mutaplay", file("mutaplay"))
      .enablePlugins(play.PlayScala, SbtWeb)
      .settings(libraryDependencies ++= Libs.Play.exclusiveDeps)
      .aggregate(sjsProjects: _*)
      .settings(publish := {})
      .settings(SbtIdeaPlugin.ideaBasePackage := Some(getBasePackageName("mutaplay")))
      .settings(basicSettings: _*)
      .settings(sjsForPlayOutDir := (crossTarget in Compile).value / "classes" / "public" / "javascripts",
        compile in Compile <<= (compile in Compile) dependsOn (fastOptJS in(lastSjsProject, Compile)),
        includeFilter in(Assets, LessKeys.less) := "*.less",
        dist <<= dist dependsOn (fullOptJS in(lastSjsProject, Compile))
      )
      .settings(sjsTasks.map(t => crossTarget in(lastSjsProject, Compile, t) := sjsForPlayOutDir.value): _*)
  }

  //  def playProject() = {
  //     Project("mutaplay", file("mutaplay"))
  //       .enablePlugins(play.PlayScala, SbtWeb)
  //       .settings(libraryDependencies ++= Libs.Play.exclusiveDeps)
  //       .settings(publish := {})
  //       .settings(SbtIdeaPlugin.ideaBasePackage := Some(getBasePackageName("mutaplay")))
  //       //      .settings(play.Project.playScalaSettings: _*)
  //       //      .settings(com.jamesward.play.BrowserNotifierPlugin.livereload: _*)
  //       .settings(basicSettings: _*)
  //  }


}
