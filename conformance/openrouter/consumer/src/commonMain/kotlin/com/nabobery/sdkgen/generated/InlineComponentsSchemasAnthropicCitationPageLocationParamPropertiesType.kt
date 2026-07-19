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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationPageLocationParam/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `page_location`.
   */
  public data object PageLocation : InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType() {
    public override val `value`: String = "page_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType =
      when (value) {
      PageLocation.value -> PageLocation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
