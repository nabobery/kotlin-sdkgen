package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.SdkBodyOwnership
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTimeoutException
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SdkTransportException
import com.nabobery.sdkgen.runtime.TimeoutPhase
import com.nabobery.sdkgen.runtime.TransportCapabilities
import com.nabobery.sdkgen.runtime.bodies.MultipartBody
import com.nabobery.sdkgen.runtime.resilience.SdkTimeoutGuard
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeout
import kotlin.coroutines.coroutineContext
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertIs
import kotlin.test.assertTrue

/**
 * Reusable conformance suite for an [SdkTransport] implementation.
 *
 * An adapter test subclasses this type, creates a fresh [ContractServer] (for example MockWebServer on JVM or a Ktor
 * MockEngine-backed implementation in portable tests), returns its adapter from [createTransport], and runs suspend
 * blocks with its platform test runner through [runTest]. Passing every applicable row is the adapter's transport
 * conformance claim. Capability-dependent rows are skipped only through the declared [expectedCapabilities]; ownership
 * is checked when [engineOwnershipProbe] is supplied. Adapters must include the consolidated
 * [contractSkipReportIsConsistent] output in their published conformance claim.
 *
 * Adapters may override rows only to map an engine-specific capability or failure mechanism onto the same portable
 * assertion. They must not weaken the base contract. The reference FakeTransport overrides selected fault rows solely to
 * add stronger scripted-Throwable identity assertions that real network engines cannot reproduce.
 *
 * ADR-0006 requires every adapter to rerun this suite whenever its underlying engine version changes.
 */
public abstract class SdkTransportContractKit {
    public abstract val expectedCapabilities: TransportCapabilities

    /** Non-blank reason for every capability-dependent row this adapter does not run. */
    public abstract val capabilitySkipReasons: Map<ContractCapability, String>

    private val recordedSkippedRows: MutableMap<String, String> = linkedMapOf()
    private val skippedCapabilities: MutableMap<String, ContractCapability> = linkedMapOf()

    /** Rows skipped by this kit instance, keyed by contract row name. */
    public val skippedRows: Map<String, String>
        get() = recordedSkippedRows.toMap()

    protected abstract fun createServer(): ContractServer

    protected abstract fun createTransport(server: ContractServer): SdkTransport

    protected abstract fun runTest(block: suspend () -> Unit)

    /** Optional probe for proving a caller-owned engine/client was not closed or mutated. */
    protected open fun engineOwnershipProbe(): EngineOwnershipProbe? = null

    /** Releases adapter-specific resources after a row. [ContractServer.close] is always called separately. */
    protected open fun tearDownTransport(transport: SdkTransport) {}

    public open fun bufferedRoundTripPreservesRequestAndRepeatedHeaders(): Unit =
        contractTest { server, transport ->
            val bytes = "request-body".encodeToByteArray()
            server.enqueue(
                exchange(
                    server,
                    "/ordinary",
                    method = "POST",
                    headers = listOf(SdkHeader("X-Multi", "one"), SdkHeader("x-multi", "two")),
                    requestBody = bytes,
                    response = ResponseScript(200, listOf(SdkHeader("Set-Cookie", "a=1")), chunks("response")),
                ),
            )
            val response =
                transport.execute(
                    request(
                        server,
                        "/ordinary",
                        method = "POST",
                        headers = listOf(SdkHeader("x-multi", "one"), SdkHeader("X-MULTI", "two")),
                        body = SdkRequestBody.Bytes(bytes, "application/octet-stream"),
                    ),
                )
            assertEquals(200, response.statusCode)
            assertContentEquals("response".encodeToByteArray(), readAll(response.body))
            response.body.close()
            server.assertResponseClosed(0, null)
        }

    /** Buffered responses must retain backpressure instead of slurping the full body inside the adapter. */
    public open fun bufferedResponseDoesNotReadAheadBeforeConsumerDemand(): Unit =
        contractTest { server, transport ->
            val gate = ChunkGate()
            server.enqueue(
                exchange(
                    server,
                    "/buffered-incremental",
                    response =
                        ResponseScript(
                            body = ResponseBodyScript.Chunks(listOf(byteArrayOf(1), byteArrayOf(2)), gate = gate),
                        ),
                ),
            )
            coroutineScope {
                val response =
                    async(start = CoroutineStart.UNDISPATCHED) {
                        transport.execute(request(server, "/buffered-incremental", mode = SdkResponseMode.BUFFERED))
                    }
                gate.awaitProduced(0)
                withTimeout(15_000) {
                    while (!response.isCompleted) kotlinx.coroutines.yield()
                }
                assertTrue(response.isCompleted, "Buffered execute read ahead instead of returning at response headers")
                val body = response.await().body
                assertContentEquals(byteArrayOf(1), body.readChunk())
                gate.release(0)
                assertContentEquals(byteArrayOf(2), body.readChunk())
                gate.release(1)
                assertEquals(null, body.readChunk())
                body.close()
            }
        }

    public open fun nonSuccessResponseBodyIsAvailable(): Unit =
        contractTest { server, transport ->
            server.enqueue(exchange(server, "/error", response = ResponseScript(422, body = chunks("problem"))))
            val response = transport.execute(request(server, "/error"))
            assertEquals(422, response.statusCode)
            assertContentEquals("problem".encodeToByteArray(), readAll(response.body))
            response.body.close()
        }

    public open fun emptyResponseBodyReachesEof(): Unit =
        contractTest { server, transport ->
            server.enqueue(exchange(server, "/empty"))
            val response = transport.execute(request(server, "/empty"))
            assertEquals(null, response.body.readChunk())
            response.body.close()
        }

    public open fun oneMiBResponseBodyIsByteFaithful(): Unit =
        contractTest { server, transport ->
            val payload = ByteArray(1024 * 1024) { (it % 251).toByte() }
            server.enqueue(
                exchange(
                    server,
                    "/large",
                    response = ResponseScript(body = ResponseBodyScript.Chunks(listOf(payload))),
                ),
            )
            val response = transport.execute(request(server, "/large"))
            assertContentEquals(payload, readAll(response.body))
            response.body.close()
        }

    public open fun responseClosePreservesNormalAndFailureCauses(): Unit =
        contractTest { server, transport ->
            server.enqueue(exchange(server, "/normal", response = ResponseScript(body = chunks("ok"))))
            val normal = transport.execute(request(server, "/normal"))
            readAll(normal.body)
            normal.body.close()
            server.assertResponseClosed(0, null)

            server.enqueue(exchange(server, "/decode-failure", response = ResponseScript(body = chunks("bad"))))
            val failed = transport.execute(request(server, "/decode-failure"))
            val cause = IllegalArgumentException("decode failed")
            failed.body.close(cause)
            server.assertResponseClosed(1, cause)
        }

    public open fun cancellationIdentityIsPreservedMidBody(): Unit =
        contractTest { server, transport ->
            val gate = ChunkGate()
            server.enqueue(
                exchange(
                    server,
                    "/cancel",
                    response =
                        ResponseScript(
                            body = ResponseBodyScript.Chunks(listOf(byteArrayOf(1), byteArrayOf(2)), gate = gate),
                        ),
                ),
            )
            val response = transport.execute(request(server, "/cancel", mode = SdkResponseMode.STREAMING))
            assertContentEquals(byteArrayOf(1), response.body.readChunk())
            var observed: CancellationException? = null
            val consumer =
                CoroutineScope(coroutineContext + Dispatchers.Unconfined).launch(start = CoroutineStart.UNDISPATCHED) {
                    try {
                        response.body.readChunk()
                        error("Expected the suspended stream read to be cancelled")
                    } catch (cancellation: CancellationException) {
                        response.body.close(cancellation)
                        observed = cancellation
                    }
                }
            val injected = CancellationException("contract-kit cancellation")
            consumer.cancel(injected)
            assertTrue(consumer.isCompleted, "Cancelled stream consumer did not complete promptly")
            val cancellation = requireNotNull(observed)
            // The observed exception must be the injected instance itself or carry it in its cause chain —
            // coroutine internals may wrap a supplied cancellation cause, but a transport that swallows the
            // original and substitutes an unrelated CancellationException fails this identity requirement.
            assertTrue(
                generateSequence<Throwable>(cancellation) { it.cause }.any { it === injected },
                "Observed cancellation does not carry the injected CancellationException by identity",
            )
            server.assertResponseClosed(0, cancellation)
        }

    public open fun callerOwnedEngineRemainsUnchanged(): Unit =
        contractTest { server, transport ->
            val probe = engineOwnershipProbe()
            if (skip("callerOwnedEngineRemainsUnchanged", ContractCapability.CALLER_OWNED_ENGINE, probe != null)) {
                return@contractTest
            }
            requireNotNull(probe)
            val before = probe.snapshot()
            server.enqueue(exchange(server, "/ownership"))
            transport.execute(request(server, "/ownership")).body.close()
            probe.assertUnchanged(before)
        }

    public open fun streamingChunksArriveIncrementally(): Unit =
        contractTest { server, transport ->
            if (skip(
                    "streamingChunksArriveIncrementally",
                    ContractCapability.STREAMING,
                    expectedCapabilities.supportsStreaming,
                )
            ) {
                return@contractTest
            }
            val gate = ChunkGate()
            server.enqueue(
                exchange(
                    server,
                    "/chunks",
                    response =
                        ResponseScript(
                            body =
                                ResponseBodyScript.Chunks(
                                    listOf(byteArrayOf(1), byteArrayOf(2), byteArrayOf(3)),
                                    gate = gate,
                                ),
                        ),
                ),
            )
            coroutineScope {
                val response =
                    async(start = CoroutineStart.UNDISPATCHED) {
                        transport.execute(request(server, "/chunks", mode = SdkResponseMode.STREAMING))
                    }
                gate.awaitProduced(0)
                withTimeout(15_000) {
                    while (!response.isCompleted) kotlinx.coroutines.yield()
                }
                assertTrue(response.isCompleted, "Streaming execute buffered the gated response body")
                val body = response.await().body
                assertContentEquals(byteArrayOf(1), body.readChunk(16))
                gate.release(0)
                assertContentEquals(byteArrayOf(2), body.readChunk(16))
                gate.release(1)
                assertContentEquals(byteArrayOf(3), body.readChunk(16))
                gate.release(2)
                assertEquals(null, body.readChunk(16))
                body.close()
            }
        }

    public open fun closingStreamMidBodyCancelsExchange(): Unit =
        contractTest { server, transport ->
            if (skip(
                    "closingStreamMidBodyCancelsExchange",
                    ContractCapability.STREAMING,
                    expectedCapabilities.supportsStreaming,
                )
            ) {
                return@contractTest
            }
            server.enqueue(
                exchange(
                    server,
                    "/close-mid-body",
                    response =
                        ResponseScript(
                            body =
                                ResponseBodyScript.Chunks(
                                    listOf(byteArrayOf(1), byteArrayOf(2)),
                                    gate = ChunkGate(),
                                ),
                        ),
                ),
            )
            val body = transport.execute(request(server, "/close-mid-body", mode = SdkResponseMode.STREAMING)).body
            assertContentEquals(byteArrayOf(1), body.readChunk())
            val cause = CancellationException("consumer stopped")
            body.close(cause)
            server.assertResponseClosed(0, cause)
        }

    public open fun hostileChunkSizesPreserveBytes(): Unit =
        contractTest { server, transport ->
            if (skip(
                    "hostileChunkSizesPreserveBytes",
                    ContractCapability.STREAMING,
                    expectedCapabilities.supportsStreaming,
                )
            ) {
                return@contractTest
            }
            val payload = "Aé🙂\r\nB\nC".encodeToByteArray()
            val pieces = payload.map { byteArrayOf(it) }
            server.enqueue(
                exchange(
                    server,
                    "/hostile",
                    response = ResponseScript(body = ResponseBodyScript.Chunks(pieces)),
                ),
            )
            val body = transport.execute(request(server, "/hostile", mode = SdkResponseMode.STREAMING)).body
            assertContentEquals(payload, readAll(body, 2))
            body.close()
        }

    public open fun sseBytesAreIncrementalAndUnmodified(): Unit =
        contractTest { server, transport ->
            if (skip(
                    "sseBytesAreIncrementalAndUnmodified",
                    ContractCapability.STREAMING,
                    expectedCapabilities.supportsStreaming,
                )
            ) {
                return@contractTest
            }
            val payload = "data: café\r\ndata: 🙂\n\n".encodeToByteArray()
            val pieces = payload.map { byteArrayOf(it) }
            val gate = ChunkGate()
            server.enqueue(
                exchange(
                    server,
                    "/sse",
                    response =
                        ResponseScript(
                            headers = listOf(SdkHeader("Content-Type", "text/event-stream")),
                            body = ResponseBodyScript.Chunks(pieces, gate = gate),
                        ),
                ),
            )
            val body = transport.execute(request(server, "/sse", mode = SdkResponseMode.STREAMING)).body
            val first = body.readChunk(64)
            assertContentEquals(byteArrayOf(payload[0]), first)
            gate.release(0)
            val collected = mutableListOf<ByteArray>()
            if (first != null) collected += first
            pieces.indices.drop(1).forEach { index ->
                val chunk = body.readChunk(64)
                assertTrue(chunk != null)
                collected += chunk
                gate.release(index)
            }
            assertEquals(null, body.readChunk(64))
            assertContentEquals(payload, collected.reduce(ByteArray::plus))
            body.close()
        }

    public open fun multipartBodyExecutesWithExactBytesAndReplays(): Unit =
        contractTest { server, transport ->
            val expected =
                "--contract-boundary\r\n" +
                    "Content-Disposition: form-data; name=\"field\"\r\n" +
                    "Content-Type: text/plain; charset=utf-8\r\n\r\n" +
                    "value\r\n" +
                    "--contract-boundary\r\n" +
                    "Content-Disposition: form-data; name=\"file\"; filename=\"a.bin\"\r\n" +
                    "Content-Type: application/octet-stream\r\n\r\n" +
                    " \r\n" +
                    "--contract-boundary--\r\n"
            val expectedBytes = expected.encodeToByteArray()
            val body =
                MultipartBody(boundaryProvider = { "contract-boundary" })
                    .text("field", "value")
                    .bytes("file", byteArrayOf(0, 1, 2), filename = "a.bin")
                    .build()
            repeat(2) { index ->
                server.enqueue(
                    exchange(
                        server,
                        "/multipart",
                        method = "POST",
                        requestBody = expectedBytes,
                        response = if (index == 0) ResponseScript(503) else ResponseScript(204),
                    ),
                )
                val attemptBody = (body as SdkRequestBody.ReplayFactory).create()
                transport.execute(request(server, "/multipart", method = "POST", body = attemptBody)).body.close()
            }
        }

    public open fun bytesAndReplayFactoryAreIdenticalAcrossAttempts(): Unit =
        contractTest { server, transport ->
            val bytes = "replay-me".encodeToByteArray()
            val bodies =
                listOf<SdkRequestBody>(
                    SdkRequestBody.Bytes(bytes, "text/plain"),
                    SdkRequestBody.ReplayFactory("text/plain", bytes.size.toLong()) {
                        SdkRequestBody.Bytes(bytes, "text/plain")
                    },
                )
            bodies.forEachIndexed { bodyIndex, body ->
                repeat(2) { attempt ->
                    val path = "/replay-$bodyIndex-$attempt"
                    server.enqueue(exchange(server, path, method = "POST", requestBody = bytes))
                    val attemptBody = if (body is SdkRequestBody.ReplayFactory) body.create() else body
                    transport.execute(request(server, path, method = "POST", body = attemptBody)).body.close()
                }
            }
        }

    public open fun oneShotBodyIsConsumedExactlyOnce(): Unit =
        contractTest { server, transport ->
            val stream = FakeByteStream(listOf("once".encodeToByteArray()))
            val body = SdkRequestBody.OneShot(stream, "text/plain", ownership = SdkBodyOwnership.TRANSPORT)
            server.enqueue(exchange(server, "/one-shot", method = "POST", requestBody = "once".encodeToByteArray()))
            transport.execute(request(server, "/one-shot", method = "POST", body = body)).body.close()
            assertTrue(stream.closed)
        }

    public open fun capabilitiesMatchExpectations(): Unit =
        contractTest { _, transport ->
            assertEquals(expectedCapabilities, transport.capabilities())
        }

    /** Redirects remain a typed unsupported capability and surface as the original 3xx exchange. */
    public open fun redirectsAreSurfacedWithoutAutomaticFollowing(): Unit =
        contractTest { server, transport ->
            server.enqueue(
                exchange(
                    server,
                    "/redirect",
                    response =
                        ResponseScript(
                            statusCode = 302,
                            headers = listOf(SdkHeader("Location", "/target")),
                            body = chunks("redirect"),
                        ),
                ),
            )
            val response = transport.execute(request(server, "/redirect"))
            assertEquals(com.nabobery.sdkgen.runtime.RedirectCapability.UNSUPPORTED, transport.capabilities().redirects)
            assertEquals(302, response.statusCode)
            assertEquals("/target", response.headers.firstOrNull { it.name.equals("Location", true) }?.value)
            response.body.close()
        }

    public open fun unsupportedStreamingIsDeclaredForRuntimePreflight(): Unit =
        contractTest { _, transport ->
            if (expectedCapabilities.supportsStreaming) return@contractTest
            assertTrue(
                skip(
                    "unsupportedStreamingIsDeclaredForRuntimePreflight",
                    ContractCapability.STREAMING,
                    supported = false,
                ),
            )
            assertEquals(false, transport.capabilities().supportsStreaming)
        }

    /** Runtime-owned attempt deadline; this row is mandatory even when the adapter has no native deadline support. */
    public open fun declaredAttemptDeadlineIsHonored(): Unit =
        contractTest { server, transport ->
            val gate = ChunkGate()
            val body = GatedRequestBody(gate)
            server.enqueue(exchange(server, "/attempt-deadline", method = "POST"))
            coroutineScope {
                val result =
                    async(start = CoroutineStart.UNDISPATCHED) {
                        captureFailure {
                            SdkExecutor(
                                transport = transport,
                                timeoutGuard = RealContractTimeoutGuard,
                            ).executeBodyless(
                                request =
                                    SdkExecutionRequest(
                                        metadata =
                                            runtimeDeadlineMetadata(SdkDeadlines(null, 100, null)).copy(
                                                method = "POST",
                                                path = "/attempt-deadline",
                                                requestMediaTypes = listOf("application/octet-stream"),
                                            ),
                                        baseUri = server.url("/"),
                                        requestValue = body,
                                        requestCodecIds = emptyList(),
                                    ),
                                requestCodecs = MediaTypeCodecRegistry.of(),
                            )
                        }
                    }
                withTimeout(15_000) { gate.awaitProduced(0) }
                val failure = withTimeout(15_000) { result.await() }
                val timeout = assertIs<SdkTimeoutException>(failure)
                assertEquals(TimeoutPhase.ATTEMPT, timeout.phase)
            }
            assertTrue(body.closed, "Attempt deadline must cancel the in-flight adapter request body")
        }

    /** Executor-only companion for isolating deadline classification from adapter cancellation behavior. */
    public open fun executorAttemptDeadlineIsHonored(): Unit =
        contractTest { _, _ ->
            val failure =
                captureFailure {
                    SdkExecutor(
                        transport = SdkTransport { kotlinx.coroutines.awaitCancellation() },
                        timeoutGuard = ContractTimeoutGuard(true),
                    ).executeBodyless(
                        request =
                            SdkExecutionRequest(
                                metadata = runtimeDeadlineMetadata(SdkDeadlines(null, 1, null)),
                                baseUri = "https://contract.test",
                                requestValue = Unit,
                                requestCodecIds = emptyList(),
                            ),
                        requestCodecs = MediaTypeCodecRegistry.of(),
                    )
                }
            val timeout = assertIs<SdkTimeoutException>(failure)
            assertEquals(TimeoutPhase.ATTEMPT, timeout.phase)
        }

    public open fun connectionFailureBeforeSendIsTypedAndPreservesCause(): Unit =
        contractTest { server, transport ->
            val cause = IllegalStateException("connection refused")
            server.enqueue(
                exchange(
                    server,
                    "/connect-failure",
                    response = ResponseScript(failure = ConnectionFailure(cause, requestMayHaveReachedServer = false)),
                ),
            )
            val failure = assertFails { transport.execute(request(server, "/connect-failure")) }
            assertIs<SdkTransportException>(failure)
            assertTrue(failure.cause != null, "Connection failure must retain a non-empty cause chain")
            assertEquals(false, failure.requestMayHaveReachedServer)
        }

    public open fun abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded(): Unit =
        contractTest { server, transport ->
            if (
                skip(
                    "abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded",
                    ContractCapability.STREAMING,
                    expectedCapabilities.supportsStreaming,
                )
            ) {
                return@contractTest
            }
            val cause = IllegalStateException("connection reset")
            server.enqueue(
                exchange(
                    server,
                    "/abrupt",
                    response =
                        ResponseScript(
                            body =
                                ResponseBodyScript.Chunks(
                                    listOf(byteArrayOf(1)),
                                    failureAfterChunk = 1,
                                    failure = cause,
                                ),
                        ),
                ),
            )
            val body = transport.execute(request(server, "/abrupt", mode = SdkResponseMode.STREAMING)).body
            body.readChunk()
            val failure = assertFails { body.readChunk() }
            assertIs<SdkTransportException>(failure)
            assertTrue(failure.cause != null, "Mid-stream failure must retain a non-empty cause chain")
            body.close(failure)
            server.assertResponseClosed(0, failure)
        }

    /** Runtime-owned stream-idle deadline; this row is mandatory for every streaming adapter. */
    public open fun declaredIdleDeadlineRejectsSlowLorisBody(): Unit =
        contractTest { server, transport ->
            val gate = ChunkGate()
            server.enqueue(
                exchange(
                    server,
                    "/slow-loris",
                    response =
                        ResponseScript(
                            body = ResponseBodyScript.Chunks(listOf(byteArrayOf(1), byteArrayOf(2)), gate = gate),
                        ),
                ),
            )
            val body =
                runRawWithRuntimeDeadline(
                    transport,
                    server,
                    "/slow-loris",
                    SdkDeadlines(null, null, 1),
                )
            assertContentEquals(byteArrayOf(1), body.readChunk())
            val failure = captureFailure { body.readChunk() }
            val timeout = assertIs<SdkTimeoutException>(failure)
            assertEquals(TimeoutPhase.STREAM_IDLE, timeout.phase)
            server.assertResponseClosed(0, failure)
        }

    /** Validates and prints the complete capability skip report for this adapter. */
    public open fun contractSkipReportIsConsistent(): Unit =
        contractTest { _, _ ->
            val rows =
                listOf(
                    Triple(
                        "streamingChunksArriveIncrementally",
                        ContractCapability.STREAMING,
                        expectedCapabilities.supportsStreaming,
                    ),
                    Triple(
                        "closingStreamMidBodyCancelsExchange",
                        ContractCapability.STREAMING,
                        expectedCapabilities.supportsStreaming,
                    ),
                    Triple(
                        "hostileChunkSizesPreserveBytes",
                        ContractCapability.STREAMING,
                        expectedCapabilities.supportsStreaming,
                    ),
                    Triple(
                        "sseBytesAreIncrementalAndUnmodified",
                        ContractCapability.STREAMING,
                        expectedCapabilities.supportsStreaming,
                    ),
                    Triple(
                        "abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded",
                        ContractCapability.STREAMING,
                        expectedCapabilities.supportsStreaming,
                    ),
                    Triple(
                        "callerOwnedEngineRemainsUnchanged",
                        ContractCapability.CALLER_OWNED_ENGINE,
                        engineOwnershipProbe() != null,
                    ),
                )
            rows.forEach { (row, capability, supported) -> skip(row, capability, supported) }
            recordedSkippedRows.forEach { (row, reason) ->
                val capability = requireNotNull(skippedCapabilities[row])
                assertEquals(
                    capabilitySkipReasons[capability],
                    reason,
                    "Skip reason for $row does not match $capability",
                )
            }
            println("Contract skip report:")
            if (recordedSkippedRows.isEmpty()) println("  (no skipped rows)")
            recordedSkippedRows.forEach { (row, reason) -> println("  $row: $reason") }
        }

    private fun skip(
        row: String,
        capability: ContractCapability,
        supported: Boolean,
    ): Boolean {
        if (supported) return false
        val reason = capabilitySkipReasons[capability]
        require(!reason.isNullOrBlank()) { "A non-blank skip reason is required for $capability" }
        recordedSkippedRows[row] = reason
        skippedCapabilities[row] = capability
        println("SKIP $row: $reason")
        return true
    }

    private fun contractTest(block: suspend (ContractServer, SdkTransport) -> Unit) {
        runTest {
            val server = createServer()
            val transport = createTransport(server)
            try {
                assertEquals(expectedCapabilities, transport.capabilities())
                block(server, transport)
            } finally {
                tearDownTransport(transport)
                server.close()
            }
        }
    }
}

/** Capability-dependent rows that require an explicit reason when skipped. */
public enum class ContractCapability {
    STREAMING,
    ATTEMPT_DEADLINE,
    STREAM_IDLE_DEADLINE,
    CALLER_OWNED_ENGINE,
}

/** Optional adapter hook used by [SdkTransportContractKit] to assert ownership of a consumer-supplied engine. */
public interface EngineOwnershipProbe {
    public fun snapshot(): Any

    public fun assertUnchanged(snapshot: Any)
}

private fun exchange(
    server: ContractServer,
    path: String,
    method: String = "GET",
    headers: List<SdkHeader> = emptyList(),
    requestBody: ByteArray? = null,
    response: ResponseScript = ResponseScript(),
): ScriptedExchange = ScriptedExchange(RequestExpectation(method, server.url(path), headers, requestBody), response)

private fun chunks(value: String): ResponseBodyScript = ResponseBodyScript.Chunks(listOf(value.encodeToByteArray()))

private suspend fun runRawWithRuntimeDeadline(
    transport: SdkTransport,
    server: ContractServer,
    path: String,
    deadlines: SdkDeadlines,
): SdkByteStream =
    SdkExecutor(
        transport = transport,
        timeoutGuard = ContractTimeoutGuard(false, true),
    ).executeRaw(
        request =
            SdkExecutionRequest(
                metadata = runtimeDeadlineMetadata(deadlines, SdkResponseMode.STREAMING, path),
                baseUri = server.url("/"),
                requestValue = Unit,
                requestCodecIds = emptyList(),
            ),
        requestCodecs = MediaTypeCodecRegistry.of(),
    )

private fun runtimeDeadlineMetadata(
    deadlines: SdkDeadlines,
    responseMode: SdkResponseMode = SdkResponseMode.BUFFERED,
    path: String = "/runtime-deadline",
): OperationMetadata =
    OperationMetadata(
        operationId = "runtime-deadline",
        method = "GET",
        path = path,
        requestMediaTypes = emptyList(),
        responseMediaTypes = emptyList(),
        successStatusCodes = setOf(200),
        responseMode = responseMode,
        deadlines = deadlines,
    )

private suspend fun captureFailure(block: suspend () -> Unit): Throwable =
    try {
        block()
        error("Expected the operation to fail")
    } catch (failure: Throwable) {
        failure
    }

private object RealContractTimeoutGuard : SdkTimeoutGuard {
    override suspend fun runWithTimeout(
        timeoutMillis: Long,
        block: suspend () -> Unit,
    ): Boolean =
        kotlinx.coroutines.withTimeoutOrNull(timeoutMillis.coerceAtLeast(1)) {
            block()
            true
        } ?: false
}

private class GatedRequestBody(
    private val gate: ChunkGate,
) : SdkByteStream {
    var closed: Boolean = false
        private set

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0) { "maxBytes must be positive" }
        gate.markProduced(0)
        gate.awaitRelease(0)
        return null
    }

    override fun close(cause: Throwable?) {
        closed = true
    }
}

private class ContractTimeoutGuard(
    private vararg val expired: Boolean,
) : SdkTimeoutGuard {
    private var index = 0

    override suspend fun runWithTimeout(
        timeoutMillis: Long,
        block: suspend () -> Unit,
    ): Boolean {
        if (expired.getOrNull(index++) == true) return false
        block()
        return true
    }
}

private fun request(
    server: ContractServer,
    path: String,
    method: String = "GET",
    headers: List<SdkHeader> = emptyList(),
    body: SdkRequestBody? = null,
    mode: SdkResponseMode = SdkResponseMode.BUFFERED,
    attemptMillis: Long? = null,
    idleMillis: Long? = null,
): SdkRequest =
    SdkRequest(
        method,
        server.url(path),
        headers,
        body,
        mode,
        SdkDeadlines(null, attemptMillis, idleMillis),
        "transport-contract",
    )

private suspend fun readAll(
    stream: SdkByteStream,
    maxRead: Int = SdkByteStream.DEFAULT_READ_SIZE,
): ByteArray {
    val chunks = mutableListOf<ByteArray>()
    var size = 0
    while (true) {
        val chunk = stream.readChunk(maxRead) ?: break
        chunks += chunk
        size += chunk.size
    }
    return ByteArray(size).also { bytes ->
        var offset = 0
        chunks.forEach { chunk ->
            chunk.copyInto(bytes, offset)
            offset += chunk.size
        }
    }
}
