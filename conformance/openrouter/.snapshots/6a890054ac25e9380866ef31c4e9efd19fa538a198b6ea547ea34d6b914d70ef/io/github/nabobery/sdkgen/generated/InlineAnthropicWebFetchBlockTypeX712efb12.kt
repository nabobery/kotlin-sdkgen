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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchBlock/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchBlock/properties/type
 */
@Serializable(with = InlineAnthropicWebFetchBlockTypeX712efb12.Serializer::class)
public sealed class InlineAnthropicWebFetchBlockTypeX712efb12 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_fetch_result`.
   */
  public data object WebFetchResult : InlineAnthropicWebFetchBlockTypeX712efb12() {
    public override val `value`: String = "web_fetch_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicWebFetchBlockTypeX712efb12()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicWebFetchBlockTypeX712efb12 = when (value) {
      WebFetchResult.value -> WebFetchResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicWebFetchBlockTypeX712efb12> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicWebFetchBlockTypeX712efb12", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicWebFetchBlockTypeX712efb12 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicWebFetchBlockTypeX712efb12) {
      encoder.encodeString(value.value)
    }
  }
}
