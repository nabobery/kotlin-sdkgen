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
 * Behavior of the subscription schedule and underlying subscription when it ends. Possible values are `release` or
 * `cancel` with the default being `release`. `release` will end the subscription schedule and keep the underlying
 * subscription running. `cancel` will end the subscription schedule and cancel the underlying subscription.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule/properties/end_behavior
 */
@Serializable(with = InlineSubscriptionScheduleEndBehaviorXf40f838d.Serializer::class)
public sealed class InlineSubscriptionScheduleEndBehaviorXf40f838d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancel`.
   */
  public data object Cancel : InlineSubscriptionScheduleEndBehaviorXf40f838d() {
    public override val `value`: String = "cancel"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineSubscriptionScheduleEndBehaviorXf40f838d() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `release`.
   */
  public data object Release : InlineSubscriptionScheduleEndBehaviorXf40f838d() {
    public override val `value`: String = "release"
  }

  /**
   * Documented value. Wire value: `renew`.
   */
  public data object Renew : InlineSubscriptionScheduleEndBehaviorXf40f838d() {
    public override val `value`: String = "renew"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionScheduleEndBehaviorXf40f838d()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionScheduleEndBehaviorXf40f838d = when (value) {
      Cancel.value -> Cancel
      None.value -> None
      Release.value -> Release
      Renew.value -> Renew
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionScheduleEndBehaviorXf40f838d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSubscriptionScheduleEndBehaviorXf40f838d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleEndBehaviorXf40f838d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionScheduleEndBehaviorXf40f838d) {
      encoder.encodeString(value.value)
    }
  }
}
