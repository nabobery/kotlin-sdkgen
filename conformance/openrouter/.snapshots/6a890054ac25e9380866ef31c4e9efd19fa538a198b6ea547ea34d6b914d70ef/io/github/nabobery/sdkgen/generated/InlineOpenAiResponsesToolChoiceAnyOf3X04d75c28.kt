package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/2
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28.Serializer::class)
public sealed class InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28 = when (value) {
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28) {
      encoder.encodeString(value.value)
    }
  }
}
