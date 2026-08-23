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
 * Describes how the billing schedule will determine the end date. Either `duration` or `timestamp`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_schedules_bill_until/properties/type
 */
@Serializable(with = InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb.Serializer::class)
public sealed class InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `duration`.
   */
  public data object Duration : InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb() {
    public override val `value`: String = "duration"
  }

  /**
   * Documented value. Wire value: `timestamp`.
   */
  public data object Timestamp : InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb() {
    public override val `value`: String = "timestamp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb = when (value) {
      Duration.value -> Duration
      Timestamp.value -> Timestamp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb) {
      encoder.encodeString(value.value)
    }
  }
}
