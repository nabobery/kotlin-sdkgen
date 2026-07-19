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
public data class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0View(
  public val content: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent,
  public val phase: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase? = null,
  public val role: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole,
  public val type: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType? = null,
)

public enum class InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch {
  InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0,
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

public sealed class InlineComponentsSchemasBaseInputsAnyOf1ItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasBaseInputsAnyOf1ItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasBaseInputsAnyOf1ItemsDecodingException(message)

internal data class InlineComponentsSchemasBaseInputsAnyOf1ItemsInspection(
  public val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0: Boolean,
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
    get() = listOf(matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0, matchesOpenAiResponseInputMessageItem,
      matchesOpenAiResponseFunctionToolCallOutput, matchesOpenAiResponseFunctionToolCall,
        matchesOutputItemImageGenerationCall, matchesOutputMessage, matchesOpenAiResponseCustomToolCall,
          matchesOpenAiResponseCustomToolCallOutput, matchesApplyPatchCallItem, matchesApplyPatchCallOutputItem)
            .count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items.
 */
@Serializable(with = InlineComponentsSchemasBaseInputsAnyOf1Items.Serializer::class)
public class InlineComponentsSchemasBaseInputsAnyOf1Items internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasBaseInputsAnyOf1ItemsInspection,
) {
  public val inlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0:
      InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0) json
        .decodeFromJsonElement<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0View>(raw) else null }

  public val openAiResponseInputMessageItem: OpenAiResponseInputMessageItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponseInputMessageItem) json
        .decodeFromJsonElement<OpenAiResponseInputMessageItemView>(raw) else null }

  public val openAiResponseFunctionToolCallOutput: OpenAiResponseFunctionToolCallOutputView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponseFunctionToolCallOutput) json
        .decodeFromJsonElement<OpenAiResponseFunctionToolCallOutputView>(raw) else null }

  public val openAiResponseFunctionToolCall: OpenAiResponseFunctionToolCallView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponseFunctionToolCall) json
        .decodeFromJsonElement<OpenAiResponseFunctionToolCallView>(raw) else null }

  public val outputItemImageGenerationCall: OutputItemImageGenerationCallView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputItemImageGenerationCall) json
        .decodeFromJsonElement<OutputItemImageGenerationCallView>(raw) else null }

  public val outputMessage: OutputMessageView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutputMessage) json
        .decodeFromJsonElement<OutputMessageView>(raw) else null }

  public val openAiResponseCustomToolCall: OpenAiResponseCustomToolCallView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponseCustomToolCall) json
        .decodeFromJsonElement<OpenAiResponseCustomToolCallView>(raw) else null }

  public val openAiResponseCustomToolCallOutput: OpenAiResponseCustomToolCallOutputView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponseCustomToolCallOutput) json
        .decodeFromJsonElement<OpenAiResponseCustomToolCallOutputView>(raw) else null }

  public val applyPatchCallItem: ApplyPatchCallItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplyPatchCallItem) json
        .decodeFromJsonElement<ApplyPatchCallItemView>(raw) else null }

  public val applyPatchCallOutputItem: ApplyPatchCallOutputItemView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplyPatchCallOutputItem) json
        .decodeFromJsonElement<ApplyPatchCallOutputItemView>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch.InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0)
      if (inspection.matchesOpenAiResponseInputMessageItem) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch
        .OpenAiResponseInputMessageItem)
      if (inspection
        .matchesOpenAiResponseFunctionToolCallOutput) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch
          .OpenAiResponseFunctionToolCallOutput)
      if (inspection.matchesOpenAiResponseFunctionToolCall) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch
        .OpenAiResponseFunctionToolCall)
      if (inspection.matchesOutputItemImageGenerationCall) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch
        .OutputItemImageGenerationCall)
      if (inspection.matchesOutputMessage) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch.OutputMessage)
      if (inspection.matchesOpenAiResponseCustomToolCall) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch
        .OpenAiResponseCustomToolCall)
      if (inspection.matchesOpenAiResponseCustomToolCallOutput) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch
        .OpenAiResponseCustomToolCallOutput)
      if (inspection.matchesApplyPatchCallItem) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch
        .ApplyPatchCallItem)
      if (inspection.matchesApplyPatchCallOutputItem) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsBranch
        .ApplyPatchCallOutputItem)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineComponentsSchemasBaseInputsAnyOf1Items {
      val inspection = inspectInlineComponentsSchemasBaseInputsAnyOf1Items(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasBaseInputsAnyOf1ItemsNoMatchException("InlineComponentsSchemasBaseInputsAnyOf1Items " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasBaseInputsAnyOf1Items(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseInputsAnyOf1Items> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseInputsAnyOf1Items {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasBaseInputsAnyOf1Items")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseInputsAnyOf1Items) {
      encoder.requireJsonEncoder("InlineComponentsSchemasBaseInputsAnyOf1Items").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasBaseInputsAnyOf1Items(element: JsonElement): InlineComponentsSchemasBaseInputsAnyOf1ItemsInspection {
  val raw = element as? JsonObject ?: return InlineComponentsSchemasBaseInputsAnyOf1ItemsInspection(
    matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0 = false,
    matchesOpenAiResponseInputMessageItem = false,
    matchesOpenAiResponseFunctionToolCallOutput = false,
    matchesOpenAiResponseFunctionToolCall = false,
    matchesOutputItemImageGenerationCall = false,
    matchesOutputMessage = false,
    matchesOpenAiResponseCustomToolCall = false,
    matchesOpenAiResponseCustomToolCallOutput = false,
    matchesApplyPatchCallItem = false,
    matchesApplyPatchCallOutputItem = false,
    failures = listOf("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0: expected JSON object",
      "OpenAiResponseInputMessageItem: expected JSON object",
        "OpenAiResponseFunctionToolCallOutput: expected JSON object",
          "OpenAiResponseFunctionToolCall: expected JSON object",
            "OutputItemImageGenerationCall: expected JSON object", "OutputMessage: expected JSON object",
              "OpenAiResponseCustomToolCall: expected JSON object",
                "OpenAiResponseCustomToolCallOutput: expected JSON object", "ApplyPatchCallItem: expected JSON object",
                  "ApplyPatchCallOutputItem: expected JSON object"),
  )
  val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0 = raw["content"] != null && raw["role"] != null
  val matchesOpenAiResponseInputMessageItem = raw["content"] != null && raw["id"].isString() && raw["role"] != null
  val matchesOpenAiResponseFunctionToolCallOutput = raw["call_id"].isString() && raw["output"] != null &&
    raw["type"] != null
  val matchesOpenAiResponseFunctionToolCall = raw["arguments"].isString() && raw["call_id"].isString() && raw["name"]
    .isString() && raw["type"] != null
  val matchesOutputItemImageGenerationCall = raw["id"].isString() && raw["status"] != null && raw["type"] != null
  val matchesOutputMessage = raw["content"] != null && raw["id"].isString() && raw["role"] != null &&
    raw["type"] != null
  val matchesOpenAiResponseCustomToolCall = raw["call_id"].isString() && raw["input"].isString() && raw["name"]
    .isString() && raw["type"] != null
  val matchesOpenAiResponseCustomToolCallOutput = raw["call_id"].isString() && raw["output"] != null &&
    raw["type"] != null
  val matchesApplyPatchCallItem = raw["call_id"].isString() && raw["operation"] != null && raw["status"] != null &&
    raw["type"] != null
  val matchesApplyPatchCallOutputItem = raw["call_id"].isString() && raw["status"] != null && raw["type"] != null
  return InlineComponentsSchemasBaseInputsAnyOf1ItemsInspection(
    matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0 =
      matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0,
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
      if (!matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0) add("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0: " +
        "required properties 'content', 'role' do not match their declared types")
      if (!matchesOpenAiResponseInputMessageItem) add("OpenAiResponseInputMessageItem: required properties 'content', " +
        "'id', 'role' do not match their declared types")
      if (!matchesOpenAiResponseFunctionToolCallOutput) add("OpenAiResponseFunctionToolCallOutput: required " +
        "properties 'call_id', 'output', 'type' do not match their declared types")
      if (!matchesOpenAiResponseFunctionToolCall) add("OpenAiResponseFunctionToolCall: required properties " +
        "'arguments', 'call_id', 'name', 'type' do not match their declared types")
      if (!matchesOutputItemImageGenerationCall) add("OutputItemImageGenerationCall: required properties 'id', " +
        "'status', 'type' do not match their declared types")
      if (!matchesOutputMessage) add("OutputMessage: required properties 'content', 'id', 'role', 'type' do not match " +
        "their declared types")
      if (!matchesOpenAiResponseCustomToolCall) add("OpenAiResponseCustomToolCall: required properties 'call_id', " +
        "'input', 'name', 'type' do not match their declared types")
      if (!matchesOpenAiResponseCustomToolCallOutput) add("OpenAiResponseCustomToolCallOutput: required properties " +
        "'call_id', 'output', 'type' do not match their declared types")
      if (!matchesApplyPatchCallItem) add("ApplyPatchCallItem: required properties 'call_id', 'operation', 'status', " +
        "'type' do not match their declared types")
      if (!matchesApplyPatchCallOutputItem) add("ApplyPatchCallOutputItem: required properties 'call_id', 'status', " +
        "'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
