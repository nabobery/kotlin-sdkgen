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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputImage/properties/type.
 */
@Serializable(with = InlineComponentsSchemasInputImagePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasInputImagePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_image`.
   */
  public data object InputImage : InlineComponentsSchemasInputImagePropertiesType() {
    public override val `value`: String = "input_image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInputImagePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInputImagePropertiesType = when (value) {
      InputImage.value -> InputImage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputImagePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInputImagePropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputImagePropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputImagePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
