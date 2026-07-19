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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicAllowedCallers/items.
 */
@Serializable(with = InlineComponentsSchemasAnthropicAllowedCallersItems.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicAllowedCallersItems {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineComponentsSchemasAnthropicAllowedCallersItems() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `code_execution_20250825`.
   */
  public data object CodeExecution20250825 : InlineComponentsSchemasAnthropicAllowedCallersItems() {
    public override val `value`: String = "code_execution_20250825"
  }

  /**
   * Documented value. Wire value: `code_execution_20260120`.
   */
  public data object CodeExecution20260120 : InlineComponentsSchemasAnthropicAllowedCallersItems() {
    public override val `value`: String = "code_execution_20260120"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicAllowedCallersItems()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicAllowedCallersItems = when (value) {
      Direct.value -> Direct
      CodeExecution20250825.value -> CodeExecution20250825
      CodeExecution20260120.value -> CodeExecution20260120
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicAllowedCallersItems> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicAllowedCallersItems",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicAllowedCallersItems = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicAllowedCallersItems) {
      encoder.encodeString(value.value)
    }
  }
}
