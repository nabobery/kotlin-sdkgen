package com.nabobery.sdkgen.cli

internal enum class CompatibilityFailOn {
    BREAKING,
    BEHAVIORALLY_RISKY,
    ANY_CHANGE,
    NEVER,
}

internal object CompatibilityExitPolicy {
    internal fun exitCode(
        report: CompatibilityReport,
        failOn: CompatibilityFailOn,
    ): Int {
        if (report.aggregateOutcome == CompatibilityAggregateOutcome.INCOMPLETE) {
            return INCOMPLETE_EVIDENCE_EXIT_CODE
        }
        return if (reachesThreshold(report, failOn)) {
            THRESHOLD_REACHED_EXIT_CODE
        } else {
            SUCCESS_EXIT_CODE
        }
    }

    private fun reachesThreshold(
        report: CompatibilityReport,
        failOn: CompatibilityFailOn,
    ): Boolean =
        when (failOn) {
            CompatibilityFailOn.BREAKING -> {
                report.count(CompatibilityClassification.BREAKING) != 0
            }

            CompatibilityFailOn.BEHAVIORALLY_RISKY -> {
                report.count(CompatibilityClassification.BREAKING) != 0 ||
                    report.count(CompatibilityClassification.BEHAVIORALLY_RISKY) != 0
            }

            CompatibilityFailOn.ANY_CHANGE -> {
                report.totalChangeCount != 0
            }

            CompatibilityFailOn.NEVER -> {
                false
            }
        }

    private fun CompatibilityReport.count(classification: CompatibilityClassification): Int =
        changeCountsByClassification[classification] ?: 0

    private const val SUCCESS_EXIT_CODE: Int = 0
    private const val INCOMPLETE_EVIDENCE_EXIT_CODE: Int = 1
    private const val THRESHOLD_REACHED_EXIT_CODE: Int = 3
}
