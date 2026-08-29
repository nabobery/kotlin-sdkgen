@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientGroupRef
import com.nabobery.sdkgen.engine.declarations.OperationDeadlines
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationResponseAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.PaginationDeclaration
import com.nabobery.sdkgen.engine.declarations.ResponseSelectorDeclaration
import com.nabobery.sdkgen.engine.declarations.StreamingDeclaration
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Source-level contract for 0.4.0 client configuration: every generated client keeps the 0.3.0
 * constructor, gains a configuration-aware constructor, stores one `SdkClientConfig`, builds its executor from
 * it, and resolves per-call options through it on *every* executor path. The root facade forwards the same
 * instance to each lazily-constructed resource client.
 */
class GeneratedClientConfigurationEmissionTest {
    @Test
    fun resourceClientEmitsPrivateCanonicalConstructorAndBothPublicConstructors() {
        val source = renderClient(listOf(ordinaryOperation()))

        assertTrue(source.contains("public class ConfigClient private constructor("), source)
        assertTrue(source.contains("private val clientConfig: SdkClientConfig,"), source)
        assertTrue(source.contains("marker: Unit,"), source)
        assertEquals(2, source.occurrences("public constructor("), source)
        assertTrue(
            source.contains(
                "this(transport, baseUri, SdkClientConfig(), credentialProviders, trustedHosts, authentication, Unit)",
            ),
            source,
        )
        assertTrue(
            source.contains(
                "this(transport, baseUri, clientConfig, credentialProviders, trustedHosts, authentication, Unit)",
            ),
            source,
        )
    }

    @Test
    fun legacyConstructorParameterOrderIsPreserved() {
        val source = renderClient(listOf(ordinaryOperation()))
        val legacy =
            """
            |  public constructor(
            |    transport: SdkTransport,
            |    baseUri: String,
            |    credentialProviders: Map<String, CredentialProvider> = emptyMap(),
            |    trustedHosts: TrustedHosts? = null,
            |    authentication: SdkAuthentication? = null,
            |  )
            """.trimMargin()

        assertTrue(source.contains(legacy), source)
    }

    @Test
    fun configAwareConstructorPlacesClientConfigThirdWithoutDefault() {
        val source = renderClient(listOf(ordinaryOperation()))
        val configured =
            """
            |  public constructor(
            |    transport: SdkTransport,
            |    baseUri: String,
            |    clientConfig: SdkClientConfig,
            |    credentialProviders: Map<String, CredentialProvider> = emptyMap(),
            |    trustedHosts: TrustedHosts? = null,
            |    authentication: SdkAuthentication? = null,
            |  )
            """.trimMargin()

        assertTrue(source.contains(configured), source)
    }

    @Test
    fun executorIsConstructedFromClientConfiguration() {
        val source = renderClient(listOf(ordinaryOperation()))

        assertTrue(source.contains("requestHook = clientConfig.requestHook,"), source)
        assertTrue(source.contains("retryBudget = clientConfig.retryBudget,"), source)
        assertTrue(source.contains("logicalMiddleware = clientConfig.logicalMiddleware,"), source)
        assertTrue(source.contains("attemptMiddleware = clientConfig.attemptMiddleware,"), source)
        assertTrue(source.contains("observers = clientConfig.observers,"), source)
        assertTrue(source.contains("productToken = clientConfig.productToken ?: "), source)
        assertTrue(source.contains("authentication = this@ConfigClient.authentication"), source)
    }

    @Test
    fun everyExecutorPathResolvesOptionsThroughClientConfiguration() {
        val source =
            renderClient(
                listOf(
                    bodylessOperation(),
                    rawOperation(),
                    ordinaryOperation(),
                    typedErrorOperation(),
                    mixedStreamOperation(),
                    cursorPaginatedOperation(),
                    headerPaginatedOperation(),
                ),
            )

        // The fixture must reach every executor entry point, or a missed path would silently keep
        // wrapper-only behaviour.
        listOf(
            "executor.executeWithResponse<",
            "executor.executeBodyless<",
            "executor.executeRaw<",
            "executor.execute<",
            "executor.executeWithTypedErrors<",
            "executor.executeRawWithTypedErrors<",
            "executor.executeWithHeaders<",
        ).forEach { entryPoint -> assertTrue(source.contains(entryPoint), "missing $entryPoint in:\n$source") }

        val executorCalls = Regex("""executor\.execute[A-Za-z]*<""").findAll(source).count()
        val resolvedOptions = source.occurrences("clientConfig.resolveCallOptions(options)")
        assertEquals(executorCalls, resolvedOptions, source)
        val bareOptionsToExecutor =
            Regex("""executor\.execute[A-Za-z]*<[^\n]*, options\)\s*$""", RegexOption.MULTILINE)
        assertFalse(
            bareOptionsToExecutor.containsMatchIn(source),
            "bare per-call options reached the executor:\n$source",
        )
        assertFalse(source.contains("options = options,"), "bare per-call options reached the executor:\n$source")
        assertFalse(
            source.lines().any { it.trim() == "options," },
            "bare per-call options reached the executor:\n$source",
        )
    }

    @Test
    fun paginationBoundsStillReadTheCallerSuppliedOptions() {
        val source = renderClient(listOf(cursorPaginatedOperation()))

        assertTrue(source.contains("options.pagination"), source)
    }

    @Test
    fun rootFacadeStoresOneConfigurationAndForwardsItToEveryResourceClient() {
        val source = renderFacade()

        assertTrue(source.contains("public class RootClient private constructor("), source)
        assertTrue(source.contains("private val clientConfig: SdkClientConfig,"), source)
        assertEquals(2, source.occurrences("public constructor("), source)
        assertTrue(
            source.contains(
                "ChatClient(transport, baseUri, clientConfig, credentialProviders, trustedHosts, authentication)",
            ),
            source,
        )
        assertTrue(
            source.contains(
                "ModelsClient(transport, baseUri, clientConfig, credentialProviders, trustedHosts, authentication)",
            ),
            source,
        )
        // Only the legacy constructor materializes a default configuration; sub-clients never construct their own.
        assertEquals(1, source.occurrences("SdkClientConfig()"), source)
    }

    @Test
    fun configuredDefaultServerBecomesTheDefaultBaseUriOnBothPublicConstructors() {
        val source = renderClient(listOf(ordinaryOperation()), defaultBaseUri = "https://api.example/v1")

        assertEquals(2, source.occurrences("baseUri: String = \"https://api.example/v1\","), source)
        assertTrue(source.contains("private val baseUri: String,"), source)
    }

    @Test
    fun withoutDefaultServerBaseUriStaysRequired() {
        val source = renderClient(listOf(ordinaryOperation()))

        assertEquals(2, source.occurrences("    baseUri: String,\n"), source)
        assertFalse(source.contains("baseUri: String ="), source)
    }

    @Test
    fun configuredUserAgentSuffixBecomesTheGeneratedFallbackProductToken() {
        val source = renderClient(listOf(ordinaryOperation()), productToken = "kotlin-sdkgen openrouter-kotlin")

        assertTrue(
            source.contains("productToken = clientConfig.productToken ?: \"kotlin-sdkgen openrouter-kotlin\","),
            source,
        )
        assertFalse(source.contains("DEFAULT_PRODUCT_TOKEN"), source)
    }

    @Test
    fun withoutUserAgentSuffixTheRuntimeDefaultProductTokenIsTheFallback() {
        val source = renderClient(listOf(ordinaryOperation()))

        assertTrue(
            source.contains("productToken = clientConfig.productToken ?: SdkExecutor.DEFAULT_PRODUCT_TOKEN,"),
            source,
        )
    }

    @Test
    fun rootFacadeAppliesTheDefaultServerToo() {
        val source = renderFacade(defaultBaseUri = "https://api.example/v1")

        assertEquals(2, source.occurrences("baseUri: String = \"https://api.example/v1\","), source)
    }

    private fun renderClient(
        operations: List<OperationDeclaration>,
        defaultBaseUri: String? = null,
        productToken: String? = null,
    ): String =
        render(
            OperationClientDeclaration(
                symbolId = "client:ConfigClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "ConfigClient",
                resolvedName = "ConfigClient",
                kdoc = "Client configuration emission test client.",
                codecsObjectName = "ConfigCodecs",
                operations = operations,
                defaultBaseUri = defaultBaseUri,
                productToken = productToken,
            ),
        )

    private fun renderFacade(defaultBaseUri: String? = null): String =
        render(
            OperationClientDeclaration(
                symbolId = "client:RootClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "RootClient",
                resolvedName = "RootClient",
                kdoc = "Root facade.",
                codecsObjectName = "RootCodecs",
                operations = emptyList(),
                defaultBaseUri = defaultBaseUri,
                subClients =
                    listOf(
                        OperationClientGroupRef(PACKAGE, "ChatClient", "chat", "Chat operations."),
                        OperationClientGroupRef(PACKAGE, "ModelsClient", "models", "Model operations."),
                    ),
            ),
        )

    private fun String.occurrences(needle: String): Int = Regex.fromLiteral(needle).findAll(this).count()

    private fun render(client: OperationClientDeclaration): String =
        KotlinPoetEmitter(PACKAGE)
            .render(KotlinDeclarationModel(listOf(KotlinFileDeclaration(PACKAGE, client.fileName, listOf(client)))))
            .files
            .single()
            .bytes
            .decodeToString()

    private fun operation(
        id: String,
        method: String = "GET",
        path: String = "/$id",
        requestType: KotlinTypeRef = UNIT,
        responseType: KotlinTypeRef,
        responseMode: OperationResponseMode = OperationResponseMode.BUFFERED,
        responseAlternatives: List<OperationResponseAlternative>,
        pagination: PaginationDeclaration? = null,
        streaming: StreamingDeclaration? = null,
        streamResponseType: KotlinTypeRef? = null,
    ): OperationDeclaration =
        OperationDeclaration(
            symbolId = "operation:$id",
            order = 0,
            operationId = id,
            method = method,
            path = path,
            requestMediaTypes = if (requestType == UNIT) emptyList() else listOf("application/json"),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            requestType = requestType,
            responseType = responseType,
            requestCodecPropertyName = "${id}RequestCodec",
            responseCodecPropertyName = "${id}ResponseCodec",
            requestCodecConstantName = "${id.uppercase()}_REQUEST_CODEC_ID",
            responseCodecConstantName = "${id.uppercase()}_RESPONSE_CODEC_ID",
            requestCodecId = "$id.request",
            responseCodecId = "$id.response",
            responseMode = responseMode,
            deadlines = OperationDeadlines(null, null, null),
            methodKdoc = "Operation $id.",
            responseAlternatives = responseAlternatives,
            pagination = pagination,
            streaming = streaming,
            streamResponseType = streamResponseType,
        )

    private fun bodylessOperation(): OperationDeclaration =
        operation(
            id = "ping",
            responseType = UNIT,
            responseAlternatives = listOf(alternative(ResponseSelectorDeclaration.ExactStatus(200), UNIT)),
        )

    private fun rawOperation(): OperationDeclaration =
        operation(
            id = "blob",
            responseType = BYTE_STREAM,
            responseAlternatives =
                listOf(
                    alternative(ResponseSelectorDeclaration.ExactStatus(200), BYTE_STREAM, "application/octet-stream"),
                ),
        )

    private fun ordinaryOperation(): OperationDeclaration =
        operation(
            id = "widget",
            responseType = WIDGET,
            responseAlternatives = listOf(alternative(ResponseSelectorDeclaration.ExactStatus(200), WIDGET)),
        )

    private fun typedErrorOperation(): OperationDeclaration =
        operation(
            id = "typed",
            responseType = WIDGET,
            responseAlternatives =
                listOf(
                    alternative(ResponseSelectorDeclaration.ExactStatus(200), WIDGET),
                    alternative(ResponseSelectorDeclaration.StatusRange(400, 499), API_ERROR),
                ),
        )

    private fun mixedStreamOperation(): OperationDeclaration =
        operation(
            id = "chat",
            method = "POST",
            requestType = KotlinTypeRef(PACKAGE, "ChatRequest"),
            responseType = KotlinTypeRef(PACKAGE, "ChatResult"),
            responseMode = OperationResponseMode.MIXED,
            responseAlternatives =
                listOf(
                    alternative(ResponseSelectorDeclaration.ExactStatus(200), KotlinTypeRef(PACKAGE, "ChatResult")),
                    alternative(ResponseSelectorDeclaration.ExactStatus(401), API_ERROR),
                ),
            streaming = StreamingDeclaration.ServerSentEvents("[DONE]", "stream", "text/event-stream"),
            streamResponseType = KotlinTypeRef(PACKAGE, "ChatDelta"),
        )

    private fun cursorPaginatedOperation(): OperationDeclaration =
        operation(
            id = "listItems",
            path = "/items",
            responseType = PAGE,
            responseAlternatives = listOf(alternative(ResponseSelectorDeclaration.ExactStatus(200), PAGE)),
            pagination = PaginationDeclaration.CursorToken("cursor", "limit", "data", "nextCursor", WIDGET),
        )

    private fun headerPaginatedOperation(): OperationDeclaration =
        operation(
            id = "listLinked",
            path = "/linked",
            responseType = PAGE,
            responseAlternatives = listOf(alternative(ResponseSelectorDeclaration.ExactStatus(200), PAGE)),
            pagination = PaginationDeclaration.HeaderNextUrl("data", WIDGET),
        )

    private fun alternative(
        selector: ResponseSelectorDeclaration,
        type: KotlinTypeRef,
        mediaType: String = "application/json",
    ): OperationResponseAlternative = OperationResponseAlternative(selector, listOf(mediaType), type)

    private companion object {
        const val PACKAGE = "com.example.generated"
        val UNIT = KotlinTypeRef("kotlin", "Unit")
        val WIDGET = KotlinTypeRef(PACKAGE, "Widget")
        val PAGE = KotlinTypeRef(PACKAGE, "WidgetPage")
        val API_ERROR = KotlinTypeRef(PACKAGE, "ApiError")
        val BYTE_STREAM = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
    }
}
