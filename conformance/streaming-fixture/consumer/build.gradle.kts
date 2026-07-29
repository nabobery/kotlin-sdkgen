import org.jlleitschuh.gradle.ktlint.KtlintExtension

plugins {
    id("sdkgen.kotlin-jvm")
    id("sdkgen.kotlin-serialization")
}

// Consume the checked-in generation through its canonical pointer. This module never regenerates or copies it.
kotlin {
    sourceSets {
        main {
            kotlin.srcDir(file("../generated"))
            resources.srcDir(file("../generated"))
            resources.include("manifest.json")
        }
    }
}

configure<KtlintExtension> {
    filter {
        exclude { element ->
            element.file.path.contains("/conformance/streaming-fixture/generated/") ||
                element.file.path.contains("/conformance/streaming-fixture/.snapshots/")
        }
    }
}

dependencies {
    implementation(project(":runtime:core"))
    implementation(libs.kotlinx.serialization.json)
    testImplementation(project(":runtime:testing"))
    testImplementation(kotlin("test"))
    testImplementation(libs.kotlinx.coroutines.test)
}

val parityRunId =
    providers
        .gradleProperty("parityRunId")
        .orElse("local-unbound")
        .map { runId ->
            require(Regex("[A-Za-z0-9][A-Za-z0-9._:-]{0,127}").matches(runId)) {
                "parityRunId is missing or invalid"
            }
            runId
        }
val currentCommitSha =
    providers
        .exec {
            workingDir(rootProject.layout.projectDirectory)
            commandLine("git", "rev-parse", "HEAD")
        }.standardOutput.asText
        .map(String::trim)
val parityRunMarker =
    parityRunId.flatMap { runId ->
        layout.buildDirectory.file("parity/streaming-stress/runs/$runId.properties")
    }
val parityOutcome =
    parityRunId.flatMap { runId ->
        layout.buildDirectory.file("parity/streaming-stress/outcomes/$runId.txt")
    }
val parityJUnitXml = layout.buildDirectory.dir("test-results/test")

val clearStreamingStressParityRunState =
    tasks.register<Delete>("clearStreamingStressParityRunState") {
        doNotTrackState("Stale parity reports and outcomes must be cleared before every invocation.")
        outputs.upToDateWhen { false }
        delete(parityOutcome, parityJUnitXml)
    }

val prepareStreamingStressParityRun =
    tasks.register<WriteProperties>("prepareStreamingStressParityRun") {
        group = "verification"
        description = "Writes the current generated-SSE parity run identity."
        dependsOn(clearStreamingStressParityRunState)
        destinationFile.set(parityRunMarker)
        property("runId", parityRunId)
        property("commitSha", currentCommitSha)
    }

tasks.test {
    dependsOn(prepareStreamingStressParityRun)
    finalizedBy(":conformance:parity:recordStreamingStressParityTestOutcome")
    inputs.property("parityRunId", parityRunId)
    systemProperty("sdkgen.parity.runId", parityRunId.get())
    reports.junitXml.includeSystemOutLog.set(true)
}
