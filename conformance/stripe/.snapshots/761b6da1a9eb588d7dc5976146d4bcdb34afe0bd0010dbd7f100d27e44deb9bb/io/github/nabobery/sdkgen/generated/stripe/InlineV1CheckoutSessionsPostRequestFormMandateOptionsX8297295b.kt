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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b(
  public val amount:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAmountX8791f609? = null,
  public val amountType:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeXfa0ba206? = null,
  public val endDate:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715? = null,
  public val paymentSchedule:
      InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX3481c32f? = null,
  public val paymentsPerPeriod:
      InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70? = null,
  public val purpose:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d? = null,
  public val startDate:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe? = null,
) {
  public class Builder {
    public var amount:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAmountX8791f609? = null

    public var amountType:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeXfa0ba206? = null

    public var endDate:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715? = null

    public var paymentSchedule: InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX3481c32f? =
        null

    public var paymentsPerPeriod: InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70?
        = null

    public var purpose:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d? = null

    public var startDate:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b = InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b(
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
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAmountX8791f609>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeXfa0ba206>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX3481c32f>(it) },
        paymentsPerPeriod = rawObject["payments_per_period"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70>(it) },
        purpose = rawObject["purpose"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b")
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

public fun inlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b(block: InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b = InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b.build(block)
