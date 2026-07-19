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
 * The source filter applied, or null when all sources are returned.
 */
@Serializable(with = InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource.Serializer::class)
public sealed class InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `artificial-analysis`.
   */
  public data object ArtificialAnalysis : InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource() {
    public override val `value`: String = "artificial-analysis"
  }

  /**
   * Documented value. Wire value: `design-arena`.
   */
  public data object DesignArena : InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource() {
    public override val `value`: String = "design-arena"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource = when (value) {
      ArtificialAnalysis.value -> ArtificialAnalysis
      DesignArena.value -> DesignArena
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource) {
      encoder.encodeString(value.value)
    }
  }
}
