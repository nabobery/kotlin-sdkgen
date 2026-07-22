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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/global-advisory/properties/identifiers/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/global-advisory/properties/identifiers/items
 */
@Serializable(with = InlineGlobalAdvisoryIdentifiersItemXa24e0c60.Serializer::class)
public class InlineGlobalAdvisoryIdentifiersItemXa24e0c60(
  /**
   * The type of identifier.
   */
  public val type: InlineGlobalAdvisoryIdentifiersItemTypeX654f894b,
  /**
   * The identifier value.
   */
  public val `value`: String,
) {
  public class Builder {
    private var typeValue: InlineGlobalAdvisoryIdentifiersItemTypeX654f894b? = null

    public var type: InlineGlobalAdvisoryIdentifiersItemTypeX654f894b
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

    public fun build(): InlineGlobalAdvisoryIdentifiersItemXa24e0c60 {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineGlobalAdvisoryIdentifiersItemXa24e0c60(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGlobalAdvisoryIdentifiersItemXa24e0c60 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineGlobalAdvisoryIdentifiersItemXa24e0c60> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGlobalAdvisoryIdentifiersItemXa24e0c60 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGlobalAdvisoryIdentifiersItemXa24e0c60")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGlobalAdvisoryIdentifiersItemXa24e0c60 must be a JSON object")
      val type = json.decodeRequired<InlineGlobalAdvisoryIdentifiersItemTypeX654f894b>(rawObject, "type")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineGlobalAdvisoryIdentifiersItemXa24e0c60(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGlobalAdvisoryIdentifiersItemXa24e0c60) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGlobalAdvisoryIdentifiersItemXa24e0c60")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGlobalAdvisoryIdentifiersItemXa24e0c60(block: InlineGlobalAdvisoryIdentifiersItemXa24e0c60.Builder.() -> Unit): InlineGlobalAdvisoryIdentifiersItemXa24e0c60 = InlineGlobalAdvisoryIdentifiersItemXa24e0c60.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGlobalAdvisoryIdentifiersItemXa24e0c60 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
