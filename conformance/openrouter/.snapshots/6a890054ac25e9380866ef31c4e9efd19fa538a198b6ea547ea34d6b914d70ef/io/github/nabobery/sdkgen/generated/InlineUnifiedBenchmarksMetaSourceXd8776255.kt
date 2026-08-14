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
 * The source filter applied, or null when all sources are returned.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksMeta/properties/source
 */
@Serializable(with = InlineUnifiedBenchmarksMetaSourceXd8776255.Serializer::class)
public sealed class InlineUnifiedBenchmarksMetaSourceXd8776255 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `artificial-analysis`.
   */
  public data object ArtificialAnalysis : InlineUnifiedBenchmarksMetaSourceXd8776255() {
    public override val `value`: String = "artificial-analysis"
  }

  /**
   * Documented value. Wire value: `design-arena`.
   */
  public data object DesignArena : InlineUnifiedBenchmarksMetaSourceXd8776255() {
    public override val `value`: String = "design-arena"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUnifiedBenchmarksMetaSourceXd8776255()

  public companion object {
    public fun fromValue(`value`: String): InlineUnifiedBenchmarksMetaSourceXd8776255 = when (value) {
      ArtificialAnalysis.value -> ArtificialAnalysis
      DesignArena.value -> DesignArena
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUnifiedBenchmarksMetaSourceXd8776255> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineUnifiedBenchmarksMetaSourceXd8776255", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUnifiedBenchmarksMetaSourceXd8776255 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUnifiedBenchmarksMetaSourceXd8776255) {
      encoder.encodeString(value.value)
    }
  }
}
