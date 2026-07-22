package com.nabobery.sdkgen.engine

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
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.readBytes
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class FixtureReproducibilityTest {
    @Test
    fun paginationAndStreamingSnapshotsMatchRealPipelineRegeneration() {
        verifyFixture(
            name = "pagination",
            canonicalUri = "sdkgen://pagination-fixture/openapi.yaml",
            clientName = "PaginationFixtureClient",
            maxAttempts = 1,
        )
        verifyFixture(
            name = "streaming",
            canonicalUri = "sdkgen://source/openapi.yaml",
            clientName = "StreamingFixtureClient",
            maxAttempts = 3,
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

    private fun verifyFixture(
        name: String,
        canonicalUri: String,
        clientName: String,
        maxAttempts: Int,
    ) {
        val source = Path.of(requireNotNull(System.getProperty("engine.$name.fixture.source")))
        val committed = Path.of(requireNotNull(System.getProperty("engine.$name.fixture.committed")))
        val output = Path.of(requireNotNull(System.getProperty("engine.$name.fixture.output")))
        val bytes = source.readBytes()
        val digest = bytes.sha256()
        val config =
            SdkgenConfigV1Alpha1(
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

        GenerationPipeline("fixture-verification").generate(
            config = config,
            source = ResolvedSource(source, canonicalUri, digest, bytes.size.toLong()),
            overlays = emptyList(),
            destination = output,
        )

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
