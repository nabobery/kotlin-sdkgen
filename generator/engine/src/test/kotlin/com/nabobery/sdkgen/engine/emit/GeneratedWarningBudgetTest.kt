package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.DeclarationProjectionRequest
import com.nabobery.sdkgen.engine.declarations.StandardProjection
import com.nabobery.sdkgen.openapi.SemanticAdapter
import org.jetbrains.kotlin.cli.common.ExitCode
import org.jetbrains.kotlin.cli.jvm.K2JVMCompiler
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regression budget for high-volume Kotlin compiler warnings in generated code. A clean OpenRouter
 * JVM compile of the 0.3.0 generator produced 3,562 warnings in four categories, all attributable to a handful of
 * emitter templates: redundant `as JsonObject`/`as JsonArray` casts after an `is` guard (2,148), `is`/`!is` checks on
 * a receiver whose static type already decides them (280 + 436), and `toString()` on `String` parameters (698). The
 * fixture below is the smallest schema that exercises each template; the budget for every fixed category is zero.
 * Generator diagnostics (for example `SDKGEN-LEGACY-NULLABLE-COMPOSITION`) are unrelated and not counted here.
 */
class GeneratedWarningBudgetTest {
    @Test
    fun oneOfBranchPredicatesCompileWithoutRedundantCastsOrStaticInstanceChecks() {
        val compilation = compileFixture()

        assertTrue("Branch(rawObject: JsonObject)" in compilation.sources, "fixture must emit object branch predicates")
        assertEquals(emptyList(), compilation.warnings("no cast needed"))
        assertEquals(emptyList(), compilation.warnings("check for instance is always"))
    }

    @Test
    fun harnessCapturesCompilerWarnings() {
        val root = Files.createTempDirectory("sdkgen-warning-harness-")
        val source = root.resolve("Probe.kt")
        source.writeText("fun probe(value: String): String = value as String\n")

        val compilation = compile(root, listOf(source.toString()), sources = "")

        assertEquals(
            listOf("Probe.kt:1:42: no cast needed."),
            compilation.warnings("no cast needed"),
            "raw compiler output:\n" + compilation.compilerOutput,
        )
    }

    @Test
    fun stringParameterEncodingCompilesWithoutRedundantConversions() {
        val compilation = compileFixture()

        assertTrue("SdkParameterLocation.QUERY" in compilation.sources, "fixture must emit query parameter encoding")
        assertEquals(emptyList(), compilation.warnings("redundant call of conversion method"))
    }

    private class Compilation(
        val sources: String,
        val compilerOutput: String,
    ) {
        /**
         * Every source-attributed compiler warning whose message contains [category] (case-insensitively),
         * rendered as `File.kt:line:column: message`. The CLI compiler renders
         * `<path>:<line>:<column>: warning: <message>`; environment warnings without a source position (for example
         * the missing `-kotlin-home` notices) are not source warnings and are ignored.
         */
        fun warnings(category: String): List<String> =
            compilerOutput
                .lineSequence()
                .mapNotNull { line -> SOURCE_WARNING.matchEntire(line) }
                .filter { match -> match.groupValues[4].contains(category, ignoreCase = true) }
                .map { match ->
                    val (path, line, column, message) = match.destructured
                    "${path.substringAfterLast('/')}:$line:$column: $message"
                }.toList()

        private companion object {
            val SOURCE_WARNING = Regex("""^(.+?):(\d+):(\d+): warning: (.*)$""")
        }
    }

    private fun compileFixture(): Compilation {
        val root = Files.createTempDirectory("sdkgen-warning-budget-")
        val specPath = root.resolve("openapi.yaml")
        specPath.writeText(SPEC.trimIndent() + "\n")
        val document = SemanticAdapter().adapt(specPath).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "ShapesClient",
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())
        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model).files
        val sourcePaths =
            rendered.map { file ->
                val path = root.resolve(file.path)
                path.parent.createDirectories()
                path.writeText(file.bytes.decodeToString())
                path.toString()
            }
        return compile(root, sourcePaths, rendered.joinToString("\n") { file -> file.bytes.decodeToString() })
    }

    private fun compile(
        root: Path,
        sourcePaths: List<String>,
        sources: String,
    ): Compilation {
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
        return Compilation(sources = sources, compilerOutput = compilerOutput.toString())
    }

    private companion object {
        const val PACKAGE = "com.example.warnings"
        const val SPEC = """
        openapi: 3.1.0
        info:
          title: Shapes
          version: "1"
        paths:
          /shapes:
            get:
              operationId: listShapes
              parameters:
                - name: owner
                  in: query
                  required: true
                  schema:
                    type: string
                - name: q
                  in: query
                  schema:
                    type: string
                - name: tags
                  in: query
                  schema:
                    type: array
                    items:
                      type: string
                - name: limit
                  in: query
                  schema:
                    type: integer
              responses:
                '200':
                  description: OK
                  content:
                    application/json:
                      schema:
                        ${'$'}ref: '#/components/schemas/Shape'
        components:
          schemas:
            Shape:
              oneOf:
                - ${'$'}ref: '#/components/schemas/Circle'
                - ${'$'}ref: '#/components/schemas/Square'
            Circle:
              type: object
              required: [type, radius]
              properties:
                type:
                  const: circle
                radius:
                  type: number
            Square:
              type: object
              required: [type, side, corners]
              properties:
                type:
                  const: square
                side:
                  type: number
                corners:
                  type: array
                  minItems: 4
                  uniqueItems: true
                  items:
                    type: integer
                origin:
                  allOf:
                    - ${'$'}ref: '#/components/schemas/Location'
                    - required: [kind]
                labels:
                  type: array
                  items:
                    allOf:
                      - ${'$'}ref: '#/components/schemas/Location'
                      - ${'$'}ref: '#/components/schemas/Named'
            Location:
              type: object
              properties:
                kind:
                  const: approximate
                city:
                  type: string
            Named:
              type: object
              required: [name]
              properties:
                name:
                  type: string
        """
    }
}
