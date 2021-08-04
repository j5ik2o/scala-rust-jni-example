ThisBuild / version := "0.1"

ThisBuild / scalaVersion := "2.13.6"

lazy val root = (project in file(".")).aggregate(core, native)

lazy val core = project
  .settings(
    name := "scala-rust-jni-example-core",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
  )
  .dependsOn(native % Runtime)

lazy val native = project
  .settings(
    name := "scala-rust-jni-example-native",
    nativeCompile / sourceDirectory := baseDirectory.value) // `baseDirectory`, not `sourceDirectory`
  .enablePlugins(JniNative)