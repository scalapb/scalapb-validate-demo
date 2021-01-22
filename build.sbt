scalaVersion := "2.13.4"

Compile / PB.targets := Seq(
  scalapb.validate.preprocessor() -> (Compile / sourceManaged).value / "scalapb",
  scalapb.gen() -> (Compile / sourceManaged).value / "scalapb",
  scalapb.validate.gen() -> (Compile / sourceManaged).value / "scalapb"
)

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-validate-core" % scalapb.validate.compiler.BuildInfo.version % "protobuf",
  "com.thesamet.scalapb" %% "scalapb-validate-cats" % scalapb.validate.compiler.BuildInfo.version,
  "org.typelevel" %% "cats-core" % "2.3.0"
)

// munit
libraryDependencies += "org.scalameta" %% "munit" % "0.7.20" % Test
testFrameworks += new TestFramework("munit.Framework")
