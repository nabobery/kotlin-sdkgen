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
 */
@Serializable(with = InlineComponentsSchemasImageGenCompletedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasImageGenCompletedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_generation.completed`.
   */
  public data object ImageGenerationCompleted : InlineComponentsSchemasImageGenCompletedEventPropertiesType() {
    public override val `value`: String = "image_generation.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenCompletedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenCompletedEventPropertiesType = when (value) {
      ImageGenerationCompleted.value -> ImageGenerationCompleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenCompletedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenCompletedEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenCompletedEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasImageGenCompletedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
