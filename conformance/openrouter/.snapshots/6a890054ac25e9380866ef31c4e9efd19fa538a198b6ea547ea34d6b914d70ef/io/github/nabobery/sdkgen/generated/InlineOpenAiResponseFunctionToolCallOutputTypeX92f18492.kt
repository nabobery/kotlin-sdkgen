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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseFunctionToolCallOutput/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseFunctionToolCallOutput/properties/type
 */
@Serializable(with = InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492.Serializer::class)
public sealed class InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function_call_output`.
   */
  public data object FunctionCallOutput : InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492() {
    public override val `value`: String = "function_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492 = when (value) {
      FunctionCallOutput.value -> FunctionCallOutput
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492) {
      encoder.encodeString(value.value)
    }
  }
}
