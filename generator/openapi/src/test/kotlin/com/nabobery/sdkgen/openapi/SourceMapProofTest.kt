@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.nabobery.sdkgen.model.AcquisitionPolicy
import com.nabobery.sdkgen.model.DiagnosticCode
import com.nabobery.sdkgen.model.MaterialNode
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SnapshotRenderer
import kotlin.io.path.copyTo
import kotlin.io.path.createDirectories
import kotlin.io.path.createTempDirectory
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class SourceMapProofTest {
    private val adapter = SemanticAdapter()
    private val rootFixture = ExperimentSupport.fixtureRoot.resolve("source-map/root.yaml")

    @Test
    fun `component referenced twice shares identity and retains target location`() {
        val result = adapter.adapt(rootFixture)
        val document = result.document
        val holder = document.schema("Holder")
        val first = holder.properties.single { it.name == "first" }
        val second = holder.properties.single { it.name == "second" }
        val target = document.schemas.getValue(first.schema.schemaId)

        assertEquals(first.schema.schemaId, second.schema.schemaId)
        assertTrue(result.metrics.resolvedSharedIdentityTargets > 0)
        assertNotEquals(first.source.jsonPointer, second.source.jsonPointer)
        assertTrue(target.source.jsonPointer.endsWith("/components/schemas/Shared"))
        assertValid(target)
    }

    @Test
    fun `external ref target has its own canonical uri and exact source location`() {
        val document = adapter.adapt(rootFixture).document
        val externalRef =
            document
                .schema("Holder")
                .properties
                .single { it.name == "external" }
                .schema
        val external = document.schemas.getValue(externalRef.schemaId)
        val externalId = external.properties.single { it.name == "externalId" }

        assertEquals("sdkgen://source/external.yaml", external.source.documentUri)
        assertEquals("/components/schemas/ExternalThing", external.source.jsonPointer)
        assertTrue(externalId.source.location.line >= 7)
        assertValid(external)
        assertValid(externalId)
    }

    @Test
    fun `source identities record digest length policy and external documents`() {
        val identities = adapter.adapt(rootFixture).document.sourceDocuments

        assertEquals(
            listOf("sdkgen://source/external.yaml", "sdkgen://source/root.yaml"),
            identities.map { it.canonicalUri },
        )
        identities.forEach { identity ->
            assertTrue(identity.sha256.matches(Regex("[0-9a-f]{64}")))
            assertTrue(identity.contentLength > 0)
            assertEquals(AcquisitionPolicy.LOCAL_FILE, identity.acquisitionPolicy)
            assertValid(identity)
        }
    }

    @Test
    fun `node reached inside recursive cycle retains pointer and location`() {
        val document = adapter.adapt(rootFixture).document
        val recursiveA = document.schema("RecursiveA")
        val recursiveB = document.schema("RecursiveB")
        val bReference = recursiveA.properties.single { it.name == "b" }
        val aReference = recursiveB.properties.single { it.name == "a" }

        assertEquals(recursiveB.id, bReference.schema.schemaId)
        assertEquals(recursiveA.id, aReference.schema.schemaId)
        assertTrue(aReference.source.jsonPointer.endsWith("/RecursiveB/properties/a"))
        assertValid(aReference)
    }

    @Test
    fun `invalid reference diagnostic points to the ref scalar line`() {
        val result = adapter.adapt(ExperimentSupport.fixtureRoot.resolve("source-map/invalid.yaml"))
        val diagnostic = result.document.diagnostics.single { it.code == DiagnosticCode.UNRESOLVED_REFERENCE }

        assertEquals("/components/schemas/Broken/properties/missing/\$ref", diagnostic.source.jsonPointer)
        assertEquals(12, diagnostic.source.location.line)
        assertTrue(diagnostic.source.location.column > 0)
        assertTrue(diagnostic.source.location.byteOffset > 0)
        assertEquals(0, result.metrics.silentSchemaOmissions)
    }

    @Test
    fun `json tokenizer indexes nested nodes with byte offsets`() {
        val source = SourceMapIndexer.index(ExperimentSupport.fixtureRoot.resolve("source-map/location.json"))
        val location = source.locations.getValue("/components/schemas/JsonThing/properties/name")

        assertEquals(10, location.line)
        assertTrue(location.column > 0)
        assertTrue(location.byteOffset > 0)
    }

    @Test
    fun `source map proof exports deterministic evidence`() {
        val document = adapter.adapt(rootFixture).document
        val holder = document.schema("Holder")
        val first = holder.properties.single { it.name == "first" }
        val second = holder.properties.single { it.name == "second" }
        val shared = document.schemas.getValue(first.schema.schemaId)
        val external =
            document.schemas.getValue(
                holder.properties
                    .single { it.name == "external" }
                    .schema.schemaId,
            )
        val recursive = document.schema("RecursiveB").properties.single { it.name == "a" }
        val invalid =
            adapter
                .adapt(ExperimentSupport.fixtureRoot.resolve("source-map/invalid.yaml"))
                .document.diagnostics
                .single { it.code == DiagnosticCode.UNRESOLVED_REFERENCE }

        ExperimentSupport.resultRoot.createDirectories()
        ExperimentSupport.resultRoot.resolve("source-map-proof.txt").writeText(
            buildString {
                appendLine("shared_target=${shared.source.render()}")
                appendLine("shared_first_occurrence=${first.source.render()}")
                appendLine("shared_second_occurrence=${second.source.render()}")
                appendLine("external_target=${external.source.render()}")
                appendLine("recursive_cycle_node=${recursive.source.render()}")
                appendLine("invalid_diagnostic=${invalid.source.render()}")
            },
        )
    }

    @Test
    fun `canonical source uris make snapshots byte identical after relocation`() {
        val relocated = createTempDirectory("semantic-model-relocation")
        rootFixture.copyTo(relocated.resolve("root.yaml"))
        ExperimentSupport.fixtureRoot
            .resolve("source-map/external.yaml")
            .copyTo(relocated.resolve("external.yaml"))

        val original = SnapshotRenderer.render(adapter.adapt(rootFixture).document)
        val copied = SnapshotRenderer.render(adapter.adapt(relocated.resolve("root.yaml")).document)

        assertEquals(original, copied)
    }

    private fun assertValid(node: MaterialNode) {
        assertTrue(node.source.documentUri.startsWith("sdkgen://source/"))
        assertTrue(node.source.location.line > 0)
        assertTrue(node.source.location.column > 0)
        assertTrue(node.source.location.byteOffset >= 0)
    }
}

private fun SemanticDocument.schema(name: String): SchemaModel =
    schemas.values.single { it.id.value.endsWith("/components/schemas/$name") }

private fun com.nabobery.sdkgen.model.SourcePointer.render(): String =
    "$documentUri#$jsonPointer:${location.line}:${location.column}:${location.byteOffset}"
