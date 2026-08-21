package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/sepa_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c(
  public val mandateOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c.build(block)
