package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/time-period/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/time-period/schema
 */
@Serializable(with = InlineTimePeriodParameterX1bd9afe6.Serializer::class)
public sealed class InlineTimePeriodParameterX1bd9afe6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `hour`.
   */
  public data object Hour : InlineTimePeriodParameterX1bd9afe6() {
    public override val `value`: String = "hour"
  }

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineTimePeriodParameterX1bd9afe6() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineTimePeriodParameterX1bd9afe6() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineTimePeriodParameterX1bd9afe6() {
    public override val `value`: String = "month"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTimePeriodParameterX1bd9afe6()

  public companion object {
    public fun fromValue(`value`: String): InlineTimePeriodParameterX1bd9afe6 = when (value) {
      Hour.value -> Hour
      Day.value -> Day
      Week.value -> Week
      Month.value -> Month
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTimePeriodParameterX1bd9afe6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTimePeriodParameterX1bd9afe6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTimePeriodParameterX1bd9afe6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTimePeriodParameterX1bd9afe6) {
      encoder.encodeString(value.value)
    }
  }
}
