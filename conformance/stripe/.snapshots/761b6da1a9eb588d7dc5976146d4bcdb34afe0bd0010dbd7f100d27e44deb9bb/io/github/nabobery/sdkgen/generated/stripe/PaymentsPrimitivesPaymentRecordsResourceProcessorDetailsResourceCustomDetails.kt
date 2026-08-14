package io.github.nabobery.sdkgen.generated.stripe

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

/**
 * Custom processors represent payment processors not modeled directly in
 * the Stripe API. This resource consists of details about the custom processor
 * used for this payment attempt.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_processor_details_resou
 * rce_custom_details
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails(
  /**
   * An opaque string for manual reconciliation of this payment, for example a check number or a payment processor ID.
   */
  public val paymentReference: String? = null,
) {
  public class Builder {
    /**
     * An opaque string for manual reconciliation of this payment, for example a check number or a payment processor ID.
     */
    public var paymentReference: String? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails = PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails(
      paymentReference = paymentReference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails must be a JSON object")
      return PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails(
        paymentReference = rawObject["payment_reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.paymentReference?.let { put("payment_reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails(block: PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails = PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails.build(block)
