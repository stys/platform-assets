name := "platform-assets-test-app"

version := "1.1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
	"com.stys" %% "platform-assets" % "1.1.0"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)

TwirlKeys.templateImports += "com.stys.platform.assets.Assets"