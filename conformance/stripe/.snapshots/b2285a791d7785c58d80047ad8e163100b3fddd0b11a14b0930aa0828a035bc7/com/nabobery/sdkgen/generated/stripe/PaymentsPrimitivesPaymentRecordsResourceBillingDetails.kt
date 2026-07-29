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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentsPrimitivesPaymentRecordsResourceBillingDetailsView(
  public val address: PaymentsPrimitivesPaymentRecordsResourceAddress,
  public val email: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
)

/**
 * Billing details used by the customer for this payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_billing_details
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourceBillingDetails.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourceBillingDetails(
  public val address: PaymentsPrimitivesPaymentRecordsResourceAddress,
  /**
   * The billing email associated with the method of payment.
   */
  public val email: String? = null,
  /**
   * The billing name associated with the method of payment.
   */
  public val name: String? = null,
  /**
   * The billing phone number associated with the method of payment.
   */
  public val phone: String? = null,
) {
  public class Builder {
    private var addressValue: PaymentsPrimitivesPaymentRecordsResourceAddress? = null

    public var address: PaymentsPrimitivesPaymentRecordsResourceAddress
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    /**
     * The billing email associated with the method of payment.
     */
    public var email: String? = null

    /**
     * The billing name associated with the method of payment.
     */
    public var name: String? = null

    /**
     * The billing phone number associated with the method of payment.
     */
    public var phone: String? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourceBillingDetails {
      check(addressValue != null) { "address is required" }
      return PaymentsPrimitivesPaymentRecordsResourceBillingDetails(
        address = address,
        email = email,
        name = name,
        phone = phone,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceBillingDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourceBillingDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourceBillingDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourceBillingDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourceBillingDetails must be a JSON object")
      val address = json.decodeRequired<PaymentsPrimitivesPaymentRecordsResourceAddress>(rawObject, "address")
      return PaymentsPrimitivesPaymentRecordsResourceBillingDetails(
        address = address,
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourceBillingDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourceBillingDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourceBillingDetails(block: PaymentsPrimitivesPaymentRecordsResourceBillingDetails.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceBillingDetails = PaymentsPrimitivesPaymentRecordsResourceBillingDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourceBillingDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
