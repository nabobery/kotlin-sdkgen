package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_update_confirm/properties/discounts/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_update_confirm/properties/discounts/items
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c(
  public val coupon: String? = null,
  public val promotionCode: String? = null,
) {
  public class Builder {
    public var coupon: String? = null

    public var promotionCode: String? = null

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c = InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c(
      coupon = coupon,
      promotionCode = promotionCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c must be a JSON object")
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c(
        coupon = rawObject["coupon"]?.let { json.decodeFromJsonElement<String>(it) },
        promotionCode = rawObject["promotion_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.coupon?.let { put("coupon", it) }
        value.promotionCode?.let { put("promotion_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c(block: InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c = InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c.build(block)
