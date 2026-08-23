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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/source_order/properties/shipping.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/source_order/properties/shipping
 */
@Serializable(with = InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685.Serializer::class)
public class InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685(
  public val address: InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda,
  public val carrier: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
  public val trackingNumber: String? = null,
) {
  public class Builder {
    private var addressValue: InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda? =
        null

    public var address: InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    public var carrier: String? = null

    public var name: String? = null

    public var phone: String? = null

    public var trackingNumber: String? = null

    public fun build(): InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685 {
      check(addressValue != null) { "address is required" }
      return InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685(
        address = address,
        carrier = carrier,
        name = name,
        phone = phone,
        trackingNumber = trackingNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685 must be a JSON object")
      val address = json.decodeRequired<InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda>(rawObject, "address")
      return InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685(
        address = address,
        carrier = rawObject["carrier"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
        trackingNumber = rawObject["tracking_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        value.carrier?.let { put("carrier", it) }
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
        value.trackingNumber?.let { put("tracking_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SourcesPostRequestFormSourceOrderShippingXaceed685(block: InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685.Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685 = InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
