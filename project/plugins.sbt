lazy val root = Project("plugins", file(".")).enablePlugins(SbtTwirl)

sourceDirectories in (Compile, TwirlKeys.compileTemplates) := {
  Seq(baseDirectory.value.getParentFile / "static" / "twirl")
}

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.1.0")
