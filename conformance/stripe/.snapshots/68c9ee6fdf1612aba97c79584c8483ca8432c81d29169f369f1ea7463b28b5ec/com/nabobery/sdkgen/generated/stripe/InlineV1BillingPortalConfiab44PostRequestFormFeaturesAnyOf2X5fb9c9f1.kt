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
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/products/anyOf/
 * 1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/products/anyOf/
 * 1
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1.Serializer::class)
public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1) {
      encoder.encodeString(value.value)
    }
  }
}
