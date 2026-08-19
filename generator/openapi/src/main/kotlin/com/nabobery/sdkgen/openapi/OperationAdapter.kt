@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.fasterxml.jackson.databind.JsonNode
import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.DiagnosticCode
import com.nabobery.sdkgen.model.DiagnosticPhase
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.model.EncodingModel
import com.nabobery.sdkgen.model.HeaderModel
import com.nabobery.sdkgen.model.IdempotencyModel
import com.nabobery.sdkgen.model.JsonPointer
import com.nabobery.sdkgen.model.MediaTypeModel
import com.nabobery.sdkgen.model.OperationModel
import com.nabobery.sdkgen.model.PaginationModel
import com.nabobery.sdkgen.model.ParameterLocation
import com.nabobery.sdkgen.model.ParameterModel
import com.nabobery.sdkgen.model.RequestBodyModel
import com.nabobery.sdkgen.model.Requiredness
import com.nabobery.sdkgen.model.ResponseModel
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SchemaRef
import com.nabobery.sdkgen.model.SecurityRequirementModel
import com.nabobery.sdkgen.model.SecuritySchemeKind
import com.nabobery.sdkgen.model.SecuritySchemeModel
import com.nabobery.sdkgen.model.StatusSelectorKind
import com.nabobery.sdkgen.model.StreamingModel
import java.util.TreeMap
import kotlin.coroutines.cancellation.CancellationException

internal val HTTP_METHODS = listOf("delete", "get", "head", "options", "patch", "post", "put", "trace")

private data class LocatedNode(
    val document: SourceDocument,
    val pointer: String,
    val node: JsonNode,
)

internal fun AdaptationContext.adaptOperations(root: JsonNode): List<OperationModel> {
    diagnoseMisplacedCanonicalExtensions(root)
    val paths = root.get("paths") ?: return emptyList()
    if (!paths.isObject) return emptyList()
    val operations = mutableListOf<OperationModel>()
    paths.fieldNames().asSequence().toList().sorted().forEach { pathValue ->
        val pathNode = paths.get(pathValue)
        val pathPointer = "/paths/${escapePointerSegment(pathValue)}"
        HTTP_METHODS.forEach { method ->
            val operationNode = pathNode.get(method) ?: return@forEach
            val operationPointer = "$pathPointer/$method"
            val operationId =
                operationNode.path("operationId").textOrNull() ?: synthesizedOperationId(method, pathValue)
            val operationSymbolId = "operation:$operationId"
            try {
                operations += adaptOperation(pathValue, method, pathNode, operationNode, operationPointer)
            } catch (cancellation: CancellationException) {
                throw cancellation
            } catch (failure: CanonicalExtensionAdaptationException) {
                addDiagnostic(
                    code = DiagnosticCode.INVALID_CANONICAL_EXTENSION,
                    message = failure.message.orEmpty(),
                    remediation = "Correct the canonical extension to match its published schema.",
                    phase = DiagnosticPhase.ADAPTATION,
                    // The pointer may name a required-but-absent field, which has no recorded location.
                    source = rootDocument.sourceNearest(failure.pointer),
                    relatedSymbolId = operationSymbolId,
                )
            } catch (failure: Throwable) {
                addDiagnostic(
                    code = DiagnosticCode.OPERATION_ADAPTATION_FAILED,
                    message = "Operation ${method.uppercase()} $pathValue could not be adapted: ${failure.message}",
                    source = rootDocument.source(operationPointer),
                    relatedSymbolId = operationSymbolId,
                )
            }
        }
    }
    return operations
}

private fun AdaptationContext.diagnoseMisplacedCanonicalExtensions(root: JsonNode) {
    fun visit(
        node: JsonNode,
        pointer: String,
    ) {
        when {
            node.isObject -> {
                node.properties().asSequence().toList().sortedBy { it.key }.forEach { (name, value) ->
                    val childPointer = "$pointer/${escapePointerSegment(name)}"
                    when {
                        name in CANONICAL_OPERATION_EXTENSIONS && !isDirectOperationExtension(childPointer) -> {
                            addDiagnostic(
                                code = DiagnosticCode.INVALID_CANONICAL_EXTENSION,
                                message =
                                    "Invalid canonical extension at $childPointer: " +
                                        "is only allowed as a direct property of an OpenAPI Operation Object",
                                remediation = "Move the canonical extension directly onto an OpenAPI Operation Object.",
                                phase = DiagnosticPhase.ADAPTATION,
                                source = rootDocument.source(childPointer),
                                relatedSymbolId = operationSymbolId(root, childPointer),
                            )
                        }

                        name.startsWith("x-") -> {
                            Unit
                        }

                        else -> {
                            visit(value, childPointer)
                        }
                    }
                }
            }

            node.isArray -> {
                node.forEachIndexed { index, value -> visit(value, "$pointer/$index") }
            }
        }
    }

    visit(root, "")
}

private fun operationSymbolId(
    root: JsonNode,
    pointer: String,
): String? {
    val segments = pointer.split('/')
    if (segments.size < 4 || segments[1] != "paths" || segments[3].lowercase() !in HTTP_METHODS) return null
    val operationPointer = segments.take(4).joinToString("/")
    val operation = root.at(operationPointer)
    if (operation.isMissingNode || !operation.isObject) return null
    val pathValue = segments[2]
    val method = segments[3].lowercase()
    val operationId = operation.path("operationId").textOrNull() ?: synthesizedOperationId(method, pathValue)
    return "operation:$operationId"
}

private fun AdaptationContext.adaptOperation(
    pathValue: String,
    method: String,
    pathNode: JsonNode,
    node: JsonNode,
    pointer: String,
): OperationModel {
    val inheritedParameters = pathNode.get("parameters")?.takeIf(JsonNode::isArray).orEmptyNodes()
    val operationParameters = node.get("parameters")?.takeIf(JsonNode::isArray).orEmptyNodes()
    val parameters =
        (
            inheritedParameters.mapIndexed { index, parameter ->
                adaptParameter(parameter, "${pointer.substringBeforeLast('/')}/parameters/$index")
            } +
                operationParameters.mapIndexed { index, parameter ->
                    adaptParameter(parameter, "$pointer/parameters/$index")
                }
        ).sortedWith(compareBy(ParameterModel::location, ParameterModel::name))

    val requestBody =
        node.get("requestBody")?.let { body ->
            adaptRequestBody(body, "$pointer/requestBody")
        }
    val responses =
        node
            .get("responses")
            ?.takeIf(JsonNode::isObject)
            ?.fieldNames()
            ?.asSequence()
            ?.toList()
            .orEmpty()
            .sorted()
            .map { selector ->
                adaptResponse(
                    selector,
                    node.path("responses").get(selector),
                    "$pointer/responses/${escapePointerSegment(selector)}",
                )
            }
    val securityNode = if (node.has("security")) node.get("security") else rootDocument.root.get("security")
    val securityPointer = if (node.has("security")) "$pointer/security" else "/security"
    val pagination = node.get("x-sdkgen-pagination")?.let { adaptPagination(it, "$pointer/x-sdkgen-pagination") }
    val streaming = node.get("x-sdkgen-streaming")?.let { adaptStreaming(it, "$pointer/x-sdkgen-streaming") }
    val idempotency = node.get("x-sdkgen-idempotency")?.let { adaptIdempotency(it, "$pointer/x-sdkgen-idempotency") }
    val tags =
        node
            .get("tags")
            ?.takeIf(JsonNode::isArray)
            ?.mapNotNull(JsonNode::textOrNull)
            ?.filter(String::isNotBlank)
            .orEmpty()
    return OperationModel(
        operationId = node.path("operationId").textOrNull() ?: synthesizedOperationId(method, pathValue),
        method = method.uppercase(),
        path = pathValue,
        description = node.path("description").textOrNull() ?: node.path("summary").textOrNull(),
        deprecated = node.path("deprecated").booleanOrFalse(),
        parameters = parameters,
        requestBody = requestBody,
        responses = responses,
        securityAlternatives = adaptSecurity(securityNode, rootDocument, securityPointer),
        pagination = pagination,
        streaming = streaming,
        idempotency = idempotency,
        extensions = node.nonCanonicalExtensions(),
        source = rootDocument.source(pointer),
        tags = tags,
    )
}

private fun AdaptationContext.adaptParameter(
    node: JsonNode,
    pointer: String,
): ParameterModel {
    val located = locateGeneric(rootDocument, pointer, node)
    val resolvedNode = located.node
    if (resolvedNode.has("schema") && resolvedNode.has("content")) {
        addDiagnostic(
            code = DiagnosticCode.AMBIGUOUS_PARAMETER_SCHEMA_AND_CONTENT,
            message = "Parameter '${resolvedNode.path("name").asText()}' defines both schema and content.",
            remediation = "Keep exactly one of 'schema' or 'content' on the parameter.",
            phase = DiagnosticPhase.ADAPTATION,
            source = located.document.source(located.pointer),
        )
    }
    val location =
        when (resolvedNode.path("in").asText()) {
            "path" -> ParameterLocation.PATH
            "header" -> ParameterLocation.HEADER
            "cookie" -> ParameterLocation.COOKIE
            else -> ParameterLocation.QUERY
        }
    val style =
        resolvedNode.path("style").textOrNull() ?: when (location) {
            ParameterLocation.PATH, ParameterLocation.HEADER -> "simple"
            ParameterLocation.QUERY, ParameterLocation.COOKIE -> "form"
        }
    val explode =
        resolvedNode.get("explode")?.takeIf(JsonNode::isBoolean)?.booleanValue()
            ?: (style == "form")
    val parameterName = resolvedNode.path("name").asText()
    val schemaNode = resolvedNode.get("schema")
    val schema =
        schemaNode?.let {
            adaptSchemaUse(located.document, "${located.pointer}/schema", it)
        }
    if (resolvedNode.has("content")) {
        addDiagnostic(
            code = DiagnosticCode.UNSUPPORTED_PARAMETER_CONTENT_SERIALIZATION,
            message = "Parameter '$parameterName' uses content-based serialization, which is not supported.",
            remediation = "Use a schema-based parameter with a supported style and explode combination.",
            severity = DiagnosticSeverity.WARNING,
            phase = DiagnosticPhase.ADAPTATION,
            source = located.document.source("${located.pointer}/content"),
        )
    }
    val parameterSerializationDiagnostic =
        schema?.let {
            parameterSerializationDiagnostic(location, style, explode, it)
        }
    if (style !in SUPPORTED_PARAMETER_STYLES) {
        addDiagnostic(
            code = DiagnosticCode.UNSUPPORTED_PARAMETER_STYLE,
            message = "Parameter '$parameterName' uses unsupported style '$style'.",
            remediation = "Use simple, form, or deepObject serialization where supported by the parameter location.",
            severity = DiagnosticSeverity.WARNING,
            phase = DiagnosticPhase.ADAPTATION,
            source = located.document.source("${located.pointer}/style"),
        )
    } else {
        when (parameterSerializationDiagnostic) {
            ParameterSerializationDiagnostic.STRIPE_COMPATIBLE -> {
                addDiagnostic(
                    code = DiagnosticCode.NON_STANDARD_PARAMETER_SERIALIZATION_EXTENSION,
                    message =
                        "Parameter '$parameterName' uses a non-standard Stripe-compatible deepObject extension " +
                            "for bracket-indexed arrays or ordinary scalar query pairs.",
                    remediation = "Prefer standard form serialization for portable OpenAPI documents.",
                    severity = DiagnosticSeverity.WARNING,
                    phase = DiagnosticPhase.ADAPTATION,
                    source = located.document.source("${located.pointer}/schema"),
                )
            }

            ParameterSerializationDiagnostic.UNSUPPORTED_LOCATION_OR_EXPLODE -> {
                addDiagnostic(
                    code = DiagnosticCode.UNSUPPORTED_PARAMETER_STYLE,
                    message =
                        "Parameter '$parameterName' uses deepObject serialization outside the supported " +
                            "query/explode=true combination.",
                    remediation = "Use deepObject only for query parameters with explode=true.",
                    severity = DiagnosticSeverity.WARNING,
                    phase = DiagnosticPhase.ADAPTATION,
                    source = located.document.source("${located.pointer}/style"),
                )
            }

            ParameterSerializationDiagnostic.UNSUPPORTED_SCHEMA_KIND -> {
                addDiagnostic(
                    code = DiagnosticCode.UNSUPPORTED_PARAMETER_STYLE_SCHEMA_KIND,
                    message = "Parameter '$parameterName' uses deepObject serialization with an unsupported schema.",
                    remediation =
                        "Use deepObject with a flat object schema, a primitive array, or a scalar-compatible " +
                            "anyOf branch.",
                    severity = DiagnosticSeverity.WARNING,
                    phase = DiagnosticPhase.ADAPTATION,
                    source = located.document.source("${located.pointer}/schema"),
                )
            }

            null -> {
                Unit
            }
        }
    }
    return ParameterModel(
        name = parameterName,
        location = location,
        requiredness =
            if (resolvedNode
                    .path(
                        "required",
                    ).booleanOrFalse()
            ) {
                Requiredness.REQUIRED
            } else {
                Requiredness.OPTIONAL
            },
        style = style,
        explode = explode,
        schema = schema,
        content = adaptContent(resolvedNode.get("content"), "${located.pointer}/content", located.document),
        description = resolvedNode.path("description").textOrNull(),
        deprecated = resolvedNode.path("deprecated").booleanOrFalse(),
        examples = resolvedNode.get("examples").namedJsonValues(),
        extensions = resolvedNode.nonCanonicalExtensions(),
        source = rootDocument.source(pointer),
    )
}

private val SUPPORTED_PARAMETER_STYLES = setOf("simple", "form", "deepObject")
private val PRIMITIVE_PARAMETER_SCHEMA_TYPES = setOf("string", "integer", "number", "boolean")

private enum class ParameterSerializationDiagnostic {
    STRIPE_COMPATIBLE,
    UNSUPPORTED_LOCATION_OR_EXPLODE,
    UNSUPPORTED_SCHEMA_KIND,
}

private fun AdaptationContext.parameterSerializationDiagnostic(
    location: ParameterLocation,
    style: String,
    explode: Boolean,
    schemaRef: SchemaRef,
): ParameterSerializationDiagnostic? {
    val schema = resolveSchema(schemaRef) ?: return null
    if (style != "deepObject") return null
    if (location != ParameterLocation.QUERY || !explode) {
        return ParameterSerializationDiagnostic.UNSUPPORTED_LOCATION_OR_EXPLODE
    }
    if (isPrimitiveParameterArray(schema) ||
        isPrimitiveParameterSchema(schema) ||
        hasStripeCompatibleDeepObjectScalarBranch(schema)
    ) {
        return ParameterSerializationDiagnostic.STRIPE_COMPATIBLE
    }
    return if (!isFormObject(schema)) {
        ParameterSerializationDiagnostic.UNSUPPORTED_SCHEMA_KIND
    } else {
        null
    }
}

private fun AdaptationContext.resolveSchema(schemaRef: SchemaRef): SchemaModel? {
    var current = schemas[schemaRef.schemaId] ?: return null
    val visited = mutableSetOf(current.id)
    while (true) {
        val targetId = current.referenceTarget ?: break
        if (!visited.add(targetId)) break
        current = schemas[targetId] ?: return null
    }
    return current
}

private fun AdaptationContext.isPrimitiveParameterArray(schema: SchemaModel): Boolean =
    schema.items?.let(::resolveSchema)?.let(::isPrimitiveParameterSchema) == true

private fun isPrimitiveParameterSchema(schema: SchemaModel): Boolean {
    val types = schema.types.filterNot { type -> type == "null" }.distinct()
    return types.size == 1 &&
        types.single() in PRIMITIVE_PARAMETER_SCHEMA_TYPES &&
        schema.items == null &&
        schema.properties.isEmpty() &&
        schema.additionalProperties == null &&
        schema.compositions.isEmpty()
}

private fun AdaptationContext.hasStripeCompatibleDeepObjectScalarBranch(schema: SchemaModel): Boolean {
    val composition = schema.compositions.singleOrNull { item -> item.kind == CompositionKind.ANY_OF } ?: return false
    if (schema.compositions.size != 1) return false
    return composition.branches.any { branch ->
        resolveSchema(branch)?.let(::isPrimitiveParameterSchema) == true
    }
}

private fun isFormObject(schema: SchemaModel): Boolean =
    "object" in schema.types || schema.properties.isNotEmpty() ||
        schema.compositions.any { composition -> composition.kind == CompositionKind.ALL_OF }

private fun AdaptationContext.adaptRequestBody(
    node: JsonNode,
    pointer: String,
): RequestBodyModel {
    val located = locateGeneric(rootDocument, pointer, node)
    val resolvedNode = located.node
    return RequestBodyModel(
        requiredness =
            if (resolvedNode
                    .path(
                        "required",
                    ).booleanOrFalse()
            ) {
                Requiredness.REQUIRED
            } else {
                Requiredness.OPTIONAL
            },
        description = resolvedNode.path("description").textOrNull(),
        content = adaptContent(resolvedNode.get("content"), "${located.pointer}/content", located.document),
        extensions = resolvedNode.nonCanonicalExtensions(),
        source = rootDocument.source(pointer),
    )
}

private fun AdaptationContext.adaptResponse(
    selector: String,
    node: JsonNode,
    pointer: String,
): ResponseModel {
    val located = locateGeneric(rootDocument, pointer, node)
    val resolvedNode = located.node
    val headers =
        resolvedNode
            .get("headers")
            ?.takeIf(JsonNode::isObject)
            ?.fieldNames()
            ?.asSequence()
            ?.toList()
            .orEmpty()
            .sorted()
            .map { name ->
                val targetHeaderPointer = "${located.pointer}/headers/${escapePointerSegment(name)}"
                val headerLocated =
                    locateGeneric(located.document, targetHeaderPointer, resolvedNode.path("headers").get(name))
                val headerNode = headerLocated.node
                HeaderModel(
                    name = name,
                    requiredness =
                        if (headerNode
                                .path(
                                    "required",
                                ).booleanOrFalse()
                        ) {
                            Requiredness.REQUIRED
                        } else {
                            Requiredness.OPTIONAL
                        },
                    schema =
                        headerNode.get("schema")?.let {
                            adaptSchemaUse(headerLocated.document, "${headerLocated.pointer}/schema", it)
                        },
                    description = headerNode.path("description").textOrNull(),
                    deprecated = headerNode.path("deprecated").booleanOrFalse(),
                    extensions = headerNode.nonCanonicalExtensions(),
                    source = headerLocated.document.source(headerLocated.pointer),
                )
            }
    return ResponseModel(
        selector = selector,
        selectorKind =
            when {
                selector.equals("default", ignoreCase = true) -> StatusSelectorKind.DEFAULT
                selector.matches(Regex("[1-5]XX", RegexOption.IGNORE_CASE)) -> StatusSelectorKind.RANGE
                else -> StatusSelectorKind.EXACT
            },
        description = resolvedNode.path("description").textOrNull(),
        content = adaptContent(resolvedNode.get("content"), "${located.pointer}/content", located.document),
        headers = headers,
        links = resolvedNode.get("links").namedJsonValues(),
        extensions = resolvedNode.nonCanonicalExtensions(),
        source = rootDocument.source(pointer),
    )
}

private fun AdaptationContext.adaptContent(
    node: JsonNode?,
    pointer: String,
    document: SourceDocument = rootDocument,
): List<MediaTypeModel> {
    if (node == null || !node.isObject) return emptyList()
    return node.fieldNames().asSequence().toList().sorted().map { mediaType ->
        val mediaPointer = "$pointer/${escapePointerSegment(mediaType)}"
        val mediaNode = node.get(mediaType)
        val encoding =
            mediaNode
                .get("encoding")
                ?.takeIf(JsonNode::isObject)
                ?.fieldNames()
                ?.asSequence()
                ?.toList()
                .orEmpty()
                .sorted()
                .map { partName ->
                    val encodingPointer = "$mediaPointer/encoding/${escapePointerSegment(partName)}"
                    val encodingNode = mediaNode.path("encoding").get(partName)
                    EncodingModel(
                        partName = partName,
                        contentType = encodingNode.path("contentType").textOrNull(),
                        headers = encodingNode.get("headers").namedJsonValues(),
                        extensions = encodingNode.nonCanonicalExtensions(),
                        source = document.source(encodingPointer),
                        style = encodingNode.path("style").textOrNull(),
                        explode = encodingNode.get("explode")?.takeIf(JsonNode::isBoolean)?.booleanValue(),
                        allowReserved =
                            encodingNode.get("allowReserved")?.takeIf(JsonNode::isBoolean)?.booleanValue(),
                    )
                }
        MediaTypeModel(
            mediaType = mediaType,
            schema = mediaNode.get("schema")?.let { adaptSchemaUse(document, "$mediaPointer/schema", it) },
            encoding = encoding,
            example = mediaNode.get("example")?.toJsonValue(),
            examples = mediaNode.get("examples").namedJsonValues(),
            extensions = mediaNode.nonCanonicalExtensions(),
            streaming =
                mediaType.equals("text/event-stream", true) ||
                    mediaType.equals("application/x-ndjson", true) ||
                    mediaType.equals("application/json-seq", true),
            source = document.source(mediaPointer),
        )
    }
}

internal fun AdaptationContext.adaptSecurity(
    node: JsonNode?,
    document: SourceDocument,
    pointer: String,
): List<SecurityRequirementModel> {
    if (node == null || !node.isArray) return emptyList()
    return node.mapIndexed { index, requirement ->
        val requirementPointer = "$pointer/$index"
        val schemes = TreeMap<String, List<String>>()
        if (requirement.isObject) {
            requirement.properties().forEach { (name, scopes) ->
                schemes[name] =
                    scopes
                        .takeIf(JsonNode::isArray)
                        ?.mapNotNull(JsonNode::textOrNull)
                        .orEmpty()
                        .sorted()
            }
        }
        SecurityRequirementModel(
            schemes = schemes,
            anonymous = schemes.isEmpty(),
            source = document.source(requirementPointer),
        )
    }
}

internal fun AdaptationContext.adaptSecuritySchemes(
    node: JsonNode?,
    document: SourceDocument,
    pointer: String,
): Map<String, SecuritySchemeModel> {
    if (node == null || !node.isObject) return emptyMap()
    return node
        .properties()
        .asSequence()
        .toList()
        .sortedBy { it.key }
        .mapNotNull { (name, rawScheme) ->
            val located = locateGeneric(document, "$pointer/${escapePointerSegment(name)}", rawScheme)
            val scheme = located.node
            val source = located.document.source(located.pointer)
            when (scheme.path("type").asText()) {
                "apiKey" -> {
                    val location =
                        when (scheme.path("in").asText()) {
                            "header" -> ParameterLocation.HEADER
                            "query" -> ParameterLocation.QUERY
                            "cookie" -> ParameterLocation.COOKIE
                            else -> null
                        }
                    location?.let {
                        name to
                            SecuritySchemeModel(
                                kind = SecuritySchemeKind.API_KEY,
                                parameterName = scheme.path("name").textOrNull(),
                                location = it,
                                source = source,
                            )
                    }
                }

                "http" -> {
                    name to
                        SecuritySchemeModel(
                            kind = SecuritySchemeKind.HTTP,
                            scheme = scheme.path("scheme").textOrNull(),
                            bearerFormat = scheme.path("bearerFormat").textOrNull(),
                            source = source,
                        )
                }

                "oauth2" -> {
                    name to SecuritySchemeModel(SecuritySchemeKind.OAUTH2, source = source)
                }

                "openIdConnect" -> {
                    name to
                        SecuritySchemeModel(
                            kind = SecuritySchemeKind.OPEN_ID_CONNECT,
                            openIdConnectUrl = scheme.path("openIdConnectUrl").textOrNull(),
                            source = source,
                        )
                }

                "mutualTLS" -> {
                    name to SecuritySchemeModel(SecuritySchemeKind.MUTUAL_TLS, source = source)
                }

                else -> {
                    null
                }
            }
        }.toMap()
}

private fun AdaptationContext.locateGeneric(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): LocatedNode {
    val rawReference = node.get("\$ref")?.textOrNull() ?: return LocatedNode(document, pointer, node)
    val target = repository.resolveReference(document.canonicalUri, rawReference)
    return LocatedNode(target.document, target.pointer, target.document.root.at(target.pointer))
}

private class CanonicalExtensionAdaptationException(
    val pointer: String,
    reason: String,
) : IllegalArgumentException("Invalid canonical extension at $pointer: $reason")

private fun adaptPagination(
    node: JsonNode,
    pointer: String,
): PaginationModel {
    requireExtensionObject(node, pointer)
    return when (val style = requireExtensionString(node, pointer, "style")) {
        "cursor" -> {
            adaptCursorPagination(node, pointer)
        }

        "headerNextUrl" -> {
            adaptHeaderNextUrlPagination(node, pointer)
        }

        "offsetLimit" -> {
            adaptOffsetLimitPagination(node, pointer)
        }

        else -> {
            invalidExtension(
                "$pointer/style",
                "must equal 'cursor', 'headerNextUrl', or 'offsetLimit', was '$style'",
            )
        }
    }
}

private fun adaptCursorPagination(
    node: JsonNode,
    pointer: String,
): PaginationModel.Cursor {
    requireExtensionFields(
        node,
        pointer,
        setOf("style", "requestCursor", "requestLimit", "responseItems", "responseNextCursor"),
    )
    requireExtensionConstant(node, pointer, "style", "cursor")
    return PaginationModel.Cursor(
        requestCursor = requireExtensionString(node, pointer, "requestCursor"),
        requestLimit = optionalExtensionString(node, pointer, "requestLimit"),
        responseItems = requireJsonPointer(node, pointer, "responseItems"),
        responseNextCursor = requireJsonPointer(node, pointer, "responseNextCursor"),
    )
}

private fun adaptHeaderNextUrlPagination(
    node: JsonNode,
    pointer: String,
): PaginationModel.HeaderNextUrl {
    requireExtensionFields(node, pointer, setOf("style", "responseItems"))
    requireExtensionConstant(node, pointer, "style", "headerNextUrl")
    return PaginationModel.HeaderNextUrl(
        responseItems = requireJsonPointer(node, pointer, "responseItems"),
    )
}

private fun adaptOffsetLimitPagination(
    node: JsonNode,
    pointer: String,
): PaginationModel.OffsetLimit {
    requireExtensionFields(
        node,
        pointer,
        setOf("style", "requestOffset", "requestLimit", "responseItems", "responseTotal"),
    )
    requireExtensionConstant(node, pointer, "style", "offsetLimit")
    return PaginationModel.OffsetLimit(
        requestOffset = requireExtensionString(node, pointer, "requestOffset"),
        requestLimit = requireExtensionString(node, pointer, "requestLimit"),
        responseItems = requireJsonPointer(node, pointer, "responseItems"),
        responseTotal = optionalJsonPointer(node, pointer, "responseTotal"),
    )
}

private fun adaptStreaming(
    node: JsonNode,
    pointer: String,
): StreamingModel.Sse {
    requireExtensionObject(node, pointer)
    requireExtensionFields(node, pointer, setOf("mode", "requestFlag", "responseContentType", "sentinel"))
    requireExtensionConstant(node, pointer, "mode", "sse")
    requireExtensionConstant(node, pointer, "responseContentType", "text/event-stream")
    return StreamingModel.Sse(
        requestFlag = optionalExtensionString(node, pointer, "requestFlag"),
        responseContentType = "text/event-stream",
        sentinel = optionalExtensionString(node, pointer, "sentinel"),
    )
}

private fun adaptIdempotency(
    node: JsonNode,
    pointer: String,
): IdempotencyModel {
    requireExtensionObject(node, pointer)
    requireExtensionFields(node, pointer, setOf("keyHeader", "clientGenerated"))
    val clientGenerated = node.get("clientGenerated")
    if (clientGenerated == null || !clientGenerated.isBoolean || !clientGenerated.booleanValue()) {
        invalidExtension("$pointer/clientGenerated", "must equal true")
    }
    return IdempotencyModel(
        keyHeader = requireExtensionString(node, pointer, "keyHeader"),
        clientGenerated = true,
    )
}

private fun requireExtensionObject(
    node: JsonNode,
    pointer: String,
) {
    if (!node.isObject) invalidExtension(pointer, "must be an object")
}

private fun requireExtensionFields(
    node: JsonNode,
    pointer: String,
    allowed: Set<String>,
) {
    node.fieldNames().asSequence().filterNot(allowed::contains).sorted().firstOrNull()?.let { field ->
        invalidExtension("$pointer/${escapePointerSegment(field)}", "is not a supported field")
    }
}

private fun requireExtensionConstant(
    node: JsonNode,
    pointer: String,
    field: String,
    expected: String,
) {
    val value = requireExtensionString(node, pointer, field)
    if (value != expected) invalidExtension("$pointer/$field", "must equal '$expected'")
}

private fun optionalExtensionString(
    node: JsonNode,
    pointer: String,
    field: String,
): String? = if (node.has(field)) requireExtensionString(node, pointer, field) else null

private fun requireExtensionString(
    node: JsonNode,
    pointer: String,
    field: String,
): String {
    val fieldPointer = "$pointer/$field"
    val value = node.get(field) ?: invalidExtension(fieldPointer, "is required")
    if (!value.isTextual || value.textValue().isEmpty()) {
        invalidExtension(fieldPointer, "must be a non-empty string")
    }
    return value.textValue()
}

private fun optionalJsonPointer(
    node: JsonNode,
    pointer: String,
    field: String,
): JsonPointer? = if (node.has(field)) requireJsonPointer(node, pointer, field) else null

private fun requireJsonPointer(
    node: JsonNode,
    pointer: String,
    field: String,
): JsonPointer {
    val fieldPointer = "$pointer/$field"
    val value = requireExtensionString(node, pointer, field)
    if (!value.startsWith('/')) invalidExtension(fieldPointer, "must be a JSON Pointer beginning with '/'")
    return try {
        JsonPointer(value)
    } catch (_: IllegalArgumentException) {
        invalidExtension(fieldPointer, "must contain only valid JSON Pointer escapes '~0' and '~1'")
    }
}

private fun invalidExtension(
    pointer: String,
    reason: String,
): Nothing = throw CanonicalExtensionAdaptationException(pointer, reason)

private fun synthesizedOperationId(
    method: String,
    path: String,
): String =
    method.lowercase() +
        path.split('/').filter(String::isNotBlank).joinToString("") { segment ->
            segment
                .trim('{', '}')
                .replace(Regex("[^A-Za-z0-9]+"), " ")
                .split(' ')
                .filter(String::isNotBlank)
                .joinToString("") { token -> token.replaceFirstChar(Char::uppercase) }
        }
