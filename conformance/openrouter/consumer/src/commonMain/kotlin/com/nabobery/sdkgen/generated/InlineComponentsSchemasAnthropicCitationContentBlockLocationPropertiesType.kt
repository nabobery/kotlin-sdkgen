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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationContentBlockLocation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content_block_location`.
   */
  public data object ContentBlockLocation : InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType() {
    public override val `value`: String = "content_block_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType =
      when (value) {
      ContentBlockLocation.value -> ContentBlockLocation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
