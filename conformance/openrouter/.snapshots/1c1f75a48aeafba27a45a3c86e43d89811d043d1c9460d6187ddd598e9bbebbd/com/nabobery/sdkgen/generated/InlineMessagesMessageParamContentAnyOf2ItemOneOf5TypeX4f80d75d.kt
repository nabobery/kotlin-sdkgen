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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/type
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d.Serializer::class)
public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_result`.
   */
  public data object ToolResult : InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d() {
    public override val `value`: String = "tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d = when (value) {
      ToolResult.value -> ToolResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d) {
      encoder.encodeString(value.value)
    }
  }
}
