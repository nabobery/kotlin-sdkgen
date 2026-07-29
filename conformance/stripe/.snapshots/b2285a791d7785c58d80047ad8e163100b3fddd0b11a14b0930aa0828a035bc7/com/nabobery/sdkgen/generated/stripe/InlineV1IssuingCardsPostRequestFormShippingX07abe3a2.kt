package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Updated shipping information for the card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/shipping
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormShippingX07abe3a2.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormShippingX07abe3a2(
  public val address: InlineV1IssuingCardsPostRequestFormShippingAddressX4f1278b9,
  public val name: String,
  public val addressValidation:
      InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4? = null,
  public val customs: InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46? = null,
  public val phoneNumber: String? = null,
  public val requireSignature: Boolean? = null,
  public val service: InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d? = null,
  public val type: InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3? = null,
) {
  public class Builder {
    private var addressValue: InlineV1IssuingCardsPostRequestFormShippingAddressX4f1278b9? = null

    public var address: InlineV1IssuingCardsPostRequestFormShippingAddressX4f1278b9
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

    public var addressValidation:
        InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4? = null

    public var customs: InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46? = null

    public var phoneNumber: String? = null

    public var requireSignature: Boolean? = null

    public var service: InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d? = null

    public var type: InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3? = null

    public fun build(): InlineV1IssuingCardsPostRequestFormShippingX07abe3a2 {
      check(addressValue != null) { "address is required" }
      check(nameValue != null) { "name is required" }
      return InlineV1IssuingCardsPostRequestFormShippingX07abe3a2(
        address = address,
        name = name,
        addressValidation = addressValidation,
        customs = customs,
        phoneNumber = phoneNumber,
        requireSignature = requireSignature,
        service = service,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormShippingX07abe3a2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormShippingX07abe3a2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormShippingX07abe3a2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormShippingX07abe3a2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormShippingX07abe3a2 must be a JSON object")
      val address = json.decodeRequired<InlineV1IssuingCardsPostRequestFormShippingAddressX4f1278b9>(rawObject, "address")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1IssuingCardsPostRequestFormShippingX07abe3a2(
        address = address,
        name = name,
        addressValidation = rawObject["address_validation"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4>(it) },
        customs = rawObject["customs"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46>(it) },
        phoneNumber = rawObject["phone_number"]?.let { json.decodeFromJsonElement<String>(it) },
        requireSignature = rawObject["require_signature"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        service = rawObject["service"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormShippingX07abe3a2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormShippingX07abe3a2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        put("name", value.name)
        value.addressValidation?.let { put("address_validation", json.encodeToJsonElement(it)) }
        value.customs?.let { put("customs", json.encodeToJsonElement(it)) }
        value.phoneNumber?.let { put("phone_number", it) }
        value.requireSignature?.let { put("require_signature", json.encodeToJsonElement(it)) }
        value.service?.let { put("service", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardsPostRequestFormShippingX07abe3a2(block: InlineV1IssuingCardsPostRequestFormShippingX07abe3a2.Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormShippingX07abe3a2 = InlineV1IssuingCardsPostRequestFormShippingX07abe3a2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormShippingX07abe3a2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
