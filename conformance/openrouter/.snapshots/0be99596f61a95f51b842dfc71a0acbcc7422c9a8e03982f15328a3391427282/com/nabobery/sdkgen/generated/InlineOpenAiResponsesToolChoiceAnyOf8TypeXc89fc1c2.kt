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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/7/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/7/properties/type
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2.Serializer::class)
public sealed class InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell`.
   */
  public data object Shell : InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2() {
    public override val `value`: String = "shell"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2 = when (value) {
      Shell.value -> Shell
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2) {
      encoder.encodeString(value.value)
    }
  }
}
