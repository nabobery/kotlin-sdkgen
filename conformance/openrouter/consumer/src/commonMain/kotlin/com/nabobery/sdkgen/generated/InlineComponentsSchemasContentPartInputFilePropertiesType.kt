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
 */
@Serializable(with = InlineComponentsSchemasContentPartInputFilePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasContentPartInputFilePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_file`.
   */
  public data object InputFile : InlineComponentsSchemasContentPartInputFilePropertiesType() {
    public override val `value`: String = "input_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasContentPartInputFilePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasContentPartInputFilePropertiesType = when (value) {
      InputFile.value -> InputFile
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasContentPartInputFilePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasContentPartInputFilePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasContentPartInputFilePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasContentPartInputFilePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
