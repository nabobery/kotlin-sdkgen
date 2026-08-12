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
 * Possible values are `phase_start` or `automatic`. If `phase_start` then billing cycle anchor of the subscription is
 * set to the start of the phase when entering the phase. If `automatic` then the billing cycle anchor is automatically
 * modified as needed when entering the phase. For more information, see the billing cycle
 * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedule_phase_configuration/properties/billing_cycle_a
 * nchor
 */
@Serializable(with = InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb.Serializer::class)
public sealed class InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `phase_start`.
   */
  public data object PhaseStart : InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb() {
    public override val `value`: String = "phase_start"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb = when (value) {
      Automatic.value -> Automatic
      PhaseStart.value -> PhaseStart
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb) {
      encoder.encodeString(value.value)
    }
  }
}
