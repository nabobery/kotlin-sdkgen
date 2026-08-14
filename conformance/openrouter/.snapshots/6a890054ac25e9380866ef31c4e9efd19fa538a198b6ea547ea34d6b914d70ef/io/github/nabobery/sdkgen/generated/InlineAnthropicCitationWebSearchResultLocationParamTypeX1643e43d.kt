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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationWebSearchResultLocationParam/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationWebSearchResultLocationParam/properties/type
 */
@Serializable(with = InlineAnthropicCitationWebSearchResultLocationParamTypeX1643e43d.Serializer::class)
public sealed class InlineAnthropicCitationWebSearchResultLocationParamTypeX1643e43d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_result_location`.
   */
  public data object WebSearchResultLocation : InlineAnthropicCitationWebSearchResultLocationParamTypeX1643e43d() {
    public override val `value`: String = "web_search_result_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCitationWebSearchResultLocationParamTypeX1643e43d()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCitationWebSearchResultLocationParamTypeX1643e43d = when (value) {
      WebSearchResultLocation.value -> WebSearchResultLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCitationWebSearchResultLocationParamTypeX1643e43d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCitationWebSearchResultLocationParamTypeX1643e43d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCitationWebSearchResultLocationParamTypeX1643e43d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCitationWebSearchResultLocationParamTypeX1643e43d) {
      encoder.encodeString(value.value)
    }
  }
}
