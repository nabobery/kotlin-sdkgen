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
 * Specifies billing duration. Either `day`, `week`, `month` or `year`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_schedules_bill_until_duration/propert
 * ies/interval
 */
@Serializable(with = InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a.Serializer::class)
public sealed class InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a = when (value) {
      Day.value -> Day
      Month.value -> Month
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a) {
      encoder.encodeString(value.value)
    }
  }
}
