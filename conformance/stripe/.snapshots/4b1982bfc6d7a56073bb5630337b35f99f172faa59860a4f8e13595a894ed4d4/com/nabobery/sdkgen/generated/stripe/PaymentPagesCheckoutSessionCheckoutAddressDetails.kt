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

@Serializable
public data class PaymentPagesCheckoutSessionCheckoutAddressDetailsView(
  public val address: Address,
  public val name: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_checkout_address_details
 */
@Serializable(with = PaymentPagesCheckoutSessionCheckoutAddressDetails.Serializer::class)
public class PaymentPagesCheckoutSessionCheckoutAddressDetails(
  public val address: Address,
  /**
   * Customer name.
   */
  public val name: String,
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

    public fun build(): PaymentPagesCheckoutSessionCheckoutAddressDetails {
      check(addressValue != null) { "address is required" }
      check(nameValue != null) { "name is required" }
      return PaymentPagesCheckoutSessionCheckoutAddressDetails(
        address = address,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCheckoutAddressDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionCheckoutAddressDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCheckoutAddressDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCheckoutAddressDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionCheckoutAddressDetails must be a JSON object")
      val address = json.decodeRequired<Address>(rawObject, "address")
      val name = json.decodeRequired<String>(rawObject, "name")
      return PaymentPagesCheckoutSessionCheckoutAddressDetails(
        address = address,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionCheckoutAddressDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCheckoutAddressDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionCheckoutAddressDetails(block: PaymentPagesCheckoutSessionCheckoutAddressDetails.Builder.() -> Unit): PaymentPagesCheckoutSessionCheckoutAddressDetails = PaymentPagesCheckoutSessionCheckoutAddressDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionCheckoutAddressDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
