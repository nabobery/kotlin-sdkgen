package com.nabobery.sdkgen.openapi

import com.fasterxml.jackson.databind.JsonNode
import com.nabobery.sdkgen.model.JsonPointer

internal val CANONICAL_OPERATION_EXTENSIONS =
    setOf(
        "x-sdkgen-idempotency",
        "x-sdkgen-pagination",
        "x-sdkgen-streaming",
    )

internal val CANONICAL_SCHEMA_EXTENSIONS =
    setOf("x-sdkgen-allof-resolution")

internal fun isDirectOperationExtension(pointer: String): Boolean {
    val segments = JsonPointer(pointer).segments
    return segments.size == 4 &&
        segments[0] == "paths" &&
        segments[2] in HTTP_METHODS &&
        segments[3] in CANONICAL_OPERATION_EXTENSIONS
}

private val SINGLE_SUBSCHEMA_KEYWORDS =
    listOf(
        "items",
        "additionalProperties",
        "not",
        "propertyNames",
        "if",
        "then",
        "else",
        "contains",
        "unevaluatedProperties",
        "unevaluatedItems",
        "contentSchema",
    )

private val MAP_SUBSCHEMA_KEYWORDS =
    listOf("properties", "patternProperties", "dependentSchemas", "\$defs", "definitions")

private val ARRAY_SUBSCHEMA_KEYWORDS =
    listOf("allOf", "anyOf", "oneOf", "prefixItems")

/**
 * Collects the JSON Pointers of every OpenAPI Schema Object reachable in [root] by descending the
 * fixed OpenAPI 3.1 object graph — component schemas (and `$defs`/`definitions`), parameter, header
 * and media-type `schema`s, callbacks (inline and `components.callbacks`), `components.pathItems`,
 * Encoding Object header schemas, and every JSON Schema subschema keyword (including
 * `contentSchema`) — rather than inferring schema
 * identity from the incidental presence of an `allOf`-named field. Canonical schema-extension
 * placement validation ([CANONICAL_SCHEMA_EXTENSIONS]) consults this set so a canonical schema
 * extension is only accepted when its parent object is genuinely a Schema Object; an Operation
 * Object that merely declares `allOf: []`, an example payload, or any other non-schema node is not a
 * member. Only the literal document structure is walked here — `$ref`s are text and are never
 * followed, so the walk always terminates.
 */
internal fun collectSchemaObjectPointers(root: JsonNode): Set<String> = SchemaObjectPointerWalker().walk(root)

/**
 * The recursive walk behind [collectSchemaObjectPointers]. A class rather than local functions because the
 * OpenAPI object graph is mutually recursive (a Header Object carries Media Type Objects whose Encoding
 * Objects carry Header Objects; a Callback Object carries Path Items whose operations carry callbacks).
 */
private class SchemaObjectPointerWalker {
    private val schemaPointers = mutableSetOf<String>()

    fun walk(root: JsonNode): Set<String> {
        root.get("paths")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (path, item) ->
            walkPathItem("/paths/${escapePointerSegment(path)}", item)
        }
        root.get("webhooks")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, item) ->
            walkPathItem("/webhooks/${escapePointerSegment(name)}", item)
        }
        root.get("components")?.takeIf(JsonNode::isObject)?.let { components ->
            components.get("schemas")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, schema) ->
                walkSchema("/components/schemas/${escapePointerSegment(name)}", schema)
            }
            components.get("parameters")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, parameter) ->
                walkParameterLike("/components/parameters/${escapePointerSegment(name)}", parameter)
            }
            components.get("headers")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, header) ->
                walkParameterLike("/components/headers/${escapePointerSegment(name)}", header)
            }
            components.get("requestBodies")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, body) ->
                walkMediaTypes("/components/requestBodies/${escapePointerSegment(name)}/content", body.get("content"))
            }
            components.get("responses")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, response) ->
                walkResponse("/components/responses/${escapePointerSegment(name)}", response)
            }
            components.get("callbacks")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, callback) ->
                walkCallback("/components/callbacks/${escapePointerSegment(name)}", callback)
            }
            components.get("pathItems")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, item) ->
                walkPathItem("/components/pathItems/${escapePointerSegment(name)}", item)
            }
        }
        return schemaPointers
    }

    private fun walkSchema(
        pointer: String,
        node: JsonNode,
    ) {
        if (!node.isObject) return
        schemaPointers += pointer
        SINGLE_SUBSCHEMA_KEYWORDS.forEach { keyword ->
            node.get(keyword)?.takeIf(JsonNode::isObject)?.let { child ->
                walkSchema("$pointer/${escapePointerSegment(keyword)}", child)
            }
        }
        MAP_SUBSCHEMA_KEYWORDS.forEach { keyword ->
            node.get(keyword)?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, child) ->
                walkSchema("$pointer/${escapePointerSegment(keyword)}/${escapePointerSegment(name)}", child)
            }
        }
        ARRAY_SUBSCHEMA_KEYWORDS.forEach { keyword ->
            node.get(keyword)?.takeIf(JsonNode::isArray)?.forEachIndexed { index, child ->
                walkSchema("$pointer/$keyword/$index", child)
            }
        }
    }

    private fun walkParameterLike(
        pointer: String,
        node: JsonNode,
    ) {
        if (!node.isObject) return
        node.get("schema")?.takeIf(JsonNode::isObject)?.let { schema -> walkSchema("$pointer/schema", schema) }
        walkMediaTypes("$pointer/content", node.get("content"))
    }

    private fun walkMediaTypes(
        pointer: String,
        node: JsonNode?,
    ) {
        node?.takeIf(JsonNode::isObject)?.properties()?.forEach { (mediaType, media) ->
            media.get("schema")?.takeIf(JsonNode::isObject)?.let { schema ->
                walkSchema("$pointer/${escapePointerSegment(mediaType)}/schema", schema)
            }
            // Encoding Object headers are Header Objects, each carrying its own `schema`/`content`.
            media.get("encoding")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (property, encoding) ->
                encoding.get("headers")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, header) ->
                    walkParameterLike(
                        "$pointer/${escapePointerSegment(mediaType)}/encoding/${escapePointerSegment(property)}" +
                            "/headers/${escapePointerSegment(name)}",
                        header,
                    )
                }
            }
        }
    }

    private fun walkParametersArray(
        pointer: String,
        node: JsonNode?,
    ) {
        node?.takeIf(JsonNode::isArray)?.forEachIndexed { index, parameter ->
            walkParameterLike("$pointer/$index", parameter)
        }
    }

    private fun walkResponse(
        pointer: String,
        node: JsonNode,
    ) {
        if (!node.isObject) return
        walkMediaTypes("$pointer/content", node.get("content"))
        node.get("headers")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, header) ->
            walkParameterLike("$pointer/headers/${escapePointerSegment(name)}", header)
        }
    }

    /** A Callback Object maps runtime expressions to Path Items. */
    private fun walkCallback(
        pointer: String,
        node: JsonNode,
    ) {
        if (!node.isObject) return
        node.properties().forEach { (expression, item) ->
            walkPathItem("$pointer/${escapePointerSegment(expression)}", item)
        }
    }

    private fun walkOperation(
        pointer: String,
        node: JsonNode,
    ) {
        if (!node.isObject) return
        walkParametersArray("$pointer/parameters", node.get("parameters"))
        node.get("requestBody")?.let { walkMediaTypes("$pointer/requestBody/content", it.get("content")) }
        node.get("responses")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (selector, response) ->
            walkResponse("$pointer/responses/${escapePointerSegment(selector)}", response)
        }
        node.get("callbacks")?.takeIf(JsonNode::isObject)?.properties()?.forEach { (name, callback) ->
            walkCallback("$pointer/callbacks/${escapePointerSegment(name)}", callback)
        }
    }

    private fun walkPathItem(
        pointer: String,
        node: JsonNode,
    ) {
        if (!node.isObject) return
        HTTP_METHODS.forEach { method ->
            node.get(method)?.let { walkOperation("$pointer/$method", it) }
        }
        walkParametersArray("$pointer/parameters", node.get("parameters"))
    }
}

internal fun JsonNode.nonCanonicalExtensions() =
    extensions() - CANONICAL_OPERATION_EXTENSIONS - CANONICAL_SCHEMA_EXTENSIONS

internal class CanonicalExtensionAdaptationException(
    val pointer: String,
    reason: String,
) : IllegalArgumentException("Invalid canonical extension at $pointer: $reason")
