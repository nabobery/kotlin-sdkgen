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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicSearchResultBlockParam/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search_result`.
   */
  public data object SearchResult : InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType() {
    public override val `value`: String = "search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType =
      when (value) {
      SearchResult.value -> SearchResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
