package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseMode
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

internal class ContractServerTest {
    @Test
    fun sharedRequestVerificationAcceptsEquivalentRequest() {
        val bytes = "body".encodeToByteArray()
        ContractRequestVerification.verify(
            RequestExpectation(
                method = "POST",
                uri = "https://contract.test/shared",
                headers = listOf(SdkHeader("X-Test", "one")),
                body = bytes,
            ),
            request(
                uri = "https://contract.test/shared",
                headers = listOf(SdkHeader("x-test", "one")),
                body = SdkRequestBody.Bytes(bytes, "text/plain"),
            ),
            bytes,
        )
    }

    @Test
    fun requestVerificationFailureDoesNotExposeHeaderValues() {
        val secret = "production-token"
        val failure =
            assertFailsWith<IllegalStateException> {
                ContractRequestVerification.verify(
                    RequestExpectation(
                        method = "GET",
                        uri = "https://contract.test/secure",
                        headers = listOf(SdkHeader("Authorization", "expected-$secret")),
                    ),
                    request(
                        uri = "https://contract.test/secure",
                        headers = listOf(SdkHeader("authorization", "actual-$secret")),
                    ),
                    actualBody = null,
                )
            }

        assertFalse(failure.message.orEmpty().contains(secret))
    }

    @Test
    fun requestVerificationKeepsSafeHeaderMismatchActionable() {
        val failure =
            assertFailsWith<IllegalStateException> {
                ContractRequestVerification.verify(
                    RequestExpectation(
                        method = "GET",
                        uri = "https://contract.test/safe",
                        headers = listOf(SdkHeader("Content-Type", "application/json")),
                    ),
                    request(
                        uri = "https://contract.test/safe",
                        headers = listOf(SdkHeader("content-type", "text/plain")),
                    ),
                    actualBody = null,
                )
            }

        assertEquals(true, failure.message.orEmpty().contains("application/json"))
        assertEquals(true, failure.message.orEmpty().contains("text/plain"))
    }

    @Test
    fun fakeServerVerifiesRequestAndReturnsScriptedChunks() {
        val server = FakeContractServer()
        assertIs<FakeTransport>(server.transport)
        server.enqueue(
            ScriptedExchange(
                request =
                    RequestExpectation(
                        method = "POST",
                        uri = server.url("/items"),
                        headers = listOf(SdkHeader("X-Value", "one"), SdkHeader("x-value", "two")),
                        body = "request".encodeToByteArray(),
                    ),
                response =
                    ResponseScript(
                        statusCode = 201,
                        headers = listOf(SdkHeader("Set-Cookie", "a=1"), SdkHeader("set-cookie", "b=2")),
                        body =
                            ResponseBodyScript.Chunks(
                                listOf("first".encodeToByteArray(), "second".encodeToByteArray()),
                            ),
                    ),
            ),
        )

        val response =
            runContractSuspend {
                server.transport.execute(
                    request(
                        uri = server.url("/items"),
                        headers = listOf(SdkHeader("x-value", "one"), SdkHeader("X-VALUE", "two")),
                        body = SdkRequestBody.Bytes("request".encodeToByteArray(), "text/plain"),
                    ),
                )
            }

        assertEquals(201, response.statusCode)
        assertContentEquals("first".encodeToByteArray(), runContractSuspend { response.body.readChunk() })
        assertContentEquals("second".encodeToByteArray(), runContractSuspend { response.body.readChunk() })
        assertEquals(null, runContractSuspend { response.body.readChunk() })
        assertEquals(1, server.exchanges.size)
        assertContentEquals("request".encodeToByteArray(), server.exchanges.single().requestBody)
        server.assertExhausted()
    }

    @Test
    fun chunkGateReleasesLaterChunksInOrder() {
        runContractSuspend {
            val gate = ChunkGate()
            val server = FakeContractServer()
            server.enqueue(
                ScriptedExchange(
                    request = RequestExpectation(method = "GET", uri = server.url("/gated")),
                    response =
                        ResponseScript(
                            body =
                                ResponseBodyScript.Chunks(
                                    listOf("first".encodeToByteArray(), "second".encodeToByteArray()),
                                    gate = gate,
                                ),
                        ),
                ),
            )

            val response = server.transport.execute(request(server.url("/gated")))
            gate.awaitProduced(0)
            assertContentEquals("first".encodeToByteArray(), response.body.readChunk())
            gate.release(0)
            assertContentEquals("second".encodeToByteArray(), response.body.readChunk())
        }
    }

    @Test
    fun fakeServerInjectsTypedConnectionFailureWithCauseIdentity() {
        val cause = IllegalStateException("connection refused")
        val server = FakeContractServer()
        server.enqueue(
            ScriptedExchange(
                request = RequestExpectation(method = "GET", uri = server.url("/fail")),
                response = ResponseScript(failure = ConnectionFailure(cause, requestMayHaveReachedServer = false)),
            ),
        )

        val failure =
            assertFailsWith<com.nabobery.sdkgen.runtime.SdkTransportException> {
                runContractSuspend { server.transport.execute(request(server.url("/fail"))) }
            }

        assertSame(cause, failure.cause)
        assertEquals(false, failure.requestMayHaveReachedServer)
    }

    private fun request(
        uri: String,
        headers: List<SdkHeader> = emptyList(),
        body: SdkRequestBody? = null,
    ): SdkRequest =
        SdkRequest(
            method = if (body == null) "GET" else "POST",
            uri = uri,
            headers = headers,
            body = body,
            expectedResponseMode = SdkResponseMode.BUFFERED,
            deadlines = SdkDeadlines(null, null, null),
            operationId = "contract-test",
        )
}
