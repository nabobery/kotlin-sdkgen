@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.BackoffDeclaration
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
import com.nabobery.sdkgen.engine.declarations.OperationResponseAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.OperationSafetyDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationSecurityRequirement
import com.nabobery.sdkgen.engine.declarations.OperationSecuritySchemeDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationSecuritySchemeRef
import com.nabobery.sdkgen.engine.declarations.PaginationDeclaration
import com.nabobery.sdkgen.engine.declarations.ResponseSelectorDeclaration
import com.nabobery.sdkgen.engine.declarations.RetryDeclaration
import com.nabobery.sdkgen.engine.declarations.StreamingDeclaration
import com.nabobery.sdkgen.model.JsonValue
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class OperationEmitterT15Test {
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

    private fun render(operation: OperationDeclaration): String = render(listOf(operation))

    private fun render(operations: List<OperationDeclaration>): String {
        val client =
            OperationClientDeclaration(
                symbolId = "client:T15Client",
                order = 0,
                packageName = PACKAGE,
                fileName = "T15Client",
                resolvedName = "T15Client",
                kdoc = "T15 test client.",
                codecsObjectName = "T15Codecs",
                operations = operations,
            )
        return KotlinPoetEmitter(PACKAGE)
            .render(
                KotlinDeclarationModel(
                    listOf(KotlinFileDeclaration(PACKAGE, "T15Client", listOf(client))),
                ),
            ).single()
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

    private fun multipartOperation(): OperationDeclaration {
        val requestType = KotlinTypeRef(PACKAGE, "UploadRequest")
        val multipart =
            OperationRequestBodyAlternative(
                mediaType = "multipart/form-data",
                type = requestType,
                required = true,
                multipartParts =
                    listOf(
                        MultipartPartDeclaration(
                            name = "caption",
                            type = KotlinTypeRef("kotlin", "String"),
                            required = true,
                            contentType = "text/plain",
                            headers = mapOf("X-Part-Checksum" to JsonValue.StringValue("checksum")),
                        ),
                        MultipartPartDeclaration(
                            name = "file",
                            type = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                            required = true,
                            contentType = "image/png",
                        ),
                    ),
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
                .render(KotlinDeclarationModel(listOf(KotlinFileDeclaration(PACKAGE, "FilesClient", listOf(client)))))
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
        assertTrue(source.contains("authentication = this@T15Client.authentication"))
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
        const val PACKAGE = "com.example.t15"
    }
}
