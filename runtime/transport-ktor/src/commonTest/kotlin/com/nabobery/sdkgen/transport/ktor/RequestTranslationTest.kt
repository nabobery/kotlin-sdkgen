package com.nabobery.sdkgen.transport.ktor

import com.nabobery.sdkgen.runtime.SdkBodyOwnership
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkTransportException
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.engine.mock.toByteArray
import io.ktor.client.request.HttpRequestData
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertSame
import kotlin.test.assertTrue

internal class RequestTranslationTest {
    @Test
    fun translatesMethodUrlAndPreservesRepeatedHeaderOrder() =
        runTest {
            var captured: HttpRequestData? = null
            val client =
                HttpClient(MockEngine) {
                    engine {
                        addHandler { request ->
                            captured = request
                            respond("", HttpStatusCode.OK, headersOf())
                        }
                    }
                }
            val transport = KtorSdkTransport(client)

            transport.execute(
                testRequest(
                    method = "POST",
                    uri = "https://example.test/things?x=1",
                    headers =
                        listOf(
                            SdkHeader("X-Trace", "one"),
                            SdkHeader("X-Trace", "two"),
                            SdkHeader("User-Agent", "sdkgen-test/1.0"),
                        ),
                ),
            )

            val request = requireNotNull(captured)
            assertEquals("POST", request.method.value)
            assertEquals("https://example.test/things?x=1", request.url.toString())
            assertEquals(listOf("one", "two"), request.headers.getAll("X-Trace"))
            assertEquals("sdkgen-test/1.0", request.headers["User-Agent"])
        }

    @Test
    fun translatesBytesBodyWithContentType() =
        runTest {
            var captured: HttpRequestData? = null
            val client =
                HttpClient(MockEngine) {
                    engine {
                        addHandler { request ->
                            captured = request
                            respond("", HttpStatusCode.OK, headersOf())
                        }
                    }
                }
            val transport = KtorSdkTransport(client)
            val payload = "hello world".encodeToByteArray()

            transport.execute(
                testRequest(
                    method = "PUT",
                    body = SdkRequestBody.Bytes(payload, "application/json"),
                ),
            )

            val request = requireNotNull(captured)
            assertContentEquals(payload, request.body.toByteArray())
            assertEquals("application/json", request.body.contentType?.toString())
        }

    @Test
    fun skipsUnsafeContentHeadersLettingBodyDriveThem() =
        runTest {
            var captured: HttpRequestData? = null
            val client =
                HttpClient(MockEngine) {
                    engine {
                        addHandler { request ->
                            captured = request
                            respond("", HttpStatusCode.OK, headersOf())
                        }
                    }
                }
            val transport = KtorSdkTransport(client)

            transport.execute(
                testRequest(
                    method = "POST",
                    headers =
                        listOf(
                            SdkHeader("Content-Type", "text/plain"),
                            SdkHeader("Content-Length", "999"),
                        ),
                    body = SdkRequestBody.Bytes("abc".encodeToByteArray(), "application/json"),
                ),
            )

            val request = requireNotNull(captured)
            // The body's own contentType wins; the redundant header entry was never appended to the wire headers.
            assertEquals("application/json", request.body.contentType?.toString())
            assertEquals(3L, request.body.contentLength)
        }

    @Test
    fun oneShotBodyIsStreamedNotBufferedAndInvokedOnce() =
        runTest {
            var invocationCount = 0
            var drainedBytes: ByteArray? = null
            val client =
                HttpClient(MockEngine) {
                    engine {
                        addHandler { request ->
                            // A real engine drains the outgoing body while sending the request; MockEngine leaves
                            // that to the handler, so this mirrors that by draining it here.
                            drainedBytes = request.body.toByteArray()
                            respond("", HttpStatusCode.OK, headersOf())
                        }
                    }
                }
            val transport = KtorSdkTransport(client)
            val chunks = listOf("part-one-".encodeToByteArray(), "part-two".encodeToByteArray())
            val oneShotStream = countingChunkedStream(chunks) { invocationCount += 1 }
            val body =
                SdkRequestBody.OneShot(
                    stream = oneShotStream,
                    contentType = "application/octet-stream",
                    contentLength = chunks.sumOf { it.size }.toLong(),
                )

            transport.execute(testRequest(method = "POST", body = body))

            assertEquals(1, invocationCount)
            val expected = chunks.reduce { a, b -> a + b }
            assertContentEquals(expected, requireNotNull(drainedBytes))
        }

    @Test
    fun returnsRedirectResponseWithoutFollowingIt() =
        runTest {
            var handled = 0
            val client =
                HttpClient(MockEngine) {
                    engine {
                        addHandler {
                            handled += 1
                            if (handled == 1) {
                                respond(
                                    "redirect",
                                    HttpStatusCode.Found,
                                    headersOf(HttpHeaders.Location, "https://example.test/final"),
                                )
                            } else {
                                respond("followed", HttpStatusCode.OK, headersOf())
                            }
                        }
                    }
                }
            val transport = KtorSdkTransport(client)

            val response = transport.execute(testRequest(uri = "https://example.test/start"))

            assertEquals(HttpStatusCode.Found.value, response.statusCode)
            assertEquals(1, handled)
            client.close()
        }

    @Test
    fun preservesTypedPreResponseFailureAndDeliverySafety() =
        runTest {
            val engineCause = IllegalStateException("connection refused")
            val typedFailure =
                SdkTransportException(
                    message = "connection failed before send",
                    operationId = "test-operation",
                    cause = engineCause,
                    requestMayHaveReachedServer = false,
                )
            val client =
                HttpClient(MockEngine) {
                    engine {
                        addHandler { throw typedFailure }
                    }
                }
            val transport = KtorSdkTransport(client)

            val failure = assertFailsWith<SdkTransportException> { transport.execute(testRequest()) }

            assertSame(typedFailure, failure)
            assertEquals(false, failure.requestMayHaveReachedServer)
            assertSame(engineCause, failure.cause)
        }

    @Test
    fun transportOwnedOneShotClosesExactlyOnceWhenRequestTranslationFailsBeforeWrite() =
        runTest {
            val stream = RecordingStream()
            val client =
                HttpClient(MockEngine) {
                    engine {
                        addHandler { respond("", HttpStatusCode.OK, headersOf()) }
                    }
                }
            val transport = KtorSdkTransport(client)

            assertFailsWith<Throwable> {
                transport.execute(
                    testRequest(
                        method = "POST",
                        headers = listOf(SdkHeader("Bad\nHeader", "value")),
                        body = oneShot(stream, SdkBodyOwnership.TRANSPORT),
                    ),
                )
            }

            assertEquals(1, stream.closeCount)
            assertTrue(stream.closeCause != null)
            assertEquals(0, stream.readCount)
            client.close()
        }

    @Test
    fun invalidContentTypeClosesOnlyTransportOwnedOneShotExactlyOnce() =
        runTest {
            val transportOwned = RecordingStream()
            val runtimeOwned = RecordingStream()
            val client =
                HttpClient(MockEngine) {
                    engine {
                        addHandler { respond("", HttpStatusCode.OK, headersOf()) }
                    }
                }
            val transport = KtorSdkTransport(client)

            assertFailsWith<Throwable> {
                transport.execute(
                    testRequest(
                        method = "POST",
                        body =
                            oneShot(
                                transportOwned,
                                SdkBodyOwnership.TRANSPORT,
                                contentType = "invalid content type",
                            ),
                    ),
                )
            }
            assertFailsWith<Throwable> {
                transport.execute(
                    testRequest(
                        method = "POST",
                        body = oneShot(runtimeOwned, SdkBodyOwnership.RUNTIME, contentType = "invalid content type"),
                    ),
                )
            }

            assertEquals(1, transportOwned.closeCount)
            assertTrue(transportOwned.closeCause != null)
            assertEquals(0, runtimeOwned.closeCount)
            client.close()
        }

    @Test
    fun engineRejectionBeforeConsumptionClosesOnlyTransportOwnedOneShotExactlyOnce() =
        runTest {
            val rejection = IllegalStateException("engine rejected request")
            val client =
                HttpClient(MockEngine) {
                    engine {
                        addHandler { throw rejection }
                    }
                }
            val transport = KtorSdkTransport(client)
            val transportOwned = RecordingStream()
            val runtimeOwned = RecordingStream()

            val transportFailure =
                assertFailsWith<SdkTransportException> {
                    transport.execute(
                        testRequest(method = "POST", body = oneShot(transportOwned, SdkBodyOwnership.TRANSPORT)),
                    )
                }
            assertFailsWith<SdkTransportException> {
                transport.execute(
                    testRequest(method = "POST", body = oneShot(runtimeOwned, SdkBodyOwnership.RUNTIME)),
                )
            }

            assertEquals(1, transportOwned.closeCount)
            assertSame(transportFailure, transportOwned.closeCause)
            assertEquals(0, transportOwned.readCount)
            assertEquals(0, runtimeOwned.closeCount)
            client.close()
        }

    @Test
    fun replayFactoryProducedTransportOwnedOneShotClosesExactlyOnceWhenEngineRejectsBeforeConsumption() =
        runTest {
            val rejection = IllegalStateException("engine rejected request")
            val client =
                HttpClient(MockEngine) {
                    engine {
                        addHandler { throw rejection }
                    }
                }
            val transport = KtorSdkTransport(client)
            val produced = RecordingStream()
            var createCount = 0
            val body =
                SdkRequestBody.ReplayFactory(contentType = "application/octet-stream") {
                    createCount += 1
                    oneShot(produced, SdkBodyOwnership.TRANSPORT)
                }

            val failure =
                assertFailsWith<SdkTransportException> {
                    transport.execute(testRequest(method = "POST", body = body))
                }

            assertEquals(1, createCount)
            assertEquals(1, produced.closeCount)
            assertSame(failure, produced.closeCause)
            assertEquals(0, produced.readCount)
            client.close()
        }

    @Test
    fun replayFactoryBodyProducesFreshInstancePerExecuteCallWithIdenticalBytes() =
        runTest {
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
            assertEquals(2, captured.size)
            val first = captured[0].body.toByteArray()
            val second = captured[1].body.toByteArray()
            assertContentEquals(first, second)
            assertContentEquals("replayed-payload".encodeToByteArray(), first)
        }
}

private fun oneShot(
    stream: SdkByteStream,
    ownership: SdkBodyOwnership,
    contentType: String = "application/octet-stream",
): SdkRequestBody.OneShot =
    SdkRequestBody.OneShot(
        stream = stream,
        contentType = contentType,
        ownership = ownership,
    )

private class RecordingStream : SdkByteStream {
    var readCount: Int = 0
        private set
    var closeCount: Int = 0
        private set
    var closeCause: Throwable? = null
        private set

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        readCount += 1
        return null
    }

    override fun close(cause: Throwable?) {
        closeCount += 1
        if (closeCount == 1) closeCause = cause
    }
}

private fun countingChunkedStream(
    chunks: List<ByteArray>,
    onRead: () -> Unit,
): SdkByteStream {
    var invoked = false
    val remaining = chunks.toMutableList()
    return object : SdkByteStream {
        override suspend fun readChunk(maxBytes: Int): ByteArray? {
            if (!invoked) {
                invoked = true
                onRead()
            }
            return remaining.removeFirstOrNull()
        }

        override fun close(cause: Throwable?) {}
    }
}
