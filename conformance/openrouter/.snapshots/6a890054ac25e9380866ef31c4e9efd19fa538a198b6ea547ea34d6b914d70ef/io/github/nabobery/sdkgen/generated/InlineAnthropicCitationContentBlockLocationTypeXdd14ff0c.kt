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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationContentBlockLocation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationContentBlockLocation/properties/type
 */
@Serializable(with = InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c.Serializer::class)
public sealed class InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content_block_location`.
   */
  public data object ContentBlockLocation : InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c() {
    public override val `value`: String = "content_block_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c = when (value) {
      ContentBlockLocation.value -> ContentBlockLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c) {
      encoder.encodeString(value.value)
    }
  }
}
