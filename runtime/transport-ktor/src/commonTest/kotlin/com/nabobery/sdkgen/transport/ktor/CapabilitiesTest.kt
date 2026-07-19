package com.nabobery.sdkgen.transport.ktor

import com.nabobery.sdkgen.runtime.TimeoutPhase
import com.nabobery.sdkgen.runtime.TransportCapabilities
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class CapabilitiesTest {
    @Test
    fun reportsConservativeCapabilitiesForUnclassifiedConsumerEngine() {
        val client =
            HttpClient(MockEngine) {
                engine {
                    addHandler { respond("", HttpStatusCode.OK, headersOf()) }
                }
            }
        val transport = KtorSdkTransport(client)

        val capabilities = transport.capabilities()

        assertFalse(capabilities.supportsStreaming)
        assertTrue(capabilities.supportedDeadlines.isEmpty())
        assertFalse(capabilities.supportsHttp2)
        assertFalse(capabilities.canSetUserAgent)
    }

    @Test
    fun reportsConsumerDeclarationForAClassifiedEngineAndTarget() {
        val client =
            HttpClient(MockEngine) {
                engine {
                    addHandler { respond("", HttpStatusCode.OK, headersOf()) }
                }
            }
        val declared =
            TransportCapabilities(
                supportsStreaming = true,
                supportedDeadlines = setOf(TimeoutPhase.ATTEMPT),
                supportsHttp2 = true,
                canSetUserAgent = true,
            )
        val transport = KtorSdkTransport(client, declared)

        assertTrue(transport.capabilities().supportsStreaming)
        assertTrue(transport.capabilities().supportedDeadlines.isEmpty())
        assertTrue(transport.capabilities().supportsHttp2)
        assertTrue(transport.capabilities().canSetUserAgent)
    }
}
