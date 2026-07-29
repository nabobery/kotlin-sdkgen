package com.nabobery.sdkgen.conformance.parity

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File
import java.nio.file.Files
import java.nio.file.LinkOption
import java.nio.file.Path
import java.security.MessageDigest

/** SHA-256 of the explicit `sdkgen:absent-overlay:v1` provenance marker. */
internal const val ABSENT_OVERLAY_SHA256: String =
    "902717612e19ad7f6927d03e352fe98fc20c092717f030831eb6ad1d59b99668"

internal data class ProducerInputPaths(
    val corpus: File,
    val config: File?,
    val lock: File?,
    val overlay: File?,
    val toolchain: File,
    val generatedDirectory: File,
    val absentOverlaySha256: String? = null,
) {
    companion object {
        fun github(repositoryRoot: File): ProducerInputPaths =
            ProducerInputPaths(
                corpus = repositoryRoot.resolve("conformance/github/openapi.yaml"),
                config = repositoryRoot.resolve("conformance/github/sdkgen.yaml"),
                lock = repositoryRoot.resolve("conformance/github/sdkgen.lock"),
                overlay = repositoryRoot.resolve("conformance/github/overlays/code-search-runtime-semantics.yaml"),
                toolchain = repositoryRoot.resolve("gradle/libs.versions.toml"),
                generatedDirectory = repositoryRoot.resolve("conformance/github/generated"),
            )

        fun stripe(repositoryRoot: File): ProducerInputPaths =
            ProducerInputPaths(
                corpus = repositoryRoot.resolve("conformance/stripe/openapi.json"),
                config = repositoryRoot.resolve("conformance/stripe/sdkgen.yaml"),
                lock = repositoryRoot.resolve("conformance/stripe/sdkgen.lock"),
                overlay = null,
                toolchain = repositoryRoot.resolve("gradle/libs.versions.toml"),
                generatedDirectory = repositoryRoot.resolve("conformance/stripe/generated"),
            )

        fun openRouter(repositoryRoot: File): ProducerInputPaths =
            ProducerInputPaths(
                corpus = repositoryRoot.resolve("conformance/openrouter/openapi.yaml"),
                config = null,
                lock = null,
                overlay = repositoryRoot.resolve("conformance/openrouter/overlays/full-spec-compat.yaml"),
                toolchain = repositoryRoot.resolve("gradle/libs.versions.toml"),
                generatedDirectory =
                    repositoryRoot.resolve(
                        "conformance/openrouter/consumer/src/commonMain/kotlin/com/nabobery/sdkgen/generated",
                    ),
            )
    }
}

internal data class ProducerProvenance(
    val commitSha: String,
    val toolchainSha256: String,
    val corpusSha256: String,
    val configDigest: String?,
    val configFileSha256: String?,
    val lockFileSha256: String?,
    val overlaySha256: String?,
    val generatedArtifactSha256: String,
    val manifestSha256: String,
)

internal object ParityProducerResolver {
    private val validRunId = Regex("[A-Za-z0-9][A-Za-z0-9._:-]{0,127}")

    fun resolve(
        producerName: String,
        subject: String,
        task: String,
        matrix: Set<MatrixType> = setOf(MatrixType.BEHAVIOR),
        fixtureIds: Set<String>? = null,
        runId: String,
        registry: LoadedRegistry,
        repositoryRoot: File,
        taskFailed: Boolean,
        framedEventsInput: String,
        taskFailureReason: String? = null,
        inputPaths: ProducerInputPaths = ProducerInputPaths.github(repositoryRoot),
        excludedFixtureIds: Set<String> = emptySet(),
    ): EvidenceBundle {
        val definitions =
            registry.bundle.rows
                .filter { it.subject == subject && matrix.contains(it.matrix) }
                .filter { it.id in registry.bundle.producers[producerName].orEmpty() }
                .filter { fixtureIds == null || it.fixtureId in fixtureIds }
                .sortedBy { it.id }
        require(definitions.isNotEmpty()) { "Producer '$producerName' owns no selected matrix rows for '$subject'" }
        if (fixtureIds != null) {
            require(definitions.mapTo(mutableSetOf()) { it.fixtureId } == fixtureIds) {
                "Producer '$producerName' fixture selection is unknown, unowned, or outside the selected matrices"
            }
        }
        val requestedIds = definitions.map { it.fixtureId }.sorted()
        require(excludedFixtureIds.all { it in requestedIds }) {
            "Producer '$producerName' excludes an unrequested fixture"
        }
        require(
            definitions
                .filter { it.fixtureId in excludedFixtureIds }
                .all { it.requiredness == Requiredness.OPTIONAL },
        ) {
            "Producer '$producerName' may explicitly exclude only optional fixtures"
        }

        if (!validRunId.matches(runId)) {
            return failedAttemptBundle(
                producerName,
                task,
                requestedIds,
                definitions,
                "Fixture stream run id is missing or invalid.",
            )
        }

        val results =
            try {
                FixtureEventParser.parseFixtureEvents(framedEventsInput, requestedIds.toSet(), runId)
            } catch (_: Exception) {
                return failedAttemptBundle(
                    producerName,
                    task,
                    requestedIds,
                    definitions,
                    "Fixture stream is malformed, stale, or incomplete.",
                )
            }

        if (taskFailed) {
            val reason = taskFailureReason?.takeIf(String::isNotBlank) ?: "Producer test task failed."
            val started = results.keys.sorted()
            return EvidenceBundle(
                schemaVersion = "v1alpha1",
                kind = EvidenceKind.PRODUCER,
                producer = producerName,
                execution =
                    ExecutionEnvelope(
                        task = task,
                        status = ExecutionStatus.FAILED,
                        requestedFixtureIds = requestedIds,
                        startedFixtureIds = started,
                        failedFixtureIds = started,
                        reason = reason,
                    ),
                rows =
                    definitions.map { definition ->
                        val observed = results[definition.fixtureId]
                        ProducerEvidenceRow(
                            id = definition.id,
                            status = if (observed == null) ParityStatus.NOT_RUN else ParityStatus.FAILED,
                            reason =
                                when {
                                    observed?.status == ParityStatus.FAILED -> observed.reason
                                    else -> reason
                                },
                        )
                    },
            )
        }

        val passedIds = results.filterValues { it.status == ParityStatus.PASSED }.keys.sorted()
        val failedIds = results.filterValues { it.status == ParityStatus.FAILED }.keys.sorted()
        val missingIds = (requestedIds - results.keys).sorted()
        val unexpectedMissingIds = (missingIds - excludedFixtureIds).sorted()
        val missingRequiredIds =
            definitions
                .filter { it.requiredness == Requiredness.REQUIRED }
                .map { it.fixtureId }
                .filterNot { it in results.keys }
        val executionFailure =
            when {
                failedIds.isNotEmpty() -> "One or more fixtures failed."
                missingRequiredIds.isNotEmpty() -> "Successful task output omitted one or more required fixtures."
                unexpectedMissingIds.isNotEmpty() -> "Successful task output is missing undeclared fixture frames."
                else -> null
            }
        val hasExecutionFailure = failedIds.isNotEmpty() || unexpectedMissingIds.isNotEmpty()

        val provenance =
            if (passedIds.isNotEmpty()) {
                try {
                    ProducerProvenanceResolver
                        .resolve(repositoryRoot, inputPaths)
                        .also { it.validateExpected(subject) }
                } catch (_: Exception) {
                    return provenanceFailureBundle(producerName, task, requestedIds, definitions)
                }
            } else {
                null
            }

        return EvidenceBundle(
            schemaVersion = "v1alpha1",
            kind = EvidenceKind.PRODUCER,
            producer = producerName,
            execution =
                ExecutionEnvelope(
                    task = task,
                    status = if (hasExecutionFailure) ExecutionStatus.FAILED else ExecutionStatus.PASSED,
                    requestedFixtureIds = requestedIds,
                    startedFixtureIds = results.keys.sorted(),
                    passedFixtureIds = passedIds,
                    failedFixtureIds = failedIds,
                    reason = executionFailure,
                ),
            rows =
                definitions.map { definition ->
                    when (val result = results[definition.fixtureId]) {
                        null -> {
                            ProducerEvidenceRow(
                                id = definition.id,
                                status = ParityStatus.NOT_RUN,
                                reason =
                                    if (definition.fixtureId in excludedFixtureIds) {
                                        "Optional fixture was explicitly excluded from this run."
                                    } else {
                                        "Fixture frame is missing from successful task output."
                                    },
                            )
                        }

                        else -> {
                            result.toEvidenceRow(definition.id, provenance)
                        }
                    }
                },
        )
    }

    /**
     * The producer was invoked but could not produce a trustworthy event stream.  Rows have
     * no observed result, so they remain [ParityStatus.NOT_RUN]; the enclosing execution is
     * nevertheless failed.  This distinction is important to callers deciding whether a run
     * needs to be retried versus never having been attempted.
     */
    private fun failedAttemptBundle(
        producerName: String,
        task: String,
        requestedIds: List<String>,
        definitions: List<ParityRowDefinition>,
        reason: String,
    ): EvidenceBundle =
        EvidenceBundle(
            schemaVersion = "v1alpha1",
            kind = EvidenceKind.PRODUCER,
            producer = producerName,
            execution =
                ExecutionEnvelope(
                    task = task,
                    status = ExecutionStatus.FAILED,
                    requestedFixtureIds = requestedIds,
                    reason = reason,
                ),
            rows =
                definitions.map {
                    ProducerEvidenceRow(id = it.id, status = ParityStatus.NOT_RUN, reason = reason)
                },
        )

    private fun provenanceFailureBundle(
        producerName: String,
        task: String,
        requestedIds: List<String>,
        definitions: List<ParityRowDefinition>,
    ): EvidenceBundle {
        val reason = "Producer provenance validation failed."
        return EvidenceBundle(
            schemaVersion = "v1alpha1",
            kind = EvidenceKind.PRODUCER,
            producer = producerName,
            execution =
                ExecutionEnvelope(
                    task = task,
                    status = ExecutionStatus.FAILED,
                    requestedFixtureIds = requestedIds,
                    startedFixtureIds = requestedIds,
                    failedFixtureIds = requestedIds,
                    reason = reason,
                ),
            rows =
                definitions.map {
                    ProducerEvidenceRow(id = it.id, status = ParityStatus.FAILED, reason = reason)
                },
        )
    }
}

private fun ProducerProvenance.validateExpected(subject: String) {
    require(toolchainSha256 == ParityRegistry.TOOLCHAIN_SHA256) { "Toolchain digest is stale" }
    ParityRegistry.expectedCorpusDigest(subject)?.let { require(corpusSha256 == it) { "Corpus digest is stale" } }
    ParityRegistry.expectedConfigDigest(subject)?.let { require(configDigest == it) { "Config digest is stale" } }
    ParityRegistry.expectedConfigFileDigest(subject)?.let {
        require(configFileSha256 == it) { "Config file digest is stale" }
    }
    ParityRegistry.expectedLockFileDigest(subject)?.let {
        require(lockFileSha256 == it) { "Lock file digest is stale" }
    }
    ParityRegistry.expectedOverlayDigest(subject)?.let { require(overlaySha256 == it) { "Overlay digest is stale" } }
}

private fun FixtureResult.toEvidenceRow(
    rowId: String,
    provenance: ProducerProvenance?,
): ProducerEvidenceRow =
    if (status == ParityStatus.PASSED) {
        requireNotNull(provenance)
        ProducerEvidenceRow(
            id = rowId,
            status = status,
            commitSha = provenance.commitSha,
            toolchainSha256 = provenance.toolchainSha256,
            corpusSha256 = provenance.corpusSha256,
            configDigest = provenance.configDigest,
            configFileSha256 = provenance.configFileSha256,
            lockFileSha256 = provenance.lockFileSha256,
            overlaySha256 = provenance.overlaySha256,
            generatedArtifactSha256 = provenance.generatedArtifactSha256,
            manifestSha256 = provenance.manifestSha256,
        )
    } else {
        ProducerEvidenceRow(id = rowId, status = status, reason = reason)
    }

internal object ProducerProvenanceResolver {
    private val json = Json { ignoreUnknownKeys = true }

    fun resolve(
        repositoryRoot: File,
        paths: ProducerInputPaths,
    ): ProducerProvenance {
        val configBytes = paths.config?.let { requiredBytes(it, "config file") }
        val lockBytes = paths.lock?.let { requiredBytes(it, "lock file") }
        require((configBytes == null) == (lockBytes == null)) {
            "Config and lock inputs must either both be present or both be absent"
        }
        val generatedRoot = safeDirectoryRoot(paths.generatedDirectory, "generated tree", repositoryRoot)
        val generated = generatedTreeProvenance(generatedRoot, lockBytes)
        return ProducerProvenance(
            commitSha = ParityRegistry.currentCommitSha(repositoryRoot),
            toolchainSha256 = requiredBytes(paths.toolchain, "toolchain").sha256(),
            corpusSha256 = requiredBytes(paths.corpus, "corpus").sha256(),
            configDigest = generated.configDigest,
            configFileSha256 = configBytes?.sha256(),
            lockFileSha256 = lockBytes?.sha256(),
            overlaySha256 =
                paths.overlay?.let { requiredBytes(it, "overlay").sha256() }
                    ?: paths.absentOverlaySha256,
            generatedArtifactSha256 = generated.treeSha256,
            manifestSha256 = generated.manifestSha256,
        )
    }

    private fun generatedTreeProvenance(
        generatedRoot: Path,
        lockBytes: ByteArray?,
    ): GeneratedTreeProvenance {
        val manifestFile = generatedRoot.resolve("manifest.json").toFile()
        return if (manifestFile.isFile) {
            val manifestBytes = requiredBytes(manifestFile, "generated manifest")
            val manifest = json.decodeFromString<GeneratedManifest>(manifestBytes.decodeToString())
            val lock =
                requireNotNull(lockBytes) {
                    "A generated manifest with configDigest requires a matching config lock"
                }.let { bytes -> json.decodeFromString<ConfigLock>(bytes.decodeToString()) }
            require(manifest.configDigest == lock.configDigest) {
                "Manifest and lock config digests differ"
            }
            GeneratedTreeProvenance(
                configDigest = manifest.configDigest,
                treeSha256 = generatedTreeDigest(generatedRoot, manifest, manifestBytes),
                manifestSha256 = manifestBytes.sha256(),
            )
        } else {
            require(lockBytes == null) { "A config lock requires a generated manifest" }
            sourceTreeProvenance(generatedRoot)
        }
    }

    private fun generatedTreeDigest(
        root: Path,
        manifest: GeneratedManifest,
        manifestBytes: ByteArray,
    ): String {
        val manifestPaths = manifest.files.map { normalizedRelativePath(it.path) }
        require(manifestPaths == manifestPaths.sorted() && manifestPaths.size == manifestPaths.distinct().size) {
            "Manifest paths must be unique and sorted"
        }

        val actualPaths =
            Files.walk(root).use { stream ->
                stream
                    .filter { it != root }
                    .map { path ->
                        require(!Files.isSymbolicLink(path)) { "Generated tree contains a symbolic link" }
                        path
                    }.filter { Files.isRegularFile(it, LinkOption.NOFOLLOW_LINKS) }
                    .map { root.relativize(it).invariantPath() }
                    .sorted()
                    .toList()
            }
        require(actualPaths == (manifestPaths + "manifest.json").sorted()) {
            "Generated tree file set does not match manifest"
        }

        val digest = MessageDigest.getInstance("SHA-256")
        manifest.files.forEach { entry ->
            val relative = normalizedRelativePath(entry.path)
            val file = root.resolve(relative)
            val bytes = Files.readAllBytes(file)
            require(bytes.sha256() == entry.sha256) { "Generated file digest mismatch for '$relative'" }
            digest.update(relative.encodeToByteArray())
            digest.update(0)
            digest.update(bytes)
            digest.update(0)
        }
        digest.update("manifest.json".encodeToByteArray())
        digest.update(0)
        digest.update(manifestBytes)
        return digest.digest().toHex()
    }

    private fun sourceTreeProvenance(root: Path): GeneratedTreeProvenance {
        val entries =
            Files.walk(root).use { stream ->
                stream
                    .filter { it != root }
                    .map { path ->
                        require(!Files.isSymbolicLink(path)) { "Generated tree contains a symbolic link" }
                        path
                    }.filter { Files.isRegularFile(it, LinkOption.NOFOLLOW_LINKS) }
                    .map { path ->
                        SourceTreeEntry(root.relativize(path).invariantPath(), Files.readAllBytes(path))
                    }.toList()
                    .sortedBy(SourceTreeEntry::path)
            }
        require(entries.isNotEmpty()) { "Generated source tree is empty" }

        val treeDigest = MessageDigest.getInstance("SHA-256")
        val inventory = StringBuilder("sdkgen-source-tree-manifest-v1\n")
        entries.forEach { entry ->
            val fileSha256 = entry.bytes.sha256()
            inventory
                .append(entry.path)
                .append('\t')
                .append(fileSha256)
                .append('\n')
            treeDigest.update(entry.path.encodeToByteArray())
            treeDigest.update(0)
            treeDigest.update(entry.bytes)
            treeDigest.update(0)
        }
        return GeneratedTreeProvenance(
            configDigest = null,
            treeSha256 = treeDigest.digest().toHex(),
            manifestSha256 = inventory.toString().encodeToByteArray().sha256(),
        )
    }

    private fun normalizedRelativePath(value: String): String {
        val path = Path.of(value)
        require(!path.isAbsolute && path.normalize() == path && !value.contains('\\')) {
            "Unsafe generated manifest path '$value'"
        }
        return path.invariantPath()
    }

    private fun requiredBytes(
        file: File,
        label: String,
    ): ByteArray {
        require(file.isFile && !Files.isSymbolicLink(file.toPath())) { "Missing or unsafe $label" }
        return file.readBytes()
    }
}

internal fun safeDirectoryRoot(
    directory: File,
    label: String,
    repositoryRoot: File? = null,
): Path {
    val path = directory.toPath()
    require(Files.exists(path, LinkOption.NOFOLLOW_LINKS)) { "$label is missing" }
    val isSymbolicLink = Files.isSymbolicLink(path)
    val root = path.toRealPath()
    if (isSymbolicLink) {
        val repository =
            requireNotNull(repositoryRoot) {
                "$label is a symbolic link"
            }.toPath()
                .toRealPath()
        require(root.startsWith(repository)) {
            "$label is a symbolic link outside the repository"
        }
    }
    require(Files.isDirectory(root, LinkOption.NOFOLLOW_LINKS)) { "$label is not a directory" }
    return root
}

private data class GeneratedTreeProvenance(
    val configDigest: String?,
    val treeSha256: String,
    val manifestSha256: String,
)

private data class SourceTreeEntry(
    val path: String,
    val bytes: ByteArray,
)

private fun Path.invariantPath(): String = joinToString("/") { it.toString() }

private fun ByteArray.toHex(): String =
    joinToString("") { byte -> (byte.toInt() and 0xff).toString(16).padStart(2, '0') }

@Serializable
private data class GeneratedManifest(
    val configDigest: String,
    val files: List<GeneratedManifestFile>,
)

@Serializable
private data class GeneratedManifestFile(
    val path: String,
    val sha256: String,
)

@Serializable
private data class ConfigLock(
    val configDigest: String,
)
