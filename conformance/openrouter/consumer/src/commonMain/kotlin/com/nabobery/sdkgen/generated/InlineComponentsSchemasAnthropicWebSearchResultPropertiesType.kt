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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicWebSearchResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicWebSearchResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_result`.
   */
  public data object WebSearchResult : InlineComponentsSchemasAnthropicWebSearchResultPropertiesType() {
    public override val `value`: String = "web_search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicWebSearchResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicWebSearchResultPropertiesType =
      when (value) {
      WebSearchResult.value -> WebSearchResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicWebSearchResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicWebSearchResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicWebSearchResultPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicWebSearchResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
