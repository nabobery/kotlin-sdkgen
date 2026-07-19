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
 */
@Serializable(with = InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems.Serializer::class)
public sealed class InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `first_frame`.
   */
  public data object FirstFrame : InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems() {
    public override val `value`: String = "first_frame"
  }

  /**
   * Documented value. Wire value: `last_frame`.
   */
  public data object LastFrame : InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems() {
    public override val `value`: String = "last_frame"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems =
      when (value) {
      FirstFrame.value -> FirstFrame
      LastFrame.value -> LastFrame
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems) {
      encoder.encodeString(value.value)
    }
  }
}
