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
 * Restrict to natural-language or programming-language tagged activity. Sourced from a sampled, upsampled dataset, so
 * `total_tokens` is an estimate and is aggregated weekly (the trailing weekly bucket may include traffic past
 * `end_date`). Cannot be combined with `modality`, `context_bucket`, or `category`.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1datasets~1rankings-daily/get/parameters/6/schema
 */
@Serializable(with = InlineDatasetsRankingsDailyGetParameterX642fec61.Serializer::class)
public sealed class InlineDatasetsRankingsDailyGetParameterX642fec61 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `natural`.
   */
  public data object Natural : InlineDatasetsRankingsDailyGetParameterX642fec61() {
    public override val `value`: String = "natural"
  }

  /**
   * Documented value. Wire value: `programming`.
   */
  public data object Programming : InlineDatasetsRankingsDailyGetParameterX642fec61() {
    public override val `value`: String = "programming"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDatasetsRankingsDailyGetParameterX642fec61()

  public companion object {
    public fun fromValue(`value`: String): InlineDatasetsRankingsDailyGetParameterX642fec61 = when (value) {
      Natural.value -> Natural
      Programming.value -> Programming
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDatasetsRankingsDailyGetParameterX642fec61> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineDatasetsRankingsDailyGetParameterX642fec61", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDatasetsRankingsDailyGetParameterX642fec61 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDatasetsRankingsDailyGetParameterX642fec61) {
      encoder.encodeString(value.value)
    }
  }
}
