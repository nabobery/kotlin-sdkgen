package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
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

@Serializable
public data class InlineMessagesContentBlockStartEventContentBlockX89752283InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132View(
  public val content: String?,
  public val type: InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138,
)

public enum class InlineMessagesContentBlockStartEventContentBlockX89752283Branch {
  AnthropicTextBlock,
  AnthropicToolUseBlock,
  AnthropicThinkingBlock,
  AnthropicRedactedThinkingBlock,
  OrAnthropicServerToolUseBlock,
  AnthropicWebSearchToolResult,
  AnthropicWebFetchToolResult,
  AnthropicCodeExecutionToolResult,
  AnthropicBashCodeExecutionToolResult,
  AnthropicTextEditorCodeExecutionToolResult,
  AnthropicToolSearchToolResult,
  AnthropicContainerUpload,
  AnthropicCompactionBlock,
  AnthropicAdvisorToolResult,
  InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132,
}

public sealed class InlineMessagesContentBlockStartEventContentBlockX89752283DecodingException(
  message: String,
) : SerializationException(message)

public class InlineMessagesContentBlockStartEventContentBlockX89752283NoMatchException(
  message: String,
) : InlineMessagesContentBlockStartEventContentBlockX89752283DecodingException(message)

internal data class InlineMessagesContentBlockStartEventContentBlockX89752283Inspection(
  public val matchesAnthropicTextBlock: Boolean,
  public val matchesAnthropicToolUseBlock: Boolean,
  public val matchesAnthropicThinkingBlock: Boolean,
  public val matchesAnthropicRedactedThinkingBlock: Boolean,
  public val matchesOrAnthropicServerToolUseBlock: Boolean,
  public val matchesAnthropicWebSearchToolResult: Boolean,
  public val matchesAnthropicWebFetchToolResult: Boolean,
  public val matchesAnthropicCodeExecutionToolResult: Boolean,
  public val matchesAnthropicBashCodeExecutionToolResult: Boolean,
  public val matchesAnthropicTextEditorCodeExecutionToolResult: Boolean,
  public val matchesAnthropicToolSearchToolResult: Boolean,
  public val matchesAnthropicContainerUpload: Boolean,
  public val matchesAnthropicCompactionBlock: Boolean,
  public val matchesAnthropicAdvisorToolResult: Boolean,
  public val matchesInlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAnthropicTextBlock, matchesAnthropicToolUseBlock, matchesAnthropicThinkingBlock, matchesAnthropicRedactedThinkingBlock, matchesOrAnthropicServerToolUseBlock, matchesAnthropicWebSearchToolResult, matchesAnthropicWebFetchToolResult, matchesAnthropicCodeExecutionToolResult, matchesAnthropicBashCodeExecutionToolResult, matchesAnthropicTextEditorCodeExecutionToolResult, matchesAnthropicToolSearchToolResult, matchesAnthropicContainerUpload, matchesAnthropicCompactionBlock, matchesAnthropicAdvisorToolResult, matchesInlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStartEvent/properties/content_block.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStartEvent/properties/content_block
 */
@Serializable(with = InlineMessagesContentBlockStartEventContentBlockX89752283.Serializer::class)
public class InlineMessagesContentBlockStartEventContentBlockX89752283 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineMessagesContentBlockStartEventContentBlockX89752283Inspection,
) {
  public val anthropicTextBlock: AnthropicTextBlockView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicTextBlock) json.decodeFromJsonElement<AnthropicTextBlockView>(raw) else null }

  public val anthropicToolUseBlock: AnthropicToolUseBlockView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicToolUseBlock) json.decodeFromJsonElement<AnthropicToolUseBlockView>(raw) else null }

  public val anthropicThinkingBlock: AnthropicThinkingBlockView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicThinkingBlock) json.decodeFromJsonElement<AnthropicThinkingBlockView>(raw) else null }

  public val anthropicRedactedThinkingBlock: AnthropicRedactedThinkingBlockView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicRedactedThinkingBlock) json.decodeFromJsonElement<AnthropicRedactedThinkingBlockView>(raw) else null }

  public val orAnthropicServerToolUseBlock: OrAnthropicServerToolUseBlockView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOrAnthropicServerToolUseBlock) json.decodeFromJsonElement<OrAnthropicServerToolUseBlockView>(raw) else null }

  public val anthropicWebSearchToolResult: AnthropicWebSearchToolResultView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicWebSearchToolResult) json.decodeFromJsonElement<AnthropicWebSearchToolResultView>(raw) else null }

  public val anthropicWebFetchToolResult: AnthropicWebFetchToolResultView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicWebFetchToolResult) json.decodeFromJsonElement<AnthropicWebFetchToolResultView>(raw) else null }

  public val anthropicCodeExecutionToolResult: AnthropicCodeExecutionToolResultView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicCodeExecutionToolResult) json.decodeFromJsonElement<AnthropicCodeExecutionToolResultView>(raw) else null }

  public val anthropicBashCodeExecutionToolResult: AnthropicBashCodeExecutionToolResultView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicBashCodeExecutionToolResult) json.decodeFromJsonElement<AnthropicBashCodeExecutionToolResultView>(raw) else null }

  public val anthropicTextEditorCodeExecutionToolResult:
      AnthropicTextEditorCodeExecutionToolResultView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicTextEditorCodeExecutionToolResult) json.decodeFromJsonElement<AnthropicTextEditorCodeExecutionToolResultView>(raw) else null }

  public val anthropicToolSearchToolResult: AnthropicToolSearchToolResultView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicToolSearchToolResult) json.decodeFromJsonElement<AnthropicToolSearchToolResultView>(raw) else null }

  public val anthropicContainerUpload: AnthropicContainerUploadView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicContainerUpload) json.decodeFromJsonElement<AnthropicContainerUploadView>(raw) else null }

  public val anthropicCompactionBlock: AnthropicCompactionBlockView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicCompactionBlock) json.decodeFromJsonElement<AnthropicCompactionBlockView>(raw) else null }

  public val anthropicAdvisorToolResult: AnthropicAdvisorToolResultView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicAdvisorToolResult) json.decodeFromJsonElement<AnthropicAdvisorToolResultView>(raw) else null }

  public val inlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132:
      InlineMessagesContentBlockStartEventContentBlockX89752283InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132View?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132) json.decodeFromJsonElement<InlineMessagesContentBlockStartEventContentBlockX89752283InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132View>(raw) else null }

  public val matchedBranches: Set<InlineMessagesContentBlockStartEventContentBlockX89752283Branch>
    get() = buildSet {
      if (inspection.matchesAnthropicTextBlock) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicTextBlock)
      if (inspection.matchesAnthropicToolUseBlock) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicToolUseBlock)
      if (inspection.matchesAnthropicThinkingBlock) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicThinkingBlock)
      if (inspection.matchesAnthropicRedactedThinkingBlock) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicRedactedThinkingBlock)
      if (inspection.matchesOrAnthropicServerToolUseBlock) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.OrAnthropicServerToolUseBlock)
      if (inspection.matchesAnthropicWebSearchToolResult) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicWebSearchToolResult)
      if (inspection.matchesAnthropicWebFetchToolResult) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicWebFetchToolResult)
      if (inspection.matchesAnthropicCodeExecutionToolResult) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicCodeExecutionToolResult)
      if (inspection.matchesAnthropicBashCodeExecutionToolResult) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicBashCodeExecutionToolResult)
      if (inspection.matchesAnthropicTextEditorCodeExecutionToolResult) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicTextEditorCodeExecutionToolResult)
      if (inspection.matchesAnthropicToolSearchToolResult) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicToolSearchToolResult)
      if (inspection.matchesAnthropicContainerUpload) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicContainerUpload)
      if (inspection.matchesAnthropicCompactionBlock) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicCompactionBlock)
      if (inspection.matchesAnthropicAdvisorToolResult) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.AnthropicAdvisorToolResult)
      if (inspection.matchesInlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132) add(InlineMessagesContentBlockStartEventContentBlockX89752283Branch.InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineMessagesContentBlockStartEventContentBlockX89752283 {
      val inspection = inspectInlineMessagesContentBlockStartEventContentBlockX89752283(raw)
      if (inspection.matchCount == 0) {
        throw InlineMessagesContentBlockStartEventContentBlockX89752283NoMatchException("InlineMessagesContentBlockStartEventContentBlockX89752283 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineMessagesContentBlockStartEventContentBlockX89752283(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockStartEventContentBlockX89752283> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockStartEventContentBlockX89752283 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesContentBlockStartEventContentBlockX89752283")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockStartEventContentBlockX89752283) {
      encoder.requireJsonEncoder("InlineMessagesContentBlockStartEventContentBlockX89752283").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineMessagesContentBlockStartEventContentBlockX89752283(element: JsonElement): InlineMessagesContentBlockStartEventContentBlockX89752283Inspection {
  val raw = element as? JsonObject ?: return InlineMessagesContentBlockStartEventContentBlockX89752283Inspection(
    matchesAnthropicTextBlock = false,
    matchesAnthropicToolUseBlock = false,
    matchesAnthropicThinkingBlock = false,
    matchesAnthropicRedactedThinkingBlock = false,
    matchesOrAnthropicServerToolUseBlock = false,
    matchesAnthropicWebSearchToolResult = false,
    matchesAnthropicWebFetchToolResult = false,
    matchesAnthropicCodeExecutionToolResult = false,
    matchesAnthropicBashCodeExecutionToolResult = false,
    matchesAnthropicTextEditorCodeExecutionToolResult = false,
    matchesAnthropicToolSearchToolResult = false,
    matchesAnthropicContainerUpload = false,
    matchesAnthropicCompactionBlock = false,
    matchesAnthropicAdvisorToolResult = false,
    matchesInlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132 = false,
    failures = listOf("AnthropicTextBlock: expected JSON object", "AnthropicToolUseBlock: expected JSON object", "AnthropicThinkingBlock: expected JSON object", "AnthropicRedactedThinkingBlock: expected JSON object", "OrAnthropicServerToolUseBlock: expected JSON object", "AnthropicWebSearchToolResult: expected JSON object", "AnthropicWebFetchToolResult: expected JSON object", "AnthropicCodeExecutionToolResult: expected JSON object", "AnthropicBashCodeExecutionToolResult: expected JSON object", "AnthropicTextEditorCodeExecutionToolResult: expected JSON object", "AnthropicToolSearchToolResult: expected JSON object", "AnthropicContainerUpload: expected JSON object", "AnthropicCompactionBlock: expected JSON object", "AnthropicAdvisorToolResult: expected JSON object", "InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132: expected JSON object"),
  )
  val matchesAnthropicTextBlock = raw["citations"] != null && raw["text"].isString() && raw["type"] != null
  val matchesAnthropicToolUseBlock = raw["caller"] != null && raw["id"].isString() && raw["name"].isString() && raw["type"] != null
  val matchesAnthropicThinkingBlock = raw["signature"].isString() && raw["thinking"].isString() && raw["type"] != null
  val matchesAnthropicRedactedThinkingBlock = raw["data"].isString() && raw["type"] != null
  val matchesOrAnthropicServerToolUseBlock = raw["id"].isString() && raw["name"].isString() && raw["type"] != null
  val matchesAnthropicWebSearchToolResult = raw["caller"] != null && raw["content"] != null && raw["tool_use_id"].isString() && raw["type"] != null
  val matchesAnthropicWebFetchToolResult = raw["caller"] != null && raw["content"] != null && raw["tool_use_id"].isString() && raw["type"] != null
  val matchesAnthropicCodeExecutionToolResult = raw["content"] != null && raw["tool_use_id"].isString() && raw["type"] != null
  val matchesAnthropicBashCodeExecutionToolResult = raw["content"] != null && raw["tool_use_id"].isString() && raw["type"] != null
  val matchesAnthropicTextEditorCodeExecutionToolResult = raw["content"] != null && raw["tool_use_id"].isString() && raw["type"] != null
  val matchesAnthropicToolSearchToolResult = raw["content"] != null && raw["tool_use_id"].isString() && raw["type"] != null
  val matchesAnthropicContainerUpload = raw["file_id"].isString() && raw["type"] != null
  val matchesAnthropicCompactionBlock = raw["content"].isString() && raw["type"] != null
  val matchesAnthropicAdvisorToolResult = raw["content"] != null && raw["tool_use_id"].isString() && raw["type"] != null
  val matchesInlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132 = raw["content"].isString() && raw["type"] != null
  return InlineMessagesContentBlockStartEventContentBlockX89752283Inspection(
    matchesAnthropicTextBlock = matchesAnthropicTextBlock,
    matchesAnthropicToolUseBlock = matchesAnthropicToolUseBlock,
    matchesAnthropicThinkingBlock = matchesAnthropicThinkingBlock,
    matchesAnthropicRedactedThinkingBlock = matchesAnthropicRedactedThinkingBlock,
    matchesOrAnthropicServerToolUseBlock = matchesOrAnthropicServerToolUseBlock,
    matchesAnthropicWebSearchToolResult = matchesAnthropicWebSearchToolResult,
    matchesAnthropicWebFetchToolResult = matchesAnthropicWebFetchToolResult,
    matchesAnthropicCodeExecutionToolResult = matchesAnthropicCodeExecutionToolResult,
    matchesAnthropicBashCodeExecutionToolResult = matchesAnthropicBashCodeExecutionToolResult,
    matchesAnthropicTextEditorCodeExecutionToolResult = matchesAnthropicTextEditorCodeExecutionToolResult,
    matchesAnthropicToolSearchToolResult = matchesAnthropicToolSearchToolResult,
    matchesAnthropicContainerUpload = matchesAnthropicContainerUpload,
    matchesAnthropicCompactionBlock = matchesAnthropicCompactionBlock,
    matchesAnthropicAdvisorToolResult = matchesAnthropicAdvisorToolResult,
    matchesInlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132 = matchesInlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132,
    failures = buildList {
      if (!matchesAnthropicTextBlock) add("AnthropicTextBlock: required properties 'citations', 'text', 'type' do not match their declared types")
      if (!matchesAnthropicToolUseBlock) add("AnthropicToolUseBlock: required properties 'caller', 'id', 'name', 'type' do not match their declared types")
      if (!matchesAnthropicThinkingBlock) add("AnthropicThinkingBlock: required properties 'signature', 'thinking', 'type' do not match their declared types")
      if (!matchesAnthropicRedactedThinkingBlock) add("AnthropicRedactedThinkingBlock: required properties 'data', 'type' do not match their declared types")
      if (!matchesOrAnthropicServerToolUseBlock) add("OrAnthropicServerToolUseBlock: required properties 'id', 'name', 'type' do not match their declared types")
      if (!matchesAnthropicWebSearchToolResult) add("AnthropicWebSearchToolResult: required properties 'caller', 'content', 'tool_use_id', 'type' do not match their declared types")
      if (!matchesAnthropicWebFetchToolResult) add("AnthropicWebFetchToolResult: required properties 'caller', 'content', 'tool_use_id', 'type' do not match their declared types")
      if (!matchesAnthropicCodeExecutionToolResult) add("AnthropicCodeExecutionToolResult: required properties 'content', 'tool_use_id', 'type' do not match their declared types")
      if (!matchesAnthropicBashCodeExecutionToolResult) add("AnthropicBashCodeExecutionToolResult: required properties 'content', 'tool_use_id', 'type' do not match their declared types")
      if (!matchesAnthropicTextEditorCodeExecutionToolResult) add("AnthropicTextEditorCodeExecutionToolResult: required properties 'content', 'tool_use_id', 'type' do not match their declared types")
      if (!matchesAnthropicToolSearchToolResult) add("AnthropicToolSearchToolResult: required properties 'content', 'tool_use_id', 'type' do not match their declared types")
      if (!matchesAnthropicContainerUpload) add("AnthropicContainerUpload: required properties 'file_id', 'type' do not match their declared types")
      if (!matchesAnthropicCompactionBlock) add("AnthropicCompactionBlock: required properties 'content', 'type' do not match their declared types")
      if (!matchesAnthropicAdvisorToolResult) add("AnthropicAdvisorToolResult: required properties 'content', 'tool_use_id', 'type' do not match their declared types")
      if (!matchesInlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132) add("InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132: required properties 'content', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
