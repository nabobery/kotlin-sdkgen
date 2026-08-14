package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Time grain of each row. `day` (default) returns the per-UTC-day series; `week` buckets by ISO week start; `month`
 * buckets by month start. With `category` or `language_type` only `week` (default) and `month` are available — `day` is
 * rejected with a 400 because those datasets are aggregated weekly. For those sampled datasets `period=month` buckets
 * each week by its week-start month, so totals are approximate at month boundaries.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1datasets~1rankings-daily/get/parameters/2/schema
 */
@Serializable(with = InlineDatasetsRankingsDailyGetParameterXe194b75f.Serializer::class)
public sealed class InlineDatasetsRankingsDailyGetParameterXe194b75f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineDatasetsRankingsDailyGetParameterXe194b75f() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineDatasetsRankingsDailyGetParameterXe194b75f() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineDatasetsRankingsDailyGetParameterXe194b75f() {
    public override val `value`: String = "month"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDatasetsRankingsDailyGetParameterXe194b75f()

  public companion object {
    public fun fromValue(`value`: String): InlineDatasetsRankingsDailyGetParameterXe194b75f = when (value) {
      Day.value -> Day
      Week.value -> Week
      Month.value -> Month
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDatasetsRankingsDailyGetParameterXe194b75f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineDatasetsRankingsDailyGetParameterXe194b75f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDatasetsRankingsDailyGetParameterXe194b75f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDatasetsRankingsDailyGetParameterXe194b75f) {
      encoder.encodeString(value.value)
    }
  }
}
