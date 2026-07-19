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
 * Restrict to a use-case category (e.g. `programming`, `roleplay`). Sourced from a sampled, upsampled dataset, so
 * `total_tokens` is an estimate and is aggregated weekly (the trailing weekly bucket may include traffic past
 * `end_date`). Cannot be combined with `modality`, `context_bucket`, or `language_type`.
 */
@Serializable(with = InlinePathsDatasetsRankingsDailyGetParameters5Schema.Serializer::class)
public sealed class InlinePathsDatasetsRankingsDailyGetParameters5Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `programming`.
   */
  public data object Programming : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "programming"
  }

  /**
   * Documented value. Wire value: `roleplay`.
   */
  public data object Roleplay : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "roleplay"
  }

  /**
   * Documented value. Wire value: `marketing`.
   */
  public data object Marketing : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "marketing"
  }

  /**
   * Documented value. Wire value: `marketing/seo`.
   */
  public data object MarketingSeo : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "marketing/seo"
  }

  /**
   * Documented value. Wire value: `technology`.
   */
  public data object Technology : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "technology"
  }

  /**
   * Documented value. Wire value: `science`.
   */
  public data object Science : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "science"
  }

  /**
   * Documented value. Wire value: `translation`.
   */
  public data object Translation : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "translation"
  }

  /**
   * Documented value. Wire value: `legal`.
   */
  public data object Legal : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "legal"
  }

  /**
   * Documented value. Wire value: `finance`.
   */
  public data object Finance : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "finance"
  }

  /**
   * Documented value. Wire value: `health`.
   */
  public data object Health : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "health"
  }

  /**
   * Documented value. Wire value: `trivia`.
   */
  public data object Trivia : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "trivia"
  }

  /**
   * Documented value. Wire value: `academia`.
   */
  public data object Academia : InlinePathsDatasetsRankingsDailyGetParameters5Schema() {
    public override val `value`: String = "academia"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsDatasetsRankingsDailyGetParameters5Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsDatasetsRankingsDailyGetParameters5Schema = when (value) {
      Programming.value -> Programming
      Roleplay.value -> Roleplay
      Marketing.value -> Marketing
      MarketingSeo.value -> MarketingSeo
      Technology.value -> Technology
      Science.value -> Science
      Translation.value -> Translation
      Legal.value -> Legal
      Finance.value -> Finance
      Health.value -> Health
      Trivia.value -> Trivia
      Academia.value -> Academia
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsDatasetsRankingsDailyGetParameters5Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsDatasetsRankingsDailyGetParameters5Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsDatasetsRankingsDailyGetParameters5Schema =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsDatasetsRankingsDailyGetParameters5Schema) {
      encoder.encodeString(value.value)
    }
  }
}
