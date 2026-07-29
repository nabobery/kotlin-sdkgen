package com.nabobery.sdkgen.buildlogic.benchmark

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class BenchmarkBudgetVerifierTest {
    // Fixture: unsorted input [90, 10, 20]. True median (sorted, middle element) is 20.0; the mean is
    // 40.0. Budget 30.0 sits strictly between the two, so a mean-based implementation would report 40.0
    // (wrongly exceeding a 30.0 budget) where the true median 20.0 satisfies it: mean flips pass -> fail.
    // The input order also is not already sorted, so an implementation that naively reads values[1]
    // instead of sorting first would read 10.0 (the second element of the unsorted input), not 20.0: that
    // bug is caught by the median-value assertion alone, independent of the budget outcome.
    @Test
    fun passesAndComputesTrueMedianNotMean() {
        val records = records(values = listOf(90.0, 10.0, 20.0))

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 30.0), executingHost())

        assertTrue(result.passed)
        assertEquals(20.0, result.median)
    }

    // Fixture: unsorted input [90, 10, 80]. True median is 80.0; the mean is 60.0. Budget 70.0 sits
    // strictly between the two, so a mean-based implementation would report 60.0 (wrongly satisfying a
    // 70.0 budget) where the true median 80.0 exceeds it: mean flips fail -> pass, i.e. it would silently
    // accept a measurement that actually breaches the budget. Input order is again unsorted, so a naive
    // values[1] implementation would read 10.0, not 80.0, and is caught by the median-value assertion.
    @Test
    fun failsWhenMedianExceedsBudget() {
        val records = records(values = listOf(90.0, 10.0, 80.0))

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 70.0), executingHost())

        assertFalse(result.passed)
        assertEquals(80.0, result.median)
        assertTrue(result.failures.any { it.contains("exceeds budget") })
    }

    @Test
    fun rejectsRecordsWithMismatchedBenchmarkIdentity() {
        val records =
            listOf(
                record(corpus = "github", scenario = "full-generation", value = 10.0),
                record(corpus = "stripe", scenario = "full-generation", value = 20.0),
                record(corpus = "github", scenario = "full-generation", value = 30.0),
            )

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 100.0), executingHost())

        assertFalse(result.passed)
        assertNull(result.median)
        assertTrue(result.failures.any { it.contains("do not share a benchmark identity") })
    }

    @Test
    fun rejectsRecordsWithMismatchedUnit() {
        val records =
            listOf(
                record(unit = MeasurementUnit.MILLISECONDS, value = 10.0),
                record(unit = MeasurementUnit.SECONDS, value = 20.0),
                record(unit = MeasurementUnit.MILLISECONDS, value = 30.0),
            )

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 100.0), executingHost())

        assertFalse(result.passed)
        assertNull(result.median)
        assertTrue(result.failures.any { it.contains("do not share a unit") })
    }

    @Test
    fun rejectsFewerThanThreeRecords() {
        val records = records(values = listOf(10.0, 20.0))

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 100.0), executingHost())

        assertFalse(result.passed)
        assertNull(result.median)
        assertTrue(result.failures.any { it.contains("expected exactly 3") })
    }

    @Test
    fun rejectsMoreThanThreeRecords() {
        val records = records(values = listOf(10.0, 20.0, 30.0, 40.0))

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 100.0), executingHost())

        assertFalse(result.passed)
        assertNull(result.median)
        assertTrue(result.failures.any { it.contains("expected exactly 3") })
    }

    @Test
    fun failsClosedWhenBudgetIsMissing() {
        val records = records(values = listOf(10.0, 20.0, 30.0))

        val result = BenchmarkBudgetVerifier.verify(records, budget = null, executingHost = executingHost())

        assertFalse(result.passed)
        assertTrue(result.failures.any { it.contains("no budget supplied") })
    }

    @Test
    fun rejectsBudgetWithMismatchedIdentity() {
        val records = records(values = listOf(10.0, 20.0, 30.0))
        val mismatchedBudget =
            BenchmarkBudget(
                identity = BenchmarkIdentity(corpus = "stripe", scenario = "full-generation"),
                unit = MeasurementUnit.MILLISECONDS,
                maxValue = 100.0,
            )

        val result = BenchmarkBudgetVerifier.verify(records, mismatchedBudget, executingHost())

        assertFalse(result.passed)
        assertTrue(result.failures.any { it.contains("budget identity") })
    }

    @Test
    fun rejectsBudgetWithMismatchedUnit() {
        val records = records(values = listOf(10.0, 20.0, 30.0))
        val mismatchedBudget =
            BenchmarkBudget(
                identity = BenchmarkIdentity(corpus = "openrouter", scenario = "full-generation"),
                unit = MeasurementUnit.SECONDS,
                maxValue = 100.0,
            )

        val result = BenchmarkBudgetVerifier.verify(records, mismatchedBudget, executingHost())

        assertFalse(result.passed)
        assertTrue(result.failures.any { it.contains("budget unit") })
    }

    @Test
    fun rejectsRecordsWithMismatchedJvmVersion() {
        val records =
            listOf(
                record(value = 10.0, jvmVersion = "17.0.9"),
                record(value = 20.0, jvmVersion = "21.0.1"),
                record(value = 30.0, jvmVersion = "17.0.9"),
            )

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 100.0), executingHost())

        assertFalse(result.passed)
        assertNull(result.median)
        assertTrue(result.failures.any { it.contains("do not share an environment") })
    }

    @Test
    fun rejectsRecordsWithMismatchedOsName() {
        val records =
            listOf(
                record(value = 10.0, osName = "Mac OS X"),
                record(value = 20.0, osName = "Linux"),
                record(value = 30.0, osName = "Mac OS X"),
            )

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 100.0), executingHost())

        assertFalse(result.passed)
        assertNull(result.median)
        assertTrue(result.failures.any { it.contains("do not share an environment") })
    }

    @Test
    fun rejectsRecordsWithMismatchedOsArch() {
        val records =
            listOf(
                record(value = 10.0, osArch = "aarch64"),
                record(value = 20.0, osArch = "x86_64"),
                record(value = 30.0, osArch = "aarch64"),
            )

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 100.0), executingHost())

        assertFalse(result.passed)
        assertNull(result.median)
        assertTrue(result.failures.any { it.contains("do not share an environment") })
    }

    @Test
    fun rejectsRecordsWithMismatchedWorkerCount() {
        val records =
            listOf(
                record(value = 10.0, workerCount = 1),
                record(value = 20.0, workerCount = 16),
                record(value = 30.0, workerCount = 1),
            )

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 100.0), executingHost())

        assertFalse(result.passed)
        assertNull(result.median)
        assertTrue(result.failures.any { it.contains("do not share an environment") })
    }

    @Test
    fun rejectsRecordsWithMismatchedHeapBytes() {
        val records =
            listOf(
                record(value = 10.0, heapBytes = 2_147_483_648L),
                record(value = 20.0, heapBytes = 17_179_869_184L),
                record(value = 30.0, heapBytes = 2_147_483_648L),
            )

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 100.0), executingHost())

        assertFalse(result.passed)
        assertNull(result.median)
        assertTrue(result.failures.any { it.contains("do not share an environment") })
    }

    @Test
    fun rejectsRecordsWithMismatchedSampleCount() {
        val records =
            listOf(
                record(value = 10.0, sampleCount = 5),
                record(value = 20.0, sampleCount = 50),
                record(value = 30.0, sampleCount = 5),
            )

        val result = BenchmarkBudgetVerifier.verify(records, budget(maxValue = 100.0), executingHost())

        assertFalse(result.passed)
        assertNull(result.median)
        assertTrue(result.failures.any { it.contains("do not share a sample count") })
    }

    /**
     * The defect this closes. The environment check above compares the three records to *each other*, which
     * three mutually-consistent Mac records satisfy on any machine. `verify` had no parameter carrying the
     * executing host at all, so on a Linux CI runner it compared this Mac's median against the budget and
     * passed — on hardware the budget was never calibrated for.
     */
    @Test
    fun rejectsRecordsFromADifferentHostEvenWhenTheyAgreeWithEachOther() {
        val macRecords = records(values = listOf(90.0, 10.0, 20.0))

        val result =
            BenchmarkBudgetVerifier.verify(
                macRecords,
                budget(maxValue = 30.0),
                ExecutionHost(jvmVersion = "17.0.9", osName = "Linux", osArch = "amd64"),
            )

        assertFalse(result.passed)
        assertTrue(
            result.failures.any { it.contains("were not recorded on the executing host") },
            result.failures.toString(),
        )
    }

    @Test
    fun acceptsAPatchLevelJvmDifferenceButNotAMajorOne() {
        val records = records(values = listOf(90.0, 10.0, 20.0))

        val patchDifference =
            BenchmarkBudgetVerifier.verify(records, budget(maxValue = 30.0), executingHost(jvmVersion = "17.0.14"))
        val majorDifference =
            BenchmarkBudgetVerifier.verify(records, budget(maxValue = 30.0), executingHost(jvmVersion = "21.0.1"))

        assertTrue(patchDifference.passed, patchDifference.failures.toString())
        assertFalse(majorDifference.passed)
        assertTrue(majorDifference.failures.any { it.contains("were not recorded on the executing host") })
    }

    private fun records(values: List<Double>): List<MeasurementRecord> = values.map { record(value = it) }

    /** The host the default [record] fixture claims to have been measured on. */
    private fun executingHost(
        jvmVersion: String = "17.0.9",
        osName: String = "Mac OS X",
        osArch: String = "aarch64",
    ): ExecutionHost = ExecutionHost(jvmVersion = jvmVersion, osName = osName, osArch = osArch)

    private fun record(
        corpus: String = "openrouter",
        scenario: String = "full-generation",
        value: Double,
        unit: MeasurementUnit = MeasurementUnit.MILLISECONDS,
        sampleCount: Int = 5,
        jvmVersion: String = "17.0.9",
        osName: String = "Mac OS X",
        osArch: String = "aarch64",
        workerCount: Int = 1,
        heapBytes: Long = 2_147_483_648L,
    ): MeasurementRecord =
        MeasurementRecord(
            identity = BenchmarkIdentity(corpus = corpus, scenario = scenario),
            value = value,
            unit = unit,
            sampleCount = sampleCount,
            environment =
                MeasurementEnvironment(
                    jvmVersion = jvmVersion,
                    osName = osName,
                    osArch = osArch,
                    workerCount = workerCount,
                    heapBytes = heapBytes,
                ),
        )

    private fun budget(maxValue: Double): BenchmarkBudget =
        BenchmarkBudget(
            identity = BenchmarkIdentity(corpus = "openrouter", scenario = "full-generation"),
            unit = MeasurementUnit.MILLISECONDS,
            maxValue = maxValue,
        )
}
