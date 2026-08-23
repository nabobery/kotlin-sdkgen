package com.nabobery.sdkgen.generated.stripe

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
 * urlencoded/schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447(
  public val amount:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX07d697f1? = null,
  public val amountType:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXcd42b5ec? = null,
  public val endDate:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateX8e56a011? = null,
  public val paymentSchedule: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f? = null,
  public val paymentsPerPeriod:
      InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858? = null,
  public val purpose:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeX17ded54f? = null,
) {
  public class Builder {
    public var amount:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX07d697f1? = null

    public var amountType:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXcd42b5ec? = null

    public var endDate:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateX8e56a011? = null

    public var paymentSchedule: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f? =
        null

    public var paymentsPerPeriod: InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858? =
        null

    public var purpose:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeX17ded54f? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447(
      amount = amount,
      amountType = amountType,
      endDate = endDate,
      paymentSchedule = paymentSchedule,
      paymentsPerPeriod = paymentsPerPeriod,
      purpose = purpose,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX07d697f1>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXcd42b5ec>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateX8e56a011>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f>(it) },
        paymentsPerPeriod = rawObject["payments_per_period"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858>(it) },
        purpose = rawObject["purpose"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeX17ded54f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
        value.paymentsPerPeriod?.let { put("payments_per_period", json.encodeToJsonElement(it)) }
        value.purpose?.let { put("purpose", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX08584447.build(block)
