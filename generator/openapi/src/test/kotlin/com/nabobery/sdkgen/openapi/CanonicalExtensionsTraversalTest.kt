package com.nabobery.sdkgen.openapi

import com.nabobery.sdkgen.openapi.overlays.DocumentCodec
import kotlin.test.Test
import kotlin.test.assertTrue

/**
 * Placement coverage for [collectSchemaObjectPointers]: every OpenAPI 3.1 location that hosts a Schema
 * Object must be a member of the collected set, or the canonical schema-extension validator rejects a
 * valid `x-sdkgen-*` placement there. These locations were omitted before 0.3.0: inline operation
 * callbacks, `components.callbacks`, `components.pathItems`, Encoding Object header schemas, and the
 * JSON Schema `contentSchema` keyword.
 */
class CanonicalExtensionsTraversalTest {
    private val document =
        DocumentCodec.parse(
            """
            openapi: 3.1.0
            info: { title: Traversal, version: 1.0.0 }
            paths:
              /subscribe:
                post:
                  requestBody:
                    content:
                      multipart/form-data:
                        schema: { type: object }
                        encoding:
                          part:
                            headers:
                              X-Part-Meta:
                                schema: { type: string }
                  callbacks:
                    onEvent:
                      "{${'$'}request.body#/callbackUrl}":
                        post:
                          requestBody:
                            content:
                              application/json:
                                schema: { type: object }
                  responses:
                    '200': { description: OK }
            components:
              schemas:
                Wrapped:
                  type: string
                  contentMediaType: application/json
                  contentSchema: { type: object }
              callbacks:
                shared:
                  "{${'$'}request.query.url}":
                    post:
                      requestBody:
                        content:
                          application/json:
                            schema: { type: string }
                      responses:
                        '200': { description: OK }
              pathItems:
                reusable:
                  get:
                    parameters:
                      - { name: q, in: query, schema: { type: string } }
                    responses:
                      '200': { description: OK }
            """.trimIndent().toByteArray(),
        )

    private val pointers = collectSchemaObjectPointers(document)

    private fun assertMember(pointer: String) =
        assertTrue(pointer in pointers, "expected $pointer in collected schema pointers")

    @Test
    fun `inline operation callback schemas are schema objects`() =
        assertMember(
            "/paths/~1subscribe/post/callbacks/onEvent/{${'$'}request.body#~1callbackUrl}" +
                "/post/requestBody/content/application~1json/schema",
        )

    @Test
    fun `component callback schemas are schema objects`() =
        assertMember(
            "/components/callbacks/shared/{${'$'}request.query.url}/post/requestBody/content/application~1json/schema",
        )

    @Test
    fun `component path item schemas are schema objects`() =
        assertMember("/components/pathItems/reusable/get/parameters/0/schema")

    @Test
    fun `encoding object header schemas are schema objects`() =
        assertMember(
            "/paths/~1subscribe/post/requestBody/content/multipart~1form-data" +
                "/encoding/part/headers/X-Part-Meta/schema",
        )

    @Test
    fun `contentSchema subschemas are schema objects`() = assertMember("/components/schemas/Wrapped/contentSchema")
}
