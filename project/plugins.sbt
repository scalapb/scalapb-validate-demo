addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.0-RC7")

libraryDependencies ++= Seq(
    "com.thesamet.scalapb" %% "compilerplugin"           % "0.10.10-SNAPSHOT",
    "com.thesamet.scalapb" %% "scalapb-validate-codegen" % "0.2.0-preview6+2-d529cb79+20210115-1930-SNAPSHOT"
)
