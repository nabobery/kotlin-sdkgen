package com.nabobery.sdkgen.openapi.overlays

import com.fasterxml.jackson.databind.JsonNode
import com.nabobery.sdkgen.model.JsonPointer
import com.nabobery.sdkgen.openapi.CANONICAL_OPERATION_EXTENSIONS
import com.nabobery.sdkgen.openapi.CANONICAL_SCHEMA_EXTENSIONS
import com.nabobery.sdkgen.openapi.collectSchemaObjectPointers
import com.nabobery.sdkgen.openapi.isDirectOperationExtension

internal class CanonicalExtensionValidator {
    fun validate(document: JsonNode) {
        validateNode(document, "", collectSchemaObjectPointers(document))
    }

    private fun validateNode(
        node: JsonNode,
        pointer: String,
        schemaPointers: Set<String>,
    ) {
        if (node.isObject) {
            node.properties().forEach { (name, value) ->
                val childPointer = JsonPointerSupport.child(pointer, name)
                when {
                    name in CANONICAL_OPERATION_EXTENSIONS -> {
                        if (!isDirectOperationExtension(childPointer)) {
                            invalid(
                                childPointer,
                                "is only allowed as a direct property of an OpenAPI Operation Object",
                            )
                        }
                        validateExtension(name, value, childPointer)
                    }

                    name in CANONICAL_SCHEMA_EXTENSIONS -> {
                        if (pointer !in schemaPointers || !node.path("allOf").isArray) {
                            invalid(
                                childPointer,
                                "is only allowed as a direct property of a Schema Object with allOf",
                            )
                        }
                        validateExtension(name, value, childPointer)
                    }

                    name.startsWith("x-sdkgen-") -> {
                        validateExtension(name, value, childPointer)
                    }

                    name.startsWith("x-") -> {
                        Unit
                    }

                    else -> {
                        validateNode(value, childPointer, schemaPointers)
                    }
                }
            }
        } else if (node.isArray) {
            node.forEachIndexed { index, value -> validateNode(value, "$pointer/$index", schemaPointers) }
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
            "x-sdkgen-idempotency" -> validateIdempotency(value, pointer)
            "x-sdkgen-allof-resolution" -> validateAllOfResolution(value, pointer)
            else -> throw ExtensionValidationException("Unknown SDKGen extension '$name' at $pointer")
        }
    }

    private fun validateStreaming(
        value: JsonNode,
        pointer: String,
    ) {
        requireObject(value, pointer)
        requireAllowedFields(
            value,
            pointer,
            setOf("mode", "requestFlag", "responseContentType", "sentinel", "payloadProperty"),
        )
        requireConstant(value, pointer, "mode", "sse")
        requireConstant(value, pointer, "responseContentType", "text/event-stream")
        requireOptionalNonEmptyString(value, pointer, "requestFlag")
        requireOptionalNonEmptyString(value, pointer, "sentinel")
        requireOptionalNonEmptyString(value, pointer, "payloadProperty")
    }

    private fun validatePagination(
        value: JsonNode,
        pointer: String,
    ) {
        requireObject(value, pointer)
        val stylePointer = JsonPointerSupport.child(pointer, "style")
        val style = value.get("style") ?: invalid(stylePointer, "is required")
        when (style.takeIf(JsonNode::isTextual)?.textValue()) {
            "cursor" -> validateCursorPagination(value, pointer)
            "headerNextUrl" -> validateHeaderNextUrlPagination(value, pointer)
            "offsetLimit" -> validateOffsetLimitPagination(value, pointer)
            else -> invalid(stylePointer, "must equal 'cursor', 'headerNextUrl', or 'offsetLimit'")
        }
    }

    private fun validateCursorPagination(
        value: JsonNode,
        pointer: String,
    ) {
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

    private fun validateHeaderNextUrlPagination(
        value: JsonNode,
        pointer: String,
    ) {
        requireAllowedFields(value, pointer, setOf("style", "responseItems"))
        requireConstant(value, pointer, "style", "headerNextUrl")
        requirePointer(value, pointer, "responseItems")
    }

    private fun validateOffsetLimitPagination(
        value: JsonNode,
        pointer: String,
    ) {
        requireAllowedFields(
            value,
            pointer,
            setOf("style", "requestOffset", "requestLimit", "responseItems", "responseTotal"),
        )
        requireConstant(value, pointer, "style", "offsetLimit")
        requireNonEmptyString(value, pointer, "requestOffset")
        requireNonEmptyString(value, pointer, "requestLimit")
        requirePointer(value, pointer, "responseItems")
        if (value.has("responseTotal")) requirePointer(value, pointer, "responseTotal")
    }

    private fun validateAllOfResolution(
        value: JsonNode,
        pointer: String,
    ) {
        requireObject(value, pointer)
        requireAllowedFields(value, pointer, setOf("properties"))
        val propertiesPointer = JsonPointerSupport.child(pointer, "properties")
        val properties = value.get("properties") ?: invalid(propertiesPointer, "is required")
        requireObject(properties, propertiesPointer)
        properties.properties().forEach { (propertyName, entry) ->
            val entryPointer = JsonPointerSupport.child(propertiesPointer, propertyName)
            requireObject(entry, entryPointer)
            requireAllowedFields(entry, entryPointer, setOf("strategy", "source"))
            requireConstant(entry, entryPointer, "strategy", "unionSupersede")
            val sourcePointer = JsonPointerSupport.child(entryPointer, "source")
            val source = entry.get("source") ?: invalid(sourcePointer, "is required")
            requireObject(source, sourcePointer)
            requireAllowedFields(source, sourcePointer, setOf("ref", "inlineSchemaSha256", "propertySchemaSha256"))
            val hasRef = source.has("ref")
            val hasInline = source.has("inlineSchemaSha256")
            if (hasRef == hasInline) {
                invalid(sourcePointer, "must contain exactly one of 'ref' or 'inlineSchemaSha256'")
            }
            if (hasRef) {
                requireNonEmptyString(source, sourcePointer, "ref")
            } else {
                requireSha256(source, sourcePointer, "inlineSchemaSha256")
            }
            requireSha256(source, sourcePointer, "propertySchemaSha256")
        }
    }

    private fun validateIdempotency(
        value: JsonNode,
        pointer: String,
    ) {
        requireObject(value, pointer)
        requireAllowedFields(value, pointer, setOf("keyHeader", "clientGenerated"))
        requireNonEmptyString(value, pointer, "keyHeader")
        val fieldPointer = JsonPointerSupport.child(pointer, "clientGenerated")
        val clientGenerated = value.get("clientGenerated") ?: invalid(fieldPointer, "is required")
        if (!clientGenerated.isBoolean || !clientGenerated.booleanValue()) {
            invalid(fieldPointer, "must equal true")
        }
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

    private fun requireSha256(
        value: JsonNode,
        pointer: String,
        field: String,
    ) {
        val fieldPointer = JsonPointerSupport.child(pointer, field)
        val actual = value.get(field) ?: invalid(fieldPointer, "is required")
        if (!actual.isTextual || !Regex("^[0-9a-f]{64}$").matches(actual.textValue())) {
            invalid(fieldPointer, "must be exactly 64 lowercase hexadecimal characters")
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
        try {
            JsonPointer(actual.textValue())
        } catch (_: IllegalArgumentException) {
            invalid(fieldPointer, "must contain only valid JSON Pointer escapes '~0' and '~1'")
        }
    }

    private fun invalid(
        pointer: String,
        reason: String,
    ): Nothing = throw ExtensionValidationException("Invalid SDKGen extension at $pointer: $reason")
}
