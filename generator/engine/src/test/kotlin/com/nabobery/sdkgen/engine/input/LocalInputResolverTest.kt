package com.nabobery.sdkgen.engine.input

import com.nabobery.sdkgen.engine.config.AcquisitionException
import com.nabobery.sdkgen.engine.config.AcquisitionMode
import com.nabobery.sdkgen.engine.config.AcquisitionPolicy
import com.nabobery.sdkgen.engine.config.ConfigVersion
import com.nabobery.sdkgen.engine.config.KotlinGenerationConfig
import com.nabobery.sdkgen.engine.config.NamingConfig
import com.nabobery.sdkgen.engine.config.OutputConfig
import com.nabobery.sdkgen.engine.config.PackageCoordinates
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.SourceConfig
import com.nabobery.sdkgen.engine.config.TargetFamily
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.isRegularFile
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LocalInputResolverTest {
    @Test
    fun `stages the complete local reference closure with stable identities`() {
        val project = Files.createTempDirectory("sdkgen-input-resolver-")
        val specs = project.resolve("specs").also(Path::createDirectories)
        val root = specs.resolve("openapi.yaml")
        val referenced = specs.resolve("components.yaml")
        root.writeText(rootDocument("components.yaml"))
        referenced.writeText(componentDocument("before"))

        val resolved = LocalInputResolver().resolve(project.resolve("sdkgen.yaml"), config("specs/openapi.yaml"))
        resolved.use {
            assertEquals("sdkgen://source/openapi.yaml", it.source.canonicalUri)
            assertEquals(
                listOf("sdkgen://source/components.yaml"),
                it.source.references.map { reference -> reference.canonicalUri },
            )
            assertTrue(it.source.path.exists())
            assertTrue(
                it.source.path.parent
                    .resolve("components.yaml")
                    .exists(),
            )

            referenced.writeText(componentDocument("after"))
            assertTrue(
                it.source.path.parent
                    .resolve("components.yaml")
                    .readText()
                    .contains("before"),
            )
        }
        assertFalse(resolved.workspaceRoot.exists())
    }

    @Test
    fun `records digests and lengths from the independently hashed staged closure`() {
        val project = Files.createTempDirectory("sdkgen-input-staged-digests-")
        val specs = project.resolve("specs").also(Path::createDirectories)
        specs.resolve("openapi.yaml").writeText(rootDocument("components.yaml"))
        specs.resolve("components.yaml").writeText(componentDocument("verified"))

        LocalInputResolver().resolve(project.resolve("sdkgen.yaml"), config("specs/openapi.yaml")).use { resolved ->
            assertEquals(
                resolved.source.path
                    .readBytes()
                    .sha256(),
                resolved.source.sha256,
            )
            assertEquals(Files.size(resolved.source.path), resolved.source.contentLength)
            resolved.source.references.forEach { reference ->
                val stagedReference =
                    resolved.source.path.parent
                        .resolve(reference.canonicalUri.removePrefix("sdkgen://source/"))
                assertTrue(stagedReference.isRegularFile())
                assertEquals(stagedReference.readBytes().sha256(), reference.sha256)
                assertEquals(Files.size(stagedReference), reference.contentLength)
            }
        }
    }

    @Test
    fun `discovers references from staged root bytes`() {
        val project = Files.createTempDirectory("sdkgen-input-staged-closure-")
        val specs = project.resolve("specs").also(Path::createDirectories)
        val root = specs.resolve("openapi.yaml")
        root.writeText("openapi: 3.1.0\ninfo: { title: Original, version: '1' }\npaths: {}\n")
        specs.resolve("components.yaml").writeText(componentDocument("staged"))
        val stagedRoot = rootDocument("components.yaml")
        val config =
            config("specs/openapi.yaml").copy(
                source = config("specs/openapi.yaml").source.copy(sha256 = stagedRoot.encodeToByteArray().sha256()),
            )

        LocalInputResolver(
            inputOpener = { path ->
                if (path == root.toRealPath()) stagedRoot.byteInputStream() else Files.newInputStream(path)
            },
        ).resolve(project.resolve("sdkgen.yaml"), config).use { resolved ->
            assertEquals(
                listOf("sdkgen://source/components.yaml"),
                resolved.source.references.map { it.canonicalUri },
            )
            assertTrue(
                resolved.source.path.parent
                    .resolve("components.yaml")
                    .isRegularFile(),
            )
        }
    }

    @Test
    fun `stages a reference under an explicitly allowed additional root`() {
        val project = Files.createTempDirectory("sdkgen-input-additional-root-")
        val specs = project.resolve("specs").also(Path::createDirectories)
        val shared = project.resolve("shared").also(Path::createDirectories)
        specs.resolve("openapi.yaml").writeText(rootDocument("../shared/components.yaml"))
        shared.resolve("components.yaml").writeText(componentDocument("shared"))

        LocalInputResolver()
            .resolve(
                project.resolve("sdkgen.yaml"),
                config("specs/openapi.yaml", allowedRoots = listOf("specs", "shared")),
            ).use { resolved ->
                assertEquals(
                    listOf("sdkgen://source/shared/components.yaml"),
                    resolved.source.references.map { it.canonicalUri },
                )
                assertTrue(
                    resolved.source.path.parent
                        .resolve("shared/components.yaml")
                        .isRegularFile(),
                )
            }
    }

    @Test
    fun `accepts a source from an explicitly allowed additional root`() {
        val project = Files.createTempDirectory("sdkgen-input-explicit-root-")
        project.resolve("specs").createDirectories()
        val shared = project.resolve("shared").also(Path::createDirectories)
        shared.resolve("openapi.yaml").writeText("openapi: 3.1.0\ninfo: { title: Shared, version: '1' }\npaths: {}\n")

        LocalInputResolver()
            .resolve(
                project.resolve("sdkgen.yaml"),
                config("shared/openapi.yaml", allowedRoots = listOf("specs", "shared")),
            ).use { resolved ->
                assertTrue(resolved.source.path.isRegularFile())
                assertEquals("sdkgen://source/openapi.yaml", resolved.source.canonicalUri)
            }
    }

    @Test
    fun `rejects a closure reference outside every allowed root`() {
        val project = Files.createTempDirectory("sdkgen-input-closure-outside-")
        val specs = project.resolve("specs").also(Path::createDirectories)
        val shared = project.resolve("shared").also(Path::createDirectories)
        specs.resolve("openapi.yaml").writeText(rootDocument("../shared/components.yaml"))
        shared.resolve("components.yaml").writeText(componentDocument("outside"))

        val failure =
            assertFailsWith<AcquisitionException> {
                LocalInputResolver().resolve(project.resolve("sdkgen.yaml"), config("specs/openapi.yaml"))
            }

        assertEquals("SDKGEN-ACQUISITION-OUTSIDE-ROOT", failure.diagnostic.code)
    }

    @Test
    fun `rejects a directory configured as an additional allowed input`() {
        val project = Files.createTempDirectory("sdkgen-input-directory-")
        project.resolve("specs").createDirectories()
        project.resolve("overlays").createDirectories()

        val failure =
            assertFailsWith<AcquisitionException> {
                LocalInputResolver().resolve(
                    project.resolve("sdkgen.yaml"),
                    config("overlays", allowedRoots = listOf("specs", "overlays")),
                )
            }

        assertEquals("SDKGEN-ACQUISITION-NOT-A-FILE", failure.diagnostic.code)
    }

    @Test
    fun `rejects traversal outside every allowed local root`() {
        val project = Files.createTempDirectory("sdkgen-input-traversal-")
        project.resolve("specs").createDirectories()
        project.parent.resolve("outside.yaml").writeText("openapi: 3.1.0\n")

        val failure =
            assertFailsWith<AcquisitionException> {
                LocalInputResolver().resolve(project.resolve("sdkgen.yaml"), config("../outside.yaml"))
            }

        assertEquals("SDKGEN-ACQUISITION-OUTSIDE-ROOT", failure.diagnostic.code)
    }

    @Test
    fun `rejects a symlink whose real target escapes an allowed root`() {
        val project = Files.createTempDirectory("sdkgen-input-symlink-")
        val specs = project.resolve("specs").also(Path::createDirectories)
        val outside = project.resolve("outside.yaml").also { it.writeText("openapi: 3.1.0\n") }
        val link = specs.resolve("openapi.yaml")
        val created = runCatching { Files.createSymbolicLink(link, outside) }.isSuccess
        assumeTrue(created, "symbolic links are unavailable on this host")

        val failure =
            assertFailsWith<AcquisitionException> {
                LocalInputResolver().resolve(project.resolve("sdkgen.yaml"), config("specs/openapi.yaml"))
            }

        assertEquals("SDKGEN-ACQUISITION-OUTSIDE-ROOT", failure.diagnostic.code)
    }

    @Test
    fun `rejects unsupported https acquisition before reading input`() {
        val project = Files.createTempDirectory("sdkgen-input-https-")
        val config =
            config("https://example.test/openapi.yaml").copy(
                source =
                    SourceConfig(
                        uri = "https://example.test/openapi.yaml",
                        acquisition = AcquisitionPolicy(mode = AcquisitionMode.HTTPS),
                    ),
            )

        val failure =
            assertFailsWith<AcquisitionException> {
                LocalInputResolver().resolve(project.resolve("sdkgen.yaml"), config)
            }

        assertEquals("SDKGEN-ACQUISITION-MODE-UNSUPPORTED", failure.diagnostic.code)
    }

    @Test
    fun `enforces max bytes while streaming staged bytes`() {
        val project = Files.createTempDirectory("sdkgen-input-stream-size-")
        val specs = project.resolve("specs").also(Path::createDirectories)
        specs.resolve("openapi.yaml").writeText("openapi: 3.1.0\n")
        val config =
            config("specs/openapi.yaml").copy(
                source =
                    SourceConfig(
                        uri = "specs/openapi.yaml",
                        acquisition =
                            AcquisitionPolicy(
                                offline = true,
                                maxBytes = 16,
                                allowedLocalRoots = listOf("specs"),
                            ),
                    ),
            )

        val failure =
            assertFailsWith<AcquisitionException> {
                LocalInputResolver(inputOpener = { "x".repeat(17).byteInputStream() })
                    .resolve(project.resolve("sdkgen.yaml"), config)
            }

        assertEquals("SDKGEN-ACQUISITION-SIZE-LIMIT", failure.diagnostic.code)
    }

    @Test
    fun `preserves acquisition failure when workspace cleanup fails`() {
        val project = Files.createTempDirectory("sdkgen-input-cleanup-")
        val specs = project.resolve("specs").also(Path::createDirectories)
        specs.resolve("openapi.yaml").writeText("openapi: 3.1.0\n")
        val config =
            config(
                "specs/openapi.yaml",
            ).copy(source = config("specs/openapi.yaml").source.copy(sha256 = "0".repeat(64)))

        val failure =
            assertFailsWith<AcquisitionException> {
                LocalInputResolver(workspaceDeleter = { throw IllegalStateException("cleanup failed") })
                    .resolve(project.resolve("sdkgen.yaml"), config)
            }

        assertEquals("SDKGEN-ACQUISITION-DIGEST-MISMATCH", failure.diagnostic.code)
        assertEquals("cleanup failed", failure.suppressed.single().message)
    }

    @Test
    fun `enforces max bytes before parser work`() {
        val project = Files.createTempDirectory("sdkgen-input-size-")
        val specs = project.resolve("specs").also(Path::createDirectories)
        specs.resolve("openapi.yaml").writeText("openapi: 3.1.0\n")
        val config =
            config("specs/openapi.yaml").copy(
                source =
                    SourceConfig(
                        uri = "specs/openapi.yaml",
                        acquisition =
                            AcquisitionPolicy(
                                offline = true,
                                maxBytes = 4,
                                allowedLocalRoots = listOf("specs"),
                            ),
                    ),
            )

        val failure =
            assertFailsWith<AcquisitionException> {
                LocalInputResolver().resolve(project.resolve("sdkgen.yaml"), config)
            }

        assertEquals("SDKGEN-ACQUISITION-SIZE-LIMIT", failure.diagnostic.code)
    }

    private fun config(
        source: String,
        allowedRoots: List<String> = listOf("specs"),
    ): SdkgenConfigV1Alpha1 =
        SdkgenConfigV1Alpha1(
            version = ConfigVersion.V1_ALPHA_1,
            source =
                SourceConfig(
                    uri = source,
                    acquisition =
                        AcquisitionPolicy(
                            offline = true,
                            allowedLocalRoots = allowedRoots,
                        ),
                ),
            kotlin =
                KotlinGenerationConfig(
                    packageName = "com.nabobery.generated",
                    coordinates = PackageCoordinates("com.nabobery", "generated"),
                    naming = NamingConfig("GeneratedClient"),
                    targets = listOf(TargetFamily.JVM),
                ),
            output = OutputConfig("generated/current", "generated/resources", "generated/current/manifest.json"),
        )

    private fun rootDocument(reference: String): String =
        """
        openapi: 3.1.0
        info:
          title: Resolver test
          version: "1"
        paths: {}
        components:
          schemas:
            Root:
              ${'$'}ref: '$reference#/components/schemas/Referenced'
        """.trimIndent() + "\n"

    private fun componentDocument(description: String): String =
        """
        components:
          schemas:
            Referenced:
              type: object
              description: $description
        """.trimIndent() + "\n"
}

private fun ByteArray.sha256(): String =
    MessageDigest.getInstance("SHA-256").digest(this).joinToString("") { byte -> "%02x".format(byte) }
