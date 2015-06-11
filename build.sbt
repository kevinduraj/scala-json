import org.fusesource.hawtjni.runtime.Library

name := "scala-json"

version := "1.1"

//scalaVersion := "2.11.6"
scalaVersion := "2.10.5"

libraryDependencies ++= Seq(
  "net.liftweb" % "lift-webkit_2.10" % "3.0-M1",
  "io.spray" %%  "spray-json" % "1.3.2",
  "com.typesafe.play" % "play_2.10" % "2.4.0"
)

resolvers ++= Seq(
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases/",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"
)