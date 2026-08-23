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

public enum class InlineContentPartDoneEventAllOf2PartXf7ed8294Branch {
  ResponseOutputText,
  ReasoningTextContent,
  OpenAiResponsesRefusalContent,
}

public sealed class InlineContentPartDoneEventAllOf2PartXf7ed8294DecodingException(
  message: String,
) : SerializationException(message)

public class InlineContentPartDoneEventAllOf2PartXf7ed8294NoMatchException(
  message: String,
) : InlineContentPartDoneEventAllOf2PartXf7ed8294DecodingException(message)

internal data class InlineContentPartDoneEventAllOf2PartXf7ed8294Inspection(
  public val matchesResponseOutputText: Boolean,
  public val matchesReasoningTextContent: Boolean,
  public val matchesOpenAiResponsesRefusalContent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesResponseOutputText, matchesReasoningTextContent, matchesOpenAiResponsesRefusalContent).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/ContentPartDoneEvent/allOf/1/properties/part.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartDoneEvent/allOf/1/properties/part
 */
@Serializable(with = InlineContentPartDoneEventAllOf2PartXf7ed8294.Serializer::class)
public class InlineContentPartDoneEventAllOf2PartXf7ed8294 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineContentPartDoneEventAllOf2PartXf7ed8294Inspection,
) {
  public val responseOutputText: ResponseOutputTextView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesResponseOutputText) json.decodeFromJsonElement<ResponseOutputTextView>(raw) else null }

  public val reasoningTextContent: ReasoningTextContentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesReasoningTextContent) json.decodeFromJsonElement<ReasoningTextContentView>(raw) else null }

  public val openAiResponsesRefusalContent: OpenAiResponsesRefusalContentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponsesRefusalContent) json.decodeFromJsonElement<OpenAiResponsesRefusalContentView>(raw) else null }

  public val matchedBranches: Set<InlineContentPartDoneEventAllOf2PartXf7ed8294Branch>
    get() = buildSet {
      if (inspection.matchesResponseOutputText) add(InlineContentPartDoneEventAllOf2PartXf7ed8294Branch.ResponseOutputText)
      if (inspection.matchesReasoningTextContent) add(InlineContentPartDoneEventAllOf2PartXf7ed8294Branch.ReasoningTextContent)
      if (inspection.matchesOpenAiResponsesRefusalContent) add(InlineContentPartDoneEventAllOf2PartXf7ed8294Branch.OpenAiResponsesRefusalContent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineContentPartDoneEventAllOf2PartXf7ed8294 {
      val inspection = inspectInlineContentPartDoneEventAllOf2PartXf7ed8294(raw)
      if (inspection.matchCount == 0) {
        throw InlineContentPartDoneEventAllOf2PartXf7ed8294NoMatchException("InlineContentPartDoneEventAllOf2PartXf7ed8294 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineContentPartDoneEventAllOf2PartXf7ed8294(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineContentPartDoneEventAllOf2PartXf7ed8294> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineContentPartDoneEventAllOf2PartXf7ed8294 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineContentPartDoneEventAllOf2PartXf7ed8294")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineContentPartDoneEventAllOf2PartXf7ed8294) {
      encoder.requireJsonEncoder("InlineContentPartDoneEventAllOf2PartXf7ed8294").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineContentPartDoneEventAllOf2PartXf7ed8294(element: JsonElement): InlineContentPartDoneEventAllOf2PartXf7ed8294Inspection {
  val raw = element as? JsonObject ?: return InlineContentPartDoneEventAllOf2PartXf7ed8294Inspection(
    matchesResponseOutputText = false,
    matchesReasoningTextContent = false,
    matchesOpenAiResponsesRefusalContent = false,
    failures = listOf("ResponseOutputText: expected JSON object", "ReasoningTextContent: expected JSON object", "OpenAiResponsesRefusalContent: expected JSON object"),
  )
  val matchesResponseOutputText = raw["text"].isString() && raw["type"] != null
  val matchesReasoningTextContent = raw["text"].isString() && raw["type"] != null
  val matchesOpenAiResponsesRefusalContent = raw["refusal"].isString() && raw["type"] != null
  return InlineContentPartDoneEventAllOf2PartXf7ed8294Inspection(
    matchesResponseOutputText = matchesResponseOutputText,
    matchesReasoningTextContent = matchesReasoningTextContent,
    matchesOpenAiResponsesRefusalContent = matchesOpenAiResponsesRefusalContent,
    failures = buildList {
      if (!matchesResponseOutputText) add("ResponseOutputText: required properties 'text', 'type' do not match their declared types")
      if (!matchesReasoningTextContent) add("ReasoningTextContent: required properties 'text', 'type' do not match their declared types")
      if (!matchesOpenAiResponsesRefusalContent) add("OpenAiResponsesRefusalContent: required properties 'refusal', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
