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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/shipping
 */
@Serializable(with = InlineV1ChargesPostRequestFormShippingX776066db.Serializer::class)
public class InlineV1ChargesPostRequestFormShippingX776066db(
  public val address: InlineV1ChargesPostRequestFormShippingAddressX0eeda288,
  public val name: String,
  public val carrier: String? = null,
  public val phone: String? = null,
  public val trackingNumber: String? = null,
) {
  public class Builder {
    private var addressValue: InlineV1ChargesPostRequestFormShippingAddressX0eeda288? = null

    public var address: InlineV1ChargesPostRequestFormShippingAddressX0eeda288
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

    public fun build(): InlineV1ChargesPostRequestFormShippingX776066db {
      check(addressValue != null) { "address is required" }
      check(nameValue != null) { "name is required" }
      return InlineV1ChargesPostRequestFormShippingX776066db(
        address = address,
        name = name,
        carrier = carrier,
        phone = phone,
        trackingNumber = trackingNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesPostRequestFormShippingX776066db = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesPostRequestFormShippingX776066db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormShippingX776066db {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormShippingX776066db")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesPostRequestFormShippingX776066db must be a JSON object")
      val address = json.decodeRequired<InlineV1ChargesPostRequestFormShippingAddressX0eeda288>(rawObject, "address")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1ChargesPostRequestFormShippingX776066db(
        address = address,
        name = name,
        carrier = rawObject["carrier"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
        trackingNumber = rawObject["tracking_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesPostRequestFormShippingX776066db) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormShippingX776066db")
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

public fun inlineV1ChargesPostRequestFormShippingX776066db(block: InlineV1ChargesPostRequestFormShippingX776066db.Builder.() -> Unit): InlineV1ChargesPostRequestFormShippingX776066db = InlineV1ChargesPostRequestFormShippingX776066db.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ChargesPostRequestFormShippingX776066db is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
