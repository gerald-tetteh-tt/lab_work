ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.2"

libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test

lazy val root = (project in file("."))
  .settings(
    name := "practice_questions"
  )