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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicImageBlockParam/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicImageBlockParamPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicImageBlockParamPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineComponentsSchemasAnthropicImageBlockParamPropertiesType() {
    public override val `value`: String = "image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicImageBlockParamPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicImageBlockParamPropertiesType =
      when (value) {
      Image.value -> Image
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicImageBlockParamPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicImageBlockParamPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicImageBlockParamPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicImageBlockParamPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
