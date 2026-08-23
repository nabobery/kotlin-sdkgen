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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolReference/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolReference/properties/type
 */
@Serializable(with = InlineAnthropicToolReferenceTypeXfdc1dc52.Serializer::class)
public sealed class InlineAnthropicToolReferenceTypeXfdc1dc52 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_reference`.
   */
  public data object ToolReference : InlineAnthropicToolReferenceTypeXfdc1dc52() {
    public override val `value`: String = "tool_reference"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicToolReferenceTypeXfdc1dc52()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicToolReferenceTypeXfdc1dc52 = when (value) {
      ToolReference.value -> ToolReference
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicToolReferenceTypeXfdc1dc52> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicToolReferenceTypeXfdc1dc52", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicToolReferenceTypeXfdc1dc52 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicToolReferenceTypeXfdc1dc52) {
      encoder.encodeString(value.value)
    }
  }
}
