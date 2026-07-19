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
 */
@Serializable(with = InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search_result_location`.
   */
  public data object SearchResultLocation : InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType() {
    public override val `value`: String = "search_result_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType =
      when (value) {
      SearchResultLocation.value -> SearchResultLocation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
