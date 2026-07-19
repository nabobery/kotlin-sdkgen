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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationWebSearchResultLocationParam/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_result_location`.
   */
  public data object WebSearchResultLocation : InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType() {
    public override val `value`: String = "web_search_result_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType = when (value) {
      WebSearchResultLocation.value -> WebSearchResultLocation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
