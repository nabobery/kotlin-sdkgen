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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FileMetadata/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileMetadata/properties/type
 */
@Serializable(with = InlineFileMetadataTypeX1f3b82cc.Serializer::class)
public sealed class InlineFileMetadataTypeX1f3b82cc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineFileMetadataTypeX1f3b82cc() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFileMetadataTypeX1f3b82cc()

  public companion object {
    public fun fromValue(`value`: String): InlineFileMetadataTypeX1f3b82cc = when (value) {
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFileMetadataTypeX1f3b82cc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFileMetadataTypeX1f3b82cc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFileMetadataTypeX1f3b82cc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFileMetadataTypeX1f3b82cc) {
      encoder.encodeString(value.value)
    }
  }
}
