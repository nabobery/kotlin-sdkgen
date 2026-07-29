package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_acss_debit_mandate_options
 */
@Serializable(with = CheckoutAcssDebitMandateOptions.Serializer::class)
public class CheckoutAcssDebitMandateOptions(
  /**
   * A URL for custom mandate text
   */
  public val customMandateUrl: String? = null,
  defaultFor: List<InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b>? = null,
  /**
   * Description of the interval. Only required if the 'payment_schedule' parameter is 'interval' or 'combined'.
   */
  public val intervalDescription: String? = null,
  /**
   * Payment schedule for the mandate.
   */
  public val paymentSchedule: InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4? = null,
  /**
   * Transaction type of the mandate.
   */
  public val transactionType: InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba? = null,
) {
  /**
   * List of Stripe products where this mandate can be selected automatically. Returned when the Session is in `setup`
   * mode.
   */
  public val defaultFor: List<InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b>? =
      defaultFor?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * A URL for custom mandate text
     */
    public var customMandateUrl: String? = null

    private var defaultForValue: List<InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b>?
        = null

    /**
     * List of Stripe products where this mandate can be selected automatically. Returned when the Session is in `setup`
     * mode.
     */
    public var defaultFor: List<InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b>?
      get() = defaultForValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        defaultForValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Description of the interval. Only required if the 'payment_schedule' parameter is 'interval' or 'combined'.
     */
    public var intervalDescription: String? = null

    /**
     * Payment schedule for the mandate.
     */
    public var paymentSchedule: InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4? =
        null

    /**
     * Transaction type of the mandate.
     */
    public var transactionType: InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba? =
        null

    public fun build(): CheckoutAcssDebitMandateOptions = CheckoutAcssDebitMandateOptions(
      customMandateUrl = customMandateUrl,
      defaultFor = defaultFor,
      intervalDescription = intervalDescription,
      paymentSchedule = paymentSchedule,
      transactionType = transactionType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutAcssDebitMandateOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CheckoutAcssDebitMandateOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutAcssDebitMandateOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutAcssDebitMandateOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutAcssDebitMandateOptions must be a JSON object")
      return CheckoutAcssDebitMandateOptions(
        customMandateUrl = rawObject["custom_mandate_url"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultFor = rawObject["default_for"]?.let { json.decodeFromJsonElement<List<InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b>>(it) },
        intervalDescription = rawObject["interval_description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        paymentSchedule = rawObject["payment_schedule"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4?>(element) },
        transactionType = rawObject["transaction_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutAcssDebitMandateOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutAcssDebitMandateOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customMandateUrl?.let { put("custom_mandate_url", it) }
        value.defaultFor?.let { put("default_for", json.encodeToJsonElement(it)) }
        value.intervalDescription?.let { put("interval_description", it) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
        value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutAcssDebitMandateOptions(block: CheckoutAcssDebitMandateOptions.Builder.() -> Unit): CheckoutAcssDebitMandateOptions = CheckoutAcssDebitMandateOptions.build(block)
