package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchResult/properties/type
 */
@Serializable(with = InlineAnthropicWebSearchResultTypeXd607578b.Serializer::class)
public sealed class InlineAnthropicWebSearchResultTypeXd607578b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_result`.
   */
  public data object WebSearchResult : InlineAnthropicWebSearchResultTypeXd607578b() {
    public override val `value`: String = "web_search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicWebSearchResultTypeXd607578b()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicWebSearchResultTypeXd607578b = when (value) {
      WebSearchResult.value -> WebSearchResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicWebSearchResultTypeXd607578b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicWebSearchResultTypeXd607578b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicWebSearchResultTypeXd607578b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicWebSearchResultTypeXd607578b) {
      encoder.encodeString(value.value)
    }
  }
}
