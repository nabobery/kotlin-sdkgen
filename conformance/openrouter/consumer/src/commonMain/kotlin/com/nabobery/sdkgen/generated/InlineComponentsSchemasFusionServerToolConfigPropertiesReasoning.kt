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
 */
@Serializable(with = InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning.Serializer::class)
public class InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning(
  /**
   * Reasoning effort level for panelist and judge inner calls.
   */
  public val effort:
      InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort? = null,
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
    public var effort:
        InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort? = null

    /**
     * Maximum number of reasoning tokens each panelist and judge model may use. Helps bound cost when models allocate
     * too much budget to chain-of-thought.
     */
    public var maxTokens: Int? = null

    public fun build(): InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning =
      InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning(
      effort = effort,
      maxTokens = maxTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning must be a JSON " +
          "object")
      return InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning(
        effort = raw["effort"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort>(it) },
        maxTokens = raw["max_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.effort?.let { put("effort", json.encodeToJsonElement(it)) }
        value.maxTokens?.let { put("max_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasFusionServerToolConfigPropertiesReasoning(block: InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning.Builder.() -> Unit): InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning = InlineComponentsSchemasFusionServerToolConfigPropertiesReasoning.build(block)
