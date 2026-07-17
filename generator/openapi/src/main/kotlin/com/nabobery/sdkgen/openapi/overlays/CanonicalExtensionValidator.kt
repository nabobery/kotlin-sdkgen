package com.nabobery.sdkgen.openapi.overlays

import com.fasterxml.jackson.databind.JsonNode

internal class CanonicalExtensionValidator {
    fun validate(document: JsonNode) {
        validateNode(document, "")
    }

    private fun validateNode(
        node: JsonNode,
        pointer: String,
    ) {
        if (node.isObject) {
            node.properties().forEach { (name, value) ->
                val childPointer = JsonPointerSupport.child(pointer, name)
                if (name.startsWith("x-sdkgen-")) validateExtension(name, value, childPointer)
                validateNode(value, childPointer)
            }
        } else if (node.isArray) {
            node.forEachIndexed { index, value -> validateNode(value, "$pointer/$index") }
        }
    }

    private fun validateExtension(
        name: String,
        value: JsonNode,
        pointer: String,
    ) {
        when (name) {
            "x-sdkgen-streaming" -> validateStreaming(value, pointer)
            "x-sdkgen-pagination" -> validatePagination(value, pointer)
            else -> throw ExtensionValidationException("Unknown SDKGen extension '$name' at $pointer")
        }
    }

    private fun validateStreaming(
        value: JsonNode,
        pointer: String,
    ) {
        requireObject(value, pointer)
        requireAllowedFields(value, pointer, setOf("mode", "requestFlag", "responseContentType", "sentinel"))
        requireConstant(value, pointer, "mode", "sse")
        requireConstant(value, pointer, "responseContentType", "text/event-stream")
        requireOptionalNonEmptyString(value, pointer, "requestFlag")
        requireOptionalNonEmptyString(value, pointer, "sentinel")
    }

    private fun validatePagination(
        value: JsonNode,
        pointer: String,
    ) {
        requireObject(value, pointer)
        requireAllowedFields(
            value,
            pointer,
            setOf("style", "requestCursor", "requestLimit", "responseItems", "responseNextCursor"),
        )
        requireConstant(value, pointer, "style", "cursor")
        requireNonEmptyString(value, pointer, "requestCursor")
        requireOptionalNonEmptyString(value, pointer, "requestLimit")
        requirePointer(value, pointer, "responseItems")
        requirePointer(value, pointer, "responseNextCursor")
    }

    private fun requireObject(
        value: JsonNode,
        pointer: String,
    ) {
        if (!value.isObject) invalid(pointer, "must be an object")
    }

    private fun requireAllowedFields(
        value: JsonNode,
        pointer: String,
        allowed: Set<String>,
    ) {
        value
            .properties()
            .map { property ->
                property.key
            }.filterNot(allowed::contains)
            .sorted()
            .firstOrNull()
            ?.let { field ->
                invalid(JsonPointerSupport.child(pointer, field), "is not a supported field")
            }
    }

    private fun requireConstant(
        value: JsonNode,
        pointer: String,
        field: String,
        expected: String,
    ) {
        val fieldPointer = JsonPointerSupport.child(pointer, field)
        val actual = value.get(field) ?: invalid(fieldPointer, "is required")
        if (!actual.isTextual || actual.textValue() != expected) {
            invalid(fieldPointer, "must equal '$expected'")
        }
    }

    private fun requireOptionalNonEmptyString(
        value: JsonNode,
        pointer: String,
        field: String,
    ) {
        if (value.has(field)) requireNonEmptyString(value, pointer, field)
    }

    private fun requireNonEmptyString(
        value: JsonNode,
        pointer: String,
        field: String,
    ) {
        val fieldPointer = JsonPointerSupport.child(pointer, field)
        val actual = value.get(field) ?: invalid(fieldPointer, "is required")
        if (!actual.isTextual || actual.textValue().isEmpty()) {
            invalid(fieldPointer, "must be a non-empty string")
        }
    }

    private fun requirePointer(
        value: JsonNode,
        pointer: String,
        field: String,
    ) {
        val fieldPointer = JsonPointerSupport.child(pointer, field)
        val actual = value.get(field) ?: invalid(fieldPointer, "is required")
        if (!actual.isTextual || !actual.textValue().startsWith('/')) {
            invalid(fieldPointer, "must be a JSON Pointer beginning with '/'")
        }
    }

    private fun invalid(
        pointer: String,
        reason: String,
    ): Nothing = throw ExtensionValidationException("Invalid SDKGen extension at $pointer: $reason")
}
