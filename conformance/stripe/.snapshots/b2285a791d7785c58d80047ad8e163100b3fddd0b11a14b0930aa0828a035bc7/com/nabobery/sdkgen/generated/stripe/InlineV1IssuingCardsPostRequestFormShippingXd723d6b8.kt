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
 * The address where the card will be shipped.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/shipping
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormShippingXd723d6b8.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormShippingXd723d6b8(
  public val address: InlineV1IssuingCardsPostRequestFormShippingAddressXce0bfa5b,
  public val name: String,
  public val addressValidation:
      InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3c6f65d9? = null,
  public val customs: InlineV1IssuingCardsPostRequestFormShippingCustomsXf34d40d2? = null,
  public val phoneNumber: String? = null,
  public val requireSignature: Boolean? = null,
  public val service: InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b? = null,
  public val type: InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d? = null,
) {
  public class Builder {
    private var addressValue: InlineV1IssuingCardsPostRequestFormShippingAddressXce0bfa5b? = null

    public var address: InlineV1IssuingCardsPostRequestFormShippingAddressXce0bfa5b
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
        InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3c6f65d9? = null

    public var customs: InlineV1IssuingCardsPostRequestFormShippingCustomsXf34d40d2? = null

    public var phoneNumber: String? = null

    public var requireSignature: Boolean? = null

    public var service: InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b? = null

    public var type: InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d? = null

    public fun build(): InlineV1IssuingCardsPostRequestFormShippingXd723d6b8 {
      check(addressValue != null) { "address is required" }
      check(nameValue != null) { "name is required" }
      return InlineV1IssuingCardsPostRequestFormShippingXd723d6b8(
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
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormShippingXd723d6b8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormShippingXd723d6b8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormShippingXd723d6b8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormShippingXd723d6b8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormShippingXd723d6b8 must be a JSON object")
      val address = json.decodeRequired<InlineV1IssuingCardsPostRequestFormShippingAddressXce0bfa5b>(rawObject, "address")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1IssuingCardsPostRequestFormShippingXd723d6b8(
        address = address,
        name = name,
        addressValidation = rawObject["address_validation"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3c6f65d9>(it) },
        customs = rawObject["customs"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormShippingCustomsXf34d40d2>(it) },
        phoneNumber = rawObject["phone_number"]?.let { json.decodeFromJsonElement<String>(it) },
        requireSignature = rawObject["require_signature"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        service = rawObject["service"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormShippingXd723d6b8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormShippingXd723d6b8")
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

public fun inlineV1IssuingCardsPostRequestFormShippingXd723d6b8(block: InlineV1IssuingCardsPostRequestFormShippingXd723d6b8.Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormShippingXd723d6b8 = InlineV1IssuingCardsPostRequestFormShippingXd723d6b8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormShippingXd723d6b8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
