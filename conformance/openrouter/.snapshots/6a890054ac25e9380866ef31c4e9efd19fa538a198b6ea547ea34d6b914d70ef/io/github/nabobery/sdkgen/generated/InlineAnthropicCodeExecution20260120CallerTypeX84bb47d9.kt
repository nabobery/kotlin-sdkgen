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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecution20260120Caller/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecution20260120Caller/properties/type
 */
@Serializable(with = InlineAnthropicCodeExecution20260120CallerTypeX84bb47d9.Serializer::class)
public sealed class InlineAnthropicCodeExecution20260120CallerTypeX84bb47d9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_20260120`.
   */
  public data object CodeExecution20260120 : InlineAnthropicCodeExecution20260120CallerTypeX84bb47d9() {
    public override val `value`: String = "code_execution_20260120"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCodeExecution20260120CallerTypeX84bb47d9()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCodeExecution20260120CallerTypeX84bb47d9 = when (value) {
      CodeExecution20260120.value -> CodeExecution20260120
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCodeExecution20260120CallerTypeX84bb47d9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCodeExecution20260120CallerTypeX84bb47d9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCodeExecution20260120CallerTypeX84bb47d9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCodeExecution20260120CallerTypeX84bb47d9) {
      encoder.encodeString(value.value)
    }
  }
}
