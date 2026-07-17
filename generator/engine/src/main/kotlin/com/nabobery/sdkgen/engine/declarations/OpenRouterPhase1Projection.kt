@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.EnumOpenness
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.Nullability
import com.nabobery.sdkgen.model.PropertyModel
import com.nabobery.sdkgen.model.Requiredness
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SourcePointer
import java.util.Locale
import kotlin.coroutines.cancellation.CancellationException

internal data class DeclarationMappingResult(
    val model: KotlinDeclarationModel,
    val diagnostics: List<GenerationDiagnostic>,
    val exclusions: List<GenerationExclusion>,
)

internal data class GenerationDiagnostic(
    val code: String,
    val message: String,
    val source: SourcePointer,
)

internal data class GenerationExclusion(
    val symbolId: String,
    val reason: String,
    val source: SourcePointer,
)

internal data class DeclarationProjectionRequest(
    val document: SemanticDocument,
    val packageName: String,
    val canonicalDocumentUri: String,
    val clientName: String,
)

internal fun interface DeclarationProjection {
    fun project(request: DeclarationProjectionRequest): DeclarationMappingResult
}

internal class OpenRouterPhase1Projection(
    private val packageName: String = "com.nabobery.sdkgen.generated",
    private val canonicalDocumentUri: String? = null,
    private val clientName: String = "OpenRouterClient",
) : DeclarationProjection {
    override fun project(request: DeclarationProjectionRequest): DeclarationMappingResult =
        try {
            OpenRouterPhase1Projection(
                packageName = request.packageName,
                canonicalDocumentUri = request.canonicalDocumentUri,
                clientName = request.clientName,
            ).map(request.document)
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (failure: RuntimeException) {
            // The Phase 1 projection is hard-wired to the pinned OpenRouter shape: any document that
            // does not carry the exact component/operation identities and structures it expects will
            // fail one of its lookups (`error(...)`/`check(...)` -> IllegalStateException, `single { }`
            // -> NoSuchElementException, `requireNotNull(...)` -> IllegalArgumentException). All of
            // these mean the same thing to a caller — "this document cannot be projected by Phase 1" —
            // and must surface as the typed diagnostic below rather than an uncaught exception.
            DeclarationMappingResult(
                model = KotlinDeclarationModel(emptyList()),
                diagnostics =
                    listOf(
                        GenerationDiagnostic(
                            code = "SDKGEN-PROJECTION-UNSUPPORTED-DOCUMENT",
                            message =
                                "The Phase 1 OpenRouter projection cannot project '${request.document.documentUri}': " +
                                    (failure.message ?: failure::class.qualifiedName ?: "unknown failure"),
                            source = request.document.source,
                        ),
                    ),
                exclusions = emptyList(),
            )
        }

    fun map(document: SemanticDocument): DeclarationMappingResult = mapConfigured(document)

    private fun mapConfigured(document: SemanticDocument): DeclarationMappingResult {
        val schemas = document.schemas.values.associateBy(SchemaModel::componentName)
        val exclusions = mutableListOf<GenerationExclusion>()
        val diagnostics = mutableListOf<GenerationDiagnostic>()
        val declarations =
            listOf(
                support("FieldPresence", SupportKind.FieldPresence, 0),
                support("SerializationSupport", SupportKind.Serialization, 1),
                mapProviderSort(requireSchema(schemas, "ProviderSort")),
                mapReasoningDetail(document, requireSchema(schemas, "ReasoningDetailUnion")),
                mapChatStop(document, requireSchema(schemas, "ChatRequest"), exclusions, diagnostics),
                mapChatRequest(document, requireSchema(schemas, "ChatRequest"), exclusions, diagnostics),
                mapChatOperation(document),
            )
        EXCLUDED_TOPICAL_SCHEMAS.forEach { schemaName ->
            val schema = requireSchema(schemas, schemaName)
            exclude(
                exclusions,
                diagnostics,
                symbolId = "schema:$schemaName",
                reason =
                    "Phase 1 emission explicitly excludes '$schemaName' until general object, allOf, " +
                        "and response projection declarations are available.",
                source = schema.source,
            )
        }
        val files =
            declarations.map { declaration ->
                KotlinFileDeclaration(packageName, declaration.fileName, listOf(declaration))
            }
        return DeclarationMappingResult(
            model = KotlinDeclarationModel(files),
            diagnostics = diagnostics.sortedWith(compareBy(GenerationDiagnostic::code, { it.source.jsonPointer })),
            exclusions = exclusions.sortedWith(compareBy(GenerationExclusion::symbolId, { it.source.jsonPointer })),
        )
    }

    private fun mapChatOperation(document: SemanticDocument): OperationClientDeclaration {
        val operation = document.operations.single { it.operationId == "sendChatCompletionRequest" }
        val requestMediaTypes = requireNotNull(operation.requestBody).content.map { it.mediaType }
        val successResponses = operation.responses.filter { it.selector.toIntOrNull() in 200..299 }
        return OperationClientDeclaration(
            symbolId = "operation:${operation.operationId}",
            order = 50,
            packageName = packageName,
            fileName = clientName,
            resolvedName = clientName,
            kdoc = "Client for the '${operation.operationId}' operation.",
            codecsObjectName = "OpenRouterCodecs",
            operations =
                listOf(
                    OperationDeclaration(
                        symbolId = "operation:${operation.operationId}",
                        order = 0,
                        operationId = operation.operationId,
                        method = operation.method.uppercase(Locale.ROOT),
                        path = operation.path,
                        requestMediaTypes = requestMediaTypes,
                        responseMediaTypes =
                            successResponses
                                .flatMap { it.content }
                                .filterNot { it.streaming }
                                .map { it.mediaType }
                                .distinct(),
                        successStatusCodes = successResponses.mapNotNull { it.selector.toIntOrNull() }.toSet(),
                        requestType = KotlinTypeRef(packageName, "ChatRequest"),
                        responseType = KotlinTypeRef("kotlinx.serialization.json", "JsonElement"),
                        requestCodecPropertyName = "chatRequestCodec",
                        responseCodecPropertyName = "jsonElementCodec",
                        requestCodecConstantName = "CHAT_REQUEST_CODEC_ID",
                        responseCodecConstantName = "JSON_ELEMENT_CODEC_ID",
                        requestCodecId = "openrouter.chat-request",
                        responseCodecId = "openrouter.json-element",
                        responseMode = OperationResponseMode.BUFFERED,
                        deadlines = OperationDeadlines(60_000, 60_000, 30_000),
                        methodKdoc = "Executes '${operation.operationId}' and returns a buffered JSON response.",
                    ),
                ),
        )
    }

    private fun mapProviderSort(schema: SchemaModel): OpenEnumDeclaration {
        check(schema.enum?.openness == EnumOpenness.OPEN) { "ProviderSort must remain an open enum" }
        val values =
            requireNotNull(schema.enum).values.mapIndexed { index, value ->
                val wireValue =
                    (value as? JsonValue.StringValue)?.value
                        ?: error("ProviderSort contains a non-string enum value")
                EnumValueDeclaration(
                    symbolId = "schema:ProviderSort/value:$wireValue",
                    order = index,
                    resolvedName = KotlinNameResolver.typeName(wireValue),
                    wireValue = wireValue,
                    kdoc = "Documented provider sorting value.",
                )
            }
        return OpenEnumDeclaration(
            symbolId = "schema:ProviderSort",
            order = 10,
            packageName = packageName,
            fileName = "ProviderSort",
            resolvedName = "ProviderSort",
            kdoc = schema.description.orEmpty(),
            values = values,
        )
    }

    private fun mapChatRequest(
        document: SemanticDocument,
        schema: SchemaModel,
        exclusions: MutableList<GenerationExclusion>,
        diagnostics: MutableList<GenerationDiagnostic>,
    ): ModelDeclaration {
        val selected = listOf("messages", "model", "session_id", "temperature", "max_tokens", "stop")
        val selectedProperties = selected.map { name -> schema.properties.single { it.name == name } }
        schema.properties.filterNot { it.name in selected }.forEach { property ->
            exclude(
                exclusions,
                diagnostics,
                symbolId = "schema:ChatRequest",
                reason =
                    "Phase 1 ChatRequest properties projection excludes property '${property.name}' " +
                        "until its referenced shape is emitted.",
                source = property.source,
            )
        }
        val fields =
            selectedProperties.mapIndexed { index, property ->
                FieldDeclaration(
                    symbolId = "schema:ChatRequest/property:${property.name}",
                    order = index,
                    resolvedName = KotlinNameResolver.memberName(property.name),
                    wireName = property.name,
                    type = chatRequestType(document, property),
                    required = property.requiredness == Requiredness.REQUIRED,
                    nullable = property.nullability == Nullability.NULLABLE,
                    kdoc = property.description.orEmpty(),
                )
            }
        return ModelDeclaration(
            symbolId = "schema:ChatRequest",
            order = 40,
            packageName = packageName,
            fileName = "ChatRequest",
            resolvedName = "ChatRequest",
            kdoc = schema.description.orEmpty(),
            fields = fields,
            dslFunctionName = "chatRequest",
        )
    }

    private fun chatRequestType(
        document: SemanticDocument,
        property: PropertyModel,
    ): KotlinTypeRef =
        when (property.name) {
            "messages" -> {
                KotlinTypeRef(
                    "kotlin.collections",
                    "List",
                    listOf(KotlinTypeRef("kotlinx.serialization.json", "JsonElement")),
                )
            }

            "model", "session_id" -> {
                KotlinTypeRef("kotlin", "String")
            }

            "temperature" -> {
                KotlinTypeRef("kotlin", "Double")
            }

            "max_tokens" -> {
                KotlinTypeRef("kotlin", "Int")
            }

            "stop" -> {
                KotlinTypeRef(packageName, "ChatStopAnyOf")
            }

            else -> {
                error("Unsupported ChatRequest field ${property.name}: ${document.documentUri}")
            }
        }

    private fun mapReasoningDetail(
        document: SemanticDocument,
        schema: SchemaModel,
    ): OneOfDeclaration {
        val composition = schema.compositions.single { it.kind == CompositionKind.ONE_OF }
        val cases =
            composition.branches.mapIndexed { index, branch ->
                val target = document.schemas.getValue(branch.schemaId).dereference(document)
                val typeProperty = target.properties.single { it.name == "type" }
                val typeSchema = document.schemas.getValue(typeProperty.schema.schemaId).dereference(document)
                val wireType =
                    (typeSchema.enum?.values?.singleOrNull() as? JsonValue.StringValue)?.value
                        ?: error("Reasoning detail branch ${target.componentName()} lacks one string discriminator")
                val requiredFields =
                    target.properties
                        .filter { it.requiredness == Requiredness.REQUIRED && it.name != "type" }
                        .map { property ->
                            val propertySchema =
                                document.schemas
                                    .getValue(
                                        property.schema.schemaId,
                                    ).dereference(document)
                            check("string" in propertySchema.types) {
                                "Reasoning detail required field ${property.name} is outside the string-only Phase 1 oneOf subset"
                            }
                            UnionFieldDeclaration(
                                resolvedName = KotlinNameResolver.memberName(property.name),
                                wireName = property.name,
                                type = KotlinTypeRef("kotlin", "String"),
                            )
                        }
                val discriminator =
                    UnionFieldDeclaration(
                        resolvedName = "type",
                        wireName = "type",
                        type = KotlinTypeRef("kotlin", "String"),
                        expectedStringValue = wireType,
                    )
                OneOfCaseDeclaration(
                    symbolId = "schema:ReasoningDetail/${target.componentName()}",
                    order = index,
                    resolvedName = target.componentName().removePrefix("ReasoningDetail"),
                    requiredFields = requiredFields,
                    matchFields = listOf(discriminator) + requiredFields,
                )
            }
        return OneOfDeclaration(
            symbolId = "schema:ReasoningDetailUnion",
            order = 20,
            packageName = packageName,
            fileName = "ReasoningDetail",
            resolvedName = "ReasoningDetail",
            kdoc = schema.description.orEmpty(),
            cases = cases,
        )
    }

    private fun mapChatStop(
        document: SemanticDocument,
        chatRequest: SchemaModel,
        exclusions: MutableList<GenerationExclusion>,
        diagnostics: MutableList<GenerationDiagnostic>,
    ): AnyOfDeclaration {
        val stop = chatRequest.properties.single { it.name == "stop" }
        val stopSchema = document.schemas.getValue(stop.schema.schemaId).dereference(document)
        val composition = stopSchema.compositions.single { it.kind == CompositionKind.ANY_OF }
        val branches = mutableListOf<AnyOfBranchDeclaration>()
        composition.branches.forEachIndexed { index, branch ->
            val target = document.schemas.getValue(branch.schemaId).dereference(document)
            when {
                "string" in target.types -> {
                    branches += valueAnyOfBranch(index, "StringValue", "stringValue", KotlinTypeRef("kotlin", "String"))
                }

                "array" in target.types -> {
                    branches +=
                        valueAnyOfBranch(
                            index,
                            "StringList",
                            "stringList",
                            KotlinTypeRef(
                                "kotlin.collections",
                                "List",
                                listOf(KotlinTypeRef("kotlin", "String")),
                            ),
                            maxItems =
                                (target.constraints["maxItems"] as? JsonValue.NumberValue)
                                    ?.lexicalValue
                                    ?.toIntOrNull(),
                        )
                }

                target.nullability == Nullability.NULLABLE -> {
                    exclude(
                        exclusions,
                        diagnostics,
                        symbolId = "schema:ChatStopAnyOf/branch:$index",
                        reason = "The explicit null branch is excluded from the Phase 1 raw anyOf view; the wrapper currently exposes string and string-list views only.",
                        source = target.source,
                    )
                }

                else -> {
                    error("Unsupported ChatRequest.stop anyOf branch ${target.id}")
                }
            }
        }
        return AnyOfDeclaration(
            symbolId = "schema:ChatRequest/property:stop/anyOf",
            order = 30,
            packageName = packageName,
            fileName = "ChatStopAnyOf",
            resolvedName = "ChatStopAnyOf",
            kdoc = "Raw-preserving views for the OpenRouter ChatRequest.stop anyOf value.",
            branches = branches,
        )
    }

    private fun valueAnyOfBranch(
        order: Int,
        name: String,
        propertyName: String,
        type: KotlinTypeRef,
        maxItems: Int? = null,
    ): AnyOfBranchDeclaration =
        AnyOfBranchDeclaration(
            symbolId = "schema:ChatStopAnyOf/branch:$order",
            order = order,
            resolvedName = name,
            propertyName = propertyName,
            fields = emptyList(),
            shape = AnyOfBranchShape.VALUE,
            type = type,
            maxItems = maxItems,
        )

    private fun support(
        name: String,
        kind: SupportKind,
        order: Int,
    ): SupportDeclaration =
        SupportDeclaration(
            symbolId = "support:${name.lowercase(Locale.ROOT)}",
            order = order,
            packageName = packageName,
            fileName = name,
            resolvedName = name,
            kdoc = "SDKGen serialization support.",
            kind = kind,
        )

    private fun exclude(
        exclusions: MutableList<GenerationExclusion>,
        diagnostics: MutableList<GenerationDiagnostic>,
        symbolId: String,
        reason: String,
        source: SourcePointer,
    ) {
        val stableSource = canonicalDocumentUri?.let { source.copy(documentUri = it) } ?: source
        exclusions += GenerationExclusion(symbolId, reason, stableSource)
        diagnostics += GenerationDiagnostic("SDKGEN-EMIT-EXCLUDED", reason, stableSource)
    }

    private fun requireSchema(
        schemas: Map<String, SchemaModel>,
        name: String,
    ): SchemaModel = schemas[name] ?: error("OpenRouter Phase 1 source is missing component schema '$name'")
}

private val EXCLUDED_TOPICAL_SCHEMAS =
    listOf(
        "BaseReasoningConfig",
        "ChatUsage",
        "Model",
        "ModelsListResponse",
        "ProviderPreferences",
        "ProviderResponse",
    )

private fun SchemaModel.componentName(): String = id.value.substringAfterLast('/')

private fun SchemaModel.dereference(document: SemanticDocument): SchemaModel =
    referenceTarget?.let(document.schemas::getValue)?.dereference(document) ?: this
