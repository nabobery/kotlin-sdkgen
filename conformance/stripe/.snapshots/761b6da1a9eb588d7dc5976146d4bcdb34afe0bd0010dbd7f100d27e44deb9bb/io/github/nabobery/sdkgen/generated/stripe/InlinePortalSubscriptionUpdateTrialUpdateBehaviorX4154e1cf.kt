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
 * Determines how handle updates to trialing subscriptions. Valid values are `end_trial` and `continue_trial`. Defaults
 * to a value of `end_trial` if you don't set it during creation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_subscription_update/properties/trial_update_behavior
 */
@Serializable(with = InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf.Serializer::class)
public sealed class InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `continue_trial`.
   */
  public data object ContinueTrial : InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf() {
    public override val `value`: String = "continue_trial"
  }

  /**
   * Documented value. Wire value: `end_trial`.
   */
  public data object EndTrial : InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf() {
    public override val `value`: String = "end_trial"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf()

  public companion object {
    public fun fromValue(`value`: String): InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf = when (value) {
      ContinueTrial.value -> ContinueTrial
      EndTrial.value -> EndTrial
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf) {
      encoder.encodeString(value.value)
    }
  }
}
