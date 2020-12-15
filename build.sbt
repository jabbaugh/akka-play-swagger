val SwaggerVersion = "1.6.0"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-scala-starter-example""",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      guice,
      "com.h2database" % "h2" % "1.4.199",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      "io.swagger" %% "swagger-play2" % "2.0.1-SNAPSHOT",
      "org.webjars" % "swagger-ui" % "3.13.0",
      "io.swagger"         % "swagger-parser"             % "1.0.44",
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
