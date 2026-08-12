package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.AnyOfBranchDeclaration
import com.nabobery.sdkgen.engine.declarations.AnyOfDeclaration
import com.nabobery.sdkgen.engine.declarations.EnumValueDeclaration
import com.nabobery.sdkgen.engine.declarations.FieldDeclaration
import com.nabobery.sdkgen.engine.declarations.FormFieldDeclaration
import com.nabobery.sdkgen.engine.declarations.FormScalarKind
import com.nabobery.sdkgen.engine.declarations.FormValueDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.ModelDeclaration
import com.nabobery.sdkgen.engine.declarations.MultipartPartDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfCaseDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.OpenEnumDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationDeadlines
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationRequestBodyAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfCaseDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfJsonKind
import com.nabobery.sdkgen.engine.declarations.UnionFieldDeclaration
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/** Regression guard for ADR-0020's emitted public-SDK/protocol-glue boundary. */
class GeneratedProtocolGlueVisibilityTest {
    @Test
    fun protocolGlueIsInternalWhileSdkTypesRemainInTheEmittedApiProjection() {
        val emitted = renderFixture()
        val source = emitted.files.joinToString(separator = "\n") { file -> file.bytes.decodeToString() }
        val projection = emitted.publicApiProjection

        listOf(
            "operation metadata" to
                Regex("^    internal val formBodyMetadata: OperationMetadata", RegexOption.MULTILINE),
            "codecs holder" to Regex("^internal object VisibilityCodecs", RegexOption.MULTILINE),
            "partition accessor" to
                Regex("^  internal val filler100ResponseCodecRegistry:", RegexOption.MULTILINE),
            "codec id" to Regex("^  internal const val FORMBODY_REQUEST_CODEC_ID:", RegexOption.MULTILINE),
            "registry" to Regex("^  internal val formBodyRequestCodecRegistry:", RegexOption.MULTILINE),
            "form codec" to Regex("^  internal object FormBodyFormCodec", RegexOption.MULTILINE),
            "multipart codec" to Regex("^  internal object MultipartBodyMultipartCodec", RegexOption.MULTILINE),
            "model serializer" to Regex("^  internal object Serializer : KSerializer<Plain>", RegexOption.MULTILINE),
            "enum serializer" to Regex("^  internal object Serializer : KSerializer<State>", RegexOption.MULTILINE),
            "anyOf serializer" to
                Regex("^  internal object Serializer : KSerializer<AnyWrapper>", RegexOption.MULTILINE),
            "oneOf serializer" to
                Regex("^internal object ObjectUnionSerializer : KSerializer<ObjectUnion>", RegexOption.MULTILINE),
            "primitive oneOf serializer" to
                Regex("^internal object PrimitiveUnionSerializer : KSerializer<PrimitiveUnion>", RegexOption.MULTILINE),
        ).forEach { (kind, expected) ->
            assertTrue(expected.containsMatchIn(source), "$kind must carry an explicit internal modifier")
        }

        listOf(
            "VisibilityClient.formBodyMetadata",
            "VisibilityCodecs",
            "VisibilityCodecs.filler100ResponseCodecRegistry",
            "VisibilityCodecs.FORMBODY_REQUEST_CODEC_ID",
            "VisibilityCodecs.formBodyRequestCodecRegistry",
            "VisibilityCodecs.FormBodyFormCodec",
            "VisibilityCodecs.MultipartBodyMultipartCodec",
            "Plain.Serializer",
            "State.Serializer",
            "AnyWrapper.Serializer",
            "ObjectUnionSerializer",
            "PrimitiveUnionSerializer",
        ).forEach { glue ->
            assertFalse(
                projection.contains("$PACKAGE.$glue"),
                "$glue is protocol glue and must not appear in the emitted public API projection",
            )
        }

        listOf(
            "$PACKAGE.Plain",
            "$PACKAGE.Plain.Builder",
            "$PACKAGE.ObjectUnion",
            "$PACKAGE.ObjectUnion.Alpha",
            "$PACKAGE.PrimitiveUnion",
            "$PACKAGE.PrimitiveUnion.Text",
            "$PACKAGE.State",
            "$PACKAGE.State.SdkUnknown",
            "$PACKAGE.ObjectUnionNoMatchException",
            "$PACKAGE.AnyView",
            "\"build\"",
            "\"fromValue\"",
        ).forEach { publicApi ->
            assertTrue(
                projection.contains(publicApi),
                "$publicApi is an SDK type or operation and must remain in the emitted public API projection",
            )
        }
    }

    @Test
    fun codecWiringUsesNestedAndTopLevelSerializersAtTheirDeclaredPlacements() {
        val clientSource =
            renderFixture()
                .files
                .single { file ->
                    file.path.endsWith("VisibilityClient.kt")
                }.bytes
                .decodeToString()

        listOf(
            "Plain" to "Plain.Serializer",
            "State" to "State.Serializer",
            "AnyWrapper" to "AnyWrapper.Serializer",
            "ObjectUnion" to "ObjectUnionSerializer",
            "PrimitiveUnion" to "PrimitiveUnionSerializer",
        ).forEach { (type, serializer) ->
            assertTrue(
                clientSource.contains(serializer),
                "$type codecs must use the serializer at its declared placement",
            )
        }
        assertFalse(clientSource.contains("ObjectUnion.Serializer"))
        assertFalse(clientSource.contains("PrimitiveUnion.Serializer"))
    }

    private fun renderFixture(): EmittedSources = KotlinPoetEmitter(PACKAGE).render(fixtureModel())

    private fun fixtureModel(): KotlinDeclarationModel {
        val string = KotlinTypeRef("kotlin", "String")
        val jsonElement = KotlinTypeRef("kotlinx.serialization.json", "JsonElement")
        val plain = KotlinTypeRef(PACKAGE, "Plain")
        val state = KotlinTypeRef(PACKAGE, "State")
        val objectUnion = KotlinTypeRef(PACKAGE, "ObjectUnion")
        val primitiveUnion = KotlinTypeRef(PACKAGE, "PrimitiveUnion")
        val anyWrapper = KotlinTypeRef(PACKAGE, "AnyWrapper")
        val alphaField = UnionFieldDeclaration("value", "value", string)
        val anyField = UnionFieldDeclaration("label", "label", string)
        val operations =
            listOf(
                operation(
                    id = "formBody",
                    order = 0,
                    requestType = jsonElement,
                    responseType = jsonElement,
                    requestBody = formBody(jsonElement),
                ),
                operation(
                    id = "multipartBody",
                    order = 1,
                    requestType = jsonElement,
                    responseType = jsonElement,
                    requestBody = multipartBody(jsonElement),
                ),
                operation("objectUnion", 2, objectUnion, objectUnion),
                operation("primitiveUnion", 3, primitiveUnion, primitiveUnion),
                operation("anyWrapper", 4, anyWrapper, anyWrapper),
                operation("plain", 5, plain, plain),
                operation("state", 6, state, state),
            ) +
                (0..100).map { index ->
                    operation("filler$index", index + 7, jsonElement, jsonElement)
                }
        return KotlinDeclarationModel(
            listOf(
                KotlinFileDeclaration(
                    PACKAGE,
                    "Plain",
                    listOf(
                        ModelDeclaration(
                            symbolId = "schema:Plain",
                            order = 0,
                            packageName = PACKAGE,
                            fileName = "Plain",
                            resolvedName = "Plain",
                            kdoc = "Plain model.",
                            fields = listOf(field("plain", 0, "name", string)),
                            dslFunctionName = "plain",
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "State",
                    listOf(
                        OpenEnumDeclaration(
                            symbolId = "schema:State",
                            order = 1,
                            packageName = PACKAGE,
                            fileName = "State",
                            resolvedName = "State",
                            kdoc = "Open state enum.",
                            values = listOf(EnumValueDeclaration("schema:State/ready", 0, "Ready", "ready", "")),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "ObjectUnion",
                    listOf(
                        OneOfDeclaration(
                            symbolId = "schema:ObjectUnion",
                            order = 2,
                            packageName = PACKAGE,
                            fileName = "ObjectUnion",
                            resolvedName = "ObjectUnion",
                            kdoc = "Object oneOf.",
                            cases =
                                listOf(
                                    OneOfCaseDeclaration(
                                        symbolId = "schema:ObjectUnion/alpha",
                                        order = 0,
                                        resolvedName = "Alpha",
                                        requiredFields = listOf(alphaField),
                                    ),
                                ),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "PrimitiveUnion",
                    listOf(
                        PrimitiveOneOfDeclaration(
                            symbolId = "schema:PrimitiveUnion",
                            order = 3,
                            packageName = PACKAGE,
                            fileName = "PrimitiveUnion",
                            resolvedName = "PrimitiveUnion",
                            kdoc = "Primitive oneOf.",
                            cases =
                                listOf(
                                    PrimitiveOneOfCaseDeclaration(
                                        symbolId = "schema:PrimitiveUnion/text",
                                        order = 0,
                                        resolvedName = "Text",
                                        type = string,
                                        jsonKind = PrimitiveOneOfJsonKind.STRING,
                                    ),
                                ),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "AnyWrapper",
                    listOf(
                        AnyOfDeclaration(
                            symbolId = "schema:AnyWrapper",
                            order = 4,
                            packageName = PACKAGE,
                            fileName = "AnyWrapper",
                            resolvedName = "AnyWrapper",
                            kdoc = "AnyOf wrapper.",
                            branches =
                                listOf(
                                    AnyOfBranchDeclaration(
                                        symbolId = "schema:AnyWrapper/label",
                                        order = 0,
                                        resolvedName = "Label",
                                        propertyName = "label",
                                        fields = listOf(anyField),
                                        viewFields = listOf(anyField),
                                        viewTypeName = "AnyView",
                                    ),
                                ),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "VisibilityClient",
                    listOf(
                        OperationClientDeclaration(
                            symbolId = "client:VisibilityClient",
                            order = 5,
                            packageName = PACKAGE,
                            fileName = "VisibilityClient",
                            resolvedName = "VisibilityClient",
                            kdoc = "Visibility client.",
                            codecsObjectName = "VisibilityCodecs",
                            operations = operations,
                        ),
                    ),
                ),
            ),
        )
    }

    private fun operation(
        id: String,
        order: Int,
        requestType: KotlinTypeRef,
        responseType: KotlinTypeRef,
        requestBody: OperationRequestBodyAlternative? = null,
    ): OperationDeclaration =
        OperationDeclaration(
            symbolId = "operation:$id",
            order = order,
            operationId = id,
            method = "POST",
            path = "/$id",
            requestMediaTypes = requestBody?.let { listOf(it.mediaType) } ?: listOf("application/json"),
            responseMediaTypes = listOf("application/json"),
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
            methodKdoc = "Executes $id.",
            requestBodyAlternatives = requestBody?.let(::listOf).orEmpty(),
        )

    private fun formBody(type: KotlinTypeRef): OperationRequestBodyAlternative =
        OperationRequestBodyAlternative(
            mediaType = "application/x-www-form-urlencoded",
            type = type,
            formFields =
                listOf(
                    FormFieldDeclaration(
                        wireName = "name",
                        accessorName = "name",
                        type = KotlinTypeRef("kotlin", "String"),
                        required = true,
                        value = FormValueDeclaration.Scalar(FormScalarKind.STRING),
                    ),
                ),
        )

    private fun multipartBody(type: KotlinTypeRef): OperationRequestBodyAlternative =
        OperationRequestBodyAlternative(
            mediaType = "multipart/form-data",
            type = type,
            multipartParts =
                listOf(
                    MultipartPartDeclaration(
                        wireName = "file",
                        accessorName = "file",
                        type = KotlinTypeRef("kotlin", "String"),
                        required = true,
                        contentType = "text/plain",
                    ),
                ),
        )

    private fun field(
        owner: String,
        order: Int,
        name: String,
        type: KotlinTypeRef,
    ): FieldDeclaration =
        FieldDeclaration(
            symbolId = "schema:$owner/property:$name",
            order = order,
            resolvedName = name,
            wireName = name,
            type = type,
            required = true,
            nullable = false,
            kdoc = "",
        )

    private companion object {
        const val PACKAGE = "com.example.generated"
    }
}
