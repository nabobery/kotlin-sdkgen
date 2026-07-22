@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.DiagnosticCode
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.Nullability
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SemanticDocument
import java.nio.file.Files
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Table-driven coverage for the native OpenAPI 3.0.x -> 3.1 normalization pass applied at the
 * ingestion seam (see [SchemaAdapter.kt], [SemanticAdapter.kt]). Every mapping from the OAI
 * migration guide exercised here must also leave a traceable [com.nabobery.sdkgen.model.Diagnostic].
 */
class Openapi30NormalizationTest {
    private val adapter = SemanticAdapter()

    @Test
    fun `document declaring openapi 3 0 x raises an info level normalization diagnostic`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Legacy document, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Plain:
                      type: string
                """.trimIndent(),
            )
        val diagnostic = document.diagnostics.single { it.code == DiagnosticCode.OPENAPI_3_0_DOCUMENT_NORMALIZED }

        assertEquals(DiagnosticSeverity.INFO, diagnostic.severity)
        assertEquals("/openapi", diagnostic.source.jsonPointer)
    }

    @Test
    fun `a 3 1 document never raises the 3 0 document normalized diagnostic`() {
        val document =
            adaptYaml(
                """
                openapi: 3.1.0
                info: { title: Native document, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Plain:
                      type: string
                """.trimIndent(),
            )

        assertTrue(document.diagnostics.none { it.code == DiagnosticCode.OPENAPI_3_0_DOCUMENT_NORMALIZED })
    }

    @Test
    fun `openrouter 3 1 corpus adaptation raises none of the new 3 0 normalization diagnostics`() {
        val document = adapter.adapt(ExperimentSupport.openRouterFixture).document
        val openApi30OnlyCodes =
            setOf(
                DiagnosticCode.OPENAPI_3_0_DOCUMENT_NORMALIZED,
                DiagnosticCode.EXCLUSIVE_BOUND_NORMALIZED,
                DiagnosticCode.NULLABLE_TYPE_NORMALIZED,
                DiagnosticCode.NULLABLE_ENUM_NULL_INJECTED,
                DiagnosticCode.NULLABLE_REFERENCE_SIBLING,
                DiagnosticCode.NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE,
                DiagnosticCode.CONTENT_KEYWORD_NORMALIZED,
            )

        assertTrue(document.diagnostics.none { it.code in openApi30OnlyCodes })
    }

    @Test
    fun `nullable enum without a null member has null injected and is diagnosed`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Nullable enum, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Status:
                      type: string
                      nullable: true
                      enum: [active, inactive]
                """.trimIndent(),
            )
        val schema = document.schema("Status")
        val diagnostic = document.diagnostics.single { it.code == DiagnosticCode.NULLABLE_ENUM_NULL_INJECTED }

        assertEquals(
            listOf(JsonValue.StringValue("active"), JsonValue.StringValue("inactive"), JsonValue.Null),
            schema.enum?.values,
        )
        assertEquals(DiagnosticSeverity.INFO, diagnostic.severity)
        assertEquals("/components/schemas/Status/enum", diagnostic.source.jsonPointer)
    }

    @Test
    fun `nullable enum that already lists null is left unchanged and not diagnosed`() {
        val document =
            adaptYaml(
                """
                openapi: 3.1.0
                info: { title: Already null enum, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Status:
                      type: [string, 'null']
                      enum: [active, inactive, null]
                """.trimIndent(),
            )
        val schema = document.schema("Status")

        assertEquals(
            listOf(JsonValue.StringValue("active"), JsonValue.StringValue("inactive"), JsonValue.Null),
            schema.enum?.values,
        )
        assertTrue(document.diagnostics.none { it.code == DiagnosticCode.NULLABLE_ENUM_NULL_INJECTED })
    }

    @Test
    fun `non nullable enum is never touched`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Non nullable enum, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Status:
                      type: string
                      enum: [active, inactive]
                """.trimIndent(),
            )
        val schema = document.schema("Status")

        assertEquals(
            listOf(JsonValue.StringValue("active"), JsonValue.StringValue("inactive")),
            schema.enum?.values,
        )
        assertTrue(document.diagnostics.none { it.code == DiagnosticCode.NULLABLE_ENUM_NULL_INJECTED })
    }

    @Test
    fun `nullable ref sibling is wrapped as a nullable reference and diagnosed instead of dropped`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Nullable ref sibling, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Address:
                      type: object
                      properties:
                        city: { type: string }
                    Person:
                      type: object
                      properties:
                        homeAddress:
                          ${'$'}ref: '#/components/schemas/Address'
                          nullable: true
                """.trimIndent(),
            )
        val person = document.schema("Person")
        val property = person.properties.single { it.name == "homeAddress" }
        val wrapper = document.schemas.getValue(property.schema.schemaId)
        val diagnostic = document.diagnostics.single { it.code == DiagnosticCode.NULLABLE_REFERENCE_SIBLING }

        assertEquals(Nullability.NULLABLE, property.nullability)
        assertEquals(document.schema("Address").id, wrapper.referenceTarget)
        assertEquals(Nullability.NULLABLE, wrapper.nullability)
        assertEquals(DiagnosticSeverity.WARNING, diagnostic.severity)
        assertEquals(
            "/components/schemas/Person/properties/homeAddress/nullable",
            diagnostic.source.jsonPointer,
        )
    }

    @Test
    fun `bare ref without nullable sibling is unaffected by the wrapper policy`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Bare ref, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Address:
                      type: object
                      properties:
                        city: { type: string }
                    Person:
                      type: object
                      properties:
                        homeAddress:
                          ${'$'}ref: '#/components/schemas/Address'
                """.trimIndent(),
            )
        val person = document.schema("Person")
        val property = person.properties.single { it.name == "homeAddress" }

        assertEquals(document.schema("Address").id, property.schema.schemaId)
        assertEquals(Nullability.NON_NULL, property.nullability)
        assertTrue(document.diagnostics.none { it.code == DiagnosticCode.NULLABLE_REFERENCE_SIBLING })
    }

    @Test
    fun `nullable oneOf without an own type gets an explicit null branch and is diagnosed`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Nullable oneOf, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Cat: { type: object, properties: { meow: { type: boolean } } }
                    Dog: { type: object, properties: { bark: { type: boolean } } }
                    Pet:
                      nullable: true
                      oneOf:
                        - ${'$'}ref: '#/components/schemas/Cat'
                        - ${'$'}ref: '#/components/schemas/Dog'
                """.trimIndent(),
            )
        val pet = document.schema("Pet")
        val oneOf = pet.compositions.single { it.kind == CompositionKind.ONE_OF }
        val diagnostic = document.diagnostics.single { it.code == DiagnosticCode.NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE }

        assertEquals(Nullability.NULLABLE, pet.nullability)
        assertEquals(3, oneOf.branches.size)
        assertTrue(
            oneOf.branches.map { document.schemas.getValue(it.schemaId) }.any { branch ->
                branch.types.isEmpty() && branch.properties.isEmpty() && branch.compositions.isEmpty()
            },
        )
        assertEquals(DiagnosticSeverity.WARNING, diagnostic.severity)
        assertEquals("/components/schemas/Pet/nullable", diagnostic.source.jsonPointer)
    }

    @Test
    fun `nullable allOf without an own type is diagnosed but no branch is injected`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Nullable allOf, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Named: { type: object, properties: { name: { type: string } } }
                    Aged: { type: object, properties: { age: { type: integer } } }
                    Person:
                      nullable: true
                      allOf:
                        - ${'$'}ref: '#/components/schemas/Named'
                        - ${'$'}ref: '#/components/schemas/Aged'
                """.trimIndent(),
            )
        val person = document.schema("Person")
        val allOf = person.compositions.single { it.kind == CompositionKind.ALL_OF }
        val diagnostic = document.diagnostics.single { it.code == DiagnosticCode.NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE }

        assertEquals(Nullability.NULLABLE, person.nullability)
        assertEquals(2, allOf.branches.size)
        assertEquals(DiagnosticSeverity.WARNING, diagnostic.severity)
    }

    @Test
    fun `nullable oneOf with an existing explicit null branch is left alone`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Nullable oneOf already explicit, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Cat: { type: object, properties: { meow: { type: boolean } } }
                    Pet:
                      nullable: true
                      oneOf:
                        - ${'$'}ref: '#/components/schemas/Cat'
                        - type: 'null'
                """.trimIndent(),
            )
        val pet = document.schema("Pet")
        val oneOf = pet.compositions.single { it.kind == CompositionKind.ONE_OF }

        assertEquals(2, oneOf.branches.size)
        assertTrue(document.diagnostics.any { it.code == DiagnosticCode.NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE })
    }

    @Test
    fun `boolean exclusiveMinimum true with minimum normalizes to the 3 1 numeric form`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Exclusive bound, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Bounded:
                      type: number
                      minimum: 5
                      exclusiveMinimum: true
                """.trimIndent(),
            )
        val schema = document.schema("Bounded")
        val diagnostic = document.diagnostics.single { it.code == DiagnosticCode.EXCLUSIVE_BOUND_NORMALIZED }

        assertEquals(JsonValue.NumberValue("5"), schema.constraints["exclusiveMinimum"])
        assertFalse(schema.constraints.containsKey("minimum"))
        assertEquals(DiagnosticSeverity.INFO, diagnostic.severity)
        assertEquals("/components/schemas/Bounded/exclusiveMinimum", diagnostic.source.jsonPointer)
    }

    @Test
    fun `boolean exclusiveMaximum false is normalized away and maximum stays inclusive`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Exclusive bound false, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Bounded:
                      type: number
                      maximum: 10
                      exclusiveMaximum: false
                """.trimIndent(),
            )
        val schema = document.schema("Bounded")
        val diagnostic = document.diagnostics.single { it.code == DiagnosticCode.EXCLUSIVE_BOUND_NORMALIZED }

        assertEquals(JsonValue.NumberValue("10"), schema.constraints["maximum"])
        assertFalse(schema.constraints.containsKey("exclusiveMaximum"))
        assertEquals(DiagnosticSeverity.INFO, diagnostic.severity)
    }

    @Test
    fun `boolean exclusiveMinimum true without a minimum sibling cannot be normalized and is diagnosed as a warning`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Exclusive bound missing sibling, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Bounded:
                      type: number
                      exclusiveMinimum: true
                """.trimIndent(),
            )
        val schema = document.schema("Bounded")
        val diagnostic = document.diagnostics.single { it.code == DiagnosticCode.EXCLUSIVE_BOUND_NORMALIZED }

        assertFalse(schema.constraints.containsKey("exclusiveMinimum"))
        assertFalse(schema.constraints.containsKey("minimum"))
        assertEquals(DiagnosticSeverity.WARNING, diagnostic.severity)
    }

    @Test
    fun `numeric 3 1 native exclusive bounds pass through unchanged without a diagnostic`() {
        val document =
            adaptYaml(
                """
                openapi: 3.1.0
                info: { title: Native exclusive bound, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Bounded:
                      type: number
                      exclusiveMinimum: 5
                      minimum: 0
                """.trimIndent(),
            )
        val schema = document.schema("Bounded")

        assertEquals(JsonValue.NumberValue("5"), schema.constraints["exclusiveMinimum"])
        assertEquals(JsonValue.NumberValue("0"), schema.constraints["minimum"])
        assertTrue(document.diagnostics.none { it.code == DiagnosticCode.EXCLUSIVE_BOUND_NORMALIZED })
    }

    @Test
    fun `format binary and byte keywords survive normalization losslessly for multipart and base64 idioms`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Format idioms, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Upload:
                      type: string
                      format: binary
                    Encoded:
                      type: string
                      format: byte
                """.trimIndent(),
            )

        assertEquals("binary", document.schema("Upload").format)
        assertEquals("byte", document.schema("Encoded").format)
    }

    @Test
    fun `media type example singular is preserved distinct from examples plural`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Media example, version: 1.0.0 }
                paths:
                  /items:
                    post:
                      operationId: createItem
                      requestBody:
                        content:
                          application/json:
                            schema: { type: object }
                            example: { name: sample }
                            examples:
                              alt:
                                value: { name: alternate }
                      responses:
                        '200': { description: ok }
                """.trimIndent(),
            )
        val operation = document.operations.single { it.operationId == "createItem" }
        val mediaType = operation.requestBody?.content?.single { it.mediaType == "application/json" }

        assertEquals(
            JsonValue.ObjectValue(mapOf("name" to JsonValue.StringValue("sample"))),
            mediaType?.example,
        )
        assertTrue(mediaType?.examples?.containsKey("alt") == true)
    }

    @Test
    fun `valid 3 1 nullable type union does not widen enum validation`() {
        val document =
            adaptYaml(
                """
                openapi: 3.1.0
                info: { title: Native enum intersection, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Status:
                      type: [string, 'null']
                      enum: [active, inactive]
                """.trimIndent(),
            )
        val status = document.schema("Status")

        assertEquals(
            listOf(JsonValue.StringValue("active"), JsonValue.StringValue("inactive")),
            status.enum?.values,
        )
        assertEquals(Nullability.NULLABLE, status.nullability)
        assertTrue(document.diagnostics.none { it.phase == com.nabobery.sdkgen.model.DiagnosticPhase.NORMALIZATION })
    }

    @Test
    fun `near miss openapi versions are not classified as 3 0 documents`() {
        listOf("3.0", "3.00.1", "3.0x.1", "13.0.1").forEach { version ->
            assertEquals(OpenApiNormalizationMode.NATIVE, classifyOpenApiVersion(version), version)
        }
        listOf("3.0.0", "3.0.3", "3.0.3-alpha.1").forEach { version ->
            assertEquals(OpenApiNormalizationMode.OPENAPI_3_0, classifyOpenApiVersion(version), version)
        }
    }

    @Test
    fun `ordinary 3 0 nullable scalar emits pointer specific normalization diagnostic`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Nullable scalar, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Name:
                      type: string
                      nullable: true
                """.trimIndent(),
            )

        val diagnostic = document.diagnostics.single { it.code == DiagnosticCode.NULLABLE_TYPE_NORMALIZED }
        assertEquals("/components/schemas/Name/nullable", diagnostic.source.jsonPointer)
        assertEquals(DiagnosticSeverity.INFO, diagnostic.severity)
    }

    @Test
    fun `3 1 nullable keyword is not treated as a 3 0 normalization`() {
        val document =
            adaptYaml(
                """
                openapi: 3.1.0
                info: { title: Non schema nullable keyword, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Name:
                      type: string
                      nullable: true
                """.trimIndent(),
            )

        // Legacy nullable adaptation predates T2 and remains byte-compatible for existing 3.1 corpora;
        // only T2's new rewrite/diagnostic layer is version-scoped.
        assertEquals(Nullability.NULLABLE, document.schema("Name").nullability)
        assertTrue(document.diagnostics.none { it.code == DiagnosticCode.NULLABLE_TYPE_NORMALIZED })
    }

    @Test
    fun `3 0 nullable enum already containing null remains unchanged without injection diagnostic`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Already nullable enum, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Status:
                      type: string
                      nullable: true
                      enum: [active, inactive, null]
                """.trimIndent(),
            )

        assertEquals(
            listOf(JsonValue.StringValue("active"), JsonValue.StringValue("inactive"), JsonValue.Null),
            document.schema("Status").enum?.values,
        )
        assertTrue(document.diagnostics.none { it.code == DiagnosticCode.NULLABLE_ENUM_NULL_INJECTED })
    }

    @Test
    fun `nullable anyOf adds a null only branch and emits policy diagnostic`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Nullable anyOf, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Choice:
                      nullable: true
                      anyOf:
                        - type: string
                        - type: integer
                """.trimIndent(),
            )
        val choice = document.schema("Choice")
        val anyOf = choice.compositions.single { it.kind == CompositionKind.ANY_OF }

        assertEquals(3, anyOf.branches.size)
        assertEquals(1, anyOf.branches.count { document.schemas.getValue(it.schemaId).acceptsOnlyNull })
        assertTrue(document.diagnostics.any { it.code == DiagnosticCode.NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE })
    }

    @Test
    fun `nullable oneOf explicit null branch remains null only and still emits policy diagnostic`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Existing null branch, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Choice:
                      nullable: true
                      oneOf:
                        - type: string
                        - type: 'null'
                """.trimIndent(),
            )
        val oneOf = document.schema("Choice").compositions.single { it.kind == CompositionKind.ONE_OF }

        assertEquals(2, oneOf.branches.size)
        assertEquals(1, oneOf.branches.count { document.schemas.getValue(it.schemaId).acceptsOnlyNull })
        assertTrue(document.diagnostics.any { it.code == DiagnosticCode.NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE })
    }

    @Test
    fun `nested ref chain to null branch is recognized without injecting a duplicate`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Nested null reference, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    NullValue: { type: 'null' }
                    NullAlias: { ${'$'}ref: '#/components/schemas/NullValue' }
                    Choice:
                      nullable: true
                      oneOf:
                        - type: string
                        - ${'$'}ref: '#/components/schemas/NullAlias'
                """.trimIndent(),
            )
        val oneOf = document.schema("Choice").compositions.single { it.kind == CompositionKind.ONE_OF }

        assertEquals(2, oneOf.branches.size)
        assertTrue(document.schema("NullValue").acceptsOnlyNull)
    }

    @Test
    fun `nullable allOf with own type uses typed nullable mapping not composition ambiguity policy`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Typed allOf, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Base: { type: object }
                    Value:
                      type: object
                      nullable: true
                      allOf:
                        - ${'$'}ref: '#/components/schemas/Base'
                """.trimIndent(),
            )

        assertEquals(Nullability.NULLABLE, document.schema("Value").nullability)
        assertTrue(document.diagnostics.any { it.code == DiagnosticCode.NULLABLE_TYPE_NORMALIZED })
        assertTrue(document.diagnostics.none { it.code == DiagnosticCode.NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE })
    }

    @Test
    fun `component nullable ref alias is wrapped diagnosed and nested chains preserve nullability`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Nullable aliases, version: 1.0.0 }
                paths:
                  /alias:
                    post:
                      operationId: alias
                      requestBody:
                        required: true
                        content:
                          application/json:
                            schema: { ${'$'}ref: '#/components/schemas/NestedAlias' }
                      responses:
                        '200':
                          description: ok
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/NestedAlias' }
                components:
                  schemas:
                    Target: { type: string }
                    NullableAlias:
                      ${'$'}ref: '#/components/schemas/Target'
                      nullable: true
                    NestedAlias: { ${'$'}ref: '#/components/schemas/NullableAlias' }
                    Holder:
                      type: object
                      properties:
                        value: { ${'$'}ref: '#/components/schemas/NestedAlias' }
                """.trimIndent(),
            )

        assertEquals(Nullability.NULLABLE, document.schema("NullableAlias").nullability)
        assertTrue(
            document.diagnostics.any {
                it.code == DiagnosticCode.NULLABLE_REFERENCE_SIBLING &&
                    it.source.jsonPointer == "/components/schemas/NullableAlias/nullable"
            },
        )
        val holderValue = document.schema("Holder").properties.single { it.name == "value" }
        assertEquals(Nullability.NULLABLE, holderValue.nullability)
    }

    @Test
    fun `binary and byte formats expose 3 1 content keyword semantics with diagnostics`() {
        val document =
            adaptYaml(
                """
                openapi: 3.0.3
                info: { title: Content keywords, version: 1.0.0 }
                paths: {}
                components:
                  schemas:
                    Upload: { type: string, format: binary }
                    Encoded: { type: string, format: byte }
                """.trimIndent(),
            )

        assertEquals("application/octet-stream", document.schema("Upload").contentMediaType)
        assertEquals("base64", document.schema("Encoded").contentEncoding)
        assertEquals(
            setOf(
                "/components/schemas/Upload/format",
                "/components/schemas/Encoded/format",
            ),
            document.diagnostics
                .filter { it.code == DiagnosticCode.CONTENT_KEYWORD_NORMALIZED }
                .map { it.source.jsonPointer }
                .toSet(),
        )
    }

    @Test
    fun `stress fixture 17 proves every normalized construct and pointer specific diagnostic`() {
        val document = adapter.adapt(ExperimentSupport.stressFixtures[16]).document
        val pet = document.schema("Pet")
        val nullableStatus = document.schema("NullableStatus")
        val boundedScore = document.schema("BoundedScore")
        val uploadSchema =
            document.operations.single().requestBody?.content?.single()?.schema?.let {
                document.schemas.getValue(
                    it.schemaId,
                )
            }
        val uploadProperties = uploadSchema?.properties.orEmpty().associateBy { it.name }
        val diagnosticPointers = document.diagnostics.map { it.code to it.source.jsonPointer }.toSet()

        assertTrue(nullableStatus.enum?.values?.contains(JsonValue.Null) == true)
        assertEquals(JsonValue.NumberValue("0"), boundedScore.constraints["exclusiveMinimum"])
        assertEquals(
            1,
            pet.compositions
                .single()
                .branches
                .count { document.schemas.getValue(it.schemaId).acceptsOnlyNull },
        )
        assertEquals(
            "application/octet-stream",
            uploadProperties
                .getValue("file")
                .schema
                .resolve(document)
                .contentMediaType,
        )
        assertEquals(
            "base64",
            uploadProperties
                .getValue("checksum")
                .schema
                .resolve(document)
                .contentEncoding,
        )
        assertTrue(
            DiagnosticCode.NULLABLE_TYPE_NORMALIZED to "/components/schemas/NullableName/nullable" in
                diagnosticPointers,
        )
        assertTrue(
            DiagnosticCode.NULLABLE_REFERENCE_SIBLING to
                "/components/schemas/Person/properties/homeAddress/nullable" in diagnosticPointers,
        )
        assertTrue(
            DiagnosticCode.CONTENT_KEYWORD_NORMALIZED to
                "/paths/~1uploads/post/requestBody/content/multipart~1form-data/schema/properties/file/format" in
                diagnosticPointers,
        )
    }

    private fun adaptYaml(yaml: String): SemanticDocument {
        val source = Files.createTempFile("sdkgen-30-normalization-", ".yaml")
        return try {
            source.writeText(yaml)
            adapter.adapt(source).document
        } finally {
            Files.deleteIfExists(source)
        }
    }
}

private fun SemanticDocument.schema(name: String): SchemaModel =
    schemas.values.single { it.id.value.endsWith("/components/schemas/$name") }

private fun com.nabobery.sdkgen.model.SchemaRef.resolve(document: SemanticDocument): SchemaModel =
    document.schemas.getValue(schemaId)
