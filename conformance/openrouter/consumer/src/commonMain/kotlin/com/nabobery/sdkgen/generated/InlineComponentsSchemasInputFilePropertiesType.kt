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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputFile/properties/type.
 */
@Serializable(with = InlineComponentsSchemasInputFilePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasInputFilePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_file`.
   */
  public data object InputFile : InlineComponentsSchemasInputFilePropertiesType() {
    public override val `value`: String = "input_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInputFilePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInputFilePropertiesType = when (value) {
      InputFile.value -> InputFile
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputFilePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInputFilePropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputFilePropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputFilePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
