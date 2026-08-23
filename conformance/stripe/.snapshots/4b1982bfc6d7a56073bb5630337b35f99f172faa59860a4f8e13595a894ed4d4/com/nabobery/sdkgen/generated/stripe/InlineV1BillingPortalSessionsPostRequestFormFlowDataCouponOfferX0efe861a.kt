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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_cancel/properties/retention/properties/coupon_offer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_cancel/properties/retention/properties/coupon_offer
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a(
  public val coupon: String,
) {
  public class Builder {
    private var couponValue: String? = null

    public var coupon: String
      get() = requireNotNull(couponValue) { "coupon is required" }
      set(`value`) {
        couponValue = value
      }

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a {
      check(couponValue != null) { "coupon is required" }
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a(
        coupon = coupon,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a must be a JSON object")
      val coupon = json.decodeRequired<String>(rawObject, "coupon")
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a(
        coupon = coupon,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("coupon", value.coupon)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a(block: InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a = InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataCouponOfferX0efe861a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
