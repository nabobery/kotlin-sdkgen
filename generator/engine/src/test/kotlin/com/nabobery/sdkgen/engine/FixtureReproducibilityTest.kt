package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.ConfigLoader
import com.nabobery.sdkgen.engine.config.ConfigVersion
import com.nabobery.sdkgen.engine.config.KotlinGenerationConfig
import com.nabobery.sdkgen.engine.config.NamingConfig
import com.nabobery.sdkgen.engine.config.OutputConfig
import com.nabobery.sdkgen.engine.config.PackageCoordinates
import com.nabobery.sdkgen.engine.config.RetryDefaults
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.SourceConfig
import com.nabobery.sdkgen.engine.config.TargetFamily
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.readBytes
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class FixtureReproducibilityTest {
    @Test
    fun paginationSnapshotMatchesRealPipelineRegeneration() {
        verifyFixture(
            name = "pagination",
            canonicalUri = "sdkgen://pagination-fixture/openapi.yaml",
            clientName = "PaginationFixtureClient",
            maxAttempts = 1,
        )
    }

    @Test
    fun streamingSnapshotMatchesRealPipelineRegeneration() {
        verifyFixture(
            name = "streaming",
            canonicalUri = "sdkgen://source/openapi.yaml",
            clientName = "StreamingFixtureClient",
            maxAttempts = 3,
            configPath = Path.of(requireNotNull(System.getProperty("engine.streaming.fixture.config"))),
        )
    }

    @Test
    fun completeTreeComparisonReportsNonKotlinChangesAndFilesUniqueToEitherTree() {
        val committed = Files.createTempDirectory("fixture-committed")
        val generated = Files.createTempDirectory("fixture-generated")
        Files.writeString(committed.resolve("manifest.json"), "committed")
        Files.writeString(generated.resolve("manifest.json"), "generated")
        Files.writeString(committed.resolve("committed-only.txt"), "committed only")
        Files.write(generated.resolve("generated-only.bin"), byteArrayOf(0, 1, 2))

        val failure =
            assertFailsWith<AssertionError> {
                assertOutputTreesMatch("focused", committed, generated)
            }

        val message = requireNotNull(failure.message)
        assertTrue(message.contains("changed files: manifest.json"))
        assertTrue(message.contains("missing generated files: committed-only.txt"))
        assertTrue(message.contains("extra generated files: generated-only.bin"))
    }

    @Test
    fun committedGeneratorVersionReadsManifestVersion() {
        val committed = Files.createTempDirectory("fixture-committed-version")
        Files.writeString(committed.resolve("manifest.json"), """{"generatorVersion":"distinctive-9.9.9"}""")

        assertEquals("distinctive-9.9.9", committedGeneratorVersion(committed))
    }

    @Test
    fun committedGeneratorVersionRejectsMissingVersion() {
        val committed = Files.createTempDirectory("fixture-committed-missing")
        Files.writeString(committed.resolve("manifest.json"), """{"edition":"community"}""")

        val failure = assertFailsWith<IllegalArgumentException> { committedGeneratorVersion(committed) }
        assertTrue(requireNotNull(failure.message).contains("non-blank generatorVersion"))
    }

    @Test
    fun committedGeneratorVersionRejectsBlankVersion() {
        val committed = Files.createTempDirectory("fixture-committed-blank")
        Files.writeString(committed.resolve("manifest.json"), """{"generatorVersion":"   "}""")

        val failure = assertFailsWith<IllegalArgumentException> { committedGeneratorVersion(committed) }
        assertTrue(requireNotNull(failure.message).contains("non-blank generatorVersion"))
    }

    @Test
    fun committedGeneratorVersionReportsManifestPathForMalformedJson() {
        val committed = Files.createTempDirectory("fixture-committed-malformed")
        Files.writeString(committed.resolve("manifest.json"), "not json {")

        val failure = assertFailsWith<IllegalArgumentException> { committedGeneratorVersion(committed) }
        assertTrue(requireNotNull(failure.message).contains(committed.resolve("manifest.json").toString()))
        assertTrue(failure.cause is SerializationException)
    }

    private fun committedGeneratorVersion(committed: Path): String {
        val manifestPath = committed.resolve("manifest.json")
        val manifest =
            try {
                Json.parseToJsonElement(Files.readString(manifestPath))
            } catch (failure: SerializationException) {
                throw IllegalArgumentException("Committed fixture manifest $manifestPath is not valid JSON", failure)
            }
        val version =
            manifest
                .jsonObject["generatorVersion"]
                ?.jsonPrimitive
                ?.contentOrNull
                ?.takeIf(String::isNotBlank)
        return requireNotNull(version) {
            "Committed fixture manifest $manifestPath must contain a non-blank generatorVersion"
        }
    }

    private fun verifyFixture(
        name: String,
        canonicalUri: String,
        clientName: String,
        maxAttempts: Int,
        configPath: Path? = null,
    ) {
        val source = Path.of(requireNotNull(System.getProperty("engine.$name.fixture.source")))
        val committed = Path.of(requireNotNull(System.getProperty("engine.$name.fixture.committed")))
        val output = Path.of(requireNotNull(System.getProperty("engine.$name.fixture.output")))
        val bytes = source.readBytes()
        val digest = bytes.sha256()
        val config =
            configPath?.let { path -> ConfigLoader.decodeYaml(Files.readString(path), path.toString()) }
                ?: SdkgenConfigV1Alpha1(
                    version = ConfigVersion.V1_ALPHA_1,
                    source = SourceConfig(canonicalUri, digest),
                    kotlin =
                        KotlinGenerationConfig(
                            packageName = "com.nabobery.sdkgen.generated",
                            coordinates = PackageCoordinates("com.nabobery.sdkgen", "$name-fixture"),
                            naming = NamingConfig(clientName),
                            targets = listOf(TargetFamily.JVM),
                        ),
                    runtime = RuntimeDefaults(retries = RetryDefaults(maxAttempts = maxAttempts)),
                    output = OutputConfig("sources", "resources", "manifest.json"),
                )

        val committedVersion = committedGeneratorVersion(committed)
        GenerationPipeline(committedVersion).generate(
            config = config,
            source = ResolvedSource(source, canonicalUri, digest, bytes.size.toLong()),
            overlays = emptyList(),
            destination = output,
        )

        if (System.getenv("UPDATE_SDKGEN_FIXTURES") == "1") {
            // Opt-in refresh, mirroring UPDATE_OPENROUTER_ADVISOR_NESTED_TOOL_FIXTURE elsewhere in this suite.
            // Only ever run deliberately: it overwrites the committed fixture with whatever the pipeline
            // currently produces, so a real regression would be adopted rather than reported. Review the diff.
            output.toFile().copyRecursively(committed.toFile(), overwrite = true)
        }

        assertOutputTreesMatch(name, committed, output)
    }

    private fun assertOutputTreesMatch(
        name: String,
        committedRoot: Path,
        generatedRoot: Path,
    ) {
        val committed = outputTree(committedRoot)
        val generated = outputTree(generatedRoot)
        val missingGenerated = committed.keys - generated.keys
        val extraGenerated = generated.keys - committed.keys
        val changed = committed.keys.intersect(generated.keys).filter { path -> committed[path] != generated[path] }
        assertTrue(
            missingGenerated.isEmpty() && extraGenerated.isEmpty() && changed.isEmpty(),
            buildString {
                append("$name fixture is not reproducible; regenerate it")
                if (missingGenerated.isNotEmpty()) {
                    append("\nmissing generated files: ")
                    append(missingGenerated.sorted().joinToString())
                }
                if (extraGenerated.isNotEmpty()) {
                    append("\nextra generated files: ")
                    append(extraGenerated.sorted().joinToString())
                }
                if (changed.isNotEmpty()) {
                    append("\nchanged files: ")
                    append(changed.sorted().joinToString())
                }
            },
        )
    }

    private fun outputTree(root: Path): Map<String, List<Byte>> {
        val resolvedRoot =
            if (Files.isSymbolicLink(root)) {
                root.parent.resolve(Files.readSymbolicLink(root)).normalize()
            } else {
                root
            }
        return Files.walk(resolvedRoot).use { paths ->
            paths
                .filter(Files::isRegularFile)
                .sorted()
                .toList()
                .associate { path ->
                    resolvedRoot.relativize(path).toString().replace('\\', '/') to path.readBytes().toList()
                }
        }
    }
}

private fun ByteArray.sha256(): String =
    MessageDigest.getInstance("SHA-256").digest(this).joinToString("") { byte -> "%02x".format(byte) }
