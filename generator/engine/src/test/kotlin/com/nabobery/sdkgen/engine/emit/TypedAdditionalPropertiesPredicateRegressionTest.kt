package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.JsonAdditionalPropertiesPredicate
import com.nabobery.sdkgen.engine.declarations.JsonBranchPredicate
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.OneOfCaseDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfJsonKind
import com.nabobery.sdkgen.engine.declarations.UnionFieldDeclaration
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TypedAdditionalPropertiesPredicateRegressionTest {
    @Test
    fun emptyTypedAdditionalPropertiesNamesRemainExplicitlyTyped() {
        val source =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(
                                packageName = PACKAGE,
                                fileName = "Choice",
                                declarations =
                                    listOf(
                                        OneOfDeclaration(
                                            symbolId = "schema:Choice",
                                            order = 0,
                                            packageName = PACKAGE,
                                            fileName = "Choice",
                                            resolvedName = "Choice",
                                            kdoc = "Choice.",
                                            cases =
                                                listOf(
                                                    OneOfCaseDeclaration(
                                                        symbolId = "schema:Choice/branch:0",
                                                        order = 0,
                                                        resolvedName = "Text",
                                                        requiredFields =
                                                            listOf(
                                                                UnionFieldDeclaration(
                                                                    resolvedName = "value",
                                                                    wireName = "value",
                                                                    type = KotlinTypeRef("kotlin", "String"),
                                                                ),
                                                            ),
                                                        predicate =
                                                            JsonBranchPredicate.ObjectShape(
                                                                requiredNames = emptyList(),
                                                                properties = emptyMap(),
                                                                additionalProperties =
                                                                    JsonAdditionalPropertiesPredicate.Typed(
                                                                        JsonBranchPredicate.Kind(
                                                                            PrimitiveOneOfJsonKind.STRING,
                                                                        ),
                                                                    ),
                                                            ),
                                                    ),
                                                ),
                                        ),
                                    ),
                            ),
                        ),
                    ),
                ).files
                .single()
                .bytes
                .decodeToString()

        assertTrue(source.contains("name in setOf<String>()"))
        assertFalse(source.contains("name in setOf()"))
    }

    private companion object {
        const val PACKAGE: String = "com.example.generated"
    }
}
