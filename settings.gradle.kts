rootProject.name = "sequence-fleet"

include(":fleet-plugin")
include(":fleet-plugin:frontendImpl")

pluginManagement {
    repositories {
//        mavenCentral()
//        gradlePluginPortal()
        maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
        maven("https://packages.jetbrains.team/maven/p/teamcity-rest-client/teamcity-rest-client")
        maven("https://download.jetbrains.com/teamcity-repository")
        maven("https://packages.jetbrains.team/maven/p/fleet/fleet-sdk")
        gradlePluginPortal()
    }
}