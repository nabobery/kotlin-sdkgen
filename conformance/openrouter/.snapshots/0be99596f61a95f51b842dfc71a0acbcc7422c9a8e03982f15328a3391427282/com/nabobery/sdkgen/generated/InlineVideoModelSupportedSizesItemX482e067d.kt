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
 * sdkgen://source/openapi.yaml#/components/schemas/VideoModel/properties/supported_sizes/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/VideoModel/properties/supported_sizes/items
 */
@Serializable(with = InlineVideoModelSupportedSizesItemX482e067d.Serializer::class)
public sealed class InlineVideoModelSupportedSizesItemX482e067d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `480x480`.
   */
  public data object _480x480 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "480x480"
  }

  /**
   * Documented value. Wire value: `480x640`.
   */
  public data object _480x640 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "480x640"
  }

  /**
   * Documented value. Wire value: `480x720`.
   */
  public data object _480x720 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "480x720"
  }

  /**
   * Documented value. Wire value: `480x854`.
   */
  public data object _480x854 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "480x854"
  }

  /**
   * Documented value. Wire value: `480x1120`.
   */
  public data object _480x1120 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "480x1120"
  }

  /**
   * Documented value. Wire value: `640x480`.
   */
  public data object _640x480 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "640x480"
  }

  /**
   * Documented value. Wire value: `720x480`.
   */
  public data object _720x480 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "720x480"
  }

  /**
   * Documented value. Wire value: `720x720`.
   */
  public data object _720x720 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "720x720"
  }

  /**
   * Documented value. Wire value: `720x960`.
   */
  public data object _720x960 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "720x960"
  }

  /**
   * Documented value. Wire value: `720x1080`.
   */
  public data object _720x1080 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "720x1080"
  }

  /**
   * Documented value. Wire value: `720x1280`.
   */
  public data object _720x1280 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "720x1280"
  }

  /**
   * Documented value. Wire value: `720x1680`.
   */
  public data object _720x1680 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "720x1680"
  }

  /**
   * Documented value. Wire value: `854x480`.
   */
  public data object _854x480 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "854x480"
  }

  /**
   * Documented value. Wire value: `960x720`.
   */
  public data object _960x720 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "960x720"
  }

  /**
   * Documented value. Wire value: `1080x720`.
   */
  public data object _1080x720 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1080x720"
  }

  /**
   * Documented value. Wire value: `1080x1080`.
   */
  public data object _1080x1080 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1080x1080"
  }

  /**
   * Documented value. Wire value: `1080x1440`.
   */
  public data object _1080x1440 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1080x1440"
  }

  /**
   * Documented value. Wire value: `1080x1620`.
   */
  public data object _1080x1620 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1080x1620"
  }

  /**
   * Documented value. Wire value: `1080x1920`.
   */
  public data object _1080x1920 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1080x1920"
  }

  /**
   * Documented value. Wire value: `1080x2520`.
   */
  public data object _1080x2520 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1080x2520"
  }

  /**
   * Documented value. Wire value: `1120x480`.
   */
  public data object _1120x480 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1120x480"
  }

  /**
   * Documented value. Wire value: `1280x720`.
   */
  public data object _1280x720 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1280x720"
  }

  /**
   * Documented value. Wire value: `1440x1080`.
   */
  public data object _1440x1080 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1440x1080"
  }

  /**
   * Documented value. Wire value: `1620x1080`.
   */
  public data object _1620x1080 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1620x1080"
  }

  /**
   * Documented value. Wire value: `1680x720`.
   */
  public data object _1680x720 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1680x720"
  }

  /**
   * Documented value. Wire value: `1920x1080`.
   */
  public data object _1920x1080 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "1920x1080"
  }

  /**
   * Documented value. Wire value: `2160x2160`.
   */
  public data object _2160x2160 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "2160x2160"
  }

  /**
   * Documented value. Wire value: `2160x2880`.
   */
  public data object _2160x2880 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "2160x2880"
  }

  /**
   * Documented value. Wire value: `2160x3240`.
   */
  public data object _2160x3240 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "2160x3240"
  }

  /**
   * Documented value. Wire value: `2160x3840`.
   */
  public data object _2160x3840 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "2160x3840"
  }

  /**
   * Documented value. Wire value: `2160x5040`.
   */
  public data object _2160x5040 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "2160x5040"
  }

  /**
   * Documented value. Wire value: `2520x1080`.
   */
  public data object _2520x1080 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "2520x1080"
  }

  /**
   * Documented value. Wire value: `2880x2160`.
   */
  public data object _2880x2160 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "2880x2160"
  }

  /**
   * Documented value. Wire value: `3240x2160`.
   */
  public data object _3240x2160 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "3240x2160"
  }

  /**
   * Documented value. Wire value: `3840x2160`.
   */
  public data object _3840x2160 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "3840x2160"
  }

  /**
   * Documented value. Wire value: `5040x2160`.
   */
  public data object _5040x2160 : InlineVideoModelSupportedSizesItemX482e067d() {
    public override val `value`: String = "5040x2160"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineVideoModelSupportedSizesItemX482e067d()

  public companion object {
    public fun fromValue(`value`: String): InlineVideoModelSupportedSizesItemX482e067d = when (value) {
      _480x480.value -> _480x480
      _480x640.value -> _480x640
      _480x720.value -> _480x720
      _480x854.value -> _480x854
      _480x1120.value -> _480x1120
      _640x480.value -> _640x480
      _720x480.value -> _720x480
      _720x720.value -> _720x720
      _720x960.value -> _720x960
      _720x1080.value -> _720x1080
      _720x1280.value -> _720x1280
      _720x1680.value -> _720x1680
      _854x480.value -> _854x480
      _960x720.value -> _960x720
      _1080x720.value -> _1080x720
      _1080x1080.value -> _1080x1080
      _1080x1440.value -> _1080x1440
      _1080x1620.value -> _1080x1620
      _1080x1920.value -> _1080x1920
      _1080x2520.value -> _1080x2520
      _1120x480.value -> _1120x480
      _1280x720.value -> _1280x720
      _1440x1080.value -> _1440x1080
      _1620x1080.value -> _1620x1080
      _1680x720.value -> _1680x720
      _1920x1080.value -> _1920x1080
      _2160x2160.value -> _2160x2160
      _2160x2880.value -> _2160x2880
      _2160x3240.value -> _2160x3240
      _2160x3840.value -> _2160x3840
      _2160x5040.value -> _2160x5040
      _2520x1080.value -> _2520x1080
      _2880x2160.value -> _2880x2160
      _3240x2160.value -> _3240x2160
      _3840x2160.value -> _3840x2160
      _5040x2160.value -> _5040x2160
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineVideoModelSupportedSizesItemX482e067d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineVideoModelSupportedSizesItemX482e067d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineVideoModelSupportedSizesItemX482e067d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineVideoModelSupportedSizesItemX482e067d) {
      encoder.encodeString(value.value)
    }
  }
}
