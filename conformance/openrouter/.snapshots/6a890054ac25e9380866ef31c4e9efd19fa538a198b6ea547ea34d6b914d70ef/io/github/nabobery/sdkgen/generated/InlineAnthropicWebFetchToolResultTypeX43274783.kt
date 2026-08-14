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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchToolResult/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchToolResult/properties/type
 */
@Serializable(with = InlineAnthropicWebFetchToolResultTypeX43274783.Serializer::class)
public sealed class InlineAnthropicWebFetchToolResultTypeX43274783 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_fetch_tool_result`.
   */
  public data object WebFetchToolResult : InlineAnthropicWebFetchToolResultTypeX43274783() {
    public override val `value`: String = "web_fetch_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicWebFetchToolResultTypeX43274783()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicWebFetchToolResultTypeX43274783 = when (value) {
      WebFetchToolResult.value -> WebFetchToolResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicWebFetchToolResultTypeX43274783> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicWebFetchToolResultTypeX43274783", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicWebFetchToolResultTypeX43274783 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicWebFetchToolResultTypeX43274783) {
      encoder.encodeString(value.value)
    }
  }
}
