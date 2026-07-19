package com.nabobery.sdkgen.openapi.overlays

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class OverlayApplicatorTest {
    private val source = resourceBytes("/fixtures/basic-openapi.yaml")

    @Test
    fun `applies overlays in declared order and records digests`() {
        val first =
            overlay(
                "first",
                """
            - target: "$"
              update:
                tags:
                  - name: first
            """,
            )
        val second =
            overlay(
                "second",
                """
            - target: "$"
              update:
                tags:
                  - name: second
            """,
            )

        val result = OverlayApplicator().apply(source, listOf(first, second))

        assertEquals(listOf("base", "first", "second"), result.document.path("tags").map { it.path("name").asText() })
        assertEquals(listOf("first", "second"), result.overlays.map { it.identity })
        assertEquals(DocumentCodec.sha256(first.content), result.overlays[0].sha256)
        assertEquals(2, result.actions.size)
    }

    @Test
    fun `strict mode fails and compatibility mode accepts a zero-match action`() {
        val missing =
            overlay(
                "missing",
                """
            - target: "$['paths']['/gone']"
              remove: true
            """,
            )

        val failure =
            assertFailsWith<ZeroMatchException> {
                OverlayApplicator(ZeroMatchMode.STRICT).apply(source, listOf(missing))
            }
        assertEquals("Overlay 'missing' action 0 matched zero nodes: $['paths']['/gone']", failure.message)

        val compatible = OverlayApplicator(ZeroMatchMode.COMPAT).apply(source, listOf(missing))
        assertEquals(
            DocumentCodec.canonicalJson(DocumentCodec.parse(source)),
            DocumentCodec.canonicalJson(compatible.document),
        )
        assertTrue(
            compatible.actions
                .single()
                .matchedPointers
                .isEmpty(),
        )
    }

    @Test
    fun `different cross-overlay scalar writes conflict unless last-write-wins is explicit`() {
        val first = descriptionOverlay("first", "First description")
        val second = descriptionOverlay("second", "Second description")

        val conflict =
            assertFailsWith<OverlayConflictException> {
                OverlayApplicator().apply(source, listOf(first, second))
            }
        assertTrue(conflict.message!!.contains("/paths/~1chat/post/description"))

        val resolved =
            OverlayApplicator(conflictPolicy = ConflictPolicy.LAST_WRITE_WINS)
                .apply(source, listOf(first, second))
        assertEquals("Second description", resolved.document.at("/paths/~1chat/post/description").asText())
    }

    @Test
    fun `child write conflicts with later parent removal unless last write wins`() {
        val child = descriptionOverlay("child", "Changed")
        val parentRemoval =
            overlay(
                "parent-removal",
                """
                - target: "${'$'}['paths']['/chat']['post']"
                  remove: true
                """,
            )

        val failure =
            assertFailsWith<OverlayConflictException> {
                OverlayApplicator().apply(source, listOf(child, parentRemoval))
            }
        assertTrue(failure.message!!.contains("/paths/~1chat/post"))

        val resolved =
            OverlayApplicator(conflictPolicy = ConflictPolicy.LAST_WRITE_WINS)
                .apply(source, listOf(child, parentRemoval))
        assertTrue(resolved.document.at("/paths/~1chat/post").isMissingNode)
    }

    @Test
    fun `child write conflicts with later array parent mutation`() {
        val child =
            overlay(
                "child",
                """
                - target: "${'$'}['tags'][0]['name']"
                  update: changed
                """,
            )
        val arrayParent =
            overlay(
                "array-parent",
                """
                - target: "${'$'}['tags']"
                  update:
                    name: added
                """,
            )

        assertFailsWith<OverlayConflictException> {
            OverlayApplicator().apply(source, listOf(child, arrayParent))
        }

        val resolved =
            OverlayApplicator(conflictPolicy = ConflictPolicy.LAST_WRITE_WINS)
                .apply(source, listOf(child, arrayParent))
        assertEquals(listOf("changed", "added"), resolved.document.path("tags").map { it.path("name").asText() })
    }

    @Test
    fun `array parent mutation conflicts with later child write`() {
        val arrayParent =
            overlay(
                "array-parent",
                """
                - target: "${'$'}['tags']"
                  update:
                    name: added
                """,
            )
        val child =
            overlay(
                "child",
                """
                - target: "${'$'}['tags'][0]['name']"
                  update: changed
                """,
            )

        assertFailsWith<OverlayConflictException> {
            OverlayApplicator().apply(source, listOf(arrayParent, child))
        }
    }

    @Test
    fun `identical non destructive writes from different overlays remain allowed`() {
        val first = descriptionOverlay("first", "Same description")
        val second = descriptionOverlay("second", "Same description")

        val result = OverlayApplicator().apply(source, listOf(first, second))

        assertEquals("Same description", result.document.at("/paths/~1chat/post/description").asText())
    }

    @Test
    fun `effective diff is pointer-sorted and deterministic across object insertion order`() {
        val left =
            """
            openapi: 3.1.0
            info: { title: Test, version: 1.0.0 }
            paths: {}
            """.trimIndent().toByteArray()
        val right =
            """
            paths: {}
            info: { version: 1.0.0, title: Test }
            openapi: 3.1.0
            """.trimIndent().toByteArray()
        val change =
            overlay(
                "change",
                """
            - target: "$['info']"
              update:
                zeta: z
                alpha: a
            """,
            )

        val first = OverlayApplicator().apply(left, listOf(change))
        val second = OverlayApplicator().apply(right, listOf(change))

        assertEquals(DocumentCodec.canonicalJson(first.document), DocumentCodec.canonicalJson(second.document))
        assertEquals(first.changes, second.changes)
        assertEquals(listOf("/info/alpha", "/info/zeta"), first.changes.map { it.pointer })
    }

    @Test
    fun `validates canonical extensions strictly and preserves unrelated vendor extensions`() {
        val valid =
            overlay(
                "valid",
                """
            - target: "$['paths']['/chat']['post']"
              update:
                x-sdkgen-streaming:
                  mode: sse
                  responseContentType: text/event-stream
                x-sdkgen-idempotency:
                  keyHeader: Idempotency-Key
                  clientGenerated: true
            """,
            )
        val result = OverlayApplicator().apply(source, listOf(valid))
        assertEquals("keep-me", result.document.at("/info/x-unrelated").asText())
        assertNotNull(result.document.at("/paths/~1chat/post/x-sdkgen-streaming"))
        assertNotNull(result.document.at("/paths/~1chat/post/x-sdkgen-idempotency"))

        val unknownField =
            overlay(
                "unknown-field",
                """
            - target: "$['paths']['/chat']['post']"
              update:
                x-sdkgen-streaming:
                  mode: sse
                  responseContentType: text/event-stream
                  guessedBehavior: true
            """,
            )
        assertFailsWith<ExtensionValidationException> {
            OverlayApplicator().apply(source, listOf(unknownField))
        }

        val unknownName =
            overlay(
                "unknown-name",
                """
            - target: "$['paths']['/chat']['post']"
              update:
                x-sdkgen-magic:
                  enabled: true
            """,
            )
        assertFailsWith<ExtensionValidationException> {
            OverlayApplicator().apply(source, listOf(unknownName))
        }
    }

    @Test
    fun `pagination pointers enforce complete RFC 6901 escaping`() {
        listOf("/data~", "/data~2", "/data/~").forEachIndexed { index, invalidPointer ->
            val invalid =
                overlay(
                    "invalid-pointer-$index",
                    """
                    - target: "${'$'}['paths']['/chat']['post']"
                      update:
                        x-sdkgen-pagination:
                          style: cursor
                          requestCursor: cursor
                          responseItems: $invalidPointer
                          responseNextCursor: /next
                    """,
                )

            val failure =
                assertFailsWith<ExtensionValidationException> {
                    OverlayApplicator().apply(source, listOf(invalid))
                }
            assertTrue(failure.message!!.contains("/paths/~1chat/post/x-sdkgen-pagination/responseItems"))
            assertTrue(failure.message!!.contains("valid JSON Pointer escapes"))
        }

        listOf("/data~0key", "/data~1items").forEachIndexed { index, validPointer ->
            val valid =
                overlay(
                    "valid-pointer-$index",
                    """
                    - target: "${'$'}['paths']['/chat']['post']"
                      update:
                        x-sdkgen-pagination:
                          style: cursor
                          requestCursor: cursor
                          responseItems: $validPointer
                          responseNextCursor: /next
                    """,
                )

            val result = OverlayApplicator().apply(source, listOf(valid))
            assertEquals(
                validPointer,
                result.document
                    .at("/paths/~1chat/post/x-sdkgen-pagination/responseItems")
                    .asText(),
            )
        }
    }

    @Test
    fun `canonical operation extensions reject non-operation attachments without misclassifying vendor extensions`() {
        val attachmentSource =
            """
            openapi: 3.1.0
            info: { title: Attachments, version: 1.0.0 }
            paths:
              /chat:
                post:
                  parameters:
                    - { name: cursor, in: query, schema: { type: string } }
                  responses:
                    '200': { description: OK }
            components:
              schemas:
                Item: { type: object }
            """.trimIndent().toByteArray()
        val placements =
            listOf(
                "${'$'}" to "/x-sdkgen-streaming",
                "${'$'}['paths']['/chat']" to "/paths/~1chat/x-sdkgen-streaming",
                "${'$'}['paths']['/chat']['post']['responses']['200']" to
                    "/paths/~1chat/post/responses/200/x-sdkgen-streaming",
                "${'$'}['paths']['/chat']['post']['parameters'][0]" to
                    "/paths/~1chat/post/parameters/0/x-sdkgen-streaming",
                "${'$'}['components']['schemas']['Item']" to
                    "/components/schemas/Item/x-sdkgen-streaming",
            )

        placements.forEachIndexed { index, (target, expectedPointer) ->
            val invalid =
                overlay(
                    "misplaced-$index",
                    """
                    - target: "$target"
                      update:
                        x-sdkgen-streaming:
                          mode: sse
                          responseContentType: text/event-stream
                    """,
                )
            val failure =
                assertFailsWith<ExtensionValidationException> {
                    OverlayApplicator().apply(attachmentSource, listOf(invalid))
                }
            assertEquals(
                "Invalid SDKGen extension at $expectedPointer: is only allowed as a direct property of an OpenAPI Operation Object",
                failure.message,
            )
        }

        val vendor =
            overlay(
                "vendor",
                """
                - target: "${'$'}['info']"
                  update:
                    x-other-vendor:
                      x-sdkgen-streaming: untouched
                """,
            )
        val result = OverlayApplicator().apply(source, listOf(vendor))
        assertEquals("untouched", result.document.at("/info/x-other-vendor/x-sdkgen-streaming").asText())
    }

    @Test
    fun `canonical extension validation enforces required constants types and pointer syntax`() {
        val invalidExtensions =
            listOf(
                """
                x-sdkgen-streaming:
                  mode: sse
                """,
                """
                x-sdkgen-streaming:
                  mode: websocket
                  responseContentType: text/event-stream
                """,
                """
                x-sdkgen-streaming:
                  mode: sse
                  responseContentType: text/event-stream
                  requestFlag: 7
                """,
                """
                x-sdkgen-pagination:
                  style: cursor
                  requestCursor: cursor
                  responseItems: items
                  responseNextCursor: /next
                """,
                """
                x-sdkgen-idempotency:
                  keyHeader: Idempotency-Key
                  clientGenerated: false
                """,
                """
                x-sdkgen-idempotency:
                  keyHeader: ''
                  clientGenerated: true
                """,
            )

        invalidExtensions.forEachIndexed { index, extension ->
            val actions =
                "- target: \"${'$'}['paths']['/chat']['post']\"\n" +
                    "  update:\n" +
                    extension.trimIndent().prependIndent("    ")
            val invalid = overlay("invalid-extension-$index", actions)

            assertFailsWith<ExtensionValidationException> {
                OverlayApplicator().apply(source, listOf(invalid))
            }
        }
    }

    @Test
    fun `copy action follows ordered update copy update semantics`() {
        val transformation =
            overlay(
                "copy-sequence",
                """
            - target: "$['paths']"
              update:
                /copied: {}
            - target: "$['paths']['/copied']"
              copy: "$['paths']['/chat']"
            - target: "$['paths']['/copied']['post']['description']"
              update: "Copied and updated"
            """,
            )

        val result = OverlayApplicator().apply(source, listOf(transformation))

        assertEquals("Original description", result.document.at("/paths/~1chat/post/description").asText())
        assertEquals("Copied and updated", result.document.at("/paths/~1copied/post/description").asText())
        assertEquals(listOf("update", "copy", "update"), result.actions.map { it.kind })
        assertEquals("$['paths']['/chat']", result.actions[1].copyFrom)
        assertEquals(listOf("/paths/~1chat"), result.actions[1].sourcePointers)
    }

    @Test
    fun `copy writes participate in cross-overlay conflict policy`() {
        val copied =
            overlay(
                "copied",
                """
            - target: "$['info']['title']"
              copy: "$['paths']['/chat']['post']['description']"
            """,
            )
        val updated =
            overlay(
                "updated",
                """
            - target: "$['info']['title']"
              update: "Explicit title"
            """,
            )

        val conflict =
            assertFailsWith<OverlayConflictException> {
                OverlayApplicator().apply(source, listOf(copied, updated))
            }
        assertTrue(conflict.message!!.contains("/info/title"))

        val resolved =
            OverlayApplicator(conflictPolicy = ConflictPolicy.LAST_WRITE_WINS)
                .apply(source, listOf(copied, updated))
        assertEquals("Explicit title", resolved.document.at("/info/title").asText())
    }

    @Test
    fun `copy source must select exactly one node in strict and compatibility modes`() {
        val missing =
            overlay(
                "missing-copy-source",
                """
            - target: "$['info']['title']"
              copy: "$['paths']['/gone']"
            """,
            )
        listOf(ZeroMatchMode.STRICT, ZeroMatchMode.COMPAT).forEach { mode ->
            val failure =
                assertFailsWith<CopySourceMatchException> {
                    OverlayApplicator(zeroMatchMode = mode).apply(source, listOf(missing))
                }
            assertTrue(failure.message!!.contains("matched 0"))
        }

        val multiple =
            overlay(
                "multiple-copy-sources",
                """
            - target: "$['paths']"
              update:
                /other: {}
            - target: "$['info']"
              copy: "$['paths'][*]"
            """,
            )
        val multipleFailure =
            assertFailsWith<CopySourceMatchException> {
                OverlayApplicator().apply(source, listOf(multiple))
            }
        assertTrue(multipleFailure.message!!.contains("matched 2"))
    }

    @Test
    fun `compat zero-match copy is a no-op but still validates source grammar`() {
        val missingTarget =
            overlay(
                "missing-copy-target",
                """
            - target: "$['paths']['/gone']"
              copy: "$['paths']['/chat']"
            """,
            )
        val compatible =
            OverlayApplicator(zeroMatchMode = ZeroMatchMode.COMPAT)
                .apply(source, listOf(missingTarget))
        assertEquals(
            DocumentCodec.canonicalJson(DocumentCodec.parse(source)),
            DocumentCodec.canonicalJson(compatible.document),
        )
        assertEquals("copy", compatible.actions.single().kind)
        assertTrue(
            compatible.actions
                .single()
                .sourcePointers
                .isEmpty(),
        )

        val invalidCopy =
            overlay(
                "invalid-copy-source",
                """
            - target: "$['paths']['/gone']"
              copy: "$['items'][?(@.kind in ['a'])]"
            """,
            )
        val failure =
            assertFailsWith<JsonPathValidationException> {
                OverlayApplicator(zeroMatchMode = ZeroMatchMode.COMPAT).apply(source, listOf(invalidCopy))
            }
        assertEquals("invalid-copy-source", failure.source.overlayIdentity)
        assertEquals(0, failure.source.actionIndex)
        assertEquals("copy", failure.source.field)
    }

    @Test
    fun `update and remove precedence suppresses copy as specified`() {
        val precedence =
            overlay(
                "precedence",
                """
            - target: "$['info']['title']"
              update: "Update wins"
              copy: "$['items'][?(@.kind in ['a'])]"
            - target: "$['info']['x-unrelated']"
              remove: true
              copy: "$['items'][?(@.kind in ['a'])]"
            """,
            )

        val result = OverlayApplicator().apply(source, listOf(precedence))

        assertEquals("Update wins", result.document.at("/info/title").asText())
        assertTrue(result.document.at("/info/x-unrelated").isMissingNode)
        assertEquals(listOf("update", "remove"), result.actions.map { it.kind })
    }

    @Test
    fun `update and copy reject mixed target node kinds before mutation`() {
        val mixed =
            overlay(
                "mixed-targets",
                """
            - target: "$['info','tags']"
              update: {}
            """,
            )
        val failure =
            assertFailsWith<OverlayFormatException> {
                OverlayApplicator().apply(source, listOf(mixed))
            }
        assertTrue(failure.message!!.contains("all objects, all arrays, or all primitives"))
    }

    @Test
    fun `mutation layer deduplicates repeated RFC selections`() {
        val repeated =
            overlay(
                "repeated-target",
                """
            - target: "$['tags','tags']"
              update:
                - name: once
            """,
            )

        val result = OverlayApplicator().apply(source, listOf(repeated))

        assertEquals(listOf("base", "once"), result.document.path("tags").map { it.path("name").asText() })
        assertEquals(listOf("/tags"), result.actions.single().matchedPointers)
    }

    @Test
    fun `rejects incompatible structured merge types`() {
        val incompatible =
            overlay(
                "incompatible",
                """
            - target: "$['info']"
              update: replacement
            """,
            )
        assertFailsWith<OverlayFormatException> {
            OverlayApplicator().apply(source, listOf(incompatible))
        }
    }

    private fun descriptionOverlay(
        identity: String,
        description: String,
    ) = overlay(
        identity,
        """
        - target: "$['paths']['/chat']['post']['description']"
          update: "$description"
        """,
    )

    private fun overlay(
        identity: String,
        actions: String,
    ): OverlayInput {
        val header =
            """
            overlay: 1.1.0
            info:
              title: $identity
              version: 1.0.0
            actions:
            """.trimIndent()
        val content = (header + "\n" + actions.trimIndent().prependIndent("  ") + "\n").toByteArray()
        return OverlayInput(identity, content)
    }

    private fun resourceBytes(path: String): ByteArray = checkNotNull(javaClass.getResource(path)).readBytes()
}
