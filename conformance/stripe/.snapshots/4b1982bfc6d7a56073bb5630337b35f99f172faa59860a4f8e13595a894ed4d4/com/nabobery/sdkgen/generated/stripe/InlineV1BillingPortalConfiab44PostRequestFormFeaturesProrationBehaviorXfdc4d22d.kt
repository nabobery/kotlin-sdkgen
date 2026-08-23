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
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_cancel/properties/proration_behav
 * ior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_cancel/properties/proration_behav
 * ior
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d.Serializer::class)
public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always_invoice`.
   */
  public data object AlwaysInvoice : InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d() {
    public override val `value`: String = "always_invoice"
  }

  /**
   * Documented value. Wire value: `create_prorations`.
   */
  public data object CreateProrations : InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d() {
    public override val `value`: String = "create_prorations"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d = when (value) {
      AlwaysInvoice.value -> AlwaysInvoice
      CreateProrations.value -> CreateProrations
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d) {
      encoder.encodeString(value.value)
    }
  }
}
