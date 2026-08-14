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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/payto/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/payto/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef(
  public val amount:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf? = null,
  public val amountType:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountTypeX8b463214? = null,
  public val endDate:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f? = null,
  public val paymentSchedule:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX63219857? = null,
  public val paymentsPerPeriod:
      InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005? = null,
  public val purpose:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeX2d48ecbf? = null,
  public val startDate:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8? = null,
) {
  public class Builder {
    public var amount: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf?
        = null

    public var amountType:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountTypeX8b463214? = null

    public var endDate:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f? = null

    public var paymentSchedule:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX63219857? = null

    public var paymentsPerPeriod: InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005? =
        null

    public var purpose:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeX2d48ecbf? = null

    public var startDate:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef(
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
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountTypeX8b463214>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX63219857>(it) },
        paymentsPerPeriod = rawObject["payments_per_period"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005>(it) },
        purpose = rawObject["purpose"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeX2d48ecbf>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef")
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX7bb807ef.build(block)
