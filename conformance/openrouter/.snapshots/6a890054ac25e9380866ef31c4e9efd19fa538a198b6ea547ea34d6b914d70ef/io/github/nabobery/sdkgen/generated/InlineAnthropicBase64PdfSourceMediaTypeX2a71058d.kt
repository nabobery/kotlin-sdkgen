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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBase64PdfSource/properties/media_type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicBase64PdfSource/properties/media_type
 */
@Serializable(with = InlineAnthropicBase64PdfSourceMediaTypeX2a71058d.Serializer::class)
public sealed class InlineAnthropicBase64PdfSourceMediaTypeX2a71058d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `application/pdf`.
   */
  public data object ApplicationPdf : InlineAnthropicBase64PdfSourceMediaTypeX2a71058d() {
    public override val `value`: String = "application/pdf"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicBase64PdfSourceMediaTypeX2a71058d()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicBase64PdfSourceMediaTypeX2a71058d = when (value) {
      ApplicationPdf.value -> ApplicationPdf
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicBase64PdfSourceMediaTypeX2a71058d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicBase64PdfSourceMediaTypeX2a71058d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicBase64PdfSourceMediaTypeX2a71058d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicBase64PdfSourceMediaTypeX2a71058d) {
      encoder.encodeString(value.value)
    }
  }
}
