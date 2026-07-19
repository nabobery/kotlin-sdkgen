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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesUsage.
 */
@Serializable(with = OpenAiResponsesUsage.Serializer::class)
public class OpenAiResponsesUsage(
  public val inputTokens: Int,
  public val inputTokensDetails:
      InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails,
  public val outputTokens: Int,
  public val outputTokensDetails:
      InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails,
  public val totalTokens: Int,
) {
  public class Builder {
    private var inputTokensValue: Int? = null

    public var inputTokens: Int
      get() = requireNotNull(inputTokensValue) { "inputTokens is required" }
      set(`value`) {
        inputTokensValue = value
      }

    private var inputTokensDetailsValue:
        InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails? = null

    public var inputTokensDetails:
        InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails
      get() = requireNotNull(inputTokensDetailsValue) { "inputTokensDetails is required" }
      set(`value`) {
        inputTokensDetailsValue = value
      }

    private var outputTokensValue: Int? = null

    public var outputTokens: Int
      get() = requireNotNull(outputTokensValue) { "outputTokens is required" }
      set(`value`) {
        outputTokensValue = value
      }

    private var outputTokensDetailsValue:
        InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails? = null

    public var outputTokensDetails:
        InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails
      get() = requireNotNull(outputTokensDetailsValue) { "outputTokensDetails is required" }
      set(`value`) {
        outputTokensDetailsValue = value
      }

    private var totalTokensValue: Int? = null

    public var totalTokens: Int
      get() = requireNotNull(totalTokensValue) { "totalTokens is required" }
      set(`value`) {
        totalTokensValue = value
      }

    public fun build(): OpenAiResponsesUsage {
      check(inputTokensValue != null) { "inputTokens is required" }
      check(inputTokensDetailsValue != null) { "inputTokensDetails is required" }
      check(outputTokensValue != null) { "outputTokens is required" }
      check(outputTokensDetailsValue != null) { "outputTokensDetails is required" }
      check(totalTokensValue != null) { "totalTokens is required" }
      return OpenAiResponsesUsage(
        inputTokens = inputTokens,
        inputTokensDetails = inputTokensDetails,
        outputTokens = outputTokens,
        outputTokensDetails = outputTokensDetails,
        totalTokens = totalTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenAiResponsesUsage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OpenAiResponsesUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponsesUsage {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponsesUsage")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OpenAiResponsesUsage must be a JSON object")
      val inputTokens = json.decodeRequired<Int>(raw, "input_tokens")
      val inputTokensDetails = json
        .decodeRequired<InlineComponentsSchemasOpenAiResponsesUsagePropertiesInputTokensDetails>(raw,
          "input_tokens_details")
      val outputTokens = json.decodeRequired<Int>(raw, "output_tokens")
      val outputTokensDetails = json
        .decodeRequired<InlineComponentsSchemasOpenAiResponsesUsagePropertiesOutputTokensDetails>(raw,
          "output_tokens_details")
      val totalTokens = json.decodeRequired<Int>(raw, "total_tokens")
      return OpenAiResponsesUsage(
        inputTokens = inputTokens,
        inputTokensDetails = inputTokensDetails,
        outputTokens = outputTokens,
        outputTokensDetails = outputTokensDetails,
        totalTokens = totalTokens,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiResponsesUsage) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenAiResponsesUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_tokens", json.encodeToJsonElement(value.inputTokens))
        put("input_tokens_details", json.encodeToJsonElement(value.inputTokensDetails))
        put("output_tokens", json.encodeToJsonElement(value.outputTokens))
        put("output_tokens_details", json.encodeToJsonElement(value.outputTokensDetails))
        put("total_tokens", json.encodeToJsonElement(value.totalTokens))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openAiResponsesUsage(block: OpenAiResponsesUsage.Builder.() -> Unit): OpenAiResponsesUsage =
  OpenAiResponsesUsage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenAiResponsesUsage is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
