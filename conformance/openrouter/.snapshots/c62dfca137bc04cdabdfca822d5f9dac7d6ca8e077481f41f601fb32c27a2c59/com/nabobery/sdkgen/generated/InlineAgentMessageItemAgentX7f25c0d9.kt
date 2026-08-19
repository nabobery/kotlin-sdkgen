package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/agent.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/agent
 */
@Serializable(with = InlineAgentMessageItemAgentX7f25c0d9.Serializer::class)
public class InlineAgentMessageItemAgentX7f25c0d9(
  public val agentName: String,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateInlineAgentMessageItemAgentX7f25c0d9AdditionalProperties(additionalProperties)

  public class Builder {
    private var agentNameValue: String? = null

    public var agentName: String
      get() = requireNotNull(agentNameValue) { "agentName is required" }
      set(`value`) {
        agentNameValue = value
      }

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): InlineAgentMessageItemAgentX7f25c0d9 {
      check(agentNameValue != null) { "agentName is required" }
      return InlineAgentMessageItemAgentX7f25c0d9(
        agentName = agentName,
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentMessageItemAgentX7f25c0d9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentMessageItemAgentX7f25c0d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentMessageItemAgentX7f25c0d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentMessageItemAgentX7f25c0d9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentMessageItemAgentX7f25c0d9 must be a JSON object")
      val agentName = json.decodeRequired<String>(rawObject, "agent_name")
      return InlineAgentMessageItemAgentX7f25c0d9(
        agentName = agentName,
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("agent_name") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentMessageItemAgentX7f25c0d9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentMessageItemAgentX7f25c0d9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("agent_name", value.agentName)
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("agent_name")) { "InlineAgentMessageItemAgentX7f25c0d9 additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateInlineAgentMessageItemAgentX7f25c0d9AdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("agent_name") }
  require(collision == null) { "InlineAgentMessageItemAgentX7f25c0d9 additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun inlineAgentMessageItemAgentX7f25c0d9(block: InlineAgentMessageItemAgentX7f25c0d9.Builder.() -> Unit): InlineAgentMessageItemAgentX7f25c0d9 = InlineAgentMessageItemAgentX7f25c0d9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentMessageItemAgentX7f25c0d9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
