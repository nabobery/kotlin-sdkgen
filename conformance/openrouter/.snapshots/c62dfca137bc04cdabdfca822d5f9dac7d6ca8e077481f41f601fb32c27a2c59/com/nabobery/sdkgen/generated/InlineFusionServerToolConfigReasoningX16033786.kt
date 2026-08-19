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
 * Reasoning configuration forwarded to panelist and judge inner calls. Use this to control reasoning effort and token
 * budget for models that support extended thinking.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionServerToolConfig/properties/reasoning
 */
@Serializable(with = InlineFusionServerToolConfigReasoningX16033786.Serializer::class)
public class InlineFusionServerToolConfigReasoningX16033786(
  /**
   * Reasoning effort level for panelist and judge inner calls.
   */
  public val effort: InlineFusionServerToolConfigReasoningEffortX88ceefd0? = null,
  /**
   * Maximum number of reasoning tokens each panelist and judge model may use. Helps bound cost when models allocate too
   * much budget to chain-of-thought.
   */
  public val maxTokens: Int? = null,
) {
  public class Builder {
    /**
     * Reasoning effort level for panelist and judge inner calls.
     */
    public var effort: InlineFusionServerToolConfigReasoningEffortX88ceefd0? = null

    /**
     * Maximum number of reasoning tokens each panelist and judge model may use. Helps bound cost when models allocate
     * too much budget to chain-of-thought.
     */
    public var maxTokens: Int? = null

    public fun build(): InlineFusionServerToolConfigReasoningX16033786 = InlineFusionServerToolConfigReasoningX16033786(
      effort = effort,
      maxTokens = maxTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFusionServerToolConfigReasoningX16033786 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFusionServerToolConfigReasoningX16033786> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFusionServerToolConfigReasoningX16033786 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFusionServerToolConfigReasoningX16033786")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFusionServerToolConfigReasoningX16033786 must be a JSON object")
      return InlineFusionServerToolConfigReasoningX16033786(
        effort = rawObject["effort"]?.let { json.decodeFromJsonElement<InlineFusionServerToolConfigReasoningEffortX88ceefd0>(it) },
        maxTokens = rawObject["max_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFusionServerToolConfigReasoningX16033786) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFusionServerToolConfigReasoningX16033786")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.effort?.let { put("effort", json.encodeToJsonElement(it)) }
        value.maxTokens?.let { put("max_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFusionServerToolConfigReasoningX16033786(block: InlineFusionServerToolConfigReasoningX16033786.Builder.() -> Unit): InlineFusionServerToolConfigReasoningX16033786 = InlineFusionServerToolConfigReasoningX16033786.build(block)
