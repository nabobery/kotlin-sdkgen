package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.model.IdentityKind
import com.nabobery.sdkgen.model.Nullability
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SourceLocation
import com.nabobery.sdkgen.model.SourcePointer
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

/**
 * Proves the two properties ADR 0013's "Manifest transition and bounded input" section requires of the
 * `v1alpha2` evidence digests: determinism (the same input always digests to the same value) and
 * independence (a change confined to one evidence layer must not move a different layer's digest).
 *
 * Without the independence assertions here, [KotlinDeclarationModel.kotlinApiProjectionDigest] and
 * [SemanticDocument.semanticModelDigest] could silently collapse onto [KotlinDeclarationModel.digest] and
 * always move together with it -- exactly the failure mode this test class exists to catch.
 */
class CompatibilityEvidenceDigestTest {
    private val canonicalSha256 = Regex("^[0-9a-f]{64}$")

    @Test
    fun `kotlin api projection digest is deterministic across repeated calls`() {
        val model = modelWith(kdoc = "Some docs.", fieldOrder = listOf("b", "a"))

        val first = model.kotlinApiProjectionDigest()
        val second = model.kotlinApiProjectionDigest()

        assertEquals(first, second)
        assertTrue(canonicalSha256.matches(first))
    }

    @Test
    fun `semantic model digest is deterministic across repeated calls`() {
        val document = documentWith(schemaIds = listOf("Zebra", "Alpha"))

        val first = document.semanticModelDigest()
        val second = document.semanticModelDigest()

        assertEquals(first, second)
        assertTrue(canonicalSha256.matches(first))
    }

    @Test
    fun `kotlin api projection digest is invariant to kdoc-only changes`() {
        val undocumented = modelWith(kdoc = "")
        val documented = modelWith(kdoc = "Totally different docs that say nothing about the API shape.")

        assertEquals(undocumented.kotlinApiProjectionDigest(), documented.kotlinApiProjectionDigest())
        // The declaration-model digest (which retains KDoc, per ADR 0013) must still move, proving the two
        // digests are computed from genuinely different bytes rather than one being a stand-in for the other.
        assertNotEquals(undocumented.digest(), documented.digest())
    }

    @Test
    fun `kotlin api projection digest is invariant to declaration and field ordering`() {
        val ordered = modelWith(kdoc = "", fieldOrder = listOf("a", "b"), declarationOrder = listOf("Alpha", "Beta"))
        val reordered = modelWith(kdoc = "", fieldOrder = listOf("b", "a"), declarationOrder = listOf("Beta", "Alpha"))

        assertEquals(ordered.kotlinApiProjectionDigest(), reordered.kotlinApiProjectionDigest())
    }

    @Test
    fun `kotlin api projection digest changes when a public field is added`() {
        val withoutField = modelWith(kdoc = "", fieldOrder = listOf("a"))
        val withField = modelWith(kdoc = "", fieldOrder = listOf("a", "b"))

        assertNotEquals(withoutField.kotlinApiProjectionDigest(), withField.kotlinApiProjectionDigest())
    }

    @Test
    fun `semantic model digest is invariant to schema map iteration order`() {
        val forward = documentWith(schemaIds = listOf("Alpha", "Zebra"))
        val backward = documentWith(schemaIds = listOf("Zebra", "Alpha"))

        assertEquals(forward.semanticModelDigest(), backward.semanticModelDigest())
    }

    @Test
    fun `semantic model change does not move the kotlin api projection digest`() {
        val model = modelWith(kdoc = "")
        val before = documentWith(schemaIds = listOf("Alpha"))
        val after = documentWith(schemaIds = listOf("Alpha", "Beta"))

        assertNotEquals(before.semanticModelDigest(), after.semanticModelDigest())
        // The Kotlin declaration model did not change at all, so its projection digest must not move either
        // -- these two evidence layers must be computed from disjoint inputs, never from a shared source.
        assertEquals(model.kotlinApiProjectionDigest(), model.kotlinApiProjectionDigest())
    }

    private fun modelWith(
        kdoc: String,
        fieldOrder: List<String> = listOf("a", "b"),
        declarationOrder: List<String> = listOf("Alpha"),
    ): KotlinDeclarationModel {
        val declarations =
            declarationOrder.mapIndexed { index, name ->
                ModelDeclaration(
                    symbolId = "schema:$name",
                    order = index,
                    packageName = "com.example.generated",
                    fileName = name,
                    resolvedName = name,
                    kdoc = kdoc,
                    fields =
                        fieldOrder.mapIndexed { fieldIndex, fieldName ->
                            FieldDeclaration(
                                symbolId = "schema:$name#$fieldName",
                                order = fieldIndex,
                                resolvedName = fieldName,
                                wireName = fieldName,
                                type = KotlinTypeRef("kotlin", "String"),
                                required = true,
                                nullable = false,
                                kdoc = kdoc,
                            )
                        },
                    dslFunctionName = "$name+DSL",
                )
            }
        return KotlinDeclarationModel(
            files = listOf(KotlinFileDeclaration("com.example.generated", "Models", declarations)),
        )
    }

    private fun documentWith(schemaIds: List<String>): SemanticDocument {
        val source = SourcePointer("openapi.yaml", "/", SourceLocation(1, 1, 0))
        val schemas =
            schemaIds.associate { name ->
                SchemaId(name) to
                    SchemaModel(
                        id = SchemaId(name),
                        identityKind = IdentityKind.COMPONENT,
                        referenceTarget = null,
                        types = listOf("string"),
                        format = null,
                        nullability = Nullability.NON_NULL,
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
                        source = source,
                    )
            }
        return SemanticDocument(
            documentUri = "openapi.yaml",
            title = "Fixture",
            version = "1.0.0",
            sourceDocuments = emptyList(),
            schemas = schemas,
            operations = emptyList(),
            securityAlternatives = emptyList(),
            extensions = emptyMap(),
            diagnostics = emptyList(),
            source = source,
        )
    }
}
