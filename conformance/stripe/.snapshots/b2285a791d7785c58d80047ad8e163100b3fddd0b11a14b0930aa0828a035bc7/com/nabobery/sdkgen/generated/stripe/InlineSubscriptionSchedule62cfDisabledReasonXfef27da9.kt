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
 * If Stripe disabled automatic tax, this enum describes why.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_default_settings_automatic_tax/prope
 * rties/disabled_reason
 */
@Serializable(with = InlineSubscriptionSchedule62cfDisabledReasonXfef27da9.Serializer::class)
public sealed class InlineSubscriptionSchedule62cfDisabledReasonXfef27da9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requires_location_inputs`.
   */
  public data object RequiresLocationInputs : InlineSubscriptionSchedule62cfDisabledReasonXfef27da9() {
    public override val `value`: String = "requires_location_inputs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionSchedule62cfDisabledReasonXfef27da9()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionSchedule62cfDisabledReasonXfef27da9 = when (value) {
      RequiresLocationInputs.value -> RequiresLocationInputs
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionSchedule62cfDisabledReasonXfef27da9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionSchedule62cfDisabledReasonXfef27da9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedule62cfDisabledReasonXfef27da9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedule62cfDisabledReasonXfef27da9) {
      encoder.encodeString(value.value)
    }
  }
}
