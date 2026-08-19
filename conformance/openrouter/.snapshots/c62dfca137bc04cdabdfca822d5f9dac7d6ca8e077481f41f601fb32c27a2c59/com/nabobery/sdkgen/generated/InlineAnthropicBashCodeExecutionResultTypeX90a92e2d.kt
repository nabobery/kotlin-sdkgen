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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionResult/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionResult/properties/type
 */
@Serializable(with = InlineAnthropicBashCodeExecutionResultTypeX90a92e2d.Serializer::class)
public sealed class InlineAnthropicBashCodeExecutionResultTypeX90a92e2d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bash_code_execution_result`.
   */
  public data object BashCodeExecutionResult : InlineAnthropicBashCodeExecutionResultTypeX90a92e2d() {
    public override val `value`: String = "bash_code_execution_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicBashCodeExecutionResultTypeX90a92e2d()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicBashCodeExecutionResultTypeX90a92e2d = when (value) {
      BashCodeExecutionResult.value -> BashCodeExecutionResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicBashCodeExecutionResultTypeX90a92e2d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicBashCodeExecutionResultTypeX90a92e2d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicBashCodeExecutionResultTypeX90a92e2d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicBashCodeExecutionResultTypeX90a92e2d) {
      encoder.encodeString(value.value)
    }
  }
}
