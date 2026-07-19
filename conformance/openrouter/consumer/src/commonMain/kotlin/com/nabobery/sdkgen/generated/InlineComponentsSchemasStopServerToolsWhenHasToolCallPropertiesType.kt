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
 * sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenHasToolCall/properties/type.
 */
@Serializable(with = InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `has_tool_call`.
   */
  public data object HasToolCall : InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType() {
    public override val `value`: String = "has_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType =
      when (value) {
      HasToolCall.value -> HasToolCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
