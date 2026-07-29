package com.nabobery.sdkgen.engine

import java.nio.file.Path
import kotlin.io.path.readText
import kotlin.test.assertEquals

internal data class ConformanceExclusionDeltaRow(
    val symbolId: String,
    val category: String,
    val jsonPointer: String,
    val reason: String,
) {
    fun identity(): ConformanceExclusionIdentity = ConformanceExclusionIdentity(symbolId, jsonPointer, reason)
}

internal data class ConformanceExclusionIdentity(
    val symbolId: String,
    val jsonPointer: String,
    val reason: String,
)

internal fun GenerationExclusionView.conformanceIdentity(): ConformanceExclusionIdentity =
    ConformanceExclusionIdentity(symbolId, jsonPointer, reason)

internal fun readConformanceExclusionDelta(propertyName: String): List<ConformanceExclusionDeltaRow> {
    val lines =
        Path
            .of(requireNotNull(System.getProperty(propertyName)))
            .readText()
            .lineSequence()
            .filter(String::isNotBlank)
            .toList()
    assertEquals(listOf("symbolId", "category", "jsonPointer", "reason"), lines.first().split('\t'))
    return lines.drop(1).map { line ->
        val values = line.split('\t')
        assertEquals(4, values.size)
        ConformanceExclusionDeltaRow(values[0], values[1], values[2], values[3])
    }
}
