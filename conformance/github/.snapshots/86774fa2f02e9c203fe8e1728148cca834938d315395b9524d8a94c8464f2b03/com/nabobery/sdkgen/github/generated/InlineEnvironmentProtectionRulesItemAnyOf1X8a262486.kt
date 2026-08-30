package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items/anyOf/0
 */
@Serializable(with = InlineEnvironmentProtectionRulesItemAnyOf1X8a262486.Serializer::class)
public class InlineEnvironmentProtectionRulesItemAnyOf1X8a262486(
  public val id: Int,
  public val nodeId: String,
  public val type: String,
  public val waitTimer: Int? = null,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var waitTimer: Int? = null

    public fun build(): InlineEnvironmentProtectionRulesItemAnyOf1X8a262486 {
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(typeValue != null) { "type is required" }
      return InlineEnvironmentProtectionRulesItemAnyOf1X8a262486(
        id = id,
        nodeId = nodeId,
        type = type,
        waitTimer = waitTimer,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnvironmentProtectionRulesItemAnyOf1X8a262486 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEnvironmentProtectionRulesItemAnyOf1X8a262486> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnvironmentProtectionRulesItemAnyOf1X8a262486 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnvironmentProtectionRulesItemAnyOf1X8a262486")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnvironmentProtectionRulesItemAnyOf1X8a262486 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineEnvironmentProtectionRulesItemAnyOf1X8a262486(
        id = id,
        nodeId = nodeId,
        type = type,
        waitTimer = rawObject["wait_timer"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnvironmentProtectionRulesItemAnyOf1X8a262486) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnvironmentProtectionRulesItemAnyOf1X8a262486")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("type", value.type)
        value.waitTimer?.let { put("wait_timer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnvironmentProtectionRulesItemAnyOf1X8a262486(block: InlineEnvironmentProtectionRulesItemAnyOf1X8a262486.Builder.() -> Unit): InlineEnvironmentProtectionRulesItemAnyOf1X8a262486 = InlineEnvironmentProtectionRulesItemAnyOf1X8a262486.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnvironmentProtectionRulesItemAnyOf1X8a262486 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
