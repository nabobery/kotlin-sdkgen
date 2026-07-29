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
public data class SetupIntentPaymentMethodOptionsPaytoView(
  @SerialName("mandate_options")
  public val mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsPayto? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_payto
 */
@Serializable(with = SetupIntentPaymentMethodOptionsPayto.Serializer::class)
public class SetupIntentPaymentMethodOptionsPayto(
  public val mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsPayto? = null,
) {
  public class Builder {
    public var mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsPayto? = null

    public fun build(): SetupIntentPaymentMethodOptionsPayto = SetupIntentPaymentMethodOptionsPayto(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsPayto = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SetupIntentPaymentMethodOptionsPayto> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsPayto {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsPayto")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentPaymentMethodOptionsPayto must be a JSON object")
      return SetupIntentPaymentMethodOptionsPayto(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsMandateOptionsPayto>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentPaymentMethodOptionsPayto) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsPayto")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentPaymentMethodOptionsPayto(block: SetupIntentPaymentMethodOptionsPayto.Builder.() -> Unit): SetupIntentPaymentMethodOptionsPayto = SetupIntentPaymentMethodOptionsPayto.build(block)
