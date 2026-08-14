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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationSearchResultLocationParam/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationSearchResultLocationParam/properties/type
 */
@Serializable(with = InlineAnthropicCitationSearchResultLocationParamTypeXb2cddcf4.Serializer::class)
public sealed class InlineAnthropicCitationSearchResultLocationParamTypeXb2cddcf4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search_result_location`.
   */
  public data object SearchResultLocation : InlineAnthropicCitationSearchResultLocationParamTypeXb2cddcf4() {
    public override val `value`: String = "search_result_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCitationSearchResultLocationParamTypeXb2cddcf4()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCitationSearchResultLocationParamTypeXb2cddcf4 = when (value) {
      SearchResultLocation.value -> SearchResultLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCitationSearchResultLocationParamTypeXb2cddcf4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCitationSearchResultLocationParamTypeXb2cddcf4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCitationSearchResultLocationParamTypeXb2cddcf4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCitationSearchResultLocationParamTypeXb2cddcf4) {
      encoder.encodeString(value.value)
    }
  }
}
