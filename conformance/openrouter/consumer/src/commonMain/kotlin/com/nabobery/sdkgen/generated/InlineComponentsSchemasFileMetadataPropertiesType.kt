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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FileMetadata/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFileMetadataPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFileMetadataPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineComponentsSchemasFileMetadataPropertiesType() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFileMetadataPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFileMetadataPropertiesType = when (value) {
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileMetadataPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFileMetadataPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileMetadataPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFileMetadataPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
