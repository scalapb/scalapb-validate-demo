addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.0")

libraryDependencies ++= Seq(
    "com.thesamet.scalapb" %% "compilerplugin"           % "0.10.10",
    "com.thesamet.scalapb" %% "scalapb-validate-codegen" % "0.2.0"
)
