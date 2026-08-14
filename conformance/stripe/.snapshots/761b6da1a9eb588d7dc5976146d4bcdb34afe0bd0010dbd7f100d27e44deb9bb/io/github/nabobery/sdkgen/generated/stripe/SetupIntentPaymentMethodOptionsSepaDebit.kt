package io.github.nabobery.sdkgen.generated.stripe

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
public data class SetupIntentPaymentMethodOptionsSepaDebitView(
  @SerialName("mandate_options")
  public val mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsSepaDebit? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_sepa_debit
 */
@Serializable(with = SetupIntentPaymentMethodOptionsSepaDebit.Serializer::class)
public class SetupIntentPaymentMethodOptionsSepaDebit(
  public val mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsSepaDebit? = null,
) {
  public class Builder {
    public var mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsSepaDebit? = null

    public fun build(): SetupIntentPaymentMethodOptionsSepaDebit = SetupIntentPaymentMethodOptionsSepaDebit(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsSepaDebit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupIntentPaymentMethodOptionsSepaDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsSepaDebit {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsSepaDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentPaymentMethodOptionsSepaDebit must be a JSON object")
      return SetupIntentPaymentMethodOptionsSepaDebit(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsMandateOptionsSepaDebit>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentPaymentMethodOptionsSepaDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsSepaDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentPaymentMethodOptionsSepaDebit(block: SetupIntentPaymentMethodOptionsSepaDebit.Builder.() -> Unit): SetupIntentPaymentMethodOptionsSepaDebit = SetupIntentPaymentMethodOptionsSepaDebit.build(block)
