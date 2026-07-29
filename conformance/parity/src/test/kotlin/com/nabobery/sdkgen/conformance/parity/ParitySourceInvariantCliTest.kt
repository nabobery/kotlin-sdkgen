package com.nabobery.sdkgen.conformance.parity

import java.io.File
import java.nio.file.Files
import kotlin.io.path.createTempDirectory
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class ParitySourceInvariantCliTest {
    @Test
    fun portableSourceCheckEmitsPassedFrameForKmpSafeGeneratedSource() {
        val root = createTempDirectory("parity-source-safe").toFile()
        root.resolve("Generated.kt").writeText("package generated\n\npublic class Generated\n")
        val output = File.createTempFile("parity-source", ".txt")

        producePortableSourceFixture(root, "run-safe", "fixture.safe", output)

        val result = FixtureEventParser.parseFixtureEvents(output.readText(), setOf("fixture.safe"), "run-safe")
        assertEquals(ParityStatus.PASSED, result.getValue("fixture.safe").status)
    }

    @Test
    fun portableSourceCheckEmitsFailedFrameForJvmImports() {
        val root = createTempDirectory("parity-source-jvm").toFile()
        root.resolve("Generated.kt").writeText("package generated\n\nimport java.time.Instant\n")
        val output = File.createTempFile("parity-source", ".txt")

        producePortableSourceFixture(root, "run-jvm", "fixture.jvm", output)

        val result = FixtureEventParser.parseFixtureEvents(output.readText(), setOf("fixture.jvm"), "run-jvm")
        assertEquals(ParityStatus.FAILED, result.getValue("fixture.jvm").status)
        assertTrue(result.getValue("fixture.jvm").reason!!.contains("java.time.Instant"))
    }

    @Test
    fun portableSourceCheckRejectsSymbolicLinkRoot() {
        val parent = createTempDirectory("parity-source-root-link")
        val target = parent.resolve("target")
        Files.createDirectory(target)
        Files.writeString(target.resolve("Generated.kt"), "package generated\n")
        val rootLink = parent.resolve("generated-link")
        Files.createSymbolicLink(rootLink, target)
        val output = File.createTempFile("parity-source", ".txt")

        producePortableSourceFixture(rootLink.toFile(), "run-link", "fixture.link", output)

        val result = FixtureEventParser.parseFixtureEvents(output.readText(), setOf("fixture.link"), "run-link")
        assertEquals(ParityStatus.FAILED, result.getValue("fixture.link").status)
        assertTrue(result.getValue("fixture.link").reason!!.contains("symbolic link"))
    }

    @Test
    fun provenanceRejectsSymbolicLinkGeneratedTreeRoot() {
        val parent = createTempDirectory("parity-provenance-root-link")
        val target = parent.resolve("target")
        Files.createDirectory(target)
        Files.writeString(target.resolve("Generated.kt"), "package generated\n")
        val rootLink = parent.resolve("generated-link")
        Files.createSymbolicLink(rootLink, target)
        val corpus = parent.resolve("openapi.yaml").also { path -> Files.writeString(path, "openapi: 3.1.0\n") }
        val toolchain = parent.resolve("libs.versions.toml").also { path -> Files.writeString(path, "[versions]\n") }

        val failure =
            assertFailsWith<IllegalArgumentException> {
                ProducerProvenanceResolver.resolve(
                    repositoryRoot = File(System.getProperty("parity.repositoryRoot") ?: "."),
                    paths =
                        ProducerInputPaths(
                            corpus = corpus.toFile(),
                            config = null,
                            lock = null,
                            overlay = null,
                            toolchain = toolchain.toFile(),
                            generatedDirectory = rootLink.toFile(),
                        ),
                )
            }

        assertTrue(failure.message!!.contains("symbolic link"))
    }
}
