package io.github.nabobery.sdkgen.generated.stripe

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
 * form-urlencoded/schema/properties/features/properties/subscription_cancel/properties/mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_cancel/properties/mode
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578.Serializer::class)
public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `at_period_end`.
   */
  public data object AtPeriodEnd : InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578() {
    public override val `value`: String = "at_period_end"
  }

  /**
   * Documented value. Wire value: `immediately`.
   */
  public data object Immediately : InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578() {
    public override val `value`: String = "immediately"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578 = when (value) {
      AtPeriodEnd.value -> AtPeriodEnd
      Immediately.value -> Immediately
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578) {
      encoder.encodeString(value.value)
    }
  }
}
