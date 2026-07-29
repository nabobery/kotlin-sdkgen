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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/trial_end/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/trial_end/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `now`.
   */
  public data object Now : InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d() {
    public override val `value`: String = "now"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d = when (value) {
      Now.value -> Now
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d) {
      encoder.encodeString(value.value)
    }
  }
}
