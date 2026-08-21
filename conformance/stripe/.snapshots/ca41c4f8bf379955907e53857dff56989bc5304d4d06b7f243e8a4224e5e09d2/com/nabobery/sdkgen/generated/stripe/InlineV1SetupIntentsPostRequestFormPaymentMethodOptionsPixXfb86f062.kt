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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/pix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/pix
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062(
  public val mandateOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa3375758? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa3375758? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa3375758>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXfb86f062.build(block)
