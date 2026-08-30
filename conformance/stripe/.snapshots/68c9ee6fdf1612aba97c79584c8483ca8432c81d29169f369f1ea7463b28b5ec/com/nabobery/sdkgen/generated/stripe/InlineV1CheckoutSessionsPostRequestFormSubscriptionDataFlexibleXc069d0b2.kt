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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/billing_mode/properties/flexible.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/billing_mode/properties/flexible
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2(
  public val prorationDiscounts:
      InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3? = null,
) {
  public class Builder {
    public var prorationDiscounts:
        InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2 = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2(
      prorationDiscounts = prorationDiscounts,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2(
        prorationDiscounts = rawObject["proration_discounts"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.prorationDiscounts?.let { put("proration_discounts", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2(block: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2 = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2.build(block)
