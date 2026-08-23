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

public enum class InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881Branch {
  ResponseOutputText,
  OpenAiResponsesRefusalContent,
}

public sealed class InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881NoMatchException(
  message: String,
) : InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881DecodingException(message)

internal data class InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881Inspection(
  public val matchesResponseOutputText: Boolean,
  public val matchesOpenAiResponsesRefusalContent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesResponseOutputText, matchesOpenAiResponsesRefusalContent).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/Inputs/anyOf/1/items/anyOf/7/allOf/1/properties/content/anyOf/0/item
 * s.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/Inputs/anyOf/1/items/anyOf/7/allOf/1/properties/content/anyOf/0/item
 * s
 */
@Serializable(with = InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881.Serializer::class)
public class InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881Inspection,
) {
  public val responseOutputText: ResponseOutputTextView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesResponseOutputText) json.decodeFromJsonElement<ResponseOutputTextView>(raw) else null }

  public val openAiResponsesRefusalContent: OpenAiResponsesRefusalContentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponsesRefusalContent) json.decodeFromJsonElement<OpenAiResponsesRefusalContentView>(raw) else null }

  public val matchedBranches:
      Set<InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881Branch>
    get() = buildSet {
      if (inspection.matchesResponseOutputText) add(InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881Branch.ResponseOutputText)
      if (inspection.matchesOpenAiResponsesRefusalContent) add(InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881Branch.OpenAiResponsesRefusalContent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881 {
      val inspection = inspectInlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881(raw)
      if (inspection.matchCount == 0) {
        throw InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881NoMatchException("InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881) {
      encoder.requireJsonEncoder("InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881(element: JsonElement): InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881Inspection {
  val raw = element as? JsonObject ?: return InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881Inspection(
    matchesResponseOutputText = false,
    matchesOpenAiResponsesRefusalContent = false,
    failures = listOf("ResponseOutputText: expected JSON object", "OpenAiResponsesRefusalContent: expected JSON object"),
  )
  val matchesResponseOutputText = raw["text"].isString() && raw["type"] != null
  val matchesOpenAiResponsesRefusalContent = raw["refusal"].isString() && raw["type"] != null
  return InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881Inspection(
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
