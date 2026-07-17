package com.nabobery.sdkgen.openapi

import com.fasterxml.jackson.core.JsonPointer
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.JsonNodeFactory
import com.fasterxml.jackson.databind.node.ObjectNode
import com.nabobery.sdkgen.model.IdentityKind
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SourceLocation
import java.nio.file.Path
import kotlin.coroutines.cancellation.CancellationException
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertSame

/**
 * H2 regression coverage: adaptation and reference-resolution `runCatching` sites must rethrow
 * [CancellationException] by identity instead of converting it into an ordinary diagnostic.
 */
class CancellationIdentityTest {
    @Test
    fun `cancellation during property reference resolution propagates by identity`() {
        val cancellation = CancellationException("property reference resolution cancelled")
        val factory = JsonNodeFactory.instance
        val canonicalUri = "sdkgen://source/cancellation-property.yaml"
        val document =
            sourceDocument(
                canonicalUri = canonicalUri,
                root = ThrowingAtNode(cancellation),
                locations =
                    mapOf(
                        "/x" to SourceLocation(1, 1, 0),
                        "/x/properties/p" to SourceLocation(1, 1, 0),
                    ),
            )
        val repository = buildRepository(canonicalUri, document)
        val state = AdaptationContext(repository, document)

        val propertyNode = factory.objectNode().put("\$ref", "#/x")
        val schemaNode = factory.objectNode()
        schemaNode.set<ObjectNode>("properties", factory.objectNode().set("p", propertyNode))

        val thrown =
            assertFailsWith<CancellationException> {
                state.adaptSchema(
                    document = document,
                    pointer = "/x",
                    node = schemaNode,
                    requestedId = SchemaId("test:/x"),
                    identityKind = IdentityKind.INLINE,
                )
            }
        assertSame(cancellation, thrown)
    }

    @Test
    fun `cancellation during discriminator mapping resolution propagates by identity`() {
        val cancellation = CancellationException("discriminator mapping resolution cancelled")
        val factory = JsonNodeFactory.instance
        val canonicalUri = "sdkgen://source/cancellation-discriminator.yaml"
        val document =
            sourceDocument(
                canonicalUri = canonicalUri,
                root = ThrowingAtNode(cancellation),
                locations =
                    mapOf(
                        "/y" to SourceLocation(1, 1, 0),
                        "/y/oneOf/0" to SourceLocation(1, 1, 0),
                    ),
            )
        val repository = buildRepository(canonicalUri, document)
        val state = AdaptationContext(repository, document)

        val branch = factory.objectNode().put("type", "object")
        val oneOf = factory.arrayNode().add(branch)
        val mapping = factory.objectNode().put("cat", "#/y")
        val discriminator = factory.objectNode().put("propertyName", "kind")
        discriminator.set<ObjectNode>("mapping", mapping)
        val schemaNode = factory.objectNode()
        schemaNode.set<ObjectNode>("oneOf", oneOf)
        schemaNode.set<ObjectNode>("discriminator", discriminator)

        val thrown =
            assertFailsWith<CancellationException> {
                state.adaptSchema(
                    document = document,
                    pointer = "/y",
                    node = schemaNode,
                    requestedId = SchemaId("test:/y"),
                    identityKind = IdentityKind.INLINE,
                )
            }
        assertSame(cancellation, thrown)
    }

    @Test
    fun `cancellation during operation adaptation propagates by identity`() {
        val cancellation = CancellationException("operation adaptation cancelled")
        val factory = JsonNodeFactory.instance
        val canonicalUri = "sdkgen://source/cancellation-operation.yaml"
        val document = sourceDocument(canonicalUri, factory.objectNode(), emptyMap())
        val repository = buildRepository(canonicalUri, document)
        val state = AdaptationContext(repository, document)

        val operationNode = ThrowingGetNode(cancellation)
        val pathNode = factory.objectNode()
        pathNode.set<ObjectNode>("get", operationNode)
        val paths = factory.objectNode()
        paths.set<ObjectNode>("/widgets", pathNode)
        val root = factory.objectNode()
        root.set<ObjectNode>("paths", paths)

        val thrown =
            assertFailsWith<CancellationException> {
                state.adaptOperations(root)
            }
        assertSame(cancellation, thrown)
    }

    @Test
    fun `cancellation during component schema adaptation propagates by identity`() {
        val cancellation = CancellationException("component schema adaptation cancelled")
        val canonicalUri = "sdkgen://source/cancellation-component.yaml"
        val document =
            sourceDocument(
                canonicalUri = canonicalUri,
                root = JsonNodeFactory.instance.objectNode(),
                locations = mapOf("/components/schemas/Boom" to SourceLocation(1, 1, 0)),
            )
        val repository = buildRepository(canonicalUri, document)
        val state = AdaptationContext(repository, document)
        val node = ThrowingHasNode(cancellation)

        val thrown =
            assertFailsWith<CancellationException> {
                adaptComponentSchema(
                    state = state,
                    document = document,
                    pointer = "/components/schemas/Boom",
                    node = node,
                    name = "Boom",
                    requestedId = state.canonicalSchemaId(document, "/components/schemas/Boom"),
                )
            }
        assertSame(cancellation, thrown)
    }
}

private fun sourceDocument(
    canonicalUri: String,
    root: JsonNode,
    locations: Map<String, SourceLocation>,
): SourceDocument =
    SourceDocument(
        canonicalUri = canonicalUri,
        path = Path.of("cancellation-fixture.yaml"),
        sha256 = "0".repeat(64),
        contentLength = 0,
        root = root,
        locations = locations,
    )

private fun buildRepository(
    canonicalUri: String,
    document: SourceDocument,
): SourceRepository {
    val constructor = SourceRepository::class.java.getDeclaredConstructor(Map::class.java, String::class.java)
    constructor.isAccessible = true
    @Suppress("UNCHECKED_CAST")
    return constructor.newInstance(mapOf(canonicalUri to document), canonicalUri) as SourceRepository
}

/** A node whose `.at(...)` resolution always fails with the given [cancellation]. */
private class ThrowingAtNode(
    private val cancellation: CancellationException,
) : ObjectNode(JsonNodeFactory.instance) {
    override fun _at(ptr: JsonPointer): JsonNode = throw cancellation
}

/** A node whose `.get(fieldName)` always fails with the given [cancellation]. */
private class ThrowingGetNode(
    private val cancellation: CancellationException,
) : ObjectNode(JsonNodeFactory.instance) {
    override fun get(fieldName: String): JsonNode = throw cancellation
}

/** A node whose `.has(fieldName)` always fails with the given [cancellation]. */
private class ThrowingHasNode(
    private val cancellation: CancellationException,
) : ObjectNode(JsonNodeFactory.instance) {
    override fun has(fieldName: String): Boolean = throw cancellation
}
