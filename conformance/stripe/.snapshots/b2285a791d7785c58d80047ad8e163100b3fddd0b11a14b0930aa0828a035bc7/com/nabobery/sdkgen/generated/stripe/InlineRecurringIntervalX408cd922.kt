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
 * Source: sdkgen://source/openapi.json#/components/schemas/recurring/properties/interval
 */
@Serializable(with = InlineRecurringIntervalX408cd922.Serializer::class)
public sealed class InlineRecurringIntervalX408cd922 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineRecurringIntervalX408cd922() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineRecurringIntervalX408cd922() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineRecurringIntervalX408cd922() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineRecurringIntervalX408cd922() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRecurringIntervalX408cd922()

  public companion object {
    public fun fromValue(`value`: String): InlineRecurringIntervalX408cd922 = when (value) {
      Day.value -> Day
      Month.value -> Month
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRecurringIntervalX408cd922> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineRecurringIntervalX408cd922", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRecurringIntervalX408cd922 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRecurringIntervalX408cd922) {
      encoder.encodeString(value.value)
    }
  }
}
