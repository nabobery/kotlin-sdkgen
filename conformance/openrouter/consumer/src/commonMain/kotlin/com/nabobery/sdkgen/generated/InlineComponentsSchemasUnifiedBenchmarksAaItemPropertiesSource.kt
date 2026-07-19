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
@Serializable(with = InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource.Serializer::class)
public sealed class InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `artificial-analysis`.
   */
  public data object ArtificialAnalysis : InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource() {
    public override val `value`: String = "artificial-analysis"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource =
      when (value) {
      ArtificialAnalysis.value -> ArtificialAnalysis
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource) {
      encoder.encodeString(value.value)
    }
  }
}
