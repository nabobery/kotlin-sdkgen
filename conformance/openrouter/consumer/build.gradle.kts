import org.gradle.api.tasks.testing.Test
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jlleitschuh.gradle.ktlint.tasks.KtLintCheckTask
import org.jlleitschuh.gradle.ktlint.tasks.KtLintFormatTask

plugins {
    id("sdkgen.kotlin-kmp")
    id("sdkgen.kotlin-kmp-android")
    id("sdkgen.kotlin-serialization")
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
        layout.buildDirectory.file("parity/openrouter/runs/$runId.properties")
    }
val parityOutcome = layout.buildDirectory.file("parity/openrouter/task-outcome.txt")
val parityJUnitXml = layout.buildDirectory.dir("test-results/jvmTest")

val clearOpenRouterParityRunState =
    tasks.register<Delete>("clearOpenRouterParityRunState") {
        doNotTrackState("Stale parity reports and outcomes must be cleared before every invocation.")
        outputs.upToDateWhen { false }
        delete(layout.buildDirectory.dir("parity/openrouter"), parityJUnitXml)
    }

val prepareOpenRouterParityRun =
    tasks.register<WriteProperties>("prepareOpenRouterParityRun") {
        group = "verification"
        description = "Writes the current OpenRouter parity run identity."
        dependsOn(clearOpenRouterParityRunState, ":conformance:parity:clearLiveParityEvidence")
        destinationFile.set(parityRunMarker)
        property("runId", parityRunId)
        property("commitSha", currentCommitSha)
    }

tasks.withType<KtLintCheckTask>().configureEach {
    exclude("**/generated/**")
}

tasks.withType<KtLintFormatTask>().configureEach {
    exclude("**/generated/**")
}

kotlin {
    sourceSets {
        commonMain {
            kotlin.srcDir("../generated")
            dependencies {
                implementation(project(":runtime:core"))
                implementation(libs.kotlinx.serialization.json)
            }
        }
        commonTest.dependencies {
            implementation(project(":runtime:testing"))
            implementation(libs.kotlinx.coroutines.test)
        }
        jvmTest {
            resources.srcDir("../generated")
            resources.include("manifest.json")
            dependencies {
                implementation(project(":runtime:transport-java-http"))
                implementation(project(":runtime:transport-ktor"))
                implementation(project(":runtime:transport-okhttp"))
                implementation(libs.ktor.client.java)
                implementation(libs.okhttp)
                runtimeOnly(libs.junit.jupiter)
            }
        }
    }

    jvm {
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
            testLogging {
                events("failed", "skipped")
                exceptionFormat = TestExceptionFormat.FULL
            }
        }
    }
}

tasks.named<Test>("jvmTest") {
    dependsOn(prepareOpenRouterParityRun)
    finalizedBy(":conformance:parity:recordOpenRouterParityTestOutcome")
    inputs.property("parityRunId", parityRunId)
    systemProperty("sdkgen.parity.runId", parityRunId.get())
    reports.junitXml.includeSystemOutLog.set(true)
}
