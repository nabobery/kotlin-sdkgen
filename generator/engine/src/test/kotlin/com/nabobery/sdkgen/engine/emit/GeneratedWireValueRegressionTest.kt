package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.DeclarationProjectionRequest
import com.nabobery.sdkgen.engine.declarations.StandardProjection
import com.nabobery.sdkgen.openapi.SemanticAdapter
import org.jetbrains.kotlin.cli.common.ExitCode
import org.jetbrains.kotlin.cli.jvm.K2JVMCompiler
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.nio.file.Files
import kotlin.io.path.createDirectories
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Wire-correctness regressions reported by a downstream consumer (openrouter-kotlin, 2026-08-29), reproduced from a
 * spec end to end: the generated code is projected, emitted, and compiled against the real runtime.
 *
 * The compiler harness runs without the kotlinx.serialization compiler plugin, so generated decoders cannot be
 * *executed* here; the executable proof of both fixes lives in the streaming-fixture conformance consumer
 * (`StreamingFixtureWireRegressionTest`), which sends the parameters and decodes the same terminal page through the
 * real transport seam and serializers.
 */
class GeneratedWireValueRegressionTest {
    /**
     * Generated enums are forward-compatible sealed classes whose `data object` cases carry the documented wire text
     * in `value`; their `toString()` is the Kotlin case name (`Daily`, `Asc`). Binding a parameter with `toString()`
     * therefore sent the case name on the wire, which servers reject.
     */
    @Test
    fun openEnumParametersAreBoundByWireValueInEveryLocationAndShape() {
        val client = compileSpec(ENUM_PARAMETER_SPEC).source("workspaces/WorkspacesClient.kt")

        assertTrue("name = \"interval\", values = listOf(interval.value)" in client, client)
        assertTrue("name = \"direction\", values = direction?.let { listOf(it.value) }.orEmpty()" in client, client)
        assertTrue("name = \"X-Mode\", values = listOf(xMode.value)" in client, client)
        assertTrue("name = \"states\", values = states?.map { it.value }.orEmpty()" in client, client)
        val sortBinding =
            "name = \"sort\", values = " +
                "sort?.let { listOf(it.joinToString(\",\") { item -> item.value }) }.orEmpty()"
        assertTrue(sortBinding in client, client)
        // Non-enum scalars keep their existing encoding.
        assertTrue("name = \"limit\", values = limit?.let { listOf(it.toString()) }.orEmpty()" in client, client)
        assertFalse("interval.toString()" in client, client)
        assertFalse("direction?.let { listOf(it.toString()) }" in client, client)
    }

    /**
     * A `[string, 'null']` property reaches the projection as `string` plus a nullability flag; the branch predicate
     * used to test only the string kind, so a real terminal page (`cursor: null`) matched no branch and the union
     * threw its `NoMatchException`.
     */
    @Test
    fun explicitNullOnANullableBranchFieldIsAcceptedByTheBranchPredicate() {
        val union = compileSpec(SHAPE_UNION_SPEC).source("FileListResponse.kt")

        val predicate =
            union
                .lineSequence()
                .single { line -> line.startsWith("private fun matchesFileListResponseOpenRouterFileListBranch(") }
        listOf("cursor", "first_id", "last_id").forEach { name ->
            val acceptsNull =
                "(rawObject[\"$name\"]?.let { property -> " +
                    "(property is JsonPrimitive && property.isString || property is JsonNull) } ?: true)"
            assertTrue(acceptsNull in predicate, predicate)
        }
        // A non-nullable string property is unchanged.
        val stringOnly =
            "(item[\"filename\"]?.let { property -> " +
                "property is JsonPrimitive && property.isString } ?: true)"
        assertTrue(stringOnly in predicate, predicate)
    }

    private class Compilation(
        private val files: Map<String, String>,
    ) {
        fun source(fileName: String): String = files.entries.single { (path, _) -> path.endsWith("/$fileName") }.value
    }

    private fun compileSpec(spec: String): Compilation {
        val root = Files.createTempDirectory("sdkgen-wire-value-")
        val specPath = root.resolve("openapi.yaml")
        specPath.writeText(spec.trimIndent() + "\n")
        val document = SemanticAdapter().adapt(specPath).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "FixtureClient",
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())
        val files =
            KotlinPoetEmitter(PACKAGE).render(mapping.model).files.associate { file ->
                file.path to file.bytes.decodeToString()
            }
        val sourcePaths =
            files.map { (relativePath, text) ->
                val path = root.resolve(relativePath)
                path.parent.createDirectories()
                path.writeText(text)
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
        return Compilation(files)
    }

    private companion object {
        const val PACKAGE = "com.example.wire"

        /** Enum-typed parameters in every location and serialization shape the emitter binds. */
        const val ENUM_PARAMETER_SPEC = """
        openapi: 3.1.0
        info:
          title: Workspaces
          version: "1"
        paths:
          /workspaces/{id}/budgets/{interval}:
            delete:
              operationId: deleteWorkspaceBudget
              parameters:
                - name: id
                  in: path
                  required: true
                  schema:
                    type: string
                - name: interval
                  in: path
                  required: true
                  schema:
                    type: string
                    enum: [daily, weekly, monthly, lifetime]
                - name: direction
                  in: query
                  schema:
                    ${'$'}ref: '#/components/schemas/Direction'
                - name: states
                  in: query
                  schema:
                    type: array
                    items:
                      ${'$'}ref: '#/components/schemas/Direction'
                - name: sort
                  in: query
                  style: form
                  explode: false
                  schema:
                    type: array
                    items:
                      ${'$'}ref: '#/components/schemas/Direction'
                - name: limit
                  in: query
                  schema:
                    type: integer
                - name: X-Mode
                  in: header
                  required: true
                  schema:
                    ${'$'}ref: '#/components/schemas/Direction'
              responses:
                '204':
                  description: Deleted
        components:
          schemas:
            Direction:
              type: string
              enum: [asc, desc]
        """

        /**
         * The consumer's `_shape`-discriminated file-list union: the OpenRouter branch requires `cursor`, `first_id`
         * and `last_id` as nullable strings, and a real terminal page sends all three as explicit JSON `null`.
         */
        const val SHAPE_UNION_SPEC = """
        openapi: 3.1.0
        info:
          title: Files
          version: "1"
        paths:
          /files:
            get:
              operationId: listFiles
              responses:
                '200':
                  description: A page of files
                  content:
                    application/json:
                      schema:
                        ${'$'}ref: '#/components/schemas/FileListResponse'
        components:
          schemas:
            FileListResponse:
              oneOf:
                - ${'$'}ref: '#/components/schemas/OpenRouterFileList'
                - ${'$'}ref: '#/components/schemas/OpenAIFileList'
              discriminator:
                propertyName: _shape
                mapping:
                  openrouter: '#/components/schemas/OpenRouterFileList'
                  openai: '#/components/schemas/OpenAIFileList'
            OpenRouterFileList:
              type: object
              required: [_shape, data, has_more, first_id, last_id, cursor]
              properties:
                _shape:
                  type: string
                  enum: [openrouter]
                cursor:
                  type: [string, 'null']
                data:
                  type: array
                  items:
                    ${'$'}ref: '#/components/schemas/OpenRouterFile'
                first_id:
                  type: [string, 'null']
                has_more:
                  type: boolean
                last_id:
                  type: [string, 'null']
            OpenAIFileList:
              type: object
              required: [_shape, data, has_more, object]
              properties:
                _shape:
                  type: string
                  enum: [openai]
                object:
                  type: string
                  enum: [list]
                data:
                  type: array
                  items:
                    ${'$'}ref: '#/components/schemas/OpenRouterFile'
                has_more:
                  type: boolean
            OpenRouterFile:
              type: object
              required: [id, filename]
              properties:
                id:
                  type: string
                filename:
                  type: string
        """
    }
}
