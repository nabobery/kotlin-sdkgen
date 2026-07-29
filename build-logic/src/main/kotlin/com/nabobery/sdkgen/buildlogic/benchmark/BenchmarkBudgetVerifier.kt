package com.nabobery.sdkgen.buildlogic.benchmark

/**
 * The outcome of verifying three measurement records against a budget: the computed median (when the
 * records were well-formed enough to compute one) and every reason verification did not pass. An empty
 * [failures] list is the only success signal; any non-empty list means the caller must treat this as
 * a failure, never a silent pass.
 */
public data class BenchmarkVerificationResult(
    val median: Double?,
    val failures: List<String>,
) {
    public val passed: Boolean get() = failures.isEmpty()
}

/**
 * The machine a verification is running on, in the terms a measurement can be compared against.
 *
 * Deliberately narrower than [MeasurementEnvironment]. `workerCount` and `heapBytes` describe how a
 * *measurement* was taken and cannot be re-derived while verifying — a verify task legitimately runs at
 * `-Xmx2g` against records made at `-Xmx4g` — so comparing them would reject correct evidence. What can
 * honestly be compared is the platform the numbers were calibrated on.
 */
public data class ExecutionHost(
    val jvmVersion: String,
    val osName: String,
    val osArch: String,
) {
    /** The JVM feature release. A patch-level difference does not invalidate a budget; a major one does. */
    internal val jvmMajorVersion: String get() = jvmVersion.substringBefore('.').trim()

    public companion object {
        public fun current(): ExecutionHost =
            ExecutionHost(
                jvmVersion = requireSystemProperty("java.version"),
                osName = requireSystemProperty("os.name"),
                osArch = requireSystemProperty("os.arch"),
            )

        private fun requireSystemProperty(name: String): String =
            System.getProperty(name) ?: error("system property \"$name\" is unavailable")
    }
}

/**
 * Compares three measurement records for the same benchmark against a supplied budget, on a stated host.
 *
 * Fails closed in every case: a missing budget, a record set that is not exactly three records, records
 * that disagree on benchmark identity, unit, environment, or sample count, a budget whose identity/unit
 * does not match the records, or records taken on a different platform than the one verifying them, all
 * produce a non-empty [BenchmarkVerificationResult.failures] rather than a silent pass.
 *
 * The [executingHost] parameter is required and has no default. Without it this function compared the three
 * records only to *each other*, which three mutually-consistent Mac records satisfy on any machine: on a
 * Linux CI runner it compared that Mac's median against the budget and passed, on hardware the budget was
 * never calibrated for. Self-consistency and host-correctness are different properties and the first cannot
 * stand in for the second.
 *
 * The median is only computed when there are exactly three well-formed, matching records to compute it from.
 */
public object BenchmarkBudgetVerifier {
    private const val REQUIRED_RECORD_COUNT = 3

    public fun verify(
        records: List<MeasurementRecord>,
        budget: BenchmarkBudget?,
        executingHost: ExecutionHost,
    ): BenchmarkVerificationResult {
        val failures = mutableListOf<String>()

        if (budget == null) {
            failures += "no budget supplied: a missing budget is a failure, never a silent pass"
        }

        if (records.size != REQUIRED_RECORD_COUNT) {
            failures += "expected exactly $REQUIRED_RECORD_COUNT measurement records, found ${records.size}"
        }

        val identities = records.map { it.identity }.distinct()
        if (identities.size > 1) {
            failures += "records do not share a benchmark identity: ${identities.joinToString()}"
        }

        val units = records.map { it.unit }.distinct()
        if (units.size > 1) {
            failures += "records do not share a unit: ${units.joinToString()}"
        }

        val environments = records.map { it.environment }.distinct()
        if (environments.size > 1) {
            failures += "records do not share an environment (comparing across machines is not honest): " +
                environments.joinToString()
        }

        // Records agreeing with each other says nothing about whether they describe *this* machine. Reported
        // per offending record so the message names what actually differs rather than "environment mismatch".
        records.forEachIndexed { index, record ->
            val mismatches =
                listOfNotNull(
                    "osName ${record.environment.osName} != ${executingHost.osName}"
                        .takeIf { record.environment.osName != executingHost.osName },
                    "osArch ${record.environment.osArch} != ${executingHost.osArch}"
                        .takeIf { record.environment.osArch != executingHost.osArch },
                    "jvm major ${majorVersionOf(record.environment.jvmVersion)} != ${executingHost.jvmMajorVersion}"
                        .takeIf {
                            majorVersionOf(record.environment.jvmVersion) != executingHost.jvmMajorVersion
                        },
                )
            if (mismatches.isNotEmpty()) {
                failures += "record $index and the budget it backs were not recorded on the executing host: " +
                    mismatches.joinToString()
            }
        }

        val sampleCounts = records.map { it.sampleCount }.distinct()
        if (sampleCounts.size > 1) {
            failures += "records do not share a sample count: ${sampleCounts.joinToString()}"
        }

        if (budget != null && identities.size == 1 && identities.single() != budget.identity) {
            failures += "budget identity ${budget.identity} does not match record identity ${identities.single()}"
        }

        if (budget != null && units.size == 1 && units.single() != budget.unit) {
            failures += "budget unit ${budget.unit} does not match record unit ${units.single()}"
        }

        val canComputeMedian =
            records.size == REQUIRED_RECORD_COUNT &&
                identities.size == 1 &&
                units.size == 1 &&
                environments.size == 1 &&
                sampleCounts.size == 1
        val median = if (canComputeMedian) records.map { it.value }.sorted()[1] else null

        if (median != null && budget != null && median > budget.maxValue) {
            failures += "median $median ${budget.unit} exceeds budget ${budget.maxValue} ${budget.unit}"
        }

        return BenchmarkVerificationResult(median = median, failures = failures)
    }

    private fun majorVersionOf(jvmVersion: String): String = jvmVersion.substringBefore('.').trim()
}
