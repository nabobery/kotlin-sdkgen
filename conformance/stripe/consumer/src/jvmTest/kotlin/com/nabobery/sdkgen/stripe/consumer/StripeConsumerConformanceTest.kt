package com.nabobery.sdkgen.stripe.consumer

import com.nabobery.sdkgen.generated.stripe.InlineV1FileLinksPostRequestFormMetadataXaddcdec0
import com.nabobery.sdkgen.generated.stripe.InlineV1FileLinksPostRequestFormXc54383d7
import com.nabobery.sdkgen.generated.stripe.InlineV1FilesPostRequestMultipartPurposeX06371c52
import com.nabobery.sdkgen.generated.stripe.InlineV1FilesPostRequestMultipartXeb3cb5d1
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a
import com.nabobery.sdkgen.generated.stripe.StripeClient
import com.nabobery.sdkgen.generated.stripe.accounts.AccountsClient
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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put
import java.io.File
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
            parityFixture("stripe.form") {
                val indexedTransport = FakeTransport().enqueueStripeErrorResponse()
                client(indexedTransport).fileLinks.postFileLinksWithResponse(
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
                    "expand%5B0%5D=data.object&expand%5B1%5D=data.owner&file=file_123&" +
                        "metadata%5Bfirst+%26+%5B%C3%A9%5D%5D=one&metadata%5Bsecond%5D=two",
                    indexedBody,
                )

                val emptyTransport = FakeTransport().enqueueStripeErrorResponse()
                client(emptyTransport).fileLinks.postFileLinksWithResponse(
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

                val mapTransport = FakeTransport().enqueueStripeErrorResponse()
                client(mapTransport).treasury.postTreasuryInboundTransfersWithResponse(
                    InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a.build {
                        amount = 42
                        currency = "usd"
                        financialAccount = "fa_123"
                        originPaymentMethod = "pm_123"
                        metadata = linkedMapOf("first & [é]" to "one", "second" to "two")
                    },
                )
                assertEquals(
                    "amount=42&currency=usd&financial_account=fa_123&" +
                        "metadata%5Bfirst+%26+%5B%C3%A9%5D%5D=one&" +
                        "metadata%5Bsecond%5D=two&origin_payment_method=pm_123",
                    mapTransport.capturedRequests
                        .single()
                        .body
                        .requireBytes()
                        .decodeToString(),
                )
            }
        }

    @Test
    fun typedFormMapEncodesDynamicKeySegmentsInCallerOrder() =
        runTest {
            val transport = FakeTransport().enqueueStripeErrorResponse()
            client(transport).treasury.postTreasuryInboundTransfersWithResponse(
                InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a.build {
                    amount = 42
                    currency = "usd"
                    financialAccount = "fa_123"
                    originPaymentMethod = "pm_123"
                    metadata = linkedMapOf("first & [é]" to "one", "second" to "two")
                },
            )

            assertEquals(
                "amount=42&currency=usd&financial_account=fa_123&" +
                    "metadata%5Bfirst+%26+%5B%C3%A9%5D%5D=one&metadata%5Bsecond%5D=two&origin_payment_method=pm_123",
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
            parityFixture("stripe.multipart") {
                val indexedTransport = FakeTransport().enqueueStripeErrorResponse()
                client(indexedTransport).files.postFilesWithResponse(
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
                client(emptyTransport).files.postFilesWithResponse(
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
        }

    @Test
    fun basicAuthenticationAndTypedSuccessAndErrorResponsesReachThePublicApi() =
        runTest {
            parityFixture("stripe.auth-typed-errors") {
                val successTransport =
                    FakeTransport().enqueueResponse(
                        200,
                        headers = listOf(SdkHeader("Content-Type", "application/json")),
                        body =
                            FakeByteStream(
                                listOf(
                                    """{"deleted":true,"id":"acct_123","object":"account"}""".encodeToByteArray(),
                                ),
                            ),
                    )
                val success = client(successTransport).accounts.deleteAccountsAccountWithResponse(account = "acct_123")
                val matchedSuccess =
                    assertIs<SdkResponseResult.Matched<AccountsClient.DeleteAccountsAccountResponse>>(success)
                val decodedSuccess =
                    assertIs<AccountsClient.DeleteAccountsAccountResponse.SuccessJson>(matchedSuccess.value)
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
                val error = client(errorTransport).accounts.deleteAccountsAccountWithResponse(account = "acct_123")
                val matchedError =
                    assertIs<SdkResponseResult.Matched<AccountsClient.DeleteAccountsAccountResponse>>(error)
                val decodedError =
                    assertIs<AccountsClient.DeleteAccountsAccountResponse.DefaultJson>(matchedError.value)
                assertEquals("invalid account", decodedError.json.error.message)
            }
        }

    @Test
    fun currentGeneratedStripeJvmArtifactCompilesAndExposesManifest() =
        parityFixture("stripe.compile-jvm") {
            val manifestBytes = requireNotNull(javaClass.getResource("/manifest.json")).readBytes()
            assertEquals(MANIFEST_SHA256, manifestBytes.sha256())
        }

    @Test
    fun generatedStripeSourceIsPortableAcrossKmpTargets() =
        parityFixture("stripe.source-portable") {
            val generatedDirectory =
                File(
                    requireNotNull(System.getProperty("parity.generatedDirectory")) {
                        "parity.generatedDirectory system property is required"
                    },
                )
            val sourceDirectory = generatedDirectory.resolve("com/nabobery/sdkgen/generated/stripe")
            require(sourceDirectory.isDirectory) { "Generated source directory is missing at $sourceDirectory" }
            val manifest =
                Json
                    .parseToJsonElement(generatedDirectory.resolve("manifest.json").readText())
                    .jsonObject
            val sourceFiles =
                manifest
                    .getValue("files")
                    .jsonArray
                    .map { entry ->
                        entry.jsonObject
                            .getValue("path")
                            .jsonPrimitive.content
                    }.filter { path -> path.endsWith(".kt") }
                    .map { relativePath ->
                        val sourceFile = generatedDirectory.resolve(relativePath).canonicalFile
                        require(sourceFile.toPath().startsWith(generatedDirectory.canonicalFile.toPath())) {
                            "Manifest source path escapes the generated directory: $relativePath"
                        }
                        require(sourceFile.isFile) { "Manifest source file is missing: $relativePath" }
                        sourceFile
                    }

            val forbiddenPrefixes =
                setOf(
                    "java.",
                    "javax.",
                    "android.",
                    "platform.",
                    "kotlin.jvm.",
                    "kotlin.js.",
                    "kotlin.native.",
                    "kotlinx.cinterop.",
                    "org.w3c.dom.",
                )
            val violations =
                sourceFiles
                    .asSequence()
                    .flatMap { file ->
                        file
                            .readLines()
                            .asSequence()
                            .map(String::trim)
                            .filter { line -> line.startsWith("import ") }
                            .filter { importLine ->
                                val importedName = importLine.removePrefix("import ").substringBefore(" as ")
                                forbiddenPrefixes.any { prefix ->
                                    importedName.startsWith(prefix)
                                }
                            }.map { importLine ->
                                "${file.relativeTo(generatedDirectory).invariantSeparatorsPath}:$importLine"
                            }
                    }.toList()

            assertTrue(
                violations.isEmpty(),
                "Found forbidden platform imports in generated source:\n${violations.joinToString("\n")}",
            )
        }

    @Test
    fun committedManifestPinsTheSourceAndExactWaiverProvenance() {
        val manifestBytes = requireNotNull(javaClass.getResource("/manifest.json")).readBytes()
        val manifestText = manifestBytes.decodeToString()

        assertEquals(MANIFEST_SHA256, manifestBytes.sha256())
        assertContains(manifestText, "\"canonicalUri\": \"sdkgen://source/openapi.json\"")
        assertContains(manifestText, "\"sha256\": \"e24a26de4188fd64dec4c043d5d3726277fdcb07556a493ea481c305b0a223d8\"")
        assertContains(manifestText, "\"acceptedWaivers\"")
        // 68 exclusions remain after ADR-0014 stopped rejecting form objects that merely omit
        // `additionalProperties`; the engine-side `StripeConformanceGenerationTest` asserts this ledger covers
        // the current exclusion set exactly, in both directions. This count was 161 before that change.
        assertEquals(68, Regex("\"id\": \"stripe-").findAll(manifestText).count())
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

    private inline fun parityFixture(
        fixtureId: String,
        block: () -> Unit,
    ) {
        val runId = System.getProperty(PARITY_RUN_ID_PROPERTY)
        if (runId == null) {
            block()
            return
        }
        parityEvent(runId, fixtureId, "START")
        try {
            block()
            parityEvent(runId, fixtureId, "PASS")
        } catch (failure: Throwable) {
            val failureType = failure::class.simpleName ?: "Throwable"
            parityEvent(runId, fixtureId, "FAIL", "$fixtureId failed: $failureType")
            throw failure
        }
    }

    private fun parityEvent(
        runId: String,
        fixtureId: String,
        event: String,
        error: String? = null,
    ) {
        val frame =
            buildJsonObject {
                put("fixtureId", fixtureId)
                put("event", event)
                error?.let { put("error", it) }
                put("runId", runId)
            }
        println("SDKGEN_PARITY_EVENT $frame")
        System.out.flush()
    }

    private companion object {
        const val BASE_URI = "https://api.stripe.test"
        const val PARITY_RUN_ID_PROPERTY = "sdkgen.parity.runId"

        /**
         * Digest of the committed corpus manifest. Any regeneration that changes a generated byte moves this,
         * so it must only ever be updated together with a reviewed corpus change.
         *
         * Last moved by ADR-0017 (version-segment grouping), which replaced the single `v1/V1Client.kt` with 79
         * per-resource clients.
         *
         * Note that the manifest's `kotlinApiSha256` is **not** evidence about the emitted public API: it is
         * derived from the declaration model, upstream of emission, so an emitter change that adds or removes
         * a public generated symbol leaves it untouched. An earlier revision of this comment cited it as proof
         * that partitioning preserved the public API, while partitioning was in fact hiding every public
         * per-operation form codec object inside a private partition. `kotlinApiSha256` was byte-identical
         * across both that regression and its repair, which returned 518 public objects to the API. The
         * emitter-level guard is `CodecPartitioningTest`, which inventories public nested types as well as
         * public properties.
         */
        const val MANIFEST_SHA256 = "ec8864d73003a9f50e58d4bbfecc72e51e9f29e2f66127a35ed57c200415c1fe"
    }
}
