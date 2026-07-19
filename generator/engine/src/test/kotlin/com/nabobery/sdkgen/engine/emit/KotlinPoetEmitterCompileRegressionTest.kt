@file:Suppress("ktlint:standard:max-line-length")

@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.config.RetryDefaults
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.engine.declarations.AnyOfBranchDeclaration
import com.nabobery.sdkgen.engine.declarations.AnyOfBranchShape
import com.nabobery.sdkgen.engine.declarations.AnyOfDeclaration
import com.nabobery.sdkgen.engine.declarations.DeclarationProjectionRequest
import com.nabobery.sdkgen.engine.declarations.EnumValueDeclaration
import com.nabobery.sdkgen.engine.declarations.FieldDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.ModelDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfCaseDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.OpenEnumDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationDeadlines
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationParameterDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationParameterLocation
import com.nabobery.sdkgen.engine.declarations.OperationRequestBodyAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.OperationSecurityRequirement
import com.nabobery.sdkgen.engine.declarations.OperationSecuritySchemeDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationSecuritySchemeRef
import com.nabobery.sdkgen.engine.declarations.PaginationDeclaration
import com.nabobery.sdkgen.engine.declarations.ResponseSelectorDeclaration
import com.nabobery.sdkgen.engine.declarations.StandardProjection
import com.nabobery.sdkgen.engine.declarations.StreamingDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportKind
import com.nabobery.sdkgen.engine.declarations.UnionFieldDeclaration
import com.nabobery.sdkgen.engine.spi.DeclarationAugmentation
import com.nabobery.sdkgen.engine.spi.applyDeclarationAugmentations
import com.nabobery.sdkgen.model.SourceLocation
import com.nabobery.sdkgen.model.SourcePointer
import com.nabobery.sdkgen.openapi.SemanticAdapter
import org.jetbrains.kotlin.cli.common.ExitCode
import org.jetbrains.kotlin.cli.jvm.K2JVMCompiler
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.net.URLClassLoader
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class KotlinPoetEmitterCompileRegressionTest {
    @Test
    fun affectedGeneratedClientSourcesCompileWithTypedResponsesParametersAndPagination() {
        val string = KotlinTypeRef("kotlin", "String")
        val client =
            OperationClientDeclaration(
                symbolId = "client:CompileClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "CompileClient",
                resolvedName = "CompileClient",
                kdoc = "Compile regression client.",
                codecsObjectName = "CompileCodecs",
                securitySchemes = mapOf("bearer" to OperationSecuritySchemeDeclaration.HttpBearer()),
                operations =
                    listOf(
                        OperationDeclaration(
                            symbolId = "operation:typed",
                            order = 0,
                            operationId = "typed",
                            method = "GET",
                            path = "/typed",
                            requestMediaTypes = emptyList(),
                            responseMediaTypes = emptyList(),
                            successStatusCodes = setOf(200),
                            requestType = KotlinTypeRef("kotlin", "Unit"),
                            responseType = KotlinTypeRef("kotlin", "Unit"),
                            requestCodecPropertyName = "typedRequestCodec",
                            responseCodecPropertyName = "typedResponseCodec",
                            requestCodecConstantName = "TYPED_REQUEST_CODEC_ID",
                            responseCodecConstantName = "TYPED_RESPONSE_CODEC_ID",
                            requestCodecId = "typed.request",
                            responseCodecId = "typed.response",
                            responseMode = OperationResponseMode.BUFFERED,
                            deadlines = OperationDeadlines(null, null, null),
                            methodKdoc = "Typed response compile regression.",
                            security =
                                listOf(
                                    OperationSecurityRequirement(
                                        listOf(OperationSecuritySchemeRef("bearer")),
                                    ),
                                    OperationSecurityRequirement(emptyList()),
                                ),
                            responseAlternatives =
                                listOf(
                                    OperationResponseAlternative(
                                        ResponseSelectorDeclaration.ExactStatus(200),
                                        emptyList(),
                                        KotlinTypeRef("kotlin", "Unit"),
                                    ),
                                    OperationResponseAlternative(
                                        ResponseSelectorDeclaration.Default,
                                        emptyList(),
                                        KotlinTypeRef("kotlin", "Unit"),
                                    ),
                                ),
                        ),
                        OperationDeclaration(
                            symbolId = "operation:page",
                            order = 1,
                            operationId = "page",
                            method = "GET",
                            path = "/files/{id}",
                            requestMediaTypes = emptyList(),
                            responseMediaTypes = listOf("application/json"),
                            successStatusCodes = setOf(200),
                            requestType = KotlinTypeRef("kotlin", "Unit"),
                            responseType = KotlinTypeRef(PACKAGE, "PageResponse"),
                            requestCodecPropertyName = "pageRequestCodec",
                            responseCodecPropertyName = "pageResponseCodec",
                            requestCodecConstantName = "PAGE_REQUEST_CODEC_ID",
                            responseCodecConstantName = "PAGE_RESPONSE_CODEC_ID",
                            requestCodecId = "page.request",
                            responseCodecId = "page.response",
                            responseMode = OperationResponseMode.BUFFERED,
                            deadlines = OperationDeadlines(null, null, null),
                            methodKdoc = "Pagination compile regression.",
                            parameters =
                                listOf(
                                    OperationParameterDeclaration(
                                        "id",
                                        OperationParameterLocation.PATH,
                                        string,
                                        required = true,
                                    ),
                                    OperationParameterDeclaration(
                                        "cursor",
                                        OperationParameterLocation.QUERY,
                                        string,
                                        required = false,
                                    ),
                                    OperationParameterDeclaration(
                                        "limit",
                                        OperationParameterLocation.QUERY,
                                        KotlinTypeRef("kotlin", "Int"),
                                        required = false,
                                    ),
                                ),
                            pagination =
                                PaginationDeclaration.CursorToken(
                                    requestCursorParam = "cursor",
                                    requestLimitParam = "limit",
                                    responseItemsPath = "data",
                                    responseNextCursorPath = "nextCursor",
                                    itemType = string,
                                ),
                        ),
                    ),
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE).render(
                KotlinDeclarationModel(
                    listOf(
                        KotlinFileDeclaration(
                            PACKAGE,
                            "CompileClient",
                            listOf(client),
                        ),
                        KotlinFileDeclaration(
                            PACKAGE,
                            "SerializationSupport",
                            listOf(
                                SupportDeclaration(
                                    "support:serialization",
                                    0,
                                    PACKAGE,
                                    "SerializationSupport",
                                    "SerializationSupport",
                                    "",
                                    SupportKind.Serialization,
                                ),
                            ),
                        ),
                    ),
                ),
            )
        compileGenerated(
            rendered +
                RenderedKotlinFile(
                    "${PACKAGE.replace('.', '/')}/PageResponse.kt",
                    pageResponseStub().encodeToByteArray(),
                ),
        )
    }

    @Test
    fun projectedPlainOptionalNullableFieldsDecodeAbsentNullAndValue() {
        val source =
            Files.createTempFile("sdkgen-plain-optional-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Plain optional, version: "1" }
                    paths:
                      /profiles:
                        get:
                          operationId: getProfile
                          responses:
                            "200":
                              description: ok
                              content:
                                application/json:
                                  schema: { ${'$'}ref: '#/components/schemas/Profile' }
                    components:
                      schemas:
                        Profile:
                          type: object
                          properties:
                            nickname: { type: [string, "null"] }
                            label: { type: string }
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "ProfileClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model)
        val profileSource = rendered.single { it.path.endsWith("/Profile.kt") }.bytes.decodeToString()
        assertFalse(profileSource.contains("FieldState"))
        assertTrue(profileSource.contains("if (element == JsonNull) null"))

        val harness =
            """
            package $PACKAGE

            fun decode(raw: String): String {
                val profile = SdkJson.decodeFromString(Profile.Serializer, raw)
                return "${'$'}{profile.nickname ?: "<null>"}|${'$'}{profile.label ?: "<absent>"}"
            }

            fun explicitNullForNonNullableOptionalIsRejected(raw: String): String =
                try {
                    SdkJson.decodeFromString(Profile.Serializer, raw)
                    "accepted"
                } catch (_: Throwable) {
                    "rejected"
                }
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/PlainOptionalHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val harnessClass = loader.loadClass("$PACKAGE.PlainOptionalHarnessKt")
            val decode = harnessClass.getMethod("decode", String::class.java)
            assertEquals("<null>|<absent>", decode.invoke(null, "{}"))
            assertEquals("<null>|label", decode.invoke(null, "{\"nickname\":null,\"label\":\"label\"}"))
            assertEquals("nick|label", decode.invoke(null, "{\"nickname\":\"nick\",\"label\":\"label\"}"))

            val reject = harnessClass.getMethod("explicitNullForNonNullableOptionalIsRejected", String::class.java)
            assertEquals("rejected", reject.invoke(null, "{\"label\":null}"))
        }
    }

    @Test
    fun edgeShapeSourcesAvoidKnownKotlinCompilerErrors() {
        val rendered =
            KotlinPoetEmitter(PACKAGE).render(edgeShapeModel()).associate {
                it.path to
                    it.bytes.decodeToString()
            }
        val model = rendered.getValue("com/example/generated/AllRequired.kt")
        val firstUnion = rendered.getValue("com/example/generated/ChoiceOne.kt")
        val secondUnion = rendered.getValue("com/example/generated/ChoiceTwo.kt")
        val client = rendered.getValue("com/example/generated/EdgeClient.kt")

        assertFalse(model.contains("public constructor("))
        assertFalse(model.contains("lateinit var count: Int"))
        assertFalse(model.contains("lateinit var enabled: Boolean"))
        assertTrue(model.contains("private var countValue: Int?"))
        assertTrue(model.contains("private var enabledValue: Boolean?"))

        assertTrue(firstUnion.contains("ChoiceOneDecodingException"))
        assertTrue(secondUnion.contains("ChoiceTwoDecodingException"))
        assertFalse(firstUnion.contains("UnionDecodingException"))
        assertFalse(secondUnion.contains("UnionDecodingException"))
        assertTrue(firstUnion.contains("decodeFromJsonElement<Status>"))
        assertTrue(firstUnion.contains("decodeFromJsonElement<Int>"))
        assertTrue(firstUnion.contains("decodeFromJsonElement<List<String>>"))
        assertTrue(firstUnion.contains("decodeFromJsonElement<Profile>"))
        assertTrue(secondUnion.contains("isJsonDecodable<Status>"))
        assertTrue(secondUnion.contains("isJsonDecodable<Int>"))
        assertTrue(secondUnion.contains("isJsonDecodable<List<String>>"))
        assertTrue(secondUnion.contains("isJsonDecodable<Profile>"))

        assertTrue(client.contains("Int.serializer()"))
        assertTrue(client.contains("Payload.Serializer.nullable"))
        assertTrue(client.contains("MediaTypeCodecRegistry.of()"))
        assertTrue(client.contains("public suspend fun bodyless(options: CallOptions = CallOptions()): Unit"))
        assertTrue(client.contains("public suspend fun uploadBinary(request: SdkByteStream"))
        assertTrue(
            client.contains("public suspend fun downloadBinary(options: CallOptions = CallOptions()): SdkByteStream"),
        )
        assertFalse(client.contains("SdkByteStream.serializer()"))
        assertFalse(client.contains("Unit.serializer()"))
    }

    @Test
    fun requiredNullableOneOfFieldsRequirePresenceAndSuccessfulDecode() {
        val nullableString = KotlinTypeRef("kotlin", "String", nullable = true)
        val choice =
            OneOfDeclaration(
                symbolId = "schema:NullableChoice",
                order = 0,
                packageName = PACKAGE,
                fileName = "NullableChoice",
                resolvedName = "NullableChoice",
                kdoc = "Required nullable oneOf compile regression.",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:NullableChoice/nullable",
                            order = 0,
                            resolvedName = "NullableValue",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration(
                                        resolvedName = "value",
                                        wireName = "value",
                                        type = nullableString,
                                    ),
                                ),
                        ),
                    ),
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(PACKAGE, "NullableChoice", listOf(choice)),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                "support:serialization",
                                0,
                                PACKAGE,
                                "SerializationSupport",
                                "SerializationSupport",
                                "",
                                SupportKind.Serialization,
                            ),
                        ),
                    ),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(model)
        val source = rendered.single { it.path.endsWith("NullableChoice.kt") }.bytes.decodeToString()

        assertTrue(source.contains("val valueResult = raw[\"value\"]?.let"))
        assertTrue(source.contains("val valuePresent = raw.containsKey(\"value\")"))
        assertTrue(source.contains("val valueDecoded = valueResult?.isSuccess == true"))
        assertTrue(source.contains("valuePresent && valueDecoded"))
        assertTrue(source.contains("value = matches.value"))
        compileGenerated(rendered)
    }

    @Test
    fun sharedOneOfFieldShapesRemainQualifiedAcrossBranchOrdersAndDecodeSemantics() {
        val string = KotlinTypeRef("kotlin", "String")
        val nullableString = string.copy(nullable = true)

        fun branch(
            name: String,
            order: Int,
            type: KotlinTypeRef,
        ): OneOfCaseDeclaration =
            OneOfCaseDeclaration(
                symbolId = "schema:SharedValue/$name",
                order = order,
                resolvedName = name,
                requiredFields =
                    listOf(
                        UnionFieldDeclaration(
                            resolvedName = "value",
                            wireName = "value",
                            type = type,
                        ),
                    ),
            )

        fun union(
            name: String,
            cases: List<OneOfCaseDeclaration>,
        ): OneOfDeclaration =
            OneOfDeclaration(
                symbolId = "schema:$name",
                order = 0,
                packageName = PACKAGE,
                fileName = name,
                resolvedName = name,
                kdoc = "Shared oneOf value regression.",
                cases = cases,
            )

        fun discriminatorBranch(
            name: String,
            order: Int,
            expected: String,
        ): OneOfCaseDeclaration =
            OneOfCaseDeclaration(
                symbolId = "schema:SharedValueDiscriminator/$name",
                order = order,
                resolvedName = name,
                requiredFields =
                    listOf(
                        UnionFieldDeclaration(
                            resolvedName = "value",
                            wireName = "value",
                            type = string,
                        ),
                    ),
                matchFields =
                    listOf(
                        UnionFieldDeclaration(
                            resolvedName = "value",
                            wireName = "value",
                            type = string,
                            expectedStringValue = expected,
                        ),
                    ),
            )

        val forward =
            union(
                "SharedValueForward",
                listOf(
                    branch("StringValue", 0, string),
                    branch("NullableValue", 1, nullableString),
                ),
            )
        val reverse =
            union(
                "SharedValueReverse",
                listOf(
                    branch("NullableValue", 0, nullableString),
                    branch("StringValue", 1, string),
                ),
            )
        val discriminator =
            union(
                "SharedValueDiscriminator",
                listOf(
                    discriminatorBranch("Alpha", 0, "a"),
                    discriminatorBranch("Beta", 1, "b"),
                ),
            )
        val support =
            SupportDeclaration(
                "support:serialization",
                0,
                PACKAGE,
                "SerializationSupport",
                "SerializationSupport",
                "",
                SupportKind.Serialization,
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(PACKAGE, "SharedValueForward", listOf(forward)),
                    KotlinFileDeclaration(PACKAGE, "SharedValueReverse", listOf(reverse)),
                    KotlinFileDeclaration(PACKAGE, "SharedValueDiscriminator", listOf(discriminator)),
                    KotlinFileDeclaration(PACKAGE, "SerializationSupport", listOf(support)),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(model)
        val forwardSource = rendered.single { it.path.endsWith("SharedValueForward.kt") }.bytes.decodeToString()
        val reverseSource = rendered.single { it.path.endsWith("SharedValueReverse.kt") }.bytes.decodeToString()

        listOf(forwardSource, reverseSource).forEach { source ->
            assertTrue(source.contains("decodeFromJsonElement<String>(element)"))
            assertTrue(source.contains("decodeFromJsonElement<String?>(element)"))
            assertTrue(source.contains("valueState1Result"))
            assertTrue(source.contains("valueState2Result"))
            assertTrue(source.contains("valueState2Present"))
            assertFalse(source.contains("valueState1Present"))
            assertTrue(source.contains("matches.valueState1Decoded"))
            assertTrue(source.contains("matches.valueState2Present && matches.valueState2Decoded"))
        }

        val harness =
            """
            package $PACKAGE

            private fun classifyForward(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(SharedValueForward.Serializer, raw)) {
                        is SharedValueForward.StringValue -> "non-nullable"
                        is SharedValueForward.NullableValue -> "nullable"
                        else -> "unknown"
                    }
                } catch (_: SharedValueForwardAmbiguityException) {
                    "ambiguity"
                } catch (_: SharedValueForwardNoMatchException) {
                    "no-match"
                }

            fun forward(raw: String): String = classifyForward(raw)

            fun discriminator(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(SharedValueDiscriminator.Serializer, raw)) {
                        is SharedValueDiscriminator.Alpha -> "alpha"
                        is SharedValueDiscriminator.Beta -> "beta"
                        else -> "unknown"
                    }
                } catch (_: SharedValueDiscriminatorNoMatchException) {
                    "no-match"
                }

            private fun classifyReverse(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(SharedValueReverse.Serializer, raw)) {
                        is SharedValueReverse.StringValue -> "non-nullable"
                        is SharedValueReverse.NullableValue -> "nullable"
                        else -> "unknown"
                    }
                } catch (_: SharedValueReverseAmbiguityException) {
                    "ambiguity"
                } catch (_: SharedValueReverseNoMatchException) {
                    "no-match"
                }

            fun reverse(raw: String): String = classifyReverse(raw)
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/SharedValueHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val harnessClass = loader.loadClass("$PACKAGE.SharedValueHarnessKt")

            fun assertCases(methodName: String) {
                val method = harnessClass.getMethod(methodName, String::class.java)
                assertEquals("nullable", method.invoke(null, "{\"value\":null}"))
                assertEquals("no-match", method.invoke(null, "{}"))
                assertEquals("no-match", method.invoke(null, "{\"value\":7}"))
                assertEquals("ambiguity", method.invoke(null, "{\"value\":\"ok\"}"))
            }

            assertCases("forward")
            assertCases("reverse")

            val discriminator = harnessClass.getMethod("discriminator", String::class.java)
            assertEquals("alpha", discriminator.invoke(null, "{\"value\":\"a\"}"))
            assertEquals("beta", discriminator.invoke(null, "{\"value\":\"b\"}"))
            assertEquals("no-match", discriminator.invoke(null, "{\"value\":\"c\"}"))
        }
    }

    @Test
    fun oneOfInspectionNamesAvoidStateHelperAndFixedMemberCollisions() {
        val string = KotlinTypeRef("kotlin", "String")
        val nullableString = string.copy(nullable = true)
        val valueCollision =
            OneOfDeclaration(
                symbolId = "schema:ValueCollision",
                order = 0,
                packageName = PACKAGE,
                fileName = "ValueCollision",
                resolvedName = "ValueCollision",
                kdoc = "Value/helper name collision regression.",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:ValueCollision/foo",
                            order = 0,
                            resolvedName = "Foo",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration("foo", "foo", nullableString),
                                ),
                        ),
                        OneOfCaseDeclaration(
                            symbolId = "schema:ValueCollision/fooDecoded",
                            order = 1,
                            resolvedName = "FooDecoded",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration("fooDecoded", "foo_decoded", string),
                                ),
                        ),
                    ),
            )
        val inspectionCollision =
            OneOfDeclaration(
                symbolId = "schema:InspectionCollision",
                order = 0,
                packageName = PACKAGE,
                fileName = "InspectionCollision",
                resolvedName = "InspectionCollision",
                kdoc = "Inspection member name collision regression.",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:InspectionCollision/alpha",
                            order = 0,
                            resolvedName = "Alpha",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration("failures", "failures", string),
                                ),
                            matchFields =
                                listOf(
                                    UnionFieldDeclaration("alpha", "alpha", nullableString, expectedStringValue = "a"),
                                    UnionFieldDeclaration("alphaResult", "alpha_result", string),
                                    UnionFieldDeclaration("alphaPresent", "alpha_present", string),
                                    UnionFieldDeclaration("alphaMatches", "alpha_matches", string),
                                    UnionFieldDeclaration("failures", "failures", string),
                                    UnionFieldDeclaration("names", "names", string),
                                    UnionFieldDeclaration("raw", "raw", string),
                                    UnionFieldDeclaration("size", "size", string),
                                ),
                        ),
                        OneOfCaseDeclaration(
                            symbolId = "schema:InspectionCollision/beta",
                            order = 1,
                            resolvedName = "Beta",
                            requiredFields = emptyList(),
                            matchFields =
                                listOf(
                                    UnionFieldDeclaration("beta", "beta", string, expectedStringValue = "b"),
                                ),
                        ),
                    ),
            )
        val support =
            SupportDeclaration(
                "support:serialization",
                0,
                PACKAGE,
                "SerializationSupport",
                "SerializationSupport",
                "",
                SupportKind.Serialization,
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(PACKAGE, "ValueCollision", listOf(valueCollision)),
                    KotlinFileDeclaration(PACKAGE, "InspectionCollision", listOf(inspectionCollision)),
                    KotlinFileDeclaration(PACKAGE, "SerializationSupport", listOf(support)),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(model)
        val rerendered = KotlinPoetEmitter(PACKAGE).render(model)
        val valueSource = rendered.single { it.path.endsWith("ValueCollision.kt") }.bytes.decodeToString()
        val inspectionSource = rendered.single { it.path.endsWith("InspectionCollision.kt") }.bytes.decodeToString()

        assertEquals(
            rendered.map { it.path to it.bytes.decodeToString() },
            rerendered.map { it.path to it.bytes.decodeToString() },
        )
        assertTrue(valueSource.contains("raw[\"foo\"]"))
        assertTrue(valueSource.contains("raw[\"foo_decoded\"]"))
        listOf("alpha", "alpha_result", "alpha_present", "alpha_matches", "failures", "names", "raw", "size")
            .forEach {
                assertTrue(inspectionSource.contains("raw[\"$it\"]"))
            }

        val harness =
            """
            package $PACKAGE

            fun valueCollision(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(ValueCollision.Serializer, raw)) {
                        is ValueCollision.Foo -> "foo"
                        is ValueCollision.FooDecoded -> "foo-decoded"
                        else -> "unknown"
                    }
                } catch (_: ValueCollisionNoMatchException) {
                    "no-match"
                }

            fun inspectionCollision(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(InspectionCollision.Serializer, raw)) {
                        is InspectionCollision.Alpha -> "alpha"
                        is InspectionCollision.Beta -> "beta"
                        else -> "unknown"
                    }
                } catch (_: InspectionCollisionNoMatchException) {
                    "no-match"
                }
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/CollisionHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val harnessClass = loader.loadClass("$PACKAGE.CollisionHarnessKt")
            val valueMethod = harnessClass.getMethod("valueCollision", String::class.java)
            assertEquals("foo", valueMethod.invoke(null, "{\"foo\":null}"))
            assertEquals("foo-decoded", valueMethod.invoke(null, "{\"foo_decoded\":\"ok\"}"))
            assertEquals("no-match", valueMethod.invoke(null, "{}"))

            val inspectionMethod = harnessClass.getMethod("inspectionCollision", String::class.java)
            assertEquals(
                "alpha",
                inspectionMethod.invoke(
                    null,
                    "{\"alpha\":\"a\",\"alpha_result\":\"r\",\"alpha_present\":\"p\"," +
                        "\"alpha_matches\":\"m\",\"failures\":\"f\",\"names\":\"n\"," +
                        "\"raw\":\"r\",\"size\":\"s\"}",
                ),
            )
            assertEquals("no-match", inspectionMethod.invoke(null, "{\"alpha\":\"a\"}"))
            assertEquals("beta", inspectionMethod.invoke(null, "{\"beta\":\"b\"}"))
        }
    }

    @Test
    fun binarySuccessWithTypedErrorAlternativesCompilesWithExactRangeDefaultAndUnknownViews() {
        val operation =
            OperationDeclaration(
                symbolId = "operation:downloadBinary",
                order = 0,
                operationId = "downloadBinary",
                method = "GET",
                path = "/files/{id}",
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/octet-stream"),
                successStatusCodes = setOf(200),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                requestCodecPropertyName = "downloadBinaryRequestCodec",
                responseCodecPropertyName = "downloadBinaryResponseCodec",
                requestCodecConstantName = "DOWNLOAD_BINARY_REQUEST_CODEC_ID",
                responseCodecConstantName = "DOWNLOAD_BINARY_RESPONSE_CODEC_ID",
                requestCodecId = "downloadBinary.request",
                responseCodecId = "downloadBinary.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Downloads a binary response.",
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("application/octet-stream"),
                            KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.StatusRange(400, 499),
                            listOf("application/json"),
                            KotlinTypeRef("kotlin", "String"),
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.Default,
                            emptyList(),
                            KotlinTypeRef("kotlin", "Unit"),
                        ),
                    ),
            )
        val customNonTwoXxSuccess =
            OperationDeclaration(
                symbolId = "operation:downloadNotModified",
                order = 1,
                operationId = "downloadNotModified",
                method = "GET",
                path = "/files/cached",
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/octet-stream"),
                successStatusCodes = setOf(304),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                requestCodecPropertyName = "downloadNotModifiedRequestCodec",
                responseCodecPropertyName = "downloadNotModifiedResponseCodec",
                requestCodecConstantName = "DOWNLOAD_NOT_MODIFIED_REQUEST_CODEC_ID",
                responseCodecConstantName = "DOWNLOAD_NOT_MODIFIED_RESPONSE_CODEC_ID",
                requestCodecId = "downloadNotModified.request",
                responseCodecId = "downloadNotModified.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Downloads an explicitly successful cached response.",
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(304),
                            listOf("application/octet-stream"),
                            KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                        ),
                    ),
            )
        val client =
            OperationClientDeclaration(
                symbolId = "client:BinaryClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "BinaryClient",
                resolvedName = "BinaryClient",
                kdoc = "Binary response compile regression client.",
                codecsObjectName = "BinaryCodecs",
                operations = listOf(operation, customNonTwoXxSuccess),
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(PACKAGE, "BinaryClient", listOf(client)),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                "support:serialization",
                                0,
                                PACKAGE,
                                "SerializationSupport",
                                "SerializationSupport",
                                "",
                                SupportKind.Serialization,
                            ),
                        ),
                    ),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(model)
        val source = rendered.single { it.path.endsWith("BinaryClient.kt") }.bytes.decodeToString()

        assertTrue(source.contains("public suspend fun downloadBinaryWithResponse("))
        assertTrue(source.contains("public class SuccessOctetStream("))
        assertTrue(source.contains("public class Http400To499Json("))
        assertTrue(source.contains("public class DefaultNoContent("))
        assertTrue(source.contains("public class Unknown("))
        assertTrue(source.contains("SdkResponseDecodeResult<DownloadBinaryResponse>"))
        assertTrue(source.contains("alternative.id == \"downloadBinary.response.alternative0\""))
        assertTrue(source.contains("bytes = body"))
        assertTrue(source.contains("transferBody = true"))
        assertTrue(source.contains("public suspend fun downloadNotModifiedWithResponse("))
        assertTrue(source.contains("alternative.id == \"downloadNotModified.response.alternative0\""))
        assertTrue(source.contains("successStatusCodes = setOf(304)"))
        assertFalse(source.contains("SdkByteStream.serializer()"))
        assertFalse(source.contains("io.ktor"))
        assertFalse(source.contains("okhttp3"))
        compileGenerated(rendered)
    }

    @Test
    fun compatibleStreamingAlternativesCompileWithTheCallableStreamingMethod() {
        val string = KotlinTypeRef("kotlin", "String")
        val operation =
            OperationDeclaration(
                symbolId = "operation:streamVariants",
                order = 0,
                operationId = "streamVariants",
                method = "GET",
                path = "/stream",
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("text/event-stream", "application/x-ndjson"),
                successStatusCodes = setOf(200),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = string,
                requestCodecPropertyName = "streamVariantsRequestCodec",
                responseCodecPropertyName = "streamVariantsResponseCodec",
                requestCodecConstantName = "STREAM_VARIANTS_REQUEST_CODEC_ID",
                responseCodecConstantName = "STREAM_VARIANTS_RESPONSE_CODEC_ID",
                requestCodecId = "streamVariants.request",
                responseCodecId = "streamVariants.response",
                responseMode = OperationResponseMode.STREAMING,
                deadlines = OperationDeadlines(null, 30_000, null),
                methodKdoc = "Streams compatible variants.",
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("text/event-stream"),
                            string,
                            OperationResponseMode.STREAMING,
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("application/x-ndjson"),
                            string,
                            OperationResponseMode.STREAMING,
                        ),
                    ),
                streaming = StreamingDeclaration.ServerSentEvents("[DONE]"),
            )
        val client =
            OperationClientDeclaration(
                symbolId = "client:StreamingClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "StreamingClient",
                resolvedName = "StreamingClient",
                kdoc = "Streaming compile regression client.",
                codecsObjectName = "StreamingCodecs",
                operations = listOf(operation),
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE).render(
                KotlinDeclarationModel(
                    listOf(
                        KotlinFileDeclaration(PACKAGE, "StreamingClient", listOf(client)),
                        KotlinFileDeclaration(
                            PACKAGE,
                            "SerializationSupport",
                            listOf(
                                SupportDeclaration(
                                    "support:serialization",
                                    0,
                                    PACKAGE,
                                    "SerializationSupport",
                                    "SerializationSupport",
                                    "",
                                    SupportKind.Serialization,
                                ),
                            ),
                        ),
                    ),
                ),
            )
        val source = rendered.single { it.path.endsWith("StreamingClient.kt") }.bytes.decodeToString()

        assertTrue(source.contains("public fun streamVariants("))
        assertTrue(source.contains("): Flow<String>"))
        assertFalse(source.contains("public suspend fun streamVariantsWithResponse("))
        compileGenerated(rendered)
    }

    @Test
    fun incompatibleJsonAndBinarySuccessesCompileWithOnlyTypedResponseApisInEitherOrder() {
        val string = KotlinTypeRef("kotlin", "String")
        val binary = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
        val jsonAlternative =
            OperationResponseAlternative(
                ResponseSelectorDeclaration.ExactStatus(200),
                listOf("application/json"),
                string,
            )
        val binaryAlternative =
            OperationResponseAlternative(
                ResponseSelectorDeclaration.ExactStatus(200),
                listOf("application/octet-stream"),
                binary,
            )
        val operations =
            listOf(
                "jsonFirst" to listOf(jsonAlternative, binaryAlternative),
                "binaryFirst" to listOf(binaryAlternative, jsonAlternative),
            ).mapIndexed { index, (operationId, alternatives) ->
                OperationDeclaration(
                    symbolId = "operation:$operationId",
                    order = index,
                    operationId = operationId,
                    method = "GET",
                    path = "/$operationId",
                    requestMediaTypes = emptyList(),
                    responseMediaTypes = listOf("application/json", "application/octet-stream"),
                    successStatusCodes = setOf(200),
                    requestType = KotlinTypeRef("kotlin", "Unit"),
                    responseType = alternatives.first().type,
                    requestCodecPropertyName = "${operationId}RequestCodec",
                    responseCodecPropertyName = "${operationId}ResponseCodec",
                    requestCodecConstantName = "${operationId.uppercase()}_REQUEST_CODEC_ID",
                    responseCodecConstantName = "${operationId.uppercase()}_RESPONSE_CODEC_ID",
                    requestCodecId = "$operationId.request",
                    responseCodecId = "$operationId.response",
                    responseMode = OperationResponseMode.BUFFERED,
                    deadlines = OperationDeadlines(null, null, null),
                    methodKdoc = "Returns JSON or binary content.",
                    responseAlternatives = alternatives,
                    pagination =
                        PaginationDeclaration.CursorToken(
                            requestCursorParam = "cursor",
                            requestLimitParam = null,
                            responseItemsPath = "items",
                            responseNextCursorPath = "nextCursor",
                            itemType = string,
                        ),
                )
            }
        val client =
            OperationClientDeclaration(
                symbolId = "client:MixedMediaClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "MixedMediaClient",
                resolvedName = "MixedMediaClient",
                kdoc = "Mixed-media success compile regression client.",
                codecsObjectName = "MixedMediaCodecs",
                operations = operations,
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE).render(
                KotlinDeclarationModel(
                    listOf(
                        KotlinFileDeclaration(PACKAGE, "MixedMediaClient", listOf(client)),
                        KotlinFileDeclaration(
                            PACKAGE,
                            "SerializationSupport",
                            listOf(
                                SupportDeclaration(
                                    "support:serialization",
                                    0,
                                    PACKAGE,
                                    "SerializationSupport",
                                    "SerializationSupport",
                                    "",
                                    SupportKind.Serialization,
                                ),
                            ),
                        ),
                    ),
                ),
            )
        val source = rendered.single { it.path.endsWith("MixedMediaClient.kt") }.bytes.decodeToString()

        assertTrue(source.contains("public suspend fun jsonFirstWithResponse("))
        assertTrue(source.contains("public suspend fun binaryFirstWithResponse("))
        assertFalse(source.contains("public suspend fun jsonFirst("))
        assertFalse(source.contains("public suspend fun binaryFirst("))
        assertFalse(source.contains("public fun jsonFirstPages("))
        assertFalse(source.contains("public fun binaryFirstPages("))
        compileGenerated(rendered)
    }

    @Test
    fun renamedModelReferencesCompileAcrossModelsUnionsOperationsAndDerivedTypes() {
        val child = KotlinTypeRef(PACKAGE, "Child")
        val childList = KotlinTypeRef("kotlin.collections", "List", listOf(child))
        val childModel =
            ModelDeclaration(
                symbolId = "schema:Child",
                order = 0,
                packageName = PACKAGE,
                fileName = "Child",
                resolvedName = "Child",
                kdoc = "Child model.",
                fields =
                    listOf(
                        FieldDeclaration(
                            symbolId = "schema:Child/value",
                            order = 0,
                            resolvedName = "value",
                            wireName = "value",
                            type = KotlinTypeRef("kotlin", "String"),
                            required = true,
                            nullable = false,
                            kdoc = "",
                        ),
                    ),
                dslFunctionName = "child",
            )
        val parentModel =
            ModelDeclaration(
                symbolId = "schema:Parent",
                order = 1,
                packageName = PACKAGE,
                fileName = "Parent",
                resolvedName = "Parent",
                kdoc = "Parent model referencing Child.",
                fields =
                    listOf(
                        FieldDeclaration(
                            symbolId = "schema:Parent/child",
                            order = 0,
                            resolvedName = "child",
                            wireName = "child",
                            type = child,
                            required = true,
                            nullable = false,
                            kdoc = "",
                        ),
                        FieldDeclaration(
                            symbolId = "schema:Parent/children",
                            order = 1,
                            resolvedName = "children",
                            wireName = "children",
                            type = childList,
                            required = true,
                            nullable = false,
                            kdoc = "",
                        ),
                        FieldDeclaration(
                            symbolId = "schema:Parent/nextCursor",
                            order = 2,
                            resolvedName = "nextCursor",
                            wireName = "nextCursor",
                            type = KotlinTypeRef("kotlin", "String", nullable = true),
                            required = false,
                            nullable = true,
                            kdoc = "",
                        ),
                    ),
                dslFunctionName = "parent",
            )
        val choice =
            OneOfDeclaration(
                symbolId = "schema:Choice",
                order = 2,
                packageName = PACKAGE,
                fileName = "Choice",
                resolvedName = "Choice",
                kdoc = "Union referencing Child.",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:Choice/child",
                            order = 0,
                            resolvedName = "ChildValue",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration(
                                        resolvedName = "child",
                                        wireName = "child",
                                        type = child,
                                    ),
                                ),
                        ),
                    ),
            )
        val operation =
            OperationDeclaration(
                symbolId = "operation:search",
                order = 0,
                operationId = "search",
                method = "POST",
                path = "/search",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200),
                requestType = childList,
                responseType = KotlinTypeRef(PACKAGE, "Parent"),
                requestCodecPropertyName = "searchRequestCodec",
                responseCodecPropertyName = "searchResponseCodec",
                requestCodecConstantName = "SEARCH_REQUEST_CODEC_ID",
                responseCodecConstantName = "SEARCH_RESPONSE_CODEC_ID",
                requestCodecId = "search.request",
                responseCodecId = "search.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Searches using renamed model references.",
                parameters =
                    listOf(
                        OperationParameterDeclaration(
                            name = "child",
                            location = OperationParameterLocation.QUERY,
                            type = child,
                            required = false,
                        ),
                    ),
                requestBodyAlternatives =
                    listOf(
                        OperationRequestBodyAlternative(
                            mediaType = "application/json",
                            type = childList,
                            required = true,
                        ),
                    ),
                requestBodyRequired = true,
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            selector = ResponseSelectorDeclaration.ExactStatus(200),
                            mediaTypes = listOf("application/json"),
                            type = KotlinTypeRef(PACKAGE, "Parent"),
                        ),
                    ),
                pagination =
                    PaginationDeclaration.CursorToken(
                        requestCursorParam = "cursor",
                        requestLimitParam = null,
                        responseItemsPath = "children",
                        responseNextCursorPath = "nextCursor",
                        itemType = child,
                    ),
            )
        val client =
            OperationClientDeclaration(
                symbolId = "client:RenameClient",
                order = 3,
                packageName = PACKAGE,
                fileName = "RenameClient",
                resolvedName = "RenameClient",
                kdoc = "Client referencing renamed models.",
                codecsObjectName = "RenameCodecs",
                operations = listOf(operation),
            )
        val original =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(
                        PACKAGE,
                        "FieldPresence",
                        listOf(
                            SupportDeclaration(
                                "support:presence",
                                0,
                                PACKAGE,
                                "FieldPresence",
                                "FieldPresence",
                                "",
                                SupportKind.FieldPresence,
                            ),
                        ),
                    ),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                "support:serialization",
                                1,
                                PACKAGE,
                                "SerializationSupport",
                                "SerializationSupport",
                                "",
                                SupportKind.Serialization,
                            ),
                        ),
                    ),
                    KotlinFileDeclaration(PACKAGE, "Child", listOf(childModel)),
                    KotlinFileDeclaration(PACKAGE, "Parent", listOf(parentModel)),
                    KotlinFileDeclaration(PACKAGE, "Choice", listOf(choice)),
                    KotlinFileDeclaration(PACKAGE, "RenameClient", listOf(client)),
                ),
            )
        val renamed =
            applyDeclarationAugmentations(
                original,
                listOf(
                    DeclarationAugmentation(
                        symbolId = "schema:Child",
                        resolvedName = "RenamedChild",
                        source = sourcePointer(),
                    ),
                ),
            )
        val renamedOperation =
            renamed.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .single()
                .operations
                .single()

        assertEquals(KotlinTypeRef(PACKAGE, "RenamedChild"), renamedOperation.parameters.single().type)
        assertEquals(
            KotlinTypeRef(PACKAGE, "RenamedChild"),
            (renamedOperation.pagination as PaginationDeclaration.CursorToken).itemType,
        )

        val rendered = KotlinPoetEmitter(PACKAGE).render(renamed)

        assertTrue(rendered.any { it.path.endsWith("/RenamedChild.kt") })
        assertFalse(rendered.any { it.bytes.decodeToString().contains("com.example.generated.Child") })
        compileGenerated(rendered)
    }

    @Test
    fun referencedAnyOfBranchViewsAreEmittedOnceAndSharedAcrossUnions() {
        val source =
            Files.createTempFile("sdkgen-shared-anyof-view-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Shared anyOf view, version: "1" }
                    paths: {}
                    components:
                      schemas:
                        SharedTool:
                          type: object
                          required: [kind]
                          properties:
                            kind: { type: string }
                        FirstUnion:
                          anyOf:
                            - ${'$'}ref: '#/components/schemas/SharedTool'
                            - type: object
                              required: [first]
                              properties:
                                first: { type: string }
                        SecondUnion:
                          anyOf:
                            - type: object
                              required: [second]
                              properties:
                                second: { type: string }
                            - ${'$'}ref: '#/components/schemas/SharedTool'
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "SharedViewClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model)
        val viewDeclarations =
            rendered.flatMap { file ->
                file.bytes
                    .decodeToString()
                    .lineSequence()
                    .filter { line -> line.startsWith("public data class SharedToolView(") }
                    .map { file.path }
            }

        assertEquals(listOf("com/example/generated/SharedTool.kt"), viewDeclarations)
        compileGenerated(rendered)
    }

    @Test
    fun referencedAnyOfBranchWithOnlyOptionalPropertiesEmitsACompilableUsefulView() {
        val source =
            Files.createTempFile("sdkgen-optional-anyof-view-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Optional anyOf view, version: "1" }
                    paths: {}
                    components:
                      schemas:
                        OptionalCutoffs:
                          type: object
                          properties:
                            p50: { type: number }
                            label: { type: string }
                        RoutingPreference:
                          anyOf:
                            - ${'$'}ref: '#/components/schemas/OptionalCutoffs'
                            - type: object
                              required: [mode]
                              properties:
                                mode: { type: string }
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "OptionalViewClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model)
        val optionalCutoffs = rendered.single { it.path.endsWith("/OptionalCutoffs.kt") }.bytes.decodeToString()

        compileGenerated(rendered)
        assertTrue(optionalCutoffs.contains("public val p50: Double? = null"))
        assertTrue(optionalCutoffs.contains("public val label: String? = null"))
    }

    @Test
    fun transparentAllOfBranchPreservesNullablePropertyAtEveryEmissionSite() {
        val source =
            Files.createTempFile("sdkgen-transparent-allof-nullable-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Nullable transparent allOf, version: "1" }
                    paths: {}
                    components:
                      schemas:
                        PercentileStats:
                          type: object
                          required: [p50]
                          properties:
                            p50: { type: number }
                        PublicEndpoint:
                          type: object
                          required: [throughput_last_30m]
                          properties:
                            throughput_last_30m:
                              allOf:
                                - ${'$'}ref: '#/components/schemas/PercentileStats'
                                - nullable: true
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "NullableAllOfClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model)
        val publicEndpoint = rendered.single { it.path.endsWith("/PublicEndpoint.kt") }.bytes.decodeToString()

        assertTrue(publicEndpoint.contains("throughputLast30m: PercentileStats?"))
        compileGenerated(rendered)
    }

    @Test
    fun supportRenameLeavesCanonicalSupportNamesAndGeneratedSourcesCompilable() {
        val renamed =
            applyDeclarationAugmentations(
                supportModel(),
                listOf(
                    DeclarationAugmentation(
                        symbolId = "support:presence",
                        resolvedName = "RenamedPresence",
                        source = sourcePointer(),
                    ),
                    DeclarationAugmentation(
                        symbolId = "support:serialization",
                        resolvedName = "RenamedSerialization",
                        source = sourcePointer(),
                    ),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(renamed)
        val fieldPresence = rendered.single { it.path.endsWith("/FieldPresence.kt") }.bytes.decodeToString()
        val serializationSupport =
            rendered
                .single {
                    it.path.endsWith(
                        "/SerializationSupport.kt",
                    )
                }.bytes
                .decodeToString()

        assertTrue(fieldPresence.contains("enum class FieldPresence"))
        assertTrue(serializationSupport.contains("SdkJson"))
        assertFalse(rendered.any { it.path.endsWith("/RenamedPresence.kt") })
        assertFalse(rendered.any { it.path.endsWith("/RenamedSerialization.kt") })
        compileGenerated(rendered)
    }

    private fun supportModel(): KotlinDeclarationModel =
        KotlinDeclarationModel(
            listOf(
                KotlinFileDeclaration(
                    PACKAGE,
                    "FieldPresence",
                    listOf(
                        SupportDeclaration(
                            symbolId = "support:presence",
                            order = 0,
                            packageName = PACKAGE,
                            fileName = "FieldPresence",
                            resolvedName = "FieldPresence",
                            kdoc = "",
                            kind = SupportKind.FieldPresence,
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "SerializationSupport",
                    listOf(
                        SupportDeclaration(
                            symbolId = "support:serialization",
                            order = 1,
                            packageName = PACKAGE,
                            fileName = "SerializationSupport",
                            resolvedName = "SerializationSupport",
                            kdoc = "",
                            kind = SupportKind.Serialization,
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "Payload",
                    listOf(
                        ModelDeclaration(
                            symbolId = "schema:Payload",
                            order = 2,
                            packageName = PACKAGE,
                            fileName = "Payload",
                            resolvedName = "Payload",
                            kdoc = "Payload model.",
                            fields =
                                listOf(
                                    FieldDeclaration(
                                        symbolId = "schema:Payload/value",
                                        order = 0,
                                        resolvedName = "value",
                                        wireName = "value",
                                        type = KotlinTypeRef("kotlin", "String"),
                                        required = true,
                                        nullable = false,
                                        kdoc = "",
                                    ),
                                ),
                            dslFunctionName = "payload",
                        ),
                    ),
                ),
            ),
        )

    private fun sourcePointer(): SourcePointer = SourcePointer("sdkgen://test", "/", SourceLocation(1, 1, 0))

    private fun compileGenerated(files: List<RenderedKotlinFile>): Path {
        val root = Files.createTempDirectory("sdkgen-generated-compile-")
        val sourcePaths =
            files.map { rendered ->
                val path = root.resolve(rendered.path)
                path.parent.createDirectories()
                path.writeText(rendered.bytes.decodeToString())
                path.toString()
            }
        val output = root.resolve("out").also { it.createDirectories() }
        val compilerOutput = ByteArrayOutputStream()
        val result =
            K2JVMCompiler().exec(
                PrintStream(compilerOutput),
                "-classpath",
                System.getProperty("java.class.path"),
                "-d",
                output.toString(),
                *sourcePaths.toTypedArray(),
            )
        assertEquals(ExitCode.OK, result, compilerOutput.toString())
        return output
    }

    private fun pageResponseStub(): String =
        """
        package $PACKAGE

        import kotlinx.serialization.KSerializer
        import kotlinx.serialization.descriptors.SerialDescriptor
        import kotlinx.serialization.descriptors.buildClassSerialDescriptor
        import kotlinx.serialization.encoding.Decoder
        import kotlinx.serialization.encoding.Encoder

        data class PageResponse(val data: List<String>, val nextCursor: String?) {
            public object Serializer : KSerializer<PageResponse> {
                override val descriptor: SerialDescriptor = buildClassSerialDescriptor("PageResponse")
                override fun serialize(encoder: Encoder, value: PageResponse) = Unit
                override fun deserialize(decoder: Decoder): PageResponse = TODO()
            }
        }
        """.trimIndent()

    private fun edgeShapeModel(): KotlinDeclarationModel {
        val string = KotlinTypeRef("kotlin", "String")
        val int = KotlinTypeRef("kotlin", "Int")
        val boolean = KotlinTypeRef("kotlin", "Boolean")
        val double = KotlinTypeRef("kotlin", "Double")
        val status = KotlinTypeRef(PACKAGE, "Status")
        val profile = KotlinTypeRef(PACKAGE, "Profile")
        val stringList = KotlinTypeRef("kotlin.collections", "List", listOf(string))
        val payload = KotlinTypeRef(PACKAGE, "Payload")
        val byteStream = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
        val unit = KotlinTypeRef("kotlin", "Unit")

        return KotlinDeclarationModel(
            listOf(
                file(
                    "FieldPresence",
                    SupportDeclaration(
                        symbolId = "support:presence",
                        order = 0,
                        packageName = PACKAGE,
                        fileName = "FieldPresence",
                        resolvedName = "FieldPresence",
                        kdoc = "",
                        kind = SupportKind.FieldPresence,
                    ),
                ),
                file(
                    "SerializationSupport",
                    SupportDeclaration(
                        symbolId = "support:serialization",
                        order = 0,
                        packageName = PACKAGE,
                        fileName = "SerializationSupport",
                        resolvedName = "SerializationSupport",
                        kdoc = "",
                        kind = SupportKind.Serialization,
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "Status",
                    listOf(
                        OpenEnumDeclaration(
                            "schema:Status",
                            0,
                            PACKAGE,
                            "Status",
                            "Status",
                            "Status enum.",
                            listOf(EnumValueDeclaration("schema:Status/ready", 0, "Ready", "ready", "")),
                        ),
                    ),
                ),
                file(
                    "Profile",
                    ModelDeclaration(
                        "schema:Profile",
                        0,
                        PACKAGE,
                        "Profile",
                        "Profile",
                        "Profile model.",
                        listOf(
                            field("Profile/id", 0, "id", string, required = true),
                        ),
                        "profile",
                    ),
                ),
                file(
                    "AllRequired",
                    ModelDeclaration(
                        "schema:AllRequired",
                        0,
                        PACKAGE,
                        "AllRequired",
                        "AllRequired",
                        "All required primitive model.",
                        listOf(
                            field("AllRequired/count", 0, "count", int, required = true),
                            field("AllRequired/enabled", 1, "enabled", boolean, required = true),
                            field("AllRequired/ratio", 2, "ratio", double, required = true),
                            field("AllRequired/name", 3, "name", string, required = true),
                        ),
                        "allRequired",
                    ),
                ),
                file(
                    "Payload",
                    ModelDeclaration(
                        "schema:Payload",
                        0,
                        PACKAGE,
                        "Payload",
                        "Payload",
                        "Payload model.",
                        listOf(field("Payload/value", 0, "value", string, required = true)),
                        "payload",
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "ChoiceOne",
                    listOf(
                        OneOfDeclaration(
                            "schema:ChoiceOne",
                            0,
                            PACKAGE,
                            "ChoiceOne",
                            "ChoiceOne",
                            "First union.",
                            listOf(
                                OneOfCaseDeclaration(
                                    "schema:ChoiceOne/typed",
                                    0,
                                    "Typed",
                                    listOf(
                                        UnionFieldDeclaration("status", "status", status),
                                        UnionFieldDeclaration("count", "count", int),
                                        UnionFieldDeclaration("items", "items", stringList),
                                        UnionFieldDeclaration("profile", "profile", profile),
                                    ),
                                ),
                                OneOfCaseDeclaration(
                                    "schema:ChoiceOne/name",
                                    1,
                                    "Named",
                                    listOf(UnionFieldDeclaration("name", "name", string)),
                                ),
                            ),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "ChoiceTwo",
                    listOf(
                        AnyOfDeclaration(
                            "schema:ChoiceTwo",
                            0,
                            PACKAGE,
                            "ChoiceTwo",
                            "ChoiceTwo",
                            "Second union.",
                            listOf(
                                valueBranch("Status", status),
                                valueBranch("Count", int),
                                valueBranch("Items", stringList),
                                valueBranch("Profile", profile),
                            ),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "EdgeClient",
                    listOf(
                        OperationClientDeclaration(
                            "client:EdgeClient",
                            0,
                            PACKAGE,
                            "EdgeClient",
                            "EdgeClient",
                            "Edge client.",
                            "EdgeCodecs",
                            listOf(
                                operation(
                                    id = "optionalBody",
                                    requestType = payload.copy(nullable = true),
                                    responseType = unit,
                                    requestMediaTypes = listOf("application/json"),
                                    responseMediaTypes = emptyList(),
                                    requestBody =
                                        OperationRequestBodyAlternative(
                                            "application/json",
                                            payload,
                                            required = false,
                                        ),
                                ),
                                operation(
                                    id = "bodyless",
                                    requestType = unit,
                                    responseType = unit,
                                    requestMediaTypes = emptyList(),
                                    responseMediaTypes = emptyList(),
                                ),
                                operation(
                                    id = "scalarResponse",
                                    requestType = unit,
                                    responseType = int,
                                    requestMediaTypes = emptyList(),
                                    responseMediaTypes = listOf("application/json"),
                                ),
                                operation(
                                    id = "uploadBinary",
                                    requestType = byteStream,
                                    responseType = unit,
                                    requestMediaTypes = listOf("application/octet-stream"),
                                    responseMediaTypes = emptyList(),
                                ),
                                operation(
                                    id = "downloadBinary",
                                    requestType = unit,
                                    responseType = byteStream,
                                    requestMediaTypes = emptyList(),
                                    responseMediaTypes = listOf("application/octet-stream"),
                                ),
                            ),
                        ),
                    ),
                ),
            ),
        )
    }

    private fun operation(
        id: String,
        requestType: KotlinTypeRef,
        responseType: KotlinTypeRef,
        requestMediaTypes: List<String>,
        responseMediaTypes: List<String>,
        requestBody: OperationRequestBodyAlternative? = null,
    ): OperationDeclaration =
        OperationDeclaration(
            symbolId = "operation:$id",
            order = 0,
            operationId = id,
            method = "POST",
            path = "/$id",
            requestMediaTypes = requestMediaTypes,
            responseMediaTypes = responseMediaTypes,
            successStatusCodes = setOf(200),
            requestType = requestType,
            responseType = responseType,
            requestCodecPropertyName = "${id}RequestCodec",
            responseCodecPropertyName = "${id}ResponseCodec",
            requestCodecConstantName = "${id.uppercase()}_REQUEST_CODEC_ID",
            responseCodecConstantName = "${id.uppercase()}_RESPONSE_CODEC_ID",
            requestCodecId = "$id.request",
            responseCodecId = "$id.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(null, null, null),
            methodKdoc = "Executes '$id'.",
            requestBodyAlternatives = requestBody?.let { listOf(it) }.orEmpty(),
            requestBodyRequired = requestBody?.required == true,
        )

    private fun field(
        symbol: String,
        order: Int,
        name: String,
        type: KotlinTypeRef,
        required: Boolean,
    ): FieldDeclaration = FieldDeclaration(symbol, order, name, name, type, required, type.nullable, "")

    private fun valueBranch(
        name: String,
        type: KotlinTypeRef,
    ): AnyOfBranchDeclaration =
        AnyOfBranchDeclaration(
            symbolId = "schema:ChoiceTwo/$name",
            order = 0,
            resolvedName = name,
            propertyName = name.replaceFirstChar(Char::lowercaseChar),
            fields = emptyList(),
            shape = AnyOfBranchShape.VALUE,
            type = type,
        )

    private fun file(
        name: String,
        declaration: SupportDeclaration,
    ): KotlinFileDeclaration = KotlinFileDeclaration(PACKAGE, name, listOf(declaration))

    private fun file(
        name: String,
        declaration: ModelDeclaration,
    ): KotlinFileDeclaration = KotlinFileDeclaration(PACKAGE, name, listOf(declaration))

    private companion object {
        const val PACKAGE = "com.example.generated"
    }
}
