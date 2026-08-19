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
 * sdkgen://source/openapi.yaml#/components/schemas/VideoModel/properties/supported_resolutions/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/VideoModel/properties/supported_resolutions/items
 */
@Serializable(with = InlineVideoModelSupportedResolutionsItemX1a7426b8.Serializer::class)
public sealed class InlineVideoModelSupportedResolutionsItemX1a7426b8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `480p`.
   */
  public data object _480p : InlineVideoModelSupportedResolutionsItemX1a7426b8() {
    public override val `value`: String = "480p"
  }

  /**
   * Documented value. Wire value: `720p`.
   */
  public data object _720p : InlineVideoModelSupportedResolutionsItemX1a7426b8() {
    public override val `value`: String = "720p"
  }

  /**
   * Documented value. Wire value: `1080p`.
   */
  public data object _1080p : InlineVideoModelSupportedResolutionsItemX1a7426b8() {
    public override val `value`: String = "1080p"
  }

  /**
   * Documented value. Wire value: `1K`.
   */
  public data object _1K : InlineVideoModelSupportedResolutionsItemX1a7426b8() {
    public override val `value`: String = "1K"
  }

  /**
   * Documented value. Wire value: `2K`.
   */
  public data object _2K : InlineVideoModelSupportedResolutionsItemX1a7426b8() {
    public override val `value`: String = "2K"
  }

  /**
   * Documented value. Wire value: `4K`.
   */
  public data object _4K : InlineVideoModelSupportedResolutionsItemX1a7426b8() {
    public override val `value`: String = "4K"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineVideoModelSupportedResolutionsItemX1a7426b8()

  public companion object {
    public fun fromValue(`value`: String): InlineVideoModelSupportedResolutionsItemX1a7426b8 = when (value) {
      _480p.value -> _480p
      _720p.value -> _720p
      _1080p.value -> _1080p
      _1K.value -> _1K
      _2K.value -> _2K
      _4K.value -> _4K
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineVideoModelSupportedResolutionsItemX1a7426b8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineVideoModelSupportedResolutionsItemX1a7426b8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineVideoModelSupportedResolutionsItemX1a7426b8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineVideoModelSupportedResolutionsItemX1a7426b8) {
      encoder.encodeString(value.value)
    }
  }
}
