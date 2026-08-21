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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/4/properties/type/anyOf/0
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce.Serializer::class)
public sealed class InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_preview_2025_03_11`.
   */
  public data object WebSearchPreview20250311 : InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce() {
    public override val `value`: String = "web_search_preview_2025_03_11"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce = when (value) {
      WebSearchPreview20250311.value -> WebSearchPreview20250311
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce) {
      encoder.encodeString(value.value)
    }
  }
}
