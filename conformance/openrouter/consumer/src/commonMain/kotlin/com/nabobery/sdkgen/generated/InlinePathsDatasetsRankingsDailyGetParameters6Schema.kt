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
 * Restrict to natural-language or programming-language tagged activity. Sourced from a sampled, upsampled dataset, so
 * `total_tokens` is an estimate and is aggregated weekly (the trailing weekly bucket may include traffic past
 * `end_date`). Cannot be combined with `modality`, `context_bucket`, or `category`.
 */
@Serializable(with = InlinePathsDatasetsRankingsDailyGetParameters6Schema.Serializer::class)
public sealed class InlinePathsDatasetsRankingsDailyGetParameters6Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `natural`.
   */
  public data object Natural : InlinePathsDatasetsRankingsDailyGetParameters6Schema() {
    public override val `value`: String = "natural"
  }

  /**
   * Documented value. Wire value: `programming`.
   */
  public data object Programming : InlinePathsDatasetsRankingsDailyGetParameters6Schema() {
    public override val `value`: String = "programming"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsDatasetsRankingsDailyGetParameters6Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsDatasetsRankingsDailyGetParameters6Schema = when (value) {
      Natural.value -> Natural
      Programming.value -> Programming
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsDatasetsRankingsDailyGetParameters6Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsDatasetsRankingsDailyGetParameters6Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsDatasetsRankingsDailyGetParameters6Schema =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsDatasetsRankingsDailyGetParameters6Schema) {
      encoder.encodeString(value.value)
    }
  }
}
