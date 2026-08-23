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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationSearchResultLocation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationSearchResultLocation/properties/type
 */
@Serializable(with = InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9.Serializer::class)
public sealed class InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search_result_location`.
   */
  public data object SearchResultLocation : InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9() {
    public override val `value`: String = "search_result_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9 = when (value) {
      SearchResultLocation.value -> SearchResultLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9) {
      encoder.encodeString(value.value)
    }
  }
}
