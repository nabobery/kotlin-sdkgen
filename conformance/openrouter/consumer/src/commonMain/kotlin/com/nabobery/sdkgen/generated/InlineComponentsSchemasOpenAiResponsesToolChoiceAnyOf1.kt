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
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1 = when (value) {
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
