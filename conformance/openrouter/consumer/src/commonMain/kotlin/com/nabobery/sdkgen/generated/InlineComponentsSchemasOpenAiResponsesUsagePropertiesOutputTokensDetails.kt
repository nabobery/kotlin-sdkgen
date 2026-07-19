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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesUsage/properties/output_tokens_details.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails.Serializer::class)
public class InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails(
  public val reasoningTokens: Int,
) {
  public class Builder {
    private var reasoningTokensValue: Int? = null

    public var reasoningTokens: Int
      get() = requireNotNull(reasoningTokensValue) { "reasoningTokens is required" }
      set(`value`) {
        reasoningTokensValue = value
      }

    public fun build(): InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails {
      check(reasoningTokensValue != null) { "reasoningTokens is required" }
      return InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails(
        reasoningTokens = reasoningTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails must " +
          "be a JSON object")
      val reasoningTokens = json.decodeRequired<Int>(raw, "reasoning_tokens")
      return InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails(
        reasoningTokens = reasoningTokens,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reasoning_tokens", json.encodeToJsonElement(value.reasoningTokens))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails(block: InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails.Builder.() -> Unit): InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails = InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
