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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/4/properties/type/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_preview_2025_03_11`.
   */
  public data object WebSearchPreview20250311 : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0() {
    public override val `value`: String = "web_search_preview_2025_03_11"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0 =
      when (value) {
      WebSearchPreview20250311.value -> WebSearchPreview20250311
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0) {
      encoder.encodeString(value.value)
    }
  }
}
