package com.nabobery.sdkgen.transport.ktor

import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransportException
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.engine.mock.toByteArray
import io.ktor.client.request.HttpRequestData
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import io.ktor.utils.io.ByteChannel
import io.ktor.utils.io.writeFully
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.awaitCancellation
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.yield
import kotlin.coroutines.cancellation.CancellationException
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertSame
import kotlin.test.assertTrue

/**
 * Streaming-execution tests run under [runBlocking] rather than `kotlinx.coroutines.test.runTest`: MockEngine
 * genuinely hops onto its own engine dispatcher partway through a call, and `runTest`'s virtual `TestDispatcher`
 * cannot observe (or wait for) that real-dispatcher work, which surfaced as flaky `UncompletedCoroutinesError`
 * failures when this suite was first written against `runTest`. A real blocking coroutine sidesteps that mismatch
 * entirely, at the cost of these tests living in `jvmTest` instead of `commonTest`. Every test is wrapped in a
 * [withTimeout] so a real regression fails fast with a clear `TimeoutCancellationException` instead of hanging the
 * whole Gradle run — exactly what happened once while this suite was being developed (see
 * `KtorChannelAdapter.kt`'s KDoc for the underlying bug that caused it: `readRemaining(max)` blocks until `max`
 * bytes accumulate or the channel closes, not until data is merely available).
 */
internal class KtorStreamingJvmTest {
    @Test
    fun deliversChunksIncrementallyWithoutWaitingForTheWholeBody() =
        runBlocking {
            withTimeout(15_000) {
                val channel = ByteChannel()
                val releaseSecondChunk = CompletableDeferred<Unit>()
                val secondChunkSent = CompletableDeferred<Unit>()
                val client =
                    HttpClient(MockEngine) {
                        engine {
                            addHandler {
                                CoroutineScope(coroutineContext).launch {
                                    channel.writeFully("first-".encodeToByteArray())
                                    channel.flush()
                                    releaseSecondChunk.await()
                                    channel.writeFully("second".encodeToByteArray())
                                    channel.flush()
                                    channel.close()
                                    secondChunkSent.complete(Unit)
                                }
                                respond(channel, HttpStatusCode.OK, headersOf())
                            }
                        }
                    }
                val transport = KtorSdkTransport(client)

                val response = transport.execute(testRequest(expectedResponseMode = SdkResponseMode.STREAMING))
                val first = response.body.readChunk()

                // The producer is still gated on releaseSecondChunk here: the first chunk arrived without the
                // adapter waiting for (or buffering) the whole body.
                assertFalse(secondChunkSent.isCompleted)
                assertContentEquals("first-".encodeToByteArray(), first)

                releaseSecondChunk.complete(Unit)
                val second = response.body.readChunk()
                assertContentEquals("second".encodeToByteArray(), second)
                assertNull(response.body.readChunk())
                client.close()
            }
        }

    @Test
    fun bufferedResponsesAreIncrementalAndDoNotReadAheadBeforeConsumerDemand() =
        runBlocking {
            withTimeout(15_000) {
                val channel = ByteChannel()
                val releaseSecondChunk = CompletableDeferred<Unit>()
                val secondChunkSent = CompletableDeferred<Unit>()
                val client =
                    HttpClient(MockEngine) {
                        engine {
                            addHandler {
                                CoroutineScope(coroutineContext).launch {
                                    channel.writeFully("first-".encodeToByteArray())
                                    channel.flush()
                                    releaseSecondChunk.await()
                                    channel.writeFully("second".encodeToByteArray())
                                    channel.flush()
                                    channel.close()
                                    secondChunkSent.complete(Unit)
                                }
                                respond(channel, HttpStatusCode.OK, headersOf())
                            }
                        }
                    }
                val transport = KtorSdkTransport(client)

                val response = transport.execute(testRequest())
                assertFalse(secondChunkSent.isCompleted, "Buffered execute read ahead of consumer demand")
                assertContentEquals("first-".encodeToByteArray(), response.body.readChunk())

                releaseSecondChunk.complete(Unit)
                assertContentEquals("second".encodeToByteArray(), response.body.readChunk())
                assertNull(response.body.readChunk())
                response.body.close()
                client.close()
            }
        }

    @Test
    fun bytesSurviveHostileChunkBoundariesUnmodified() =
        runBlocking {
            withTimeout(15_000) {
                val payload = ByteArray(5_000) { ('a' + (it % 26)).code.toByte() }
                val channel = ByteChannel()
                val client =
                    HttpClient(MockEngine) {
                        engine {
                            addHandler {
                                CoroutineScope(coroutineContext).launch {
                                    val random = Random(42)
                                    var offset = 0
                                    while (offset < payload.size) {
                                        val size = random.nextInt(1, 7)
                                        val end = (offset + size).coerceAtMost(payload.size)
                                        channel.writeFully(payload, offset, end)
                                        channel.flush()
                                        offset = end
                                    }
                                    channel.close()
                                }
                                respond(channel, HttpStatusCode.OK, headersOf())
                            }
                        }
                    }
                val transport = KtorSdkTransport(client)

                val response = transport.execute(testRequest(expectedResponseMode = SdkResponseMode.STREAMING))
                val collected = mutableListOf<Byte>()
                while (true) {
                    // Deliberately hostile reader-side chunk size too: never aligned with the writer's boundaries.
                    val chunk = response.body.readChunk(maxBytes = 3) ?: break
                    collected += chunk.toList()
                }

                assertContentEquals(payload, collected.toByteArray())
                client.close()
            }
        }

    @Test
    fun closingTheNeutralStreamCancelsTheUnderlyingKtorReadChannel() =
        runBlocking {
            withTimeout(15_000) {
                val channel = ByteChannel()
                // Deliberately NOT a descendant of this test's own coroutine: this writer stands in for a real
                // long-lived *server* connection, which structurally has nothing to do with the *client's* call
                // stack. Reusing `coroutineContext` (as the other tests in this file do, since their writers all
                // complete on their own) would make MockEngine's per-call context — and this `awaitCancellation()`
                // writer that never completes on its own — a permanent structural child of this test's own
                // `runBlocking`/`withTimeout` job, which would then never reach a terminal state on its own. This
                // independent scope is explicitly cancelled at the end instead.
                val serverScope = CoroutineScope(SupervisorJob())
                val client =
                    HttpClient(MockEngine) {
                        engine {
                            addHandler {
                                serverScope.launch {
                                    channel.writeFully("chunk-1".encodeToByteArray())
                                    channel.flush()
                                    // Stays alive (not closed) until cancelled, standing in for a real long-lived
                                    // connection that only tears down when the reader disappears.
                                    awaitCancellation()
                                }
                                respond(channel, HttpStatusCode.OK, headersOf())
                            }
                        }
                    }
                val transport = KtorSdkTransport(client)

                val response = transport.execute(testRequest(expectedResponseMode = SdkResponseMode.STREAMING))
                assertContentEquals("chunk-1".encodeToByteArray(), response.body.readChunk())

                val cancellation = CancellationException("consumer abandoned the stream")
                response.body.close(cancellation)

                // Cancelling the neutral stream cancelled the coroutine reading from `channel`, which cancels the
                // channel itself for both directions — the concrete, MockEngine-observable proxy for "the ktor call
                // was torn down" available without a real network engine.
                awaitChannelClosedForRead(channel)
                assertTrue(channel.isClosedForRead)
                client.close()
                serverScope.cancel()
            }
        }

    @Test
    fun exchangeObserverReportsActualPumpTerminationWithConsumerCloseIdentity() =
        runBlocking {
            withTimeout(15_000) {
                val channel = ByteChannel()
                val serverScope = CoroutineScope(SupervisorJob())
                val terminated = CompletableDeferred<Throwable?>()
                val client =
                    HttpClient(MockEngine) {
                        engine {
                            addHandler {
                                serverScope.launch {
                                    channel.writeFully("chunk-1".encodeToByteArray())
                                    channel.flush()
                                    awaitCancellation()
                                }
                                respond(channel, HttpStatusCode.OK, headersOf())
                            }
                        }
                    }
                val observer =
                    object : KtorExchangeObserver {
                        override fun onResponseStarted(): Long = 17L

                        override fun onResponseTerminated(
                            exchangeId: Long,
                            cause: Throwable?,
                        ) {
                            assertEquals(17L, exchangeId)
                            terminated.complete(cause)
                        }
                    }
                val transport = KtorSdkTransport(client, observer)
                val response = transport.execute(testRequest(expectedResponseMode = SdkResponseMode.STREAMING))
                assertContentEquals("chunk-1".encodeToByteArray(), response.body.readChunk())
                val cancellation = CancellationException("consumer stopped")

                response.body.close(cancellation)
                val observed = terminated.await()

                assertSame(cancellation, observed)
                assertTrue(channel.isClosedForRead)
                client.close()
                serverScope.cancel()
            }
        }

    @Test
    fun engineFailureMidStreamSurfacesAsTypedFailureFromReadChunk() =
        runBlocking {
            withTimeout(15_000) {
                val channel = ByteChannel()
                val engineFailure = IllegalStateException("engine broke")
                val firstChunkConsumed = CompletableDeferred<Unit>()
                val client =
                    HttpClient(MockEngine) {
                        engine {
                            addHandler {
                                CoroutineScope(coroutineContext).launch {
                                    channel.writeFully("chunk-1".encodeToByteArray())
                                    channel.flush()
                                    // cancel() discards any buffered-but-unread bytes, so wait for the reader to
                                    // actually drain "chunk-1" first — otherwise the abort could race ahead of it.
                                    firstChunkConsumed.await()
                                    channel.cancel(engineFailure)
                                }
                                respond(channel, HttpStatusCode.OK, headersOf())
                            }
                        }
                    }
                val transport = KtorSdkTransport(client)

                val response = transport.execute(testRequest(expectedResponseMode = SdkResponseMode.STREAMING))
                assertContentEquals("chunk-1".encodeToByteArray(), response.body.readChunk())
                firstChunkConsumed.complete(Unit)

                val failure = assertFailsWith<SdkTransportException> { response.body.readChunk() }
                // ktor wraps the cancel() cause in its own ClosedByteChannelException(s) before it reaches us, so
                // only the *chain* is asserted here, not immediate identity (see KtorResponseByteStream's KDoc).
                assertTrue(generateSequence(failure as Throwable) { it.cause }.any { it === engineFailure })

                response.body.close(failure)
                assertSame(failure, (response.body as KtorResponseByteStream).closeCause)
                client.close()
            }
        }

    @Test
    fun consumerCancellationBeforeHeadersArriveFailsExecuteWithMatchingCancellation() =
        runBlocking {
            withTimeout(15_000) {
                val cancellation = CancellationException("cancel before connect")
                val client =
                    HttpClient(MockEngine) {
                        engine {
                            addHandler { throw cancellation }
                        }
                    }
                val transport = KtorSdkTransport(client)

                val failure =
                    assertFailsWith<CancellationException> {
                        transport.execute(testRequest(expectedResponseMode = SdkResponseMode.STREAMING))
                    }
                // Not asserted by identity here: `cancellation` crosses MockEngine's own internal dispatcher hop
                // (withContext(dispatcher + callContext) { handler(...) }) before it ever reaches this adapter's
                // code, and that boundary is outside this adapter's control — kotlinx.coroutines' JVM-only
                // stack-trace recovery can copy it there. This adapter's own Deferred hand-off (see
                // executeStreaming's KDoc) does not introduce a *second* such copy — it forwards whatever it
                // received unchanged, by reference, via a plain `throw` rather than by relying on the Deferred's own
                // exceptional-completion delivery.
                assertEquals(cancellation.message, failure.message)
                client.close()
            }
        }

    @Test
    fun consumerOwnedClientIsNeverClosedByTheTransportAndRemainsUsable() =
        runBlocking {
            withTimeout(15_000) {
                var handled = 0
                val client =
                    HttpClient(MockEngine) {
                        engine {
                            addHandler {
                                handled += 1
                                respond("ok-$handled", HttpStatusCode.OK, headersOf())
                            }
                        }
                    }
                val transport = KtorSdkTransport(client)

                transport.execute(testRequest())
                assertTrue(client.coroutineContext[Job]!!.isActive)

                // The same, still-open client serves a second call without the transport ever having reconfigured
                // or closed it.
                val second = transport.execute(testRequest())
                assertEquals(200, second.statusCode)
                assertEquals(2, handled)

                client.close()
            }
        }

    @Test
    fun replayFactoryBodyIsSentIdenticallyAcrossTwoPhysicalCalls() =
        runBlocking {
            withTimeout(15_000) {
                val captured = mutableListOf<HttpRequestData>()
                val client =
                    HttpClient(MockEngine) {
                        engine {
                            addHandler { request ->
                                captured += request
                                respond("", HttpStatusCode.OK, headersOf())
                            }
                        }
                    }
                val transport = KtorSdkTransport(client)
                var createCount = 0
                val body =
                    SdkRequestBody.ReplayFactory(contentType = "application/json") {
                        createCount += 1
                        SdkRequestBody.Bytes("replayed-payload".encodeToByteArray(), "application/json")
                    }

                transport.execute(testRequest(method = "POST", body = body))
                transport.execute(testRequest(method = "POST", body = body))

                assertEquals(2, createCount)
                val first = captured[0].body.toByteArray()
                val second = captured[1].body.toByteArray()
                assertContentEquals(first, second)
                assertContentEquals("replayed-payload".encodeToByteArray(), first)
                client.close()
            }
        }
}

/** Polls (cooperatively) until [channel] reports closed-for-read, to avoid a hard race against the cancelling job. */
private suspend fun awaitChannelClosedForRead(channel: ByteChannel) {
    var attempts = 0
    while (!channel.isClosedForRead && attempts < 1_000) {
        yield()
        attempts += 1
    }
}
