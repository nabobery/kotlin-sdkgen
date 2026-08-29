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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksDAItem/properties/source
 */
@Serializable(with = InlineUnifiedBenchmarksDaItemSourceX6401fb53.Serializer::class)
public sealed class InlineUnifiedBenchmarksDaItemSourceX6401fb53 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `design-arena`.
   */
  public data object DesignArena : InlineUnifiedBenchmarksDaItemSourceX6401fb53() {
    public override val `value`: String = "design-arena"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUnifiedBenchmarksDaItemSourceX6401fb53()

  public companion object {
    public fun fromValue(`value`: String): InlineUnifiedBenchmarksDaItemSourceX6401fb53 = when (value) {
      DesignArena.value -> DesignArena
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUnifiedBenchmarksDaItemSourceX6401fb53> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineUnifiedBenchmarksDaItemSourceX6401fb53", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUnifiedBenchmarksDaItemSourceX6401fb53 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUnifiedBenchmarksDaItemSourceX6401fb53) {
      encoder.encodeString(value.value)
    }
  }
}
