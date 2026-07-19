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
 */
@Serializable(with = InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType.Serializer::class)
public sealed class InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `first_frame`.
   */
  public data object FirstFrame : InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType() {
    public override val `value`: String = "first_frame"
  }

  /**
   * Documented value. Wire value: `last_frame`.
   */
  public data object LastFrame : InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType() {
    public override val `value`: String = "last_frame"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType = when (value) {
      FirstFrame.value -> FirstFrame
      LastFrame.value -> LastFrame
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType) {
      encoder.encodeString(value.value)
    }
  }
}
