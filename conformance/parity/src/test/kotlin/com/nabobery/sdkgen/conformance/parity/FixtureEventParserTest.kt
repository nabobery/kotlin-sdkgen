package com.nabobery.sdkgen.conformance.parity

import kotlinx.serialization.json.Json
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class FixtureEventParserTest {
    private val json =
        Json {
            prettyPrint = true
            encodeDefaults = true
        }
    private val eventJson = Json

    @Test
    fun startPassAndFailFramesResolveToDeterministicResults() {
        val fixtureEvents =
            sequenceOf(
                FixtureEvent("fixture.alpha", FixtureEventType.START),
                FixtureEvent("fixture.alpha", FixtureEventType.PASS),
                FixtureEvent("fixture.beta", FixtureEventType.START),
                FixtureEvent("fixture.beta", FixtureEventType.FAIL, "timed out"),
            ).joinToString("\n", prefix = "ordinary test output\n") { frame(it) }

        val result =
            FixtureEventParser.parseFixtureEvents(
                fixtureEvents,
                setOf("fixture.alpha", "fixture.beta"),
            )
        assertEquals(2, result.size)
        assertEquals(ParityStatus.PASSED, result.getValue("fixture.alpha").status)
        assertEquals(ParityStatus.FAILED, result.getValue("fixture.beta").status)
        assertEquals("timed out", result.getValue("fixture.beta").reason)
    }

    @Test
    fun failFrameBeforeStartIsRejected() {
        val frames = frame(FixtureEvent("fixture.gamma", FixtureEventType.FAIL, "bad"))
        assertFailsWith<IllegalArgumentException> {
            FixtureEventParser.parseFixtureEvents(frames, setOf("fixture.gamma"))
        }
    }

    @Test
    fun duplicateStartAndDuplicateTerminalEventsAreRejected() {
        val duplicateStart =
            listOf(
                FixtureEvent("fixture.d", FixtureEventType.START),
                FixtureEvent("fixture.d", FixtureEventType.START),
                FixtureEvent("fixture.d", FixtureEventType.PASS),
            ).joinToString("\n", transform = ::frame)
        assertFailsWith<IllegalArgumentException> {
            FixtureEventParser.parseFixtureEvents(duplicateStart, setOf("fixture.d"))
        }

        val duplicateTerminal =
            listOf(
                FixtureEvent("fixture.e", FixtureEventType.START),
                FixtureEvent("fixture.e", FixtureEventType.PASS),
                FixtureEvent("fixture.e", FixtureEventType.PASS),
            ).joinToString("\n", transform = ::frame)
        assertFailsWith<IllegalArgumentException> {
            FixtureEventParser.parseFixtureEvents(duplicateTerminal, setOf("fixture.e"))
        }
    }

    @Test
    fun truncatedStreamWithoutTerminalIsRejected() {
        val events = frame(FixtureEvent("fixture.f", FixtureEventType.START))
        assertFailsWith<IllegalArgumentException> {
            FixtureEventParser.parseFixtureEvents(events, setOf("fixture.f"))
        }
    }

    @Test
    fun unknownFixtureIdIsRejected() {
        val events =
            frame(FixtureEvent("fixture.unknown", FixtureEventType.START))
        assertFailsWith<IllegalArgumentException> {
            FixtureEventParser.parseFixtureEvents(events, setOf("fixture.known"))
        }
    }

    @Test
    fun canonicalEvidenceWriterNormalizesRowOrderAndEmitsShaSidecar() {
        val first =
            ProducerEvidenceRow(
                id = "row.two",
                status = ParityStatus.NOT_RUN,
                commitSha = "31f24acc4d71eb74f10479f1aa099c208381a5df",
                toolchainSha256 = ParityRegistry.TOOLCHAIN_SHA256,
                corpusSha256 = ParityRegistry.GITHUB_CORPUS_SHA256,
                configDigest = ParityRegistry.GITHUB_EFFECTIVE_CONFIG_SHA256,
            )
        val second =
            ProducerEvidenceRow(
                id = "row.one",
                status = ParityStatus.NOT_RUN,
                commitSha = "31f24acc4d71eb74f10479f1aa099c208381a5df",
                toolchainSha256 = ParityRegistry.TOOLCHAIN_SHA256,
                corpusSha256 = ParityRegistry.GITHUB_CORPUS_SHA256,
                configDigest = ParityRegistry.GITHUB_EFFECTIVE_CONFIG_SHA256,
            )
        val expected =
            EvidenceBundle(
                schemaVersion = "v1alpha1",
                kind = EvidenceKind.PRODUCER,
                producer = "writer-test",
                execution =
                    ExecutionEnvelope(
                        task = ":test",
                        status = ExecutionStatus.NOT_RUN,
                        requestedFixtureIds = listOf("fixture.z", "fixture.a"),
                        reason = "test",
                    ),
                rows = listOf(first, second),
            )
        val shuffled =
            EvidenceBundle(
                schemaVersion = "v1alpha1",
                kind = EvidenceKind.PRODUCER,
                producer = "writer-test",
                execution =
                    ExecutionEnvelope(
                        task = ":test",
                        status = ExecutionStatus.NOT_RUN,
                        requestedFixtureIds = listOf("fixture.a", "fixture.z"),
                        reason = "test",
                    ),
                rows = listOf(second, first),
            )

        assertEquals(
            CanonicalEvidenceWriter.renderCanonicalEvidence(expected),
            CanonicalEvidenceWriter.renderCanonicalEvidence(shuffled),
        )

        val out = File.createTempFile("parity-evidence", ".json")
        val sha = CanonicalEvidenceWriter.writeEvidenceAndSidecar(expected, out)
        val sidecar = File("${out.path}.sha256")
        assertEquals(sha, sidecar.readText().trim())
        assertEquals(CanonicalEvidenceWriter.renderCanonicalEvidence(expected), out.readText())
        assertEquals(sha, out.readBytes().sha256())
        assertTrue(sidecar.exists())
        assertTrue(sha.isSha256())
    }

    @Test
    fun malformedUtf8FrameFramesAreRejectedAsTruncatedOrUnknown() {
        val malformed = FixtureEventParser.FRAME_PREFIX + "{invalid-json}"
        assertFailsWith<IllegalArgumentException> {
            FixtureEventParser.parseFixtureEvents(malformed, setOf("fixture.a"))
        }
    }

    private fun frame(event: FixtureEvent): String = FixtureEventParser.FRAME_PREFIX + eventJson.encodeToString(event)
}
