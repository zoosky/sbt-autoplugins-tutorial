

name := "awesome-os"
organization := "de.mukis"

scalaVersion in Global := "2.10.6"

sbtPlugin := true

// Scripted - sbt plugin tests
scriptedSettings
scriptedLaunchOpts := {  scriptedLaunchOpts.value ++ Seq("-Dproject.version=" + version.value) }
