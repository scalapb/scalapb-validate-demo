addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.0-RC7")

libraryDependencies ++= Seq(
    "com.thesamet.scalapb" %% "compilerplugin"           % "0.10.10-preview11",
    "com.thesamet.scalapb" %% "scalapb-validate-codegen" % "0.2.0-preview11"
)
