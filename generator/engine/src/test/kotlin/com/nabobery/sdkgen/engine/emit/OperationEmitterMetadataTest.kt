@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.BackoffDeclaration
import com.nabobery.sdkgen.engine.declarations.DeepObjectAdditionalPropertiesDeclaration
import com.nabobery.sdkgen.engine.declarations.DeepObjectAdditionalPropertiesSerialization
import com.nabobery.sdkgen.engine.declarations.DeepObjectParameterPropertyDeclaration
import com.nabobery.sdkgen.engine.declarations.IdempotencyDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.MultipartPartDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationDeadlines
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationParameterDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationParameterLocation
import com.nabobery.sdkgen.engine.declarations.OperationRequestBodyAlternative
import com.nabobery.sdkgen.engine.declarations.OperationRequestVariantDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationResponseAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.OperationSafetyDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationSecurityRequirement
import com.nabobery.sdkgen.engine.declarations.OperationSecuritySchemeDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationSecuritySchemeRef
import com.nabobery.sdkgen.engine.declarations.PaginationDeclaration
import com.nabobery.sdkgen.engine.declarations.ParameterSerialization
import com.nabobery.sdkgen.engine.declarations.RequestBodyEncoding
import com.nabobery.sdkgen.engine.declarations.RequestBodyReplayability
import com.nabobery.sdkgen.engine.declarations.ResponseSelectorDeclaration
import com.nabobery.sdkgen.engine.declarations.RetryDeclaration
import com.nabobery.sdkgen.engine.declarations.StreamingDeclaration
import com.nabobery.sdkgen.model.JsonValue
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class OperationEmitterMetadataTest {
    @Test
    fun emitsEveryDeclaredOperationMetadataFieldWithoutRuntimeDefaultOmission() {
        val source = render(operationWithCompleteMetadata())

        assertTrue(source.contains("responseAlternatives = listOf("))
        assertTrue(source.contains("ResponseSelector.ExactStatus(code = 200)"))
        assertTrue(source.contains("ResponseSelector.StatusRange(firstInclusive = 400, lastInclusive = 499)"))
        assertTrue(source.contains("ResponseSelector.Default"))
        assertTrue(source.contains("typeTag = \"WidgetResponse\""))
        assertTrue(source.contains("typeTag = \"ApiError\""))
        assertTrue(source.contains("id = \"listItems.response.alternative0\""))
        assertTrue(source.contains("mode = SdkResponseMode.BUFFERED"))
        assertTrue(source.contains("security = listOf("))
        assertTrue(source.contains("schemeId = \"apiKey\""))
        assertTrue(source.contains("schemeId = \"oauth\""))
        assertTrue(source.contains("scopes = listOf(\"items:read\")"))
        assertTrue(source.contains("schemes = emptyList()"))
        assertTrue(source.contains("safety = OperationSafety(safe = true, idempotent = true)"))
        assertTrue(source.contains("IdempotencyDescriptor(keyHeader = \"Idempotency-Key\", clientGenerated = true)"))
        assertTrue(source.contains("RetryDescriptor("))
        assertTrue(source.contains("retryableStatusCodes = listOf("))
        assertTrue(source.contains("retryConnectionErrors = true"))
        assertTrue(source.contains("maxAttempts = 4"))
        assertTrue(source.contains("BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000)"))
        assertTrue(source.contains("PaginationDescriptor.CursorToken("))
        assertTrue(source.contains("PropertyPath(\"data.items\")"))
        assertTrue(source.contains("PropertyPath(\"nextCursor\")"))
        assertTrue(source.contains("StreamingDescriptor.ServerSentEvents("))
        assertTrue(source.contains("inBandError = null"))
        assertTrue(source.contains("terminalSentinel = \"[DONE]\""))
        assertTrue(source.contains("requestFlag = \"stream\""))
        assertTrue(source.contains("responseContentType = \"text/event-stream\""))
        assertTrue(source.contains("SdkDeadlines(12_000, 3_000, 1_000)"))
    }

    @Test
    fun bodylessResponseVariantsUseStableSemanticNamesAndCollisionOnlyNumbers() {
        val bodyless = KotlinTypeRef("kotlin", "Unit")
        val operation =
            operationWithCompleteMetadata(
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(204),
                            emptyList(),
                            bodyless,
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.StatusRange(400, 499),
                            emptyList(),
                            bodyless,
                        ),
                        OperationResponseAlternative(ResponseSelectorDeclaration.Default, emptyList(), bodyless),
                        OperationResponseAlternative(ResponseSelectorDeclaration.Default, emptyList(), bodyless),
                    ),
            )

        val source = render(operation)

        assertTrue(source.contains("public class SuccessNoContent"))
        assertTrue(source.contains("public class Http400To499NoContent"))
        assertTrue(source.contains("public class DefaultNoContent"))
        assertTrue(source.contains("public class DefaultNoContent2"))
        assertFalse(source.contains("Alternative1"))
        assertFalse(source.contains("Alternative2"))
    }

    @Test
    fun emitsMultipartCodecUsingRuntimeBodyBuilderForTextAndBinaryParts() {
        val source = render(multipartOperation())

        assertTrue(source.contains("MediaTypeCodec<UploadRequest>"))
        assertTrue(source.contains("MultipartBody()"))
        assertTrue(source.contains(".text(name = \"caption\""))
        assertTrue(source.contains("mediaType = \"text/plain\""))
        assertTrue(source.contains(".binary(name = \"file\""))
        assertTrue(source.contains("mediaType = \"image/png\""))
        assertTrue(source.contains("SdkHeader(name = \"X-Part-Checksum\", value = \"checksum\")"))
        assertTrue(source.contains("MediaTypeCodecRegistry.of("))
        assertFalse(source.contains("KotlinxSerializationCodec(UPLOAD_REQUEST_CODEC_ID"))
        assertFalse(source.contains("transport.execute("))
        assertTrue(source.contains("executeBodyless<UploadRequest>"))
    }

    @Test
    fun emitsMultipartAccessorsFromDeclarationMetadataForArbitraryOptionalBinaryParts() {
        val stream = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
        val operation =
            multipartOperation(
                parts =
                    listOf(
                        MultipartPartDeclaration(
                            wireName = "input_audio",
                            accessorName = "inputAudio",
                            type = stream,
                            required = true,
                            contentType = "audio/wav",
                        ),
                        MultipartPartDeclaration(
                            wireName = "attachment",
                            accessorName = "attachment",
                            type = stream.copy(nullable = true),
                            required = false,
                            contentType = "application/octet-stream",
                        ),
                        MultipartPartDeclaration(
                            wireName = "when",
                            accessorName = "whenValue",
                            type = stream,
                            required = true,
                            contentType = "application/octet-stream",
                        ),
                    ),
            )

        val source = render(operation)

        assertTrue(source.contains("name = \"input_audio\", stream = request.inputAudio"))
        assertTrue(source.contains("request.attachment?.let"))
        assertTrue(source.contains("name = \"attachment\", stream = it"))
        assertTrue(source.contains("name = \"when\", stream = request.whenValue"))
        assertFalse(source.contains("request.file"))
    }

    private fun render(operation: OperationDeclaration): String = render(listOf(operation))

    private fun render(operations: List<OperationDeclaration>): String {
        val client =
            OperationClientDeclaration(
                symbolId = "client:MetadataClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "MetadataClient",
                resolvedName = "MetadataClient",
                kdoc = "Metadata emission test client.",
                codecsObjectName = "MetadataCodecs",
                operations = operations,
            )
        return KotlinPoetEmitter(PACKAGE)
            .render(
                KotlinDeclarationModel(
                    listOf(KotlinFileDeclaration(PACKAGE, "MetadataClient", listOf(client))),
                ),
            ).files
            .single()
            .bytes
            .decodeToString()
    }

    private fun operationWithCompleteMetadata(
        responseAlternatives: List<OperationResponseAlternative> =
            listOf(
                OperationResponseAlternative(
                    ResponseSelectorDeclaration.ExactStatus(200),
                    listOf("application/json"),
                    KotlinTypeRef(PACKAGE, "WidgetResponse"),
                    OperationResponseMode.BUFFERED,
                ),
                OperationResponseAlternative(
                    ResponseSelectorDeclaration.StatusRange(200, 299),
                    listOf("application/vnd.widgets+json"),
                    KotlinTypeRef(PACKAGE, "WidgetResponse"),
                    OperationResponseMode.BUFFERED,
                ),
                OperationResponseAlternative(
                    ResponseSelectorDeclaration.StatusRange(400, 499),
                    listOf("application/problem+json"),
                    KotlinTypeRef(PACKAGE, "ApiError"),
                    OperationResponseMode.BUFFERED,
                ),
                OperationResponseAlternative(
                    ResponseSelectorDeclaration.Default,
                    emptyList(),
                    KotlinTypeRef("kotlin", "Unit"),
                    OperationResponseMode.BUFFERED,
                ),
            ),
        parameters: List<OperationParameterDeclaration> = emptyList(),
    ): OperationDeclaration =
        OperationDeclaration(
            symbolId = "operation:listItems",
            order = 0,
            operationId = "listItems",
            operationIdentity = "listItems",
            method = "GET",
            path = "/items",
            requestMediaTypes = emptyList(),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            requestType = KotlinTypeRef("kotlin", "Unit"),
            responseType = KotlinTypeRef(PACKAGE, "WidgetResponse"),
            requestCodecPropertyName = "listItemsRequestCodec",
            responseCodecPropertyName = "listItemsResponseCodec",
            requestCodecConstantName = "LIST_ITEMS_REQUEST_CODEC_ID",
            responseCodecConstantName = "LIST_ITEMS_RESPONSE_CODEC_ID",
            requestCodecId = "listItems.request",
            responseCodecId = "listItems.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(12_000, 3_000, 1_000),
            methodKdoc = "Lists items.",
            parameters = parameters,
            responseAlternatives = responseAlternatives,
            security =
                listOf(
                    OperationSecurityRequirement(
                        listOf(
                            OperationSecuritySchemeRef("apiKey"),
                            OperationSecuritySchemeRef("oauth", listOf("items:read")),
                        ),
                    ),
                    OperationSecurityRequirement(emptyList()),
                ),
            safety = OperationSafetyDeclaration(safe = true, idempotent = true),
            idempotency = IdempotencyDeclaration("Idempotency-Key", clientGenerated = true),
            retry =
                RetryDeclaration(
                    retryableStatusCodes =
                        listOf(
                            ResponseSelectorDeclaration.ExactStatus(408),
                            ResponseSelectorDeclaration.StatusRange(500, 599),
                        ),
                    retryConnectionErrors = true,
                    maxAttempts = 4,
                    backoff = BackoffDeclaration(250, 2.0, 5_000),
                ),
            pagination =
                PaginationDeclaration.CursorToken(
                    "cursor",
                    "limit",
                    "data.items",
                    "nextCursor",
                    KotlinTypeRef(PACKAGE, "Widget"),
                ),
            streaming = StreamingDeclaration.ServerSentEvents("[DONE]", "stream", "text/event-stream"),
        )

    private fun multipartOperation(
        parts: List<MultipartPartDeclaration> =
            listOf(
                MultipartPartDeclaration(
                    wireName = "caption",
                    accessorName = "caption",
                    type = KotlinTypeRef("kotlin", "String"),
                    required = true,
                    contentType = "text/plain",
                    headers = mapOf("X-Part-Checksum" to JsonValue.StringValue("checksum")),
                ),
                MultipartPartDeclaration(
                    wireName = "file",
                    accessorName = "file",
                    type = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                    required = true,
                    contentType = "image/png",
                ),
            ),
    ): OperationDeclaration {
        val requestType = KotlinTypeRef(PACKAGE, "UploadRequest")
        val multipart =
            OperationRequestBodyAlternative(
                mediaType = "multipart/form-data",
                type = requestType,
                required = true,
                multipartParts = parts,
            )
        return OperationDeclaration(
            symbolId = "operation:uploadAsset",
            order = 0,
            operationId = "uploadAsset",
            method = "POST",
            path = "/uploads",
            requestMediaTypes = listOf("multipart/form-data"),
            responseMediaTypes = emptyList(),
            successStatusCodes = setOf(204),
            requestType = requestType,
            responseType = KotlinTypeRef("kotlin", "Unit"),
            requestCodecPropertyName = "uploadAssetRequestCodec",
            responseCodecPropertyName = "uploadAssetResponseCodec",
            requestCodecConstantName = "UPLOAD_REQUEST_CODEC_ID",
            responseCodecConstantName = "UPLOAD_RESPONSE_CODEC_ID",
            requestCodecId = "uploadAsset.request",
            responseCodecId = "uploadAsset.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(60_000, 60_000, null),
            methodKdoc = "Uploads an asset.",
            requestBodyAlternatives = listOf(multipart),
            requestBodyRequired = true,
        )
    }

    @Test
    fun dualMediaOperationEmitsOneMethodCodecAndMetadataPerCallableVariant() {
        val source = render(dualMediaOperation())
        val flat = source.replace(Regex("\\s+"), " ")

        // One callable method per declared variant, each typed to its own request wire type.
        assertTrue(
            Regex("public suspend fun createTranscription\\(\\s?request: SttRequestJson").containsMatchIn(flat),
            source,
        )
        assertTrue(
            Regex("public suspend fun createTranscriptionMultipart\\(\\s?request: SttRequestMultipart")
                .containsMatchIn(flat),
            source,
        )
        // The typed withResponse surface exists for every callable variant too.
        assertTrue(flat.contains("public suspend fun createTranscriptionWithResponse("), source)
        assertTrue(flat.contains("public suspend fun createTranscriptionMultipartWithResponse("), source)
        // Each variant carries its own metadata whose requestMediaTypes are exactly the variant's own —
        // this is what hardcodes the Content-Type per method at execution time. (Single-variant operations keep
        // the operation-level property, so only the multipart variant's dedicated name appears here.)
        assertTrue(flat.contains("""val createTranscriptionMultipartMetadata: OperationMetadata"""), source)
        assertTrue(flat.contains("""requestMediaTypes = listOf("application/json")"""), source)
        assertTrue(flat.contains("""requestMediaTypes = listOf("multipart/form-data")"""), source)
        // Each variant encodes through its own codec: a kotlinx JSON codec for SttRequestJson (id constant
        // "createTranscription.request") and its own multipart codec object for SttRequestMultipart, behind
        // separate registries.
        assertTrue(
            source.contains("""CREATE_TRANSCRIPTION_REQUEST_CODEC_ID: String = "createTranscription.request""""),
            source,
        )
        assertTrue(source.contains("MediaTypeCodec<SttRequestJson>"), source)
        assertTrue(source.contains("MediaTypeCodec<SttRequestMultipart>"), source)
        assertTrue(source.contains(".binary(name = \"file\", stream = request.file"), source)
        assertTrue(source.contains("val createTranscriptionRequestCodecRegistry"), source)
        assertTrue(source.contains("val createTranscriptionMultipartRequestCodecRegistry"), source)
        // No runtime media-type selection anywhere in the generated method bodies: each method body wires
        // only its OWN registry. Slice each method body and assert which registry it references.
        val jsonBody =
            source
                .substringAfter("public suspend fun createTranscription(")
                .substringBefore("public suspend fun")
        val multipartBody =
            source.substringAfter("public suspend fun createTranscriptionMultipart(").substringBefore("\n  }")
        assertTrue(jsonBody.contains("createTranscriptionRequestCodecRegistry"), jsonBody)
        assertFalse(jsonBody.contains("createTranscriptionMultipartRequestCodecRegistry"), jsonBody)
        assertTrue(multipartBody.contains("createTranscriptionMultipartRequestCodecRegistry"), multipartBody)
        assertFalse(multipartBody.contains("createTranscriptionRequestCodecRegistry,"), multipartBody)
        assertFalse(flat.contains("mediaType =="), source)
    }

    @Test
    fun dualMediaVariantsShareResponseTypesDecoderAndErrorSurface() {
        val source = render(dualMediaOperation())
        val flat = source.replace(Regex("\\s+"), " ")

        // Response semantics stay operation-level: one response hierarchy, one decoder object, one API
        // exception type — never duplicated per media family.
        assertEquals(1, Regex("sealed interface CreateTranscriptionResponse").findAll(source).count())
        assertEquals(1, Regex("private object CreateTranscriptionResponseDecoder").findAll(source).count())
        assertEquals(1, Regex("class CreateTranscriptionApiException").findAll(source).count())
        assertTrue(
            flat.contains(
                "executeWithTypedErrors<SttRequestJson, CreateTranscriptionResponse, Transcription>(",
            ),
            source,
        )
        assertTrue(
            flat.contains(
                "executeWithTypedErrors<SttRequestMultipart, CreateTranscriptionResponse, Transcription>(",
            ),
            source,
        )
    }

    @Test
    fun dualMediaStreamingOperationEmitsTheStreamingFlowSurfaceForEveryVariant() {
        val source = render(dualMediaStreamingOperation())
        val flat = source.replace(Regex("\\s+"), " ")

        // The primary keeps its streaming surface: a cold Flow method executed through executeRaw + sseFlow.
        assertTrue(
            Regex("public fun createTranscription\\(\\s?request: SttRequestJson").containsMatchIn(flat),
            source,
        )
        val primaryBody =
            source
                .substringAfter("public fun createTranscription(")
                .substringBefore("public fun")
        assertTrue(primaryBody.contains("executor.executeRaw<SttRequestJson>"), primaryBody)
        assertTrue(primaryBody.contains("createTranscriptionRequestCodecRegistry"), primaryBody)

        // A streaming operation's SECONDARY variant must get the SAME streaming surface — a Flow method through
        // the streaming execution path — differing only in its own request codec ids, request type, and metadata.
        // It must never reach the buffered executor.execute path: streaming operations emit no response codec
        // ids, so that call would always throw after performing transport.
        assertTrue(
            Regex("public fun createTranscriptionMultipart\\(\\s?request: SttRequestMultipart").containsMatchIn(flat),
            source,
        )
        assertFalse(
            Regex("public suspend fun createTranscriptionMultipart").containsMatchIn(flat),
            source,
        )
        val secondarySignature = flat.substringAfter("public fun createTranscriptionMultipart(").trimStart()
        assertTrue(secondarySignature.startsWith("request: SttRequestMultipart"), flat)
        assertTrue(flat.contains("): Flow<StreamEvent>"), source)
        val secondaryBody =
            source
                .substringAfter("public fun createTranscriptionMultipart(")
                .substringBefore("public fun")
        assertTrue(secondaryBody.contains("sseFlow("), secondaryBody)
        assertTrue(secondaryBody.contains("executor.executeRaw<SttRequestMultipart>"), secondaryBody)
        assertFalse(secondaryBody.contains("executor.execute<"), secondaryBody)
        // Own request codec id list and registry; shared event decoding stays operation-level.
        assertTrue(
            secondaryBody.contains("listOf(MetadataCodecs.CREATE_TRANSCRIPTION_MULTIPART_REQUEST_CODEC_ID)"),
            secondaryBody,
        )
        assertTrue(secondaryBody.contains("createTranscriptionMultipartRequestCodecRegistry"), secondaryBody)
        assertTrue(
            secondaryBody.contains(
                "createTranscriptionMultipartMetadata.streaming as? StreamingDescriptor.ServerSentEvents",
            ),
            secondaryBody,
        )
        // Its own metadata hardwires the variant's request media types (the Content-Type of every call).
        assertTrue(flat.contains("""val createTranscriptionMultipartMetadata: OperationMetadata"""), source)
        assertTrue(flat.contains("""requestMediaTypes = listOf("multipart/form-data")"""), source)
        assertFalse(flat.contains("mediaType =="), source)
    }

    @Test
    fun genericSecondaryMediaVariantBindsItsOwnMediaTypesIntoItsCodec() {
        val source = render(dualGenericMediaOperation())
        val flat = source.replace(Regex("\\s+"), " ")

        // A VALUE-family secondary with a generic (non-form, non-multipart) media type is a callable variant
        // taking its wire type directly; its method body executes through its own registry and codec id.
        assertTrue(
            Regex("public suspend fun createTranscriptionMixed\\(\\s?request: String").containsMatchIn(flat),
            source,
        )
        assertTrue(
            flat.contains(
                """CREATE_TRANSCRIPTION_MIXED_REQUEST_CODEC_ID: String = "createTranscription.requestMixed"""",
            ),
            source,
        )
        assertTrue(source.contains("val createTranscriptionMixedRequestCodecRegistry"), source)
        // The codec emitted for this variant must advertise the VARIANT's exact media types: the executor sends
        // the variant's declared Content-Type, and a JSON-only codec can never be selected for it.
        val codecSection =
            source
                .substringAfter("val createTranscriptionMixedRequestCodec: MediaTypeCodec<String>")
                .substringBefore("val createTranscriptionMixedRequestCodecRegistry")
        assertTrue(codecSection.contains("""setOf("multipart/mixed")"""), codecSection)
        val mixedBody = flat.substringAfter("public suspend fun createTranscriptionMixed(")
        assertTrue(mixedBody.contains("createTranscriptionMixedRequestCodecRegistry"), mixedBody)
    }

    @Test
    fun singleVariantDeclarationRendersByteIdenticallyToOperationLevelProjection() {
        val withDeclaredSingleVariant = render(dualMediaOperation(variants = listOf(jsonVariantOnly())))
        val legacy = render(dualMediaOperation(variants = emptyList()))

        assertEquals(legacy, withDeclaredSingleVariant)
    }

    @Test
    fun caseCollidingVariantConstantsAreDisambiguatedThroughTheNamePlan() {
        // 'createTranscriptionABcJson' and 'createTranscriptionAbcJson' are distinct member names, but the
        // screaming-snake transform is lossy: both become CREATE_TRANSCRIPTION_ABC_JSON. Without
        // a collision-checked constant plan the codecs object emits two identical `const val`s and fails to
        // compile; the plan gives the later variant a deterministic numeric suffix instead.
        fun secondary(
            methodName: String,
            suffix: String,
            media: String,
            type: KotlinTypeRef,
        ) = OperationRequestVariantDeclaration(
            methodName = methodName,
            nameSuffix = suffix,
            operationIdentity = "createTranscription",
            mediaTypes = listOf(media),
            type = type,
            required = true,
            replayability = RequestBodyReplayability.REPLAYABLE,
            encoding = RequestBodyEncoding.JSON,
        )
        val rendered =
            render(
                dualMediaOperation(
                    variants =
                        listOf(
                            jsonVariantOnly(),
                            secondary(
                                "createTranscriptionABcJson",
                                "ABcJson",
                                "application/a-bc+json",
                                KotlinTypeRef("kotlin", "Long"),
                            ),
                            secondary(
                                "createTranscriptionAbcJson",
                                "AbcJson",
                                "application/abc+json",
                                KotlinTypeRef("kotlin", "String"),
                            ),
                        ),
                ),
            )
        val screaming = Regex("CREATE_TRANSCRIPTION_ABC_JSON_REQUEST_CODEC_ID\\b").findAll(rendered).count()
        val disambiguated = Regex("CREATE_TRANSCRIPTION_ABC_JSON_REQUEST_CODEC_ID2\\b").findAll(rendered).count()
        assertTrue(screaming > 0, rendered)
        assertTrue(disambiguated > 0, "colliding constant must take a deterministic suffix:\n$rendered")
    }

    @Test
    fun zeroPropertyFormVariantsStillEmitTheFormCodecNeverJson() {
        // A valid zero-property form body has empty field metadata; the FORM encoding on the declaration —
        // not the emptiness of that metadata — must select the form codec. A JSON fallback here would send
        // `{}` under an urlencoded Content-Type.
        val emptyForm =
            OperationRequestVariantDeclaration(
                methodName = "createTranscription",
                nameSuffix = "",
                operationIdentity = "createTranscription",
                mediaTypes = listOf("application/x-www-form-urlencoded"),
                type = KotlinTypeRef(PACKAGE, "SttRequestForm"),
                required = true,
                formFields = emptyList(),
                replayability = RequestBodyReplayability.REPLAYABLE,
                encoding = RequestBodyEncoding.FORM,
            )
        val rendered = render(dualMediaOperation(variants = listOf(emptyForm)))
        assertTrue(rendered.contains("FormCodec"), rendered)
        assertTrue(
            !rendered.contains("KotlinxSerializationCodec(MetadataCodecs.CREATETRANSCRIPTION_REQUEST_CODEC_ID") &&
                !rendered.contains("KotlinxSerializationCodec(CREATETRANSCRIPTION_REQUEST_CODEC_ID"),
            "an empty form variant must never fall back to the kotlinx JSON request codec:\n$rendered",
        )
    }

    private fun jsonVariantOnly(): OperationRequestVariantDeclaration =
        OperationRequestVariantDeclaration(
            methodName = "createTranscription",
            nameSuffix = "",
            operationIdentity = "createTranscription",
            mediaTypes = listOf("application/json"),
            type = KotlinTypeRef(PACKAGE, "SttRequestJson"),
            required = true,
            replayability = RequestBodyReplayability.REPLAYABLE,
            encoding = RequestBodyEncoding.JSON,
        )

    @Test
    fun variantReplayabilityMustMatchTheGeneratedBodyEncoding() {
        val stream = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")

        val streamPartMarkedReplayable =
            OperationRequestVariantDeclaration(
                methodName = "createTranscriptionMultipart",
                nameSuffix = "Multipart",
                operationIdentity = "createTranscription",
                mediaTypes = listOf("multipart/form-data"),
                type = KotlinTypeRef(PACKAGE, "SttRequestMultipart"),
                required = true,
                multipartParts =
                    listOf(
                        MultipartPartDeclaration(
                            wireName = "file",
                            accessorName = "file",
                            type = stream,
                            required = true,
                            contentType = "audio/wav",
                        ),
                    ),
                replayability = RequestBodyReplayability.REPLAYABLE,
                encoding = RequestBodyEncoding.MULTIPART,
            )
        val replayableFailure =
            assertFailsWith<IllegalArgumentException> {
                render(dualMediaOperation(variants = listOf(streamPartMarkedReplayable)))
            }
        assertTrue(requireNotNull(replayableFailure.message).contains("NON_REPLAYABLE"))

        val bytesOnlyMultipartMarkedNonReplayable =
            OperationRequestVariantDeclaration(
                methodName = "createTranscription",
                nameSuffix = "",
                operationIdentity = "createTranscription",
                mediaTypes = listOf("multipart/form-data"),
                type = KotlinTypeRef(PACKAGE, "SttRequestMultipart"),
                required = true,
                multipartParts =
                    listOf(
                        MultipartPartDeclaration(
                            wireName = "file",
                            accessorName = "file",
                            type = KotlinTypeRef(PACKAGE, "FileBytes"),
                            required = true,
                            contentType = "audio/wav",
                        ),
                    ),
                replayability = RequestBodyReplayability.NON_REPLAYABLE,
                encoding = RequestBodyEncoding.MULTIPART,
            )
        val nonReplayableFailure =
            assertFailsWith<IllegalArgumentException> {
                render(dualMediaOperation(variants = listOf(bytesOnlyMultipartMarkedNonReplayable)))
            }
        assertTrue(requireNotNull(nonReplayableFailure.message).contains("REPLAYABLE"))

        val streamBodyMarkedReplayable =
            OperationRequestVariantDeclaration(
                methodName = "uploadBlob",
                nameSuffix = "",
                operationIdentity = "uploadBlob",
                mediaTypes = listOf("application/octet-stream"),
                type = stream,
                required = true,
                replayability = RequestBodyReplayability.REPLAYABLE,
                encoding = RequestBodyEncoding.BINARY,
            )
        val streamFailure =
            assertFailsWith<IllegalArgumentException> {
                render(blobUploadOperation(streamBodyMarkedReplayable))
            }
        assertTrue(requireNotNull(streamFailure.message).contains("NON_REPLAYABLE"))
    }

    private fun blobUploadOperation(variant: OperationRequestVariantDeclaration): OperationDeclaration {
        val stream = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
        return OperationDeclaration(
            symbolId = "operation:uploadBlob",
            order = 0,
            operationId = "uploadBlob",
            operationIdentity = "uploadBlob",
            method = "POST",
            path = "/blobs",
            requestMediaTypes = listOf("application/octet-stream"),
            responseMediaTypes = emptyList(),
            successStatusCodes = setOf(204),
            requestType = stream,
            responseType = KotlinTypeRef("kotlin", "Unit"),
            requestCodecPropertyName = "uploadBlobRequestCodec",
            responseCodecPropertyName = "uploadBlobResponseCodec",
            requestCodecConstantName = "UPLOAD_BLOB_REQUEST_CODEC_ID",
            responseCodecConstantName = "UPLOAD_BLOB_RESPONSE_CODEC_ID",
            requestCodecId = "uploadBlob.request",
            responseCodecId = "uploadBlob.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(null, null, null),
            methodKdoc = "Uploads a blob.",
            requestBodyRequired = true,
            requestVariants = listOf(variant),
        )
    }

    private fun dualMediaOperation(variants: List<OperationRequestVariantDeclaration>? = null): OperationDeclaration {
        val string = KotlinTypeRef("kotlin", "String")
        val jsonRequest = KotlinTypeRef(PACKAGE, "SttRequestJson")
        val multipartRequest = KotlinTypeRef(PACKAGE, "SttRequestMultipart")
        return OperationDeclaration(
            symbolId = "operation:createTranscription",
            order = 0,
            operationId = "createTranscription",
            operationIdentity = "createTranscription",
            method = "POST",
            path = "/audio/transcriptions/{team}",
            requestMediaTypes = listOf("application/json"),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            requestType = jsonRequest,
            responseType = KotlinTypeRef(PACKAGE, "Transcription"),
            requestCodecPropertyName = "createTranscriptionRequestCodec",
            responseCodecPropertyName = "createTranscriptionResponseCodec",
            requestCodecConstantName = "CREATE_TRANSCRIPTION_REQUEST_CODEC_ID",
            responseCodecConstantName = "CREATE_TRANSCRIPTION_RESPONSE_CODEC_ID",
            requestCodecId = "createTranscription.request",
            responseCodecId = "createTranscription.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(60_000, 30_000, null),
            methodKdoc = "Transcribes audio.",
            parameters =
                listOf(
                    OperationParameterDeclaration("team", OperationParameterLocation.PATH, string, required = true),
                ),
            requestBodyAlternatives =
                listOf(
                    OperationRequestBodyAlternative("application/json", jsonRequest, required = true),
                ),
            requestBodyRequired = true,
            requestVariants =
                variants
                    ?: listOf(
                        OperationRequestVariantDeclaration(
                            methodName = "createTranscription",
                            nameSuffix = "",
                            operationIdentity = "createTranscription",
                            mediaTypes = listOf("application/json"),
                            type = jsonRequest,
                            required = true,
                            replayability = RequestBodyReplayability.REPLAYABLE,
                            encoding = RequestBodyEncoding.JSON,
                        ),
                        OperationRequestVariantDeclaration(
                            methodName = "createTranscriptionMultipart",
                            nameSuffix = "Multipart",
                            operationIdentity = "createTranscription",
                            mediaTypes = listOf("multipart/form-data"),
                            type = multipartRequest,
                            required = true,
                            multipartParts =
                                listOf(
                                    MultipartPartDeclaration(
                                        wireName = "file",
                                        accessorName = "file",
                                        type = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                                        required = true,
                                        contentType = "audio/wav",
                                    ),
                                ),
                            replayability = RequestBodyReplayability.NON_REPLAYABLE,
                            encoding = RequestBodyEncoding.MULTIPART,
                        ),
                    ),
            responseAlternatives =
                listOf(
                    OperationResponseAlternative(
                        ResponseSelectorDeclaration.ExactStatus(200),
                        listOf("application/json"),
                        KotlinTypeRef(PACKAGE, "Transcription"),
                    ),
                    OperationResponseAlternative(
                        ResponseSelectorDeclaration.StatusRange(400, 499),
                        listOf("application/problem+json"),
                        KotlinTypeRef(PACKAGE, "ApiError"),
                    ),
                ),
        )
    }

    private fun dualMediaStreamingOperation(): OperationDeclaration {
        val jsonRequest = KotlinTypeRef(PACKAGE, "SttRequestJson")
        val multipartRequest = KotlinTypeRef(PACKAGE, "SttRequestMultipart")
        return OperationDeclaration(
            symbolId = "operation:createTranscription",
            order = 0,
            operationId = "createTranscription",
            operationIdentity = "createTranscription",
            method = "POST",
            path = "/audio/transcriptions/{team}",
            requestMediaTypes = listOf("application/json"),
            responseMediaTypes = listOf("text/event-stream"),
            successStatusCodes = setOf(200),
            requestType = jsonRequest,
            responseType = KotlinTypeRef(PACKAGE, "StreamEvent"),
            requestCodecPropertyName = "createTranscriptionRequestCodec",
            responseCodecPropertyName = "createTranscriptionResponseCodec",
            requestCodecConstantName = "CREATE_TRANSCRIPTION_REQUEST_CODEC_ID",
            responseCodecConstantName = "CREATE_TRANSCRIPTION_RESPONSE_CODEC_ID",
            requestCodecId = "createTranscription.request",
            responseCodecId = "createTranscription.response",
            responseMode = OperationResponseMode.STREAMING,
            deadlines = OperationDeadlines(null, 30_000, null),
            methodKdoc = "Streams transcription events.",
            parameters =
                listOf(
                    OperationParameterDeclaration(
                        "team",
                        OperationParameterLocation.PATH,
                        KotlinTypeRef("kotlin", "String"),
                        required = true,
                    ),
                ),
            requestBodyAlternatives =
                listOf(
                    OperationRequestBodyAlternative("application/json", jsonRequest, required = true),
                ),
            requestBodyRequired = true,
            requestVariants =
                listOf(
                    OperationRequestVariantDeclaration(
                        methodName = "createTranscription",
                        nameSuffix = "",
                        operationIdentity = "createTranscription",
                        mediaTypes = listOf("application/json"),
                        type = jsonRequest,
                        required = true,
                        replayability = RequestBodyReplayability.REPLAYABLE,
                        encoding = RequestBodyEncoding.JSON,
                    ),
                    OperationRequestVariantDeclaration(
                        methodName = "createTranscriptionMultipart",
                        nameSuffix = "Multipart",
                        operationIdentity = "createTranscription",
                        mediaTypes = listOf("multipart/form-data"),
                        type = multipartRequest,
                        required = true,
                        multipartParts =
                            listOf(
                                MultipartPartDeclaration(
                                    wireName = "file",
                                    accessorName = "file",
                                    type = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                                    required = true,
                                    contentType = "audio/wav",
                                ),
                            ),
                        replayability = RequestBodyReplayability.NON_REPLAYABLE,
                        encoding = RequestBodyEncoding.MULTIPART,
                    ),
                ),
            responseAlternatives =
                listOf(
                    OperationResponseAlternative(
                        ResponseSelectorDeclaration.ExactStatus(200),
                        listOf("text/event-stream"),
                        KotlinTypeRef(PACKAGE, "StreamEvent"),
                        OperationResponseMode.STREAMING,
                    ),
                ),
            streaming =
                StreamingDeclaration.ServerSentEvents(
                    "[DONE]",
                    responseContentType = "text/event-stream",
                ),
        )
    }

    private fun dualGenericMediaOperation(): OperationDeclaration {
        val jsonRequest = KotlinTypeRef(PACKAGE, "SttRequestJson")
        return OperationDeclaration(
            symbolId = "operation:createTranscription",
            order = 0,
            operationId = "createTranscription",
            operationIdentity = "createTranscription",
            method = "POST",
            path = "/audio/transcriptions/{team}",
            requestMediaTypes = listOf("application/json"),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            requestType = jsonRequest,
            responseType = KotlinTypeRef(PACKAGE, "Transcription"),
            requestCodecPropertyName = "createTranscriptionRequestCodec",
            responseCodecPropertyName = "createTranscriptionResponseCodec",
            requestCodecConstantName = "CREATE_TRANSCRIPTION_REQUEST_CODEC_ID",
            responseCodecConstantName = "CREATE_TRANSCRIPTION_RESPONSE_CODEC_ID",
            requestCodecId = "createTranscription.request",
            responseCodecId = "createTranscription.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(60_000, 30_000, null),
            methodKdoc = "Transcribes audio.",
            parameters =
                listOf(
                    OperationParameterDeclaration(
                        "team",
                        OperationParameterLocation.PATH,
                        KotlinTypeRef("kotlin", "String"),
                        required = true,
                    ),
                ),
            requestBodyAlternatives =
                listOf(
                    OperationRequestBodyAlternative("application/json", jsonRequest, required = true),
                ),
            requestBodyRequired = true,
            requestVariants =
                listOf(
                    OperationRequestVariantDeclaration(
                        methodName = "createTranscription",
                        nameSuffix = "",
                        operationIdentity = "createTranscription",
                        mediaTypes = listOf("application/json"),
                        type = jsonRequest,
                        required = true,
                        replayability = RequestBodyReplayability.REPLAYABLE,
                        encoding = RequestBodyEncoding.JSON,
                    ),
                    // Hand-built pre-encoding declaration: a JSON-encoding variant over a non-form media
                    // keeps its wire type as-is (here kotlin.String) with no part/field projection.
                    OperationRequestVariantDeclaration(
                        methodName = "createTranscriptionMixed",
                        nameSuffix = "Mixed",
                        operationIdentity = "createTranscription",
                        mediaTypes = listOf("multipart/mixed"),
                        type = KotlinTypeRef("kotlin", "String"),
                        required = true,
                        replayability = RequestBodyReplayability.REPLAYABLE,
                        encoding = RequestBodyEncoding.JSON,
                    ),
                ),
            responseAlternatives =
                listOf(
                    OperationResponseAlternative(
                        ResponseSelectorDeclaration.ExactStatus(200),
                        listOf("application/json"),
                        KotlinTypeRef(PACKAGE, "Transcription"),
                    ),
                ),
        )
    }

    @Test
    fun emitsColdTypedSseFlowThroughRuntimeHelperAndDescriptor() {
        val source =
            render(
                OperationDeclaration(
                    symbolId = "operation:streamEvents",
                    order = 0,
                    operationId = "streamEvents",
                    operationIdentity = "streamEvents",
                    method = "GET",
                    path = "/events",
                    requestMediaTypes = emptyList(),
                    responseMediaTypes = listOf("text/event-stream"),
                    successStatusCodes = setOf(200),
                    requestType = KotlinTypeRef("kotlin", "Unit"),
                    responseType = KotlinTypeRef(PACKAGE, "Event"),
                    requestCodecPropertyName = "streamEventsRequestCodec",
                    responseCodecPropertyName = "streamEventsResponseCodec",
                    requestCodecConstantName = "STREAM_EVENTS_REQUEST_CODEC_ID",
                    responseCodecConstantName = "STREAM_EVENTS_RESPONSE_CODEC_ID",
                    requestCodecId = "streamEvents.request",
                    responseCodecId = "streamEvents.response",
                    responseMode = OperationResponseMode.STREAMING,
                    deadlines = OperationDeadlines(null, 30_000, null),
                    methodKdoc = "Streams events.",
                    streaming = StreamingDeclaration.ServerSentEvents("[DONE]", "stream", "text/event-stream"),
                ),
            )

        assertTrue(source.contains("public fun streamEvents("))
        assertTrue(source.contains("): Flow<Event>"))
        assertTrue(source.contains("sseFlow("))
        assertTrue(source.contains(".decodeData"))
        assertTrue(source.contains("metadata.streaming as? StreamingDescriptor.ServerSentEvents"))
        assertTrue(source.contains("executor.executeRaw<Unit>"))
        assertTrue(source.contains("options"))
        assertFalse(source.contains("public suspend fun streamEvents"))
        assertFalse(source.contains("transport.execute("))
        assertFalse(source.contains("ByteReadChannel"))
        assertFalse(source.contains("okio"))
        assertFalse(source.contains("InputStream"))
    }

    @Test
    fun mixedStreamingMethodUsesRawTypedErrorsWithGeneratedDecoderAndMapper() {
        val source =
            render(
                OperationDeclaration(
                    symbolId = "operation:sendChat",
                    order = 0,
                    operationId = "sendChat",
                    operationIdentity = "sendChat",
                    method = "POST",
                    path = "/chat",
                    requestMediaTypes = listOf("application/json"),
                    responseMediaTypes = listOf("application/json"),
                    successStatusCodes = setOf(200),
                    requestType = KotlinTypeRef(PACKAGE, "ChatRequest"),
                    responseType = KotlinTypeRef(PACKAGE, "ChatResult"),
                    requestCodecPropertyName = "sendChatRequestCodec",
                    responseCodecPropertyName = "sendChatResponseCodec",
                    requestCodecConstantName = "SEND_CHAT_REQUEST_CODEC_ID",
                    responseCodecConstantName = "SEND_CHAT_RESPONSE_CODEC_ID",
                    requestCodecId = "sendChat.request",
                    responseCodecId = "sendChat.response",
                    responseMode = OperationResponseMode.MIXED,
                    deadlines = OperationDeadlines(60_000, 30_000, null),
                    methodKdoc = "Sends chat.",
                    responseAlternatives =
                        listOf(
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.ExactStatus(200),
                                listOf("application/json"),
                                KotlinTypeRef(PACKAGE, "ChatResult"),
                            ),
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.ExactStatus(401),
                                listOf("application/json"),
                                KotlinTypeRef(PACKAGE, "ErrorResponse"),
                            ),
                        ),
                    streaming =
                        StreamingDeclaration.ServerSentEvents(
                            "[DONE]",
                            responseContentType = "text/event-stream",
                        ),
                    streamResponseType = KotlinTypeRef(PACKAGE, "ChatDelta"),
                ),
            )

        assertTrue(source.contains("public fun sendChatStream("))
        assertTrue(source.contains("executor.executeRawWithTypedErrors<ChatRequest, SendChatResponse>("))
        assertTrue(source.contains("responseDecoder = SendChatResponseDecoder"))
        assertTrue(
            source.contains(
                "is SendChatResponse.Http401Json -> SendChatApiException(response, statusCode, headers)",
            ),
        )
    }

    @Test
    fun rejectsIncompatibleStreamingAlternativesBeforeEmittingMetadataOnlyClient() {
        val failure =
            assertFailsWith<IllegalArgumentException> {
                render(
                    streamingOperation(
                        listOf(
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.ExactStatus(200),
                                listOf("text/event-stream"),
                                KotlinTypeRef("kotlin", "String"),
                                OperationResponseMode.STREAMING,
                            ),
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.ExactStatus(200),
                                listOf("application/x-ndjson"),
                                KotlinTypeRef("kotlin", "Int"),
                                OperationResponseMode.STREAMING,
                            ),
                        ),
                    ),
                )
            }

        assertTrue(requireNotNull(failure.message).contains("streamVariants"))
        assertTrue(requireNotNull(failure.message).contains("incompatible successful streaming response shapes"))
        assertTrue(requireNotNull(failure.message).contains("no callable API"))
    }

    @Test
    fun emitsCallableStreamingMethodForCompatibleStreamingAlternatives() {
        val source =
            render(
                streamingOperation(
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("text/event-stream"),
                            KotlinTypeRef("kotlin", "String"),
                            OperationResponseMode.STREAMING,
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("application/x-ndjson"),
                            KotlinTypeRef("kotlin", "String"),
                            OperationResponseMode.STREAMING,
                        ),
                    ),
                ),
            )

        assertTrue(source.contains("public fun streamVariants("))
        assertTrue(source.contains("): Flow<String>"))
        assertTrue(source.contains("responseAlternatives = listOf("))
        assertFalse(source.contains("public suspend fun streamVariantsWithResponse("))
    }

    @Test
    fun emitsRawSseEventFlowWithoutInventingASerializationCodec() {
        val source =
            render(
                OperationDeclaration(
                    symbolId = "operation:rawEvents",
                    order = 0,
                    operationId = "rawEvents",
                    operationIdentity = "rawEvents",
                    method = "GET",
                    path = "/raw-events",
                    requestMediaTypes = emptyList(),
                    responseMediaTypes = listOf("text/event-stream"),
                    successStatusCodes = setOf(200),
                    requestType = KotlinTypeRef("kotlin", "Unit"),
                    responseType = KotlinTypeRef("com.nabobery.sdkgen.runtime.streaming", "SseEvent"),
                    requestCodecPropertyName = "rawEventsRequestCodec",
                    responseCodecPropertyName = "rawEventsResponseCodec",
                    requestCodecConstantName = "RAW_EVENTS_REQUEST_CODEC_ID",
                    responseCodecConstantName = "RAW_EVENTS_RESPONSE_CODEC_ID",
                    requestCodecId = "rawEvents.request",
                    responseCodecId = "rawEvents.response",
                    responseMode = OperationResponseMode.STREAMING,
                    deadlines = OperationDeadlines(null, 30_000, null),
                    methodKdoc = "Streams raw events.",
                    streaming = StreamingDeclaration.ServerSentEvents("[DONE]"),
                ),
            )

        assertTrue(source.contains("public fun rawEvents("))
        assertTrue(source.contains("): Flow<SseEvent>"))
        assertTrue(source.contains("sseFlow("))
        assertFalse(source.contains("KotlinxSerializationCodec(RAW_EVENTS_RESPONSE_CODEC_ID"))
        assertFalse(source.contains("decodeData"))
    }

    @Test
    fun emitsPaginationFirstPagePagesAndItemsViewsWithBoundsDelegation() {
        val source =
            render(
                OperationDeclaration(
                    symbolId = "operation:listItems",
                    order = 0,
                    operationId = "listItems",
                    operationIdentity = "listItems",
                    method = "GET",
                    path = "/items",
                    requestMediaTypes = emptyList(),
                    responseMediaTypes = listOf("application/json"),
                    successStatusCodes = setOf(200),
                    requestType = KotlinTypeRef("kotlin", "Unit"),
                    responseType = KotlinTypeRef(PACKAGE, "WidgetResponse"),
                    requestCodecPropertyName = "listItemsRequestCodec",
                    responseCodecPropertyName = "listItemsResponseCodec",
                    requestCodecConstantName = "LIST_ITEMS_REQUEST_CODEC_ID",
                    responseCodecConstantName = "LIST_ITEMS_RESPONSE_CODEC_ID",
                    requestCodecId = "listItems.request",
                    responseCodecId = "listItems.response",
                    responseMode = OperationResponseMode.BUFFERED,
                    deadlines = OperationDeadlines(12_000, 3_000, 1_000),
                    methodKdoc = "Lists items.",
                    parameters =
                        listOf(
                            OperationParameterDeclaration(
                                "cursor",
                                OperationParameterLocation.QUERY,
                                KotlinTypeRef("kotlin", "String"),
                                required = false,
                            ),
                            OperationParameterDeclaration(
                                "limit",
                                OperationParameterLocation.QUERY,
                                KotlinTypeRef("kotlin", "Int"),
                                required = false,
                            ),
                        ),
                    pagination =
                        PaginationDeclaration.CursorToken(
                            "cursor",
                            "limit",
                            "data",
                            "nextCursor",
                            KotlinTypeRef(PACKAGE, "Widget"),
                        ),
                ),
            )

        assertTrue(source.contains("public suspend fun listItems("))
        assertTrue(source.contains("cursor: String? = null"))
        assertTrue(source.contains("limit: Int? = null"))
        assertTrue(source.contains("): Page<WidgetResponse, Widget>"))
        assertTrue(source.contains("public fun listItemsPages("))
        assertTrue(source.contains("): Flow<Page<WidgetResponse, Widget>>"))
        assertTrue(source.contains("public fun listItemsItems("))
        assertTrue(source.contains("): Flow<Widget>"))
        assertTrue(source.contains("PaginationEngine<WidgetResponse, Widget>"))
        assertTrue(source.contains(".firstPage { pageRequest ->"))
        assertTrue(source.contains(".pages(fetch = { pageRequest ->"))
        assertTrue(source.contains(".items(fetch = { pageRequest ->"))
        assertTrue(source.contains("pagination ="))
        assertTrue(source.contains("options.pagination"))
        assertTrue(source.contains("PageEnvelope(value = response"))
        assertTrue(source.contains("PageRequest.NextCursor"))
        assertTrue(source.contains("metadataForListItemsPage"))
        assertTrue(source.contains("pageRequest.cursor"))
        assertTrue(source.contains("SdkParameterLocation.QUERY"))
        assertFalse(source.contains("PageRequest.First -> cursor,"))
        assertFalse(source.contains("PageRequest.First -> request,"))
        assertFalse(source.contains("\"cursor\" + \"=\" + it"))
        assertFalse(source.contains("transport.execute("))
    }

    @Test
    fun emitsOffsetLimitPaginationWithEngineStateTotalAndNoNarrowingOffsetSplice() {
        val source = render(offsetLimitOperation(responseTotalPath = "total"))
        // The descriptor literal is long enough for KotlinPoet to wrap it, so match on collapsed whitespace.
        val flat = source.replace(Regex("\\s+"), " ")

        assertTrue(source.contains("public suspend fun listItems("))
        assertTrue(source.contains("offset: Int? = null"))
        assertTrue(source.contains("limit: Int? = null"))
        assertTrue(source.contains("): Page<WidgetResponse, Widget>"))
        assertTrue(source.contains("public fun listItemsPages("))
        assertTrue(source.contains("public fun listItemsItems("))
        assertTrue(source.contains("PaginationEngine<WidgetResponse, Widget>"))
        assertTrue(
            flat.contains(
                "PaginationDescriptor.OffsetLimit(requestOffsetParam = \"offset\", " +
                    "requestLimitParam = \"limit\", responseItemsPath = PropertyPath(\"data\"), " +
                    "responseTotalPath = PropertyPath(\"total\"))",
            ),
            source,
        )
        assertTrue(flat.contains("requestedPageSize = limit,"), source)
        assertTrue(flat.contains("initialOffset = offset?.toLong() ?: 0L,"), source)
        assertTrue(flat.contains("is PageRequest.NextOffset -> listOf(pageRequest.offset.toString())"), source)
        assertTrue(flat.contains("totalCount = response.total?.toLong()"), source)
        // No-narrowing: the continuation offset is never round-tripped through the generated Int parameter.
        assertFalse(source.contains("pageRequest.offset.toInt()"), source)
        assertFalse(source.contains("PageRequest.NextCursor -> pageRequest.cursor"), source)
    }

    @Test
    fun emitsOffsetLimitPaginationWithoutADeclaredTotalOmitsTotalCount() {
        val source = render(offsetLimitOperation(responseTotalPath = null))
        val flat = source.replace(Regex("\\s+"), " ")

        assertTrue(
            flat.contains(
                "PaginationDescriptor.OffsetLimit(requestOffsetParam = \"offset\", " +
                    "requestLimitParam = \"limit\", responseItemsPath = PropertyPath(\"data\"), " +
                    "responseTotalPath = null)",
            ),
            source,
        )
        assertTrue(flat.contains("requestedPageSize = limit,"), source)
        assertTrue(flat.contains("initialOffset = offset?.toLong() ?: 0L,"), source)
        assertFalse(source.contains("totalCount ="), source)
    }

    private fun offsetLimitOperation(responseTotalPath: String?): OperationDeclaration =
        OperationDeclaration(
            symbolId = "operation:listItems",
            order = 0,
            operationId = "listItems",
            operationIdentity = "listItems",
            method = "GET",
            path = "/items",
            requestMediaTypes = emptyList(),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            requestType = KotlinTypeRef("kotlin", "Unit"),
            responseType = KotlinTypeRef(PACKAGE, "WidgetResponse"),
            requestCodecPropertyName = "listItemsRequestCodec",
            responseCodecPropertyName = "listItemsResponseCodec",
            requestCodecConstantName = "LIST_ITEMS_REQUEST_CODEC_ID",
            responseCodecConstantName = "LIST_ITEMS_RESPONSE_CODEC_ID",
            requestCodecId = "listItems.request",
            responseCodecId = "listItems.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(12_000, 3_000, 1_000),
            methodKdoc = "Lists items.",
            parameters =
                listOf(
                    OperationParameterDeclaration(
                        "offset",
                        OperationParameterLocation.QUERY,
                        KotlinTypeRef("kotlin", "Int"),
                        required = false,
                    ),
                    OperationParameterDeclaration(
                        "limit",
                        OperationParameterLocation.QUERY,
                        KotlinTypeRef("kotlin", "Int"),
                        required = false,
                    ),
                ),
            pagination =
                PaginationDeclaration.OffsetLimit(
                    requestOffsetParam = "offset",
                    requestLimitParam = "limit",
                    responseItemsPath = "data",
                    responseTotalPath = responseTotalPath,
                    itemType = KotlinTypeRef(PACKAGE, "Widget"),
                ),
        )

    @Test
    fun emitsParameterSerializationContractsForCommaJoinedAndDeepObjectValues() {
        val source =
            render(
                operationWithCompleteMetadata(
                    parameters =
                        listOf(
                            OperationParameterDeclaration(
                                "ids",
                                OperationParameterLocation.QUERY,
                                KotlinTypeRef(
                                    "kotlin.collections",
                                    "List",
                                    arguments = listOf(KotlinTypeRef("kotlin", "String")),
                                ),
                                required = false,
                                style = "form",
                                explode = false,
                                serialization = ParameterSerialization.CommaJoined,
                            ),
                            OperationParameterDeclaration(
                                "X-Scopes",
                                OperationParameterLocation.HEADER,
                                KotlinTypeRef(
                                    "kotlin.collections",
                                    "List",
                                    arguments = listOf(KotlinTypeRef("kotlin", "String")),
                                ),
                                required = true,
                                style = "simple",
                                explode = false,
                                serialization = ParameterSerialization.CommaJoined,
                            ),
                            OperationParameterDeclaration(
                                "filter",
                                OperationParameterLocation.QUERY,
                                KotlinTypeRef(PACKAGE, "Filter"),
                                required = false,
                                style = "deepObject",
                                explode = true,
                                serialization =
                                    ParameterSerialization.DeepObject(
                                        listOf(
                                            DeepObjectParameterPropertyDeclaration(
                                                "status",
                                                "status",
                                                required = false,
                                            ),
                                            DeepObjectParameterPropertyDeclaration("limit", "limit", required = true),
                                        ),
                                        DeepObjectAdditionalPropertiesDeclaration(
                                            accessorName = "additionalProperties",
                                            serialization =
                                                DeepObjectAdditionalPropertiesSerialization.JSON_PRIMITIVE_CONTENT,
                                        ),
                                    ),
                            ),
                            OperationParameterDeclaration(
                                "expand",
                                OperationParameterLocation.QUERY,
                                KotlinTypeRef(
                                    "kotlin.collections",
                                    "List",
                                    arguments = listOf(KotlinTypeRef("kotlin", "String")),
                                ),
                                required = false,
                                style = "deepObject",
                                explode = true,
                                serialization = ParameterSerialization.StripeCompatibleIndexedArray,
                            ),
                            OperationParameterDeclaration(
                                "created",
                                OperationParameterLocation.QUERY,
                                KotlinTypeRef("kotlin", "String"),
                                required = false,
                                style = "deepObject",
                                explode = true,
                                serialization = ParameterSerialization.StripeCompatibleScalar,
                            ),
                            OperationParameterDeclaration(
                                "created_union",
                                OperationParameterLocation.QUERY,
                                KotlinTypeRef(PACKAGE, "Created"),
                                required = false,
                                style = "deepObject",
                                explode = true,
                                serialization = ParameterSerialization.StripeCompatibleJsonScalar,
                            ),
                        ),
                ),
            )

        assertTrue(source.contains("values = ids?.let { listOf(it.joinToString(\",\")) }.orEmpty()"))
        assertTrue(source.contains("values = listOf(xScopes.joinToString(\",\"))"))
        assertTrue(source.contains("name = \"filter[status]\""))
        assertTrue(source.contains("name = \"filter[limit]\""))
        assertTrue(source.contains("filter?.status?.let"))
        assertTrue(source.contains("filter?.limit?.let"))
        assertTrue(source.contains("filter?.additionalProperties?.let { dynamicProperties ->"))
        assertTrue(source.contains("dynamicProperties.keys.sorted().forEach { key ->"))
        assertTrue(source.contains("name = \"filter\" + \"[\" + key + \"]\""))
        assertTrue(source.contains("deepObject parameter 'filter' additionalProperties entry '"))
        assertTrue(source.contains("values = listOf(primitive.content)"))
        assertTrue(source.contains("expand?.forEachIndexed { index, value ->"))
        assertTrue(source.contains("name = \"expand\" + \"[\" + index + \"]\""))
        assertTrue(source.contains("name = \"created\", values = created?.let { listOf(it.toString()) }.orEmpty()"))
        assertTrue(source.contains("createdUnion?.let { value ->"))
        assertTrue(source.contains("value.raw as? JsonPrimitive"))
    }

    @Test
    fun serializesEnumDeepObjectAdditionalPropertiesWithWireValue() {
        val source =
            render(
                operationWithCompleteMetadata(
                    parameters =
                        listOf(
                            OperationParameterDeclaration(
                                "filter",
                                OperationParameterLocation.QUERY,
                                KotlinTypeRef(PACKAGE, "Filter"),
                                required = false,
                                style = "deepObject",
                                explode = true,
                                serialization =
                                    ParameterSerialization.DeepObject(
                                        properties = emptyList(),
                                        additionalProperties =
                                            DeepObjectAdditionalPropertiesDeclaration(
                                                accessorName = "additionalProperties",
                                                serialization =
                                                    DeepObjectAdditionalPropertiesSerialization.OPEN_ENUM_VALUE,
                                            ),
                                    ),
                            ),
                        ),
                ),
            )

        assertTrue(source.contains("values = listOf(dynamicValue.value)"))
        assertFalse(source.contains("values = listOf(dynamicValue.toString())"))
    }

    @Test
    fun stringifiesScalarTypedDeepObjectAdditionalProperties() {
        val source =
            render(
                operationWithCompleteMetadata(
                    parameters =
                        listOf(
                            OperationParameterDeclaration(
                                "filter",
                                OperationParameterLocation.QUERY,
                                KotlinTypeRef(PACKAGE, "Filter"),
                                required = false,
                                style = "deepObject",
                                explode = true,
                                serialization =
                                    ParameterSerialization.DeepObject(
                                        properties = emptyList(),
                                        additionalProperties =
                                            DeepObjectAdditionalPropertiesDeclaration(
                                                accessorName = "additionalProperties",
                                                serialization =
                                                    DeepObjectAdditionalPropertiesSerialization.TO_STRING,
                                            ),
                                    ),
                            ),
                        ),
                ),
            )

        assertTrue(source.contains("values = listOf(dynamicValue.toString())"))
    }

    @Test
    fun emitsHeaderNextUrlPaginationUsingLinkHeaderAndExecuteWithHeaders() {
        val source =
            render(
                OperationDeclaration(
                    symbolId = "operation:listIssues",
                    order = 0,
                    operationId = "listIssues",
                    operationIdentity = "listIssues",
                    method = "GET",
                    path = "/repos/{owner}/{repo}/issues",
                    requestMediaTypes = emptyList(),
                    responseMediaTypes = listOf("application/json"),
                    successStatusCodes = setOf(200),
                    requestType = KotlinTypeRef("kotlin", "Unit"),
                    responseType = KotlinTypeRef(PACKAGE, "IssuePage"),
                    requestCodecPropertyName = "listIssuesRequestCodec",
                    responseCodecPropertyName = "listIssuesResponseCodec",
                    requestCodecConstantName = "LIST_ISSUES_REQUEST_CODEC_ID",
                    responseCodecConstantName = "LIST_ISSUES_RESPONSE_CODEC_ID",
                    requestCodecId = "listIssues.request",
                    responseCodecId = "listIssues.response",
                    responseMode = OperationResponseMode.BUFFERED,
                    deadlines = OperationDeadlines(12_000, 3_000, 1_000),
                    methodKdoc = "Lists issues.",
                    parameters =
                        listOf(
                            OperationParameterDeclaration(
                                "owner",
                                OperationParameterLocation.PATH,
                                KotlinTypeRef("kotlin", "String"),
                                required = true,
                            ),
                            OperationParameterDeclaration(
                                "repo",
                                OperationParameterLocation.PATH,
                                KotlinTypeRef("kotlin", "String"),
                                required = true,
                            ),
                        ),
                    pagination =
                        PaginationDeclaration.HeaderNextUrl(
                            "items",
                            KotlinTypeRef(PACKAGE, "Issue"),
                        ),
                ),
            )

        assertTrue(source.contains("public suspend fun listIssues("))
        assertTrue(source.contains("): Page<IssuePage, Issue>"))
        assertTrue(source.contains("public fun listIssuesPages("))
        assertTrue(source.contains("public fun listIssuesItems("))
        assertTrue(source.contains("PaginationDescriptor.HeaderNextUrl(responseItemsPath = PropertyPath(\"items\"))"))
        assertTrue(source.contains("private val paginationTrustedHosts: TrustedHosts"))
        assertTrue(source.contains("trustedHosts = paginationTrustedHosts,"))
        assertTrue(source.contains("splitResolvedUrl(pageRequest.url)"))
        assertTrue(source.contains("executor.executeWithHeaders<Unit, IssuePage>("))
        assertTrue(source.contains("pageMetadata.copy(path = effectivePath)"))
        assertTrue(source.contains("buildRequestUri(effectiveBaseUri, effectivePath, effectiveParameters)"))
        assertTrue(source.contains("responseHeaders = response.headers,"))
        assertTrue(source.contains("requestUri = requestUri,"))
        assertFalse(source.contains("nextCursor ="))
    }

    @Test
    fun emitsAllParameterLocationsWithSafeSignaturesAndContractSchemes() {
        val string = KotlinTypeRef("kotlin", "String")
        val stringList = KotlinTypeRef("kotlin.collections", "List", listOf(string))
        val operation =
            OperationDeclaration(
                symbolId = "operation:getFile",
                order = 0,
                operationId = "getFile",
                operationIdentity = "getFile",
                method = "GET",
                path = "/files/{id}",
                requestMediaTypes = emptyList(),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(200),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = KotlinTypeRef("kotlin", "Unit"),
                requestCodecPropertyName = "getFileRequestCodec",
                responseCodecPropertyName = "getFileResponseCodec",
                requestCodecConstantName = "GET_FILE_REQUEST_CODEC_ID",
                responseCodecConstantName = "GET_FILE_RESPONSE_CODEC_ID",
                requestCodecId = "getFile.request",
                responseCodecId = "getFile.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Gets one file.",
                parameters =
                    listOf(
                        OperationParameterDeclaration(
                            name = "id",
                            location = OperationParameterLocation.PATH,
                            type = string,
                            required = true,
                        ),
                        OperationParameterDeclaration(
                            name = "q",
                            location = OperationParameterLocation.QUERY,
                            type = string,
                            required = false,
                        ),
                        OperationParameterDeclaration(
                            name = "X-Trace",
                            location = OperationParameterLocation.HEADER,
                            type = stringList,
                            required = false,
                        ),
                        OperationParameterDeclaration(
                            name = "session",
                            location = OperationParameterLocation.COOKIE,
                            type = string,
                            required = false,
                        ),
                    ),
                security =
                    listOf(
                        OperationSecurityRequirement(
                            listOf(OperationSecuritySchemeRef("bearer")),
                        ),
                        OperationSecurityRequirement(emptyList()),
                    ),
            )
        val client =
            OperationClientDeclaration(
                symbolId = "client:FilesClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "FilesClient",
                resolvedName = "FilesClient",
                kdoc = "Files client.",
                codecsObjectName = "FilesCodecs",
                operations = listOf(operation),
                securitySchemes = mapOf("bearer" to OperationSecuritySchemeDeclaration.HttpBearer()),
            )
        val source =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(listOf(KotlinFileDeclaration(PACKAGE, "FilesClient", listOf(client)))),
                ).files
                .single()
                .bytes
                .decodeToString()

        assertTrue(source.contains("public suspend fun getFile("))
        assertTrue(source.contains("id: String"))
        assertTrue(source.contains("q: String? = null"))
        assertTrue(source.contains("xTrace: List<String>? = null"))
        assertTrue(source.contains("session: String? = null"))
        assertTrue(source.contains("SdkParameterLocation.PATH"))
        assertTrue(source.contains("SdkParameterLocation.QUERY"))
        assertTrue(source.contains("SdkParameterLocation.HEADER"))
        assertTrue(source.contains("SdkParameterLocation.COOKIE"))
        assertTrue(source.contains("private val contractSecuritySchemes"))
        assertTrue(source.contains("\"bearer\" to SecurityScheme.HttpBearer()"))
        assertTrue(source.contains("authentication = this@FilesClient.authentication"))
        assertFalse(source.contains("Secret("))
    }

    @Test
    fun paginatedViewNamesAvoidExistingOperationNames() {
        val paginated =
            OperationDeclaration(
                symbolId = "operation:listItems",
                order = 0,
                operationId = "listItems",
                operationIdentity = "listItems",
                method = "GET",
                path = "/items",
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = KotlinTypeRef(PACKAGE, "WidgetResponse"),
                requestCodecPropertyName = "listItemsRequestCodec",
                responseCodecPropertyName = "listItemsResponseCodec",
                requestCodecConstantName = "LIST_ITEMS_REQUEST_CODEC_ID",
                responseCodecConstantName = "LIST_ITEMS_RESPONSE_CODEC_ID",
                requestCodecId = "listItems.request",
                responseCodecId = "listItems.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Lists items.",
                pagination =
                    PaginationDeclaration.CursorToken(
                        "cursor",
                        null,
                        "data",
                        "nextCursor",
                        KotlinTypeRef(PACKAGE, "Widget"),
                    ),
            )
        val colliding =
            paginatedOperation("listItemsPages")
        val source = render(listOf(paginated, colliding))

        assertTrue(source.contains("public suspend fun listItems("))
        assertTrue(source.contains("public fun listItemsPages2("))
        assertTrue(source.contains("public suspend fun listItemsPages("))
    }

    private fun paginatedOperation(operationId: String): OperationDeclaration =
        OperationDeclaration(
            symbolId = "operation:$operationId",
            order = 1,
            operationId = operationId,
            operationIdentity = operationId,
            method = "GET",
            path = "/$operationId",
            requestMediaTypes = emptyList(),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            requestType = KotlinTypeRef("kotlin", "Unit"),
            responseType = KotlinTypeRef(PACKAGE, "WidgetResponse"),
            requestCodecPropertyName = "${operationId}RequestCodec",
            responseCodecPropertyName = "${operationId}ResponseCodec",
            requestCodecConstantName = "${operationId.uppercase()}_REQUEST_CODEC_ID",
            responseCodecConstantName = "${operationId.uppercase()}_RESPONSE_CODEC_ID",
            requestCodecId = "$operationId.request",
            responseCodecId = "$operationId.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(null, null, null),
            methodKdoc = "Executes '$operationId'.",
        )

    @Test
    fun emitsAndOrAndAnonymousSecurityRequirementsAsNeutralMetadata() {
        val source = render(operationWithCompleteMetadata())

        assertTrue(source.contains("security = listOf("))
        assertTrue(source.contains("SecurityRequirement(schemes = listOf("))
        assertTrue(source.contains("schemeId = \"apiKey\""))
        assertTrue(source.contains("schemeId = \"oauth\""))
        assertTrue(source.contains("SecurityRequirement(schemes = emptyList())"))
        assertFalse(source.contains("Secret("))
    }

    @Test
    fun omitsContractSecuritySchemesWhenNoOperationRequiresAuthentication() {
        val source = render(multipartOperation())

        assertFalse(source.contains("contractSecuritySchemes"))
        assertFalse(source.contains("SecuritySchemeAuthentication("))
        assertTrue(source.contains("private val authentication: SdkAuthentication?"))
    }

    @Test
    fun emitsCredentialProviderAndNeutralAuthenticationConstructorSurface() {
        val source = render(operationWithCompleteMetadata())

        assertTrue(source.contains("credentialProviders: Map<String, CredentialProvider> = emptyMap()"))
        assertFalse(source.contains("securitySchemes: Map<String, SecurityScheme> = emptyMap()"))
        assertTrue(source.contains("trustedHosts: TrustedHosts? = null"))
        assertTrue(source.contains("authentication: SdkAuthentication? = null"))
        assertTrue(source.contains("private val contractSecuritySchemes: Map<String, SecurityScheme>"))
        assertTrue(source.contains("SecuritySchemeAuthentication("))
        assertTrue(source.contains("bindings ="))
        assertTrue(source.contains("contractSecuritySchemes.mapNotNull"))
        assertTrue(source.contains("credentialProviders[schemeId]"))
        assertTrue(source.contains("authentication = this@MetadataClient.authentication"))
        assertFalse(source.contains("Secret("))
        assertFalse(source.contains("token-"))
    }

    @Test
    fun emitsTypedWithResponseApiForExactRangeDefaultAndUnknownAlternatives() {
        val source = render(operationWithCompleteMetadata())

        assertTrue(source.contains("public suspend fun listItemsWithResponse("))
        assertTrue(source.contains("SdkResponseResult<"))
        assertTrue(source.contains("public sealed interface ListItemsResponse"))
        assertTrue(source.contains("public class SuccessJson("))
        assertTrue(source.contains("public class Http400To499ProblemJson("))
        assertTrue(source.contains("public class DefaultNoContent("))
        assertTrue(source.contains("public class Unknown("))
        assertTrue(source.contains("SdkResponseAlternativeDecoder<ListItemsResponse>"))
        assertTrue(source.contains("executeWithResponse"))
        assertTrue(source.contains("alternative.id == \"listItems.response.alternative0\""))
        assertTrue(source.contains("alternative.id == \"listItems.response.alternative1\""))
        assertTrue(source.contains("alternative.id == \"listItems.response.alternative2\""))
        assertTrue(source.contains("alternative.id == \"listItems.response.alternative3\""))
        assertTrue(source.contains("SdkResponseDecodeResult<ListItemsResponse>"))
        assertFalse(source.contains("alternative.selector =="))
        assertTrue(source.contains("public suspend fun listItems("))
        assertTrue(source.contains("): Page<WidgetResponse, Widget>"))
    }

    @Test
    fun emitsUniqueDispatchForSameStatusJsonAndBinaryAlternativesInEitherOrder() {
        val json =
            OperationResponseAlternative(
                ResponseSelectorDeclaration.ExactStatus(200),
                listOf("application/json"),
                KotlinTypeRef("kotlin", "String"),
            )
        val binary =
            OperationResponseAlternative(
                ResponseSelectorDeclaration.ExactStatus(200),
                listOf("application/octet-stream"),
                KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
            )
        val operation = { alternatives: List<OperationResponseAlternative> ->
            OperationDeclaration(
                symbolId = "operation:download",
                order = 0,
                operationId = "download",
                operationIdentity = "download",
                method = "GET",
                path = "/download",
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/json", "application/octet-stream"),
                successStatusCodes = setOf(200),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = alternatives.first().type,
                requestCodecPropertyName = "downloadRequestCodec",
                responseCodecPropertyName = "downloadResponseCodec",
                requestCodecConstantName = "DOWNLOAD_REQUEST_CODEC_ID",
                responseCodecConstantName = "DOWNLOAD_RESPONSE_CODEC_ID",
                requestCodecId = "download.request",
                responseCodecId = "download.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Downloads either JSON or binary content.",
                responseAlternatives = alternatives,
                pagination =
                    PaginationDeclaration.CursorToken(
                        requestCursorParam = "cursor",
                        requestLimitParam = null,
                        responseItemsPath = "items",
                        responseNextCursorPath = "nextCursor",
                        itemType = KotlinTypeRef("kotlin", "String"),
                    ),
            )
        }

        listOf(listOf(json, binary), listOf(binary, json)).forEach { alternatives ->
            val source = render(operation(alternatives))
            assertTrue(source.contains("alternative.id == \"download.response.alternative0\""))
            assertTrue(source.contains("alternative.id == \"download.response.alternative1\""))
            assertTrue(source.contains("transferBody = true"))
            assertTrue(source.contains("public suspend fun downloadWithResponse("))
            assertFalse(source.contains("public suspend fun download("))
            assertFalse(source.contains("public fun downloadPages("))
            assertFalse(source.contains("public fun downloadItems("))
            assertFalse(source.contains("DOWNLOAD_RESPONSE_CODEC_ID"))
            assertFalse(source.contains("downloadResponseCodecRegistry"))
            assertFalse(source.contains("alternative.selector =="))
            assertTrue(source.contains("public class SuccessJson("))
            assertTrue(source.contains("public class SuccessOctetStream("))
            assertTrue(source.contains("public val json: String"))
            assertTrue(source.contains("public val bytes: SdkByteStream"))
            assertTrue(
                source.contains(
                    "No unified convenience method is generated because response alternatives decode to different Kotlin types",
                ),
            )
            assertFalse(source.contains("`value`"))
        }
        val duplicateMediaSource = render(operation(listOf(json, json)))
        assertTrue(duplicateMediaSource.contains("public class SuccessJson2("))
    }

    @Test
    fun emitsOrdinaryMethodForCompatibleSuccessfulMediaAlternatives() {
        val string = KotlinTypeRef("kotlin", "String")
        val source =
            render(
                OperationDeclaration(
                    symbolId = "operation:getValue",
                    order = 0,
                    operationId = "getValue",
                    operationIdentity = "getValue",
                    method = "GET",
                    path = "/value",
                    requestMediaTypes = emptyList(),
                    responseMediaTypes = listOf("application/json", "application/vnd.value+json"),
                    successStatusCodes = setOf(200),
                    requestType = KotlinTypeRef("kotlin", "Unit"),
                    responseType = string,
                    requestCodecPropertyName = "getValueRequestCodec",
                    responseCodecPropertyName = "getValueResponseCodec",
                    requestCodecConstantName = "GET_VALUE_REQUEST_CODEC_ID",
                    responseCodecConstantName = "GET_VALUE_RESPONSE_CODEC_ID",
                    requestCodecId = "getValue.request",
                    responseCodecId = "getValue.response",
                    responseMode = OperationResponseMode.BUFFERED,
                    deadlines = OperationDeadlines(null, null, null),
                    methodKdoc = "Gets a value in either compatible JSON media type.",
                    responseAlternatives =
                        listOf(
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.ExactStatus(200),
                                listOf("application/json"),
                                string,
                            ),
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.ExactStatus(200),
                                listOf("application/vnd.value+json"),
                                string,
                            ),
                        ),
                ),
            )

        assertTrue(source.contains("public suspend fun getValue("))
        assertTrue(source.contains("public suspend fun getValueWithResponse("))
        assertTrue(source.contains("GET_VALUE_RESPONSE_CODEC_ID"))
    }

    @Test
    fun emitsTypedWithResponseForBinarySuccessAndTypedErrorAlternatives() {
        val source =
            render(
                OperationDeclaration(
                    symbolId = "operation:downloadBinary",
                    order = 0,
                    operationId = "downloadBinary",
                    operationIdentity = "downloadBinary",
                    method = "GET",
                    path = "/files/{id}",
                    requestMediaTypes = emptyList(),
                    responseMediaTypes = listOf("application/octet-stream"),
                    successStatusCodes = setOf(200),
                    requestType = KotlinTypeRef("kotlin", "Unit"),
                    responseType = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                    requestCodecPropertyName = "downloadBinaryRequestCodec",
                    responseCodecPropertyName = "downloadBinaryResponseCodec",
                    requestCodecConstantName = "DOWNLOAD_BINARY_REQUEST_CODEC_ID",
                    responseCodecConstantName = "DOWNLOAD_BINARY_RESPONSE_CODEC_ID",
                    requestCodecId = "downloadBinary.request",
                    responseCodecId = "downloadBinary.response",
                    responseMode = OperationResponseMode.BUFFERED,
                    deadlines = OperationDeadlines(null, null, null),
                    methodKdoc = "Downloads a binary response.",
                    responseAlternatives =
                        listOf(
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.ExactStatus(200),
                                listOf("application/octet-stream"),
                                KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                            ),
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.StatusRange(400, 499),
                                listOf("application/json"),
                                KotlinTypeRef("kotlin", "String"),
                            ),
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.Default,
                                emptyList(),
                                KotlinTypeRef("kotlin", "Unit"),
                            ),
                        ),
                ),
            )

        assertTrue(source.contains("public suspend fun downloadBinaryWithResponse("))
        assertTrue(source.contains("public sealed interface DownloadBinaryResponse"))
        assertTrue(source.contains("public class SuccessOctetStream("))
        assertTrue(source.contains("public class Http400To499Json("))
        assertTrue(source.contains("public class DefaultNoContent("))
        assertTrue(source.contains("public class Unknown("))
        assertTrue(source.contains("SdkResponseDecodeResult<DownloadBinaryResponse>"))
        assertTrue(source.contains("alternative.id == \"downloadBinary.response.alternative0\""))
        assertTrue(source.contains("bytes = body"))
        assertTrue(source.contains("transferBody = true"))
        assertTrue(source.contains("KotlinxSerializationCodec(\"downloadBinary.response.alternative1\""))
        assertFalse(source.contains("SdkByteStream.serializer()"))
    }

    @Test
    fun rejectsRawAlternativesWhoseSelectorsCanMatchNonSuccessStatuses() {
        val raw = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
        val selectors =
            listOf(
                ResponseSelectorDeclaration.ExactStatus(404),
                ResponseSelectorDeclaration.StatusRange(200, 499),
                ResponseSelectorDeclaration.Default,
            )

        selectors.forEach { selector ->
            val failure =
                assertFailsWith<IllegalArgumentException> {
                    render(
                        OperationDeclaration(
                            symbolId = "operation:unsafeRaw",
                            order = 0,
                            operationId = "unsafeRaw",
                            operationIdentity = "unsafeRaw",
                            method = "GET",
                            path = "/unsafe-raw",
                            requestMediaTypes = emptyList(),
                            responseMediaTypes = listOf("application/octet-stream"),
                            successStatusCodes = setOf(200),
                            requestType = KotlinTypeRef("kotlin", "Unit"),
                            responseType = KotlinTypeRef("kotlin", "Unit"),
                            requestCodecPropertyName = "unsafeRawRequestCodec",
                            responseCodecPropertyName = "unsafeRawResponseCodec",
                            requestCodecConstantName = "UNSAFE_RAW_REQUEST_CODEC_ID",
                            responseCodecConstantName = "UNSAFE_RAW_RESPONSE_CODEC_ID",
                            requestCodecId = "unsafeRaw.request",
                            responseCodecId = "unsafeRaw.response",
                            responseMode = OperationResponseMode.BUFFERED,
                            deadlines = OperationDeadlines(null, null, null),
                            methodKdoc = "Unsafe raw response.",
                            responseAlternatives =
                                listOf(
                                    OperationResponseAlternative(
                                        selector,
                                        listOf("application/octet-stream"),
                                        raw,
                                    ),
                                ),
                        ),
                    )
                }

            assertTrue(requireNotNull(failure.message).contains("unsafeRaw"))
            assertTrue(requireNotNull(failure.message).contains(selector.toString()))
            assertTrue(requireNotNull(failure.message).contains("successStatusCodes=[200]"))
        }
    }

    @Test
    fun emitsRawDefaultWhenHigherPrecedenceSelectorsConfineItToDeclaredSuccessStatuses() {
        val raw = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
        val source =
            render(
                OperationDeclaration(
                    symbolId = "operation:defaultRawSuccess",
                    order = 0,
                    operationId = "defaultRawSuccess",
                    operationIdentity = "defaultRawSuccess",
                    method = "GET",
                    path = "/default-raw-success",
                    requestMediaTypes = emptyList(),
                    responseMediaTypes = listOf("application/octet-stream"),
                    successStatusCodes = (200..299).toSet(),
                    requestType = KotlinTypeRef("kotlin", "Unit"),
                    responseType = raw,
                    requestCodecPropertyName = "defaultRawSuccessRequestCodec",
                    responseCodecPropertyName = "defaultRawSuccessResponseCodec",
                    requestCodecConstantName = "DEFAULT_RAW_SUCCESS_REQUEST_CODEC_ID",
                    responseCodecConstantName = "DEFAULT_RAW_SUCCESS_RESPONSE_CODEC_ID",
                    requestCodecId = "defaultRawSuccess.request",
                    responseCodecId = "defaultRawSuccess.response",
                    responseMode = OperationResponseMode.BUFFERED,
                    deadlines = OperationDeadlines(null, null, null),
                    methodKdoc = "Returns a raw default only for successful statuses.",
                    responseAlternatives =
                        listOf(
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.StatusRange(100, 199),
                                emptyList(),
                                KotlinTypeRef("kotlin", "Unit"),
                            ),
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.StatusRange(300, 599),
                                emptyList(),
                                KotlinTypeRef("kotlin", "Unit"),
                            ),
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.Default,
                                listOf("application/octet-stream"),
                                raw,
                            ),
                        ),
                ),
            )

        assertTrue(source.contains("alternative.id == \"defaultRawSuccess.response.alternative2\""))
        assertTrue(source.contains("bytes = body"))
        assertTrue(source.contains("transferBody = true"))
    }

    @Test
    fun emitsRawTransferIntentForExplicitNonTwoXxSuccessAlternative() {
        val source =
            render(
                OperationDeclaration(
                    symbolId = "operation:downloadNotModified",
                    order = 0,
                    operationId = "downloadNotModified",
                    operationIdentity = "downloadNotModified",
                    method = "GET",
                    path = "/files/cached",
                    requestMediaTypes = emptyList(),
                    responseMediaTypes = listOf("application/octet-stream"),
                    successStatusCodes = setOf(304),
                    requestType = KotlinTypeRef("kotlin", "Unit"),
                    responseType = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                    requestCodecPropertyName = "downloadNotModifiedRequestCodec",
                    responseCodecPropertyName = "downloadNotModifiedResponseCodec",
                    requestCodecConstantName = "DOWNLOAD_NOT_MODIFIED_REQUEST_CODEC_ID",
                    responseCodecConstantName = "DOWNLOAD_NOT_MODIFIED_RESPONSE_CODEC_ID",
                    requestCodecId = "downloadNotModified.request",
                    responseCodecId = "downloadNotModified.response",
                    responseMode = OperationResponseMode.BUFFERED,
                    deadlines = OperationDeadlines(null, null, null),
                    methodKdoc = "Downloads an explicitly successful cached response.",
                    responseAlternatives =
                        listOf(
                            OperationResponseAlternative(
                                ResponseSelectorDeclaration.ExactStatus(304),
                                listOf("application/octet-stream"),
                                KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                            ),
                        ),
                ),
            )

        assertTrue(source.contains("alternative.id == \"downloadNotModified.response.alternative0\""))
        assertTrue(source.contains("bytes = body"))
        assertTrue(source.contains("transferBody = true"))
    }

    private fun streamingOperation(alternatives: List<OperationResponseAlternative>): OperationDeclaration =
        OperationDeclaration(
            symbolId = "operation:streamVariants",
            order = 0,
            operationId = "streamVariants",
            operationIdentity = "streamVariants",
            method = "GET",
            path = "/stream",
            requestMediaTypes = emptyList(),
            responseMediaTypes = alternatives.flatMap(OperationResponseAlternative::mediaTypes),
            successStatusCodes = setOf(200),
            requestType = KotlinTypeRef("kotlin", "Unit"),
            responseType = alternatives.first().type,
            requestCodecPropertyName = "streamVariantsRequestCodec",
            responseCodecPropertyName = "streamVariantsResponseCodec",
            requestCodecConstantName = "STREAM_VARIANTS_REQUEST_CODEC_ID",
            responseCodecConstantName = "STREAM_VARIANTS_RESPONSE_CODEC_ID",
            requestCodecId = "streamVariants.request",
            responseCodecId = "streamVariants.response",
            responseMode = OperationResponseMode.STREAMING,
            deadlines = OperationDeadlines(null, 30_000, null),
            methodKdoc = "Streams compatible variants.",
            responseAlternatives = alternatives,
            streaming = StreamingDeclaration.ServerSentEvents("[DONE]", responseContentType = "text/event-stream"),
        )

    private companion object {
        const val PACKAGE = "com.example.metadata"
    }
}
