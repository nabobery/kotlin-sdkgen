package com.nabobery.sdkgen.openapi

import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SnapshotRenderer
import kotlin.io.path.exists
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class OpenRouterSubsetSnapshotTest {
    private val adapter = SemanticAdapter()

    @Test
    fun `phase one OpenRouter subset snapshot is byte identical across two runs`() {
        val fixture = ExperimentSupport.openRouterFixture
        val first = adapter.adapt(fixture).document.phaseOneSubset()
        val second = adapter.adapt(fixture).document.phaseOneSubset()
        val firstBytes = SnapshotRenderer.render(first)
        val secondBytes = SnapshotRenderer.render(second)
        val snapshotPath = ExperimentSupport.snapshotRoot.resolve("openrouter-phase1-subset.txt")

        assertEquals(PHASE_ONE_OPERATION_IDS, first.operations.map { it.operationId }.toSet())
        assertEquals(
            PHASE_ONE_SCHEMA_NAMES,
            first.schemas.keys
                .map(SchemaId::componentName)
                .toSet(),
        )
        assertEquals(firstBytes, secondBytes)

        if (System.getenv("UPDATE_SNAPSHOTS") == "1") {
            snapshotPath.writeText(firstBytes)
        } else {
            assertTrue(snapshotPath.exists(), "missing snapshot $snapshotPath")
            assertEquals(snapshotPath.readText(), firstBytes)
        }
    }
}

private val PHASE_ONE_OPERATION_IDS =
    setOf(
        "createResponses",
        "getGeneration",
        "getModels",
        "listProviders",
        "sendChatCompletionRequest",
    )

private val PHASE_ONE_SCHEMA_NAMES =
    setOf(
        "BaseReasoningConfig",
        "ChatRequest",
        "ChatUsage",
        "Model",
        "ModelsListResponse",
        "ProviderPreferences",
        "ProviderResponse",
    )

private fun SemanticDocument.phaseOneSubset(): SemanticDocument =
    copy(
        schemas = schemas.filterKeys { it.componentName() in PHASE_ONE_SCHEMA_NAMES }.toSortedMap(),
        operations = operations.filter { it.operationId in PHASE_ONE_OPERATION_IDS },
        diagnostics = emptyList(),
    )

private fun SchemaId.componentName(): String = value.substringAfterLast('/')
