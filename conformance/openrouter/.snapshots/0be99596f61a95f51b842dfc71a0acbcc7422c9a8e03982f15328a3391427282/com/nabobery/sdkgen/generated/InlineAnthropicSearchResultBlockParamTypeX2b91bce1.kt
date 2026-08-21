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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicSearchResultBlockParam/properties/type
 */
@Serializable(with = InlineAnthropicSearchResultBlockParamTypeX2b91bce1.Serializer::class)
public sealed class InlineAnthropicSearchResultBlockParamTypeX2b91bce1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search_result`.
   */
  public data object SearchResult : InlineAnthropicSearchResultBlockParamTypeX2b91bce1() {
    public override val `value`: String = "search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicSearchResultBlockParamTypeX2b91bce1()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicSearchResultBlockParamTypeX2b91bce1 = when (value) {
      SearchResult.value -> SearchResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicSearchResultBlockParamTypeX2b91bce1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicSearchResultBlockParamTypeX2b91bce1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicSearchResultBlockParamTypeX2b91bce1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicSearchResultBlockParamTypeX2b91bce1) {
      encoder.encodeString(value.value)
    }
  }
}
