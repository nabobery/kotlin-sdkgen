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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_mandate_options_acss_debit
 */
@Serializable(with = PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit.Serializer::class)
public class PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit(
  /**
   * A URL for custom mandate text
   */
  public val customMandateUrl: String? = null,
  /**
   * Description of the interval. Only required if the 'payment_schedule' parameter is 'interval' or 'combined'.
   */
  public val intervalDescription: String? = null,
  /**
   * Payment schedule for the mandate.
   */
  public val paymentSchedule: InlinePaymentIntentPayment6e62PaymentScheduleX9087db06? = null,
  /**
   * Transaction type of the mandate.
   */
  public val transactionType: InlinePaymentIntentPayment6e62TransactionTypeX58c87744? = null,
) {
  public class Builder {
    /**
     * A URL for custom mandate text
     */
    public var customMandateUrl: String? = null

    /**
     * Description of the interval. Only required if the 'payment_schedule' parameter is 'interval' or 'combined'.
     */
    public var intervalDescription: String? = null

    /**
     * Payment schedule for the mandate.
     */
    public var paymentSchedule: InlinePaymentIntentPayment6e62PaymentScheduleX9087db06? = null

    /**
     * Transaction type of the mandate.
     */
    public var transactionType: InlinePaymentIntentPayment6e62TransactionTypeX58c87744? = null

    public fun build(): PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit = PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit(
      customMandateUrl = customMandateUrl,
      intervalDescription = intervalDescription,
      paymentSchedule = paymentSchedule,
      transactionType = transactionType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit must be a JSON object")
      return PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit(
        customMandateUrl = rawObject["custom_mandate_url"]?.let { json.decodeFromJsonElement<String>(it) },
        intervalDescription = rawObject["interval_description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        paymentSchedule = rawObject["payment_schedule"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPayment6e62PaymentScheduleX9087db06?>(element) },
        transactionType = rawObject["transaction_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPayment6e62TransactionTypeX58c87744?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customMandateUrl?.let { put("custom_mandate_url", it) }
        value.intervalDescription?.let { put("interval_description", it) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
        value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentPaymentMethodOptionsMandateOptionsAcssDebit(block: PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit.Builder.() -> Unit): PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit = PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit.build(block)
