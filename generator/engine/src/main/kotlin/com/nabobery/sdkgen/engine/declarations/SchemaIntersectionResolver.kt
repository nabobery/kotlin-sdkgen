package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.model.AdditionalPropertiesModel
import com.nabobery.sdkgen.model.AllOfPropertyResolution
import com.nabobery.sdkgen.model.AllOfResolutionStrategy
import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.EnumModel
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.Nullability
import com.nabobery.sdkgen.model.PresenceState
import com.nabobery.sdkgen.model.PropertyModel
import com.nabobery.sdkgen.model.Requiredness
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SchemaRef
import com.nabobery.sdkgen.model.SourcePointer
import java.math.BigDecimal

/**
 * Traceable outcome of intersecting two `allOf`-conflicting declarations of the same property.
 *
 * Every arm carries [IntersectionProvenance] so a downstream diagnostic (or the conformance status ledger) can
 * name the exact parent, property, both operand identities, and the stable rule that decided the outcome.
 */
internal sealed interface IntersectionResult {
    val provenance: IntersectionProvenance

    /** The strict algebra proved a single narrowed declaration; [property] is ready to install. */
    data class Resolved(
        val property: PropertyModel,
        override val provenance: IntersectionProvenance,
    ) : IntersectionResult

    /**
     * The strict algebra could not prove an intersection, but a reviewed `x-sdkgen-allof-resolution`
     * policy entry (a reviewed [AllOfPropertyResolution]) elected a superseding branch. [property] is that
     * branch's declaration.
     */
    data class AuditedOverride(
        val property: PropertyModel,
        override val provenance: IntersectionProvenance,
    ) : IntersectionResult

    /** No proven strict rule and no audited policy applies; the caller must reject the composition. */
    data class Unsupported(
        val reason: String,
        override val provenance: IntersectionProvenance,
    ) : IntersectionResult
}

/**
 * Immutable trace of one intersection decision. [leftSchemaId]/[rightSchemaId] and their sources identify
 * the two operands; [ruleId] is a stable token from the proof-table algebra (see
 * `docs/conformance/evidence/schema-intersection-proof-table.tsv`); [extensionSource] points at the
 * audited policy entry when the outcome is [IntersectionResult.AuditedOverride].
 */
internal data class IntersectionProvenance(
    val parentSchemaId: SchemaId,
    val propertyName: String,
    val leftSchemaId: SchemaId,
    val rightSchemaId: SchemaId,
    val leftSource: SourcePointer,
    val rightSource: SourcePointer,
    val ruleId: String,
    val extensionSource: SourcePointer? = null,
)

/**
 * Resolves `allOf` property conflicts using ONLY the proven strict algebra frozen in the schema
 * intersection proof table, plus a reviewed audited-override escape hatch.
 *
 * The resolver is pure: it inspects the semantic graph through [dereference] and [effectivelyNullable]
 * and never mutates it, never throws for an unrepresentable conflict (it returns
 * [IntersectionResult.Unsupported] instead), and never synthesizes a new schema node — every resolved
 * outcome names an existing node (one operand, or a branch reachable from one operand).
 *
 * Strict rules implemented (rule ids used in provenance):
 * - `identical`            — structurally equivalent operands (incl. ref-equal objects under different names).
 * - `narrow-any`           — `X ∧ any = X`.
 * - `narrow-freeform-object` — named/structured object `∧` free-form `object` = the named object.
 * - `array-element`        — `array<A> ∧ array<B> = array<A∧B>` when the element intersection is one operand's element.
 * - `format-narrow`        — `T(format) ∧ T = T(format)` (a format is annotation-level; two *different* formats conflict).
 * - `integer-number`       — `integer ∧ number = integer`.
 * - `enum-narrow-scalar`   — `enum/const ∧ compatible plain scalar = the enum/const`.
 * - `enum-intersect`       — `enum ∧ enum = the operand whose value set is the subset` (empty set → Unsupported).
 * - `format-identical`     — same base type and same format → the constraint-dominant operand.
 * - `object-subsume`       — structured objects equal up to requiredness/format → the operand dominating on
 *                            every differing location; a true merge stays Unsupported.
 * - `union-whole`/`union-collapse` — `oneOf/anyOf` intersection keeping only compatible branches (whole
 *                            operand or single-branch collapse; other proper subsets stay Unsupported).
 *
 * Anything a proven rule does not cover is [IntersectionResult.Unsupported]; a constraint pair that
 * equality cannot preserve is never silently dropped.
 */
internal class SchemaIntersectionResolver(
    private val dereference: (SchemaId) -> SchemaModel,
    private val effectivelyNullable: (SchemaRef) -> Boolean,
) {
    fun resolve(
        parent: SchemaModel,
        prior: PropertyModel,
        next: PropertyModel,
    ): IntersectionResult {
        val left = deref(prior.schema.schemaId)
        val right = deref(next.schema.schemaId)
        val ruleContext = RuleContext(parent.id, next.name, left, right, prior.schema.source, next.schema.source)

        // A bound reviewed policy is an explicit supersession decision, not merely a fallback for pairs the
        // strict algebra cannot reconcile. Check it first so structurally-equal operands still preserve the
        // audited branch identity rather than being canonicalized to the other equivalent declaration.
        auditedOverride(parent, prior, next, ruleContext)?.let { return it }

        val pick = intersect(left, right, mutableSetOf())
        if (pick != null) {
            val resolved = buildResolved(pick, prior, next, ruleContext)
            if (resolved != null) return resolved
        }

        val reason =
            pick?.let {
                "strict intersection ${it.ruleId} resolves to ${it.schemaId.value} but its nullability cannot be " +
                    "expressed by an existing declaration"
            } ?: "no proven strict rule intersects ${left.id.value} with ${right.id.value}"
        return IntersectionResult.Unsupported(reason, ruleContext.provenance("unsupported-no-strict-rule"))
    }

    private fun buildResolved(
        pick: Pick,
        prior: PropertyModel,
        next: PropertyModel,
        ruleContext: RuleContext,
    ): IntersectionResult.Resolved? {
        val winner = deref(pick.schemaId)
        // Effective nullability is compositional: an operand is nullable if EITHER its schema chain is
        // nullable OR its already-merged property flag is (a prior fold step rewrites the winner to the
        // dereferenced, chain-non-null node and records nullability only on the flag). The intersection is
        // nullable iff BOTH operands are.
        val resultNullable = effectiveNullability(prior) && effectiveNullability(next)
        // The winner names an existing node; its own reference-chain nullability is fixed. We can widen a
        // non-null node to nullable via the property flag, but we cannot force a chain-nullable node to be
        // non-null — reject rather than emit a wrong nullability contract.
        if (!resultNullable && schemaChainNullable(winner)) return null
        val requiredness =
            if (prior.requiredness == Requiredness.REQUIRED || next.requiredness == Requiredness.REQUIRED) {
                Requiredness.REQUIRED
            } else {
                prior.requiredness
            }
        val nullability = if (resultNullable) Nullability.NULLABLE else Nullability.NON_NULL
        val property =
            prior.copy(
                schema = SchemaRef(winner.id, sourceFor(pick, prior, next)),
                requiredness = requiredness,
                nullability = nullability,
                // presenceStates is derived from (requiredness, nullability); both can change here, so it
                // must be recomputed rather than inherited from `prior`.
                presenceStates = presenceStatesFor(requiredness, nullability),
            )
        return IntersectionResult.Resolved(property, ruleContext.provenance(pick.ruleId))
    }

    private fun sourceFor(
        pick: Pick,
        prior: PropertyModel,
        next: PropertyModel,
    ): SourcePointer =
        when (pick.schemaId) {
            prior.schema.schemaId -> prior.schema.source
            next.schema.schemaId -> next.schema.source
            else -> deref(pick.schemaId).source
        }

    // region strict algebra ---------------------------------------------------------------------------

    private data class Pick(
        val schemaId: SchemaId,
        val ruleId: String,
    )

    /** Which operand's declaration equals the intersection along a single dimension. */
    private enum class Side { LEFT, RIGHT, BOTH }

    /**
     * Canonical, order-independent winner for two structurally-equivalent operands: prefer the non-null
     * node (so `X? ∧ X = X`), else the MORE CANONICAL node — a top-level component (fewer `$ref`-path
     * segments) over a deep inline duplicate — then the lexicographically smaller id. Preferring the
     * shallower id keeps operand order irrelevant AND names the reusable declaration the emitter already
     * has (or will mint) a stable type for, instead of an anonymous inline copy structurally equal to it
     * (e.g. `OpenAIResponseCustomToolCallOutput` over `…/allOf/1/properties/output`), so the resolved
     * property renders as the shared named type rather than a one-off duplicate.
     */
    private fun identicalPick(
        left: SchemaModel,
        right: SchemaModel,
    ): Pick {
        val winner =
            when {
                left.nullability == Nullability.NULLABLE && right.nullability == Nullability.NON_NULL -> right
                right.nullability == Nullability.NULLABLE && left.nullability == Nullability.NON_NULL -> left
                moreCanonical(left.id, right.id) -> left
                else -> right
            }
        return Pick(winner.id, "identical")
    }

    /**
     * Order-independent canonical ordering over two structurally-equal nodes' ids: the id with fewer
     * `$ref`-path segments (a top-level component beats a deep inline schema) wins; equal depth falls back
     * to the lexicographically smaller id.
     */
    private fun moreCanonical(
        left: SchemaId,
        right: SchemaId,
    ): Boolean {
        val leftDepth = left.value.count { it == '/' }
        val rightDepth = right.value.count { it == '/' }
        return if (leftDepth != rightDepth) leftDepth < rightDepth else left.value <= right.value
    }

    /**
     * Intersects two dereferenced schemas, returning the existing node equal to their value-set
     * intersection (ignoring top-level nullability, handled by the caller), or `null` when no proven
     * strict rule applies or the intersection cannot be named by an existing node.
     */
    private fun intersect(
        left: SchemaModel,
        right: SchemaModel,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Pick? {
        val key = left.id to right.id
        if (!guard.add(key)) return Pick(left.id, "identical-cycle")
        try {
            if (structurallyEqual(left, right, mutableSetOf())) return identicalPick(left, right)

            unionIntersect(left, right, guard)?.let { return it }

            if (isAnyUnconstrained(right)) return Pick(left.id, "narrow-any")
            if (isAnyUnconstrained(left)) return Pick(right.id, "narrow-any")

            if (isFreeFormObject(right) && isStructuredObject(left)) return Pick(left.id, "narrow-freeform-object")
            if (isFreeFormObject(left) && isStructuredObject(right)) return Pick(right.id, "narrow-freeform-object")

            arrayIntersect(left, right, guard)?.let { return it }

            objectIntersect(left, right, guard)?.let { return it }

            return scalarIntersect(left, right)
        } finally {
            guard.remove(key)
        }
    }

    private fun unionIntersect(
        left: SchemaModel,
        right: SchemaModel,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Pick? {
        val leftUnion = isUnion(left)
        val rightUnion = isUnion(right)
        if (!leftUnion && !rightUnion) return null
        // union ∧ union is order-sensitive when driven from a single side (the branch subset that survives may
        // equal the *other* operand's whole set, which the single-side drive cannot name). Handle it symmetrically.
        if (leftUnion && rightUnion) return unionUnionIntersect(left, right, guard)
        // union ∧ exact-kind: keep `union` as the branch source and `other` as the scalar/object counterpart.
        val (union, other) = if (leftUnion) left to right else right to left
        val branches = unionBranches(union)
        if (branches.isEmpty()) return null
        val survivors = branches.map { branch -> intersect(branch, other, guard) }
        return combineUnion(survivors, branches, union)
    }

    /**
     * Intersects two `oneOf`/`anyOf` unions by the surviving pairwise branch set. The result names an
     * existing node only when that surviving set is exactly one whole operand's branch set (`union-whole`)
     * or collapses to a single branch (`union-collapse`); any other proper subset would need a synthesized
     * union. Symmetric by construction, so operand order never changes the outcome.
     */
    private fun unionUnionIntersect(
        left: SchemaModel,
        right: SchemaModel,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Pick? {
        val leftBranches = unionBranches(left)
        val rightBranches = unionBranches(right)
        if (leftBranches.isEmpty() || rightBranches.isEmpty()) return null
        val survivorIds = linkedSetOf<SchemaId>()
        leftBranches.forEach { leftBranch ->
            rightBranches.forEach { rightBranch ->
                intersect(leftBranch, rightBranch, guard)?.let { survivorIds.add(it.schemaId) }
            }
        }
        if (survivorIds.isEmpty()) return null
        val leftIds = leftBranches.map(SchemaModel::id).toSet()
        val rightIds = rightBranches.map(SchemaModel::id).toSet()
        return when {
            survivorIds == leftIds && survivorIds == rightIds -> identicalPick(left, right)
            survivorIds == leftIds -> Pick(left.id, "union-whole")
            survivorIds == rightIds -> Pick(right.id, "union-whole")
            survivorIds.size == 1 -> Pick(survivorIds.single(), "union-collapse")
            else -> null
        }
    }

    /**
     * Folds per-branch survivors back into a single existing node: the whole union survives to itself, a
     * single surviving branch collapses to that branch, anything else would need a synthesized union.
     */
    private fun combineUnion(
        survivors: List<Pick?>,
        branches: List<SchemaModel>,
        union: SchemaModel,
    ): Pick? {
        val kept = survivors.filterNotNull()
        if (kept.isEmpty()) return null
        val survivesAsItself =
            survivors.size == branches.size &&
                survivors.withIndex().all { (index, pick) -> pick != null && pick.schemaId == branches[index].id }
        if (survivesAsItself) return Pick(union.id, "union-whole")
        val distinct = kept.map(Pick::schemaId).distinct()
        if (distinct.size == 1) return Pick(distinct.single(), "union-collapse")
        return null
    }

    private fun arrayIntersect(
        left: SchemaModel,
        right: SchemaModel,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Pick? {
        val leftItems = left.items ?: return null
        val rightItems = right.items ?: return null
        val leftItemSchema = deref(leftItems.schemaId)
        val rightItemSchema = deref(rightItems.schemaId)
        val element = intersect(leftItemSchema, rightItemSchema, guard) ?: return null
        // An array element carries no property-level flag, so its nullability lives entirely in the named
        // array node's own items ref. The element intersection is nullable iff BOTH element refs are; the
        // winning array must express that exact element nullability, or the winner would silently flip
        // List<T?> to List<T> (and break commutativity). So require the picked operand's element to be the
        // element intersection verbatim AND to carry the AND-combined nullability.
        val elementNullable = effectivelyNullable(leftItems) && effectivelyNullable(rightItems)
        val leftMatches = element.schemaId == leftItemSchema.id && effectivelyNullable(leftItems) == elementNullable
        val rightMatches = element.schemaId == rightItemSchema.id && effectivelyNullable(rightItems) == elementNullable
        // The winning array node is kept verbatim as the intersection, so it must also carry every array-level
        // constraint (maxItems/minItems/uniqueItems/...) the OTHER operand asserts — same discipline as scalars.
        // Otherwise `array{maxItems:5}<T> ∧ array<T>` would drop maxItems whenever the plain side happens to win.
        return when {
            leftMatches && constraintsSubsume(left, right) -> Pick(left.id, "array-element")
            rightMatches && constraintsSubsume(right, left) -> Pick(right.id, "array-element")
            else -> null
        }
    }

    /**
     * Intersects two structured objects that are equal up to requiredness and format — the walker's
     * "ref-equal" pair. The intersection is one operand exactly when that operand DOMINATES on every
     * differing location: it carries the narrower (present) format and the required-er requiredness
     * everywhere, so it already IS the per-location intersection (union of required-ness, narrowest format).
     *
     * A value-set difference (enum vs string, differing enum values), a nullability difference, or a
     * different base type makes the pair a "ref-conjunction": no operand is the intersection and a
     * synthesized node would be needed, so this returns `null` and the conflict stays
     * [IntersectionResult.Unsupported] — the audited-override territory the frozen proof table reserves for
     * a reviewed `x-sdkgen-allof-resolution` policy (ADR 0021). Reject rather than pick a wider branch here:
     * a `UNION_SUPERSEDE` override that widens (e.g. relaxes an enum to a string) is a policy decision, not a
     * strict intersection, so the strict algebra must not silently make it.
     */
    private fun objectIntersect(
        left: SchemaModel,
        right: SchemaModel,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Pick? {
        if (left.properties.isEmpty() || right.properties.isEmpty()) return null
        if (left.compositions.isNotEmpty() || right.compositions.isNotEmpty()) return null
        return when (subsumeSide(left, right, guard, mutableSetOf())) {
            Side.RIGHT -> Pick(right.id, "object-subsume")

            // BOTH cannot occur here (a fully-equal pair resolves via `identical` before objectIntersect);
            // canonicalize the LEFT-dominant (and defensive BOTH) case to the left operand.
            Side.LEFT, Side.BOTH -> Pick(left.id, "object-subsume")

            null -> null
        }
    }

    /**
     * Which operand is the intersection of two schemas equal up to requiredness and format: [Side.LEFT] or
     * [Side.RIGHT] when exactly one dominates (present format, required-er) on every location, [Side.BOTH]
     * when identical, or `null` when they differ in base type, nullability, enum values, content, or a
     * conflicting format — or when different locations favour different operands (a true merge).
     */
    private fun subsumeSide(
        left: SchemaModel,
        right: SchemaModel,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
        visited: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Side? {
        if (left.id == right.id) return Side.BOTH
        val key = if (left.id.value <= right.id.value) left.id to right.id else right.id to left.id
        if (!visited.add(key)) return Side.BOTH
        if (concreteTypes(left).toSet() != concreteTypes(right).toSet()) return null
        if (left.nullability != right.nullability) return null
        if (left.acceptsOnlyNull != right.acceptsOnlyNull) return null
        if (left.contentEncoding != right.contentEncoding || left.contentMediaType != right.contentMediaType) {
            return null
        }
        if (enumCanon(left.enum, left) != enumCanon(right.enum, right)) return null
        var side = formatSide(left.format, right.format) ?: return null
        // Dominance also requires the winning side to carry every schema-level constraint the other asserts and
        // a superset of its `required` names; otherwise the "dominant" node would silently drop a constraint or
        // relax requiredness. A location that favours the opposite side of another makes neither the intersection.
        side = combineSides(side, constraintsSide(left, right) ?: return null) ?: return null
        side = combineSides(side, requiredNamesSide(left, right) ?: return null) ?: return null
        side =
            combineSides(side, itemsSubsumeSide(left.items, right.items, guard, visited) ?: return null) ?: return null
        side =
            combineSides(
                side,
                additionalSubsumeSide(left.additionalProperties, right.additionalProperties, guard, visited)
                    ?: return null,
            ) ?: return null
        val leftByName = left.properties.associateBy(PropertyModel::name)
        val rightByName = right.properties.associateBy(PropertyModel::name)
        if (leftByName.keys != rightByName.keys) return null
        for (name in leftByName.keys) {
            val leftProperty = leftByName.getValue(name)
            val rightProperty = rightByName.getValue(name)
            if (leftProperty.nullability != rightProperty.nullability) return null
            val leftRequired = leftProperty.requiredness == Requiredness.REQUIRED
            val rightRequired = rightProperty.requiredness == Requiredness.REQUIRED
            val requiredSide =
                if (leftRequired == rightRequired) {
                    Side.BOTH
                } else if (leftRequired) {
                    Side.LEFT
                } else {
                    Side.RIGHT
                }
            side = combineSides(side, requiredSide) ?: return null
            val schemaSide =
                subsumeSide(deref(leftProperty.schema.schemaId), deref(rightProperty.schema.schemaId), guard, visited)
                    ?: return null
            side = combineSides(side, schemaSide) ?: return null
        }
        return side
    }

    /** The dominant side by format alone: present-format wins, equal is [Side.BOTH], two distinct formats fail. */
    private fun formatSide(
        left: String?,
        right: String?,
    ): Side? =
        when {
            left == right -> Side.BOTH
            left != null && right == null -> Side.LEFT
            right != null && left == null -> Side.RIGHT
            else -> null
        }

    /**
     * The dominant side by schema-level constraints: the operand whose `constraints` map is a strict superset
     * wins (it carries every assertion the other does and more); equal maps are [Side.BOTH]; a pair where each
     * asserts a constraint the other lacks (e.g. `maxItems:5` vs `minItems:1`, or `maxLength:5` vs `maxLength:3`)
     * has no dominant operand and returns `null`.
     */
    private fun constraintsSide(
        left: SchemaModel,
        right: SchemaModel,
    ): Side? =
        when {
            constraintsSubsume(left, right) && constraintsSubsume(right, left) -> Side.BOTH
            constraintsSubsume(left, right) -> Side.LEFT
            constraintsSubsume(right, left) -> Side.RIGHT
            else -> null
        }

    /**
     * The dominant side by the schema's own `required` set: the operand whose required-property names are a
     * superset wins (it is the stricter object); equal sets are [Side.BOTH]; incomparable sets return `null`.
     */
    private fun requiredNamesSide(
        left: SchemaModel,
        right: SchemaModel,
    ): Side? {
        val leftNames = left.requiredPropertyNames.toSet()
        val rightNames = right.requiredPropertyNames.toSet()
        return when {
            leftNames == rightNames -> Side.BOTH
            leftNames.containsAll(rightNames) -> Side.LEFT
            rightNames.containsAll(leftNames) -> Side.RIGHT
            else -> null
        }
    }

    private fun itemsSubsumeSide(
        left: SchemaRef?,
        right: SchemaRef?,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
        visited: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Side? =
        when {
            left == null && right == null -> Side.BOTH
            left == null || right == null -> null
            else -> subsumeSide(deref(left.schemaId), deref(right.schemaId), guard, visited)
        }

    private fun additionalSubsumeSide(
        left: AdditionalPropertiesModel?,
        right: AdditionalPropertiesModel?,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
        visited: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Side? =
        when {
            left is AdditionalPropertiesModel.Typed && right is AdditionalPropertiesModel.Typed -> {
                subsumeSide(deref(left.valueSchema.schemaId), deref(right.valueSchema.schemaId), guard, visited)
            }

            left?.let { it::class } == right?.let { it::class } -> {
                Side.BOTH
            }

            else -> {
                null
            }
        }

    private fun combineSides(
        first: Side,
        second: Side,
    ): Side? =
        when {
            first == Side.BOTH -> second
            second == Side.BOTH -> first
            first == second -> first
            else -> null // one location favours LEFT, another RIGHT: neither operand is the intersection.
        }

    private fun scalarIntersect(
        left: SchemaModel,
        right: SchemaModel,
    ): Pick? {
        val leftValues = exactValues(left)
        val rightValues = exactValues(right)
        // enum/const ∧ plain-compatible-scalar → the enum/const. A value-pinned operand NEVER falls through to
        // base-type narrowing: base-type rules would treat the enum as a plain scalar and silently drop its
        // value set (and, driven from a single side, pick whichever operand is `left` — an order-dependent,
        // unsound collapse). If the enum is not compatible with the plain scalar, the intersection is not
        // nameable by an existing node → Unsupported.
        if (leftValues != null && rightValues == null) {
            return if (valuesCompatibleWith(leftValues, right)) Pick(left.id, "enum-narrow-scalar") else null
        }
        if (rightValues != null && leftValues == null) {
            return if (valuesCompatibleWith(rightValues, left)) Pick(right.id, "enum-narrow-scalar") else null
        }
        // enum ∧ enum → the operand whose value set is the subset. That elected operand is kept verbatim, so it
        // must ALSO carry every constraint the wider operand asserts and share its content contract; otherwise
        // electing it would silently drop a maxLength/pattern/content assertion the intersection still holds.
        if (leftValues != null && rightValues != null) {
            val leftSet = leftValues.map(::jsonCanon).toSet()
            val rightSet = rightValues.map(::jsonCanon).toSet()
            if ((leftSet intersect rightSet).isEmpty()) return null
            if (rightSet.containsAll(leftSet)) return enumSubsetPick(elected = left, wider = right)
            if (leftSet.containsAll(rightSet)) return enumSubsetPick(elected = right, wider = left)
            return null
        }
        // plain scalar ∧ plain scalar → base-type narrowing (both operands are unpinned by construction here).
        return baseTypeIntersect(left, right)
    }

    /**
     * The [elected] subset enum as the intersection of two enums, but only when it preserves every assertion of
     * the [wider] operand: its constraints must subsume the wider's and its content contract must match, or the
     * elected node would silently drop a constraint/content assertion — reject (Unsupported) instead.
     */
    private fun enumSubsetPick(
        elected: SchemaModel,
        wider: SchemaModel,
    ): Pick? {
        if (!constraintsSubsume(elected, wider)) return null
        if (elected.contentEncoding != wider.contentEncoding || elected.contentMediaType != wider.contentMediaType) {
            return null
        }
        return Pick(elected.id, "enum-intersect")
    }

    private fun baseTypeIntersect(
        left: SchemaModel,
        right: SchemaModel,
    ): Pick? {
        val leftType = concreteTypes(left).singleOrNull() ?: return null
        val rightType = concreteTypes(right).singleOrNull() ?: return null
        // Only primitive scalars narrow by base type: distinct structured objects/arrays that reached here
        // were not structurally equal and must stay Unsupported (never collapse two different objects).
        if (leftType !in PRIMITIVE_SCALAR_TYPES || rightType !in PRIMITIVE_SCALAR_TYPES) return null
        // Base-type/format narrowing keeps one operand's node verbatim as the intersection, so that node must
        // already carry every assertion of BOTH operands: an identical content contract (a content difference
        // is unrepresentable by either node) and a constraint superset over the other. Otherwise a content or
        // constraint assertion would be silently dropped — reject instead.
        if (left.contentEncoding != right.contentEncoding || left.contentMediaType != right.contentMediaType) {
            return null
        }
        if (leftType == rightType) {
            val leftFormat = left.format
            val rightFormat = right.format
            return when {
                leftFormat == rightFormat -> {
                    constraintDominantScalarPick(left, right, "format-identical")
                }

                leftFormat != null && rightFormat == null -> {
                    if (constraintsSubsume(left, right)) Pick(left.id, "format-narrow") else null
                }

                rightFormat != null && leftFormat == null -> {
                    if (constraintsSubsume(right, left)) Pick(right.id, "format-narrow") else null
                }

                else -> {
                    null
                } // two different explicit formats never merge
            }
        }
        if (setOf(leftType, rightType) == setOf("integer", "number")) {
            val integer = if (leftType == "integer") left else right
            val number = if (leftType == "integer") right else left
            return if (constraintsSubsume(integer, number)) Pick(integer.id, "integer-number") else null
        }
        return null
    }

    /** True when [narrower] carries every constraint entry [wider] asserts, so it preserves both value sets. */
    private fun constraintsSubsume(
        narrower: SchemaModel,
        wider: SchemaModel,
    ): Boolean = wider.constraints.all { (key, value) -> narrower.constraints[key] == value }

    /**
     * Two same-type same-format scalars only reach here when their constraint sets differ (equal sets are
     * `identical`). The intersection is a single existing node only when one operand's constraints subsume
     * the other's; that dominant node is the pick, otherwise neither names the intersection.
     */
    private fun constraintDominantScalarPick(
        left: SchemaModel,
        right: SchemaModel,
        ruleId: String,
    ): Pick? =
        when {
            constraintsSubsume(left, right) -> Pick(left.id, ruleId)
            constraintsSubsume(right, left) -> Pick(right.id, ruleId)
            else -> null
        }

    // endregion

    // region audited override -------------------------------------------------------------------------

    /**
     * Applies a reviewed `x-sdkgen-allof-resolution` supersession policy before strict algebra.
     *
     * The policy's byte-level identity ([AllOfPropertyResolution.propertySchemaSha256] and, for an inline
     * branch, its `inlineSchemaSha256`) was validated at adaptation over
     * `DocumentCodec.canonicalJson`; the engine never recomputes it (a structural digest of the adapted
     * SchemaModel could not agree with that source-byte digest). Instead the adapter resolves the winning
     * branch's property to the exact semantic node an operand carries, recording it as
     * [AllOfPropertyResolution.winningPropertySchemaId]; election here is a direct identity match against
     * an operand's schema reference. The policy is checked before the strict algebra so a structurally
     * reconcilable pair still preserves the reviewed branch identity instead of being canonicalized to an
     * equivalent operand; pairs without a matching bound policy fall through to the strict rules unchanged.
     *
     * When the winning id matches BOTH operands — a later fold step comparing an already-merged property
     * against another branch's reference to the same node — the merge composes commutatively instead of
     * electing `prior`: nullability ANDs across the operands' effective nullability (the
     * compositional-nullability invariant), requiredness unions, and presenceStates are recomputed, so
     * operand order can never change the elected contract.
     */
    private fun auditedOverride(
        parent: SchemaModel,
        prior: PropertyModel,
        next: PropertyModel,
        ruleContext: RuleContext,
    ): IntersectionResult? {
        val entry =
            parent.allOfPropertyResolutions.firstOrNull { resolution ->
                resolution.propertyName == next.name && resolution.strategy == AllOfResolutionStrategy.UNION_SUPERSEDE
            } ?: return null
        val winningId = entry.winningPropertySchemaId
        val priorWins = prior.schema.schemaId == winningId
        val nextWins = next.schema.schemaId == winningId
        if (!priorWins && !nextWins) return null
        val requiredness =
            if (prior.requiredness == Requiredness.REQUIRED || next.requiredness == Requiredness.REQUIRED) {
                Requiredness.REQUIRED
            } else {
                prior.requiredness
            }
        if (priorWins && nextWins) {
            // Both operands reference the same winning node; only their property-level contracts can differ.
            val nullability =
                if (effectiveNullability(prior) && effectiveNullability(next)) {
                    Nullability.NULLABLE
                } else {
                    Nullability.NON_NULL
                }
            return IntersectionResult.AuditedOverride(
                property =
                    prior.copy(
                        requiredness = requiredness,
                        nullability = nullability,
                        // presenceStates is derived from (requiredness, nullability); both can change here,
                        // so recompute via the shared helper rather than inheriting either operand's stale set.
                        presenceStates = presenceStatesFor(requiredness, nullability),
                    ),
                provenance = ruleContext.provenance("audited-union-supersede", entry.source),
            )
        }
        val winner = if (priorWins) prior else next
        return IntersectionResult.AuditedOverride(
            // presenceStates is derived from (requiredness, nullability); the requiredness union above can change
            // it (an optional elected winner against a required operand becomes REQUIRED), so recompute it via the
            // same helper the strict path uses rather than inheriting the winner's stale set (which still admitted
            // PresenceState.ABSENT).
            property =
                winner.copy(
                    requiredness = requiredness,
                    presenceStates = presenceStatesFor(requiredness, winner.nullability),
                ),
            provenance = ruleContext.provenance("audited-union-supersede", entry.source),
        )
    }

    // endregion

    // region schema shape predicates ------------------------------------------------------------------

    /**
     * Dereferences [id] through `$ref` wrappers AND transparent single-branch `allOf` wrappers, so the
     * strict algebra inspects the underlying enum/ref/array rather than an opaque `allOf` node. Nullability
     * added by an annotation-only sibling of the wrapper is not lost: it is recovered separately through
     * [effectivelyNullable], which the projection wires to account for transparent-allOf nullable annotations.
     */
    private fun deref(id: SchemaId): SchemaModel = unwrapTransparentAllOf(dereference(id))

    private fun unwrapTransparentAllOf(schema: SchemaModel): SchemaModel {
        var current = schema
        val guard = mutableSetOf<SchemaId>()
        while (guard.add(current.id)) {
            current = transparentAllOfBranch(current) ?: return current
        }
        return current
    }

    /**
     * The single structural branch of a schema whose only content is an `allOf` that reduces to one
     * structural branch — the "transparent" wrapper OpenAPI 3.0 nullable `$ref` siblings normalize to.
     * Branches that add no constraint are ignored: annotation-only siblings (a `nullable`/`description`
     * marker) and free-form `object` branches (`{type: object}` with no shape), since a free-form object is
     * the `∧` identity over objects. Returns `null` for a genuine multi-branch object merge (which stays
     * [IntersectionResult.Unsupported] until an audited override resolves it).
     */
    private fun transparentAllOfBranch(schema: SchemaModel): SchemaModel? {
        if (schema.types.isNotEmpty() || schema.properties.isNotEmpty() || schema.items != null ||
            schema.additionalProperties != null || schema.enum != null
        ) {
            return null
        }
        val allOf = schema.compositions.singleOrNull()?.takeIf { it.kind == CompositionKind.ALL_OF } ?: return null
        return allOf.branches
            .map { branch -> dereference(branch.schemaId) }
            .filterNot { branch -> isAnnotationOnly(branch) || isFreeFormObject(branch) }
            .singleOrNull()
    }

    /** An annotation-only schema carries no structural assertion of its own (a nullable/description sibling). */
    private fun isAnnotationOnly(schema: SchemaModel): Boolean =
        schema.referenceTarget == null &&
            schema.types.isEmpty() &&
            schema.properties.isEmpty() &&
            schema.items == null &&
            schema.additionalProperties == null &&
            schema.compositions.isEmpty() &&
            schema.enum == null

    private fun concreteTypes(schema: SchemaModel): List<String> = schema.types.filter { it != "null" }.distinct()

    private fun isUnion(schema: SchemaModel): Boolean =
        concreteTypes(schema).isEmpty() &&
            schema.properties.isEmpty() &&
            schema.enum == null &&
            soundUnionBranches(schema) != null

    private fun unionBranches(schema: SchemaModel): List<SchemaModel> = soundUnionBranches(schema).orEmpty()

    /**
     * The non-null branches of a union whose value-set algebra the pairwise-survivor rules may soundly use,
     * or `null` when the composition is not a sound single union:
     * - a schema carrying an `allOf` is a conjunction (union ∧ superclass), not a plain union;
     * - a schema carrying BOTH `oneOf` and `anyOf` is a conjunction of two composition keywords, not a union;
     * - more than one composition of the chosen kind is likewise a conjunction;
     * - an `anyOf` (at-least-one) is always sound — its branches need no disjointness;
     * - a `oneOf` (exactly-one) is sound only when its branches are pairwise-disjoint, so that no value can
     *   satisfy two branches and exactly-one collapses to at-least-one. When disjointness cannot be proven
     *   the union is left unresolved (Unsupported) rather than admitting a value a real `oneOf` excludes.
     */
    private fun soundUnionBranches(schema: SchemaModel): List<SchemaModel>? {
        // An accompanying `allOf` makes the schema a CONJUNCTION (union ∧ superclass), not a plain union; the
        // `allOf` assertion cannot be dropped, so it is never a sound single union.
        if (schema.compositions.any { it.kind == CompositionKind.ALL_OF }) return null
        val oneOf = schema.compositions.filter { it.kind == CompositionKind.ONE_OF }
        val anyOf = schema.compositions.filter { it.kind == CompositionKind.ANY_OF }
        if (oneOf.isNotEmpty() && anyOf.isNotEmpty()) return null
        val composition = (if (oneOf.isNotEmpty()) oneOf else anyOf).singleOrNull() ?: return null
        val branches =
            composition.branches
                .map { branch -> deref(branch.schemaId) }
                .filterNot { branch -> branch.acceptsOnlyNull || concreteTypes(branch) == listOf("null") }
        if (branches.isEmpty()) return null
        if (composition.kind == CompositionKind.ONE_OF && !branchesPairwiseDisjoint(branches)) return null
        return branches
    }

    private fun branchesPairwiseDisjoint(branches: List<SchemaModel>): Boolean =
        branches.indices.all { i ->
            ((i + 1) until branches.size).all { j -> branchesDisjoint(branches[i], branches[j]) }
        }

    /**
     * A conservative proof that two `oneOf` branches share no value: disjoint enum/const value sets, or
     * disjoint concrete wire kinds. Anything else (a value-pinned branch against a plain one of a compatible
     * kind, an untyped/union/`any` branch, two structured objects) is NOT provably disjoint and returns
     * `false`, keeping the enclosing `oneOf` Unsupported rather than risk admitting a doubly-matching value.
     */
    private fun branchesDisjoint(
        left: SchemaModel,
        right: SchemaModel,
    ): Boolean {
        val leftValues = exactValues(left)?.map(::jsonCanon)?.toSet()
        val rightValues = exactValues(right)?.map(::jsonCanon)?.toSet()
        if (leftValues != null && rightValues != null) return (leftValues intersect rightValues).isEmpty()
        if (leftValues != null || rightValues != null) return false
        // Canonicalize to overlap classes before comparing: every JSON integer is also a number, so
        // `integer` and `number` share values and must NOT be called disjoint. Every other primitive kind is
        // its own class. Comparing the raw type NAMES would wrongly treat `oneOf[integer, number]` as disjoint.
        val leftTypes = concreteTypes(left).map(::typeOverlapClass).toSet()
        val rightTypes = concreteTypes(right).map(::typeOverlapClass).toSet()
        if (leftTypes.isEmpty() || rightTypes.isEmpty()) return false
        return (leftTypes intersect rightTypes).isEmpty()
    }

    /** The value-overlap class of a JSON type name: `integer` collapses into `number`; all others are distinct. */
    private fun typeOverlapClass(type: String): String = if (type == "integer") "number" else type

    /**
     * True for an unconstrained `{}`/`true` schema: it admits any value, so it is the identity of `∧`. Every
     * assertion-bearing keyword must be absent — any non-empty `constraints` (not just `const`), a `required`
     * set, a content contract, `acceptsOnlyNull`, an enum, a shape, or a composition — or narrowing against
     * it would silently discard that assertion.
     */
    private fun isAnyUnconstrained(schema: SchemaModel): Boolean =
        concreteTypes(schema).isEmpty() &&
            !schema.acceptsOnlyNull &&
            schema.enum == null &&
            schema.constraints.isEmpty() &&
            schema.requiredPropertyNames.isEmpty() &&
            schema.contentEncoding == null &&
            schema.contentMediaType == null &&
            schema.properties.isEmpty() &&
            schema.items == null &&
            schema.compositions.isEmpty() &&
            (schema.additionalProperties == null || schema.additionalProperties is AdditionalPropertiesModel.FreeForm)

    /**
     * True for a bare `object` with no declared shape (free-form), distinct from an unconstrained `any`. Any
     * assertion — a non-empty `constraints` (`minProperties`/`maxProperties`/...), a `required` set, a
     * content contract, an enum, declared properties, or ANY composition (`allOf`/`oneOf`/`anyOf`) —
     * disqualifies it, so narrowing a named object against it never drops one of those.
     */
    private fun isFreeFormObject(schema: SchemaModel): Boolean =
        concreteTypes(schema) == listOf("object") &&
            schema.enum == null &&
            schema.constraints.isEmpty() &&
            schema.requiredPropertyNames.isEmpty() &&
            schema.contentEncoding == null &&
            schema.contentMediaType == null &&
            schema.properties.isEmpty() &&
            schema.compositions.isEmpty() &&
            schema.additionalProperties !is AdditionalPropertiesModel.Typed &&
            schema.additionalProperties !is AdditionalPropertiesModel.Closed

    private fun isStructuredObject(schema: SchemaModel): Boolean =
        schema.properties.isNotEmpty() || schema.compositions.any { it.kind == CompositionKind.ALL_OF }

    /** The exact value set (const as a singleton) when the schema pins one, else `null`. */
    private fun exactValues(schema: SchemaModel): List<JsonValue>? {
        schema.constraints["const"]?.let { return listOf(it) }
        return schema.enum?.values
    }

    private fun valuesCompatibleWith(
        values: List<JsonValue>,
        scalar: SchemaModel,
    ): Boolean {
        if (exactValues(scalar) != null) return false
        // The enum/const node is the pick, so the plain scalar must add no assertion the enum lacks — a
        // format, a constraint, or a content contract on the scalar would be silently dropped otherwise.
        if (scalar.format != null) return false
        if (scalar.constraints.isNotEmpty()) return false
        if (scalar.contentEncoding != null || scalar.contentMediaType != null) return false
        val type = concreteTypes(scalar).singleOrNull() ?: return false
        // A `null` in the enum value set is the nullability marker (handled separately by the nullability
        // algebra), not a JSON-kind assertion, so it does not gate scalar-kind compatibility. The remaining
        // concrete values must all match the plain scalar's wire kind; an enum pinning ONLY null adds no
        // concrete value the scalar can carry, so it is not narrowable to the plain scalar.
        val concrete = values.filterNot { it == JsonValue.Null }
        if (concrete.isEmpty()) return false
        return concrete.all { value -> jsonKindMatchesType(value, type) }
    }

    private fun jsonKindMatchesType(
        value: JsonValue,
        type: String,
    ): Boolean =
        when (value) {
            is JsonValue.StringValue -> type == "string"
            is JsonValue.NumberValue -> type == "number" || type == "integer"
            is JsonValue.BooleanValue -> type == "boolean"
            is JsonValue.ArrayValue -> type == "array"
            is JsonValue.ObjectValue -> type == "object"
            JsonValue.Null -> false
        }

    private fun schemaChainNullable(schema: SchemaModel): Boolean =
        effectivelyNullable(SchemaRef(schema.id, schema.source))

    /** Whether an operand admits a JSON `null`: nullable if its schema chain OR its property flag is. */
    private fun effectiveNullability(property: PropertyModel): Boolean =
        property.nullability == Nullability.NULLABLE || effectivelyNullable(property.schema)

    /** The instance-shape set derived from a property's contract; mirrors the adapter's own derivation. */
    private fun presenceStatesFor(
        requiredness: Requiredness,
        nullability: Nullability,
    ): List<PresenceState> = derivePresenceStates(requiredness, nullability)

    // endregion

    // region structural equality --------------------------------------------------------------------

    private fun structurallyEqual(
        left: SchemaModel,
        right: SchemaModel,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Boolean {
        if (left.id == right.id) return true
        val key = if (left.id.value <= right.id.value) left.id to right.id else right.id to left.id
        if (!guard.add(key)) return true
        // Path-scoped like `intersect()`'s guard: the pair protects only its own recursion subtree. Without
        // the removal, a FAILED order-insensitive composition candidate would leave its visited pairs behind,
        // and a later candidate revisiting one of them would short-circuit `true` as though it had hit a
        // recursive cycle — spuriously classifying structurally different schemas as `identical`.
        try {
            if (concreteTypes(left).toSet() != concreteTypes(right).toSet()) return false
            if (left.format != right.format) return false
            if (left.acceptsOnlyNull != right.acceptsOnlyNull) return false
            if (left.contentEncoding != right.contentEncoding || left.contentMediaType != right.contentMediaType) {
                return false
            }
            // Assertion-bearing keywords must match too, or a constrained node would be classified `identical`
            // to its unconstrained peer and the peer could silently win, dropping maxLength/pattern/minimum/...
            // and the `required` set.
            if (left.constraints != right.constraints) return false
            if (left.requiredPropertyNames.toSet() != right.requiredPropertyNames.toSet()) return false
            if (enumCanon(left.enum, left) != enumCanon(right.enum, right)) return false
            if (!refsEqual(left.items, right.items, guard)) return false
            if (!additionalEqual(left.additionalProperties, right.additionalProperties, guard)) return false
            if (!propertiesEqual(left, right, guard)) return false
            if (!compositionsEqual(left, right, guard)) return false
            return true
        } finally {
            guard.remove(key)
        }
    }

    private fun enumCanon(
        enum: EnumModel?,
        schema: SchemaModel,
    ): String {
        val values = exactValues(schema) ?: enum?.values.orEmpty()
        if (values.isEmpty()) return ""
        return values.map(::jsonCanon).sorted().joinToString(",")
    }

    private fun refsEqual(
        left: SchemaRef?,
        right: SchemaRef?,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Boolean =
        when {
            left == null && right == null -> {
                true
            }

            left == null || right == null -> {
                false
            }

            // A nested ref (array element, typed additional-property value) carries no property-level flag,
            // so its nullability lives on the ref chain and IS part of its identity: `array<T?>` and
            // `array<T>` are different types and must not be classified structurally equal.
            else -> {
                effectivelyNullable(left) == effectivelyNullable(right) &&
                    structurallyEqual(deref(left.schemaId), deref(right.schemaId), guard)
            }
        }

    private fun additionalEqual(
        left: AdditionalPropertiesModel?,
        right: AdditionalPropertiesModel?,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Boolean =
        when {
            left is AdditionalPropertiesModel.Typed && right is AdditionalPropertiesModel.Typed -> {
                refsEqual(left.valueSchema, right.valueSchema, guard)
            }

            else -> {
                left?.let { it::class } == right?.let { it::class }
            }
        }

    private fun propertiesEqual(
        left: SchemaModel,
        right: SchemaModel,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Boolean {
        val leftByName = left.properties.associateBy(PropertyModel::name)
        val rightByName = right.properties.associateBy(PropertyModel::name)
        if (leftByName.keys != rightByName.keys) return false
        return leftByName.all { (name, leftProperty) ->
            val rightProperty = rightByName.getValue(name)
            leftProperty.requiredness == rightProperty.requiredness &&
                leftProperty.nullability == rightProperty.nullability &&
                structurallyEqual(
                    deref(leftProperty.schema.schemaId),
                    deref(rightProperty.schema.schemaId),
                    guard,
                )
        }
    }

    private fun compositionsEqual(
        left: SchemaModel,
        right: SchemaModel,
        guard: MutableSet<Pair<SchemaId, SchemaId>>,
    ): Boolean {
        if (left.compositions.size != right.compositions.size) return false
        val rightByKind = right.compositions.groupBy { it.kind }
        return left.compositions.groupBy { it.kind }.all { (kind, leftCompositions) ->
            val rightCompositions = rightByKind[kind] ?: return false
            if (leftCompositions.size != rightCompositions.size) return false
            val leftBranches = leftCompositions.flatMap { it.branches }.map(SchemaRef::schemaId)
            val rightBranches = rightCompositions.flatMap { it.branches }.map(SchemaRef::schemaId)
            if (leftBranches.size != rightBranches.size) return false
            // Order-insensitive match: every left branch must pair with a distinct structurally-equal right branch.
            val remaining = rightBranches.toMutableList()
            leftBranches.all { leftBranch ->
                val match =
                    remaining.firstOrNull { rightBranch ->
                        structurallyEqual(deref(leftBranch), deref(rightBranch), guard)
                    }
                match != null && remaining.remove(match)
            }
        }
    }

    /**
     * A value-canonical spelling of a JSON number: distinct lexical forms of the same numeric value
     * (`1`, `1.0`, `1.00`, `+1`) collapse to one token (BigDecimal `compareTo` semantics), and every zero
     * form maps to `0`. A non-numeric spelling (should not occur for a well-formed [JsonValue.NumberValue])
     * falls back to its literal text rather than throwing.
     */
    private fun canonicalNumber(lexical: String): String =
        try {
            val decimal = BigDecimal(lexical)
            if (decimal.signum() == 0) "0" else decimal.stripTrailingZeros().toPlainString()
        } catch (_: NumberFormatException) {
            lexical
        }

    private fun jsonCanon(value: JsonValue): String =
        when (value) {
            JsonValue.Null -> {
                "null"
            }

            is JsonValue.BooleanValue -> {
                "b:${value.value}"
            }

            is JsonValue.NumberValue -> {
                // Compare numbers by VALUE, not by preserved lexical spelling: `1` and `1.0` are the same
                // JSON number, so value-set disjointness and enum-subset relations must see them as equal.
                "n:${canonicalNumber(value.lexicalValue)}"
            }

            is JsonValue.StringValue -> {
                "s:${value.value}"
            }

            is JsonValue.ArrayValue -> {
                "a:[" + value.values.joinToString(",", transform = ::jsonCanon) + "]"
            }

            is JsonValue.ObjectValue -> {
                "o:{" +
                    value.properties
                        .toSortedMap()
                        .entries
                        .joinToString(",") { (k, v) -> "$k=${jsonCanon(v)}" } +
                    "}"
            }
        }

    // endregion

    private companion object {
        /** Primitive JSON scalar base types that narrow by base type; structured kinds never collapse here. */
        private val PRIMITIVE_SCALAR_TYPES = setOf("string", "integer", "number", "boolean")
    }

    private inner class RuleContext(
        private val parentSchemaId: SchemaId,
        private val propertyName: String,
        private val left: SchemaModel,
        private val right: SchemaModel,
        private val leftSource: SourcePointer,
        private val rightSource: SourcePointer,
    ) {
        fun provenance(
            ruleId: String,
            extensionSource: SourcePointer? = null,
        ): IntersectionProvenance =
            IntersectionProvenance(
                parentSchemaId = parentSchemaId,
                propertyName = propertyName,
                leftSchemaId = left.id,
                rightSchemaId = right.id,
                leftSource = leftSource,
                rightSource = rightSource,
                ruleId = ruleId,
                extensionSource = extensionSource,
            )
    }
}

/**
 * The instance-shape set derived from a property's `(requiredness, nullability)` contract — the single
 * source of truth shared by the strict resolver and [StandardProjection]'s same-type fast path, mirroring
 * the adapter's own derivation. A property admits [PresenceState.ABSENT] iff optional, [PresenceState.NULL]
 * iff nullable, and always [PresenceState.VALUE].
 */
internal fun derivePresenceStates(
    requiredness: Requiredness,
    nullability: Nullability,
): List<PresenceState> =
    buildList {
        if (requiredness == Requiredness.OPTIONAL) add(PresenceState.ABSENT)
        if (nullability == Nullability.NULLABLE) add(PresenceState.NULL)
        add(PresenceState.VALUE)
    }
