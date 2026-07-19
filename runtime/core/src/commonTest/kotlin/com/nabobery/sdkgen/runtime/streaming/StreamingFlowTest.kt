package com.nabobery.sdkgen.runtime.streaming

import com.nabobery.sdkgen.runtime.EventMatcher
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkSerializationException
import com.nabobery.sdkgen.runtime.SdkStreamingException
import com.nabobery.sdkgen.runtime.StreamingDescriptor
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.cancellation.CancellationException
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame
import kotlin.test.assertTrue

internal class StreamingFlowTest {
    @Test
    fun sseFlowIsColdIncrementalAndStopsBeforeSentinel() =
        runStreamingSuspend {
            var opens = 0
            val streams = mutableListOf<RecordingByteStream>()
            val provider = {
                opens += 1
                RecordingByteStream(oneByteChunks("data: one\n\ndata: [DONE]\n\ndata: ignored\n\n")).also(streams::add)
            }
            val flow = sseFlow(provider, StreamingDescriptor.ServerSentEvents(terminalSentinel = "[DONE]"))

            assertEquals(listOf("one"), flow.toList().map(SseEvent::data))
            assertEquals(listOf("one"), flow.toList().map(SseEvent::data))
            assertEquals(2, opens)
            assertTrue(streams.all { it.closed && it.closeCause == null })
            assertTrue(streams.all { it.reads < it.initialChunkCount })
        }

    @Test
    fun sseFlowTurnsMatchingInBandErrorIntoBoundedTypedFailure() =
        runStreamingSuspend {
            val payload = "x".repeat(70 * 1024)
            val stream = RecordingByteStream(listOf("event: error\ndata: $payload\n\n".encodeToByteArray()))

            val failure =
                assertFailsWith<SdkStreamingException> {
                    sseFlow(
                        { stream },
                        StreamingDescriptor.ServerSentEvents(
                            inBandError = EventMatcher.FieldEquals("eventType", "error"),
                        ),
                    ).collect()
                }

            assertTrue(requireNotNull(failure.message).encodeToByteArray().size <= 64 * 1024 + 256)
            assertTrue(requireNotNull(failure.message).contains("eventType=error"))
            assertSame(failure, stream.closeCause)
        }

    @Test
    fun sseFlowPreservesCancellationIdentityAndCloseCause() =
        runStreamingSuspend {
            val cancellation = CancellationException("cancel")
            val stream = RecordingByteStream(emptyList(), failure = cancellation)

            val thrown =
                assertFailsWith<CancellationException> {
                    sseFlow({ stream }, StreamingDescriptor.ServerSentEvents()).collect()
                }

            assertSame(cancellation, thrown)
            assertSame(cancellation, stream.closeCause)
        }

    @Test
    fun sseFlowClosesNormallyAtPlainEofWithoutSentinel() =
        runStreamingSuspend {
            val stream = RecordingByteStream(oneByteChunks("data: one\n\n"))

            val events = sseFlow({ stream }, StreamingDescriptor.ServerSentEvents()).toList()

            assertEquals(listOf("one"), events.map(SseEvent::data))
            assertTrue(stream.closed)
            assertEquals(null, stream.closeCause)
        }

    @Test
    fun jsonLinesFlowClosesNormallyAtPlainEofWithoutSentinel() =
        runStreamingSuspend {
            val stream = RecordingByteStream(oneByteChunks("1\n2\n"))

            val values = jsonLinesFlow({ stream }, StreamingDescriptor.JsonLines(), String::toInt).toList()

            assertEquals(listOf(1, 2), values)
            assertTrue(stream.closed)
            assertEquals(null, stream.closeCause)
        }

    @Test
    fun downstreamFailureClosesStreamWithSameCause() =
        runStreamingSuspend {
            val downstream = IllegalStateException("consumer failed")
            val stream = RecordingByteStream(listOf("data: one\n\n".encodeToByteArray()))

            val thrown =
                assertFailsWith<IllegalStateException> {
                    sseFlow({ stream }, StreamingDescriptor.ServerSentEvents()).collect { throw downstream }
                }

            assertSame(downstream, thrown)
            assertSame(downstream, stream.closeCause)
        }

    @Test
    fun jsonLinesSkipsBlankLinesStopsAtSentinelAndDecodesIncrementally() =
        runStreamingSuspend {
            val stream = RecordingByteStream(oneByteChunks("1\n \t \n\r\n2\r[DONE]\n3\n"))

            val values =
                jsonLinesFlow(
                    { stream },
                    StreamingDescriptor.JsonLines(terminalSentinel = "[DONE]"),
                    String::toInt,
                ).toList()

            assertEquals(listOf(1, 2), values)
            assertTrue(stream.closed)
            assertEquals(null, stream.closeCause)
        }

    @Test
    fun jsonLinesWrapsDecodeFailureWithLineNumberAndCause() =
        runStreamingSuspend {
            val decodeFailure = IllegalArgumentException("bad json")
            val stream = RecordingByteStream(listOf("\nvalid\ninvalid\n".encodeToByteArray()))

            val thrown =
                assertFailsWith<SdkSerializationException> {
                    jsonLinesFlow(
                        { stream },
                        StreamingDescriptor.JsonLines(),
                    ) { line ->
                        if (line == "invalid") throw decodeFailure
                        line
                    }.collect()
                }

            assertTrue(requireNotNull(thrown.message).contains("line 3"))
            assertSame(decodeFailure, thrown.cause)
            assertSame(thrown, stream.closeCause)
        }

    @Test
    fun decodeHelpersPreserveCancellationIdentity() =
        runStreamingSuspend {
            val cancellation = CancellationException("decode cancelled")

            val sseThrown =
                assertFailsWith<CancellationException> {
                    flowOf(SseEvent("value")).decodeData<String> { throw cancellation }.collect()
                }
            assertSame(cancellation, sseThrown)

            val jsonThrown =
                assertFailsWith<CancellationException> {
                    jsonLinesFlow(
                        { RecordingByteStream(listOf("value\n".encodeToByteArray())) },
                        StreamingDescriptor.JsonLines(),
                    ) { throw cancellation }.collect()
                }
            assertSame(cancellation, jsonThrown)
        }

    @Test
    fun decodeDataSkipsEmptyEventsAndWrapsDecodeFailures() =
        runStreamingSuspend {
            val values =
                flowOf(
                    SseEvent(""),
                    SseEvent("1"),
                    SseEvent("2"),
                ).decodeData(String::toInt).toList()

            assertEquals(listOf(1, 2), values)

            val cause = IllegalArgumentException("bad")
            val failure =
                assertFailsWith<SdkSerializationException> {
                    flowOf(SseEvent("bad")).decodeData<Int> { throw cause }.collect()
                }
            assertSame(cause, failure.cause)
        }

    private fun oneByteChunks(value: String): List<ByteArray> = value.encodeToByteArray().map { byteArrayOf(it) }
}

private fun <T> runStreamingSuspend(block: suspend () -> T): T {
    var outcome: Result<T>? = null
    block.startCoroutine(
        object : Continuation<T> {
            override val context = EmptyCoroutineContext

            override fun resumeWith(result: Result<T>) {
                outcome = result
            }
        },
    )
    return requireNotNull(outcome).getOrThrow()
}

private class RecordingByteStream(
    chunks: List<ByteArray>,
    private val failure: Throwable? = null,
) : SdkByteStream {
    private val chunks = chunks.toMutableList()
    val initialChunkCount: Int = chunks.size
    var reads: Int = 0
    var closed: Boolean = false
    var closeCause: Throwable? = null

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        reads += 1
        failure?.let { throw it }
        return chunks.removeFirstOrNull()
    }

    override fun close(cause: Throwable?) {
        if (!closed) {
            closed = true
            closeCause = cause
        }
    }
}
