plugins {
    kotlin("jvm") version "2.2.20"
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "notes"
version = "1.0"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:6.3.0")
    implementation("org.xerial:sqlite-jdbc:3.45.1.0")
    implementation("ch.qos.logback:logback-classic:1.5.13")
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}

//tasks.shadowJar {
//    archiveBaseName.set("notes-bot")
//    archiveVersion.set("")
//    archiveClassifier.set("")
//
//    mergeServiceFiles()
//
//    manifest {
//        attributes["Main-Class"] = "com.example.MainKt"
//    }
//}