package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
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
public data class InlineResponsesRequestToolsItemXf7c3ac6cInlineResponsesRequestToolsItemAnyOf1Xdfe01760View internal constructor(
  public val description: String? = null,
  public val name: String,
  public val parameters: Map<String, JsonElement?>?,
  public val strict: Boolean? = null,
  public val type: InlineFunctionToolTypeX23edb1b8,
)

public enum class InlineResponsesRequestToolsItemXf7c3ac6cBranch {
  InlineResponsesRequestToolsItemAnyOf1Xdfe01760,
  PreviewWebSearchServerTool,
  Preview20250311WebSearchServerTool,
  LegacyWebSearchServerTool,
  WebSearchServerTool,
  FileSearchServerTool,
  ComputerUseServerTool,
  CodeInterpreterServerTool,
  McpServerTool,
  ImageGenerationServerTool,
  CodexLocalShellTool,
  ShellServerTool,
  ApplyPatchServerTool,
  CustomTool,
  NamespaceTool,
  AdvisorServerToolOpenRouter,
  SubagentServerToolOpenRouter,
  DatetimeServerTool,
  FilesServerTool,
  FusionServerToolOpenRouter,
  ImageGenerationServerToolOpenRouter,
  SearchModelsServerToolOpenRouter,
  WebFetchServerTool,
  WebSearchServerToolOpenRouter,
  ApplyPatchServerToolOpenRouter,
  BashServerTool,
  ShellServerToolOpenRouter,
}

public sealed class InlineResponsesRequestToolsItemXf7c3ac6cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineResponsesRequestToolsItemXf7c3ac6cNoMatchException(
  message: String,
) : InlineResponsesRequestToolsItemXf7c3ac6cDecodingException(message)

internal data class InlineResponsesRequestToolsItemXf7c3ac6cInspection(
  public val matchesInlineResponsesRequestToolsItemAnyOf1Xdfe01760: Boolean,
  public val matchesPreviewWebSearchServerTool: Boolean,
  public val matchesPreview20250311WebSearchServerTool: Boolean,
  public val matchesLegacyWebSearchServerTool: Boolean,
  public val matchesWebSearchServerTool: Boolean,
  public val matchesFileSearchServerTool: Boolean,
  public val matchesComputerUseServerTool: Boolean,
  public val matchesCodeInterpreterServerTool: Boolean,
  public val matchesMcpServerTool: Boolean,
  public val matchesImageGenerationServerTool: Boolean,
  public val matchesCodexLocalShellTool: Boolean,
  public val matchesShellServerTool: Boolean,
  public val matchesApplyPatchServerTool: Boolean,
  public val matchesCustomTool: Boolean,
  public val matchesNamespaceTool: Boolean,
  public val matchesAdvisorServerToolOpenRouter: Boolean,
  public val matchesSubagentServerToolOpenRouter: Boolean,
  public val matchesDatetimeServerTool: Boolean,
  public val matchesFilesServerTool: Boolean,
  public val matchesFusionServerToolOpenRouter: Boolean,
  public val matchesImageGenerationServerToolOpenRouter: Boolean,
  public val matchesSearchModelsServerToolOpenRouter: Boolean,
  public val matchesWebFetchServerTool: Boolean,
  public val matchesWebSearchServerToolOpenRouter: Boolean,
  public val matchesApplyPatchServerToolOpenRouter: Boolean,
  public val matchesBashServerTool: Boolean,
  public val matchesShellServerToolOpenRouter: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineResponsesRequestToolsItemAnyOf1Xdfe01760, matchesPreviewWebSearchServerTool, matchesPreview20250311WebSearchServerTool, matchesLegacyWebSearchServerTool, matchesWebSearchServerTool, matchesFileSearchServerTool, matchesComputerUseServerTool, matchesCodeInterpreterServerTool, matchesMcpServerTool, matchesImageGenerationServerTool, matchesCodexLocalShellTool, matchesShellServerTool, matchesApplyPatchServerTool, matchesCustomTool, matchesNamespaceTool, matchesAdvisorServerToolOpenRouter, matchesSubagentServerToolOpenRouter, matchesDatetimeServerTool, matchesFilesServerTool, matchesFusionServerToolOpenRouter, matchesImageGenerationServerToolOpenRouter, matchesSearchModelsServerToolOpenRouter, matchesWebFetchServerTool, matchesWebSearchServerToolOpenRouter, matchesApplyPatchServerToolOpenRouter, matchesBashServerTool, matchesShellServerToolOpenRouter).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/ResponsesRequest/properties/tools/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ResponsesRequest/properties/tools/items
 */
@Serializable(with = InlineResponsesRequestToolsItemXf7c3ac6c.Serializer::class)
public class InlineResponsesRequestToolsItemXf7c3ac6c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineResponsesRequestToolsItemXf7c3ac6cInspection,
) {
  public val inlineResponsesRequestToolsItemAnyOf1Xdfe01760:
      InlineResponsesRequestToolsItemXf7c3ac6cInlineResponsesRequestToolsItemAnyOf1Xdfe01760View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineResponsesRequestToolsItemAnyOf1Xdfe01760) json.decodeFromJsonElement<InlineResponsesRequestToolsItemXf7c3ac6cInlineResponsesRequestToolsItemAnyOf1Xdfe01760View>(raw) else null }

  public val previewWebSearchServerTool: PreviewWebSearchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPreviewWebSearchServerTool) json.decodeFromJsonElement<PreviewWebSearchServerToolView>(raw) else null }

  public val preview20250311WebSearchServerTool: Preview20250311WebSearchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPreview20250311WebSearchServerTool) json.decodeFromJsonElement<Preview20250311WebSearchServerToolView>(raw) else null }

  public val legacyWebSearchServerTool: LegacyWebSearchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLegacyWebSearchServerTool) json.decodeFromJsonElement<LegacyWebSearchServerToolView>(raw) else null }

  public val webSearchServerTool: WebSearchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesWebSearchServerTool) json.decodeFromJsonElement<WebSearchServerToolView>(raw) else null }

  public val fileSearchServerTool: FileSearchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFileSearchServerTool) json.decodeFromJsonElement<FileSearchServerToolView>(raw) else null }

  public val computerUseServerTool: ComputerUseServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesComputerUseServerTool) json.decodeFromJsonElement<ComputerUseServerToolView>(raw) else null }

  public val codeInterpreterServerTool: CodeInterpreterServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCodeInterpreterServerTool) json.decodeFromJsonElement<CodeInterpreterServerToolView>(raw) else null }

  public val mcpServerTool: McpServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMcpServerTool) json.decodeFromJsonElement<McpServerToolView>(raw) else null }

  public val imageGenerationServerTool: ImageGenerationServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesImageGenerationServerTool) json.decodeFromJsonElement<ImageGenerationServerToolView>(raw) else null }

  public val codexLocalShellTool: CodexLocalShellToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCodexLocalShellTool) json.decodeFromJsonElement<CodexLocalShellToolView>(raw) else null }

  public val shellServerTool: ShellServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShellServerTool) json.decodeFromJsonElement<ShellServerToolView>(raw) else null }

  public val applyPatchServerTool: ApplyPatchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplyPatchServerTool) json.decodeFromJsonElement<ApplyPatchServerToolView>(raw) else null }

  public val customTool: CustomToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomTool) json.decodeFromJsonElement<CustomToolView>(raw) else null }

  public val namespaceTool: NamespaceToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesNamespaceTool) json.decodeFromJsonElement<NamespaceToolView>(raw) else null }

  public val advisorServerToolOpenRouter: AdvisorServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAdvisorServerToolOpenRouter) json.decodeFromJsonElement<AdvisorServerToolOpenRouterView>(raw) else null }

  public val subagentServerToolOpenRouter: SubagentServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubagentServerToolOpenRouter) json.decodeFromJsonElement<SubagentServerToolOpenRouterView>(raw) else null }

  public val datetimeServerTool: DatetimeServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDatetimeServerTool) json.decodeFromJsonElement<DatetimeServerToolView>(raw) else null }

  public val filesServerTool: FilesServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFilesServerTool) json.decodeFromJsonElement<FilesServerToolView>(raw) else null }

  public val fusionServerToolOpenRouter: FusionServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFusionServerToolOpenRouter) json.decodeFromJsonElement<FusionServerToolOpenRouterView>(raw) else null }

  public val imageGenerationServerToolOpenRouter: ImageGenerationServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesImageGenerationServerToolOpenRouter) json.decodeFromJsonElement<ImageGenerationServerToolOpenRouterView>(raw) else null }

  public val searchModelsServerToolOpenRouter: SearchModelsServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSearchModelsServerToolOpenRouter) json.decodeFromJsonElement<SearchModelsServerToolOpenRouterView>(raw) else null }

  public val webFetchServerTool: WebFetchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesWebFetchServerTool) json.decodeFromJsonElement<WebFetchServerToolView>(raw) else null }

  public val webSearchServerToolOpenRouter: WebSearchServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesWebSearchServerToolOpenRouter) json.decodeFromJsonElement<WebSearchServerToolOpenRouterView>(raw) else null }

  public val applyPatchServerToolOpenRouter: ApplyPatchServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplyPatchServerToolOpenRouter) json.decodeFromJsonElement<ApplyPatchServerToolOpenRouterView>(raw) else null }

  public val bashServerTool: BashServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBashServerTool) json.decodeFromJsonElement<BashServerToolView>(raw) else null }

  public val shellServerToolOpenRouter: ShellServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShellServerToolOpenRouter) json.decodeFromJsonElement<ShellServerToolOpenRouterView>(raw) else null }

  public val matchedBranches: Set<InlineResponsesRequestToolsItemXf7c3ac6cBranch>
    get() = buildSet {
      if (inspection.matchesInlineResponsesRequestToolsItemAnyOf1Xdfe01760) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.InlineResponsesRequestToolsItemAnyOf1Xdfe01760)
      if (inspection.matchesPreviewWebSearchServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.PreviewWebSearchServerTool)
      if (inspection.matchesPreview20250311WebSearchServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.Preview20250311WebSearchServerTool)
      if (inspection.matchesLegacyWebSearchServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.LegacyWebSearchServerTool)
      if (inspection.matchesWebSearchServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.WebSearchServerTool)
      if (inspection.matchesFileSearchServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.FileSearchServerTool)
      if (inspection.matchesComputerUseServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.ComputerUseServerTool)
      if (inspection.matchesCodeInterpreterServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.CodeInterpreterServerTool)
      if (inspection.matchesMcpServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.McpServerTool)
      if (inspection.matchesImageGenerationServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.ImageGenerationServerTool)
      if (inspection.matchesCodexLocalShellTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.CodexLocalShellTool)
      if (inspection.matchesShellServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.ShellServerTool)
      if (inspection.matchesApplyPatchServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.ApplyPatchServerTool)
      if (inspection.matchesCustomTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.CustomTool)
      if (inspection.matchesNamespaceTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.NamespaceTool)
      if (inspection.matchesAdvisorServerToolOpenRouter) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.AdvisorServerToolOpenRouter)
      if (inspection.matchesSubagentServerToolOpenRouter) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.SubagentServerToolOpenRouter)
      if (inspection.matchesDatetimeServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.DatetimeServerTool)
      if (inspection.matchesFilesServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.FilesServerTool)
      if (inspection.matchesFusionServerToolOpenRouter) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.FusionServerToolOpenRouter)
      if (inspection.matchesImageGenerationServerToolOpenRouter) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.ImageGenerationServerToolOpenRouter)
      if (inspection.matchesSearchModelsServerToolOpenRouter) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.SearchModelsServerToolOpenRouter)
      if (inspection.matchesWebFetchServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.WebFetchServerTool)
      if (inspection.matchesWebSearchServerToolOpenRouter) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.WebSearchServerToolOpenRouter)
      if (inspection.matchesApplyPatchServerToolOpenRouter) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.ApplyPatchServerToolOpenRouter)
      if (inspection.matchesBashServerTool) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.BashServerTool)
      if (inspection.matchesShellServerToolOpenRouter) add(InlineResponsesRequestToolsItemXf7c3ac6cBranch.ShellServerToolOpenRouter)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineResponsesRequestToolsItemXf7c3ac6c {
      val inspection = inspectInlineResponsesRequestToolsItemXf7c3ac6c(raw)
      if (inspection.matchCount == 0) {
        throw InlineResponsesRequestToolsItemXf7c3ac6cNoMatchException("InlineResponsesRequestToolsItemXf7c3ac6c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineResponsesRequestToolsItemXf7c3ac6c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineResponsesRequestToolsItemXf7c3ac6c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineResponsesRequestToolsItemXf7c3ac6c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineResponsesRequestToolsItemXf7c3ac6c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineResponsesRequestToolsItemXf7c3ac6c) {
      encoder.requireJsonEncoder("InlineResponsesRequestToolsItemXf7c3ac6c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineResponsesRequestToolsItemXf7c3ac6c(element: JsonElement): InlineResponsesRequestToolsItemXf7c3ac6cInspection {
  val raw = element as? JsonObject ?: return InlineResponsesRequestToolsItemXf7c3ac6cInspection(
    matchesInlineResponsesRequestToolsItemAnyOf1Xdfe01760 = false,
    matchesPreviewWebSearchServerTool = false,
    matchesPreview20250311WebSearchServerTool = false,
    matchesLegacyWebSearchServerTool = false,
    matchesWebSearchServerTool = false,
    matchesFileSearchServerTool = false,
    matchesComputerUseServerTool = false,
    matchesCodeInterpreterServerTool = false,
    matchesMcpServerTool = false,
    matchesImageGenerationServerTool = false,
    matchesCodexLocalShellTool = false,
    matchesShellServerTool = false,
    matchesApplyPatchServerTool = false,
    matchesCustomTool = false,
    matchesNamespaceTool = false,
    matchesAdvisorServerToolOpenRouter = false,
    matchesSubagentServerToolOpenRouter = false,
    matchesDatetimeServerTool = false,
    matchesFilesServerTool = false,
    matchesFusionServerToolOpenRouter = false,
    matchesImageGenerationServerToolOpenRouter = false,
    matchesSearchModelsServerToolOpenRouter = false,
    matchesWebFetchServerTool = false,
    matchesWebSearchServerToolOpenRouter = false,
    matchesApplyPatchServerToolOpenRouter = false,
    matchesBashServerTool = false,
    matchesShellServerToolOpenRouter = false,
    failures = listOf("InlineResponsesRequestToolsItemAnyOf1Xdfe01760: expected JSON object", "PreviewWebSearchServerTool: expected JSON object", "Preview20250311WebSearchServerTool: expected JSON object", "LegacyWebSearchServerTool: expected JSON object", "WebSearchServerTool: expected JSON object", "FileSearchServerTool: expected JSON object", "ComputerUseServerTool: expected JSON object", "CodeInterpreterServerTool: expected JSON object", "McpServerTool: expected JSON object", "ImageGenerationServerTool: expected JSON object", "CodexLocalShellTool: expected JSON object", "ShellServerTool: expected JSON object", "ApplyPatchServerTool: expected JSON object", "CustomTool: expected JSON object", "NamespaceTool: expected JSON object", "AdvisorServerToolOpenRouter: expected JSON object", "SubagentServerToolOpenRouter: expected JSON object", "DatetimeServerTool: expected JSON object", "FilesServerTool: expected JSON object", "FusionServerToolOpenRouter: expected JSON object", "ImageGenerationServerToolOpenRouter: expected JSON object", "SearchModelsServerToolOpenRouter: expected JSON object", "WebFetchServerTool: expected JSON object", "WebSearchServerToolOpenRouter: expected JSON object", "ApplyPatchServerToolOpenRouter: expected JSON object", "BashServerTool: expected JSON object", "ShellServerToolOpenRouter: expected JSON object"),
  )
  val matchesInlineResponsesRequestToolsItemAnyOf1Xdfe01760 = raw["name"].isString() && raw["parameters"] != null && raw["type"] != null
  val matchesPreviewWebSearchServerTool = raw["type"] != null
  val matchesPreview20250311WebSearchServerTool = raw["type"] != null
  val matchesLegacyWebSearchServerTool = raw["type"] != null
  val matchesWebSearchServerTool = raw["type"] != null
  val matchesFileSearchServerTool = raw["type"] != null && raw["vector_store_ids"].isStringArray()
  val matchesComputerUseServerTool = raw["display_height"] != null && raw["display_width"] != null && raw["environment"] != null && raw["type"] != null
  val matchesCodeInterpreterServerTool = raw["container"] != null && raw["type"] != null
  val matchesMcpServerTool = raw["server_label"].isString() && raw["type"] != null
  val matchesImageGenerationServerTool = raw["type"] != null
  val matchesCodexLocalShellTool = raw["type"] != null
  val matchesShellServerTool = raw["type"] != null
  val matchesApplyPatchServerTool = raw["type"] != null
  val matchesCustomTool = raw["name"].isString() && raw["type"] != null
  val matchesNamespaceTool = raw["description"].isString() && raw["name"].isString() && raw["tools"] != null && raw["type"] != null
  val matchesAdvisorServerToolOpenRouter = raw["type"] != null
  val matchesSubagentServerToolOpenRouter = raw["type"] != null
  val matchesDatetimeServerTool = raw["type"] != null
  val matchesFilesServerTool = raw["type"] != null
  val matchesFusionServerToolOpenRouter = raw["type"] != null
  val matchesImageGenerationServerToolOpenRouter = raw["type"] != null
  val matchesSearchModelsServerToolOpenRouter = raw["type"] != null
  val matchesWebFetchServerTool = raw["type"] != null
  val matchesWebSearchServerToolOpenRouter = raw["type"] != null
  val matchesApplyPatchServerToolOpenRouter = raw["type"] != null
  val matchesBashServerTool = raw["type"] != null
  val matchesShellServerToolOpenRouter = raw["type"] != null
  return InlineResponsesRequestToolsItemXf7c3ac6cInspection(
    matchesInlineResponsesRequestToolsItemAnyOf1Xdfe01760 = matchesInlineResponsesRequestToolsItemAnyOf1Xdfe01760,
    matchesPreviewWebSearchServerTool = matchesPreviewWebSearchServerTool,
    matchesPreview20250311WebSearchServerTool = matchesPreview20250311WebSearchServerTool,
    matchesLegacyWebSearchServerTool = matchesLegacyWebSearchServerTool,
    matchesWebSearchServerTool = matchesWebSearchServerTool,
    matchesFileSearchServerTool = matchesFileSearchServerTool,
    matchesComputerUseServerTool = matchesComputerUseServerTool,
    matchesCodeInterpreterServerTool = matchesCodeInterpreterServerTool,
    matchesMcpServerTool = matchesMcpServerTool,
    matchesImageGenerationServerTool = matchesImageGenerationServerTool,
    matchesCodexLocalShellTool = matchesCodexLocalShellTool,
    matchesShellServerTool = matchesShellServerTool,
    matchesApplyPatchServerTool = matchesApplyPatchServerTool,
    matchesCustomTool = matchesCustomTool,
    matchesNamespaceTool = matchesNamespaceTool,
    matchesAdvisorServerToolOpenRouter = matchesAdvisorServerToolOpenRouter,
    matchesSubagentServerToolOpenRouter = matchesSubagentServerToolOpenRouter,
    matchesDatetimeServerTool = matchesDatetimeServerTool,
    matchesFilesServerTool = matchesFilesServerTool,
    matchesFusionServerToolOpenRouter = matchesFusionServerToolOpenRouter,
    matchesImageGenerationServerToolOpenRouter = matchesImageGenerationServerToolOpenRouter,
    matchesSearchModelsServerToolOpenRouter = matchesSearchModelsServerToolOpenRouter,
    matchesWebFetchServerTool = matchesWebFetchServerTool,
    matchesWebSearchServerToolOpenRouter = matchesWebSearchServerToolOpenRouter,
    matchesApplyPatchServerToolOpenRouter = matchesApplyPatchServerToolOpenRouter,
    matchesBashServerTool = matchesBashServerTool,
    matchesShellServerToolOpenRouter = matchesShellServerToolOpenRouter,
    failures = buildList {
      if (!matchesInlineResponsesRequestToolsItemAnyOf1Xdfe01760) add("InlineResponsesRequestToolsItemAnyOf1Xdfe01760: required properties 'name', 'parameters', 'type' do not match their declared types")
      if (!matchesPreviewWebSearchServerTool) add("PreviewWebSearchServerTool: required properties 'type' do not match their declared types")
      if (!matchesPreview20250311WebSearchServerTool) add("Preview20250311WebSearchServerTool: required properties 'type' do not match their declared types")
      if (!matchesLegacyWebSearchServerTool) add("LegacyWebSearchServerTool: required properties 'type' do not match their declared types")
      if (!matchesWebSearchServerTool) add("WebSearchServerTool: required properties 'type' do not match their declared types")
      if (!matchesFileSearchServerTool) add("FileSearchServerTool: required properties 'type', 'vector_store_ids' do not match their declared types")
      if (!matchesComputerUseServerTool) add("ComputerUseServerTool: required properties 'display_height', 'display_width', 'environment', 'type' do not match their declared types")
      if (!matchesCodeInterpreterServerTool) add("CodeInterpreterServerTool: required properties 'container', 'type' do not match their declared types")
      if (!matchesMcpServerTool) add("McpServerTool: required properties 'server_label', 'type' do not match their declared types")
      if (!matchesImageGenerationServerTool) add("ImageGenerationServerTool: required properties 'type' do not match their declared types")
      if (!matchesCodexLocalShellTool) add("CodexLocalShellTool: required properties 'type' do not match their declared types")
      if (!matchesShellServerTool) add("ShellServerTool: required properties 'type' do not match their declared types")
      if (!matchesApplyPatchServerTool) add("ApplyPatchServerTool: required properties 'type' do not match their declared types")
      if (!matchesCustomTool) add("CustomTool: required properties 'name', 'type' do not match their declared types")
      if (!matchesNamespaceTool) add("NamespaceTool: required properties 'description', 'name', 'tools', 'type' do not match their declared types")
      if (!matchesAdvisorServerToolOpenRouter) add("AdvisorServerToolOpenRouter: required properties 'type' do not match their declared types")
      if (!matchesSubagentServerToolOpenRouter) add("SubagentServerToolOpenRouter: required properties 'type' do not match their declared types")
      if (!matchesDatetimeServerTool) add("DatetimeServerTool: required properties 'type' do not match their declared types")
      if (!matchesFilesServerTool) add("FilesServerTool: required properties 'type' do not match their declared types")
      if (!matchesFusionServerToolOpenRouter) add("FusionServerToolOpenRouter: required properties 'type' do not match their declared types")
      if (!matchesImageGenerationServerToolOpenRouter) add("ImageGenerationServerToolOpenRouter: required properties 'type' do not match their declared types")
      if (!matchesSearchModelsServerToolOpenRouter) add("SearchModelsServerToolOpenRouter: required properties 'type' do not match their declared types")
      if (!matchesWebFetchServerTool) add("WebFetchServerTool: required properties 'type' do not match their declared types")
      if (!matchesWebSearchServerToolOpenRouter) add("WebSearchServerToolOpenRouter: required properties 'type' do not match their declared types")
      if (!matchesApplyPatchServerToolOpenRouter) add("ApplyPatchServerToolOpenRouter: required properties 'type' do not match their declared types")
      if (!matchesBashServerTool) add("BashServerTool: required properties 'type' do not match their declared types")
      if (!matchesShellServerToolOpenRouter) add("ShellServerToolOpenRouter: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
