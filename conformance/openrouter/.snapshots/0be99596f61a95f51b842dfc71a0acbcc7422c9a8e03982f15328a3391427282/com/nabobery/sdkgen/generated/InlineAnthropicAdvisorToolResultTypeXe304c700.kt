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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicAdvisorToolResult/properties/type
 */
@Serializable(with = InlineAnthropicAdvisorToolResultTypeXe304c700.Serializer::class)
public sealed class InlineAnthropicAdvisorToolResultTypeXe304c700 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `advisor_tool_result`.
   */
  public data object AdvisorToolResult : InlineAnthropicAdvisorToolResultTypeXe304c700() {
    public override val `value`: String = "advisor_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicAdvisorToolResultTypeXe304c700()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicAdvisorToolResultTypeXe304c700 = when (value) {
      AdvisorToolResult.value -> AdvisorToolResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicAdvisorToolResultTypeXe304c700> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicAdvisorToolResultTypeXe304c700", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicAdvisorToolResultTypeXe304c700 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicAdvisorToolResultTypeXe304c700) {
      encoder.encodeString(value.value)
    }
  }
}
