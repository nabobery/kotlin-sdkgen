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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FilesServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFilesServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFilesServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:files`.
   */
  public data object OpenrouterFiles : InlineComponentsSchemasFilesServerToolPropertiesType() {
    public override val `value`: String = "openrouter:files"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFilesServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFilesServerToolPropertiesType = when (value) {
      OpenrouterFiles.value -> OpenrouterFiles
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFilesServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFilesServerToolPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFilesServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFilesServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
