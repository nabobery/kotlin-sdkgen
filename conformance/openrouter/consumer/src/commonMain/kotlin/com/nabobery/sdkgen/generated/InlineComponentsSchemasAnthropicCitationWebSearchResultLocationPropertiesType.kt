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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationWebSearchResultLocation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_result_location`.
   */
  public data object WebSearchResultLocation : InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType() {
    public override val `value`: String = "web_search_result_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType = when (value) {
      WebSearchResultLocation.value -> WebSearchResultLocation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
