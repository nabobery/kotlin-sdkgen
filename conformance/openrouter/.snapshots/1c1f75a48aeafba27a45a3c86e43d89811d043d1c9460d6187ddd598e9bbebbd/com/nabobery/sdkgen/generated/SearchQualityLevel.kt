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
 * How much context to retrieve per result. Applies to Exa, Parallel, and Perplexity engines; ignored with native
 * provider search and Firecrawl. For Exa, pins a fixed per-result character cap (low=5,000, medium=15,000,
 * high=30,000); when omitted, Exa picks an adaptive size per query and document (typically ~2,000–4,000 characters per
 * result). For Parallel, controls the total characters across all results; when omitted, Parallel uses its own default
 * size. For Perplexity, maps directly to the Search API's native search_context_size parameter. Overridden by
 * `max_characters` when both are set.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SearchQualityLevel
 */
@Serializable(with = SearchQualityLevel.Serializer::class)
public sealed class SearchQualityLevel {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : SearchQualityLevel() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : SearchQualityLevel() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : SearchQualityLevel() {
    public override val `value`: String = "high"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : SearchQualityLevel()

  public companion object {
    public fun fromValue(`value`: String): SearchQualityLevel = when (value) {
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<SearchQualityLevel> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.SearchQualityLevel", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): SearchQualityLevel = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: SearchQualityLevel) {
      encoder.encodeString(value.value)
    }
  }
}
