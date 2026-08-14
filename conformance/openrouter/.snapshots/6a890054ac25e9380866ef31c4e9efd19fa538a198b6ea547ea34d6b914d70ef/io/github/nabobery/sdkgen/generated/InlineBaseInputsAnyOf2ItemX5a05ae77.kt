package io.github.nabobery.sdkgen.generated

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
public data class InlineBaseInputsAnyOf2ItemX5a05ae77InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0View(
  public val content: InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e,
  public val phase: InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a? = null,
  public val role: InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b,
  public val type: InlineBaseInputsAnyOf2ItemAnyOf1TypeX6d3b39ba? = null,
)

public enum class InlineBaseInputsAnyOf2ItemX5a05ae77Branch {
  InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0,
  OpenAiResponseInputMessageItem,
  OpenAiResponseFunctionToolCallOutput,
  OpenAiResponseFunctionToolCall,
  OutputItemImageGenerationCall,
  OutputMessage,
  OpenAiResponseCustomToolCall,
  OpenAiResponseCustomToolCallOutput,
  ApplyPatchCallItem,
  ApplyPatchCallOutputItem,
}

public sealed class InlineBaseInputsAnyOf2ItemX5a05ae77DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBaseInputsAnyOf2ItemX5a05ae77NoMatchException(
  message: String,
) : InlineBaseInputsAnyOf2ItemX5a05ae77DecodingException(message)

internal data class InlineBaseInputsAnyOf2ItemX5a05ae77Inspection(
  public val matchesInlineBaseInputsAnyOf2ItemAnyOf1X4de472a0: Boolean,
  public val matchesOpenAiResponseInputMessageItem: Boolean,
  public val matchesOpenAiResponseFunctionToolCallOutput: Boolean,
  public val matchesOpenAiResponseFunctionToolCall: Boolean,
  public val matchesOutputItemImageGenerationCall: Boolean,
  public val matchesOutputMessage: Boolean,
  public val matchesOpenAiResponseCustomToolCall: Boolean,
  public val matchesOpenAiResponseCustomToolCallOutput: Boolean,
  public val matchesApplyPatchCallItem: Boolean,
  public val matchesApplyPatchCallOutputItem: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineBaseInputsAnyOf2ItemAnyOf1X4de472a0, matchesOpenAiResponseInputMessageItem, matchesOpenAiResponseFunctionToolCallOutput, matchesOpenAiResponseFunctionToolCall, matchesOutputItemImageGenerationCall, matchesOutputMessage, matchesOpenAiResponseCustomToolCall, matchesOpenAiResponseCustomToolCallOutput, matchesApplyPatchCallItem, matchesApplyPatchCallOutputItem).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items
 */
@Serializable(with = InlineBaseInputsAnyOf2ItemX5a05ae77.Serializer::class)
public class InlineBaseInputsAnyOf2ItemX5a05ae77 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBaseInputsAnyOf2ItemX5a05ae77Inspection,
) {
  public val inlineBaseInputsAnyOf2ItemAnyOf1X4de472a0:
      InlineBaseInputsAnyOf2ItemX5a05ae77InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1X4de472a0) json.decodeFromJsonElement<InlineBaseInputsAnyOf2ItemX5a05ae77InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0View>(raw) else null }

  public val openAiResponseInputMessageItem: OpenAiResponseInputMessageItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponseInputMessageItem) json.decodeFromJsonElement<OpenAiResponseInputMessageItemView>(raw) else null }

  public val openAiResponseFunctionToolCallOutput: OpenAiResponseFunctionToolCallOutputView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponseFunctionToolCallOutput) json.decodeFromJsonElement<OpenAiResponseFunctionToolCallOutputView>(raw) else null }

  public val openAiResponseFunctionToolCall: OpenAiResponseFunctionToolCallView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponseFunctionToolCall) json.decodeFromJsonElement<OpenAiResponseFunctionToolCallView>(raw) else null }

  public val outputItemImageGenerationCall: OutputItemImageGenerationCallView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputItemImageGenerationCall) json.decodeFromJsonElement<OutputItemImageGenerationCallView>(raw) else null }

  public val outputMessage: OutputMessageView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputMessage) json.decodeFromJsonElement<OutputMessageView>(raw) else null }

  public val openAiResponseCustomToolCall: OpenAiResponseCustomToolCallView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponseCustomToolCall) json.decodeFromJsonElement<OpenAiResponseCustomToolCallView>(raw) else null }

  public val openAiResponseCustomToolCallOutput: OpenAiResponseCustomToolCallOutputView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponseCustomToolCallOutput) json.decodeFromJsonElement<OpenAiResponseCustomToolCallOutputView>(raw) else null }

  public val applyPatchCallItem: ApplyPatchCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplyPatchCallItem) json.decodeFromJsonElement<ApplyPatchCallItemView>(raw) else null }

  public val applyPatchCallOutputItem: ApplyPatchCallOutputItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplyPatchCallOutputItem) json.decodeFromJsonElement<ApplyPatchCallOutputItemView>(raw) else null }

  public val matchedBranches: Set<InlineBaseInputsAnyOf2ItemX5a05ae77Branch>
    get() = buildSet {
      if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1X4de472a0) add(InlineBaseInputsAnyOf2ItemX5a05ae77Branch.InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0)
      if (inspection.matchesOpenAiResponseInputMessageItem) add(InlineBaseInputsAnyOf2ItemX5a05ae77Branch.OpenAiResponseInputMessageItem)
      if (inspection.matchesOpenAiResponseFunctionToolCallOutput) add(InlineBaseInputsAnyOf2ItemX5a05ae77Branch.OpenAiResponseFunctionToolCallOutput)
      if (inspection.matchesOpenAiResponseFunctionToolCall) add(InlineBaseInputsAnyOf2ItemX5a05ae77Branch.OpenAiResponseFunctionToolCall)
      if (inspection.matchesOutputItemImageGenerationCall) add(InlineBaseInputsAnyOf2ItemX5a05ae77Branch.OutputItemImageGenerationCall)
      if (inspection.matchesOutputMessage) add(InlineBaseInputsAnyOf2ItemX5a05ae77Branch.OutputMessage)
      if (inspection.matchesOpenAiResponseCustomToolCall) add(InlineBaseInputsAnyOf2ItemX5a05ae77Branch.OpenAiResponseCustomToolCall)
      if (inspection.matchesOpenAiResponseCustomToolCallOutput) add(InlineBaseInputsAnyOf2ItemX5a05ae77Branch.OpenAiResponseCustomToolCallOutput)
      if (inspection.matchesApplyPatchCallItem) add(InlineBaseInputsAnyOf2ItemX5a05ae77Branch.ApplyPatchCallItem)
      if (inspection.matchesApplyPatchCallOutputItem) add(InlineBaseInputsAnyOf2ItemX5a05ae77Branch.ApplyPatchCallOutputItem)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBaseInputsAnyOf2ItemX5a05ae77 {
      val inspection = inspectInlineBaseInputsAnyOf2ItemX5a05ae77(raw)
      if (inspection.matchCount == 0) {
        throw InlineBaseInputsAnyOf2ItemX5a05ae77NoMatchException("InlineBaseInputsAnyOf2ItemX5a05ae77 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBaseInputsAnyOf2ItemX5a05ae77(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBaseInputsAnyOf2ItemX5a05ae77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBaseInputsAnyOf2ItemX5a05ae77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBaseInputsAnyOf2ItemX5a05ae77")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBaseInputsAnyOf2ItemX5a05ae77) {
      encoder.requireJsonEncoder("InlineBaseInputsAnyOf2ItemX5a05ae77").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBaseInputsAnyOf2ItemX5a05ae77(element: JsonElement): InlineBaseInputsAnyOf2ItemX5a05ae77Inspection {
  val raw = element as? JsonObject ?: return InlineBaseInputsAnyOf2ItemX5a05ae77Inspection(
    matchesInlineBaseInputsAnyOf2ItemAnyOf1X4de472a0 = false,
    matchesOpenAiResponseInputMessageItem = false,
    matchesOpenAiResponseFunctionToolCallOutput = false,
    matchesOpenAiResponseFunctionToolCall = false,
    matchesOutputItemImageGenerationCall = false,
    matchesOutputMessage = false,
    matchesOpenAiResponseCustomToolCall = false,
    matchesOpenAiResponseCustomToolCallOutput = false,
    matchesApplyPatchCallItem = false,
    matchesApplyPatchCallOutputItem = false,
    failures = listOf("InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0: expected JSON object", "OpenAiResponseInputMessageItem: expected JSON object", "OpenAiResponseFunctionToolCallOutput: expected JSON object", "OpenAiResponseFunctionToolCall: expected JSON object", "OutputItemImageGenerationCall: expected JSON object", "OutputMessage: expected JSON object", "OpenAiResponseCustomToolCall: expected JSON object", "OpenAiResponseCustomToolCallOutput: expected JSON object", "ApplyPatchCallItem: expected JSON object", "ApplyPatchCallOutputItem: expected JSON object"),
  )
  val matchesInlineBaseInputsAnyOf2ItemAnyOf1X4de472a0 = raw["content"] != null && raw["role"] != null
  val matchesOpenAiResponseInputMessageItem = raw["content"] != null && raw["id"].isString() && raw["role"] != null
  val matchesOpenAiResponseFunctionToolCallOutput = raw["call_id"].isString() && raw["output"] != null && raw["type"] != null
  val matchesOpenAiResponseFunctionToolCall = raw["arguments"].isString() && raw["call_id"].isString() && raw["name"].isString() && raw["type"] != null
  val matchesOutputItemImageGenerationCall = raw["id"].isString() && raw["status"] != null && raw["type"] != null
  val matchesOutputMessage = raw["content"] != null && raw["id"].isString() && raw["role"] != null && raw["type"] != null
  val matchesOpenAiResponseCustomToolCall = raw["call_id"].isString() && raw["input"].isString() && raw["name"].isString() && raw["type"] != null
  val matchesOpenAiResponseCustomToolCallOutput = raw["call_id"].isString() && raw["output"] != null && raw["type"] != null
  val matchesApplyPatchCallItem = raw["call_id"].isString() && raw["operation"] != null && raw["status"] != null && raw["type"] != null
  val matchesApplyPatchCallOutputItem = raw["call_id"].isString() && raw["status"] != null && raw["type"] != null
  return InlineBaseInputsAnyOf2ItemX5a05ae77Inspection(
    matchesInlineBaseInputsAnyOf2ItemAnyOf1X4de472a0 = matchesInlineBaseInputsAnyOf2ItemAnyOf1X4de472a0,
    matchesOpenAiResponseInputMessageItem = matchesOpenAiResponseInputMessageItem,
    matchesOpenAiResponseFunctionToolCallOutput = matchesOpenAiResponseFunctionToolCallOutput,
    matchesOpenAiResponseFunctionToolCall = matchesOpenAiResponseFunctionToolCall,
    matchesOutputItemImageGenerationCall = matchesOutputItemImageGenerationCall,
    matchesOutputMessage = matchesOutputMessage,
    matchesOpenAiResponseCustomToolCall = matchesOpenAiResponseCustomToolCall,
    matchesOpenAiResponseCustomToolCallOutput = matchesOpenAiResponseCustomToolCallOutput,
    matchesApplyPatchCallItem = matchesApplyPatchCallItem,
    matchesApplyPatchCallOutputItem = matchesApplyPatchCallOutputItem,
    failures = buildList {
      if (!matchesInlineBaseInputsAnyOf2ItemAnyOf1X4de472a0) add("InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0: required properties 'content', 'role' do not match their declared types")
      if (!matchesOpenAiResponseInputMessageItem) add("OpenAiResponseInputMessageItem: required properties 'content', 'id', 'role' do not match their declared types")
      if (!matchesOpenAiResponseFunctionToolCallOutput) add("OpenAiResponseFunctionToolCallOutput: required properties 'call_id', 'output', 'type' do not match their declared types")
      if (!matchesOpenAiResponseFunctionToolCall) add("OpenAiResponseFunctionToolCall: required properties 'arguments', 'call_id', 'name', 'type' do not match their declared types")
      if (!matchesOutputItemImageGenerationCall) add("OutputItemImageGenerationCall: required properties 'id', 'status', 'type' do not match their declared types")
      if (!matchesOutputMessage) add("OutputMessage: required properties 'content', 'id', 'role', 'type' do not match their declared types")
      if (!matchesOpenAiResponseCustomToolCall) add("OpenAiResponseCustomToolCall: required properties 'call_id', 'input', 'name', 'type' do not match their declared types")
      if (!matchesOpenAiResponseCustomToolCallOutput) add("OpenAiResponseCustomToolCallOutput: required properties 'call_id', 'output', 'type' do not match their declared types")
      if (!matchesApplyPatchCallItem) add("ApplyPatchCallItem: required properties 'call_id', 'operation', 'status', 'type' do not match their declared types")
      if (!matchesApplyPatchCallOutputItem) add("ApplyPatchCallOutputItem: required properties 'call_id', 'status', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
