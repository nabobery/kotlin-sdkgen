pluginManagement {
    includeBuild("build-logic")
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

rootProject.name = "kotlin-sdkgen"

include(
    ":generator:model",
    ":generator:openapi",
    ":generator:engine",
    ":generator:cli",
    ":runtime:core",
    ":runtime:testing",
    ":runtime:transport-ktor",
    ":runtime:transport-okhttp",
    ":runtime:transport-java-http",
    ":integrations:gradle-plugin",
    ":conformance:openrouter:consumer",
)
