package com.nabobery.sdkgen.conformance.parity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class EvidenceBundle(
    val schemaVersion: String,
    val kind: EvidenceKind,
    val producer: String,
    val execution: ExecutionEnvelope,
    val rows: List<ProducerEvidenceRow>,
)

@Serializable
internal enum class EvidenceKind {
    @SerialName("assessment")
    ASSESSMENT,

    @SerialName("producer")
    PRODUCER,
}

@Serializable
internal data class ExecutionEnvelope(
    val task: String,
    val status: ExecutionStatus,
    val requestedFixtureIds: List<String>,
    val startedFixtureIds: List<String> = emptyList(),
    val passedFixtureIds: List<String> = emptyList(),
    val failedFixtureIds: List<String> = emptyList(),
    val reason: String? = null,
)

@Serializable
internal enum class ExecutionStatus {
    @SerialName("passed")
    PASSED,

    @SerialName("failed")
    FAILED,

    @SerialName("notRun")
    NOT_RUN,
}

@Serializable
internal data class ProducerEvidenceRow(
    val id: String,
    val status: ParityStatus,
    val commitSha: String? = null,
    val toolchainSha256: String? = null,
    val corpusSha256: String? = null,
    val configDigest: String? = null,
    val configFileSha256: String? = null,
    val lockFileSha256: String? = null,
    val overlaySha256: String? = null,
    val generatedArtifactSha256: String? = null,
    val manifestSha256: String? = null,
    val reason: String? = null,
    val waiverOwner: String? = null,
    val disposition1_0: String? = null,
)

@Serializable
internal data class ParityRowDefinition(
    val id: String,
    val matrix: MatrixType,
    val subject: String,
    val target: String,
    val scenario: String,
    val fixtureId: String,
    val evidenceLevel: EvidenceLevel,
    val requiredness: Requiredness,
)

@Serializable
internal data class RegistryBundle(
    val schemaVersion: String,
    val producers: Map<String, List<String>>,
    val rows: List<ParityRowDefinition>,
)

@Serializable
internal data class PolicyBundle(
    val schemaVersion: String,
    val producer: String,
    val rows: List<PolicyRow>,
)

@Serializable
internal data class PolicyRow(
    val id: String,
    val status: ParityStatus,
    val reason: String? = null,
    val waiverOwner: String? = null,
    val disposition1_0: String? = null,
)

@Serializable
internal enum class ParityStatus {
    @SerialName("passed")
    PASSED,

    @SerialName("failed")
    FAILED,

    @SerialName("waived")
    WAIVED,

    @SerialName("notApplicable")
    NOT_APPLICABLE,

    @SerialName("notRun")
    NOT_RUN,
}

@Serializable
internal enum class Requiredness {
    @SerialName("required")
    REQUIRED,

    @SerialName("optional")
    OPTIONAL,
}

@Serializable
internal enum class EvidenceLevel {
    @SerialName("generatedClient")
    GENERATED_CLIENT,

    @SerialName("runtimeContract")
    RUNTIME_CONTRACT,

    @SerialName("sourceInvariant")
    SOURCE_INVARIANT,
}

@Serializable
internal enum class MatrixType {
    @SerialName("behavior")
    BEHAVIOR,

    @SerialName("compile")
    COMPILE,

    @SerialName("transport")
    TRANSPORT,

    @SerialName("sourceInvariant")
    SOURCE_INVARIANT,
}

@Serializable
internal data class ParityRow(
    val id: String,
    val matrix: MatrixType,
    val subject: String,
    val target: String,
    val scenario: String,
    val fixtureId: String,
    val evidenceLevel: EvidenceLevel,
    val requiredness: Requiredness,
    val status: ParityStatus,
    val commitSha: String? = null,
    val toolchainSha256: String? = null,
    val corpusSha256: String? = null,
    val configDigest: String? = null,
    val configFileSha256: String? = null,
    val lockFileSha256: String? = null,
    val overlaySha256: String? = null,
    val generatedArtifactSha256: String? = null,
    val manifestSha256: String? = null,
    val evidenceProducer: String,
    val evidenceSha256: String,
    val reason: String? = null,
    val waiverOwner: String? = null,
    val disposition1_0: String? = null,
)

@Serializable
internal data class ParityMatrix(
    val matrix: MatrixType,
    val rows: List<ParityRow>,
)

@Serializable
internal data class WaiverEntry(
    val id: String,
    val subject: String,
    val target: String,
    val owner: String,
    val rationale: String,
    val disposition1_0: String,
)

@Serializable
internal data class ParitySummary(
    val totalRows: Int,
    val passedRows: Int,
    val failedRows: Int,
    val waivedRows: Int,
    val notApplicableRows: Int,
    val notRunRows: Int,
    val gateStatus: ParityStatus,
)

@Serializable
internal data class ParityReport(
    val schemaVersion: String = "v1alpha1",
    val inputErrors: List<String>,
    val matrices: List<ParityMatrix>,
    val waiverLedger: List<WaiverEntry>,
    val summary: ParitySummary,
)

internal data class LoadedEvidence(
    val bundle: EvidenceBundle,
    val sha256: String,
)

internal data class LoadedRegistry(
    val bundle: RegistryBundle,
    val sha256: String,
)

internal data class LoadedPolicy(
    val bundle: PolicyBundle,
    val sha256: String,
)

@Serializable
internal data class FixtureEvent(
    val fixtureId: String,
    val event: FixtureEventType,
    @SerialName("error") val error: String? = null,
    @SerialName("runId") val runId: String = "",
) {
    constructor(
        runId: String,
        fixtureId: String,
        event: FixtureEventType,
    ) : this(fixtureId, event, null, runId)

    constructor(
        runId: String,
        fixtureId: String,
        event: FixtureEventType,
        error: String,
    ) : this(fixtureId, event, error, runId)
}

@Serializable
internal enum class FixtureEventType {
    @SerialName("START")
    START,

    @SerialName("PASS")
    PASS,

    @SerialName("FAIL")
    FAIL,
}

internal data class FixtureResult(
    val fixtureId: String,
    val status: ParityStatus,
    val reason: String? = null,
)

internal data class GateResult(
    val passed: Boolean,
    val errors: List<String>,
)
