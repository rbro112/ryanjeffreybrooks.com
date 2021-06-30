pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                //Workaround, because kotlin-dce-js plugin not available by id on gradlePluginPortal
                "kotlin-dce-js" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }
}

rootProject.name = "personal_site"
