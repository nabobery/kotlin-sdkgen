package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class SetupIntentPaymentMethodOptionsBacsDebitView(
  @SerialName("mandate_options")
  public val mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_bacs_debit
 */
@Serializable(with = SetupIntentPaymentMethodOptionsBacsDebit.Serializer::class)
public class SetupIntentPaymentMethodOptionsBacsDebit(
  public val mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit? = null,
) {
  public class Builder {
    public var mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit? = null

    public fun build(): SetupIntentPaymentMethodOptionsBacsDebit = SetupIntentPaymentMethodOptionsBacsDebit(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsBacsDebit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupIntentPaymentMethodOptionsBacsDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsBacsDebit {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsBacsDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentPaymentMethodOptionsBacsDebit must be a JSON object")
      return SetupIntentPaymentMethodOptionsBacsDebit(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsMandateOptionsBacsDebit>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentPaymentMethodOptionsBacsDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsBacsDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentPaymentMethodOptionsBacsDebit(block: SetupIntentPaymentMethodOptionsBacsDebit.Builder.() -> Unit): SetupIntentPaymentMethodOptionsBacsDebit = SetupIntentPaymentMethodOptionsBacsDebit.build(block)
