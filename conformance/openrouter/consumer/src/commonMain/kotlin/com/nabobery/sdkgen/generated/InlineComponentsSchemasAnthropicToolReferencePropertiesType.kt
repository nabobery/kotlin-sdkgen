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
 */
@Serializable(with = InlineComponentsSchemasAnthropicToolReferencePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicToolReferencePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_reference`.
   */
  public data object ToolReference : InlineComponentsSchemasAnthropicToolReferencePropertiesType() {
    public override val `value`: String = "tool_reference"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicToolReferencePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicToolReferencePropertiesType = when (value) {
      ToolReference.value -> ToolReference
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicToolReferencePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicToolReferencePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicToolReferencePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicToolReferencePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
