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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionResult/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionResult/properties/type
 */
@Serializable(with = InlineAnthropicCodeExecutionResultTypeXe96d87da.Serializer::class)
public sealed class InlineAnthropicCodeExecutionResultTypeXe96d87da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_result`.
   */
  public data object CodeExecutionResult : InlineAnthropicCodeExecutionResultTypeXe96d87da() {
    public override val `value`: String = "code_execution_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCodeExecutionResultTypeXe96d87da()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCodeExecutionResultTypeXe96d87da = when (value) {
      CodeExecutionResult.value -> CodeExecutionResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCodeExecutionResultTypeXe96d87da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCodeExecutionResultTypeXe96d87da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCodeExecutionResultTypeXe96d87da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCodeExecutionResultTypeXe96d87da) {
      encoder.encodeString(value.value)
    }
  }
}
