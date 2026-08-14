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
 * The event type
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenPartialImageEvent/properties/type
 */
@Serializable(with = InlineImageGenPartialImageEventTypeX4f84ef7b.Serializer::class)
public sealed class InlineImageGenPartialImageEventTypeX4f84ef7b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_generation.partial_image`.
   */
  public data object ImageGenerationPartialImage : InlineImageGenPartialImageEventTypeX4f84ef7b() {
    public override val `value`: String = "image_generation.partial_image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenPartialImageEventTypeX4f84ef7b()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenPartialImageEventTypeX4f84ef7b = when (value) {
      ImageGenerationPartialImage.value -> ImageGenerationPartialImage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenPartialImageEventTypeX4f84ef7b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineImageGenPartialImageEventTypeX4f84ef7b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenPartialImageEventTypeX4f84ef7b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenPartialImageEventTypeX4f84ef7b) {
      encoder.encodeString(value.value)
    }
  }
}
