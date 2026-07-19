package com.nabobery.sdkgen.transport.javahttp

import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransportException
import kotlinx.coroutines.runBlocking
import java.net.ServerSocket
import java.net.http.HttpClient
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class JavaHttpExecutionTest {
    @Test
    fun `connection failure is typed and retains the original failure in its cause chain`() =
        runBlocking {
            val port = ServerSocket(0).use { it.localPort }
            val failure =
                assertFailsWith<SdkTransportException> {
                    JavaHttpSdkTransport(HttpClient.newHttpClient()).execute(request("http://127.0.0.1:$port/refused"))
                }

            assertEquals(false, failure.requestMayHaveReachedServer)
            assertTrue(
                generateSequence<Throwable>(failure) { it.cause }.any {
                    it is java.net.ConnectException
                },
            )
        }
}

private fun request(uri: String): SdkRequest =
    SdkRequest(
        method = "GET",
        uri = uri,
        headers = emptyList(),
        body = null,
        expectedResponseMode = SdkResponseMode.BUFFERED,
        deadlines = SdkDeadlines(null, null, null),
        operationId = "java-http-execution",
    )
