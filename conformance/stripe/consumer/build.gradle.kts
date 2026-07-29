import org.gradle.api.tasks.bundling.Zip
import org.gradle.api.tasks.testing.Test
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jlleitschuh.gradle.ktlint.tasks.KtLintCheckTask
import org.jlleitschuh.gradle.ktlint.tasks.KtLintFormatTask

plugins {
    id("sdkgen.kotlin-kmp")
    id("sdkgen.kotlin-serialization")
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
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
        layout.buildDirectory.file("parity/stripe/runs/$runId.properties")
    }
val parityOutcome =
    parityRunId.flatMap { runId ->
        layout.buildDirectory.file("parity/stripe/outcomes/$runId.txt")
    }
val parityJUnitXml = layout.buildDirectory.dir("test-results/jvmTest")

val clearStripeParityRunState =
    tasks.register<Delete>("clearStripeParityRunState") {
        doNotTrackState("Stale parity reports and outcomes must be cleared before every invocation.")
        outputs.upToDateWhen { false }
        delete(parityOutcome, parityJUnitXml)
    }

val prepareStripeParityRun =
    tasks.register<WriteProperties>("prepareStripeParityRun") {
        group = "verification"
        description = "Writes the current Stripe parity run identity."
        dependsOn(clearStripeParityRunState)
        destinationFile.set(parityRunMarker)
        property("runId", parityRunId)
        property("commitSha", currentCommitSha)
    }

tasks.named<Test>("jvmTest") {
    dependsOn(prepareStripeParityRun)
    finalizedBy(":conformance:parity:recordStripeParityTestOutcome")
    inputs.property("parityRunId", parityRunId)
    systemProperty("sdkgen.parity.runId", parityRunId.get())
    systemProperty(
        "parity.generatedDirectory",
        layout.projectDirectory
            .file("../generated")
            .asFile.absolutePath,
    )
    reports.junitXml.includeSystemOutLog.set(true)
}
