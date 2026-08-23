@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.ConfigLoader
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.engine.declarations.IntersectionResult
import com.nabobery.sdkgen.engine.declarations.SchemaIntersectionResolver
import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.Nullability
import com.nabobery.sdkgen.model.PropertyModel
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SchemaRef
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.openapi.SemanticAdapter
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.deleteIfExists
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.fail

/**
 * Freezes the schema-intersection proof table: one row per direct conflicting `allOf` property in the
 * pinned OpenRouter and GitHub corpora.
 *
 * The evidence columns (corpus..literalIntersection, columns 0-7) are recomputed from each corpus's
 * walker document — for GitHub the production overlay order, for OpenRouter an audit-only seam probe
 * (see [loadOpenRouter]: the compat overlay's production path removals would shrink the walkable
 * document; production-level OpenRouter claims are gated by the two full-config tests) — and the set of
 * parents that carry a conflict is tied back to the production pipeline's own `conflicting allOf
 * property` verdict via [GenerationPipeline.validate] in BOTH directions: the forward check confirms
 * every production-flagged parent is walker-reachable with the reported property, and the reverse sweep
 * ([walkerConflictParentSetEqualsProductionForEveryCorpus]) accounts for every walker-flagged parent.
 *
 * Since the strict resolver landed, the walker (which reads the pre-resolution semantic model) is strictly WIDER than
 * production's post-strict `conflicting allOf property` set: the strict resolver clears most raw conflicts.
 * The reverse sweep therefore partitions every walker-only parent into exactly two reviewed buckets —
 * strict-resolved (production emits the parent GREEN; it is absent from the COMPLETE production exclusion
 * set, not merely the missing-declaration subset) and closure-masked latent (a production
 * `missing-declaration` parent) — and REDs if any walker-only parent is excluded for a reason outside that
 * closure. A resolver-conformance pass ([resolverResolvesEveryStrictProofRow]) then runs the REAL resolver
 * against every strict proof-table row, so the table is bound to the resolver's actual verdicts, not just to
 * the walker's structural evidence.
 *
 * The human-judgment columns (intendedOutcome, mechanism, rationale, columns 8-10) are frozen: they are
 * never recomputed. Verification pins them two independent ways — the mechanism histogram must equal
 * {strict, auditedOverride} at its committed counts, and a SHA-256 digest over the normalized judgment
 * columns (keyed and sorted by (corpus, parentSchema, property)) must equal [EXPECTED_JUDGMENT_DIGEST] —
 * so any silent judgment edit fails with a message pointing back to the regen/reviewed-update procedure.
 *
 * The structural walker mirrors production's own guards ([StandardProjection.flattenObjectProperties]):
 * a revisited schema, a non-object `allOf` branch, or a dangling `$ref` target fails loudly (as
 * production's `unsupported(...)` does) instead of being silently skipped. Only genuine property
 * conflicts are walked past — that is the walker's purpose.
 *
 * Regenerate the committed TSV after an intended corpus/resolver change with `-Dprooftable.regen=true`.
 * Regeneration recomputes ONLY the evidence and JOINS it to the EXISTING human judgments by key
 * (corpus, parentSchema, property): it preserves every judgment verbatim and FAILS — listing the
 * offending keys — if the recomputed key set introduces a new key or drops an existing one, so a
 * judgment is only ever added or removed by a reviewed human edit, never invented or dropped by the
 * regen. After writing, it re-reads the file and re-runs the full verification against the fresh bytes.
 */
class SchemaIntersectionProofTableTest {
    @Test
    fun proofTableFreezesEveryDirectAllOfConflictWithRecomputedEvidence() {
        val sorted = recomputeEvidenceRows()
        val path = proofTablePath()
        if (System.getProperty("prooftable.regen") == "true") {
            regenerate(sorted, path)
        }
        // Whether or not we regenerated, verification always runs against the fresh bytes on disk.
        verifyAgainstCommittedTable(sorted, path)
    }

    /**
     * Reverse-direction sweep: over every schema in the corpus, reconcile the walker's conflict-parent set
     * against production in BOTH directions, using the SAME projection-unit enumeration as the forward
     * evidence path ([ShapeLocator.conflictNames]: the parent's own allOf flatten plus every oneOf/anyOf
     * branch's flatten, because production projects each composition branch as its own model).
     *
     * The set is NOT strict equality. Since the strict resolver landed, the walker (which reads the PRE-resolution semantic model)
     * is strictly WIDER than production's post-strict `conflicting allOf property` set: the strict resolver
     * clears most raw conflicts. Every walker-only parent therefore partitions into exactly one of two reviewed
     * buckets. The contract is three-part:
     *  - (2a) containment: every production `conflicting allOf property` parent is walker-reachable here (the
     *    narrower own-allOf-only walk used to miss OpenRouter `Inputs/anyOf/1/items` and `OutputItems`, whose
     *    production-attributed conflict lives in a branch-projection unit);
     *  - (2b) partition accounting: every walker-only parent (walker-flagged; production does NOT report it as
     *    `conflicting-allOf`) is either STRICT-RESOLVED — the strict resolver cleared the raw conflict, so
     *    production emits the parent GREEN and it is absent from the COMPLETE production exclusion set (not just
     *    the missing-declaration subset) — or CLOSURE-MASKED LATENT — a production `missing-declaration` parent
     *    whose own direct allOf conflict production reached only after a failed dependency masked it. A
     *    walker-only parent excluded for any OTHER reason (outside that closure) is unaccounted and fails hard;
     *  - (2c) anomalies: a parent whose flatten hits a structural anomaly (non-object branch, unresolved ref,
     *    recursion) is one production rejects under a different category or never object-flattens — it is
     *    skipped and must never intersect the production conflicting-allOf set.
     */
    @Test
    fun walkerConflictParentSetEqualsProductionForEveryCorpus() {
        listOf("openrouter", "github").forEach { corpus ->
            val inputs = loadCorpus(corpus)
            val locator = ShapeLocator(inputs.document)
            val productionParents = inputs.productionConflicts.keys
            val missingDeclarationParents = inputs.productionMissingDeclarations
            val startedNanos = System.nanoTime()
            val anomalyParents = mutableSetOf<SchemaId>()
            val walkerConflictParents =
                inputs.document.schemas.keys
                    .filter { parentId ->
                        try {
                            locator.conflictNames(parentId).isNotEmpty()
                        } catch (anomaly: WalkerStructuralAnomaly) {
                            anomalyParents += parentId
                            false
                        }
                    }.toSet()
            val elapsedMillis = (System.nanoTime() - startedNanos) / 1_000_000
            val sweepContext =
                "(reverse sweep took ${elapsedMillis}ms over ${inputs.document.schemas.size} schemas)"

            fun inventoryOf(parents: Set<SchemaId>) =
                parents
                    .associate { parentId -> fragment(parentId.value) to locator.conflictNames(parentId).sorted() }
                    .toSortedMap()

            // (2c) structural-anomaly parents must never be production conflicting-allOf parents.
            val flaggedAnomalies = anomalyParents.intersect(productionParents)
            assertTrue(
                flaggedAnomalies.isEmpty(),
                "$corpus parents ${flaggedAnomalies.map(SchemaId::value)} are production conflicting-allOf " +
                    "parents but the walker hit a structural anomaly flattening them; walker diverged",
            )

            // (2a) production conflicting-allOf ⊆ walker conflict parents.
            val productionOnly = productionParents - walkerConflictParents
            assertEquals(
                emptySet(),
                productionOnly,
                "$corpus production conflicting-allOf parents ${productionOnly.map(SchemaId::value)} are not " +
                    "flagged by the unified walker sweep; unit-enumeration gap $sweepContext",
            )

            // PHASE-AWARE production tie (post-override). The strict resolver clears most raw
            // conflicts and the bound audited overlays resolve the reviewed remainder, so the walker (which
            // reads the pre-resolution semantic model, untouched by the resolver) is strictly wider than
            // production. Every walker-flagged parent falls in exactly one of three reviewed, frozen phase
            // buckets; with the audited overlays applied, PRODUCTION holds only the two GitHub webhook-status email
            // refusals and the LATENT tail is empty.

            // Pin 1 — production conflicting-allOf: only the two non-nameable webhook-status email
            // intersections (GitHub); OpenRouter is empty. Frozen exactly.
            assertEquals(
                EXPECTED_PRODUCTION_CONFLICT_INVENTORY.getValue(corpus),
                inventoryOf(productionParents),
                "$corpus production conflicting-allOf inventory drifted from the reviewed post-strict baseline " +
                    sweepContext,
            )

            // Every walker-only parent partitions into strict-resolved (production emits it GREEN) or
            // closure-masked (a production missing-declaration). strict-resolved is derived against the COMPLETE
            // production exclusion set — not merely the missing-declaration subset — so a parent excluded for any
            // OTHER reason is NOT silently counted as production-GREEN. The exhaustiveness assertion below REDs if
            // a walker-only parent is excluded for a reason outside the closure. Both halves are pinned exactly so
            // a walker/resolver regression that invents, loses, or reclassifies a conflict REDs the owning pin.
            val walkerOnly = walkerConflictParents - productionParents
            val stillLatent = walkerOnly intersect missingDeclarationParents
            val strictResolved = walkerOnly - inputs.productionExcludedParents
            val unaccounted = walkerOnly - strictResolved - stillLatent
            assertEquals(
                emptySet(),
                unaccounted,
                "$corpus walker-only parents ${unaccounted.map(SchemaId::value)} are production-excluded for a " +
                    "reason other than the missing-declaration closure; they are neither strict-resolved " +
                    "(production-GREEN) nor closure-masked $sweepContext",
            )

            // Pin 2 — strict-resolved (walker-only, production-GREEN): the raw conflicts the resolver cleared.
            assertEquals(
                EXPECTED_RESOLVED_CONFLICT_INVENTORY.getValue(corpus),
                inventoryOf(strictResolved),
                "$corpus strict-resolved (walker-only, production-GREEN) inventory drifted $sweepContext",
            )

            // Pin 3 — closure-masked latent conflicts: empty — the audited overlays resolved
            // every surfaced root, un-stranding the closure. Pinned so a regression that re-strands REDs here.
            assertEquals(
                EXPECTED_LATENT_CONFLICT_INVENTORY.getValue(corpus),
                inventoryOf(stillLatent),
                "$corpus closure-masked latent conflict inventory drifted from the reviewed baseline $sweepContext",
            )
        }
    }

    /**
     * Resolver-conformance pass: bind the frozen proof table to the REAL [SchemaIntersectionResolver], not
     * just to the walker's structural evidence. For every committed row we locate the two conflicting operand
     * declarations, run the resolver in BOTH operand orders, and assert:
     *  - `strict` rows resolve to a winner whose rendered shape (winner node + effective nullability) equals
     *    the row's `intendedOutcome`, commutatively — EXCEPT the pinned [RESOLVER_REFUSAL_EXCEPTIONS], whose
     *    sound intersection cannot be named by an existing node (a non-null formatted email whose only node is
     *    nullable), which must stay Unsupported;
     *  - `auditedOverride` rows elect their reviewed branch in BOTH operand orders: the rendering is
     *    commutative, the shape matches the row's `intendedOutcome`, AND the frozen `declared at` pointer
     *    matches the elected property's source pointer — so a right-shaped winner from the WRONG branch fails.
     *
     * A `strict` row outside the pinned exception list that stops resolving is a STOP: it is collected and
     * fails the test with its blocking evidence, so the exception list can never silently grow.
     */
    @Test
    fun resolverResolvesEveryStrictProofRow() {
        val committedByCorpus = parseCommittedRows(proofTablePath()).groupBy { columns -> columns[0] }
        val stops = mutableListOf<String>()
        committedByCorpus.forEach { (corpus, rows) ->
            val inputs = loadCorpus(corpus)
            val locator = ShapeLocator(inputs.document)
            val resolver =
                SchemaIntersectionResolver(
                    dereference = { id -> locator.resolverDereference(id) },
                    effectivelyNullable = { ref -> locator.resolverEffectivelyNullable(ref) },
                )
            rows.forEach { columns ->
                val parentFragment = columns[1]
                val property = columns[2]
                val intendedOutcome = columns[8]
                val mechanism = columns[9]
                val parentId = SchemaId(inputs.canonicalUri + parentFragment)
                val parent = locator.resolverDereference(parentId)
                val (left, right) =
                    requireNotNull(locator.conflictOperands(parentId, property)) {
                        "$corpus $parentFragment.$property: could not locate the conflicting operand declarations"
                    }
                val forward = resolver.resolve(parent, left, right)
                val reverse = resolver.resolve(parent, right, left)
                val label = "$corpus $parentFragment.$property"
                val key = Triple(corpus, parentFragment, property)
                when {
                    mechanism == "auditedOverride" -> {
                        val forwardOverride =
                            forward as? IntersectionResult.AuditedOverride
                                ?: fail("$label expected AuditedOverride forward, got $forward")
                        val reverseOverride =
                            reverse as? IntersectionResult.AuditedOverride
                                ?: fail("$label expected AuditedOverride reverse, got $reverse")
                        assertEquals(
                            locator.renderProperty(forwardOverride.property),
                            locator.renderProperty(reverseOverride.property),
                            "$label: audited winner rendering is not commutative",
                        )
                        val intendedWinner = intendedOutcome.removePrefix("override branch wins: ")
                        if (intendedWinner == "allOf/1") {
                            val winnerPointerSuffix = "/allOf/1/properties/$property"
                            val forwardPointer = forwardOverride.property.source.jsonPointer
                            val reversePointer = reverseOverride.property.source.jsonPointer
                            assertTrue(
                                forwardPointer.endsWith(winnerPointerSuffix) &&
                                    reversePointer.endsWith(winnerPointerSuffix),
                                "$label: audited override did not elect its reviewed allOf/1 branch; " +
                                    "forward=$forwardPointer reverse=$reversePointer",
                            )
                        } else {
                            val intendedShape = intendedWinner.substringBefore(" (declared at ")
                            assertEquals(
                                intendedShape,
                                locator.renderProperty(forwardOverride.property),
                                "$label: audited winner drifted from the frozen intendedOutcome",
                            )
                            // The rendered shape alone cannot distinguish a winner elected from the WRONG branch
                            // (a right-shaped node renders identically), so also pin the frozen declaration
                            // identity: the TSV's `declared at` pointer must equal the elected property's source
                            // pointer in BOTH operand orders. (The single array<ref(.../items)> row carries no
                            // declared-at clause; its identity is pinned by the shape equality above.)
                            val declaredPointer =
                                intendedWinner
                                    .substringAfter(" (declared at ", "")
                                    .removeSuffix(")")
                                    .takeIf { it.isNotEmpty() }
                            if (declaredPointer != null) {
                                val expectedPointer = declaredPointer.removePrefix("#")
                                assertEquals(
                                    expectedPointer,
                                    forwardOverride.property.source.jsonPointer,
                                    "$label: forward election kept the wrong branch's declaration identity",
                                )
                                assertEquals(
                                    expectedPointer,
                                    reverseOverride.property.source.jsonPointer,
                                    "$label: reverse election kept the wrong branch's declaration identity",
                                )
                            }
                        }
                    }

                    key in RESOLVER_REFUSAL_EXCEPTIONS -> {
                        assertTrue(
                            forward is IntersectionResult.Unsupported && reverse is IntersectionResult.Unsupported,
                            "$label is a pinned soundness-refusal row (intended '$intendedOutcome' cannot be named " +
                                "by an existing node); expected Unsupported, got forward=$forward reverse=$reverse",
                        )
                    }

                    forward !is IntersectionResult.Resolved || reverse !is IntersectionResult.Resolved -> {
                        // A strict row outside the pinned exceptions stopped resolving: STOP, do NOT relax it here.
                        stops += "$label (intended '$intendedOutcome'): forward=$forward reverse=$reverse"
                    }

                    else -> {
                        val forwardShape = locator.renderProperty(forward.property)
                        val reverseShape = locator.renderProperty(reverse.property)
                        assertEquals(
                            intendedOutcome,
                            forwardShape,
                            "$label: resolver winner/nullability drifted from the frozen intendedOutcome",
                        )
                        // Commutativity is asserted at the emitted-type (rendered-shape) level: the projection
                        // consumes the winner's shape, not its node id, and value-equal operands (e.g. two
                        // structurally-distinct but equal-valued enums) legitimately let the resolver keep either
                        // node while rendering identically. A genuine order-dependence — a different winning TYPE,
                        // e.g. object-subsume electing the other branch's ref — still REDs here.
                        assertEquals(reverseShape, forwardShape, "$label: resolver rendering is not commutative")
                    }
                }
            }
        }
        assertTrue(
            stops.isEmpty(),
            "strict proof rows stopped resolving after the F1-F3 tightening (STOP — report, do NOT relax " +
                "expectations or grow the exception list):\n" + stops.joinToString("\n"),
        )
    }

    private fun recomputeEvidenceRows(): List<ProofRow> {
        // Post-strict-resolution, production no longer flags the direct parents the resolver cleared, so the
        // evidence recompute is driven off the FROZEN proof-table parent set (the committed parentSchema
        // fragments), NOT production. The walker inspects the raw semantic model — untouched by the resolver —
        // so its evidence for every frozen row is byte-identical to pre-Task-9. The phase-aware production tie
        // now lives in [walkerConflictParentSetEqualsProductionForEveryCorpus].
        val frozenParents = frozenParentFragmentsByCorpus()
        val rows = mutableListOf<ProofRow>()
        listOf(
            "openrouter" to EXPECTED_OPENROUTER_CONFLICTING_ALL_OF_PARENTS,
            "github" to EXPECTED_GITHUB_DIRECT_ALL_OF_CONFLICT_PARENTS,
        ).forEach { (corpus, expectedParents) ->
            val inputs = loadCorpus(corpus)
            val parentFragments = frozenParents.getValue(corpus)
            assertEquals(
                expectedParents,
                parentFragments.size,
                "$corpus frozen proof-table parent count drifted from the committed TSV",
            )
            val locator = ShapeLocator(inputs.document)
            parentFragments.forEach { parentFragment ->
                val parentId = SchemaId(inputs.canonicalUri + parentFragment)
                val conflicts = locator.conflictNames(parentId)
                assertTrue(
                    conflicts.isNotEmpty(),
                    "walker found no direct allOf conflict for frozen parent ${parentId.value}",
                )
                conflicts.sorted().forEach { property ->
                    val located =
                        requireNotNull(locator.locate(parentId, property)) {
                            "could not locate conflicting shapes for '$property' in ${parentId.value}"
                        }
                    rows += ProofRow(corpus, fragment(parentId.value), property, located)
                }
            }
        }
        val sorted = rows.sortedWith(compareBy(ProofRow::corpus, ProofRow::parentSchema, ProofRow::property))
        assertEquals(
            EXPECTED_OPENROUTER_PROOF_ROWS,
            sorted.count { it.corpus == "openrouter" },
            "OpenRouter proof-row count drifted",
        )
        assertEquals(
            EXPECTED_GITHUB_PROOF_ROWS,
            sorted.count { it.corpus == "github" },
            "GitHub proof-row count drifted",
        )
        return sorted
    }

    /**
     * Regeneration joins recomputed evidence to the EXISTING human judgments by key. It preserves every
     * judgment verbatim and refuses to invent or drop one: a recomputed key with no committed judgment,
     * or a committed judgment whose key vanished, fails the run with the offending keys listed.
     */
    private fun regenerate(
        sorted: List<ProofRow>,
        path: Path,
    ) {
        val committedRows = parseCommittedRows(path)
        val existingJudgments =
            committedRows.associate { columns ->
                RowKey(columns[0], columns[1], columns[2]) to columns.subList(8, 11)
            }
        require(existingJudgments.size == committedRows.size) {
            "committed proof table has duplicate (corpus, parentSchema, property) keys; cannot join judgments"
        }
        val recomputedKeys = sorted.map { RowKey(it.corpus, it.parentSchema, it.property) }
        val newKeys = recomputedKeys.toSet() - existingJudgments.keys
        val removedKeys = existingJudgments.keys - recomputedKeys.toSet()
        if (newKeys.isNotEmpty() || removedKeys.isNotEmpty()) {
            fail(
                buildString {
                    appendLine("proof-table regeneration cannot invent or drop human judgments.")
                    if (newKeys.isNotEmpty()) {
                        appendLine("New keys need a human-supplied judgment (add rows by hand, then rerun):")
                        newKeys
                            .sortedWith(compareBy({ it.corpus }, { it.parentSchema }, { it.property }))
                            .forEach { appendLine("  + ${it.corpus}\t${it.parentSchema}\t${it.property}") }
                    }
                    if (removedKeys.isNotEmpty()) {
                        appendLine("Removed keys must be deleted by a reviewed human edit (their judgment is stale):")
                        removedKeys
                            .sortedWith(compareBy({ it.corpus }, { it.parentSchema }, { it.property }))
                            .forEach { appendLine("  - ${it.corpus}\t${it.parentSchema}\t${it.property}") }
                    }
                },
            )
        }
        val lines =
            listOf(PROOF_HEADER) +
                sorted.map { row ->
                    val judgment = existingJudgments.getValue(RowKey(row.corpus, row.parentSchema, row.property))
                    (row.evidenceColumns() + judgment).joinToString("\t")
                }
        Files.writeString(path, lines.joinToString("\n") + "\n")
    }

    private fun verifyAgainstCommittedTable(
        sorted: List<ProofRow>,
        path: Path,
    ) {
        val committed = path.readText().trimEnd('\n').split("\n")
        assertEquals(PROOF_HEADER, committed.first(), "proof-table header drifted")
        val committedRows = committed.drop(1)
        assertEquals(sorted.size, committedRows.size, "proof-table row count drifted from the committed TSV")
        val parsed = committedRows.map { it.split("\t") }
        parsed.forEachIndexed { index, committedColumns ->
            assertEquals(PROOF_HEADER.split("\t").size, committedColumns.size, "row $index has the wrong column count")
        }
        sorted.forEachIndexed { index, recomputed ->
            // Evidence columns 0..7 are recomputed from the production semantic model and must match exactly.
            recomputed.evidenceColumns().forEachIndexed { column, value ->
                assertEquals(value, parsed[index][column], "evidence drift in column $column of row $index")
            }
            // Judgment columns 8..10 are frozen human analysis: validated for shape only, never recomputed.
            assertTrue(parsed[index][8].isNotBlank(), "row $index has a blank intendedOutcome")
            assertTrue(
                parsed[index][9] in setOf("strict", "auditedOverride"),
                "row $index has an invalid mechanism '${parsed[index][9]}'",
            )
            assertTrue(parsed[index][10].isNotBlank(), "row $index has a blank rationale")
        }

        // Freeze the judgment content two independent ways, so any silent edit to columns 8-10 fails here.
        val mechanismHistogram = parsed.groupingBy { it[9] }.eachCount()
        assertEquals(
            mapOf("strict" to EXPECTED_STRICT_MECHANISMS, "auditedOverride" to EXPECTED_AUDITED_OVERRIDE_MECHANISMS),
            mechanismHistogram,
            "proof-table mechanism histogram drifted; regenerate via -Dprooftable.regen=true after a reviewed " +
                "judgment change, or restore the committed judgments",
        )
        assertEquals(
            EXPECTED_JUDGMENT_DIGEST,
            judgmentDigest(parsed),
            "proof-table judgment digest drifted; a judgment column (8-10) was edited without a reviewed update. " +
                "Restore the committed judgments, or after a reviewed change recompute EXPECTED_JUDGMENT_DIGEST",
        )
    }

    /**
     * The frozen proof-table parent set per corpus: the distinct parentSchema fragments in the committed TSV,
     * in first-seen order. Drives the evidence recompute so it stays anchored to the reviewed rows rather than
     * to production's (post-resolution) conflict set.
     */
    private fun frozenParentFragmentsByCorpus(): Map<String, List<String>> =
        parseCommittedRows(proofTablePath())
            .groupBy({ columns -> columns[0] }, { columns -> columns[1] })
            .mapValues { (_, parents) -> parents.distinct() }

    /** Parses the committed TSV into per-row column lists (header dropped), for the regen/digest joins. */
    private fun parseCommittedRows(path: Path): List<List<String>> =
        path
            .readText()
            .trimEnd('\n')
            .split("\n")
            .drop(1)
            .map { it.split("\t") }

    /**
     * SHA-256 over the normalized judgment columns: each row reduced to its key (corpus, parentSchema,
     * property) plus judgment columns 8-10, sorted by key and tab/newline-joined so the digest is stable
     * against row reordering and sensitive only to a judgment-content edit.
     */
    private fun judgmentDigest(rows: List<List<String>>): String {
        val canonical =
            rows
                .map { columns -> RowKey(columns[0], columns[1], columns[2]) to columns.subList(8, 11) }
                .sortedWith(compareBy({ it.first.corpus }, { it.first.parentSchema }, { it.first.property }))
                .joinToString("\n") { (key, judgment) ->
                    (listOf(key.corpus, key.parentSchema, key.property) + judgment).joinToString("\t")
                }
        return MessageDigest
            .getInstance("SHA-256")
            .digest(canonical.toByteArray(Charsets.UTF_8))
            .joinToString("") { "%02x".format(it) }
    }

    private data class RowKey(
        val corpus: String,
        val parentSchema: String,
        val property: String,
    )

    private fun proofTablePath(): Path {
        val github = Path.of(requireNotNull(System.getProperty("engine.githubFile")))
        val repoRoot = github.parent.parent.parent
        return repoRoot.resolve("docs/conformance/evidence/schema-intersection-proof-table.tsv")
    }

    private data class ProofRow(
        val corpus: String,
        val parentSchema: String,
        val property: String,
        val located: LocatedConflict,
    ) {
        fun evidenceColumns(): List<String> =
            listOf(
                corpus,
                parentSchema,
                property,
                located.leftSource,
                located.leftShape,
                located.rightSource,
                located.rightShape,
                located.literalIntersection,
            )
    }

    // ---- corpus loading ----

    private data class CorpusInputs(
        val document: SemanticDocument,
        val canonicalUri: String,
        val packageName: String,
        val clientName: String,
        val modelPrefix: String?,
        val operationPrefix: String?,
        val runtimeDefaults: RuntimeDefaults,
        val productionConflicts: Map<SchemaId, String>,
        val productionMissingDeclarations: Set<SchemaId>,
        val productionExcludedParents: Set<SchemaId>,
    )

    private fun loadCorpus(corpus: String): CorpusInputs =
        when (corpus) {
            "openrouter" -> loadOpenRouter()
            "github" -> loadGitHub()
            else -> error("unknown corpus $corpus")
        }

    private fun loadOpenRouter(): CorpusInputs {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.openRouterFile")))
        val bytes = sourcePath.readBytes()
        val canonicalUri = "sdkgen://openrouter/openapi.yaml"
        val source = ResolvedSource(sourcePath, canonicalUri, bytes.sha256(), bytes.size.toLong())
        val configPath = sourcePath.parent.resolve("sdkgen.yaml")
        val configured = ConfigLoader.decodeYaml(configPath.readText(), configPath.toString())
        // SEAM PROBE, not a production claim: the walker must see every schema in the corpus, but the compat
        // overlay removes the /messages and /responses paths (and would strand nothing — it is a production
        // removal), so binding it here would shrink the walkable document. This loader therefore applies ONLY
        // the audit overlay: it supplies every reviewed resolution while keeping all schemas present for the
        // walker. Production-level claims about OpenRouter (zero blockers, applied overlay order) are gated by
        // OpenRouterBlockerInventoryTest and OpenRouterTokenizerContractTest, which bind the FULL sdkgen.yaml
        // list; Pin 1's empty openrouter production inventory below is likewise read from this audit-only view
        // and independently corroborated by the inventory test's zero-blocker assertions.
        val config = configured.copy(overlays = configured.overlays.filter { it.id == OPENROUTER_AUDIT_OVERLAY_ID })
        val overlays = openRouterOverlays(sourcePath)
        val validation = GenerationPipeline("conformance-test").validate(config, source, overlays)
        val effective = materializeEffectiveSource(config, source, overlays)
        val document =
            try {
                SemanticAdapter().adapt(effective, rootCanonicalUri = canonicalUri).document
            } finally {
                if (effective != source.path) effective.deleteIfExists()
            }
        return CorpusInputs(
            document = document,
            canonicalUri = canonicalUri,
            packageName = config.kotlin.packageName,
            clientName = config.kotlin.naming.clientName,
            modelPrefix = config.kotlin.naming.modelPrefix,
            operationPrefix = config.kotlin.naming.operationPrefix,
            runtimeDefaults = config.runtime,
            productionConflicts = conflictParents(validation),
            productionMissingDeclarations = missingDeclarationParents(validation),
            productionExcludedParents = excludedSchemaParents(validation),
        )
    }

    private fun openRouterOverlays(sourcePath: Path): List<ResolvedGenerationOverlay> =
        listOf(resolvedOverlay(sourcePath, "openrouter-allof-resolution-audit", "allof-resolution-audit.yaml"))

    private fun resolvedOverlay(
        sourcePath: Path,
        id: String,
        fileName: String,
    ): ResolvedGenerationOverlay {
        val path = sourcePath.parent.resolve("overlays/$fileName")
        val bytes = path.readBytes()
        return ResolvedGenerationOverlay(
            id = id,
            path = path,
            canonicalUri = "sdkgen://overlay/$id",
            sha256 = bytes.sha256(),
        )
    }

    private fun loadGitHub(): CorpusInputs {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.githubFile")))
        val bytes = sourcePath.readBytes()
        val canonicalUri = "sdkgen://source/openapi.yaml"
        val source = ResolvedSource(sourcePath, canonicalUri, bytes.sha256(), bytes.size.toLong())
        val configFile = Path.of(requireNotNull(System.getProperty("engine.t10GitHubConfig")))
        val config = ConfigLoader.decodeYaml(configFile.readText(), configFile.toString())
        val overlayPath = sourcePath.parent.resolve("overlays/code-search-runtime-semantics.yaml")
        val overlayBytes = overlayPath.readBytes()
        val auditOverlayPath = sourcePath.parent.resolve("overlays/allof-resolution-audit.yaml")
        val auditOverlayBytes = auditOverlayPath.readBytes()
        val overlays =
            listOf(
                ResolvedGenerationOverlay(
                    id = "github-code-search-runtime-semantics",
                    path = overlayPath,
                    canonicalUri = "sdkgen://overlay/github-code-search-runtime-semantics",
                    sha256 = overlayBytes.sha256(),
                ),
                ResolvedGenerationOverlay(
                    id = "github-allof-resolution-audit",
                    path = auditOverlayPath,
                    canonicalUri = "sdkgen://overlay/github-allof-resolution-audit",
                    sha256 = auditOverlayBytes.sha256(),
                ),
            )
        val validation =
            GenerationPipeline("sdkgen-maintainers")
                .validate(config.copy(acceptedWaivers = emptyList()), source, overlays)
        val effective = materializeEffectiveSource(config, source, overlays)
        val document =
            try {
                SemanticAdapter().adapt(effective, rootCanonicalUri = canonicalUri).document
            } finally {
                if (effective != source.path) effective.deleteIfExists()
            }
        return CorpusInputs(
            document = document,
            canonicalUri = canonicalUri,
            packageName = config.kotlin.packageName,
            clientName = config.kotlin.naming.clientName,
            modelPrefix = config.kotlin.naming.modelPrefix,
            operationPrefix = config.kotlin.naming.operationPrefix,
            runtimeDefaults = config.runtime,
            productionConflicts = conflictParents(validation),
            productionMissingDeclarations = missingDeclarationParents(validation),
            productionExcludedParents = excludedSchemaParents(validation),
        )
    }

    private val conflictRegex =
        Regex("Schema '(.+)' cannot be represented: conflicting allOf property '(.+)'")

    private fun conflictParents(validation: ValidationResult): Map<SchemaId, String> =
        validation.exclusions
            .mapNotNull { exclusion ->
                conflictRegex.matchEntire(exclusion.reason)?.let { match ->
                    SchemaId(match.groupValues[1]) to match.groupValues[2]
                }
            }.toMap()

    private val missingDeclarationRegex =
        Regex("Schema '(.+)' cannot be represented: schema .+ has no emitted declaration")

    /**
     * The production `missing-declaration` closure keyed by the schema whose own projection aborts because a
     * dependency in the failure set has no emitted declaration (reason text `... has no emitted declaration
     * ...`, mirrored by [StandardProjection] line ~2000). A walker-only conflict parent — one the walker
     * flags but production does not report as `conflicting allOf property` — is legitimate only if it sits in
     * this set: production reached `typeFor` on a failed dependency before it reached the parent's own direct
     * allOf conflict, so the direct conflict is masked behind the closure rather than absent.
     */
    private fun missingDeclarationParents(validation: ValidationResult): Set<SchemaId> =
        validation.exclusions
            .mapNotNull { exclusion ->
                missingDeclarationRegex.matchEntire(exclusion.reason)?.let { match -> SchemaId(match.groupValues[1]) }
            }.toSet()

    private val excludedSchemaRegex =
        Regex("Schema '([^']+)' cannot be represented:.*", RegexOption.DOT_MATCHES_ALL)

    /**
     * Every schema the production pipeline excluded, keyed by the schema id in its `Schema '<id>' cannot be
     * represented: ...` reason — the COMPLETE exclusion set regardless of category (conflicting-allOf,
     * missing-declaration, or any other unrepresentable reason). A walker-only conflict parent counts as
     * production-GREEN only if it is absent from this whole set, so a parent excluded for some OTHER reason
     * can never be miscounted as strict-resolved.
     */
    private fun excludedSchemaParents(validation: ValidationResult): Set<SchemaId> =
        validation.exclusions
            .mapNotNull { exclusion ->
                excludedSchemaRegex.matchEntire(exclusion.reason)?.let { match -> SchemaId(match.groupValues[1]) }
            }.toSet()

    private fun ByteArray.sha256(): String =
        MessageDigest.getInstance("SHA-256").digest(this).joinToString("") { "%02x".format(it) }

    private companion object {
        const val OPENROUTER_AUDIT_OVERLAY_ID = "openrouter-allof-resolution-audit"

        // Distinct parent schemas frozen in the proof-table TSV per corpus (a parent can carry many rows). The
        // TSV is byte-stable across the resolver's introduction, so these are unchanged; they now gate the evidence-recompute driver
        // (frozen parents), not production's post-resolution conflict count — the phase-aware production tie
        // lives in walkerConflictParentSetEqualsProductionForEveryCorpus.
        const val EXPECTED_OPENROUTER_CONFLICTING_ALL_OF_PARENTS = 25
        const val EXPECTED_GITHUB_DIRECT_ALL_OF_CONFLICT_PARENTS = 12

        /**
         * Strict proof-table rows whose SOUND intersection the resolver cannot name with an existing node, so
         * it correctly refuses (Unsupported) rather than emit a wrong contract. The two webhook-status commit
         * email fields intersect `string(email)? ∧ string` to a NON-NULL formatted email, but the only
         * email-format node in the graph is nullable; forcing it non-null would be a lie, and the resolver may
         * not synthesize a node. Pinned exactly: if the resolver refuses any strict row OUTSIDE this set,
         * [resolverResolvesEveryStrictProofRow] STOPs instead of silently widening the exceptions.
         */
        val RESOLVER_REFUSAL_EXCEPTIONS: Set<Triple<String, String, String>> =
            setOf(
                Triple(
                    "github",
                    "#/components/schemas/webhook-status/properties/commit/properties/commit/properties/author",
                    "email",
                ),
                Triple(
                    "github",
                    "#/components/schemas/webhook-status/properties/commit/properties/commit/properties/committer",
                    "email",
                ),
            )

        // Enumerated proof-table rows per corpus at the frozen baseline (a parent can carry many conflicts).
        const val EXPECTED_OPENROUTER_PROOF_ROWS = 31
        const val EXPECTED_GITHUB_PROOF_ROWS = 93

        // Frozen judgment content. The mechanism histogram and the SHA-256 digest over the normalized
        // judgment columns (8-10) are the two independent locks on the human analysis: an edit that keeps
        // the histogram intact still trips the digest, and vice versa. Recompute the digest (the failure
        // message prints the actual) only after a reviewed judgment change or a -Dprooftable.regen=true run.
        const val EXPECTED_STRICT_MECHANISMS = 96
        const val EXPECTED_AUDITED_OVERRIDE_MECHANISMS = 28
        const val EXPECTED_JUDGMENT_DIGEST = "a6f888796cb4320ecf5f71027407307fedc545a35b6016f33ae4d302b0a82e0a"

        const val PROOF_HEADER =
            "corpus\tparentSchema\tproperty\tleftSource\tleftShape\trightSource\trightShape\t" +
                "literalIntersection\tintendedOutcome\tmechanism\trationale"

        // Phase inventories (reviewed 2026-08-21; flipped to the post-override state 2026-08-22). Each maps a
        // corpus to parent-fragment -> sorted raw walker conflict-property names. Together they exactly
        // partition every walker-flagged parent: with the audited overlays bound, PRODUCTION holds only
        // the two GitHub email refusals and LATENT is empty.

        // The identical raw walker conflict set every webhook `issue` allOf carries (shared base + branch).
        val ISSUE_CONFLICTS =
            listOf(
                "active_lock_reason",
                "assignee",
                "assignees",
                "author_association",
                "id",
                "labels",
                "milestone",
                "performed_via_github_app",
                "reactions",
                "state",
                "user",
            )

        // Pin 1: only the two non-nameable webhook-status email intersections remain production blockers.
        // Every OpenRouter root and every reviewed GitHub webhook override now resolves through its bound audit.
        val EXPECTED_PRODUCTION_CONFLICT_INVENTORY: Map<String, Map<String, List<String>>> =
            mapOf(
                "openrouter" to sortedMapOf(),
                "github" to
                    sortedMapOf(
                        "#/components/schemas/webhook-status/properties/commit/properties/commit/properties/author" to
                            listOf("email"),
                        (
                            "#/components/schemas/webhook-status/properties/commit/properties/commit/" +
                                "properties/committer"
                        ) to listOf("email"),
                    ),
            )

        // Pin 2: raw walker conflicts the strict resolver cleared, so production emits these parents GREEN
        // (walker-only, not excluded). Permanent — the audited overlays do not touch them.
        val EXPECTED_RESOLVED_CONFLICT_INVENTORY: Map<String, Map<String, List<String>>> =
            mapOf(
                "openrouter" to
                    sortedMapOf(
                        "#/components/schemas/ContentPartAddedEvent" to listOf("part"),
                        "#/components/schemas/ContentPartDoneEvent" to listOf("part"),
                        "#/components/schemas/MessagesResult" to listOf("usage"),
                        "#/components/schemas/OpenResponsesCreatedEvent" to listOf("response"),
                        "#/components/schemas/OpenResponsesInProgressEvent" to listOf("response"),
                        "#/components/schemas/OpenResponsesResult" to
                            listOf("output", "service_tier", "text", "usage"),
                        "#/components/schemas/StreamEvents" to listOf("item", "logprobs", "part", "response"),
                        "#/components/schemas/StreamEventsResponseCompleted" to listOf("response"),
                        "#/components/schemas/StreamEventsResponseFailed" to listOf("response"),
                        "#/components/schemas/StreamEventsResponseIncomplete" to listOf("response"),
                        "#/components/schemas/StreamEventsResponseOutputItemAdded" to listOf("item"),
                        "#/components/schemas/StreamEventsResponseOutputItemDone" to listOf("item"),
                        "#/components/schemas/TextDeltaEvent" to listOf("logprobs"),
                        "#/components/schemas/TextDoneEvent" to listOf("logprobs"),
                        "#/components/schemas/CustomToolCallOutputItem" to listOf("output"),
                        "#/components/schemas/FunctionCallOutputItem" to listOf("output"),
                        "#/components/schemas/Inputs/anyOf/1/items" to listOf("content", "output", "summary"),
                        "#/components/schemas/Inputs/anyOf/1/items/anyOf/7" to listOf("content"),
                        "#/components/schemas/Inputs/anyOf/1/items/anyOf/8" to listOf("content", "summary"),
                        "#/components/schemas/ListEndpointsResponse/properties/architecture" to listOf("tokenizer"),
                        "#/components/schemas/MessagesResult/allOf/1/properties/usage" to listOf("service_tier"),
                        "#/components/schemas/OutputItems" to listOf("content"),
                        "#/components/schemas/OutputReasoningItem" to listOf("content"),
                        "#/components/schemas/ReasoningItem" to listOf("content"),
                        "#/components/schemas/StreamLogprob" to listOf("top_logprobs"),
                        "#/components/schemas/TextExtendedConfig" to listOf("verbosity"),
                    ),
                "github" to
                    sortedMapOf(
                        "#/components/schemas/webhook-fork/properties/forkee" to
                            listOf(
                                "created_at",
                                "id",
                                "language",
                                "license",
                                "mirror_url",
                                "owner",
                                "pushed_at",
                                "topics",
                                "visibility",
                            ),
                        "#/components/schemas/webhook-issue-comment-created/properties/issue" to ISSUE_CONFLICTS,
                        "#/components/schemas/webhook-issue-comment-deleted/properties/issue" to ISSUE_CONFLICTS,
                        "#/components/schemas/webhook-issue-comment-edited/properties/issue" to ISSUE_CONFLICTS,
                        "#/components/schemas/webhook-issue-comment-pinned/properties/issue" to ISSUE_CONFLICTS,
                        "#/components/schemas/webhook-issue-comment-unpinned/properties/issue" to ISSUE_CONFLICTS,
                        "#/components/schemas/webhook-issues-closed/properties/issue" to ISSUE_CONFLICTS,
                        "#/components/schemas/webhook-project-card-moved/properties/project_card" to
                            listOf("after_id", "creator"),
                        "#/components/schemas/webhook-workflow-job-completed/properties/workflow_job" to
                            listOf(
                                "completed_at",
                                "conclusion",
                                "labels",
                                "run_id",
                                "runner_group_id",
                                "runner_id",
                                "status",
                                "steps",
                            ),
                        "#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job" to
                            listOf("conclusion", "run_id", "runner_group_id", "runner_id", "status", "steps"),
                    ),
            )

        // Pin 3: audited overrides complete the closure, so no walker conflict remains closure-masked.
        val EXPECTED_LATENT_CONFLICT_INVENTORY: Map<String, Map<String, List<String>>> =
            mapOf(
                "openrouter" to sortedMapOf(),
                "github" to sortedMapOf(),
            )
    }
}

// ---- shape location (structural walk over the semantic model) ----

private data class LocatedConflict(
    val leftSource: String,
    val leftShape: String,
    val rightSource: String,
    val rightShape: String,
    val literalIntersection: String,
)

/**
 * Raised when the structural walker hits an anomaly production itself rejects: a revisited schema
 * (recursive allOf), a non-object allOf branch, or a dangling `$ref` target. Mirrors production's
 * `unsupported(...)` in [StandardProjection.flattenObjectProperties]. Every caller lets it propagate,
 * so malformed structural input fails the proof loudly rather than looking like a non-conflict.
 */
private class WalkerStructuralAnomaly(
    message: String,
) : RuntimeException(message)

private data class Shape(
    val kind: String,
    val format: String?,
    val nullable: Boolean,
    val refTarget: String?,
    val refSig: String?,
    val enumValues: List<String>?,
    val itemShape: Shape?,
    val unionMembers: List<Shape>? = null,
)

private class ShapeLocator(
    private val document: SemanticDocument,
) {
    private val schemas = document.schemas

    private data class Decl(
        val ownerId: SchemaId,
        val property: PropertyModel,
    )

    private data class Tuple(
        val base: String,
        val typeNullable: Boolean,
        val propertyNullable: Boolean,
    )

    /**
     * Finds the two branch declarations of [propertyName] that conflict inside [parentId], searching
     * the parent's own allOf flatten and every oneOf/anyOf branch's flatten (projection projects each
     * composition branch as its own model). Returns null only if no conflicting pair is reachable.
     */
    fun conflictNames(parentId: SchemaId): Set<String> {
        val parent = deref(parentId)
        val names = mutableSetOf<String>()
        for (root in flattenRoots(parent)) {
            val declarations = mutableListOf<Decl>()
            collect(root, mutableSetOf(), declarations)
            declarations.groupBy { it.property.name }.forEach { (name, decls) ->
                if (decls.map { tupleOf(it.property) }.distinct().size > 1) names += name
            }
        }
        return names
    }

    /**
     * The two conflicting property declarations of [propertyName] inside [parentId] — the same pair
     * [locate] renders, returned as the raw semantic [PropertyModel]s so the REAL resolver can run against
     * them. `null` when no conflicting pair is reachable.
     */
    fun conflictOperands(
        parentId: SchemaId,
        propertyName: String,
    ): Pair<PropertyModel, PropertyModel>? {
        val parent = deref(parentId)
        for (root in flattenRoots(parent)) {
            val declarations = mutableListOf<Decl>()
            collect(root, mutableSetOf(), declarations)
            val named = declarations.filter { it.property.name == propertyName }
            if (named.size < 2) continue
            val left = named.first()
            val leftTuple = tupleOf(left.property)
            val differing =
                named.firstOrNull { tupleOf(it.property) != leftTuple }
                    ?: named.firstOrNull { shapeOf(it.property) != shapeOf(left.property) }
                    ?: continue
            return left.property to differing.property
        }
        return null
    }

    /** The rendered shape (kind, format, nullability) of a property, in the proof table's own notation. */
    fun renderProperty(property: PropertyModel): String = renderShape(shapeOf(property))

    /** Dereference mirroring the engine's `StandardProjection.dereference`, for building the real resolver. */
    fun resolverDereference(id: SchemaId): SchemaModel = deref(id)

    /** Effective nullability mirroring the engine's `StandardProjection.isEffectivelyNullable`. */
    fun resolverEffectivelyNullable(ref: SchemaRef): Boolean {
        val schema = deref(ref.schemaId)
        return referenceChainIsNullable(ref.schemaId) ||
            schema.nullability == Nullability.NULLABLE ||
            transparentAllOfAnnotationsAreNullable(schema)
    }

    fun locate(
        parentId: SchemaId,
        propertyName: String,
    ): LocatedConflict? {
        val parent = deref(parentId)
        for (root in flattenRoots(parent)) {
            val declarations = mutableListOf<Decl>()
            collect(root, mutableSetOf(), declarations)
            val named = declarations.filter { it.property.name == propertyName }
            if (named.size < 2) continue
            val left = named.first()
            val leftTuple = tupleOf(left.property)
            val differing =
                named.firstOrNull { tupleOf(it.property) != leftTuple }
                    ?: named.firstOrNull { shapeOf(it.property) != shapeOf(left.property) }
                    ?: continue
            val leftShape = shapeOf(left.property)
            val rightShape = shapeOf(differing.property)
            val result = intersect(leftShape, rightShape)
            return LocatedConflict(
                leftSource = fragment(left.ownerId.value),
                leftShape = renderShape(leftShape),
                rightSource = fragment(differing.ownerId.value),
                rightShape = renderShape(rightShape),
                literalIntersection = "${renderShape(leftShape)} ∧ ${renderShape(rightShape)} = ${result.rendered}",
            )
        }
        return null
    }

    /**
     * Property conflicts reachable through [parentId]'s OWN allOf flatten only — the exact mirror of
     * production's [StandardProjection.flattenObjectProperties], which attributes a `conflicting allOf
     * property` blocker to the schema whose own allOf flatten conflicts (not to its oneOf/anyOf branches,
     * which production projects as separate models). Used by the reverse-direction parent-set check.
     */
    private fun flattenRoots(parent: SchemaModel): List<SchemaModel> {
        val effective = deref(parent.id)
        val roots = mutableListOf(effective)
        effective.compositions.forEach { composition ->
            if (composition.kind != CompositionKind.ALL_OF) {
                composition.branches.forEach { branch -> roots += deref(branch.schemaId) }
            }
        }
        return roots
    }

    private fun collect(
        schema: SchemaModel,
        visited: MutableSet<SchemaId>,
        out: MutableList<Decl>,
        rootId: SchemaId = schema.id,
    ) {
        val effective = deref(schema.id)
        // Mirror production's guards (StandardProjection.flattenObjectProperties): a revisited schema is a
        // recursive allOf, and a non-object allOf branch is unrepresentable. Production fails on both, so
        // the walker fails loudly here instead of silently skipping — only true property conflicts (found
        // by the caller after collection) are walked past.
        if (!visited.add(effective.id)) {
            throw WalkerStructuralAnomaly(
                "recursive allOf composition while flattening ${rootId.value}: revisited ${effective.id.value}",
            )
        }
        effective.properties.forEach { out += Decl(effective.id, it) }
        effective.compositions.filter { it.kind == CompositionKind.ALL_OF }.forEach { composition ->
            composition.branches.forEach { branch ->
                val branchSchema = deref(branch.schemaId)
                if (isAnnotationOnly(branchSchema)) return@forEach
                if (!isObjectLike(branchSchema)) {
                    throw WalkerStructuralAnomaly(
                        "allOf branch ${branch.schemaId.value} of ${effective.id.value} is not an object " +
                            "while flattening ${rootId.value}",
                    )
                }
                collect(branchSchema, visited, out, rootId)
            }
        }
        visited.remove(effective.id)
    }

    private fun tupleOf(property: PropertyModel): Tuple {
        val sig = typeSig(property.schema)
        return Tuple(sig.base, sig.nullable, property.nullability == Nullability.NULLABLE)
    }

    private data class Sig(
        val base: String,
        val nullable: Boolean,
    )

    private fun typeSig(ref: SchemaRef): Sig {
        val chainNullable = referenceChainIsNullable(ref.schemaId)
        val schema = deref(ref.schemaId)
        val transparent = transparentAllOfBranch(schema)
        val nullable =
            chainNullable ||
                schema.nullability == Nullability.NULLABLE ||
                transparentAllOfAnnotationsAreNullable(schema)
        if (transparent != null) {
            val inner = typeSig(SchemaRef(transparent.id, ref.source))
            return Sig(inner.base, nullable || inner.nullable)
        }
        if (schemaNeedsDeclaration(schema)) {
            return Sig("named:${schema.id.value}", nullable)
        }
        val scalarBranches =
            schema.compositions
                .filter { it.kind == CompositionKind.ALL_OF }
                .flatMap { it.branches }
                .map { deref(it.schemaId) }
                .filterNot(::isAnnotationOnly)
        if (scalarBranches.size == 1 && !isObjectLike(scalarBranches.single())) {
            val inner = typeSig(SchemaRef(scalarBranches.single().id, ref.source))
            return Sig(inner.base, nullable || inner.nullable)
        }
        return Sig(baseType(schema), nullable)
    }

    private fun baseType(schema: SchemaModel): String {
        val concrete = schema.types.filterNot { it == "null" }.distinct()
        val single = concrete.singleOrNull()
        val typedAp = schema.additionalProperties as? com.nabobery.sdkgen.model.AdditionalPropertiesModel.Typed
        return when {
            schema.format == "binary" -> {
                if (single == "string") "SdkByteStream" else "unsupported:binary"
            }

            single == "string" -> {
                "String"
            }

            single == "integer" && schema.format == "int64" -> {
                "Long"
            }

            single == "integer" -> {
                "Int"
            }

            single == "number" -> {
                if (schema.format == "decimal") "unsupported:decimal" else "Double"
            }

            single == "boolean" -> {
                "Boolean"
            }

            single == "array" -> {
                val items = schema.items ?: return "unsupported:array-no-items"
                val inner = typeSig(items)
                "List<${inner.base}${if (inner.nullable) "?" else ""}>"
            }

            typedAp != null -> {
                val inner = typeSig(typedAp.valueSchema)
                "Map<String,${inner.base}${if (inner.nullable) "?" else ""}>"
            }

            single == "object" -> {
                "JsonObject"
            }

            concrete.isEmpty() -> {
                "JsonElement"
            }

            else -> {
                "unsupported:multi-type(${concrete.joinToString()})"
            }
        }
    }

    private fun deref(schemaId: SchemaId): SchemaModel {
        var current =
            schemas[schemaId]
                ?: throw WalkerStructuralAnomaly("schema ${schemaId.value} is missing from the semantic graph")
        val visited = mutableSetOf<SchemaId>()
        while (visited.add(current.id)) {
            val targetId = current.referenceTarget ?: return current
            // Mirror production's dereference: a dangling $ref target fails loudly rather than silently
            // resolving to the unresolved wrapper schema.
            current =
                schemas[targetId]
                    ?: throw WalkerStructuralAnomaly(
                        "schema ${current.id.value} refers to missing target ${targetId.value} while dereferencing " +
                            "${schemaId.value}",
                    )
        }
        return current
    }

    private fun referenceChainIsNullable(schemaId: SchemaId): Boolean {
        var current =
            schemas[schemaId]
                ?: throw WalkerStructuralAnomaly("schema ${schemaId.value} is missing from the semantic graph")
        val visited = mutableSetOf<SchemaId>()
        while (visited.add(current.id)) {
            if (current.nullability == Nullability.NULLABLE) return true
            val targetId = current.referenceTarget ?: return false
            current =
                schemas[targetId]
                    ?: throw WalkerStructuralAnomaly(
                        "schema ${current.id.value} refers to missing target ${targetId.value} while checking " +
                            "nullability for ${schemaId.value}",
                    )
        }
        return false
    }

    private fun isAnnotationOnly(schema: SchemaModel): Boolean =
        schema.referenceTarget == null &&
            schema.types.isEmpty() &&
            schema.properties.isEmpty() &&
            schema.items == null &&
            schema.additionalProperties == null &&
            schema.compositions.isEmpty() &&
            schema.enum == null

    private fun isObjectLike(schema: SchemaModel): Boolean = isObjectLike(schema, mutableSetOf())

    private fun isObjectLike(
        schema: SchemaModel,
        visited: MutableSet<SchemaId>,
    ): Boolean {
        val effective = deref(schema.id)
        if (!visited.add(effective.id)) {
            throw WalkerStructuralAnomaly(
                "recursive allOf composition while classifying branch ${effective.id.value} as object-like",
            )
        }
        return try {
            "object" in effective.types ||
                effective.properties.isNotEmpty() ||
                effective.compositions.any { composition ->
                    composition.kind == CompositionKind.ALL_OF &&
                        composition.branches.any { branch -> isObjectLike(deref(branch.schemaId), visited) }
                }
        } finally {
            visited.remove(effective.id)
        }
    }

    private fun transparentAllOfBranch(schema: SchemaModel): SchemaModel? {
        if (schema.types.isNotEmpty() || schema.properties.isNotEmpty() || schema.items != null ||
            schema.additionalProperties != null || schema.enum != null
        ) {
            return null
        }
        val allOf =
            schema.compositions.singleOrNull()?.takeIf { it.kind == CompositionKind.ALL_OF } ?: return null
        return allOf.branches
            .map { deref(it.schemaId) }
            .filterNot(::isAnnotationOnly)
            .singleOrNull()
    }

    private fun transparentAllOfAnnotationsAreNullable(schema: SchemaModel): Boolean =
        transparentAllOfBranch(schema) != null &&
            schema.compositions
                .single()
                .branches
                .map { deref(it.schemaId) }
                .filter(::isAnnotationOnly)
                .any { it.nullability == Nullability.NULLABLE }

    private fun schemaNeedsDeclaration(schema: SchemaModel): Boolean {
        val effective = deref(schema.id)
        val stringEnum =
            effective.enum
                ?.values
                ?.filterNot { it == JsonValue.Null }
                ?.all { it is JsonValue.StringValue } ?: false
        return stringEnum ||
            effective.properties.isNotEmpty() ||
            effective.allOfPropertyOwnership.isNotEmpty() ||
            effective.compositions.any { composition ->
                composition.kind != CompositionKind.ALL_OF ||
                    composition.branches.any { branch -> isObjectLike(deref(branch.schemaId)) }
            }
    }

    // ---- shape recording, literal intersection, and judgment classification ----

    private fun shapeOf(property: PropertyModel): Shape =
        richShape(property.schema, property.nullability == Nullability.NULLABLE)

    private fun richShape(
        ref: SchemaRef,
        propertyNullable: Boolean,
    ): Shape {
        val sig = typeSig(ref)
        val resolved = resolveForDetail(ref)
        val nullable = sig.nullable || propertyNullable
        val base = sig.base
        return when {
            base.startsWith("named:") -> {
                val targetId = base.removePrefix("named:")
                val target = schemas[SchemaId(targetId)] ?: resolved
                val unionComposition =
                    target.compositions.firstOrNull {
                        it.kind == CompositionKind.ONE_OF || it.kind == CompositionKind.ANY_OF
                    }
                when {
                    target.enum != null -> {
                        Shape(
                            kind = "enum",
                            format = null,
                            nullable = nullable,
                            refTarget = null,
                            refSig = null,
                            enumValues =
                                target.enum.values
                                    .filterNot { it == JsonValue.Null }
                                    .map { renderJson(it) },
                            itemShape = null,
                        )
                    }

                    unionComposition != null -> {
                        Shape(
                            kind = "union",
                            format = null,
                            nullable = nullable,
                            refTarget = fragment(targetId),
                            refSig = targetId,
                            enumValues = null,
                            itemShape = null,
                            unionMembers =
                                unionComposition.branches
                                    .map { deref(it.schemaId) }
                                    .filterNot { it.acceptsOnlyNull || isAnnotationOnly(it) }
                                    .map { richShape(SchemaRef(it.id, ref.source), false) },
                        )
                    }

                    else -> {
                        Shape(
                            kind = "object-ref",
                            format = null,
                            nullable = nullable,
                            refTarget = fragment(targetId),
                            refSig = structuralSignature(SchemaId(targetId)),
                            enumValues = null,
                            itemShape = null,
                        )
                    }
                }
            }

            base == "String" -> {
                primitive("string", resolved.format, nullable)
            }

            base == "Long" -> {
                primitive("integer", "int64", nullable)
            }

            base == "Int" -> {
                primitive("integer", resolved.format, nullable)
            }

            base == "Double" -> {
                primitive("number", resolved.format, nullable)
            }

            base == "Boolean" -> {
                primitive("boolean", null, nullable)
            }

            base == "SdkByteStream" -> {
                primitive("binary", resolved.format, nullable)
            }

            base == "JsonObject" -> {
                primitive("object-free", null, nullable)
            }

            base == "JsonElement" -> {
                primitive("any", null, nullable)
            }

            base.startsWith("List<") -> {
                Shape("array", null, nullable, null, null, null, resolved.items?.let { richShape(it, false) })
            }

            base.startsWith("Map<") -> {
                primitive("map", null, nullable)
            }

            else -> {
                primitive(base, null, nullable)
            }
        }
    }

    private fun primitive(
        kind: String,
        format: String?,
        nullable: Boolean,
    ): Shape = Shape(kind, format, nullable, null, null, null, null)

    private fun resolveForDetail(ref: SchemaRef): SchemaModel {
        val schema = deref(ref.schemaId)
        val transparent = transparentAllOfBranch(schema)
        if (transparent != null) return resolveForDetail(SchemaRef(transparent.id, ref.source))
        if (schemaNeedsDeclaration(schema)) return schema
        val scalarBranches =
            schema.compositions
                .filter { it.kind == CompositionKind.ALL_OF }
                .flatMap { it.branches }
                .map { deref(it.schemaId) }
                .filterNot(::isAnnotationOnly)
        if (scalarBranches.size == 1 && !isObjectLike(scalarBranches.single())) {
            return resolveForDetail(SchemaRef(scalarBranches.single().id, ref.source))
        }
        return schema
    }

    private fun structuralSignature(id: SchemaId): String {
        val schema =
            schemas[id]
                ?: throw WalkerStructuralAnomaly("schema ${id.value} is missing from the semantic graph")
        val declarations = mutableListOf<Decl>()
        collect(schema, mutableSetOf(), declarations)
        return declarations
            .groupBy { it.property.name }
            .toSortedMap()
            .map { (name, decls) ->
                val tuples =
                    decls
                        .map { tupleOf(it.property) }
                        .distinct()
                        .sortedBy { it.base }
                        .joinToString("|") { "${it.base}/${it.typeNullable}/${it.propertyNullable}" }
                "$name=$tuples"
            }.joinToString(";")
    }

    private fun renderShape(shape: Shape): String {
        val core =
            when (shape.kind) {
                "enum" -> "enum[${renderEnum(shape.enumValues.orEmpty())}]"
                "object-ref" -> "ref(${shape.refTarget})"
                "union" -> "oneOf[${shape.unionMembers.orEmpty().joinToString(" | ") { renderShape(it) }}]"
                "object-free" -> "object"
                "any" -> "any"
                "array" -> "array<${shape.itemShape?.let { renderShape(it) } ?: "?"}>"
                "map" -> "map"
                "binary" -> "binary"
                "string", "integer", "number", "boolean" -> shape.kind + (shape.format?.let { "($it)" } ?: "")
                else -> shape.kind
            }
        return core + if (shape.nullable) "?" else ""
    }

    private fun renderCore(shape: Shape): String = renderShape(shape.copy(nullable = false))

    private fun renderEnum(values: List<String>): String =
        if (values.size <= 8) values.joinToString(",") else values.take(8).joinToString(",") + ",…(${values.size})"

    private data class Intersection(
        val rendered: String,
        val category: String,
    )

    private fun intersect(
        left: Shape,
        right: Shape,
    ): Intersection {
        val nullable = left.nullable && right.nullable

        fun nn(core: String) = core + if (nullable) "?" else ""

        if (left.kind == "union" && right.kind == "union") {
            // Set intersection: keep each left member that has a clean (structurally compatible) counterpart
            // in the right union. Incompatible pairs (distinct objects, disjoint primitives) drop out rather
            // than forming nested conjunctions.
            val kept =
                left.unionMembers.orEmpty().mapNotNull { member ->
                    right.unionMembers
                        .orEmpty()
                        .map { intersect(member.copy(nullable = false), it.copy(nullable = false)) }
                        .firstOrNull(::isCompatible)
                }
            return when {
                kept.isEmpty() -> Intersection("unsatisfiable (disjoint oneOf members)", "disjoint")
                kept.size == 1 -> Intersection(nn(kept.single().rendered), "union-narrow")
                else -> Intersection(nn("oneOf[${kept.joinToString(" | ") { it.rendered }}]"), "union-multi")
            }
        }
        if (left.kind == "union" || right.kind == "union") {
            val union = if (left.kind == "union") left else right
            val other = if (left.kind == "union") right else left
            val compatible =
                union.unionMembers
                    .orEmpty()
                    .map { intersect(it.copy(nullable = false), other.copy(nullable = false)) }
                    .filter(::isCompatible)
            return when {
                compatible.isEmpty() -> {
                    Intersection("unsatisfiable (no oneOf member matches ${renderCore(other)})", "disjoint")
                }

                compatible.size == 1 -> {
                    Intersection(nn(compatible.single().rendered), "union-narrow")
                }

                else -> {
                    Intersection(nn("oneOf[${compatible.joinToString(" | ") { it.rendered }}]"), "union-multi")
                }
            }
        }

        if (left.kind == "enum" && right.kind == "enum") {
            val common = left.enumValues.orEmpty().intersect(right.enumValues.orEmpty().toSet())
            return if (common.isEmpty()) {
                Intersection("unsatisfiable (disjoint enum value sets)", "enum-disjoint")
            } else {
                Intersection(nn("enum[${renderEnum(common.toList())}]"), "enum")
            }
        }
        if (left.kind == "enum" && right.kind in setOf("string", "any")) {
            return Intersection(nn("enum[${renderEnum(left.enumValues.orEmpty())}]"), "enum")
        }
        if (right.kind == "enum" && left.kind in setOf("string", "any")) {
            return Intersection(nn("enum[${renderEnum(right.enumValues.orEmpty())}]"), "enum")
        }
        if (left.kind == "object-ref" && right.kind == "object-ref") {
            return if (left.refSig == right.refSig) {
                Intersection(nn("ref(${left.refTarget})"), "ref-equal")
            } else {
                Intersection("conjunction(ref ${left.refTarget} ∧ ref ${right.refTarget})", "ref-conjunction")
            }
        }
        if (left.kind == "object-ref" && right.kind in setOf("object-free", "any")) {
            return Intersection(nn("ref(${left.refTarget})"), "object-subtype")
        }
        if (right.kind == "object-ref" && left.kind in setOf("object-free", "any")) {
            return Intersection(nn("ref(${right.refTarget})"), "object-subtype")
        }
        if (left.kind == "object-free" && right.kind == "object-free") {
            return Intersection(nn("object"), "nullability")
        }
        if (left.kind == "array" && right.kind == "array") {
            val li = left.itemShape
            val ri = right.itemShape
            if (li == null || ri == null) return Intersection(nn("array<?>"), "array")
            val inner = intersect(li, ri)
            val conflicted = inner.category in setOf("disjoint", "ref-conjunction", "enum-disjoint")
            return Intersection(nn("array<${inner.rendered}>"), if (conflicted) "array-conflict" else "array")
        }
        if (left.kind == "any") return Intersection(nn(renderCore(right)), "any-subtype")
        if (right.kind == "any") return Intersection(nn(renderCore(left)), "any-subtype")
        if (setOf(left.kind, right.kind) == setOf("integer", "number")) {
            return Intersection(nn("integer"), "integer-subtype")
        }
        if (left.kind == right.kind && left.kind in setOf("string", "integer", "number", "boolean", "binary")) {
            val format =
                when {
                    left.format == null -> right.format
                    right.format == null -> left.format
                    left.format == right.format -> left.format
                    else -> return Intersection("unsatisfiable (conflicting formats)", "disjoint")
                }
            val category = if (left.format != right.format) "narrow-format" else "nullability"
            return Intersection(nn(left.kind + (format?.let { "($it)" } ?: "")), category)
        }
        return Intersection("unsatisfiable (disjoint wire types)", "disjoint")
    }

    private fun isCompatible(inter: Intersection): Boolean =
        !inter.rendered.startsWith("unsatisfiable") &&
            inter.category !in setOf("ref-conjunction", "array-conflict", "enum-disjoint", "disjoint")

    private fun renderJson(value: JsonValue): String =
        when (value) {
            is JsonValue.StringValue -> value.value
            is JsonValue.NumberValue -> value.lexicalValue
            is JsonValue.BooleanValue -> value.value.toString()
            JsonValue.Null -> "null"
            else -> value.toString()
        }
}

private fun fragment(idValue: String): String = if ('#' in idValue) "#" + idValue.substringAfter('#') else idValue
