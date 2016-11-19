import sbt._

object Dependencies {

  val akkaVersion = "2.4.13"

  val akkaActor                     = "com.typesafe.akka"      %% "akka-actor"               % akkaVersion
  val parserCombinators             = "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"
  def scalaReflect(version: String) = "org.scala-lang"         %  "scala-reflect"            % version
  val scodec                        = "org.scodec"             %% "scodec-core"              % "1.10.3"

  val akkaTestKit  = "com.typesafe.akka" %% "akka-testkit"                   % akkaVersion % "test"
  val scalaCheck   = "org.scalacheck"    %% "scalacheck"                     % "1.13.4"    % "test"
  val scalaMeter   = "com.storm-enroute" %% "scalameter"                     % "0.8"       % "test"
  val scalaTest    = "org.scalatest"     %% "scalatest"                      % "3.0.1"     % "test"
  val mockito      = "org.mockito"       %  "mockito-core"                   % "1.10.19"   % "test"
}
