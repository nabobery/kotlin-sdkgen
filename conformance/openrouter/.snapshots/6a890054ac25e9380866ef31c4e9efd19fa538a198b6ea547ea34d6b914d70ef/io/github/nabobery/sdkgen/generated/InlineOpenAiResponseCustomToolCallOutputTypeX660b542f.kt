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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCallOutput/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCallOutput/properties/type
 */
@Serializable(with = InlineOpenAiResponseCustomToolCallOutputTypeX660b542f.Serializer::class)
public sealed class InlineOpenAiResponseCustomToolCallOutputTypeX660b542f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_tool_call_output`.
   */
  public data object CustomToolCallOutput : InlineOpenAiResponseCustomToolCallOutputTypeX660b542f() {
    public override val `value`: String = "custom_tool_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponseCustomToolCallOutputTypeX660b542f()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponseCustomToolCallOutputTypeX660b542f = when (value) {
      CustomToolCallOutput.value -> CustomToolCallOutput
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponseCustomToolCallOutputTypeX660b542f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponseCustomToolCallOutputTypeX660b542f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponseCustomToolCallOutputTypeX660b542f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponseCustomToolCallOutputTypeX660b542f) {
      encoder.encodeString(value.value)
    }
  }
}
