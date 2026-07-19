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
 * sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailServerToolCall/properties/type.
 */
@Serializable(with = InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning.server_tool_call`.
   */
  public data object ReasoningServerToolCall : InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType() {
    public override val `value`: String = "reasoning.server_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType =
      when (value) {
      ReasoningServerToolCall.value -> ReasoningServerToolCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
