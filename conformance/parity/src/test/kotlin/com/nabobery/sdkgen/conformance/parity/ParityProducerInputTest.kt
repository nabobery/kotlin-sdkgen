package com.nabobery.sdkgen.conformance.parity

import java.io.File
import kotlin.io.path.createTempDirectory
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ParityProducerInputTest {
    @Test
    fun junitXmlDirectoryIsCollectedInStableRelativePathOrder() {
        val directory = createTempDirectory("parity-junit-").toFile()
        File(directory, "z.xml").writeText(junitXml("z"))
        File(directory, "nested").mkdir()
        File(directory, "nested/a.xml").writeText(junitXml("a"))
        File(directory, "ignored.bin").writeText("ignored")

        assertEquals("a\nz", readFixtureEvents(directory))
    }

    @Test
    fun taskOutcomeMayBeReadFromAFinalizerArtifact() {
        val outcome = File.createTempFile("parity-outcome-", ".txt")
        outcome.writeText("passed\n")

        assertEquals("passed", readTaskStatus("@${outcome.path}"))
    }

    @Test
    fun junitTaskStatusFailsClosedForFailureOrMissingReports() {
        val directory = createTempDirectory("parity-junit-status-").toFile()
        File(directory, "failed.xml").writeText(junitXml("frame", failures = 1))
        assertEquals("failed", readJUnitTaskStatus(directory))

        assertFailsWith<IllegalArgumentException> {
            readJUnitTaskStatus(createTempDirectory("parity-junit-missing-").toFile())
        }
    }

    @Test
    fun junitTaskStatusRejectsMalformedCounters() {
        val directory = createTempDirectory("parity-junit-malformed-").toFile()
        File(directory, "malformed.xml").writeText(
            """<?xml version="1.0" encoding="UTF-8"?><testsuite failures="nope"><system-out /></testsuite>""",
        )

        assertFailsWith<IllegalArgumentException> {
            readJUnitTaskStatus(directory)
        }
    }

    private fun junitXml(
        systemOut: String,
        failures: Int = 0,
    ): String =
        """<?xml version="1.0" encoding="UTF-8"?><testsuite failures="$failures" errors="0"><system-out><![CDATA[$systemOut]]></system-out></testsuite>"""
}
