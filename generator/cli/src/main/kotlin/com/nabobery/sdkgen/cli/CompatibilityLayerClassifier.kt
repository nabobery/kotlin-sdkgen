package com.nabobery.sdkgen.cli

import java.nio.charset.StandardCharsets
import java.security.MessageDigest

/** A pure, evidence-bounded classifier for exactly one compatibility layer. */
internal interface CompatibilityLayerClassifier<Evidence> {
    val layer: CompatibilityLayer

    /** Compares two declared evidence values without consulting the host environment. */
    fun classify(
        before: Evidence?,
        after: Evidence?,
    ): CompatibilityLayerClassificationResult
}

/** The report fragment independently produced by one [CompatibilityLayerClassifier]. */
internal data class CompatibilityLayerClassificationResult(
    internal val layerReport: CompatibilityLayerReport,
    internal val changes: List<CompatibilityChange>,
)

internal fun unavailableClassification(
    layer: CompatibilityLayer,
    code: String = "missing-layer-evidence",
    detail: String? = null,
): CompatibilityLayerClassificationResult =
    CompatibilityLayerClassificationResult(
        layerReport =
            CompatibilityLayerReport(
                layer = layer,
                outcome = CompatibilityLayerOutcome.UNAVAILABLE,
                unavailableReason = CompatibilityUnavailableReason(code = code, detail = detail),
            ),
        changes = emptyList(),
    )

internal fun classifiedLayer(
    layer: CompatibilityLayer,
    changes: List<CompatibilityChange>,
): CompatibilityLayerClassificationResult =
    CompatibilityLayerClassificationResult(
        layerReport =
            CompatibilityLayerReport(
                layer = layer,
                outcome =
                    if (changes.isEmpty()) {
                        CompatibilityLayerOutcome.UNCHANGED
                    } else {
                        CompatibilityLayerOutcome.CHANGED
                    },
            ),
        changes = changes.sortedBy { change -> change.id.value },
    )

internal fun pairedEvidence(
    before: CompatibilityEvidenceReference?,
    after: CompatibilityEvidenceReference?,
): List<CompatibilityEvidenceReference> = listOfNotNull(before, after)

internal fun requireUniqueSubjects(subjects: List<String>) {
    require(subjects.size == subjects.distinct().size) {
        "Compatibility evidence contains duplicate canonical subjects."
    }
}

/** Returns [value] only when it is the canonical lowercase SHA-256 hexadecimal representation. */
internal fun canonicalCompatibilityFingerprint(value: String): String? = value.takeIf { CANONICAL_SHA256.matches(it) }

/**
 * Validates every externally supplied evidence reference and fingerprint before any comparison or ID creation.
 *
 * All compatibility layers use this single canonical-fingerprint gate so malformed or non-canonical values cannot
 * produce an unchanged comparison or implementation-dependent change ID.
 */
internal fun invalidCompatibilityEvidenceReason(
    references: List<CompatibilityEvidenceReference>,
    fingerprints: List<String> = emptyList(),
): CompatibilityUnavailableReason? =
    when {
        references.any { reference -> reference.kind.isBlank() || reference.identity.isBlank() } -> {
            CompatibilityUnavailableReason(
                code = "invalid-evidence-reference",
                detail = "Compatibility evidence kind and identity must be non-empty.",
            )
        }

        references.any { reference -> canonicalCompatibilityFingerprint(reference.sha256) == null } ||
            fingerprints.any { fingerprint -> canonicalCompatibilityFingerprint(fingerprint) == null } -> {
            CompatibilityUnavailableReason(
                code = "invalid-evidence-reference",
                detail = "Compatibility evidence fingerprints must be lowercase 64-character SHA-256 hex digests.",
            )
        }

        else -> {
            null
        }
    }

internal fun normalizedCompatibilityFingerprint(value: String): String {
    val digest = MessageDigest.getInstance("SHA-256").digest(value.toByteArray(StandardCharsets.UTF_8))
    return buildString(digest.size * 2) {
        digest.forEach { byte ->
            val unsigned = byte.toInt() and 0xff
            append(HEX_DIGITS[unsigned ushr 4])
            append(HEX_DIGITS[unsigned and 0x0f])
        }
    }
}

private val CANONICAL_SHA256: Regex = Regex("[0-9a-f]{64}")
private const val HEX_DIGITS: String = "0123456789abcdef"
