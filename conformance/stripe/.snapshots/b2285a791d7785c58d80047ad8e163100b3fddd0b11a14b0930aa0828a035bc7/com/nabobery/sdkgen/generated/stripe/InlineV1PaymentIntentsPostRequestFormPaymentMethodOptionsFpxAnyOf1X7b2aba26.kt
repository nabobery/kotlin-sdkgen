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
 * /schema/properties/payment_method_options/properties/fpx/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/fpx/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26(
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX61241fed? = null,
) {
  public class Builder {
    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX61241fed? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26(
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26(
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX61241fed>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26.build(block)
