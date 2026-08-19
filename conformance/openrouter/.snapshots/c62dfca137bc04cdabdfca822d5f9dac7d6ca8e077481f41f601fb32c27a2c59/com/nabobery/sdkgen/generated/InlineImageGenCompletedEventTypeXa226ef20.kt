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
 * The event type
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenCompletedEvent/properties/type
 */
@Serializable(with = InlineImageGenCompletedEventTypeXa226ef20.Serializer::class)
public sealed class InlineImageGenCompletedEventTypeXa226ef20 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_generation.completed`.
   */
  public data object ImageGenerationCompleted : InlineImageGenCompletedEventTypeXa226ef20() {
    public override val `value`: String = "image_generation.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenCompletedEventTypeXa226ef20()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenCompletedEventTypeXa226ef20 = when (value) {
      ImageGenerationCompleted.value -> ImageGenerationCompleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenCompletedEventTypeXa226ef20> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImageGenCompletedEventTypeXa226ef20", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenCompletedEventTypeXa226ef20 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenCompletedEventTypeXa226ef20) {
      encoder.encodeString(value.value)
    }
  }
}
