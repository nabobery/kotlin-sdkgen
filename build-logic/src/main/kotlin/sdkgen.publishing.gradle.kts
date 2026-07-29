import com.nabobery.sdkgen.buildlogic.publication.Adr0008ProductArtifactIds
import kotlinx.validation.ApiValidationExtension
import kotlinx.validation.ExperimentalBCVApi
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication

plugins {
    `maven-publish`
    id("org.jetbrains.kotlinx.binary-compatibility-validator")
}

group = "com.nabobery"

// ADR-0007 treats KLib dumps as required (if experimental, target-specific) ABI evidence. BCV keeps KLib
// validation off unless it is explicitly opted into, so without this block every `klibApiCheck` task reports
// SKIPPED and the build passes while producing no KLib evidence at all.
configure<ApiValidationExtension> {
    @OptIn(ExperimentalBCVApi::class)
    klib {
        enabled = true
    }
}

// Remote repositories and credentials are intentionally deferred until release automation exists.

// Plain `java-library` modules (the JVM convention plugin) do not automatically create a Maven
// publication. KMP modules and `java-gradle-plugin` modules already register their own
// publications, so this only fills the gap for `sdkgen.kotlin-jvm` consumers. ADR-0008 requires
// sources JARs on every published coordinate; KMP publications include them already, so only the
// pure-JVM modules (java-library and the Gradle plugin) need `withSourcesJar()` here.
plugins.withId("java") {
    configure<JavaPluginExtension> {
        withSourcesJar()
    }
}
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
//
// The project-path -> artifactId map itself lives in Adr0008ProductArtifactIds (shared with
// StagedArtifactRepositoryScanner's staged-artifact target derivation) so the eight product
// coordinates cannot drift apart between publishing and staged-artifact inventory scanning.
Adr0008ProductArtifactIds.projectPathToArtifactId[project.path]?.let { desiredBaseArtifactId ->
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
