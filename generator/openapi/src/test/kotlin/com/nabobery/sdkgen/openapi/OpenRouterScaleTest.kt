@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.nabobery.sdkgen.openapi.AdaptationMetrics
import com.nabobery.sdkgen.openapi.SemanticAdapter
import java.lang.management.ManagementFactory
import kotlin.io.path.createDirectories
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class OpenRouterScaleTest {
    @Test
    fun `full pinned OpenRouter spec has zero silent omissions and a five run baseline`() {
        val fixture = ExperimentSupport.openRouterFixture
        val adapter = SemanticAdapter()
        adapter.adapt(fixture)

        val runs =
            (1..5).map { run ->
                System.gc()
                val pools = ManagementFactory.getMemoryPoolMXBeans()
                pools.forEach { pool -> runCatching(pool::resetPeakUsage) }
                val started = System.nanoTime()
                val result = adapter.adapt(fixture)
                val elapsedMillis = (System.nanoTime() - started) / 1_000_000.0
                val peakHeapBytes =
                    pools
                        .filter { it.type == java.lang.management.MemoryType.HEAP }
                        .sumOf { it.peakUsage.used.coerceAtLeast(0L) }
                ScaleRun(
                    run = run,
                    elapsedMillis = elapsedMillis,
                    peakHeapBytes = peakHeapBytes,
                    metrics = result.metrics,
                    diagnostics =
                        result.document.diagnostics.map {
                            "${it.code} ${it.source.jsonPointer}: ${it.message}"
                        },
                )
            }
        val finalMetrics = runs.last().metrics
        val medianMillis = runs.map(ScaleRun::elapsedMillis).sorted()[2]
        val maxPeakHeapBytes = runs.maxOf(ScaleRun::peakHeapBytes)
        val timeDeltaPercent = (medianMillis / BASELINE_MEDIAN_MILLIS - 1.0) * 100.0
        val heapDeltaPercent = (maxPeakHeapBytes.toDouble() / BASELINE_PEAK_HEAP_BYTES - 1.0) * 100.0
        val timeBudgetExceeded = timeDeltaPercent > 20.0
        val heapBudgetExceeded = heapDeltaPercent > 20.0

        assertEquals(708, finalMetrics.componentSchemasTotal)
        assertEquals(0, finalMetrics.silentSchemaOmissions)
        assertEquals(0, finalMetrics.silentOperationOmissions)
        assertEquals(
            finalMetrics.componentSchemasTotal,
            finalMetrics.componentSchemasRepresented + finalMetrics.componentSchemasDiagnosed,
        )
        assertEquals(
            finalMetrics.operationsTotal,
            finalMetrics.operationsRepresented + finalMetrics.operationsDiagnosed,
        )
        assertTrue(finalMetrics.operationsTotal > 0)

        ExperimentSupport.resultRoot.createDirectories()
        ExperimentSupport.resultRoot.resolve("openrouter-diagnostics.txt").writeText(
            runs
                .last()
                .diagnostics
                .distinct()
                .sorted()
                .joinToString("\n", postfix = "\n"),
        )
        ExperimentSupport.resultRoot.resolve("openrouter-baseline.txt").writeText(
            buildString {
                appendLine("fixture=openapi.yaml")
                appendLine(
                    "runs_ms=${runs.joinToString(",") { "%.3f".format(java.util.Locale.ROOT, it.elapsedMillis) }}",
                )
                appendLine("median_ms=${"%.3f".format(java.util.Locale.ROOT, medianMillis)}")
                appendLine("baseline_median_ms=${"%.3f".format(java.util.Locale.ROOT, BASELINE_MEDIAN_MILLIS)}")
                appendLine("time_delta_percent=${"%.3f".format(java.util.Locale.ROOT, timeDeltaPercent)}")
                appendLine("time_budget_exceeded=$timeBudgetExceeded")
                appendLine("max_peak_heap_bytes=$maxPeakHeapBytes")
                appendLine(
                    "max_peak_heap_mib=${"%.3f".format(java.util.Locale.ROOT, maxPeakHeapBytes / 1024.0 / 1024.0)}",
                )
                appendLine("baseline_peak_heap_bytes=$BASELINE_PEAK_HEAP_BYTES")
                appendLine("heap_delta_percent=${"%.3f".format(java.util.Locale.ROOT, heapDeltaPercent)}")
                appendLine("heap_budget_exceeded=$heapBudgetExceeded")
                appendLine("component_schemas_total=${finalMetrics.componentSchemasTotal}")
                appendLine("component_schemas_represented=${finalMetrics.componentSchemasRepresented}")
                appendLine("component_schemas_diagnosed=${finalMetrics.componentSchemasDiagnosed}")
                appendLine("component_schemas_silent=${finalMetrics.silentSchemaOmissions}")
                appendLine("operations_total=${finalMetrics.operationsTotal}")
                appendLine("operations_represented=${finalMetrics.operationsRepresented}")
                appendLine("operations_diagnosed=${finalMetrics.operationsDiagnosed}")
                appendLine("operations_silent=${finalMetrics.silentOperationOmissions}")
                appendLine("inline_schemas=${finalMetrics.inlineSchemas}")
                appendLine("source_mapped_nodes=${finalMetrics.sourceMappedNodes}")
                appendLine("unresolved_parser_messages=${finalMetrics.unresolvedParserMessages}")
                appendLine("resolved_parser_messages=${finalMetrics.resolvedParserMessages}")
                appendLine("resolved_shared_identity_targets=${finalMetrics.resolvedSharedIdentityTargets}")
            },
        )
    }
}

private const val BASELINE_MEDIAN_MILLIS = 1298.474
private const val BASELINE_PEAK_HEAP_BYTES = 730_698_776L

private data class ScaleRun(
    val run: Int,
    val elapsedMillis: Double,
    val peakHeapBytes: Long,
    val metrics: AdaptationMetrics,
    val diagnostics: List<String>,
)
