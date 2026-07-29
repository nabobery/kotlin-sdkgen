package com.nabobery.sdkgen.buildlogic.benchmark

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

internal class MeasurementRecordTest {
    @Test
    fun roundTripsThroughJson() {
        val record =
            MeasurementRecord(
                identity = BenchmarkIdentity(corpus = "github", scenario = "full-generation"),
                value = 42.5,
                unit = MeasurementUnit.MILLISECONDS,
                sampleCount = 5,
                environment =
                    MeasurementEnvironment(
                        jvmVersion = "17.0.9",
                        osName = "Mac OS X",
                        osArch = "aarch64",
                        workerCount = 1,
                        heapBytes = 2_147_483_648L,
                    ),
            )

        val parsed = MeasurementRecord.parse(record.toJson())

        assertEquals(record, parsed)
    }

    @Test
    fun rejectsUnparseableInputRatherThanSilentlyPassing() {
        assertThrows(IllegalArgumentException::class.java) { MeasurementRecord.parse("{ not valid json") }
    }

    @Test
    fun rejectsAMissingRequiredField() {
        val missingSampleCount =
            """
            {
              "corpus": "github",
              "scenario": "full-generation",
              "value": 1.0,
              "unit": "MILLISECONDS",
              "environment": {
                "jvmVersion": "17.0.9",
                "osName": "Mac OS X",
                "osArch": "aarch64",
                "workerCount": 1,
                "heapBytes": 2147483648
              }
            }
            """.trimIndent()

        assertThrows(IllegalArgumentException::class.java) { MeasurementRecord.parse(missingSampleCount) }
    }

    @Test
    fun rejectsAnUnknownUnit() {
        val unknownUnit =
            """
            {
              "corpus": "github",
              "scenario": "full-generation",
              "value": 1.0,
              "unit": "FURLONGS",
              "sampleCount": 5,
              "environment": {
                "jvmVersion": "17.0.9",
                "osName": "Mac OS X",
                "osArch": "aarch64",
                "workerCount": 1,
                "heapBytes": 2147483648
              }
            }
            """.trimIndent()

        assertThrows(IllegalArgumentException::class.java) { MeasurementRecord.parse(unknownUnit) }
    }

    @Test
    fun rejectsABlankBenchmarkIdentity() {
        assertThrows(IllegalArgumentException::class.java) {
            BenchmarkIdentity(corpus = " ", scenario = "full-generation")
        }
        assertThrows(IllegalArgumentException::class.java) {
            BenchmarkIdentity(corpus = "github", scenario = "")
        }
    }

    @Test
    fun rejectsBlankEnvironmentProvenance() {
        assertThrows(IllegalArgumentException::class.java) { environment(jvmVersion = "") }
        assertThrows(IllegalArgumentException::class.java) { environment(osName = " ") }
        assertThrows(IllegalArgumentException::class.java) { environment(osArch = "") }
    }

    @Test
    fun rejectsANonPositiveWorkerCount() {
        assertThrows(IllegalArgumentException::class.java) { environment(workerCount = 0) }
        assertThrows(IllegalArgumentException::class.java) { environment(workerCount = -1) }
    }

    @Test
    fun rejectsANonPositiveHeapSize() {
        assertThrows(IllegalArgumentException::class.java) { environment(heapBytes = 0L) }
        assertThrows(IllegalArgumentException::class.java) { environment(heapBytes = -1L) }
    }

    @Test
    fun rejectsANegativeMeasurementValue() {
        assertThrows(IllegalArgumentException::class.java) { record(value = -1.0) }
    }

    @Test
    fun rejectsANonFiniteMeasurementValue() {
        assertThrows(IllegalArgumentException::class.java) { record(value = Double.NaN) }
        assertThrows(IllegalArgumentException::class.java) { record(value = Double.POSITIVE_INFINITY) }
        assertThrows(IllegalArgumentException::class.java) { record(value = Double.NEGATIVE_INFINITY) }
    }

    @Test
    fun rejectsANonPositiveSampleCount() {
        assertThrows(IllegalArgumentException::class.java) { record(sampleCount = 0) }
        assertThrows(IllegalArgumentException::class.java) { record(sampleCount = -1) }
    }

    @Test
    fun rejectsAZeroNegativeOrNonFiniteBudget() {
        val identity = BenchmarkIdentity(corpus = "github", scenario = "full-generation")
        assertThrows(IllegalArgumentException::class.java) {
            BenchmarkBudget(identity, MeasurementUnit.MILLISECONDS, maxValue = 0.0)
        }
        assertThrows(IllegalArgumentException::class.java) {
            BenchmarkBudget(identity, MeasurementUnit.MILLISECONDS, maxValue = -1.0)
        }
        assertThrows(IllegalArgumentException::class.java) {
            BenchmarkBudget(identity, MeasurementUnit.MILLISECONDS, maxValue = Double.NaN)
        }
        assertThrows(IllegalArgumentException::class.java) {
            BenchmarkBudget(identity, MeasurementUnit.MILLISECONDS, maxValue = Double.POSITIVE_INFINITY)
        }
    }

    @Test
    fun rejectsAZeroBudgetSuppliedAsJsonAndNotOnlyAsDirectConstruction() {
        val zeroBudget =
            """
            {
              "corpus": "github",
              "scenario": "full-generation",
              "unit": "MILLISECONDS",
              "maxValue": 0.0
            }
            """.trimIndent()

        assertThrows(IllegalArgumentException::class.java) { BenchmarkBudget.parse(zeroBudget) }
    }

    private fun environment(
        jvmVersion: String = "17.0.9",
        osName: String = "Mac OS X",
        osArch: String = "aarch64",
        workerCount: Int = 1,
        heapBytes: Long = 2_147_483_648L,
    ): MeasurementEnvironment =
        MeasurementEnvironment(
            jvmVersion = jvmVersion,
            osName = osName,
            osArch = osArch,
            workerCount = workerCount,
            heapBytes = heapBytes,
        )

    private fun record(
        value: Double = 1.0,
        sampleCount: Int = 5,
    ): MeasurementRecord =
        MeasurementRecord(
            identity = BenchmarkIdentity(corpus = "github", scenario = "full-generation"),
            value = value,
            unit = MeasurementUnit.MILLISECONDS,
            sampleCount = sampleCount,
            environment = environment(),
        )
}
