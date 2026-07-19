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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationCharLocation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `char_location`.
   */
  public data object CharLocation : InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType() {
    public override val `value`: String = "char_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType =
      when (value) {
      CharLocation.value -> CharLocation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
