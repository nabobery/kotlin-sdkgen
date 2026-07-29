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
 * Shipping information for the charge. Helps prevent fraud on charges for physical goods.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/shipping
 */
@Serializable(with = InlineV1ChargesPostRequestFormShippingX03643664.Serializer::class)
public class InlineV1ChargesPostRequestFormShippingX03643664(
  public val address: InlineV1ChargesPostRequestFormShippingAddressX583a68b7,
  public val name: String,
  public val carrier: String? = null,
  public val phone: String? = null,
  public val trackingNumber: String? = null,
) {
  public class Builder {
    private var addressValue: InlineV1ChargesPostRequestFormShippingAddressX583a68b7? = null

    public var address: InlineV1ChargesPostRequestFormShippingAddressX583a68b7
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var carrier: String? = null

    public var phone: String? = null

    public var trackingNumber: String? = null

    public fun build(): InlineV1ChargesPostRequestFormShippingX03643664 {
      check(addressValue != null) { "address is required" }
      check(nameValue != null) { "name is required" }
      return InlineV1ChargesPostRequestFormShippingX03643664(
        address = address,
        name = name,
        carrier = carrier,
        phone = phone,
        trackingNumber = trackingNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesPostRequestFormShippingX03643664 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ChargesPostRequestFormShippingX03643664> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormShippingX03643664 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormShippingX03643664")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesPostRequestFormShippingX03643664 must be a JSON object")
      val address = json.decodeRequired<InlineV1ChargesPostRequestFormShippingAddressX583a68b7>(rawObject, "address")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1ChargesPostRequestFormShippingX03643664(
        address = address,
        name = name,
        carrier = rawObject["carrier"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
        trackingNumber = rawObject["tracking_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesPostRequestFormShippingX03643664) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormShippingX03643664")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        put("name", value.name)
        value.carrier?.let { put("carrier", it) }
        value.phone?.let { put("phone", it) }
        value.trackingNumber?.let { put("tracking_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesPostRequestFormShippingX03643664(block: InlineV1ChargesPostRequestFormShippingX03643664.Builder.() -> Unit): InlineV1ChargesPostRequestFormShippingX03643664 = InlineV1ChargesPostRequestFormShippingX03643664.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ChargesPostRequestFormShippingX03643664 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
