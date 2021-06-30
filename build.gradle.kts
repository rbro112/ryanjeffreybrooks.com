plugins {
    kotlin("multiplatform") version "1.5.10"
    id("org.jetbrains.compose") version "0.5.0-build228"
}

group = "personal_site"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")

    maven {
        url = uri("https://maven.pkg.github.com/hfhbd/*")
        credentials {
            username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_ACTOR")
            password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
        }
    }
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation("app.softwork:routing-compose:0.0.16")
                implementation(compose.runtime)
            }
        }
    }
}