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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationSearchResultLocationParam/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search_result_location`.
   */
  public data object SearchResultLocation : InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType() {
    public override val `value`: String = "search_result_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType = when (value) {
      SearchResultLocation.value -> SearchResultLocation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
