package com.nabobery.sdkgen.cli

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

internal enum class CompatibilityOutputFormat {
    HUMAN,
    JSON,
    MARKDOWN,
}

internal object CompatibilityReportRenderer {
    internal fun render(
        report: CompatibilityReport,
        format: CompatibilityOutputFormat,
    ): String =
        when (format) {
            CompatibilityOutputFormat.HUMAN -> renderHuman(report)
            CompatibilityOutputFormat.JSON -> COMPACT_JSON.encodeToString(report.toJson())
            CompatibilityOutputFormat.MARKDOWN -> renderMarkdown(report)
        }

    private fun renderHuman(report: CompatibilityReport): String =
        buildString {
            appendLine("Compatibility report")
            appendLine("Aggregate outcome: ${report.aggregateOutcome.wireName}")
            appendLine("Total changes: ${report.totalChangeCount}")
            appendLine("Most severe classification: ${report.mostSevereClassification?.wireName ?: "none"}")
            report.truncation?.let { truncation ->
                appendLine(
                    "Displayed changes: ${truncation.displayedChangeCount} " +
                        "(${truncation.omittedChangeCount} omitted)",
                )
            }
            appendLine()
            appendLine("Layers:")
            report.layers.forEach { layerReport ->
                append("- ${layerReport.layer.wireName}: ${layerReport.outcome.wireName}")
                layerReport.unavailableReason?.let { reason ->
                    append(" (${reason.code}")
                    reason.detail?.let { detail -> append(": $detail") }
                    append(')')
                }
                appendLine()
            }
            appendLine("Changes:")
            if (report.changes.isEmpty()) {
                appendLine("- none")
            } else {
                report.changes.forEach { change ->
                    appendLine("- ${change.id.value} ${change.classification.wireName}: ${change.summary}")
                    change.evidence.forEach { evidence ->
                        append("  evidence: ${evidence.kind} ${evidence.identity} ${evidence.sha256}")
                        evidence.location?.let { location -> append(" $location") }
                        appendLine()
                    }
                }
            }
        }.trimEnd()

    private fun renderMarkdown(report: CompatibilityReport): String =
        buildString {
            appendLine("# Compatibility report")
            appendLine()
            appendLine("- Aggregate outcome: `${report.aggregateOutcome.wireName}`")
            appendLine("- Total changes: ${report.totalChangeCount}")
            appendLine("- Most severe classification: `${report.mostSevereClassification?.wireName ?: "none"}`")
            report.truncation?.let { truncation ->
                appendLine("- Displayed changes: ${truncation.displayedChangeCount}")
                appendLine("- Omitted changes: ${truncation.omittedChangeCount}")
            }
            appendLine()
            appendLine("## Layers")
            appendLine()
            appendLine("| Layer | Outcome | Unavailable reason |")
            appendLine("| --- | --- | --- |")
            report.layers.forEach { layerReport ->
                val reason =
                    layerReport.unavailableReason
                        ?.let { unavailableReason ->
                            listOfNotNull(unavailableReason.code, unavailableReason.detail).joinToString(": ")
                        }.orEmpty()
                appendLine(
                    "| ${layerReport.layer.wireName} | ${layerReport.outcome.wireName} | " +
                        "${markdownCell(reason)} |",
                )
            }
            appendLine()
            appendLine("## Changes")
            appendLine()
            if (report.changes.isEmpty()) {
                appendLine("No displayed changes.")
            } else {
                appendLine("| ID | Layer | Classification | Summary | Evidence |")
                appendLine("| --- | --- | --- | --- | --- |")
                report.changes.forEach { change ->
                    appendLine(
                        "| `${change.id.value}` | ${change.layer.wireName} | " +
                            "${change.classification.wireName} | ${markdownCell(change.summary)} | " +
                            "${markdownEvidence(change.evidence)} |",
                    )
                }
            }
        }.trimEnd()

    private fun CompatibilityReport.toJson(): JsonObject =
        buildJsonObject {
            put("aggregateOutcome", aggregateOutcome.wireName)
            put("totalChangeCount", totalChangeCount)
            put(
                "changeCountsByClassification",
                buildJsonObject {
                    changeCountsByClassification.forEach { (classification, count) ->
                        put(classification.wireName, count)
                    }
                },
            )
            put(
                "mostSevereClassification",
                mostSevereClassification?.let { classification -> JsonPrimitive(classification.wireName) } ?: JsonNull,
            )
            truncation?.let { value ->
                put(
                    "truncation",
                    buildJsonObject {
                        put("displayedChangeCount", value.displayedChangeCount)
                        put("omittedChangeCount", value.omittedChangeCount)
                    },
                )
            }
            put("layers", layers.layerReportsToJsonArray())
            put("changes", changes.changesToJsonArray())
        }

    private fun List<CompatibilityLayerReport>.layerReportsToJsonArray(): JsonArray =
        buildJsonArray {
            this@layerReportsToJsonArray.forEach { report ->
                add(
                    buildJsonObject {
                        put("layer", report.layer.wireName)
                        put("outcome", report.outcome.wireName)
                        report.unavailableReason?.let { reason ->
                            put(
                                "unavailableReason",
                                buildJsonObject {
                                    put("code", reason.code)
                                    reason.detail?.let { detail -> put("detail", detail) }
                                },
                            )
                        }
                    },
                )
            }
        }

    private fun List<CompatibilityChange>.changesToJsonArray(): JsonArray =
        buildJsonArray {
            this@changesToJsonArray.forEach { change ->
                add(
                    buildJsonObject {
                        put("id", change.id.value)
                        put("layer", change.layer.wireName)
                        put("classification", change.classification.wireName)
                        put("summary", change.summary)
                        put("evidence", change.evidence.evidenceToJsonArray())
                    },
                )
            }
        }

    private fun List<CompatibilityEvidenceReference>.evidenceToJsonArray(): JsonArray =
        buildJsonArray {
            this@evidenceToJsonArray.forEach { evidence ->
                add(
                    buildJsonObject {
                        put("kind", evidence.kind)
                        put("identity", evidence.identity)
                        put("sha256", evidence.sha256)
                        evidence.location?.let { location -> put("location", location) }
                    },
                )
            }
        }

    private fun markdownEvidence(evidence: List<CompatibilityEvidenceReference>): String =
        evidence.joinToString("<br>") { reference ->
            val location = reference.location?.let { value -> " @ $value" }.orEmpty()
            markdownCell("${reference.kind}: ${reference.identity} (${reference.sha256})$location")
        }

    private fun markdownCell(value: String): String = value.replace("|", "\\|").replace("\r", " ").replace("\n", " ")
}
