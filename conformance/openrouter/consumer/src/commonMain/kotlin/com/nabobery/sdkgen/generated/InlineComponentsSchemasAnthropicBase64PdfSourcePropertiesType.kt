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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBase64PdfSource/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `base64`.
   */
  public data object Base64 : InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType() {
    public override val `value`: String = "base64"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType =
      when (value) {
      Base64.value -> Base64
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
