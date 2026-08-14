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
 * encoded/schema/properties/phases/items/properties/billing_cycle_anchor.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/billing_cycle_anchor
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `phase_start`.
   */
  public data object PhaseStart : InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf() {
    public override val `value`: String = "phase_start"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf = when (value) {
      Automatic.value -> Automatic
      PhaseStart.value -> PhaseStart
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf) {
      encoder.encodeString(value.value)
    }
  }
}
