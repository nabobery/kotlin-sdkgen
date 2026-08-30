package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

@ConsistentCopyVisibility
@Serializable
public data class InlineInputsAnyOf2ItemXa13c7c4aInlineInputsAnyOf2ItemAnyOf8X36777044View internal constructor(
  public val content: List<InlineOutputMessageContentItemX9f591485>,
  public val id: String,
  public val phase: InlineOutputMessagePhaseXbea80b9f? = null,
  public val role: InlineOutputMessageRoleXe91a3401,
  public val status: InlineOutputMessageStatusXf8c6547b? = null,
  public val type: InlineOutputMessageTypeXba66a1d6,
)

@ConsistentCopyVisibility
@Serializable
public data class InlineInputsAnyOf2ItemXa13c7c4aInlineInputsAnyOf2ItemAnyOf9X4f11bf21View internal constructor(
  public val content: List<ReasoningTextContent>? = null,
  @SerialName("encrypted_content")
  public val encryptedContent: String? = null,
  public val format: ReasoningFormat? = null,
  public val id: String,
  public val signature: String? = null,
  public val status: InlineOutputItemReasoningStatusX42585cdd? = null,
  public val summary: List<ReasoningSummaryText>,
  public val type: InlineOutputItemReasoningTypeX9f535a4f,
)

public enum class InlineInputsAnyOf2ItemXa13c7c4aBranch {
  ReasoningItem,
  EasyInputMessage,
  InputMessageItem,
  FunctionCallItem,
  FunctionCallOutputItem,
  ApplyPatchCallItem,
  ApplyPatchCallOutputItem,
  InlineInputsAnyOf2ItemAnyOf8X36777044,
  InlineInputsAnyOf2ItemAnyOf9X4f11bf21,
  OutputFunctionCallItem,
  OutputCustomToolCallItem,
  OutputWebSearchCallItem,
  OutputFileSearchCallItem,
  OutputImageGenerationCallItem,
  OutputCodeInterpreterCallItem,
  OutputComputerCallItem,
  OutputDatetimeItem,
  OutputWebSearchServerToolItem,
  OutputCodeInterpreterServerToolItem,
  OutputFileSearchServerToolItem,
  OutputImageGenerationServerToolItem,
  OutputBrowserUseServerToolItem,
  OutputBashServerToolItem,
  OutputTextEditorServerToolItem,
  OutputApplyPatchServerToolItem,
  OutputWebFetchServerToolItem,
  OutputToolSearchServerToolItem,
  OutputMemoryServerToolItem,
  OutputMcpServerToolItem,
  OutputSearchModelsServerToolItem,
  OutputFusionServerToolItem,
  OutputAdvisorServerToolItem,
  OutputSubagentServerToolItem,
  OutputFilesServerToolItem,
  LocalShellCallItem,
  LocalShellCallOutputItem,
  ShellCallItem,
  ShellCallOutputItem,
  McpListToolsItem,
  McpApprovalRequestItem,
  McpApprovalResponseItem,
  McpCallItem,
  CustomToolCallItem,
  CustomToolCallOutputItem,
  CompactionItem,
  ContextCompactionItem,
  ItemReferenceItem,
  AdditionalToolsItem,
  AgentMessageItem,
}

public sealed class InlineInputsAnyOf2ItemXa13c7c4aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInputsAnyOf2ItemXa13c7c4aNoMatchException(
  message: String,
) : InlineInputsAnyOf2ItemXa13c7c4aDecodingException(message)

internal data class InlineInputsAnyOf2ItemXa13c7c4aInspection(
  public val matchesReasoningItem: Boolean,
  public val matchesEasyInputMessage: Boolean,
  public val matchesInputMessageItem: Boolean,
  public val matchesFunctionCallItem: Boolean,
  public val matchesFunctionCallOutputItem: Boolean,
  public val matchesApplyPatchCallItem: Boolean,
  public val matchesApplyPatchCallOutputItem: Boolean,
  public val matchesInlineInputsAnyOf2ItemAnyOf8X36777044: Boolean,
  public val matchesInlineInputsAnyOf2ItemAnyOf9X4f11bf21: Boolean,
  public val matchesOutputFunctionCallItem: Boolean,
  public val matchesOutputCustomToolCallItem: Boolean,
  public val matchesOutputWebSearchCallItem: Boolean,
  public val matchesOutputFileSearchCallItem: Boolean,
  public val matchesOutputImageGenerationCallItem: Boolean,
  public val matchesOutputCodeInterpreterCallItem: Boolean,
  public val matchesOutputComputerCallItem: Boolean,
  public val matchesOutputDatetimeItem: Boolean,
  public val matchesOutputWebSearchServerToolItem: Boolean,
  public val matchesOutputCodeInterpreterServerToolItem: Boolean,
  public val matchesOutputFileSearchServerToolItem: Boolean,
  public val matchesOutputImageGenerationServerToolItem: Boolean,
  public val matchesOutputBrowserUseServerToolItem: Boolean,
  public val matchesOutputBashServerToolItem: Boolean,
  public val matchesOutputTextEditorServerToolItem: Boolean,
  public val matchesOutputApplyPatchServerToolItem: Boolean,
  public val matchesOutputWebFetchServerToolItem: Boolean,
  public val matchesOutputToolSearchServerToolItem: Boolean,
  public val matchesOutputMemoryServerToolItem: Boolean,
  public val matchesOutputMcpServerToolItem: Boolean,
  public val matchesOutputSearchModelsServerToolItem: Boolean,
  public val matchesOutputFusionServerToolItem: Boolean,
  public val matchesOutputAdvisorServerToolItem: Boolean,
  public val matchesOutputSubagentServerToolItem: Boolean,
  public val matchesOutputFilesServerToolItem: Boolean,
  public val matchesLocalShellCallItem: Boolean,
  public val matchesLocalShellCallOutputItem: Boolean,
  public val matchesShellCallItem: Boolean,
  public val matchesShellCallOutputItem: Boolean,
  public val matchesMcpListToolsItem: Boolean,
  public val matchesMcpApprovalRequestItem: Boolean,
  public val matchesMcpApprovalResponseItem: Boolean,
  public val matchesMcpCallItem: Boolean,
  public val matchesCustomToolCallItem: Boolean,
  public val matchesCustomToolCallOutputItem: Boolean,
  public val matchesCompactionItem: Boolean,
  public val matchesContextCompactionItem: Boolean,
  public val matchesItemReferenceItem: Boolean,
  public val matchesAdditionalToolsItem: Boolean,
  public val matchesAgentMessageItem: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesReasoningItem, matchesEasyInputMessage, matchesInputMessageItem, matchesFunctionCallItem, matchesFunctionCallOutputItem, matchesApplyPatchCallItem, matchesApplyPatchCallOutputItem, matchesInlineInputsAnyOf2ItemAnyOf8X36777044, matchesInlineInputsAnyOf2ItemAnyOf9X4f11bf21, matchesOutputFunctionCallItem, matchesOutputCustomToolCallItem, matchesOutputWebSearchCallItem, matchesOutputFileSearchCallItem, matchesOutputImageGenerationCallItem, matchesOutputCodeInterpreterCallItem, matchesOutputComputerCallItem, matchesOutputDatetimeItem, matchesOutputWebSearchServerToolItem, matchesOutputCodeInterpreterServerToolItem, matchesOutputFileSearchServerToolItem, matchesOutputImageGenerationServerToolItem, matchesOutputBrowserUseServerToolItem, matchesOutputBashServerToolItem, matchesOutputTextEditorServerToolItem, matchesOutputApplyPatchServerToolItem, matchesOutputWebFetchServerToolItem, matchesOutputToolSearchServerToolItem, matchesOutputMemoryServerToolItem, matchesOutputMcpServerToolItem, matchesOutputSearchModelsServerToolItem, matchesOutputFusionServerToolItem, matchesOutputAdvisorServerToolItem, matchesOutputSubagentServerToolItem, matchesOutputFilesServerToolItem, matchesLocalShellCallItem, matchesLocalShellCallOutputItem, matchesShellCallItem, matchesShellCallOutputItem, matchesMcpListToolsItem, matchesMcpApprovalRequestItem, matchesMcpApprovalResponseItem, matchesMcpCallItem, matchesCustomToolCallItem, matchesCustomToolCallOutputItem, matchesCompactionItem, matchesContextCompactionItem, matchesItemReferenceItem, matchesAdditionalToolsItem, matchesAgentMessageItem).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/Inputs/anyOf/1/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Inputs/anyOf/1/items
 */
@Serializable(with = InlineInputsAnyOf2ItemXa13c7c4a.Serializer::class)
public class InlineInputsAnyOf2ItemXa13c7c4a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInputsAnyOf2ItemXa13c7c4aInspection,
) {
  public val reasoningItem: ReasoningItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesReasoningItem) json.decodeFromJsonElement<ReasoningItemView>(raw) else null }

  public val easyInputMessage: EasyInputMessageView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesEasyInputMessage) json.decodeFromJsonElement<EasyInputMessageView>(raw) else null }

  public val inputMessageItem: InputMessageItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInputMessageItem) json.decodeFromJsonElement<InputMessageItemView>(raw) else null }

  public val functionCallItem: FunctionCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFunctionCallItem) json.decodeFromJsonElement<FunctionCallItemView>(raw) else null }

  public val functionCallOutputItem: FunctionCallOutputItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFunctionCallOutputItem) json.decodeFromJsonElement<FunctionCallOutputItemView>(raw) else null }

  public val applyPatchCallItem: ApplyPatchCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplyPatchCallItem) json.decodeFromJsonElement<ApplyPatchCallItemView>(raw) else null }

  public val applyPatchCallOutputItem: ApplyPatchCallOutputItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplyPatchCallOutputItem) json.decodeFromJsonElement<ApplyPatchCallOutputItemView>(raw) else null }

  public val inlineInputsAnyOf2ItemAnyOf8X36777044:
      InlineInputsAnyOf2ItemXa13c7c4aInlineInputsAnyOf2ItemAnyOf8X36777044View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineInputsAnyOf2ItemAnyOf8X36777044) json.decodeFromJsonElement<InlineInputsAnyOf2ItemXa13c7c4aInlineInputsAnyOf2ItemAnyOf8X36777044View>(raw) else null }

  public val inlineInputsAnyOf2ItemAnyOf9X4f11bf21:
      InlineInputsAnyOf2ItemXa13c7c4aInlineInputsAnyOf2ItemAnyOf9X4f11bf21View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineInputsAnyOf2ItemAnyOf9X4f11bf21) json.decodeFromJsonElement<InlineInputsAnyOf2ItemXa13c7c4aInlineInputsAnyOf2ItemAnyOf9X4f11bf21View>(raw) else null }

  public val outputFunctionCallItem: OutputFunctionCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputFunctionCallItem) json.decodeFromJsonElement<OutputFunctionCallItemView>(raw) else null }

  public val outputCustomToolCallItem: OutputCustomToolCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputCustomToolCallItem) json.decodeFromJsonElement<OutputCustomToolCallItemView>(raw) else null }

  public val outputWebSearchCallItem: OutputWebSearchCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputWebSearchCallItem) json.decodeFromJsonElement<OutputWebSearchCallItemView>(raw) else null }

  public val outputFileSearchCallItem: OutputFileSearchCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputFileSearchCallItem) json.decodeFromJsonElement<OutputFileSearchCallItemView>(raw) else null }

  public val outputImageGenerationCallItem: OutputImageGenerationCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputImageGenerationCallItem) json.decodeFromJsonElement<OutputImageGenerationCallItemView>(raw) else null }

  public val outputCodeInterpreterCallItem: OutputCodeInterpreterCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputCodeInterpreterCallItem) json.decodeFromJsonElement<OutputCodeInterpreterCallItemView>(raw) else null }

  public val outputComputerCallItem: OutputComputerCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputComputerCallItem) json.decodeFromJsonElement<OutputComputerCallItemView>(raw) else null }

  public val outputDatetimeItem: OutputDatetimeItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputDatetimeItem) json.decodeFromJsonElement<OutputDatetimeItemView>(raw) else null }

  public val outputWebSearchServerToolItem: OutputWebSearchServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputWebSearchServerToolItem) json.decodeFromJsonElement<OutputWebSearchServerToolItemView>(raw) else null }

  public val outputCodeInterpreterServerToolItem: OutputCodeInterpreterServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputCodeInterpreterServerToolItem) json.decodeFromJsonElement<OutputCodeInterpreterServerToolItemView>(raw) else null }

  public val outputFileSearchServerToolItem: OutputFileSearchServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputFileSearchServerToolItem) json.decodeFromJsonElement<OutputFileSearchServerToolItemView>(raw) else null }

  public val outputImageGenerationServerToolItem: OutputImageGenerationServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputImageGenerationServerToolItem) json.decodeFromJsonElement<OutputImageGenerationServerToolItemView>(raw) else null }

  public val outputBrowserUseServerToolItem: OutputBrowserUseServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputBrowserUseServerToolItem) json.decodeFromJsonElement<OutputBrowserUseServerToolItemView>(raw) else null }

  public val outputBashServerToolItem: OutputBashServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputBashServerToolItem) json.decodeFromJsonElement<OutputBashServerToolItemView>(raw) else null }

  public val outputTextEditorServerToolItem: OutputTextEditorServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputTextEditorServerToolItem) json.decodeFromJsonElement<OutputTextEditorServerToolItemView>(raw) else null }

  public val outputApplyPatchServerToolItem: OutputApplyPatchServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputApplyPatchServerToolItem) json.decodeFromJsonElement<OutputApplyPatchServerToolItemView>(raw) else null }

  public val outputWebFetchServerToolItem: OutputWebFetchServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputWebFetchServerToolItem) json.decodeFromJsonElement<OutputWebFetchServerToolItemView>(raw) else null }

  public val outputToolSearchServerToolItem: OutputToolSearchServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputToolSearchServerToolItem) json.decodeFromJsonElement<OutputToolSearchServerToolItemView>(raw) else null }

  public val outputMemoryServerToolItem: OutputMemoryServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputMemoryServerToolItem) json.decodeFromJsonElement<OutputMemoryServerToolItemView>(raw) else null }

  public val outputMcpServerToolItem: OutputMcpServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputMcpServerToolItem) json.decodeFromJsonElement<OutputMcpServerToolItemView>(raw) else null }

  public val outputSearchModelsServerToolItem: OutputSearchModelsServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputSearchModelsServerToolItem) json.decodeFromJsonElement<OutputSearchModelsServerToolItemView>(raw) else null }

  public val outputFusionServerToolItem: OutputFusionServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputFusionServerToolItem) json.decodeFromJsonElement<OutputFusionServerToolItemView>(raw) else null }

  public val outputAdvisorServerToolItem: OutputAdvisorServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputAdvisorServerToolItem) json.decodeFromJsonElement<OutputAdvisorServerToolItemView>(raw) else null }

  public val outputSubagentServerToolItem: OutputSubagentServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputSubagentServerToolItem) json.decodeFromJsonElement<OutputSubagentServerToolItemView>(raw) else null }

  public val outputFilesServerToolItem: OutputFilesServerToolItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputFilesServerToolItem) json.decodeFromJsonElement<OutputFilesServerToolItemView>(raw) else null }

  public val localShellCallItem: LocalShellCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLocalShellCallItem) json.decodeFromJsonElement<LocalShellCallItemView>(raw) else null }

  public val localShellCallOutputItem: LocalShellCallOutputItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLocalShellCallOutputItem) json.decodeFromJsonElement<LocalShellCallOutputItemView>(raw) else null }

  public val shellCallItem: ShellCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShellCallItem) json.decodeFromJsonElement<ShellCallItemView>(raw) else null }

  public val shellCallOutputItem: ShellCallOutputItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShellCallOutputItem) json.decodeFromJsonElement<ShellCallOutputItemView>(raw) else null }

  public val mcpListToolsItem: McpListToolsItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMcpListToolsItem) json.decodeFromJsonElement<McpListToolsItemView>(raw) else null }

  public val mcpApprovalRequestItem: McpApprovalRequestItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMcpApprovalRequestItem) json.decodeFromJsonElement<McpApprovalRequestItemView>(raw) else null }

  public val mcpApprovalResponseItem: McpApprovalResponseItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMcpApprovalResponseItem) json.decodeFromJsonElement<McpApprovalResponseItemView>(raw) else null }

  public val mcpCallItem: McpCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMcpCallItem) json.decodeFromJsonElement<McpCallItemView>(raw) else null }

  public val customToolCallItem: CustomToolCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomToolCallItem) json.decodeFromJsonElement<CustomToolCallItemView>(raw) else null }

  public val customToolCallOutputItem: CustomToolCallOutputItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomToolCallOutputItem) json.decodeFromJsonElement<CustomToolCallOutputItemView>(raw) else null }

  public val compactionItem: CompactionItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCompactionItem) json.decodeFromJsonElement<CompactionItemView>(raw) else null }

  public val contextCompactionItem: ContextCompactionItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesContextCompactionItem) json.decodeFromJsonElement<ContextCompactionItemView>(raw) else null }

  public val itemReferenceItem: ItemReferenceItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesItemReferenceItem) json.decodeFromJsonElement<ItemReferenceItemView>(raw) else null }

  public val additionalToolsItem: AdditionalToolsItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAdditionalToolsItem) json.decodeFromJsonElement<AdditionalToolsItemView>(raw) else null }

  public val agentMessageItem: AgentMessageItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAgentMessageItem) json.decodeFromJsonElement<AgentMessageItemView>(raw) else null }

  public val matchedBranches: Set<InlineInputsAnyOf2ItemXa13c7c4aBranch>
    get() = buildSet {
      if (inspection.matchesReasoningItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.ReasoningItem)
      if (inspection.matchesEasyInputMessage) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.EasyInputMessage)
      if (inspection.matchesInputMessageItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.InputMessageItem)
      if (inspection.matchesFunctionCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.FunctionCallItem)
      if (inspection.matchesFunctionCallOutputItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.FunctionCallOutputItem)
      if (inspection.matchesApplyPatchCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.ApplyPatchCallItem)
      if (inspection.matchesApplyPatchCallOutputItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.ApplyPatchCallOutputItem)
      if (inspection.matchesInlineInputsAnyOf2ItemAnyOf8X36777044) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.InlineInputsAnyOf2ItemAnyOf8X36777044)
      if (inspection.matchesInlineInputsAnyOf2ItemAnyOf9X4f11bf21) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.InlineInputsAnyOf2ItemAnyOf9X4f11bf21)
      if (inspection.matchesOutputFunctionCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputFunctionCallItem)
      if (inspection.matchesOutputCustomToolCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputCustomToolCallItem)
      if (inspection.matchesOutputWebSearchCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputWebSearchCallItem)
      if (inspection.matchesOutputFileSearchCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputFileSearchCallItem)
      if (inspection.matchesOutputImageGenerationCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputImageGenerationCallItem)
      if (inspection.matchesOutputCodeInterpreterCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputCodeInterpreterCallItem)
      if (inspection.matchesOutputComputerCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputComputerCallItem)
      if (inspection.matchesOutputDatetimeItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputDatetimeItem)
      if (inspection.matchesOutputWebSearchServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputWebSearchServerToolItem)
      if (inspection.matchesOutputCodeInterpreterServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputCodeInterpreterServerToolItem)
      if (inspection.matchesOutputFileSearchServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputFileSearchServerToolItem)
      if (inspection.matchesOutputImageGenerationServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputImageGenerationServerToolItem)
      if (inspection.matchesOutputBrowserUseServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputBrowserUseServerToolItem)
      if (inspection.matchesOutputBashServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputBashServerToolItem)
      if (inspection.matchesOutputTextEditorServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputTextEditorServerToolItem)
      if (inspection.matchesOutputApplyPatchServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputApplyPatchServerToolItem)
      if (inspection.matchesOutputWebFetchServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputWebFetchServerToolItem)
      if (inspection.matchesOutputToolSearchServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputToolSearchServerToolItem)
      if (inspection.matchesOutputMemoryServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputMemoryServerToolItem)
      if (inspection.matchesOutputMcpServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputMcpServerToolItem)
      if (inspection.matchesOutputSearchModelsServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputSearchModelsServerToolItem)
      if (inspection.matchesOutputFusionServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputFusionServerToolItem)
      if (inspection.matchesOutputAdvisorServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputAdvisorServerToolItem)
      if (inspection.matchesOutputSubagentServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputSubagentServerToolItem)
      if (inspection.matchesOutputFilesServerToolItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.OutputFilesServerToolItem)
      if (inspection.matchesLocalShellCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.LocalShellCallItem)
      if (inspection.matchesLocalShellCallOutputItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.LocalShellCallOutputItem)
      if (inspection.matchesShellCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.ShellCallItem)
      if (inspection.matchesShellCallOutputItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.ShellCallOutputItem)
      if (inspection.matchesMcpListToolsItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.McpListToolsItem)
      if (inspection.matchesMcpApprovalRequestItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.McpApprovalRequestItem)
      if (inspection.matchesMcpApprovalResponseItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.McpApprovalResponseItem)
      if (inspection.matchesMcpCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.McpCallItem)
      if (inspection.matchesCustomToolCallItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.CustomToolCallItem)
      if (inspection.matchesCustomToolCallOutputItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.CustomToolCallOutputItem)
      if (inspection.matchesCompactionItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.CompactionItem)
      if (inspection.matchesContextCompactionItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.ContextCompactionItem)
      if (inspection.matchesItemReferenceItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.ItemReferenceItem)
      if (inspection.matchesAdditionalToolsItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.AdditionalToolsItem)
      if (inspection.matchesAgentMessageItem) add(InlineInputsAnyOf2ItemXa13c7c4aBranch.AgentMessageItem)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInputsAnyOf2ItemXa13c7c4a {
      val inspection = inspectInlineInputsAnyOf2ItemXa13c7c4a(raw)
      if (inspection.matchCount == 0) {
        throw InlineInputsAnyOf2ItemXa13c7c4aNoMatchException("InlineInputsAnyOf2ItemXa13c7c4a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInputsAnyOf2ItemXa13c7c4a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInputsAnyOf2ItemXa13c7c4a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInputsAnyOf2ItemXa13c7c4a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInputsAnyOf2ItemXa13c7c4a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInputsAnyOf2ItemXa13c7c4a) {
      encoder.requireJsonEncoder("InlineInputsAnyOf2ItemXa13c7c4a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInputsAnyOf2ItemXa13c7c4a(element: JsonElement): InlineInputsAnyOf2ItemXa13c7c4aInspection {
  val raw = element as? JsonObject ?: return InlineInputsAnyOf2ItemXa13c7c4aInspection(
    matchesReasoningItem = false,
    matchesEasyInputMessage = false,
    matchesInputMessageItem = false,
    matchesFunctionCallItem = false,
    matchesFunctionCallOutputItem = false,
    matchesApplyPatchCallItem = false,
    matchesApplyPatchCallOutputItem = false,
    matchesInlineInputsAnyOf2ItemAnyOf8X36777044 = false,
    matchesInlineInputsAnyOf2ItemAnyOf9X4f11bf21 = false,
    matchesOutputFunctionCallItem = false,
    matchesOutputCustomToolCallItem = false,
    matchesOutputWebSearchCallItem = false,
    matchesOutputFileSearchCallItem = false,
    matchesOutputImageGenerationCallItem = false,
    matchesOutputCodeInterpreterCallItem = false,
    matchesOutputComputerCallItem = false,
    matchesOutputDatetimeItem = false,
    matchesOutputWebSearchServerToolItem = false,
    matchesOutputCodeInterpreterServerToolItem = false,
    matchesOutputFileSearchServerToolItem = false,
    matchesOutputImageGenerationServerToolItem = false,
    matchesOutputBrowserUseServerToolItem = false,
    matchesOutputBashServerToolItem = false,
    matchesOutputTextEditorServerToolItem = false,
    matchesOutputApplyPatchServerToolItem = false,
    matchesOutputWebFetchServerToolItem = false,
    matchesOutputToolSearchServerToolItem = false,
    matchesOutputMemoryServerToolItem = false,
    matchesOutputMcpServerToolItem = false,
    matchesOutputSearchModelsServerToolItem = false,
    matchesOutputFusionServerToolItem = false,
    matchesOutputAdvisorServerToolItem = false,
    matchesOutputSubagentServerToolItem = false,
    matchesOutputFilesServerToolItem = false,
    matchesLocalShellCallItem = false,
    matchesLocalShellCallOutputItem = false,
    matchesShellCallItem = false,
    matchesShellCallOutputItem = false,
    matchesMcpListToolsItem = false,
    matchesMcpApprovalRequestItem = false,
    matchesMcpApprovalResponseItem = false,
    matchesMcpCallItem = false,
    matchesCustomToolCallItem = false,
    matchesCustomToolCallOutputItem = false,
    matchesCompactionItem = false,
    matchesContextCompactionItem = false,
    matchesItemReferenceItem = false,
    matchesAdditionalToolsItem = false,
    matchesAgentMessageItem = false,
    failures = listOf("ReasoningItem: expected JSON object", "EasyInputMessage: expected JSON object", "InputMessageItem: expected JSON object", "FunctionCallItem: expected JSON object", "FunctionCallOutputItem: expected JSON object", "ApplyPatchCallItem: expected JSON object", "ApplyPatchCallOutputItem: expected JSON object", "InlineInputsAnyOf2ItemAnyOf8X36777044: expected JSON object", "InlineInputsAnyOf2ItemAnyOf9X4f11bf21: expected JSON object", "OutputFunctionCallItem: expected JSON object", "OutputCustomToolCallItem: expected JSON object", "OutputWebSearchCallItem: expected JSON object", "OutputFileSearchCallItem: expected JSON object", "OutputImageGenerationCallItem: expected JSON object", "OutputCodeInterpreterCallItem: expected JSON object", "OutputComputerCallItem: expected JSON object", "OutputDatetimeItem: expected JSON object", "OutputWebSearchServerToolItem: expected JSON object", "OutputCodeInterpreterServerToolItem: expected JSON object", "OutputFileSearchServerToolItem: expected JSON object", "OutputImageGenerationServerToolItem: expected JSON object", "OutputBrowserUseServerToolItem: expected JSON object", "OutputBashServerToolItem: expected JSON object", "OutputTextEditorServerToolItem: expected JSON object", "OutputApplyPatchServerToolItem: expected JSON object", "OutputWebFetchServerToolItem: expected JSON object", "OutputToolSearchServerToolItem: expected JSON object", "OutputMemoryServerToolItem: expected JSON object", "OutputMcpServerToolItem: expected JSON object", "OutputSearchModelsServerToolItem: expected JSON object", "OutputFusionServerToolItem: expected JSON object", "OutputAdvisorServerToolItem: expected JSON object", "OutputSubagentServerToolItem: expected JSON object", "OutputFilesServerToolItem: expected JSON object", "LocalShellCallItem: expected JSON object", "LocalShellCallOutputItem: expected JSON object", "ShellCallItem: expected JSON object", "ShellCallOutputItem: expected JSON object", "McpListToolsItem: expected JSON object", "McpApprovalRequestItem: expected JSON object", "McpApprovalResponseItem: expected JSON object", "McpCallItem: expected JSON object", "CustomToolCallItem: expected JSON object", "CustomToolCallOutputItem: expected JSON object", "CompactionItem: expected JSON object", "ContextCompactionItem: expected JSON object", "ItemReferenceItem: expected JSON object", "AdditionalToolsItem: expected JSON object", "AgentMessageItem: expected JSON object"),
  )
  val matchesReasoningItem = raw["id"].isString() && raw["summary"] != null && raw["type"] != null
  val matchesEasyInputMessage = raw["role"] != null
  val matchesInputMessageItem = raw["role"] != null
  val matchesFunctionCallItem = raw["arguments"].isString() && raw["call_id"].isString() && raw["name"].isString() && raw["type"] != null
  val matchesFunctionCallOutputItem = raw["call_id"].isString() && raw["output"] != null && raw["type"] != null
  val matchesApplyPatchCallItem = raw["call_id"].isString() && raw["operation"] != null && raw["status"] != null && raw["type"] != null
  val matchesApplyPatchCallOutputItem = raw["call_id"].isString() && raw["status"] != null && raw["type"] != null
  val matchesInlineInputsAnyOf2ItemAnyOf8X36777044 = raw["content"] != null && raw["id"].isString() && raw["role"] != null && raw["type"] != null
  val matchesInlineInputsAnyOf2ItemAnyOf9X4f11bf21 = raw["id"].isString() && raw["summary"] != null && raw["type"] != null
  val matchesOutputFunctionCallItem = raw["arguments"].isString() && raw["call_id"].isString() && raw["name"].isString() && raw["type"] != null
  val matchesOutputCustomToolCallItem = raw["call_id"].isString() && raw["input"].isString() && raw["name"].isString() && raw["type"] != null
  val matchesOutputWebSearchCallItem = raw["id"].isString() && raw["status"] != null && raw["type"] != null
  val matchesOutputFileSearchCallItem = raw["id"].isString() && raw["queries"].isStringArray() && raw["status"] != null && raw["type"] != null
  val matchesOutputImageGenerationCallItem = raw["id"].isString() && raw["status"] != null && raw["type"] != null
  val matchesOutputCodeInterpreterCallItem = raw["code"].isString() && raw["container_id"].isString() && raw["id"].isString() && raw["outputs"] != null && raw["status"] != null && raw["type"] != null
  val matchesOutputComputerCallItem = raw["call_id"].isString() && raw["pending_safety_checks"] != null && raw["status"] != null && raw["type"] != null
  val matchesOutputDatetimeItem = raw["datetime"].isString() && raw["status"] != null && raw["timezone"].isString() && raw["type"] != null
  val matchesOutputWebSearchServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputCodeInterpreterServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputFileSearchServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputImageGenerationServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputBrowserUseServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputBashServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputTextEditorServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputApplyPatchServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputWebFetchServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputToolSearchServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputMemoryServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputMcpServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputSearchModelsServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputFusionServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputAdvisorServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputSubagentServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesOutputFilesServerToolItem = raw["status"] != null && raw["type"] != null
  val matchesLocalShellCallItem = raw["action"] != null && raw["call_id"].isString() && raw["id"].isString() && raw["status"] != null && raw["type"] != null
  val matchesLocalShellCallOutputItem = raw["id"].isString() && raw["output"].isString() && raw["type"] != null
  val matchesShellCallItem = raw["action"] != null && raw["call_id"].isString() && raw["type"] != null
  val matchesShellCallOutputItem = raw["call_id"].isString() && raw["output"] != null && raw["type"] != null
  val matchesMcpListToolsItem = raw["id"].isString() && raw["server_label"].isString() && raw["tools"] != null && raw["type"] != null
  val matchesMcpApprovalRequestItem = raw["arguments"].isString() && raw["id"].isString() && raw["name"].isString() && raw["server_label"].isString() && raw["type"] != null
  val matchesMcpApprovalResponseItem = raw["approval_request_id"].isString() && raw["approve"] != null && raw["type"] != null
  val matchesMcpCallItem = raw["arguments"].isString() && raw["id"].isString() && raw["name"].isString() && raw["server_label"].isString() && raw["type"] != null
  val matchesCustomToolCallItem = raw["call_id"].isString() && raw["input"].isString() && raw["name"].isString() && raw["type"] != null
  val matchesCustomToolCallOutputItem = raw["call_id"].isString() && raw["output"] != null && raw["type"] != null
  val matchesCompactionItem = raw["encrypted_content"].isString() && raw["type"] != null
  val matchesContextCompactionItem = raw["type"] != null
  val matchesItemReferenceItem = raw["id"].isString() && raw["type"] != null
  val matchesAdditionalToolsItem = raw["role"] != null && raw["tools"] != null && raw["type"] != null
  val matchesAgentMessageItem = raw["author"].isString() && raw["content"] != null && raw["recipient"].isString() && raw["type"] != null
  return InlineInputsAnyOf2ItemXa13c7c4aInspection(
    matchesReasoningItem = matchesReasoningItem,
    matchesEasyInputMessage = matchesEasyInputMessage,
    matchesInputMessageItem = matchesInputMessageItem,
    matchesFunctionCallItem = matchesFunctionCallItem,
    matchesFunctionCallOutputItem = matchesFunctionCallOutputItem,
    matchesApplyPatchCallItem = matchesApplyPatchCallItem,
    matchesApplyPatchCallOutputItem = matchesApplyPatchCallOutputItem,
    matchesInlineInputsAnyOf2ItemAnyOf8X36777044 = matchesInlineInputsAnyOf2ItemAnyOf8X36777044,
    matchesInlineInputsAnyOf2ItemAnyOf9X4f11bf21 = matchesInlineInputsAnyOf2ItemAnyOf9X4f11bf21,
    matchesOutputFunctionCallItem = matchesOutputFunctionCallItem,
    matchesOutputCustomToolCallItem = matchesOutputCustomToolCallItem,
    matchesOutputWebSearchCallItem = matchesOutputWebSearchCallItem,
    matchesOutputFileSearchCallItem = matchesOutputFileSearchCallItem,
    matchesOutputImageGenerationCallItem = matchesOutputImageGenerationCallItem,
    matchesOutputCodeInterpreterCallItem = matchesOutputCodeInterpreterCallItem,
    matchesOutputComputerCallItem = matchesOutputComputerCallItem,
    matchesOutputDatetimeItem = matchesOutputDatetimeItem,
    matchesOutputWebSearchServerToolItem = matchesOutputWebSearchServerToolItem,
    matchesOutputCodeInterpreterServerToolItem = matchesOutputCodeInterpreterServerToolItem,
    matchesOutputFileSearchServerToolItem = matchesOutputFileSearchServerToolItem,
    matchesOutputImageGenerationServerToolItem = matchesOutputImageGenerationServerToolItem,
    matchesOutputBrowserUseServerToolItem = matchesOutputBrowserUseServerToolItem,
    matchesOutputBashServerToolItem = matchesOutputBashServerToolItem,
    matchesOutputTextEditorServerToolItem = matchesOutputTextEditorServerToolItem,
    matchesOutputApplyPatchServerToolItem = matchesOutputApplyPatchServerToolItem,
    matchesOutputWebFetchServerToolItem = matchesOutputWebFetchServerToolItem,
    matchesOutputToolSearchServerToolItem = matchesOutputToolSearchServerToolItem,
    matchesOutputMemoryServerToolItem = matchesOutputMemoryServerToolItem,
    matchesOutputMcpServerToolItem = matchesOutputMcpServerToolItem,
    matchesOutputSearchModelsServerToolItem = matchesOutputSearchModelsServerToolItem,
    matchesOutputFusionServerToolItem = matchesOutputFusionServerToolItem,
    matchesOutputAdvisorServerToolItem = matchesOutputAdvisorServerToolItem,
    matchesOutputSubagentServerToolItem = matchesOutputSubagentServerToolItem,
    matchesOutputFilesServerToolItem = matchesOutputFilesServerToolItem,
    matchesLocalShellCallItem = matchesLocalShellCallItem,
    matchesLocalShellCallOutputItem = matchesLocalShellCallOutputItem,
    matchesShellCallItem = matchesShellCallItem,
    matchesShellCallOutputItem = matchesShellCallOutputItem,
    matchesMcpListToolsItem = matchesMcpListToolsItem,
    matchesMcpApprovalRequestItem = matchesMcpApprovalRequestItem,
    matchesMcpApprovalResponseItem = matchesMcpApprovalResponseItem,
    matchesMcpCallItem = matchesMcpCallItem,
    matchesCustomToolCallItem = matchesCustomToolCallItem,
    matchesCustomToolCallOutputItem = matchesCustomToolCallOutputItem,
    matchesCompactionItem = matchesCompactionItem,
    matchesContextCompactionItem = matchesContextCompactionItem,
    matchesItemReferenceItem = matchesItemReferenceItem,
    matchesAdditionalToolsItem = matchesAdditionalToolsItem,
    matchesAgentMessageItem = matchesAgentMessageItem,
    failures = buildList {
      if (!matchesReasoningItem) add("ReasoningItem: required properties 'id', 'summary', 'type' do not match their declared types")
      if (!matchesEasyInputMessage) add("EasyInputMessage: required properties 'role' do not match their declared types")
      if (!matchesInputMessageItem) add("InputMessageItem: required properties 'role' do not match their declared types")
      if (!matchesFunctionCallItem) add("FunctionCallItem: required properties 'arguments', 'call_id', 'name', 'type' do not match their declared types")
      if (!matchesFunctionCallOutputItem) add("FunctionCallOutputItem: required properties 'call_id', 'output', 'type' do not match their declared types")
      if (!matchesApplyPatchCallItem) add("ApplyPatchCallItem: required properties 'call_id', 'operation', 'status', 'type' do not match their declared types")
      if (!matchesApplyPatchCallOutputItem) add("ApplyPatchCallOutputItem: required properties 'call_id', 'status', 'type' do not match their declared types")
      if (!matchesInlineInputsAnyOf2ItemAnyOf8X36777044) add("InlineInputsAnyOf2ItemAnyOf8X36777044: required properties 'content', 'id', 'role', 'type' do not match their declared types")
      if (!matchesInlineInputsAnyOf2ItemAnyOf9X4f11bf21) add("InlineInputsAnyOf2ItemAnyOf9X4f11bf21: required properties 'id', 'summary', 'type' do not match their declared types")
      if (!matchesOutputFunctionCallItem) add("OutputFunctionCallItem: required properties 'arguments', 'call_id', 'name', 'type' do not match their declared types")
      if (!matchesOutputCustomToolCallItem) add("OutputCustomToolCallItem: required properties 'call_id', 'input', 'name', 'type' do not match their declared types")
      if (!matchesOutputWebSearchCallItem) add("OutputWebSearchCallItem: required properties 'id', 'status', 'type' do not match their declared types")
      if (!matchesOutputFileSearchCallItem) add("OutputFileSearchCallItem: required properties 'id', 'queries', 'status', 'type' do not match their declared types")
      if (!matchesOutputImageGenerationCallItem) add("OutputImageGenerationCallItem: required properties 'id', 'status', 'type' do not match their declared types")
      if (!matchesOutputCodeInterpreterCallItem) add("OutputCodeInterpreterCallItem: required properties 'code', 'container_id', 'id', 'outputs', 'status', 'type' do not match their declared types")
      if (!matchesOutputComputerCallItem) add("OutputComputerCallItem: required properties 'call_id', 'pending_safety_checks', 'status', 'type' do not match their declared types")
      if (!matchesOutputDatetimeItem) add("OutputDatetimeItem: required properties 'datetime', 'status', 'timezone', 'type' do not match their declared types")
      if (!matchesOutputWebSearchServerToolItem) add("OutputWebSearchServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputCodeInterpreterServerToolItem) add("OutputCodeInterpreterServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputFileSearchServerToolItem) add("OutputFileSearchServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputImageGenerationServerToolItem) add("OutputImageGenerationServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputBrowserUseServerToolItem) add("OutputBrowserUseServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputBashServerToolItem) add("OutputBashServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputTextEditorServerToolItem) add("OutputTextEditorServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputApplyPatchServerToolItem) add("OutputApplyPatchServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputWebFetchServerToolItem) add("OutputWebFetchServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputToolSearchServerToolItem) add("OutputToolSearchServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputMemoryServerToolItem) add("OutputMemoryServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputMcpServerToolItem) add("OutputMcpServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputSearchModelsServerToolItem) add("OutputSearchModelsServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputFusionServerToolItem) add("OutputFusionServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputAdvisorServerToolItem) add("OutputAdvisorServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputSubagentServerToolItem) add("OutputSubagentServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesOutputFilesServerToolItem) add("OutputFilesServerToolItem: required properties 'status', 'type' do not match their declared types")
      if (!matchesLocalShellCallItem) add("LocalShellCallItem: required properties 'action', 'call_id', 'id', 'status', 'type' do not match their declared types")
      if (!matchesLocalShellCallOutputItem) add("LocalShellCallOutputItem: required properties 'id', 'output', 'type' do not match their declared types")
      if (!matchesShellCallItem) add("ShellCallItem: required properties 'action', 'call_id', 'type' do not match their declared types")
      if (!matchesShellCallOutputItem) add("ShellCallOutputItem: required properties 'call_id', 'output', 'type' do not match their declared types")
      if (!matchesMcpListToolsItem) add("McpListToolsItem: required properties 'id', 'server_label', 'tools', 'type' do not match their declared types")
      if (!matchesMcpApprovalRequestItem) add("McpApprovalRequestItem: required properties 'arguments', 'id', 'name', 'server_label', 'type' do not match their declared types")
      if (!matchesMcpApprovalResponseItem) add("McpApprovalResponseItem: required properties 'approval_request_id', 'approve', 'type' do not match their declared types")
      if (!matchesMcpCallItem) add("McpCallItem: required properties 'arguments', 'id', 'name', 'server_label', 'type' do not match their declared types")
      if (!matchesCustomToolCallItem) add("CustomToolCallItem: required properties 'call_id', 'input', 'name', 'type' do not match their declared types")
      if (!matchesCustomToolCallOutputItem) add("CustomToolCallOutputItem: required properties 'call_id', 'output', 'type' do not match their declared types")
      if (!matchesCompactionItem) add("CompactionItem: required properties 'encrypted_content', 'type' do not match their declared types")
      if (!matchesContextCompactionItem) add("ContextCompactionItem: required properties 'type' do not match their declared types")
      if (!matchesItemReferenceItem) add("ItemReferenceItem: required properties 'id', 'type' do not match their declared types")
      if (!matchesAdditionalToolsItem) add("AdditionalToolsItem: required properties 'role', 'tools', 'type' do not match their declared types")
      if (!matchesAgentMessageItem) add("AgentMessageItem: required properties 'author', 'content', 'recipient', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
