package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.model.AllOfPropertyResolution
import com.nabobery.sdkgen.model.AllOfResolutionSource
import com.nabobery.sdkgen.model.AllOfResolutionStrategy
import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.CompositionModel
import com.nabobery.sdkgen.model.EnumModel
import com.nabobery.sdkgen.model.EnumOpenness
import com.nabobery.sdkgen.model.IdentityKind
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.Nullability
import com.nabobery.sdkgen.model.PresenceState
import com.nabobery.sdkgen.model.PropertyModel
import com.nabobery.sdkgen.model.Requiredness
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SchemaRef
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SourceLocation
import com.nabobery.sdkgen.model.SourcePointer
import com.nabobery.sdkgen.openapi.SemanticAdapter
import com.nabobery.sdkgen.openapi.overlays.DocumentCodec
import java.nio.file.Files
import kotlin.io.path.deleteIfExists
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Table-driven proof that [SchemaIntersectionResolver] implements exactly the strict algebra frozen in
 * `docs/conformance/evidence/schema-intersection-proof-table.tsv` (96 strict rows) plus the dormant audited
 * override. Every strict rule is asserted in BOTH operand orders (commutativity) with identical winning node
 * and nullability; every unproven pairing must be [IntersectionResult.Unsupported] rather than a silent drop.
 */
class SchemaIntersectionResolverTest {
    private val graph = linkedMapOf<SchemaId, SchemaModel>()

    private val resolver =
        SchemaIntersectionResolver(
            dereference = { id -> dereference(id) },
            effectivelyNullable = { ref -> effectivelyNullable(ref) },
        )

    // region rule assertions ----------------------------------------------------------------------------

    @Test
    fun `identical scalar operands resolve to either operand`() {
        val left = scalar("left", "string")
        val right = scalar("right", "string")
        assertResolves(left, right, expected = "left", expectedRule = "identical")
    }

    @Test
    fun `ref-equal objects under different names are identical`() {
        objectSchema("SharedInner", mapOf("x" to field(scalar("x1", "string"))))
        objectSchema("OtherInner", mapOf("x" to field(scalar("x2", "string"))))
        val left = ref("leftRef", "SharedInner")
        val right = ref("rightRef", "OtherInner")
        // Structurally-identical operands resolve to a canonical, order-independent winner: the
        // lexicographically-smaller schema id ("OtherInner" < "SharedInner"), so operand order never changes output.
        assertResolves(left, right, expected = "OtherInner", expectedRule = "identical")
    }

    @Test
    fun `nullable narrows to non-null against identical non-null`() {
        val left = scalar("left", "string", nullable = true)
        val right = scalar("right", "string")
        // The non-null operand wins so the result node itself is non-null; forcing a chain-nullable node
        // to a non-null contract would be a lie, so `X? ∧ X` resolves to the non-null `right` node.
        val resolved = assertResolves(left, right, expected = "right", expectedRule = "identical")
        assertEquals(Nullability.NON_NULL, resolved.nullability, "nullable ∧ non-null identical type -> non-null")
    }

    @Test
    fun `integer intersect number resolves to integer`() {
        val left = scalar("intLeft", "integer")
        val right = scalar("numRight", "number")
        assertResolves(left, right, expected = "intLeft", expectedRule = "integer-number")
    }

    @Test
    fun `formatted integer supersedes unformatted integer`() {
        val left = scalar("int64", "integer", format = "int64")
        val right = scalar("plainInt", "integer")
        assertResolves(left, right, expected = "int64", expectedRule = "format-narrow")
    }

    @Test
    fun `formatted string supersedes plain string`() {
        val left = scalar("emailStr", "string", format = "email")
        val right = scalar("plainStr", "string")
        assertResolves(left, right, expected = "emailStr", expectedRule = "format-narrow")
    }

    @Test
    fun `two different string formats are unsupported`() {
        val left = scalar("emailStr", "string", format = "email")
        val right = scalar("uriStr", "string", format = "uri")
        assertUnsupported(left, right)
    }

    @Test
    fun `enum narrows against compatible plain string`() {
        val left = enumSchema("visibility", listOf("public", "private", "internal"))
        val right = scalar("plainStr", "string")
        assertResolves(left, right, expected = "visibility", expectedRule = "enum-narrow-scalar")
    }

    @Test
    fun `nullable enum narrows against nullable string keeping null`() {
        val left = enumSchema("reason", listOf("resolved", "spam"), nullable = true)
        val right = scalar("plainStr", "string", nullable = true)
        val resolved = assertResolves(left, right, expected = "reason", expectedRule = "enum-narrow-scalar")
        assertEquals(Nullability.NULLABLE, resolved.nullability, "nullable enum ∧ nullable string retains null")
    }

    @Test
    fun `enum intersect enum keeps the subset`() {
        val left = enumSchema("small", listOf("high", "low", "medium"))
        val right = enumSchema("large", listOf("low", "medium", "high", "xhigh", "max"))
        assertResolves(left, right, expected = "small", expectedRule = "enum-intersect")
    }

    @Test
    fun `enum intersect enum with disjoint values is unsupported`() {
        val left = enumSchema("a", listOf("x", "y"))
        val right = enumSchema("b", listOf("p", "q"))
        assertUnsupported(left, right)
    }

    @Test
    fun `named object narrows against free-form object`() {
        objectSchema("Named", mapOf("id" to field(scalar("idInner", "string"))))
        val left = ref("namedRef", "Named", nullable = true)
        val right = freeFormObject("freeObj", nullable = true)
        assertResolves(left, right, expected = "Named", expectedRule = "narrow-freeform-object")
    }

    @Test
    fun `constrained scalar narrows against unconstrained any`() {
        val left = scalar("uriStr", "string", format = "uri", nullable = true)
        val right = anySchema("any", nullable = true)
        assertResolves(left, right, expected = "uriStr", expectedRule = "narrow-any")
    }

    @Test
    fun `array element narrows recursively`() {
        val stringItem = scalar("strItem", "string")
        val anyItem = anySchema("anyItem", nullable = true)
        val left = arraySchema("strArray", "strItem")
        val right = arraySchema("anyArray", "anyItem")
        assertResolves(left, right, expected = "strArray", expectedRule = "array-element")
        // element intersection is string ∧ any = string, so the whole left array is the intersection.
        assertTrue(stringItem.id.value == "strItem" && anyItem.id.value == "anyItem")
    }

    @Test
    fun `array of ref narrows against array of free-form object`() {
        objectSchema("Item", mapOf("id" to field(scalar("iid", "string"))))
        ref("refItem", "Item")
        freeFormObject("objItem")
        val left = arraySchema("refArray", "refItem")
        val right = arraySchema("objArray", "objItem")
        assertResolves(left, right, expected = "refArray", expectedRule = "array-element")
    }

    @Test
    fun `union intersect exact kind collapses to the compatible branch`() {
        scalar("intBranch", "integer")
        scalar("dateBranch", "string", format = "date-time")
        val left = unionSchema("createdAt", CompositionKind.ONE_OF, listOf("intBranch", "dateBranch"))
        val right = scalar("plainStr", "string")
        assertResolves(left, right, expected = "dateBranch", expectedRule = "union-collapse")
    }

    @Test
    fun `union intersect wider union keeps the narrower union whole`() {
        // oneOf branches must be pairwise-disjoint for the at-least-one union algebra to be sound, so the
        // members are distinct wire kinds (a value can satisfy at most one).
        scalar("uInt", "integer")
        scalar("uStr", "string")
        scalar("uBool", "boolean")
        val left = unionSchema("narrow", CompositionKind.ONE_OF, listOf("uInt", "uStr"))
        val right = unionSchema("wide", CompositionKind.ONE_OF, listOf("uInt", "uStr", "uBool"))
        assertResolves(left, right, expected = "narrow", expectedRule = "union-whole")
    }

    @Test
    fun `union with no compatible branch is unsupported`() {
        scalar("intBranch", "integer")
        scalar("boolBranch", "boolean")
        val left = unionSchema("nums", CompositionKind.ONE_OF, listOf("intBranch", "boolBranch"))
        val right = scalar("plainStr", "string")
        assertUnsupported(left, right)
    }

    @Test
    fun `unrelated scalar kinds are unsupported`() {
        val left = scalar("s", "string")
        val right = scalar("i", "integer")
        assertUnsupported(left, right)
    }

    @Test
    fun `two distinct named objects are unsupported without a policy`() {
        objectSchema("Left", mapOf("l" to field(scalar("li", "string"))))
        objectSchema("Right", mapOf("r" to field(scalar("ri", "string"))))
        val left = ref("lRef", "Left")
        val right = ref("rRef", "Right")
        assertUnsupported(left, right)
    }

    @Test
    fun `requiredness is unioned across operands`() {
        val left = scalar("left", "string")
        val right = scalar("right", "string")
        val prior = prop("v", left.id, Requiredness.OPTIONAL, Nullability.NON_NULL)
        val next = prop("v", right.id, Requiredness.REQUIRED, Nullability.NON_NULL)
        val result = resolver.resolve(parentWith("Parent"), prior, next)
        assertTrue(result is IntersectionResult.Resolved)
        assertEquals(Requiredness.REQUIRED, result.property.requiredness)
    }

    @Test
    fun `property-level nullability survives into a later merge (F1)`() {
        // A prior operand whose SCHEMA node is non-null but whose PROPERTY flag is NULLABLE — the state a
        // fold produces after an earlier merge rewrote the winner to the dereferenced (non-null) node —
        // must still contribute its nullability. Effective nullability is (schema-chain OR property flag).
        val strNode = scalar("f1StrNode", "string")
        val nullStr = scalar("f1NullStr", "string", nullable = true)
        val prior = prop("v", strNode.id, Requiredness.OPTIONAL, Nullability.NULLABLE)
        val next = prop("v", nullStr.id, Requiredness.OPTIONAL, Nullability.NULLABLE)
        val result = resolver.resolve(parentWith("Parent"), prior, next)
        assertTrue(result is IntersectionResult.Resolved, "expected resolved, got $result")
        assertEquals(
            Nullability.NULLABLE,
            result.property.nullability,
            "property-flag nullability must AND-combine into the result, not be dropped",
        )
        assertEquals(
            listOf(PresenceState.ABSENT, PresenceState.NULL, PresenceState.VALUE),
            result.property.presenceStates,
            "presenceStates must be recomputed from the merged requiredness/nullability contract",
        )
    }

    @Test
    fun `array element nullability is commutative (F1)`() {
        val strItem = scalar("f1StrItem", "string")
        ref("f1NullAliasItem", "f1StrItem", nullable = true) // nullable alias to the non-null element
        val arrNullable = arraySchema("f1ArrNullElem", "f1NullAliasItem")
        val arrPlain = arraySchema("f1ArrPlainElem", "f1StrItem")
        // element intersection is string? ∧ string = string (non-null); both orders must name the
        // non-null-element array, or List<T?> forward vs List<T> reversed breaks commutativity.
        assertResolves(arrNullable, arrPlain, expected = "f1ArrPlainElem", expectedRule = "array-element")
    }

    @Test
    fun `oneOf with non-disjoint branches is unsupported (F2)`() {
        val plainStr = scalar("f2Str", "string")
        val enumX = enumSchema("f2EnumX", listOf("x"))
        val union = unionSchema("f2OneOf", CompositionKind.ONE_OF, listOf("f2Str", "f2EnumX"))
        assertTrue(plainStr.id.value == "f2Str")
        // 'x' satisfies BOTH the string branch and the enum branch, so a real oneOf (exactly-one) rejects
        // it: oneOf[string, enum(x)] ∧ enum(x) is EMPTY, never the enum. Only disjoint oneOf branches admit
        // the at-least-one union algebra.
        assertUnsupported(union, enumX)
    }

    @Test
    fun `nullable constrained scalar never collapses to its unconstrained non-null peer (F3)`() {
        val bounded =
            scalar(
                "f3Bounded",
                "string",
                nullable = true,
                constraints = mapOf("maxLength" to JsonValue.NumberValue("5")),
            )
        val plain = scalar("f3Plain", "string")
        // nullable {string, maxLength:5} ∧ {string}: the sound intersection is a NON-NULL string constrained
        // to maxLength:5, but the only maxLength-bearing node is nullable, so no existing node names it ->
        // Unsupported. The unconstrained non-null node must never silently win and drop maxLength.
        assertUnsupported(bounded, plain)
    }

    @Test
    fun `content-encoding mismatch never narrows via format (F3)`() {
        val encoded = scalar("f3Encoded", "string", contentEncoding = "base64")
        val plain = scalar("f3PlainStr", "string")
        // string(base64) ∧ string: picking the plain string drops the content contract, picking the encoded
        // one invents an encoding on the plain branch. No existing node preserves both -> Unsupported.
        assertUnsupported(encoded, plain)
    }

    @Test
    fun `dominant object subsumes its requiredness-and-format-relaxed peer (object-subsume)`() {
        // Two objects with the same shape up to requiredness and format: SubA requires 'x' and formats it
        // (string(email)); SubB leaves 'x' optional and unformatted. SubA dominates on every differing
        // location, so it IS the per-location intersection and wins whole.
        objectSchema(
            "SubA",
            mapOf(
                "x" to
                    prop(
                        "x",
                        scalar("subAX", "string", format = "email").id,
                        Requiredness.REQUIRED,
                        Nullability.NON_NULL,
                    ),
            ),
        )
        objectSchema(
            "SubB",
            mapOf("x" to prop("x", scalar("subBX", "string").id, Requiredness.OPTIONAL, Nullability.NON_NULL)),
        )
        val left = ref("subARef", "SubA")
        val right = ref("subBRef", "SubB")
        assertResolves(left, right, expected = "SubA", expectedRule = "object-subsume")
    }

    @Test
    fun `same-format scalar with a constraint superset supersedes its unconstrained peer (format-identical)`() {
        val bounded =
            scalar(
                "fiBounded",
                "string",
                format = "email",
                constraints =
                    mapOf("maxLength" to JsonValue.NumberValue("5")),
            )
        val plain = scalar("fiPlain", "string", format = "email")
        // Same type and format, differing constraints: the maxLength-bearing node subsumes the unconstrained
        // one and names the intersection verbatim, so it wins under `format-identical`.
        assertResolves(bounded, plain, expected = "fiBounded", expectedRule = "format-identical")
    }

    @Test
    fun `a failed composition candidate never poisons a later candidate comparison (F7)`() {
        // Nested targets that genuinely differ: string vs integer under the same property name.
        objectSchema("NestedStr", mapOf("v" to field(scalar("nsv", "string"))))
        objectSchema("NestedInt", mapOf("v" to field(scalar("niv", "integer"))))
        // CompP nests NestedStr; every other branch nests NestedInt with an otherwise identical shape.
        objectSchema(
            "CompP",
            mapOf("shared" to field(ref("cpRef", "NestedStr")), "extra" to field(scalar("cpe", "string"))),
        )
        objectSchema(
            "CompP2",
            mapOf("shared" to field(ref("cp2Ref", "NestedInt")), "extra" to field(scalar("cp2e", "string"))),
        )
        objectSchema(
            "CompPPrime",
            mapOf("shared" to field(ref("cppRef", "NestedInt")), "extra" to field(scalar("cppe", "string"))),
        )
        objectSchema(
            "CompQPrime",
            mapOf("shared" to field(ref("cqpRef", "NestedInt")), "extra" to field(scalar("cqpe", "string"))),
        )
        // Order-insensitive branch matching first tries CompP vs CompPPrime, which FAILS after walking the
        // genuinely-unequal (NestedStr, NestedInt) pair. A guard that is not path-scoped keeps that pair, so
        // the next candidate (CompP vs CompQPrime) revisits it, short-circuits `true` as if it were a cycle,
        // and the two structurally different compositions are spuriously classified `identical`.
        val left = unionSchema("PoisonLeft", CompositionKind.ALL_OF, listOf("CompP", "CompP2"))
        val right = unionSchema("PoisonRight", CompositionKind.ALL_OF, listOf("CompPPrime", "CompQPrime"))
        assertUnsupported(left, right)
    }

    @Test
    fun `transparent allOf wrapper is unwrapped before intersecting`() {
        // A wrapper whose only content is a single-branch allOf around a $ref is transparent: the resolver
        // dereferences it to the inner node, so `allOf[ref aInner] ∧ aInner-shaped string` reads as string ∧
        // string and resolves.
        scalar("taInner", "string")
        val wrapper = transparentAllOf("taWrap", "taInner")
        val plain = scalar("taPlain", "string")
        // Both unwrap to a plain non-null string; the canonical winner is the lexicographically-smaller id.
        assertResolves(wrapper, plain, expected = "taInner", expectedRule = "identical")
    }

    @Test
    fun `three-operand nullability composition stays nullable across the fold (F1)`() {
        // Simulate the projection's successive fold: three same-typed operands, each nullable only via its
        // property flag (the state a prior merge leaves after rewriting the winner to a chain-non-null node).
        // Every fold step must AND-combine effective nullability, so the final result stays nullable — the
        // exact regression F1 fixed (it previously collapsed to NON_NULL).
        val s1 = scalar("t3a", "string")
        val s2 = scalar("t3b", "string")
        val s3 = scalar("t3c", "string")
        val p1 = prop("v", s1.id, Requiredness.OPTIONAL, Nullability.NULLABLE)
        val p2 = prop("v", s2.id, Requiredness.OPTIONAL, Nullability.NULLABLE)
        val p3 = prop("v", s3.id, Requiredness.OPTIONAL, Nullability.NULLABLE)
        val first = resolver.resolve(parentWith("Parent"), p1, p2)
        assertTrue(first is IntersectionResult.Resolved, "first fold step: $first")
        assertEquals(Nullability.NULLABLE, first.property.nullability, "first fold step must stay nullable")
        val second = resolver.resolve(parentWith("Parent"), first.property, p3)
        assertTrue(second is IntersectionResult.Resolved, "second fold step: $second")
        assertEquals(
            Nullability.NULLABLE,
            second.property.nullability,
            "three-operand fold must remain nullable, not collapse to NON_NULL",
        )
    }

    // region R2 — conservative disjointness -------------------------------------------------------------

    @Test
    fun `oneOf of integer and number is not pairwise-disjoint so the union is unsupported (R2)`() {
        // Every JSON integer is also a number, so the two branches OVERLAP: a real oneOf (exactly-one)
        // rejects any integer value (it satisfies both branches). The union algebra is therefore unsound and
        // the enclosing oneOf must stay Unsupported rather than being treated as an at-least-one union.
        scalar("r2Int", "integer")
        scalar("r2Num", "number")
        val union = unionSchema("r2IntNumOneOf", CompositionKind.ONE_OF, listOf("r2Int", "r2Num"))
        val other = scalar("r2Other", "number")
        assertUnsupported(union, other)
    }

    @Test
    fun `numeric enum subset is decided numerically not lexically (R2)`() {
        // 1.0 and 1 are the SAME numeric value; the narrower enum {1.0} is a subset of {1, 2}. A lexical
        // comparison of the preserved spellings ("1.0" vs "1") would wrongly call the sets disjoint.
        val narrow = numberEnumSchema("r2NumNarrow", listOf("1.0"))
        val wide = numberEnumSchema("r2NumWide", listOf("1", "2"))
        assertResolves(narrow, wide, expected = "r2NumNarrow", expectedRule = "enum-intersect")
    }

    @Test
    fun `anyOf combined with allOf is a conjunction not a sound union (R2)`() {
        // A schema carrying BOTH anyOf and allOf is a conjunction of two composition keywords; the allOf
        // assertion cannot be ignored, so it is not a plain union and must stay Unsupported.
        scalar("r2ConjStr", "string")
        scalar("r2ConjInt", "integer")
        objectSchema("r2ConjObj", mapOf("m" to field(scalar("r2ConjObjM", "string"))))
        val combo =
            register(
                base("r2AnyOfAllOf", nullable = false).copy(
                    compositions =
                        listOf(
                            CompositionModel(
                                kind = CompositionKind.ANY_OF,
                                branches =
                                    listOf(
                                        SchemaRef(SchemaId("r2ConjStr"), source()),
                                        SchemaRef(SchemaId("r2ConjInt"), source()),
                                    ),
                                discriminator = null,
                                source = source(),
                            ),
                            CompositionModel(
                                kind = CompositionKind.ALL_OF,
                                branches = listOf(SchemaRef(SchemaId("r2ConjObj"), source())),
                                discriminator = null,
                                source = source(),
                            ),
                        ),
                ),
            )
        val other = scalar("r2ConjOther", "string")
        assertUnsupported(combo, other)
    }

    // region R3 — narrowing paths must not drop constraints ----------------------------------------------

    @Test
    fun `array intersect keeps the constrained array in both orders (R3)`() {
        val constrained =
            register(
                base("r3ArrConstrained", nullable = false).copy(
                    types = listOf("array"),
                    items = SchemaRef(SchemaId("r3StrItem"), source()),
                    constraints = mapOf("maxItems" to JsonValue.NumberValue("5")),
                ),
            )
        scalar("r3StrItem", "string")
        val plain = arraySchema("r3ArrPlain", "r3StrItem")
        // array{maxItems:5}<string> ∧ array<string> = array{maxItems:5}<string>; the plain array must never
        // silently win (dropping maxItems), and the outcome must be order-independent.
        assertResolves(constrained, plain, expected = "r3ArrConstrained", expectedRule = "array-element")
    }

    @Test
    fun `object subsume keeps the constrained object in both orders (R3)`() {
        // Same object shape up to a schema-level constraint: {minProperties:1} ∧ {} = {minProperties:1}. The
        // unconstrained peer must never win under either operand order (it would drop minProperties).
        objectSchema(
            "r3ObjConstrained",
            mapOf("x" to prop("x", scalar("r3ObjCX", "string").id, Requiredness.OPTIONAL, Nullability.NON_NULL)),
        ).also { register(it.copy(constraints = mapOf("minProperties" to JsonValue.NumberValue("1")))) }
        objectSchema(
            "r3ObjPlain",
            mapOf("x" to prop("x", scalar("r3ObjPX", "string").id, Requiredness.OPTIONAL, Nullability.NON_NULL)),
        )
        assertResolves(
            dereference(SchemaId("r3ObjConstrained")),
            dereference(SchemaId("r3ObjPlain")),
            expected = "r3ObjConstrained",
            expectedRule = "object-subsume",
        )
    }

    @Test
    fun `enum subset that drops a constraint is unsupported (R3)`() {
        val wideConstrained =
            register(
                base("r3EnumWide", nullable = false).copy(
                    types = listOf("string"),
                    constraints = mapOf("maxLength" to JsonValue.NumberValue("1")),
                    enum =
                        EnumModel(
                            values = listOf("a", "b", "c").map(JsonValue::StringValue),
                            openness = EnumOpenness.CLOSED,
                            source = source(),
                        ),
                ),
            )
        val narrow = enumSchema("r3EnumNarrow", listOf("a"))
        // {a} ⊆ {a,b,c}, but the wide operand asserts maxLength:1 which the narrow enum does not carry, so
        // electing the narrow enum would silently drop that constraint -> Unsupported.
        assertUnsupported(wideConstrained, narrow)
    }

    @Test
    fun `object carrying a oneOf is not free-form (R3)`() {
        objectSchema("r3NamedObj", mapOf("id" to field(scalar("r3NamedId", "string"))))
        scalar("r3OneOfA", "string")
        scalar("r3OneOfB", "integer")
        val objWithOneOf =
            register(
                base("r3ObjWithOneOf", nullable = false).copy(
                    types = listOf("object"),
                    compositions =
                        listOf(
                            CompositionModel(
                                kind = CompositionKind.ONE_OF,
                                branches =
                                    listOf(
                                        SchemaRef(SchemaId("r3OneOfA"), source()),
                                        SchemaRef(SchemaId("r3OneOfB"), source()),
                                    ),
                                discriminator = null,
                                source = source(),
                            ),
                        ),
                ),
            )
        val named = ref("r3NamedRef", "r3NamedObj")
        assertTrue(objWithOneOf.id.value == "r3ObjWithOneOf")
        // A `{type: object, oneOf: [...]}` still asserts the oneOf; narrowing a named object against it would
        // drop that composition, so it must not be treated as a free-form object identity.
        assertUnsupported(named, objWithOneOf)
    }

    // region R5 — audited override presence-state consistency -------------------------------------------

    @Test
    fun `audited override recomputes presenceStates from the unioned requiredness (R5)`() {
        objectSchema("R5Base", mapOf("b" to field(scalar("r5bi", "string"))))
        objectSchema("R5Override", mapOf("o" to field(scalar("r5oi", "string"))))
        val left = ref("r5BaseRef", "R5Base")
        val right = ref("r5OverrideRef", "R5Override", nullable = true)
        val parent = parentWith("Parent", resolutions = listOf(auditedResolution("creator", winning = right.id)))
        // The OTHER operand is REQUIRED; the elected winner was OPTIONAL (admits ABSENT). After the requiredness
        // union to REQUIRED, ABSENT must no longer be admitted.
        val prior = prop("creator", left.id, Requiredness.REQUIRED, Nullability.NON_NULL)
        val next =
            prop("creator", right.id, Requiredness.OPTIONAL, Nullability.NULLABLE)
                .copy(presenceStates = listOf(PresenceState.ABSENT, PresenceState.NULL, PresenceState.VALUE))
        val result = resolver.resolve(parent, prior, next)
        assertTrue(result is IntersectionResult.AuditedOverride, "expected audited override, got $result")
        assertEquals(Requiredness.REQUIRED, result.property.requiredness)
        assertEquals(
            listOf(PresenceState.NULL, PresenceState.VALUE),
            result.property.presenceStates,
            "presenceStates must be recomputed from the merged (requiredness, nullability), dropping ABSENT",
        )
    }

    // region audited override ---------------------------------------------------------------------------

    @Test
    fun `audited policy elects the operand named by winningPropertySchemaId (F4)`() {
        objectSchema("Base", mapOf("b" to field(scalar("bi", "string"))))
        objectSchema("Override", mapOf("o" to field(scalar("oi", "string"))))
        val left = ref("baseRef", "Base")
        val right = ref("overrideRef", "Override")
        // The adapter records the elected branch's property schema id (here the override operand's own ref);
        // election is a direct identity match, never a re-digest of the adapted model.
        val parent = parentWith("Parent", resolutions = listOf(auditedResolution("creator", winning = right.id)))
        val prior = prop("creator", left.id, Requiredness.OPTIONAL, Nullability.NULLABLE)
        val next = prop("creator", right.id, Requiredness.OPTIONAL, Nullability.NULLABLE)
        // Both operand orders elect the same override branch, so the audited override is commutative too.
        listOf(prior to next, next to prior).forEach { (first, second) ->
            val result = resolver.resolve(parent, first, second)
            assertTrue(result is IntersectionResult.AuditedOverride, "expected audited override, got $result")
            assertEquals(right.id.value, result.property.schema.schemaId.value, "elected the override operand")
            assertEquals("audited-union-supersede", result.provenance.ruleId)
        }
    }

    @Test
    fun `audited policy supersedes an otherwise strict resolution (T10)`() {
        val left = scalar("t10StrictBase", "string")
        val right = scalar("t10StrictOverride", "string")
        val parent = parentWith("Parent", resolutions = listOf(auditedResolution("creator", winning = right.id)))
        val prior = prop("creator", left.id, Requiredness.OPTIONAL, Nullability.NON_NULL)
        val next = prop("creator", right.id, Requiredness.OPTIONAL, Nullability.NON_NULL)

        listOf(prior to next, next to prior).forEach { (first, second) ->
            val result = resolver.resolve(parent, first, second)
            assertTrue(result is IntersectionResult.AuditedOverride, "expected audited override, got $result")
            assertEquals(right.id, result.property.schema.schemaId)
        }
    }

    @Test
    fun `audited policy matching BOTH operands composes nullability commutatively (F3)`() {
        // A later fold step compares an already-merged property against another branch's reference to the SAME
        // winning node; the two operands' property-level nullability flags differ, so election must compose
        // (nullability AND) instead of matching `prior` first and inheriting whichever flag came first.
        objectSchema("Shared", mapOf("o" to field(scalar("sharedOi", "string"))))
        val shared = ref("sharedRef", "Shared")
        val parent = parentWith("Parent", resolutions = listOf(auditedResolution("creator", winning = shared.id)))
        val nonNullFlag = prop("creator", shared.id, Requiredness.OPTIONAL, Nullability.NON_NULL)
        val nullableFlag = prop("creator", shared.id, Requiredness.OPTIONAL, Nullability.NULLABLE)

        val results =
            listOf(nonNullFlag to nullableFlag, nullableFlag to nonNullFlag).map { (first, second) ->
                val result = resolver.resolve(parent, first, second)
                assertTrue(result is IntersectionResult.AuditedOverride, "expected audited override, got $result")
                assertEquals(shared.id, result.property.schema.schemaId, "elected the shared winning node")
                result
            }
        val forward = results[0].property
        val reverse = results[1].property
        assertEquals(Nullability.NON_NULL, forward.nullability, "composed nullability is the AND across operands")
        assertEquals(
            derivePresenceStates(Requiredness.OPTIONAL, Nullability.NON_NULL),
            forward.presenceStates,
            "presenceStates must be recomputed from the composed contract",
        )
        assertEquals(forward, reverse, "both operand orders must elect the identical merged property")
    }

    @Test
    fun `audited policy whose winning id matches no operand stays unsupported (F4)`() {
        objectSchema("Base", mapOf("b" to field(scalar("bi", "string"))))
        objectSchema("Override", mapOf("o" to field(scalar("oi", "string"))))
        val left = ref("baseRef", "Base")
        val right = ref("overrideRef", "Override")
        val parent =
            parentWith("Parent", resolutions = listOf(auditedResolution("creator", winning = SchemaId("nonexistent"))))
        val prior = prop("creator", left.id, Requiredness.OPTIONAL, Nullability.NULLABLE)
        val next = prop("creator", right.id, Requiredness.OPTIONAL, Nullability.NULLABLE)
        assertTrue(resolver.resolve(parent, prior, next) is IntersectionResult.Unsupported)
    }

    @Test
    fun `real adapter binds winningPropertySchemaId and the resolver elects that branch end-to-end (F4)`() {
        val template =
            """
            openapi: 3.1.0
            info: { title: AllOf override, version: 1.0.0 }
            paths: {}
            components:
              schemas:
                Base:
                  type: object
                  properties:
                    creator: { type: string }
                Override:
                  type: object
                  properties:
                    creator:
                      type: object
                      properties: { id: { type: string } }
                Combined:
                  allOf:
                    - ${'$'}ref: '#/components/schemas/Base'
                    - ${'$'}ref: '#/components/schemas/Override'
                  x-sdkgen-allof-resolution:
                    properties:
                      creator:
                        strategy: unionSupersede
                        source:
                          ref: '#/components/schemas/Override'
                          propertySchemaSha256: OVERRIDE_CREATOR_DIGEST
            """.trimIndent()
        val raw = DocumentCodec.parse(template.toByteArray())
        val source =
            template.replace(
                "OVERRIDE_CREATOR_DIGEST",
                canonicalSchemaDigest(raw.at("/components/schemas/Override/properties/creator")),
            )
        val document = adaptYaml(source)
        val combined = document.schema("Combined")
        val entry = combined.allOfPropertyResolutions.single { it.propertyName == "creator" }
        assertEquals(AllOfResolutionStrategy.UNION_SUPERSEDE, entry.strategy)
        val winningId = entry.winningPropertySchemaId

        val (baseBranch, overrideBranch) = combined.allOfBranchSchemas(document)
        val baseCreator = baseBranch.properties.single { it.name == "creator" }
        val overrideCreator = overrideBranch.properties.single { it.name == "creator" }
        assertEquals(overrideCreator.schema.schemaId, winningId, "winning id must name the override branch's creator")

        val documentResolver =
            SchemaIntersectionResolver(
                dereference = { id -> document.dereferenceSchema(id) },
                effectivelyNullable = { schemaRef -> document.chainNullable(schemaRef) },
            )
        // Strict algebra cannot intersect string ∧ object, so the bound policy must elect the override branch —
        // in both operand orders.
        listOf(baseCreator to overrideCreator, overrideCreator to baseCreator).forEach { (first, second) ->
            val result = documentResolver.resolve(combined, first, second)
            assertTrue(result is IntersectionResult.AuditedOverride, "expected audited override, got $result")
            assertEquals(
                overrideCreator.schema.schemaId,
                result.property.schema.schemaId,
                "the bound policy must elect the override branch's declaration",
            )
            assertEquals("audited-union-supersede", result.provenance.ruleId)
        }
    }

    @Test
    fun `real adapter binds an inline audited branch and the resolver elects it end-to-end (F4)`() {
        val template =
            """
            openapi: 3.1.0
            info: { title: AllOf inline override, version: 1.0.0 }
            paths: {}
            components:
              schemas:
                Base:
                  type: object
                  properties:
                    creator: { type: string }
                Combined:
                  allOf:
                    - ${'$'}ref: '#/components/schemas/Base'
                    - type: object
                      properties:
                        creator:
                          type: object
                          properties: { id: { type: string } }
                  x-sdkgen-allof-resolution:
                    properties:
                      creator:
                        strategy: unionSupersede
                        source:
                          inlineSchemaSha256: INLINE_BRANCH_DIGEST
                          propertySchemaSha256: INLINE_CREATOR_DIGEST
            """.trimIndent()
        val raw = DocumentCodec.parse(template.toByteArray())
        val source =
            template
                .replace("INLINE_BRANCH_DIGEST", canonicalSchemaDigest(raw.at("/components/schemas/Combined/allOf/1")))
                .replace(
                    "INLINE_CREATOR_DIGEST",
                    canonicalSchemaDigest(raw.at("/components/schemas/Combined/allOf/1/properties/creator")),
                )
        val document = adaptYaml(source)
        val combined = document.schema("Combined")
        val entry = combined.allOfPropertyResolutions.single { it.propertyName == "creator" }
        assertTrue(entry.branch is AllOfResolutionSource.Inline, "expected an inline branch identity")
        val winningId = entry.winningPropertySchemaId

        val (baseBranch, overrideBranch) = combined.allOfBranchSchemas(document)
        val baseCreator = baseBranch.properties.single { it.name == "creator" }
        val overrideCreator = overrideBranch.properties.single { it.name == "creator" }
        assertEquals(overrideCreator.schema.schemaId, winningId, "winning id must name the inline branch's creator")

        val documentResolver =
            SchemaIntersectionResolver(
                dereference = { id -> document.dereferenceSchema(id) },
                effectivelyNullable = { schemaRef -> document.chainNullable(schemaRef) },
            )
        val result = documentResolver.resolve(combined, baseCreator, overrideCreator)
        assertTrue(result is IntersectionResult.AuditedOverride, "expected audited override, got $result")
        assertEquals(overrideCreator.schema.schemaId, result.property.schema.schemaId)
    }

    @Test
    fun `audited winner reached through a ref alias chain binds and elects end-to-end (R4)`() {
        val template =
            """
            openapi: 3.1.0
            info: { title: AllOf alias override, version: 1.0.0 }
            paths: {}
            components:
              schemas:
                Base:
                  type: object
                  properties:
                    creator: { type: string }
                CreatorHolder:
                  type: object
                  properties:
                    creator:
                      type: object
                      properties: { id: { type: string } }
                OverrideAlias:
                  ${'$'}ref: '#/components/schemas/CreatorHolder'
                Combined:
                  allOf:
                    - ${'$'}ref: '#/components/schemas/Base'
                    - ${'$'}ref: '#/components/schemas/OverrideAlias'
                  x-sdkgen-allof-resolution:
                    properties:
                      creator:
                        strategy: unionSupersede
                        source:
                          ref: '#/components/schemas/OverrideAlias'
                          propertySchemaSha256: ALIAS_CREATOR_DIGEST
            """.trimIndent()
        val raw = DocumentCodec.parse(template.toByteArray())
        val source =
            template.replace(
                "ALIAS_CREATOR_DIGEST",
                canonicalSchemaDigest(raw.at("/components/schemas/CreatorHolder/properties/creator")),
            )
        val document = adaptYaml(source)
        val combined = document.schema("Combined")
        val entry = combined.allOfPropertyResolutions.single { it.propertyName == "creator" }
        val winningId = entry.winningPropertySchemaId

        val baseCreator = document.schema("Base").properties.single { it.name == "creator" }
        val overrideCreator = document.schema("CreatorHolder").properties.single { it.name == "creator" }
        assertEquals(overrideCreator.schema.schemaId, winningId, "winning id must name the alias chain's creator")

        val documentResolver =
            SchemaIntersectionResolver(
                dereference = { id -> document.dereferenceSchema(id) },
                effectivelyNullable = { schemaRef -> document.chainNullable(schemaRef) },
            )
        listOf(baseCreator to overrideCreator, overrideCreator to baseCreator).forEach { (first, second) ->
            val result = documentResolver.resolve(combined, first, second)
            assertTrue(result is IntersectionResult.AuditedOverride, "expected audited override, got $result")
            assertEquals(overrideCreator.schema.schemaId, result.property.schema.schemaId)
        }
    }

    @Test
    fun `audited winner declared only inside a nested allOf binds and elects end-to-end (R4)`() {
        val template =
            """
            openapi: 3.1.0
            info: { title: AllOf nested override, version: 1.0.0 }
            paths: {}
            components:
              schemas:
                Base:
                  type: object
                  properties:
                    creator: { type: string }
                CreatorPart:
                  type: object
                  properties:
                    creator:
                      type: object
                      properties: { id: { type: string } }
                Override:
                  allOf:
                    - ${'$'}ref: '#/components/schemas/CreatorPart'
                Combined:
                  allOf:
                    - ${'$'}ref: '#/components/schemas/Base'
                    - ${'$'}ref: '#/components/schemas/Override'
                  x-sdkgen-allof-resolution:
                    properties:
                      creator:
                        strategy: unionSupersede
                        source:
                          ref: '#/components/schemas/Override'
                          propertySchemaSha256: NESTED_CREATOR_DIGEST
            """.trimIndent()
        val raw = DocumentCodec.parse(template.toByteArray())
        val source =
            template.replace(
                "NESTED_CREATOR_DIGEST",
                canonicalSchemaDigest(raw.at("/components/schemas/CreatorPart/properties/creator")),
            )
        val document = adaptYaml(source)
        val combined = document.schema("Combined")
        val entry = combined.allOfPropertyResolutions.single { it.propertyName == "creator" }
        val winningId = entry.winningPropertySchemaId

        val baseCreator = document.schema("Base").properties.single { it.name == "creator" }
        // The winner declares `creator` only inside a nested allOf branch (CreatorPart), reached through
        // Override's `allOf`. Both the validation walk and the id binding must descend that nested allOf.
        val overrideCreator = document.schema("CreatorPart").properties.single { it.name == "creator" }
        assertEquals(overrideCreator.schema.schemaId, winningId, "winning id must name the nested allOf's creator")

        val documentResolver =
            SchemaIntersectionResolver(
                dereference = { id -> document.dereferenceSchema(id) },
                effectivelyNullable = { schemaRef -> document.chainNullable(schemaRef) },
            )
        listOf(baseCreator to overrideCreator, overrideCreator to baseCreator).forEach { (first, second) ->
            val result = documentResolver.resolve(combined, first, second)
            assertTrue(result is IntersectionResult.AuditedOverride, "expected audited override, got $result")
            assertEquals(overrideCreator.schema.schemaId, result.property.schema.schemaId)
        }
    }

    // endregion

    // region harness ------------------------------------------------------------------------------------

    private fun assertResolves(
        left: SchemaModel,
        right: SchemaModel,
        expected: String,
        expectedRule: String,
    ): PropertyModel {
        val forward = resolveConflict(left, right)
        val reverse = resolveConflict(right, left)
        assertTrue(forward is IntersectionResult.Resolved, "forward not resolved: $forward")
        assertTrue(reverse is IntersectionResult.Resolved, "reverse not resolved: $reverse")
        assertEquals(expected, forward.property.schema.schemaId.value, "forward winning node")
        assertEquals(expected, reverse.property.schema.schemaId.value, "reverse winning node (commutativity)")
        assertEquals(
            forward.property.nullability,
            reverse.property.nullability,
            "commutativity: nullability must match under operand swap",
        )
        assertEquals(expectedRule, forward.provenance.ruleId, "forward rule id")
        return forward.property
    }

    private fun assertUnsupported(
        left: SchemaModel,
        right: SchemaModel,
    ) {
        assertTrue(resolveConflict(left, right) is IntersectionResult.Unsupported, "forward should be unsupported")
        assertTrue(resolveConflict(right, left) is IntersectionResult.Unsupported, "reverse should be unsupported")
    }

    private fun resolveConflict(
        left: SchemaModel,
        right: SchemaModel,
    ): IntersectionResult {
        val prior = prop("v", left.id, Requiredness.OPTIONAL, propertyNullability(left))
        val next = prop("v", right.id, Requiredness.OPTIONAL, propertyNullability(right))
        return resolver.resolve(parentWith("Parent"), prior, next)
    }

    private fun propertyNullability(schema: SchemaModel): Nullability =
        if (schema.nullability == Nullability.NULLABLE) Nullability.NULLABLE else Nullability.NON_NULL

    private fun auditedResolution(
        propertyName: String,
        winning: SchemaId,
    ): AllOfPropertyResolution =
        AllOfPropertyResolution(
            propertyName = propertyName,
            strategy = AllOfResolutionStrategy.UNION_SUPERSEDE,
            branch = AllOfResolutionSource.Referenced("#/x/allOf/1"),
            propertySchemaSha256 = "0".repeat(64),
            source = source(),
            winningPropertySchemaId = winning,
        )

    private fun adaptYaml(yaml: String): SemanticDocument {
        val file = Files.createTempFile("sdkgen-resolver-", ".yaml")
        return try {
            file.writeText(yaml)
            SemanticAdapter().adapt(file).document
        } finally {
            file.deleteIfExists()
        }
    }

    private fun canonicalSchemaDigest(node: com.fasterxml.jackson.databind.JsonNode): String =
        DocumentCodec.sha256(DocumentCodec.canonicalJson(node).encodeToByteArray())

    // region builders -----------------------------------------------------------------------------------

    private fun dereference(id: SchemaId): SchemaModel {
        var current = graph[id] ?: error("missing schema $id")
        val visited = mutableSetOf<SchemaId>()
        while (current.referenceTarget != null && visited.add(current.id)) {
            current = graph[current.referenceTarget] ?: error("missing target ${current.referenceTarget}")
        }
        return current
    }

    private fun effectivelyNullable(ref: SchemaRef): Boolean {
        var current = graph[ref.schemaId] ?: error("missing schema ${ref.schemaId}")
        val visited = mutableSetOf<SchemaId>()
        while (visited.add(current.id)) {
            if (current.nullability == Nullability.NULLABLE) return true
            val target = current.referenceTarget ?: return false
            current = graph[target] ?: error("missing target $target")
        }
        return false
    }

    private fun register(schema: SchemaModel): SchemaModel {
        graph[schema.id] = schema
        return schema
    }

    private fun base(
        id: String,
        nullable: Boolean,
    ): SchemaModel =
        SchemaModel(
            id = SchemaId(id),
            identityKind = IdentityKind.INLINE,
            referenceTarget = null,
            types = emptyList(),
            format = null,
            nullability = if (nullable) Nullability.NULLABLE else Nullability.NON_NULL,
            nullabilityOrigins = emptyList(),
            description = null,
            deprecated = false,
            readOnly = false,
            writeOnly = false,
            constraints = emptyMap(),
            defaultValue = null,
            examples = emptyList(),
            enum = null,
            properties = emptyList(),
            items = null,
            additionalProperties = null,
            compositions = emptyList(),
            allOfPropertyOwnership = emptyList(),
            extensions = emptyMap(),
            source = source(),
        )

    private fun scalar(
        id: String,
        type: String,
        format: String? = null,
        nullable: Boolean = false,
        constraints: Map<String, JsonValue> = emptyMap(),
        contentEncoding: String? = null,
        contentMediaType: String? = null,
    ): SchemaModel =
        register(
            base(id, nullable).copy(
                types = listOfNotNull(type, "null".takeIf { nullable }),
                format = format,
                constraints = constraints,
                contentEncoding = contentEncoding,
                contentMediaType = contentMediaType,
            ),
        )

    private fun anySchema(
        id: String,
        nullable: Boolean = false,
    ): SchemaModel = register(base(id, nullable).copy(types = if (nullable) listOf("null") else emptyList()))

    private fun freeFormObject(
        id: String,
        nullable: Boolean = false,
    ): SchemaModel = register(base(id, nullable).copy(types = listOfNotNull("object", "null".takeIf { nullable })))

    private fun enumSchema(
        id: String,
        values: List<String>,
        nullable: Boolean = false,
    ): SchemaModel =
        register(
            base(id, nullable).copy(
                types = listOfNotNull("string", "null".takeIf { nullable }),
                enum =
                    EnumModel(
                        values = values.map { JsonValue.StringValue(it) },
                        openness = EnumOpenness.CLOSED,
                        source = source(),
                    ),
            ),
        )

    private fun numberEnumSchema(
        id: String,
        lexicalValues: List<String>,
        nullable: Boolean = false,
    ): SchemaModel =
        register(
            base(id, nullable).copy(
                types = listOfNotNull("number", "null".takeIf { nullable }),
                enum =
                    EnumModel(
                        values = lexicalValues.map { JsonValue.NumberValue(it) },
                        openness = EnumOpenness.CLOSED,
                        source = source(),
                    ),
            ),
        )

    private fun arraySchema(
        id: String,
        itemsId: String,
        nullable: Boolean = false,
    ): SchemaModel =
        register(
            base(id, nullable).copy(
                types = listOfNotNull("array", "null".takeIf { nullable }),
                items = SchemaRef(SchemaId(itemsId), source()),
            ),
        )

    private fun objectSchema(
        id: String,
        properties: Map<String, PropertyModel>,
        nullable: Boolean = false,
    ): SchemaModel =
        register(
            base(id, nullable).copy(
                types = listOfNotNull("object", "null".takeIf { nullable }),
                properties = properties.map { (name, model) -> model.copy(name = name) },
            ),
        )

    private fun unionSchema(
        id: String,
        kind: CompositionKind,
        branchIds: List<String>,
        nullable: Boolean = false,
    ): SchemaModel =
        register(
            base(id, nullable).copy(
                compositions =
                    listOf(
                        CompositionModel(
                            kind = kind,
                            branches = branchIds.map { SchemaRef(SchemaId(it), source()) },
                            discriminator = null,
                            source = source(),
                        ),
                    ),
            ),
        )

    private fun transparentAllOf(
        id: String,
        innerId: String,
        nullable: Boolean = false,
    ): SchemaModel =
        register(
            base(id, nullable).copy(
                compositions =
                    listOf(
                        CompositionModel(
                            kind = CompositionKind.ALL_OF,
                            branches = listOf(SchemaRef(SchemaId(innerId), source())),
                            discriminator = null,
                            source = source(),
                        ),
                    ),
            ),
        )

    private fun ref(
        id: String,
        targetId: String,
        nullable: Boolean = false,
    ): SchemaModel = register(base(id, nullable).copy(referenceTarget = SchemaId(targetId)))

    private fun field(schema: SchemaModel): PropertyModel =
        prop("field", schema.id, Requiredness.OPTIONAL, propertyNullability(schema))

    private fun prop(
        name: String,
        schemaId: SchemaId,
        requiredness: Requiredness,
        nullability: Nullability,
    ): PropertyModel =
        PropertyModel(
            name = name,
            schema = SchemaRef(schemaId, source()),
            requiredness = requiredness,
            nullability = nullability,
            presenceStates = listOf(PresenceState.VALUE),
            readOnly = false,
            writeOnly = false,
            description = null,
            deprecated = false,
            defaultValue = null,
            examples = emptyList(),
            extensions = emptyMap(),
            source = source(),
        )

    private fun parentWith(
        id: String,
        resolutions: List<AllOfPropertyResolution> = emptyList(),
    ): SchemaModel = base(id, nullable = false).copy(allOfPropertyResolutions = resolutions)

    private fun source(): SourcePointer = SourcePointer("openapi.yaml", "/", SourceLocation(1, 1, 0))

    // endregion
}

// region real-adapter document helpers (F4 integration fixture) -----------------------------------------

private fun SemanticDocument.schema(name: String): SchemaModel =
    schemas.values.single { it.id.value.endsWith("/components/schemas/$name") }

/** The two dereferenced `allOf` branch schemas of a two-branch composed object, in source order. */
private fun SchemaModel.allOfBranchSchemas(document: SemanticDocument): Pair<SchemaModel, SchemaModel> {
    val branches = compositions.single { it.kind == CompositionKind.ALL_OF }.branches
    return document.dereferenceSchema(branches[0].schemaId) to document.dereferenceSchema(branches[1].schemaId)
}

private fun SemanticDocument.dereferenceSchema(id: SchemaId): SchemaModel {
    var current = schemas.getValue(id)
    val visited = mutableSetOf<SchemaId>()
    while (visited.add(current.id)) {
        val target = current.referenceTarget ?: return current
        current = schemas.getValue(target)
    }
    return current
}

private fun SemanticDocument.chainNullable(ref: SchemaRef): Boolean {
    var current = schemas.getValue(ref.schemaId)
    val visited = mutableSetOf<SchemaId>()
    while (visited.add(current.id)) {
        if (current.nullability == Nullability.NULLABLE) return true
        val target = current.referenceTarget ?: return false
        current = schemas.getValue(target)
    }
    return false
}

// endregion
