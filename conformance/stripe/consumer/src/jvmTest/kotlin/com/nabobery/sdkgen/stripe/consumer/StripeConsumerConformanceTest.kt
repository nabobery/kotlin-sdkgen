package com.nabobery.sdkgen.stripe.consumer

import com.nabobery.sdkgen.generated.stripe.InlineV1FileLinksPostRequestFormMetadataXaddcdec0
import com.nabobery.sdkgen.generated.stripe.InlineV1FileLinksPostRequestFormXc54383d7
import com.nabobery.sdkgen.generated.stripe.InlineV1FilesPostRequestMultipartPurposeX06371c52
import com.nabobery.sdkgen.generated.stripe.InlineV1FilesPostRequestMultipartXeb3cb5d1
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a
import com.nabobery.sdkgen.generated.stripe.StripeClient
import com.nabobery.sdkgen.generated.stripe.v1.V1Client
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.auth.Credential
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.Secret
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import java.security.MessageDigest
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertTrue

class StripeConsumerConformanceTest {
    @Test
    fun indexedFormArraysAndDisjointUnionSelectionPreserveStripeWireFormat() =
        runTest {
            val indexedTransport = FakeTransport().enqueueStripeErrorResponse()
            client(indexedTransport).v1.postFileLinksWithResponse(
                InlineV1FileLinksPostRequestFormXc54383d7.build {
                    file = "file_123"
                    expand = listOf("data.object", "data.owner")
                    metadata =
                        InlineV1FileLinksPostRequestFormMetadataXaddcdec0.fromRaw(
                            buildJsonObject {
                                put("first & [é]", "one")
                                put("second", "two")
                            },
                        )
                },
            )
            val indexedBody =
                indexedTransport.capturedRequests
                    .single()
                    .body
                    .requireBytes()
                    .decodeToString()
            assertEquals(
                "expand%5B0%5D=data.object&expand%5B1%5D=data.owner&file=file_123&metadata%5Bfirst+%26+%5B%C3%A9%5D%5D=one&metadata%5Bsecond%5D=two",
                indexedBody,
            )

            val emptyTransport = FakeTransport().enqueueStripeErrorResponse()
            client(emptyTransport).v1.postFileLinksWithResponse(
                InlineV1FileLinksPostRequestFormXc54383d7.build {
                    file = "file_123"
                    expand = emptyList()
                    metadata = InlineV1FileLinksPostRequestFormMetadataXaddcdec0.fromRaw(buildJsonObject {})
                },
            )
            assertEquals(
                "expand=&file=file_123",
                emptyTransport.capturedRequests
                    .single()
                    .body
                    .requireBytes()
                    .decodeToString(),
            )
        }

    @Test
    fun typedFormMapEncodesDynamicKeySegmentsInCallerOrder() =
        runTest {
            val transport = FakeTransport().enqueueStripeErrorResponse()
            client(transport).v1.postTreasuryInboundTransfersWithResponse(
                InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a.build {
                    amount = 42
                    currency = "usd"
                    financialAccount = "fa_123"
                    originPaymentMethod = "pm_123"
                    metadata = linkedMapOf("first & [é]" to "one", "second" to "two")
                },
            )

            assertEquals(
                "amount=42&currency=usd&financial_account=fa_123&metadata%5Bfirst+%26+%5B%C3%A9%5D%5D=one&metadata%5Bsecond%5D=two&origin_payment_method=pm_123",
                transport.capturedRequests
                    .single()
                    .body
                    .requireBytes()
                    .decodeToString(),
            )
        }

    @Test
    fun indexedMultipartArraysIncludeTheSupportedEmptyPart() =
        runTest {
            val indexedTransport = FakeTransport().enqueueStripeErrorResponse()
            client(indexedTransport).v1.postFilesWithResponse(
                InlineV1FilesPostRequestMultipartXeb3cb5d1.build {
                    file = FakeByteStream(listOf(byteArrayOf(1, 2, 3)))
                    purpose = InlineV1FilesPostRequestMultipartPurposeX06371c52.BusinessLogo
                    expand = listOf("links")
                },
            )
            assertContains(
                indexedTransport.capturedRequests
                    .single()
                    .body
                    .requireBytes()
                    .decodeToString(),
                "name=\"expand[0]\"",
            )

            val emptyTransport = FakeTransport().enqueueStripeErrorResponse()
            client(emptyTransport).v1.postFilesWithResponse(
                InlineV1FilesPostRequestMultipartXeb3cb5d1.build {
                    file = FakeByteStream(listOf(byteArrayOf(4)))
                    purpose = InlineV1FilesPostRequestMultipartPurposeX06371c52.BusinessLogo
                    expand = emptyList()
                },
            )
            val emptyBody =
                emptyTransport.capturedRequests
                    .single()
                    .body
                    .requireBytes()
                    .decodeToString()
            assertContains(emptyBody, "name=\"expand\"")
            assertTrue("name=\"expand[" !in emptyBody)
        }

    @Test
    fun basicAuthenticationAndTypedSuccessAndErrorResponsesReachThePublicApi() =
        runTest {
            val successTransport =
                FakeTransport().enqueueResponse(
                    200,
                    headers = listOf(SdkHeader("Content-Type", "application/json")),
                    body =
                        FakeByteStream(
                            listOf("""{"deleted":true,"id":"acct_123","object":"account"}""".encodeToByteArray()),
                        ),
                )
            val success = client(successTransport).v1.deleteAccountsAccountWithResponse(account = "acct_123")
            val matchedSuccess = assertIs<SdkResponseResult.Matched<V1Client.DeleteAccountsAccountResponse>>(success)
            val decodedSuccess = assertIs<V1Client.DeleteAccountsAccountResponse.SuccessJson>(matchedSuccess.value)
            assertEquals("acct_123", decodedSuccess.json.id)
            assertTrue(
                successTransport.capturedRequests.single().headers.any { header ->
                    header.name.equals("Authorization", ignoreCase = true) && header.value.startsWith("Basic ")
                },
            )

            val errorTransport =
                FakeTransport().enqueueResponse(
                    400,
                    headers = listOf(SdkHeader("Content-Type", "application/json")),
                    body =
                        FakeByteStream(
                            listOf(
                                """{"error":{"type":"invalid_request_error","message":"invalid account"}}"""
                                    .encodeToByteArray(),
                            ),
                        ),
                )
            val error = client(errorTransport).v1.deleteAccountsAccountWithResponse(account = "acct_123")
            val matchedError = assertIs<SdkResponseResult.Matched<V1Client.DeleteAccountsAccountResponse>>(error)
            val decodedError = assertIs<V1Client.DeleteAccountsAccountResponse.DefaultJson>(matchedError.value)
            assertEquals("invalid account", decodedError.json.error.message)
        }

    @Test
    fun committedManifestPinsTheSourceAndExactWaiverProvenance() {
        val manifestBytes = requireNotNull(javaClass.getResource("/manifest.json")).readBytes()
        val manifestText = manifestBytes.decodeToString()

        assertEquals(MANIFEST_SHA256, manifestBytes.sha256())
        assertContains(manifestText, "\"canonicalUri\": \"sdkgen://source/openapi.json\"")
        assertContains(manifestText, "\"sha256\": \"e24a26de4188fd64dec4c043d5d3726277fdcb07556a493ea481c305b0a223d8\"")
        assertContains(manifestText, "\"acceptedWaivers\"")
        assertEquals(157, Regex("\"id\": \"stripe-").findAll(manifestText).count())
    }

    private fun client(transport: FakeTransport): StripeClient =
        StripeClient(
            transport = transport,
            baseUri = BASE_URI,
            credentialProviders =
                mapOf(
                    "basicAuth" to CredentialProvider { Credential.BasicCredential("sk_test", Secret("")) },
                ),
        )

    private fun FakeTransport.enqueueStripeErrorResponse(): FakeTransport =
        enqueueResponse(
            400,
            headers = listOf(SdkHeader("Content-Type", "application/json")),
            body =
                FakeByteStream(
                    listOf(
                        """{"error":{"type":"invalid_request_error","message":"test error"}}"""
                            .encodeToByteArray(),
                    ),
                ),
        )

    private suspend fun SdkRequestBody?.requireBytes(): ByteArray =
        when (val body = requireNotNull(this)) {
            is SdkRequestBody.Bytes -> body.bytes
            is SdkRequestBody.OneShot -> body.stream.readAllAndClose()
            is SdkRequestBody.ReplayFactory -> body.create().requireBytes()
        }

    private suspend fun SdkByteStream.readAllAndClose(): ByteArray {
        val chunks = mutableListOf<ByteArray>()
        try {
            while (true) chunks += readChunk() ?: break
        } finally {
            close()
        }
        return chunks.fold(ByteArray(0), ByteArray::plus)
    }

    private fun ByteArray.sha256(): String =
        MessageDigest.getInstance("SHA-256").digest(this).joinToString("") { byte -> "%02x".format(byte) }

    private companion object {
        const val BASE_URI = "https://api.stripe.test"
        const val MANIFEST_SHA256 = "9403341becc1f7cd23115d713e00a74617bde1a86da9654d24425bc958d52732"
    }
}
