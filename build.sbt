
lazy val root = (project in file(".")).enablePlugins(SbtWeb)

sourceGenerators in Assets += Def.task {
  val outdir = target.value / "web" / "staticjs"

  val files = Seq(
    outdir / "foo.js" -> js.foo("foo")
  )

  files.map {
    case (file, contents) =>
      IO.write(file, contents.body)
      file
  }
}.taskValue

managedSourceDirectories in Assets += target.value / "web" / "staticjs"
