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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputImage/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputImage/properties/type
 */
@Serializable(with = InlineInputImageTypeXafc8fcb1.Serializer::class)
public sealed class InlineInputImageTypeXafc8fcb1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_image`.
   */
  public data object InputImage : InlineInputImageTypeXafc8fcb1() {
    public override val `value`: String = "input_image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInputImageTypeXafc8fcb1()

  public companion object {
    public fun fromValue(`value`: String): InlineInputImageTypeXafc8fcb1 = when (value) {
      InputImage.value -> InputImage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInputImageTypeXafc8fcb1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineInputImageTypeXafc8fcb1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInputImageTypeXafc8fcb1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInputImageTypeXafc8fcb1) {
      encoder.encodeString(value.value)
    }
  }
}
