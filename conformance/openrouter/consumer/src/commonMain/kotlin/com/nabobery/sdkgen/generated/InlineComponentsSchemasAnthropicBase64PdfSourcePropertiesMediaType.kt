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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBase64PdfSource/properties/media_type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `application/pdf`.
   */
  public data object ApplicationPdf : InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType() {
    public override val `value`: String = "application/pdf"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType =
      when (value) {
      ApplicationPdf.value -> ApplicationPdf
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType) {
      encoder.encodeString(value.value)
    }
  }
}
