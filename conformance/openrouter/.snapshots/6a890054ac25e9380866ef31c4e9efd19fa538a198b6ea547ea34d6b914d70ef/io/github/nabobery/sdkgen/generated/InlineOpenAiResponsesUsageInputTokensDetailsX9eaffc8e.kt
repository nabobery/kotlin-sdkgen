package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesUsage/properties/input_tokens_details
 */
@Serializable(with = InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e.Serializer::class)
public class InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e(
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

    public fun build(): InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e {
      check(cachedTokensValue != null) { "cachedTokens is required" }
      return InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e(
        cachedTokens = cachedTokens,
        cacheWriteTokens = cacheWriteTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e must be a JSON object")
      val cachedTokens = json.decodeRequired<Int>(rawObject, "cached_tokens")
      return InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e(
        cachedTokens = cachedTokens,
        cacheWriteTokens = rawObject["cache_write_tokens"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cached_tokens", json.encodeToJsonElement(value.cachedTokens))
        value.cacheWriteTokens?.let { put("cache_write_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e(block: InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e.Builder.() -> Unit): InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e = InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
