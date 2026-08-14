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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/trial_end/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/trial_end/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `now`.
   */
  public data object Now : InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e() {
    public override val `value`: String = "now"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e = when (value) {
      Now.value -> Now
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e) {
      encoder.encodeString(value.value)
    }
  }
}
