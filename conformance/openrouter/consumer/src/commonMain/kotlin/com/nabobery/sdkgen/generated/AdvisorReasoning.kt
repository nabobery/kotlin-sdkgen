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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Reasoning configuration forwarded to the advisor call. Use this to control reasoning effort and token budget for
 * models that support extended thinking.
 */
@Serializable(with = AdvisorReasoning.Serializer::class)
public class AdvisorReasoning(
  /**
   * Reasoning effort level for the advisor call.
   */
  public val effort: InlineComponentsSchemasAdvisorReasoningPropertiesEffort? = null,
  /**
   * Maximum number of reasoning tokens the advisor may use.
   */
  public val maxTokens: Int? = null,
) {
  public class Builder {
    /**
     * Reasoning effort level for the advisor call.
     */
    public var effort: InlineComponentsSchemasAdvisorReasoningPropertiesEffort? = null

    /**
     * Maximum number of reasoning tokens the advisor may use.
     */
    public var maxTokens: Int? = null

    public fun build(): AdvisorReasoning = AdvisorReasoning(
      effort = effort,
      maxTokens = maxTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AdvisorReasoning = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AdvisorReasoning> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AdvisorReasoning {
      val jsonDecoder = decoder.requireJsonDecoder("AdvisorReasoning")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AdvisorReasoning must be a JSON object")
      return AdvisorReasoning(
        effort = raw["effort"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasAdvisorReasoningPropertiesEffort>(it) },
        maxTokens = raw["max_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AdvisorReasoning) {
      val jsonEncoder = encoder.requireJsonEncoder("AdvisorReasoning")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.effort?.let { put("effort", json.encodeToJsonElement(it)) }
        value.maxTokens?.let { put("max_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun advisorReasoning(block: AdvisorReasoning.Builder.() -> Unit): AdvisorReasoning = AdvisorReasoning
  .build(block)
