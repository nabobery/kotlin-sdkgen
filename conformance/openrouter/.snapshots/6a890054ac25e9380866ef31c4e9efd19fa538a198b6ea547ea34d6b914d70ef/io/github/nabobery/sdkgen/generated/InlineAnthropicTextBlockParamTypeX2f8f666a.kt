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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextBlockParam/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextBlockParam/properties/type
 */
@Serializable(with = InlineAnthropicTextBlockParamTypeX2f8f666a.Serializer::class)
public sealed class InlineAnthropicTextBlockParamTypeX2f8f666a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineAnthropicTextBlockParamTypeX2f8f666a() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicTextBlockParamTypeX2f8f666a()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicTextBlockParamTypeX2f8f666a = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicTextBlockParamTypeX2f8f666a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicTextBlockParamTypeX2f8f666a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicTextBlockParamTypeX2f8f666a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicTextBlockParamTypeX2f8f666a) {
      encoder.encodeString(value.value)
    }
  }
}
