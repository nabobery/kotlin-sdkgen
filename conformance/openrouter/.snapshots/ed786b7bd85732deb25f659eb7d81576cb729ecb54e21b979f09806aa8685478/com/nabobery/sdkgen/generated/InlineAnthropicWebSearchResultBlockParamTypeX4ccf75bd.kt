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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchResultBlockParam/properties/type
 */
@Serializable(with = InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd.Serializer::class)
public sealed class InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_result`.
   */
  public data object WebSearchResult : InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd() {
    public override val `value`: String = "web_search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd = when (value) {
      WebSearchResult.value -> WebSearchResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd) {
      encoder.encodeString(value.value)
    }
  }
}
