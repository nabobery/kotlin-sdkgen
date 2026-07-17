@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.nabobery.sdkgen.model.AdditionalPropertiesModel
import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.DiagnosticCode
import com.nabobery.sdkgen.model.EnumOpenness
import com.nabobery.sdkgen.model.MaterialNode
import com.nabobery.sdkgen.model.Nullability
import com.nabobery.sdkgen.model.NullabilitySurface
import com.nabobery.sdkgen.model.PresenceState
import com.nabobery.sdkgen.model.Requiredness
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SnapshotRenderer
import java.lang.reflect.Modifier
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
    fun `all sixteen stress fixtures adapt into deterministic snapshots`() {
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

            if (System.getenv("UPDATE_SNAPSHOTS") == "1") {
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

    private fun adaptStress(index: Int): SemanticDocument =
        adapter.adapt(ExperimentSupport.stressFixtures[index - 1]).document
}

private fun SemanticDocument.schema(name: String): SchemaModel =
    schemas.values.single { it.id.value.endsWith("/components/schemas/$name") }

private fun com.nabobery.sdkgen.model.SchemaRef.resolve(document: SemanticDocument): SchemaModel =
    document.schemas.getValue(schemaId)

private fun List<com.nabobery.sdkgen.model.PropertyModel>.getValue(name: String) = single { it.name == name }
