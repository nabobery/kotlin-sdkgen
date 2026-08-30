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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_mandate_options_sepa_debit
 */
@Serializable(with = PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit.Serializer::class)
public class PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit(
  /**
   * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must consist of only uppercase
   * letters, numbers, spaces, or the following special characters: '/', '_', '-', '&', '.'. Cannot begin with 'STRIPE'.
   */
  public val referencePrefix: String? = null,
) {
  public class Builder {
    /**
     * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must consist of only uppercase
     * letters, numbers, spaces, or the following special characters: '/', '_', '-', '&', '.'. Cannot begin with
     * 'STRIPE'.
     */
    public var referencePrefix: String? = null

    public fun build(): PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit = PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit must be a JSON object")
      return PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentPaymentMethodOptionsMandateOptionsSepaDebit(block: PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit.Builder.() -> Unit): PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit = PaymentIntentPaymentMethodOptionsMandateOptionsSepaDebit.build(block)
