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
 * The present status of the subscription schedule. Possible values are `not_started`, `active`, `completed`,
 * `released`, and `canceled`. You can read more about the different states in our [behavior
 * guide](https://docs.stripe.com/billing/subscriptions/subscription-schedules).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule/properties/status
 */
@Serializable(with = InlineSubscriptionScheduleStatusXa92acafb.Serializer::class)
public sealed class InlineSubscriptionScheduleStatusXa92acafb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineSubscriptionScheduleStatusXa92acafb() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineSubscriptionScheduleStatusXa92acafb() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineSubscriptionScheduleStatusXa92acafb() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `not_started`.
   */
  public data object NotStarted : InlineSubscriptionScheduleStatusXa92acafb() {
    public override val `value`: String = "not_started"
  }

  /**
   * Documented value. Wire value: `released`.
   */
  public data object Released : InlineSubscriptionScheduleStatusXa92acafb() {
    public override val `value`: String = "released"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionScheduleStatusXa92acafb()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionScheduleStatusXa92acafb = when (value) {
      Active.value -> Active
      Canceled.value -> Canceled
      Completed.value -> Completed
      NotStarted.value -> NotStarted
      Released.value -> Released
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionScheduleStatusXa92acafb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionScheduleStatusXa92acafb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleStatusXa92acafb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionScheduleStatusXa92acafb) {
      encoder.encodeString(value.value)
    }
  }
}
