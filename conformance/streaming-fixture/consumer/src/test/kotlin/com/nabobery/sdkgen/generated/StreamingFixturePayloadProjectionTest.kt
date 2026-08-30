package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.generated.events.EventsClient
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkSerializationException
import com.nabobery.sdkgen.runtime.TransportCapabilities
import com.nabobery.sdkgen.runtime.auth.Credential
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.Secret
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import com.nabobery.sdkgen.testing.assertClosedNormally
import com.nabobery.sdkgen.testing.assertClosedWith
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * Plan D4 through the real generated SDK: `subscribeEvents` declares its `text/event-stream` schema as an
 * `EventEnvelope` whose `payload` property carries the JSON of each `data:` field, and the operation's
 * `x-sdkgen-streaming.payloadProperty: payload` projects the element type to that payload model. The wire form
 * used here is the documented one — `data: {<EventChunk JSON>}` — not a synthetic envelope-wrapped line.
 */
class StreamingFixturePayloadProjectionTest {
    private val sseHeaders = listOf(SdkHeader("Content-Type", "text/event-stream"))

    @Test
    fun payloadPropertyProjectsTheStreamElementTypeToTheWirePayloadModel() =
        runTest {
            val stream =
                FakeByteStream(
                    (
                        "data: {\"sequence\":1,\"text\":\"first\"}\n\n" +
                            "data: {\"sequence\":2,\"text\":\"second\"}\n\n" +
                            "data: [DONE]\n\n"
                    ).encodeToByteArray().toList().chunked(7).map { it.toByteArray() },
                )
            val transport = streamingTransport().enqueueResponse(200, headers = sseHeaders, body = stream)

            // The declared type is the proof that the projection happened at generation time.
            val flow: Flow<EventChunk> = client(transport).subscribeEvents(EventSubscription(topic = "orders"))
            val chunks = flow.toList()

            assertEquals(listOf(1 to "first", 2 to "second"), chunks.map { it.sequence to it.text })
            stream.assertClosedNormally()
            val captured = transport.capturedRequests.single()
            assertEquals("subscribeEvents", captured.operationId)
            assertTrue(captured.headers.any { it.name == "Authorization" && it.value == "test-key" })
        }

    @Test
    fun envelopeShapedDataLinesAreRejectedRatherThanSilentlyUnwrapped() =
        runTest {
            val envelopeLine = "data: {\"event\":\"tick\",\"payload\":{\"sequence\":1,\"text\":\"x\"}}\n\n"
            val stream = FakeByteStream(listOf(envelopeLine.encodeToByteArray()))
            val transport = streamingTransport().enqueueResponse(200, headers = sseHeaders, body = stream)

            val failure =
                assertFailsWith<SdkSerializationException> {
                    client(transport).subscribeEvents(EventSubscription(topic = "orders")).toList()
                }

            stream.assertClosedWith(failure)
        }

    private fun client(transport: FakeTransport): EventsClient =
        EventsClient(
            transport,
            "https://api.streaming-fixture.test",
            credentialProviders =
                mapOf("apiKey" to CredentialProvider { Credential.ApiKeyCredential(Secret("test-key")) }),
        )

    private fun streamingTransport(): FakeTransport = FakeTransport(TransportCapabilities(supportsStreaming = true))
}
