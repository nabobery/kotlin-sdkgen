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
 * Sort the returned models server-side. Prefer this over fetching the full list and sorting client-side. Options:
 * pricing-low-to-high, pricing-high-to-low (average prompt/completion price), context-high-to-low (context length),
 * throughput-high-to-low, latency-low-to-high (recent median performance), most-popular, top-weekly (tokens processed
 * in the last week), newest (creation date), intelligence-high-to-low, coding-high-to-low, agentic-high-to-low
 * (Artificial Analysis indices), design-arena-elo-high-to-low (best Design Arena ELO across arenas). Models without a
 * score for the chosen benchmark are placed last. When omitted, the existing default ordering is preserved.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1models/get/parameters/5/schema
 */
@Serializable(with = InlineModelsGetParameterX21879c75.Serializer::class)
public sealed class InlineModelsGetParameterX21879c75 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `most-popular`.
   */
  public data object MostPopular : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "most-popular"
  }

  /**
   * Documented value. Wire value: `newest`.
   */
  public data object Newest : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "newest"
  }

  /**
   * Documented value. Wire value: `top-weekly`.
   */
  public data object TopWeekly : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "top-weekly"
  }

  /**
   * Documented value. Wire value: `pricing-low-to-high`.
   */
  public data object PricingLowToHigh : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "pricing-low-to-high"
  }

  /**
   * Documented value. Wire value: `pricing-high-to-low`.
   */
  public data object PricingHighToLow : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "pricing-high-to-low"
  }

  /**
   * Documented value. Wire value: `context-high-to-low`.
   */
  public data object ContextHighToLow : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "context-high-to-low"
  }

  /**
   * Documented value. Wire value: `throughput-high-to-low`.
   */
  public data object ThroughputHighToLow : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "throughput-high-to-low"
  }

  /**
   * Documented value. Wire value: `latency-low-to-high`.
   */
  public data object LatencyLowToHigh : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "latency-low-to-high"
  }

  /**
   * Documented value. Wire value: `intelligence-high-to-low`.
   */
  public data object IntelligenceHighToLow : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "intelligence-high-to-low"
  }

  /**
   * Documented value. Wire value: `coding-high-to-low`.
   */
  public data object CodingHighToLow : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "coding-high-to-low"
  }

  /**
   * Documented value. Wire value: `agentic-high-to-low`.
   */
  public data object AgenticHighToLow : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "agentic-high-to-low"
  }

  /**
   * Documented value. Wire value: `design-arena-elo-high-to-low`.
   */
  public data object DesignArenaEloHighToLow : InlineModelsGetParameterX21879c75() {
    public override val `value`: String = "design-arena-elo-high-to-low"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineModelsGetParameterX21879c75()

  public companion object {
    public fun fromValue(`value`: String): InlineModelsGetParameterX21879c75 = when (value) {
      MostPopular.value -> MostPopular
      Newest.value -> Newest
      TopWeekly.value -> TopWeekly
      PricingLowToHigh.value -> PricingLowToHigh
      PricingHighToLow.value -> PricingHighToLow
      ContextHighToLow.value -> ContextHighToLow
      ThroughputHighToLow.value -> ThroughputHighToLow
      LatencyLowToHigh.value -> LatencyLowToHigh
      IntelligenceHighToLow.value -> IntelligenceHighToLow
      CodingHighToLow.value -> CodingHighToLow
      AgenticHighToLow.value -> AgenticHighToLow
      DesignArenaEloHighToLow.value -> DesignArenaEloHighToLow
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineModelsGetParameterX21879c75> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineModelsGetParameterX21879c75", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineModelsGetParameterX21879c75 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineModelsGetParameterX21879c75) {
      encoder.encodeString(value.value)
    }
  }
}
