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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_mandate_options_upi
 */
@Serializable(with = PaymentMethodOptionsMandateOptionsUpi.Serializer::class)
public class PaymentMethodOptionsMandateOptionsUpi(
  /**
   * Amount to be charged for future payments.
   */
  public val amount: Int? = null,
  /**
   * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
   * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
   */
  public val amountType: InlinePaymentMethodOptionsMandateOptionsUpiAmountTypeX6ab8da60? = null,
  /**
   * A description of the mandate or subscription that is meant to be displayed to the customer.
   */
  public val description: String? = null,
  /**
   * End date of the mandate or subscription.
   */
  public val endDate: Int? = null,
) {
  public class Builder {
    /**
     * Amount to be charged for future payments.
     */
    public var amount: Int? = null

    /**
     * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
     * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
     */
    public var amountType: InlinePaymentMethodOptionsMandateOptionsUpiAmountTypeX6ab8da60? = null

    /**
     * A description of the mandate or subscription that is meant to be displayed to the customer.
     */
    public var description: String? = null

    /**
     * End date of the mandate or subscription.
     */
    public var endDate: Int? = null

    public fun build(): PaymentMethodOptionsMandateOptionsUpi = PaymentMethodOptionsMandateOptionsUpi(
      amount = amount,
      amountType = amountType,
      description = description,
      endDate = endDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsMandateOptionsUpi = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodOptionsMandateOptionsUpi> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsMandateOptionsUpi {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsMandateOptionsUpi")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsMandateOptionsUpi must be a JSON object")
      return PaymentMethodOptionsMandateOptionsUpi(
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        amountType = rawObject["amount_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodOptionsMandateOptionsUpiAmountTypeX6ab8da60?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        endDate = rawObject["end_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsMandateOptionsUpi) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsMandateOptionsUpi")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsMandateOptionsUpi(block: PaymentMethodOptionsMandateOptionsUpi.Builder.() -> Unit): PaymentMethodOptionsMandateOptionsUpi = PaymentMethodOptionsMandateOptionsUpi.build(block)
