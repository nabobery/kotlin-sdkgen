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
 * Select how to calculate the start of the invoice item period.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_invoice_item_period_resource_period_
 * start/properties/type
 */
@Serializable(with = InlineSubscriptionSchedule3ea0TypeX230daed6.Serializer::class)
public sealed class InlineSubscriptionSchedule3ea0TypeX230daed6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_item_period_start`.
   */
  public data object MaxItemPeriodStart : InlineSubscriptionSchedule3ea0TypeX230daed6() {
    public override val `value`: String = "max_item_period_start"
  }

  /**
   * Documented value. Wire value: `phase_start`.
   */
  public data object PhaseStart : InlineSubscriptionSchedule3ea0TypeX230daed6() {
    public override val `value`: String = "phase_start"
  }

  /**
   * Documented value. Wire value: `timestamp`.
   */
  public data object Timestamp : InlineSubscriptionSchedule3ea0TypeX230daed6() {
    public override val `value`: String = "timestamp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionSchedule3ea0TypeX230daed6()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionSchedule3ea0TypeX230daed6 = when (value) {
      MaxItemPeriodStart.value -> MaxItemPeriodStart
      PhaseStart.value -> PhaseStart
      Timestamp.value -> Timestamp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionSchedule3ea0TypeX230daed6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionSchedule3ea0TypeX230daed6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedule3ea0TypeX230daed6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedule3ea0TypeX230daed6) {
      encoder.encodeString(value.value)
    }
  }
}
