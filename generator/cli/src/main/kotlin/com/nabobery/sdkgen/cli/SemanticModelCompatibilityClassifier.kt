package com.nabobery.sdkgen.cli

/**
 * Classifies normalized semantic-model snapshot evidence without treating declaration evidence as semantic evidence.
 *
 * Canonical-subject grammar:
 * - `(semanticModel, node)`: `node:<normalized-semantic-pointer>`
 * - `(semanticModel, snapshot)`: `snapshot:<stable-semantic-snapshot-identity>`
 *
 * Worked example: the operation semantic node at `/operations/createChat` uses the canonical subject
 * `node:/operations/createChat`. Evidence uses `semantic-model`; optional declaration corroboration uses
 * `declaration-projection` and never satisfies the required semantic-model evidence on its own.
 */
internal object SemanticModelCompatibilityClassifier : CompatibilityLayerClassifier<SemanticModelEvidence> {
    override val layer: CompatibilityLayer = CompatibilityLayer.SEMANTIC_MODEL

    override fun classify(
        before: SemanticModelEvidence?,
        after: SemanticModelEvidence?,
    ): CompatibilityLayerClassificationResult {
        if (before == null || after == null) return unavailableClassification(layer)
        validationFailure(before)?.let { reason ->
            return unavailableClassification(layer, reason.code, reason.detail)
        }
        validationFailure(after)?.let { reason ->
            return unavailableClassification(layer, reason.code, reason.detail)
        }

        val nodeChanges = nodeChanges(before, after)
        val changes =
            if (nodeChanges.isNotEmpty() || before.semanticModel.sha256 == after.semanticModel.sha256) {
                nodeChanges
            } else {
                listOf(snapshotChange(before, after))
            }
        return classifiedLayer(layer, changes)
    }

    private fun nodeChanges(
        before: SemanticModelEvidence,
        after: SemanticModelEvidence,
    ): List<CompatibilityChange> =
        (
            before.nodes.map(SemanticModelNode::canonicalSubject) +
                after.nodes.map(SemanticModelNode::canonicalSubject)
        ).distinct()
            .sorted()
            .mapNotNull { subject ->
                val previous = before.nodes.singleOrNull { it.canonicalSubject == subject }
                val subsequent = after.nodes.singleOrNull { it.canonicalSubject == subject }
                if (previous?.fingerprint == subsequent?.fingerprint) {
                    null
                } else {
                    CompatibilityChange(
                        id =
                            CompatibilityChangeId.create(
                                layer = layer,
                                subjectKind = "node",
                                canonicalSubject = subject,
                                beforeFingerprint =
                                    previous?.fingerprint?.let(::canonicalCompatibilityFingerprint),
                                afterFingerprint =
                                    subsequent?.fingerprint?.let(::canonicalCompatibilityFingerprint),
                            ),
                        layer = layer,
                        classification = CompatibilityClassification.UNKNOWN,
                        summary = "Semantic model evidence changed for $subject",
                        evidence = evidenceFor(before, after),
                    )
                }
            }

    private fun snapshotChange(
        before: SemanticModelEvidence,
        after: SemanticModelEvidence,
    ): CompatibilityChange =
        CompatibilityChange(
            id =
                CompatibilityChangeId.create(
                    layer = layer,
                    subjectKind = "snapshot",
                    canonicalSubject = "snapshot:${after.semanticModel.identity}",
                    beforeFingerprint = canonicalCompatibilityFingerprint(before.semanticModel.sha256),
                    afterFingerprint = canonicalCompatibilityFingerprint(after.semanticModel.sha256),
                ),
            layer = layer,
            classification = CompatibilityClassification.UNKNOWN,
            summary = "Semantic model snapshot evidence changed",
            evidence = evidenceFor(before, after),
        )

    private fun evidenceFor(
        before: SemanticModelEvidence,
        after: SemanticModelEvidence,
    ): List<CompatibilityEvidenceReference> =
        pairedEvidence(before.semanticModel, after.semanticModel) +
            pairedEvidence(before.declarationModel, after.declarationModel)

    private fun validationFailure(evidence: SemanticModelEvidence): CompatibilityUnavailableReason? {
        invalidCompatibilityEvidenceReason(
            references = listOfNotNull(evidence.semanticModel, evidence.declarationModel),
            fingerprints = evidence.nodes.map(SemanticModelNode::fingerprint),
        )?.let { reason -> return reason }
        require(evidence.semanticModel.kind == "semantic-model") {
            "Semantic-model evidence must use the semantic-model evidence kind."
        }
        require(evidence.declarationModel == null || evidence.declarationModel.kind == "declaration-projection") {
            "Declaration corroboration must use the declaration-projection evidence kind."
        }
        requireUniqueSubjects(evidence.nodes.map(SemanticModelNode::canonicalSubject))
        require(
            evidence.nodes.all { node ->
                node.normalizedPointer.isNotEmpty() && !node.normalizedPointer.contains(0.toChar())
            },
        ) {
            "Semantic-model node pointers must be non-empty and normalized before comparison."
        }
        return null
    }
}

internal data class SemanticModelEvidence(
    internal val semanticModel: CompatibilityEvidenceReference,
    internal val nodes: List<SemanticModelNode>,
    internal val declarationModel: CompatibilityEvidenceReference? = null,
)

internal data class SemanticModelNode(
    internal val normalizedPointer: String,
    internal val fingerprint: String,
) {
    internal val canonicalSubject: String
        get() = "node:$normalizedPointer"
}
