name := "platform-assets-test-app"

version := "1.3.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
		"com.stys" %% "platform-assets" % "1.3.0"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)

routesGenerator := InjectedRoutesGenerator

TwirlKeys.templateImports += "com.stys.platform.assets.Assets"