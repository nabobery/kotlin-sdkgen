package com.nabobery.sdkgen.conformance.parity

import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ParityMatrixTest {
    @Test
    fun checkedEvidenceHasRealDigestAndAuthoritativeRepositoryInputs() {
        val checked = loadCheckedEvidence()
        val policy = loadPolicy()
        val registry = loadRegistry()
        assertTrue(checked.sha256.isSha256())
        assertTrue(policy.sha256.isSha256())
        assertTrue(registry.sha256.isSha256())
        assertEquals("parity-assessment", checked.bundle.producer)
        assertEquals("parity-policy", policy.bundle.producer)
        assertEquals(28, registry.bundle.rows.size)

        val errors = ParityRegistry.repositoryInputErrors(repositoryRoot)
        assertTrue(errors.isEmpty(), errors.joinToString())
    }

    @Test
    fun streamingStressInputsArePinnedAsAuthoritativeProvenance() {
        assertEquals(
            "dded4479630d80330121116f80bba85040ec52f0f85e5530691e40a5c7698dd5",
            ParityRegistry.expectedCorpusDigest("stress-streaming"),
        )
        assertEquals(
            "ba6d17a24068ede752c2875b773a2d007209a20fe250ed207a774e9ac6ac5c77",
            ParityRegistry.expectedConfigDigest("stress-streaming"),
        )
        assertEquals(
            "86d9109d162a38b72a5c5e04b1a488a7a3630246c34c3f6ca0888f68774b95c3",
            ParityRegistry.expectedConfigFileDigest("stress-streaming"),
        )
        assertEquals(
            "5c51196d1ebeee98d0f86f7719833b7ea466048c2cafb040d72cfd6937fd304b",
            ParityRegistry.expectedLockFileDigest("stress-streaming"),
        )
        assertEquals(ABSENT_OVERLAY_SHA256, ParityRegistry.expectedOverlayDigest("stress-streaming"))
    }

    @Test
    fun shuffledEvidenceRowsRenderByteIdentically() {
        val evidence = loadCheckedEvidence()
        val shuffled =
            evidence.copy(
                bundle = evidence.bundle.copy(rows = evidence.bundle.rows.shuffled()),
            )
        val reportA =
            ParityAggregator.aggregate(
                listOf(evidence),
                loadRegistry(),
                loadPolicy(),
                ParityRegistry.repositoryInputErrors(repositoryRoot),
            )
        val reportB =
            ParityAggregator.aggregate(
                listOf(shuffled),
                loadRegistry(),
                loadPolicy(),
                ParityRegistry.repositoryInputErrors(repositoryRoot),
            )
        assertEquals(ParityJsonRenderer.render(reportA), ParityJsonRenderer.render(reportB))
        assertEquals(ParityMarkdownRenderer.render(reportA), ParityMarkdownRenderer.render(reportB))
    }

    @Test
    fun reportOwnsEveryCanonicalRegistryRowAndSynthesizesMissingArtifacts() {
        val evidence = loadCheckedEvidence()
        val rows = evidence.bundle.rows
        val droppedRow = rows[0]
        val partial = evidence.copy(bundle = evidence.bundle.copy(rows = rows.drop(1)))

        val report =
            ParityAggregator.aggregate(
                listOf(partial),
                loadRegistry(),
                loadPolicy(),
                ParityRegistry.repositoryInputErrors(repositoryRoot),
            )
        val policyIds =
            loadPolicy()
                .bundle.rows
                .map { it.id }
                .toSet()
        val registryRows = loadRegistry().bundle.rows

        assertEquals(registryRows.size, report.matrices.flatMap { it.rows }.size)
        val rowIds = report.matrices.flatMap { it.rows }.map { it.id }
        assertEquals(registryRows.map { it.id }.toSet(), rowIds.toSet())
        val missing = report.matrices.flatMap { it.rows }.single { it.id == droppedRow.id }
        assertEquals(ParityStatus.NOT_RUN, missing.status)
        assertEquals("missing-artifact", missing.evidenceProducer)
        assertTrue(
            report.summary.notRunRows >= 1,
            "Expected at least one synthesized notRun row when evidence is partial",
        )
        assertFalse(policyIds.contains(droppedRow.id), "Test assumes dropped row is executable")
    }

    @Test
    fun openrouterProductionPolicyRowsOverrideExecutableEvidence() {
        val rows =
            ParityAggregator
                .aggregate(
                    listOf(loadCheckedEvidence()),
                    loadRegistry(),
                    loadPolicy(),
                ).matrices
                .flatMap {
                    it.rows
                }
        assertEquals(ParityStatus.NOT_APPLICABLE, rows.single { it.id == "openrouter.behavior.production-sse" }.status)
        assertEquals(ParityStatus.WAIVED, rows.single { it.id == "openrouter.behavior.multipart-waiver" }.status)
        assertEquals(
            "parity-policy",
            rows.single { it.id == "runtime.behavior.js-lone-surrogate" }.evidenceProducer,
        )
    }

    @Test
    fun productionOpenRouterSseAndStressUseExpectedFixtureShapes() {
        val rows =
            ParityAggregator
                .aggregate(
                    listOf(loadCheckedEvidence()),
                    loadRegistry(),
                    loadPolicy(),
                ).matrices
                .flatMap {
                    it.rows
                }
        val production = rows.single { it.id == "openrouter.behavior.production-sse" }
        val stress = rows.single { it.id == "stress.behavior.generated-sse" }
        assertEquals(EvidenceLevel.SOURCE_INVARIANT, production.evidenceLevel)
        assertEquals(EvidenceLevel.GENERATED_CLIENT, stress.evidenceLevel)
        assertEquals(ParityStatus.NOT_APPLICABLE, production.status)
        assertEquals(ParityStatus.NOT_RUN, stress.status)
        assertEquals("openrouter.behavior.production-sse", production.id)
    }

    @Test
    fun omittedNonJvmCorpusExecutionDoesNotAppearAsNotApplicable() {
        val rows =
            ParityAggregator
                .aggregate(
                    listOf(loadCheckedEvidence()),
                    loadRegistry(),
                    loadPolicy(),
                ).matrices
                .flatMap {
                    it.rows
                }
        assertEquals(ParityStatus.NOT_RUN, rows.single { it.id == "github.compile.non-jvm" }.status)
        assertEquals(ParityStatus.NOT_RUN, rows.single { it.id == "stripe.compile.non-jvm" }.status)
    }

    @Test
    fun requiredNotRunRowsFailTheGateAndWaiversAreComplete() {
        val report = ParityAggregator.aggregate(listOf(loadCheckedEvidence()), loadRegistry(), loadPolicy())
        val result = ParityGate.validate(report)
        assertFalse(result.passed)
        assertTrue(result.errors.any { it.startsWith("github.behavior.pagination:") })
        report.waiverLedger.forEach {
            assertTrue(it.owner.isNotBlank())
            assertTrue(it.rationale.isNotBlank())
            assertTrue(it.disposition1_0.isNotBlank())
        }
    }

    @Test
    fun matrixAndEvidenceLevelPairsAreExact() {
        val report = ParityAggregator.aggregate(listOf(loadCheckedEvidence()), loadRegistry(), loadPolicy())
        val rows = report.matrices.flatMap { it.rows }

        val checkedErrors = ParityGate.validateRows(rows).errors
        assertTrue(
            checkedErrors.none { it.contains("row must use") },
            checkedErrors.joinToString(),
        )
        assertTrue(
            ParityGate
                .validateRows(
                    rows.map { row ->
                        if (row.matrix == MatrixType.BEHAVIOR) {
                            row.copy(status = ParityStatus.PASSED, evidenceLevel = EvidenceLevel.SOURCE_INVARIANT)
                        } else {
                            row
                        }
                    },
                ).errors
                .any { it.contains("passed behavior row must use generatedClient or runtimeContract evidence") },
        )
        assertTrue(
            ParityGate
                .validateRows(
                    rows.map { row ->
                        if (row.matrix == MatrixType.COMPILE) {
                            row.copy(status = ParityStatus.PASSED, evidenceLevel = EvidenceLevel.SOURCE_INVARIANT)
                        } else {
                            row
                        }
                    },
                ).errors
                .any { it.contains("passed compile row must use generatedClient evidence") },
        )
        assertTrue(
            ParityGate
                .validateRows(
                    rows.map { row ->
                        if (row.matrix == MatrixType.TRANSPORT) {
                            row.copy(status = ParityStatus.PASSED, evidenceLevel = EvidenceLevel.GENERATED_CLIENT)
                        } else {
                            row
                        }
                    },
                ).errors
                .any { it.contains("passed transport row must use runtimeContract evidence") },
        )
        assertTrue(
            ParityGate
                .validateRows(
                    rows.map { row ->
                        if (row.matrix == MatrixType.SOURCE_INVARIANT) {
                            row.copy(status = ParityStatus.PASSED, evidenceLevel = EvidenceLevel.GENERATED_CLIENT)
                        } else {
                            row
                        }
                    },
                ).errors
                .any { it.contains("passed sourceInvariant row must use sourceInvariant evidence") },
        )
    }

    @Test
    fun incompleteWaiverFailsValidation() {
        val report = ParityAggregator.aggregate(listOf(loadCheckedEvidence()), loadRegistry(), loadPolicy())
        val waiver = report.matrices.flatMap { it.rows }.first { it.status == ParityStatus.WAIVED }
        val invalid =
            report.copy(
                matrices =
                    report.matrices.map { matrix ->
                        matrix.copy(
                            rows =
                                matrix.rows.map { row ->
                                    if (row.id == waiver.id) row.copy(waiverOwner = null) else row
                                },
                        )
                    },
            )
        assertTrue(ParityGate.validate(invalid).errors.any { it.contains("${waiver.id}: waived row lacks owner") })
    }

    @Test
    fun stripeFormAndMultipartUseDistinctGeneratedFixtures() {
        val rows =
            ParityAggregator
                .aggregate(
                    listOf(loadCheckedEvidence()),
                    loadRegistry(),
                    loadPolicy(),
                ).matrices
                .flatMap {
                    it.rows
                }
        val form = rows.single { it.id == "stripe.behavior.form" }
        val multipart = rows.single { it.id == "stripe.behavior.multipart" }
        assertEquals("stripe.form", form.fixtureId)
        assertEquals("stripe.multipart", multipart.fixtureId)
        assertTrue(form.fixtureId != multipart.fixtureId)
    }

    @Test
    fun tamperedEvidenceBytesRejectedBeforeParsing() {
        val source = checkedEvidence
        val temporary = File.createTempFile("parity-evidence-", ".json")
        try {
            temporary.writeText(source.readText().replaceFirst("\"notRun\"", "\"passed\""))
            File(temporary.parentFile, "${temporary.name}.sha256").writeText(sourceSidecar.readText())
            assertFailsWith<IllegalArgumentException> { EvidenceLoader.loadEvidence(temporary) }
        } finally {
            temporary.delete()
            File(temporary.parentFile, "${temporary.name}.sha256").delete()
        }
    }

    @Test
    fun staleCorpusAndToolchainDigestsAreRejected() {
        val loaded = loadCheckedEvidence()
        val first = loaded.bundle.rows.first { ParityRegistry.expectedCorpusDigest(it.id.substringBefore('.')) != null }
        val source =
            loaded.copy(
                bundle =
                    passedExecutionBundle(loaded.bundle, first.id).copy(
                        rows =
                            listOf(
                                first.copy(
                                    corpusSha256 = "0".repeat(64),
                                    status = ParityStatus.PASSED,
                                    reason = null,
                                    commitSha = ParityRegistry.currentCommitSha(repositoryRoot),
                                    toolchainSha256 = ParityRegistry.TOOLCHAIN_SHA256,
                                    generatedArtifactSha256 = "1".repeat(64),
                                    manifestSha256 = "2".repeat(64),
                                    lockFileSha256 = ParityRegistry.GITHUB_LOCK_FILE_SHA256,
                                    overlaySha256 = ParityRegistry.GITHUB_OVERLAY_SHA256,
                                ),
                            ),
                    ),
            )

        assertFailsWith<IllegalArgumentException> {
            ParityAggregator.aggregate(
                evidence = listOf(source),
                registry = loadRegistry(),
                policy = loadPolicy(),
            )
        }
    }

    @Test
    fun stalePassedEvidenceCommitFailsTheGate() {
        val loaded = loadCheckedEvidence()
        val first = loaded.bundle.rows.first()
        val passed =
            first.copy(
                status = ParityStatus.PASSED,
                reason = null,
                commitSha = "0".repeat(40),
                toolchainSha256 = ParityRegistry.TOOLCHAIN_SHA256,
                corpusSha256 = ParityRegistry.expectedCorpusDigest("github"),
                configDigest = ParityRegistry.expectedConfigDigest("github"),
                configFileSha256 = ParityRegistry.GITHUB_CONFIG_FILE_SHA256,
                generatedArtifactSha256 = "1".repeat(64),
                manifestSha256 = "2".repeat(64),
                lockFileSha256 = ParityRegistry.GITHUB_LOCK_FILE_SHA256,
                overlaySha256 = ParityRegistry.GITHUB_OVERLAY_SHA256,
            )
        val report =
            ParityAggregator.aggregate(
                evidence = listOf(loaded.copy(bundle = passedExecutionBundle(loaded.bundle, passed.id, passed))),
                registry = loadRegistry(),
                policy = loadPolicy(),
                expectedPassedCommitSha = ParityRegistry.currentCommitSha(repositoryRoot),
            )
        assertTrue(
            ParityGate
                .validate(report, ParityRegistry.currentCommitSha(repositoryRoot))
                .errors
                .any { it.contains("passed evidence commit") },
        )
    }

    @Test
    fun passedRowsRequireCurrentCommitAndProvenance() {
        val loaded = loadCheckedEvidence()
        val first = loaded.bundle.rows.first { it.status == ParityStatus.NOT_RUN }
        val passedExecutable =
            first.copy(
                status = ParityStatus.PASSED,
                reason = null,
                commitSha = ParityRegistry.currentCommitSha(repositoryRoot),
                toolchainSha256 = ParityRegistry.TOOLCHAIN_SHA256,
                corpusSha256 = ParityRegistry.expectedCorpusDigest("github"),
                configDigest = ParityRegistry.expectedConfigDigest("github"),
                configFileSha256 = ParityRegistry.GITHUB_CONFIG_FILE_SHA256,
                generatedArtifactSha256 = "1".repeat(64),
                manifestSha256 = "2".repeat(64),
                lockFileSha256 = ParityRegistry.GITHUB_LOCK_FILE_SHA256,
                overlaySha256 = ParityRegistry.GITHUB_OVERLAY_SHA256,
            )

        val valid =
            ParityAggregator.aggregate(
                evidence =
                    listOf(
                        loaded.copy(
                            bundle = passedExecutionBundle(loaded.bundle, passedExecutable.id, passedExecutable),
                        ),
                    ),
                registry = loadRegistry(),
                policy = loadPolicy(),
                expectedPassedCommitSha = ParityRegistry.currentCommitSha(repositoryRoot),
            )
        val validRow = valid.matrices.flatMap { it.rows }.single { it.id == passedExecutable.id }
        assertEquals(ParityStatus.PASSED, validRow.status)

        val missingConfig =
            passedExecutable.copy(configDigest = "0".repeat(64))
        assertFailsWith<IllegalArgumentException> {
            ParityAggregator.aggregate(
                evidence =
                    listOf(
                        loaded.copy(
                            bundle = passedExecutionBundle(loaded.bundle, missingConfig.id, missingConfig),
                        ),
                    ),
                registry = loadRegistry(),
                policy = loadPolicy(),
            )
        }
    }

    @Test
    fun duplicateStableFixtureRowsAndEvidenceRowsAreRejected() {
        val loaded = loadCheckedEvidence()
        val duplicate = loaded.bundle.rows.toMutableList()
        duplicate.add(loaded.bundle.rows[1].copy(id = loaded.bundle.rows[0].id))
        assertFailsWith<IllegalArgumentException> {
            ParityAggregator.aggregate(
                evidence =
                    listOf(
                        loaded.copy(
                            bundle = loaded.bundle.copy(rows = duplicate),
                        ),
                    ),
                registry = loadRegistry(),
                policy = loadPolicy(),
            )
        }
    }

    @Test
    fun policyRowsRejectUnknownAndDuplicateEntries() {
        val policy = loadPolicy()
        val unknown =
            policy.copy(
                bundle =
                    policy.bundle.copy(
                        rows =
                            policy.bundle.rows +
                                PolicyRow(
                                    id = "missing.registry.row",
                                    status = ParityStatus.WAIVED,
                                    reason = "invalid",
                                    waiverOwner = "owner",
                                    disposition1_0 = "disp",
                                ),
                    ),
            )
        assertFailsWith<IllegalArgumentException> {
            ParityAggregator.aggregate(listOf(loadCheckedEvidence()), loadRegistry(), unknown)
        }

        val duplicated =
            policy.copy(
                bundle =
                    policy.bundle.copy(
                        rows =
                            listOf(
                                policy.bundle.rows[0],
                                policy.bundle.rows[0],
                            ),
                    ),
            )
        assertFailsWith<IllegalArgumentException> {
            ParityAggregator.aggregate(listOf(loadCheckedEvidence()), loadRegistry(), duplicated)
        }
    }

    @Test
    fun registryRowsRejectDuplicateRowIdsAndFixtureIds() {
        val registry = loadRegistry()
        val firstRow = registry.bundle.rows.first()
        val registryWithDuplicate =
            registry.copy(
                bundle =
                    registry.bundle.copy(
                        rows =
                            listOf(
                                firstRow,
                                firstRow,
                            ),
                    ),
            )
        assertFailsWith<IllegalArgumentException> {
            ParityAggregator.aggregate(listOf(loadCheckedEvidence()), registryWithDuplicate, loadPolicy())
        }
    }

    private fun loadCheckedEvidence(): LoadedEvidence = EvidenceLoader.loadEvidence(checkedEvidence)

    private fun passedExecutionBundle(
        source: EvidenceBundle,
        rowId: String,
        row: ProducerEvidenceRow = source.rows.single { it.id == rowId },
    ): EvidenceBundle {
        val definition = loadRegistry().bundle.rows.single { it.id == rowId }
        return source.copy(
            kind = EvidenceKind.PRODUCER,
            producer =
                loadRegistry()
                    .bundle.producers.entries
                    .single { rowId in it.value }
                    .key,
            execution =
                ExecutionEnvelope(
                    task = ":test",
                    status = ExecutionStatus.PASSED,
                    requestedFixtureIds = listOf(definition.fixtureId),
                    startedFixtureIds = listOf(definition.fixtureId),
                    passedFixtureIds = listOf(definition.fixtureId),
                ),
            rows = listOf(row),
        )
    }

    private fun loadPolicy(): LoadedPolicy = EvidenceLoader.loadPolicy(checkedPolicy)

    private fun loadRegistry(): LoadedRegistry = EvidenceLoader.loadRegistry(registryFile)

    private val repositoryRoot: File
        get() = File(requireNotNull(System.getProperty("parity.repositoryRoot")))

    private val checkedEvidence: File
        get() = File(requireNotNull(System.getProperty("parity.evidenceDir")), "parity-assessment.json")

    private val checkedEvidenceSidecar: File
        get() = File(checkedEvidence.parentFile, "${checkedEvidence.name}.sha256")

    private val checkedPolicy: File
        get() = File(requireNotNull(System.getProperty("parity.evidenceDir")), "parity-policy.json")

    private val registryFile: File
        get() = File(repositoryRoot, "conformance/parity/registry/parity-rows.json")

    private val sourceSidecar: File
        get() = checkedEvidenceSidecar
}
