package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationDeadlines
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.goldenSliceModel
import java.nio.file.Path
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.io.path.writeBytes
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class KotlinPoetEmitterGoldenTest {
    @Test
    fun waveOneHandBuiltDeclarationsRemainByteIdentical() {
        val root = Path.of(requireNotNull(System.getProperty("engine.wave1GoldenRoot")))
        KotlinPoetEmitter().render(goldenSliceModel()).forEach { rendered ->
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
    fun generatedPublicModelAndUnionApisCarryContractKdoc() {
        val rendered = KotlinPoetEmitter().render(goldenSliceModel()).associate { it.path to it.bytes.decodeToString() }
        val request = rendered.getValue("com/nabobery/sdkgen/generated/ChatRequest.kt")
        val oneOf = rendered.getValue("com/nabobery/sdkgen/generated/ChatContent.kt")
        val anyOf = rendered.getValue("com/nabobery/sdkgen/generated/MessageMetadataAnyOf.kt")
        val serialization = rendered.getValue("com/nabobery/sdkgen/generated/SerializationSupport.kt")

        assertTrue(request.contains("Model identifier.\n   */\n  public val model"))
        assertTrue(request.contains("Returns the wire presence of `temperature`."))
        assertTrue(request.contains("Omits `max_tokens` from serialized output."))
        assertTrue(oneOf.contains("Raw JSON retained as the serialization authority."))
        assertTrue(oneOf.contains("Creates this branch and its canonical raw JSON representation."))
        assertTrue(anyOf.contains("Builds a validated wrapper around raw JSON without rewriting it."))
        assertTrue(serialization.contains("SDK-owned JSON behavior and JSON-only serializer guards."))
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
                .single()
                .bytes
                .decodeToString()

        assertTrue(source.contains("public object WidgetCodecs"))
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
        assertFalse(source.contains("streaming support", ignoreCase = true))
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
