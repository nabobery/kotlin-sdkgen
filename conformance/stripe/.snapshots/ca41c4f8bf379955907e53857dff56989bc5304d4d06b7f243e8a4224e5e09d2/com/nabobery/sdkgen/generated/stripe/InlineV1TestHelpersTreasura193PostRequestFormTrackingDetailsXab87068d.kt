package com.nabobery.sdkgen.generated.stripe

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
 * Details about network-specific tracking information.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/tracking_details
 */
@Serializable(with = InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d.Serializer::class)
public class InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d(
  public val type: InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987,
  public val ach: InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43? = null,
  public val usDomesticWire:
      InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987? = null

    public var type: InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var ach: InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43? = null

    public var usDomesticWire: InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c?
        = null

    public fun build(): InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d {
      check(typeValue != null) { "type is required" }
      return InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d(
        type = type,
        ach = ach,
        usDomesticWire = usDomesticWire,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d must be a JSON object")
      val type = json.decodeRequired<InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987>(rawObject, "type")
      return InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d(
        type = type,
        ach = rawObject["ach"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43>(it) },
        usDomesticWire = rawObject["us_domestic_wire"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTreasura193PostRequestFormUsDomesticWireX81be460c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
        value.usDomesticWire?.let { put("us_domestic_wire", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d(block: InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d.Builder.() -> Unit): InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d = InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
