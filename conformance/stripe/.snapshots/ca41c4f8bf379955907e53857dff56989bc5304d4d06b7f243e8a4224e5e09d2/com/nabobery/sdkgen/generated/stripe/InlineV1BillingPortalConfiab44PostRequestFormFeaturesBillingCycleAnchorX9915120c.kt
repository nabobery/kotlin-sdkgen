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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/billing_cycle_a
 * nchor.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/billing_cycle_a
 * nchor
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c.Serializer::class)
public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `now`.
   */
  public data object Now : InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c() {
    public override val `value`: String = "now"
  }

  /**
   * Documented value. Wire value: `unchanged`.
   */
  public data object Unchanged : InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c() {
    public override val `value`: String = "unchanged"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c = when (value) {
      Now.value -> Now
      Unchanged.value -> Unchanged
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c) {
      encoder.encodeString(value.value)
    }
  }
}
