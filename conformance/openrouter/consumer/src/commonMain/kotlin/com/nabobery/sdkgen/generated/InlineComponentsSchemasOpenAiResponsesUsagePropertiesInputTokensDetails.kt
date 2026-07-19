package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesUsage/properties/input_tokens_details.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails.Serializer::class)
public class InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails(
  public val cachedTokens: Int,
  public val cacheWriteTokens: Int? = null,
) {
  public class Builder {
    private var cachedTokensValue: Int? = null

    public var cachedTokens: Int
      get() = requireNotNull(cachedTokensValue) { "cachedTokens is required" }
      set(`value`) {
        cachedTokensValue = value
      }

    public var cacheWriteTokens: Int? = null

    public fun build(): InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails {
      check(cachedTokensValue != null) { "cachedTokens is required" }
      return InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails(
        cachedTokens = cachedTokens,
        cacheWriteTokens = cacheWriteTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails must be " +
          "a JSON object")
      val cachedTokens = json.decodeRequired<Int>(raw, "cached_tokens")
      return InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails(
        cachedTokens = cachedTokens,
        cacheWriteTokens = raw["cache_write_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cached_tokens", json.encodeToJsonElement(value.cachedTokens))
        value.cacheWriteTokens?.let { put("cache_write_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails(block: InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails.Builder.() -> Unit): InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails = InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
