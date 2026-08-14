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
 * Dataset version.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksMeta/properties/version
 */
@Serializable(with = InlineUnifiedBenchmarksMetaVersionX16262c0a.Serializer::class)
public sealed class InlineUnifiedBenchmarksMetaVersionX16262c0a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `v1`.
   */
  public data object V1 : InlineUnifiedBenchmarksMetaVersionX16262c0a() {
    public override val `value`: String = "v1"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUnifiedBenchmarksMetaVersionX16262c0a()

  public companion object {
    public fun fromValue(`value`: String): InlineUnifiedBenchmarksMetaVersionX16262c0a = when (value) {
      V1.value -> V1
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUnifiedBenchmarksMetaVersionX16262c0a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineUnifiedBenchmarksMetaVersionX16262c0a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUnifiedBenchmarksMetaVersionX16262c0a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUnifiedBenchmarksMetaVersionX16262c0a) {
      encoder.encodeString(value.value)
    }
  }
}
