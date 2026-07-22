@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.nabobery.sdkgen.model.AdditionalPropertiesModel
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
}

private fun SemanticDocument.schema(name: String): SchemaModel =
    schemas.values.single { it.id.value.endsWith("/components/schemas/$name") }

private fun com.nabobery.sdkgen.model.SchemaRef.resolve(document: SemanticDocument): SchemaModel =
    document.schemas.getValue(schemaId)

private fun List<com.nabobery.sdkgen.model.PropertyModel>.getValue(name: String) = single { it.name == name }
