addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.5.0")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")

val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.28")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.3.9")

scalacOptions += "-deprecation"
