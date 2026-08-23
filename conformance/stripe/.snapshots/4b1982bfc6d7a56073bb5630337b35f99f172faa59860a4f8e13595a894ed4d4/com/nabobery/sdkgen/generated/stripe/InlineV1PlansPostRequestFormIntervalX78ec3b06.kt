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
 * Specifies billing frequency. Either `day`, `week`, `month` or `year`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/interval
 */
@Serializable(with = InlineV1PlansPostRequestFormIntervalX78ec3b06.Serializer::class)
public sealed class InlineV1PlansPostRequestFormIntervalX78ec3b06 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1PlansPostRequestFormIntervalX78ec3b06() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1PlansPostRequestFormIntervalX78ec3b06() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineV1PlansPostRequestFormIntervalX78ec3b06() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineV1PlansPostRequestFormIntervalX78ec3b06() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PlansPostRequestFormIntervalX78ec3b06()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PlansPostRequestFormIntervalX78ec3b06 = when (value) {
      Day.value -> Day
      Month.value -> Month
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PlansPostRequestFormIntervalX78ec3b06> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PlansPostRequestFormIntervalX78ec3b06", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormIntervalX78ec3b06 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PlansPostRequestFormIntervalX78ec3b06) {
      encoder.encodeString(value.value)
    }
  }
}
