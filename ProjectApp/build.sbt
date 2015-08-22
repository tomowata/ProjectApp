name := "ProjectApp"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.projectlombok" % "lombok" % "1.12.2",
  "mysql" % "mysql-connector-java" % "5.1.34"
)     

play.Project.playJavaSettings
