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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicUrlImageSource/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType = when (value) {
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
