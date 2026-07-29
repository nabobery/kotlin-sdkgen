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
 * This parameter allows you to set some attributes on the payment method created during a Checkout session.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_data
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232(
  public val allowRedisplay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataAllowRedisplayX5139e16f? = null,
) {
  public class Builder {
    public var allowRedisplay:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataAllowRedisplayX5139e16f? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232(
      allowRedisplay = allowRedisplay,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232(
        allowRedisplay = rawObject["allow_redisplay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataAllowRedisplayX5139e16f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowRedisplay?.let { put("allow_redisplay", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232.build(block)
