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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8/proper
 * ties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8/proper
 * ties/type
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66.Serializer::class)
public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_tool_result`.
   */
  public data object WebSearchToolResult : InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66() {
    public override val `value`: String = "web_search_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66 = when (value) {
      WebSearchToolResult.value -> WebSearchToolResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66) {
      encoder.encodeString(value.value)
    }
  }
}
