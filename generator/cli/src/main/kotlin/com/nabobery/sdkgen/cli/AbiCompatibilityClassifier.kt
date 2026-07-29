package com.nabobery.sdkgen.cli

// Imported rather than aliased: a Kotlin typealias cannot qualify a nested classifier, so `Available`
// does not resolve. Importing the sealed subtypes keeps line lengths in check and resolves correctly.
import com.nabobery.sdkgen.cli.GeneratedSdkKlibTargetState.Available
import com.nabobery.sdkgen.cli.GeneratedSdkKlibTargetState.Unavailable

/**
 * Classifies staged **generated-SDK** ABI evidence: one JVM BCV dump and zero or more independently staged
 * per-target KLib dumps, per ADR 0007.
 *
 * **Boundary (ADR 0013, "Evidence sources", lines 122-126):** this classifier compares generated-SDK artifacts
 * only. It never accepts or derives evidence from `SdkgenProductStagedArtifactInventory` (the product-publication inventory of
 * the eight ADR-0008 SDKGen *product* publications) — see [GeneratedSdkAbiEvidence]'s KDoc for the
 * structural boundary that makes the two evidence lanes impossible to confuse.
 *
 * Canonical-subject grammar (feeds ADR 0013's `compat-v1:<layer>:<subject-kind>:<digest16>` change-ID form):
 *
 * - `(abi, jvm-artifact)`:
 *   - `<sdk-identity>` — the staged JVM artifact's own presence transition (added or removed in full).
 *   - `<sdk-identity>#<binary-class-name>` — one class/interface header line from the staged BCV `.api` dump
 *     (`<binary-class-name>` is the dump's own JVM-internal binary name, for example
 *     `com/nabobery/generated/ChatClient`).
 *   - `<sdk-identity>#<binary-class-name>#<jvm-member-key>` — one member line (`fun` or `field`) inside that
 *     class, where `<jvm-member-key>` is `<fun|field>:<member-name>` taken verbatim from the dump, mangled
 *     names included (for example `fun:getId-tu4gHC8`).
 *
 * - `(abi, klib-artifact)`:
 *   - `<sdk-identity>:<target-name>` — one KLib target's own presence/availability transition: added, removed,
 *     became unavailable, remained unavailable, or became available with no prior comparable dump.
 *   - `<sdk-identity>:<target-name>#<declaration-signature-id>` — one `klib dump-abi` declaration, where
 *     `<declaration-signature-id>` is that declaration's own trailing mangled-signature comment (for example
 *     `com.nabobery.abiexperiment/Widget.id.<get-id>|<get-id>(){}[0]`). `klib dump-abi` already keeps this
 *     identifier stable across reordering and reformatting, which is exactly what "reformatting must not read
 *     as a change" requires.
 *
 * Worked example (`jvm-artifact`): removing the `getName()` accessor from SDK `openrouter`'s staged JVM jar
 * produces canonical subject `openrouter#com/nabobery/generated/Widget#fun:getName` with classification
 * `breaking`.
 *
 * Worked example (`klib-artifact`): the `linuxX64` target becoming unavailable (host limitation) for SDK
 * `openrouter` produces canonical subject `openrouter:linuxX64` with classification `unknown` — a host
 * limitation is never silently read as "unchanged".
 */
internal object AbiCompatibilityClassifier : CompatibilityLayerClassifier<GeneratedSdkAbiEvidence> {
    override val layer: CompatibilityLayer = CompatibilityLayer.ABI

    private const val SUBJECT_KIND_JVM: String = "jvm-artifact"
    private const val SUBJECT_KIND_KLIB: String = "klib-artifact"
    private const val EVIDENCE_KIND_JVM: String = "jvm-abi-dump"
    private const val EVIDENCE_KIND_KLIB: String = "klib-abi-dump"
    private const val KLIB_HEADER: String = "// Klib ABI Dump"

    override fun classify(
        before: GeneratedSdkAbiEvidence?,
        after: GeneratedSdkAbiEvidence?,
    ): CompatibilityLayerClassificationResult {
        if (before == null || after == null) return unavailableClassification(layer)
        validationFailure(before)?.let { reason -> return unavailableClassification(layer, reason.code, reason.detail) }
        validationFailure(after)?.let { reason -> return unavailableClassification(layer, reason.code, reason.detail) }
        if (before.sdkIdentity != after.sdkIdentity) {
            return unavailableClassification(
                layer = layer,
                code = "mismatched-sdk-identity",
                detail =
                    "Generated-SDK ABI evidence sdkIdentity differs between before (${before.sdkIdentity}) " +
                        "and after (${after.sdkIdentity}).",
            )
        }

        // Guard against the "comparison over zero targets/artifacts silently reports compatible" bug: if
        // neither side declares a JVM artifact and neither side declares any KLib target (available or
        // unavailable), there is nothing to compare, and that must never be reported as unchanged.
        val targetNameUnion =
            (before.klibTargets.map { it.targetName } + after.klibTargets.map { it.targetName }).distinct()
        val hasJvmSubject = before.jvm != null || after.jvm != null
        if (!hasJvmSubject && targetNameUnion.isEmpty()) {
            return unavailableClassification(
                layer = layer,
                code = "no-staged-generated-sdk-artifacts",
                detail = "Evidence for SDK '${before.sdkIdentity}' declares no JVM artifact and no KLib targets.",
            )
        }

        val changes =
            jvmArtifactChanges(before, after) +
                targetNameUnion.sorted().flatMap { targetName ->
                    klibTargetChanges(before, after, targetName)
                }
        return classifiedLayer(layer, changes)
    }

    // ---- JVM ----------------------------------------------------------------------------------------------

    private fun jvmArtifactChanges(
        before: GeneratedSdkAbiEvidence,
        after: GeneratedSdkAbiEvidence,
    ): List<CompatibilityChange> {
        val beforeArtifact = before.jvm
        val afterArtifact = after.jvm
        if (beforeArtifact == null && afterArtifact == null) return emptyList()
        if (beforeArtifact == null || afterArtifact == null) {
            return listOf(
                jvmChange(
                    sdkIdentity = before.sdkIdentity,
                    subjectSuffix = null,
                    classification =
                        if (beforeArtifact == null) {
                            CompatibilityClassification.ADDITIVE
                        } else {
                            CompatibilityClassification.BREAKING
                        },
                    summary =
                        if (beforeArtifact == null) {
                            "Add JVM ABI artifact for ${before.sdkIdentity}"
                        } else {
                            "Remove JVM ABI artifact for ${before.sdkIdentity}"
                        },
                    beforeFingerprint = beforeArtifact?.let { normalizedCompatibilityFingerprint(it.dumpText) },
                    afterFingerprint = afterArtifact?.let { normalizedCompatibilityFingerprint(it.dumpText) },
                    beforeEvidence =
                        beforeArtifact?.evidence
                            ?: syntheticJvmEvidence(before.sdkIdentity, "absent"),
                    afterEvidence =
                        afterArtifact?.evidence
                            ?: syntheticJvmEvidence(before.sdkIdentity, "absent"),
                ),
            )
        }

        val beforeMembers = parseJvmDeclarations(beforeArtifact.dumpText)
        val afterMembers = parseJvmDeclarations(afterArtifact.dumpText)
        return (beforeMembers.keys + afterMembers.keys).distinct().sorted().mapNotNull { key ->
            val previous = beforeMembers[key]
            val subsequent = afterMembers[key]
            if (previous == subsequent) {
                null
            } else {
                jvmChange(
                    sdkIdentity = before.sdkIdentity,
                    subjectSuffix = key,
                    classification =
                        if (previous == null) {
                            CompatibilityClassification.ADDITIVE
                        } else {
                            CompatibilityClassification.BREAKING
                        },
                    summary = jvmMemberSummary(key, previous, subsequent),
                    beforeFingerprint = previous?.let(::normalizedCompatibilityFingerprint),
                    afterFingerprint = subsequent?.let(::normalizedCompatibilityFingerprint),
                    beforeEvidence = beforeArtifact.evidence,
                    afterEvidence = afterArtifact.evidence,
                )
            }
        }
    }

    private fun jvmMemberSummary(
        key: String,
        previous: String?,
        subsequent: String?,
    ): String =
        when {
            previous == null -> "Add JVM ABI entry $key"
            subsequent == null -> "Remove JVM ABI entry $key"
            else -> "Change JVM ABI entry $key"
        }

    private fun jvmChange(
        sdkIdentity: String,
        subjectSuffix: String?,
        classification: CompatibilityClassification,
        summary: String,
        beforeFingerprint: String?,
        afterFingerprint: String?,
        beforeEvidence: CompatibilityEvidenceReference,
        afterEvidence: CompatibilityEvidenceReference,
    ): CompatibilityChange {
        val subject = if (subjectSuffix == null) sdkIdentity else "$sdkIdentity#$subjectSuffix"
        return CompatibilityChange(
            id =
                CompatibilityChangeId.create(
                    layer = layer,
                    subjectKind = SUBJECT_KIND_JVM,
                    canonicalSubject = subject,
                    beforeFingerprint = beforeFingerprint,
                    afterFingerprint = afterFingerprint,
                ),
            layer = layer,
            classification = classification,
            summary = summary,
            evidence = pairedEvidence(beforeEvidence, afterEvidence),
        )
    }

    private fun syntheticJvmEvidence(
        sdkIdentity: String,
        state: String,
    ): CompatibilityEvidenceReference {
        val identity = "$sdkIdentity:jvm:$state"
        return CompatibilityEvidenceReference(
            kind = EVIDENCE_KIND_JVM,
            identity = identity,
            sha256 = normalizedCompatibilityFingerprint(identity),
        )
    }

    /**
     * Splits a staged BCV `.api` dump into a stable `<binary-class-name>[#<jvm-member-key>] -> normalized line`
     * map. Column-zero lines are class/interface headers; indented lines belong to the most recently seen
     * header. Whitespace is collapsed so tab-vs-space or extra-space formatting differences never surface as a
     * change, while ordering is irrelevant because the result is compared as a map keyed by stable identity.
     */
    private fun parseJvmDeclarations(text: String): Map<String, String> {
        val result = linkedMapOf<String, String>()
        var currentClass: String? = null
        text.lines().forEach { rawLine ->
            if (rawLine.isBlank()) return@forEach
            val trimmed = collapseWhitespace(rawLine)
            if (rawLine.first().isWhitespace()) {
                val cls = currentClass ?: return@forEach
                val memberKey = extractJvmMemberKey(trimmed) ?: trimmed
                result["$cls#$memberKey"] = trimmed
            } else {
                val className = extractJvmClassName(trimmed)
                if (className != null) {
                    currentClass = className
                    result[className] = trimmed
                }
            }
        }
        return result
    }

    private fun extractJvmClassName(trimmedLine: String): String? =
        JVM_CLASS_HEADER.find(trimmedLine)?.groupValues?.get(1)

    private fun extractJvmMemberKey(trimmedLine: String): String? =
        JVM_MEMBER_KEY.find(trimmedLine)?.let { match -> "${match.groupValues[1]}:${match.groupValues[2]}" }

    private fun validateJvmDumpText(text: String): CompatibilityUnavailableReason? =
        if (text.isBlank()) {
            CompatibilityUnavailableReason("malformed-jvm-abi-dump", "JVM ABI dump text is blank.")
        } else {
            null
        }

    // ---- KLib -----------------------------------------------------------------------------------------------

    private fun klibTargetChanges(
        before: GeneratedSdkAbiEvidence,
        after: GeneratedSdkAbiEvidence,
        targetName: String,
    ): List<CompatibilityChange> {
        val previous = before.klibTargets.singleOrNull { it.targetName == targetName }?.state
        val subsequent = after.klibTargets.singleOrNull { it.targetName == targetName }?.state
        val sdkIdentity = before.sdkIdentity
        val absentEvidence = syntheticKlibEvidence(sdkIdentity, targetName, "absent")

        fun unavailableEvidence(reasonCode: String) =
            syntheticKlibEvidence(sdkIdentity, targetName, "unavailable:$reasonCode")

        val change =
            when {
                previous == null && subsequent is Available -> {
                    klibTargetLevelChange(
                        sdkIdentity,
                        targetName,
                        CompatibilityClassification.ADDITIVE,
                        "Add KLib target $targetName",
                        beforeFingerprint = null,
                        afterFingerprint = normalizedCompatibilityFingerprint(subsequent.dumpText),
                        beforeEvidence = absentEvidence,
                        afterEvidence = subsequent.evidence,
                    )
                }

                previous == null && subsequent is Unavailable -> {
                    klibTargetLevelChange(
                        sdkIdentity,
                        targetName,
                        CompatibilityClassification.UNKNOWN,
                        "KLib target $targetName attempted but unavailable: ${subsequent.reasonCode}",
                        beforeFingerprint = null,
                        afterFingerprint = unavailableFingerprint(subsequent.reasonCode),
                        beforeEvidence = absentEvidence,
                        afterEvidence = unavailableEvidence(subsequent.reasonCode),
                    )
                }

                previous is Available && subsequent == null -> {
                    klibTargetLevelChange(
                        sdkIdentity,
                        targetName,
                        CompatibilityClassification.BREAKING,
                        "Remove KLib target $targetName",
                        beforeFingerprint = normalizedCompatibilityFingerprint(previous.dumpText),
                        afterFingerprint = null,
                        beforeEvidence = previous.evidence,
                        afterEvidence = absentEvidence,
                    )
                }

                previous is Unavailable && subsequent == null -> {
                    klibTargetLevelChange(
                        sdkIdentity,
                        targetName,
                        CompatibilityClassification.UNKNOWN,
                        "KLib target $targetName no longer attempted " +
                            "(previously unavailable: ${previous.reasonCode})",
                        beforeFingerprint = unavailableFingerprint(previous.reasonCode),
                        afterFingerprint = null,
                        beforeEvidence = unavailableEvidence(previous.reasonCode),
                        afterEvidence = absentEvidence,
                    )
                }

                previous is Unavailable && subsequent is Unavailable -> {
                    klibTargetLevelChange(
                        sdkIdentity,
                        targetName,
                        CompatibilityClassification.UNKNOWN,
                        if (previous.reasonCode == subsequent.reasonCode) {
                            "KLib target $targetName remains unavailable: ${subsequent.reasonCode}"
                        } else {
                            "KLib target $targetName unavailability reason changed from " +
                                "${previous.reasonCode} to ${subsequent.reasonCode}"
                        },
                        beforeFingerprint = unavailableFingerprint(previous.reasonCode),
                        afterFingerprint = unavailableFingerprint(subsequent.reasonCode),
                        beforeEvidence = unavailableEvidence(previous.reasonCode),
                        afterEvidence = unavailableEvidence(subsequent.reasonCode),
                    )
                }

                previous is Available && subsequent is Unavailable -> {
                    klibTargetLevelChange(
                        sdkIdentity,
                        targetName,
                        CompatibilityClassification.UNKNOWN,
                        "KLib target $targetName became unavailable: ${subsequent.reasonCode}; " +
                            "prior dump can no longer be compared",
                        beforeFingerprint = normalizedCompatibilityFingerprint(previous.dumpText),
                        afterFingerprint = unavailableFingerprint(subsequent.reasonCode),
                        beforeEvidence = previous.evidence,
                        afterEvidence = unavailableEvidence(subsequent.reasonCode),
                    )
                }

                previous is Unavailable && subsequent is Available -> {
                    klibTargetLevelChange(
                        sdkIdentity,
                        targetName,
                        CompatibilityClassification.UNKNOWN,
                        "KLib target $targetName became available; no prior dump exists for comparison",
                        beforeFingerprint = unavailableFingerprint(previous.reasonCode),
                        afterFingerprint = normalizedCompatibilityFingerprint(subsequent.dumpText),
                        beforeEvidence = unavailableEvidence(previous.reasonCode),
                        afterEvidence = subsequent.evidence,
                    )
                }

                previous is Available && subsequent is Available -> {
                    return klibDeclarationChanges(sdkIdentity, targetName, previous, subsequent)
                }

                else -> {
                    null
                }
            }
        return listOfNotNull(change)
    }

    private fun klibDeclarationChanges(
        sdkIdentity: String,
        targetName: String,
        previous: Available,
        subsequent: Available,
    ): List<CompatibilityChange> {
        val beforeDeclarations = parseKlibDeclarations(previous.dumpText)
        val afterDeclarations = parseKlibDeclarations(subsequent.dumpText)
        return (beforeDeclarations.keys + afterDeclarations.keys).distinct().sorted().mapNotNull { signatureId ->
            val previousText = beforeDeclarations[signatureId]
            val subsequentText = afterDeclarations[signatureId]
            if (previousText == subsequentText) {
                null
            } else {
                klibDeclarationLevelChange(
                    sdkIdentity = sdkIdentity,
                    targetName = targetName,
                    signatureId = signatureId,
                    classification =
                        if (previousText == null) {
                            CompatibilityClassification.ADDITIVE
                        } else {
                            CompatibilityClassification.BREAKING
                        },
                    summary = klibDeclarationSummary(signatureId, previousText, subsequentText),
                    beforeFingerprint = previousText?.let(::normalizedCompatibilityFingerprint),
                    afterFingerprint = subsequentText?.let(::normalizedCompatibilityFingerprint),
                    beforeEvidence = previous.evidence,
                    afterEvidence = subsequent.evidence,
                )
            }
        }
    }

    private fun klibDeclarationSummary(
        signatureId: String,
        previous: String?,
        subsequent: String?,
    ): String =
        when {
            previous == null -> "Add KLib declaration $signatureId"
            subsequent == null -> "Remove KLib declaration $signatureId"
            else -> "Change KLib declaration $signatureId"
        }

    private fun klibTargetLevelChange(
        sdkIdentity: String,
        targetName: String,
        classification: CompatibilityClassification,
        summary: String,
        beforeFingerprint: String?,
        afterFingerprint: String?,
        beforeEvidence: CompatibilityEvidenceReference,
        afterEvidence: CompatibilityEvidenceReference,
    ): CompatibilityChange =
        klibChange(
            canonicalSubject = "$sdkIdentity:$targetName",
            classification = classification,
            summary = summary,
            beforeFingerprint = beforeFingerprint,
            afterFingerprint = afterFingerprint,
            beforeEvidence = beforeEvidence,
            afterEvidence = afterEvidence,
        )

    private fun klibDeclarationLevelChange(
        sdkIdentity: String,
        targetName: String,
        signatureId: String,
        classification: CompatibilityClassification,
        summary: String,
        beforeFingerprint: String?,
        afterFingerprint: String?,
        beforeEvidence: CompatibilityEvidenceReference,
        afterEvidence: CompatibilityEvidenceReference,
    ): CompatibilityChange =
        klibChange(
            canonicalSubject = "$sdkIdentity:$targetName#$signatureId",
            classification = classification,
            summary = summary,
            beforeFingerprint = beforeFingerprint,
            afterFingerprint = afterFingerprint,
            beforeEvidence = beforeEvidence,
            afterEvidence = afterEvidence,
        )

    private fun klibChange(
        canonicalSubject: String,
        classification: CompatibilityClassification,
        summary: String,
        beforeFingerprint: String?,
        afterFingerprint: String?,
        beforeEvidence: CompatibilityEvidenceReference,
        afterEvidence: CompatibilityEvidenceReference,
    ): CompatibilityChange =
        CompatibilityChange(
            id =
                CompatibilityChangeId.create(
                    layer = layer,
                    subjectKind = SUBJECT_KIND_KLIB,
                    canonicalSubject = canonicalSubject,
                    beforeFingerprint = beforeFingerprint,
                    afterFingerprint = afterFingerprint,
                ),
            layer = layer,
            classification = classification,
            summary = summary,
            evidence = pairedEvidence(beforeEvidence, afterEvidence),
        )

    private fun unavailableFingerprint(reasonCode: String): String =
        normalizedCompatibilityFingerprint("unavailable:$reasonCode")

    private fun syntheticKlibEvidence(
        sdkIdentity: String,
        targetName: String,
        state: String,
    ): CompatibilityEvidenceReference {
        val identity = "$sdkIdentity:$targetName:$state"
        return CompatibilityEvidenceReference(
            kind = EVIDENCE_KIND_KLIB,
            identity = identity,
            sha256 = normalizedCompatibilityFingerprint(identity),
        )
    }

    /**
     * Splits a staged `klib dump-abi` dump into a `<trailing-signature-id> -> normalized declaration text`
     * map. The signature id (everything after the last `" // "` on a declaration line) is `klib dump-abi`'s
     * own stable identity and is unaffected by reordering or reformatting; the declaration text before it is
     * whitespace-collapsed so pure formatting differences never surface as a change either.
     */
    private fun parseKlibDeclarations(text: String): Map<String, String> {
        val result = linkedMapOf<String, String>()
        text.lines().forEach { rawLine ->
            if (rawLine.isBlank() || isKlibMetadataLine(rawLine) || isKlibStructuralOnlyLine(rawLine)) return@forEach
            val separatorIndex = rawLine.lastIndexOf(KLIB_SIGNATURE_SEPARATOR)
            if (separatorIndex < 0) return@forEach
            val declaration = collapseWhitespace(rawLine.substring(0, separatorIndex))
            val signatureId = rawLine.substring(separatorIndex + KLIB_SIGNATURE_SEPARATOR.length).trim()
            result[signatureId] = declaration
        }
        return result
    }

    private fun isKlibMetadataLine(line: String): Boolean {
        val trimmed = line.trim()
        return trimmed == KLIB_HEADER || KLIB_METADATA_PREFIXES.any { prefix -> trimmed.startsWith(prefix) }
    }

    /**
     * A bare block-closing brace, for example the `}` that ends a class or interface body. `klib dump-abi`
     * emits these with no trailing mangled-signature comment because the brace carries no ABI information of
     * its own; the declaration it closes was already captured on its own header line.
     */
    private fun isKlibStructuralOnlyLine(line: String): Boolean = line.trim() == "}"

    private fun validateKlibDumpText(text: String): CompatibilityUnavailableReason? {
        if (text.isBlank()) {
            return CompatibilityUnavailableReason("malformed-klib-abi-dump", "KLib ABI dump text is blank.")
        }
        val lines = text.lines()
        if (lines.none { line -> line.trim() == KLIB_HEADER }) {
            return CompatibilityUnavailableReason(
                "malformed-klib-abi-dump",
                "KLib ABI dump is missing the '$KLIB_HEADER' header.",
            )
        }
        val contentLines =
            lines.filter { line -> line.isNotBlank() && !isKlibMetadataLine(line) && !isKlibStructuralOnlyLine(line) }
        if (contentLines.any { line -> !line.contains(KLIB_SIGNATURE_SEPARATOR) }) {
            return CompatibilityUnavailableReason(
                "malformed-klib-abi-dump",
                "KLib ABI dump contains a declaration line without a trailing mangled-signature comment.",
            )
        }
        val signatureIds =
            contentLines.map { line ->
                val start = line.lastIndexOf(KLIB_SIGNATURE_SEPARATOR) + KLIB_SIGNATURE_SEPARATOR.length
                line.substring(start).trim()
            }
        if (signatureIds.distinct().size != signatureIds.size) {
            return CompatibilityUnavailableReason(
                "malformed-klib-abi-dump",
                "KLib ABI dump contains a duplicate declaration signature id.",
            )
        }
        return null
    }

    // ---- Shared evidence validation -------------------------------------------------------------------------

    private fun validationFailure(evidence: GeneratedSdkAbiEvidence): CompatibilityUnavailableReason? {
        if (evidence.sdkIdentity.isBlank()) {
            return CompatibilityUnavailableReason(
                "invalid-evidence-reference",
                "Generated-SDK ABI evidence sdkIdentity must be non-empty.",
            )
        }
        evidence.jvm?.let { jvm ->
            invalidCompatibilityEvidenceReason(listOf(jvm.evidence))?.let { reason -> return reason }
            if (jvm.evidence.kind != EVIDENCE_KIND_JVM) {
                return CompatibilityUnavailableReason(
                    "invalid-evidence-reference",
                    "JVM ABI evidence must use the $EVIDENCE_KIND_JVM evidence kind.",
                )
            }
            validateJvmDumpText(jvm.dumpText)?.let { reason -> return reason }
        }

        val targetNames = evidence.klibTargets.map { it.targetName }
        val hasInvalidTargetName =
            targetNames.any { name ->
                name.isBlank() || name.contains(':') || name.contains('#') || name.contains(0.toChar())
            }
        if (hasInvalidTargetName) {
            return CompatibilityUnavailableReason(
                "invalid-evidence-reference",
                "KLib target names must be non-empty and must not contain ':', '#', or NUL.",
            )
        }
        if (targetNames.distinct().size != targetNames.size) {
            return CompatibilityUnavailableReason(
                "invalid-evidence-reference",
                "Generated-SDK ABI evidence must not declare a duplicate KLib target.",
            )
        }

        evidence.klibTargets.forEach { target ->
            when (val state = target.state) {
                is Available -> {
                    invalidCompatibilityEvidenceReason(listOf(state.evidence))?.let { reason -> return reason }
                    if (state.evidence.kind != EVIDENCE_KIND_KLIB) {
                        return CompatibilityUnavailableReason(
                            "invalid-evidence-reference",
                            "KLib ABI evidence must use the $EVIDENCE_KIND_KLIB evidence kind.",
                        )
                    }
                    validateKlibDumpText(state.dumpText)?.let { reason -> return reason }
                }

                is Unavailable -> {
                    if (state.reasonCode.isBlank()) {
                        return CompatibilityUnavailableReason(
                            "invalid-evidence-reference",
                            "An unavailable KLib target must declare a non-empty reason code.",
                        )
                    }
                }
            }
        }
        return null
    }

    private fun collapseWhitespace(value: String): String = value.trim().replace(WHITESPACE_RUN, " ")

    private val JVM_CLASS_HEADER: Regex = Regex("""\b(?:class|interface)\s+(\S+)""")
    private val JVM_MEMBER_KEY: Regex = Regex("""\b(fun|field)\s+(\S+)""")
    private val WHITESPACE_RUN: Regex = Regex("""\s+""")
    private const val KLIB_SIGNATURE_SEPARATOR: String = " // "
    private val KLIB_METADATA_PREFIXES: List<String> =
        listOf("// Targets:", "// Rendering settings:", "// -", "// Library unique name:")
}

/**
 * Generated-SDK ABI evidence: a staged JVM artifact's BCV dump plus zero or more independently staged KLib
 * targets, for exactly one generated SDK.
 *
 * **This type is structurally disjoint from `SdkgenProductStagedArtifactInventory`** (the product-publication inventory of the
 * eight ADR-0008 SDKGen *product* publications, in
 * `build-logic/.../publication/inventory/StagedArtifactInventory.kt`).
 * That inventory has no constructor, factory, or extension function that produces a [GeneratedSdkAbiEvidence],
 * [GeneratedSdkJvmAbiArtifact], or [GeneratedSdkKlibAbiTarget], and this file does not import or reference it.
 * The two evidence lanes therefore cannot be conflated by accidental reuse: producing [GeneratedSdkAbiEvidence]
 * always requires an independent, generated-SDK-specific dump, never a product-publication artifact.
 *
 * @property sdkIdentity a stable, non-empty identity for the generated SDK under comparison (for example
 *   `openrouter`, `github`, or `stripe`), never a host path.
 * @property jvm the staged JVM artifact's BCV `.api` dump, or `null` if this SDK stages no JVM artifact.
 * @property klibTargets one entry per KMP target this SDK's build matrix attempts. A target entirely absent
 *   from this list (on either side of a comparison) is treated as "not part of the build matrix", which is
 *   distinct from [GeneratedSdkKlibTargetState.Unavailable] ("attempted, but no dump could be produced").
 */
internal data class GeneratedSdkAbiEvidence(
    internal val sdkIdentity: String,
    internal val jvm: GeneratedSdkJvmAbiArtifact?,
    internal val klibTargets: List<GeneratedSdkKlibAbiTarget> = emptyList(),
)

/** One staged JVM artifact's BCV `.api` dump text and its evidence reference (`jvm-abi-dump`). */
internal data class GeneratedSdkJvmAbiArtifact(
    internal val dumpText: String,
    internal val evidence: CompatibilityEvidenceReference,
)

/** One KMP target's KLib ABI state within a [GeneratedSdkAbiEvidence]. */
internal data class GeneratedSdkKlibAbiTarget(
    internal val targetName: String,
    internal val state: GeneratedSdkKlibTargetState,
)

/**
 * A KLib target's staged-dump state. [Available] and [Unavailable] are deliberately distinct from the target
 * being entirely absent from [GeneratedSdkAbiEvidence.klibTargets] (see that property's KDoc): three states,
 * not two, because "no dump produced" (a named, reportable host limitation) must never be conflated with
 * either "no comparable change" or "not part of this SDK's build matrix".
 */
internal sealed interface GeneratedSdkKlibTargetState {
    /** A `klib dump-abi` dump was produced for this target and staged `.klib`. */
    data class Available(
        val dumpText: String,
        val evidence: CompatibilityEvidenceReference,
    ) : GeneratedSdkKlibTargetState

    /**
     * This target was attempted but no dump could be produced (for example an Apple target off macOS, per
     * ADR 0007 lines 69-70). [reasonCode] must name the specific reason; it is never a generic "unavailable".
     */
    data class Unavailable(
        val reasonCode: String,
        val detail: String? = null,
    ) : GeneratedSdkKlibTargetState
}
