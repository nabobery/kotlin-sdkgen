package com.nabobery.sdkgen.cli

/**
 * Classifies the pinned inputs and normalized pointers that define an effective source contract.
 *
 * Canonical-subject grammar:
 * - `(sourceContract, source)`: `source:<stable-input-identity>`
 * - `(sourceContract, reference)`: `reference:<stable-input-identity>`
 * - `(sourceContract, overlay)`: `overlay:<stable-overlay-identity>`
 * - `(sourceContract, effective-pointer)`: `pointer:<normalized-json-pointer>`
 * - `(sourceContract, effective-contract)`: `effective-contract:<effective-contract-identity>`
 *
 * Worked example (`effective-pointer`): the source document `openapi/openrouter.yaml` uses the
 * canonical subject `source:openapi/openrouter.yaml`. Its change ID is keyed with that subject and
 * the prior and subsequent pinned SHA-256 fingerprints. Evidence uses the `effective-contract`
 * vocabulary.
 *
 * Worked example (`effective-contract`): a whole-contract digest change is not membership of any
 * single pointer, so it is not modelled as a pointer change. Instead its canonical subject is the
 * effective contract's own identity, for example `effective-contract:openapi/openrouter.yaml`, and
 * the change ID is keyed with that subject plus the prior and subsequent pinned effective-contract
 * SHA-256 fingerprints. This keeps a change to "the whole contract changed" distinct from a change
 * to "this specific pointer entered or left the effective contract" (the `effective-pointer` grammar
 * above), even though both can be reported for the same before/after pair.
 */
internal object SourceContractCompatibilityClassifier : CompatibilityLayerClassifier<SourceContractEvidence> {
    override val layer: CompatibilityLayer = CompatibilityLayer.SOURCE_CONTRACT

    override fun classify(
        before: SourceContractEvidence?,
        after: SourceContractEvidence?,
    ): CompatibilityLayerClassificationResult {
        if (before == null || after == null) return unavailableClassification(layer)
        validationFailure(before)?.let { reason ->
            return unavailableClassification(layer, reason.code, reason.detail)
        }
        validationFailure(after)?.let { reason ->
            return unavailableClassification(layer, reason.code, reason.detail)
        }

        val changes = componentChanges(before, after) + pointerChanges(before, after)
        return classifiedLayer(layer, changes)
    }

    private fun componentChanges(
        before: SourceContractEvidence,
        after: SourceContractEvidence,
    ): List<CompatibilityChange> =
        (
            before.components.map(SourceContractComponent::canonicalSubject) +
                after.components.map(SourceContractComponent::canonicalSubject)
        ).distinct()
            .sorted()
            .mapNotNull { subject ->
                val previous = before.components.singleOrNull { it.canonicalSubject == subject }
                val subsequent = after.components.singleOrNull { it.canonicalSubject == subject }
                if (previous?.sha256 == subsequent?.sha256) {
                    null
                } else {
                    sourceChange(
                        subjectKind = previous?.kind?.wireName ?: subsequent!!.kind.wireName,
                        canonicalSubject = subject,
                        beforeFingerprint = previous?.sha256?.let(::canonicalCompatibilityFingerprint),
                        afterFingerprint = subsequent?.sha256?.let(::canonicalCompatibilityFingerprint),
                        beforeEvidence = before.effectiveContract,
                        afterEvidence = after.effectiveContract,
                    )
                }
            }

    private fun pointerChanges(
        before: SourceContractEvidence,
        after: SourceContractEvidence,
    ): List<CompatibilityChange> {
        val beforePointers = before.normalizedEffectiveContractPointers.sorted()
        val afterPointers = after.normalizedEffectiveContractPointers.sorted()
        val digestChanged = before.effectiveContract.sha256 != after.effectiveContract.sha256
        val membershipChanges =
            (beforePointers + afterPointers)
                .distinct()
                .sorted()
                .mapNotNull { pointer ->
                    val beforePresent = pointer in beforePointers
                    val afterPresent = pointer in afterPointers
                    if (beforePresent == afterPresent) {
                        null
                    } else {
                        sourceChange(
                            subjectKind = "effective-pointer",
                            canonicalSubject = "pointer:$pointer",
                            beforeFingerprint =
                                if (beforePresent) {
                                    canonicalCompatibilityFingerprint(before.effectiveContract.sha256)
                                } else {
                                    null
                                },
                            afterFingerprint =
                                if (afterPresent) {
                                    canonicalCompatibilityFingerprint(after.effectiveContract.sha256)
                                } else {
                                    null
                                },
                            beforeEvidence = before.effectiveContract,
                            afterEvidence = after.effectiveContract,
                        )
                    }
                }
        val digestChange =
            if (digestChanged) {
                listOf(
                    sourceChange(
                        subjectKind = before.effectiveContract.kind,
                        canonicalSubject = "${before.effectiveContract.kind}:${before.effectiveContract.identity}",
                        beforeFingerprint = canonicalCompatibilityFingerprint(before.effectiveContract.sha256),
                        afterFingerprint = canonicalCompatibilityFingerprint(after.effectiveContract.sha256),
                        beforeEvidence = before.effectiveContract,
                        afterEvidence = after.effectiveContract,
                    ),
                )
            } else {
                emptyList()
            }
        return membershipChanges + digestChange
    }

    private fun sourceChange(
        subjectKind: String,
        canonicalSubject: String,
        beforeFingerprint: String?,
        afterFingerprint: String?,
        beforeEvidence: CompatibilityEvidenceReference,
        afterEvidence: CompatibilityEvidenceReference,
    ): CompatibilityChange =
        CompatibilityChange(
            id =
                CompatibilityChangeId.create(
                    layer = layer,
                    subjectKind = subjectKind,
                    canonicalSubject = canonicalSubject,
                    beforeFingerprint = beforeFingerprint,
                    afterFingerprint = afterFingerprint,
                ),
            layer = layer,
            classification = CompatibilityClassification.UNKNOWN,
            summary = "Source contract evidence changed for $canonicalSubject",
            evidence = pairedEvidence(beforeEvidence, afterEvidence),
        )

    private fun validationFailure(evidence: SourceContractEvidence): CompatibilityUnavailableReason? {
        invalidCompatibilityEvidenceReason(
            references =
                listOf(evidence.effectiveContract) +
                    evidence.components.map { component ->
                        CompatibilityEvidenceReference(
                            kind = component.kind.wireName,
                            identity = component.identity,
                            sha256 = component.sha256,
                        )
                    },
        )?.let { reason -> return reason }
        require(evidence.effectiveContract.kind == "effective-contract") {
            "Source-contract evidence must use the effective-contract evidence kind."
        }
        requireUniqueSubjects(evidence.components.map(SourceContractComponent::canonicalSubject))
        require(evidence.normalizedEffectiveContractPointers.all(::isNormalizedJsonPointer)) {
            "Effective-contract pointers must already be normalized JSON Pointers."
        }
        return null
    }

    private fun isNormalizedJsonPointer(pointer: String): Boolean =
        pointer.isEmpty() ||
            (
                pointer.startsWith('/') &&
                    !pointer.contains(0.toChar()) &&
                    pointer.split('/').drop(1).all { token -> !token.contains('~') || TOKEN_ESCAPE.matches(token) }
            )

    private val TOKEN_ESCAPE: Regex = Regex("(?:[^~]|~[01])*")
}

internal data class SourceContractEvidence(
    internal val effectiveContract: CompatibilityEvidenceReference,
    internal val components: List<SourceContractComponent>,
    internal val normalizedEffectiveContractPointers: List<String>,
)

internal data class SourceContractComponent(
    internal val kind: SourceContractComponentKind,
    internal val identity: String,
    internal val sha256: String,
) {
    internal val canonicalSubject: String
        get() = "${kind.wireName}:$identity"
}

internal enum class SourceContractComponentKind(
    internal val wireName: String,
) {
    SOURCE("source"),
    REFERENCE("reference"),
    OVERLAY("overlay"),
}
