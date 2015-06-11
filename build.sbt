name := """empty-2.3.8"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).
                  enablePlugins(PlayScala).
                  enablePlugins(SbtWeb)
                  
scalaVersion := "2.11.5"


libraryDependencies ++= Seq(
  "com.zaxxer" % "HikariCP-java6" % "2.3.7",
  "com.typesafe.slick" % "slick_2.11" % "3.0.0-RC3" withSources(),
  "com.typesafe.slick" % "slick-codegen_2.11" % "3.0.0-RC3",
  "mysql" % "mysql-connector-java" % "5.1.31"
)


libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

pipelineStages := Seq(digest, gzip)

