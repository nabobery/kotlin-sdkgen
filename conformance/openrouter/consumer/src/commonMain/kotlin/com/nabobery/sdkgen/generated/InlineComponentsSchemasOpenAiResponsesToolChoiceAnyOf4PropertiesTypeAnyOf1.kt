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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/4/properties/type/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_preview`.
   */
  public data object WebSearchPreview : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1() {
    public override val `value`: String = "web_search_preview"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1 =
      when (value) {
      WebSearchPreview.value -> WebSearchPreview
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
