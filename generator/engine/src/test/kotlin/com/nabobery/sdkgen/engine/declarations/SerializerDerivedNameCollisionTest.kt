package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.engine.config.RetryDefaults
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.openapi.SemanticAdapter
import java.nio.file.Files
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/** Pins reservation of top-level oneOf serializer names against sibling schema names. */
class SerializerDerivedNameCollisionTest {
    @Test
    fun oneOfSerializerNamesAreReservedAgainstSiblingSchemas() {
        val declarations = project(collisionDocument())
        val names =
            declarations.files
                .flatMap(KotlinFileDeclaration::declarations)
                .map(Declaration::resolvedName)

        listOf("ObjectChoiceSerializer", "PrimitiveChoiceSerializer").forEach { reservedSerializerName ->
            val sibling =
                names.singleOrNull { name ->
                    name.startsWith(reservedSerializerName) &&
                        name != reservedSerializerName
                }
            assertTrue(sibling != null, "expected an allocated sibling for $reservedSerializerName in $names")
            assertFalse(
                names.contains(reservedSerializerName),
                "$reservedSerializerName must remain available to the emitter",
            )
        }
        assertEquals(names.size, names.toSet().size, "serializer reservation must prevent duplicate declarations")
    }

    private fun project(document: SemanticDocument): KotlinDeclarationModel =
        StandardProjection()
            .project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = "com.example.generated",
                    canonicalDocumentUri = document.documentUri,
                    clientName = "CollisionClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            ).model

    private fun collisionDocument(): SemanticDocument {
        val source =
            Files.createTempFile("sdkgen-serializer-name-collision-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Serializer name collisions, version: "1" }
                    paths:
                      /value:
                        get:
                          operationId: getValue
                          responses: { '204': { description: ok } }
                    components:
                      schemas:
                        ObjectChoice:
                          oneOf:
                            - type: object
                              required: [alpha]
                              properties: { alpha: { type: string } }
                            - type: object
                              required: [beta]
                              properties: { beta: { type: string } }
                        ObjectChoiceSerializer:
                          type: object
                          properties: { value: { type: string } }
                        PrimitiveChoice:
                          oneOf:
                            - type: string
                            - type: integer
                        PrimitiveChoiceSerializer:
                          type: object
                          properties: { value: { type: string } }
                    """.trimIndent() + "\n",
                )
            }
        return SemanticAdapter().adapt(source).document
    }
}
