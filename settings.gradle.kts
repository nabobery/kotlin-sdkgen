import java.time.Duration

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

plugins {
    id("com.gradleup.nmcp.settings") version "1.6.1"
}

nmcpSettings {
    centralPortal {
        username = providers.environmentVariable("MAVEN_CENTRAL_USERNAME").orNull ?: "missing"
        password = providers.environmentVariable("MAVEN_CENTRAL_PASSWORD").orNull ?: "missing"
        publishingType = providers.gradleProperty("sdkgenCentralPublishingType").getOrElse("USER_MANAGED")
        publicationName = "kotlin-sdkgen:${providers.gradleProperty("sdkgenVersion").get()}"
        publishingTimeout.set(Duration.ofMinutes(30))
        uploadSnapshotsParallelism.set(1)
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
    ":conformance:openrouter",
    ":conformance:openrouter:consumer",
    ":conformance:github",
    ":conformance:github:consumer",
    ":conformance:stripe",
    ":conformance:stripe:consumer",
    ":conformance:streaming-fixture",
    ":conformance:streaming-fixture:consumer",
    ":conformance:streaming-fixture:cross-module-guard",
    ":conformance:pagination-fixture:consumer",
    ":conformance:parity",
    ":conformance:publication",
)
