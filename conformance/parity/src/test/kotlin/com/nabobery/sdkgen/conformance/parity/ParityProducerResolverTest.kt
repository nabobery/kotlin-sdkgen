package com.nabobery.sdkgen.conformance.parity

import kotlinx.serialization.json.Json
import java.io.File
import kotlin.io.path.createTempDirectory
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertTrue

class ParityProducerResolverTest {
    private val runId = "test-run-123"

    @Test
    fun successfulExecutionAllFixturesPassingEmitsPassedEvidenceWithFullProvenance() {
        val registry = loadRegistry()
        val events =
            listOf(
                FixtureEvent(runId, "github.pagination", FixtureEventType.START),
                FixtureEvent(runId, "github.pagination", FixtureEventType.PASS),
                FixtureEvent(runId, "github.auth", FixtureEventType.START),
                FixtureEvent(runId, "github.auth", FixtureEventType.PASS),
                FixtureEvent(runId, "github.typed-errors", FixtureEventType.START),
                FixtureEvent(runId, "github.typed-errors", FixtureEventType.PASS),
                FixtureEvent(runId, "github.optionality", FixtureEventType.START),
                FixtureEvent(runId, "github.optionality", FixtureEventType.PASS),
                FixtureEvent(runId, "github.unions", FixtureEventType.START),
                FixtureEvent(runId, "github.unions", FixtureEventType.PASS),
                FixtureEvent(runId, "github.compile-jvm", FixtureEventType.START),
                FixtureEvent(runId, "github.compile-jvm", FixtureEventType.PASS),
                FixtureEvent(runId, "github.source-portable", FixtureEventType.START),
                FixtureEvent(runId, "github.source-portable", FixtureEventType.PASS),
            ).joinToString("\n") { framePrefix + eventJson.encodeToString(FixtureEvent.serializer(), it) }

        val bundle =
            ParityProducerResolver.resolve(
                producerName = "github-corpus",
                subject = "github",
                task = ":conformance:github:consumer:test",
                runId = runId,
                registry = registry,
                repositoryRoot = repositoryRoot,
                taskFailed = false,
                framedEventsInput = events,
                matrix = setOf(MatrixType.BEHAVIOR, MatrixType.COMPILE, MatrixType.SOURCE_INVARIANT),
                excludedFixtureIds = setOf("github.compile-non-jvm"),
            )

        assertEquals("v1alpha1", bundle.schemaVersion)
        assertEquals("github-corpus", bundle.producer)
        assertEquals(ExecutionStatus.PASSED, bundle.execution.status)
        assertNull(bundle.execution.reason)
        assertEquals(7, bundle.execution.passedFixtureIds.size)
        assertEquals(8, bundle.rows.size)
        assertEquals(7, bundle.rows.count { it.status == ParityStatus.PASSED })
        assertTrue(bundle.rows.all { it.status != ParityStatus.FAILED })
        assertTrue(
            bundle.rows
                .filter { it.status == ParityStatus.PASSED }
                .all { it.configDigest == ParityRegistry.GITHUB_EFFECTIVE_CONFIG_SHA256 },
        )
        assertTrue(
            bundle.rows
                .filter { it.status == ParityStatus.PASSED }
                .all { it.configFileSha256 == ParityRegistry.GITHUB_CONFIG_FILE_SHA256 },
        )
        assertTrue(
            bundle.rows
                .filter { it.status == ParityStatus.PASSED }
                .all { it.lockFileSha256 == ParityRegistry.GITHUB_LOCK_FILE_SHA256 },
        )
        val provenance = ProducerProvenanceResolver.resolve(repositoryRoot, ProducerInputPaths.github(repositoryRoot))
        assertTrue(
            bundle.rows
                .filter { it.status == ParityStatus.PASSED }
                .all { it.generatedArtifactSha256 == provenance.generatedArtifactSha256 },
        )
        assertTrue(
            bundle.rows
                .filter { it.status == ParityStatus.PASSED }
                .all { it.manifestSha256 == provenance.manifestSha256 },
        )
    }

    @Test
    fun taskFailureDiscardsObservedPassesStartedBecomeFailedUnstartedBecomeNotRun() {
        val registry = loadRegistry()
        val events =
            listOf(
                FixtureEvent(runId, "github.pagination", FixtureEventType.START),
                FixtureEvent(runId, "github.pagination", FixtureEventType.PASS),
                FixtureEvent(runId, "github.auth", FixtureEventType.START),
                FixtureEvent(runId, "github.auth", FixtureEventType.FAIL, "Auth test crashed"),
            ).joinToString("\n") { framePrefix + eventJson.encodeToString(FixtureEvent.serializer(), it) }

        val bundle =
            ParityProducerResolver.resolve(
                producerName = "github-corpus",
                subject = "github",
                task = ":conformance:github:consumer:test",
                runId = runId,
                registry = registry,
                repositoryRoot = repositoryRoot,
                taskFailed = true,
                taskFailureReason = "Task crashed with exit code 1",
                framedEventsInput = events,
            )

        assertEquals(ExecutionStatus.FAILED, bundle.execution.status)
        assertEquals("Task crashed with exit code 1", bundle.execution.reason)
        assertEquals(emptyList(), bundle.execution.passedFixtureIds)
        assertEquals(listOf("github.auth", "github.pagination"), bundle.execution.failedFixtureIds)

        val paginationRow = bundle.rows.single { it.id == "github.behavior.pagination" }
        assertEquals(ParityStatus.FAILED, paginationRow.status)
        assertTrue(paginationRow.reason!!.contains("Task crashed"))

        val authRow = bundle.rows.single { it.id == "github.behavior.auth" }
        assertEquals(ParityStatus.FAILED, authRow.status)
        assertEquals("Auth test crashed", authRow.reason)

        val unstartedRow = bundle.rows.single { it.id == "github.behavior.unions" }
        assertEquals(ParityStatus.NOT_RUN, unstartedRow.status)
        assertTrue(unstartedRow.reason!!.contains("Task crashed"))
    }

    @Test
    fun setupFailureBeforeFramesYieldsFailedExecutionWithAllRowsNotRun() {
        val registry = loadRegistry()
        val bundle =
            ParityProducerResolver.resolve(
                producerName = "github-corpus",
                subject = "github",
                task = ":conformance:github:consumer:test",
                runId = runId,
                registry = registry,
                repositoryRoot = repositoryRoot,
                taskFailed = true,
                taskFailureReason = "Compilation failed in consumer module",
                framedEventsInput = "",
            )

        assertEquals(ExecutionStatus.FAILED, bundle.execution.status)
        assertEquals("Compilation failed in consumer module", bundle.execution.reason)
        assertEquals(emptyList(), bundle.execution.startedFixtureIds)
        assertEquals(emptyList(), bundle.execution.passedFixtureIds)
        assertEquals(emptyList(), bundle.execution.failedFixtureIds)
        assertTrue(bundle.rows.all { it.status == ParityStatus.NOT_RUN })
    }

    @Test
    fun successfulTaskWithMissingFramesPreservesObservedPassesAndMissingRowsNotRun() {
        val registry = loadRegistry()
        val events =
            listOf(
                FixtureEvent(runId, "github.pagination", FixtureEventType.START),
                FixtureEvent(runId, "github.pagination", FixtureEventType.PASS),
            ).joinToString("\n") { framePrefix + eventJson.encodeToString(FixtureEvent.serializer(), it) }

        val bundle =
            ParityProducerResolver.resolve(
                producerName = "github-corpus",
                subject = "github",
                task = ":conformance:github:consumer:test",
                runId = runId,
                registry = registry,
                repositoryRoot = repositoryRoot,
                taskFailed = false,
                framedEventsInput = events,
            )

        assertEquals(ExecutionStatus.FAILED, bundle.execution.status)
        assertEquals(listOf("github.pagination"), bundle.execution.passedFixtureIds)

        val paginationRow = bundle.rows.single { it.id == "github.behavior.pagination" }
        assertEquals(ParityStatus.PASSED, paginationRow.status)
        assertNull(paginationRow.reason)

        val missingRow = bundle.rows.single { it.id == "github.behavior.auth" }
        assertEquals(ParityStatus.NOT_RUN, missingRow.status)
        assertTrue(missingRow.reason!!.contains("missing"))
    }

    @Test
    fun optionalNonJvmFixtureCanBeExplicitlyExcludedWithoutMaskingRequiredCoverage() {
        val bundle =
            ParityProducerResolver.resolve(
                producerName = "github-corpus",
                subject = "github",
                task = ":conformance:github:consumer:test",
                runId = runId,
                registry = loadRegistry(),
                repositoryRoot = repositoryRoot,
                taskFailed = false,
                framedEventsInput = allPassingEvents(runId),
                matrix = setOf(MatrixType.BEHAVIOR, MatrixType.COMPILE, MatrixType.SOURCE_INVARIANT),
                excludedFixtureIds = setOf("github.compile-non-jvm"),
            )

        assertEquals(ExecutionStatus.PASSED, bundle.execution.status)
        val excluded = bundle.rows.single { it.id == "github.compile.non-jvm" }
        assertEquals(ParityStatus.NOT_RUN, excluded.status)
        assertEquals("Optional fixture was explicitly excluded from this run.", excluded.reason)
    }

    @Test
    fun stripeOptionalNonJvmFixtureIsExplicitlyExcludedFromJvmOnlyEvidence() {
        val fixtureIds =
            setOf(
                "stripe.auth-typed-errors",
                "stripe.compile-jvm",
                "stripe.compile-non-jvm",
                "stripe.form",
                "stripe.multipart",
                "stripe.source-portable",
            )
        val events =
            (fixtureIds - "stripe.compile-non-jvm")
                .sorted()
                .flatMap { fixtureId ->
                    listOf(
                        FixtureEvent(runId, fixtureId, FixtureEventType.START),
                        FixtureEvent(runId, fixtureId, FixtureEventType.PASS),
                    )
                }.joinToString("\n") { framePrefix + eventJson.encodeToString(FixtureEvent.serializer(), it) }

        val bundle =
            ParityProducerResolver.resolve(
                producerName = "stripe-corpus",
                subject = "stripe",
                task = ":conformance:stripe:consumer:jvmTest",
                runId = runId,
                registry = loadRegistry(),
                repositoryRoot = repositoryRoot,
                taskFailed = false,
                framedEventsInput = events,
                inputPaths = ProducerInputPaths.stripe(repositoryRoot),
                matrix = setOf(MatrixType.BEHAVIOR, MatrixType.COMPILE, MatrixType.SOURCE_INVARIANT),
                fixtureIds = fixtureIds,
                excludedFixtureIds = setOf("stripe.compile-non-jvm"),
            )

        assertEquals(ExecutionStatus.PASSED, bundle.execution.status)
        assertEquals(5, bundle.rows.count { it.status == ParityStatus.PASSED })
        val excluded = bundle.rows.single { it.id == "stripe.compile.non-jvm" }
        assertEquals(ParityStatus.NOT_RUN, excluded.status)
        assertEquals("Optional fixture was explicitly excluded from this run.", excluded.reason)
    }

    @Test
    fun stripeProducerCliPassesOptionalExclusionThroughToEvidence() {
        val fixtureIds =
            listOf(
                "stripe.auth-typed-errors",
                "stripe.compile-jvm",
                "stripe.form",
                "stripe.multipart",
                "stripe.source-portable",
            )
        val temporaryDirectory = createTempDirectory("stripe-producer-cli").toFile()
        val events = File(temporaryDirectory, "events.txt")
        val output = File(temporaryDirectory, "evidence.json")
        events.writeText(
            fixtureIds
                .flatMap { fixtureId ->
                    listOf(
                        FixtureEvent(runId, fixtureId, FixtureEventType.START),
                        FixtureEvent(runId, fixtureId, FixtureEventType.PASS),
                    )
                }.joinToString("\n") { framePrefix + eventJson.encodeToString(FixtureEvent.serializer(), it) },
        )

        StripeParityProducerCli.main(
            arrayOf(
                repositoryRoot.absolutePath,
                File(repositoryRoot, "conformance/parity/registry/parity-rows.json").absolutePath,
                "stripe-corpus",
                "stripe",
                ":conformance:stripe:consumer:jvmTest",
                runId,
                "passed",
                events.absolutePath,
                output.absolutePath,
                File(repositoryRoot, "conformance/stripe/openapi.json").absolutePath,
                File(repositoryRoot, "conformance/stripe/sdkgen.yaml").absolutePath,
                File(repositoryRoot, "conformance/stripe/sdkgen.lock").absolutePath,
                "-",
                File(repositoryRoot, "gradle/libs.versions.toml").absolutePath,
                File(repositoryRoot, "conformance/stripe/generated").absolutePath,
                "",
                "stripe.compile-non-jvm",
            ),
        )

        val bundle = EvidenceLoader.loadEvidence(output).bundle
        assertEquals(ExecutionStatus.PASSED, bundle.execution.status)
        assertEquals(5, bundle.rows.count { it.status == ParityStatus.PASSED })
        val excluded = bundle.rows.single { it.id == "stripe.compile.non-jvm" }
        assertEquals(ParityStatus.NOT_RUN, excluded.status)
        assertEquals("Optional fixture was explicitly excluded from this run.", excluded.reason)
    }

    @Test
    fun optionalExclusionDoesNotMaskAnObservedFailure() {
        val fixtureIds =
            setOf(
                "stripe.auth-typed-errors",
                "stripe.compile-jvm",
                "stripe.compile-non-jvm",
                "stripe.form",
                "stripe.multipart",
                "stripe.source-portable",
            )
        val events =
            fixtureIds
                .sorted()
                .flatMap { fixtureId ->
                    listOf(
                        FixtureEvent(runId, fixtureId, FixtureEventType.START),
                        if (fixtureId == "stripe.compile-non-jvm") {
                            FixtureEvent(runId, fixtureId, FixtureEventType.FAIL, "Unexpected non-JVM failure")
                        } else {
                            FixtureEvent(runId, fixtureId, FixtureEventType.PASS)
                        },
                    )
                }.joinToString("\n") { framePrefix + eventJson.encodeToString(FixtureEvent.serializer(), it) }

        val bundle =
            ParityProducerResolver.resolve(
                producerName = "stripe-corpus",
                subject = "stripe",
                task = ":conformance:stripe:consumer:jvmTest",
                runId = runId,
                registry = loadRegistry(),
                repositoryRoot = repositoryRoot,
                taskFailed = false,
                framedEventsInput = events,
                inputPaths = ProducerInputPaths.stripe(repositoryRoot),
                matrix = setOf(MatrixType.BEHAVIOR, MatrixType.COMPILE, MatrixType.SOURCE_INVARIANT),
                fixtureIds = fixtureIds,
                excludedFixtureIds = setOf("stripe.compile-non-jvm"),
            )

        assertEquals(ExecutionStatus.FAILED, bundle.execution.status)
        val observed = bundle.rows.single { it.id == "stripe.compile.non-jvm" }
        assertEquals(ParityStatus.FAILED, observed.status)
        assertEquals("Unexpected non-JVM failure", observed.reason)
    }

    @Test
    fun malformedOrMismatchedRunFramesSynthesizeConservativeEvidenceWithoutEscaping() {
        val registry = loadRegistry()
        val badRunId = "stale-run-999"
        val events =
            listOf(
                FixtureEvent(badRunId, "github.pagination", FixtureEventType.START),
                FixtureEvent(badRunId, "github.pagination", FixtureEventType.PASS),
            ).joinToString("\n") { framePrefix + eventJson.encodeToString(FixtureEvent.serializer(), it) }

        val bundle =
            ParityProducerResolver.resolve(
                producerName = "github-corpus",
                subject = "github",
                task = ":conformance:github:consumer:test",
                runId = runId,
                registry = registry,
                repositoryRoot = repositoryRoot,
                taskFailed = false,
                framedEventsInput = events,
            )

        assertEquals(ExecutionStatus.FAILED, bundle.execution.status)
        assertTrue(bundle.rows.all { it.status == ParityStatus.NOT_RUN })
    }

    @Test
    fun invalidRunIdAndEveryMissingProvenanceInputFailClosed() {
        val invalidRun =
            resolve(
                currentRunId = "invalid run id",
                events = allPassingEvents(runId),
            )
        assertEquals(ExecutionStatus.FAILED, invalidRun.execution.status)
        assertTrue(invalidRun.rows.all { it.status == ParityStatus.NOT_RUN })

        val paths = ProducerInputPaths.github(repositoryRoot)
        val missing = repositoryRoot.resolve("conformance/parity/build/does-not-exist")
        val variants =
            listOf(
                paths.copy(corpus = missing),
                paths.copy(config = missing),
                paths.copy(lock = missing),
                paths.copy(overlay = missing),
                paths.copy(toolchain = missing),
                paths.copy(generatedDirectory = missing),
            )
        variants.forEach { variant ->
            val bundle =
                resolve(
                    currentRunId = runId,
                    events = allPassingEvents(runId),
                    inputPaths = variant,
                )
            assertEquals(ExecutionStatus.FAILED, bundle.execution.status)
            assertTrue(bundle.execution.passedFixtureIds.isEmpty())
            assertTrue(bundle.rows.all { it.status == ParityStatus.FAILED })
        }
    }

    @Test
    fun explicitFixtureSelectionRestrictsProducerRowsAndRejectsUnknownFixtures() {
        val fixtureIds =
            setOf(
                "stripe.auth-typed-errors",
                "stripe.compile-jvm",
                "stripe.form",
                "stripe.multipart",
                "stripe.source-portable",
            )
        val selected =
            ParityProducerResolver.resolve(
                producerName = "stripe-corpus",
                subject = "stripe",
                task = ":conformance:stripe:consumer:jvmTest",
                matrix = setOf(MatrixType.BEHAVIOR, MatrixType.COMPILE, MatrixType.SOURCE_INVARIANT),
                fixtureIds = fixtureIds,
                runId = runId,
                registry = loadRegistry(),
                repositoryRoot = repositoryRoot,
                taskFailed = true,
                taskFailureReason = "Selection-only fixture.",
                framedEventsInput = "",
                inputPaths = ProducerInputPaths.stripe(repositoryRoot),
            )

        assertEquals(fixtureIds.sorted(), selected.execution.requestedFixtureIds)
        assertEquals(5, selected.rows.size)
        assertTrue(selected.rows.all { row -> row.status == ParityStatus.NOT_RUN })
        assertNull(ProducerInputPaths.stripe(repositoryRoot).overlay)

        assertFailsWith<IllegalArgumentException> {
            ParityProducerResolver.resolve(
                producerName = "stripe-corpus",
                subject = "stripe",
                task = ":conformance:stripe:consumer:jvmTest",
                matrix = setOf(MatrixType.BEHAVIOR, MatrixType.COMPILE, MatrixType.SOURCE_INVARIANT),
                fixtureIds = fixtureIds + "stripe.unknown",
                runId = runId,
                registry = loadRegistry(),
                repositoryRoot = repositoryRoot,
                taskFailed = true,
                framedEventsInput = "",
                inputPaths = ProducerInputPaths.stripe(repositoryRoot),
            )
        }
    }

    @Test
    fun commitBindingRejectsDirtyTrackedAndUntrackedInputs() {
        val root = createTempDirectory("sdkgen-parity-git-").toFile()
        git(root, "init")
        git(root, "config", "user.email", "parity@example.invalid")
        git(root, "config", "user.name", "Parity Test")
        val tracked = root.resolve("tracked.txt").also { file -> file.writeText("committed\n") }
        git(root, "add", "tracked.txt")
        git(root, "commit", "-m", "fixture")

        assertTrue(ParityRegistry.currentCommitSha(root).matches(Regex("[0-9a-f]{40}")))

        tracked.writeText("dirty\n")
        val trackedFailure = assertFailsWith<IllegalArgumentException> { ParityRegistry.currentCommitSha(root) }
        assertTrue(trackedFailure.message!!.contains("clean worktree"))

        tracked.writeText("committed\n")
        root.resolve("untracked.txt").writeText("untracked\n")
        val untrackedFailure = assertFailsWith<IllegalArgumentException> { ParityRegistry.currentCommitSha(root) }
        assertTrue(untrackedFailure.message!!.contains("clean worktree"))
    }

    @Test
    fun runIdValidatesInputsButNeverChangesCanonicalEvidence() {
        val first = resolve("run-one", allPassingEvents("run-one"))
        val second = resolve("run-two", allPassingEvents("run-two"))
        assertEquals(
            CanonicalEvidenceWriter.renderCanonicalEvidence(first),
            CanonicalEvidenceWriter.renderCanonicalEvidence(second),
        )
        assertTrue(!CanonicalEvidenceWriter.renderCanonicalEvidence(first).contains("run-one"))
    }

    @Test
    fun producerCliAtomicallyReplacesOldEvidenceForMalformedStream() {
        val events = File.createTempFile("parity-events", ".txt")
        val output = File.createTempFile("parity-evidence", ".json")
        events.writeText(framePrefix + "{malformed")
        output.writeText("stale evidence")

        produce(
            arrayOf(
                repositoryRoot.absolutePath,
                File(repositoryRoot, "conformance/parity/registry/parity-rows.json").absolutePath,
                "github-corpus",
                "github",
                ":conformance:github:consumer:test",
                runId,
                "passed",
                events.absolutePath,
                output.absolutePath,
                File(repositoryRoot, "conformance/github/openapi.yaml").absolutePath,
                File(repositoryRoot, "conformance/github/sdkgen.yaml").absolutePath,
                File(repositoryRoot, "conformance/github/sdkgen.lock").absolutePath,
                File(
                    repositoryRoot,
                    "conformance/github/overlays/code-search-runtime-semantics.yaml",
                ).absolutePath,
                File(repositoryRoot, "gradle/libs.versions.toml").absolutePath,
                File(repositoryRoot, "conformance/github/generated").absolutePath,
            ),
        )

        val loaded = EvidenceLoader.loadEvidence(output)
        assertEquals(ExecutionStatus.FAILED, loaded.bundle.execution.status)
        assertTrue(loaded.bundle.rows.all { it.status == ParityStatus.NOT_RUN })
        assertTrue(output.readText() != "stale evidence")
    }

    @Test
    fun openRouterProducerOwnsBehaviorCompileAndSourceRowsWithManifestBoundInventory() {
        val fixtureIds =
            listOf(
                "openrouter.auth",
                "openrouter.compile-jvm",
                "openrouter.compile-representative-kmp",
                "openrouter.model-contracts",
                "openrouter.source-portable",
                "openrouter.typed-errors",
            )
        val events =
            fixtureIds
                .flatMap { fixtureId ->
                    listOf(
                        FixtureEvent(runId, fixtureId, FixtureEventType.START),
                        FixtureEvent(runId, fixtureId, FixtureEventType.PASS),
                    )
                }.joinToString("\n") { framePrefix + eventJson.encodeToString(FixtureEvent.serializer(), it) }

        val bundle =
            ParityProducerResolver.resolve(
                producerName = "openrouter-corpus",
                subject = "openrouter",
                task = ":conformance:openrouter:consumer:jvmTest",
                runId = runId,
                registry = loadRegistry(),
                repositoryRoot = repositoryRoot,
                taskFailed = false,
                framedEventsInput = events,
                inputPaths = ProducerInputPaths.openRouter(repositoryRoot),
                matrix = setOf(MatrixType.BEHAVIOR, MatrixType.COMPILE, MatrixType.SOURCE_INVARIANT),
                fixtureIds = fixtureIds.toSet(),
            )

        assertEquals(ExecutionStatus.PASSED, bundle.execution.status)
        assertEquals(fixtureIds, bundle.execution.passedFixtureIds)
        assertEquals(6, bundle.rows.size)
        assertTrue(bundle.rows.all { it.status == ParityStatus.PASSED })
        assertTrue(bundle.rows.all { it.generatedArtifactSha256?.isSha256() == true })
        assertTrue(bundle.rows.all { it.manifestSha256?.isSha256() == true })
        assertTrue(bundle.rows.all { it.configDigest == ParityRegistry.OPENROUTER_EFFECTIVE_CONFIG_SHA256 })
        assertTrue(bundle.rows.all { it.lockFileSha256 == ParityRegistry.OPENROUTER_LOCK_FILE_SHA256 })
        assertTrue(bundle.rows.all { it.configFileSha256 == ParityRegistry.OPENROUTER_CONFIG_FILE_SHA256 })
        assertTrue(bundle.rows.all { it.overlaySha256 == ParityRegistry.OPENROUTER_OVERLAY_SHA256 })
    }

    private fun resolve(
        currentRunId: String,
        events: String,
        inputPaths: ProducerInputPaths = ProducerInputPaths.github(repositoryRoot),
    ): EvidenceBundle =
        ParityProducerResolver.resolve(
            producerName = "github-corpus",
            subject = "github",
            task = ":conformance:github:consumer:test",
            runId = currentRunId,
            registry = loadRegistry(),
            repositoryRoot = repositoryRoot,
            taskFailed = false,
            framedEventsInput = events,
            inputPaths = inputPaths,
            matrix = setOf(MatrixType.BEHAVIOR, MatrixType.COMPILE, MatrixType.SOURCE_INVARIANT),
            excludedFixtureIds = setOf("github.compile-non-jvm"),
        )

    private fun allPassingEvents(eventRunId: String): String =
        listOf(
            "github.pagination",
            "github.auth",
            "github.typed-errors",
            "github.optionality",
            "github.unions",
            "github.compile-jvm",
            "github.source-portable",
        ).flatMap { fixtureId ->
            listOf(
                FixtureEvent(eventRunId, fixtureId, FixtureEventType.START),
                FixtureEvent(eventRunId, fixtureId, FixtureEventType.PASS),
            )
        }.joinToString("\n") { framePrefix + eventJson.encodeToString(FixtureEvent.serializer(), it) }

    private fun loadRegistry(): LoadedRegistry =
        EvidenceLoader.loadRegistry(File(repositoryRoot, "conformance/parity/registry/parity-rows.json"))

    private fun git(
        root: File,
        vararg arguments: String,
    ): String {
        val process =
            ProcessBuilder(listOf("git") + arguments)
                .directory(root)
                .redirectErrorStream(true)
                .start()
        val output =
            process.inputStream
                .bufferedReader()
                .readText()
                .trim()
        require(process.waitFor() == 0) { "git ${arguments.joinToString(" ")} failed: $output" }
        return output
    }

    private val repositoryRoot: File
        get() = File(System.getProperty("parity.repositoryRoot") ?: ".")

    private val eventJson = Json
    private val framePrefix = "SDKGEN_PARITY_EVENT "
}
