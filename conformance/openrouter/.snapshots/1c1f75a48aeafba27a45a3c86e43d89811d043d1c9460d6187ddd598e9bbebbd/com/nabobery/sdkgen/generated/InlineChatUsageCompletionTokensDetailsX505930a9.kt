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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatUsage/properties/completion_tokens_details
 */
@Serializable(with = InlineChatUsageCompletionTokensDetailsX505930a9.Serializer::class)
public class InlineChatUsageCompletionTokensDetailsX505930a9(
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

    public fun build(): InlineChatUsageCompletionTokensDetailsX505930a9 = InlineChatUsageCompletionTokensDetailsX505930a9(
      acceptedPredictionTokens = acceptedPredictionTokens,
      audioTokens = audioTokens,
      reasoningTokens = reasoningTokens,
      rejectedPredictionTokens = rejectedPredictionTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatUsageCompletionTokensDetailsX505930a9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatUsageCompletionTokensDetailsX505930a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatUsageCompletionTokensDetailsX505930a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatUsageCompletionTokensDetailsX505930a9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatUsageCompletionTokensDetailsX505930a9 must be a JSON object")
      return InlineChatUsageCompletionTokensDetailsX505930a9(
        acceptedPredictionTokens = rawObject["accepted_prediction_tokens"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        audioTokens = rawObject["audio_tokens"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        reasoningTokens = rawObject["reasoning_tokens"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        rejectedPredictionTokens = rawObject["rejected_prediction_tokens"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatUsageCompletionTokensDetailsX505930a9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatUsageCompletionTokensDetailsX505930a9")
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

public fun inlineChatUsageCompletionTokensDetailsX505930a9(block: InlineChatUsageCompletionTokensDetailsX505930a9.Builder.() -> Unit): InlineChatUsageCompletionTokensDetailsX505930a9 = InlineChatUsageCompletionTokensDetailsX505930a9.build(block)
