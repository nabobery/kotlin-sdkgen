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

public enum class InlineOutputMessageContentItemX9f591485Branch {
  ResponseOutputText,
  OpenAiResponsesRefusalContent,
}

public sealed class InlineOutputMessageContentItemX9f591485DecodingException(
  message: String,
) : SerializationException(message)

public class InlineOutputMessageContentItemX9f591485NoMatchException(
  message: String,
) : InlineOutputMessageContentItemX9f591485DecodingException(message)

internal data class InlineOutputMessageContentItemX9f591485Inspection(
  public val matchesResponseOutputText: Boolean,
  public val matchesOpenAiResponsesRefusalContent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesResponseOutputText, matchesOpenAiResponsesRefusalContent).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/content/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/content/items
 */
@Serializable(with = InlineOutputMessageContentItemX9f591485.Serializer::class)
public class InlineOutputMessageContentItemX9f591485 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineOutputMessageContentItemX9f591485Inspection,
) {
  public val responseOutputText: ResponseOutputTextView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesResponseOutputText) json.decodeFromJsonElement<ResponseOutputTextView>(raw) else null }

  public val openAiResponsesRefusalContent: OpenAiResponsesRefusalContentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponsesRefusalContent) json.decodeFromJsonElement<OpenAiResponsesRefusalContentView>(raw) else null }

  public val matchedBranches: Set<InlineOutputMessageContentItemX9f591485Branch>
    get() = buildSet {
      if (inspection.matchesResponseOutputText) add(InlineOutputMessageContentItemX9f591485Branch.ResponseOutputText)
      if (inspection.matchesOpenAiResponsesRefusalContent) add(InlineOutputMessageContentItemX9f591485Branch.OpenAiResponsesRefusalContent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOutputMessageContentItemX9f591485 {
      val inspection = inspectInlineOutputMessageContentItemX9f591485(raw)
      if (inspection.matchCount == 0) {
        throw InlineOutputMessageContentItemX9f591485NoMatchException("InlineOutputMessageContentItemX9f591485 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOutputMessageContentItemX9f591485(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMessageContentItemX9f591485> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputMessageContentItemX9f591485 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputMessageContentItemX9f591485")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputMessageContentItemX9f591485) {
      encoder.requireJsonEncoder("InlineOutputMessageContentItemX9f591485").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOutputMessageContentItemX9f591485(element: JsonElement): InlineOutputMessageContentItemX9f591485Inspection {
  val raw = element as? JsonObject ?: return InlineOutputMessageContentItemX9f591485Inspection(
    matchesResponseOutputText = false,
    matchesOpenAiResponsesRefusalContent = false,
    failures = listOf("ResponseOutputText: expected JSON object", "OpenAiResponsesRefusalContent: expected JSON object"),
  )
  val matchesResponseOutputText = raw["text"].isString() && raw["type"] != null
  val matchesOpenAiResponsesRefusalContent = raw["refusal"].isString() && raw["type"] != null
  return InlineOutputMessageContentItemX9f591485Inspection(
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
