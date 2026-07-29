package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class IssuingCardShippingView(
  public val address: Address,
  @SerialName("address_validation")
  public val addressValidation: InlineIssuingCardShippingAddressValidationX88177330? = null,
  public val carrier: InlineIssuingCardShippingCarrierXefe72726? = null,
  public val customs: InlineIssuingCardShippingCustomsXc4db715f? = null,
  public val eta: Int? = null,
  public val name: String,
  @SerialName("phone_number")
  public val phoneNumber: String? = null,
  @SerialName("require_signature")
  public val requireSignature: Boolean? = null,
  public val service: InlineIssuingCardShippingServiceX2c6ab166,
  public val status: InlineIssuingCardShippingStatusX83a95b24? = null,
  @SerialName("tracking_number")
  public val trackingNumber: String? = null,
  @SerialName("tracking_url")
  public val trackingUrl: String? = null,
  public val type: InlineIssuingCardShippingTypeX2f91edad,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping
 */
@Serializable(with = IssuingCardShipping.Serializer::class)
public class IssuingCardShipping(
  public val address: Address,
  /**
   * Recipient name.
   */
  public val name: String,
  /**
   * Shipment service, such as `standard` or `express`.
   */
  public val service: InlineIssuingCardShippingServiceX2c6ab166,
  /**
   * Packaging options.
   */
  public val type: InlineIssuingCardShippingTypeX2f91edad,
  /**
   * Address validation details for the shipment.
   */
  public val addressValidation: InlineIssuingCardShippingAddressValidationX88177330? = null,
  /**
   * The delivery company that shipped a card.
   */
  public val carrier: InlineIssuingCardShippingCarrierXefe72726? = null,
  /**
   * Additional information that may be required for clearing customs.
   */
  public val customs: InlineIssuingCardShippingCustomsXc4db715f? = null,
  /**
   * A unix timestamp representing a best estimate of when the card will be delivered.
   */
  public val eta: Int? = null,
  /**
   * The phone number of the receiver of the shipment. Our courier partners will use this number to contact you in the
   * event of card delivery issues. For individual shipments to the EU/UK, if this field is empty, we will provide them
   * with the phone number provided when the cardholder was initially created.
   */
  public val phoneNumber: String? = null,
  /**
   * Whether a signature is required for card delivery. This feature is only supported for US users. Standard shipping
   * service does not support signature on delivery. The default value for standard shipping service is false and for
   * express and priority services is true.
   */
  public val requireSignature: Boolean? = null,
  /**
   * The delivery status of the card.
   */
  public val status: InlineIssuingCardShippingStatusX83a95b24? = null,
  /**
   * A tracking number for a card shipment.
   */
  public val trackingNumber: String? = null,
  /**
   * A link to the shipping carrier's site where you can view detailed information about a card shipment.
   */
  public val trackingUrl: String? = null,
) {
  public class Builder {
    private var addressValue: Address? = null

    public var address: Address
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

    private var serviceValue: InlineIssuingCardShippingServiceX2c6ab166? = null

    public var service: InlineIssuingCardShippingServiceX2c6ab166
      get() = requireNotNull(serviceValue) { "service is required" }
      set(`value`) {
        serviceValue = value
      }

    private var typeValue: InlineIssuingCardShippingTypeX2f91edad? = null

    public var type: InlineIssuingCardShippingTypeX2f91edad
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Address validation details for the shipment.
     */
    public var addressValidation: InlineIssuingCardShippingAddressValidationX88177330? = null

    /**
     * The delivery company that shipped a card.
     */
    public var carrier: InlineIssuingCardShippingCarrierXefe72726? = null

    /**
     * Additional information that may be required for clearing customs.
     */
    public var customs: InlineIssuingCardShippingCustomsXc4db715f? = null

    /**
     * A unix timestamp representing a best estimate of when the card will be delivered.
     */
    public var eta: Int? = null

    /**
     * The phone number of the receiver of the shipment. Our courier partners will use this number to contact you in the
     * event of card delivery issues. For individual shipments to the EU/UK, if this field is empty, we will provide
     * them with the phone number provided when the cardholder was initially created.
     */
    public var phoneNumber: String? = null

    /**
     * Whether a signature is required for card delivery. This feature is only supported for US users. Standard shipping
     * service does not support signature on delivery. The default value for standard shipping service is false and for
     * express and priority services is true.
     */
    public var requireSignature: Boolean? = null

    /**
     * The delivery status of the card.
     */
    public var status: InlineIssuingCardShippingStatusX83a95b24? = null

    /**
     * A tracking number for a card shipment.
     */
    public var trackingNumber: String? = null

    /**
     * A link to the shipping carrier's site where you can view detailed information about a card shipment.
     */
    public var trackingUrl: String? = null

    public fun build(): IssuingCardShipping {
      check(addressValue != null) { "address is required" }
      check(nameValue != null) { "name is required" }
      check(serviceValue != null) { "service is required" }
      check(typeValue != null) { "type is required" }
      return IssuingCardShipping(
        address = address,
        name = name,
        service = service,
        type = type,
        addressValidation = addressValidation,
        carrier = carrier,
        customs = customs,
        eta = eta,
        phoneNumber = phoneNumber,
        requireSignature = requireSignature,
        status = status,
        trackingNumber = trackingNumber,
        trackingUrl = trackingUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardShipping = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingCardShipping> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardShipping {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardShipping")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardShipping must be a JSON object")
      val address = json.decodeRequired<Address>(rawObject, "address")
      val name = json.decodeRequired<String>(rawObject, "name")
      val service = json.decodeRequired<InlineIssuingCardShippingServiceX2c6ab166>(rawObject, "service")
      val type = json.decodeRequired<InlineIssuingCardShippingTypeX2f91edad>(rawObject, "type")
      return IssuingCardShipping(
        address = address,
        name = name,
        service = service,
        type = type,
        addressValidation = rawObject["address_validation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardShippingAddressValidationX88177330?>(element) },
        carrier = rawObject["carrier"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardShippingCarrierXefe72726?>(element) },
        customs = rawObject["customs"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardShippingCustomsXc4db715f?>(element) },
        eta = rawObject["eta"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        phoneNumber = rawObject["phone_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        requireSignature = rawObject["require_signature"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardShippingStatusX83a95b24?>(element) },
        trackingNumber = rawObject["tracking_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        trackingUrl = rawObject["tracking_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardShipping) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardShipping")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        put("name", value.name)
        put("service", json.encodeToJsonElement(value.service))
        put("type", json.encodeToJsonElement(value.type))
        value.addressValidation?.let { put("address_validation", json.encodeToJsonElement(it)) }
        value.carrier?.let { put("carrier", json.encodeToJsonElement(it)) }
        value.customs?.let { put("customs", json.encodeToJsonElement(it)) }
        value.eta?.let { put("eta", json.encodeToJsonElement(it)) }
        value.phoneNumber?.let { put("phone_number", it) }
        value.requireSignature?.let { put("require_signature", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
        value.trackingNumber?.let { put("tracking_number", it) }
        value.trackingUrl?.let { put("tracking_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardShipping(block: IssuingCardShipping.Builder.() -> Unit): IssuingCardShipping = IssuingCardShipping.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingCardShipping is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
