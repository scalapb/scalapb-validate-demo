scalaVersion := "2.13.4"

PB.targets in Compile := Seq(
  scalapb.validate.preprocessor() -> (sourceManaged in Compile).value / "scalapb",
  scalapb.gen() -> (sourceManaged in Compile).value / "scalapb",
  scalapb.validate.gen() -> (sourceManaged in Compile).value / "scalapb"
)

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-validate-core" % scalapb.validate.compiler.BuildInfo.version % "protobuf",
  "com.thesamet.scalapb" %% "scalapb-validate-cats" % scalapb.validate.compiler.BuildInfo.version,
  "org.typelevel" %% "cats-core" % "2.3.0"
)

// munit
libraryDependencies += "org.scalameta" %% "munit" % "0.7.20" % Test
testFrameworks += new TestFramework("munit.Framework")