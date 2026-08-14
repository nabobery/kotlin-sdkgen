package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3(
  public val amount:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5? = null,
  public val amountType: InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX2a957681? = null,
  public val endDate:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55? = null,
  public val paymentSchedule:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX7a5ced29? = null,
  public val paymentsPerPeriod:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d? = null,
  public val purpose:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPurposeXfa947f3b? = null,
  public val startDate:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f? = null,
) {
  public class Builder {
    public var amount:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5? = null

    public var amountType: InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX2a957681? = null

    public var endDate:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55? = null

    public var paymentSchedule: InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX7a5ced29?
        = null

    public var paymentsPerPeriod:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d? = null

    public var purpose:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPurposeXfa947f3b? = null

    public var startDate:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3 = InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3(
      amount = amount,
      amountType = amountType,
      endDate = endDate,
      paymentSchedule = paymentSchedule,
      paymentsPerPeriod = paymentsPerPeriod,
      purpose = purpose,
      startDate = startDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3 must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX2a957681>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX7a5ced29>(it) },
        paymentsPerPeriod = rawObject["payments_per_period"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d>(it) },
        purpose = rawObject["purpose"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPurposeXfa947f3b>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
        value.paymentsPerPeriod?.let { put("payments_per_period", json.encodeToJsonElement(it)) }
        value.purpose?.let { put("purpose", json.encodeToJsonElement(it)) }
        value.startDate?.let { put("start_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3(block: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3 = InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5a9c1cb3.build(block)
