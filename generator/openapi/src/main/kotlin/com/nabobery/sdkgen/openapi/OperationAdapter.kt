@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.fasterxml.jackson.databind.JsonNode
import com.nabobery.sdkgen.model.DiagnosticCode
import com.nabobery.sdkgen.model.DiagnosticPhase
import com.nabobery.sdkgen.model.EncodingModel
import com.nabobery.sdkgen.model.HeaderModel
import com.nabobery.sdkgen.model.MediaTypeModel
import com.nabobery.sdkgen.model.OperationModel
import com.nabobery.sdkgen.model.ParameterLocation
import com.nabobery.sdkgen.model.ParameterModel
import com.nabobery.sdkgen.model.RequestBodyModel
import com.nabobery.sdkgen.model.Requiredness
import com.nabobery.sdkgen.model.ResponseModel
import com.nabobery.sdkgen.model.SecurityRequirementModel
import com.nabobery.sdkgen.model.StatusSelectorKind
import java.util.TreeMap
import kotlin.coroutines.cancellation.CancellationException

internal val HTTP_METHODS = listOf("delete", "get", "head", "options", "patch", "post", "put", "trace")

private data class LocatedNode(
    val document: SourceDocument,
    val pointer: String,
    val node: JsonNode,
)

internal fun AdaptationContext.adaptOperations(root: JsonNode): List<OperationModel> {
    val paths = root.get("paths") ?: return emptyList()
    if (!paths.isObject) return emptyList()
    val operations = mutableListOf<OperationModel>()
    paths.fieldNames().asSequence().toList().sorted().forEach { pathValue ->
        val pathNode = paths.get(pathValue)
        val pathPointer = "/paths/${escapePointerSegment(pathValue)}"
        HTTP_METHODS.forEach { method ->
            val operationNode = pathNode.get(method) ?: return@forEach
            val operationPointer = "$pathPointer/$method"
            try {
                operations += adaptOperation(pathValue, method, pathNode, operationNode, operationPointer)
            } catch (cancellation: CancellationException) {
                throw cancellation
            } catch (failure: Throwable) {
                addDiagnostic(
                    code = DiagnosticCode.OPERATION_ADAPTATION_FAILED,
                    message = "Operation ${method.uppercase()} $pathValue could not be adapted: ${failure.message}",
                    source = rootDocument.source(operationPointer),
                )
            }
        }
    }
    return operations
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
        extensions = node.extensions(),
        source = rootDocument.source(pointer),
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
    return ParameterModel(
        name = resolvedNode.path("name").asText(),
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
        schema =
            resolvedNode.get("schema")?.let {
                adaptSchemaUse(located.document, "${located.pointer}/schema", it)
            },
        content = adaptContent(resolvedNode.get("content"), "${located.pointer}/content", located.document),
        description = resolvedNode.path("description").textOrNull(),
        deprecated = resolvedNode.path("deprecated").booleanOrFalse(),
        examples = resolvedNode.get("examples").namedJsonValues(),
        extensions = resolvedNode.extensions(),
        source = rootDocument.source(pointer),
    )
}

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
        extensions = resolvedNode.extensions(),
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
                    extensions = headerNode.extensions(),
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
        extensions = resolvedNode.extensions(),
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
                        extensions = encodingNode.extensions(),
                        source = document.source(encodingPointer),
                    )
                }
        MediaTypeModel(
            mediaType = mediaType,
            schema = mediaNode.get("schema")?.let { adaptSchemaUse(document, "$mediaPointer/schema", it) },
            encoding = encoding,
            example = mediaNode.get("example")?.toJsonValue(),
            examples = mediaNode.get("examples").namedJsonValues(),
            extensions = mediaNode.extensions(),
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

private fun AdaptationContext.locateGeneric(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): LocatedNode {
    val rawReference = node.get("\$ref")?.textOrNull() ?: return LocatedNode(document, pointer, node)
    val target = repository.resolveReference(document.canonicalUri, rawReference)
    return LocatedNode(target.document, target.pointer, target.document.root.at(target.pointer))
}

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
