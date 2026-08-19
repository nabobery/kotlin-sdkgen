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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContentPartInputFile/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartInputFile/properties/type
 */
@Serializable(with = InlineContentPartInputFileTypeXe38b4826.Serializer::class)
public sealed class InlineContentPartInputFileTypeXe38b4826 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_file`.
   */
  public data object InputFile : InlineContentPartInputFileTypeXe38b4826() {
    public override val `value`: String = "input_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContentPartInputFileTypeXe38b4826()

  public companion object {
    public fun fromValue(`value`: String): InlineContentPartInputFileTypeXe38b4826 = when (value) {
      InputFile.value -> InputFile
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContentPartInputFileTypeXe38b4826> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineContentPartInputFileTypeXe38b4826", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContentPartInputFileTypeXe38b4826 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContentPartInputFileTypeXe38b4826) {
      encoder.encodeString(value.value)
    }
  }
}
