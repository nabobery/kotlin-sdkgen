package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_mandate_options_payto
 */
@Serializable(with = PaymentIntentPaymentMethodOptionsMandateOptionsPayto.Serializer::class)
public class PaymentIntentPaymentMethodOptionsMandateOptionsPayto(
  /**
   * Amount that will be collected. It is required when `amount_type` is `fixed`.
   */
  public val amount: Int? = null,
  /**
   * The type of amount that will be collected. The amount charged must be exact or up to the value of `amount` param
   * for `fixed` or `maximum` type respectively. Defaults to `maximum`.
   */
  public val amountType:
      InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6? = null,
  /**
   * Date, in YYYY-MM-DD format, after which payments will not be collected. Defaults to no end date.
   */
  public val endDate: String? = null,
  /**
   * The periodicity at which payments will be collected. Defaults to `adhoc`.
   */
  public val paymentSchedule: InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9? = null,
  /**
   * The number of payments that will be made during a payment period. Defaults to 1 except for when `payment_schedule`
   * is `adhoc`. In that case, it defaults to no limit.
   */
  public val paymentsPerPeriod: Int? = null,
  /**
   * The purpose for which payments are made. Has a default value based on your merchant category code.
   */
  public val purpose:
      InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e? = null,
) {
  public class Builder {
    /**
     * Amount that will be collected. It is required when `amount_type` is `fixed`.
     */
    public var amount: Int? = null

    /**
     * The type of amount that will be collected. The amount charged must be exact or up to the value of `amount` param
     * for `fixed` or `maximum` type respectively. Defaults to `maximum`.
     */
    public var amountType:
        InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6? = null

    /**
     * Date, in YYYY-MM-DD format, after which payments will not be collected. Defaults to no end date.
     */
    public var endDate: String? = null

    /**
     * The periodicity at which payments will be collected. Defaults to `adhoc`.
     */
    public var paymentSchedule: InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9? = null

    /**
     * The number of payments that will be made during a payment period. Defaults to 1 except for when
     * `payment_schedule` is `adhoc`. In that case, it defaults to no limit.
     */
    public var paymentsPerPeriod: Int? = null

    /**
     * The purpose for which payments are made. Has a default value based on your merchant category code.
     */
    public var purpose: InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e?
        = null

    public fun build(): PaymentIntentPaymentMethodOptionsMandateOptionsPayto = PaymentIntentPaymentMethodOptionsMandateOptionsPayto(
      amount = amount,
      amountType = amountType,
      endDate = endDate,
      paymentSchedule = paymentSchedule,
      paymentsPerPeriod = paymentsPerPeriod,
      purpose = purpose,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentPaymentMethodOptionsMandateOptionsPayto = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentPaymentMethodOptionsMandateOptionsPayto> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentPaymentMethodOptionsMandateOptionsPayto {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentPaymentMethodOptionsMandateOptionsPayto")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentPaymentMethodOptionsMandateOptionsPayto must be a JSON object")
      return PaymentIntentPaymentMethodOptionsMandateOptionsPayto(
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        amountType = rawObject["amount_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6?>(element) },
        endDate = rawObject["end_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        paymentSchedule = rawObject["payment_schedule"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9?>(element) },
        paymentsPerPeriod = rawObject["payments_per_period"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        purpose = rawObject["purpose"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentPaymentMethodOptionsMandateOptionsPayto) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentPaymentMethodOptionsMandateOptionsPayto")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.endDate?.let { put("end_date", it) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
        value.paymentsPerPeriod?.let { put("payments_per_period", json.encodeToJsonElement(it)) }
        value.purpose?.let { put("purpose", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentPaymentMethodOptionsMandateOptionsPayto(block: PaymentIntentPaymentMethodOptionsMandateOptionsPayto.Builder.() -> Unit): PaymentIntentPaymentMethodOptionsMandateOptionsPayto = PaymentIntentPaymentMethodOptionsMandateOptionsPayto.build(block)
