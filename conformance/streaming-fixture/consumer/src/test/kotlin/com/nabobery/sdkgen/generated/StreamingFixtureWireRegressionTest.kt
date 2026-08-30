package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.generated.files.FilesClient
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.auth.Credential
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.Secret
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Consumer-reported wire regressions (openrouter-kotlin, 2026-08-29) proven through the real generated SDK, the real
 * transport seam, and the real serializers:
 *
 * 1. Enum-typed path, query, and comma-joined parameters must send the documented wire value (`cold`), not the Kotlin
 *    case name (`Cold`) that `toString()` yields for a generated open enum.
 * 2. A terminal page whose nullable `cursor`/`first_id`/`last_id` are explicit JSON `null` must still match its
 *    `_shape` branch instead of raising the union's `NoMatchException`.
 */
class StreamingFixtureWireRegressionTest {
    @Test
    fun enumTypedParametersSendTheirDocumentedWireValues() =
        runTest {
            val transport = FakeTransport().enqueueResponse(200, headers = jsonHeaders, body = terminalPage())

            client(transport).listFiles(
                bucket = FileBucket.Cold,
                shape = PageShape.Openrouter,
                sort = listOf(PageSort.CreatedAt, PageSort.Filename),
            )

            val uri = transport.capturedRequests.single().uri
            assertTrue("/files/cold?" in uri, uri)
            assertTrue("shape=openrouter" in uri, uri)
            assertEquals("created_at,filename", uri.substringAfter("sort=").substringBefore("&").replace("%2C", ","))
            assertFalse("Cold" in uri || "Openrouter" in uri || "CreatedAt" in uri, uri)
        }

    @Test
    fun terminalPageWithExplicitNullCursorDecodesToItsShapeBranch() =
        runTest {
            val transport = FakeTransport().enqueueResponse(200, headers = jsonHeaders, body = terminalPage())

            val page = client(transport).listFiles(bucket = FileBucket.Hot)

            val openRouterPage = assertIs<FileListResponse.OpenRouterFileList>(page)
            assertNull(openRouterPage.cursor)
            assertNull(openRouterPage.firstId)
            assertNull(openRouterPage.lastId)
            assertEquals(false, openRouterPage.hasMore)
            assertEquals(listOf("f1"), openRouterPage.data.map { it.id })
        }

    private val jsonHeaders = listOf(SdkHeader("Content-Type", "application/json"))

    private fun terminalPage(): FakeByteStream =
        FakeByteStream(
            listOf(
                (
                    """{"_shape":"openrouter","cursor":null,"data":[{"id":"f1","filename":"a.pdf"}],""" +
                        """"first_id":null,"has_more":false,"last_id":null}"""
                ).encodeToByteArray(),
            ),
        )

    private fun client(transport: FakeTransport): FilesClient =
        FilesClient(
            transport,
            "https://api.streaming-fixture.test",
            credentialProviders =
                mapOf("apiKey" to CredentialProvider { Credential.ApiKeyCredential(Secret("test-key")) }),
        )
}
