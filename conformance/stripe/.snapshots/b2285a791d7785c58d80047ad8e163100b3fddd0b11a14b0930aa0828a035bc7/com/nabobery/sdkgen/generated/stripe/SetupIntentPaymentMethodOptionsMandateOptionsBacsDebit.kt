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
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_mandate_options_bacs_debit
 */
@Serializable(with = SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit.Serializer::class)
public class SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit(
  /**
   * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must consist of only uppercase
   * letters, numbers, spaces, or the following special characters: '/', '_', '-', '&', '.'. Cannot begin with 'DDIC' or
   * 'STRIPE'.
   */
  public val referencePrefix: String? = null,
) {
  public class Builder {
    /**
     * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must consist of only uppercase
     * letters, numbers, spaces, or the following special characters: '/', '_', '-', '&', '.'. Cannot begin with 'DDIC'
     * or 'STRIPE'.
     */
    public var referencePrefix: String? = null

    public fun build(): SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit = SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit must be a JSON object")
      return SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentPaymentMethodOptionsMandateOptionsBacsDebit(block: SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit.Builder.() -> Unit): SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit = SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit.build(block)
