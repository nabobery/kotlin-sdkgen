package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.RetryDefaults
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.engine.declarations.DeclarationProjectionRequest
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.StandardProjection
import com.nabobery.sdkgen.engine.emit.KotlinPoetEmitter
import com.nabobery.sdkgen.engine.output.AtomicOutputPublisher
import com.nabobery.sdkgen.engine.output.GenerationManifestIdentity
import com.nabobery.sdkgen.engine.output.ManifestInput
import com.nabobery.sdkgen.openapi.SemanticAdapter
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.management.ManagementFactory
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong
import kotlin.io.path.createDirectories
import kotlin.io.path.createTempDirectory
import kotlin.io.path.readBytes
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class GitHubScaleBenchmarkTest {
    @Test
    fun pinnedGitHubCorpusRecordsProductionIntakeStatusAndDeterministicDownstreamScale() {
        assumeTrue(System.getProperty("engine.runGitHubScaleBenchmark") == "true")
        val source = Path.of(requireNotNull(System.getProperty("engine.githubFile")))
        val result = Path.of(requireNotNull(System.getProperty("engine.githubScaleResult")))
        val working = createTempDirectory("sdkgen-github-scale-")
        val resources = ResourceSampler.start()

        try {
            val direct = captureAttempt { SemanticAdapter().adapt(source, GITHUB_URI) }
            assertTrue(direct.value != null, direct.message)
            val benchmarkInput = source
            val adaptation = Measurement(requireNotNull(direct.value), direct.elapsedMillis)
            val projection =
                measure {
                    StandardProjection().project(
                        DeclarationProjectionRequest(
                            document = adaptation.value.document,
                            packageName = "com.nabobery.sdkgen.generated.github",
                            canonicalDocumentUri = GITHUB_URI,
                            clientName = "GitHubClient",
                            runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                        ),
                    )
                }
            val emission = measure { KotlinPoetEmitter().render(projection.value.model).files }
            val publication =
                measure {
                    AtomicOutputPublisher().publish(
                        destination = working.resolve("first"),
                        declarationModel = projection.value.model,
                        files = emission.value,
                        identity = identity(benchmarkInput),
                        diagnostics = projection.value.diagnostics,
                        exclusions = projection.value.exclusions,
                    )
                }
            val repeatProjection =
                StandardProjection().project(
                    DeclarationProjectionRequest(
                        document = SemanticAdapter().adapt(benchmarkInput, GITHUB_URI).document,
                        packageName = "com.nabobery.sdkgen.generated.github",
                        canonicalDocumentUri = GITHUB_URI,
                        clientName = "GitHubClient",
                        runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                    ),
                )
            val repeatFiles = KotlinPoetEmitter().render(repeatProjection.model).files
            val repeatPublication =
                AtomicOutputPublisher().publish(
                    destination = working.resolve("second"),
                    declarationModel = repeatProjection.model,
                    files = repeatFiles,
                    identity = identity(benchmarkInput),
                    diagnostics = repeatProjection.diagnostics,
                    exclusions = repeatProjection.exclusions,
                )

            assertEquals(
                projection.value.model
                    .normalized()
                    .digest(),
                repeatProjection.model
                    .normalized()
                    .digest(),
            )
            assertEquals(publication.value.digest, repeatPublication.digest)
            assertEquals(emission.value.map { it.path }, repeatFiles.map { it.path })
            assertEquals(
                emission.value.map { file -> file.bytes.contentHashCode() },
                repeatFiles.map { file -> file.bytes.contentHashCode() },
            )
            assertEquals(0, adaptation.value.metrics.silentSchemaOmissions)
            assertEquals(0, adaptation.value.metrics.silentOperationOmissions)

            resources.close()
            val peakHeapBytes = resources.peakHeapBytes
            assertTrue(peakHeapBytes <= MAXIMUM_HEAP_BYTES, "peakHeapBytes=$peakHeapBytes")
            val declarations =
                projection.value.model.files
                    .sumOf { file -> file.declarations.size }
            val operations =
                projection.value.model.files
                    .flatMap { file -> file.declarations }
                    .filterIsInstance<OperationClientDeclaration>()
                    .sumOf { client -> client.operations.size }
            val outputBytes = emission.value.sumOf { file -> file.bytes.size.toLong() }
            result.parent.createDirectories()
            result.writeText(
                buildString {
                    appendLine("corpus=github-rest")
                    appendLine("source_bytes=${Files.size(source)}")
                    appendLine("production_intake_status=ready")
                    appendLine("production_intake_elapsed_ms=${direct.elapsedMillis}")
                    appendLine("production_intake_message=${direct.message.replace('\n', ' ')}")
                    appendLine("downstream_input=production-yaml")
                    appendLine("yaml_stage_ms=0")
                    appendLine("adaptation_ms=${adaptation.elapsedMillis}")
                    appendLine("projection_ms=${projection.elapsedMillis}")
                    appendLine("emission_ms=${emission.elapsedMillis}")
                    appendLine("publication_ms=${publication.elapsedMillis}")
                    appendLine("peak_heap_bytes=$peakHeapBytes")
                    appendLine("peak_rss_bytes=${resources.peakRssBytes}")
                    appendLine("component_schemas=${adaptation.value.metrics.componentSchemasTotal}")
                    appendLine("semantic_schemas=${adaptation.value.document.schemas.size}")
                    appendLine("semantic_operations=${adaptation.value.document.operations.size}")
                    appendLine("declarations=$declarations")
                    appendLine("emitted_operations=$operations")
                    appendLine("generated_files=${emission.value.size}")
                    appendLine("generated_bytes=$outputBytes")
                    appendLine("semantic_diagnostics=${adaptation.value.document.diagnostics.size}")
                    appendLine("projection_diagnostics=${projection.value.diagnostics.size}")
                    appendLine("projection_exclusions=${projection.value.exclusions.size}")
                    appendLine("declaration_digest=${projection.value.model.normalized().digest()}")
                    appendLine("snapshot_digest=${publication.value.digest}")
                    appendLine("repeat_declaration_identical=true")
                    appendLine("repeat_snapshot_identical=true")
                },
            )
        } finally {
            resources.close()
            working.toFile().deleteRecursively()
        }
    }

    private fun identity(source: Path): GenerationManifestIdentity {
        val bytes = source.readBytes()
        return GenerationManifestIdentity(
            configDigest = "a".repeat(64),
            source = ManifestInput(GITHUB_URI, sha256(bytes), bytes.size.toLong()),
            references = emptyList(),
            overlays = emptyList(),
            generatorVersion = "conformance-test",
            edition = "community",
            kotlinPoetVersion = "benchmark",
            targets = listOf("jvm", "js", "macos"),
            compatibilityProfiles = emptyList(),
            plugins = emptyList(),
            warningsAsErrors = false,
            warningAllowlist = emptyList(),
        )
    }

    private fun <T> captureAttempt(block: () -> T): Attempt<T> {
        val started = System.nanoTime()
        val result = runCatching(block)
        val failure = result.exceptionOrNull()
        return Attempt(
            value = result.getOrNull(),
            elapsedMillis = (System.nanoTime() - started) / 1_000_000,
            message =
                failure
                    ?.let { throwable ->
                        generateSequence(throwable) { cause -> cause.cause }
                            .joinToString(" | ") { cause -> cause.message.orEmpty() }
                    }.orEmpty(),
        )
    }

    private fun <T> measure(block: () -> T): Measurement<T> {
        val started = System.nanoTime()
        return Measurement(block(), (System.nanoTime() - started) / 1_000_000)
    }

    private data class Measurement<T>(
        val value: T,
        val elapsedMillis: Long,
    )

    private data class Attempt<T>(
        val value: T?,
        val elapsedMillis: Long,
        val message: String,
    )

    private class ResourceSampler private constructor(
        private val running: AtomicBoolean,
        private val maximumHeapBytes: AtomicLong,
        private val maximumRssKilobytes: AtomicLong,
        private val thread: Thread,
    ) : AutoCloseable {
        val peakHeapBytes: Long
            get() = maximumHeapBytes.get().coerceAtLeast(0L)

        val peakRssBytes: Long
            get() = maximumRssKilobytes.get().coerceAtLeast(0L) * 1024L

        override fun close() {
            if (!running.compareAndSet(true, false)) return
            thread.join()
        }

        companion object {
            fun start(): ResourceSampler {
                val running = AtomicBoolean(true)
                val maximumHeap = AtomicLong(0)
                val maximumRss = AtomicLong(0)
                val memory = ManagementFactory.getMemoryMXBean()
                val pid = ProcessHandle.current().pid().toString()
                val thread =
                    Thread {
                        while (running.get()) {
                            maximumHeap.accumulateAndGet(memory.heapMemoryUsage.used, ::maxOf)
                            val rss =
                                runCatching {
                                    ProcessBuilder("ps", "-o", "rss=", "-p", pid)
                                        .start()
                                        .inputStream
                                        .bufferedReader()
                                        .use { reader -> reader.readText().trim().toLong() }
                                }.getOrDefault(-1L)
                            maximumRss.accumulateAndGet(rss, ::maxOf)
                            Thread.sleep(25)
                        }
                    }.apply {
                        name = "github-scale-resource-sampler"
                        isDaemon = true
                        start()
                    }
                return ResourceSampler(running, maximumHeap, maximumRss, thread)
            }
        }
    }

    private companion object {
        const val GITHUB_URI = "sdkgen://github/openapi.yaml"
        const val MAXIMUM_HEAP_BYTES = 2L * 1024 * 1024 * 1024
    }
}

private fun sha256(bytes: ByteArray): String =
    MessageDigest.getInstance("SHA-256").digest(bytes).joinToString("") { byte -> "%02x".format(byte) }
