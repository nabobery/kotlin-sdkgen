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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationContentBlockLocationParam/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content_block_location`.
   */
  public data object ContentBlockLocation : InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType() {
    public override val `value`: String = "content_block_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType = when (value) {
      ContentBlockLocation.value -> ContentBlockLocation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
