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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c(
  public val customMandateUrl:
      InlineV1PaymentIntentsConfirmPostRequestFormCustomMandateUrlX88561543? = null,
  public val intervalDescription: String? = null,
  public val paymentSchedule:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924? = null,
  public val transactionType:
      InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b? = null,
) {
  public class Builder {
    public var customMandateUrl:
        InlineV1PaymentIntentsConfirmPostRequestFormCustomMandateUrlX88561543? = null

    public var intervalDescription: String? = null

    public var paymentSchedule:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924? = null

    public var transactionType:
        InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c(
      customMandateUrl = customMandateUrl,
      intervalDescription = intervalDescription,
      paymentSchedule = paymentSchedule,
      transactionType = transactionType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c(
        customMandateUrl = rawObject["custom_mandate_url"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCustomMandateUrlX88561543>(it) },
        intervalDescription = rawObject["interval_description"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924>(it) },
        transactionType = rawObject["transaction_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c(block: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX0cf7267c.build(block)
