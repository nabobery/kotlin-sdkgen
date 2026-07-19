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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchResultBlockParam/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicWebSearchResultBlockParamPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicWebSearchResultBlockParamPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_result`.
   */
  public data object WebSearchResult : InlineComponentsSchemasAnthropicWebSearchResultBlockParamPropertiesType() {
    public override val `value`: String = "web_search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicWebSearchResultBlockParamPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicWebSearchResultBlockParamPropertiesType =
      when (value) {
      WebSearchResult.value -> WebSearchResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicWebSearchResultBlockParamPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicWebSearchResultBlockParamPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicWebSearchResultBlockParamPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicWebSearchResultBlockParamPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
