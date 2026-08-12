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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/bacs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/bacs_debit
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a(
  public val mandateOptions:
      InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c? =
        null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a.build(block)
