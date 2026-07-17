package com.nabobery.sdkgen.openapi.overlays

import com.fasterxml.jackson.databind.JsonNode

public enum class ZeroMatchMode {
    STRICT,
    COMPAT,
}

public enum class ConflictPolicy {
    FAIL,
    LAST_WRITE_WINS,
}

public data class OverlayInput(
    public val identity: String,
    public val content: ByteArray,
)

public data class JsonPathSource(
    public val overlayIdentity: String,
    public val actionIndex: Int?,
    public val field: String,
    public val caseName: String? = null,
) {
    public fun describe(): String =
        buildString {
            append("Overlay '").append(overlayIdentity).append('\'')
            actionIndex?.let { append(" action ").append(it) }
            append(' ').append(field)
            caseName?.let { append(" (").append(it).append(')') }
        }
}

public data class AppliedOverlay(
    public val identity: String,
    public val title: String,
    public val version: String,
    public val sha256: String,
    public val actionCount: Int,
)

public data class AppliedAction(
    public val overlayIdentity: String,
    public val actionIndex: Int,
    public val target: String,
    public val matchedPointers: List<String>,
    public val kind: String,
    public val copyFrom: String? = null,
    public val sourcePointers: List<String> = emptyList(),
)

public data class EffectiveChange(
    public val pointer: String,
    public val kind: ChangeKind,
    public val before: JsonNode?,
    public val after: JsonNode?,
)

public enum class ChangeKind {
    ADD,
    REMOVE,
    REPLACE,
}

public data class OverlayApplicationResult(
    public val document: JsonNode,
    public val overlays: List<AppliedOverlay>,
    public val actions: List<AppliedAction>,
    public val changes: List<EffectiveChange>,
)

public open class OverlayException(
    message: String,
    cause: Throwable? = null,
) : RuntimeException(message, cause)

public class OverlayFormatException(
    message: String,
    cause: Throwable? = null,
) : OverlayException(message, cause)

public class JsonPathValidationException(
    public val expression: String,
    public val source: JsonPathSource,
    public val offset: Int,
    detail: String,
    cause: Throwable? = null,
) : OverlayException(
        "${source.describe()} has invalid RFC 9535 JSONPath at offset $offset: $detail: $expression",
        cause,
    )

public class ZeroMatchException(
    message: String,
) : OverlayException(message)

public class CopySourceMatchException(
    message: String,
) : OverlayException(message)

public class OverlayConflictException(
    message: String,
) : OverlayException(message)

public class ExtensionValidationException(
    message: String,
) : OverlayException(message)
