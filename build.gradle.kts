plugins {
    kotlin("jvm") version "1.+"
    id("com.github.johnrengelman.shadow") version "7.+"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

//    implementation("org.slf4j:slf4j-simple:1.+")
    implementation("com.slack.api:bolt:1.+")
    implementation("com.slack.api:bolt-servlet:1.+")
    implementation("com.slack.api:bolt-jetty:1.+")
//    implementation("com.slack.api:slack-api-model-kotlin-extension:1.+") // optional (Kotlin DSL to build replies)
}

task("stage") {
    dependsOn("build")
}

application {
    mainClass.set("SlackMainKt")
}
