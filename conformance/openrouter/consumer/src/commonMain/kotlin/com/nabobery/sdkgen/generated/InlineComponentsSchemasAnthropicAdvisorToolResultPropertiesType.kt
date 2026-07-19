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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicAdvisorToolResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicAdvisorToolResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicAdvisorToolResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `advisor_tool_result`.
   */
  public data object AdvisorToolResult : InlineComponentsSchemasAnthropicAdvisorToolResultPropertiesType() {
    public override val `value`: String = "advisor_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicAdvisorToolResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicAdvisorToolResultPropertiesType =
      when (value) {
      AdvisorToolResult.value -> AdvisorToolResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicAdvisorToolResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicAdvisorToolResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicAdvisorToolResultPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicAdvisorToolResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
