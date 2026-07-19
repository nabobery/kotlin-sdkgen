package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Detailed completion token usage
 */
@Serializable(with = InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails.Serializer::class)
public class InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails(
  /**
   * Accepted prediction tokens
   */
  public val acceptedPredictionTokens: Int? = null,
  /**
   * Tokens used for audio output
   */
  public val audioTokens: Int? = null,
  /**
   * Tokens used for reasoning
   */
  public val reasoningTokens: Int? = null,
  /**
   * Rejected prediction tokens
   */
  public val rejectedPredictionTokens: Int? = null,
) {
  public class Builder {
    /**
     * Accepted prediction tokens
     */
    public var acceptedPredictionTokens: Int? = null

    /**
     * Tokens used for audio output
     */
    public var audioTokens: Int? = null

    /**
     * Tokens used for reasoning
     */
    public var reasoningTokens: Int? = null

    /**
     * Rejected prediction tokens
     */
    public var rejectedPredictionTokens: Int? = null

    public fun build(): InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails =
      InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails(
      acceptedPredictionTokens = acceptedPredictionTokens,
      audioTokens = audioTokens,
      reasoningTokens = reasoningTokens,
      rejectedPredictionTokens = rejectedPredictionTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails must be a " +
          "JSON object")
      return InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails(
        acceptedPredictionTokens = raw["accepted_prediction_tokens"]?.let { element ->
          if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        audioTokens = raw["audio_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        reasoningTokens = raw["reasoning_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        rejectedPredictionTokens = raw["rejected_prediction_tokens"]?.let { element ->
          if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.acceptedPredictionTokens?.let { put("accepted_prediction_tokens", json.encodeToJsonElement(it)) }
        value.audioTokens?.let { put("audio_tokens", json.encodeToJsonElement(it)) }
        value.reasoningTokens?.let { put("reasoning_tokens", json.encodeToJsonElement(it)) }
        value.rejectedPredictionTokens?.let { put("rejected_prediction_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails(block: InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails.Builder.() -> Unit): InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails = InlineComponentsSchemasChatUsagePropertiesCompletionTokensDetails.build(block)
