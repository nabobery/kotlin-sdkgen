package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_cancel/properties/retention.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_cancel/properties/retention
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd(
  public val couponOffer: InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a,
  public val type: InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba,
) {
  public class Builder {
    private var couponOfferValue:
        InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a? = null

    public var couponOffer: InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a
      get() = requireNotNull(couponOfferValue) { "couponOffer is required" }
      set(`value`) {
        couponOfferValue = value
      }

    private var typeValue: InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba? = null

    public var type: InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd {
      check(couponOfferValue != null) { "couponOffer is required" }
      check(typeValue != null) { "type is required" }
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd(
        couponOffer = couponOffer,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd must be a JSON object")
      val couponOffer = json.decodeRequired<InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a>(rawObject, "coupon_offer")
      val type = json.decodeRequired<InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba>(rawObject, "type")
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd(
        couponOffer = couponOffer,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("coupon_offer", json.encodeToJsonElement(value.couponOffer))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd(block: InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd = InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
