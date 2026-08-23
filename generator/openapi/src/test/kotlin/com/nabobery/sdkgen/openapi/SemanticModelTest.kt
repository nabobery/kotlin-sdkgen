@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.nabobery.sdkgen.model.AdditionalPropertiesModel
import com.nabobery.sdkgen.model.AllOfResolutionSource
import com.nabobery.sdkgen.model.AllOfResolutionStrategy
import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.DiagnosticCode
import com.nabobery.sdkgen.model.EnumOpenness
import com.nabobery.sdkgen.model.IdempotencyModel
import com.nabobery.sdkgen.model.JsonPointer
import com.nabobery.sdkgen.model.MaterialNode
import com.nabobery.sdkgen.model.Nullability
import com.nabobery.sdkgen.model.NullabilitySurface
import com.nabobery.sdkgen.model.PaginationModel
import com.nabobery.sdkgen.model.PresenceState
import com.nabobery.sdkgen.model.Requiredness
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SnapshotRenderer
import com.nabobery.sdkgen.model.StreamingModel
import com.nabobery.sdkgen.openapi.overlays.DocumentCodec
import com.nabobery.sdkgen.openapi.overlays.OverlayApplicator
import com.nabobery.sdkgen.openapi.overlays.OverlayInput
import java.lang.reflect.Modifier
import java.nio.file.Files
import java.util.IdentityHashMap
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.name
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class SemanticModelTest {
    private val adapter = SemanticAdapter()

    @Test
    fun `all seventeen stress fixtures adapt into deterministic snapshots`() {
        ExperimentSupport.snapshotRoot.createDirectories()
        ExperimentSupport.stressFixtures.forEach { fixture ->
            val first = adapter.adapt(fixture)
            val second = adapter.adapt(fixture)
            val firstSnapshot = SnapshotRenderer.render(first.document)
            val secondSnapshot = SnapshotRenderer.render(second.document)
            val snapshotPath = ExperimentSupport.snapshotRoot.resolve(fixture.name.removeSuffix(".yaml") + ".txt")

            assertEquals(0, first.metrics.silentSchemaOmissions, fixture.name)
            assertEquals(0, first.metrics.silentOperationOmissions, fixture.name)
            assertEquals(firstSnapshot, secondSnapshot, "snapshot changed across two adaptations for ${fixture.name}")

            val snapshotUpdateFilter = System.getenv("SNAPSHOT_FIXTURE")
            val updatesThisFixture = snapshotUpdateFilter == null || snapshotUpdateFilter == fixture.name
            if (System.getenv("UPDATE_SNAPSHOTS") == "1" && updatesThisFixture) {
                snapshotPath.writeText(firstSnapshot)
            } else {
                assertTrue(snapshotPath.exists(), "missing snapshot $snapshotPath")
                assertEquals(snapshotPath.readText(), firstSnapshot, "snapshot mismatch for ${fixture.name}")
            }
        }
    }

    @Test
    fun `requiredness and nullability preserve all three presence contracts`() {
        val document = adaptStress(5)
        val schema = document.schema("PropertyStates")
        val properties = schema.properties.associateBy { it.name }

        assertEquals(Requiredness.REQUIRED, properties.getValue("requiredNullable").requiredness)
        assertEquals(Nullability.NULLABLE, properties.getValue("requiredNullable").nullability)
        assertEquals(
            listOf(PresenceState.NULL, PresenceState.VALUE),
            properties.getValue("requiredNullable").presenceStates,
        )
        assertEquals(Requiredness.OPTIONAL, properties.getValue("optionalNonNull").requiredness)
        assertEquals(Nullability.NON_NULL, properties.getValue("optionalNonNull").nullability)
        assertEquals(
            listOf(PresenceState.ABSENT, PresenceState.VALUE),
            properties.getValue("optionalNonNull").presenceStates,
        )
        assertEquals(Requiredness.OPTIONAL, properties.getValue("optionalNullable").requiredness)
        assertEquals(Nullability.NULLABLE, properties.getValue("optionalNullable").nullability)
        assertEquals(
            listOf(PresenceState.ABSENT, PresenceState.NULL, PresenceState.VALUE),
            properties.getValue("optionalNullable").presenceStates,
        )
    }

    @Test
    fun `legacy nullable and type array twins normalize identically with distinct provenance`() {
        val legacy =
            adapter
                .adapt(
                    ExperimentSupport.fixtureRoot.resolve("normalization/legacy-nullable.yaml"),
                ).document
                .schema("NullableName")
        val typeArray =
            adapter
                .adapt(
                    ExperimentSupport.fixtureRoot.resolve("normalization/type-array-nullable.yaml"),
                ).document
                .schema("NullableName")

        assertEquals(Nullability.NULLABLE, legacy.nullability)
        assertEquals(listOf("string"), legacy.types)
        assertEquals(
            typeArray,
            legacy.copy(
                id = typeArray.id,
                source = typeArray.source,
                nullabilityOrigins = typeArray.nullabilityOrigins,
            ),
        )
        assertEquals(listOf(NullabilitySurface.OPENAPI_3_0_NULLABLE), legacy.nullabilityOrigins.map { it.surface })
        assertEquals(listOf(NullabilitySurface.JSON_SCHEMA_TYPE_ARRAY), typeArray.nullabilityOrigins.map { it.surface })
    }

    @Test
    fun `legacy nullable anyOf branch makes the containing property nullable`() {
        val document = adapter.adapt(ExperimentSupport.openRouterFixture).document
        val stop = document.schema("ChatRequest").properties.single { it.name == "stop" }

        assertEquals(Nullability.NULLABLE, stop.nullability)
        assertEquals(
            listOf(PresenceState.ABSENT, PresenceState.NULL, PresenceState.VALUE),
            stop.presenceStates,
        )
        assertEquals(
            listOf(NullabilitySurface.NULL_COMPOSITION),
            stop.schema
                .resolve(document)
                .nullabilityOrigins
                .map { it.surface },
        )
    }

    @Test
    fun `recognized legacy nullable oneOf branch is canonicalized to a null only branch in the OpenRouter corpus`() {
        val document = adapter.adapt(ExperimentSupport.openRouterFixture).document
        val caller = document.schema("ORAnthropicNullableCaller")
        val oneOf = caller.compositions.single { it.kind == CompositionKind.ONE_OF }
        val nullBranches = oneOf.branches.map { document.schemas.getValue(it.schemaId) }.filter { it.acceptsOnlyNull }

        assertEquals(Nullability.NULLABLE, caller.nullability)
        assertEquals(1, nullBranches.size)
        // The legacy marker no longer survives as a contentless value branch that lacks an exact JSON kind.
        assertTrue(
            oneOf.branches.none { branch ->
                val schema = document.schemas.getValue(branch.schemaId)
                schema.types.isEmpty() &&
                    schema.compositions.isEmpty() &&
                    schema.properties.isEmpty() &&
                    !schema.acceptsOnlyNull
            },
        )
    }

    @Test
    fun `oneOf and multi match anyOf remain distinct ordered compositions`() {
        val oneOf = adaptStress(1).schema("Pet").compositions.single()
        val anyOf = adaptStress(3).schema("SearchResult").compositions.single()

        assertEquals(CompositionKind.ONE_OF, oneOf.kind)
        assertEquals(2, oneOf.branches.size)
        assertEquals(CompositionKind.ANY_OF, anyOf.kind)
        assertEquals(2, anyOf.branches.size)
    }

    @Test
    fun `allOf retains both property owners and conflicting constraints`() {
        val schema = adaptStress(4).schema("ImpossibleName")
        val ownership = schema.allOfPropertyOwnership.filter { it.propertyName == "name" }

        assertEquals(2, ownership.size)
        assertTrue(ownership.any { "minLength" in it.constraints })
        assertTrue(ownership.any { "maxLength" in it.constraints })
        assertEquals(2, ownership.map { it.ownerSchemaId }.distinct().size)
    }

    @Test
    fun `audited allOf resolutions bind normalize and strip the canonical extension`() {
        val template =
            """
            openapi: 3.1.0
            info: { title: AllOf resolution, version: 1.0.0 }
            paths: {}
            components:
              schemas:
                Branch:
                  type: object
                  properties:
                    part: { type: string }
                Combined:
                  allOf:
                    - ${'$'}ref: '#/components/schemas/Branch'
                    - type: object
                      properties:
                        inlinePart: { type: integer }
                  x-sdkgen-allof-resolution:
                    properties:
                      part:
                        strategy: unionSupersede
                        source:
                          ref: '#/components/schemas/Branch'
                          propertySchemaSha256: PART_DIGEST
                      inlinePart:
                        strategy: unionSupersede
                        source:
                          inlineSchemaSha256: INLINE_BRANCH_DIGEST
                          propertySchemaSha256: INLINE_PROPERTY_DIGEST
            """.trimIndent()
        val raw = DocumentCodec.parse(template.toByteArray())
        val source =
            template
                .replace("PART_DIGEST", canonicalSchemaDigest(raw.at("/components/schemas/Branch/properties/part")))
                .replace("INLINE_BRANCH_DIGEST", canonicalSchemaDigest(raw.at("/components/schemas/Combined/allOf/1")))
                .replace(
                    "INLINE_PROPERTY_DIGEST",
                    canonicalSchemaDigest(raw.at("/components/schemas/Combined/allOf/1/properties/inlinePart")),
                )
        val schema = adaptYaml(source).schema("Combined")

        assertEquals(listOf("inlinePart", "part"), schema.allOfPropertyResolutions.map { it.propertyName })
        assertEquals(AllOfResolutionStrategy.UNION_SUPERSEDE, schema.allOfPropertyResolutions.first().strategy)
        assertEquals(
            AllOfResolutionSource.Inline(
                canonicalSchemaDigest(raw.at("/components/schemas/Combined/allOf/1")),
            ),
            schema.allOfPropertyResolutions.first().branch,
        )
        assertEquals(
            AllOfResolutionSource.Referenced("#/components/schemas/Branch"),
            schema.allOfPropertyResolutions.last().branch,
        )
        assertTrue("x-sdkgen-allof-resolution" !in schema.extensions)
    }

    @Test
    fun `allOf resolution binding failures are diagnosed instead of silently dropped`() {
        val failures =
            listOf(
                """
                allOf:
                  - type: object
                    properties: { part: { type: string } }
                x-sdkgen-allof-resolution:
                  properties:
                    part:
                      strategy: unionSupersede
                      source:
                        ref: '#/components/schemas/Missing'
                        propertySchemaSha256: 0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef
                """ to "matched 0",
                """
                allOf:
                  - type: object
                    properties: { part: { type: string } }
                  - type: object
                    properties: { part: { type: string } }
                x-sdkgen-allof-resolution:
                  properties:
                    part:
                      strategy: unionSupersede
                      source:
                        inlineSchemaSha256: INLINE_DIGEST
                        propertySchemaSha256: PROPERTY_DIGEST
                """ to "matched 2",
                """
                allOf:
                  - type: object
                    properties: { other: { type: string } }
                x-sdkgen-allof-resolution:
                  properties:
                    part:
                      strategy: unionSupersede
                      source:
                        inlineSchemaSha256: INLINE_DIGEST
                        propertySchemaSha256: PROPERTY_DIGEST
                """ to "missing from the selected allOf branch",
                """
                allOf:
                  - type: object
                    properties: { part: { type: string } }
                x-sdkgen-allof-resolution:
                  properties:
                    part:
                      strategy: unionSupersede
                      source:
                        inlineSchemaSha256: INLINE_DIGEST
                        propertySchemaSha256: 0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef
                """ to "does not match the resolved schema of property",
            )
        failures.forEachIndexed { index, (body, expected) ->
            val template =
                """
                openapi: 3.1.0
                info: { title: AllOf failure $index, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Broken:
                """.trimIndent() + "\n" + body.trimIndent().prependIndent("      ")
            val raw = DocumentCodec.parse(template.toByteArray())
            val source =
                template
                    .replace("INLINE_DIGEST", canonicalSchemaDigest(raw.at("/components/schemas/Broken/allOf/0")))
                    .replace(
                        "PROPERTY_DIGEST",
                        canonicalSchemaDigest(raw.at("/components/schemas/Broken/allOf/0/properties/part")),
                    )
            val result = adaptYamlResult(source)
            assertTrue(
                result.document.diagnostics.any {
                    it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION &&
                        expected in it.message
                },
                "missing binding diagnostic for case $index: ${result.document.diagnostics}",
            )
        }
    }

    @Test
    fun `a mutated ref target keyword shadowed by a sibling still shifts the audit digest`() {
        // `$ref` siblings apply CONJUNCTIVELY in JSON Schema: the target's `maxLength` and the sibling's both
        // constrain the value. The resolved digest form must therefore keep BOTH declarations — with a
        // last-wins merge the sibling would shadow the target's keyword, and mutating the target (10 -> 12)
        // would leave the audit digest unchanged, silently defeating the fail-closed drift guarantee.
        fun spec(
            targetMaxLength: Int,
            propertyDigest: String,
        ) = """
            openapi: 3.1.0
            info: { title: Shadowed sibling, version: 1.0.0 }
            paths: {}
            components:
              schemas:
                Target:
                  type: string
                  maxLength: $targetMaxLength
                OverrideBranch:
                  type: object
                  properties:
                    part:
                      ${'$'}ref: '#/components/schemas/Target'
                      maxLength: 5
                Combined:
                  allOf:
                    - ${'$'}ref: '#/components/schemas/OverrideBranch'
                    - type: object
                      properties:
                        part: { type: string }
                  x-sdkgen-allof-resolution:
                    properties:
                      part:
                        strategy: unionSupersede
                        source:
                          ref: '#/components/schemas/OverrideBranch'
                          propertySchemaSha256: $propertyDigest
            """.trimIndent()

        val probe = adaptYamlResult(spec(10, "0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef"))
        val mismatch =
            probe.document.diagnostics
                .single { it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION && "does not match" in it.message }
        val actualDigest =
            requireNotNull(Regex("expected ([0-9a-f]{64})").find(mismatch.message)).groupValues[1]

        // The extracted digest binds cleanly against the document it was computed for...
        val bound = adaptYamlResult(spec(10, actualDigest))
        assertTrue(
            bound.document.diagnostics.none { it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION },
            "digest must bind against its own document: ${bound.document.diagnostics}",
        )
        // ...and fails closed once the SHADOWED target keyword mutates underneath the unchanged sibling.
        val drifted = adaptYamlResult(spec(12, actualDigest))
        assertTrue(
            drifted.document.diagnostics.any {
                it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION && "does not match" in it.message
            },
            "mutating the shadowed target keyword must shift the digest: ${drifted.document.diagnostics}",
        )
    }

    @Test
    fun `allOf branch reordering preserves a referenced audit binding while deleting it fails closed`() {
        val template =
            """
            openapi: 3.1.0
            info: { title: Reordered resolution, version: 1.0.0 }
            paths: {}
            components:
              schemas:
                Base:
                  type: object
                  properties:
                    part: { type: string }
                Override:
                  type: object
                  properties:
                    part: { type: object, properties: { id: { type: string } } }
                Combined:
                  allOf:
                    - ${'$'}ref: '#/components/schemas/Base'
                    - ${'$'}ref: '#/components/schemas/Override'
                  x-sdkgen-allof-resolution:
                    properties:
                      part:
                        strategy: unionSupersede
                        source:
                          ref: '#/components/schemas/Override'
                          propertySchemaSha256: PART_DIGEST
            """.trimIndent()
        val digest =
            canonicalSchemaDigest(
                DocumentCodec.parse(template.toByteArray()).at("/components/schemas/Override/properties/part"),
            )
        val bound = template.replace("PART_DIGEST", digest)
        // After trimIndent() the allOf branch lines keep their indentation; derive it from the document so the
        // manipulation matches the real lines (an unindented search silently no-ops and re-adapts the ORIGINAL
        // base-first order).
        val baseBranchLine =
            bound.lineSequence().single { line -> line.trim() == "- \$ref: '#/components/schemas/Base'" }
        val branchIndent = baseBranchLine.substringBefore("- \$ref")
        val baseFirstBranches =
            "$branchIndent- \$ref: '#/components/schemas/Base'\n$branchIndent- \$ref: '#/components/schemas/Override'"
        val overrideFirstBranches =
            "$branchIndent- \$ref: '#/components/schemas/Override'\n$branchIndent- \$ref: '#/components/schemas/Base'"
        val reordered = bound.replace(baseFirstBranches, overrideFirstBranches)
        assertTrue(reordered != bound, "reorder manipulation must genuinely swap the branches")
        val reorderedResult = adaptYamlResult(reordered)
        val reorderedCombined = reorderedResult.document.schema("Combined")
        val allOfComposition =
            reorderedCombined.compositions.single { composition -> composition.kind == CompositionKind.ALL_OF }
        // Branches are 1:1 with the raw allOf array indices (SchemaAdapter.adaptComposition), so the FIRST
        // branch's reference must now be the Override schema: textual proof the swap survived adaptation.
        assertTrue(
            allOfComposition.branches
                .first()
                .schemaId
                .value
                .endsWith("/components/schemas/Override"),
            "the reordered fixture must bind Override as the FIRST allOf branch, got " +
                allOfComposition.branches.joinToString { branch -> branch.schemaId.value },
        )
        assertTrue(
            reorderedResult.document.diagnostics.none { it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION },
            "reordering branches must preserve ref/digest binding: ${reorderedResult.document.diagnostics}",
        )
        val combined = reorderedResult.document.schema("Combined")
        assertEquals(
            AllOfResolutionSource.Referenced("#/components/schemas/Override"),
            combined.allOfPropertyResolutions.single().branch,
        )

        val deleted =
            bound.replace(
                Regex("""(?m)^\s+- \${'$'}ref: '#/components/schemas/Override'\n"""),
                "",
            )
        assertFalse(deleted.contains("- ${'$'}ref: '#/components/schemas/Override'"))
        val deletedResult = adaptYamlResult(deleted)
        assertTrue(
            deletedResult.document.diagnostics.any {
                it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION && "matched 0" in it.message
            },
            "deleting the chosen branch must fail closed: ${deletedResult.document.diagnostics}",
        )
    }

    @Test
    fun `property digests cover the resolved reference target and drift closes the audit`() {
        val base =
            """
            openapi: 3.1.0
            info: { title: Ref drift, version: 1.0.0 }
            paths: {}
            components:
              schemas:
                Payload: PAYLOAD_BODY
                Branch:
                  type: object
                  properties:
                    payload: { ${'$'}ref: '#/components/schemas/Payload' }
                Combined:
                  allOf:
                    - ${'$'}ref: '#/components/schemas/Branch'
                  x-sdkgen-allof-resolution:
                    properties:
                      payload:
                        strategy: unionSupersede
                        source:
                          ref: '#/components/schemas/Branch'
                          propertySchemaSha256: PAYLOAD_DIGEST
            """.trimIndent()
        val stringPayload = "{ type: string }"
        val objectPayload = "{ type: object, properties: { note: { type: string } } }"
        val payloadDigest =
            canonicalSchemaDigest(
                DocumentCodec
                    .parse(base.replace("PAYLOAD_BODY", stringPayload).toByteArray())
                    .at("/components/schemas/Payload"),
            )

        // The '$ref' text is identical in both documents; only the referenced target content differs.
        val matching =
            adaptYamlResult(base.replace("PAYLOAD_BODY", stringPayload).replace("PAYLOAD_DIGEST", payloadDigest))
        assertTrue(
            matching.document.diagnostics.isEmpty(),
            "unexpected diagnostics: ${matching.document.diagnostics}",
        )
        assertEquals(
            listOf("payload"),
            matching.document
                .schema("Combined")
                .allOfPropertyResolutions
                .map { it.propertyName },
        )

        val drifted =
            adaptYamlResult(base.replace("PAYLOAD_BODY", objectPayload).replace("PAYLOAD_DIGEST", payloadDigest))
        assertTrue(
            drifted.document.diagnostics.any {
                it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION &&
                    "does not match the resolved schema of property" in it.message
            },
            "expected fail-closed drift diagnostic, got: ${drifted.document.diagnostics}",
        )
        // Fail-closed: the schema carrying the drifted audit is not represented at all.
        assertTrue(
            drifted.document.schemas.values
                .none { it.id.value.endsWith("/components/schemas/Combined") },
        )
    }

    @Test
    fun `dual identity fields are rejected before value validation`() {
        val validDigest = "0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef"
        val dualFieldCases =
            listOf(
                // Valid 'ref' beside a non-textual (invalid) 'inlineSchemaSha256'.
                """
                          ref: '#/components/schemas/Branch'
                          inlineSchemaSha256: 7
                          propertySchemaSha256: $validDigest
                """,
                // Non-textual (invalid) 'ref' beside a valid 'inlineSchemaSha256'.
                """
                          ref: 7
                          inlineSchemaSha256: $validDigest
                          propertySchemaSha256: $validDigest
                """,
            )
        dualFieldCases.forEachIndexed { index, sourceBody ->
            val document =
                """
                openapi: 3.1.0
                info: { title: Dual identity $index, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Branch: { type: object, properties: { part: { type: string } } }
                    Combined:
                      allOf:
                        - ${'$'}ref: '#/components/schemas/Branch'
                      x-sdkgen-allof-resolution:
                        properties:
                          part:
                            strategy: unionSupersede
                            source:
                """.trimIndent() + sourceBody.trimEnd('\n')
            val result = adaptYamlResult(document)
            assertTrue(
                result.document.diagnostics.any {
                    it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION &&
                        "must contain exactly one of 'ref' or 'inlineSchemaSha256'" in it.message
                },
                "case $index should be rejected as a dual identity, got: ${result.document.diagnostics}",
            )
        }
    }

    @Test
    fun `referenced branch binding follows local and external alias chains`() {
        val local =
            """
            openapi: 3.1.0
            info: { title: Local alias, version: 1.0.0 }
            paths: {}
            components:
              schemas:
                Base:
                  type: object
                  properties:
                    part: { type: string }
                Alias:
                  ${'$'}ref: '#/components/schemas/Base'
                Combined:
                  allOf:
                    - ${'$'}ref: '#/components/schemas/Alias'
                  x-sdkgen-allof-resolution:
                    properties:
                      part:
                        strategy: unionSupersede
                        source:
                          ref: '#/components/schemas/Alias'
                          propertySchemaSha256: PART_DIGEST
            """.trimIndent()
        val partDigest =
            canonicalSchemaDigest(
                DocumentCodec.parse(local.toByteArray()).at("/components/schemas/Base/properties/part"),
            )
        val localResult = adaptYamlResult(local.replace("PART_DIGEST", partDigest))
        assertTrue(
            localResult.document.diagnostics.none { it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION },
            "unexpected diagnostics: ${localResult.document.diagnostics}",
        )
        assertEquals(
            AllOfResolutionSource.Referenced("#/components/schemas/Alias"),
            localResult.document
                .schema("Combined")
                .allOfPropertyResolutions
                .single()
                .branch,
        )

        val externalPart =
            canonicalSchemaDigest(
                DocumentCodec
                    .parse(
                        EXTERNAL_ALIAS_COMPONENTS.toByteArray(),
                    ).at("/components/schemas/Base/properties/part"),
            )
        val externalRoot =
            """
            openapi: 3.1.0
            info: { title: External alias, version: 1.0.0 }
            paths: {}
            components:
              schemas:
                Combined:
                  allOf:
                    - ${'$'}ref: 'components.yaml#/components/schemas/Alias'
                  x-sdkgen-allof-resolution:
                    properties:
                      part:
                        strategy: unionSupersede
                        source:
                          ref: 'components.yaml#/components/schemas/Alias'
                          propertySchemaSha256: $externalPart
            """.trimIndent()
        val externalResult =
            adaptFiles(
                root = "root.yaml",
                files = mapOf("root.yaml" to externalRoot, "components.yaml" to EXTERNAL_ALIAS_COMPONENTS),
            )
        assertTrue(
            externalResult.document.diagnostics.none { it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION },
            "unexpected diagnostics: ${externalResult.document.diagnostics}",
        )
        assertEquals(
            AllOfResolutionSource.Referenced("components.yaml#/components/schemas/Alias"),
            externalResult.document
                .schema("Combined")
                .allOfPropertyResolutions
                .single()
                .branch,
        )
    }

    @Test
    fun `misplaced schema extensions are diagnosed on the zero-overlay path while valid nested placements survive`() {
        val misplacedOnOperation =
            """
            openapi: 3.1.0
            info: { title: Misplaced, version: 1.0.0 }
            paths:
              /items:
                get:
                  x-sdkgen-allof-resolution:
                    properties: {}
                  responses: { '200': { description: ok } }
            components: {}
            """.trimIndent()
        assertTrue(
            adaptYamlResult(misplacedOnOperation).document.diagnostics.any {
                it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION &&
                    "is only allowed as a direct property of a Schema Object with allOf" in it.message
            },
            "raw-source schema extension on an operation must be diagnosed, not silently dropped",
        )

        val operationWithEmptyAllOf =
            """
            openapi: 3.1.0
            info: { title: Operation allOf, version: 1.0.0 }
            paths:
              /items:
                get:
                  allOf: []
                  x-sdkgen-allof-resolution:
                    properties: {}
                  responses: { '200': { description: ok } }
            components: {}
            """.trimIndent()
        assertTrue(
            adaptYamlResult(operationWithEmptyAllOf).document.diagnostics.any {
                it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION &&
                    "is only allowed as a direct property of a Schema Object with allOf" in it.message
            },
            "an Operation Object with a bare 'allOf: []' must not masquerade as a Schema Object",
        )

        val validNested =
            """
            openapi: 3.1.0
            info: { title: Valid nested, version: 1.0.0 }
            paths:
              /items:
                post:
                  requestBody:
                    content:
                      application/json:
                        schema:
                          allOf:
                            - ${'$'}ref: '#/components/schemas/Branch'
                          x-sdkgen-allof-resolution:
                            properties:
                              part:
                                strategy: unionSupersede
                                source:
                                  ref: '#/components/schemas/Branch'
                                  propertySchemaSha256: PART_DIGEST
                  responses: { '200': { description: ok } }
            components:
              schemas:
                Branch:
                  type: object
                  properties:
                    part: { type: string }
                Nested:
                  type: object
                  properties:
                    combined:
                      allOf:
                        - ${'$'}ref: '#/components/schemas/Branch'
                      x-sdkgen-allof-resolution:
                        properties:
                          part:
                            strategy: unionSupersede
                            source:
                              ref: '#/components/schemas/Branch'
                              propertySchemaSha256: PART_DIGEST
            """.trimIndent()
        val partDigest =
            canonicalSchemaDigest(
                DocumentCodec.parse(validNested.toByteArray()).at("/components/schemas/Branch/properties/part"),
            )
        val nestedResult = adaptYamlResult(validNested.replace("PART_DIGEST", partDigest))
        assertTrue(
            nestedResult.document.diagnostics.none { it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION },
            "nested component and media-type schema placements must remain valid: ${nestedResult.document.diagnostics}",
        )
    }

    @Test
    fun `recursive graph terminates as a cycle over stable ids`() {
        val document = adaptStress(9)
        val parent = document.schema("Parent")
        val child = document.schema("Child")
        val childBranch =
            parent.properties
                .getValue("child")
                .schema
                .resolve(document)
                .compositions
                .single { it.kind == CompositionKind.ONE_OF }
                .branches
                .single { it.schemaId == child.id }
        val parentBranch =
            child.properties
                .getValue("parent")
                .schema
                .resolve(document)
                .compositions
                .single { it.kind == CompositionKind.ONE_OF }
                .branches
                .single { it.schemaId == parent.id }

        assertEquals(child.id, childBranch.schemaId)
        assertEquals(parent.id, parentBranch.schemaId)
        assertTrue(document.schemas.size < 20, "recursive adaptation expanded without bound")
    }

    @Test
    fun `incomplete discriminator mapping remains explicit`() {
        val animal = adaptStress(11).schema("Animal")
        val discriminator = assertNotNull(animal.compositions.single().discriminator)

        assertEquals("kind", discriminator.propertyName)
        assertEquals(setOf("cat"), discriminator.mapping.keys)
        assertEquals(1, discriminator.unmappedBranches.size)
        assertTrue(
            discriminator.unmappedBranches
                .single()
                .value
                .endsWith("/Dog"),
        )
    }

    @Test
    fun `enums objects streaming multipart and response metadata retain their shapes`() {
        val openEnum = adaptStress(6).schema("DeliveryState").enum
        assertEquals(EnumOpenness.OPEN, openEnum?.openness)

        val typed = adaptStress(7).schema("ScoresByModel").additionalProperties
        assertIs<AdditionalPropertiesModel.Typed>(typed)
        val freeForm = adaptStress(8).schema("Metadata").additionalProperties
        assertIs<AdditionalPropertiesModel.FreeForm>(freeForm)

        val sse = adaptStress(12).operations.single()
        assertTrue(
            sse.responses
                .single()
                .content
                .single()
                .streaming,
        )

        val multipart =
            adaptStress(13)
                .operations
                .single()
                .requestBody!!
                .content
                .single()
        assertEquals("multipart/form-data", multipart.mediaType)
        assertEquals(listOf("file", "metadata"), multipart.encoding.map { it.partName })
        assertEquals(listOf("application/octet-stream", "application/json"), multipart.encoding.map { it.contentType })

        val download = adaptStress(15).operations.single()
        assertEquals(listOf("200", "404"), download.responses.map { it.selector })
        assertEquals(listOf("ETag", "X-Request-Id"), download.responses.flatMap { it.headers }.map { it.name })
    }

    @Test
    fun `streaming and pagination stress fixtures carry canonical typed metadata`() {
        val streaming = assertIs<StreamingModel.Sse>(adaptStress(12).operations.single().streaming)
        val pagination = assertIs<PaginationModel.Cursor>(adaptStress(14).operations.single().pagination)

        assertEquals("stream", streaming.requestFlag)
        assertEquals("[DONE]", streaming.sentinel)
        assertEquals("cursor", pagination.requestCursor)
        assertEquals("limit", pagination.requestLimit)
        assertEquals(listOf("data"), pagination.responseItems.segments)
        assertEquals(listOf("nextCursor"), pagination.responseNextCursor.segments)
    }

    @Test
    fun `canonical operation extensions adapt to typed metadata and preserve unrelated extensions`() {
        val document =
            adaptYaml(
                """
                openapi: 3.1.0
                info: { title: Extensions, version: 1.0.0 }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-unrelated: keep-me
                      x-sdkgen-pagination:
                        style: cursor
                        requestCursor: cursor
                        requestLimit: limit
                        responseItems: /data
                        responseNextCursor: /nextCursor
                      x-sdkgen-streaming:
                        mode: sse
                        requestFlag: stream
                        responseContentType: text/event-stream
                        sentinel: '[DONE]'
                      x-sdkgen-idempotency:
                        keyHeader: Idempotency-Key
                        clientGenerated: true
                      responses:
                        '200': { description: ok }
                """.trimIndent(),
            )
        val operation = document.operations.single()

        assertEquals(
            PaginationModel.Cursor(
                requestCursor = "cursor",
                requestLimit = "limit",
                responseItems = JsonPointer("/data"),
                responseNextCursor = JsonPointer("/nextCursor"),
            ),
            operation.pagination,
        )
        assertEquals(
            StreamingModel.Sse("stream", "text/event-stream", "[DONE]"),
            operation.streaming,
        )
        assertEquals(IdempotencyModel("Idempotency-Key", true), operation.idempotency)
        assertEquals(setOf("x-unrelated"), operation.extensions.keys)
    }

    @Test
    fun `headerNextUrl pagination adapts to typed metadata without cursor fields`() {
        val document =
            adaptYaml(
                """
                openapi: 3.1.0
                info: { title: Header pagination, version: 1.0.0 }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: headerNextUrl
                        responseItems: /items
                      responses:
                        '200': { description: ok }
                """.trimIndent(),
            )
        val operation = document.operations.single()

        assertEquals(
            PaginationModel.HeaderNextUrl(responseItems = JsonPointer("/items")),
            operation.pagination,
        )
    }

    @Test
    fun `headerNextUrl pagination rejects cursor-only fields`() {
        val result =
            adaptYamlResult(
                """
                openapi: 3.1.0
                info: { title: Header pagination, version: 1.0.0 }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: headerNextUrl
                        responseItems: /items
                        requestCursor: cursor
                      responses:
                        '200': { description: ok }
                """.trimIndent(),
            )

        val diagnostic = result.document.diagnostics.single { it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION }
        assertEquals(
            "/paths/~1items/get/x-sdkgen-pagination/requestCursor",
            diagnostic.source.jsonPointer,
        )
    }

    @Test
    fun `offsetLimit pagination adapts to typed metadata with optional responseTotal`() {
        val document =
            adaptYaml(
                """
                openapi: 3.1.0
                info: { title: Offset pagination, version: 1.0.0 }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /data
                        responseTotal: /total
                      responses:
                        '200': { description: ok }
                """.trimIndent(),
            )
        val operation = document.operations.single()

        assertEquals(
            PaginationModel.OffsetLimit(
                requestOffset = "offset",
                requestLimit = "limit",
                responseItems = JsonPointer("/data"),
                responseTotal = JsonPointer("/total"),
            ),
            operation.pagination,
        )
    }

    @Test
    fun `offsetLimit pagination adapts without responseTotal to a null pointer`() {
        val document =
            adaptYaml(
                """
                openapi: 3.1.0
                info: { title: Offset pagination, version: 1.0.0 }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /data
                      responses:
                        '200': { description: ok }
                """.trimIndent(),
            )
        val operation = document.operations.single()

        assertEquals(
            PaginationModel.OffsetLimit(
                requestOffset = "offset",
                requestLimit = "limit",
                responseItems = JsonPointer("/data"),
                responseTotal = null,
            ),
            operation.pagination,
        )
    }

    @Test
    fun `offsetLimit pagination reports a helpful failure when requestOffset is missing`() {
        val result =
            adaptYamlResult(
                """
                openapi: 3.1.0
                info: { title: Offset pagination, version: 1.0.0 }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestLimit: limit
                        responseItems: /data
                      responses:
                        '200': { description: ok }
                """.trimIndent(),
            )

        val diagnostic = result.document.diagnostics.single { it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION }
        assertEquals(
            "/paths/~1items/get/x-sdkgen-pagination/requestOffset",
            diagnostic.source.jsonPointer,
        )
    }

    @Test
    fun `overlay canonical extensions adapt end to end`() {
        val source =
            """
            openapi: 3.1.0
            info: { title: Overlay extensions, version: 1.0.0 }
            paths:
              /items:
                get:
                  operationId: listItems
                  responses:
                    '200': { description: ok }
            """.trimIndent().toByteArray()
        val overlay =
            OverlayInput(
                identity = "extensions",
                content =
                    """
                    overlay: 1.1.0
                    info: { title: extensions, version: 1.0.0 }
                    actions:
                      - target: "${'$'}['paths']['/items']['get']"
                        update:
                          x-sdkgen-pagination:
                            style: cursor
                            requestCursor: cursor
                            responseItems: /data~1items
                            responseNextCursor: /next~0cursor
                    """.trimIndent().toByteArray(),
            )
        val applied = OverlayApplicator().apply(source, listOf(overlay))
        val document = adaptYaml(DocumentCodec.prettyJson(applied.document))
        val pagination = assertIs<PaginationModel.Cursor>(document.operations.single().pagination)

        assertEquals(listOf("data/items"), pagination.responseItems.segments)
        assertEquals(listOf("next~cursor"), pagination.responseNextCursor.segments)
        assertTrue(document.diagnostics.none { it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION })
    }

    @Test
    fun `direct source rejects canonical extensions outside operation objects with exact diagnostics`() {
        val result =
            adaptYamlResult(
                """
                openapi: 3.1.0
                info: { title: Misplaced extensions, version: 1.0.0 }
                x-sdkgen-streaming: { mode: sse, responseContentType: text/event-stream }
                paths:
                  /items:
                    x-sdkgen-pagination:
                      style: cursor
                      requestCursor: cursor
                      responseItems: /data
                      responseNextCursor: /next
                    get:
                      operationId: listItems
                      x-sdkgen-other: keep-me
                      parameters:
                        - name: cursor
                          in: query
                          schema: { type: string }
                          x-sdkgen-idempotency: { keyHeader: Idempotency-Key, clientGenerated: true }
                      responses:
                        '200':
                          description: ok
                          x-sdkgen-streaming: { mode: sse, responseContentType: text/event-stream }
                components:
                  schemas:
                    Item:
                      type: object
                      x-sdkgen-pagination:
                        style: cursor
                        requestCursor: cursor
                        responseItems: /data
                        responseNextCursor: /next
                """.trimIndent(),
            )
        val diagnostics = result.document.diagnostics.filter { it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION }

        assertEquals(
            listOf(
                "/x-sdkgen-streaming",
                "/paths/~1items/x-sdkgen-pagination",
                "/paths/~1items/get/parameters/0/x-sdkgen-idempotency",
                "/paths/~1items/get/responses/200/x-sdkgen-streaming",
                "/components/schemas/Item/x-sdkgen-pagination",
            ).sorted(),
            diagnostics.map { it.source.jsonPointer }.sorted(),
        )
        diagnostics.forEach { diagnostic ->
            assertTrue(diagnostic.source.location.line > 0)
            assertTrue(diagnostic.message.contains("direct property of an OpenAPI Operation Object"))
        }
        val operation = result.document.operations.single()
        assertEquals(setOf("x-sdkgen-other"), operation.extensions.keys)
        assertTrue("x-sdkgen-streaming" !in operation.responses.single().extensions)
        assertTrue("x-sdkgen-idempotency" !in operation.parameters.single().extensions)
    }

    @Test
    fun `malformed canonical operation extension emits source linked typed diagnostic`() {
        val result =
            adaptYamlResult(
                """
                openapi: 3.1.0
                info: { title: Invalid extension, version: 1.0.0 }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: cursor
                        requestCursor: cursor
                        responseItems: data
                        responseNextCursor: /nextCursor
                      responses:
                        '200': { description: ok }
                """.trimIndent(),
            )
        val document = result.document
        val diagnostic = document.diagnostics.single { it.code == DiagnosticCode.INVALID_CANONICAL_EXTENSION }

        assertEquals(0, result.metrics.silentOperationOmissions)
        assertTrue(document.operations.isEmpty())
        assertEquals("/paths/~1items/get/x-sdkgen-pagination/responseItems", diagnostic.source.jsonPointer)
        assertTrue(diagnostic.source.location.line > 0)
        assertTrue(diagnostic.message.contains("JSON Pointer"))
    }

    @Test
    fun `vendor extensions defaults examples security and closed enum survive adaptation`() {
        val document = adapter.adapt(ExperimentSupport.fixtureRoot.resolve("source-map/root.yaml")).document
        val shared = document.schema("Shared")
        val closed = document.schema("ClosedState")

        assertTrue("x-sdkgen-schema" in shared.extensions)
        assertNotNull(shared.properties.single().defaultValue)
        assertEquals(
            2,
            shared.properties
                .single()
                .examples.size,
        )
        assertEquals(EnumOpenness.CLOSED, closed.enum?.openness)
        assertEquals(2, document.securityAlternatives.size)
        assertFalse(document.securityAlternatives.first().anonymous)
        assertTrue(document.securityAlternatives.last().anonymous)
        assertTrue("x-sdkgen-operation" in document.operations.single().extensions)
    }

    @Test
    fun `every material semantic node has a non synthetic source location`() {
        val documents =
            ExperimentSupport.stressFixtures.map { adapter.adapt(it).document } +
                adapter.adapt(ExperimentSupport.fixtureRoot.resolve("source-map/root.yaml")).document

        documents.forEach(::assertEveryMaterialNodeHasSource)
    }

    private fun assertEveryMaterialNodeHasSource(root: SemanticDocument) {
        val seen = IdentityHashMap<Any, Boolean>()

        fun visit(value: Any?) {
            if (value == null || seen.put(value, true) != null) return
            when (value) {
                is MaterialNode -> {
                    assertTrue(value.source.documentUri.startsWith("sdkgen://source/"))
                    assertTrue(value.source.location.line > 0)
                    assertTrue(value.source.location.column > 0)
                    assertTrue(value.source.location.byteOffset >= 0)
                }

                is Map<*, *> -> {
                    value.forEach { (key, item) ->
                        visit(key)
                        visit(item)
                    }
                }

                is Iterable<*> -> {
                    value.forEach(::visit)
                }
            }
            if (value.javaClass.name.startsWith("com.nabobery.sdkgen.model.")) {
                value.javaClass.declaredFields
                    .filterNot { Modifier.isStatic(it.modifiers) || it.isSynthetic }
                    .forEach { field ->
                        field.trySetAccessible()
                        visit(field.get(value))
                    }
            }
        }
        visit(root)
    }

    @Test
    fun `oneOf with exactly one null-accepting branch is nullable`() {
        val document =
            adapter
                .adapt(ExperimentSupport.fixtureRoot.resolve("normalization/oneof-null-single-branch.yaml"))
                .document
        val schema = document.schema("NullableChoice")

        assertEquals(Nullability.NULLABLE, schema.nullability)
        assertEquals(listOf(NullabilitySurface.NULL_COMPOSITION), schema.nullabilityOrigins.map { it.surface })
        assertTrue(document.diagnostics.none { it.code == DiagnosticCode.ONE_OF_NULL_AMBIGUOUS })
    }

    @Test
    fun `oneOf with two explicit null branches is not nullable and is diagnosed as ambiguous`() {
        val result =
            adapter.adapt(ExperimentSupport.fixtureRoot.resolve("normalization/oneof-null-duplicate-branches.yaml"))
        val schema = result.document.schema("AmbiguousNull")

        assertEquals(Nullability.NON_NULL, schema.nullability)
        assertTrue(schema.nullabilityOrigins.isEmpty())
        assertTrue(result.document.diagnostics.any { it.code == DiagnosticCode.ONE_OF_NULL_AMBIGUOUS })
    }

    @Test
    fun `oneOf with a null branch plus an unconstrained branch is not nullable and is diagnosed as ambiguous`() {
        val result =
            adapter.adapt(
                ExperimentSupport.fixtureRoot.resolve("normalization/oneof-null-unconstrained-branch.yaml"),
            )
        val schema = result.document.schema("AmbiguousNullWithUnconstrained")

        assertEquals(Nullability.NON_NULL, schema.nullability)
        assertTrue(schema.nullabilityOrigins.isEmpty())
        assertTrue(result.document.diagnostics.any { it.code == DiagnosticCode.ONE_OF_NULL_AMBIGUOUS })
    }

    @Test
    fun `operation tags preserve declared order`() {
        val document =
            adaptYaml(
                """
                openapi: 3.1.0
                info: { title: Tags, version: "1" }
                paths:
                  /tagged:
                    get:
                      operationId: tagged
                      tags: [first tag, second-tag, ThirdTag]
                      responses: { '204': { description: ok } }
                """.trimIndent(),
            )

        assertEquals(listOf("first tag", "second-tag", "ThirdTag"), document.operations.single().tags)
    }

    @Test
    fun `parameter serialization forms report actionable adaptation diagnostics`() {
        val result =
            adaptYamlResult(
                """
                openapi: 3.1.0
                info: { title: Parameters, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      parameters:
                        - { name: matrix, in: query, style: matrix, schema: { type: string } }
                        - { name: filter, in: query, style: deepObject, explode: true, schema: { type: array, items: { type: string } } }
                        - { name: nullable_filter, in: query, style: deepObject, explode: true, schema: { type: [array, "null"], items: { type: string } } }
                        - { name: created, in: query, style: deepObject, explode: true, schema: { type: string } }
                        - { name: created_union, in: query, style: deepObject, explode: true, schema: { anyOf: [{ type: object }, { type: integer }] } }
                        - { name: encoded, in: query, content: { application/json: { schema: { type: string } } } }
                      responses: { '204': { description: ok } }
                """.trimIndent(),
            )

        assertEquals(
            setOf(
                DiagnosticCode.UNSUPPORTED_PARAMETER_STYLE,
                DiagnosticCode.NON_STANDARD_PARAMETER_SERIALIZATION_EXTENSION,
                DiagnosticCode.UNSUPPORTED_PARAMETER_CONTENT_SERIALIZATION,
            ),
            result.document.diagnostics
                .map { it.code }
                .toSet(),
        )
        assertEquals(
            4,
            result.document.diagnostics.count {
                it.code == DiagnosticCode.NON_STANDARD_PARAMETER_SERIALIZATION_EXTENSION
            },
        )
    }

    @Test
    fun `deepObject compatibility diagnostics match the projection serialization matrix`() {
        val result =
            adaptYamlResult(
                """
                openapi: 3.1.0
                info: { title: Parameter matrix, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      parameters:
                        - { name: query_array, in: query, style: deepObject, explode: true, schema: { type: array, items: { type: string } } }
                        - { name: query_scalar, in: query, style: deepObject, explode: true, schema: { type: string } }
                        - { name: query_union_scalar, in: query, style: deepObject, explode: true, schema: { anyOf: [{ type: object }, { type: integer }] } }
                        - { name: header_scalar, in: header, style: deepObject, explode: true, schema: { type: string } }
                        - { name: query_not_exploded, in: query, style: deepObject, explode: false, schema: { type: string } }
                        - { name: union_primitive_array, in: query, style: deepObject, explode: true, schema: { anyOf: [{ type: object }, { type: array, items: { type: string } }] } }
                        - { name: union_object_array, in: query, style: deepObject, explode: true, schema: { anyOf: [{ type: object }, { type: array, items: { type: object } }] } }
                        - { name: mixed_anyof_allof, in: query, style: deepObject, explode: true, schema: { anyOf: [{ type: object }, { type: string }], allOf: [{ type: object }] } }
                        - { name: mixed_anyof_oneof, in: query, style: deepObject, explode: true, schema: { anyOf: [{ type: object }, { type: string }], oneOf: [{ type: object }] } }
                      responses: { '204': { description: ok } }
                """.trimIndent(),
            )

        val diagnosticsByParameter =
            result.document.diagnostics.associate { diagnostic ->
                diagnostic.message.substringAfter("Parameter '").substringBefore("'") to diagnostic.code
            }

        assertEquals(
            mapOf(
                "query_array" to DiagnosticCode.NON_STANDARD_PARAMETER_SERIALIZATION_EXTENSION,
                "query_scalar" to DiagnosticCode.NON_STANDARD_PARAMETER_SERIALIZATION_EXTENSION,
                "query_union_scalar" to DiagnosticCode.NON_STANDARD_PARAMETER_SERIALIZATION_EXTENSION,
                "header_scalar" to DiagnosticCode.UNSUPPORTED_PARAMETER_STYLE,
                "query_not_exploded" to DiagnosticCode.UNSUPPORTED_PARAMETER_STYLE,
                "union_primitive_array" to DiagnosticCode.UNSUPPORTED_PARAMETER_STYLE_SCHEMA_KIND,
                "union_object_array" to DiagnosticCode.UNSUPPORTED_PARAMETER_STYLE_SCHEMA_KIND,
                "mixed_anyof_oneof" to DiagnosticCode.UNSUPPORTED_PARAMETER_STYLE_SCHEMA_KIND,
            ),
            diagnosticsByParameter,
        )
        assertFalse(
            result.document.diagnostics.any { diagnostic ->
                diagnostic.code == DiagnosticCode.NON_STANDARD_PARAMETER_SERIALIZATION_EXTENSION &&
                    diagnostic.message.contains("Parameter 'mixed_anyof_allof'")
            },
        )
    }

    @Test
    fun `form Encoding Object semantics and source remain explicit`() {
        val form =
            adaptYaml(
                """
                openapi: 3.1.0
                info: { title: Form, version: "1" }
                paths:
                  /forms:
                    post:
                      operationId: createForm
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              properties:
                                details:
                                  type: object
                                  properties:
                                    note: { type: string }
                            encoding:
                              details:
                                style: deepObject
                                explode: true
                                allowReserved: false
                      responses: { '204': { description: ok } }
                """.trimIndent(),
            ).operations.single().requestBody!!.content.single()
        val encoding = form.encoding.single()

        assertEquals("details", encoding.partName)
        assertEquals("deepObject", encoding.style)
        assertEquals(true, encoding.explode)
        assertEquals(false, encoding.allowReserved)
        assertEquals(
            "/paths/~1forms/post/requestBody/content/application~1x-www-form-urlencoded/encoding/details",
            encoding.source.jsonPointer,
        )
    }

    private fun adaptStress(index: Int): SemanticDocument =
        adapter.adapt(ExperimentSupport.stressFixtures[index - 1]).document

    private fun adaptYaml(yaml: String): SemanticDocument = adaptYamlResult(yaml).document

    private fun adaptYamlResult(yaml: String): AdaptationResult {
        val source = Files.createTempFile("sdkgen-extension-", ".yaml")
        return try {
            source.writeText(yaml)
            adapter.adapt(source)
        } finally {
            Files.deleteIfExists(source)
        }
    }

    private fun adaptFiles(
        root: String,
        files: Map<String, String>,
    ): AdaptationResult {
        val directory = Files.createTempDirectory("sdkgen-multi-")
        return try {
            files.forEach { (name, content) -> directory.resolve(name).writeText(content) }
            adapter.adapt(directory.resolve(root))
        } finally {
            directory.toFile().deleteRecursively()
        }
    }
}

private val EXTERNAL_ALIAS_COMPONENTS =
    """
    components:
      schemas:
        Base:
          type: object
          properties:
            part: { type: string }
        Alias:
          ${'$'}ref: '#/components/schemas/Base'
    """.trimIndent()

private fun SemanticDocument.schema(name: String): SchemaModel =
    schemas.values.single { it.id.value.endsWith("/components/schemas/$name") }

private fun com.nabobery.sdkgen.model.SchemaRef.resolve(document: SemanticDocument): SchemaModel =
    document.schemas.getValue(schemaId)

private fun List<com.nabobery.sdkgen.model.PropertyModel>.getValue(name: String) = single { it.name == name }

private fun canonicalSchemaDigest(node: com.fasterxml.jackson.databind.JsonNode): String =
    DocumentCodec.sha256(DocumentCodec.canonicalJson(node).encodeToByteArray())
