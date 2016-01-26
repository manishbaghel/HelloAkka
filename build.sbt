name := "HelloScala"

version := "1.0"

scalaVersion := "2.11.7"


resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % "2.3.14",
  "com.typesafe.akka" % "akka-testkit_2.11" % "2.3.14",
  "org.scalatest" % "scalatest_2.11" % "3.0.0-M7"
)