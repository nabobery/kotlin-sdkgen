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
 * sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items/anyOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items/anyOf/2
 */
@Serializable(with = InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785.Serializer::class)
public class InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785(
  public val id: Int,
  public val nodeId: String,
  public val type: String,
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

    public fun build(): InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785 {
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(typeValue != null) { "type is required" }
      return InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785(
        id = id,
        nodeId = nodeId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785(
        id = id,
        nodeId = nodeId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("type", value.type)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnvironmentProtectionRulesItemAnyOf3X4ef73785(block: InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785.Builder.() -> Unit): InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785 = InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
