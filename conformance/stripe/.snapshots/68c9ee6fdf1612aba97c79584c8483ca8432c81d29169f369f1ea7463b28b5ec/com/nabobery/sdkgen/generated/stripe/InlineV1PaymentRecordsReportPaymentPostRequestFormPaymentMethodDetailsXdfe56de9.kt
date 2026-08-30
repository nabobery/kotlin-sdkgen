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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Information about the Payment Method debited for this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/payment_method_details
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9(
  public val billingDetails:
      InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07? = null,
  public val custom:
      InlineV1PaymentRecordsRepo134dPostRequestFormPaymentMethodDetailsCustomXa8dc5323? = null,
  public val paymentMethod: String? = null,
  public val type:
      InlineV1PaymentRecordsRepo134dPostRequestFormPaymentMethodDetailsTypeX78a46fa5? = null,
) {
  public class Builder {
    public var billingDetails: InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07?
        = null

    public var custom:
        InlineV1PaymentRecordsRepo134dPostRequestFormPaymentMethodDetailsCustomXa8dc5323? = null

    public var paymentMethod: String? = null

    public var type: InlineV1PaymentRecordsRepo134dPostRequestFormPaymentMethodDetailsTypeX78a46fa5?
        = null

    public fun build(): InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9 = InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9(
      billingDetails = billingDetails,
      custom = custom,
      paymentMethod = paymentMethod,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9 must be a JSON object")
      return InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9(
        billingDetails = rawObject["billing_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07>(it) },
        custom = rawObject["custom"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsRepo134dPostRequestFormPaymentMethodDetailsCustomXa8dc5323>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsRepo134dPostRequestFormPaymentMethodDetailsTypeX78a46fa5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingDetails?.let { put("billing_details", json.encodeToJsonElement(it)) }
        value.custom?.let { put("custom", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9(block: InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9.Builder.() -> Unit): InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9 = InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9.build(block)
