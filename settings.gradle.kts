pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
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
    ":integrations:gradle-plugin",
    ":conformance:openrouter:consumer",
)
