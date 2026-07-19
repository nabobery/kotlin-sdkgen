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
 * Dataset version.
 */
@Serializable(with = InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion.Serializer::class)
public sealed class InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `v1`.
   */
  public data object V1 : InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion() {
    public override val `value`: String = "v1"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion =
      when (value) {
      V1.value -> V1
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion) {
      encoder.encodeString(value.value)
    }
  }
}
