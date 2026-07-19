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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationPageLocation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `page_location`.
   */
  public data object PageLocation : InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType() {
    public override val `value`: String = "page_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType =
      when (value) {
      PageLocation.value -> PageLocation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
