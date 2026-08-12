package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.config.RetryDefaults
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.engine.declarations.AdditionalPropertiesDeclaration
import com.nabobery.sdkgen.engine.declarations.DeclarationProjectionRequest
import com.nabobery.sdkgen.engine.declarations.FieldDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.ModelDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationDeadlines
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.StandardProjection
import com.nabobery.sdkgen.engine.declarations.goldenSliceModel
import com.nabobery.sdkgen.openapi.SemanticAdapter
import java.nio.file.Path
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.io.path.writeBytes
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class KotlinPoetEmitterGoldenTest {
    @Test
    fun collectionOwnershipModelMatchesExactGolden() {
        val packageName = "com.example.generated"
        val string = KotlinTypeRef("kotlin", "String")
        val model =
            ModelDeclaration(
                symbolId = "schema:CollectionOwnership",
                order = 0,
                packageName = packageName,
                fileName = "CollectionOwnership",
                resolvedName = "CollectionOwnership",
                kdoc = "Collection ownership fixture.",
                fields =
                    listOf(
                        collectionOwnershipField(
                            "requiredList",
                            KotlinTypeRef("kotlin.collections", "List", listOf(string)),
                            order = 0,
                            required = true,
                        ),
                        collectionOwnershipField(
                            "requiredNullableSet",
                            KotlinTypeRef("kotlin.collections", "Set", listOf(string)),
                            order = 1,
                            required = true,
                            nullable = true,
                        ),
                        collectionOwnershipField(
                            "optionalNullableList",
                            KotlinTypeRef("kotlin.collections", "List", listOf(string)),
                            order = 2,
                            required = false,
                            nullable = true,
                        ),
                        collectionOwnershipField(
                            "optionalMap",
                            KotlinTypeRef("kotlin.collections", "Map", listOf(string, string)),
                            order = 3,
                            required = false,
                        ),
                    ),
                dslFunctionName = "collectionOwnership",
                usesFieldState = true,
            )
        val actual =
            KotlinPoetEmitter(packageName)
                .render(
                    KotlinDeclarationModel(
                        listOf(KotlinFileDeclaration(packageName, "CollectionOwnership", listOf(model))),
                    ),
                ).files
                .single()
                .bytes
        val golden =
            Path
                .of(requireNotNull(System.getProperty("engine.wave1GoldenRoot")))
                .resolve("CollectionOwnership.kt")
        if (System.getenv("UPDATE_COLLECTION_OWNERSHIP_GOLDEN") == "1") golden.writeBytes(actual)

        assertEquals(golden.readText(), actual.decodeToString())
    }

    @Test
    fun mixedAdditionalPropertiesModelMatchesExactGolden() {
        val packageName = "com.example.generated"
        val model =
            ModelDeclaration(
                symbolId = "schema:DynamicTool",
                order = 0,
                packageName = packageName,
                fileName = "DynamicTool",
                resolvedName = "DynamicTool",
                kdoc = "A fixed property with open additional values.",
                fields =
                    listOf(
                        FieldDeclaration(
                            symbolId = "schema:DynamicTool/type",
                            order = 0,
                            resolvedName = "type",
                            wireName = "type",
                            type = KotlinTypeRef("kotlin", "String"),
                            required = true,
                            nullable = false,
                            kdoc = "Fixed wire type.",
                        ),
                    ),
                dslFunctionName = "dynamicTool",
                additionalProperties =
                    AdditionalPropertiesDeclaration(
                        resolvedName = "additionalProperties",
                        valueType = KotlinTypeRef("kotlinx.serialization.json", "JsonElement"),
                        valuesAreJsonElements = true,
                        fixedWireNames = setOf("type"),
                        kdoc = "Open JSON object members.",
                    ),
            )
        val actual =
            KotlinPoetEmitter(packageName)
                .render(
                    KotlinDeclarationModel(listOf(KotlinFileDeclaration(packageName, "DynamicTool", listOf(model)))),
                ).files
                .single()
                .bytes
        val golden = Path.of(requireNotNull(System.getProperty("engine.wave1GoldenRoot"))).resolve("DynamicTool.kt")
        val source = actual.decodeToString()
        assertTrue(source.contains("value.additionalProperties.keys.sorted().forEach { key ->"))
        assertTrue(source.contains("val additionalValue = value.additionalProperties.getValue(key)"))
        assertFalse(source.contains("toSortedMap()"))
        if (System.getenv("UPDATE_WAVE1_GOLDENS") == "1") golden.writeBytes(actual)

        assertEquals(golden.readText(), actual.decodeToString())
    }

    @Test
    fun waveOneHandBuiltDeclarationsRemainByteIdentical() {
        val root = Path.of(requireNotNull(System.getProperty("engine.wave1GoldenRoot")))
        KotlinPoetEmitter().render(goldenSliceModel()).files.forEach { rendered ->
            val golden = root.resolve(rendered.path.substringAfterLast('/'))
            if (System.getenv("UPDATE_WAVE1_GOLDENS") == "1") golden.writeBytes(rendered.bytes)
            assertContentEquals(
                golden.readBytes(),
                rendered.bytes,
                rendered.path,
            )
        }
    }

    @Test
    fun standardProjectionAndEmitterGoldenCoversAnyOfAndOneOfNames() {
        val sourceFile = Path.of(requireNotNull(javaClass.getResource("/fixtures/composition-golden.yaml")).toURI())
        val document = SemanticAdapter().adapt(sourceFile).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = "com.example.generated",
                    canonicalDocumentUri = document.documentUri,
                    clientName = "CompositionClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter().render(mapping.model).files
        val output =
            rendered
                .sortedBy(RenderedKotlinFile::path)
                .joinToString(separator = "\n") { file ->
                    "--- ${file.path} ---\n${file.bytes.decodeToString()}"
                }
        val golden = Path.of(requireNotNull(System.getProperty("engine.compositionProjectionGolden")))
        if (System.getenv("UPDATE_COMPOSITION_GOLDEN") == "1") golden.writeText(output)
        assertEquals(golden.readText(), output)

        val alpha = rendered.single { it.path.endsWith("/Alpha.kt") }.bytes.decodeToString()
        val beta = rendered.single { it.path.endsWith("/Beta.kt") }.bytes.decodeToString()
        val variant = rendered.single { it.path.endsWith("/Variant.kt") }.bytes.decodeToString()
        assertTrue(alpha.contains("public data class AlphaView"))
        assertTrue(beta.contains("public data class BetaView"))
        assertTrue(variant.contains("public class Cat"))
        assertTrue(variant.contains("public class Dog"))
        listOf(alpha, beta, variant).forEach { source ->
            assertTrue(source.contains("Source: sdkgen://source/composition-golden.yaml#"), source)
        }
    }

    @Test
    fun ordinaryOptionalModelsUseNullableConstructorDefaultsAndKeepBuilderDsl() {
        val model =
            ModelDeclaration(
                symbolId = "schema:PlainModel",
                order = 0,
                packageName = "com.example.generated",
                fileName = "PlainModel",
                resolvedName = "PlainModel",
                kdoc = "An ordinary model.",
                fields =
                    listOf(
                        FieldDeclaration(
                            symbolId = "schema:PlainModel/id",
                            order = 0,
                            resolvedName = "id",
                            wireName = "id",
                            type = KotlinTypeRef("kotlin", "String"),
                            required = true,
                            nullable = false,
                            kdoc = "Required identifier.",
                        ),
                        FieldDeclaration(
                            symbolId = "schema:PlainModel/label",
                            order = 1,
                            resolvedName = "label",
                            wireName = "label",
                            type = KotlinTypeRef("kotlin", "String"),
                            required = false,
                            nullable = false,
                            kdoc = "Optional label.",
                        ),
                    ),
                dslFunctionName = "plainModel",
            )
        val source =
            KotlinPoetEmitter("com.example.generated")
                .render(
                    KotlinDeclarationModel(
                        listOf(KotlinFileDeclaration("com.example.generated", "PlainModel", listOf(model))),
                    ),
                ).files
                .single()
                .bytes
                .decodeToString()

        assertTrue(source.contains("public val label: String? = null,"))
        assertTrue(source.contains("public class Builder"))
        assertTrue(source.contains("public var label: String?"))
        assertFalse(source.contains("FieldState"))
        assertFalse(source.contains("labelPresence"))
    }

    @Test
    fun generatedPublicModelAndUnionApisCarryContractKdoc() {
        val rendered =
            KotlinPoetEmitter().render(goldenSliceModel()).files.associate {
                it.path to
                    it.bytes.decodeToString()
            }
        val request = rendered.getValue("com/nabobery/sdkgen/generated/ChatRequest.kt")
        val oneOf = rendered.getValue("com/nabobery/sdkgen/generated/ChatContent.kt")
        val anyOf = rendered.getValue("com/nabobery/sdkgen/generated/MessageMetadataAnyOf.kt")
        val serialization = rendered.getValue("com/nabobery/sdkgen/generated/SerializationSupport.kt")
        val responses = rendered.getValue("com/nabobery/sdkgen/generated/ResponseShapeClient.kt")

        assertTrue(request.contains("Model identifier.\n   */\n  public val model"))
        assertTrue(request.contains("Returns the wire presence of `temperature`."))
        assertTrue(request.contains("Omits `max_tokens` from serialized output."))
        assertTrue(oneOf.contains("Raw JSON retained as the serialization authority."))
        assertTrue(oneOf.contains("Creates this branch and its canonical raw JSON representation."))
        assertTrue(anyOf.contains("Builds a validated wrapper around raw JSON without rewriting it."))
        assertTrue(serialization.contains("SDK-owned JSON behavior and JSON-only serializer guards."))
        assertTrue(responses.contains("public suspend fun jsonFirstWithResponse("))
        assertTrue(responses.contains("public suspend fun binaryFirstWithResponse("))
        assertFalse(responses.contains("public suspend fun jsonFirst("))
        assertFalse(responses.contains("public suspend fun binaryFirst("))
        assertTrue(responses.contains("public suspend fun compatibleMedia("))
        assertTrue(responses.contains("public sealed interface CompatibleMediaError"))
        assertTrue(responses.contains("public class CompatibleMediaApiException("))
        assertTrue(responses.contains("@throws CompatibleMediaApiException"))
        assertTrue(responses.contains("public class Http400Json("))
        assertTrue(responses.contains("public class Http422NoContent("))
    }

    @Test
    fun operationEmissionUsesDeclarationDataAndDoesNotClaimStreaming() {
        val packageName = "com.example.generated"
        val declaration =
            OperationClientDeclaration(
                symbolId = "operation:createWidget",
                order = 0,
                packageName = packageName,
                fileName = "WidgetClient",
                resolvedName = "WidgetClient",
                kdoc = "Client for widget operations.",
                codecsObjectName = "WidgetCodecs",
                operations =
                    listOf(
                        OperationDeclaration(
                            symbolId = "operation:createWidget",
                            order = 0,
                            operationId = "createWidget",
                            method = "POST",
                            path = "/widgets",
                            requestMediaTypes = listOf("application/json"),
                            responseMediaTypes = listOf("application/json"),
                            successStatusCodes = setOf(200, 201),
                            requestType = KotlinTypeRef(packageName, "WidgetRequest"),
                            responseType = KotlinTypeRef("kotlinx.serialization.json", "JsonElement"),
                            requestCodecPropertyName = "widgetRequestCodec",
                            responseCodecPropertyName = "jsonElementCodec",
                            requestCodecConstantName = "WIDGET_REQUEST_CODEC_ID",
                            responseCodecConstantName = "JSON_ELEMENT_CODEC_ID",
                            requestCodecId = "widgets.request",
                            responseCodecId = "widgets.response",
                            responseMode = OperationResponseMode.BUFFERED,
                            deadlines = OperationDeadlines(10_000, 5_000, 1_000),
                            methodKdoc = "Creates one widget using a buffered JSON response.",
                        ),
                    ),
            )
        val model =
            KotlinDeclarationModel(listOf(KotlinFileDeclaration(packageName, "WidgetClient", listOf(declaration))))

        val source =
            KotlinPoetEmitter(packageName)
                .render(model)
                .files
                .single()
                .bytes
                .decodeToString()

        assertTrue(source.contains("internal object WidgetCodecs"))
        assertTrue(source.contains("widgets.request"))
        assertTrue(source.contains("SdkResponseMode.BUFFERED"))
        assertTrue(source.contains("SdkDeadlines(10_000, 5_000, 1_000)"))
        assertTrue(source.contains("Creates one widget using a buffered JSON response."))
        assertTrue(source.contains("@param request"))
        assertTrue(source.contains("@param options"))
        assertTrue(source.contains("@return"))
        assertTrue(source.contains("@throws SdkApiException"))
        assertTrue(source.contains("@throws SdkSerializationException"))
        assertTrue(source.contains("@throws SdkTransportException"))
        assertTrue(source.contains("internal val metadata: OperationMetadata"))
        assertFalse(source.contains("streaming support", ignoreCase = true))
    }

    private fun collectionOwnershipField(
        name: String,
        type: KotlinTypeRef,
        order: Int,
        required: Boolean,
        nullable: Boolean = false,
    ): FieldDeclaration =
        FieldDeclaration(
            symbolId = "schema:CollectionOwnership/property:$name",
            order = order,
            resolvedName = name,
            wireName = name,
            type = type,
            required = required,
            nullable = nullable,
            kdoc = "",
        )

    @Test
    fun partitionedSingleOperationClientPreservesOperationDerivedMetadataName() {
        val packageName = "com.example.generated.widgets"
        val operation =
            OperationDeclaration(
                symbolId = "operation:createWidget",
                order = 0,
                operationId = "createWidget",
                method = "POST",
                path = "/widgets",
                requestMediaTypes = emptyList(),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(204),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = KotlinTypeRef("kotlin", "Unit"),
                requestCodecPropertyName = "createWidgetRequestCodec",
                responseCodecPropertyName = "createWidgetResponseCodec",
                requestCodecConstantName = "CREATE_WIDGET_REQUEST_CODEC_ID",
                responseCodecConstantName = "CREATE_WIDGET_RESPONSE_CODEC_ID",
                requestCodecId = "createWidget.request",
                responseCodecId = "createWidget.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(10_000, 5_000, null),
                methodKdoc = "Creates one widget.",
            )
        val declaration =
            OperationClientDeclaration(
                symbolId = "client:$packageName.WidgetClient",
                order = 0,
                packageName = packageName,
                fileName = "WidgetClient",
                resolvedName = "WidgetClient",
                kdoc = "Partitioned widget client.",
                codecsObjectName = "WidgetCodecs",
                operations = listOf(operation),
                preserveOperationMetadataNames = true,
            )
        val source =
            KotlinPoetEmitter("com.example.generated")
                .render(
                    KotlinDeclarationModel(
                        listOf(KotlinFileDeclaration(packageName, "WidgetClient", listOf(declaration))),
                    ),
                ).files
                .single()
                .bytes
                .decodeToString()

        assertTrue(source.contains("internal val createWidgetMetadata: OperationMetadata"))
        assertFalse(source.contains("val metadata: OperationMetadata"))
    }

    @Test
    fun aSecondOperationIsAdditiveAndDoesNotCollideWithTheFirst() {
        val packageName = "com.example.generated"

        fun operation(operationId: String): OperationDeclaration =
            OperationDeclaration(
                symbolId = "operation:$operationId",
                order = 0,
                operationId = operationId,
                method = "POST",
                path = "/$operationId",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200),
                requestType = KotlinTypeRef(packageName, "WidgetRequest"),
                responseType = KotlinTypeRef("kotlinx.serialization.json", "JsonElement"),
                requestCodecPropertyName = "${operationId}RequestCodec",
                responseCodecPropertyName = "${operationId}ResponseCodec",
                requestCodecConstantName = "${operationId.uppercase()}_REQUEST_CODEC_ID",
                responseCodecConstantName = "${operationId.uppercase()}_RESPONSE_CODEC_ID",
                requestCodecId = "widgets.$operationId.request",
                responseCodecId = "widgets.$operationId.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(10_000, 5_000, 1_000),
                methodKdoc = "Executes '$operationId'.",
            )
        val declaration =
            OperationClientDeclaration(
                symbolId = "client:WidgetClient",
                order = 0,
                packageName = packageName,
                fileName = "WidgetClient",
                resolvedName = "WidgetClient",
                kdoc = "Client for widget operations.",
                codecsObjectName = "WidgetCodecs",
                operations = listOf(operation("createWidget"), operation("deleteWidget")),
            )
        val model =
            KotlinDeclarationModel(listOf(KotlinFileDeclaration(packageName, "WidgetClient", listOf(declaration))))

        val source =
            KotlinPoetEmitter(packageName)
                .render(model)
                .files
                .single()
                .bytes
                .decodeToString()

        assertTrue(source.contains("public suspend fun createWidget("))
        assertTrue(source.contains("public suspend fun deleteWidget("))
        assertTrue(source.contains("createWidgetMetadata"))
        assertTrue(source.contains("deleteWidgetMetadata"))
        assertTrue(source.contains("CREATEWIDGET_REQUEST_CODEC_ID"))
        assertTrue(source.contains("DELETEWIDGET_REQUEST_CODEC_ID"))
    }

    @Test
    fun mechanicalEmitterContainsNoOpenRouterVocabulary() {
        val source =
            listOf("engine.emitterSource", "engine.emissionContextSource")
                .joinToString("\n") { property -> Path.of(requireNotNull(System.getProperty(property))).readText() }

        listOf("OpenRouter", "ChatRequest", "ChatMessage", "Citations", "CacheControl").forEach { vocabulary ->
            assertFalse(source.contains(vocabulary), vocabulary)
        }
    }
}
