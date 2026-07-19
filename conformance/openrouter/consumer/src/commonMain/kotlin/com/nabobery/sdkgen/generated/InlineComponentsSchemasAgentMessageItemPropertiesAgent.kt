package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/agent.
 */
@Serializable(with = InlineComponentsSchemasAgentMessageItemPropertiesAgent.Serializer::class)
public class InlineComponentsSchemasAgentMessageItemPropertiesAgent(
  public val agentName: String,
) {
  public class Builder {
    private var agentNameValue: String? = null

    public var agentName: String
      get() = requireNotNull(agentNameValue) { "agentName is required" }
      set(`value`) {
        agentNameValue = value
      }

    public fun build(): InlineComponentsSchemasAgentMessageItemPropertiesAgent {
      check(agentNameValue != null) { "agentName is required" }
      return InlineComponentsSchemasAgentMessageItemPropertiesAgent(
        agentName = agentName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasAgentMessageItemPropertiesAgent = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAgentMessageItemPropertiesAgent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAgentMessageItemPropertiesAgent {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasAgentMessageItemPropertiesAgent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasAgentMessageItemPropertiesAgent must be a JSON object")
      val agentName = json.decodeRequired<String>(raw, "agent_name")
      return InlineComponentsSchemasAgentMessageItemPropertiesAgent(
        agentName = agentName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAgentMessageItemPropertiesAgent) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasAgentMessageItemPropertiesAgent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("agent_name", value.agentName)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasAgentMessageItemPropertiesAgent(block: InlineComponentsSchemasAgentMessageItemPropertiesAgent.Builder.() -> Unit): InlineComponentsSchemasAgentMessageItemPropertiesAgent = InlineComponentsSchemasAgentMessageItemPropertiesAgent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasAgentMessageItemPropertiesAgent is missing required property " +
      "'" + name + "'")
  return decodeFromJsonElement(element)
}
