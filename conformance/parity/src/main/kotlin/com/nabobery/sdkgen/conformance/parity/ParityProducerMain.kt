package com.nabobery.sdkgen.conformance.parity

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.w3c.dom.Document
import java.io.File
import java.nio.charset.StandardCharsets.UTF_8
import java.nio.file.Files
import java.nio.file.LinkOption
import java.nio.file.StandardCopyOption
import javax.xml.XMLConstants
import javax.xml.parsers.DocumentBuilderFactory

/**
 * Produces one deterministic, digest-bound parity evidence artifact.
 *
 * Run identity validates the input event stream but is deliberately excluded from the canonical output.
 */
public object ParityProducerCli {
    @JvmStatic
    public fun main(args: Array<String>): Unit = produce(args)
}

/** Produces one deterministic, digest-bound GitHub producer evidence artifact. */
public object GitHubParityProducerCli {
    @JvmStatic
    public fun main(args: Array<String>) {
        produce(
            args,
            matrices = corpusMatrices(),
            fixtureIds =
                setOf(
                    "github.auth",
                    "github.optionality",
                    "github.pagination",
                    "github.typed-errors",
                    "github.unions",
                    "github.compile-jvm",
                    "github.compile-non-jvm",
                    "github.source-portable",
                ),
        )
    }
}

/** Produces one deterministic, digest-bound Stripe producer evidence artifact. */
public object StripeParityProducerCli {
    @JvmStatic
    public fun main(args: Array<String>) {
        require(args.size in 15..17) {
            "Usage: <repository-root> <registry.json> <producer> <subject> <task> <run-id> " +
                "<passed|failed> <events.txt> <output.json> <corpus> <config> <lock> <overlay-or-dash> <toolchain> " +
                "<generated-directory> [task-failure-reason] [comma-separated-optional-exclusions]"
        }
        val repositoryRoot = File(args[0])
        produce(
            args,
            inputPaths = ProducerInputPaths.stripe(repositoryRoot),
            matrices = corpusMatrices(),
            fixtureIds = stripeFixtureIds(),
        )
    }
}

/** Produces one deterministic, digest-bound OpenRouter producer evidence artifact. */
public object OpenRouterParityProducerCli {
    @JvmStatic
    public fun main(args: Array<String>) {
        val repositoryRoot = File(args.firstOrNull() ?: error("Repository root is required"))
        produce(
            args,
            inputPaths = ProducerInputPaths.openRouter(repositoryRoot),
            matrices = corpusMatrices(),
            fixtureIds =
                setOf(
                    "openrouter.auth",
                    "openrouter.model-contracts",
                    "openrouter.typed-errors",
                    "openrouter.compile-jvm",
                    "openrouter.compile-representative-kmp",
                    "openrouter.source-portable",
                ),
        )
    }
}

private fun corpusMatrices(): Set<MatrixType> =
    setOf(MatrixType.BEHAVIOR, MatrixType.COMPILE, MatrixType.SOURCE_INVARIANT)

private fun stripeFixtureIds(): Set<String> =
    setOf(
        "stripe.auth-typed-errors",
        "stripe.compile-jvm",
        "stripe.compile-non-jvm",
        "stripe.form",
        "stripe.multipart",
        "stripe.source-portable",
    )

/** Records a conservative test-task outcome from the current JUnit XML report directory. */
public object ParityTaskOutcomeCli {
    @JvmStatic
    public fun main(args: Array<String>) {
        require(args.size == 2) { "Usage: <junit-xml-directory> <outcome-file>" }
        val status = runCatching { readJUnitTaskStatus(File(args[0])) }.getOrDefault("failed")
        val output = File(args[1])
        output.parentFile?.mkdirs()
        output.writeText("$status\n")
    }
}

/** Emits a passed fixture lifecycle only after the Gradle task that invokes it has completed its dependencies. */
public object ParityPassedFixtureCli {
    @JvmStatic
    public fun main(args: Array<String>) {
        require(args.size == 3) { "Usage: <run-id> <fixture-id> <output-events-file>" }
        writeFixtureEvents(
            output = File(args[2]),
            runId = args[0],
            fixtureId = args[1],
            failure = null,
        )
    }
}

/** Checks generated Kotlin imports for portable-source violations and records the outcome as a fixture lifecycle. */
public object ParityPortableSourceCli {
    @JvmStatic
    public fun main(args: Array<String>) {
        require(args.size in 4..5) {
            "Usage: <generated-source-directory> <run-id> <fixture-id> <output-events-file> [repository-root]"
        }
        producePortableSourceFixture(
            generatedSourceDirectory = File(args[0]),
            runId = args[1],
            fixtureId = args[2],
            output = File(args[3]),
            repositoryRoot = args.getOrNull(4)?.let(::File),
        )
    }
}

/** Combines the JVM JUnit system output with task-owned fixture event files for one producer invocation. */
public object ParityFixtureEventJoinCli {
    @JvmStatic
    public fun main(args: Array<String>) {
        require(args.size >= 3) { "Usage: <output-events-file> <input-events-or-junit-path>..." }
        val output = File(args[0])
        val combined = args.drop(1).joinToString("\n") { input -> readFixtureEvents(File(input)) }
        writeTextAtomically(output, combined.trimEnd() + "\n")
    }
}

internal fun produce(
    args: Array<String>,
    inputPaths: ProducerInputPaths? = null,
    matrices: Set<MatrixType> = setOf(MatrixType.BEHAVIOR),
    fixtureIds: Set<String>? = null,
) {
    require(args.size in 15..17) {
        "Usage: <repository-root> <registry.json> <producer> <subject> <task> <run-id> " +
            "<passed|failed> <events.txt> <output.json> <corpus> <config> <lock> <overlay-or-dash> <toolchain> " +
            "<generated-directory> [task-failure-reason] [comma-separated-optional-exclusions]"
    }
    val repositoryRoot = File(args[0])
    val registry = EvidenceLoader.loadRegistry(File(args[1]))
    val taskStatusRead = runCatching { readTaskStatus(args[6]) }
    val taskFailed = taskStatusRead.getOrNull() != "passed"
    val eventsFile = File(args[7])
    val eventsRead = runCatching { readFixtureEvents(eventsFile) }
    // A missing or unreadable event stream means that an attempted producer cannot establish
    // any row result.  Preserve the failed execution envelope instead of accidentally
    // presenting it as an unattempted run.
    val effectiveTaskFailed = taskFailed || eventsRead.isFailure
    val failureReason =
        args.getOrNull(15)
            ?: taskStatusRead.exceptionOrNull()?.let { "Producer task outcome is unavailable." }
            ?: eventsRead.exceptionOrNull()?.let { "Fixture event input is unavailable." }
    val bundle =
        ParityProducerResolver.resolve(
            producerName = args[2],
            subject = args[3],
            task = args[4],
            matrix = matrices,
            fixtureIds = fixtureIds,
            runId = args[5],
            registry = registry,
            repositoryRoot = repositoryRoot,
            taskFailed = effectiveTaskFailed,
            taskFailureReason = failureReason,
            framedEventsInput = eventsRead.getOrDefault(""),
            inputPaths =
                inputPaths
                    ?: ProducerInputPaths(
                        corpus = File(args[9]),
                        config = optionalFileArgument(args[10]),
                        lock = optionalFileArgument(args[11]),
                        overlay = optionalFileArgument(args[12]),
                        toolchain = File(args[13]),
                        generatedDirectory = File(args[14]),
                        absentOverlaySha256 = ABSENT_OVERLAY_SHA256.takeIf { args[12] == "-" },
                    ),
            excludedFixtureIds =
                args
                    .getOrNull(16)
                    .orEmpty()
                    .split(',')
                    .filter(String::isNotBlank)
                    .toSet(),
        )
    CanonicalEvidenceWriter.writeEvidenceAndSidecar(bundle, File(args[8]))
}

private fun optionalFileArgument(argument: String): File? = argument.takeUnless { it == "-" }?.let(::File)

internal fun producePortableSourceFixture(
    generatedSourceDirectory: File,
    runId: String,
    fixtureId: String,
    output: File,
    repositoryRoot: File? = null,
) {
    val failure =
        runCatching {
            // A repository root permits the corpus 'generated' snapshot symlink, mirroring provenance policy.
            val root = safeDirectoryRoot(generatedSourceDirectory, "generated source directory", repositoryRoot)
            val violations =
                Files.walk(root).use { paths ->
                    paths
                        .filter { path -> path != root }
                        .map { path ->
                            require(!Files.isSymbolicLink(path)) { "Generated source tree contains a symbolic link" }
                            path
                        }.filter { path -> Files.isRegularFile(path, LinkOption.NOFOLLOW_LINKS) }
                        .filter { path -> path.fileName.toString().endsWith(".kt") }
                        .flatMap { path ->
                            Files
                                .readAllLines(path, UTF_8)
                                .mapIndexedNotNull { index, line ->
                                    forbiddenPortableReference.find(line)?.groupValues?.get(1)?.let { reference ->
                                        "${root.relativize(path).joinToString("/")}:${index + 1}: $reference"
                                    }
                                }.stream()
                        }.sorted()
                        .toList()
                }
            require(violations.isEmpty()) {
                "Generated portable source references forbidden platform APIs: ${violations.joinToString()}"
            }
        }.exceptionOrNull()?.let { exception -> exception.message ?: exception::class.simpleName }
    writeFixtureEvents(output, runId, fixtureId, failure)
}

private val forbiddenPortableReference =
    Regex("(?:^|[^A-Za-z0-9_])((?:java|javax|android|kotlin\\.jvm)(?:\\.[A-Za-z0-9_*]+)+)")

private fun writeFixtureEvents(
    output: File,
    runId: String,
    fixtureId: String,
    failure: String?,
) {
    val events =
        buildList {
            add(FixtureEvent(runId, fixtureId, FixtureEventType.START))
            if (failure == null) {
                add(FixtureEvent(runId, fixtureId, FixtureEventType.PASS))
            } else {
                add(FixtureEvent(runId, fixtureId, FixtureEventType.FAIL, failure))
            }
        }
    val json = Json { explicitNulls = false }
    val text =
        events.joinToString("\n") { event ->
            FixtureEventParser.FRAME_PREFIX + json.encodeToString(event)
        } + "\n"
    writeTextAtomically(output, text)
}

private fun writeTextAtomically(
    output: File,
    text: String,
) {
    output.parentFile?.mkdirs()
    val target = output.toPath()
    val temporary = Files.createTempFile(target.parent, "tmp-${output.name}", ".tmp")
    Files.writeString(temporary, text, UTF_8)
    try {
        Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE)
    } catch (_: Exception) {
        Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING)
    }
}

internal fun readTaskStatus(argument: String): String {
    val status =
        if (argument.startsWith("@")) {
            File(argument.removePrefix("@")).readText().trim()
        } else {
            argument
        }
    require(status == "passed" || status == "failed") { "Task status must be 'passed' or 'failed'" }
    return status
}

internal fun readFixtureEvents(input: File): String =
    if (input.isDirectory) {
        input
            .walkTopDown()
            .filter { file -> file.isFile && file.extension == "xml" }
            .sortedBy { file -> file.relativeTo(input).invariantSeparatorsPath }
            .flatMap(::junitSystemOut)
            .joinToString("\n")
    } else {
        input.readText()
    }

internal fun readJUnitTaskStatus(input: File): String {
    val xmlFiles = junitXmlFiles(input)
    require(xmlFiles.isNotEmpty()) { "JUnit XML report is missing" }
    val failed =
        xmlFiles.any { file ->
            val suite = secureJUnitDocument(file).documentElement
            require(suite.tagName == "testsuite") { "JUnit XML root must be <testsuite>" }
            junitCount(suite.getAttribute("failures"), "failures") > 0 ||
                junitCount(suite.getAttribute("errors"), "errors") > 0
        }
    return if (failed) "failed" else "passed"
}

private fun junitCount(
    rawValue: String,
    attribute: String,
): Int =
    requireNotNull(rawValue.toIntOrNull()?.takeIf { value -> value >= 0 }) {
        "JUnit XML $attribute must be a non-negative integer"
    }

private fun junitXmlFiles(input: File): List<File> =
    input
        .walkTopDown()
        .filter { file -> file.isFile && file.extension == "xml" }
        .sortedBy { file -> file.relativeTo(input).invariantSeparatorsPath }
        .toList()

private fun junitSystemOut(file: File): List<String> {
    val nodes = secureJUnitDocument(file).getElementsByTagName("system-out")
    return (0 until nodes.length).map { index -> nodes.item(index).textContent }
}

internal fun secureJUnitDocument(file: File): Document {
    val factory =
        DocumentBuilderFactory.newInstance().apply {
            setFeature("http://apache.org/xml/features/disallow-doctype-decl", true)
            setFeature("http://xml.org/sax/features/external-general-entities", false)
            setFeature("http://xml.org/sax/features/external-parameter-entities", false)
            setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false)
            setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "")
            setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "")
            isXIncludeAware = false
            isExpandEntityReferences = false
        }
    return factory.newDocumentBuilder().parse(file)
}
