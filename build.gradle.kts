plugins {
    kotlin("jvm") version "2.2.20"
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "notes"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:6.1.0")
    implementation("org.xerial:sqlite-jdbc:3.45.1.0")
    implementation("ch.qos.logback:logback-classic:1.5.13")
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("com.example.MainKt")
}

//tasks.shadowJar {
//    archiveBaseName.set("notes-bot")
//    archiveVersion.set("")        // чтобы имя было без -1.0
//    archiveClassifier.set("all")  // notes-bot-all.jar
//
//    mergeServiceFiles()
//
//    manifest {
//        attributes["Main-Class"] = "com.example.MainKt"
//    }
//}