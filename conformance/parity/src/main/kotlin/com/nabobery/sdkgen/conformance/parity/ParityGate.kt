package com.nabobery.sdkgen.conformance.parity

internal object ParityGate {
    fun validate(
        report: ParityReport,
        expectedPassedCommitSha: String? = null,
    ): GateResult =
        validateRows(
            report.matrices.flatMap { it.rows },
            report.inputErrors,
            expectedPassedCommitSha,
        )

    fun validateRows(
        rows: List<ParityRow>,
        inputErrors: List<String> = emptyList(),
        expectedPassedCommitSha: String? = null,
    ): GateResult {
        val errors = inputErrors.toMutableList()
        rows.forEach { row ->
            val label = row.id
            if (row.requiredness == Requiredness.REQUIRED && row.status != ParityStatus.PASSED) {
                errors += "$label: required row is ${row.status.serialValue()}"
            }
            when (row.status) {
                ParityStatus.PASSED -> {
                    if (!row.evidenceSha256.isSha256()) errors += "$label: passed row lacks verified evidence"
                    if (row.commitSha == null || !row.commitSha.matches(Regex("[0-9a-f]{40}"))) {
                        errors += "$label: passed row has invalid commit SHA"
                    }
                    if (row.toolchainSha256 == null || !row.toolchainSha256.isSha256()) {
                        errors += "$label: passed row has invalid toolchain SHA-256"
                    }
                    if (expectedPassedCommitSha != null && row.commitSha != expectedPassedCommitSha) {
                        errors +=
                            "$label: passed evidence commit ${row.commitSha} does not match " +
                            "expected $expectedPassedCommitSha"
                    }
                    if (row.reason != null) errors += "$label: passed row must not carry a failure/omission reason"
                }

                ParityStatus.FAILED, ParityStatus.NOT_RUN -> {
                    if (row.reason.isNullOrBlank()) errors += "$label: ${row.status.serialValue()} row lacks reason"
                }

                ParityStatus.WAIVED -> {
                    if (row.waiverOwner.isNullOrBlank()) errors += "$label: waived row lacks owner"
                    if (row.reason.isNullOrBlank()) errors += "$label: waived row lacks rationale"
                    if (row.disposition1_0.isNullOrBlank()) errors += "$label: waived row lacks 1.0 disposition"
                }

                ParityStatus.NOT_APPLICABLE -> {
                    if (row.reason.isNullOrBlank()) errors += "$label: notApplicable row lacks structural reason"
                }
            }
            val hasIllegalEvidenceLevel =
                when (row.matrix) {
                    // Behavior policy rows may be runtime-contract waivers, and the production
                    // OpenRouter SSE policy is source-invariant because no generated operation
                    // exists. A passed behavior producer, however, must be a generated-client
                    // or runtime-contract result and can never be source-only evidence.
                    MatrixType.BEHAVIOR -> {
                        row.status == ParityStatus.PASSED &&
                            row.evidenceLevel == EvidenceLevel.SOURCE_INVARIANT
                    }

                    MatrixType.COMPILE -> {
                        row.status == ParityStatus.PASSED && row.evidenceLevel != EvidenceLevel.GENERATED_CLIENT
                    }

                    MatrixType.TRANSPORT -> {
                        row.status == ParityStatus.PASSED && row.evidenceLevel != EvidenceLevel.RUNTIME_CONTRACT
                    }

                    MatrixType.SOURCE_INVARIANT -> {
                        row.status == ParityStatus.PASSED && row.evidenceLevel != EvidenceLevel.SOURCE_INVARIANT
                    }
                }
            if (hasIllegalEvidenceLevel) {
                val expected =
                    when (row.matrix) {
                        MatrixType.BEHAVIOR -> "generatedClient or runtimeContract"
                        MatrixType.COMPILE -> EvidenceLevel.GENERATED_CLIENT.serialValue()
                        MatrixType.TRANSPORT -> EvidenceLevel.RUNTIME_CONTRACT.serialValue()
                        MatrixType.SOURCE_INVARIANT -> EvidenceLevel.SOURCE_INVARIANT.serialValue()
                    }
                errors += "$label: passed ${row.matrix.serialValue()} row must use $expected evidence"
            }
        }
        return GateResult(errors.isEmpty(), errors.sorted())
    }
}

internal fun MatrixType.serialValue(): String =
    when (this) {
        MatrixType.BEHAVIOR -> "behavior"
        MatrixType.COMPILE -> "compile"
        MatrixType.TRANSPORT -> "transport"
        MatrixType.SOURCE_INVARIANT -> "sourceInvariant"
    }

internal fun ParityStatus.serialValue(): String =
    when (this) {
        ParityStatus.PASSED -> "passed"
        ParityStatus.FAILED -> "failed"
        ParityStatus.WAIVED -> "waived"
        ParityStatus.NOT_APPLICABLE -> "notApplicable"
        ParityStatus.NOT_RUN -> "notRun"
    }

internal fun Requiredness.serialValue(): String =
    when (this) {
        Requiredness.REQUIRED -> "required"
        Requiredness.OPTIONAL -> "optional"
    }

internal fun EvidenceLevel.serialValue(): String =
    when (this) {
        EvidenceLevel.GENERATED_CLIENT -> "generatedClient"
        EvidenceLevel.RUNTIME_CONTRACT -> "runtimeContract"
        EvidenceLevel.SOURCE_INVARIANT -> "sourceInvariant"
    }
