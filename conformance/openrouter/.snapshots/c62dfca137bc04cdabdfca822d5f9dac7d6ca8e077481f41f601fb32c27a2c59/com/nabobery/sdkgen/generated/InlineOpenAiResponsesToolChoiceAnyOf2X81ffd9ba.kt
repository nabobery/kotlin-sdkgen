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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/1
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba.Serializer::class)
public sealed class InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba = when (value) {
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba) {
      encoder.encodeString(value.value)
    }
  }
}
