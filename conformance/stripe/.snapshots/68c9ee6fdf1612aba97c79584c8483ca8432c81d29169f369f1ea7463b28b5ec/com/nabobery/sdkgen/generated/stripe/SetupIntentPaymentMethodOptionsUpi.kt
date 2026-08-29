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
public data class SetupIntentPaymentMethodOptionsUpiView(
  @SerialName("mandate_options")
  public val mandateOptions: PaymentMethodOptionsMandateOptionsUpi? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_upi
 */
@Serializable(with = SetupIntentPaymentMethodOptionsUpi.Serializer::class)
public class SetupIntentPaymentMethodOptionsUpi(
  public val mandateOptions: PaymentMethodOptionsMandateOptionsUpi? = null,
) {
  public class Builder {
    public var mandateOptions: PaymentMethodOptionsMandateOptionsUpi? = null

    public fun build(): SetupIntentPaymentMethodOptionsUpi = SetupIntentPaymentMethodOptionsUpi(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsUpi = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupIntentPaymentMethodOptionsUpi> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsUpi {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsUpi")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentPaymentMethodOptionsUpi must be a JSON object")
      return SetupIntentPaymentMethodOptionsUpi(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<PaymentMethodOptionsMandateOptionsUpi>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentPaymentMethodOptionsUpi) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsUpi")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentPaymentMethodOptionsUpi(block: SetupIntentPaymentMethodOptionsUpi.Builder.() -> Unit): SetupIntentPaymentMethodOptionsUpi = SetupIntentPaymentMethodOptionsUpi.build(block)
