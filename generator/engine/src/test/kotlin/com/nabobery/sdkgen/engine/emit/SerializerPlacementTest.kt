package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.AnyOfBranchDeclaration
import com.nabobery.sdkgen.engine.declarations.AnyOfDeclaration
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
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfCaseDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfJsonKind
import com.nabobery.sdkgen.engine.declarations.UnionFieldDeclaration
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/** Pins serializer references selected from declaration-specific serializer placement metadata. */
class SerializerPlacementTest {
    @Test
    fun codecsReferenceNestedAndTopLevelSerializersAccordingToTheirDeclarationFamily() {
        val source =
            KotlinPoetEmitter(PACKAGE)
                .render(model())
                .files
                .single { file -> file.path.endsWith("PlacementClient.kt") }
                .bytes
                .decodeToString()

        listOf(
            "PlacementModel" to "PlacementModel.Serializer",
            "PlacementEnum" to "PlacementEnum.Serializer",
            "PlacementAnyOf" to "PlacementAnyOf.Serializer",
            "PlacementOneOf" to "PlacementOneOfSerializer",
            "PlacementPrimitiveOneOf" to "PlacementPrimitiveOneOfSerializer",
        ).forEach { (type, serializer) ->
            assertTrue(source.contains(serializer), "$type must resolve $serializer from its placement metadata")
        }
        assertFalse(source.contains("PlacementOneOf.Serializer"))
        assertFalse(source.contains("PlacementPrimitiveOneOf.Serializer"))
    }

    private fun model(): KotlinDeclarationModel {
        val string = KotlinTypeRef("kotlin", "String")
        val model = KotlinTypeRef(PACKAGE, "PlacementModel")
        val enum = KotlinTypeRef(PACKAGE, "PlacementEnum")
        val anyOf = KotlinTypeRef(PACKAGE, "PlacementAnyOf")
        val oneOf = KotlinTypeRef(PACKAGE, "PlacementOneOf")
        val primitiveOneOf = KotlinTypeRef(PACKAGE, "PlacementPrimitiveOneOf")
        val value = UnionFieldDeclaration("value", "value", string)
        return KotlinDeclarationModel(
            listOf(
                KotlinFileDeclaration(
                    PACKAGE,
                    "PlacementModel",
                    listOf(
                        ModelDeclaration(
                            "schema:PlacementModel",
                            0,
                            PACKAGE,
                            "PlacementModel",
                            "PlacementModel",
                            "",
                            listOf(
                                FieldDeclaration(
                                    "schema:PlacementModel/value",
                                    0,
                                    "value",
                                    "value",
                                    string,
                                    true,
                                    false,
                                    "",
                                ),
                            ),
                            "placementModel",
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "PlacementEnum",
                    listOf(
                        OpenEnumDeclaration(
                            "schema:PlacementEnum",
                            1,
                            PACKAGE,
                            "PlacementEnum",
                            "PlacementEnum",
                            "",
                            listOf(EnumValueDeclaration("schema:PlacementEnum/ready", 0, "Ready", "ready", "")),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "PlacementAnyOf",
                    listOf(
                        AnyOfDeclaration(
                            "schema:PlacementAnyOf",
                            2,
                            PACKAGE,
                            "PlacementAnyOf",
                            "PlacementAnyOf",
                            "",
                            listOf(
                                AnyOfBranchDeclaration(
                                    "schema:PlacementAnyOf/value",
                                    0,
                                    "Value",
                                    "value",
                                    listOf(value),
                                    listOf(value),
                                ),
                            ),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "PlacementOneOf",
                    listOf(
                        OneOfDeclaration(
                            "schema:PlacementOneOf",
                            3,
                            PACKAGE,
                            "PlacementOneOf",
                            "PlacementOneOf",
                            "",
                            listOf(OneOfCaseDeclaration("schema:PlacementOneOf/value", 0, "Value", listOf(value))),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "PlacementPrimitiveOneOf",
                    listOf(
                        PrimitiveOneOfDeclaration(
                            "schema:PlacementPrimitiveOneOf",
                            4,
                            PACKAGE,
                            "PlacementPrimitiveOneOf",
                            "PlacementPrimitiveOneOf",
                            "",
                            listOf(
                                PrimitiveOneOfCaseDeclaration(
                                    "schema:PlacementPrimitiveOneOf/text",
                                    0,
                                    "Text",
                                    string,
                                    PrimitiveOneOfJsonKind.STRING,
                                ),
                            ),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "PlacementClient",
                    listOf(
                        OperationClientDeclaration(
                            "client:PlacementClient",
                            5,
                            PACKAGE,
                            "PlacementClient",
                            "PlacementClient",
                            "",
                            "PlacementCodecs",
                            listOf(
                                operation("model", 0, model),
                                operation("enum", 1, enum),
                                operation("anyOf", 2, anyOf),
                                operation("oneOf", 3, oneOf),
                                operation("primitiveOneOf", 4, primitiveOneOf),
                            ),
                        ),
                    ),
                ),
            ),
        )
    }

    private fun operation(
        id: String,
        order: Int,
        type: KotlinTypeRef,
    ): OperationDeclaration =
        OperationDeclaration(
            symbolId = "operation:$id",
            order = order,
            operationId = id,
            method = "POST",
            path = "/$id",
            requestMediaTypes = listOf("application/json"),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            requestType = type,
            responseType = type,
            requestCodecPropertyName = "${id}RequestCodec",
            responseCodecPropertyName = "${id}ResponseCodec",
            requestCodecConstantName = "${id.uppercase()}_REQUEST_CODEC_ID",
            responseCodecConstantName = "${id.uppercase()}_RESPONSE_CODEC_ID",
            requestCodecId = "$id.request",
            responseCodecId = "$id.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(null, null, null),
            methodKdoc = "",
        )

    private companion object {
        const val PACKAGE = "com.example.generated"
    }
}
