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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationWebSearchResultLocation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationWebSearchResultLocation/properties/type
 */
@Serializable(with = InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2.Serializer::class)
public sealed class InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_result_location`.
   */
  public data object WebSearchResultLocation : InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2() {
    public override val `value`: String = "web_search_result_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2 = when (value) {
      WebSearchResultLocation.value -> WebSearchResultLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2) {
      encoder.encodeString(value.value)
    }
  }
}
