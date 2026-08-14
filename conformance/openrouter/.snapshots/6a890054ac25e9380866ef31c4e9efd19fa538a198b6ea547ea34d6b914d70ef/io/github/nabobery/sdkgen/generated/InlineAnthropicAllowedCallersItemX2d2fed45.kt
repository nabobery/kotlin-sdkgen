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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicAllowedCallers/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicAllowedCallers/items
 */
@Serializable(with = InlineAnthropicAllowedCallersItemX2d2fed45.Serializer::class)
public sealed class InlineAnthropicAllowedCallersItemX2d2fed45 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineAnthropicAllowedCallersItemX2d2fed45() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `code_execution_20250825`.
   */
  public data object CodeExecution20250825 : InlineAnthropicAllowedCallersItemX2d2fed45() {
    public override val `value`: String = "code_execution_20250825"
  }

  /**
   * Documented value. Wire value: `code_execution_20260120`.
   */
  public data object CodeExecution20260120 : InlineAnthropicAllowedCallersItemX2d2fed45() {
    public override val `value`: String = "code_execution_20260120"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicAllowedCallersItemX2d2fed45()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicAllowedCallersItemX2d2fed45 = when (value) {
      Direct.value -> Direct
      CodeExecution20250825.value -> CodeExecution20250825
      CodeExecution20260120.value -> CodeExecution20260120
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicAllowedCallersItemX2d2fed45> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicAllowedCallersItemX2d2fed45", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicAllowedCallersItemX2d2fed45 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicAllowedCallersItemX2d2fed45) {
      encoder.encodeString(value.value)
    }
  }
}
