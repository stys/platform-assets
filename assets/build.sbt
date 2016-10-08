import play.sbt.routes.RoutesKeys

name := "platform-assets"

organization := "com.stys"

version := "1.3.0"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

RoutesKeys.generateReverseRouter := false