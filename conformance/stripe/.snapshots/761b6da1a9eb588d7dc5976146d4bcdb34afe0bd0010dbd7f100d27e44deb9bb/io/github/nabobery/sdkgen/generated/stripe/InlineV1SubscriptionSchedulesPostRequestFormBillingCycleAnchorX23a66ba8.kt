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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/billing_cycle_anchor.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/billing_cycle_anchor
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `phase_start`.
   */
  public data object PhaseStart : InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8() {
    public override val `value`: String = "phase_start"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8 = when (value) {
      Automatic.value -> Automatic
      PhaseStart.value -> PhaseStart
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8) {
      encoder.encodeString(value.value)
    }
  }
}
