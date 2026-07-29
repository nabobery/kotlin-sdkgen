package com.nabobery.sdkgen.cli

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class KotlinApiCompatibilityClassifierTest {
    @Test
    fun formattingKDocAndDeclarationOrderingCannotChangeTheTypedPublicApiProjection() {
        val client = clientDeclaration("ChatClient")
        val response = responseDeclaration(nullableRequestId = false)
        val before = evidence(listOf(client, response), evidenceSha = "1".repeat(64))
        val after = evidence(listOf(response, client), evidenceSha = "2".repeat(64))

        val result = KotlinApiCompatibilityClassifier.classify(before, after)

        assertEquals(CompatibilityLayerOutcome.UNCHANGED, result.layerReport.outcome)
        assertTrue(result.changes.isEmpty())
    }

    @Test
    fun propertyRemovalIsBreaking() {
        val before = evidence(listOf(responseDeclaration(nullableRequestId = false)))
        val after = evidence(listOf(responseDeclaration(nullableRequestId = false).copy(properties = emptyList())))

        val change = KotlinApiCompatibilityClassifier.classify(before, after).changes.single()

        assertEquals(CompatibilityClassification.BREAKING, change.classification)
        assertTrue(change.id.value.contains(":property:"))
    }

    @Test
    fun parameterChangeIsRemovalPlusAdditionAndReturnTypeSuspendChangesAreBreaking() {
        val before = evidence(listOf(clientDeclaration("ChatClient")))
        val parameterChanged =
            evidence(
                listOf(
                    clientDeclaration("ChatClient").copy(
                        functions =
                            listOf(
                                KotlinApiFunction(
                                    name = "createChat",
                                    parameters = listOf(KotlinApiParameter("request", apiType("String"), false)),
                                    returnType = apiType("ChatResponse"),
                                    isSuspend = true,
                                ),
                            ),
                    ),
                ),
            )
        val returnAndSuspendChanged =
            evidence(
                listOf(
                    clientDeclaration("ChatClient").copy(
                        functions =
                            listOf(
                                KotlinApiFunction(
                                    name = "createChat",
                                    parameters =
                                        listOf(KotlinApiParameter("request", apiType("CreateChatRequest"), false)),
                                    returnType = apiType("String"),
                                    isSuspend = false,
                                ),
                            ),
                    ),
                ),
            )

        val parameterChanges = KotlinApiCompatibilityClassifier.classify(before, parameterChanged).changes
        val returnAndSuspendChanges = KotlinApiCompatibilityClassifier.classify(before, returnAndSuspendChanged).changes

        assertEquals(2, parameterChanges.size)
        assertEquals(
            setOf(CompatibilityClassification.ADDITIVE, CompatibilityClassification.BREAKING),
            parameterChanges.map(CompatibilityChange::classification).toSet(),
        )
        assertEquals(1, returnAndSuspendChanges.size)
        assertEquals(CompatibilityClassification.BREAKING, returnAndSuspendChanges.single().classification)
    }

    @Test
    fun enumEntryRemovalAndOverloadRemovalAreBreaking() {
        val before =
            evidence(
                listOf(
                    KotlinApiDeclaration(
                        qualifiedName = "com.example.Mode",
                        kind = KotlinApiDeclarationKind.ENUM,
                        enumEntries = listOf("FAST", "SAFE"),
                    ),
                    clientDeclaration("ChatClient").copy(
                        functions =
                            listOf(
                                KotlinApiFunction(
                                    "getChat",
                                    listOf(KotlinApiParameter("id", apiType("String"), false)),
                                    apiType("ChatResponse"),
                                    true,
                                ),
                                KotlinApiFunction(
                                    "getChat",
                                    listOf(KotlinApiParameter("id", apiType("Long"), false)),
                                    apiType("ChatResponse"),
                                    true,
                                ),
                            ),
                    ),
                ),
            )
        val after =
            evidence(
                listOf(
                    KotlinApiDeclaration(
                        qualifiedName = "com.example.Mode",
                        kind = KotlinApiDeclarationKind.ENUM,
                        enumEntries = listOf("FAST"),
                    ),
                    clientDeclaration("ChatClient").copy(
                        functions =
                            listOf(
                                KotlinApiFunction(
                                    "getChat",
                                    listOf(KotlinApiParameter("id", apiType("String"), false)),
                                    apiType("ChatResponse"),
                                    true,
                                ),
                            ),
                    ),
                ),
            )

        val changes = KotlinApiCompatibilityClassifier.classify(before, after).changes

        assertEquals(2, changes.size)
        assertTrue(changes.all { it.classification == CompatibilityClassification.BREAKING })
        assertEquals(
            setOf("enum-entry", "function"),
            changes.map { change -> change.id.value.split(':')[2] }.toSet(),
        )
    }

    @Test
    fun nullabilityChangeIsBreakingAndOperationMoveIsRemovalPlusAddition() {
        val before =
            evidence(listOf(clientDeclaration("ChatClient"), responseDeclaration(nullableRequestId = false)))
        val nullabilityChanged =
            evidence(listOf(clientDeclaration("ChatClient"), responseDeclaration(nullableRequestId = true)))
        val moved = evidence(listOf(clientDeclaration("AdminClient"), responseDeclaration(nullableRequestId = false)))

        val nullabilityResult = KotlinApiCompatibilityClassifier.classify(before, nullabilityChanged)
        assertEquals(CompatibilityClassification.BREAKING, nullabilityResult.changes.single().classification)

        val moveResult = KotlinApiCompatibilityClassifier.classify(before, moved)
        val operationMoveChanges = moveResult.changes.filter { change -> change.id.value.contains(":function:") }
        assertEquals(2, operationMoveChanges.size)
        assertEquals(
            setOf(CompatibilityClassification.ADDITIVE, CompatibilityClassification.BREAKING),
            operationMoveChanges.map(CompatibilityChange::classification).toSet(),
        )
    }

    @Test
    fun propertyAdditionIsAdditiveAndFormatMappingChangeIsBreaking() {
        val before = evidence(listOf(responseDeclaration(nullableRequestId = false)))
        val propertyAdded =
            evidence(
                listOf(
                    responseDeclaration(nullableRequestId = false).copy(
                        properties =
                            listOf(
                                KotlinApiProperty("requestId", apiType("String"), false),
                                KotlinApiProperty("traceId", apiType("String"), false),
                            ),
                    ),
                ),
            )
        val formatMapped =
            evidence(
                listOf(
                    responseDeclaration(nullableRequestId = false).copy(
                        properties =
                            listOf(
                                KotlinApiProperty(
                                    "requestId",
                                    KotlinApiType("kotlinx.datetime", "Instant"),
                                    false,
                                ),
                            ),
                    ),
                ),
            )

        val addition = KotlinApiCompatibilityClassifier.classify(before, propertyAdded).changes.single()
        val formatChange = KotlinApiCompatibilityClassifier.classify(before, formatMapped).changes.single()

        assertEquals(CompatibilityClassification.ADDITIVE, addition.classification)
        assertEquals(CompatibilityClassification.BREAKING, formatChange.classification)
    }

    @Test
    fun invalidProjectionEvidenceIdentityOrDigestIsUnavailableRatherThanCompatible() {
        val valid = evidence(listOf(clientDeclaration("ChatClient")))
        val emptyIdentity = evidence(listOf(clientDeclaration("ChatClient")), evidenceIdentity = "")
        val emptyDigest = evidence(listOf(clientDeclaration("ChatClient")), evidenceSha = "")
        val uppercaseDigest = evidence(listOf(clientDeclaration("ChatClient")), evidenceSha = "P".repeat(64))

        listOf(emptyIdentity, emptyDigest, uppercaseDigest).forEach { invalid ->
            val result = KotlinApiCompatibilityClassifier.classify(valid, invalid)

            assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
            assertEquals("invalid-evidence-reference", result.layerReport.unavailableReason?.code)
        }
    }

    @Test
    fun missingProjectionIsUnavailableRatherThanCompatible() {
        val result =
            KotlinApiCompatibilityClassifier.classify(null, evidence(listOf(clientDeclaration("ChatClient"))))

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals("missing-layer-evidence", result.layerReport.unavailableReason?.code)
    }

    /**
     * The classifier used to answer `BREAKING` for every modification of an existing subject, so a widening and
     * a narrowing were indistinguishable. Making a `val` a `var` only adds a setter: every caller that compiled
     * against the read-only property still compiles.
     */
    @Test
    fun makingAReadOnlyPropertyMutableIsAdditiveRatherThanBreaking() {
        val before = evidence(listOf(responseDeclaration(nullableRequestId = false)))
        val after =
            evidence(
                listOf(
                    responseDeclaration(nullableRequestId = false).copy(
                        properties = listOf(KotlinApiProperty("requestId", apiType("String"), mutable = true)),
                    ),
                ),
            )

        val change = KotlinApiCompatibilityClassifier.classify(before, after).changes.single()

        assertEquals(CompatibilityClassification.ADDITIVE, change.classification)
    }

    /** Making a `var` a `val` removes the setter and is the converse narrowing. */
    @Test
    fun makingAMutablePropertyReadOnlyIsBreaking() {
        val mutable =
            responseDeclaration(nullableRequestId = false).copy(
                properties = listOf(KotlinApiProperty("requestId", apiType("String"), mutable = true)),
            )
        val before = evidence(listOf(mutable))
        val after = evidence(listOf(responseDeclaration(nullableRequestId = false)))

        val change = KotlinApiCompatibilityClassifier.classify(before, after).changes.single()

        assertEquals(CompatibilityClassification.BREAKING, change.classification)
    }

    /** Implementing an additional interface cannot break a caller that never referenced it. */
    @Test
    fun gainingASuperTypeIsAdditiveAndLosingOneIsBreaking() {
        val bare = responseDeclaration(nullableRequestId = false)
        val withSuperType = bare.copy(superTypes = listOf(KotlinApiType("com.example", "Traceable")))

        val gained = KotlinApiCompatibilityClassifier.classify(evidence(listOf(bare)), evidence(listOf(withSuperType)))
        val lost = KotlinApiCompatibilityClassifier.classify(evidence(listOf(withSuperType)), evidence(listOf(bare)))

        assertEquals(CompatibilityClassification.ADDITIVE, gained.changes.single().classification)
        assertEquals(CompatibilityClassification.BREAKING, lost.changes.single().classification)
    }

    @Test
    fun wideningVisibilityAndAddingAParameterDefaultAreAdditive() {
        val protectedFunction =
            clientDeclaration("ChatClient").copy(
                functions =
                    listOf(
                        clientDeclaration("ChatClient").functions.single().copy(visibility = "protected"),
                    ),
            )
        val publicFunctionWithDefault =
            clientDeclaration("ChatClient").copy(
                functions =
                    listOf(
                        clientDeclaration("ChatClient").functions.single().copy(
                            parameters =
                                listOf(
                                    KotlinApiParameter(
                                        name = "request",
                                        type = apiType("CreateChatRequest"),
                                        hasDefaultValue = true,
                                    ),
                                ),
                        ),
                    ),
            )

        val change =
            KotlinApiCompatibilityClassifier
                .classify(evidence(listOf(protectedFunction)), evidence(listOf(publicFunctionWithDefault)))
                .changes
                .single()

        assertEquals(CompatibilityClassification.ADDITIVE, change.classification)
    }

    @Test
    fun narrowingVisibilityAndRemovingAParameterDefaultAreBreaking() {
        val publicFunctionWithDefault =
            clientDeclaration("ChatClient").copy(
                functions =
                    listOf(
                        clientDeclaration("ChatClient").functions.single().copy(
                            parameters =
                                listOf(
                                    KotlinApiParameter(
                                        name = "request",
                                        type = apiType("CreateChatRequest"),
                                        hasDefaultValue = true,
                                    ),
                                ),
                        ),
                    ),
            )
        val protectedFunction =
            clientDeclaration("ChatClient").copy(
                functions =
                    listOf(
                        clientDeclaration("ChatClient").functions.single().copy(visibility = "protected"),
                    ),
            )

        val change =
            KotlinApiCompatibilityClassifier
                .classify(evidence(listOf(publicFunctionWithDefault)), evidence(listOf(protectedFunction)))
                .changes
                .single()

        assertEquals(CompatibilityClassification.BREAKING, change.classification)
    }

    /**
     * Swapping one super type for another is neither a provable widening nor a provable narrowing. ADR 0013
     * defines `unknown` for exactly this, and an `unknown` change forces the aggregate outcome to `incomplete`
     * rather than a confident verdict the evidence does not support.
     */
    @Test
    fun anUnclassifiableSuperTypeSwapIsUnknownRatherThanAGuess() {
        val before =
            evidence(
                listOf(
                    responseDeclaration(nullableRequestId = false)
                        .copy(superTypes = listOf(KotlinApiType("com.example", "Traceable"))),
                ),
            )
        val after =
            evidence(
                listOf(
                    responseDeclaration(nullableRequestId = false)
                        .copy(superTypes = listOf(KotlinApiType("com.example", "Auditable"))),
                ),
            )

        val change = KotlinApiCompatibilityClassifier.classify(before, after).changes.single()

        assertEquals(CompatibilityClassification.UNKNOWN, change.classification)
    }

    private fun evidence(
        declarations: List<KotlinApiDeclaration>,
        evidenceIdentity: String = "fixture",
        evidenceSha: String = "1".repeat(64),
    ): KotlinPublicApiEvidence =
        KotlinPublicApiEvidence(
            projection = KotlinPublicApiProjection(declarations),
            evidence = CompatibilityEvidenceReference("declaration-projection", evidenceIdentity, evidenceSha),
        )

    private fun clientDeclaration(name: String): KotlinApiDeclaration =
        KotlinApiDeclaration(
            qualifiedName = "com.example.$name",
            kind = KotlinApiDeclarationKind.CLASS,
            functions =
                listOf(
                    KotlinApiFunction(
                        name = "createChat",
                        parameters = listOf(KotlinApiParameter("request", apiType("CreateChatRequest"), false)),
                        returnType = apiType("ChatResponse"),
                        isSuspend = true,
                    ),
                ),
        )

    private fun responseDeclaration(nullableRequestId: Boolean): KotlinApiDeclaration =
        KotlinApiDeclaration(
            qualifiedName = "com.example.ChatResponse",
            kind = KotlinApiDeclarationKind.CLASS,
            properties = listOf(KotlinApiProperty("requestId", apiType("String", nullableRequestId), false)),
        )

    private fun apiType(
        name: String,
        nullable: Boolean = false,
    ): KotlinApiType = KotlinApiType("kotlin", name, nullable = nullable)
}
