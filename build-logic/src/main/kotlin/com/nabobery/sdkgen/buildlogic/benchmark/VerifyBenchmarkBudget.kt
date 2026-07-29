package com.nabobery.sdkgen.buildlogic.benchmark

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault

/**
 * Verifies three benchmark measurement records against a supplied budget by computing their true median
 * and comparing it to the budget's maximum, on the platform actually executing the task.
 *
 * The committed records are host-local to a development Mac. Because verification now binds to
 * [ExecutionHost.current], this task passes there and fails loudly anywhere else — which is the point. A
 * budget calibrated on one machine says nothing about another, and until runner-recorded records exist this
 * task must refuse to pretend otherwise rather than pass meaninglessly.
 */
@DisableCachingByDefault(because = "The task records a successful verification marker for local input files.")
public abstract class VerifyBenchmarkBudget : DefaultTask() {
    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val recordsDirectory: DirectoryProperty

    @get:InputFile
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val budgetFile: RegularFileProperty

    @get:OutputFile
    public abstract val verificationMarker: RegularFileProperty

    @TaskAction
    public fun verify() {
        val directory = recordsDirectory.get().asFile
        val recordFiles =
            directory
                .listFiles { file -> file.isFile && file.extension == "json" }
                .orEmpty()
                .sortedBy { it.name }

        val parseFailures = mutableListOf<String>()
        val records =
            recordFiles.mapNotNull { file ->
                runCatching { MeasurementRecord.parse(file.readText()) }
                    .onFailure { parseFailures += "${file.name}: ${it.message}" }
                    .getOrNull()
            }

        val budget =
            runCatching { BenchmarkBudget.parse(budgetFile.get().asFile.readText()) }
                .onFailure { parseFailures += "${budgetFile.get().asFile.name}: ${it.message}" }
                .getOrNull()

        check(parseFailures.isEmpty()) {
            "Benchmark budget verification could not parse input:\n${parseFailures.joinToString("\n")}"
        }

        val result = BenchmarkBudgetVerifier.verify(records, budget, ExecutionHost.current())
        check(result.passed) {
            "Benchmark budget verification failed:\n${result.failures.joinToString("\n")}"
        }

        verificationMarker.get().asFile.apply {
            parentFile.mkdirs()
            writeText("Benchmark budget verified: median ${result.median} within budget.\n")
        }
    }
}
