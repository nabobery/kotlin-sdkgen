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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d(
  public val customMandateUrl:
      InlineV1PaymentIntentsPostRequestFormCustomMandateUrlX38bc05a1? = null,
  public val intervalDescription: String? = null,
  public val paymentSchedule: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX86456689? = null,
  public val transactionType: InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da? = null,
) {
  public class Builder {
    public var customMandateUrl: InlineV1PaymentIntentsPostRequestFormCustomMandateUrlX38bc05a1? =
        null

    public var intervalDescription: String? = null

    public var paymentSchedule: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX86456689? =
        null

    public var transactionType: InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d(
      customMandateUrl = customMandateUrl,
      intervalDescription = intervalDescription,
      paymentSchedule = paymentSchedule,
      transactionType = transactionType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d(
        customMandateUrl = rawObject["custom_mandate_url"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormCustomMandateUrlX38bc05a1>(it) },
        intervalDescription = rawObject["interval_description"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentScheduleX86456689>(it) },
        transactionType = rawObject["transaction_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customMandateUrl?.let { put("custom_mandate_url", json.encodeToJsonElement(it)) }
        value.intervalDescription?.let { put("interval_description", it) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
        value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfcf2bb2d.build(block)
