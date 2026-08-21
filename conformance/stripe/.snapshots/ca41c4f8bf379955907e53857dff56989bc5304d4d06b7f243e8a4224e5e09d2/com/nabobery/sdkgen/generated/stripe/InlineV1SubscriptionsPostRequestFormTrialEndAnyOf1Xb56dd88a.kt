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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/trial_end/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/trial_end/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `now`.
   */
  public data object Now : InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a() {
    public override val `value`: String = "now"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a = when (value) {
      Now.value -> Now
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a) {
      encoder.encodeString(value.value)
    }
  }
}
