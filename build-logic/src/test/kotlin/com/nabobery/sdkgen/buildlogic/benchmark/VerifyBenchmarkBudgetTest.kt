package com.nabobery.sdkgen.buildlogic.benchmark

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.writeText

internal class VerifyBenchmarkBudgetTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    // Unsorted, skewed fixture: median 20.0, mean 40.0. A budget of 30.0 sits between the two, so a
    // mean-based implementation would report 40.0 and wrongly fail this task; the true median 20.0
    // passes. See BenchmarkBudgetVerifierTest.passesAndComputesTrueMedianNotMean for the full rationale.
    @Test
    fun verifiesThreeMatchingRecordsAgainstASatisfiedBudget() {
        val records = temporaryDirectory.resolve("records")
        val budget = temporaryDirectory.resolve("budget.json")
        writeRecords(records, listOf(90.0, 10.0, 20.0))
        writeBudget(budget, maxValue = 30.0)
        val marker = temporaryDirectory.resolve("verification/budget.txt")
        val task = createTask(records, budget, marker)

        task.verify()

        assertTrue(marker.exists())
    }

    @Test
    fun rejectsAMalformedRecordFileRatherThanSilentlyPassing() {
        val records = temporaryDirectory.resolve("records").also(Path::createDirectories)
        records.resolve("record-0.json").writeText("{ not valid json")
        records.resolve("record-1.json").writeText(recordJson(value = 20.0))
        records.resolve("record-2.json").writeText(recordJson(value = 30.0))
        val budget = temporaryDirectory.resolve("budget.json")
        writeBudget(budget, maxValue = 100.0)
        val task = createTask(records, budget, temporaryDirectory.resolve("budget.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("could not parse input"))
    }

    // Unsorted, skewed fixture: median 80.0, mean 60.0. A budget of 70.0 sits between the two, so a
    // mean-based implementation would report 60.0 and wrongly pass this task; the true median 80.0
    // exceeds the budget. See BenchmarkBudgetVerifierTest.failsWhenMedianExceedsBudget for the rationale.
    @Test
    fun rejectsAMedianThatExceedsTheSuppliedBudget() {
        val records = temporaryDirectory.resolve("records")
        val budget = temporaryDirectory.resolve("budget.json")
        writeRecords(records, listOf(90.0, 10.0, 80.0))
        writeBudget(budget, maxValue = 70.0)
        val task = createTask(records, budget, temporaryDirectory.resolve("budget.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("exceeds budget"))
    }

    @Test
    fun reusesConfigurationCacheWhenAppliedAsConventionPlugin() {
        val records = temporaryDirectory.resolve("benchmarks/records")
        val budget = temporaryDirectory.resolve("benchmarks/budget.json")
        writeRecords(records, listOf(10.0, 20.0, 30.0))
        writeBudget(budget, maxValue = 25.0)
        writeTestKitBuild()

        run("verifyBenchmarkBudget", "--configuration-cache")
        val second = run("verifyBenchmarkBudget", "--configuration-cache")

        assertTrue(second.output.contains("Reusing configuration cache."))
    }

    private fun createTask(
        records: Path,
        budget: Path,
        marker: Path,
    ): VerifyBenchmarkBudget {
        val project = ProjectBuilder.builder().withProjectDir(temporaryDirectory.toFile()).build()
        return project.tasks
            .register("verifyBenchmarkBudget", VerifyBenchmarkBudget::class.java)
            .get()
            .apply {
                recordsDirectory.set(records.toFile())
                budgetFile.set(budget.toFile())
                verificationMarker.set(marker.toFile())
            }
    }

    private fun writeTestKitBuild() {
        temporaryDirectory
            .resolve("settings.gradle.kts")
            .writeText("rootProject.name = \"benchmark-verification-test\"\n")
        temporaryDirectory.resolve("build.gradle.kts").writeText(
            """
            plugins {
                id("sdkgen.verify-benchmark-budget")
            }
            """.trimIndent(),
        )
    }

    private fun writeRecords(
        records: Path,
        values: List<Double>,
    ) {
        records.createDirectories()
        values.forEachIndexed { index, value ->
            records.resolve("record-$index.json").writeText(recordJson(value))
        }
    }

    /**
     * The environment is read from the running JVM rather than pinned, because verification now compares each
     * record against the executing host. A pinned `"17.0.9"` / `"Mac OS X"` fixture asserts nothing about the
     * mechanism — it only asserts that whoever runs the suite happens to be on that platform, and it failed the
     * moment this suite ran on a Java 21 daemon. Host *mismatch* is covered directly in
     * [BenchmarkBudgetVerifierTest], where the host is supplied as a value instead of discovered.
     */
    private fun recordJson(value: Double): String =
        """
        {
          "corpus": "openrouter",
          "scenario": "full-generation",
          "value": $value,
          "unit": "MILLISECONDS",
          "sampleCount": 5,
          "environment": {
            "jvmVersion": "${systemProperty("java.version")}",
            "osName": "${systemProperty("os.name")}",
            "osArch": "${systemProperty("os.arch")}",
            "workerCount": 1,
            "heapBytes": 2147483648
          }
        }
        """.trimIndent()

    private fun systemProperty(name: String): String =
        requireNotNull(System.getProperty(name)) { "system property \"$name\" is unavailable" }

    private fun writeBudget(
        budget: Path,
        maxValue: Double,
    ) {
        budget.parent?.createDirectories()
        budget.writeText(
            """
            {
              "corpus": "openrouter",
              "scenario": "full-generation",
              "unit": "MILLISECONDS",
              "maxValue": $maxValue
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
