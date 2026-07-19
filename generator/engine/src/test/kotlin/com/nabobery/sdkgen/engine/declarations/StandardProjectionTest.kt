package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.engine.config.RetryDefaults
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
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
        val client = declarations.filterIsInstance<OperationClientDeclaration>().single()

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
                .single()
                .operations
                .single()
        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "NullablePayload", nullable = true), operation.requestType)
        assertEquals(true, operation.requestBodyRequired)
        assertEquals(stringNullable, operation.parameters.single().type)
        assertEquals(false, operation.parameters.single().required)
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
        val client = declarations.filterIsInstance<OperationClientDeclaration>().single()
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
        assertEquals(listOf("caption", "file", "metadata"), parts.map(MultipartPartDeclaration::name))
        val partsByName = parts.associateBy(MultipartPartDeclaration::name)
        val file = partsByName.getValue("file")
        assertEquals(KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"), file.type)
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
                .single()
        val upload = client.operations.single { it.operationIdentity == "uploadAllOf" }
        val parts = upload.requestBodyAlternatives.single().multipartParts

        assertEquals(listOf("caption", "file"), parts.map(MultipartPartDeclaration::name))
        assertEquals(true, parts.single { it.name == "file" }.required)
        assertEquals("image/png", parts.single { it.name == "file" }.contentType)
        assertEquals(true, parts.single { it.name == "caption" }.required)
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
        val client =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .single()
        val operationNames = client.operations.map(OperationDeclaration::operationId)
        val codecNames =
            client.operations.flatMap { operation ->
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
    fun mixedBufferedAndStreamingSuccessAlternativesAreDiagnosed() {
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

        assertTrue(
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .none { it.operationIdentity == "mixedResponses" },
        )
        assertEquals(
            GenerationDiagnosticCode.MIXED_RESPONSE_MODES,
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
                    .single()
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
                .single()
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
                .single()
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
    fun fieldStateIsEnabledOnlyForPatchMergePatchOrExplicitSchemaOptIn() {
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

    private fun project(
        document: com.nabobery.sdkgen.model.SemanticDocument,
        requestTimeoutMillis: Long = 60_000,
    ): OperationClientDeclaration {
        val mapping = projectMapping(document, requestTimeoutMillis)
        return mapping.model.files
            .flatMap(KotlinFileDeclaration::declarations)
            .filterIsInstance<OperationClientDeclaration>()
            .single()
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
