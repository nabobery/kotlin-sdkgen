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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesUsage/properties/output_tokens_details.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesUsage/properties/output_tokens_details
 */
@Serializable(with = InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3.Serializer::class)
public class InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3(
  public val reasoningTokens: Int,
) {
  public class Builder {
    private var reasoningTokensValue: Int? = null

    public var reasoningTokens: Int
      get() = requireNotNull(reasoningTokensValue) { "reasoningTokens is required" }
      set(`value`) {
        reasoningTokensValue = value
      }

    public fun build(): InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3 {
      check(reasoningTokensValue != null) { "reasoningTokens is required" }
      return InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3(
        reasoningTokens = reasoningTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3 must be a JSON object")
      val reasoningTokens = json.decodeRequired<Int>(rawObject, "reasoning_tokens")
      return InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3(
        reasoningTokens = reasoningTokens,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reasoning_tokens", json.encodeToJsonElement(value.reasoningTokens))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3(block: InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3.Builder.() -> Unit): InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3 = InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
