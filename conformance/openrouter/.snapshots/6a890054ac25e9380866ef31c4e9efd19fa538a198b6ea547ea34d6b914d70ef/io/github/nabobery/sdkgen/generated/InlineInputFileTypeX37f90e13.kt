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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputFile/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputFile/properties/type
 */
@Serializable(with = InlineInputFileTypeX37f90e13.Serializer::class)
public sealed class InlineInputFileTypeX37f90e13 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_file`.
   */
  public data object InputFile : InlineInputFileTypeX37f90e13() {
    public override val `value`: String = "input_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInputFileTypeX37f90e13()

  public companion object {
    public fun fromValue(`value`: String): InlineInputFileTypeX37f90e13 = when (value) {
      InputFile.value -> InputFile
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInputFileTypeX37f90e13> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineInputFileTypeX37f90e13", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInputFileTypeX37f90e13 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInputFileTypeX37f90e13) {
      encoder.encodeString(value.value)
    }
  }
}
