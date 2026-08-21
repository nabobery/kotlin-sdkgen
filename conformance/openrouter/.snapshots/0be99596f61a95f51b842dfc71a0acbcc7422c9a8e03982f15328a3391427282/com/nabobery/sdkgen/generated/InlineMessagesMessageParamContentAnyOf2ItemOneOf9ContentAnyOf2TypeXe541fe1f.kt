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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8/proper
 * ties/content/anyOf/1/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8/proper
 * ties/content/anyOf/1/properties/type
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f.Serializer::class)
public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_tool_result_error`.
   */
  public data object WebSearchToolResultError : InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f() {
    public override val `value`: String = "web_search_tool_result_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f = when (value) {
      WebSearchToolResultError.value -> WebSearchToolResultError
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f) {
      encoder.encodeString(value.value)
    }
  }
}
