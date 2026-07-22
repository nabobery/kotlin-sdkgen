package com.nabobery.sdkgen.github.generated

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
 * An advisory identifier.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-security-advisory/properties/identifiers/items
 */
@Serializable(with = InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688.Serializer::class)
public class InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688(
  /**
   * The type of advisory identifier.
   */
  public val type: InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9,
  /**
   * The value of the advisory identifer.
   */
  public val `value`: String,
) {
  public class Builder {
    private var typeValue: InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9? = null

    public var type: InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688 {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688 must be a JSON object")
      val type = json.decodeRequired<InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9>(rawObject, "type")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688(block: InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688.Builder.() -> Unit): InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688 = InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
