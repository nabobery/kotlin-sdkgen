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
 * Reasoning configuration forwarded to the subagent call. Use this to control reasoning effort and token budget for
 * models that support extended thinking.
 */
@Serializable(with = SubagentReasoning.Serializer::class)
public class SubagentReasoning(
  /**
   * Reasoning effort level for the subagent call.
   */
  public val effort: InlineComponentsSchemasSubagentReasoningPropertiesEffort? = null,
  /**
   * Maximum number of reasoning tokens the subagent may use. Accepted and validated but not yet forwarded to the
   * subagent call.
   */
  public val maxTokens: Int? = null,
) {
  public class Builder {
    /**
     * Reasoning effort level for the subagent call.
     */
    public var effort: InlineComponentsSchemasSubagentReasoningPropertiesEffort? = null

    /**
     * Maximum number of reasoning tokens the subagent may use. Accepted and validated but not yet forwarded to the
     * subagent call.
     */
    public var maxTokens: Int? = null

    public fun build(): SubagentReasoning = SubagentReasoning(
      effort = effort,
      maxTokens = maxTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubagentReasoning = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubagentReasoning> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubagentReasoning {
      val jsonDecoder = decoder.requireJsonDecoder("SubagentReasoning")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("SubagentReasoning must be a JSON object")
      return SubagentReasoning(
        effort = raw["effort"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasSubagentReasoningPropertiesEffort>(it) },
        maxTokens = raw["max_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubagentReasoning) {
      val jsonEncoder = encoder.requireJsonEncoder("SubagentReasoning")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.effort?.let { put("effort", json.encodeToJsonElement(it)) }
        value.maxTokens?.let { put("max_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subagentReasoning(block: SubagentReasoning.Builder.() -> Unit): SubagentReasoning = SubagentReasoning
  .build(block)
