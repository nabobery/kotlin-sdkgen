package io.github.nabobery.sdkgen.generated.stripe

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
public data class PaymentsPrimitivesPaymentRecordsResourceShippingDetailsView(
  public val address: PaymentsPrimitivesPaymentRecordsResourceAddress,
  public val name: String? = null,
  public val phone: String? = null,
)

/**
 * The customer's shipping information associated with this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_shipping_details
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourceShippingDetails.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourceShippingDetails(
  public val address: PaymentsPrimitivesPaymentRecordsResourceAddress,
  /**
   * The shipping recipient's name.
   */
  public val name: String? = null,
  /**
   * The shipping recipient's phone number.
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
     * The shipping recipient's name.
     */
    public var name: String? = null

    /**
     * The shipping recipient's phone number.
     */
    public var phone: String? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourceShippingDetails {
      check(addressValue != null) { "address is required" }
      return PaymentsPrimitivesPaymentRecordsResourceShippingDetails(
        address = address,
        name = name,
        phone = phone,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceShippingDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourceShippingDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourceShippingDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourceShippingDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourceShippingDetails must be a JSON object")
      val address = json.decodeRequired<PaymentsPrimitivesPaymentRecordsResourceAddress>(rawObject, "address")
      return PaymentsPrimitivesPaymentRecordsResourceShippingDetails(
        address = address,
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourceShippingDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourceShippingDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourceShippingDetails(block: PaymentsPrimitivesPaymentRecordsResourceShippingDetails.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceShippingDetails = PaymentsPrimitivesPaymentRecordsResourceShippingDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourceShippingDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
