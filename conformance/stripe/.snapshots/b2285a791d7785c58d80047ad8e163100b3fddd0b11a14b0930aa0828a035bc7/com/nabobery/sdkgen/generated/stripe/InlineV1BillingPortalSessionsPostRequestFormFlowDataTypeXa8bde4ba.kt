package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_cancel/properties/retention/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_cancel/properties/retention/properties/type
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba.Serializer::class)
public sealed class InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `coupon_offer`.
   */
  public data object CouponOffer : InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba() {
    public override val `value`: String = "coupon_offer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba = when (value) {
      CouponOffer.value -> CouponOffer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXa8bde4ba) {
      encoder.encodeString(value.value)
    }
  }
}
