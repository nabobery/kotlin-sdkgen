pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        exclusiveContent {
            forRepository {
                google()
            }
            filter {
                includeGroupByRegex("com\\.android(\\..*)?")
                includeGroupByRegex("androidx(\\..*)?")
                includeGroup("com.google.testing.platform")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        gradlePluginPortal()
        mavenCentral()
        exclusiveContent {
            forRepository {
                google()
            }
            filter {
                includeGroupByRegex("com\\.android(\\..*)?")
                includeGroupByRegex("androidx(\\..*)?")
                includeGroup("com.google.testing.platform")
            }
        }
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "build-logic"
