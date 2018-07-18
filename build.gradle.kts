group = "io.qubus"
version = "0.1"

plugins {
    kotlin("jvm") version "1.2.51"
    id("org.jetbrains.intellij") version "0.3.4"
}

repositories {
    mavenCentral()
    maven("http://dl.bintray.com/jetbrains/intellij-plugin-service")
    //maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    testCompile("junit", "junit", "4.12")
}

intellij {
    version = "IC-181.4203.550"
    pluginName = "CapnprotoSchemaLanguagePlugin"
    updateSinceUntilBuild = false
}

val jar by tasks.getting(Jar::class)
val fatJar by tasks.creating(Jar::class) {
    destinationDir = file("$rootDir/build")
    baseName = "capnprotoschemalangplugin-all"
    manifest.attributes["Main-Class"] = "io.qubus.aoe2m.coordinator.Main"
    from(*configurations.compile.map(::zipTree).toTypedArray())
    with(jar)
}
