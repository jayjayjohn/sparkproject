// give the user a nice default project!

name := "spark_example_App"
version := "0.1"
organization := "com.example.sparkproject"
scalaVersion := "2.12.10"
val sparkVersion = "2.4.0"

//%% means spark-core_scalaVersion, with single % you have to append _2.xx after spark-core
// provideed tell assembly to exclude the package, because library is already available in container
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  "io.confluent" % "kafka-avro-serializer" % "3.1.1"
)

resolvers += "confluent" at "http://packages.confluent.io/maven/"
