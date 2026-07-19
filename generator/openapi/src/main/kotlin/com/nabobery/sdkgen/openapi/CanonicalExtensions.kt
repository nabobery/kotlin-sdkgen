package com.nabobery.sdkgen.openapi

import com.fasterxml.jackson.databind.JsonNode
import com.nabobery.sdkgen.model.JsonPointer

internal val CANONICAL_OPERATION_EXTENSIONS =
    setOf(
        "x-sdkgen-idempotency",
        "x-sdkgen-pagination",
        "x-sdkgen-streaming",
    )

internal fun isDirectOperationExtension(pointer: String): Boolean {
    val segments = JsonPointer(pointer).segments
    return segments.size == 4 &&
        segments[0] == "paths" &&
        segments[2] in HTTP_METHODS &&
        segments[3] in CANONICAL_OPERATION_EXTENSIONS
}

internal fun JsonNode.nonCanonicalExtensions() = extensions() - CANONICAL_OPERATION_EXTENSIONS
