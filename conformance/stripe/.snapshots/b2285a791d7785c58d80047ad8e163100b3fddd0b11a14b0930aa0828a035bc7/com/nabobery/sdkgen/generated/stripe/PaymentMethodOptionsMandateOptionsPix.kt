package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_mandate_options_pix
 */
@Serializable(with = PaymentMethodOptionsMandateOptionsPix.Serializer::class)
public class PaymentMethodOptionsMandateOptionsPix(
  /**
   * Amount to be charged for future payments.
   */
  public val amount: Int? = null,
  /**
   * Determines if the amount includes the IOF tax.
   */
  public val amountIncludesIof:
      InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306? = null,
  /**
   * Type of amount.
   */
  public val amountType: InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de? = null,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * Date when the mandate expires and no further payments will be charged, in `YYYY-MM-DD`.
   */
  public val endDate: String? = null,
  /**
   * Schedule at which the future payments will be charged.
   */
  public val paymentSchedule:
      InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405? = null,
  /**
   * Subscription name displayed to buyers in their bank app.
   */
  public val reference: String? = null,
  /**
   * Start date of the mandate, in `YYYY-MM-DD`.
   */
  public val startDate: String? = null,
) {
  public class Builder {
    /**
     * Amount to be charged for future payments.
     */
    public var amount: Int? = null

    /**
     * Determines if the amount includes the IOF tax.
     */
    public var amountIncludesIof:
        InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306? = null

    /**
     * Type of amount.
     */
    public var amountType: InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de? = null

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase.
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * Date when the mandate expires and no further payments will be charged, in `YYYY-MM-DD`.
     */
    public var endDate: String? = null

    /**
     * Schedule at which the future payments will be charged.
     */
    public var paymentSchedule: InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405?
        = null

    /**
     * Subscription name displayed to buyers in their bank app.
     */
    public var reference: String? = null

    /**
     * Start date of the mandate, in `YYYY-MM-DD`.
     */
    public var startDate: String? = null

    public fun build(): PaymentMethodOptionsMandateOptionsPix = PaymentMethodOptionsMandateOptionsPix(
      amount = amount,
      amountIncludesIof = amountIncludesIof,
      amountType = amountType,
      currency = currency,
      endDate = endDate,
      paymentSchedule = paymentSchedule,
      reference = reference,
      startDate = startDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsMandateOptionsPix = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodOptionsMandateOptionsPix> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsMandateOptionsPix {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsMandateOptionsPix")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsMandateOptionsPix must be a JSON object")
      return PaymentMethodOptionsMandateOptionsPix(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountIncludesIof = rawObject["amount_includes_iof"]?.let { json.decodeFromJsonElement<InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsMandateOptionsPix) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsMandateOptionsPix")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountIncludesIof?.let { put("amount_includes_iof", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.endDate?.let { put("end_date", it) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
        value.reference?.let { put("reference", it) }
        value.startDate?.let { put("start_date", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsMandateOptionsPix(block: PaymentMethodOptionsMandateOptionsPix.Builder.() -> Unit): PaymentMethodOptionsMandateOptionsPix = PaymentMethodOptionsMandateOptionsPix.build(block)
