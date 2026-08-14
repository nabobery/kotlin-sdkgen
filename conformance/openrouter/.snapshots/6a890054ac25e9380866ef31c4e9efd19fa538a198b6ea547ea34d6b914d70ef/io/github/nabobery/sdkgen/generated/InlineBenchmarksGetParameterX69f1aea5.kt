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
 * Benchmark source to query. Determines the shape of the returned items. When omitted, returns results from all
 * sources.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1benchmarks/get/parameters/0/schema
 */
@Serializable(with = InlineBenchmarksGetParameterX69f1aea5.Serializer::class)
public sealed class InlineBenchmarksGetParameterX69f1aea5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `artificial-analysis`.
   */
  public data object ArtificialAnalysis : InlineBenchmarksGetParameterX69f1aea5() {
    public override val `value`: String = "artificial-analysis"
  }

  /**
   * Documented value. Wire value: `design-arena`.
   */
  public data object DesignArena : InlineBenchmarksGetParameterX69f1aea5() {
    public override val `value`: String = "design-arena"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBenchmarksGetParameterX69f1aea5()

  public companion object {
    public fun fromValue(`value`: String): InlineBenchmarksGetParameterX69f1aea5 = when (value) {
      ArtificialAnalysis.value -> ArtificialAnalysis
      DesignArena.value -> DesignArena
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBenchmarksGetParameterX69f1aea5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBenchmarksGetParameterX69f1aea5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBenchmarksGetParameterX69f1aea5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBenchmarksGetParameterX69f1aea5) {
      encoder.encodeString(value.value)
    }
  }
}
