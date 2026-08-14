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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicEncryptedCodeExecutionResult/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicEncryptedCodeExecutionResult/properties/type
 */
@Serializable(with = InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9.Serializer::class)
public sealed class InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `encrypted_code_execution_result`.
   */
  public data object EncryptedCodeExecutionResult : InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9() {
    public override val `value`: String = "encrypted_code_execution_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9 = when (value) {
      EncryptedCodeExecutionResult.value -> EncryptedCodeExecutionResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9) {
      encoder.encodeString(value.value)
    }
  }
}
