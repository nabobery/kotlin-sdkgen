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
 * Restrict to requests whose context length falls in this bucket (`1K`, `10K`, `100K`, `1M`, or `10M`). Exact dataset —
 * cannot be combined with `category` or `language_type`.
 */
@Serializable(with = InlinePathsDatasetsRankingsDailyGetParameters4Schema.Serializer::class)
public sealed class InlinePathsDatasetsRankingsDailyGetParameters4Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `1K`.
   */
  public data object _1K : InlinePathsDatasetsRankingsDailyGetParameters4Schema() {
    public override val `value`: String = "1K"
  }

  /**
   * Documented value. Wire value: `10K`.
   */
  public data object _10K : InlinePathsDatasetsRankingsDailyGetParameters4Schema() {
    public override val `value`: String = "10K"
  }

  /**
   * Documented value. Wire value: `100K`.
   */
  public data object _100K : InlinePathsDatasetsRankingsDailyGetParameters4Schema() {
    public override val `value`: String = "100K"
  }

  /**
   * Documented value. Wire value: `1M`.
   */
  public data object _1M : InlinePathsDatasetsRankingsDailyGetParameters4Schema() {
    public override val `value`: String = "1M"
  }

  /**
   * Documented value. Wire value: `10M`.
   */
  public data object _10M : InlinePathsDatasetsRankingsDailyGetParameters4Schema() {
    public override val `value`: String = "10M"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsDatasetsRankingsDailyGetParameters4Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsDatasetsRankingsDailyGetParameters4Schema = when (value) {
      _1K.value -> _1K
      _10K.value -> _10K
      _100K.value -> _100K
      _1M.value -> _1M
      _10M.value -> _10M
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsDatasetsRankingsDailyGetParameters4Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsDatasetsRankingsDailyGetParameters4Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsDatasetsRankingsDailyGetParameters4Schema =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsDatasetsRankingsDailyGetParameters4Schema) {
      encoder.encodeString(value.value)
    }
  }
}
