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
 * Benchmark source discriminator.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksAAItem/properties/source
 */
@Serializable(with = InlineUnifiedBenchmarksAaItemSourceX724e0cad.Serializer::class)
public sealed class InlineUnifiedBenchmarksAaItemSourceX724e0cad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `artificial-analysis`.
   */
  public data object ArtificialAnalysis : InlineUnifiedBenchmarksAaItemSourceX724e0cad() {
    public override val `value`: String = "artificial-analysis"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUnifiedBenchmarksAaItemSourceX724e0cad()

  public companion object {
    public fun fromValue(`value`: String): InlineUnifiedBenchmarksAaItemSourceX724e0cad = when (value) {
      ArtificialAnalysis.value -> ArtificialAnalysis
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUnifiedBenchmarksAaItemSourceX724e0cad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineUnifiedBenchmarksAaItemSourceX724e0cad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUnifiedBenchmarksAaItemSourceX724e0cad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUnifiedBenchmarksAaItemSourceX724e0cad) {
      encoder.encodeString(value.value)
    }
  }
}
