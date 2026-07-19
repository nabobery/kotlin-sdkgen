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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBase64ImageSource/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `base64`.
   */
  public data object Base64 : InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType() {
    public override val `value`: String = "base64"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType =
      when (value) {
      Base64.value -> Base64
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
