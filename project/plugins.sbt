addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.0-RC6")

libraryDependencies ++= Seq(
    "com.thesamet.scalapb" %% "compilerplugin"           % "0.10.10-preview3",
    "com.thesamet.scalapb" %% "scalapb-validate-codegen" % "0.2.0-preview3"
)
