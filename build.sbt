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

publishMavenStyle := false

bintrayReleaseOnPublish in ThisBuild := false

bintrayOrganization := None