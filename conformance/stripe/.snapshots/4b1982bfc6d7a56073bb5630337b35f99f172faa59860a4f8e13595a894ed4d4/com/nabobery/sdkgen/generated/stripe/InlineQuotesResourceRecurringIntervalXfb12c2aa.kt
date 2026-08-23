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
 * The frequency at which a subscription is billed. One of `day`, `week`, `month` or `year`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_recurring/properties/interval
 */
@Serializable(with = InlineQuotesResourceRecurringIntervalXfb12c2aa.Serializer::class)
public sealed class InlineQuotesResourceRecurringIntervalXfb12c2aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineQuotesResourceRecurringIntervalXfb12c2aa() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineQuotesResourceRecurringIntervalXfb12c2aa() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineQuotesResourceRecurringIntervalXfb12c2aa() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineQuotesResourceRecurringIntervalXfb12c2aa() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineQuotesResourceRecurringIntervalXfb12c2aa()

  public companion object {
    public fun fromValue(`value`: String): InlineQuotesResourceRecurringIntervalXfb12c2aa = when (value) {
      Day.value -> Day
      Month.value -> Month
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineQuotesResourceRecurringIntervalXfb12c2aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineQuotesResourceRecurringIntervalXfb12c2aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineQuotesResourceRecurringIntervalXfb12c2aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineQuotesResourceRecurringIntervalXfb12c2aa) {
      encoder.encodeString(value.value)
    }
  }
}
