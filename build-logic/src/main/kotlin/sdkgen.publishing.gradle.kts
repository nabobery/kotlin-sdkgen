import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication

plugins {
    `maven-publish`
    id("org.jetbrains.kotlinx.binary-compatibility-validator")
}

group = "com.nabobery"

// Remote repositories and credentials are intentionally deferred until release automation exists.

// Plain `java-library` modules (the JVM convention plugin) do not automatically create a Maven
// publication. KMP modules and `java-gradle-plugin` modules already register their own
// publications, so this only fills the gap for `sdkgen.kotlin-jvm` consumers.
plugins.withId("java-library") {
    if (!plugins.hasPlugin("java-gradle-plugin")) {
        configure<PublishingExtension> {
            publications.create<MavenPublication>("maven") {
                from(components["java"])
            }
        }
    }
}

// ADR-0008 fixes the public Maven coordinates independently of each module's directory name.
// Kotlin/Gradle-plugin publications name themselves after `project.name`, so every publication's
// artifact ID is rewritten by substituting the desired base name for that prefix; per-target KMP
// publication suffixes (e.g. `-jvm`, `-iosarm64`) and the Gradle plugin marker publication
// (already named after the plugin id, per Gradle's own convention) are left untouched.
private val adr0008ArtifactIds =
    mapOf(
        ":generator:engine" to "kotlin-sdkgen-engine",
        ":generator:cli" to "kotlin-sdkgen-cli",
        ":runtime:core" to "kotlin-sdkgen-runtime",
        ":runtime:testing" to "kotlin-sdkgen-testing",
        ":runtime:transport-ktor" to "kotlin-sdkgen-transport-ktor",
        ":runtime:transport-okhttp" to "kotlin-sdkgen-transport-okhttp",
        ":runtime:transport-java-http" to "kotlin-sdkgen-transport-java-http",
        ":integrations:gradle-plugin" to "kotlin-sdkgen-gradle-plugin",
    )

adr0008ArtifactIds[project.path]?.let { desiredBaseArtifactId ->
    plugins.withId("maven-publish") {
        configure<PublishingExtension> {
            publications.withType<MavenPublication>().configureEach {
                if (!name.endsWith("PluginMarkerMaven")) {
                    artifactId = artifactId.replaceFirst(project.name, desiredBaseArtifactId)
                }
            }
        }
    }
}
