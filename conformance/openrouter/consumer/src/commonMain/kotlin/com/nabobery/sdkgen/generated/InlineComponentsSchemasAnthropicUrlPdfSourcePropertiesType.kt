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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicUrlPdfSource/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType = when (value) {
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
