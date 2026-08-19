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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionOutput/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionOutput/properties/type
 */
@Serializable(with = InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a.Serializer::class)
public sealed class InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bash_code_execution_output`.
   */
  public data object BashCodeExecutionOutput : InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a() {
    public override val `value`: String = "bash_code_execution_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a = when (value) {
      BashCodeExecutionOutput.value -> BashCodeExecutionOutput
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a) {
      encoder.encodeString(value.value)
    }
  }
}
