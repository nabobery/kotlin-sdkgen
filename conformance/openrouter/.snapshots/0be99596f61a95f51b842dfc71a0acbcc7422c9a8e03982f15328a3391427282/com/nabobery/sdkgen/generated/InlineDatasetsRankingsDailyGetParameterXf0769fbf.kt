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
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1datasets~1rankings-daily/get/parameters/4/schema
 */
@Serializable(with = InlineDatasetsRankingsDailyGetParameterXf0769fbf.Serializer::class)
public sealed class InlineDatasetsRankingsDailyGetParameterXf0769fbf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `1K`.
   */
  public data object _1K : InlineDatasetsRankingsDailyGetParameterXf0769fbf() {
    public override val `value`: String = "1K"
  }

  /**
   * Documented value. Wire value: `10K`.
   */
  public data object _10K : InlineDatasetsRankingsDailyGetParameterXf0769fbf() {
    public override val `value`: String = "10K"
  }

  /**
   * Documented value. Wire value: `100K`.
   */
  public data object _100K : InlineDatasetsRankingsDailyGetParameterXf0769fbf() {
    public override val `value`: String = "100K"
  }

  /**
   * Documented value. Wire value: `1M`.
   */
  public data object _1M : InlineDatasetsRankingsDailyGetParameterXf0769fbf() {
    public override val `value`: String = "1M"
  }

  /**
   * Documented value. Wire value: `10M`.
   */
  public data object _10M : InlineDatasetsRankingsDailyGetParameterXf0769fbf() {
    public override val `value`: String = "10M"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDatasetsRankingsDailyGetParameterXf0769fbf()

  public companion object {
    public fun fromValue(`value`: String): InlineDatasetsRankingsDailyGetParameterXf0769fbf = when (value) {
      _1K.value -> _1K
      _10K.value -> _10K
      _100K.value -> _100K
      _1M.value -> _1M
      _10M.value -> _10M
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDatasetsRankingsDailyGetParameterXf0769fbf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineDatasetsRankingsDailyGetParameterXf0769fbf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDatasetsRankingsDailyGetParameterXf0769fbf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDatasetsRankingsDailyGetParameterXf0769fbf) {
      encoder.encodeString(value.value)
    }
  }
}
