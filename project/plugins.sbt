// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Local Maven Repository" at "file:///" +Path.userHome.asFile.toURI.toURL + ".m2/repository"

//resolvers +=  "JBoss Repository" at "https://repository.jboss.org/nexus/content/repositories/releases/"

//resolvers += "Twitter Maven Repo" at "http://maven.twttr.com/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.1.5")

//addSbtPlugin("play" % "sbt-plugin" % Option(System.getProperty("play.version")).getOrElse("2.0"))

libraryDependencies ++= Seq(
  "com.twitter" % "finagle-http_2.9.2" % "6.0.6" ,
  "com.twitter" % "finagle-core_2.9.2" % "6.0.6" ,
  "com.twitter" % "util-core_2.9.2" % "6.1.0" ,
  "org.jboss.netty" % "netty" % "3.2.9.Final"
)

