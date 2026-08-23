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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_payment_method_options_mandate_options_pix
 */
@Serializable(with = SubscriptionPaymentMethodOptionsMandateOptionsPix.Serializer::class)
public class SubscriptionPaymentMethodOptionsMandateOptionsPix(
  /**
   * Amount to be charged for future payments.
   */
  public val amount: Int? = null,
  /**
   * Determines if the amount includes the IOF tax.
   */
  public val amountIncludesIof: InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134? = null,
  /**
   * Date when the mandate expires and no further payments will be charged, in `YYYY-MM-DD`.
   */
  public val endDate: String? = null,
  /**
   * Schedule at which the future payments will be charged.
   */
  public val paymentSchedule:
      InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8? = null,
) {
  public class Builder {
    /**
     * Amount to be charged for future payments.
     */
    public var amount: Int? = null

    /**
     * Determines if the amount includes the IOF tax.
     */
    public var amountIncludesIof: InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134? = null

    /**
     * Date when the mandate expires and no further payments will be charged, in `YYYY-MM-DD`.
     */
    public var endDate: String? = null

    /**
     * Schedule at which the future payments will be charged.
     */
    public var paymentSchedule:
        InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8? = null

    public fun build(): SubscriptionPaymentMethodOptionsMandateOptionsPix = SubscriptionPaymentMethodOptionsMandateOptionsPix(
      amount = amount,
      amountIncludesIof = amountIncludesIof,
      endDate = endDate,
      paymentSchedule = paymentSchedule,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionPaymentMethodOptionsMandateOptionsPix = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionPaymentMethodOptionsMandateOptionsPix> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionPaymentMethodOptionsMandateOptionsPix {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionPaymentMethodOptionsMandateOptionsPix")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionPaymentMethodOptionsMandateOptionsPix must be a JSON object")
      return SubscriptionPaymentMethodOptionsMandateOptionsPix(
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        amountIncludesIof = rawObject["amount_includes_iof"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134?>(element) },
        endDate = rawObject["end_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        paymentSchedule = rawObject["payment_schedule"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionPaymentMethodOptionsMandateOptionsPix) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionPaymentMethodOptionsMandateOptionsPix")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountIncludesIof?.let { put("amount_includes_iof", json.encodeToJsonElement(it)) }
        value.endDate?.let { put("end_date", it) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionPaymentMethodOptionsMandateOptionsPix(block: SubscriptionPaymentMethodOptionsMandateOptionsPix.Builder.() -> Unit): SubscriptionPaymentMethodOptionsMandateOptionsPix = SubscriptionPaymentMethodOptionsMandateOptionsPix.build(block)
