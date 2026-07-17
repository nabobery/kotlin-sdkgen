@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.fasterxml.jackson.databind.JsonNode
import com.nabobery.sdkgen.model.JsonValue

internal val CONSTRAINT_FIELDS =
    sortedSetOf(
        "const",
        "exclusiveMaximum",
        "exclusiveMinimum",
        "maxItems",
        "maxLength",
        "maxProperties",
        "maximum",
        "minItems",
        "minLength",
        "minProperties",
        "minimum",
        "multipleOf",
        "pattern",
        "uniqueItems",
        "unevaluatedProperties",
    )

internal fun JsonNode?.typeNames(): List<String> =
    when {
        this == null -> emptyList()
        isTextual -> listOf(textValue())
        isArray -> mapNotNull(JsonNode::textOrNull)
        else -> emptyList()
    }

internal fun JsonNode.constraints(): Map<String, JsonValue> =
    CONSTRAINT_FIELDS.mapNotNull { field -> get(field)?.let { field to it.toJsonValue() } }.toMap()

internal fun JsonNode.examples(): List<JsonValue> =
    buildList {
        get("example")?.let { add(it.toJsonValue()) }
        get("examples")?.takeIf(JsonNode::isArray)?.forEach { add(it.toJsonValue()) }
    }

internal fun JsonNode.extensions(): Map<String, JsonValue> {
    if (!isObject) return emptyMap()
    return properties()
        .asSequence()
        .filter { (name, _) -> name.startsWith("x-") }
        .sortedBy { it.key }
        .associate { (name, value) -> name to value.toJsonValue() }
}

internal fun JsonNode?.namedJsonValues(): Map<String, JsonValue> {
    if (this == null || !isObject) return emptyMap()
    return properties()
        .asSequence()
        .toList()
        .sortedBy { it.key }
        .associate { (name, value) -> name to value.toJsonValue() }
}

internal fun JsonNode.toJsonValue(): JsonValue =
    when {
        isNull -> {
            JsonValue.Null
        }

        isBoolean -> {
            JsonValue.BooleanValue(booleanValue())
        }

        isNumber -> {
            JsonValue.NumberValue(asText())
        }

        isTextual -> {
            JsonValue.StringValue(textValue())
        }

        isArray -> {
            JsonValue.ArrayValue(map(JsonNode::toJsonValue))
        }

        isObject -> {
            JsonValue.ObjectValue(
                properties()
                    .asSequence()
                    .toList()
                    .sortedBy { it.key }
                    .associate { (name, value) -> name to value.toJsonValue() },
            )
        }

        else -> {
            JsonValue.StringValue(asText())
        }
    }

internal fun JsonNode?.textOrNull(): String? = this?.takeIf(JsonNode::isTextual)?.textValue()

internal fun JsonNode.booleanOrFalse(): Boolean = isBoolean && booleanValue()

internal fun JsonNode?.orEmptyNodes(): List<JsonNode> = this?.takeIf(JsonNode::isArray)?.toList().orEmpty()
