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
 * encoded/schema/properties/default_settings/properties/billing_cycle_anchor.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/billing_cycle_anchor
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `phase_start`.
   */
  public data object PhaseStart : InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4() {
    public override val `value`: String = "phase_start"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4 = when (value) {
      Automatic.value -> Automatic
      PhaseStart.value -> PhaseStart
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4) {
      encoder.encodeString(value.value)
    }
  }
}
