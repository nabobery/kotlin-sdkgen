package com.nabobery.sdkgen.cli

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class AbiCompatibilityClassifierTest {
    // ---- Whole-layer availability -----------------------------------------------------------------------

    @Test
    fun missingEvidenceOnEitherSideIsUnavailableRatherThanCompatible() {
        val evidence = fixtureEvidence(jvm = jvmArtifact(JVM_BASELINE))

        val bothMissing = AbiCompatibilityClassifier.classify(null, null)
        val oneMissing = AbiCompatibilityClassifier.classify(null, evidence)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, bothMissing.layerReport.outcome)
        assertEquals("missing-layer-evidence", bothMissing.layerReport.unavailableReason?.code)
        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, oneMissing.layerReport.outcome)
        assertEquals("missing-layer-evidence", oneMissing.layerReport.unavailableReason?.code)
    }

    @Test
    fun zeroStagedArtifactsIsUnavailableRatherThanCompatible() {
        val empty = fixtureEvidence(jvm = null, klibTargets = emptyList())

        val result = AbiCompatibilityClassifier.classify(empty, empty)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals("no-staged-generated-sdk-artifacts", result.layerReport.unavailableReason?.code)
        assertTrue(result.changes.isEmpty())
    }

    @Test
    fun mismatchedSdkIdentityIsUnavailable() {
        val before = fixtureEvidence(sdkIdentity = "openrouter", jvm = jvmArtifact(JVM_BASELINE))
        val after = fixtureEvidence(sdkIdentity = "github", jvm = jvmArtifact(JVM_BASELINE))

        val result = AbiCompatibilityClassifier.classify(before, after)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals("mismatched-sdk-identity", result.layerReport.unavailableReason?.code)
    }

    @Test
    fun invalidJvmEvidenceKindOrDigestIsUnavailable() {
        val valid = fixtureEvidence(jvm = jvmArtifact(JVM_BASELINE))
        val wrongKind =
            fixtureEvidence(
                jvm =
                    GeneratedSdkJvmAbiArtifact(
                        JVM_BASELINE,
                        CompatibilityEvidenceReference("wrong-kind", "fixture-jvm", "1".repeat(64)),
                    ),
            )
        val badDigest =
            fixtureEvidence(
                jvm =
                    GeneratedSdkJvmAbiArtifact(
                        JVM_BASELINE,
                        CompatibilityEvidenceReference("jvm-abi-dump", "fixture-jvm", "Z".repeat(64)),
                    ),
            )

        listOf(wrongKind, badDigest).forEach { invalid ->
            val result = AbiCompatibilityClassifier.classify(valid, invalid)
            assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
            assertEquals("invalid-evidence-reference", result.layerReport.unavailableReason?.code)
        }
    }

    @Test
    fun blankJvmDumpTextIsMalformedRatherThanEmpty() {
        val valid = fixtureEvidence(jvm = jvmArtifact(JVM_BASELINE))
        val blank = fixtureEvidence(jvm = jvmArtifact("   \n  "))

        val result = AbiCompatibilityClassifier.classify(valid, blank)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals("malformed-jvm-abi-dump", result.layerReport.unavailableReason?.code)
    }

    @Test
    fun klibDumpMissingHeaderOrSignatureCommentIsMalformed() {
        val valid = fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE)))
        val missingHeader =
            fixtureEvidence(
                jvm = null,
                klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE.substringAfter("$KLIB_HEADER_LINE\n"))),
            )
        val missingSignature =
            fixtureEvidence(
                jvm = null,
                klibTargets =
                    listOf(
                        klibAvailable(
                            "linuxX64",
                            "$KLIB_HEADER_LINE\nfinal class com.ex.gen/Widget { // no-comment\n" +
                                "    final fun brokenLine()\n}\n",
                        ),
                    ),
            )

        listOf(missingHeader, missingSignature).forEach { invalid ->
            val result = AbiCompatibilityClassifier.classify(valid, invalid)
            assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
            assertEquals("malformed-klib-abi-dump", result.layerReport.unavailableReason?.code)
        }
    }

    // ---- JVM dump comparison -----------------------------------------------------------------------------

    @Test
    fun reformattedJvmDumpIsUnchanged() {
        val before = fixtureEvidence(jvm = jvmArtifact(JVM_BASELINE))
        val after = fixtureEvidence(jvm = jvmArtifact(JVM_REFORMATTED))

        val result = AbiCompatibilityClassifier.classify(before, after)

        assertEquals(CompatibilityLayerOutcome.UNCHANGED, result.layerReport.outcome)
        assertTrue(result.changes.isEmpty())
    }

    @Test
    fun removedJvmMethodIsBreakingAndAddedJvmMethodIsAdditive() {
        val before = fixtureEvidence(jvm = jvmArtifact(JVM_BASELINE))
        val removed = fixtureEvidence(jvm = jvmArtifact(JVM_METHOD_REMOVED))
        val added = fixtureEvidence(jvm = jvmArtifact(JVM_METHOD_ADDED))

        val removalChange = AbiCompatibilityClassifier.classify(before, removed).changes.single()
        val additionChange = AbiCompatibilityClassifier.classify(before, added).changes.single()

        assertEquals(CompatibilityClassification.BREAKING, removalChange.classification)
        assertTrue(removalChange.id.value.contains(":jvm-artifact:"))
        assertEquals(CompatibilityClassification.ADDITIVE, additionChange.classification)
    }

    @Test
    fun addingWholeJvmArtifactIsAdditiveAndRemovingItIsBreaking() {
        val absent = fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE)))
        val present =
            fixtureEvidence(
                jvm = jvmArtifact(JVM_BASELINE),
                klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE)),
            )

        val addChange = AbiCompatibilityClassifier.classify(absent, present).changes.single()
        val removeChange = AbiCompatibilityClassifier.classify(present, absent).changes.single()

        assertEquals(CompatibilityClassification.ADDITIVE, addChange.classification)
        assertTrue(addChange.id.value.contains(":jvm-artifact:"))
        assertEquals(CompatibilityClassification.BREAKING, removeChange.classification)
    }

    // ---- KLib dump comparison, per-target independence ---------------------------------------------------

    @Test
    fun reformattedKlibDumpIsUnchanged() {
        val before = fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE)))
        val after = fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("linuxX64", KLIB_REFORMATTED)))

        val result = AbiCompatibilityClassifier.classify(before, after)

        assertEquals(CompatibilityLayerOutcome.UNCHANGED, result.layerReport.outcome)
        assertTrue(result.changes.isEmpty())
    }

    @Test
    fun removedKlibDeclarationIsBreakingAndAddedIsAdditive() {
        val before = fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE)))
        val removed =
            fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("linuxX64", KLIB_PROPERTY_REMOVED)))
        val added = fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("linuxX64", KLIB_PROPERTY_ADDED)))

        val removalChanges = AbiCompatibilityClassifier.classify(before, removed).changes
        val additionChanges = AbiCompatibilityClassifier.classify(before, added).changes

        assertTrue(removalChanges.isNotEmpty())
        assertTrue(removalChanges.all { it.classification == CompatibilityClassification.BREAKING })
        assertTrue(removalChanges.all { it.id.value.contains(":klib-artifact:") })
        assertTrue(additionChanges.isNotEmpty())
        assertTrue(additionChanges.all { it.classification == CompatibilityClassification.ADDITIVE })
    }

    @Test
    fun eachKlibTargetIsClassifiedIndependently() {
        val before =
            fixtureEvidence(
                jvm = null,
                klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE), klibAvailable("js", KLIB_BASELINE)),
            )
        val after =
            fixtureEvidence(
                jvm = null,
                klibTargets =
                    listOf(klibAvailable("linuxX64", KLIB_PROPERTY_REMOVED), klibAvailable("js", KLIB_REFORMATTED)),
            )

        val changes = AbiCompatibilityClassifier.classify(before, after).changes

        // js only reformatted (no real change); linuxX64 lost a declaration. Only linuxX64 subjects appear.
        assertTrue(changes.isNotEmpty())
        assertTrue(changes.all { it.summary.contains("linuxX64") || it.summary.contains("declaration") })
        assertTrue(changes.none { it.summary.contains("js") })
    }

    @Test
    fun addedAndRemovedKlibTargetsAreDistinctFromUnchanged() {
        val before = fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE)))
        val targetAdded =
            fixtureEvidence(
                jvm = null,
                klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE), klibAvailable("js", KLIB_BASELINE)),
            )
        val targetRemoved = fixtureEvidence(jvm = null, klibTargets = emptyList())

        val addResult = AbiCompatibilityClassifier.classify(before, targetAdded)
        val removeResult = AbiCompatibilityClassifier.classify(before, targetRemoved)

        val addChange = addResult.changes.single { it.summary.contains("js") }
        assertEquals(CompatibilityClassification.ADDITIVE, addChange.classification)
        assertTrue(addChange.id.value.contains(":klib-artifact:"))

        val removeChange = removeResult.changes.single()
        assertEquals(CompatibilityClassification.BREAKING, removeChange.classification)
        assertEquals(CompatibilityLayerOutcome.CHANGED, removeResult.layerReport.outcome)
    }

    // ---- Precise, named per-target unavailability ---------------------------------------------------------

    @Test
    fun targetBecomingUnavailableIsUnknownNotUnchangedAndNamesTheReason() {
        val before = fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("iosArm64", KLIB_BASELINE)))
        val after =
            fixtureEvidence(jvm = null, klibTargets = listOf(klibUnavailable("iosArm64", "requires-macos-host")))

        val result = AbiCompatibilityClassifier.classify(before, after)
        val change = result.changes.single()

        assertEquals(CompatibilityClassification.UNKNOWN, change.classification)
        assertTrue(change.summary.contains("iosArm64"))
        assertTrue(change.summary.contains("requires-macos-host"))
        // An unknown classification must never be silently folded into "unchanged": this is the
        // "unavailable must never read as unchanged" guarantee.
        assertEquals(CompatibilityLayerOutcome.CHANGED, result.layerReport.outcome)
    }

    @Test
    fun targetRemainingUnavailableIsStillReportedEveryRunNotSilentlySkipped() {
        val unavailable = klibUnavailable("iosArm64", "requires-macos-host")
        val before = fixtureEvidence(jvm = null, klibTargets = listOf(unavailable))
        val after = fixtureEvidence(jvm = null, klibTargets = listOf(unavailable))

        val result = AbiCompatibilityClassifier.classify(before, after)

        assertEquals(1, result.changes.size)
        assertEquals(CompatibilityClassification.UNKNOWN, result.changes.single().classification)
        assertTrue(
            result.changes
                .single()
                .summary
                .contains("remains unavailable"),
        )
    }

    @Test
    fun targetPresentThenAbsentDiffersFromUnchangedAndFromUnavailable() {
        val available = klibAvailable("linuxX64", KLIB_BASELINE)
        val unavailable = klibUnavailable("linuxX64", "toolchain-crash")

        val presentToAbsent =
            AbiCompatibilityClassifier.classify(
                fixtureEvidence(jvm = null, klibTargets = listOf(available)),
                fixtureEvidence(jvm = null, klibTargets = emptyList()),
            )
        val presentToUnavailable =
            AbiCompatibilityClassifier.classify(
                fixtureEvidence(jvm = null, klibTargets = listOf(available)),
                fixtureEvidence(jvm = null, klibTargets = listOf(unavailable)),
            )
        val unavailableToAbsent =
            AbiCompatibilityClassifier.classify(
                fixtureEvidence(jvm = null, klibTargets = listOf(unavailable)),
                fixtureEvidence(jvm = null, klibTargets = emptyList()),
            )

        // Three structurally different transitions must produce three different reasons/classifications,
        // not collapse into the same "nothing to report" outcome.
        assertEquals(CompatibilityClassification.BREAKING, presentToAbsent.changes.single().classification)
        assertEquals(CompatibilityClassification.UNKNOWN, presentToUnavailable.changes.single().classification)
        assertEquals(CompatibilityClassification.UNKNOWN, unavailableToAbsent.changes.single().classification)
        assertTrue(
            unavailableToAbsent.changes
                .single()
                .summary
                .contains("no longer attempted"),
        )
    }

    @Test
    fun targetBecomingAvailableAfterUnavailableIsUnknownRatherThanInferredUnchanged() {
        val before = fixtureEvidence(jvm = null, klibTargets = listOf(klibUnavailable("linuxX64", "toolchain-crash")))
        val after = fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE)))

        val result = AbiCompatibilityClassifier.classify(before, after)

        assertEquals(CompatibilityClassification.UNKNOWN, result.changes.single().classification)
        assertTrue(
            result.changes
                .single()
                .summary
                .contains("no prior dump"),
        )
    }

    @Test
    fun unavailableTargetWithBlankReasonCodeIsInvalidEvidence() {
        val valid = fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE)))
        val blankReason = fixtureEvidence(jvm = null, klibTargets = listOf(klibUnavailable("linuxX64", "")))

        val result = AbiCompatibilityClassifier.classify(valid, blankReason)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals("invalid-evidence-reference", result.layerReport.unavailableReason?.code)
    }

    @Test
    fun duplicateKlibTargetNameIsInvalidEvidence() {
        val valid = fixtureEvidence(jvm = null, klibTargets = listOf(klibAvailable("linuxX64", KLIB_BASELINE)))
        val duplicated =
            fixtureEvidence(
                jvm = null,
                klibTargets =
                    listOf(
                        klibAvailable("linuxX64", KLIB_BASELINE),
                        klibAvailable("linuxX64", KLIB_REFORMATTED),
                    ),
            )

        val result = AbiCompatibilityClassifier.classify(valid, duplicated)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals("invalid-evidence-reference", result.layerReport.unavailableReason?.code)
    }

    // ---- Fixtures -----------------------------------------------------------------------------------------

    private fun fixtureEvidence(
        sdkIdentity: String = "openrouter",
        jvm: GeneratedSdkJvmAbiArtifact?,
        klibTargets: List<GeneratedSdkKlibAbiTarget> = emptyList(),
    ): GeneratedSdkAbiEvidence = GeneratedSdkAbiEvidence(sdkIdentity, jvm, klibTargets)

    private fun jvmArtifact(
        dumpText: String,
        identity: String = "fixture-jvm",
    ): GeneratedSdkJvmAbiArtifact = GeneratedSdkJvmAbiArtifact(dumpText, jvmEvidenceRef(identity))

    private fun jvmEvidenceRef(identity: String = "fixture-jvm"): CompatibilityEvidenceReference =
        CompatibilityEvidenceReference("jvm-abi-dump", identity, "1".repeat(64))

    private fun klibEvidenceRef(identity: String): CompatibilityEvidenceReference =
        CompatibilityEvidenceReference("klib-abi-dump", identity, "2".repeat(64))

    private fun klibAvailable(
        targetName: String,
        dumpText: String,
    ): GeneratedSdkKlibAbiTarget =
        GeneratedSdkKlibAbiTarget(
            targetName,
            GeneratedSdkKlibTargetState.Available(dumpText, klibEvidenceRef("fixture-klib-$targetName")),
        )

    private fun klibUnavailable(
        targetName: String,
        reasonCode: String,
    ): GeneratedSdkKlibAbiTarget =
        GeneratedSdkKlibAbiTarget(targetName, GeneratedSdkKlibTargetState.Unavailable(reasonCode))

    private companion object {
        private const val KLIB_HEADER_LINE = "// Klib ABI Dump"

        private val JVM_BASELINE =
            """
            public final class com/ex/gen/Widget {
                public final fun getId ()Ljava/lang/String;
                public final fun getName ()Ljava/lang/String;
            }
            """.trimIndent() + "\n"

        private val JVM_REFORMATTED =
            """
            public final class com/ex/gen/Widget {
              public final fun getName ()Ljava/lang/String;

              public final    fun getId ()Ljava/lang/String;
            }
            """.trimIndent() + "\n"

        private val JVM_METHOD_REMOVED =
            """
            public final class com/ex/gen/Widget {
                public final fun getId ()Ljava/lang/String;
            }
            """.trimIndent() + "\n"

        private val JVM_METHOD_ADDED =
            """
            public final class com/ex/gen/Widget {
                public final fun getId ()Ljava/lang/String;
                public final fun getName ()Ljava/lang/String;
                public final fun getTags ()Ljava/util/List;
            }
            """.trimIndent() + "\n"

        private val KLIB_BASELINE =
            """
            // Klib ABI Dump
            // Targets: [linuxX64]
            // Rendering settings:
            // - Signature version: 2
            // - Show manifest properties: true
            // - Show declarations: true

            // Library unique name: <com.ex:gen-sdk>
            final class com.ex.gen/Widget { // com.ex.gen/Widget|null[0]
                final val id // com.ex.gen/Widget.id|{}id[0]
                    final fun <get-id>(): kotlin/String // com.ex.gen/Widget.id.<get-id>|<get-id>(){}[0]
                final val name // com.ex.gen/Widget.name|{}name[0]
                    final fun <get-name>(): kotlin/String // com.ex.gen/Widget.name.<get-name>|<get-name>(){}[0]
            }
            """.trimIndent() + "\n"

        private val KLIB_REFORMATTED =
            """
            // Klib ABI Dump
            // Targets: [linuxX64]
            // Rendering settings:
            // - Signature version: 2
            // - Show manifest properties: true
            // - Show declarations: true

            // Library unique name: <com.ex:gen-sdk>
            final class com.ex.gen/Widget { // com.ex.gen/Widget|null[0]
                final val name // com.ex.gen/Widget.name|{}name[0]
                    final    fun <get-name>(): kotlin/String // com.ex.gen/Widget.name.<get-name>|<get-name>(){}[0]

                final val id // com.ex.gen/Widget.id|{}id[0]
                    final fun <get-id>(): kotlin/String // com.ex.gen/Widget.id.<get-id>|<get-id>(){}[0]
            }
            """.trimIndent() + "\n"

        private val KLIB_PROPERTY_REMOVED =
            """
            // Klib ABI Dump
            // Targets: [linuxX64]
            // Rendering settings:
            // - Signature version: 2
            // - Show manifest properties: true
            // - Show declarations: true

            // Library unique name: <com.ex:gen-sdk>
            final class com.ex.gen/Widget { // com.ex.gen/Widget|null[0]
                final val id // com.ex.gen/Widget.id|{}id[0]
                    final fun <get-id>(): kotlin/String // com.ex.gen/Widget.id.<get-id>|<get-id>(){}[0]
            }
            """.trimIndent() + "\n"

        private val KLIB_PROPERTY_ADDED =
            """
            // Klib ABI Dump
            // Targets: [linuxX64]
            // Rendering settings:
            // - Signature version: 2
            // - Show manifest properties: true
            // - Show declarations: true

            // Library unique name: <com.ex:gen-sdk>
            final class com.ex.gen/Widget { // com.ex.gen/Widget|null[0]
                final val id // com.ex.gen/Widget.id|{}id[0]
                    final fun <get-id>(): kotlin/String // com.ex.gen/Widget.id.<get-id>|<get-id>(){}[0]
                final val name // com.ex.gen/Widget.name|{}name[0]
                    final fun <get-name>(): kotlin/String // com.ex.gen/Widget.name.<get-name>|<get-name>(){}[0]
                final val tags // com.ex.gen/Widget.tags|{}tags[0]
                    final fun <get-tags>(): kotlin/String // com.ex.gen/Widget.tags.<get-tags>|<get-tags>(){}[0]
            }
            """.trimIndent() + "\n"
    }
}
