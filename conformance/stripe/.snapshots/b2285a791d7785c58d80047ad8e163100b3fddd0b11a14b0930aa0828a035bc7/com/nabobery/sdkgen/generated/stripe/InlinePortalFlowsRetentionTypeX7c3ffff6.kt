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
 * Type of retention strategy that will be used.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_retention/properties/type
 */
@Serializable(with = InlinePortalFlowsRetentionTypeX7c3ffff6.Serializer::class)
public sealed class InlinePortalFlowsRetentionTypeX7c3ffff6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `coupon_offer`.
   */
  public data object CouponOffer : InlinePortalFlowsRetentionTypeX7c3ffff6() {
    public override val `value`: String = "coupon_offer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePortalFlowsRetentionTypeX7c3ffff6()

  public companion object {
    public fun fromValue(`value`: String): InlinePortalFlowsRetentionTypeX7c3ffff6 = when (value) {
      CouponOffer.value -> CouponOffer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePortalFlowsRetentionTypeX7c3ffff6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePortalFlowsRetentionTypeX7c3ffff6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePortalFlowsRetentionTypeX7c3ffff6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePortalFlowsRetentionTypeX7c3ffff6) {
      encoder.encodeString(value.value)
    }
  }
}
