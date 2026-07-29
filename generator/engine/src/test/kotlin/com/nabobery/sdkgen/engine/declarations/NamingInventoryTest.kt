package com.nabobery.sdkgen.engine.declarations

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.nabobery.sdkgen.engine.config.RetryDefaults
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.openapi.SemanticAdapter
import org.yaml.snakeyaml.LoaderOptions
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.createTempDirectory
import kotlin.io.path.nameWithoutExtension
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class NamingInventoryTest {
    @Test
    fun openRouterInlineInventoryMeetsT8MetricsAndIsDeterministic() {
        val document = adapt("engine.openRouterFile")
        val baseline = project(document)
        val schemaDeclarations = baseline.schemaDeclarations()
        val inline = schemaDeclarations.filter { declaration -> declaration.resolvedName.startsWith("Inline") }

        assertEquals(
            927,
            inline.size,
            "total=${schemaDeclarations.size}; identityKinds=${schemaDeclarations.groupingBy { declaration ->
                document.schemas[declaration.sourceSchemaId()]?.identityKind
            }.eachCount()}; samples=${inline.take(5).map(Declaration::resolvedName)}",
        )
        assertTrue(inline.all { declaration -> declaration.resolvedName.matches(INLINE_TAG) })
        assertTrue(inline.all { declaration -> declaration.fileName == declaration.resolvedName })
        assertTrue(inline.all { declaration -> declaration.resolvedName.length <= 80 })
        assertEquals(schemaDeclarations.size, schemaDeclarations.map(Declaration::resolvedName).toSet().size)
        assertEquals(baseline.model.normalized().digest(), project(document).model.normalized().digest())

        repeat(3) { seed ->
            val shuffledSchemas =
                document.schemas.entries
                    .shuffled(Random(seed))
                    .associate { entry -> entry.key to entry.value }
            val shuffled = document.copy(schemas = shuffledSchemas)
            assertEquals(
                baseline.model.normalized().digest(),
                project(shuffled).model.normalized().digest(),
                "seed=$seed",
            )
        }

        println(
            "NAMING_METRIC corpus=openrouter declarations=${schemaDeclarations.size} inline=${inline.size} " +
                "max=${inline.maxOf { declaration -> declaration.resolvedName.length }}",
        )
    }

    @Test
    fun githubYamlStagedThroughJsonAndStripeNamingProjectionAreDeterministicWithinMemoryBudget() {
        listOf("engine.githubFile", "engine.stripeFile").forEach { property ->
            val document = adapt(property)
            val baseline = project(document)
            val schemaDeclarations = baseline.schemaDeclarations()
            val inline = schemaDeclarations.filter { declaration -> declaration.resolvedName.startsWith("Inline") }
            val shuffled =
                document.copy(
                    schemas =
                        document.schemas.entries
                            .shuffled(Random(17))
                            .associate { entry -> entry.key to entry.value },
                )

            assertEquals(baseline.model.normalized().digest(), project(shuffled).model.normalized().digest(), property)
            assertTrue(inline.all { declaration -> declaration.resolvedName.matches(INLINE_TAG) }, property)
            assertTrue(inline.all { declaration -> declaration.resolvedName.length <= 80 }, property)
            println(
                "NAMING_METRIC corpus=${property.substringAfter("engine.").removeSuffix("File")} " +
                    "declarations=${schemaDeclarations.size} inline=${inline.size} " +
                    "max=${inline.maxOfOrNull(Declaration::resolvedName)?.length ?: 0}",
            )
        }
    }

    @Test
    fun directYamlAndStagedJsonProduceEquivalentSemanticIdsAndNamingProjection() {
        val directory = createTempDirectory("sdkgen-yaml-equivalence-")
        try {
            val source = directory.resolve("fixture.yaml")
            source.writeText(
                """
                openapi: 3.1.0
                info:
                  title: YAML-sensitive naming
                  version: "1"
                  description: null
                paths:
                  /widgets/{widget/id}:
                    post:
                      operationId: createWidget
                      requestBody:
                        content:
                          Application/Problem+JSON; charset="utf-8":
                            schema:
                              type: object
                              properties:
                                a/b~c:
                                  type: string
                                  default: null
                      responses:
                        '200':
                          description: ok
                          content:
                            application/vnd.example+json; profile="a;b":
                              schema:
                                type: object
                                properties:
                                  value: { type: string }
                components:
                  schemas:
                    A/B~C:
                      type: object
                      properties:
                        nullable-value:
                          type: [string, 'null']
                """.trimIndent(),
            )
            val canonicalUri = "sdkgen://yaml-equivalence/openapi.yaml"
            val direct = SemanticAdapter().adapt(source, rootCanonicalUri = canonicalUri).document
            val staged = adaptYamlThroughJson(source, canonicalUri)

            assertEquals(direct.schemas.keys, staged.schemas.keys)
            assertEquals(projectedNamesBySchemaId(direct), projectedNamesBySchemaId(staged))
        } finally {
            directory.toFile().deleteRecursively()
        }
    }

    @Test
    fun currentOpenRouterSemanticCandidatesHaveDeterministicLegacyAndNewNameInventory() {
        val document = adapt("engine.openRouterFile")
        val declarations = project(document).schemaDeclarations()
        val inlineDeclarations =
            declarations
                .filter { declaration ->
                    declaration.sourceSchemaId().let { id -> document.schemas[id]?.identityKind?.name } ==
                        "INLINE"
                }
        val generatedRoot =
            Path
                .of(requireNotNull(System.getProperty("engine.consumerSourceRoot")))
                .resolve("com/nabobery/sdkgen/generated")
        val oldNames =
            Files.list(generatedRoot).use { paths ->
                paths
                    .filter { path ->
                        path.fileName.toString().startsWith("Inline") &&
                            path.fileName.toString().endsWith(".kt")
                    }.map(Path::nameWithoutExtension)
                    .toList()
                    .toSet()
            }
        assertEquals(880, oldNames.size)
        val rows =
            inlineDeclarations.sortedBy { declaration -> declaration.sourceSchemaId() }.map { declaration ->
                val oldName = legacyInlineName(declaration.sourceSchemaId())
                listOf(
                    declaration.sourceSchemaId().value,
                    oldName,
                    declaration.resolvedName,
                    oldName.length.toString(),
                    declaration.resolvedName.length.toString(),
                    (oldName in oldNames).toString(),
                )
            }
        val expected =
            buildString {
                append("schemaId\tlegacyCandidate\tnewName\tlegacyLength\tnewLength\tcommittedLegacyFilePresent\n")
                rows.forEach { row -> append(row.joinToString("\t")).append('\n') }
            }
        val inventory = Path.of(requireNotNull(System.getProperty("engine.t8RenameInventory")))
        if (System.getenv("UPDATE_T8_RENAME_INVENTORY") == "1") {
            inventory.parent.createDirectories()
            inventory.writeText(expected)
        }
        assertEquals(expected, inventory.readText())
    }

    private fun legacyInlineName(schemaId: SchemaId): String {
        val pointer = schemaId.value.substringAfter('#', schemaId.value)
        val readable =
            pointer.split('/').filter(String::isNotBlank).joinToString(" ") { segment ->
                segment.replace("~1", "/").replace("~0", "~")
            }
        val base = KotlinNameResolver.typeName("Inline $readable")
        return if (base.length <=
            90
        ) {
            base
        } else {
            "${base.take(80)}${sha256Hex(schemaId.value.encodeToByteArray()).take(8)}"
        }
    }

    private fun adapt(property: String): SemanticDocument {
        val source = Path.of(requireNotNull(System.getProperty(property)))
        if (property != "engine.githubFile") {
            val corpus = property.substringAfter("engine.").removeSuffix("File")
            if (corpus == "openRouter") return SemanticAdapter().adapt(source).document
            val extension = if (corpus == "stripe") "json" else "yaml"
            val canonicalUri = "sdkgen://$corpus/openapi.$extension"
            return SemanticAdapter().adapt(source, rootCanonicalUri = canonicalUri).document
        }
        return adaptYamlThroughJson(source, "sdkgen://github/openapi.yaml")
    }

    private fun adaptYamlThroughJson(
        source: Path,
        canonicalUri: String,
    ): SemanticDocument {
        val directory = createTempDirectory("sdkgen-yaml-staging-")
        try {
            val bytes = source.readBytes()
            val yamlFactory =
                YAMLFactory
                    .builder()
                    .loaderOptions(LoaderOptions().apply { codePointLimit = bytes.size })
                    .build()
            val jsonSource = directory.resolve("staged.json")
            ObjectMapper().writeValue(jsonSource.toFile(), ObjectMapper(yamlFactory).readTree(bytes))
            return SemanticAdapter().adapt(jsonSource, rootCanonicalUri = canonicalUri).document
        } finally {
            directory.toFile().deleteRecursively()
        }
    }

    private fun projectedNamesBySchemaId(document: SemanticDocument): Map<SchemaId, String> =
        project(document).schemaDeclarations().associate { declaration ->
            declaration.sourceSchemaId() to declaration.resolvedName
        }

    private fun project(document: SemanticDocument): DeclarationMappingResult =
        StandardProjection().project(
            DeclarationProjectionRequest(
                document = document,
                packageName = "com.example.generated",
                canonicalDocumentUri = document.documentUri,
                clientName = "InventoryClient",
                runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
            ),
        )

    private fun DeclarationMappingResult.schemaDeclarations(): List<Declaration> =
        model.files
            .flatMap(KotlinFileDeclaration::declarations)
            .filter { declaration ->
                declaration is ModelDeclaration ||
                    declaration is OpenEnumDeclaration ||
                    declaration is OneOfDeclaration ||
                    declaration is PrimitiveOneOfDeclaration ||
                    declaration is AnyOfDeclaration
            }

    private fun Declaration.sourceSchemaId(): SchemaId = SchemaId(kdoc.substringAfterLast("\n\nSource: "))

    private companion object {
        val INLINE_TAG = Regex("Inline.*X[0-9a-f]{8,}$")
    }
}
