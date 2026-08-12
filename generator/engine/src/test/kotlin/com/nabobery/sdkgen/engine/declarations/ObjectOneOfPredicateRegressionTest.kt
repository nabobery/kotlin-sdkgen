package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.engine.config.RetryDefaults
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.engine.emit.KotlinPoetEmitter
import com.nabobery.sdkgen.openapi.SemanticAdapter
import java.nio.file.Files
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ObjectOneOfPredicateRegressionTest {
    @Test
    fun unrepresentableNestedBranchRetainsDiscriminatorSelection() {
        val mapping =
            project(
                """
                openapi: 3.1.0
                info: { title: OneOf predicate, version: "1" }
                paths: {}
                components:
                  schemas:
                    Choice:
                      type: object
                      discriminator: { propertyName: kind }
                      oneOf:
                        - type: object
                          required: [kind, payload]
                          properties:
                            kind: { type: string, enum: [pattern] }
                            payload: { type: string, pattern: "^pattern-.*" }
                        - type: object
                          required: [kind]
                          properties:
                            kind: { type: string, enum: [plain] }
                """,
            )
        val choice =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OneOfDeclaration>()
                .single { declaration -> declaration.resolvedName == "Choice" }
        val patternCase =
            choice.cases.single { case ->
                case.matchFields.single().expectedStringValues == listOf("pattern")
            }
        val predicateFunction = "matches${choice.resolvedName}${patternCase.resolvedName}Branch"
        val source =
            KotlinPoetEmitter(GENERATED_PACKAGE)
                .render(mapping.model)
                .files
                .joinToString(separator = "\n") { file -> file.bytes.decodeToString() }

        assertEquals(JsonBranchPredicate.AnyValue, patternCase.predicate)
        assertTrue(
            source.contains("return true"),
            "an unrepresentable nested constraint must not make the discriminator branch always false",
        )
        assertTrue(
            Regex("""val \w+Matches = $predicateFunction\(rawObject\) && \(\w+Matches\)""")
                .containsMatchIn(source),
            "the permissive exact predicate must still be constrained by the discriminator match",
        )
    }

    private fun project(yaml: String): DeclarationMappingResult {
        val source = Files.createTempFile("sdkgen-one-of-predicate-", ".yaml")
        source.writeText(yaml.trimIndent() + "\n")
        val document = SemanticAdapter().adapt(source).document
        return StandardProjection().project(
            DeclarationProjectionRequest(
                document = document,
                packageName = GENERATED_PACKAGE,
                canonicalDocumentUri = document.documentUri,
                clientName = "ChoiceClient",
                runtimeDefaults = RuntimeDefaults(60_000, RetryDefaults(maxAttempts = 3)),
            ),
        )
    }

    private companion object {
        const val GENERATED_PACKAGE: String = "com.example.generated"
    }
}
