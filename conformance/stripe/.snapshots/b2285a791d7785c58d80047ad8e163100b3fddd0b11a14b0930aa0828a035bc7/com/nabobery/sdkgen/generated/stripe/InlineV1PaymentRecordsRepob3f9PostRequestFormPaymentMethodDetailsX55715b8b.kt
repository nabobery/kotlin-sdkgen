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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema/properties/payment_method_details
 */
@Serializable(with = InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b.Serializer::class)
public class InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b(
  public val billingDetails:
      InlineV1PaymentRecordsRepob3f9PostRequestFormBillingDetailsX640c897a? = null,
  public val custom:
      InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553? = null,
  public val paymentMethod: String? = null,
  public val type:
      InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a? = null,
) {
  public class Builder {
    public var billingDetails: InlineV1PaymentRecordsRepob3f9PostRequestFormBillingDetailsX640c897a?
        = null

    public var custom:
        InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553? = null

    public var paymentMethod: String? = null

    public var type: InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a?
        = null

    public fun build(): InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b = InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b(
      billingDetails = billingDetails,
      custom = custom,
      paymentMethod = paymentMethod,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b must be a JSON object")
      return InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b(
        billingDetails = rawObject["billing_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsRepob3f9PostRequestFormBillingDetailsX640c897a>(it) },
        custom = rawObject["custom"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b")
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

public fun inlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b(block: InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b.Builder.() -> Unit): InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b = InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b.build(block)
