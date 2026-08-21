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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/eps/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/eps/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033(
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX0a0dd5f6? = null,
) {
  public class Builder {
    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX0a0dd5f6? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033(
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033(
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX0a0dd5f6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033.build(block)
