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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/3/proper
 * ties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/3/proper
 * ties/type
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8.Serializer::class)
public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_use`.
   */
  public data object ToolUse : InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8() {
    public override val `value`: String = "tool_use"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8 = when (value) {
      ToolUse.value -> ToolUse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8) {
      encoder.encodeString(value.value)
    }
  }
}
