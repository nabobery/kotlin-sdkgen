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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicUrlPdfSource/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicUrlPdfSource/properties/type
 */
@Serializable(with = InlineAnthropicUrlPdfSourceTypeX64c8b287.Serializer::class)
public sealed class InlineAnthropicUrlPdfSourceTypeX64c8b287 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineAnthropicUrlPdfSourceTypeX64c8b287() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicUrlPdfSourceTypeX64c8b287()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicUrlPdfSourceTypeX64c8b287 = when (value) {
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicUrlPdfSourceTypeX64c8b287> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicUrlPdfSourceTypeX64c8b287", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicUrlPdfSourceTypeX64c8b287 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicUrlPdfSourceTypeX64c8b287) {
      encoder.encodeString(value.value)
    }
  }
}
