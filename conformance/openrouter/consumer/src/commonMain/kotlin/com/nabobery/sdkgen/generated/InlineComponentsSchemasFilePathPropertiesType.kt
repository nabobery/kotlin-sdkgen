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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FilePath/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFilePathPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFilePathPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_path`.
   */
  public data object FilePath : InlineComponentsSchemasFilePathPropertiesType() {
    public override val `value`: String = "file_path"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFilePathPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFilePathPropertiesType = when (value) {
      FilePath.value -> FilePath
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFilePathPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFilePathPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFilePathPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFilePathPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
