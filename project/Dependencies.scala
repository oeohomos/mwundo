import sbt._

object Dependencies {

  private val akkaV  = "2.3.9"
  private val sprayV = "1.3.3"

  lazy val compile = Seq(
  "io.spray"                  %% "spray-json"                   % "1.3.1"
  )

  lazy val test = Seq(
    "org.scalatest"           %% "scalatest"                    % "2.2.4",
    "org.scalacheck"          %% "scalacheck"                   % "1.12.2",
    "org.scalamock"           %% "scalamock-scalatest-support"  % "3.2",
    "org.pegdown"             %  "pegdown"                      % "1.4.2",
    "io.spray"                %% "spray-testkit"                % sprayV
  ).map(_ % "test")
}