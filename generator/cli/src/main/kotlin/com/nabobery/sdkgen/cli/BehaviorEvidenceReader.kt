package com.nabobery.sdkgen.cli

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import java.nio.file.Files
import java.nio.file.Path

/**
 * Reads the parity gate's parity-matrix evidence (for example `docs/conformance/evidence/parity-matrices.json`) and produces
 * [BehaviorEvidence] for [BehaviorCompatibilityClassifier], the only production path that constructs that type from
 * anything other than a test fixture.
 *
 * **Why this evidence cannot coincide with any other layer (ADR 0013, "Evidence sources"):** `sourceContract`,
 * `semanticModel`, and `kotlinApi` are all writer-computed digests of the *generator's own* pipeline output
 * (pinned source, semantic model, declaration projection). This reader consumes none of that — it reads the parity gate's
 * parity registry, a hand-curated, independently-owned ledger of exactly which behavioral scenario each generated
 * SDK corpus is expected to satisfy and what the parity run observed when it ran that scenario.
 *
 * **A ledger is only evidence when the parity gate actually ran (this is the load-bearing part).** Every row carries a
 * fingerprint whether or not the scenario behind it was ever executed, so comparing two all-`notRun` ledgers finds
 * every fingerprint equal and would report the layer `unchanged` — an absence of evidence laundered into a verified
 * result, which is precisely what ADR 0013's fail-closed invariant forbids. [read] therefore also computes a
 * [BehaviorEvidenceAvailability] from the parity gate's self-assessment, and the classifier refuses to compare anything
 * until both sides are [BehaviorEvidenceAvailability.Usable]. A ledger is usable only when all of:
 *
 * - it reports no `inputErrors` of its own;
 * - its `summary.gateStatus` is `passed` — the parity contract's frozen semantics are that only `passed` counts as passed;
 * - no `required` behavior row is `failed` or `notRun`; and
 * - it is bound to exactly one commit: every non-`notApplicable` row carries the same non-blank `commitSha`.
 *
 * The commit binding is what makes this *current-run* evidence rather than a ledger of unknown vintage. Note the
 * residual: a manifest snapshot carries no commit of its own, so the reader can prove a ledger is internally
 * bound to one commit but cannot yet prove it is the same commit the compared manifests were generated at.
 * Closing that needs a commit field on the manifest itself.
 *
 * **Fixture identity and fingerprint.** Only rows in the `behavior` matrix become [BehaviorFixtureEvidence] — the
 * `compile`, `transport`, and `sourceInvariant` matrices are parity dimensions outside ADR 0013's `behavior` layer
 * and are not read here. A row's `fixtureId` (for example `github.pagination`) is its exact parity fixture identity,
 * matching [BehaviorFixtureEvidence.canonicalSubject]'s `scenario:<fixtureId>` grammar precisely. Two independent
 * fingerprints are computed per row, deliberately from disjoint field sets, so a genuine behavioral-content change
 * (the scenario the parity gate targets) is distinguishable from a genuine run-outcome change (what the parity run observed):
 *
 * - `scenario` fingerprint: a hash of the row's stable *definition* -- `id`, `matrix`, `subject`, `target`,
 *   `scenario`, `fixtureId`, `evidenceLevel`, `requiredness`. This changes only if the parity registry redefines what
 *   the fixture tests.
 * - `wire` fingerprint: a hash of the row's *observed outcome* -- `status`, `reason`, `evidenceSha256`,
 *   `toolchainSha256`, `corpusSha256`, `configDigest`, `configFileSha256`, `overlaySha256`,
 *   `generatedArtifactSha256`, `manifestSha256`, `evidenceProducer`, `waiverOwner`, `disposition1_0`.
 *
 * `commitSha` is deliberately **not** in the outcome fingerprint even though it is read and validated above. Two
 * ledgers being compared are by definition two different runs at two different commits, so including it would move
 * every fixture's fingerprint on every comparison and report the entire behavior surface as changed regardless of
 * what the parity run observed — burying real changes in noise. Its job is binding, not description, and it is enforced as a
 * binding check instead.
 */
internal object BehaviorEvidenceReader {
    @Suppress("DEPRECATION")
    private val MAPPER = ObjectMapper().enable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION)
    private const val MAX_EVIDENCE_BYTES = 16 * 1024 * 1024
    private const val MAX_MATRICES = 16
    private const val MAX_ROWS = 10_000
    private const val BEHAVIOR_MATRIX = "behavior"
    private const val REQUIRED = "required"
    private const val GATE_STATUS_PASSED = "passed"
    private val REQUIREDNESS_VALUES = setOf("required", "optional")
    private val EVIDENCE_LEVEL_VALUES = setOf("generatedClient", "runtimeContract", "sourceInvariant")
    private val SHA256 = Regex("[0-9a-f]{64}")
    private val COMMIT_SHA = Regex("[0-9a-f]{40}")

    /** The parity contract's frozen status vocabulary. A row outside it is malformed, not merely unusable. */
    private val ROW_STATUSES = setOf("passed", "failed", "waived", "notApplicable", "notRun")

    /** A `required` row in one of these states means the parity gate did not establish the behavior the row names. */
    private val UNESTABLISHED_STATUSES = setOf("failed", "notRun")

    internal fun read(path: Path): BehaviorEvidence {
        val bytes =
            try {
                Files.newInputStream(path).use { input -> input.readNBytes(MAX_EVIDENCE_BYTES + 1) }
            } catch (failure: Exception) {
                throw BehaviorEvidenceInputException("parity behavior evidence cannot be read: $path", failure)
            }
        if (bytes.size > MAX_EVIDENCE_BYTES) {
            throw BehaviorEvidenceInputException("parity behavior evidence exceeds the maximum size of 16 MiB: $path")
        }
        val root =
            try {
                MAPPER.readTree(bytes)
            } catch (failure: Exception) {
                throw BehaviorEvidenceInputException("parity behavior evidence is not well-formed JSON: $path", failure)
            }?.takeIf(JsonNode::isObject)
                ?: throw BehaviorEvidenceInputException("parity behavior evidence must be a JSON object: $path")
        if (root.get("schemaVersion")?.takeIf(JsonNode::isTextual)?.asText() != "v1alpha1") {
            throw BehaviorEvidenceInputException(
                "parity behavior evidence declares an unsupported schemaVersion: $path",
            )
        }
        val matrices =
            root.get("matrices")
                ?: throw BehaviorEvidenceInputException("parity behavior evidence is missing matrices: $path")
        if (!matrices.isArray) {
            throw BehaviorEvidenceInputException("parity behavior evidence field matrices must be an array: $path")
        }
        if (matrices.size() > MAX_MATRICES) {
            throw BehaviorEvidenceInputException(
                "parity behavior evidence exceeds the maximum of $MAX_MATRICES matrices: $path",
            )
        }
        val matrixNames =
            matrices.map { matrix ->
                matrix
                    .takeIf(JsonNode::isObject)
                    ?.get("matrix")
                    ?.takeIf(JsonNode::isTextual)
                    ?.asText()
                    ?.takeIf(String::isNotBlank)
                    ?: throw BehaviorEvidenceInputException(
                        "cross-corpus parity matrix has no non-blank matrix name: $path",
                    )
            }
        val duplicateMatrixNames =
            matrixNames
                .groupingBy { it }
                .eachCount()
                .filterValues { count -> count > 1 }
                .keys
        if (duplicateMatrixNames.isNotEmpty()) {
            throw BehaviorEvidenceInputException(
                "parity behavior evidence declares duplicate matrix name(s) " +
                    "${duplicateMatrixNames.sorted().joinToString(", ")}: $path",
            )
        }
        val allRows =
            matrices.flatMap { matrix ->
                val rows =
                    matrix.get("rows")?.takeIf(JsonNode::isArray)
                        ?: throw BehaviorEvidenceInputException(
                            "cross-corpus parity matrix rows must be an array: $path",
                        )
                rows.toList()
            }
        if (allRows.size > MAX_ROWS) {
            throw BehaviorEvidenceInputException(
                "parity behavior evidence exceeds the maximum of $MAX_ROWS rows: $path",
            )
        }

        val behaviorRows =
            matrices.firstOrNull { matrix -> matrix.get("matrix")?.asText() == BEHAVIOR_MATRIX }?.get("rows")
                ?: throw BehaviorEvidenceInputException(
                    "parity behavior evidence declares no \"$BEHAVIOR_MATRIX\" matrix: $path",
                )
        if (!behaviorRows.isArray) {
            throw BehaviorEvidenceInputException("parity behavior matrix rows must be an array: $path")
        }
        if (behaviorRows.isEmpty) {
            throw BehaviorEvidenceInputException("parity behavior matrix must contain at least one row: $path")
        }

        val fixtures = behaviorRows.map { row -> readFixture(row, path) }
        val duplicateIdentities =
            fixtures
                .groupBy(BehaviorFixtureEvidence::fixtureIdentity)
                .filterValues { rows -> rows.size > 1 }
                .keys
        if (duplicateIdentities.isNotEmpty()) {
            throw BehaviorEvidenceInputException(
                "parity behavior evidence declares a duplicate fixtureId " +
                    "${duplicateIdentities.sorted().joinToString(", ")}: $path",
            )
        }

        return BehaviorEvidence(
            fixtures = fixtures,
            availability = availabilityOf(root, behaviorRows, allRows, path),
        )
    }

    /**
     * Derives whether this ledger is usable behavior evidence from the parity gate's record, never from the caller's hope.
     *
     * A structurally invalid document throws; a structurally valid document that records work the parity gate did not perform
     * returns [BehaviorEvidenceAvailability.Unusable] with a stable code so the report can say *why*.
     */
    private fun availabilityOf(
        root: JsonNode,
        behaviorRows: JsonNode,
        allRows: List<JsonNode>,
        path: Path,
    ): BehaviorEvidenceAvailability {
        val summary =
            root.get("summary")?.takeIf { node -> node.isObject }
                ?: throw BehaviorEvidenceInputException("parity behavior evidence is missing summary: $path")
        val gateStatus =
            summary.get("gateStatus")?.takeIf { node -> node.isTextual }?.asText()
                ?: throw BehaviorEvidenceInputException("parity behavior evidence summary is missing gateStatus: $path")
        validateSummary(summary, allRows, path)

        val inputErrorsNode = root.get("inputErrors")
        if (inputErrorsNode != null && !inputErrorsNode.isArray) {
            throw BehaviorEvidenceInputException("parity behavior evidence inputErrors must be an array: $path")
        }
        val inputErrors =
            inputErrorsNode
                ?.map { node ->
                    node.takeIf(JsonNode::isTextual)?.asText()
                        ?: throw BehaviorEvidenceInputException(
                            "parity behavior evidence inputErrors must contain only strings: $path",
                        )
                }.orEmpty()
        if (inputErrors.isNotEmpty()) {
            return BehaviorEvidenceAvailability.Unusable(
                code = "parity-input-errors",
                detail = "The parity gate reported its own input errors: ${inputErrors.sorted().joinToString("; ")}.",
            )
        }

        if (gateStatus != GATE_STATUS_PASSED) {
            return BehaviorEvidenceAvailability.Unusable(
                code = "parity-gate-not-passed",
                detail = "parity gate status is \"$gateStatus\"; only \"$GATE_STATUS_PASSED\" establishes behavior.",
            )
        }

        val unestablished =
            behaviorRows
                .filter { row -> row.optionalText("requiredness") == REQUIRED }
                .filter { row -> row.optionalText("status") in UNESTABLISHED_STATUSES }
                .mapNotNull { row -> row.optionalText("fixtureId") }
        if (unestablished.isNotEmpty()) {
            return BehaviorEvidenceAvailability.Unusable(
                code = "parity-required-row-not-run",
                detail =
                    "The parity gate did not establish ${unestablished.size} required behavior fixture(s): " +
                        "${unestablished.sorted().joinToString(", ")}.",
            )
        }

        return commitBindingFailure(behaviorRows) ?: BehaviorEvidenceAvailability.Usable
    }

    /**
     * A ledger records one run, so every row that claims an outcome must name the same commit it was observed at.
     *
     * `notApplicable` rows are exempt: nothing ran, and nothing is claimed. Every other row — including `waived`,
     * whose waiver was accepted against a specific tree — must be bound.
     */
    private fun commitBindingFailure(behaviorRows: JsonNode): BehaviorEvidenceAvailability.Unusable? {
        val bindable = behaviorRows.filter { row -> row.optionalText("status") != "notApplicable" }
        val unbound =
            bindable
                .filter { row -> row.optionalText("commitSha").isNullOrBlank() }
                .mapNotNull { row -> row.optionalText("fixtureId") }
        if (unbound.isNotEmpty()) {
            return BehaviorEvidenceAvailability.Unusable(
                code = "parity-evidence-not-commit-bound",
                detail = "parity rows declare no commitSha: ${unbound.sorted().joinToString(", ")}.",
            )
        }

        val commits = bindable.mapNotNull { row -> row.optionalText("commitSha") }.distinct()
        if (commits.size > 1) {
            return BehaviorEvidenceAvailability.Unusable(
                code = "parity-evidence-not-commit-bound",
                detail = "parity rows span ${commits.size} commits: ${commits.sorted().joinToString(", ")}.",
            )
        }
        return null
    }

    private fun readFixture(
        row: JsonNode,
        path: Path,
    ): BehaviorFixtureEvidence {
        val fixtureId =
            row.requiredText("fixtureId", path).also {
                if (it.isBlank()) {
                    throw BehaviorEvidenceInputException(
                        "parity behavior evidence row fixtureId must be non-blank: $path",
                    )
                }
            }
        val status = row.requiredText("status", path)
        if (status !in ROW_STATUSES) {
            throw BehaviorEvidenceInputException(
                "parity behavior evidence row $fixtureId declares status \"$status\", which is outside the frozen " +
                    "vocabulary ${ROW_STATUSES.sorted().joinToString(", ")}: $path",
            )
        }
        val requiredness = row.requiredText("requiredness", path)
        if (requiredness !in REQUIREDNESS_VALUES) {
            throw BehaviorEvidenceInputException(
                "parity behavior evidence row $fixtureId declares invalid requiredness \"$requiredness\": $path",
            )
        }
        val evidenceLevel = row.requiredText("evidenceLevel", path)
        if (evidenceLevel !in EVIDENCE_LEVEL_VALUES) {
            throw BehaviorEvidenceInputException(
                "parity behavior evidence row $fixtureId declares invalid evidenceLevel \"$evidenceLevel\": $path",
            )
        }
        listOf("id", "matrix", "subject", "target", "scenario", "evidenceProducer").forEach { field ->
            if (row.requiredText(field, path).isBlank()) {
                throw BehaviorEvidenceInputException("parity behavior evidence row $fixtureId has blank $field: $path")
            }
        }
        if (row.requiredText("matrix", path) != BEHAVIOR_MATRIX) {
            throw BehaviorEvidenceInputException(
                "parity behavior evidence row $fixtureId is nested in behavior but declares another matrix: $path",
            )
        }
        val evidenceSha256 = row.requiredText("evidenceSha256", path)
        if (!SHA256.matches(evidenceSha256)) {
            throw BehaviorEvidenceInputException(
                "parity behavior evidence row $fixtureId has invalid evidenceSha256: $path",
            )
        }
        row.optionalText("commitSha")?.let { commit ->
            if (!COMMIT_SHA.matches(commit)) {
                throw BehaviorEvidenceInputException(
                    "parity behavior evidence row $fixtureId has invalid commitSha: $path",
                )
            }
        }
        DIGEST_FIELDS.forEach { field ->
            row.optionalText(field)?.let { digest ->
                if (!SHA256.matches(digest)) {
                    throw BehaviorEvidenceInputException(
                        "parity behavior evidence row $fixtureId has invalid $field: $path",
                    )
                }
            }
        }

        val definitionKey =
            canonicalKey(
                "id" to row.optionalText("id"),
                "matrix" to row.optionalText("matrix"),
                "subject" to row.optionalText("subject"),
                "target" to row.optionalText("target"),
                "scenario" to row.optionalText("scenario"),
                "fixtureId" to row.optionalText("fixtureId"),
                "evidenceLevel" to evidenceLevel,
                "requiredness" to requiredness,
            )
        val outcomeKey =
            canonicalKey(
                "status" to status,
                "reason" to row.optionalText("reason"),
                "evidenceSha256" to evidenceSha256,
                "toolchainSha256" to row.optionalText("toolchainSha256"),
                "corpusSha256" to row.optionalText("corpusSha256"),
                "configDigest" to row.optionalText("configDigest"),
                "configFileSha256" to row.optionalText("configFileSha256"),
                "overlaySha256" to row.optionalText("overlaySha256"),
                "generatedArtifactSha256" to row.optionalText("generatedArtifactSha256"),
                "manifestSha256" to row.optionalText("manifestSha256"),
                "evidenceProducer" to row.optionalText("evidenceProducer"),
                "waiverOwner" to row.optionalText("waiverOwner"),
                "disposition1_0" to row.optionalText("disposition1_0"),
            )

        return BehaviorFixtureEvidence(
            fixtureIdentity = fixtureId,
            scenario =
                CompatibilityEvidenceReference(
                    kind = "parity-scenario",
                    identity = fixtureId,
                    sha256 = normalizedCompatibilityFingerprint(definitionKey),
                ),
            wire =
                CompatibilityEvidenceReference(
                    kind = "parity-wire",
                    identity = fixtureId,
                    sha256 = normalizedCompatibilityFingerprint(outcomeKey),
                ),
        )
    }

    private fun canonicalKey(vararg fields: Pair<String, String?>): String =
        fields.joinToString(separator = " ") { (name, value) -> "$name=${value ?: ""}" }

    private fun JsonNode.requiredText(
        field: String,
        path: Path,
    ): String =
        get(field)?.takeIf { node -> node.isTextual }?.asText()
            ?: throw BehaviorEvidenceInputException("parity behavior evidence row is missing $field: $path")

    private fun JsonNode.optionalText(field: String): String? = get(field)?.takeIf { node -> !node.isNull }?.asText()

    private fun validateSummary(
        summary: JsonNode,
        rows: List<JsonNode>,
        path: Path,
    ) {
        val statuses = rows.map { row -> row.requiredText("status", path) }
        val expected =
            mapOf(
                "totalRows" to rows.size,
                "passedRows" to statuses.count { it == "passed" },
                "failedRows" to statuses.count { it == "failed" },
                "waivedRows" to statuses.count { it == "waived" },
                "notApplicableRows" to statuses.count { it == "notApplicable" },
                "notRunRows" to statuses.count { it == "notRun" },
            )
        expected.forEach { (field, value) ->
            val actual = summary.get(field)?.takeIf(JsonNode::isIntegralNumber)?.asInt()
            if (actual != value) {
                throw BehaviorEvidenceInputException(
                    "parity behavior evidence summary $field is $actual, expected $value from its rows: $path",
                )
            }
        }
    }

    private val DIGEST_FIELDS =
        setOf(
            "toolchainSha256",
            "corpusSha256",
            "configDigest",
            "configFileSha256",
            "lockFileSha256",
            "overlaySha256",
            "generatedArtifactSha256",
            "manifestSha256",
        )
}

/** Thrown for a malformed or structurally invalid parity behavior evidence input file. */
internal class BehaviorEvidenceInputException(
    message: String,
    cause: Throwable? = null,
) : IllegalArgumentException(message, cause)
