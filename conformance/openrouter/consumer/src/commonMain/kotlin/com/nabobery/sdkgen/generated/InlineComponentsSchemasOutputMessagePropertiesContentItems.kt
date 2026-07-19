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

public enum class InlineComponentsSchemasOutputMessagePropertiesContentItemsBranch {
  ResponseOutputText,
  OpenAiResponsesRefusalContent,
}

public sealed class InlineComponentsSchemasOutputMessagePropertiesContentItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOutputMessagePropertiesContentItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasOutputMessagePropertiesContentItemsDecodingException(message)

internal data class InlineComponentsSchemasOutputMessagePropertiesContentItemsInspection(
  public val matchesResponseOutputText: Boolean,
  public val matchesOpenAiResponsesRefusalContent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesResponseOutputText, matchesOpenAiResponsesRefusalContent).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/content/items.
 */
@Serializable(with = InlineComponentsSchemasOutputMessagePropertiesContentItems.Serializer::class)
public class InlineComponentsSchemasOutputMessagePropertiesContentItems internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasOutputMessagePropertiesContentItemsInspection,
) {
  public val responseOutputText: ResponseOutputTextView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesResponseOutputText) json
        .decodeFromJsonElement<ResponseOutputTextView>(raw) else null }

  public val openAiResponsesRefusalContent: OpenAiResponsesRefusalContentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponsesRefusalContent) json
        .decodeFromJsonElement<OpenAiResponsesRefusalContentView>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasOutputMessagePropertiesContentItemsBranch>
    get() = buildSet {
      if (inspection.matchesResponseOutputText) add(InlineComponentsSchemasOutputMessagePropertiesContentItemsBranch
        .ResponseOutputText)
      if (inspection
        .matchesOpenAiResponsesRefusalContent) add(InlineComponentsSchemasOutputMessagePropertiesContentItemsBranch
          .OpenAiResponsesRefusalContent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasOutputMessagePropertiesContentItems {
      val inspection = inspectInlineComponentsSchemasOutputMessagePropertiesContentItems(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasOutputMessagePropertiesContentItemsNoMatchException("InlineComponentsSchemasOutputMessagePropertiesContentItems " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasOutputMessagePropertiesContentItems(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputMessagePropertiesContentItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputMessagePropertiesContentItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasOutputMessagePropertiesContentItems")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputMessagePropertiesContentItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasOutputMessagePropertiesContentItems").encodeJsonElement(value
        .raw)
    }
  }
}

private fun inspectInlineComponentsSchemasOutputMessagePropertiesContentItems(element: JsonElement): InlineComponentsSchemasOutputMessagePropertiesContentItemsInspection {
  val raw = element as? JsonObject ?: return InlineComponentsSchemasOutputMessagePropertiesContentItemsInspection(
    matchesResponseOutputText = false,
    matchesOpenAiResponsesRefusalContent = false,
    failures = listOf("ResponseOutputText: expected JSON object",
      "OpenAiResponsesRefusalContent: expected JSON object"),
  )
  val matchesResponseOutputText = raw["text"].isString() && raw["type"] != null
  val matchesOpenAiResponsesRefusalContent = raw["refusal"].isString() && raw["type"] != null
  return InlineComponentsSchemasOutputMessagePropertiesContentItemsInspection(
    matchesResponseOutputText = matchesResponseOutputText,
    matchesOpenAiResponsesRefusalContent = matchesOpenAiResponsesRefusalContent,
    failures = buildList {
      if (!matchesResponseOutputText) add("ResponseOutputText: required properties 'text', 'type' do not match their " +
        "declared types")
      if (!matchesOpenAiResponsesRefusalContent) add("OpenAiResponsesRefusalContent: required properties 'refusal', " +
        "'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
