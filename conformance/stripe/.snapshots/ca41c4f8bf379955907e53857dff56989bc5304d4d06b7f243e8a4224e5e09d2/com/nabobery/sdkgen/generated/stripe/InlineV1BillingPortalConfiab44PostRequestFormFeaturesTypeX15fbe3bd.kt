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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/schedule_at_period_end/propertie
 * s/conditions/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/schedule_at_period_end/propertie
 * s/conditions/items/properties/type
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd.Serializer::class)
public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `decreasing_item_amount`.
   */
  public data object DecreasingItemAmount : InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd() {
    public override val `value`: String = "decreasing_item_amount"
  }

  /**
   * Documented value. Wire value: `shortening_interval`.
   */
  public data object ShorteningInterval : InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd() {
    public override val `value`: String = "shortening_interval"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd = when (value) {
      DecreasingItemAmount.value -> DecreasingItemAmount
      ShorteningInterval.value -> ShorteningInterval
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd) {
      encoder.encodeString(value.value)
    }
  }
}
