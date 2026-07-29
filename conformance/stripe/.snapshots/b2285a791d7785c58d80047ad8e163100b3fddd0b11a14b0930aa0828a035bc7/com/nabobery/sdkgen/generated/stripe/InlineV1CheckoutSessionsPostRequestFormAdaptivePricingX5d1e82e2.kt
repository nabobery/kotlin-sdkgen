package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Settings for price localization with [Adaptive Pricing](https://docs.stripe.com/payments/checkout/adaptive-pricing).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/adaptive_pricing
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2 = InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2(block: InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2 = InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2.build(block)
