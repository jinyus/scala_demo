scalaVersion := "3.3.1"

enablePlugins(ScalaNativePlugin)

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "upickle" % "3.1.0", 
  "com.lihaoyi" %% "os-lib" % "0.9.2"  
)

logLevel := Level.Info

import scala.scalanative.build._

nativeConfig ~= { c =>
  c.withLTO(LTO.none) // thin
    .withMode(Mode.debug) // releaseFast
    .withGC(GC.immix) // commix
}
