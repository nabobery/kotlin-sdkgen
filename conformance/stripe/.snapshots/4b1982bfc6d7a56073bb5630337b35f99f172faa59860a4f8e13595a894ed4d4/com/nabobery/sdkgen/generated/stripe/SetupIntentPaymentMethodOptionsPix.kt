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
public data class SetupIntentPaymentMethodOptionsPixView(
  @SerialName("mandate_options")
  public val mandateOptions: PaymentMethodOptionsMandateOptionsPix? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_pix
 */
@Serializable(with = SetupIntentPaymentMethodOptionsPix.Serializer::class)
public class SetupIntentPaymentMethodOptionsPix(
  public val mandateOptions: PaymentMethodOptionsMandateOptionsPix? = null,
) {
  public class Builder {
    public var mandateOptions: PaymentMethodOptionsMandateOptionsPix? = null

    public fun build(): SetupIntentPaymentMethodOptionsPix = SetupIntentPaymentMethodOptionsPix(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsPix = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupIntentPaymentMethodOptionsPix> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsPix {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsPix")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentPaymentMethodOptionsPix must be a JSON object")
      return SetupIntentPaymentMethodOptionsPix(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<PaymentMethodOptionsMandateOptionsPix>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentPaymentMethodOptionsPix) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsPix")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentPaymentMethodOptionsPix(block: SetupIntentPaymentMethodOptionsPix.Builder.() -> Unit): SetupIntentPaymentMethodOptionsPix = SetupIntentPaymentMethodOptionsPix.build(block)
