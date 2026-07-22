package com.nabobery.sdkgen.runtime

internal fun boundUtf8Preview(
    text: String,
    maxBytes: Int,
    marker: String,
    truncated: Boolean = false,
): String {
    val bytes = text.encodeToByteArray()
    if (!truncated && bytes.size <= maxBytes) return text
    val markerBytes = marker.encodeToByteArray().size
    var budget = (maxBytes - markerBytes).coerceIn(0, bytes.size)
    while (budget > 0 && budget < bytes.size && isUtf8ContinuationByte(bytes[budget])) {
        budget--
    }
    return bytes.copyOfRange(0, budget).decodeToString() + marker
}

private fun isUtf8ContinuationByte(byte: Byte): Boolean = (byte.toInt() and 0xC0) == 0x80

private const val SENSITIVE_BODY_FIELD_NAMES =
    "authorization|proxy-authorization|cookie|set-cookie|api[-_]?key|access[-_]?token|" +
        "refresh[-_]?token|token|password|secret"

private val SENSITIVE_QUOTED_DOUBLE_BODY_FIELD =
    Regex(
        """(["']?(?:$SENSITIVE_BODY_FIELD_NAMES)["']?\s*[:=]\s*")((?:\\.|[^"\\])*)""",
        RegexOption.IGNORE_CASE,
    )
private val SENSITIVE_QUOTED_SINGLE_BODY_FIELD =
    Regex(
        """(["']?(?:$SENSITIVE_BODY_FIELD_NAMES)["']?\s*[:=]\s*')((?:\\.|[^'\\])*)'""",
        RegexOption.IGNORE_CASE,
    )
private val SENSITIVE_UNQUOTED_BODY_FIELD =
    Regex(
        """(["']?(?:$SENSITIVE_BODY_FIELD_NAMES)["']?\s*[:=]\s*)([^"'\s,;}&]+)""",
        RegexOption.IGNORE_CASE,
    )
private val SENSITIVE_AUTHORIZATION_VALUE =
    Regex("""\b(?:Bearer|Basic)\s+[^\s,;]+""", RegexOption.IGNORE_CASE)

/** Applies the runtime's deny-by-default redaction policy to bounded diagnostic text. */
internal fun redactDiagnosticText(text: String): String =
    SENSITIVE_AUTHORIZATION_VALUE
        .replace(text, "<redacted>")
        .let { value ->
            SENSITIVE_QUOTED_DOUBLE_BODY_FIELD
                .replace(value) { "${it.groups[1]?.value.orEmpty()}<redacted>\\\"" }
        }.let { value ->
            SENSITIVE_QUOTED_SINGLE_BODY_FIELD
                .replace(value) { "${it.groups[1]?.value.orEmpty()}<redacted>'" }
        }.let { value ->
            SENSITIVE_UNQUOTED_BODY_FIELD.replace(value) { "${it.groups[1]?.value.orEmpty()}<redacted>" }
        }

/** Renders headers through their uniformly redacted diagnostic representation. */
public fun redactedHeaderList(headers: List<SdkHeader>): String =
    headers.joinToString(prefix = "[", postfix = "]") { it.toString() }

/** Raised when a buffered read would exceed its configured byte limit. */
public class SdkBufferLimitExceededException(
    public val maxBytes: Long,
    public val observedBytes: Long,
) : RuntimeException("Buffered body exceeded $maxBytes bytes after reading $observedBytes bytes.")

/**
 * The base of the runtime's error taxonomy. Left open (not sealed) so adapters and generated code may throw
 * additional domain-specific subclasses that still satisfy `catch (e: SdkException)`.
 *
 * `kotlin.coroutines.cancellation.CancellationException` is never wrapped by this hierarchy anywhere in the
 * executor: cancellation is always rethrown by identity so structured concurrency stays intact (spec §2, §11.1).
 *
 * Retry history: [retryHistory] is a bounded, secret-free summary of prior attempts, set at most once via the
 * internal [attachRetryHistory] by the retry engine right before a final exception is thrown. It is empty when no
 * retry occurred or no history was attached. Entries never carry response bodies, headers, or credentials — see
 * [AttemptOutcome].
 */
public open class SdkException(
    message: String,
    public val operationId: String? = null,
    cause: Throwable? = null,
) : RuntimeException(message, cause) {
    private var attachedRetryHistory: List<AttemptOutcome> = emptyList()
    private var retryHistoryAttached: Boolean = false

    /** An immutable, bounded snapshot of prior attempts; empty until [attachRetryHistory] is called. */
    public val retryHistory: List<AttemptOutcome>
        get() = attachedRetryHistory

    /**
     * Attaches [history] to this exception, once. Keeps only the most recent [MAX_RETRY_HISTORY_ENTRIES] entries
     * (dropping the oldest) when [history] is longer than that.
     *
     * @throws IllegalStateException if retry history has already been attached to this exception instance.
     */
    internal fun attachRetryHistory(history: List<AttemptOutcome>) {
        check(!retryHistoryAttached) { "retryHistory has already been attached to this exception" }
        attachedRetryHistory = history.toList().takeLast(MAX_RETRY_HISTORY_ENTRIES)
        retryHistoryAttached = true
    }

    private companion object {
        const val MAX_RETRY_HISTORY_ENTRIES: Int = 32
    }
}

/** The deadline kind that expired, attached to [SdkTimeoutException] so callers can react per-phase. */
public enum class TimeoutPhase {
    /** The total-across-retries deadline ([SdkDeadlines.totalMillis]) elapsed. */
    TOTAL,

    /** The per-attempt deadline ([SdkDeadlines.attemptMillis]) elapsed. */
    ATTEMPT,

    /** No bytes were read from a streaming response body within the idle window. */
    STREAM_IDLE,

    /** No bytes could be written to a streaming request body within the idle window. */
    UPLOAD_IDLE,

    /** A pagination-wide time budget (e.g. `maxElapsedMillis` in [CallOptions]) elapsed while walking pages. */
    PAGINATION_BUDGET,
}

/** Raised when a request or response exceeds a semantic deadline; [phase] identifies which one. */
public class SdkTimeoutException(
    public val phase: TimeoutPhase,
    message: String,
    operationId: String? = null,
    cause: Throwable? = null,
) : SdkException(message, operationId, cause)

/**
 * Raised for pagination-specific failures: a next-URL refused by trusted-host policy, or a transition that would
 * otherwise loop because a continuation repeats or state fails to advance.
 */
public class SdkPaginationException(
    message: String,
    operationId: String? = null,
    cause: Throwable? = null,
) : SdkException(message, operationId, cause)

/** Raised for malformed or protocol-violating streaming/SSE/JSON-lines framing. */
public class SdkStreamingException(
    message: String,
    operationId: String? = null,
    cause: Throwable? = null,
) : SdkException(message, operationId, cause)

/**
 * Raised for a response status that no [ResponseAlternative] on the operation's [OperationMetadata] claims —
 * distinct from [SdkApiException], which is raised by the Phase-1 `successStatusCodes` contract.
 *
 * @property redactedBodyPreview a redacted, size-bounded prefix of the response body (capped at
 *   [MAX_BODY_PREVIEW_BYTES] measured in UTF-8 bytes — enforced in this constructor by truncating and appending a
 *   `"…[truncated]"` marker when the input exceeds the cap, never by rejecting it — UTF-8 decoded on a best-effort
 *   basis), or `null` when no body was captured. Callers must treat this preview as diagnostic-only: it is never a
 *   substitute for the raw response. The runtime's deny-by-default diagnostic redaction is applied before the value is
 *   exposed.
 */
public class UnknownApiException(
    public val statusCode: Int,
    headers: List<SdkHeader>,
    redactedBodyPreview: String?,
    operationId: String? = null,
    cause: Throwable? = null,
    bodyPreviewTruncated: Boolean = false,
) : SdkException("Operation '${operationId ?: "<unknown>"}' returned unmapped HTTP $statusCode.", operationId, cause) {
    /** Defensive copy of the headers supplied at construction; later mutation of the input has no effect. */
    public val headers: List<SdkHeader> = headers.toList()

    /** [redactedBodyPreview] bounded to at most [MAX_BODY_PREVIEW_BYTES] UTF-8 bytes; `null` stays `null`. */
    public val redactedBodyPreview: String? =
        redactedBodyPreview?.let {
            boundUtf8Preview(it, MAX_BODY_PREVIEW_BYTES, TRUNCATION_MARKER, truncated = bodyPreviewTruncated)
        }

    public companion object {
        /** Default cap, in bytes, on how much response body [redactedBodyPreview] capture may buffer (ADR-0006). */
        public const val MAX_BODY_PREVIEW_BYTES: Int = 64 * 1024

        private const val TRUNCATION_MARKER: String = "…[truncated]"
    }
}

/** How one physical attempt was classified by the (future) retry engine, recorded in [AttemptOutcome]. */
public enum class AttemptClassification {
    /** The attempt failed but a further attempt was scheduled. */
    RETRIED,

    /** The attempt failed and no further attempts remain because an attempt, deadline, or retry quota was exhausted. */
    EXHAUSTED,

    /** The attempt failed for a reason the retry engine never retries (validation, auth, cancellation, ...). */
    NOT_RETRYABLE,

    /** The attempt succeeded. */
    SUCCEEDED,
}

/**
 * One entry in [SdkException.retryHistory]: a safe, bounded summary of a single physical attempt.
 *
 * Deliberately excludes response bodies, headers, and credentials — [summary] must be a short, secret-free string
 * (e.g. "HTTP 503" or "connect timeout"), never raw response content; it is silently truncated to
 * [MAX_SUMMARY_LENGTH] characters at construction so a careless caller cannot smuggle an unbounded (or
 * accidentally-secret-bearing) blob into retry history.
 *
 * Not a `data class`: [summary] is bounded at construction, which a data-class primary constructor cannot do (see
 * [ResponseAlternative]'s KDoc for why). [equals]/[hashCode]/[toString]/[copy] are hand-written over the bounded
 * value.
 */
public class AttemptOutcome(
    public val attemptNumber: Int,
    public val classification: AttemptClassification,
    public val delayMillis: Long? = null,
    summary: String? = null,
) {
    /** [summary] truncated to at most [MAX_SUMMARY_LENGTH] characters; `null` stays `null`. */
    public val summary: String? = summary?.take(MAX_SUMMARY_LENGTH)

    public fun copy(
        attemptNumber: Int = this.attemptNumber,
        classification: AttemptClassification = this.classification,
        delayMillis: Long? = this.delayMillis,
        summary: String? = this.summary,
    ): AttemptOutcome = AttemptOutcome(attemptNumber, classification, delayMillis, summary)

    override fun equals(other: Any?): Boolean =
        other is AttemptOutcome &&
            attemptNumber == other.attemptNumber &&
            classification == other.classification &&
            delayMillis == other.delayMillis &&
            summary == other.summary

    override fun hashCode(): Int = arrayOf<Any?>(attemptNumber, classification, delayMillis, summary).contentHashCode()

    override fun toString(): String =
        "AttemptOutcome(attemptNumber=$attemptNumber, classification=$classification, delayMillis=$delayMillis, " +
            "summary=$summary)"

    public companion object {
        /** Maximum character length retained for [summary]; longer input is truncated, not rejected. */
        public const val MAX_SUMMARY_LENGTH: Int = 256
    }
}

public class SdkConfigurationException(
    message: String,
    operationId: String? = null,
    cause: Throwable? = null,
) : SdkException(message, operationId, cause)

public class SdkSerializationException(
    message: String,
    operationId: String? = null,
    cause: Throwable? = null,
) : SdkException(message, operationId, cause)

public class SdkTransportException(
    message: String,
    operationId: String? = null,
    cause: Throwable? = null,
    public val requestMayHaveReachedServer: Boolean = true,
) : SdkException(message, operationId, cause)

/** Raised when authentication or signing fails before a physical request is sent. */
public class SdkAuthenticationException(
    message: String,
    operationId: String? = null,
    cause: Throwable? = null,
) : SdkException(message, operationId, cause)

/**
 * Raised for a declared non-success API response.
 *
 * Generated operation-specific subclasses may add a typed decoded error payload while preserving this stable base
 * contract for callers that catch [SdkApiException]. The message and inherited diagnostic rendering contain only safe
 * response metadata; decoded bodies are never included.
 */
public open class SdkApiException(
    public val statusCode: Int,
    headers: List<SdkHeader>,
    operationId: String,
) : SdkException("Operation '$operationId' returned HTTP $statusCode.", operationId) {
    /** Defensive copy of the headers supplied at construction; later mutation of the input has no effect. */
    public val headers: List<SdkHeader> = headers.toList()
}

public class SdkCapabilityException(
    message: String,
    public val capability: String,
    operationId: String? = null,
    cause: Throwable? = null,
) : SdkException(message, operationId, cause)
