import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "SBTPlay"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "com.twitter" % "finagle-http_2.9.2" % "6.0.6" ,
    "com.twitter" % "finagle-core_2.9.2" % "6.0.6" ,
    "com.twitter" % "util-core_2.9.2" % "6.1.0" ,
    "org.jboss.netty" % "netty" % "3.2.9.Final"

  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here    
    // The Typesafe repository 
    resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",

    //resolvers += "Local Maven Repository" at "file:///" +Path.userHome.asFile.toURI.toURL + ".m2/repository",

    resolvers +=  "JBoss Repository" at "https://repository.jboss.org/nexus/content/repositories/releases/",

    resolvers += "Twitter Maven Repo" at "http://maven.twttr.com/"
  )

}
