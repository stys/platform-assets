name := "platform-assets"

organization := "com.stys"

version := "1.1.0"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

lazy val root = (project in file(".")).enablePlugins(PlayJava)

PlayKeys.generateRefReverseRouter := false