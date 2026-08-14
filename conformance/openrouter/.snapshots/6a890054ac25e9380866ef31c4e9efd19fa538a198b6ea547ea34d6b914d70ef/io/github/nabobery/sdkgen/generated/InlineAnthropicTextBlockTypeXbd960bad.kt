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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextBlock/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextBlock/properties/type
 */
@Serializable(with = InlineAnthropicTextBlockTypeXbd960bad.Serializer::class)
public sealed class InlineAnthropicTextBlockTypeXbd960bad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineAnthropicTextBlockTypeXbd960bad() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicTextBlockTypeXbd960bad()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicTextBlockTypeXbd960bad = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicTextBlockTypeXbd960bad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicTextBlockTypeXbd960bad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicTextBlockTypeXbd960bad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicTextBlockTypeXbd960bad) {
      encoder.encodeString(value.value)
    }
  }
}
