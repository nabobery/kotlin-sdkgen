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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecution20250825Caller/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecution20250825Caller/properties/type
 */
@Serializable(with = InlineAnthropicCodeExecution20250825CallerTypeX15c13a96.Serializer::class)
public sealed class InlineAnthropicCodeExecution20250825CallerTypeX15c13a96 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_20250825`.
   */
  public data object CodeExecution20250825 : InlineAnthropicCodeExecution20250825CallerTypeX15c13a96() {
    public override val `value`: String = "code_execution_20250825"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCodeExecution20250825CallerTypeX15c13a96()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCodeExecution20250825CallerTypeX15c13a96 = when (value) {
      CodeExecution20250825.value -> CodeExecution20250825
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCodeExecution20250825CallerTypeX15c13a96> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicCodeExecution20250825CallerTypeX15c13a96", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCodeExecution20250825CallerTypeX15c13a96 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCodeExecution20250825CallerTypeX15c13a96) {
      encoder.encodeString(value.value)
    }
  }
}
