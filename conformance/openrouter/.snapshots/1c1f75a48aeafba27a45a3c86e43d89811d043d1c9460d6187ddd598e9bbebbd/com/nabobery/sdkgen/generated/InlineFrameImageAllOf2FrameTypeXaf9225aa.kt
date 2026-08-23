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
 * Whether this image represents the first or last frame of the video
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FrameImage/allOf/1/properties/frame_type
 */
@Serializable(with = InlineFrameImageAllOf2FrameTypeXaf9225aa.Serializer::class)
public sealed class InlineFrameImageAllOf2FrameTypeXaf9225aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `first_frame`.
   */
  public data object FirstFrame : InlineFrameImageAllOf2FrameTypeXaf9225aa() {
    public override val `value`: String = "first_frame"
  }

  /**
   * Documented value. Wire value: `last_frame`.
   */
  public data object LastFrame : InlineFrameImageAllOf2FrameTypeXaf9225aa() {
    public override val `value`: String = "last_frame"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFrameImageAllOf2FrameTypeXaf9225aa()

  public companion object {
    public fun fromValue(`value`: String): InlineFrameImageAllOf2FrameTypeXaf9225aa = when (value) {
      FirstFrame.value -> FirstFrame
      LastFrame.value -> LastFrame
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFrameImageAllOf2FrameTypeXaf9225aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFrameImageAllOf2FrameTypeXaf9225aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFrameImageAllOf2FrameTypeXaf9225aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFrameImageAllOf2FrameTypeXaf9225aa) {
      encoder.encodeString(value.value)
    }
  }
}
