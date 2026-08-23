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

public enum class InlineBaseContentPartAddedEventPartXe4ac1bd0Branch {
  ResponseOutputText,
  OpenAiResponsesRefusalContent,
}

public sealed class InlineBaseContentPartAddedEventPartXe4ac1bd0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBaseContentPartAddedEventPartXe4ac1bd0NoMatchException(
  message: String,
) : InlineBaseContentPartAddedEventPartXe4ac1bd0DecodingException(message)

internal data class InlineBaseContentPartAddedEventPartXe4ac1bd0Inspection(
  public val matchesResponseOutputText: Boolean,
  public val matchesOpenAiResponsesRefusalContent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesResponseOutputText, matchesOpenAiResponsesRefusalContent).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/BaseContentPartAddedEvent/properties/part.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseContentPartAddedEvent/properties/part
 */
@Serializable(with = InlineBaseContentPartAddedEventPartXe4ac1bd0.Serializer::class)
public class InlineBaseContentPartAddedEventPartXe4ac1bd0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBaseContentPartAddedEventPartXe4ac1bd0Inspection,
) {
  public val responseOutputText: ResponseOutputTextView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesResponseOutputText) json.decodeFromJsonElement<ResponseOutputTextView>(raw) else null }

  public val openAiResponsesRefusalContent: OpenAiResponsesRefusalContentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponsesRefusalContent) json.decodeFromJsonElement<OpenAiResponsesRefusalContentView>(raw) else null }

  public val matchedBranches: Set<InlineBaseContentPartAddedEventPartXe4ac1bd0Branch>
    get() = buildSet {
      if (inspection.matchesResponseOutputText) add(InlineBaseContentPartAddedEventPartXe4ac1bd0Branch.ResponseOutputText)
      if (inspection.matchesOpenAiResponsesRefusalContent) add(InlineBaseContentPartAddedEventPartXe4ac1bd0Branch.OpenAiResponsesRefusalContent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBaseContentPartAddedEventPartXe4ac1bd0 {
      val inspection = inspectInlineBaseContentPartAddedEventPartXe4ac1bd0(raw)
      if (inspection.matchCount == 0) {
        throw InlineBaseContentPartAddedEventPartXe4ac1bd0NoMatchException("InlineBaseContentPartAddedEventPartXe4ac1bd0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBaseContentPartAddedEventPartXe4ac1bd0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBaseContentPartAddedEventPartXe4ac1bd0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBaseContentPartAddedEventPartXe4ac1bd0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBaseContentPartAddedEventPartXe4ac1bd0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBaseContentPartAddedEventPartXe4ac1bd0) {
      encoder.requireJsonEncoder("InlineBaseContentPartAddedEventPartXe4ac1bd0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBaseContentPartAddedEventPartXe4ac1bd0(element: JsonElement): InlineBaseContentPartAddedEventPartXe4ac1bd0Inspection {
  val raw = element as? JsonObject ?: return InlineBaseContentPartAddedEventPartXe4ac1bd0Inspection(
    matchesResponseOutputText = false,
    matchesOpenAiResponsesRefusalContent = false,
    failures = listOf("ResponseOutputText: expected JSON object", "OpenAiResponsesRefusalContent: expected JSON object"),
  )
  val matchesResponseOutputText = raw["text"].isString() && raw["type"] != null
  val matchesOpenAiResponsesRefusalContent = raw["refusal"].isString() && raw["type"] != null
  return InlineBaseContentPartAddedEventPartXe4ac1bd0Inspection(
    matchesResponseOutputText = matchesResponseOutputText,
    matchesOpenAiResponsesRefusalContent = matchesOpenAiResponsesRefusalContent,
    failures = buildList {
      if (!matchesResponseOutputText) add("ResponseOutputText: required properties 'text', 'type' do not match their declared types")
      if (!matchesOpenAiResponsesRefusalContent) add("OpenAiResponsesRefusalContent: required properties 'refusal', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
