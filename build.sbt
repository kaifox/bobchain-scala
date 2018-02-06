name := "bobchain"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

/* Hashing library from: https://github.com/Nycto/Hasher */
libraryDependencies ++= Seq("com.roundeights" %% "hasher" % "1.2.0")

/* Json conversions via gson */
libraryDependencies += "com.google.code.gson" % "gson" % "2.8.2"