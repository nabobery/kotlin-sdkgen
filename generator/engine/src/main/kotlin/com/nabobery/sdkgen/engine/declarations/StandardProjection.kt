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
import com.nabobery.sdkgen.model.ParameterLocation
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
import com.nabobery.sdkgen.model.SourcePointer
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
                            "SchemaInteger",
                            "SchemaDecimal",
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
        val origins = linkedMapOf<String, SourcePointer>()
        val schemas =
            request.document.schemas.values
                .sortedBy(SchemaModel::id)
        var failures = emptySet<SchemaId>()
        var schemaDeclarations: List<Declaration>
        var context: SchemaProjectionContext
        while (true) {
            val attemptDiagnostics = mutableListOf<GenerationDiagnostic>()
            val attemptOrigins = linkedMapOf<String, SourcePointer>()
            context =
                SchemaProjectionContext(
                    request,
                    typePlan,
                    attemptDiagnostics,
                    attemptOrigins,
                    fieldStateSchemaIds(request.document),
                    failures,
                )
            schemaDeclarations = schemas.mapNotNull(context::projectDeclaration)
            val nextFailedSchemaIds = context.failedSchemaIds
            if (nextFailedSchemaIds == failures) {
                diagnostics += attemptDiagnostics
                origins.putAll(attemptOrigins)
                break
            }
            failures = nextFailedSchemaIds
        }
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

        // Operations are partitioned per OpenAPI tag/resource (task T3) rather than emitted into one monolithic
        // client: each group becomes its own OperationClientDeclaration in its own sub-package/file, and the root
        // client becomes a thin facade exposing each group as a lazily-initialized property. This keeps compile
        // units, constant pools, and IDE indexing bounded as specs grow from dozens to thousands of operations.
        val groupKeyBySymbolId: Map<String, String> =
            request.document.operations.associate { operation ->
                "operation:${operation.operationId}" to groupKeyFor(operation)
            }
        val operationsByGroup: Map<String, List<OperationDeclaration>> =
            operations.groupBy { operation -> groupKeyBySymbolId[operation.symbolId] ?: DEFAULT_GROUP_KEY }
        val sortedGroupKeys = operationsByGroup.keys.sorted()
        val groupPackageNames =
            allocateNames(sortedGroupKeys) { key -> KotlinNameResolver.memberName(key).lowercase(Locale.ROOT) }
        val groupClassNames =
            allocateNames(
                sortedGroupKeys,
                reservedNames =
                    setOf(
                        clientName,
                        codecsObjectName,
                        "FieldPresence",
                        "FieldState",
                        "SerializationSupport",
                        "SdkJson",
                    ),
            ) { key -> "${KotlinNameResolver.typeName(key)}Client" }
        val groupAccessorNames =
            allocateNames(
                sortedGroupKeys,
                reservedNames =
                    setOf(
                        "transport",
                        "baseUri",
                        "credentialProviders",
                        "trustedHosts",
                        "authentication",
                        "toString",
                        "hashCode",
                        "equals",
                    ),
            ) { key -> KotlinNameResolver.memberName(key) }
        val securitySchemeDeclarations =
            request.document.securitySchemes
                .mapNotNull { (schemeId, scheme) -> projectSecurityScheme(scheme)?.let { schemeId to it } }
                .toMap()

        val groupClients =
            sortedGroupKeys.mapIndexed { index, key ->
                val groupOperations = operationsByGroup.getValue(key)
                val groupPackage = "${request.packageName}.${groupPackageNames.getValue(key)}"
                val groupClassName = groupClassNames.getValue(key)
                val groupCodecsName = "${groupClassName.removeSuffix("Client")}Codecs"
                val referencedSchemeIds =
                    groupOperations
                        .flatMap { operation -> operation.security }
                        .flatMap { requirement -> requirement.schemes }
                        .map { scheme -> scheme.schemeId }
                        .toSet()
                OperationClientDeclaration(
                    symbolId = "client:$groupPackage.$groupClassName",
                    order = Int.MIN_VALUE + 10 + index,
                    packageName = groupPackage,
                    fileName = groupClassName,
                    resolvedName = groupClassName,
                    kdoc =
                        "Client for the '$key' group of ${request.document.title ?: request.document.documentUri}.",
                    codecsObjectName = groupCodecsName,
                    operations = groupOperations,
                    securitySchemes =
                        securitySchemeDeclarations.filterKeys { schemeId ->
                            schemeId in
                                referencedSchemeIds
                        },
                    preserveOperationMetadataNames = true,
                )
            }
        declarations += groupClients
        groupClients.forEach { groupClient -> origins[groupClient.symbolId] = request.document.source }

        val facade =
            OperationClientDeclaration(
                symbolId = "client:$clientName",
                order = Int.MIN_VALUE,
                packageName = request.packageName,
                fileName = clientName,
                resolvedName = clientName,
                kdoc = "Client for ${request.document.title ?: request.document.documentUri}.",
                codecsObjectName = codecsObjectName,
                operations = emptyList(),
                securitySchemes = emptyMap(),
                subClients =
                    sortedGroupKeys.map { key ->
                        OperationClientGroupRef(
                            packageName = "${request.packageName}.${groupPackageNames.getValue(key)}",
                            className = groupClassNames.getValue(key),
                            accessorName = groupAccessorNames.getValue(key),
                            kdoc = "Operations tagged/grouped under '$key'.",
                        )
                    },
            )
        declarations += facade
        origins[facade.symbolId] = request.document.source

        val files =
            declarations
                .sortedWith(compareBy(Declaration::fileName, Declaration::symbolId))
                .map { declaration ->
                    KotlinFileDeclaration(
                        packageName = declaration.packageName,
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
                        when {
                            diagnostic.symbolId.startsWith("operation:") -> {
                                GenerationExclusion(
                                    GenerationExclusionKind.OPERATION,
                                    diagnostic.symbolId,
                                    diagnostic.wireCode,
                                    diagnostic.message,
                                    diagnostic.source,
                                )
                            }

                            diagnostic.symbolId.startsWith("schema:") -> {
                                GenerationExclusion(
                                    GenerationExclusionKind.SCHEMA,
                                    diagnostic.symbolId,
                                    diagnostic.wireCode,
                                    diagnostic.message,
                                    diagnostic.source,
                                )
                            }

                            else -> {
                                null
                            }
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
                        ParameterLocation.HEADER -> OperationParameterLocation.HEADER
                        ParameterLocation.QUERY -> OperationParameterLocation.QUERY
                        ParameterLocation.COOKIE -> OperationParameterLocation.COOKIE
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
                source =
                    (failure as? UnrepresentableOperationException)
                        ?.source
                        ?.copy(documentUri = request.canonicalDocumentUri)
                        ?: operation.source.copy(documentUri = request.canonicalDocumentUri),
                symbolId = "operation:${operation.operationId}",
                remediation =
                    (failure as? UnrepresentableOperationException)
                        ?.remediation
                        ?: "Adjust the operation schema or add an explicit overlay before regenerating.",
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
        // A MIXED operation's ordinary body-returning method, withResponse, typed errors, and codecs must all keep
        // operating over exactly the shape a BUFFERED-only operation would have — see the streamResponseType KDoc
        // on OperationDeclaration — so the streaming success alternative is carried separately and excluded from
        // the OperationDeclaration.responseAlternatives ultimately stored below.
        val streamingSuccessAlternatives =
            successfulAlternatives.filter { alternative -> alternative.mode == OperationResponseMode.STREAMING }
        val bufferedSuccessAlternatives =
            successfulAlternatives.filter { alternative -> alternative.mode == OperationResponseMode.BUFFERED }
        if (responseMode == OperationResponseMode.MIXED) {
            if (streamingSuccessAlternatives.size != 1 || bufferedSuccessAlternatives.size != 1) {
                unsupported(
                    "mixed buffered/streaming responses require exactly one buffered and one streaming success " +
                        "alternative",
                )
            }
        }
        val declaredResponseAlternatives =
            if (responseMode == OperationResponseMode.MIXED) {
                responseAlternatives.filterNot { alternative -> alternative in streamingSuccessAlternatives }
            } else {
                responseAlternatives
            }
        val requestAlternatives = projectRequestBodyAlternatives(request, operation, context)
        val requestMediaTypes = requestAlternatives.map(OperationRequestBodyAlternative::mediaType)
        val responseMediaTypes =
            (if (responseMode == OperationResponseMode.MIXED) bufferedSuccessAlternatives else successfulAlternatives)
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
            bufferedSuccessAlternatives
                .firstOrNull()
                ?.type
                ?: successfulAlternatives.firstOrNull()?.type
                ?: KotlinTypeRef("kotlin", "Unit")
        val streamResponseType = streamingSuccessAlternatives.firstOrNull()?.type
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
            responseAlternatives = declaredResponseAlternatives,
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
            streamResponseType = streamResponseType,
        )
    }

    private fun projectParameter(
        request: DeclarationProjectionRequest,
        operation: OperationModel,
        parameter: ParameterModel,
        context: SchemaProjectionContext,
    ): OperationParameterDeclaration {
        if (parameter.content.isNotEmpty()) {
            unsupported(
                "parameter '${parameter.name}' uses unsupported content-based serialization",
                parameter.content.first().source,
            )
        }
        val schemaRef = parameter.schema ?: unsupported("parameter '${parameter.name}' has no schema", parameter.source)
        val schema = context.parameterSerializationSchema(schemaRef)
        return OperationParameterDeclaration(
            name = parameter.name,
            location = OperationParameterLocation.valueOf(parameter.location.name),
            type =
                context.typeFor(schemaRef, "${operation.operationId} ${parameter.name} parameter"),
            required = parameter.requiredness == Requiredness.REQUIRED,
            style = parameter.style,
            explode = parameter.explode,
            kdoc = context.projectedKdoc(parameter.description, schemaRef, subject = "parameter"),
            serialization = parameterSerialization(parameter, schemaRef, schema, context),
        )
    }

    private fun parameterSerialization(
        parameter: ParameterModel,
        schemaRef: SchemaRef,
        schema: SchemaModel,
        context: SchemaProjectionContext,
    ): ParameterSerialization {
        val style = parameter.style ?: unsupported("parameter '${parameter.name}' has no serialization style")
        val explode = parameter.explode ?: unsupported("parameter '${parameter.name}' has no explode value")
        return when (parameter.location) {
            ParameterLocation.PATH -> {
                if (style != "simple") unsupported("path parameter '${parameter.name}' uses unsupported style '$style'")
                if (ParameterSchemaPredicates.isPrimitiveParameterUnion(schema, context::dereference)) {
                    // ADR-0016's wire-collapse argument only reaches arrays in query position, where `form` with
                    // explode=true is a repeated key. A path segment is one value: `renderPathTemplate` requires
                    // exactly one and throws otherwise, so an array branch here compiles and then fails at call
                    // time. A bare `type: array` path parameter is already rejected below; this closes the same
                    // shape wrapped in a `oneOf`.
                    if (ParameterSchemaPredicates.unionHasArrayBranch(schema, context::dereference)) {
                        unsupported(
                            "path parameter '${parameter.name}' is a primitive union with an array branch; " +
                                "a path segment carries exactly one value",
                            schema.source,
                        )
                    }
                    ParameterSerialization.PrimitiveUnion
                } else {
                    if (!ParameterSchemaPredicates.isPrimitiveParameterSchema(schema)) {
                        unsupported("path parameter '${parameter.name}' only supports scalar schema", schema.source)
                    }
                    ParameterSerialization.Repeated
                }
            }

            ParameterLocation.QUERY -> {
                when (style) {
                    "form" -> {
                        when {
                            ParameterSchemaPredicates.isPrimitiveParameterSchema(schema) -> {
                                ParameterSerialization.Repeated
                            }

                            ParameterSchemaPredicates.isPrimitiveParameterArray(schema, context::dereference) -> {
                                if (explode) ParameterSerialization.Repeated else ParameterSerialization.CommaJoined
                            }

                            ParameterSchemaPredicates.isPrimitiveParameterUnion(schema, context::dereference) -> {
                                if (!explode) {
                                    unsupported(
                                        "form parameter '${parameter.name}' is a primitive union and requires " +
                                            "explode=true; a comma-joined union cannot be reconstructed",
                                        schema.source,
                                    )
                                }
                                ParameterSerialization.PrimitiveUnion
                            }

                            else -> {
                                unsupported(
                                    "form parameter '${parameter.name}' requires a scalar or primitive array schema",
                                    schema.source,
                                )
                            }
                        }
                    }

                    "deepObject" -> {
                        if (!explode) {
                            unsupported(
                                "deepObject parameter '${parameter.name}' requires explode=true",
                                schema.source,
                            )
                        }
                        if (ParameterSchemaPredicates.isPrimitiveParameterArray(schema, context::dereference)) {
                            ParameterSerialization.StripeCompatibleIndexedArray
                        } else if (ParameterSchemaPredicates.isPrimitiveParameterSchema(schema)) {
                            ParameterSerialization.StripeCompatibleScalar
                        } else if (ParameterSchemaPredicates.hasStripeCompatibleDeepObjectScalarBranch(
                                schema,
                                context::dereference,
                            )
                        ) {
                            ParameterSerialization.StripeCompatibleJsonScalar
                        } else if (schema.items != null) {
                            unsupported(
                                "deepObject parameter '${parameter.name}' requires primitive array item schemas",
                                schema.source,
                            )
                        } else {
                            deepObjectParameterSerialization(parameter, schemaRef, schema, context)
                        }
                    }

                    else -> {
                        unsupported(
                            "query parameter '${parameter.name}' uses unsupported style '$style'",
                            schema.source,
                        )
                    }
                }
            }

            ParameterLocation.HEADER -> {
                if (style != "simple" || explode) {
                    unsupported(
                        "header parameter '${parameter.name}' requires simple style with explode=false",
                        schema.source,
                    )
                }
                when {
                    ParameterSchemaPredicates.isPrimitiveParameterSchema(schema) -> {
                        ParameterSerialization.Repeated
                    }

                    ParameterSchemaPredicates.isPrimitiveParameterArray(schema, context::dereference) -> {
                        ParameterSerialization.CommaJoined
                    }

                    else -> {
                        unsupported(
                            "header parameter '${parameter.name}' requires a scalar or primitive array schema",
                            schema.source,
                        )
                    }
                }
            }

            ParameterLocation.COOKIE -> {
                if (style != "form" || explode || !ParameterSchemaPredicates.isPrimitiveParameterSchema(schema)) {
                    unsupported(
                        "cookie parameter '${parameter.name}' requires form style with explode=false and a scalar schema",
                        schema.source,
                    )
                }
                ParameterSerialization.Repeated
            }
        }
    }

    private fun deepObjectParameterSerialization(
        parameter: ParameterModel,
        schemaRef: SchemaRef,
        schema: SchemaModel,
        context: SchemaProjectionContext,
    ): ParameterSerialization.DeepObject {
        if (!isFormObject(schema)) {
            unsupported("deepObject parameter '${parameter.name}' requires an object schema", schema.source)
        }
        val model =
            context.modelDeclarationFor(schemaRef)
                ?: unsupported(
                    "deepObject parameter '${parameter.name}' has no resolved object declaration",
                    schema.source,
                )
        val fieldsByWireName = model.fields.associateBy(FieldDeclaration::wireName)
        val additionalProperties =
            when (val additional = schema.additionalProperties) {
                null, is AdditionalPropertiesModel.Closed -> {
                    null
                }

                is AdditionalPropertiesModel.FreeForm -> {
                    requireNotNull(model.additionalProperties) {
                        "deepObject model ${model.resolvedName} is missing open additionalProperties metadata"
                    }.let { declaration ->
                        DeepObjectAdditionalPropertiesDeclaration(
                            accessorName = declaration.resolvedName,
                            serialization = DeepObjectAdditionalPropertiesSerialization.JSON_PRIMITIVE_CONTENT,
                        )
                    }
                }

                is AdditionalPropertiesModel.Typed -> {
                    val valueSchema = context.dereference(additional.valueSchema)
                    if (!ParameterSchemaPredicates.isPrimitiveParameterSchema(valueSchema)) {
                        unsupported(
                            "deepObject parameter '${parameter.name}' additionalProperties requires a primitive schema",
                            additional.source,
                        )
                    }
                    if (context.isEffectivelyNullable(additional.valueSchema)) {
                        unsupported(
                            "deepObject parameter '${parameter.name}' additionalProperties values are nullable",
                            additional.source,
                        )
                    }
                    requireNotNull(model.additionalProperties) {
                        "deepObject model ${model.resolvedName} is missing typed additionalProperties metadata"
                    }.let { declaration ->
                        DeepObjectAdditionalPropertiesDeclaration(
                            accessorName = declaration.resolvedName,
                            serialization =
                                if (valueSchema.enum != null) {
                                    DeepObjectAdditionalPropertiesSerialization.OPEN_ENUM_VALUE
                                } else {
                                    DeepObjectAdditionalPropertiesSerialization.TO_STRING
                                },
                        )
                    }
                }
            }
        return ParameterSerialization.DeepObject(
            context.flattenObjectProperties(schema).map { property ->
                val propertySchema = context.dereference(property.schema)
                if (!ParameterSchemaPredicates.isPrimitiveParameterSchema(propertySchema)) {
                    unsupported(
                        "deepObject parameter '${parameter.name}' property '${property.name}' requires a primitive schema",
                        property.source,
                    )
                }
                if (property.nullability == Nullability.NULLABLE || context.isEffectivelyNullable(property.schema)) {
                    unsupported(
                        "deepObject parameter '${parameter.name}' property '${property.name}' is nullable",
                        property.source,
                    )
                }
                val field =
                    fieldsByWireName[property.name]
                        ?: unsupported(
                            "deepObject parameter '${parameter.name}' property '${property.name}' has no resolved accessor",
                            property.source,
                        )
                DeepObjectParameterPropertyDeclaration(property.name, field.resolvedName, field.required)
            },
            additionalProperties,
        )
    }

    private fun projectRequestBodyAlternatives(
        request: DeclarationProjectionRequest,
        operation: OperationModel,
        context: SchemaProjectionContext,
    ): List<OperationRequestBodyAlternative> {
        val requestBody = operation.requestBody ?: return emptyList()
        val formContent =
            requestBody.content.firstOrNull { content ->
                content.mediaType.equals("application/x-www-form-urlencoded", ignoreCase = true)
            }
        if (formContent != null && requestBody.content.size > 1) {
            val alternative = requestBody.content.first { content -> content !== formContent }
            unsupported(
                "form request body has another media alternative; explicit request media selection is not supported",
                alternative.source,
            )
        }
        val bodyTypes =
            requestBody.content.mapIndexed { contentIndex, content ->
                content.schema?.let { schema ->
                    context.typeFor(schema, "${operation.operationId} request $contentIndex")
                } ?: KotlinTypeRef("kotlin", "Unit")
            }
        val selectedType = bodyTypes.firstOrNull()
        val incompatibleIndex = bodyTypes.indexOfFirst { type -> type != selectedType }
        if (incompatibleIndex >= 0) {
            val content = requestBody.content[incompatibleIndex]
            unsupported(
                "request media types use incompatible request schemas; media-type-specific request values are not supported",
                content.schema?.let(context::dereference)?.source ?: content.source,
            )
        }
        return requestBody.content.mapIndexed { contentIndex, content ->
            val bodyType = bodyTypes[contentIndex]
            OperationRequestBodyAlternative(
                mediaType = content.mediaType,
                type = bodyType,
                required = requestBody.requiredness == Requiredness.REQUIRED,
                multipartParts =
                    if (content.mediaType.equals("multipart/form-data", ignoreCase = true)) {
                        projectMultipartParts(operation, content.schema, content.encoding, bodyType, context)
                    } else {
                        emptyList()
                    },
                formFields =
                    if (content.mediaType.equals("application/x-www-form-urlencoded", ignoreCase = true)) {
                        projectFormFields(content, bodyType, context)
                    } else {
                        emptyList()
                    },
            )
        }
    }

    private fun projectFormFields(
        content: MediaTypeModel,
        bodyType: KotlinTypeRef,
        context: SchemaProjectionContext,
    ): List<FormFieldDeclaration> {
        val schemaRef = content.schema ?: unsupported("form request body has no schema", content.source)
        val schema = context.dereference(schemaRef)
        if (schema.compositions.any { it.kind != CompositionKind.ALL_OF }) {
            unsupported("form request body cannot use oneOf or anyOf composition", schema.source)
        }
        if (!isFormObject(schema)) {
            unsupported("form request body must use an object schema", schema.source)
        }
        val properties = context.flattenObjectProperties(schema)
        validateClosedFormObject(schema, properties)
        val propertyNames = properties.mapTo(mutableSetOf(), PropertyModel::name)
        val encodingByProperty = content.encoding.associateBy { it.partName }
        content.encoding.firstOrNull { encoding -> encoding.partName !in propertyNames }?.let { encoding ->
            unsupported("form encoding names unknown property '${encoding.partName}'", encoding.source)
        }
        if (properties.isEmpty()) return emptyList()
        val model =
            context.modelDeclarationFor(schemaRef)
                ?: unsupported("form request schema does not resolve to a model declaration", schema.source)
        if (model.packageName != bodyType.packageName || model.resolvedName != bodyType.simpleName) {
            unsupported("form request schema does not match its resolved request declaration", schema.source)
        }
        val fieldsByWireName = model.fields.associateBy(FieldDeclaration::wireName)
        return properties.map { property ->
            val field =
                fieldsByWireName[property.name]
                    ?: unsupported(
                        "form property '${property.name}' has no field on resolved request declaration '${model.resolvedName}'",
                        property.source,
                    )
            projectFormField(
                property = property,
                field = field,
                encoding = encodingByProperty[property.name],
                context = context,
                visited = mutableSetOf(),
                requireStructuredEncoding = true,
                depth = 0,
            )
        }
    }

    private fun projectFormField(
        property: PropertyModel,
        field: FieldDeclaration,
        encoding: com.nabobery.sdkgen.model.EncodingModel?,
        context: SchemaProjectionContext,
        visited: MutableSet<SchemaId>,
        requireStructuredEncoding: Boolean,
        depth: Int,
    ): FormFieldDeclaration {
        val schema = context.dereference(property.schema)
        if (property.nullability == Nullability.NULLABLE || context.isEffectivelyNullable(property.schema)) {
            unsupported(
                "form property '${property.name}' is nullable but has no declared null wire representation",
                property.source,
            )
        }
        validateFormEncoding(property.name, schema, encoding, requireStructuredEncoding)
        return FormFieldDeclaration(
            wireName = property.name,
            accessorName = field.resolvedName,
            type = field.type,
            required = field.required,
            value = projectFormValue(property.schema, property.source, context, visited, depth),
        )
    }

    private fun projectFormValue(
        schemaRef: SchemaRef,
        source: SourcePointer,
        context: SchemaProjectionContext,
        visited: MutableSet<SchemaId>,
        depth: Int,
    ): FormValueDeclaration {
        val schema = context.dereference(schemaRef)
        if (context.isEffectivelyNullable(schemaRef)) {
            unsupported("form value is nullable but has no declared null wire representation", source)
        }
        if (!visited.add(schema.id)) unsupported("recursive form shape at ${schema.id}", source)
        val result =
            when {
                schema.enum != null && schema.types.filterNot { it == "null" } == listOf("string") -> {
                    FormValueDeclaration.Scalar(FormScalarKind.OPEN_ENUM)
                }

                schema.types.filterNot { it == "null" } == listOf("string") -> {
                    FormValueDeclaration.Scalar(FormScalarKind.STRING)
                }

                schema.types.filterNot { it == "null" } == listOf("integer") -> {
                    FormValueDeclaration.Scalar(FormScalarKind.INTEGER)
                }

                schema.types.filterNot { it == "null" } == listOf("number") -> {
                    FormValueDeclaration.Scalar(FormScalarKind.NUMBER)
                }

                schema.types.filterNot { it == "null" } == listOf("boolean") -> {
                    FormValueDeclaration.Scalar(FormScalarKind.BOOLEAN)
                }

                schema.items != null -> {
                    val items = requireNotNull(schema.items)
                    if (context.isEffectivelyNullable(items)) {
                        unsupported(
                            "form array elements are nullable but have no declared null wire representation",
                            source,
                        )
                    }
                    FormValueDeclaration.Array(
                        projectFormValue(items, items.source, context, visited, depth + 1),
                    )
                }

                schema.compositions.any { it.kind == CompositionKind.ANY_OF } -> {
                    projectFormAnyOf(schemaRef, schema, source, context, visited, depth)
                }

                schema.compositions.any { it.kind == CompositionKind.ONE_OF } -> {
                    unsupported("form value oneOf requires an explicit non-overlapping wire contract", source)
                }

                schema.additionalProperties is AdditionalPropertiesModel.Typed && schema.properties.isEmpty() -> {
                    val additionalProperties = schema.additionalProperties
                    val valueSchema = additionalProperties.valueSchema
                    if (context.isEffectivelyNullable(valueSchema)) {
                        unsupported(
                            "form map values are nullable but have no declared null wire representation",
                            source,
                        )
                    }
                    FormValueDeclaration.Map(
                        projectFormValue(valueSchema, valueSchema.source, context, visited, depth + 1),
                    )
                }

                isFormObject(schema) -> {
                    val properties = context.flattenObjectProperties(schema)
                    validateClosedFormObject(schema, properties)
                    val model =
                        context.modelDeclarationFor(schemaRef)
                            ?: unsupported("nested form object does not resolve to a model declaration", schema.source)
                    val fieldsByWireName = model.fields.associateBy(FieldDeclaration::wireName)
                    FormValueDeclaration.Object(
                        properties.map { property ->
                            val field =
                                fieldsByWireName[property.name]
                                    ?: unsupported(
                                        "nested form property '${property.name}' has no resolved accessor",
                                        property.source,
                                    )
                            projectFormField(
                                property,
                                field,
                                null,
                                context,
                                visited,
                                requireStructuredEncoding = false,
                                depth = depth + 1,
                            )
                        },
                    )
                }

                else -> {
                    unsupported("form value has unsupported schema shape ${schema.id}", source)
                }
            }
        visited.remove(schema.id)
        return result
    }

    private fun projectFormAnyOf(
        schemaRef: SchemaRef,
        schema: SchemaModel,
        source: SourcePointer,
        context: SchemaProjectionContext,
        visited: MutableSet<SchemaId>,
        depth: Int,
    ): FormValueDeclaration {
        val compositions = schema.compositions.filter { composition -> composition.kind == CompositionKind.ANY_OF }
        if (compositions.size != 1 ||
            schema.compositions.any { composition -> composition.kind != CompositionKind.ANY_OF }
        ) {
            unsupported("form anyOf cannot be combined with another composition", source)
        }
        val branches =
            compositions.single().branches.filterNot { branch ->
                context.dereference(branch).acceptsOnlyNull
            }
        val kinds = branches.map { branch -> formWireKind(context.dereference(branch), source) }
        if (kinds.distinct().size != kinds.size) {
            unsupported("form anyOf branches overlap by wire kind and cannot be selected deterministically", source)
        }
        val declaration =
            context.anyOfDeclarationFor(schemaRef)
                ?: unsupported("form anyOf has no generated typed union declaration", source)
        if (declaration.branches.size != branches.size) {
            unsupported("form anyOf branch projection does not match its generated typed union", source)
        }
        return FormValueDeclaration.Union(
            branches.zip(declaration.branches).zip(kinds).map { (branchAndDeclaration, kind) ->
                val (branch, branchDeclaration) = branchAndDeclaration
                val formValue = projectFormValue(branch, branch.source, context, visited, depth + 1)
                FormUnionBranch(
                    accessorName = branchDeclaration.propertyName,
                    kind = kind,
                    value =
                        if (formValue is FormValueDeclaration.Map) {
                            formValue.copy(valuesAreJsonElements = true)
                        } else {
                            formValue
                        },
                )
            },
        )
    }

    private fun formWireKind(
        schema: SchemaModel,
        source: SourcePointer,
    ): FormWireKind {
        if (schema.nullability == Nullability.NULLABLE || "null" in schema.types) {
            unsupported("form union branch is nullable but has no declared null wire representation", source)
        }
        val types = schema.types.filterNot { type -> type == "null" }.distinct()
        return when {
            schema.items != null || types == listOf("array") -> FormWireKind.ARRAY
            isFormObject(schema) -> FormWireKind.OBJECT
            types == listOf("string") -> FormWireKind.STRING
            types == listOf("integer") -> FormWireKind.INTEGER
            types == listOf("number") -> FormWireKind.NUMBER
            types == listOf("boolean") -> FormWireKind.BOOLEAN
            else -> unsupported("form union branch has no supported distinct wire kind", source)
        }
    }

    /**
     * Decides whether a form object's key set is closed enough to emit as a typed declaration, branching on
     * all four [AdditionalPropertiesModel] states explicitly so no case falls through silently.
     *
     * A `null` [SchemaModel.additionalProperties] is the keyword being absent from the source, which is a
     * distinct state from [AdditionalPropertiesModel.FreeForm] (see [AdditionalPropertiesModel]). Once the
     * object declares properties, absent is treated as closed, matching the two other object-shape decisions
     * in this file: [projectModel] emits a catch-all field only when `additionalProperties` is both non-null
     * and not [AdditionalPropertiesModel.Closed], and [projectDeepObjectParameterAdditionalProperties]
     * already matches `null` and [AdditionalPropertiesModel.Closed] together. Requiring a literal
     * `additionalProperties: false` here — a keyword essentially no real specification writes on every nested
     * object — was the sole outlier, and it excluded 148 of Stripe's 587 operations for schemas that declare a
     * complete property set and no dynamic keys at all. See ADR-0014.
     *
     * [properties] must be the *flattened* property set, so `allOf` composition is accounted for the same way
     * [projectModel] accounts for it.
     *
     * Each rejected state carries its own message rather than one shared string, so waiver tooling can tell
     * them apart by reason hash.
     */
    private fun validateClosedFormObject(
        schema: SchemaModel,
        properties: List<PropertyModel>,
    ) {
        when (val additionalProperties = schema.additionalProperties) {
            is AdditionalPropertiesModel.Closed -> {
                Unit
            }

            // Absent keyword: closed once a property set exists. An object that declares no shape at all has
            // no form wire representation -- unlike the JSON path, which can degrade to a JsonObject, a form
            // body has no primitive for serializing an undeclared shape as key=value pairs.
            null -> {
                if (properties.isEmpty()) {
                    unsupported(
                        "form object declares no properties and omits additionalProperties; " +
                            "a form value with no declared shape has no form wire representation",
                        schema.source,
                    )
                }
            }

            is AdditionalPropertiesModel.FreeForm -> {
                unsupported(
                    "form object declares additionalProperties: true; free-form dynamic form keys are unsupported",
                    additionalProperties.source,
                )
            }

            is AdditionalPropertiesModel.Typed -> {
                unsupported(
                    "form object mixes fixed properties with a typed additionalProperties catch-all; " +
                        "mixed fixed-and-dynamic form keys are unsupported",
                    additionalProperties.source,
                )
            }
        }
    }

    private fun validateFormEncoding(
        propertyName: String,
        schema: SchemaModel,
        encoding: com.nabobery.sdkgen.model.EncodingModel?,
        requireStructuredEncoding: Boolean,
    ) {
        if (encoding?.contentType != null) {
            unsupported("form property '$propertyName' uses unsupported encoding contentType", encoding.source)
        }
        if (!encoding?.headers.isNullOrEmpty()) {
            unsupported(
                "form property '$propertyName' uses unsupported encoding headers",
                requireNotNull(encoding).source,
            )
        }
        if (encoding?.allowReserved == true) {
            unsupported("form property '$propertyName' uses unsupported allowReserved=true", encoding.source)
        }
        val structured = schema.items != null || isFormObject(schema) || schema.compositions.isNotEmpty()
        if (structured && requireStructuredEncoding) {
            if (encoding == null) {
                unsupported(
                    "structured form property '$propertyName' requires explicit deepObject encoding",
                    schema.source,
                )
            }
            if (encoding.style != "deepObject" || encoding.explode != true) {
                unsupported(
                    "structured form property '$propertyName' requires style=deepObject and explode=true",
                    encoding.source,
                )
            }
        } else if (encoding != null && encoding.style != null && encoding.style != "form") {
            unsupported(
                "scalar form property '$propertyName' uses unsupported style '${encoding.style}'",
                encoding.source,
            )
        }
    }

    private fun isFormObject(schema: SchemaModel): Boolean =
        "object" in schema.types || schema.properties.isNotEmpty() ||
            schema.compositions.any { it.kind == CompositionKind.ALL_OF }

    private fun projectMultipartParts(
        operation: OperationModel,
        schemaRef: SchemaRef?,
        encodings: List<com.nabobery.sdkgen.model.EncodingModel>,
        bodyType: KotlinTypeRef,
        context: SchemaProjectionContext,
    ): List<MultipartPartDeclaration> {
        if (schemaRef == null) unsupported("multipart request body has no schema")
        val schema = context.dereference(schemaRef)
        if (schema.compositions.any { it.kind == CompositionKind.ONE_OF || it.kind == CompositionKind.ANY_OF }) {
            unsupported("multipart request body cannot use oneOf or anyOf composition", schema.source)
        }
        val properties = context.flattenObjectProperties(schema)
        if (properties.isEmpty()) {
            unsupported(
                "multipart request body must contain at least one object part",
                schema.source,
            )
        }
        val model =
            context.modelDeclarationFor(schemaRef)
                ?: unsupported("multipart request schema does not resolve to a model declaration", schema.source)
        if (model.packageName != bodyType.packageName || model.resolvedName != bodyType.simpleName) {
            unsupported("multipart request schema does not match its resolved request declaration", schema.source)
        }
        val fieldsByWireName = model.fields.associateBy(FieldDeclaration::wireName)
        val encodingByPart = encodings.associateBy { it.partName }
        return properties.map { property ->
            val propertySchema = context.dereference(property.schema)
            val encoding = encodingByPart[property.name]
            val indexedElements = propertySchema.items != null
            val elementSchema = propertySchema.items?.let(context::dereference)
            if (indexedElements &&
                (
                    elementSchema?.types?.filterNot { type -> type == "null" } != listOf("string") ||
                        elementSchema.format == "binary"
                )
            ) {
                unsupported(
                    "multipart array part '${property.name}' must contain non-null text values for indexed encoding",
                    encoding?.source ?: property.source,
                )
            }
            if (propertySchema.items?.let(context::isEffectivelyNullable) == true) {
                unsupported(
                    "multipart array part '${property.name}' has nullable elements with no null wire representation",
                    encoding?.source ?: property.source,
                )
            }
            if (property.nullability == Nullability.NULLABLE &&
                (propertySchema.format == "binary" || propertySchema.types == listOf("string"))
            ) {
                unsupported(
                    "nullable multipart binary/text part '${property.name}' has no supported wire representation",
                    property.source,
                )
            }
            val field =
                fieldsByWireName[property.name]
                    ?: unsupported(
                        "multipart part '${property.name}' has no field on resolved request declaration '${model.resolvedName}'",
                        property.source,
                    )
            MultipartPartDeclaration(
                wireName = property.name,
                accessorName = field.resolvedName,
                type = field.type,
                required = field.required,
                contentType =
                    encoding?.contentType
                        ?: when {
                            indexedElements -> "text/plain"
                            propertySchema.format == "binary" -> "application/octet-stream"
                            propertySchema.types == listOf("string") -> "text/plain"
                            else -> "application/json"
                        },
                indexedElements = indexedElements,
                headers = encoding?.headers.orEmpty(),
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
        return when {
            modes.isEmpty() -> {
                OperationResponseMode.BUFFERED
            }

            modes.size == 1 -> {
                modes.single()
            }

            modes.toSet() == setOf(OperationResponseMode.BUFFERED, OperationResponseMode.STREAMING) -> {
                OperationResponseMode.MIXED
            }

            else -> {
                throw MixedResponseModeException(
                    "success responses declare both buffered and streaming alternatives",
                )
            }
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
                PaginationDeclaration.CursorToken(
                    requestCursorParam = pagination.requestCursor,
                    requestLimitParam = pagination.requestLimit,
                    responseItemsPath = pagination.responseItems.segments.joinToString("."),
                    responseNextCursorPath = pagination.responseNextCursor.segments.joinToString("."),
                    itemType = paginationItemType(operation, context, pagination.responseItems),
                )
            }

            is com.nabobery.sdkgen.model.PaginationModel.HeaderNextUrl -> {
                PaginationDeclaration.HeaderNextUrl(
                    responseItemsPath = pagination.responseItems.segments.joinToString("."),
                    itemType = paginationItemType(operation, context, pagination.responseItems),
                )
            }

            null -> {
                null
            }
        }

    private fun paginationItemType(
        operation: OperationModel,
        context: SchemaProjectionContext,
        responseItems: com.nabobery.sdkgen.model.JsonPointer,
    ): KotlinTypeRef {
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
                        responseItems.segments,
                        "${operation.operationId} pagination item",
                    )
                }.distinct()
        return itemTypes.singleOrNull()
            ?: unsupported("pagination response item paths must resolve to one common item type")
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

    private fun unsupported(
        message: String,
        source: SourcePointer? = null,
    ): Nothing = throw UnrepresentableOperationException(message, source)

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

/** Group key used when an operation has no tag and no usable path segment (see task T3 grouping rules). */
private const val DEFAULT_GROUP_KEY = "default"
private val PATH_PARAMETER_SEGMENT = Regex("\\{[^{}]+}")

/**
 * A leading API version segment: `/v1`, `/v2beta`, `/2024-01-01`.
 *
 * A version segment is shared by every path in an API, so it carries no grouping information. This is a
 * **heuristic**, not a proof: matching happens one operation at a time, so the "shared by every path" property
 * is never checked, and the pattern also matches names like `v1customers` that are not versions. A false
 * positive regroups an untagged operation; a false negative leaves a whole API in one client. See ADR-0017.
 */
private val API_VERSION_SEGMENT = Regex("^(v\\d+[A-Za-z0-9]*|\\d{4}-\\d{2}-\\d{2})$", RegexOption.IGNORE_CASE)

/**
 * The client-partition group for one operation: its first declared OpenAPI tag, or failing that the first path
 * segment that names something, falling back to [DEFAULT_GROUP_KEY]. Grouping never depends on iteration
 * order: the same operation always yields the same raw key, and callers sort keys before allocating Kotlin
 * names.
 *
 * Version segments are skipped. A specification that declares no tags and versions every path under a shared
 * prefix — Stripe puts all 414 paths under `/v1` — would otherwise collapse into a single group, putting its
 * entire API in one client class and one codecs object. See ADR-0017.
 */
private fun groupKeyFor(operation: OperationModel): String {
    operation.tags.firstOrNull { tag -> tag.isNotBlank() }?.let { tag -> return tag.trim() }
    val namedSegments =
        operation.path
            .split('/')
            .filter { segment -> segment.isNotBlank() && !segment.matches(PATH_PARAMETER_SEGMENT) }
    namedSegments.firstOrNull { segment -> !segment.matches(API_VERSION_SEGMENT) }?.let { segment -> return segment }
    // Every named segment is a version: the version is all the path says, so group by it rather than lose it.
    namedSegments.firstOrNull()?.let { segment -> return segment }
    return DEFAULT_GROUP_KEY
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
    private val componentSchemaIds = namedSchemaIds.filter(::isComponentSchemaId)
    private val inlineSchemaIds = namedSchemaIds.filterNot(::isComponentSchemaId)
    private val componentNames =
        allocateNames(
            componentSchemaIds.map(SchemaId::value),
            (reservedNames + emitterDerivedNamesUsingRawNames()).toSet(),
        ) { schemaId -> rawComponentName(schemaId) }
    private val preliminaryInlineNames =
        InlineSchemaNameResolver(modelPrefix = modelPrefix).resolveAll(
            inlineSchemaIds,
            reservedNames + componentNames.values,
        )
    private val names =
        buildMap {
            putAll(componentNames)
            putAll(
                InlineSchemaNameResolver(modelPrefix = modelPrefix)
                    .resolveAll(
                        inlineSchemaIds,
                        reservedNames + componentNames.values + emitterDerivedNames(preliminaryInlineNames),
                    ).mapKeys { (schemaId, _) -> schemaId.value },
            )
        }

    private fun emitterDerivedNamesUsingRawNames(): Set<String> =
        schemas.values
            .flatMap { schema -> emitterDerivedNames(schema, rawSchemaName(schema.id)) }
            .toSet()

    private fun emitterDerivedNames(inlineNames: Map<SchemaId, String>): Set<String> =
        schemas.values
            .flatMap { schema ->
                val name = componentNames[schema.id.value] ?: inlineNames[schema.id] ?: rawSchemaName(schema.id)
                emitterDerivedNames(schema, name)
            }.toSet()

    private fun emitterDerivedNames(
        schema: SchemaModel,
        name: String,
    ): List<String> {
        val effective = dereference(schema)
        return when {
            effective.compositions.any { composition -> composition.kind == CompositionKind.ONE_OF } -> {
                listOf(
                    "${name}DecodingException",
                    "${name}NoMatchException",
                    "${name}AmbiguityException",
                    "${name}BranchValidationException",
                    "${name}Inspection",
                )
            }

            effective.compositions.any { composition -> composition.kind == CompositionKind.ANY_OF } -> {
                val composition = effective.compositions.single { it.kind == CompositionKind.ANY_OF }
                val valueBranches = composition.branches.filterNot { branch -> dereference(branch).acceptsOnlyNull }
                val branchViews =
                    if (valueBranches.all { branch -> isObjectLike(dereference(branch)) }) {
                        valueBranches.mapIndexed { index, _ ->
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

    private fun rawSchemaName(schemaId: SchemaId): String =
        if (isComponentSchemaId(schemaId)) {
            rawComponentName(schemaId.value)
        } else {
            InlineSchemaNameResolver(modelPrefix = modelPrefix)
                .resolveAll(listOf(schemaId), emptySet())
                .getValue(schemaId)
        }

    private fun rawComponentName(schemaId: String): String {
        val marker = "/components/schemas/"
        val componentSuffix = schemaId.substringAfter(marker)
        return prefixedTypeName(componentSuffix)
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
    private val origins: MutableMap<String, SourcePointer>,
    private val fieldStateSchemaIds: Set<SchemaId>,
    initialFailedSchemaIds: Set<SchemaId>,
) {
    private val document = request.document
    private val failures = initialFailedSchemaIds.toMutableSet()

    val failedSchemaIds: Set<SchemaId>
        get() = failures.toSet()

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
            failures += schema.id
            diagnostics +=
                GenerationDiagnostic(
                    code = GenerationDiagnosticCode.UNREPRESENTABLE_SCHEMA,
                    message = "Schema '${schema.id.value}' cannot be represented: ${failure.message}",
                    source = failure.source ?: schema.source,
                    symbolId = "schema:$name",
                    remediation =
                        failure.remediation
                            ?: "Rewrite the schema with supported composition and property shapes or apply an overlay.",
                )
            null
        }
    }

    fun typeFor(
        schemaRef: SchemaRef,
        inlineName: String,
    ): KotlinTypeRef {
        val referenceChainNullable = referenceChainIsNullable(schemaRef.schemaId)
        val schema = dereference(schemaRef.schemaId)
        if (schema.id in failures) unsupported("schema ${schema.id} has no emitted declaration")
        val transparentBranch = transparentAllOfBranch(schema)
        val nullable =
            referenceChainNullable ||
                schema.nullability == Nullability.NULLABLE ||
                transparentAllOfAnnotationsAreNullable(schema)
        transparentBranch?.let { branch ->
            val branchType = typeFor(SchemaRef(branch.id, schemaRef.source), inlineName)
            return branchType.copy(nullable = nullable || branchType.nullable)
        }
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
        val concreteType = concreteTypes.singleOrNull()
        val base =
            when {
                schema.format == "binary" -> {
                    if (concreteType == "string") {
                        KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
                    } else {
                        throw UnrepresentableOperationException(
                            message =
                                "schema ${schema.id} uses format 'binary' with non-string type " +
                                    "'${concreteType ?: "unspecified"}'",
                            source = schema.source,
                            remediation =
                                "Declare binary payloads as type 'string', remove format 'binary', or apply an overlay.",
                        )
                    }
                }

                concreteType == "string" -> {
                    KotlinTypeRef("kotlin", "String")
                }

                concreteType == "integer" && schema.format == "int64" -> {
                    KotlinTypeRef("kotlin", "Long")
                }

                concreteType == "integer" -> {
                    KotlinTypeRef("kotlin", "Int")
                }

                concreteType == "number" -> {
                    if (schema.format == "decimal") {
                        throw UnrepresentableOperationException(
                            message =
                                "schema ${schema.id} uses number format 'decimal', which has no approved portable " +
                                    "lossless Kotlin representation",
                            source = schema.source,
                            remediation =
                                "Apply an overlay selecting an explicitly lossy number type, or wait for a portable " +
                                    "lossless decimal vehicle.",
                        )
                    }
                    KotlinTypeRef("kotlin", "Double")
                }

                concreteType == "boolean" -> {
                    KotlinTypeRef("kotlin", "Boolean")
                }

                concreteType == "array" -> {
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

                concreteType == "object" -> {
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

    fun parameterSerializationSchema(schemaRef: SchemaRef): SchemaModel {
        var current = dereference(schemaRef)
        val visited = mutableSetOf<SchemaId>()
        while (visited.add(current.id)) {
            val transparentBranch = transparentAllOfBranch(current) ?: return current
            current = dereference(transparentBranch)
        }
        unsupported("recursive transparent allOf composition at ${current.id}", current.source)
    }

    fun isEffectivelyNullable(schemaRef: SchemaRef): Boolean {
        val schema = dereference(schemaRef)
        return referenceChainIsNullable(schemaRef.schemaId) ||
            schema.nullability == Nullability.NULLABLE ||
            transparentAllOfAnnotationsAreNullable(schema)
    }

    private fun referenceChainIsNullable(schemaId: SchemaId): Boolean {
        var current = document.schemas[schemaId] ?: unsupported("schema $schemaId is missing from the semantic graph")
        val visited = mutableSetOf<SchemaId>()
        while (visited.add(current.id)) {
            if (current.nullability == Nullability.NULLABLE) return true
            val targetId = current.referenceTarget ?: return false
            current = document.schemas[targetId] ?: unsupported("schema $targetId is missing from the semantic graph")
        }
        return false
    }

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
                if (isAnnotationOnly(branchSchema)) return@forEach
                if (!isObjectLike(branchSchema)) unsupported("allOf branch ${branch.schemaId} is not an object")
                flattenObjectProperties(branchSchema, visited).forEach(::addProperty)
            }
        }
        visited.remove(effective.id)
        return properties.values.toList()
    }

    fun modelDeclarationFor(schemaRef: SchemaRef): ModelDeclaration? =
        projectDeclaration(dereference(schemaRef)) as? ModelDeclaration

    fun anyOfDeclarationFor(schemaRef: SchemaRef): AnyOfDeclaration? =
        projectDeclaration(dereference(schemaRef)) as? AnyOfDeclaration

    private fun projectModel(
        schema: SchemaModel,
        name: String,
    ): ModelDeclaration {
        if (!isObjectLike(schema)) unsupported("schema ${schema.id} is not an object")
        val properties = flattenObjectProperties(schema)
        val additionalPropertiesModel = schema.additionalProperties
        val hasAdditionalProperties =
            properties.isNotEmpty() &&
                additionalPropertiesModel != null &&
                additionalPropertiesModel !is AdditionalPropertiesModel.Closed
        // Sort after real wire names so an actual `additionalProperties` property retains its
        // natural Kotlin name and the generated catch-all receives a stable suffix.
        val additionalPropertiesKey = "\uffffadditionalProperties"
        val fieldNames =
            allocateNames(
                properties.map(PropertyModel::name) +
                    if (hasAdditionalProperties) listOf(additionalPropertiesKey) else emptyList(),
                base = { key ->
                    if (key == additionalPropertiesKey) "additionalProperties" else KotlinNameResolver.memberName(key)
                },
            )
        val fields =
            properties.mapIndexed { index, property ->
                val projectedType = typeFor(property.schema, "$name ${property.name}")
                val nullable =
                    property.nullability == Nullability.NULLABLE ||
                        transparentAllOfAnnotationsAreNullable(dereference(property.schema))
                val type = projectedType.copy(nullable = projectedType.nullable || nullable)
                FieldDeclaration(
                    symbolId = "schema:$name/property:${property.name}",
                    order = index,
                    resolvedName = fieldNames.getValue(property.name),
                    wireName = property.name,
                    type = type,
                    required = property.requiredness == Requiredness.REQUIRED,
                    nullable = nullable || type.nullable,
                    kdoc = projectedKdoc(property.description, property.schema),
                )
            }
        val additionalProperties =
            if (!hasAdditionalProperties) {
                null
            } else {
                val declaredAdditionalProperties = requireNotNull(additionalPropertiesModel)
                val valuesAreJsonElements =
                    declaredAdditionalProperties is AdditionalPropertiesModel.FreeForm ||
                        (
                            declaredAdditionalProperties is AdditionalPropertiesModel.Typed &&
                                isAnnotationOnly(dereference(declaredAdditionalProperties.valueSchema))
                        )
                val valueType =
                    when (val additional = declaredAdditionalProperties) {
                        is AdditionalPropertiesModel.FreeForm -> {
                            KotlinTypeRef("kotlinx.serialization.json", "JsonElement")
                        }

                        is AdditionalPropertiesModel.Typed -> {
                            if (valuesAreJsonElements) {
                                KotlinTypeRef("kotlinx.serialization.json", "JsonElement")
                            } else {
                                typeFor(additional.valueSchema, "$name additionalProperties")
                            }
                        }

                        is AdditionalPropertiesModel.Closed -> {
                            error("unreachable additionalProperties shape")
                        }
                    }
                AdditionalPropertiesDeclaration(
                    resolvedName = fieldNames.getValue(additionalPropertiesKey),
                    valueType = valueType,
                    valuesAreJsonElements = valuesAreJsonElements,
                    fixedWireNames = fields.mapTo(linkedSetOf(), FieldDeclaration::wireName),
                    kdoc = "Additional JSON object members not declared as fixed properties.",
                )
            }
        val usesFieldState =
            schema.id in fieldStateSchemaIds ||
                fields.any { field -> field.required && field.nullable }
        if (usesFieldState) validateFieldStateMemberNames(fields, properties)
        validateRequiredValueBackingMemberNames(fields, properties)
        return ModelDeclaration(
            symbolId = "schema:$name",
            order = schemaOrder(schema),
            packageName = request.packageName,
            fileName = name,
            resolvedName = name,
            kdoc = schemaKdoc(schema, "Generated model for ${schema.id.value}."),
            fields = fields,
            additionalProperties = additionalProperties,
            dslFunctionName = KotlinNameResolver.memberName(name),
            usesFieldState = usesFieldState,
        )
    }

    private fun validateRequiredValueBackingMemberNames(
        fields: List<FieldDeclaration>,
        properties: List<PropertyModel>,
    ) {
        val fieldsByName = fields.associateBy(FieldDeclaration::resolvedName)
        val propertiesByWireName = properties.associateBy(PropertyModel::name)
        fields.filter { field -> field.required && !field.nullable }.forEach { field ->
            val backingName = "${field.resolvedName}Value"
            val conflict = fieldsByName[backingName] ?: return@forEach
            val source = requireNotNull(propertiesByWireName[conflict.wireName]).source
            unsupported(
                "generated required-field backing member '$backingName' for wire property '${field.wireName}' " +
                    "(${field.type}, required=${field.required}, nullable=${field.nullable}) conflicts with Kotlin " +
                    "property '$backingName' for wire property '${conflict.wireName}' " +
                    "(${conflict.type}, required=${conflict.required}, nullable=${conflict.nullable})",
                source,
            )
        }
    }

    private fun validateFieldStateMemberNames(
        fields: List<FieldDeclaration>,
        properties: List<PropertyModel>,
    ) {
        val fieldsByName = fields.associateBy(FieldDeclaration::resolvedName)
        val propertiesByWireName = properties.associateBy(PropertyModel::name)
        fields.forEach { field ->
            val backingName = "${field.resolvedName}State"
            val conflict = fieldsByName[backingName] ?: return@forEach
            if (conflict === field) return@forEach
            val source = requireNotNull(propertiesByWireName[conflict.wireName]).source
            unsupported(
                "generated field-state backing member '$backingName' for wire property '${field.wireName}' " +
                    "(${field.type}, required=${field.required}, nullable=${field.nullable}) conflicts with Kotlin " +
                    "property '$backingName' for wire property '${conflict.wireName}' " +
                    "(${conflict.type}, required=${conflict.required}, nullable=${conflict.nullable})",
                source,
            )
        }
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
            kdoc = schemaKdoc(schema, "Forward-compatible enum for ${schema.id.value}."),
            values = values.map { value -> value.copy(resolvedName = resolvedValues.getValue(value.symbolId)) },
        )
    }

    private fun projectOneOf(
        schema: SchemaModel,
        name: String,
    ): Declaration {
        val compositions = schema.compositions
        if (compositions.any {
                it.kind != CompositionKind.ONE_OF
            }
        ) {
            unsupported("schema ${schema.id} combines oneOf with another composition")
        }
        val composition = compositions.single()
        val valueBranches = composition.branches.filterNot { branch -> dereference(branch).acceptsOnlyNull }
        val branches = valueBranches.map { branch -> dereference(branch) }
        val enclosingProperties = flattenObjectProperties(schema)
        val requiredOnlyBranches =
            branches.map { branch -> isRequiredOnlyObjectConstraint(branch, enclosingProperties) }
        if (branches.indices.any { index -> !isObjectLike(branches[index]) && !requiredOnlyBranches[index] }) {
            return projectPrimitiveOneOf(schema, name, valueBranches, branches)
        }
        val branchProperties =
            branches.mapIndexed { index, branch ->
                if (requiredOnlyBranches[index]) enclosingProperties else flattenObjectProperties(branch)
            }
        val discriminatorEnumSets =
            composition.discriminator?.let { discriminator ->
                branchProperties
                    .map { properties ->
                        properties
                            .firstOrNull { property -> property.name == discriminator.propertyName }
                            ?.let { property -> dereference(property.schema).enum }
                            ?.values
                            ?.mapNotNull { value -> (value as? JsonValue.StringValue)?.value }
                            ?.distinct()
                            ?.sorted()
                            .orEmpty()
                    }.takeIf { enumSets ->
                        enumSets.all(List<String>::isNotEmpty) && enumSets.arePairwiseDisjoint()
                    }
            }
        val caseNames =
            allocateNames(valueBranches.map { it.schemaId.value }) { key ->
                typePlan.nameFor(SchemaId(key)) ?: KotlinNameResolver.typeName(key.substringAfterLast('/'))
            }
        val cases =
            valueBranches.mapIndexed { index, branch ->
                val target = branches[index]
                val requiredOnly = requiredOnlyBranches[index]
                val properties = branchProperties[index]
                val fieldNames =
                    allocateNames(properties.map(PropertyModel::name), base = KotlinNameResolver::memberName)
                val requiredNames =
                    if (requiredOnly) {
                        properties
                            .filter { property -> property.requiredness == Requiredness.REQUIRED }
                            .mapTo(linkedSetOf(), PropertyModel::name)
                            .apply { addAll(target.requiredPropertyNames) }
                    } else {
                        properties
                            .filter { property -> property.requiredness == Requiredness.REQUIRED }
                            .mapTo(linkedSetOf(), PropertyModel::name)
                    }
                discriminatorEnumSets?.let {
                    requiredNames += requireNotNull(composition.discriminator).propertyName
                }
                val matchesEmptyObject =
                    properties.isEmpty() &&
                        "object" in target.types &&
                        target.additionalProperties is AdditionalPropertiesModel.Closed &&
                        target.compositions.isEmpty()
                val requiredFields =
                    properties
                        .filter { property -> property.name in requiredNames }
                        .map { property ->
                            UnionFieldDeclaration(
                                resolvedName = fieldNames.getValue(property.name),
                                wireName = property.name,
                                type = typeFor(property.schema, "$name ${property.name}"),
                                expectedStringValues = exactStringValues(dereference(property.schema)),
                            )
                        }
                if (requiredFields.isEmpty() && !matchesEmptyObject) {
                    return projectPrimitiveOneOf(schema, name, valueBranches, branches)
                }
                val structuralMatchFields =
                    if (requiredOnly) {
                        requiredFields.filter { field -> field.wireName in target.requiredPropertyNames }
                    } else {
                        requiredFields
                    }
                val discriminatorField =
                    composition.discriminator?.let { discriminator ->
                        val property =
                            properties.firstOrNull { it.name == discriminator.propertyName } ?: return@let null
                        val propertySchema = dereference(property.schema)
                        val expectedValues =
                            discriminatorEnumSets?.get(index)
                                ?: listOfNotNull(
                                    (propertySchema.enum?.values?.singleOrNull() as? JsonValue.StringValue)?.value,
                                )
                        UnionFieldDeclaration(
                            resolvedName = fieldNames.getValue(property.name),
                            wireName = property.name,
                            type = typeFor(property.schema, "$name ${property.name}"),
                            expectedStringValue = expectedValues.singleOrNull(),
                            expectedStringValues = expectedValues,
                        )
                    }
                val matchFields =
                    if (discriminatorField != null && discriminatorField.expectedStringValues.isNotEmpty()) {
                        listOf(discriminatorField)
                    } else if (discriminatorField != null) {
                        listOf(discriminatorField) +
                            structuralMatchFields.filterNot { it.wireName == discriminatorField.wireName }
                    } else {
                        structuralMatchFields
                    }
                OneOfCaseDeclaration(
                    symbolId = "schema:$name/branch:${branch.schemaId.value}",
                    order = index,
                    resolvedName = caseNames.getValue(branch.schemaId.value),
                    requiredFields = requiredFields,
                    matchFields = matchFields,
                    matchesEmptyObject = matchesEmptyObject,
                    predicate =
                        if (hasRawLiteralPropertyConstraint(target)) {
                            if (requiredOnly) {
                                JsonBranchPredicate.AllOf(
                                    listOf(
                                        objectOneOfPredicate(schema.copy(compositions = emptyList())),
                                        objectOneOfPredicate(target),
                                    ),
                                )
                            } else {
                                objectOneOfPredicate(target)
                            }
                        } else {
                            null
                        },
                )
            }
        return OneOfDeclaration(
            symbolId = "schema:$name",
            order = schemaOrder(schema),
            packageName = request.packageName,
            fileName = name,
            resolvedName = name,
            kdoc = schemaKdoc(schema, "Closed oneOf union for ${schema.id.value}."),
            cases = cases,
        )
    }

    private fun projectPrimitiveOneOf(
        schema: SchemaModel,
        name: String,
        valueBranches: List<SchemaRef>,
        branches: List<SchemaModel>,
    ): PrimitiveOneOfDeclaration {
        val caseTypes =
            valueBranches.mapIndexed { index, branch ->
                typeFor(branch, "$name branch ${index + 1}")
            }
        val caseKeys =
            valueBranches.mapIndexed { index, branch ->
                branchKey(index, branch.schemaId)
            }
        val caseNames =
            allocateNames(caseKeys) { key ->
                val (index, _) = parseBranchKey(key)
                KotlinNameResolver.typeName("${caseTypes[index].simpleName} value")
            }
        return PrimitiveOneOfDeclaration(
            symbolId = "schema:$name",
            order = schemaOrder(schema),
            packageName = request.packageName,
            fileName = name,
            resolvedName = name,
            kdoc = schemaKdoc(schema, "Closed primitive oneOf union for ${schema.id.value}."),
            cases =
                valueBranches.mapIndexed { index, branch ->
                    PrimitiveOneOfCaseDeclaration(
                        symbolId = "schema:$name/branch:${branch.schemaId.value}",
                        order = index,
                        resolvedName = caseNames.getValue(caseKeys[index]),
                        type = caseTypes[index],
                        jsonKind = primitiveOneOfJsonKind(branches[index]),
                        predicate = primitiveOneOfPredicate(branches[index]),
                    )
                },
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
        val valueBranches = composition.branches.filterNot { branch -> dereference(branch).acceptsOnlyNull }
        val branchKeys =
            valueBranches.mapIndexed { index, branch ->
                branchKey(index, branch.schemaId)
            }
        val branchNames =
            allocateNames(branchKeys) { key ->
                val (index, schemaId) = parseBranchKey(key)
                typePlan.nameFor(SchemaId(schemaId)) ?: "Branch${index + 1}"
            }
        val branches =
            valueBranches.mapIndexed { index, branch ->
                val target = dereference(branch)
                val branchName = branchNames.getValue(branchKey(index, branch.schemaId))
                val branchSymbolId = "schema:$name/branch:$branchName"
                if (isObjectLike(target)) {
                    val properties = flattenObjectProperties(target)
                    val fieldNames =
                        allocateNames(properties.map(PropertyModel::name), base = KotlinNameResolver::memberName)
                    val viewFields =
                        properties.map { property ->
                            val required = property.requiredness == Requiredness.REQUIRED
                            val type = typeFor(property.schema, "$name ${property.name}")
                            UnionFieldDeclaration(
                                resolvedName = fieldNames.getValue(property.name),
                                wireName = property.name,
                                type = if (required) type else type.copy(nullable = true),
                                required = required,
                            )
                        }
                    val viewFileName =
                        target.id
                            .takeIf(::isComponentSchemaId)
                            ?.let(typePlan::nameFor)
                    AnyOfBranchDeclaration(
                        symbolId = branchSymbolId,
                        order = index,
                        resolvedName = branchName,
                        propertyName = KotlinNameResolver.memberName(branchName),
                        fields = viewFields.filter(UnionFieldDeclaration::required),
                        viewFields = viewFields,
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
                        viewTypeName =
                            if (viewFileName == null) {
                                "${name}${branchName}View"
                            } else {
                                "${branchName}View"
                            },
                        viewFileName = viewFileName,
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
            kdoc = schemaKdoc(schema, "Lossless anyOf wrapper for ${schema.id.value}."),
            branches = branches,
        )
    }

    private fun schemaKdoc(
        schema: SchemaModel,
        fallback: String,
    ): String = "${schema.description ?: fallback}\n\nSource: ${schema.id.value}"

    fun projectedKdoc(
        description: String?,
        schemaRef: SchemaRef,
        subject: String = "property",
    ): String = projectedKdoc(description, dereference(schemaRef), subject)

    private fun projectedKdoc(
        description: String?,
        schema: SchemaModel,
        subject: String,
    ): String {
        val projectionKdoc =
            when {
                schema.format == "byte" || schema.contentEncoding == "base64" -> {
                    "Base64-encoded wire text. This $subject is not decoded into bytes."
                }

                schema.types
                    .filterNot { it == "null" }
                    .distinct()
                    .singleOrNull() == "string" &&
                    schema.format != null &&
                    schema.format != "binary" -> {
                    "Wire format: `${schema.format}`. Represented as `String` in this release; " +
                        "SDKGen does not validate this format."
                }

                schema.types
                    .filterNot { it == "null" }
                    .distinct()
                    .singleOrNull() == "number" &&
                    schema.format != "decimal" -> {
                    "Represented as IEEE-754 `Double`; values may lose decimal precision."
                }

                else -> {
                    ""
                }
            }
        return when {
            description.isNullOrBlank() -> projectionKdoc
            projectionKdoc.isBlank() -> description
            else -> "$description\n\n$projectionKdoc"
        }
    }

    private fun schemaOrder(schema: SchemaModel): Int = schema.id.value.hashCode()

    private fun isObjectLike(schema: SchemaModel): Boolean =
        "object" in schema.types || schema.properties.isNotEmpty() ||
            schema.compositions.any { it.kind == CompositionKind.ALL_OF }

    private fun hasRawLiteralPropertyConstraint(schema: SchemaModel): Boolean =
        flattenObjectProperties(schema).any { property ->
            val propertySchema = dereference(property.schema)
            propertySchema.constraints.containsKey("const") || propertySchema.enum != null
        }

    private fun objectOneOfPredicate(schema: SchemaModel): JsonBranchPredicate =
        try {
            primitiveOneOfPredicate(schema)
        } catch (_: UnrepresentableOperationException) {
            JsonBranchPredicate.NeverMatch
        }

    private fun exactStringValues(schema: SchemaModel): List<String> =
        when (val constant = schema.constraints["const"]) {
            is JsonValue.StringValue -> {
                listOf(constant.value)
            }

            else -> {
                schema.enum
                    ?.takeIf { enum -> enum.values.all { value -> value is JsonValue.StringValue } }
                    ?.values
                    ?.map { value -> (value as JsonValue.StringValue).value }
                    ?.distinct()
                    ?.sorted()
                    .orEmpty()
            }
        }

    private fun primitiveOneOfJsonKind(schema: SchemaModel): PrimitiveOneOfJsonKind =
        when (val predicate = primitiveOneOfPredicate(schema)) {
            is JsonBranchPredicate.Kind -> {
                predicate.kind
            }

            is JsonBranchPredicate.AllOf -> {
                predicate.predicates
                    .filterIsInstance<JsonBranchPredicate.Kind>()
                    .singleOrNull()
                    ?.kind
                    ?: unsupported("oneOf branch ${schema.id} has no single JSON kind")
            }

            else -> {
                unsupported("oneOf branch ${schema.id} has no exact JSON kind")
            }
        }

    /**
     * Projects only assertions whose raw JSON membership can be emitted exactly. This intentionally
     * rejects constraint keywords rather than using successful Kotlin deserialization as a proxy for
     * JSON Schema validation.
     */
    private fun primitiveOneOfPredicate(
        schema: SchemaModel,
        visiting: MutableSet<SchemaId> = linkedSetOf(),
    ): JsonBranchPredicate {
        if (!visiting.add(schema.id)) unsupported("oneOf branch ${schema.id} has a recursive predicate reference")
        try {
            if (schema.contentEncoding != null || schema.contentMediaType != null) {
                unsupported("oneOf branch ${schema.id} uses unsupported content assertions")
            }
            val predicates = mutableListOf<JsonBranchPredicate>()
            val typedPredicates =
                schema.types.distinct().map { type ->
                    when (type) {
                        "null" -> JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.NULL)
                        "string" -> JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING)
                        "integer" -> JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.INTEGER)
                        "number" -> JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.NUMBER)
                        "boolean" -> JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.BOOLEAN)
                        "array" -> JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.ARRAY)
                        "object" -> JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.OBJECT)
                        else -> unsupported("oneOf branch ${schema.id} has unsupported JSON type '$type'")
                    }
                }
            when (typedPredicates.size) {
                0 -> Unit
                1 -> predicates += typedPredicates.single()
                else -> predicates += JsonBranchPredicate.AnyOf(typedPredicates)
            }
            schema.constraints["const"]?.let { value -> predicates += JsonBranchPredicate.Constant(value) }
            schema.enum?.let { enum -> predicates += JsonBranchPredicate.Enumeration(enum.values) }

            val numeric = numericPredicate(schema)
            if (numeric != null) predicates += numeric
            val string = stringPredicate(schema)
            if (string != null) predicates += string
            val array = arrayPredicate(schema, visiting)
            if (array != null) predicates += array
            val objectPredicate = objectPredicate(schema, visiting)
            if (objectPredicate != null) predicates += objectPredicate

            schema.compositions.forEach { composition ->
                if (composition.kind != CompositionKind.ALL_OF) {
                    unsupported("oneOf branch ${schema.id} uses unsupported ${composition.kind} composition")
                }
                composition.branches.forEach { branch ->
                    predicates += primitiveOneOfPredicate(dereference(branch), visiting)
                }
            }
            if (predicates.isEmpty()) return JsonBranchPredicate.AnyValue
            if (predicates.size == 1) return predicates.single()
            return JsonBranchPredicate.AllOf(predicates)
        } finally {
            visiting.remove(schema.id)
        }
    }

    private fun numericPredicate(schema: SchemaModel): JsonBranchPredicate.Numeric? {
        val names = setOf("minimum", "maximum", "exclusiveMinimum", "exclusiveMaximum", "multipleOf")
        val values = names.associateWith { name -> schema.constraints[name]?.asNumber(name, schema) }
        if (values.values.all { it == null }) return null
        return JsonBranchPredicate.Numeric(
            minimum = values.getValue("minimum"),
            maximum = values.getValue("maximum"),
            exclusiveMinimum = values.getValue("exclusiveMinimum"),
            exclusiveMaximum = values.getValue("exclusiveMaximum"),
            multipleOf = values.getValue("multipleOf"),
        )
    }

    private fun stringPredicate(schema: SchemaModel): JsonBranchPredicate.StringShape? {
        schema.constraints["pattern"]?.let {
            unsupported("oneOf branch ${schema.id} uses pattern, whose JSON Schema regex dialect cannot be preserved")
        }
        val minLength = schema.constraints["minLength"]?.asNonNegativeInt("minLength", schema)
        val maxLength = schema.constraints["maxLength"]?.asNonNegativeInt("maxLength", schema)
        val format =
            if (schema.types.isNotEmpty() && "string" !in schema.types) {
                null
            } else {
                when (schema.format) {
                    null -> null
                    "date" -> JsonStringFormat.DATE
                    "date-time" -> JsonStringFormat.DATE_TIME
                    else -> unsupported("oneOf branch ${schema.id} uses unsupported string format '${schema.format}'")
                }
            }
        return if (minLength == null && maxLength == null && format == null) {
            null
        } else {
            JsonBranchPredicate.StringShape(minLength, maxLength, format)
        }
    }

    private fun arrayPredicate(
        schema: SchemaModel,
        visiting: MutableSet<SchemaId>,
    ): JsonBranchPredicate.ArrayShape? {
        val minItems = schema.constraints["minItems"]?.asNonNegativeInt("minItems", schema)
        val maxItems = schema.constraints["maxItems"]?.asNonNegativeInt("maxItems", schema)
        val uniqueItems =
            when (val value = schema.constraints["uniqueItems"]) {
                null -> false
                is JsonValue.BooleanValue -> value.value
                else -> unsupported("oneOf branch ${schema.id} has non-boolean uniqueItems")
            }
        val item = schema.items?.let { reference -> primitiveOneOfPredicate(dereference(reference), visiting) }
        return if (minItems == null && maxItems == null && !uniqueItems && item == null) {
            null
        } else {
            JsonBranchPredicate.ArrayShape(minItems, maxItems, uniqueItems, item)
        }
    }

    private fun objectPredicate(
        schema: SchemaModel,
        visiting: MutableSet<SchemaId>,
    ): JsonBranchPredicate.ObjectShape? {
        schema.constraints["minProperties"]?.let {
            unsupported("oneOf branch ${schema.id} uses unsupported minProperties")
        }
        schema.constraints["maxProperties"]?.let {
            unsupported("oneOf branch ${schema.id} uses unsupported maxProperties")
        }
        schema.constraints["unevaluatedProperties"]?.let {
            unsupported("oneOf branch ${schema.id} uses unsupported unevaluatedProperties")
        }
        val properties = schema.properties.sortedBy(PropertyModel::name)
        val requiredNames = schema.requiredPropertyNames.distinct().sorted()
        val additional =
            when (val value = schema.additionalProperties) {
                null, is AdditionalPropertiesModel.FreeForm -> {
                    JsonAdditionalPropertiesPredicate.Open
                }

                is AdditionalPropertiesModel.Closed -> {
                    JsonAdditionalPropertiesPredicate.Closed
                }

                is AdditionalPropertiesModel.Typed -> {
                    JsonAdditionalPropertiesPredicate.Typed(
                        primitiveOneOfPredicate(dereference(value.valueSchema), visiting),
                    )
                }
            }
        val hasObjectAssertions =
            properties.isNotEmpty() || requiredNames.isNotEmpty() || schema.additionalProperties != null
        if (!hasObjectAssertions) return null
        return JsonBranchPredicate.ObjectShape(
            requiredNames = requiredNames,
            properties =
                properties.associate { property ->
                    property.name to primitiveOneOfPredicate(dereference(property.schema), visiting)
                },
            additionalProperties = additional,
        )
    }

    private fun JsonValue.asNumber(
        name: String,
        schema: SchemaModel,
    ): String =
        (this as? JsonValue.NumberValue)?.lexicalValue
            ?: unsupported("oneOf branch ${schema.id} has non-numeric $name")

    private fun JsonValue.asNonNegativeInt(
        name: String,
        schema: SchemaModel,
    ): Int {
        val value =
            asNumber(name, schema).toIntOrNull()
                ?: unsupported("oneOf branch ${schema.id} has non-integer $name")
        if (value < 0) unsupported("oneOf branch ${schema.id} has negative $name")
        return value
    }

    private fun List<List<String>>.arePairwiseDisjoint(): Boolean {
        val seen = mutableSetOf<String>()
        return all { values -> values.all(seen::add) }
    }

    private fun isRequiredOnlyObjectConstraint(
        schema: SchemaModel,
        enclosingProperties: List<PropertyModel>,
    ): Boolean =
        schema.referenceTarget == null &&
            schema.types.isEmpty() &&
            schema.properties.isEmpty() &&
            schema.items == null &&
            schema.additionalProperties == null &&
            schema.enum == null &&
            schema.compositions.isEmpty() &&
            schema.requiredPropertyNames.isNotEmpty() &&
            schema.requiredPropertyNames.all { requiredName ->
                enclosingProperties.any { property -> property.name == requiredName }
            }

    private fun transparentAllOfBranch(schema: SchemaModel): SchemaModel? {
        if (schema.types.isNotEmpty() || schema.properties.isNotEmpty() || schema.items != null ||
            schema.additionalProperties != null || schema.enum != null
        ) {
            return null
        }
        val allOf =
            schema.compositions.singleOrNull()?.takeIf { composition -> composition.kind == CompositionKind.ALL_OF }
                ?: return null
        return allOf.branches
            .map(::dereference)
            .filterNot(::isAnnotationOnly)
            .singleOrNull()
    }

    private fun transparentAllOfAnnotationsAreNullable(schema: SchemaModel): Boolean =
        transparentAllOfBranch(schema) != null &&
            schema.compositions
                .single()
                .branches
                .map(::dereference)
                .filter(::isAnnotationOnly)
                .any { annotation -> annotation.nullability == Nullability.NULLABLE }

    private fun isAnnotationOnly(schema: SchemaModel): Boolean =
        schema.referenceTarget == null &&
            schema.types.isEmpty() &&
            schema.properties.isEmpty() &&
            schema.items == null &&
            schema.additionalProperties == null &&
            schema.compositions.isEmpty() &&
            schema.enum == null

    private fun unsupported(
        message: String,
        source: SourcePointer? = null,
    ): Nothing = throw UnrepresentableOperationException(message, source)
}

private open class UnrepresentableOperationException(
    message: String,
    val source: SourcePointer? = null,
    val remediation: String? = null,
) : RuntimeException(message)

private fun <T> List<T>.anyNot(predicate: (T) -> Boolean): Boolean = any { item -> !predicate(item) }

private fun isComponentSchemaId(schemaId: SchemaId): Boolean {
    val suffix = schemaId.value.substringAfter("/components/schemas/", missingDelimiterValue = "")
    return suffix.isNotEmpty() && '/' !in suffix
}

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
