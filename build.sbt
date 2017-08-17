import sbt._

name := "scalatest-asyncfun-puzzlers"

version := "0.1"

scalaVersion := "2.12.3"

//resolvers += Resolver.sonatypeRepo("releases")
//resolvers += Resolver.sonatypeRepo("snapshots")


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
