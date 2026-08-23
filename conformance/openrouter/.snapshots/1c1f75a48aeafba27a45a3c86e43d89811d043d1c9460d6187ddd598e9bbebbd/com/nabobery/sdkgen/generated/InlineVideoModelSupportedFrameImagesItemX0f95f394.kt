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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/VideoModel/properties/supported_frame_images/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/VideoModel/properties/supported_frame_images/items
 */
@Serializable(with = InlineVideoModelSupportedFrameImagesItemX0f95f394.Serializer::class)
public sealed class InlineVideoModelSupportedFrameImagesItemX0f95f394 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `first_frame`.
   */
  public data object FirstFrame : InlineVideoModelSupportedFrameImagesItemX0f95f394() {
    public override val `value`: String = "first_frame"
  }

  /**
   * Documented value. Wire value: `last_frame`.
   */
  public data object LastFrame : InlineVideoModelSupportedFrameImagesItemX0f95f394() {
    public override val `value`: String = "last_frame"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineVideoModelSupportedFrameImagesItemX0f95f394()

  public companion object {
    public fun fromValue(`value`: String): InlineVideoModelSupportedFrameImagesItemX0f95f394 = when (value) {
      FirstFrame.value -> FirstFrame
      LastFrame.value -> LastFrame
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineVideoModelSupportedFrameImagesItemX0f95f394> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineVideoModelSupportedFrameImagesItemX0f95f394", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineVideoModelSupportedFrameImagesItemX0f95f394 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineVideoModelSupportedFrameImagesItemX0f95f394) {
      encoder.encodeString(value.value)
    }
  }
}
