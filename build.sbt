sbtPlugin := true

version := "1.6.1"

organization := "us.sosia"

name := "jooq-sbt-plugin"

scalaVersion := "2.10.5"

libraryDependencies ++= {
  if(scalaVersion.value.startsWith("2.11")){
    Seq( "org.scala-lang.modules" %% "scala-xml" % "1.0.4")
  }else{
    Seq()
  }
}

homepage := Some.apply(url("https://github.com/hepin1989/jooq-sbt-plugin"))

licenses := Seq("BSD-style" -> url("http://www.opensource.org/licenses/bsd-license.php"))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomIncludeRepository := {
  x => false
}

pomExtra := <scm>
  <url>https://github.com/hepin1989/jooq-sbt-plugin</url>
  <connection>scm:git:git@github.com:hepin1989/jooq-sbt-plugin.git</connection>
</scm>
  <developers>
    <developer>
      <id>hepin1989</id>
      <name>He Pin</name>
      <url>https://github.com/hepin1989</url>
    </developer>
  </developers>