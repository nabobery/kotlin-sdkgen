package com.nabobery.sdkgen.conformance.parity

internal object ParityMarkdownRenderer {
    fun render(report: ParityReport): String {
        val sb = StringBuilder()
        sb.appendLine("# Cross-Corpus Parity & Matrices")
        sb.appendLine()
        sb.appendLine(
            "This checkpoint aggregates checked evidence; it does not execute corpus or transport producers. " +
                "Absent digest-bound executions from the current commit remain `notRun`.",
        )
        sb.appendLine()
        sb.appendLine("## Executive Summary")
        sb.appendLine()
        sb.appendLine("| Metric | Value |")
        sb.appendLine("| --- | --- |")
        sb.appendLine("| Total Matrix Scenarios | ${report.summary.totalRows} |")
        sb.appendLine("| Passed Scenarios | ${report.summary.passedRows} |")
        sb.appendLine("| Waived Scenarios | ${report.summary.waivedRows} |")
        sb.appendLine("| Not Applicable Scenarios | ${report.summary.notApplicableRows} |")
        sb.appendLine("| Failed Scenarios | ${report.summary.failedRows} |")
        sb.appendLine("| Not Run Scenarios | ${report.summary.notRunRows} |")
        sb.appendLine("| Overall Gate Status | **${report.summary.gateStatus.serialValue()}** |")
        sb.appendLine()
        sb.appendLine("## Input integrity")
        sb.appendLine()
        if (report.inputErrors.isEmpty()) {
            sb.appendLine("All declared corpus, config, and toolchain digests match the repository inputs.")
        } else {
            report.inputErrors.forEach { sb.appendLine("- ${escape(it)}") }
        }
        sb.appendLine()

        for (matrix in report.matrices) {
            val title =
                when (matrix.matrix) {
                    MatrixType.BEHAVIOR -> "Fixture Behavior Parity Matrix"
                    MatrixType.COMPILE -> "Generated SDK Compile Parity Matrix"
                    MatrixType.TRANSPORT -> "Runtime Transport Adapter Contract Matrix"
                    MatrixType.SOURCE_INVARIANT -> "Portable Source-Invariant Matrix"
                }
            sb.appendLine("## $title")
            sb.appendLine()
            sb.appendLine(
                "| Subject | Target / Category | Row ID | Scenario " +
                    "| Status | Requiredness | Level | Producer | Reason |",
            )
            sb.appendLine("| --- | --- | --- | --- | --- | --- | --- | --- | --- |")
            for (row in matrix.rows) {
                sb.appendLine(
                    "| `${escape(row.subject)}` | `${escape(row.target)}` | `${escape(row.id)}` | " +
                        "${escape(row.scenario)} | **${row.status.serialValue()}** | " +
                        "`${row.requiredness.serialValue()}` | `${row.evidenceLevel.serialValue()}` | " +
                        "`${escape(row.evidenceProducer)}` | ${escape(row.reason.orEmpty())} |",
                )
            }
            sb.appendLine()
        }

        sb.appendLine("## Waiver Ledger")
        sb.appendLine()
        if (report.waiverLedger.isEmpty()) {
            sb.appendLine("*(No accepted waivers)*")
        } else {
            sb.appendLine(
                "| Corpus / Transport | Capability ID | Target / Category | Owner | Rationale | 1.0 Disposition |",
            )
            sb.appendLine("| --- | --- | --- | --- | --- | --- |")
            for (w in report.waiverLedger) {
                sb.appendLine(
                    "| `${escape(w.subject)}` | `${escape(w.id)}` | `${escape(w.target)}` " +
                        "| ${escape(w.owner)} | ${escape(w.rationale)} | ${escape(w.disposition1_0)} |",
                )
            }
        }
        sb.appendLine()

        sb.appendLine("## Evidence Provenance & Integrity")
        sb.appendLine()
        sb.appendLine(
            "| Corpus / Transport | Capability ID | Commit SHA | Config Digest | Config File SHA | Evidence Digest |",
        )
        sb.appendLine("| --- | --- | --- | --- | --- | --- |")
        for (matrix in report.matrices) {
            for (row in matrix.rows) {
                val config = row.configDigest?.take(12)?.plus("...") ?: "n/a"
                val configFile = row.configFileSha256?.take(12)?.plus("...") ?: "n/a"
                sb.appendLine(
                    "| `${escape(row.subject)}` | `${escape(row.id)}` | `${row.commitSha}` | " +
                        "`$config` | `$configFile` | `${row.evidenceSha256.take(12)}...` |",
                )
            }
        }
        return sb.toString()
    }

    private fun escape(value: String): String = value.replace("|", "\\|").replace("\n", " ")
}
