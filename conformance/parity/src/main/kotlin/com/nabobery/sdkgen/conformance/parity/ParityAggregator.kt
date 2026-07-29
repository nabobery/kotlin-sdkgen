package com.nabobery.sdkgen.conformance.parity

import kotlinx.serialization.json.Json
import java.io.File
import java.security.MessageDigest

internal object EvidenceLoader {
    private val json =
        Json {
            ignoreUnknownKeys = false
            explicitNulls = false
        }

    fun loadEvidence(evidenceFile: File): LoadedEvidence {
        val verified = verifyDigest(evidenceFile)
        val bundle = json.decodeFromString<EvidenceBundle>(verified)
        validateSchema(evidenceFile, bundle.schemaVersion)
        require(bundle.producer.isNotBlank()) { "Evidence producer is blank in ${evidenceFile.name}" }
        bundle.execution.validate(bundle.producer)
        if (bundle.kind == EvidenceKind.ASSESSMENT) {
            require(bundle.producer == "parity-assessment") {
                "Assessment bundle has unexpected producer '${bundle.producer}'"
            }
            require(bundle.execution.status == ExecutionStatus.NOT_RUN) {
                "Assessment bundle must describe a not-run execution"
            }
            require(bundle.rows.all { it.status == ParityStatus.NOT_RUN }) {
                "Assessment bundle may contain only notRun rows"
            }
        }
        return LoadedEvidence(bundle, evidenceFile.readBytes().sha256())
    }

    fun loadPolicy(policyFile: File): LoadedPolicy {
        val verified = verifyDigest(policyFile)
        val bundle = json.decodeFromString<PolicyBundle>(verified)
        validateSchema(policyFile, bundle.schemaVersion)
        require(bundle.producer.isNotBlank()) { "Policy producer is blank in ${policyFile.name}" }
        return LoadedPolicy(bundle, policyFile.readBytes().sha256())
    }

    fun loadRegistry(registryFile: File): LoadedRegistry {
        val verified = verifyDigest(registryFile)
        val bundle = json.decodeFromString<RegistryBundle>(verified)
        validateSchema(registryFile, bundle.schemaVersion)
        return LoadedRegistry(bundle, registryFile.readBytes().sha256())
    }

    private fun verifyDigest(file: File): String {
        require(file.isFile) { "Evidence file does not exist: ${file.name}" }
        val sidecar = File(file.parentFile, "${file.name}.sha256")
        require(sidecar.isFile) { "Evidence digest sidecar does not exist: ${sidecar.name}" }
        val expected = sidecar.readText().trim()
        require(expected.isSha256()) { "Evidence digest sidecar is not SHA-256: ${sidecar.name}" }
        val bytes = file.readBytes()
        val actual = bytes.sha256()
        require(actual == expected) {
            "Evidence digest mismatch for ${file.name}: expected $expected, actual $actual"
        }
        return bytes.decodeToString()
    }

    private fun validateSchema(
        file: File,
        schemaVersion: String,
    ) {
        require(schemaVersion == "v1alpha1") {
            "Unsupported evidence schema '$schemaVersion' in ${file.name}"
        }
    }
}

internal object ParityAggregator {
    fun aggregate(
        evidence: List<LoadedEvidence>,
        registry: LoadedRegistry,
        policy: LoadedPolicy,
        inputErrors: List<String> = emptyList(),
        expectedPassedCommitSha: String? = null,
    ): ParityReport {
        val rowsById = parseRegistry(registry)
        val producerById = parseProducerOwnership(registry, rowsById.keys)
        val policyById = parsePolicy(policy, rowsById.keys.toSet())
        val evidences = parseEvidenceRows(evidence, rowsById, producerById)
        val coverageErrors = missingCoverageErrors(rowsById, policyById.keys, evidences.keys)

        val merged =
            rowsById.values
                .map { row ->
                    when {
                        policyById.containsKey(row.id) -> {
                            policyToParityRow(
                                row,
                                policyById.getValue(row.id),
                                policy.bundle.producer,
                                policy.sha256,
                            )
                        }

                        evidences.containsKey(row.id) -> {
                            val loadedEvidence = evidences.getValue(row.id)
                            evidenceToParityRow(row, loadedEvidence)
                        }

                        else -> {
                            synthesizeMissingArtifact(row)
                        }
                    }
                }.toList()

        val aggregateInputErrors = (inputErrors + coverageErrors).distinct().sorted()
        val gate = ParityGate.validateRows(merged, aggregateInputErrors, expectedPassedCommitSha)
        val matrices =
            MatrixType.entries.map { type ->
                ParityMatrix(type, merged.filter { it.matrix == type })
            }
        val waivers =
            merged
                .filter { it.status == ParityStatus.WAIVED }
                .map { row ->
                    WaiverEntry(
                        id = row.id,
                        subject = row.subject,
                        target = row.target,
                        owner = row.waiverOwner.orEmpty(),
                        rationale = row.reason.orEmpty(),
                        disposition1_0 = row.disposition1_0.orEmpty(),
                    )
                }
        return ParityReport(
            inputErrors = aggregateInputErrors,
            matrices = matrices,
            waiverLedger = waivers,
            summary =
                ParitySummary(
                    totalRows = merged.size,
                    passedRows = merged.count { it.status == ParityStatus.PASSED },
                    failedRows = merged.count { it.status == ParityStatus.FAILED },
                    waivedRows = merged.count { it.status == ParityStatus.WAIVED },
                    notApplicableRows = merged.count { it.status == ParityStatus.NOT_APPLICABLE },
                    notRunRows = merged.count { it.status == ParityStatus.NOT_RUN },
                    gateStatus = if (gate.passed) ParityStatus.PASSED else ParityStatus.FAILED,
                ),
        )
    }

    private fun parseRegistry(registry: LoadedRegistry): LinkedHashMap<String, ParityRowDefinition> {
        val rowsById = LinkedHashMap<String, ParityRowDefinition>(registry.bundle.rows.size)
        val fixtureIds = mutableSetOf<String>()
        val rowErrors = mutableListOf<String>()

        for (row in registry.bundle.rows) {
            row.validateDefinition()
            if (rowsById.put(row.id, row) != null) {
                rowErrors += "Duplicate registry row id '${row.id}'"
            }
            if (!fixtureIds.add(row.fixtureId)) {
                rowErrors += "Duplicate fixture id '${row.fixtureId}' in registry"
            }
        }
        require(rowErrors.isEmpty()) { rowErrors.joinToString("; ") }
        return rowsById
    }

    private fun parsePolicy(
        policy: LoadedPolicy,
        allowedIds: Set<String>,
    ): Map<String, PolicyRow> {
        val knownIds = mutableSetOf<String>()
        val policyById = HashMap<String, PolicyRow>(policy.bundle.rows.size)
        val policyErrors = mutableListOf<String>()

        for (entry in policy.bundle.rows) {
            if (!allowedIds.contains(entry.id)) {
                policyErrors += "Unknown policy row id '${entry.id}'"
            }
            if (!knownIds.add(entry.id)) {
                policyErrors += "Duplicate policy row id '${entry.id}'"
            }
            if (entry.status != ParityStatus.WAIVED && entry.status != ParityStatus.NOT_APPLICABLE) {
                policyErrors += "Policy row '${entry.id}' must be waived or notApplicable"
            }
            if (allowedIds.contains(entry.id) && policy.bundle.producer != "parity-policy") {
                policyErrors += "Policy row '${entry.id}' has unexpected producer '${policy.bundle.producer}'"
            }
            policyById[entry.id] = entry
        }
        require(policyErrors.isEmpty()) { policyErrors.joinToString("; ") }
        return policyById
    }

    private fun parseProducerOwnership(
        registry: LoadedRegistry,
        rowIds: Set<String>,
    ): Map<String, String> {
        val ownerById = mutableMapOf<String, String>()
        val errors = mutableListOf<String>()
        registry.bundle.producers.toSortedMap().forEach { (producer, ownedIds) ->
            if (producer.isBlank()) errors += "Registry contains a blank producer"
            if (ownedIds != ownedIds.sorted() || ownedIds.size != ownedIds.distinct().size) {
                errors += "Registry ownership for '$producer' must be distinct and sorted"
            }
            ownedIds.forEach { id ->
                if (id !in rowIds) errors += "Producer '$producer' owns unknown row '$id'"
                val previous = ownerById.put(id, producer)
                if (previous != null) errors += "Registry row '$id' is owned by both '$previous' and '$producer'"
            }
        }
        (rowIds - ownerById.keys).sorted().forEach { errors += "Registry row '$it' has no producer owner" }
        require(errors.isEmpty()) { errors.joinToString("; ") }
        return ownerById
    }

    private fun parseEvidenceRows(
        evidence: List<LoadedEvidence>,
        rowsById: Map<String, ParityRowDefinition>,
        producerById: Map<String, String>,
    ): Map<String, RowWithProducer> {
        val evidenceById = HashMap<String, RowWithProducer>(rowsById.size)
        val fixtureIds = mutableSetOf<String>()
        val errors = mutableListOf<String>()

        for (loaded in evidence) {
            loaded.bundle.execution.validate(loaded.bundle.producer)
            val requested =
                loaded.bundle.execution.requestedFixtureIds
                    .toSet()
            for (row in loaded.bundle.rows) {
                val definition = rowsById[row.id]
                if (definition == null) {
                    errors += "Unknown evidence row id '${row.id}' in ${loaded.bundle.producer}"
                    continue
                }
                if (evidenceById.containsKey(row.id)) {
                    errors += "Duplicate evidence row id '${row.id}' in ${loaded.bundle.producer}"
                    continue
                }
                if (
                    loaded.bundle.kind == EvidenceKind.PRODUCER &&
                    producerById.getValue(row.id) != loaded.bundle.producer
                ) {
                    errors +=
                        "Evidence row '${row.id}' is owned by '${producerById.getValue(row.id)}', " +
                        "not '${loaded.bundle.producer}'"
                    continue
                }
                if (definition.fixtureId !in requested) {
                    errors +=
                        "Evidence row '${row.id}' fixture '${definition.fixtureId}' was not requested " +
                        "by ${loaded.bundle.producer}"
                    continue
                }
                if (row.status == ParityStatus.WAIVED || row.status == ParityStatus.NOT_APPLICABLE) {
                    errors += "Producer '${loaded.bundle.producer}' emitted policy status for row '${row.id}'"
                    continue
                }
                row.validateProducedRow(definition, row.id)
                row.validateAgainstExecution(definition.fixtureId, loaded.bundle.execution)
                if (!fixtureIds.add(definition.fixtureId)) {
                    errors += "Duplicate fixture id '${definition.fixtureId}' in ${loaded.bundle.producer}"
                }
                evidenceById[row.id] = RowWithProducer(row, loaded.bundle.producer, loaded.sha256)
            }
        }
        require(errors.isEmpty()) { errors.joinToString("; ") }
        return evidenceById
    }

    private fun policyToParityRow(
        row: ParityRowDefinition,
        policy: PolicyRow,
        evidenceProducer: String,
        evidenceSha: String,
    ): ParityRow =
        ParityRow(
            id = row.id,
            matrix = row.matrix,
            subject = row.subject,
            target = row.target,
            scenario = row.scenario,
            fixtureId = row.fixtureId,
            evidenceLevel = row.evidenceLevel,
            requiredness = row.requiredness,
            status = policy.status,
            evidenceProducer = evidenceProducer,
            evidenceSha256 = evidenceSha,
            reason = policy.reason,
            waiverOwner = policy.waiverOwner,
            disposition1_0 = policy.disposition1_0,
        )

    private fun evidenceToParityRow(
        row: ParityRowDefinition,
        evidence: RowWithProducer,
    ): ParityRow {
        val source = evidence.row
        return ParityRow(
            id = row.id,
            matrix = row.matrix,
            subject = row.subject,
            target = row.target,
            scenario = row.scenario,
            fixtureId = row.fixtureId,
            evidenceLevel = row.evidenceLevel,
            requiredness = row.requiredness,
            status = source.status,
            commitSha = source.commitSha,
            toolchainSha256 = source.toolchainSha256,
            corpusSha256 = source.corpusSha256,
            configDigest = source.configDigest,
            configFileSha256 = source.configFileSha256,
            lockFileSha256 = source.lockFileSha256,
            overlaySha256 = source.overlaySha256,
            generatedArtifactSha256 = source.generatedArtifactSha256,
            manifestSha256 = source.manifestSha256,
            evidenceProducer = evidence.producer,
            evidenceSha256 = evidence.sha,
            reason = source.reason,
            waiverOwner = source.waiverOwner,
            disposition1_0 = source.disposition1_0,
        )
    }

    private fun synthesizeMissingArtifact(row: ParityRowDefinition): ParityRow =
        ParityRow(
            id = row.id,
            matrix = row.matrix,
            subject = row.subject,
            target = row.target,
            scenario = row.scenario,
            fixtureId = row.fixtureId,
            evidenceLevel = row.evidenceLevel,
            requiredness = row.requiredness,
            status = ParityStatus.NOT_RUN,
            evidenceProducer = "missing-artifact",
            evidenceSha256 = "0".repeat(64),
            reason = "No producer artifact exists yet for fixture '${row.fixtureId}'.",
        )

    private fun missingCoverageErrors(
        registryRows: Map<String, ParityRowDefinition>,
        policyIds: Set<String>,
        evidenceIds: Set<String>,
    ): List<String> {
        val allCovered = policyIds + evidenceIds
        val missing = registryRows.keys - allCovered
        return missing
            .sorted()
            .map { id -> "Missing evidence for registry row '$id'" }
    }
}

private data class RowWithProducer(
    val row: ProducerEvidenceRow,
    val producer: String,
    val sha: String,
)

private fun ParityRowDefinition.validateDefinition() {
    require(id.matches(Regex("[a-z0-9][a-z0-9.-]+"))) { "Invalid parity row ID: '$id'" }
    require(
        subject.isNotBlank() &&
            target.isNotBlank() &&
            scenario.isNotBlank() &&
            fixtureId.isNotBlank(),
    ) {
        "Row $id has blank identity fields"
    }
}

private fun ExecutionEnvelope.validate(producer: String) {
    require(task.isNotBlank()) { "Evidence execution task is blank in $producer" }
    require(requestedFixtureIds.isNotEmpty()) { "Evidence execution requested no fixtures in $producer" }
    val requested = requestedFixtureIds.requireDistinctSorted("requested", producer)
    val started = startedFixtureIds.requireDistinctSorted("started", producer)
    val passed = passedFixtureIds.requireDistinctSorted("passed", producer)
    val failed = failedFixtureIds.requireDistinctSorted("failed", producer)
    require(started.all(requested::contains)) { "Execution in $producer started an unrequested fixture" }
    require(passed.all(started::contains)) { "Execution in $producer passed a fixture that did not start" }
    require(failed.all(started::contains)) { "Execution in $producer failed a fixture that did not start" }
    require(passed.intersect(failed).isEmpty()) { "Execution in $producer both passed and failed a fixture" }
    when (status) {
        ExecutionStatus.PASSED -> {
            require(reason == null) { "Passed execution in $producer must not carry a reason" }
            require(started == passed && failed.isEmpty()) {
                "Passed execution in $producer may contain only passed fixture observations"
            }
        }

        ExecutionStatus.FAILED -> {
            require(!reason.isNullOrBlank()) { "Failed execution in $producer lacks a reason" }
        }

        ExecutionStatus.NOT_RUN -> {
            require(!reason.isNullOrBlank()) { "Not-run execution in $producer lacks a reason" }
            require(started.isEmpty() && passed.isEmpty() && failed.isEmpty()) {
                "Not-run execution in $producer must not contain observed fixtures"
            }
        }
    }
}

private fun List<String>.requireDistinctSorted(
    label: String,
    producer: String,
): Set<String> {
    require(all(String::isNotBlank)) { "Execution $label fixtures contain a blank ID in $producer" }
    require(size == distinct().size) { "Execution $label fixtures contain duplicates in $producer" }
    require(this == sorted()) { "Execution $label fixtures are not canonically sorted in $producer" }
    return toSet()
}

private fun ProducerEvidenceRow.validateAgainstExecution(
    fixtureId: String,
    execution: ExecutionEnvelope,
) {
    when (status) {
        ParityStatus.PASSED -> {
            require(fixtureId in execution.passedFixtureIds) {
                "Passed row $id is not backed by a passed execution"
            }
        }

        ParityStatus.FAILED -> {
            require(execution.status == ExecutionStatus.FAILED && fixtureId in execution.failedFixtureIds) {
                "Failed row $id is not backed by a failed fixture event"
            }
        }

        ParityStatus.NOT_RUN -> {
            require(fixtureId !in execution.startedFixtureIds) {
                "Not-run row $id was observed by its execution"
            }
        }

        ParityStatus.WAIVED, ParityStatus.NOT_APPLICABLE -> {
            error("Producer row $id uses a policy-only status")
        }
    }
}

private fun ProducerEvidenceRow.validateProducedRow(
    definition: ParityRowDefinition,
    id: String,
) {
    require(id == definition.id) { "Evidence row id '$id' does not match expected '$definition.id'" }
    when (status) {
        ParityStatus.PASSED -> {
            require(commitSha != null && commitSha.matches(Regex("[0-9a-f]{40}"))) {
                "Row $id has invalid commit SHA: '$commitSha'"
            }
            require(toolchainSha256 != null && toolchainSha256.isSha256()) {
                "Row $id has invalid toolchain SHA-256"
            }
            require(toolchainSha256 == ParityRegistry.TOOLCHAIN_SHA256) {
                "Row $id has stale toolchain digest: expected ${ParityRegistry.TOOLCHAIN_SHA256}, got $toolchainSha256"
            }
            val expectedCorpus = ParityRegistry.expectedCorpusDigest(definition.subject)
            expectedCorpus?.let { expected ->
                require(corpusSha256 == expected) {
                    "Row $id has stale corpus digest for ${definition.subject}: expected $expected, got $corpusSha256"
                }
                require(corpusSha256.isSha256()) {
                    "Row $id has invalid corpus SHA-256"
                }
            }
            val expectedConfig = ParityRegistry.expectedConfigDigest(definition.subject)
            expectedConfig?.let { expected ->
                require(configDigest == expected) {
                    "Row $id has stale config digest for ${definition.subject}: expected $expected, got $configDigest"
                }
                require(configDigest.isSha256()) {
                    "Row $id has invalid config digest"
                }
            }
            val expectedConfigFile = ParityRegistry.expectedConfigFileDigest(definition.subject)
            expectedConfigFile?.let { expected ->
                require(configFileSha256 == expected) {
                    "Row $id has stale config file SHA-256 for ${definition.subject}: expected $expected, got $configFileSha256"
                }
                require(configFileSha256.isSha256()) {
                    "Row $id has invalid config file SHA-256"
                }
            }
            ParityRegistry.expectedLockFileDigest(definition.subject)?.let { expected ->
                require(lockFileSha256 == expected) {
                    "Row $id has stale lock file SHA-256 for ${definition.subject}: expected $expected, got $lockFileSha256"
                }
            }
            ParityRegistry.expectedOverlayDigest(definition.subject)?.let { expected ->
                require(overlaySha256 == expected) {
                    "Row $id has stale overlay SHA-256 for ${definition.subject}: expected $expected, got $overlaySha256"
                }
            }
            overlaySha256?.let {
                require(it.isSha256()) { "Row $id has invalid overlay SHA-256: '$it'" }
            }
            generatedArtifactSha256?.let {
                require(it.isSha256()) { "Row $id has invalid generated artifact SHA-256: '$it'" }
            }
            manifestSha256?.let {
                require(it.isSha256()) { "Row $id has invalid manifest SHA-256: '$it'" }
            }
            if (
                definition.evidenceLevel == EvidenceLevel.GENERATED_CLIENT ||
                definition.evidenceLevel == EvidenceLevel.SOURCE_INVARIANT
            ) {
                require(generatedArtifactSha256 != null && generatedArtifactSha256.isSha256()) {
                    "Row $id lacks a generated artifact SHA-256"
                }
            }
            if (definition.evidenceLevel == EvidenceLevel.GENERATED_CLIENT) {
                require(manifestSha256 != null && manifestSha256.isSha256()) {
                    "Row $id lacks a generated manifest SHA-256"
                }
            }
            require(reason == null) { "Passed row $id must not carry a failure/omission reason" }
        }

        ParityStatus.FAILED, ParityStatus.NOT_RUN -> {
            if (status == ParityStatus.FAILED || reason != null) {
                require(!reason.isNullOrBlank()) { "Row $id missing failure reason" }
            }
            commitSha?.let {
                require(it.matches(Regex("[0-9a-f]{40}"))) { "Row $id has invalid commit SHA: '$it'" }
            }
            toolchainSha256?.let {
                require(it.isSha256()) { "Row $id has invalid toolchain SHA-256" }
            }
            corpusSha256?.let { require(it.isSha256()) { "Row $id has invalid corpus SHA-256" } }
            configDigest?.let { require(it.isSha256()) { "Row $id has invalid config digest" } }
            configFileSha256?.let { require(it.isSha256()) { "Row $id has invalid config file SHA-256" } }
            lockFileSha256?.let { require(it.isSha256()) { "Row $id has invalid lock file SHA-256" } }
            overlaySha256?.let {
                require(it.isSha256()) { "Row $id has invalid overlay SHA-256: '$it'" }
            }
            generatedArtifactSha256?.let {
                require(it.isSha256()) { "Row $id has invalid generated artifact SHA-256: '$it'" }
            }
            manifestSha256?.let {
                require(it.isSha256()) { "Row $id has invalid manifest SHA-256: '$it'" }
            }
        }

        else -> {}
    }
}

internal fun String.isSha256(): Boolean = matches(Regex("[0-9a-f]{64}"))

internal fun ByteArray.sha256(): String =
    MessageDigest
        .getInstance("SHA-256")
        .digest(this)
        .joinToString("") { byte -> (byte.toInt() and 0xff).toString(16).padStart(2, '0') }
