package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlinePathsDatasetsRankingsDailyGetParameters2Schema.Serializer::class)
public sealed class InlinePathsDatasetsRankingsDailyGetParameters2Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlinePathsDatasetsRankingsDailyGetParameters2Schema() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlinePathsDatasetsRankingsDailyGetParameters2Schema() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlinePathsDatasetsRankingsDailyGetParameters2Schema() {
    public override val `value`: String = "month"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsDatasetsRankingsDailyGetParameters2Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsDatasetsRankingsDailyGetParameters2Schema = when (value) {
      Day.value -> Day
      Week.value -> Week
      Month.value -> Month
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsDatasetsRankingsDailyGetParameters2Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsDatasetsRankingsDailyGetParameters2Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsDatasetsRankingsDailyGetParameters2Schema =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsDatasetsRankingsDailyGetParameters2Schema) {
      encoder.encodeString(value.value)
    }
  }
}
