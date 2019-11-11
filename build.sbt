ThisBuild / version      := "0.1.0"
ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.example"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8"
val playJson  = "com.typesafe.play" %% "play-json" % "2.7.4"
val gigahorse = "com.eed3si9n" %% "gigahorse-okhttp" % "0.5.0"

lazy val earth = (project in file("."))
  .aggregate(earthCore)
  .dependsOn(earthCore)
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "Earth",
    libraryDependencies += scalaTest % Test,
  )

lazy val earthCore = (project in file("core"))
  .settings(
    name := "Earth Core",
    libraryDependencies ++= Seq(gigahorse, playJson),
    libraryDependencies += scalaTest % Test,
  )
