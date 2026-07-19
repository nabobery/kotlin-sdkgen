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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0 = when (value) {
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0) {
      encoder.encodeString(value.value)
    }
  }
}
