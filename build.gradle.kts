// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    apply(from = "${rootDir.absolutePath}/versions.gradle.kts")
    repositories {
        mavenCentral()
        google()
        jcenter()
    }
    dependencies {
        val versions: Map<String, String> by rootProject.extra
        classpath("com.android.tools.build:gradle:${versions["gradle"]}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${versions["kotlin"]}")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
        jcenter()
    }
}

tasks.register("clean") {
    delete(rootProject.buildDir)
}