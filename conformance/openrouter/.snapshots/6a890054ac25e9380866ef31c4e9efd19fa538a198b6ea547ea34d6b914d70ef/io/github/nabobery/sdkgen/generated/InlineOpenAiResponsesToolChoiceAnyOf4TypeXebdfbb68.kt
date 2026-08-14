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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/3/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/3/properties/type
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68.Serializer::class)
public sealed class InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function`.
   */
  public data object Function : InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68() {
    public override val `value`: String = "function"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68 = when (value) {
      Function.value -> Function
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68) {
      encoder.encodeString(value.value)
    }
  }
}
