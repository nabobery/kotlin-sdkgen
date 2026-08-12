package com.nabobery.sdkgen.cli

import java.nio.charset.StandardCharsets
import java.security.MessageDigest

internal enum class CompatibilityLayer(
    internal val wireName: String,
) {
    SOURCE_CONTRACT("sourceContract"),
    SEMANTIC_MODEL("semanticModel"),
    KOTLIN_API("kotlinApi"),
    BEHAVIOR("behavior"),
    ABI("abi"),
}

internal enum class CompatibilityLayerOutcome(
    internal val wireName: String,
) {
    UNCHANGED("unchanged"),
    CHANGED("changed"),
    UNAVAILABLE("unavailable"),
}

internal enum class CompatibilityAggregateOutcome(
    internal val wireName: String,
) {
    INCOMPLETE("incomplete"),
    COMPATIBLE("compatible"),
    CHANGED("changed"),
}

internal enum class CompatibilityClassification(
    internal val wireName: String,
) {
    BREAKING("breaking"),
    UNKNOWN("unknown"),
    BEHAVIORALLY_RISKY("behaviorallyRisky"),
    ADDITIVE("additive"),
}

internal data class CompatibilityUnavailableReason(
    internal val code: String,
    internal val detail: String? = null,
)

internal data class CompatibilityLayerReport(
    internal val layer: CompatibilityLayer,
    internal val outcome: CompatibilityLayerOutcome,
    internal val unavailableReason: CompatibilityUnavailableReason? = null,
)

internal data class CompatibilityEvidenceReference(
    internal val kind: String,
    internal val identity: String,
    internal val sha256: String,
    internal val location: String? = null,
)

internal data class CompatibilityChange(
    internal val id: CompatibilityChangeId,
    internal val layer: CompatibilityLayer,
    internal val classification: CompatibilityClassification,
    internal val summary: String,
    internal val evidence: List<CompatibilityEvidenceReference>,
) {
    init {
        require(evidence.isNotEmpty()) { "A compatibility change must include evidence." }
    }
}

internal data class CompatibilityTruncation(
    internal val displayedChangeCount: Int,
    internal val omittedChangeCount: Int,
)

/**
 * Not a `data class`: a `data class`'s generated `copy()` follows the class's own visibility, not its
 * constructor's, so `copy()` would still be a public bypass of the private constructor below and let a caller
 * manufacture an ID that never went through [create]'s digest scheme. [create] must remain the sole construction
 * path for a change ID, since IDs are a frozen, externally-consumed contract (see the "Stable change identifiers"
 * section of ADR 0013) and a hand-forged one would be indistinguishable from a real one in a report.
 *
 * [equals] and [hashCode] are defined explicitly over [value] because [CompatibilityReport.create] relies on
 * value-based equality to reject duplicate change IDs (`changes.map(CompatibilityChange::id).distinct()`), and
 * the frozen `CompatibilityContractTest` asserts two IDs differ by content
 * (`assertNotEquals(callerOrder[0].id, callerOrder[1].id)`), not merely by object identity. [toString] is
 * likewise defined over [value] so a failed equality assertion on an ID reports the actual digest instead of an
 * opaque object reference.
 */
internal class CompatibilityChangeId private constructor(
    internal val value: String,
) {
    override fun equals(other: Any?): Boolean = other is CompatibilityChangeId && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = value

    internal companion object {
        internal fun create(
            layer: CompatibilityLayer,
            subjectKind: String,
            canonicalSubject: String,
            beforeFingerprint: String?,
            afterFingerprint: String?,
        ): CompatibilityChangeId {
            require(SUBJECT_KIND.matches(subjectKind)) {
                "Compatibility subject kind must be a lowercase ASCII kebab-case identifier."
            }
            require(0.toChar() !in canonicalSubject) { "Compatibility canonical subject must not contain NUL." }
            require(beforeFingerprint?.contains(0.toChar()) != true) {
                "Compatibility before fingerprint must not contain NUL."
            }
            require(afterFingerprint?.contains(0.toChar()) != true) {
                "Compatibility after fingerprint must not contain NUL."
            }

            val key =
                listOf(
                    CHANGE_ID_VERSION,
                    layer.wireName,
                    subjectKind,
                    canonicalSubject,
                    beforeFingerprint ?: ABSENT_FINGERPRINT,
                    afterFingerprint ?: ABSENT_FINGERPRINT,
                ).joinToString(NUL.toString())
            val digest = sha256(key).take(DIGEST_HEX_LENGTH)
            return CompatibilityChangeId("$CHANGE_ID_VERSION:${layer.wireName}:$subjectKind:$digest")
        }

        private fun sha256(value: String): String {
            val bytes = MessageDigest.getInstance("SHA-256").digest(value.toByteArray(StandardCharsets.UTF_8))
            return buildString(bytes.size * 2) {
                bytes.forEach { byte ->
                    val unsigned = byte.toInt() and 0xff
                    append(HEX_DIGITS[unsigned ushr 4])
                    append(HEX_DIGITS[unsigned and 0x0f])
                }
            }
        }

        private val SUBJECT_KIND: Regex = Regex("[a-z]+(?:-[a-z0-9]+)*")
        private const val CHANGE_ID_VERSION: String = "compat-v1"
        private const val ABSENT_FINGERPRINT: String = "-"
        private const val DIGEST_HEX_LENGTH: Int = 16
        private val NUL: Char = 0.toChar()
        private const val HEX_DIGITS: String = "0123456789abcdef"
    }
}

internal class CompatibilityReport private constructor(
    internal val layers: List<CompatibilityLayerReport>,
    internal val changes: List<CompatibilityChange>,
    internal val totalChangeCount: Int,
    internal val changeCountsByClassification: Map<CompatibilityClassification, Int>,
    internal val mostSevereClassification: CompatibilityClassification?,
    internal val truncation: CompatibilityTruncation?,
    internal val aggregateOutcome: CompatibilityAggregateOutcome,
) {
    internal companion object {
        internal fun create(
            layerReports: List<CompatibilityLayerReport>,
            changes: List<CompatibilityChange> = emptyList(),
            maximumDisplayedChanges: Int? = null,
        ): CompatibilityReport {
            require(maximumDisplayedChanges == null || maximumDisplayedChanges >= 0) {
                "Maximum displayed changes must not be negative."
            }
            require(layerReports.map(CompatibilityLayerReport::layer).distinct().size == layerReports.size) {
                "Compatibility layer reports must not contain duplicate layers."
            }
            require(changes.map(CompatibilityChange::id).distinct().size == changes.size) {
                "Compatibility changes must not contain duplicate IDs."
            }

            val reportsByLayer = layerReports.associateBy(CompatibilityLayerReport::layer)
            val completeLayers =
                CompatibilityLayer.entries.map { layer ->
                    normalizeLayerReport(reportsByLayer[layer] ?: missingLayerReport(layer))
                }
            val fullChanges =
                changes.sortedWith(
                    compareBy<CompatibilityChange>(CompatibilityChange::classification, { change -> change.id.value }),
                )
            val displayLimit = maximumDisplayedChanges ?: fullChanges.size
            val displayedChanges = fullChanges.take(displayLimit)
            val omittedChangeCount = fullChanges.size - displayedChanges.size
            val changeCounts = countsByClassification(fullChanges)
            val aggregateOutcome = deriveAggregateOutcome(completeLayers, fullChanges)

            return CompatibilityReport(
                layers = completeLayers,
                changes = displayedChanges,
                totalChangeCount = fullChanges.size,
                changeCountsByClassification = changeCounts,
                mostSevereClassification = fullChanges.firstOrNull()?.classification,
                truncation =
                    if (omittedChangeCount == 0) {
                        null
                    } else {
                        CompatibilityTruncation(
                            displayedChangeCount = displayedChanges.size,
                            omittedChangeCount = omittedChangeCount,
                        )
                    },
                aggregateOutcome = aggregateOutcome,
            )
        }

        /**
         * Compares two independently read manifest snapshots and delegates to the five existing layer
         * classifiers, then hands their layer reports and changes to [create], which owns aggregate-outcome
         * derivation.
         *
         * Each `v1alpha2` digest maps to exactly one layer, independently of the others:
         * `effectiveContractSha256` to [CompatibilityLayer.SOURCE_CONTRACT], `semanticModelSha256` to
         * [CompatibilityLayer.SEMANTIC_MODEL], and `kotlinApiSha256` to [CompatibilityLayer.KOTLIN_API].
         * `declarationModelSha256` never substitutes for any of the three per ADR 0013. `behavior` and `abi`
         * always report [CompatibilityLayerOutcome.UNAVAILABLE]: a manifest carries no parity scenario/wire evidence
         * and no staged generated-SDK artifact dumps.
         *
         * Every digest read from a manifest is already a canonical lowercase SHA-256 hex string —
         * [CompatibilityManifestReader] enforces that shape at read time — so each raw digest is placed directly
         * into classifier-validated `sha256` evidence fields without any rehashing. A classifier's own fail-closed
         * evidence check (`canonicalCompatibilityFingerprint`) therefore genuinely gates this evidence; laundering
         * a malformed manifest digest into valid-looking evidence here would defeat that check entirely and let a
         * corrupted or attacker-controlled digest report as `unchanged` instead of failing closed.
         *
         * `behavior` and `abi` are not carried by any manifest field (ADR 0013, "Evidence sources"), so their
         * evidence is supplied independently through [behaviorEvidence] and [abiEvidence]. Each defaults to
         * `null to null`, preserving every existing two-argument call site's exact prior behavior: both layers
         * report [CompatibilityLayerOutcome.UNAVAILABLE] whenever the corresponding evidence pair is not supplied,
         * one side is missing, or the pair is malformed -- [BehaviorCompatibilityClassifier] and
         * [AbiCompatibilityClassifier] make that determination themselves; this function never inspects or
         * second-guesses their evidence, it only decides whether to pass it at all.
         */
        internal fun compare(
            from: CompatibilityManifestSnapshot,
            to: CompatibilityManifestSnapshot,
            behaviorEvidence: Pair<BehaviorEvidence?, BehaviorEvidence?> = null to null,
            abiEvidence: Pair<GeneratedSdkAbiEvidence?, GeneratedSdkAbiEvidence?> = null to null,
            kotlinApiEvidence: Pair<KotlinPublicApiEvidence?, KotlinPublicApiEvidence?> = null to null,
        ): CompatibilityReport {
            val sourceContractResult =
                SourceContractCompatibilityClassifier.classify(
                    sourceContractEvidence(from),
                    sourceContractEvidence(to),
                )
            val semanticModelResult =
                SemanticModelCompatibilityClassifier.classify(
                    semanticModelEvidence(from),
                    semanticModelEvidence(to),
                )
            val kotlinApiResult =
                KotlinApiCompatibilityClassifier.classify(kotlinApiEvidence.first, kotlinApiEvidence.second)
            val behaviorResult =
                BehaviorCompatibilityClassifier.classify(behaviorEvidence.first, behaviorEvidence.second)
            val abiResult = AbiCompatibilityClassifier.classify(abiEvidence.first, abiEvidence.second)

            val results = listOf(sourceContractResult, semanticModelResult, kotlinApiResult, behaviorResult, abiResult)
            return create(
                layerReports = results.map(CompatibilityLayerClassificationResult::layerReport),
                changes = results.flatMap(CompatibilityLayerClassificationResult::changes),
            )
        }

        private fun sourceContractEvidence(snapshot: CompatibilityManifestSnapshot): SourceContractEvidence? =
            snapshot.effectiveContractSha256?.let { digest ->
                SourceContractEvidence(
                    effectiveContract =
                        CompatibilityEvidenceReference(
                            kind = "effective-contract",
                            identity = "manifest:effective-contract",
                            sha256 = digest,
                        ),
                    components = emptyList(),
                    normalizedEffectiveContractPointers = emptyList(),
                )
            }

        private fun semanticModelEvidence(snapshot: CompatibilityManifestSnapshot): SemanticModelEvidence? =
            snapshot.semanticModelSha256?.let { digest ->
                SemanticModelEvidence(
                    semanticModel =
                        CompatibilityEvidenceReference(
                            kind = "semantic-model",
                            identity = "manifest:semantic-model",
                            sha256 = digest,
                        ),
                    nodes = emptyList(),
                    declarationModel = null,
                )
            }

        private fun normalizeLayerReport(report: CompatibilityLayerReport): CompatibilityLayerReport =
            when (report.outcome) {
                CompatibilityLayerOutcome.UNAVAILABLE -> {
                    report.copy(unavailableReason = report.unavailableReason ?: missingLayerReason())
                }

                CompatibilityLayerOutcome.UNCHANGED,
                CompatibilityLayerOutcome.CHANGED,
                -> {
                    require(report.unavailableReason == null) {
                        "Only unavailable compatibility layers may include an unavailable reason."
                    }
                    report
                }
            }

        private fun missingLayerReport(layer: CompatibilityLayer): CompatibilityLayerReport =
            CompatibilityLayerReport(
                layer = layer,
                outcome = CompatibilityLayerOutcome.UNAVAILABLE,
                unavailableReason = missingLayerReason(),
            )

        private fun missingLayerReason(): CompatibilityUnavailableReason =
            CompatibilityUnavailableReason(code = "missing-layer-evidence")

        private fun countsByClassification(changes: List<CompatibilityChange>): Map<CompatibilityClassification, Int> =
            buildMap {
                CompatibilityClassification.entries.forEach { classification ->
                    val count = changes.count { it.classification == classification }
                    if (count != 0) {
                        put(classification, count)
                    }
                }
            }

        private fun deriveAggregateOutcome(
            layers: List<CompatibilityLayerReport>,
            changes: List<CompatibilityChange>,
        ): CompatibilityAggregateOutcome =
            when {
                layers.any { it.outcome == CompatibilityLayerOutcome.UNAVAILABLE } ||
                    changes.any { it.classification == CompatibilityClassification.UNKNOWN } -> {
                    CompatibilityAggregateOutcome.INCOMPLETE
                }

                layers.all { it.outcome == CompatibilityLayerOutcome.UNCHANGED } && changes.isEmpty() -> {
                    CompatibilityAggregateOutcome.COMPATIBLE
                }

                else -> {
                    CompatibilityAggregateOutcome.CHANGED
                }
            }
    }
}
