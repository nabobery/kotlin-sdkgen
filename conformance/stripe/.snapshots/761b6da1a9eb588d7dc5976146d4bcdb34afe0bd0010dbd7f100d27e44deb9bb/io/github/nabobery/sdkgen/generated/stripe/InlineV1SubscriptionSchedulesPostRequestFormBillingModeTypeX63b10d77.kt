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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/billing_mode/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/billing_mode/properties/type
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `classic`.
   */
  public data object Classic : InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77() {
    public override val `value`: String = "classic"
  }

  /**
   * Documented value. Wire value: `flexible`.
   */
  public data object Flexible : InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77() {
    public override val `value`: String = "flexible"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77 = when (value) {
      Classic.value -> Classic
      Flexible.value -> Flexible
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77) {
      encoder.encodeString(value.value)
    }
  }
}
