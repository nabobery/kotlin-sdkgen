package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.engine.config.RetryDefaults
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.engine.emit.KotlinPoetEmitter
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.openapi.SemanticAdapter
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.parser.OpenAPIV3Parser
import io.swagger.v3.parser.core.models.ParseOptions
import java.nio.file.Files
import java.nio.file.Path
import kotlin.coroutines.cancellation.CancellationException
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertNotEquals
import kotlin.test.assertSame
import kotlin.test.assertTrue

class StandardProjectionTest {
    @Test
    fun projectsTypedRequestAndResponseWithConfiguredDeadlines() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info:
                  title: Widgets
                  version: "1"
                paths:
                  /widgets:
                    post:
                      operationId: createWidget
                      requestBody:
                        required: true
                        content:
                          application/json:
                            schema:
                              ${'$'}ref: '#/components/schemas/WidgetRequest'
                      responses:
                        '201':
                          description: Created
                          content:
                            application/json:
                              schema:
                                ${'$'}ref: '#/components/schemas/WidgetResponse'
                components:
                  schemas:
                    WidgetRequest:
                      type: object
                      required: [name]
                      properties:
                        name:
                          type: string
                    WidgetResponse:
                      type: object
                      required: [id]
                      properties:
                        id:
                          type: string
                """,
            )

        val result = project(document, requestTimeoutMillis = 12_345)
        val operation = result.operations.single()

        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "WidgetRequest"), operation.requestType)
        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "WidgetResponse"), operation.responseType)
        assertEquals(OperationDeadlines(12_345, 12_345, null), operation.deadlines)
    }

    @Test
    fun configuredModelAndOperationPrefixesAreAppliedToProjectedNames() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Prefixes, version: "1" }
                paths:
                  /widgets:
                    get:
                      operationId: listWidgets
                      responses:
                        '200':
                          description: ok
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/Widget' }
                components:
                  schemas:
                    Widget:
                      type: object
                      properties:
                        id: { type: string }
                """,
            )

        val mapping = projectMapping(document, modelPrefix = "Api", operationPrefix = "fetch")
        val declarations = mapping.model.files.flatMap(KotlinFileDeclaration::declarations)
        val client = declarations.filterIsInstance<OperationClientDeclaration>().single { it.operations.isNotEmpty() }

        assertTrue(declarations.any { declaration -> declaration.resolvedName == "ApiWidget" })
        assertEquals("fetchListWidgets", client.operations.single().operationId)
    }

    @Test
    fun optionalRequestBodyIsNullableAtTheOperationBoundary() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Optional body, version: "1" }
                paths:
                  /optional:
                    post:
                      operationId: optionalBody
                      requestBody:
                        content:
                          application/json:
                            schema: { ${'$'}ref: '#/components/schemas/Payload' }
                      responses: { '204': { description: ok } }
                components:
                  schemas:
                    Payload:
                      type: object
                      properties: { value: { type: string } }
                """,
            )

        val operation = project(document).operations.single()

        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "Payload", nullable = true), operation.requestType)
        assertEquals(false, operation.requestBodyRequired)
        assertEquals(false, operation.requestBodyAlternatives.single().required)
    }

    @Test
    fun carriesNullabilityThroughNestedTypesAndKeepsRequirednessSeparate() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Optionality, version: "1" }
                paths:
                  /nullable:
                    post:
                      operationId: createNullable
                      parameters:
                        - name: filter
                          in: query
                          schema: { type: [string, "null"] }
                      requestBody:
                        required: true
                        content:
                          application/json:
                            schema: { ${'$'}ref: '#/components/schemas/NullablePayload' }
                      responses:
                        '200':
                          description: ok
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/NullablePayload' }
                components:
                  schemas:
                    NullablePayload:
                      type: [object, "null"]
                      required: [requiredMaybe]
                      properties:
                        requiredMaybe: { type: [string, "null"] }
                        optionalMaybe: { type: [string, "null"] }
                        nested: { type: array, items: { type: [string, "null"] } }
                """,
            )

        val mapping = projectMapping(document)
        val declarations = mapping.model.files.flatMap(KotlinFileDeclaration::declarations)
        val model = declarations.filterIsInstance<ModelDeclaration>().single { it.resolvedName == "NullablePayload" }
        val fields = model.fields.associateBy(FieldDeclaration::wireName)
        val stringNullable = KotlinTypeRef("kotlin", "String", nullable = true)

        assertEquals(stringNullable, fields.getValue("requiredMaybe").type)
        assertEquals(true, fields.getValue("requiredMaybe").required)
        assertEquals(true, fields.getValue("requiredMaybe").nullable)
        assertEquals(stringNullable, fields.getValue("optionalMaybe").type)
        assertEquals(false, fields.getValue("optionalMaybe").required)
        assertEquals(
            KotlinTypeRef("kotlin.collections", "List", listOf(stringNullable)),
            fields.getValue("nested").type,
        )
        val operation =
            declarations
                .filterIsInstance<OperationClientDeclaration>()
                .single { it.operations.isNotEmpty() }
                .operations
                .single()
        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "NullablePayload", nullable = true), operation.requestType)
        assertEquals(true, operation.requestBodyRequired)
        assertEquals(stringNullable, operation.parameters.single().type)
        assertEquals(false, operation.parameters.single().required)
    }

    @Test
    fun propagatesTransparentAllOfAnnotationNullabilityThroughEveryTypeUse() {
        val document =
            adapt(
                """
                openapi: 3.0.3
                info: { title: Transparent allOf nullability, version: "1" }
                paths:
                  /values:
                    get:
                      operationId: listValues
                      parameters:
                        - name: value
                          in: query
                          required: true
                          schema: { ${'$'}ref: '#/components/schemas/NullableValue' }
                      responses: { '204': { description: ok } }
                components:
                  schemas:
                    Value:
                      type: string
                    NullableValue:
                      allOf:
                        - ${'$'}ref: '#/components/schemas/Value'
                        - nullable: true
                    Container:
                      type: object
                      properties:
                        values:
                          type: array
                          items: { ${'$'}ref: '#/components/schemas/NullableValue' }
                """,
            )

        val mapping = projectMapping(document)
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.joinToString { it.message })
        val declarations = mapping.model.files.flatMap(KotlinFileDeclaration::declarations)
        val operation =
            declarations
                .filterIsInstance<OperationClientDeclaration>()
                .single { it.operations.isNotEmpty() }
                .operations
                .single()
        val container = declarations.filterIsInstance<ModelDeclaration>().single { it.resolvedName == "Container" }
        val nullableString = KotlinTypeRef("kotlin", "String", nullable = true)

        assertEquals(nullableString, operation.parameters.single().type)
        assertEquals(
            KotlinTypeRef("kotlin.collections", "List", listOf(nullableString)),
            container.fields.single().type,
        )
    }

    @Test
    fun emitsCompleteComponentAndInlineDeclarationGraph() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Graph, version: "1" }
                paths:
                  /widgets:
                    post:
                      operationId: createWidget
                      requestBody:
                        required: true
                        content:
                          application/json:
                            schema:
                              type: object
                              required: [profile]
                              properties:
                                profile:
                                  type: object
                                  required: [nickname]
                                  properties:
                                    nickname: { type: string }
                      responses:
                        '200':
                          description: Created
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/Result' }
                components:
                  schemas:
                    User:
                      type: object
                      required: [id]
                      properties:
                        id: { type: string }
                    Error:
                      type: object
                      required: [code]
                      properties:
                        code: { type: integer }
                    Status:
                      type: string
                      enum: [active, retired]
                    Result:
                      oneOf:
                        - ${'$'}ref: '#/components/schemas/User'
                        - ${'$'}ref: '#/components/schemas/Error'
                """,
            )

        val mapping = projectMapping(document)
        val declarations = mapping.model.files.flatMap(KotlinFileDeclaration::declarations)
        val declaredNames = declarations.map(Declaration::resolvedName).toSet()
        val client = declarations.filterIsInstance<OperationClientDeclaration>().single { it.operations.isNotEmpty() }
        val operation = client.operations.single()

        assertTrue("User" in declaredNames)
        assertTrue("Error" in declaredNames)
        assertTrue("Status" in declaredNames)
        assertTrue(declarations.any { it.resolvedName.startsWith("Inline") })
        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "Result"), operation.responseType)
        assertTrue(operation.requestType.simpleName.startsWith("Inline"))
        assertTrue(mapping.diagnostics.none { it.symbolId == "operation:createWidget" })
        assertTrue(mapping.diagnostics.none { it.code == GenerationDiagnosticCode.UNREPRESENTABLE_SCHEMA })
    }

    @Test
    fun projectsRequiredOnlyOneOfBranchesAgainstEnclosingObjectProperties() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Required branch API, version: "1" }
                paths: {}
                components:
                  schemas:
                    Campaign:
                      type: object
                      additionalProperties: false
                      required: [name]
                      properties:
                        name: { type: string }
                        codeAlerts: { type: array, items: { type: integer } }
                        secretAlerts: { type: array, items: { type: integer } }
                      oneOf:
                        - required: [codeAlerts]
                        - required: [secretAlerts]
                """,
            )

        val declaration =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OneOfDeclaration>()
                .single { it.resolvedName == "Campaign" }

        assertEquals(2, declaration.cases.size)
        assertEquals(
            setOf("name", "codeAlerts"),
            declaration.cases[0]
                .requiredFields
                .map(UnionFieldDeclaration::wireName)
                .toSet(),
        )
        assertEquals(listOf("codeAlerts"), declaration.cases[0].matchFields.map(UnionFieldDeclaration::wireName))
        assertEquals(
            setOf("name", "secretAlerts"),
            declaration.cases[1]
                .requiredFields
                .map(UnionFieldDeclaration::wireName)
                .toSet(),
        )
        assertEquals(listOf("secretAlerts"), declaration.cases[1].matchFields.map(UnionFieldDeclaration::wireName))
    }

    @Test
    fun projectsPairwiseDisjointDiscriminatorEnumSetsAsExactMatchFields() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Discriminator API, version: "1" }
                paths: {}
                components:
                  schemas:
                    CheckRun:
                      type: object
                      properties:
                        status: { type: string }
                        additionalProperties: { type: string }
                        conclusion: { type: string }
                      discriminator: { propertyName: status }
                      oneOf:
                        - properties:
                            status: { type: string, enum: [completed] }
                          required: [status, conclusion]
                        - properties:
                            status: { type: string, enum: [queued, in_progress] }
                """,
            )

        val declaration =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OneOfDeclaration>()
                .single { it.resolvedName == "CheckRun" }

        assertEquals(2, declaration.cases.size)
        assertEquals(
            listOf("completed"),
            declaration.cases[0]
                .matchFields
                .single()
                .expectedStringValues,
        )
        assertEquals(
            listOf("in_progress", "queued"),
            declaration.cases[1]
                .matchFields
                .single()
                .expectedStringValues,
        )
        declaration.cases.forEach { case ->
            assertEquals(listOf("status"), case.matchFields.map(UnionFieldDeclaration::wireName))
            assertTrue(case.requiredFields.any { field -> field.wireName == "status" })
        }
    }

    @Test
    fun projectsUndiscriminatedObjectOneOfSingletonEnumsAsExactRawMatchFields() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Repository rules API, version: "1" }
                paths: {}
                components:
                  schemas:
                    RepositoryRule:
                      oneOf:
                        - type: object
                          required: [type]
                          properties:
                            type: { type: string, enum: [creation] }
                        - type: object
                          required: [type]
                          properties:
                            type: { type: string, enum: [update] }
                """,
            )

        val declaration =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OneOfDeclaration>()
                .single { it.resolvedName == "RepositoryRule" }

        assertEquals(
            listOf(listOf("creation"), listOf("update")),
            declaration.cases.map { case ->
                case.matchFields.single { field -> field.wireName == "type" }.expectedStringValues
            },
        )
    }

    @Test
    fun projectsClosedEmptyObjectAsAnExactOneOfCase() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Empty object API, version: "1" }
                paths: {}
                components:
                  schemas:
                    Empty:
                      type: object
                      properties: {}
                      additionalProperties: false
                    User:
                      type: object
                      required: [id]
                      properties:
                        id: { type: integer }
                    Actor:
                      oneOf:
                        - { ${'$'}ref: '#/components/schemas/Empty' }
                        - { ${'$'}ref: '#/components/schemas/User' }
                """,
            )

        val declaration =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OneOfDeclaration>()
                .single { it.resolvedName == "Actor" }

        assertTrue(declaration.cases[0].matchesEmptyObject)
        assertTrue(declaration.cases[0].requiredFields.isEmpty())
        assertEquals(listOf("id"), declaration.cases[1].matchFields.map(UnionFieldDeclaration::wireName))
    }

    @Test
    fun fixedPointClosureExcludesParentThatSortsBeforeItsFailedInlineChild() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Closure, version: "1" }
                paths: {}
                components:
                  schemas:
                    Parent:
                      type: object
                      properties:
                        child:
                          allOf:
                            - type: object
                              properties: { id: { type: string } }
                            - type: object
                              properties: { id: { type: integer } }
                """,
            )

        val mapping = projectMapping(document)
        val exclusions = mapping.exclusions

        assertEquals(2, exclusions.size)
        assertTrue(exclusions.any { exclusion -> exclusion.symbolId == "schema:Parent" })
        assertTrue(exclusions.any { exclusion -> exclusion.source.jsonPointer.endsWith("/properties/child") })
        assertTrue(
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .none { it.resolvedName == "Parent" },
        )
    }

    @Test
    fun rejectsObjectOneOfBranchesWhoseUnsupportedConstraintsWouldOtherwiseMatchEverything() {
        listOf(
            "minProperties: 1",
            "maxProperties: 1",
            "unevaluatedProperties: false",
        ).forEach { assertion ->
            val document =
                adapt(
                    """
                    openapi: 3.1.0
                    info: { title: Object constraint, version: "1" }
                    paths: {}
                    components:
                      schemas:
                        Choice:
                          oneOf:
                            - type: object
                              $assertion
                            - type: string
                    """.trimIndent(),
                )

            val mapping = projectMapping(document)

            assertTrue(
                mapping.exclusions.any { exclusion -> exclusion.symbolId == "schema:Choice" },
                "Expected '$assertion' to fail closed, but got ${mapping.exclusions}",
            )
        }
    }

    @Test
    fun projectsConstrainedPrimitiveOneOfBranchesForExactPredicateEmission() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Constrained primitive union API, version: "1" }
                paths: {}
                components:
                  schemas:
                    ConstrainedValue:
                      oneOf:
                        - type: integer
                          minimum: 1
                          multipleOf: 2
                        - type: number
                          maximum: 2.5
                        - type: string
                          enum: [ready, pending]
                        - type: string
                          format: date-time
                """,
            )

        val mapping = projectMapping(document)
        val declaration =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<PrimitiveOneOfDeclaration>()
                .single { it.resolvedName == "ConstrainedValue" }

        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())
        assertEquals(4, declaration.cases.size)
    }

    @Test
    fun projectsPrimitiveOneOfBranchesAsAClosedTypedUnion() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Primitive union API, version: "1" }
                paths: {}
                components:
                  schemas:
                    Timestamp:
                      oneOf:
                        - { type: integer, format: int64 }
                        - { type: string, format: date-time }
                """,
            )

        val declaration =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<PrimitiveOneOfDeclaration>()
                .single { it.resolvedName == "Timestamp" }

        assertEquals(
            listOf(
                KotlinTypeRef("kotlin", "Long"),
                KotlinTypeRef("kotlin", "String"),
            ),
            declaration.cases.map(PrimitiveOneOfCaseDeclaration::type),
        )
    }

    @Test
    fun projectsUndiscriminatedObjectOneOfBranchesThroughTheClosedTypedUnion() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Object union API, version: "1" }
                paths: {}
                components:
                  schemas:
                    Creator:
                      oneOf:
                        - type: object
                          properties:
                            login: { type: string }
                        - type: object
                          properties:
                            id: { type: integer }
                """,
            )

        val declaration =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<PrimitiveOneOfDeclaration>()
                .single { it.resolvedName == "Creator" }

        assertEquals(
            listOf(PrimitiveOneOfJsonKind.OBJECT, PrimitiveOneOfJsonKind.OBJECT),
            declaration.cases.map(PrimitiveOneOfCaseDeclaration::jsonKind),
        )
    }

    @Test
    fun projectsResponseAlternativesSecurityAndRuntimeDescriptors() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Descriptor API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      security:
                        - apiKey: []
                          oauth: [items:read]
                        - {}
                      x-sdkgen-pagination:
                        style: cursor
                        requestCursor: cursor
                        requestLimit: limit
                        responseItems: /data
                        responseNextCursor: /nextCursor
                      x-sdkgen-idempotency:
                        keyHeader: Idempotency-Key
                        clientGenerated: true
                      parameters:
                        - { name: cursor, in: query, schema: { type: string } }
                        - { name: limit, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Exact response
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                        2XX:
                          description: Range response
                          content:
                            application/vnd.items+json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                        default:
                          description: Error response
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ApiError' }
                  /events:
                    get:
                      operationId: streamEvents
                      x-sdkgen-streaming:
                        mode: sse
                        responseContentType: text/event-stream
                        sentinel: '[DONE]'
                      responses:
                        '200':
                          description: Events
                          content:
                            text/event-stream:
                              schema: { ${'$'}ref: '#/components/schemas/Event' }
                components:
                  securitySchemes:
                    apiKey: { type: apiKey, in: header, name: X-Api-Key }
                    oauth: { type: oauth2, flows: { clientCredentials: { tokenUrl: https://example.test/token, scopes: {} } } }
                  schemas:
                    ItemPage: { type: object, properties: { data: { type: array, items: { type: string } }, nextCursor: { type: string } } }
                    ApiError: { type: object, properties: { message: { type: string } } }
                    Event: { type: object, properties: { id: { type: string } } }
                """,
            )

        val client = project(document)
        val operations = client.operations.associateBy(OperationDeclaration::operationId)
        val list = operations.getValue("listItems")
        assertEquals(setOf("apiKey", "oauth"), client.securitySchemes.keys)
        assertEquals(
            OperationSecuritySchemeDeclaration.ApiKey(OperationParameterLocation.HEADER, "X-Api-Key"),
            client.securitySchemes.getValue("apiKey"),
        )
        assertEquals(
            OperationSecuritySchemeDeclaration.Unsupported("oauth2"),
            client.securitySchemes.getValue("oauth"),
        )

        assertEquals(
            listOf(
                OperationResponseAlternative(
                    ResponseSelectorDeclaration.ExactStatus(200),
                    listOf("application/json"),
                    KotlinTypeRef(GENERATED_PACKAGE, "ItemPage"),
                ),
                OperationResponseAlternative(
                    ResponseSelectorDeclaration.StatusRange(200, 299),
                    listOf("application/vnd.items+json"),
                    KotlinTypeRef(GENERATED_PACKAGE, "ItemPage"),
                ),
                OperationResponseAlternative(
                    ResponseSelectorDeclaration.Default,
                    listOf("application/json"),
                    KotlinTypeRef(GENERATED_PACKAGE, "ApiError"),
                ),
            ),
            list.responseAlternatives,
        )
        assertEquals(
            listOf(
                OperationSecurityRequirement(
                    schemes =
                        listOf(
                            OperationSecuritySchemeRef("apiKey"),
                            OperationSecuritySchemeRef("oauth", listOf("items:read")),
                        ),
                ),
                OperationSecurityRequirement(schemes = emptyList()),
            ),
            list.security,
        )
        assertEquals(
            listOf(
                OperationParameterDeclaration(
                    name = "cursor",
                    location = OperationParameterLocation.QUERY,
                    type = KotlinTypeRef("kotlin", "String"),
                    required = false,
                    style = "form",
                    explode = true,
                ),
                OperationParameterDeclaration(
                    name = "limit",
                    location = OperationParameterLocation.QUERY,
                    type = KotlinTypeRef("kotlin", "Int"),
                    required = false,
                    style = "form",
                    explode = true,
                ),
            ),
            list.parameters,
        )
        assertEquals(
            PaginationDeclaration.CursorToken(
                "cursor",
                "limit",
                "data",
                "nextCursor",
                KotlinTypeRef("kotlin", "String"),
            ),
            list.pagination,
        )
        assertEquals(IdempotencyDeclaration("Idempotency-Key", clientGenerated = true), list.idempotency)
        assertEquals(3, list.retry.maxAttempts)
        assertEquals(OperationSafetyDeclaration(safe = true, idempotent = true), list.safety)
        assertEquals(false, list.requestBodyRequired)

        val stream = operations.getValue("streamEvents")
        assertEquals(
            StreamingDeclaration.ServerSentEvents(terminalSentinel = "[DONE]"),
            stream.streaming,
        )
        val streaming = stream.streaming as StreamingDeclaration.ServerSentEvents
        assertEquals("text/event-stream", streaming.responseContentType)
        assertEquals(null, streaming.requestFlag)
        assertEquals(OperationResponseMode.STREAMING, stream.responseMode)
        assertEquals(OperationResponseMode.STREAMING, stream.responseAlternatives.single().mode)
        assertEquals(OperationDeadlines(null, 60_000, null), stream.deadlines)
    }

    @Test
    fun projectsHeaderNextUrlPaginationWithoutCursorOrLimitFields() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: GitHub-shaped API, version: "1" }
                paths:
                  /repos/{owner}/{repo}/issues:
                    get:
                      operationId: listIssues
                      x-sdkgen-pagination:
                        style: headerNextUrl
                        responseItems: /items
                      parameters:
                        - { name: owner, in: path, required: true, schema: { type: string } }
                        - { name: repo, in: path, required: true, schema: { type: string } }
                      responses:
                        '200':
                          description: Issues
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/IssuePage' }
                components:
                  schemas:
                    IssuePage:
                      type: object
                      properties:
                        items: { type: array, items: { type: string } }
                """,
            )

        val client = project(document)
        val list = client.operations.single()

        assertEquals(
            PaginationDeclaration.HeaderNextUrl("items", KotlinTypeRef("kotlin", "String")),
            list.pagination,
        )
    }

    @Test
    fun projectsOffsetLimitPaginationWithIntegralParametersAndDeclaredTotal() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
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
                      parameters:
                        - { name: offset, in: query, schema: { type: integer } }
                        - { name: limit, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        data: { type: array, items: { type: string } }
                        total: { type: integer }
                """,
            )

        val list = project(document).operations.single()

        assertEquals(
            PaginationDeclaration.OffsetLimit(
                requestOffsetParam = "offset",
                requestLimitParam = "limit",
                responseItemsPath = "data",
                responseTotalPath = "total",
                itemType = KotlinTypeRef("kotlin", "String"),
            ),
            list.pagination,
        )
    }

    @Test
    fun projectsOffsetLimitPaginationWithoutADeclaredTotal() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /data
                      parameters:
                        - { name: offset, in: query, schema: { type: integer } }
                        - { name: limit, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        data: { type: array, items: { type: string } }
                """,
            )

        val list = project(document).operations.single()

        assertEquals(
            PaginationDeclaration.OffsetLimit(
                requestOffsetParam = "offset",
                requestLimitParam = "limit",
                responseItemsPath = "data",
                responseTotalPath = null,
                itemType = KotlinTypeRef("kotlin", "String"),
            ),
            list.pagination,
        )
    }

    @Test
    fun rejectsOffsetLimitPaginationWhenAReferencedParameterIsMissing() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /data
                      parameters:
                        - { name: limit, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        data: { type: array, items: { type: string } }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single { it.symbolId == "operation:listItems" }
        assertTrue(
            diagnostic.message.contains("offset parameter 'offset' is not declared on the operation"),
            diagnostic.message,
        )
    }

    @Test
    fun rejectsOffsetLimitPaginationWhenAParameterIsNotInQuery() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /data
                      parameters:
                        - { name: offset, in: header, schema: { type: integer } }
                        - { name: limit, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        data: { type: array, items: { type: string } }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single { it.symbolId == "operation:listItems" }
        assertTrue(
            diagnostic.message.contains("offset parameter 'offset' must be declared in: query"),
            diagnostic.message,
        )
    }

    @Test
    fun projectsOffsetLimitPaginationWhenAPathParameterSharesTheOffsetName() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
                paths:
                  /items/{offset}:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /data
                      parameters:
                        - { name: offset, in: path, required: true, schema: { type: string } }
                        - { name: offset, in: query, schema: { type: integer } }
                        - { name: limit, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        data: { type: array, items: { type: string } }
                """,
            )

        val list = project(document).operations.single()

        // Parameter identity is (name, in): the non-integral path twin must be ignored, not rejected.
        assertEquals(
            PaginationDeclaration.OffsetLimit(
                requestOffsetParam = "offset",
                requestLimitParam = "limit",
                responseItemsPath = "data",
                responseTotalPath = null,
                itemType = KotlinTypeRef("kotlin", "String"),
            ),
            list.pagination,
        )
    }

    @Test
    fun rejectsOffsetLimitPaginationWhenAParameterIsNotIntegral() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /data
                      parameters:
                        - { name: offset, in: query, schema: { type: string } }
                        - { name: limit, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        data: { type: array, items: { type: string } }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single { it.symbolId == "operation:listItems" }
        assertTrue(
            diagnostic.message.contains("offset parameter 'offset' must be an integer, was String"),
            diagnostic.message,
        )
    }

    @Test
    fun rejectsOffsetLimitPaginationWhenTheLimitIsInt64() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /data
                      parameters:
                        - { name: offset, in: query, schema: { type: integer } }
                        - { name: limit, in: query, schema: { type: integer, format: int64 } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        data: { type: array, items: { type: string } }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single { it.symbolId == "operation:listItems" }
        assertTrue(
            diagnostic.message.contains("limit parameter 'limit' projects to Long (int64)"),
            diagnostic.message,
        )
    }

    @Test
    fun rejectsOffsetLimitPaginationWhenOffsetAndLimitNameTheSameParameter() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: page
                        requestLimit: page
                        responseItems: /data
                      parameters:
                        - { name: page, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        data: { type: array, items: { type: string } }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single { it.symbolId == "operation:listItems" }
        assertTrue(
            diagnostic.message.contains("offset and limit must name distinct parameters, both name 'page'"),
            diagnostic.message,
        )
    }

    @Test
    fun rejectsOffsetLimitPaginationWhenResponseTotalIsNotIntegral() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /data
                        responseTotal: /label
                      parameters:
                        - { name: offset, in: query, schema: { type: integer } }
                        - { name: limit, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        data: { type: array, items: { type: string } }
                        label: { type: string }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single { it.symbolId == "operation:listItems" }
        assertTrue(
            diagnostic.message.contains("responseTotal '/label' must point at an integer field, was String"),
            diagnostic.message,
        )
    }

    @Test
    fun rejectsOffsetLimitPaginationWhenAResponsePathSegmentContainsADot() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /data.rows
                      parameters:
                        - { name: offset, in: query, schema: { type: integer } }
                        - { name: limit, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        data: { type: array, items: { type: string } }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single { it.symbolId == "operation:listItems" }
        assertTrue(
            diagnostic.message.contains("path segment 'data.rows' contains '.'"),
            diagnostic.message,
        )
    }

    @Test
    fun rejectsOffsetLimitPaginationWhenAResponsePathTraversesAnOptionalIntermediate() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /page/data
                      parameters:
                        - { name: offset, in: query, schema: { type: integer } }
                        - { name: limit, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        page:
                          type: object
                          properties:
                            data: { type: array, items: { type: string } }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single { it.symbolId == "operation:listItems" }
        assertTrue(
            diagnostic.message.contains("traverses optional or nullable intermediate 'page'"),
            diagnostic.message,
        )
    }

    @Test
    fun rejectsOffsetLimitPaginationWhenAResponsePathTraversesARequiredButNullableIntermediate() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Offset API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: offsetLimit
                        requestOffset: offset
                        requestLimit: limit
                        responseItems: /page/data
                      parameters:
                        - { name: offset, in: query, schema: { type: integer } }
                        - { name: limit, in: query, schema: { type: integer } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      required: [page]
                      properties:
                        page:
                          type: [object, "null"]
                          properties:
                            data: { type: array, items: { type: string } }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single { it.symbolId == "operation:listItems" }
        assertTrue(
            diagnostic.message.contains("traverses optional or nullable intermediate 'page'"),
            diagnostic.message,
        )
    }

    @Test
    fun rejectsCursorPaginationWhenTheCursorParameterIsNotInQuery() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Cursor API, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      x-sdkgen-pagination:
                        style: cursor
                        requestCursor: cursor
                        responseItems: /data
                        responseNextCursor: /next
                      parameters:
                        - { name: cursor, in: header, schema: { type: string } }
                      responses:
                        '200':
                          description: Items
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ItemPage' }
                components:
                  schemas:
                    ItemPage:
                      type: object
                      properties:
                        data: { type: array, items: { type: string } }
                        next: { type: string }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single { it.symbolId == "operation:listItems" }
        assertTrue(
            diagnostic.message.contains("cursor pagination cursor parameter 'cursor' must be declared in: query"),
            diagnostic.message,
        )
    }

    @Test
    fun projectsMultipartPartsAndBinaryBodiesWithoutPlatformTypes() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Uploads, version: "1" }
                paths:
                  /uploads:
                    post:
                      operationId: uploadAsset
                      requestBody:
                        required: true
                        content:
                          multipart/form-data:
                            schema:
                              type: object
                              required: [file, metadata]
                              properties:
                                file: { type: string, format: binary }
                                metadata: { ${'$'}ref: '#/components/schemas/Metadata' }
                                caption: { type: string }
                            encoding:
                              file:
                                contentType: image/png
                                headers:
                                  X-Part-Checksum:
                                    schema: { type: string }
                              metadata:
                                contentType: application/json
                      responses:
                        '204': { description: Uploaded }
                  /downloads/{id}:
                    get:
                      operationId: downloadAsset
                      parameters:
                        - { name: id, in: path, required: true, schema: { type: string } }
                      responses:
                        '200':
                          description: Binary download
                          content:
                            application/octet-stream:
                              schema: { type: string, format: binary }
                components:
                  schemas:
                    Metadata:
                      type: object
                      properties:
                        title: { type: string }
                """,
            )

        val operations = project(document).operations.associateBy(OperationDeclaration::operationId)
        val upload = operations.getValue("uploadAsset")
        val requestBody = upload.requestBodyAlternatives.single()
        assertEquals(true, requestBody.required)
        val parts = requestBody.multipartParts
        assertEquals(listOf("caption", "file", "metadata"), parts.map(MultipartPartDeclaration::wireName))
        val partsByName = parts.associateBy(MultipartPartDeclaration::wireName)
        val file = partsByName.getValue("file")
        assertEquals(KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"), file.type)
        assertEquals("file", file.accessorName)
        assertEquals(true, file.required)
        assertEquals("image/png", file.contentType)
        assertEquals(listOf("X-Part-Checksum"), file.headers.keys.toList())
        val metadata = partsByName.getValue("metadata")
        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "Metadata"), metadata.type)
        assertEquals(true, metadata.required)
        assertEquals("application/json", metadata.contentType)
        val caption = partsByName.getValue("caption")
        assertEquals(KotlinTypeRef("kotlin", "String"), caption.type)
        assertEquals(false, caption.required)
        assertEquals("text/plain", caption.contentType)

        val download = operations.getValue("downloadAsset")
        assertEquals(
            KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
            download.responseAlternatives.single().type,
        )
    }

    @Test
    fun rejectsRawResponseAlternativesThatCanMatchNonSuccessStatuses() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Unsafe raw responses, version: "1" }
                paths:
                  /exact:
                    get:
                      operationId: exactRawError
                      responses:
                        '200': { description: ok }
                        '404':
                          description: raw error
                          content:
                            application/octet-stream:
                              schema: { type: string, format: binary }
                  /range:
                    get:
                      operationId: rangeRawError
                      responses:
                        '200': { description: ok }
                        '4XX':
                          description: raw error range
                          content:
                            application/octet-stream:
                              schema: { type: string, format: binary }
                  /default:
                    get:
                      operationId: defaultRawError
                      responses:
                        '200': { description: ok }
                        default:
                          description: raw default
                          content:
                            application/octet-stream:
                              schema: { type: string, format: binary }
                """,
            )

        val mapping = projectMapping(document)
        val projectedOperationIds =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .map(OperationDeclaration::operationIdentity)

        assertTrue(projectedOperationIds.none { it in setOf("exactRawError", "rangeRawError", "defaultRawError") })
        assertEquals(
            List(3) { GenerationDiagnosticCode.UNREPRESENTABLE_RAW_RESPONSE_ALTERNATIVE },
            mapping.diagnostics.map(GenerationDiagnostic::code),
        )
        assertTrue(mapping.diagnostics.any { "ExactStatus(code=404)" in it.message })
        assertTrue(mapping.diagnostics.any { "StatusRange(firstInclusive=400, lastInclusive=499)" in it.message })
        assertTrue(mapping.diagnostics.any { "Default" in it.message })
        assertTrue(
            mapping.diagnostics.all { "SdkByteStream" in it.message && "successStatusCodes=[200]" in it.message },
        )
    }

    @Test
    fun safetyAndConnectionRetryMetadataFollowHttpSemanticsAndIdempotency() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Retry semantics, version: "1" }
                paths:
                  /get:
                    get:
                      operationId: getThing
                      responses: { '204': { description: ok } }
                  /post:
                    post:
                      operationId: createThing
                      responses: { '204': { description: ok } }
                  /post-idempotent:
                    post:
                      operationId: createIdempotentThing
                      x-sdkgen-idempotency: { keyHeader: Idempotency-Key, clientGenerated: true }
                      responses: { '204': { description: ok } }
                  /put:
                    put:
                      operationId: replaceThing
                      responses: { '204': { description: ok } }
                  /delete:
                    delete:
                      operationId: deleteThing
                      responses: { '204': { description: ok } }
                """,
            )

        val operations = project(document).operations.associateBy(OperationDeclaration::operationIdentity)
        assertEquals(OperationSafetyDeclaration(safe = true, idempotent = true), operations.getValue("getThing").safety)
        assertEquals(true, operations.getValue("getThing").retry.retryConnectionErrors)
        assertEquals(OperationSafetyDeclaration(), operations.getValue("createThing").safety)
        assertEquals(false, operations.getValue("createThing").retry.retryConnectionErrors)
        assertEquals(
            OperationSafetyDeclaration(safe = false, idempotent = true),
            operations.getValue("createIdempotentThing").safety,
        )
        assertEquals(true, operations.getValue("createIdempotentThing").retry.retryConnectionErrors)
        assertEquals(
            OperationSafetyDeclaration(safe = false, idempotent = true),
            operations.getValue("replaceThing").safety,
        )
        assertEquals(true, operations.getValue("replaceThing").retry.retryConnectionErrors)
        assertEquals(
            OperationSafetyDeclaration(safe = false, idempotent = true),
            operations.getValue("deleteThing").safety,
        )
        assertEquals(true, operations.getValue("deleteThing").retry.retryConnectionErrors)
    }

    @Test
    fun annotationOnlyAllOfBranchIsTransparent() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Annotation allOf, version: "1" }
                paths: {}
                components:
                  schemas:
                    Base:
                      type: object
                      required: [value]
                      properties:
                        value: { type: string }
                    Wrapper:
                      type: object
                      properties:
                        base:
                          allOf:
                            - ${'$'}ref: '#/components/schemas/Base'
                            - description: Field-level documentation.
                """,
            )

        val mapping = projectMapping(document)
        val wrapper =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<ModelDeclaration>()
                .single { declaration -> declaration.resolvedName == "Wrapper" }

        assertTrue(mapping.diagnostics.none { diagnostic -> diagnostic.severity == DiagnosticSeverity.ERROR })
        assertEquals(
            "Base",
            wrapper.fields
                .single()
                .type.simpleName,
        )
    }

    @Test
    fun projectsFormFieldsFromWireNamesAndExplicitDeepObjectMetadata() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /charges:
                    post:
                      operationId: createCharge
                      requestBody:
                        required: true
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              required: [class, amount]
                              properties:
                                class: { type: string }
                                amount: { type: integer }
                                enabled: { type: boolean }
                                mode: { ${'$'}ref: '#/components/schemas/Mode' }
                                details:
                                  type: object
                                  additionalProperties: false
                                  properties:
                                    postal_code: { type: string }
                            encoding:
                              details: { style: deepObject, explode: true }
                      responses: { '204': { description: ok } }
                components:
                  schemas:
                    Mode:
                      type: string
                      enum: [automatic, manual]
                """,
            )

        val alternative =
            project(document)
                .operations
                .single()
                .requestBodyAlternatives
                .single()
        val fields = alternative.formFields.associateBy(FormFieldDeclaration::wireName)

        assertEquals(listOf("amount", "class", "details", "enabled", "mode"), fields.keys.toList())
        assertEquals("classValue", fields.getValue("class").accessorName)
        assertEquals(
            FormScalarKind.INTEGER,
            assertIs<FormValueDeclaration.Scalar>(fields.getValue("amount").value).kind,
        )
        assertEquals(
            FormScalarKind.BOOLEAN,
            assertIs<FormValueDeclaration.Scalar>(fields.getValue("enabled").value).kind,
        )
        assertEquals(
            FormScalarKind.OPEN_ENUM,
            assertIs<FormValueDeclaration.Scalar>(fields.getValue("mode").value).kind,
        )
        val details = assertIs<FormValueDeclaration.Object>(fields.getValue("details").value)
        assertEquals("postalCode", details.fields.single().accessorName)
        assertEquals("postal_code", details.fields.single().wireName)
    }

    @Test
    fun projectsNestedFormObjectsWithPropertiesAndAbsentAdditionalPropertiesAsClosed() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /options:
                    post:
                      operationId: createOptions
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                options:
                                  type: object
                                  properties:
                                    mode: { type: string }
                            encoding:
                              options: { style: deepObject, explode: true }
                      responses: { '204': { description: ok } }
                """,
            )

        val field =
            project(document)
                .operations
                .single()
                .requestBodyAlternatives
                .single()
                .formFields
                .single()
        val options = assertIs<FormValueDeclaration.Object>(field.value)

        assertEquals("mode", options.fields.single().wireName)
    }

    @Test
    fun rejectsNestedFreeFormFormObjects() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /options:
                    post:
                      operationId: createOptions
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                options:
                                  type: object
                                  additionalProperties: true
                            encoding:
                              options: { style: deepObject, explode: true }
                      responses: { '204': { description: ok } }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single()

        assertEquals(
            "Operation 'createOptions' cannot be represented: " +
                "form object declares additionalProperties: true; free-form dynamic form keys are unsupported",
            diagnostic.message,
        )
    }

    @Test
    fun projectsNestedTypedAdditionalPropertiesWithoutFixedPropertiesAsFormMap() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /options:
                    post:
                      operationId: createOptions
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                metadata:
                                  type: object
                                  additionalProperties: { type: string }
                            encoding:
                              metadata: { style: deepObject, explode: true }
                      responses: { '204': { description: ok } }
                """,
            )

        val field =
            project(document)
                .operations
                .single()
                .requestBodyAlternatives
                .single()
                .formFields
                .single()
        val metadata = assertIs<FormValueDeclaration.Map>(field.value)

        assertEquals(FormScalarKind.STRING, assertIs<FormValueDeclaration.Scalar>(metadata.value).kind)
    }

    @Test
    fun rejectsNestedFormObjectsWithoutPropertiesAndAbsentAdditionalProperties() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /options:
                    post:
                      operationId: createOptions
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                options: { type: object }
                            encoding:
                              options: { style: deepObject, explode: true }
                      responses: { '204': { description: ok } }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single()

        assertEquals(
            "Operation 'createOptions' cannot be represented: " +
                "form object declares no properties and omits additionalProperties; " +
                "a form value with no declared shape has no form wire representation",
            diagnostic.message,
        )
    }

    @Test
    fun diagnosesNullableFormAliasesAtEveryValueDepth() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /aliases:
                    post:
                      operationId: nullableAliases
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                top: { ${'$'}ref: '#/components/schemas/NestedNullableAlias' }
                                items:
                                  type: array
                                  items: { ${'$'}ref: '#/components/schemas/NestedNullableAlias' }
                                nested:
                                  type: object
                                  additionalProperties: false
                                  properties:
                                    value: { ${'$'}ref: '#/components/schemas/NestedNullableAlias' }
                            encoding:
                              items: { style: deepObject, explode: true }
                              nested: { style: deepObject, explode: true }
                      responses: { '204': { description: ok } }
                components:
                  schemas:
                    StringTarget: { type: string }
                    NullableStringAlias:
                      ${'$'}ref: '#/components/schemas/StringTarget'
                      nullable: true
                    NestedNullableAlias: { ${'$'}ref: '#/components/schemas/NullableStringAlias' }
                """,
            )

        val mapping = projectMapping(document)
        val diagnostic = mapping.diagnostics.single { it.symbolId == "operation:nullableAliases" }

        assertTrue(diagnostic.message.contains("nullable"))
        assertTrue(diagnostic.source.jsonPointer.contains("/properties/"))
        assertTrue(mapping.exclusions.any { it.symbolId == "operation:nullableAliases" })
    }

    @Test
    fun diagnosesFormRequestsWithAnyOtherMediaAlternativeInEitherDocumentOrder() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /json-first:
                    post:
                      operationId: jsonFirst
                      requestBody:
                        content:
                          application/json:
                            schema: { ${'$'}ref: '#/components/schemas/Request' }
                          application/x-www-form-urlencoded:
                            schema: { ${'$'}ref: '#/components/schemas/Request' }
                      responses: { '204': { description: ok } }
                  /form-first:
                    post:
                      operationId: formFirst
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema: { ${'$'}ref: '#/components/schemas/Request' }
                          application/json:
                            schema: { ${'$'}ref: '#/components/schemas/Request' }
                      responses: { '204': { description: ok } }
                components:
                  schemas:
                    Request:
                      type: object
                      additionalProperties: false
                      properties: { value: { type: string } }
                """,
            )

        val mapping = projectMapping(document)
        listOf("jsonFirst", "formFirst").forEach { operationId ->
            val diagnostic = mapping.diagnostics.single { it.symbolId == "operation:$operationId" }
            assertTrue(diagnostic.message.contains("media alternative"))
            assertTrue(diagnostic.source.jsonPointer.endsWith("/content/application~1json"))
            assertTrue(mapping.exclusions.any { it.symbolId == "operation:$operationId" })
        }
    }

    @Test
    fun projectsTypedAdditionalPropertiesAsOrderedFormMaps() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /map:
                    post:
                      operationId: typedMap
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                metadata:
                                  type: object
                                  additionalProperties: { type: string }
                            encoding:
                              metadata: { style: deepObject, explode: true }
                      responses: { '204': { description: ok } }
                """,
            )

        val field =
            project(document)
                .operations
                .single()
                .requestBodyAlternatives
                .single()
                .formFields
                .single()
        val map = assertIs<FormValueDeclaration.Map>(field.value)
        assertEquals(FormScalarKind.STRING, assertIs<FormValueDeclaration.Scalar>(map.value).kind)
        assertEquals("Map", field.type.simpleName)
    }

    @Test
    fun diagnosesOpenRootFormObjectsBeforeAcceptingEmptyProperties() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /implicit:
                    post:
                      operationId: implicitOpen
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema: { type: object }
                      responses: { '204': { description: ok } }
                  /free-form:
                    post:
                      operationId: freeForm
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema: { type: object, additionalProperties: true }
                      responses: { '204': { description: ok } }
                  /typed:
                    post:
                      operationId: typedOpen
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              properties: { fixed: { type: string } }
                              additionalProperties: { type: string }
                      responses: { '204': { description: ok } }
                """,
            )

        val diagnostics = projectMapping(document).diagnostics.associateBy(GenerationDiagnostic::symbolId)

        listOf("implicitOpen", "freeForm", "typedOpen").forEach { operationId ->
            val diagnostic = diagnostics.getValue("operation:$operationId")
            assertTrue(diagnostic.message.contains("additionalProperties"))
            assertTrue(diagnostic.source.jsonPointer.contains("/schema"))
        }
    }

    @Test
    fun projectsMetadataGatedIndexedDeepObjectArraysRecursively() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /array:
                    post:
                      operationId: arrayDeepObject
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                values:
                                  type: array
                                  items:
                                    type: object
                                    additionalProperties: false
                                    properties:
                                      labels: { type: array, items: { type: string } }
                            encoding:
                              values: { style: deepObject, explode: true }
                      responses: { '204': { description: ok } }
                """,
            )

        val field =
            project(document)
                .operations
                .single()
                .requestBodyAlternatives
                .single()
                .formFields
                .single()
        val values = assertIs<FormValueDeclaration.Array>(field.value)
        val item = assertIs<FormValueDeclaration.Object>(values.element)
        val labels = assertIs<FormValueDeclaration.Array>(item.fields.single().value)
        assertEquals(FormScalarKind.STRING, assertIs<FormValueDeclaration.Scalar>(labels.element).kind)
    }

    @Test
    fun diagnosesFormArraysWithoutExplicitDeepObjectMetadata() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /array:
                    post:
                      operationId: arrayWithoutDialect
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                values: { type: array, items: { type: string } }
                      responses: { '204': { description: ok } }
                """,
            )

        val diagnostic = projectMapping(document).diagnostics.single()
        assertEquals("operation:arrayWithoutDialect", diagnostic.symbolId)
        assertTrue(diagnostic.message.contains("deepObject encoding"))
    }

    @Test
    fun diagnosesNonObjectFormRequestSchemaAtItsSource() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /scalar:
                    post:
                      operationId: scalarForm
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema: { type: string }
                      responses: { '204': { description: ok } }
                """,
            )

        val mapping = projectMapping(document)
        val diagnostic = mapping.diagnostics.single { it.symbolId == "operation:scalarForm" }

        assertTrue(mapping.exclusions.any { it.symbolId == "operation:scalarForm" })
        assertTrue(diagnostic.message.contains("object schema"))
        assertTrue(diagnostic.source.jsonPointer.endsWith("/schema"))
    }

    @Test
    fun projectsFormAnyOfOnlyWhenBranchesHaveDisjointWireKinds() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /union:
                    post:
                      operationId: disjointUnion
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                source:
                                  anyOf:
                                    - type: object
                                      additionalProperties: false
                                      properties: { token: { type: string } }
                                    - type: string
                            encoding:
                              source: { style: deepObject, explode: true }
                      responses: { '204': { description: ok } }
                  /overlap:
                    post:
                      operationId: overlappingUnion
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                value:
                                  anyOf: [{ type: string }, { type: string, maxLength: 3 }]
                            encoding:
                              value: { style: deepObject, explode: true }
                      responses: { '204': { description: ok } }
                """,
            )

        val mapping = projectMapping(document)
        val operation =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .single { it.operationIdentity == "disjointUnion" }
        val union =
            assertIs<FormValueDeclaration.Union>(
                operation.requestBodyAlternatives
                    .single()
                    .formFields
                    .single()
                    .value,
            )
        assertEquals(2, union.branches.size)
        assertEquals(setOf(FormWireKind.OBJECT, FormWireKind.STRING), union.branches.map { it.kind }.toSet())
        assertTrue(
            mapping.diagnostics
                .single { it.symbolId == "operation:overlappingUnion" }
                .message
                .contains("overlap"),
        )
    }

    @Test
    fun diagnosesUnsupportedFormShapesAtTheirEncodingOrPropertySource() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Forms, version: "1" }
                paths:
                  /bad-style:
                    post:
                      operationId: badStyle
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                nested:
                                  type: object
                                  additionalProperties: false
                                  properties: { value: { type: string } }
                            encoding:
                              nested: { style: form, explode: true }
                      responses: { '204': { description: ok } }
                  /bad-content-type:
                    post:
                      operationId: badContentType
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                value: { type: string }
                            encoding:
                              value: { contentType: text/plain }
                      responses: { '204': { description: ok } }
                  /bad-empty-encoding:
                    post:
                      operationId: badEmptyEncoding
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema: { type: object, additionalProperties: false }
                            encoding:
                              missing: { style: form }
                      responses: { '204': { description: ok } }
                  /bad-null:
                    post:
                      operationId: badNull
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                value: { type: [string, "null"] }
                      responses: { '204': { description: ok } }
                  /bad-union:
                    post:
                      operationId: badUnion
                      requestBody:
                        content:
                          application/x-www-form-urlencoded:
                            schema:
                              type: object
                              additionalProperties: false
                              properties:
                                value:
                                  anyOf: [{ type: string }, { type: string, maxLength: 3 }]
                            encoding:
                              value: { style: deepObject, explode: true }
                      responses: { '204': { description: ok } }
                """,
            )

        val mapping = projectMapping(document)
        val diagnostics = mapping.diagnostics.associateBy(GenerationDiagnostic::symbolId)

        assertTrue(mapping.exclusions.map(GenerationExclusion::symbolId).containsAll(diagnostics.keys))
        assertTrue(
            diagnostics
                .getValue("operation:badStyle")
                .source.jsonPointer
                .endsWith("/encoding/nested"),
        )
        assertTrue(
            diagnostics
                .getValue("operation:badContentType")
                .source.jsonPointer
                .endsWith("/encoding/value"),
        )
        assertTrue(
            diagnostics
                .getValue("operation:badEmptyEncoding")
                .source.jsonPointer
                .endsWith("/encoding/missing"),
        )
        assertTrue(
            diagnostics
                .getValue("operation:badNull")
                .source.jsonPointer
                .endsWith("/properties/value"),
        )
        assertTrue(
            diagnostics
                .getValue("operation:badUnion")
                .source.jsonPointer
                .endsWith("/properties/value"),
        )
    }

    @Test
    fun multipartAllOfFlattensOwnershipAndUnsupportedShapesNeverBecomeEmptySuccess() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Multipart, version: "1" }
                paths:
                  /upload:
                    post:
                      operationId: uploadAllOf
                      requestBody:
                        required: true
                        content:
                          multipart/form-data:
                            schema:
                              allOf:
                                - ${'$'}ref: '#/components/schemas/BasePart'
                                - type: object
                                  required: [caption]
                                  properties:
                                    caption: { type: string }
                            encoding:
                              file: { contentType: image/png }
                      responses: { '204': { description: ok } }
                  /bad-union:
                    post:
                      operationId: uploadUnion
                      requestBody:
                        content:
                          multipart/form-data:
                            schema:
                              oneOf:
                                - type: object
                                  properties: { a: { type: string } }
                                - type: object
                                  properties: { b: { type: string } }
                      responses: { '204': { description: ok } }
                  /bad-scalar:
                    post:
                      operationId: uploadScalar
                      requestBody:
                        content:
                          multipart/form-data:
                            schema: { type: string }
                      responses: { '204': { description: ok } }
                components:
                  schemas:
                    BasePart:
                      type: object
                      required: [file]
                      properties:
                        file: { type: string, format: binary }
                """,
            )

        val mapping = projectMapping(document)
        val client =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .single { it.operations.isNotEmpty() }
        val upload = client.operations.single { it.operationIdentity == "uploadAllOf" }
        val parts = upload.requestBodyAlternatives.single().multipartParts

        assertEquals(listOf("caption", "file"), parts.map(MultipartPartDeclaration::wireName))
        assertEquals(true, parts.single { it.wireName == "file" }.required)
        assertEquals("image/png", parts.single { it.wireName == "file" }.contentType)
        assertEquals(true, parts.single { it.wireName == "caption" }.required)
        assertTrue(client.operations.none { it.operationIdentity == "uploadUnion" })
        assertTrue(client.operations.none { it.operationIdentity == "uploadScalar" })
        assertEquals(
            setOf("operation:uploadUnion", "operation:uploadScalar"),
            mapping.diagnostics
                .filter { it.code == GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION }
                .map(GenerationDiagnostic::symbolId)
                .toSet(),
        )
    }

    @Test
    fun multipartTextArraysUseIndexedPartNamesFromSourceSchema() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Multipart arrays, version: "1" }
                paths:
                  /expand:
                    post:
                      operationId: expandUpload
                      requestBody:
                        content:
                          multipart/form-data:
                            schema:
                              type: object
                              required: [expand]
                              properties:
                                expand: { type: array, items: { type: string } }
                      responses: { '204': { description: ok } }
                """,
            )

        val part =
            project(document)
                .operations
                .single()
                .requestBodyAlternatives
                .single()
                .multipartParts
                .single()
        assertEquals("expand", part.wireName)
        assertTrue(part.indexedElements)
        assertEquals(
            "String",
            part.type.arguments
                .single()
                .simpleName,
        )
    }

    @Test
    fun multipartArraysAreDiagnosedAtThePropertyInsteadOfAssumingRepeatedParts() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Multipart arrays, version: "1" }
                paths:
                  /required-list:
                    post:
                      operationId: requiredList
                      requestBody:
                        content:
                          multipart/form-data:
                            schema:
                              type: object
                              required: [files]
                              properties:
                                files:
                                  type: array
                                  items: { type: string, format: binary }
                            encoding:
                              files: { style: form, explode: false }
                      responses: { '204': { description: ok } }
                  /optional-list:
                    post:
                      operationId: optionalList
                      requestBody:
                        content:
                          multipart/form-data:
                            schema:
                              type: object
                              properties:
                                files:
                                  type: array
                                  items: { type: string, format: binary }
                      responses: { '204': { description: ok } }
                  /empty-list:
                    post:
                      operationId: emptyList
                      requestBody:
                        content:
                          multipart/form-data:
                            schema:
                              type: object
                              required: [labels]
                              properties:
                                labels:
                                  type: array
                                  maxItems: 0
                                  items: { type: string }
                      responses: { '204': { description: ok } }
                """,
            )

        val mapping = projectMapping(document)
        val diagnostics = mapping.diagnostics.associateBy(GenerationDiagnostic::symbolId)

        val expectedPointers =
            mapOf(
                "requiredList" to "/encoding/files",
                "optionalList" to "/properties/files",
            )
        expectedPointers.forEach { (operationId, pointerSuffix) ->
            val diagnostic = requireNotNull(diagnostics["operation:$operationId"])
            assertEquals(GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION, diagnostic.code)
            assertTrue(diagnostic.message.contains("multipart array part"))
            assertTrue(diagnostic.source.jsonPointer.endsWith(pointerSuffix), diagnostic.source.jsonPointer)
        }
        val emptyList =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .single { operation -> operation.operationIdentity == "emptyList" }
        assertTrue(
            emptyList.requestBodyAlternatives
                .single()
                .multipartParts
                .single()
                .indexedElements,
        )
    }

    @Test
    fun multipartNullableBinaryAndTextAreDiagnosedAtThePropertyWhileOptionalNonNullIsSupported() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Multipart nullability, version: "1" }
                paths:
                  /nullable-binary:
                    post:
                      operationId: nullableBinary
                      requestBody:
                        content:
                          multipart/form-data:
                            schema:
                              type: object
                              required: [file]
                              properties:
                                file: { type: [string, "null"], format: binary }
                      responses: { '204': { description: ok } }
                  /nullable-text:
                    post:
                      operationId: nullableText
                      requestBody:
                        content:
                          multipart/form-data:
                            schema:
                              type: object
                              required: [caption]
                              properties:
                                caption: { type: [string, "null"] }
                      responses: { '204': { description: ok } }
                  /optional-binary:
                    post:
                      operationId: optionalBinary
                      requestBody:
                        content:
                          multipart/form-data:
                            schema:
                              type: object
                              properties:
                                file: { type: string, format: binary }
                      responses: { '204': { description: ok } }
                """,
            )

        val mapping = projectMapping(document)
        val diagnostics = mapping.diagnostics.associateBy(GenerationDiagnostic::symbolId)
        listOf("nullableBinary", "nullableText").forEach { operationId ->
            val diagnostic = requireNotNull(diagnostics["operation:$operationId"])
            assertEquals(GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION, diagnostic.code)
            assertTrue(diagnostic.message.contains("nullable multipart"))
            assertTrue(
                diagnostic.source.jsonPointer.endsWith("/properties/file") ||
                    diagnostic.source.jsonPointer.endsWith("/properties/caption"),
            )
        }
        val operations =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
        val optional = operations.single { it.operationIdentity == "optionalBinary" }
        assertEquals(
            false,
            optional.requestBodyAlternatives
                .single()
                .multipartParts
                .single()
                .required,
        )
    }

    @Test
    fun operationMemberAndSchemaNamesAreGloballyCollisionSafe() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Names, version: "1" }
                paths:
                  /one:
                    get:
                      operationId: foo-bar
                      responses: { '204': { description: ok } }
                  /two:
                    get:
                      operationId: foo_bar
                      responses: { '204': { description: ok } }
                  /three:
                    get:
                      operationId: class
                      responses: { '204': { description: ok } }
                  /four:
                    get:
                      operationId: getURL
                      responses: { '204': { description: ok } }
                  /five:
                    get:
                      operationId: getUrl
                      responses: { '204': { description: ok } }
                components:
                  schemas:
                    Foo-Bar:
                      type: object
                      properties:
                        foo-bar: { type: string }
                        foo_bar: { type: string }
                    Foo_Bar:
                      type: object
                      properties: { value: { type: string } }
                """,
            )

        val mapping = projectMapping(document)
        // This spec's five operations sit under five distinct untagged path groups, so their names must stay
        // globally collision-safe across every generated sub-client, not just within one group's client.
        val operations =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
        val operationNames = operations.map(OperationDeclaration::operationId)
        val codecNames =
            operations.flatMap { operation ->
                listOf(
                    operation.requestCodecPropertyName,
                    operation.responseCodecPropertyName,
                    operation.requestCodecConstantName,
                    operation.responseCodecConstantName,
                )
            }
        val schemaDeclarations =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filter { it !is OperationClientDeclaration }
        val collisionModel =
            schemaDeclarations.filterIsInstance<ModelDeclaration>().first {
                it.resolvedName.startsWith("FooBar")
            }

        assertEquals(operationNames.size, operationNames.toSet().size)
        assertEquals(codecNames.size, codecNames.toSet().size)
        assertTrue(operationNames.all { it.matches(Regex("[A-Za-z_][A-Za-z0-9_]*")) })
        assertTrue("classValue" in operationNames)
        assertTrue(schemaDeclarations.map(Declaration::resolvedName).toSet().size == schemaDeclarations.size)
        assertEquals(
            2,
            collisionModel.fields
                .map(FieldDeclaration::resolvedName)
                .toSet()
                .size,
        )
    }

    @Test
    fun projectedSchemaNamesAvoidUnionExceptionsAndClientCodecObjects() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Derived names, version: "1" }
                paths:
                  /value:
                    get:
                      operationId: getValue
                      responses: { '204': { description: ok } }
                components:
                  schemas:
                    Choice:
                      oneOf:
                        - type: object
                          required: [alpha]
                          properties: { alpha: { type: string } }
                        - type: object
                          required: [beta]
                          properties: { beta: { type: string } }
                    ChoiceDecodingException:
                      type: object
                      properties: { message: { type: string } }
                    WidgetsCodecs:
                      type: object
                      properties: { value: { type: string } }
                """,
            )

        val mapping = projectMapping(document)
        val declarations =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
        val names = declarations.map(Declaration::resolvedName)

        assertTrue("Choice" in names)
        assertTrue(names.any { it.startsWith("ChoiceDecodingException") && it != "ChoiceDecodingException" })
        assertTrue(names.any { it.startsWith("WidgetsCodecs") && it != "WidgetsCodecs" })
        assertTrue(mapping.diagnostics.isEmpty())
    }

    @Test
    fun mixedBufferedAndStreamingSuccessAlternativesProjectAsOneDualModeOperation() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Mixed responses, version: "1" }
                paths:
                  /mixed:
                    get:
                      operationId: mixedResponses
                      x-sdkgen-streaming:
                        mode: sse
                        responseContentType: text/event-stream
                      responses:
                        '200':
                          description: Buffered
                          content:
                            application/json:
                              schema: { type: string }
                        '201':
                          description: Streamed
                          content:
                            text/event-stream:
                              schema: { type: string }
                """,
            )

        val mapping = projectMapping(document)

        assertTrue(mapping.diagnostics.none { it.symbolId == "operation:mixedResponses" })
        val operation =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .single { it.operationIdentity == "mixedResponses" }

        assertEquals(OperationResponseMode.MIXED, operation.responseMode)
        // responseType/responseAlternatives describe only the buffered surface, exactly like a BUFFERED-only
        // operation would — see OperationDeclaration.streamResponseType's KDoc for why.
        assertEquals(KotlinTypeRef("kotlin", "String"), operation.responseType)
        assertEquals(KotlinTypeRef("kotlin", "String"), operation.streamResponseType)
        assertTrue(operation.responseAlternatives.none { it.mode == OperationResponseMode.STREAMING })
        assertTrue(operation.hasCompatibleOrdinaryResponseShape())
    }

    @Test
    fun mixedResponsesRequireExactlyOneBufferedAndOneStreamingSuccessAlternative() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Mixed responses, version: "1" }
                paths:
                  /mixed:
                    get:
                      operationId: mixedResponses
                      x-sdkgen-streaming:
                        mode: sse
                        responseContentType: text/event-stream
                      responses:
                        '200':
                          description: Buffered
                          content:
                            application/json:
                              schema: { type: string }
                        '201':
                          description: Also buffered
                          content:
                            application/json:
                              schema: { type: integer }
                        '202':
                          description: Streamed
                          content:
                            text/event-stream:
                              schema: { type: string }
                """,
            )

        val mapping = projectMapping(document)

        assertTrue(
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .none { it.operationIdentity == "mixedResponses" },
        )
        assertEquals(
            GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION,
            mapping.diagnostics.single { it.symbolId == "operation:mixedResponses" }.code,
        )
    }

    @Test
    fun incompatibleSuccessfulMediaShapesKeepTheOperationAndEmitANonBlockingDiagnosticInEitherOrder() {
        listOf(
            """
            openapi: 3.1.0
            info: { title: Incompatible success media, version: "1" }
            paths:
              /download:
                get:
                  operationId: download
                  responses:
                    '200':
                      description: JSON or binary
                      content:
                        application/json:
                          schema: { type: string }
                        application/octet-stream:
                          schema: { type: string, format: binary }
            """,
            """
            openapi: 3.1.0
            info: { title: Incompatible success media, version: "1" }
            paths:
              /download:
                get:
                  operationId: download
                  responses:
                    '200':
                      description: JSON or binary
                      content:
                        application/octet-stream:
                          schema: { type: string, format: binary }
                        application/json:
                          schema: { type: string }
            """,
        ).forEach { specification ->
            val document = adapt(specification)

            val mapping = projectMapping(document)
            val operation =
                mapping.model.files
                    .flatMap(KotlinFileDeclaration::declarations)
                    .filterIsInstance<OperationClientDeclaration>()
                    .single { it.operations.isNotEmpty() }
                    .operations
                    .single()
            val diagnostic =
                mapping.diagnostics.single {
                    it.code == GenerationDiagnosticCode.INCOMPATIBLE_SUCCESS_RESPONSE_SHAPES
                }

            assertEquals("download", operation.operationIdentity)
            assertEquals(
                setOf(
                    KotlinTypeRef("kotlin", "String"),
                    KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                ),
                operation.responseAlternatives.map(OperationResponseAlternative::type).toSet(),
            )
            assertEquals(DiagnosticSeverity.WARNING, diagnostic.severity)
            assertTrue("withResponse" in diagnostic.message)
            assertTrue(mapping.exclusions.none { it.symbolId == "operation:download" })
        }
    }

    @Test
    fun incompatibleSuccessfulStreamingAlternativesAreExcludedWithBlockingSourceLinkedDiagnostic() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Incompatible streaming success, version: "1" }
                paths:
                  /stream:
                    get:
                      operationId: streamVariants
                      x-sdkgen-streaming:
                        mode: sse
                        responseContentType: text/event-stream
                      responses:
                        '200':
                          description: Multiple streaming success shapes
                          content:
                            text/event-stream:
                              schema: { type: string }
                            application/x-ndjson:
                              schema: { type: integer }
                            application/json-seq:
                              schema: { type: boolean }
                """,
            )

        val mapping = projectMapping(document)
        val operationIds =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .map(OperationDeclaration::operationIdentity)
        val diagnostic =
            mapping.diagnostics.single {
                it.symbolId == "operation:streamVariants"
            }

        assertTrue("streamVariants" !in operationIds)
        assertEquals(GenerationDiagnosticCode.INCOMPATIBLE_SUCCESS_RESPONSE_SHAPES, diagnostic.code)
        assertEquals(DiagnosticSeverity.ERROR, diagnostic.severity)
        assertEquals(
            document.operations
                .single { it.operationId == "streamVariants" }
                .source.jsonPointer,
            diagnostic.source.jsonPointer,
        )
        assertTrue("streaming" in diagnostic.message)
        assertTrue("no callable API" in diagnostic.message)
        assertEquals(
            listOf("operation:streamVariants"),
            mapping.exclusions.map(GenerationExclusion::symbolId),
        )
    }

    @Test
    fun compatibleSuccessfulStreamingAlternativesKeepTheCallableStreamingMethod() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Compatible streaming success, version: "1" }
                paths:
                  /stream:
                    get:
                      operationId: streamVariants
                      x-sdkgen-streaming:
                        mode: sse
                        responseContentType: text/event-stream
                      responses:
                        '200':
                          description: Multiple compatible streaming shapes
                          content:
                            text/event-stream:
                              schema: { type: string }
                            application/x-ndjson:
                              schema: { type: string }
                """,
            )

        val mapping = projectMapping(document)
        val operation =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .single { it.operations.isNotEmpty() }
                .operations
                .single()

        assertEquals("streamVariants", operation.operationIdentity)
        assertEquals(OperationResponseMode.STREAMING, operation.responseMode)
        assertEquals(2, operation.responseAlternatives.size)
        assertTrue(operation.responseAlternatives.all { it.mode == OperationResponseMode.STREAMING })
        assertTrue(
            mapping.diagnostics.none {
                it.code == GenerationDiagnosticCode.INCOMPATIBLE_SUCCESS_RESPONSE_SHAPES
            },
        )
    }

    @Test
    fun compatibleSuccessfulMediaAlternativesShareTheOrdinaryResponseShapeWithoutDiagnostic() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Compatible success media, version: "1" }
                paths:
                  /value:
                    get:
                      operationId: getValue
                      responses:
                        '200':
                          description: JSON variants
                          content:
                            application/json:
                              schema: { type: string }
                            application/vnd.value+json:
                              schema: { type: string }
                """,
            )

        val mapping = projectMapping(document)
        val operation =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .single { it.operations.isNotEmpty() }
                .operations
                .single()

        assertEquals(KotlinTypeRef("kotlin", "String"), operation.responseType)
        assertEquals(2, operation.responseAlternatives.size)
        assertTrue(
            mapping.diagnostics.none {
                it.code == GenerationDiagnosticCode.INCOMPATIBLE_SUCCESS_RESPONSE_SHAPES
            },
        )
    }

    @Test
    fun anyOfBranchesUseReferencedComponentNamesAndInlineFallbackNames() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: AnyOf names, version: "1" }
                paths: {}
                components:
                  schemas:
                    Choice:
                      anyOf:
                        - ${'$'}ref: '#/components/schemas/Alpha'
                        - ${'$'}ref: '#/components/schemas/Beta'
                        - type: string
                    Alpha:
                      type: object
                      required: [alpha]
                      properties:
                        alpha: { type: string }
                    Beta:
                      type: object
                      required: [beta]
                      properties:
                        beta: { type: string }
                """,
            )

        val choice =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<AnyOfDeclaration>()
                .single { it.resolvedName == "Choice" }

        assertEquals(listOf("Alpha", "Beta", "Branch3"), choice.branches.map(AnyOfBranchDeclaration::resolvedName))
        assertEquals(
            listOf("schema:Choice/branch:Alpha", "schema:Choice/branch:Beta", "schema:Choice/branch:Branch3"),
            choice.branches.map(AnyOfBranchDeclaration::symbolId),
        )
        assertEquals(listOf("alpha", "beta", "branch3"), choice.branches.map(AnyOfBranchDeclaration::propertyName))
    }

    @Test
    fun topLevelSchemaKdocAlwaysIncludesCanonicalSchemaIdWithAndWithoutDescriptions() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Source KDoc, version: "1" }
                paths: {}
                components:
                  schemas:
                    ModelWithDescription:
                      description: Model docs.
                      type: object
                      properties: { value: { type: string } }
                    EnumWithoutDescription:
                      type: string
                      enum: [alpha, beta]
                    OneOfWithDescription:
                      description: Union docs.
                      oneOf:
                        - ${'$'}ref: '#/components/schemas/Alpha'
                        - ${'$'}ref: '#/components/schemas/Beta'
                    AnyOfWithoutDescription:
                      anyOf:
                        - ${'$'}ref: '#/components/schemas/Alpha'
                        - ${'$'}ref: '#/components/schemas/Beta'
                    Alpha:
                      type: object
                      required: [alpha]
                      properties: { alpha: { type: string } }
                    Beta:
                      type: object
                      required: [beta]
                      properties: { beta: { type: string } }
                """,
            )
        val declarations =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .associateBy(Declaration::resolvedName)

        listOf("ModelWithDescription", "EnumWithoutDescription", "OneOfWithDescription", "AnyOfWithoutDescription")
            .forEach { name ->
                val schemaId =
                    document.schemas.values
                        .single { schema ->
                            schema.id.value.endsWith("/schemas/$name")
                        }.id
                val kdoc = declarations.getValue(name).kdoc
                assertTrue(kdoc.endsWith("\n\nSource: ${schemaId.value}"), kdoc)
            }
        assertTrue(declarations.getValue("ModelWithDescription").kdoc.startsWith("Model docs."))
        assertTrue(declarations.getValue("OneOfWithDescription").kdoc.startsWith("Union docs."))
    }

    @Test
    fun inlineDeclarationNamesAreStructuredTaggedAndInsertionStableWhileComponentsKeepTheirNames() {
        fun declarations(specification: String): Map<String, Declaration> =
            projectMapping(adapt(specification))
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterNot { declaration ->
                    declaration is OperationClientDeclaration ||
                        declaration is SupportDeclaration
                }.associateBy { declaration -> declaration.kdoc.substringBefore("\n\nSource:") }

        val baseline =
            declarations(
                """
                openapi: 3.1.0
                info: { title: Stable inline names, version: "1" }
                paths:
                  /users/{id}:
                    get:
                      operationId: getUserById
                      responses:
                        '200':
                          description: ok
                          content:
                            application/json:
                              schema:
                                description: id response
                                type: object
                                properties: { value: { type: string } }
                  /users/{name}:
                    get:
                      operationId: getUserByName
                      responses:
                        '200':
                          description: ok
                          content:
                            application/json:
                              schema:
                                description: name response
                                type: object
                                properties: { value: { type: string } }
                components:
                  schemas:
                    ConfiguredComponent:
                      description: component
                      type: object
                      properties: { value: { type: string } }
                """,
            )
        val withUnrelatedEarlierPath =
            declarations(
                """
                openapi: 3.1.0
                info: { title: Stable inline names, version: "1" }
                paths:
                  /aaa:
                    post:
                      operationId: unrelated
                      requestBody:
                        content:
                          application/json:
                            schema:
                              description: unrelated
                              type: object
                              properties: { value: { type: string } }
                      responses: { '204': { description: ok } }
                  /users/{id}:
                    get:
                      operationId: getUserById
                      responses:
                        '200':
                          description: ok
                          content:
                            application/json:
                              schema:
                                description: id response
                                type: object
                                properties: { value: { type: string } }
                  /users/{name}:
                    get:
                      operationId: getUserByName
                      responses:
                        '200':
                          description: ok
                          content:
                            application/json:
                              schema:
                                description: name response
                                type: object
                                properties: { value: { type: string } }
                components:
                  schemas:
                    ConfiguredComponent:
                      description: component
                      type: object
                      properties: { value: { type: string } }
                """,
            )

        val byId = baseline.getValue("id response")
        val byName = baseline.getValue("name response")
        assertTrue(byId.resolvedName.startsWith("InlineUsersGetResponse200Json"), byId.resolvedName)
        assertEquals(byId.resolvedName.substringBeforeLast('X'), byName.resolvedName.substringBeforeLast('X'))
        assertNotEquals(byId.resolvedName, byName.resolvedName)
        assertTrue(byId.resolvedName.matches(Regex(".*X[0-9a-f]{8}$")), byId.resolvedName)
        assertEquals(
            byId.resolvedName.substringBeforeLast('X'),
            withUnrelatedEarlierPath.getValue("id response").resolvedName.substringBeforeLast('X'),
        )
        assertEquals(
            byName.resolvedName.substringBeforeLast('X'),
            withUnrelatedEarlierPath.getValue("name response").resolvedName.substringBeforeLast('X'),
        )
        assertEquals("ConfiguredComponent", baseline.getValue("component").resolvedName)
    }

    @Test
    fun currentFieldStatePolicyRecursesAndKeepsKnownModelScopeAndDirectionalityLimitations() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Optionality limitations, version: "1" }
                paths:
                  /shared:
                    patch:
                      operationId: patchShared
                      requestBody:
                        content:
                          application/json:
                            schema: { ${'$'}ref: '#/components/schemas/Shared' }
                      responses:
                        '200':
                          description: same declaration is also a response
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/Shared' }
                  /response-only:
                    get:
                      operationId: responseOnly
                      responses:
                        '200':
                          description: response
                          content:
                            application/json:
                              schema: { ${'$'}ref: '#/components/schemas/ResponseOnly' }
                components:
                  schemas:
                    Shared:
                      type: object
                      properties:
                        nested: { ${'$'}ref: '#/components/schemas/Nested' }
                    Nested:
                      type: object
                      properties: { value: { type: [string, "null"] } }
                    RequiredNullableScope:
                      type: object
                      required: [requiredMaybe]
                      properties:
                        requiredMaybe: { type: [string, "null"] }
                        unrelatedOptional: { type: string }
                    ResponseOnly:
                      type: object
                      properties:
                        nullableValue: { type: [string, "null"] }
                        nonNullValue: { type: string }
                """,
            )
        val declarations =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
        val models = declarations.filterIsInstance<ModelDeclaration>().associateBy(Declaration::resolvedName)
        val operations =
            declarations
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .associateBy(OperationDeclaration::operationIdentity)

        assertTrue(models.getValue("Shared").usesFieldState)
        assertTrue(models.getValue("Nested").usesFieldState)
        assertTrue(models.getValue("RequiredNullableScope").usesFieldState)
        assertEquals(
            listOf("unrelatedOptional"),
            models
                .getValue(
                    "RequiredNullableScope",
                ).fields
                .filterNot(FieldDeclaration::required)
                .map(FieldDeclaration::wireName),
        )
        assertFalse(models.getValue("ResponseOnly").usesFieldState)
        assertEquals(
            operations.getValue("patchShared").requestType.simpleName,
            operations.getValue("patchShared").responseType.simpleName,
        )
        assertEquals("Shared", operations.getValue("patchShared").requestType.simpleName)
    }

    @Test
    fun fieldStateIsEnabledForPatchMergePatchExplicitOptInOrRequiredNullableModels() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Field state gating, version: "1" }
                paths:
                  /ordinary:
                    post:
                      operationId: ordinary
                      requestBody:
                        required: true
                        content:
                          application/json:
                            schema: { ${'$'}ref: '#/components/schemas/Ordinary' }
                      responses: { '204': { description: ok } }
                  /patch:
                    patch:
                      operationId: patch
                      requestBody:
                        required: true
                        content:
                          application/json:
                            schema: { ${'$'}ref: '#/components/schemas/Patch' }
                      responses: { '204': { description: ok } }
                  /merge:
                    post:
                      operationId: merge
                      requestBody:
                        required: true
                        content:
                          application/merge-patch+json:
                            schema: { ${'$'}ref: '#/components/schemas/Merge' }
                      responses: { '204': { description: ok } }
                  /opt:
                    post:
                      operationId: opt
                      requestBody:
                        required: true
                        content:
                          application/json:
                            schema: { ${'$'}ref: '#/components/schemas/Opt' }
                      responses: { '204': { description: ok } }
                components:
                  schemas:
                    Ordinary:
                      type: object
                      properties: { value: { type: string } }
                    Patch:
                      type: object
                      properties: { value: { type: string } }
                    Merge:
                      type: object
                      properties: { value: { type: string } }
                    Opt:
                      x-sdkgen-field-state: true
                      type: object
                      properties: { value: { type: string } }
                """,
            )
        val models =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<ModelDeclaration>()
                .associateBy(Declaration::resolvedName)

        assertEquals(false, models.getValue("Ordinary").usesFieldState)
        assertEquals(true, models.getValue("Patch").usesFieldState)
        assertEquals(true, models.getValue("Merge").usesFieldState)
        assertEquals(true, models.getValue("Opt").usesFieldState)
    }

    @Test
    fun cancellationDuringProjectionIsRethrownByIdentity() {
        val cancellation = CancellationException("cancelled")
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Cancellation, version: "1" }
                paths: {}
                """,
            ).copy(
                operations =
                    object : AbstractList<com.nabobery.sdkgen.model.OperationModel>() {
                        override val size: Int
                            get() = throw cancellation

                        override fun get(index: Int): com.nabobery.sdkgen.model.OperationModel = throw cancellation
                    },
            )

        val thrown = assertFailsWith<CancellationException> { projectMapping(document) }

        assertSame(cancellation, thrown)
    }

    @Test
    fun unexpectedProjectionFailureProducesDistinctTypedDiagnostic() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Broken projection, version: "1" }
                paths:
                  /value:
                    post:
                      operationId: submitValue
                      requestBody:
                        content:
                          application/json:
                            schema: { type: string }
                      responses:
                        '204': { description: Accepted }
                """,
            )
        val broken =
            document.copy(
                schemas =
                    object : AbstractMap<com.nabobery.sdkgen.model.SchemaId, com.nabobery.sdkgen.model.SchemaModel>() {
                        override val entries:
                            Set<Map.Entry<com.nabobery.sdkgen.model.SchemaId, com.nabobery.sdkgen.model.SchemaModel>>
                            get() = error("broken schema index")
                    },
            )

        val mapping = projectMapping(broken)

        assertEquals(
            listOf(GenerationDiagnosticCode.PROJECTION_FAILED),
            mapping.diagnostics.map(GenerationDiagnostic::code),
        )
    }

    @Test
    fun unrepresentableOperationProducesTypedDiagnosticInsteadOfFallbackOrOmission() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Unsupported, version: "1" }
                paths:
                  /value:
                    post:
                      operationId: submitValue
                      requestBody:
                        content:
                          application/json:
                            schema: { type: [string, integer] }
                      responses:
                        '204': { description: Accepted }
                """,
            )

        val mapping = projectMapping(document)
        val operationIds =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .map(OperationDeclaration::symbolId)

        assertTrue("operation:submitValue" !in operationIds)
        assertEquals(
            listOf(GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION),
            mapping.diagnostics.map(GenerationDiagnostic::code),
        )
        assertEquals(listOf("operation:submitValue"), mapping.diagnostics.map(GenerationDiagnostic::symbolId))
    }

    @Test
    fun unrepresentableExternalSchemaDiagnosticRetainsExternalDocumentUriAndPointer() {
        val root = Files.createTempDirectory("sdkgen-external-schema-diagnostic-")
        val source = root.resolve("openapi.yaml")
        source.writeText(
            """
            openapi: 3.1.0
            info: { title: External diagnostic, version: "1" }
            paths: {}
            components:
              schemas:
                Root:
                  ${'$'}ref: components.yaml#/components/schemas/Broken
            """.trimIndent() + "\n",
        )
        root.resolve("components.yaml").writeText(
            """
            components:
              schemas:
                Broken:
                  type: object
                  properties:
                    id: { type: string }
                  allOf:
                    - type: string
            """.trimIndent() + "\n",
        )

        val document = SemanticAdapter().adapt(source).document
        val diagnostic =
            projectMapping(document).diagnostics.single {
                it.code == GenerationDiagnosticCode.UNREPRESENTABLE_SCHEMA &&
                    it.source.documentUri.endsWith("components.yaml")
            }

        assertEquals("sdkgen://source/components.yaml", diagnostic.source.documentUri)
        assertEquals("/components/schemas/Broken", diagnostic.source.jsonPointer)
    }

    @Test
    fun fieldStateBackingNameCollisionFailsTheDirectSchemaAndItsDependents() {
        val mapping =
            projectMapping(
                adapt(
                    """
                    openapi: 3.1.0
                    info: { title: Field-state collision, version: "1" }
                    paths:
                      /parent:
                        patch:
                          operationId: updateParent
                          requestBody:
                            required: true
                            content:
                              application/json:
                                schema: { ${'$'}ref: '#/components/schemas/Parent' }
                          responses: { '204': { description: Updated } }
                    components:
                      schemas:
                        Parent:
                          type: object
                          required: [child]
                          properties:
                            child: { ${'$'}ref: '#/components/schemas/Child' }
                        Child:
                          type: object
                          x-sdkgen-field-state: true
                          properties:
                            mergeable: { type: [boolean, "null"] }
                            mergeable_state: { type: string }
                    """,
                ),
            )

        val direct = mapping.diagnostics.single { diagnostic -> diagnostic.symbolId == "schema:Child" }
        val excludedSymbols = mapping.exclusions.map(GenerationExclusion::symbolId).toSet()

        assertEquals(GenerationDiagnosticCode.UNREPRESENTABLE_SCHEMA, direct.code)
        assertTrue(direct.message.contains("generated field-state backing member"))
        assertEquals("/components/schemas/Child/properties/mergeable_state", direct.source.jsonPointer)
        assertTrue("schema:Child" in excludedSymbols)
        assertTrue("schema:Parent" in excludedSymbols)
        assertTrue("operation:updateParent" in excludedSymbols)
    }

    @Test
    fun requiredFieldValueBackingNameCollisionFailsTheDirectSchemaAndItsDependents() {
        val mapping =
            projectMapping(
                adapt(
                    """
                    openapi: 3.1.0
                    info: { title: Required value collision, version: "1" }
                    paths:
                      /events:
                        post:
                          operationId: createEvent
                          requestBody:
                            required: true
                            content:
                              application/json:
                                schema: { ${'$'}ref: '#/components/schemas/Parent' }
                          responses: { '204': { description: Created } }
                    components:
                      schemas:
                        Parent:
                          type: object
                          required: [event]
                          properties:
                            event: { ${'$'}ref: '#/components/schemas/IssueEvent' }
                        IssueEvent:
                          type: object
                          required: [issue_field]
                          properties:
                            issue_field:
                              type: object
                              required: [name]
                              properties:
                                name: { type: string }
                            issue_field_value:
                              type: object
                              required: [value]
                              properties:
                                value: { type: string }
                    """,
                ),
            )

        val direct = mapping.diagnostics.single { diagnostic -> diagnostic.symbolId == "schema:IssueEvent" }
        val excludedSymbols = mapping.exclusions.map(GenerationExclusion::symbolId).toSet()

        assertEquals(GenerationDiagnosticCode.UNREPRESENTABLE_SCHEMA, direct.code)
        assertTrue(direct.message.contains("generated required-field backing member"))
        assertEquals("/components/schemas/IssueEvent/properties/issue_field_value", direct.source.jsonPointer)
        assertTrue("schema:IssueEvent" in excludedSymbols)
        assertTrue("schema:Parent" in excludedSymbols)
        assertTrue("operation:createEvent" in excludedSymbols)
    }

    @Test
    fun fullOpenRouterProjectionAccountsForEveryOperationAndIsOrderIndependent() {
        val document =
            SemanticAdapter()
                .adapt(Path.of(requireNotNull(System.getProperty("engine.openRouterFile"))))
                .document
        val baseline = projectMapping(document)
        val expectedIds = parsedOperationIds(Path.of(requireNotNull(System.getProperty("engine.openRouterFile"))))
        val accounted = accountedOperationIds(baseline)

        assertEquals(expectedIds, accounted)
        assertEquals(expectedIds.size, accounted.size)
        assertEquals(89, expectedIds.size)
        // The golden includes fixed-point schema-closure diagnostics and the operations omitted for their failed types.
        val golden = Path.of(requireNotNull(System.getProperty("engine.standardProjectionGolden")))
        val summary = projectionSummary(baseline)
        if (System.getenv("UPDATE_STANDARD_PROJECTION_GOLDEN") == "1") golden.writeText(summary)
        assertEquals(golden.readText(), summary)

        repeat(12) { seed ->
            val shuffled = document.copy(operations = document.operations.shuffled(Random(seed)))
            val projected = projectMapping(shuffled)
            assertEquals(expectedIds, accountedOperationIds(projected), "seed=$seed")
            assertEquals(baseline.model.normalized().digest(), projected.model.normalized().digest(), "seed=$seed")
        }
    }

    private fun projectionSummary(mapping: DeclarationMappingResult): String =
        buildString {
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .sortedBy(OperationDeclaration::symbolId)
                .forEach { operation ->
                    append("operation|")
                    append(operation.operationId)
                    append('|').append(operation.method)
                    append('|').append(operation.path)
                    append("|request=").append(operation.requestType.render())
                    append("|responses=")
                    append(
                        operation.responseAlternatives.joinToString(";") { alternative ->
                            "${alternative.selector.render()}:${alternative.mediaTypes.joinToString(",")}:" +
                                alternative.type.render()
                        },
                    )
                    append("|security=")
                    append(
                        operation.security.joinToString(" OR ") { requirement ->
                            if (requirement.schemes.isEmpty()) {
                                "anonymous"
                            } else {
                                requirement.schemes.joinToString(" AND ") { scheme ->
                                    "${scheme.schemeId}[${scheme.scopes.joinToString(",")}]"
                                }
                            }
                        },
                    )
                    append("|pagination=").append(operation.pagination)
                    append("|streaming=").append(operation.streaming)
                    append("|idempotency=").append(operation.idempotency)
                    append('\n')
                }
            mapping.diagnostics.sortedBy { it.symbolId }.forEach { diagnostic ->
                append("diagnostic|")
                append(diagnostic.symbolId)
                append('|').append(diagnostic.code.wireCode)
                append('|').append(diagnostic.source.jsonPointer)
                append('\n')
            }
        }

    private fun ResponseSelectorDeclaration.render(): String =
        when (this) {
            is ResponseSelectorDeclaration.ExactStatus -> code.toString()
            is ResponseSelectorDeclaration.StatusRange -> "$firstInclusive-$lastInclusive"
            ResponseSelectorDeclaration.Default -> "default"
        }

    private fun KotlinTypeRef.render(): String =
        buildString {
            append(packageName).append('.').append(simpleName)
            if (arguments.isNotEmpty()) append(arguments.joinToString(",", "<", ">") { it.render() })
        }

    private fun parsedOperationIds(path: Path): Set<String> {
        val parsed =
            OpenAPIV3Parser()
                .readLocation(
                    path.toUri().toString(),
                    null,
                    ParseOptions().apply { setResolve(false) },
                ).openAPI
                ?: error("OpenAPI parser did not produce a document")
        return parsed.paths
            .orEmpty()
            .values
            .flatMap { pathItem -> pathItem.readOperationsMap().values }
            .mapNotNull { operation -> operation.operationId?.let { "operation:$it" } }
            .toSet()
    }

    @Test
    fun groupsOperationsByFirstTagThenPathAndDefaultFallback() {
        val mapping =
            projectMapping(
                adapt(
                    """
                    openapi: 3.1.0
                    info: { title: Grouping rules, version: "1" }
                    paths:
                      /tagged:
                        get:
                          operationId: tagged
                          tags: [Primary Group, Secondary Group]
                          responses: { '204': { description: ok } }
                      /accounts/{id}:
                        get:
                          operationId: pathFallback
                          responses: { '204': { description: ok } }
                      /{tenant}/{id}:
                        get:
                          operationId: defaultFallback
                          responses: { '204': { description: ok } }
                      /{tenant}-items:
                        get:
                          operationId: mixedTemplateFallback
                          responses: { '204': { description: ok } }
                    """,
                ),
            )
        val declarations = mapping.model.files.flatMap(KotlinFileDeclaration::declarations)
        val facade = declarations.filterIsInstance<OperationClientDeclaration>().single { it.subClients.isNotEmpty() }
        val groupsByOperation =
            declarations
                .filterIsInstance<OperationClientDeclaration>()
                .filter { it.operations.isNotEmpty() }
                .associateBy { it.operations.single().operationIdentity }

        assertEquals(
            listOf(
                OperationClientGroupRef(
                    "$GENERATED_PACKAGE.primarygroup",
                    "PrimaryGroupClient",
                    "primaryGroup",
                    "Operations tagged/grouped under 'Primary Group'.",
                ),
                OperationClientGroupRef(
                    "$GENERATED_PACKAGE.accounts",
                    "AccountsClient",
                    "accounts",
                    "Operations tagged/grouped under 'accounts'.",
                ),
                OperationClientGroupRef(
                    "$GENERATED_PACKAGE.default",
                    "DefaultClient",
                    "default",
                    "Operations tagged/grouped under 'default'.",
                ),
                OperationClientGroupRef(
                    "$GENERATED_PACKAGE.tenantitems",
                    "TenantItemsClient",
                    "tenantItems",
                    "Operations tagged/grouped under '{tenant}-items'.",
                ),
            ),
            facade.subClients,
        )
        assertEquals("$GENERATED_PACKAGE.primarygroup", groupsByOperation.getValue("tagged").packageName)
        assertEquals("$GENERATED_PACKAGE.accounts", groupsByOperation.getValue("pathFallback").packageName)
        assertEquals("$GENERATED_PACKAGE.default", groupsByOperation.getValue("defaultFallback").packageName)
        assertEquals("$GENERATED_PACKAGE.tenantitems", groupsByOperation.getValue("mixedTemplateFallback").packageName)
        assertTrue(groupsByOperation.values.all(OperationClientDeclaration::preserveOperationMetadataNames))
    }

    @Test
    fun sanitizedGroupNameCollisionsAreDistinctAndDeterministic() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Group collisions, version: "1" }
                paths:
                  /one:
                    get:
                      operationId: one
                      tags: [foo-bar]
                      responses: { '204': { description: ok } }
                  /two:
                    get:
                      operationId: two
                      tags: [foo_bar]
                      responses: { '204': { description: ok } }
                  /three:
                    get:
                      operationId: three
                      tags: [Foo Bar]
                      responses: { '204': { description: ok } }
                """,
            )

        fun groupRefs(): List<OperationClientGroupRef> =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .single { it.subClients.isNotEmpty() }
                .subClients

        val expected =
            listOf(
                OperationClientGroupRef(
                    "$GENERATED_PACKAGE.foobar",
                    "FooBarClient",
                    "fooBar",
                    "Operations tagged/grouped under 'Foo Bar'.",
                ),
                OperationClientGroupRef(
                    "$GENERATED_PACKAGE.foobar2",
                    "FooBarClient2",
                    "fooBar2",
                    "Operations tagged/grouped under 'foo-bar'.",
                ),
                OperationClientGroupRef(
                    "$GENERATED_PACKAGE.foobar3",
                    "FooBarClient3",
                    "fooBar3",
                    "Operations tagged/grouped under 'foo_bar'.",
                ),
            )
        assertEquals(expected, groupRefs())
        assertEquals(expected, groupRefs())
    }

    private fun accountedOperationIds(mapping: DeclarationMappingResult): Set<String> {
        val declarations =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .map(OperationDeclaration::symbolId)
        val diagnostics = mapping.diagnostics.map(GenerationDiagnostic::symbolId).filter { it.startsWith("operation:") }
        assertTrue(declarations.toSet().intersect(diagnostics.toSet()).isEmpty())
        return (declarations + diagnostics).toSet()
    }

    @Test
    fun nullableReferenceAnnotationsSurviveProjectionAcrossRequestAndResponseChains() {
        val document =
            adapt(
                """
                openapi: 3.0.3
                info: { title: Nullable alias projection, version: "1" }
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
                """,
            )

        val operation = project(document).operations.single()
        assertEquals(KotlinTypeRef("kotlin", "String", nullable = true), operation.requestType)
        assertEquals(KotlinTypeRef("kotlin", "String", nullable = true), operation.responseType)
    }

    @Test
    fun `groups untagged operations by the first path segment that is not an api version`() {
        val mapping =
            projectMapping(
                adapt(
                    """
                    openapi: 3.1.0
                    info: { title: Versioned, version: "1" }
                    paths:
                      /v1/accounts:
                        get: { operationId: listAccounts, responses: { '204': { description: ok } } }
                      /v2beta/charges:
                        get: { operationId: listCharges, responses: { '204': { description: ok } } }
                      /2024-01-01/events:
                        get: { operationId: listEvents, responses: { '204': { description: ok } } }
                      /v1/{id}:
                        get: { operationId: versionOnly, responses: { '204': { description: ok } } }
                      /tagged:
                        get:
                          operationId: tagged
                          tags: [v1]
                          responses: { '204': { description: ok } }
                    """,
                ),
            )
        // Two operations share the `v1` group here, so map every operation rather than assuming one each.
        val groupsByOperation =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap { client -> client.operations.map { operation -> operation.operationIdentity to client } }
                .toMap()

        assertEquals("$GENERATED_PACKAGE.accounts", groupsByOperation.getValue("listAccounts").packageName)
        assertEquals("$GENERATED_PACKAGE.charges", groupsByOperation.getValue("listCharges").packageName)
        assertEquals("$GENERATED_PACKAGE.events", groupsByOperation.getValue("listEvents").packageName)
        // Every named segment is a version, so the version is all the path says: group by it rather than lose
        // the path entirely.
        assertEquals("$GENERATED_PACKAGE.v1", groupsByOperation.getValue("versionOnly").packageName)
        // Tags win, even a version-shaped one: the skip applies only to the path fallback.
        assertEquals("$GENERATED_PACKAGE.v1", groupsByOperation.getValue("tagged").packageName)
    }

    @Test
    fun `projects primitive oneOf parameters in path and exploded query positions`() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Unions, version: "1" }
                paths:
                  /workflows/{workflowId}:
                    get:
                      operationId: getWorkflow
                      parameters:
                        - { name: workflowId, in: path, required: true, style: simple, schema: { oneOf: [ { type: integer }, { type: string } ] } }
                      responses: { '204': { description: ok } }
                  /alerts:
                    get:
                      operationId: listAlerts
                      parameters:
                        - { name: has, in: query, style: form, explode: true, schema: { oneOf: [ { type: string }, { type: array, items: { type: string, enum: [patch] } } ] } }
                      responses: { '204': { description: ok } }
                """,
            )

        val mapping = projectMapping(document)

        assertEquals(emptyList(), mapping.diagnostics.map { it.message })
        val parameters =
            project(document).operations.flatMap { operation -> operation.parameters }
        assertEquals(
            listOf(ParameterSerialization.PrimitiveUnion, ParameterSerialization.PrimitiveUnion),
            parameters.map { parameter -> parameter.serialization },
            "a oneOf over primitive scalars and primitive arrays is representable in path and exploded query",
        )
    }

    /**
     * ADR-0016's wire-collapse argument has two halves and only one of them covers paths. A query parameter with
     * `style: form, explode: true` is a repeated key, so a scalar branch and an array branch both serialize; a
     * path segment is a single value, so an array branch has nowhere to go. `renderPathTemplate` requires exactly
     * one value and throws `IllegalArgumentException` otherwise, from generated code that compiled cleanly.
     *
     * Note the asymmetry this closes: a *bare* `type: array` path parameter was already rejected as "only
     * supports scalar schema"; the same array wrapped in a `oneOf` was not.
     */
    @Test
    fun `rejects primitive union path parameters carrying an array branch`() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Unions, version: "1" }
                paths:
                  /things/{id}:
                    get:
                      operationId: getThing
                      parameters:
                        - { name: id, in: path, required: true, style: simple, schema: { oneOf: [ { type: string }, { type: array, items: { type: string } } ] } }
                      responses: { '204': { description: ok } }
                """,
            )

        val mapping = projectMapping(document)

        assertEquals(emptyList(), project(document).operations.map { it.operationIdentity })
        assertEquals(1, mapping.diagnostics.size)
        assertEquals(
            GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION,
            mapping.diagnostics.single().code,
        )
        assertTrue(
            "path parameter 'id' is a primitive union with an array branch" in mapping.diagnostics.single().message,
            mapping.diagnostics.joinToString { it.message },
        )
        assertTrue(
            mapping.exclusions.any { exclusion -> exclusion.symbolId == "operation:getThing" },
            mapping.exclusions.joinToString { exclusion -> exclusion.symbolId },
        )
    }

    @Test
    fun `rejects primitive union parameters that cannot be reconstructed or flattened`() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Unions, version: "1" }
                paths:
                  /joined:
                    get:
                      operationId: joined
                      parameters:
                        - { name: has, in: query, style: form, explode: false, schema: { oneOf: [ { type: string }, { type: array, items: { type: string } } ] } }
                      responses: { '204': { description: ok } }
                  /objects:
                    get:
                      operationId: objects
                      parameters:
                        - { name: filter, in: query, style: form, explode: true, schema: { oneOf: [ { type: string }, { type: object, properties: { a: { type: string } } } ] } }
                      responses: { '204': { description: ok } }
                """,
            )

        val mapping = projectMapping(document)

        assertEquals(emptyList(), project(document).operations.map { it.operationIdentity })
        assertEquals(2, mapping.diagnostics.size)
        // A comma-joined union is ambiguous: a scalar containing a comma is indistinguishable from a list.
        assertTrue(
            mapping.diagnostics.any { "is a primitive union and requires explode=true" in it.message },
            mapping.diagnostics.joinToString { it.message },
        )
        // An object branch does not collapse to a flat list of wire strings.
        assertTrue(
            mapping.diagnostics.any {
                "form parameter 'filter' requires a scalar or primitive array schema" in it.message
            },
            mapping.diagnostics.joinToString { it.message },
        )
    }

    @Test
    fun `excludes unsupported parameter serialization while preserving supported form arrays`() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Parameters, version: "1" }
                paths:
                  /items:
                    get:
                      operationId: listItems
                      parameters:
                        - { name: tags, in: query, style: form, explode: true, schema: { type: array, items: { type: string } } }
                      responses: { '204': { description: ok } }
                  /accounts:
                    get:
                      operationId: listAccounts
                      parameters:
                        - { name: expand, in: query, style: deepObject, explode: true, schema: { type: array, items: { type: string } } }
                      responses: { '204': { description: ok } }
                  /widgets/{ids}:
                    get:
                      operationId: getWidgets
                      parameters:
                        - { name: ids, in: path, required: true, style: simple, schema: { type: array, items: { type: string } } }
                      responses: { '204': { description: ok } }
                  /preview:
                    get:
                      operationId: preview
                      parameters:
                        - { name: lines, in: query, style: deepObject, explode: true, schema: { type: array, items: { type: object, properties: { amount: { type: integer } } } } }
                      responses: { '204': { description: ok } }
                """,
            )

        val mapping = projectMapping(document)

        assertEquals(
            listOf("listAccounts", "listItems"),
            project(document).operations.map { it.operationIdentity }.sorted(),
        )
        assertEquals(2, mapping.diagnostics.size)
        assertTrue(mapping.diagnostics.all { it.code == GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION })
        assertTrue(mapping.diagnostics.any { "path parameter 'ids' only supports scalar schema" in it.message })
        assertTrue(
            mapping.diagnostics.any {
                "deepObject parameter 'lines' requires primitive array item schemas" in
                    it.message
            },
        )
        assertEquals(
            listOf(
                "operation:getWidgets",
                "operation:preview",
            ),
            mapping.exclusions.map { it.symbolId }.sorted(),
        )
        assertEquals(
            ParameterSerialization.StripeCompatibleIndexedArray,
            project(
                document,
            ).operations.single { it.operationIdentity == "listAccounts" }.parameters.single().serialization,
        )
    }

    @Test
    fun projectsMixedAdditionalPropertiesAndDeepObjectEntries() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Dynamic filter, version: "1" }
                paths:
                  /widgets:
                    get:
                      operationId: listWidgets
                      parameters:
                        - name: filter
                          in: query
                          style: deepObject
                          explode: true
                          schema: { ${'$'}ref: '#/components/schemas/Filter' }
                      responses: { '204': { description: ok } }
                components:
                  schemas:
                    Filter:
                      type: object
                      additionalProperties: { type: integer }
                      properties:
                        status: { type: string }
                        additionalProperties: { type: string }
                """,
            )

        val mapping = projectMapping(document)
        val model =
            mapping.model.files
                .flatMap(
                    KotlinFileDeclaration::declarations,
                ).filterIsInstance<ModelDeclaration>()
                .single()
        val additional = requireNotNull(model.additionalProperties)
        val serialization =
            assertIs<ParameterSerialization.DeepObject>(
                project(document)
                    .operations
                    .single()
                    .parameters
                    .single()
                    .serialization,
            )

        assertEquals("additionalProperties2", additional.resolvedName)
        assertEquals(KotlinTypeRef("kotlin", "Int"), additional.valueType)
        assertEquals(setOf("status", "additionalProperties"), additional.fixedWireNames)
        assertEquals("additionalProperties2", requireNotNull(serialization.additionalProperties).accessorName)
        assertEquals(
            DeepObjectAdditionalPropertiesSerialization.TO_STRING,
            requireNotNull(serialization.additionalProperties).serialization,
        )
    }

    @Test
    fun projectsDeepObjectEnumAdditionalPropertiesWithWireValueSerialization() {
        val document =
            adapt(
                """
                openapi: 3.1.0
                info: { title: Dynamic filter, version: "1" }
                paths:
                  /widgets:
                    get:
                      operationId: listWidgets
                      parameters:
                        - name: filter
                          in: query
                          style: deepObject
                          explode: true
                          schema: { ${'$'}ref: '#/components/schemas/Filter' }
                      responses: { '204': { description: ok } }
                components:
                  schemas:
                    Filter:
                      type: object
                      properties:
                        fixed: { type: string }
                      additionalProperties: { ${'$'}ref: '#/components/schemas/Status' }
                    Status:
                      type: string
                      enum: [in-progress, complete]
                """,
            )

        val mapping = projectMapping(document)
        val model =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<ModelDeclaration>()
                .single { it.resolvedName == "Filter" }
        val serialization =
            assertIs<ParameterSerialization.DeepObject>(
                project(document)
                    .operations
                    .single()
                    .parameters
                    .single()
                    .serialization,
            )

        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "Status"), requireNotNull(model.additionalProperties).valueType)
        assertEquals(
            DeepObjectAdditionalPropertiesSerialization.OPEN_ENUM_VALUE,
            requireNotNull(serialization.additionalProperties).serialization,
        )
    }

    @Test
    fun formattedScalarsUseTheFrozenPortableTypesAndHonestKdoc() {
        val mapping =
            projectMapping(
                adapt(
                    """
                    openapi: 3.1.0
                    info: { title: Formats, version: "1" }
                    paths:
                      /formats:
                        get:
                          operationId: getFormats
                          parameters:
                            - name: resource
                              in: query
                              description: Resource locator.
                              schema: { type: string, format: uri-reference }
                          responses:
                            '200':
                              description: ok
                              content:
                                application/json:
                                  schema: { ${'$'}ref: '#/components/schemas/FormattedValues' }
                    components:
                      schemas:
                        FormattedValues:
                          type: object
                          properties:
                            uuid: { type: string, format: uuid }
                            uri: { type: string, format: uri }
                            reference: { type: string, format: uri-reference }
                            date: { type: string, format: date }
                            time: { type: string, format: time }
                            dateTime: { type: string, format: date-time }
                            instant: { type: string, format: instant }
                            duration: { type: string, format: duration }
                            encoded: { type: string, format: byte }
                            base64:
                              type: string
                              contentEncoding: base64
                            unknown: { type: string, format: vendor-token }
                            number: { type: number }
                            float: { type: number, format: float }
                            double: { type: number, format: double }
                            binary: { type: string, format: binary }
                    """,
                ),
            )
        val declarations = mapping.model.files.flatMap(KotlinFileDeclaration::declarations)
        val model = declarations.filterIsInstance<ModelDeclaration>().single { it.resolvedName == "FormattedValues" }
        val fields = model.fields.associateBy(FieldDeclaration::wireName)

        listOf(
            "uuid",
            "uri",
            "reference",
            "date",
            "time",
            "dateTime",
            "instant",
            "duration",
            "encoded",
            "base64",
            "unknown",
        ).forEach { name -> assertEquals(KotlinTypeRef("kotlin", "String"), fields.getValue(name).type) }
        listOf("number", "float", "double").forEach { name ->
            assertEquals(KotlinTypeRef("kotlin", "Double"), fields.getValue(name).type)
            assertEquals(
                "Represented as IEEE-754 `Double`; values may lose decimal precision.",
                fields.getValue(name).kdoc,
            )
        }
        assertEquals(
            KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
            fields.getValue("binary").type,
        )
        assertEquals(
            "Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.",
            fields.getValue("uuid").kdoc,
        )
        assertEquals(
            "Wire format: `vendor-token`. Represented as `String` in this release; SDKGen does not validate this format.",
            fields.getValue("unknown").kdoc,
        )
        assertEquals(
            "Base64-encoded wire text. This property is not decoded into bytes.",
            fields.getValue("encoded").kdoc,
        )
        assertEquals(
            "Base64-encoded wire text. This property is not decoded into bytes.",
            fields.getValue("base64").kdoc,
        )
        val parameter =
            declarations
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .single()
                .parameters
                .single()
        assertEquals(KotlinTypeRef("kotlin", "String"), parameter.type)
        assertEquals(
            "Resource locator.\n\nWire format: `uri-reference`. Represented as `String` in this release; " +
                "SDKGen does not validate this format.",
            parameter.kdoc,
        )

        val rendered = KotlinPoetEmitter(GENERATED_PACKAGE).render(mapping.model).files
        val modelSource = rendered.single { it.path.endsWith("/FormattedValues.kt") }.bytes.decodeToString()
        val clientSource =
            rendered
                .single { it.path.endsWith("Client.kt") && "getFormats" in it.bytes.decodeToString() }
                .bytes
                .decodeToString()
        assertTrue(
            modelSource.contains(
                "Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.",
            ),
        )
        assertTrue(modelSource.contains("Base64-encoded wire text. This property is not decoded into bytes."))
        assertTrue(modelSource.contains("Represented as IEEE-754 `Double`; values may lose decimal precision."))
        assertTrue(
            clientSource.contains(
                "@param resource Resource locator.\n   *\n   * Wire format: `uri-reference`. Represented as `String` " +
                    "in this release; SDKGen does not validate this format.",
            ),
            clientSource,
        )
        assertTrue(mapping.diagnostics.none { it.severity == DiagnosticSeverity.WARNING })
    }

    @Test
    fun decimalAndNonStringBinarySchemasFailClosedWithActionableProvenance() {
        fun diagnosticFor(
            propertyName: String,
            schema: String,
        ): GenerationDiagnostic {
            val mapping =
                projectMapping(
                    adapt(
                        """
                        openapi: 3.1.0
                        info: { title: Invalid format, version: "1" }
                        paths: {}
                        components:
                          schemas:
                            Invalid:
                              type: object
                              properties:
                                $propertyName: { $schema }
                        """,
                    ),
                )
            assertTrue(
                mapping.model.files
                    .flatMap(KotlinFileDeclaration::declarations)
                    .none { it is ModelDeclaration && it.resolvedName == "Invalid" },
            )
            return mapping.diagnostics.single { it.code == GenerationDiagnosticCode.UNREPRESENTABLE_SCHEMA }
        }

        val decimal = diagnosticFor("amount", "type: number, format: decimal")
        assertTrue(decimal.message.contains("no approved portable lossless Kotlin representation"), decimal.message)
        assertEquals("/components/schemas/Invalid/properties/amount", decimal.source.jsonPointer)
        assertEquals(
            "Apply an overlay selecting an explicitly lossy number type, or wait for a portable lossless decimal vehicle.",
            decimal.remediation,
        )

        val binary = diagnosticFor("payload", "type: number, format: binary")
        assertTrue(binary.message.contains("format 'binary' with non-string type 'number'"), binary.message)
        assertEquals("/components/schemas/Invalid/properties/payload", binary.source.jsonPointer)
        assertEquals(
            "Declare binary payloads as type 'string', remove format 'binary', or apply an overlay.",
            binary.remediation,
        )

        val operationMapping =
            projectMapping(
                adapt(
                    """
                    openapi: 3.1.0
                    info: { title: Decimal parameter, version: "1" }
                    paths:
                      /amount:
                        get:
                          operationId: getAmount
                          parameters:
                            - name: amount
                              in: query
                              schema: { type: number, format: decimal }
                          responses:
                            '204': { description: ok }
                    """,
                ),
            )
        val operationDiagnostic =
            operationMapping.diagnostics.single {
                it.code == GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION
            }
        assertEquals("/paths/~1amount/get/parameters/0/schema", operationDiagnostic.source.jsonPointer)
        assertEquals(
            "Apply an overlay selecting an explicitly lossy number type, or wait for a portable lossless decimal vehicle.",
            operationDiagnostic.remediation,
        )
    }

    @Test
    fun checkedInAdvisorNestedToolRetainsCurrentEmitterAdditionalPropertiesContract() {
        val document =
            SemanticAdapter()
                .adapt(Path.of(requireNotNull(System.getProperty("engine.openRouterFile"))))
                .document
        val advisor =
            projectMapping(document)
                .model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<ModelDeclaration>()
                .single { model -> model.resolvedName == "AdvisorNestedTool" }
        val rendered =
            KotlinPoetEmitter(GENERATED_PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(KotlinFileDeclaration(GENERATED_PACKAGE, "AdvisorNestedTool", listOf(advisor))),
                    ),
                ).files
                .single { file -> file.path.endsWith("/AdvisorNestedTool.kt") }
                .bytes
                .decodeToString()
        val checkedInPath =
            Path
                .of(requireNotNull(System.getProperty("engine.consumerSourceRoot")))
                .resolve("com/nabobery/sdkgen/generated/AdvisorNestedTool.kt")
        if (System.getenv("UPDATE_OPENROUTER_ADVISOR_NESTED_TOOL_FIXTURE") == "1") {
            checkedInPath.writeText(rendered)
        }
        val checkedIn = checkedInPath.readText()

        // This checked-in fixture predates the current file-level provenance/formatting conventions, so
        // compare the generated mixed-object contract rather than reformatting unrelated generated text.
        listOf(
            "additionalProperties: Map<String, JsonElement> = emptyMap()",
            "copyAndValidateAdvisorNestedToolAdditionalProperties(additionalProperties)",
            "filterKeys { key -> key !in setOf(\"parameters\", \"type\") }",
            "mapValues { (_, element) -> element }.toMap()",
            ".toMap()",
            "value.additionalProperties.keys.sorted().forEach { key ->",
            "collides with a fixed property",
        ).forEach { fragment ->
            assertTrue(rendered.contains(fragment), "emitter missing: $fragment")
            assertTrue(checkedIn.contains(fragment), "checked-in fixture missing: $fragment")
        }
    }

    /**
     * Returns a synthetic aggregate merging every generated per-tag/resource sub-client's operations and
     * security schemes (task T3 partitions operations across sub-clients, so a spec with more than one
     * group no longer has a single client to inspect directly). The root facade client itself carries no
     * operations and is excluded.
     */
    private fun project(
        document: com.nabobery.sdkgen.model.SemanticDocument,
        requestTimeoutMillis: Long = 60_000,
    ): OperationClientDeclaration {
        val mapping = projectMapping(document, requestTimeoutMillis)
        val groupClients =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .filter { client -> client.subClients.isEmpty() }
        return OperationClientDeclaration(
            symbolId = "client:test-aggregate",
            order = Int.MIN_VALUE,
            packageName = GENERATED_PACKAGE,
            fileName = "TestAggregateClient",
            resolvedName = "TestAggregateClient",
            kdoc = "Aggregate of every generated sub-client, for test assertions only.",
            codecsObjectName = "TestAggregateCodecs",
            operations = groupClients.flatMap(OperationClientDeclaration::operations),
            securitySchemes =
                groupClients
                    .flatMap { client -> client.securitySchemes.entries }
                    .associate { entry -> entry.key to entry.value },
        )
    }

    private fun projectMapping(
        document: com.nabobery.sdkgen.model.SemanticDocument,
        requestTimeoutMillis: Long = 60_000,
        modelPrefix: String? = null,
        operationPrefix: String? = null,
    ): DeclarationMappingResult =
        StandardProjection().project(
            DeclarationProjectionRequest(
                document = document,
                packageName = GENERATED_PACKAGE,
                canonicalDocumentUri = document.documentUri,
                clientName = "WidgetsClient",
                modelPrefix = modelPrefix,
                operationPrefix = operationPrefix,
                runtimeDefaults =
                    RuntimeDefaults(
                        requestTimeoutMillis = requestTimeoutMillis,
                        retries = RetryDefaults(maxAttempts = 3),
                    ),
            ),
        )

    private fun adapt(yaml: String): com.nabobery.sdkgen.model.SemanticDocument {
        val path = Files.createTempFile("sdkgen-standard-projection-", ".yaml")
        path.writeText(yaml.trimIndent() + "\n")
        return SemanticAdapter().adapt(path).document
    }

    private companion object {
        const val GENERATED_PACKAGE: String = "com.example.generated"
    }
}
