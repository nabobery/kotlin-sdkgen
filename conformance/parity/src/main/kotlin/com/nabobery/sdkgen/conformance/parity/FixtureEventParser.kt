package com.nabobery.sdkgen.conformance.parity

import kotlinx.serialization.json.Json
import java.io.File
import java.nio.charset.StandardCharsets.UTF_8
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

internal object FixtureEventParser {
    const val FRAME_PREFIX: String = "SDKGEN_PARITY_EVENT "

    private val json =
        Json {
            ignoreUnknownKeys = false
            explicitNulls = false
        }

    fun parseFixtureEvents(
        events: ByteArray,
        expectedFixtureIds: Set<String>,
        expectedRunId: String? = null,
    ): Map<String, FixtureResult> = parseFixtureEvents(events.toString(UTF_8), expectedFixtureIds, expectedRunId)

    fun parseFixtureEvents(
        events: String,
        expectedFixtureIds: Set<String>,
        expectedRunId: String? = null,
    ): Map<String, FixtureResult> {
        val states = HashMap<String, FixtureLifecycleState>()
        val results = HashMap<String, FixtureResult>()

        val lines = events.lineSequence().toList()
        for ((index, line) in lines.withIndex()) {
            if (!line.startsWith(FRAME_PREFIX)) continue
            val frame = line.removePrefix(FRAME_PREFIX)
            require(frame.isNotBlank()) { "Malformed fixture event at line ${index + 1}: empty frame" }
            val fixtureEvent =
                try {
                    json.decodeFromString<FixtureEvent>(frame)
                } catch (exception: Exception) {
                    throw IllegalArgumentException(
                        "Malformed fixture event at line ${index + 1}: $frame",
                        exception,
                    )
                }
            val fixtureId = fixtureEvent.fixtureId
            if (expectedRunId != null) {
                require(fixtureEvent.runId == expectedRunId) {
                    "Mismatched fixture run id at line ${index + 1}"
                }
            }
            require(expectedFixtureIds.contains(fixtureId)) {
                "Unknown fixture id '$fixtureId' at line ${index + 1}"
            }

            when (states[fixtureId]) {
                null -> {
                    require(fixtureEvent.event == FixtureEventType.START) {
                        "Out-of-order event for fixture '$fixtureId' at line ${index + 1}: ${fixtureEvent.event.serialValue()} before START"
                    }
                    states[fixtureId] = FixtureLifecycleState.STARTED
                }

                FixtureLifecycleState.STARTED -> {
                    when (fixtureEvent.event) {
                        FixtureEventType.START -> {
                            throw IllegalArgumentException(
                                "Duplicate START event for fixture '$fixtureId' at line ${index + 1}",
                            )
                        }

                        FixtureEventType.PASS -> {
                            states[fixtureId] = FixtureLifecycleState.FINISHED
                            results[fixtureId] =
                                FixtureResult(
                                    fixtureId = fixtureId,
                                    status = ParityStatus.PASSED,
                                    reason = null,
                                )
                        }

                        FixtureEventType.FAIL -> {
                            states[fixtureId] = FixtureLifecycleState.FINISHED
                            require(!fixtureEvent.error.isNullOrBlank()) {
                                "FAIL event for fixture '$fixtureId' at line ${index + 1} is missing error"
                            }
                            results[fixtureId] =
                                FixtureResult(
                                    fixtureId = fixtureId,
                                    status = ParityStatus.FAILED,
                                    reason = fixtureEvent.error,
                                )
                        }
                    }
                }

                FixtureLifecycleState.FINISHED -> {
                    throw IllegalArgumentException(
                        "Duplicate terminal event for fixture '$fixtureId' at line ${index + 1}",
                    )
                }
            }
        }

        val unfinished =
            states
                .filterValues { it == FixtureLifecycleState.STARTED }
                .keys
                .sorted()
        if (unfinished.isNotEmpty()) {
            throw IllegalArgumentException(
                "Truncated fixture stream: ${unfinished.joinToString()} missing terminal event",
            )
        }
        return results.toSortedMap()
    }
}

internal object CanonicalEvidenceWriter {
    private val json =
        Json {
            prettyPrint = true
            encodeDefaults = true
        }

    fun renderCanonicalEvidence(bundle: EvidenceBundle): String {
        val canonicalBundle =
            bundle.copy(
                execution =
                    bundle.execution.copy(
                        requestedFixtureIds = bundle.execution.requestedFixtureIds.sorted(),
                        startedFixtureIds = bundle.execution.startedFixtureIds.sorted(),
                        passedFixtureIds = bundle.execution.passedFixtureIds.sorted(),
                        failedFixtureIds = bundle.execution.failedFixtureIds.sorted(),
                    ),
                rows = bundle.rows.sortedBy { it.id },
            )
        return json.encodeToString(canonicalBundle) + "\n"
    }

    fun writeEvidenceAndSidecar(
        bundle: EvidenceBundle,
        destination: File,
    ): String {
        val canonical = renderCanonicalEvidence(bundle)
        val canonicalBytes = canonical.toByteArray(UTF_8)
        val evidenceSha = canonicalBytes.sha256()
        writeAtomic(destination, canonicalBytes)
        writeAtomic(File("${destination.path}.sha256"), "$evidenceSha\n".toByteArray(UTF_8))
        return evidenceSha
    }

    private fun writeAtomic(
        destination: File,
        bytes: ByteArray,
    ) {
        destination.parentFile?.mkdirs()
        val targetPath = destination.toPath()
        val tempPath =
            Files.createTempFile(targetPath.parent ?: Path.of("."), "tmp-${destination.name}", ".tmp")
        Files.write(tempPath, bytes)
        try {
            Files.move(tempPath, targetPath, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE)
        } catch (_: Exception) {
            Files.move(tempPath, targetPath, StandardCopyOption.REPLACE_EXISTING)
        }
    }
}

private enum class FixtureLifecycleState {
    STARTED,
    FINISHED,
}

internal fun FixtureEventType.serialValue(): String =
    when (this) {
        FixtureEventType.START -> "START"
        FixtureEventType.PASS -> "PASS"
        FixtureEventType.FAIL -> "FAIL"
    }
