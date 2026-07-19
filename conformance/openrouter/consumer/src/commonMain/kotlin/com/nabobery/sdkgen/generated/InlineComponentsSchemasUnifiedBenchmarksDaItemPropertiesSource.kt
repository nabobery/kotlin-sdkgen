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
 */
@Serializable(with = InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource.Serializer::class)
public sealed class InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `design-arena`.
   */
  public data object DesignArena : InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource() {
    public override val `value`: String = "design-arena"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource =
      when (value) {
      DesignArena.value -> DesignArena
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource) {
      encoder.encodeString(value.value)
    }
  }
}
