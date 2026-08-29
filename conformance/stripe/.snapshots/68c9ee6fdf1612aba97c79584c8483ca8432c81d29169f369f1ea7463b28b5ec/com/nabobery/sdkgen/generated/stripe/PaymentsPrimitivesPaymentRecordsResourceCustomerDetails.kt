package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentsPrimitivesPaymentRecordsResourceCustomerDetailsView(
  public val customer: String? = null,
  public val email: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
)

/**
 * Information about the customer for this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_customer_details
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourceCustomerDetails.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourceCustomerDetails(
  /**
   * ID of the Stripe Customer associated with this payment.
   */
  public val customer: String? = null,
  /**
   * The customer's email address.
   */
  public val email: String? = null,
  /**
   * The customer's name.
   */
  public val name: String? = null,
  /**
   * The customer's phone number.
   */
  public val phone: String? = null,
) {
  public class Builder {
    /**
     * ID of the Stripe Customer associated with this payment.
     */
    public var customer: String? = null

    /**
     * The customer's email address.
     */
    public var email: String? = null

    /**
     * The customer's name.
     */
    public var name: String? = null

    /**
     * The customer's phone number.
     */
    public var phone: String? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourceCustomerDetails = PaymentsPrimitivesPaymentRecordsResourceCustomerDetails(
      customer = customer,
      email = email,
      name = name,
      phone = phone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceCustomerDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourceCustomerDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourceCustomerDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourceCustomerDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourceCustomerDetails must be a JSON object")
      return PaymentsPrimitivesPaymentRecordsResourceCustomerDetails(
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourceCustomerDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourceCustomerDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customer?.let { put("customer", it) }
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourceCustomerDetails(block: PaymentsPrimitivesPaymentRecordsResourceCustomerDetails.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceCustomerDetails = PaymentsPrimitivesPaymentRecordsResourceCustomerDetails.build(block)
