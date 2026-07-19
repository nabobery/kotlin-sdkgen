@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)
@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.model.AdditionalPropertiesModel
import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.CompositionModel
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.model.EnumOpenness
import com.nabobery.sdkgen.model.IdentityKind
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.MediaTypeModel
import com.nabobery.sdkgen.model.Nullability
import com.nabobery.sdkgen.model.OperationModel
import com.nabobery.sdkgen.model.ParameterModel
import com.nabobery.sdkgen.model.PropertyModel
import com.nabobery.sdkgen.model.Requiredness
import com.nabobery.sdkgen.model.ResponseModel
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SchemaRef
import com.nabobery.sdkgen.model.SecuritySchemeKind
import com.nabobery.sdkgen.model.SecuritySchemeModel
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.StatusSelectorKind
import com.nabobery.sdkgen.model.StreamingModel
import java.util.Locale
import kotlin.coroutines.cancellation.CancellationException

/** General semantic-operation projection used by the production generation pipeline. */
internal class StandardProjection : DeclarationProjection {
    override fun project(request: DeclarationProjectionRequest): DeclarationMappingResult {
        val diagnostics = mutableListOf<GenerationDiagnostic>()
        val clientName = KotlinNameResolver.typeName(request.clientName)
        val codecsObjectName = "${clientName.removeSuffix("Client")}Codecs"
        val typePlan =
            try {
                TypeNamePlan(
                    request.document,
                    modelPrefix = request.modelPrefix,
                    reservedNames =
                        setOf(
                            clientName,
                            codecsObjectName,
                            "FieldPresence",
                            "FieldState",
                            "SerializationSupport",
                            "SdkJson",
                        ),
                )
            } catch (cancellation: CancellationException) {
                throw cancellation
            } catch (failure: RuntimeException) {
                return DeclarationMappingResult(
                    model = KotlinDeclarationModel(emptyList()),
                    diagnostics =
                        listOf(
                            GenerationDiagnostic(
                                code = GenerationDiagnosticCode.PROJECTION_FAILED,
                                message = failure.message ?: "Unable to build the schema name plan.",
                                source = request.document.source.copy(documentUri = request.canonicalDocumentUri),
                                symbolId = "document:${request.document.documentUri}",
                            ),
                        ),
                    exclusions = emptyList(),
                )
            }
        val memberPlan = MemberNamePlan(request.document.operations, request.operationPrefix)
        val origins = linkedMapOf<String, com.nabobery.sdkgen.model.SourcePointer>()
        val context =
            SchemaProjectionContext(
                request,
                typePlan,
                diagnostics,
                origins,
                fieldStateSchemaIds(request.document),
            )
        val schemaDeclarations =
            request.document.schemas.values
                .sortedBy(SchemaModel::id)
                .mapNotNull { schema -> context.projectDeclaration(schema) }
        val declarations = mutableListOf<Declaration>()
        if (schemaDeclarations.filterIsInstance<ModelDeclaration>().any(ModelDeclaration::usesFieldState)) {
            declarations +=
                SupportDeclaration(
                    symbolId = "support:field-presence",
                    order = Int.MIN_VALUE,
                    packageName = request.packageName,
                    fileName = "FieldPresence",
                    resolvedName = "FieldPresence",
                    kdoc = "Wire presence and explicit null state for generated fields.",
                    kind = SupportKind.FieldPresence,
                )
        }
        declarations +=
            SupportDeclaration(
                symbolId = "support:serialization",
                order = Int.MIN_VALUE + 1,
                packageName = request.packageName,
                fileName = "SerializationSupport",
                resolvedName = "SerializationSupport",
                kdoc = "SDK-owned JSON behavior and serializer guards.",
                kind = SupportKind.Serialization,
            )
        declarations += schemaDeclarations

        val operationOutcomes =
            request.document.operations
                .sortedWith(compareBy(OperationModel::operationId, OperationModel::method, OperationModel::path))
                .mapIndexed { index, operation ->
                    projectOperationOutcome(request, operation, index, context, memberPlan)
                }
        val operations = operationOutcomes.filterIsInstance<OperationProjectionOutcome.Declaration>().map { it.value }
        operations.forEach { projected ->
            request.document.operations
                .firstOrNull { operation ->
                    operation.operationId == projected.operationIdentity &&
                        operation.method.equals(projected.method, ignoreCase = true) &&
                        operation.path == projected.path
                }?.let { operation -> origins[projected.symbolId] = operation.source }
        }
        diagnostics += operationOutcomes.filterIsInstance<OperationProjectionOutcome.Diagnostic>().map { it.value }
        operations.filterNot(OperationDeclaration::hasCompatibleOrdinaryResponseShape).forEach { projected ->
            val sourceOperation =
                request.document.operations.first { operation ->
                    operation.operationId == projected.operationIdentity &&
                        operation.method.equals(projected.method, ignoreCase = true) &&
                        operation.path == projected.path
                }
            diagnostics +=
                GenerationDiagnostic(
                    code = GenerationDiagnosticCode.INCOMPATIBLE_SUCCESS_RESPONSE_SHAPES,
                    message = projected.incompatibleOrdinaryResponseShapeDiagnostic(),
                    source = sourceOperation.source.copy(documentUri = request.canonicalDocumentUri),
                    symbolId = projected.symbolId,
                    severity = DiagnosticSeverity.WARNING,
                    remediation =
                        "Consume the generated typed withResponse API, or align successful response schemas and modes.",
                )
        }

        val client =
            OperationClientDeclaration(
                symbolId = "client:$clientName",
                order = Int.MIN_VALUE,
                packageName = request.packageName,
                fileName = clientName,
                resolvedName = clientName,
                kdoc = "Client for ${request.document.title ?: request.document.documentUri}.",
                codecsObjectName = codecsObjectName,
                operations = operations,
                securitySchemes =
                    request.document.securitySchemes
                        .mapNotNull { (schemeId, scheme) ->
                            projectSecurityScheme(scheme)?.let { schemeId to it }
                        }.toMap(),
            )
        declarations += client
        origins[client.symbolId] = request.document.source

        val files =
            declarations
                .sortedWith(compareBy(Declaration::fileName, Declaration::symbolId))
                .map { declaration ->
                    KotlinFileDeclaration(
                        packageName = request.packageName,
                        fileName = declaration.fileName,
                        declarations = listOf(declaration),
                    )
                }
        return DeclarationMappingResult(
            model = KotlinDeclarationModel(files),
            diagnostics = diagnostics.distinctBy(::diagnosticKey).sortedWith(diagnosticComparator),
            exclusions =
                diagnostics
                    .filter { diagnostic -> diagnostic.severity == DiagnosticSeverity.ERROR }
                    .mapNotNull { diagnostic ->
                        diagnostic.symbolId.takeIf { it.startsWith("operation:") || it.startsWith("schema:") }?.let {
                            GenerationExclusion(it, diagnostic.message, diagnostic.source)
                        }
                    }.distinctBy(::exclusionKey)
                    .sortedWith(compareBy(GenerationExclusion::symbolId, { it.source.jsonPointer })),
            origins = origins.toMap(),
        )
    }

    private fun projectSecurityScheme(scheme: SecuritySchemeModel): OperationSecuritySchemeDeclaration? =
        when (scheme.kind) {
            SecuritySchemeKind.API_KEY -> {
                val location =
                    when (scheme.location) {
                        com.nabobery.sdkgen.model.ParameterLocation.HEADER -> OperationParameterLocation.HEADER
                        com.nabobery.sdkgen.model.ParameterLocation.QUERY -> OperationParameterLocation.QUERY
                        com.nabobery.sdkgen.model.ParameterLocation.COOKIE -> OperationParameterLocation.COOKIE
                        else -> null
                    }
                val parameterName = scheme.parameterName.orEmpty()
                if (location == null || parameterName.isBlank()) {
                    OperationSecuritySchemeDeclaration.Unsupported("apiKey")
                } else {
                    OperationSecuritySchemeDeclaration.ApiKey(location, parameterName)
                }
            }

            SecuritySchemeKind.HTTP -> {
                when (scheme.scheme?.lowercase(Locale.ROOT)) {
                    "basic" -> OperationSecuritySchemeDeclaration.HttpBasic
                    "bearer" -> OperationSecuritySchemeDeclaration.HttpBearer(scheme = "Bearer")
                    else -> OperationSecuritySchemeDeclaration.Unsupported("http")
                }
            }

            SecuritySchemeKind.OAUTH2 -> {
                OperationSecuritySchemeDeclaration.Unsupported("oauth2")
            }

            SecuritySchemeKind.OPEN_ID_CONNECT -> {
                OperationSecuritySchemeDeclaration.Unsupported("openIdConnect")
            }

            SecuritySchemeKind.MUTUAL_TLS -> {
                OperationSecuritySchemeDeclaration.Unsupported("mutualTLS")
            }
        }

    private fun projectOperationOutcome(
        request: DeclarationProjectionRequest,
        operation: OperationModel,
        order: Int,
        context: SchemaProjectionContext,
        memberPlan: MemberNamePlan,
    ): OperationProjectionOutcome =
        try {
            val projected = projectOperation(request, operation, order, context, memberPlan)
            if (
                projected.responseMode == OperationResponseMode.STREAMING &&
                !projected.hasCompatibleOrdinaryResponseShape()
            ) {
                diagnosticOutcome(
                    request,
                    operation,
                    GenerationDiagnosticCode.INCOMPATIBLE_SUCCESS_RESPONSE_SHAPES,
                    UnrepresentableOperationException(
                        "successful streaming response alternatives have incompatible shapes; " +
                            "no callable API or supported withResponse API can be generated",
                    ),
                )
            } else {
                OperationProjectionOutcome.Declaration(projected)
            }
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (failure: MixedResponseModeException) {
            diagnosticOutcome(request, operation, GenerationDiagnosticCode.MIXED_RESPONSE_MODES, failure)
        } catch (failure: UnrepresentableRawResponseAlternativeException) {
            diagnosticOutcome(
                request,
                operation,
                GenerationDiagnosticCode.UNREPRESENTABLE_RAW_RESPONSE_ALTERNATIVE,
                failure,
            )
        } catch (failure: UnrepresentableOperationException) {
            diagnosticOutcome(request, operation, GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION, failure)
        } catch (failure: RuntimeException) {
            diagnosticOutcome(request, operation, GenerationDiagnosticCode.PROJECTION_FAILED, failure)
        }

    private fun diagnosticOutcome(
        request: DeclarationProjectionRequest,
        operation: OperationModel,
        code: GenerationDiagnosticCode,
        failure: RuntimeException,
    ): OperationProjectionOutcome.Diagnostic =
        OperationProjectionOutcome.Diagnostic(
            GenerationDiagnostic(
                code = code,
                message =
                    "Operation '${operation.operationId}' cannot be represented: " +
                        (failure.message ?: failure::class.qualifiedName ?: "unknown projection failure"),
                source = operation.source.copy(documentUri = request.canonicalDocumentUri),
                symbolId = "operation:${operation.operationId}",
                remediation = "Adjust the operation schema or add an explicit overlay before regenerating.",
            ),
        )

    private fun projectOperation(
        request: DeclarationProjectionRequest,
        operation: OperationModel,
        order: Int,
        context: SchemaProjectionContext,
        memberPlan: MemberNamePlan,
    ): OperationDeclaration {
        val responseMode = operationResponseMode(operation)
        val responseAlternatives = projectResponseAlternatives(request, operation, context)
        val successResponses = operation.responses.filter(::isSuccessResponse)
        val successStatusCodes = successResponses.flatMap { response -> response.selector.toSuccessCodes() }.toSet()
        unrepresentableRawResponseAlternative(responseAlternatives, successStatusCodes)?.let { alternative ->
            throw UnrepresentableRawResponseAlternativeException(
                rawResponseAlternativeDiagnostic(operation.operationId, alternative, successStatusCodes),
            )
        }
        val successfulAlternatives =
            responseAlternatives.filter { alternative ->
                alternative.selector.isSuccessSelector()
            }
        val requestAlternatives = projectRequestBodyAlternatives(request, operation, context)
        val requestMediaTypes = requestAlternatives.map(OperationRequestBodyAlternative::mediaType)
        val responseMediaTypes =
            successfulAlternatives
                .flatMap(OperationResponseAlternative::mediaTypes)
                .distinct()
        val operationName = memberPlan.operationName(operation)
        val requestBodyRequired = operation.requestBody?.requiredness == Requiredness.REQUIRED
        val requestType =
            requestAlternatives
                .firstOrNull()
                ?.type
                ?.let { type ->
                    if (requestBodyRequired) type else type.copy(nullable = true)
                }
                ?: KotlinTypeRef("kotlin", "Unit")
        val responseType =
            successfulAlternatives
                .firstOrNull()
                ?.type
                ?: KotlinTypeRef("kotlin", "Unit")
        val timeout = request.runtimeDefaults.requestTimeoutMillis
        val retryDefaults = request.runtimeDefaults.retries
        val safe = operation.method.uppercase(Locale.ROOT) in SAFE_METHODS
        val idempotent =
            safe || operation.method.uppercase(Locale.ROOT) in IDEMPOTENT_METHODS || operation.idempotency != null
        val retryConnectionErrors = responseMode != OperationResponseMode.STREAMING && (safe || idempotent)
        val requestCodecBase = "${operationName}RequestCodec"
        val responseCodecBase = "${operationName}ResponseCodec"
        val requestConstantBase = "${operationName.uppercase(Locale.ROOT)}_REQUEST_CODEC_ID"
        val responseConstantBase = "${operationName.uppercase(Locale.ROOT)}_RESPONSE_CODEC_ID"
        return OperationDeclaration(
            symbolId = "operation:${operation.operationId}",
            order = order,
            operationId = operationName,
            operationIdentity = operation.operationId,
            method = operation.method.uppercase(Locale.ROOT),
            path = operation.path,
            requestMediaTypes = requestMediaTypes,
            responseMediaTypes = responseMediaTypes,
            successStatusCodes = successStatusCodes,
            requestType = requestType,
            responseType = responseType,
            requestCodecPropertyName = requestCodecBase,
            responseCodecPropertyName = responseCodecBase,
            requestCodecConstantName = requestConstantBase,
            responseCodecConstantName = responseConstantBase,
            requestCodecId = "${operation.operationId}.request",
            responseCodecId = "${operation.operationId}.response",
            responseMode = responseMode,
            deadlines =
                OperationDeadlines(
                    totalMillis = if (responseMode == OperationResponseMode.STREAMING) null else timeout,
                    attemptMillis = timeout,
                    idleMillis = null,
                ),
            methodKdoc = operation.description ?: "Executes '${operation.operationId}'.",
            parameters =
                operation.parameters.map { parameter ->
                    projectParameter(request, operation, parameter, context)
                },
            requestBodyAlternatives = requestAlternatives,
            responseAlternatives = responseAlternatives,
            security =
                operation.securityAlternatives.map { requirement ->
                    OperationSecurityRequirement(
                        schemes =
                            requirement.schemes.entries
                                .sortedBy(Map.Entry<String, List<String>>::key)
                                .map { (schemeId, scopes) -> OperationSecuritySchemeRef(schemeId, scopes) },
                    )
                },
            safety = OperationSafetyDeclaration(safe = safe, idempotent = idempotent),
            idempotency =
                operation.idempotency?.let { metadata ->
                    IdempotencyDeclaration(metadata.keyHeader, metadata.clientGenerated)
                },
            retry =
                RetryDeclaration(
                    retryConnectionErrors = retryConnectionErrors,
                    maxAttempts = retryDefaults.maxAttempts,
                    backoff =
                        BackoffDeclaration(
                            baseDelayMillis = retryDefaults.initialDelayMillis,
                            multiplier = 2.0,
                            maxDelayMillis = retryDefaults.maxDelayMillis,
                        ),
                ),
            pagination = projectPagination(operation, context),
            streaming = projectStreaming(operation.streaming),
            requestBodyRequired = requestBodyRequired,
        )
    }

    private fun projectParameter(
        request: DeclarationProjectionRequest,
        operation: OperationModel,
        parameter: ParameterModel,
        context: SchemaProjectionContext,
    ): OperationParameterDeclaration {
        val schema = parameter.schema ?: parameter.content.firstOrNull()?.schema
        return OperationParameterDeclaration(
            name = parameter.name,
            location = OperationParameterLocation.valueOf(parameter.location.name),
            type =
                schema?.let { context.typeFor(it, "${operation.operationId} ${parameter.name} parameter") }
                    ?: unsupported("parameter '${parameter.name}' has no schema"),
            required = parameter.requiredness == Requiredness.REQUIRED,
            style = parameter.style,
            explode = parameter.explode,
        )
    }

    private fun projectRequestBodyAlternatives(
        request: DeclarationProjectionRequest,
        operation: OperationModel,
        context: SchemaProjectionContext,
    ): List<OperationRequestBodyAlternative> {
        val requestBody = operation.requestBody ?: return emptyList()
        return requestBody.content.mapIndexed { contentIndex, content ->
            val bodyType =
                content.schema?.let { schema ->
                    context.typeFor(schema, "${operation.operationId} request $contentIndex")
                } ?: KotlinTypeRef("kotlin", "Unit")
            OperationRequestBodyAlternative(
                mediaType = content.mediaType,
                type = bodyType,
                required = requestBody.requiredness == Requiredness.REQUIRED,
                multipartParts =
                    if (content.mediaType.equals("multipart/form-data", ignoreCase = true)) {
                        projectMultipartParts(request, operation, content.schema, content.encoding, context)
                    } else {
                        emptyList()
                    },
            )
        }
    }

    private fun projectMultipartParts(
        request: DeclarationProjectionRequest,
        operation: OperationModel,
        schemaRef: SchemaRef?,
        encodings: List<com.nabobery.sdkgen.model.EncodingModel>,
        context: SchemaProjectionContext,
    ): List<MultipartPartDeclaration> {
        if (schemaRef == null) unsupported("multipart request body has no schema")
        val schema = context.dereference(schemaRef)
        if (schema.compositions.any { it.kind == CompositionKind.ONE_OF || it.kind == CompositionKind.ANY_OF }) {
            unsupported("multipart request body cannot use oneOf or anyOf composition")
        }
        val properties = context.flattenObjectProperties(schema)
        if (properties.isEmpty()) unsupported("multipart request body must contain at least one object part")
        val propertyNames = allocateNames(properties.map(PropertyModel::name), base = KotlinNameResolver::memberName)
        val encodingByPart = encodings.associateBy { it.partName }
        return properties.map { property ->
            val propertySchema = context.dereference(property.schema)
            val encoding = encodingByPart[property.name]
            MultipartPartDeclaration(
                name = property.name,
                type = context.typeFor(property.schema, "${operation.operationId} ${property.name} part"),
                required = property.requiredness == Requiredness.REQUIRED,
                contentType =
                    encoding?.contentType
                        ?: when {
                            propertySchema.format == "binary" -> "application/octet-stream"
                            propertySchema.types == listOf("string") -> "text/plain"
                            else -> "application/json"
                        },
                headers = encoding?.headers.orEmpty(),
                propertyName = propertyNames.getValue(property.name),
            )
        }
    }

    private fun projectResponseAlternatives(
        request: DeclarationProjectionRequest,
        operation: OperationModel,
        context: SchemaProjectionContext,
    ): List<OperationResponseAlternative> =
        operation.responses.flatMap { response ->
            val selector = response.selector.toSelector(response.selectorKind)
            if (response.content.isEmpty()) {
                listOf(
                    OperationResponseAlternative(
                        selector = selector,
                        mediaTypes = emptyList(),
                        type = KotlinTypeRef("kotlin", "Unit"),
                        mode = OperationResponseMode.BUFFERED,
                    ),
                )
            } else {
                response.content.mapIndexed { contentIndex, content ->
                    OperationResponseAlternative(
                        selector = selector,
                        mediaTypes = listOf(content.mediaType),
                        type =
                            content.schema?.let { schema ->
                                context.typeFor(
                                    schema,
                                    KotlinNameResolver.typeName(
                                        "${operation.operationId} ${response.selector} response $contentIndex",
                                    ),
                                )
                            } ?: KotlinTypeRef("kotlin", "Unit"),
                        mode = responseMode(operation.streaming, content),
                    )
                }
            }
        }

    private fun operationResponseMode(operation: OperationModel): OperationResponseMode {
        val modes =
            operation.responses
                .filter(::isSuccessResponse)
                .flatMap { response ->
                    if (response.content.isEmpty()) {
                        listOf(OperationResponseMode.BUFFERED)
                    } else {
                        response.content.map { content -> responseMode(operation.streaming, content) }
                    }
                }.distinct()
        return when (modes.size) {
            0, 1 -> modes.singleOrNull() ?: OperationResponseMode.BUFFERED

            else -> throw MixedResponseModeException(
                "success responses declare both buffered and streaming alternatives",
            )
        }
    }

    private fun responseMode(
        streaming: StreamingModel?,
        content: MediaTypeModel,
    ): OperationResponseMode =
        if (content.streaming ||
            (streaming as? StreamingModel.Sse)?.responseContentType?.equals(content.mediaType, true) == true
        ) {
            OperationResponseMode.STREAMING
        } else {
            OperationResponseMode.BUFFERED
        }

    private fun projectPagination(
        operation: OperationModel,
        context: SchemaProjectionContext,
    ): PaginationDeclaration? =
        when (val pagination = operation.pagination) {
            is com.nabobery.sdkgen.model.PaginationModel.Cursor -> {
                val responseSchemas =
                    operation.responses
                        .filter(::isSuccessResponse)
                        .flatMap { response -> response.content }
                        .mapNotNull { content -> content.schema }
                val itemTypes =
                    responseSchemas
                        .map { schema ->
                            context.collectionItemTypeAtPath(
                                schema,
                                pagination.responseItems.segments,
                                "${operation.operationId} pagination item",
                            )
                        }.distinct()
                val itemType =
                    itemTypes.singleOrNull()
                        ?: unsupported(
                            "pagination response item paths must resolve to one common item type",
                        )
                PaginationDeclaration.CursorToken(
                    requestCursorParam = pagination.requestCursor,
                    requestLimitParam = pagination.requestLimit,
                    responseItemsPath = pagination.responseItems.segments.joinToString("."),
                    responseNextCursorPath = pagination.responseNextCursor.segments.joinToString("."),
                    itemType = itemType,
                )
            }

            null -> {
                null
            }
        }

    private fun projectStreaming(streaming: StreamingModel?): StreamingDeclaration? =
        when (streaming) {
            is StreamingModel.Sse -> {
                StreamingDeclaration.ServerSentEvents(
                    terminalSentinel = streaming.sentinel,
                    requestFlag = streaming.requestFlag,
                    responseContentType = streaming.responseContentType,
                )
            }

            null -> {
                null
            }
        }

    private fun String.toSelector(kind: StatusSelectorKind): ResponseSelectorDeclaration =
        when (kind) {
            StatusSelectorKind.EXACT -> {
                ResponseSelectorDeclaration.ExactStatus(requireNotNull(toIntOrNull()))
            }

            StatusSelectorKind.RANGE -> {
                val hundreds = first().digitToInt() * 100
                ResponseSelectorDeclaration.StatusRange(hundreds, hundreds + 99)
            }

            StatusSelectorKind.DEFAULT -> {
                ResponseSelectorDeclaration.Default
            }
        }

    private fun ResponseSelectorDeclaration.isSuccessSelector(): Boolean =
        when (this) {
            is ResponseSelectorDeclaration.ExactStatus -> code in 200..299
            is ResponseSelectorDeclaration.StatusRange -> firstInclusive <= 299 && lastInclusive >= 200
            ResponseSelectorDeclaration.Default -> false
        }

    private fun String.toSuccessCodes(): List<Int> =
        when {
            toIntOrNull() != null -> listOfNotNull(toIntOrNull()?.takeIf { it in 200..299 })
            matches(Regex("[2]XX", RegexOption.IGNORE_CASE)) -> (200..299).toList()
            else -> emptyList()
        }

    private fun isSuccessResponse(response: ResponseModel): Boolean =
        response.selector.toSelector(response.selectorKind).isSuccessSelector()

    private sealed interface OperationProjectionOutcome {
        data class Declaration(
            val value: OperationDeclaration,
        ) : OperationProjectionOutcome

        data class Diagnostic(
            val value: GenerationDiagnostic,
        ) : OperationProjectionOutcome
    }

    private class MixedResponseModeException(
        message: String,
    ) : UnrepresentableOperationException(message)

    private class UnrepresentableRawResponseAlternativeException(
        message: String,
    ) : UnrepresentableOperationException(message)

    private fun unsupported(message: String): Nothing = throw UnrepresentableOperationException(message)

    private companion object {
        val SAFE_METHODS = setOf("GET", "HEAD", "OPTIONS", "TRACE")
        val IDEMPOTENT_METHODS = setOf("PUT", "DELETE")
        val diagnosticComparator =
            compareBy<GenerationDiagnostic>(
                GenerationDiagnostic::phase,
                { it.source.documentUri },
                { it.source.jsonPointer },
                GenerationDiagnostic::wireCode,
                GenerationDiagnostic::message,
            )

        fun diagnosticKey(diagnostic: GenerationDiagnostic): String =
            listOf(
                diagnostic.wireCode,
                diagnostic.symbolId,
                diagnostic.source.documentUri,
                diagnostic.source.jsonPointer,
                diagnostic.message,
            ).joinToString("|")

        fun exclusionKey(exclusion: GenerationExclusion): String =
            listOf(
                exclusion.symbolId,
                exclusion.source.documentUri,
                exclusion.source.jsonPointer,
                exclusion.reason,
            ).joinToString("|")
    }
}

private const val FIELD_STATE_EXTENSION = "x-sdkgen-field-state"

private fun fieldStateSchemaIds(document: SemanticDocument): Set<SchemaId> {
    val roots =
        document.operations
            .filter { operation ->
                operation.method.equals("PATCH", ignoreCase = true) ||
                    operation.requestBody?.content.orEmpty().any { content ->
                        content.mediaType.equals("application/merge-patch+json", ignoreCase = true)
                    }
            }.flatMap { operation ->
                operation.requestBody
                    ?.content
                    .orEmpty()
                    .mapNotNull(MediaTypeModel::schema)
            }
    val result = mutableSetOf<SchemaId>()

    fun visit(schemaId: SchemaId) {
        if (!result.add(schemaId)) return
        val schema = document.schemas[schemaId] ?: return
        schema.referenceTarget?.let(::visit)
        schema.properties.forEach { property -> visit(property.schema.schemaId) }
        schema.items?.let { items -> visit(items.schemaId) }
        when (val additionalProperties = schema.additionalProperties) {
            is AdditionalPropertiesModel.Typed -> visit(additionalProperties.valueSchema.schemaId)
            else -> Unit
        }
        schema.compositions.flatMap(CompositionModel::branches).forEach { branch -> visit(branch.schemaId) }
    }

    roots.forEach { schemaRef -> visit(schemaRef.schemaId) }
    document.schemas.values
        .filter { schema ->
            (schema.extensions[FIELD_STATE_EXTENSION] as? JsonValue.BooleanValue)?.value == true
        }.forEach { schema -> visit(schema.id) }
    return result
}

private class TypeNamePlan(
    document: SemanticDocument,
    private val modelPrefix: String?,
    reservedNames: Set<String>,
) {
    private val schemas = document.schemas
    private val namedSchemaIds =
        schemas.values
            .filter { schema -> schemaNeedsDeclaration(schema) }
            .map(SchemaModel::id)
            .sorted()
            .map(SchemaId::value)
    private val names =
        allocateNames(namedSchemaIds, (reservedNames + emitterDerivedNames()).toSet()) { schemaId ->
            rawSchemaName(schemaId)
        }

    private fun emitterDerivedNames(): Set<String> =
        schemas.values
            .flatMap { schema -> emitterDerivedNames(schema) }
            .toSet()

    private fun emitterDerivedNames(schema: SchemaModel): List<String> {
        val effective = dereference(schema)
        val name = rawSchemaName(schema.id.value)
        return when {
            effective.compositions.any { composition -> composition.kind == CompositionKind.ONE_OF } -> {
                listOf(
                    "${name}DecodingException",
                    "${name}NoMatchException",
                    "${name}AmbiguityException",
                    "${name}Inspection",
                )
            }

            effective.compositions.any { composition -> composition.kind == CompositionKind.ANY_OF } -> {
                val composition = effective.compositions.single { it.kind == CompositionKind.ANY_OF }
                val branchViews =
                    if (composition.branches.all { branch -> isObjectLike(dereference(branch)) }) {
                        composition.branches.mapIndexed { index, _ ->
                            val branchName = KotlinNameResolver.typeName("$name branch $index")
                            "${branchName}View"
                        }
                    } else {
                        emptyList()
                    }
                listOf(
                    "${name}Branch",
                    "${name}Inspection",
                    "${name}DecodingException",
                    "${name}NoMatchException",
                ) + branchViews
            }

            else -> {
                emptyList()
            }
        }
    }

    fun nameFor(schemaId: SchemaId): String? = names[schemaId.value]

    private fun schemaNeedsDeclaration(schema: SchemaModel): Boolean {
        val effective = dereference(schema)
        return (
            effective.enum
                ?.values
                .orEmpty()
                .filterNot { it == JsonValue.Null }
                .all { it is JsonValue.StringValue } && effective.enum != null
        ) ||
            effective.properties.isNotEmpty() ||
            effective.allOfPropertyOwnership.isNotEmpty() ||
            effective.compositions.any { composition ->
                composition.kind != CompositionKind.ALL_OF ||
                    composition.branches.any { branch -> isObjectLike(dereference(branch)) }
            }
    }

    private fun isObjectLike(schema: SchemaModel): Boolean =
        "object" in schema.types ||
            schema.properties.isNotEmpty() ||
            schema.compositions.any { composition ->
                composition.kind == CompositionKind.ALL_OF &&
                    composition.branches.any { branch -> isObjectLike(dereference(branch)) }
            }

    private fun dereference(schemaRef: SchemaRef): SchemaModel =
        dereference(schemas[schemaRef.schemaId] ?: error("schema ${schemaRef.schemaId} is missing"))

    private fun dereference(schema: SchemaModel): SchemaModel {
        var current = schema
        val visited = mutableSetOf<SchemaId>()
        while (current.referenceTarget != null && visited.add(current.id)) {
            current = schemas[current.referenceTarget] ?: return current
        }
        return current
    }

    private fun rawSchemaName(schemaId: String): String {
        val marker = "/components/schemas/"
        val componentSuffix = schemaId.substringAfter(marker, missingDelimiterValue = "")
        if (componentSuffix.isNotEmpty() && '/' !in componentSuffix) return prefixedTypeName(componentSuffix)
        val pointer = schemaId.substringAfter('#', schemaId)
        val readable =
            pointer.split('/').filter(String::isNotBlank).joinToString(" ") { segment ->
                segment.replace("~1", "/").replace("~0", "~")
            }
        val base = prefixedTypeName("Inline $readable")
        return if (base.length <= 90) base else "${base.take(80)}${sha256Hex(schemaId.encodeToByteArray()).take(8)}"
    }

    private fun prefixedTypeName(raw: String): String =
        KotlinNameResolver.typeName(listOfNotNull(modelPrefix, raw).joinToString(" "))
}

private class MemberNamePlan(
    operations: List<OperationModel>,
    private val operationPrefix: String?,
) {
    private val names =
        allocateNames(
            operations.map { operation -> operation.operationIdentityKey() },
            reservedNames = setOf("executor", "baseUri", "toString", "hashCode", "equals"),
        ) { key ->
            val raw = key.substringAfter('|').substringBefore('|')
            KotlinNameResolver.memberName(listOfNotNull(operationPrefix, raw).joinToString(" "))
        }

    fun operationName(operation: OperationModel): String =
        names[operation.operationIdentityKey()] ?: error("Missing operation name")

    private fun OperationModel.operationIdentityKey(): String = "$method|$operationId|$path"
}

private class SchemaProjectionContext(
    private val request: DeclarationProjectionRequest,
    private val typePlan: TypeNamePlan,
    private val diagnostics: MutableList<GenerationDiagnostic>,
    private val origins: MutableMap<String, com.nabobery.sdkgen.model.SourcePointer>,
    private val fieldStateSchemaIds: Set<SchemaId>,
) {
    private val document = request.document
    private val failedSchemaIds = mutableSetOf<SchemaId>()

    fun projectDeclaration(schema: SchemaModel): Declaration? {
        val name = typePlan.nameFor(schema.id) ?: return null
        return try {
            val effective = dereference(schema)
            val declaration =
                when {
                    effective.enum != null -> {
                        projectEnum(effective, name)
                    }

                    effective.compositions.any { it.kind == CompositionKind.ONE_OF } -> {
                        projectOneOf(effective, name)
                    }

                    effective.compositions.any { it.kind == CompositionKind.ANY_OF } -> {
                        projectAnyOf(effective, name)
                    }

                    effective.compositions.any {
                        it.kind == CompositionKind.ALL_OF
                    } || effective.properties.isNotEmpty() -> {
                        projectModel(effective, name)
                    }

                    else -> {
                        null
                    }
                }
            declaration?.also { origins[it.symbolId] = schema.source }
            declaration
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (failure: UnrepresentableOperationException) {
            failedSchemaIds += schema.id
            diagnostics +=
                GenerationDiagnostic(
                    code = GenerationDiagnosticCode.UNREPRESENTABLE_SCHEMA,
                    message = "Schema '${schema.id.value}' cannot be represented: ${failure.message}",
                    source = schema.source,
                    symbolId = "schema:$name",
                    remediation = "Rewrite the schema with supported composition and property shapes or apply an overlay.",
                )
            null
        }
    }

    fun typeFor(
        schemaRef: SchemaRef,
        inlineName: String,
    ): KotlinTypeRef {
        val schema = dereference(schemaRef.schemaId)
        if (schema.id in failedSchemaIds) unsupported("schema ${schema.id} has no emitted declaration")
        val nullable = schema.nullability == Nullability.NULLABLE
        val named = typePlan.nameFor(schema.id)
        if (named != null) return KotlinTypeRef(request.packageName, named, nullable = nullable)
        val scalarAllOfBranches =
            schema.compositions
                .filter { it.kind == CompositionKind.ALL_OF }
                .flatMap { composition -> composition.branches }
                .map { branch -> dereference(branch) }
                .filterNot(::isAnnotationOnly)
        if (scalarAllOfBranches.size == 1 && !isObjectLike(scalarAllOfBranches.single())) {
            val branchType = typeFor(SchemaRef(scalarAllOfBranches.single().id, schemaRef.source), inlineName)
            return branchType.copy(nullable = nullable || branchType.nullable)
        }
        val concreteTypes = schema.types.filterNot { it == "null" }.distinct()
        val typedAdditionalProperties = schema.additionalProperties as? AdditionalPropertiesModel.Typed
        if (concreteTypes.size >
            1
        ) {
            unsupported("schema ${schema.id} declares multiple non-null types ${concreteTypes.joinToString()}")
        }
        val base =
            when {
                schema.format == "binary" -> {
                    KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
                }

                concreteTypes.singleOrNull() == "string" -> {
                    KotlinTypeRef("kotlin", "String")
                }

                concreteTypes.singleOrNull() == "integer" && schema.format == "int64" -> {
                    KotlinTypeRef("kotlin", "Long")
                }

                concreteTypes.singleOrNull() == "integer" -> {
                    KotlinTypeRef("kotlin", "Int")
                }

                concreteTypes.singleOrNull() == "number" -> {
                    KotlinTypeRef("kotlin", "Double")
                }

                concreteTypes.singleOrNull() == "boolean" -> {
                    KotlinTypeRef("kotlin", "Boolean")
                }

                concreteTypes.singleOrNull() == "array" -> {
                    KotlinTypeRef(
                        "kotlin.collections",
                        "List",
                        listOf(
                            typeFor(
                                schema.items ?: unsupported("array schema ${schema.id} has no items"),
                                "${inlineName}Item",
                            ),
                        ),
                    )
                }

                typedAdditionalProperties != null -> {
                    KotlinTypeRef(
                        "kotlin.collections",
                        "Map",
                        listOf(
                            KotlinTypeRef("kotlin", "String"),
                            typeFor(typedAdditionalProperties.valueSchema, "${inlineName}Value"),
                        ),
                    )
                }

                concreteTypes.singleOrNull() == "object" -> {
                    KotlinTypeRef("kotlinx.serialization.json", "JsonObject")
                }

                concreteTypes.isEmpty() -> {
                    KotlinTypeRef("kotlinx.serialization.json", "JsonElement")
                }

                else -> {
                    unsupported("schema ${schema.id} has unsupported type '${concreteTypes.joinToString()}'")
                }
            }
        return base.copy(nullable = nullable)
    }

    fun collectionItemTypeAtPath(
        root: SchemaRef,
        path: List<String>,
        inlineName: String,
    ): KotlinTypeRef {
        var current = dereference(root)
        path.forEach { segment ->
            val property =
                flattenObjectProperties(current).firstOrNull { candidate -> candidate.name == segment }
                    ?: unsupported("pagination path segment '$segment' is not present on ${current.id}")
            current = dereference(property.schema)
        }
        val itemSchema = current.items ?: unsupported("pagination path '$path' does not resolve to an array")
        return typeFor(itemSchema, inlineName)
    }

    fun dereference(schemaRef: SchemaRef): SchemaModel = dereference(schemaRef.schemaId)

    fun dereference(schema: SchemaModel): SchemaModel = dereference(schema.id)

    fun dereference(schemaId: SchemaId): SchemaModel {
        var current = document.schemas[schemaId] ?: unsupported("schema $schemaId is missing from the semantic graph")
        val visited = mutableSetOf<SchemaId>()
        while (current.referenceTarget != null && visited.add(current.id)) {
            current =
                document.schemas[current.referenceTarget] ?: unsupported("schema ${current.referenceTarget} is missing")
        }
        return current
    }

    fun flattenObjectProperties(schema: SchemaModel): List<PropertyModel> {
        val visited = mutableSetOf<SchemaId>()
        return flattenObjectProperties(schema, visited).sortedBy(PropertyModel::name)
    }

    private fun flattenObjectProperties(
        schema: SchemaModel,
        visited: MutableSet<SchemaId>,
    ): List<PropertyModel> {
        val effective = dereference(schema.id)
        if (!visited.add(effective.id)) unsupported("recursive allOf composition at ${effective.id}")
        val properties = linkedMapOf<String, PropertyModel>()

        fun addProperty(property: PropertyModel) {
            val prior = properties[property.name]
            if (prior == null) {
                properties[property.name] = property
                return
            }
            val priorType = typeFor(prior.schema, "${effective.id.value} ${prior.name}")
            val nextType = typeFor(property.schema, "${effective.id.value} ${property.name}")
            if (priorType != nextType || prior.nullability != property.nullability) {
                unsupported("conflicting allOf property '${property.name}'")
            }
            if (property.requiredness == Requiredness.REQUIRED && prior.requiredness != Requiredness.REQUIRED) {
                properties[property.name] = prior.copy(requiredness = Requiredness.REQUIRED)
            }
        }
        effective.properties.forEach(::addProperty)
        effective.compositions.filter { it.kind == CompositionKind.ALL_OF }.forEach { composition ->
            composition.branches.forEach { branch ->
                val branchSchema = dereference(branch)
                if (!isObjectLike(branchSchema)) unsupported("allOf branch ${branch.schemaId} is not an object")
                flattenObjectProperties(branchSchema, visited).forEach(::addProperty)
            }
        }
        visited.remove(effective.id)
        return properties.values.toList()
    }

    private fun projectModel(
        schema: SchemaModel,
        name: String,
    ): ModelDeclaration {
        if (!isObjectLike(schema)) unsupported("schema ${schema.id} is not an object")
        val properties = flattenObjectProperties(schema)
        val fieldNames = allocateNames(properties.map(PropertyModel::name), base = KotlinNameResolver::memberName)
        val fields =
            properties.mapIndexed { index, property ->
                FieldDeclaration(
                    symbolId = "schema:$name/property:${property.name}",
                    order = index,
                    resolvedName = fieldNames.getValue(property.name),
                    wireName = property.name,
                    type = typeFor(property.schema, "$name ${property.name}"),
                    required = property.requiredness == Requiredness.REQUIRED,
                    nullable = property.nullability == Nullability.NULLABLE,
                    kdoc = property.description.orEmpty(),
                )
            }
        return ModelDeclaration(
            symbolId = "schema:$name",
            order = schemaOrder(schema),
            packageName = request.packageName,
            fileName = name,
            resolvedName = name,
            kdoc = schema.description ?: "Generated model for ${schema.id.value}.",
            fields = fields,
            dslFunctionName = KotlinNameResolver.memberName(name),
            usesFieldState =
                schema.id in fieldStateSchemaIds ||
                    fields.any { field -> field.required && field.nullable },
        )
    }

    private fun projectEnum(
        schema: SchemaModel,
        name: String,
    ): OpenEnumDeclaration {
        val enum = requireNotNull(schema.enum)
        if (enum.openness != EnumOpenness.OPEN) {
            // The emitter's open-enum vehicle is intentionally the only generated enum shape today.
            // A closed enum remains wire-safe through the same forward-compatible representation.
        }
        val values =
            enum.values
                .filterNot { it == JsonValue.Null }
                .mapIndexed { index, value ->
                    val wire =
                        (value as? JsonValue.StringValue)?.value
                            ?: unsupported("enum ${schema.id} contains a non-string value")
                    EnumValueDeclaration(
                        symbolId = "schema:$name/value:$index",
                        order = index,
                        resolvedName = KotlinNameResolver.typeName(wire),
                        wireValue = wire,
                        kdoc = "Documented value.",
                    )
                }
        val resolvedValues =
            allocateNames(values.map { it.symbolId }) { key -> values.first { it.symbolId == key }.resolvedName }
        return OpenEnumDeclaration(
            symbolId = "schema:$name",
            order = schemaOrder(schema),
            packageName = request.packageName,
            fileName = name,
            resolvedName = name,
            kdoc = schema.description ?: "Forward-compatible enum for ${schema.id.value}.",
            values = values.map { value -> value.copy(resolvedName = resolvedValues.getValue(value.symbolId)) },
        )
    }

    private fun projectOneOf(
        schema: SchemaModel,
        name: String,
    ): OneOfDeclaration {
        val compositions = schema.compositions
        if (compositions.any {
                it.kind != CompositionKind.ONE_OF
            }
        ) {
            unsupported("schema ${schema.id} combines oneOf with another composition")
        }
        val composition = compositions.single()
        val branches = composition.branches.map { branch -> dereference(branch) }
        if (branches.anyNot(::isObjectLike)) unsupported("schema ${schema.id} has a primitive oneOf branch")
        val caseNames =
            allocateNames(composition.branches.map { it.schemaId.value }) { key ->
                typePlan.nameFor(SchemaId(key)) ?: KotlinNameResolver.typeName(key.substringAfterLast('/'))
            }
        val cases =
            composition.branches.mapIndexed { index, branch ->
                val target = branches[index]
                val properties = flattenObjectProperties(target)
                val fieldNames =
                    allocateNames(properties.map(PropertyModel::name), base = KotlinNameResolver::memberName)
                val requiredFields =
                    properties
                        .filter { it.requiredness == Requiredness.REQUIRED }
                        .map { property ->
                            UnionFieldDeclaration(
                                resolvedName = fieldNames.getValue(property.name),
                                wireName = property.name,
                                type = typeFor(property.schema, "$name ${property.name}"),
                            )
                        }
                if (requiredFields.isEmpty()) {
                    unsupported(
                        "oneOf branch ${branch.schemaId} has no required match fields",
                    )
                }
                val discriminatorField =
                    composition.discriminator?.let { discriminator ->
                        val property =
                            properties.firstOrNull { it.name == discriminator.propertyName } ?: return@let null
                        val propertySchema = dereference(property.schema)
                        val value = propertySchema.enum?.values?.singleOrNull() as? JsonValue.StringValue
                        UnionFieldDeclaration(
                            resolvedName = fieldNames.getValue(property.name),
                            wireName = property.name,
                            type = typeFor(property.schema, "$name ${property.name}"),
                            expectedStringValue = value?.value,
                        )
                    }
                val matchFields =
                    if (discriminatorField != null) {
                        listOf(discriminatorField) +
                            requiredFields.filterNot { it.wireName == discriminatorField.wireName }
                    } else {
                        requiredFields
                    }
                OneOfCaseDeclaration(
                    symbolId = "schema:$name/branch:${branch.schemaId.value}",
                    order = index,
                    resolvedName = caseNames.getValue(branch.schemaId.value),
                    requiredFields = requiredFields,
                    matchFields = matchFields,
                )
            }
        return OneOfDeclaration(
            symbolId = "schema:$name",
            order = schemaOrder(schema),
            packageName = request.packageName,
            fileName = name,
            resolvedName = name,
            kdoc = schema.description ?: "Closed oneOf union for ${schema.id.value}.",
            cases = cases,
        )
    }

    private fun projectAnyOf(
        schema: SchemaModel,
        name: String,
    ): AnyOfDeclaration {
        val compositions = schema.compositions
        if (compositions.any {
                it.kind != CompositionKind.ANY_OF
            }
        ) {
            unsupported("schema ${schema.id} combines anyOf with another composition")
        }
        val composition = compositions.single()
        val branchKeys =
            composition.branches.mapIndexed { index, branch ->
                branchKey(index, branch.schemaId)
            }
        val branchNames =
            allocateNames(branchKeys) { key ->
                val (index, schemaId) = parseBranchKey(key)
                typePlan.nameFor(SchemaId(schemaId)) ?: "Branch${index + 1}"
            }
        val branches =
            composition.branches.mapIndexed { index, branch ->
                val target = dereference(branch)
                val branchName = branchNames.getValue(branchKey(index, branch.schemaId))
                val branchSymbolId = "schema:$name/branch:$branchName"
                if (isObjectLike(target)) {
                    val properties = flattenObjectProperties(target)
                    val fieldNames =
                        allocateNames(properties.map(PropertyModel::name), base = KotlinNameResolver::memberName)
                    AnyOfBranchDeclaration(
                        symbolId = branchSymbolId,
                        order = index,
                        resolvedName = branchName,
                        propertyName = KotlinNameResolver.memberName(branchName),
                        fields =
                            properties
                                .filter { it.requiredness == Requiredness.REQUIRED }
                                .map { property ->
                                    UnionFieldDeclaration(
                                        resolvedName = fieldNames.getValue(property.name),
                                        wireName = property.name,
                                        type = typeFor(property.schema, "$name ${property.name}"),
                                    )
                                },
                        shape = AnyOfBranchShape.OBJECT,
                        type =
                            typePlan.nameFor(target.id)?.let { resolved ->
                                KotlinTypeRef(
                                    request.packageName,
                                    resolved,
                                    nullable =
                                        target.nullability == Nullability.NULLABLE,
                                )
                            } ?: KotlinTypeRef("kotlinx.serialization.json", "JsonObject"),
                        viewTypeName = "${branchName}View",
                    )
                } else {
                    AnyOfBranchDeclaration(
                        symbolId = branchSymbolId,
                        order = index,
                        resolvedName = branchName,
                        propertyName = KotlinNameResolver.memberName(branchName),
                        fields = emptyList(),
                        shape = AnyOfBranchShape.VALUE,
                        type = typeFor(branch, "$name branch $index"),
                        maxItems =
                            (target.constraints["maxItems"] as? JsonValue.NumberValue)
                                ?.lexicalValue
                                ?.toIntOrNull(),
                    )
                }
            }
        return AnyOfDeclaration(
            symbolId = "schema:$name",
            order = schemaOrder(schema),
            packageName = request.packageName,
            fileName = name,
            resolvedName = name,
            kdoc = schema.description ?: "Lossless anyOf wrapper for ${schema.id.value}.",
            branches = branches,
        )
    }

    private fun schemaOrder(schema: SchemaModel): Int = schema.id.value.hashCode()

    private fun isObjectLike(schema: SchemaModel): Boolean =
        "object" in schema.types || schema.properties.isNotEmpty() ||
            schema.compositions.any { it.kind == CompositionKind.ALL_OF }

    private fun isAnnotationOnly(schema: SchemaModel): Boolean =
        schema.referenceTarget == null &&
            schema.types.isEmpty() &&
            schema.properties.isEmpty() &&
            schema.items == null &&
            schema.additionalProperties == null &&
            schema.compositions.isEmpty() &&
            schema.enum == null

    private fun unsupported(message: String): Nothing = throw UnrepresentableOperationException(message)
}

private open class UnrepresentableOperationException(
    message: String,
) : RuntimeException(message)

private fun <T> List<T>.anyNot(predicate: (T) -> Boolean): Boolean = any { item -> !predicate(item) }

private fun branchKey(
    index: Int,
    schemaId: SchemaId,
): String = "$index|${schemaId.value}"

private fun parseBranchKey(key: String): Pair<Int, String> = key.substringBefore('|').toInt() to key.substringAfter('|')

private fun allocateNames(
    keys: List<String>,
    reservedNames: Set<String> = emptySet(),
    base: (String) -> String,
): Map<String, String> {
    val result = linkedMapOf<String, String>()
    val used = reservedNames.toMutableSet()
    keys.sorted().forEach { key ->
        val candidateBase = base(key).ifBlank { "Value" }
        var candidate = candidateBase
        var suffix = 2
        while (!used.add(candidate)) {
            candidate = "$candidateBase$suffix"
            suffix += 1
        }
        result[key] = candidate
    }
    return result
}
