package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Optional structured filter rules controlling which events are forwarded.
 */
@Serializable(with = ObservabilityFilterRulesConfig.Serializer::class)
public class ObservabilityFilterRulesConfig(
  groups: List<ObservabilityFilterRuleGroup>,
  public val enabled: Boolean? = null,
) {
  public val groups: List<ObservabilityFilterRuleGroup> = groups.toList()

  public class Builder {
    private var groupsValue: List<ObservabilityFilterRuleGroup>? = null

    public var groups: List<ObservabilityFilterRuleGroup>
      get() = requireNotNull(groupsValue) { "groups is required" }
      set(`value`) {
        groupsValue = value
      }

    public var enabled: Boolean? = null

    public fun build(): ObservabilityFilterRulesConfig {
      check(groupsValue != null) { "groups is required" }
      return ObservabilityFilterRulesConfig(
        groups = groups,
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ObservabilityFilterRulesConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ObservabilityFilterRulesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ObservabilityFilterRulesConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ObservabilityFilterRulesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ObservabilityFilterRulesConfig must be a JSON object")
      val groups = json.decodeRequired<List<ObservabilityFilterRuleGroup>>(raw, "groups")
      return ObservabilityFilterRulesConfig(
        groups = groups,
        enabled = raw["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ObservabilityFilterRulesConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ObservabilityFilterRulesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("groups", json.encodeToJsonElement(value.groups))
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun observabilityFilterRulesConfig(block: ObservabilityFilterRulesConfig.Builder.() ->
  Unit): ObservabilityFilterRulesConfig = ObservabilityFilterRulesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ObservabilityFilterRulesConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
