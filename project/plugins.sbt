libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

addSbtPlugin("org.scalariform"     % "sbt-scalariform" % "1.8.3")
addSbtPlugin("com.timushev.sbt"    % "sbt-updates"     % "0.6.4")
addSbtPlugin("com.github.sbt"      % "sbt-release"     % "1.4.0")
addSbtPlugin("org.xerial.sbt"      % "sbt-sonatype"    % "3.9.21")
addSbtPlugin("com.github.sbt"      % "sbt-pgp"         % "2.3.0")
addSbtPlugin("com.github.tkawachi" % "sbt-doctest"     % "0.10.0")

libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % "always"
