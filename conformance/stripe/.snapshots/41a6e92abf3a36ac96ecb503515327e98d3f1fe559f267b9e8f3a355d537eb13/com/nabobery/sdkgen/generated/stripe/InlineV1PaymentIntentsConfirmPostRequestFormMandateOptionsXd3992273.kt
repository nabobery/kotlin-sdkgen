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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273(
  public val amount:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX86fee944? = null,
  public val amountType: InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeXd6abecf7? = null,
  public val endDate:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83? = null,
  public val paymentSchedule:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleX145e4db3? = null,
  public val paymentsPerPeriod:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentsPerPeriodXc5745970? = null,
  public val purpose:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPurposeX0df99872? = null,
) {
  public class Builder {
    public var amount:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX86fee944? = null

    public var amountType: InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeXd6abecf7? = null

    public var endDate:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83? = null

    public var paymentSchedule:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleX145e4db3? = null

    public var paymentsPerPeriod:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentsPerPeriodXc5745970? = null

    public var purpose:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPurposeX0df99872? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273 = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273(
      amount = amount,
      amountType = amountType,
      endDate = endDate,
      paymentSchedule = paymentSchedule,
      paymentsPerPeriod = paymentsPerPeriod,
      purpose = purpose,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX86fee944>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeXd6abecf7>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleX145e4db3>(it) },
        paymentsPerPeriod = rawObject["payments_per_period"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentsPerPeriodXc5745970>(it) },
        purpose = rawObject["purpose"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPurposeX0df99872>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273(block: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273 = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXd3992273.build(block)
