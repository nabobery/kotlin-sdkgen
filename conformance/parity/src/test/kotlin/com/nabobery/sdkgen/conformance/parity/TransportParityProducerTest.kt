package com.nabobery.sdkgen.conformance.parity

import java.io.File
import kotlin.io.path.createTempDirectory
import kotlin.test.Test
import kotlin.test.assertFailsWith

class TransportParityProducerTest {
    @Test
    fun exactContractSubclassAndCompleteInventoryPass() {
        val report = writeReport(EXPECTED_CLASS, transportContractTestInventory)

        validateTransportContractReport(report.parentFile, EXPECTED_CLASS)
    }

    @Test
    fun jvmTargetSuffixInKmpJUnitNamesIsNormalized() {
        val report = writeReport(EXPECTED_CLASS, transportContractTestInventory, jvmTargetSuffix = true)

        validateTransportContractReport(report.parentFile, EXPECTED_CLASS)
    }

    @Test
    fun missingSkipReportAndWrongSubclassFailClosed() {
        val missingSkipReport =
            writeReport(
                EXPECTED_CLASS,
                transportContractTestInventory - "contractSkipReportIsConsistent",
            )
        assertFailsWith<IllegalArgumentException> {
            validateTransportContractReport(missingSkipReport.parentFile, EXPECTED_CLASS)
        }

        val wrongSubclass = writeReport("example.WrongContractKitTest", transportContractTestInventory)
        assertFailsWith<IllegalArgumentException> {
            validateTransportContractReport(wrongSubclass.parentFile, EXPECTED_CLASS)
        }
    }

    @Test
    fun duplicateOrSkippedContractTestFailsClosed() {
        val duplicate =
            writeReport(
                EXPECTED_CLASS,
                transportContractTestInventory + transportContractTestInventory.first(),
                duplicateFirst = true,
            )
        assertFailsWith<IllegalArgumentException> {
            validateTransportContractReport(duplicate.parentFile, EXPECTED_CLASS)
        }

        val skipped = writeReport(EXPECTED_CLASS, transportContractTestInventory, skippedFirst = true)
        assertFailsWith<IllegalArgumentException> {
            validateTransportContractReport(skipped.parentFile, EXPECTED_CLASS)
        }
    }

    private fun writeReport(
        className: String,
        tests: Set<String>,
        duplicateFirst: Boolean = false,
        skippedFirst: Boolean = false,
        jvmTargetSuffix: Boolean = false,
    ): File {
        val directory = createTempDirectory(prefix = "transport-parity-").toFile()
        val ordered = tests.sorted()
        val cases =
            buildList {
                ordered.forEachIndexed { index, name ->
                    val skipped = if (skippedFirst && index == 0) "<skipped/>" else ""
                    val targetSuffix = if (jvmTargetSuffix) "[jvm]" else ""
                    add("""<testcase name="$name$targetSuffix()" classname="$className">$skipped</testcase>""")
                }
                if (duplicateFirst) {
                    val first = ordered.first()
                    add("""<testcase name="$first()" classname="$className"></testcase>""")
                }
            }.joinToString(separator = "\n")
        return directory.resolve("TEST-contract.xml").apply {
            writeText(
                """
                <testsuite tests="${ordered.size}" failures="0" errors="0">
                $cases
                </testsuite>
                """.trimIndent(),
            )
        }
    }

    private companion object {
        const val EXPECTED_CLASS = "example.ExactContractKitTest"
    }
}
