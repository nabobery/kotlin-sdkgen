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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/4/properties/type/anyOf/1
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670.Serializer::class)
public sealed class InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_preview`.
   */
  public data object WebSearchPreview : InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670() {
    public override val `value`: String = "web_search_preview"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670 = when (value) {
      WebSearchPreview.value -> WebSearchPreview
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670) {
      encoder.encodeString(value.value)
    }
  }
}
