package com.nabobery.sdkgen.buildlogic.benchmark

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.readText
import kotlin.io.path.writeText

internal class RecordBenchmarkMeasurementTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun sumsTheFourGenerationStagesIntoOneRecord() {
        val properties = temporaryDirectory.resolve("github-scale.properties")
        properties.writeText(
            """
            corpus=github-rest
            adaptation_ms=3057
            projection_ms=2428
            emission_ms=4851
            publication_ms=17642
            """.trimIndent(),
        )
        val output = temporaryDirectory.resolve("records/github-rest-1.json")
        val task = createTask(properties, output, corpus = "github-rest", scenario = "full-pipeline-generation")

        task.record()

        assertTrue(output.exists())
        val parsed = MeasurementRecord.parse(output.readText())
        assertEquals(BenchmarkIdentity("github-rest", "full-pipeline-generation"), parsed.identity)
        // 3057 + 2428 + 4851 + 17642
        assertEquals(27978.0, parsed.value)
        assertEquals(MeasurementUnit.MILLISECONDS, parsed.unit)
        assertEquals(1, parsed.sampleCount)
        assertEquals(1, parsed.environment.workerCount)
        assertEquals(2_147_483_648L, parsed.environment.heapBytes)
    }

    @Test
    fun failsClosedWhenThePropertiesFileDoesNotExist() {
        val properties = temporaryDirectory.resolve("missing.properties")
        val output = temporaryDirectory.resolve("records/missing.json")
        val task = createTask(properties, output, corpus = "github-rest", scenario = "full-pipeline-generation")

        val exception = assertThrows(IllegalStateException::class.java) { task.record() }

        assertTrue(exception.message.orEmpty().contains("does not exist"))
        assertTrue(!output.exists())
    }

    @Test
    fun failsClosedWhenARequiredStageKeyIsMissing() {
        val properties = temporaryDirectory.resolve("incomplete.properties")
        properties.writeText(
            """
            corpus=github-rest
            adaptation_ms=3057
            projection_ms=2428
            emission_ms=4851
            """.trimIndent(),
        )
        val output = temporaryDirectory.resolve("records/incomplete.json")
        val task = createTask(properties, output, corpus = "github-rest", scenario = "full-pipeline-generation")

        val exception = assertThrows(IllegalStateException::class.java) { task.record() }

        assertTrue(exception.message.orEmpty().contains("publication_ms"))
        assertTrue(!output.exists())
    }

    @Test
    fun failsClosedWhenAStageValueIsNotNumeric() {
        val properties = temporaryDirectory.resolve("malformed.properties")
        properties.writeText(
            """
            corpus=github-rest
            adaptation_ms=3057
            projection_ms=2428
            emission_ms=not-a-number
            publication_ms=17642
            """.trimIndent(),
        )
        val output = temporaryDirectory.resolve("records/malformed.json")
        val task = createTask(properties, output, corpus = "github-rest", scenario = "full-pipeline-generation")

        val exception = assertThrows(IllegalStateException::class.java) { task.record() }

        assertTrue(exception.message.orEmpty().contains("emission_ms"))
        assertTrue(!output.exists())
    }

    @Test
    fun reusesConfigurationCacheWhenAppliedAsAGradleTask() {
        val properties = temporaryDirectory.resolve("github-scale.properties")
        properties.writeText(
            """
            corpus=github-rest
            adaptation_ms=1000
            projection_ms=2000
            emission_ms=3000
            publication_ms=4000
            """.trimIndent(),
        )
        writeTestKitBuild()

        run("recordBenchmarkMeasurement", "--configuration-cache")
        val second = run("recordBenchmarkMeasurement", "--configuration-cache")

        assertTrue(second.output.contains("Reusing configuration cache."))
        val output = temporaryDirectory.resolve("build/benchmark-record.json")
        assertTrue(output.exists())
        assertEquals(10000.0, MeasurementRecord.parse(output.readText()).value)
    }

    private fun createTask(
        properties: Path,
        output: Path,
        corpus: String,
        scenario: String,
    ): RecordBenchmarkMeasurement {
        val project = ProjectBuilder.builder().withProjectDir(temporaryDirectory.toFile()).build()
        return project.tasks
            .register("recordBenchmarkMeasurement", RecordBenchmarkMeasurement::class.java)
            .get()
            .apply {
                propertiesFile.set(properties.toFile())
                outputRecord.set(output.toFile())
                this.corpus.set(corpus)
                this.scenario.set(scenario)
                workerCount.set(1)
                heapBytes.set(2_147_483_648L)
            }
    }

    private fun writeTestKitBuild() {
        temporaryDirectory
            .resolve("settings.gradle.kts")
            .writeText("rootProject.name = \"record-benchmark-measurement-test\"\n")
        temporaryDirectory.resolve("build.gradle.kts").writeText(
            """
            import com.nabobery.sdkgen.buildlogic.benchmark.RecordBenchmarkMeasurement

            plugins {
                id("sdkgen.verify-benchmark-budget")
            }

            tasks.register<RecordBenchmarkMeasurement>("recordBenchmarkMeasurement") {
                propertiesFile.set(layout.projectDirectory.file("github-scale.properties"))
                outputRecord.set(layout.buildDirectory.file("benchmark-record.json"))
                corpus.set("github-rest")
                scenario.set("full-pipeline-generation")
                workerCount.set(1)
                heapBytes.set(2_147_483_648L)
            }
            """.trimIndent(),
        )
    }

    private fun run(vararg arguments: String): BuildResult =
        GradleRunner
            .create()
            .withGradleVersion("9.6.1")
            .withProjectDir(temporaryDirectory.toFile())
            .withArguments(*(arguments.toList() + listOf("--stacktrace", "--console=plain")).toTypedArray())
            .withPluginClasspath()
            .forwardOutput()
            .build()
}
