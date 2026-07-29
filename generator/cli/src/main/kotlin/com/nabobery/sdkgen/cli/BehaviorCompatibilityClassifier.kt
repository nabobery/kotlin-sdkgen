package com.nabobery.sdkgen.cli

/**
 * Classifies parity scenario and wire records only; it accepts no source, declaration, or generated-file evidence.
 *
 * Canonical-subject grammar:
 * - `(behavior, scenario)`: `scenario:<exact-parity-fixture-identity>`
 *
 * Worked example: parity fixture `stripe.pagination.cursor` uses the canonical subject
 * `scenario:stripe.pagination.cursor`. Its evidence contains exactly the `parity-scenario` and `parity-wire` records
 * carrying that fixture identity. A changed wire record is behaviorally risky; no source-only input can reach this
 * classifier.
 */
internal object BehaviorCompatibilityClassifier : CompatibilityLayerClassifier<BehaviorEvidence> {
    override val layer: CompatibilityLayer = CompatibilityLayer.BEHAVIOR

    override fun classify(
        before: BehaviorEvidence?,
        after: BehaviorEvidence?,
    ): CompatibilityLayerClassificationResult {
        if (before == null || after == null) return unavailableClassification(layer, "missing-behavior-evidence")
        if (before.fixtures.isEmpty() || after.fixtures.isEmpty()) {
            return unavailableClassification(layer, "missing-behavior-evidence")
        }
        // Before any fingerprint is compared: a ledger of work the parity gate never ran is not evidence that behavior is
        // unchanged. Two all-`notRun` ledgers agree on every fingerprint, so comparison alone cannot tell the
        // difference between "nothing changed" and "nothing was observed" -- only this check can.
        unusableEvidenceReason(before, after)?.let { reason ->
            return unavailableClassification(layer, reason.code, reason.detail)
        }
        validationFailure(before)?.let { reason ->
            return unavailableClassification(layer, reason.code, reason.detail)
        }
        validationFailure(after)?.let { reason ->
            return unavailableClassification(layer, reason.code, reason.detail)
        }
        val changes =
            (
                before.fixtures.map(BehaviorFixtureEvidence::canonicalSubject) +
                    after.fixtures.map(BehaviorFixtureEvidence::canonicalSubject)
            ).distinct()
                .sorted()
                .mapNotNull { subject ->
                    val previous = before.fixtures.singleOrNull { it.canonicalSubject == subject }
                    val subsequent = after.fixtures.singleOrNull { it.canonicalSubject == subject }
                    if (previous?.fingerprint() == subsequent?.fingerprint()) {
                        null
                    } else {
                        behaviorChange(subject, previous, subsequent)
                    }
                }
        return classifiedLayer(layer, changes)
    }

    private fun behaviorChange(
        subject: String,
        before: BehaviorFixtureEvidence?,
        after: BehaviorFixtureEvidence?,
    ): CompatibilityChange =
        CompatibilityChange(
            id =
                CompatibilityChangeId.create(
                    layer = layer,
                    subjectKind = "scenario",
                    canonicalSubject = subject,
                    beforeFingerprint = before?.fingerprint(),
                    afterFingerprint = after?.fingerprint(),
                ),
            layer = layer,
            classification =
                when {
                    before == null || after == null -> CompatibilityClassification.UNKNOWN
                    before.scenario.sha256 != after.scenario.sha256 -> CompatibilityClassification.UNKNOWN
                    else -> CompatibilityClassification.BEHAVIORALLY_RISKY
                },
            summary = summaryFor(subject, before, after),
            evidence = fixtureEvidence(before, after),
        )

    private fun summaryFor(
        subject: String,
        before: BehaviorFixtureEvidence?,
        after: BehaviorFixtureEvidence?,
    ): String =
        when {
            before == null -> "Add parity behavior fixture $subject"
            after == null -> "Remove parity behavior fixture $subject"
            before.scenario.sha256 != after.scenario.sha256 -> "Change parity scenario fixture $subject"
            else -> "Change parity wire evidence for $subject"
        }

    private fun fixtureEvidence(
        before: BehaviorFixtureEvidence?,
        after: BehaviorFixtureEvidence?,
    ): List<CompatibilityEvidenceReference> =
        listOfNotNull(
            before?.scenario,
            before?.wire,
            after?.scenario,
            after?.wire,
        )

    /** Returns the first side's unusability reason, so the report names which ledger failed and why. */
    private fun unusableEvidenceReason(vararg sides: BehaviorEvidence): CompatibilityUnavailableReason? =
        sides
            .asSequence()
            .map(BehaviorEvidence::availability)
            .filterIsInstance<BehaviorEvidenceAvailability.Unusable>()
            .firstOrNull()
            ?.let { unusable -> CompatibilityUnavailableReason(code = unusable.code, detail = unusable.detail) }

    private fun validationFailure(evidence: BehaviorEvidence): CompatibilityUnavailableReason? {
        invalidCompatibilityEvidenceReason(
            references =
                evidence.fixtures.flatMap { fixture ->
                    listOf(fixture.scenario, fixture.wire)
                },
        )?.let { reason -> return reason }

        // Every failure below returns a typed reason rather than throwing. An invalid input is an `unavailable`
        // layer with a stated cause -- the same contract as the fingerprint check above -- not a crash that
        // bypasses the report entirely.
        val subjects = evidence.fixtures.map(BehaviorFixtureEvidence::canonicalSubject)
        if (subjects.size != subjects.distinct().size) {
            return CompatibilityUnavailableReason(
                code = "invalid-evidence-reference",
                detail = "Behavior evidence contains duplicate canonical subjects.",
            )
        }
        evidence.fixtures.forEach { fixture ->
            val malformed =
                when {
                    fixture.scenario.kind != "parity-scenario" -> {
                        "Behavior scenario evidence must use the parity-scenario evidence kind."
                    }

                    fixture.wire.kind != "parity-wire" -> {
                        "Behavior wire evidence must use the parity-wire evidence kind."
                    }

                    fixture.scenario.identity != fixture.fixtureIdentity -> {
                        "Behavior scenario evidence identity must equal its fixture identity."
                    }

                    fixture.wire.identity != fixture.fixtureIdentity -> {
                        "Behavior wire evidence identity must equal its fixture identity."
                    }

                    else -> {
                        null
                    }
                }
            if (malformed != null) {
                return CompatibilityUnavailableReason(code = "invalid-evidence-reference", detail = malformed)
            }
        }
        return null
    }
}

internal data class BehaviorEvidence(
    internal val fixtures: List<BehaviorFixtureEvidence>,
    /** Whether the parity gate established these fixtures, derived by [BehaviorEvidenceReader] from the parity gate's record. */
    internal val availability: BehaviorEvidenceAvailability,
)

/**
 * Whether a parity ledger may be compared at all.
 *
 * Deliberately has no default and no "assume usable" constructor: making usability explicit at every construction
 * site is what stops an unrun ledger from silently becoming a passing comparison.
 */
internal sealed interface BehaviorEvidenceAvailability {
    /** The parity gate ran the required fixtures at one commit and passed. */
    data object Usable : BehaviorEvidenceAvailability

    /** The parity record does not establish the behavior it enumerates; [code] states which precondition failed. */
    data class Unusable(
        internal val code: String,
        internal val detail: String,
    ) : BehaviorEvidenceAvailability
}

internal data class BehaviorFixtureEvidence(
    internal val fixtureIdentity: String,
    internal val scenario: CompatibilityEvidenceReference,
    internal val wire: CompatibilityEvidenceReference,
) {
    internal val canonicalSubject: String
        get() = "scenario:$fixtureIdentity"

    internal fun fingerprint(): String = normalizedCompatibilityFingerprint(scenario.sha256 + "|" + wire.sha256)
}
