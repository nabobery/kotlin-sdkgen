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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicUrlImageSource/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicUrlImageSource/properties/type
 */
@Serializable(with = InlineAnthropicUrlImageSourceTypeX75f6b6ca.Serializer::class)
public sealed class InlineAnthropicUrlImageSourceTypeX75f6b6ca {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineAnthropicUrlImageSourceTypeX75f6b6ca() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicUrlImageSourceTypeX75f6b6ca()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicUrlImageSourceTypeX75f6b6ca = when (value) {
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicUrlImageSourceTypeX75f6b6ca> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicUrlImageSourceTypeX75f6b6ca", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicUrlImageSourceTypeX75f6b6ca = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicUrlImageSourceTypeX75f6b6ca) {
      encoder.encodeString(value.value)
    }
  }
}
