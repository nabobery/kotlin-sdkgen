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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionOutput/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionOutput/properties/type
 */
@Serializable(with = InlineAnthropicCodeExecutionOutputTypeX0c18375e.Serializer::class)
public sealed class InlineAnthropicCodeExecutionOutputTypeX0c18375e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_output`.
   */
  public data object CodeExecutionOutput : InlineAnthropicCodeExecutionOutputTypeX0c18375e() {
    public override val `value`: String = "code_execution_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCodeExecutionOutputTypeX0c18375e()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCodeExecutionOutputTypeX0c18375e = when (value) {
      CodeExecutionOutput.value -> CodeExecutionOutput
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCodeExecutionOutputTypeX0c18375e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCodeExecutionOutputTypeX0c18375e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCodeExecutionOutputTypeX0c18375e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCodeExecutionOutputTypeX0c18375e) {
      encoder.encodeString(value.value)
    }
  }
}
