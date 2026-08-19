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
 * Normalized aspect ratio of the generated image. Providers clamp to their supported subset.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationRequest/properties/aspect_ratio
 */
@Serializable(with = InlineImageGenerationRequestAspectRatioX7a47f180.Serializer::class)
public sealed class InlineImageGenerationRequestAspectRatioX7a47f180 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `1:1`.
   */
  public data object _11 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "1:1"
  }

  /**
   * Documented value. Wire value: `1:2`.
   */
  public data object _12 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "1:2"
  }

  /**
   * Documented value. Wire value: `1:4`.
   */
  public data object _14 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "1:4"
  }

  /**
   * Documented value. Wire value: `1:8`.
   */
  public data object _18 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "1:8"
  }

  /**
   * Documented value. Wire value: `2:1`.
   */
  public data object _21 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "2:1"
  }

  /**
   * Documented value. Wire value: `2:3`.
   */
  public data object _23 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "2:3"
  }

  /**
   * Documented value. Wire value: `3:2`.
   */
  public data object _32 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "3:2"
  }

  /**
   * Documented value. Wire value: `3:4`.
   */
  public data object _34 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "3:4"
  }

  /**
   * Documented value. Wire value: `4:1`.
   */
  public data object _41 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "4:1"
  }

  /**
   * Documented value. Wire value: `4:3`.
   */
  public data object _43 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "4:3"
  }

  /**
   * Documented value. Wire value: `4:5`.
   */
  public data object _45 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "4:5"
  }

  /**
   * Documented value. Wire value: `5:4`.
   */
  public data object _54 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "5:4"
  }

  /**
   * Documented value. Wire value: `8:1`.
   */
  public data object _81 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "8:1"
  }

  /**
   * Documented value. Wire value: `9:16`.
   */
  public data object _916 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "9:16"
  }

  /**
   * Documented value. Wire value: `16:9`.
   */
  public data object _169 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "16:9"
  }

  /**
   * Documented value. Wire value: `9:19.5`.
   */
  public data object _9195 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "9:19.5"
  }

  /**
   * Documented value. Wire value: `19.5:9`.
   */
  public data object _1959 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "19.5:9"
  }

  /**
   * Documented value. Wire value: `9:20`.
   */
  public data object _920 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "9:20"
  }

  /**
   * Documented value. Wire value: `20:9`.
   */
  public data object _209 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "20:9"
  }

  /**
   * Documented value. Wire value: `9:21`.
   */
  public data object _921 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "9:21"
  }

  /**
   * Documented value. Wire value: `21:9`.
   */
  public data object _219 : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "21:9"
  }

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineImageGenerationRequestAspectRatioX7a47f180() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenerationRequestAspectRatioX7a47f180()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenerationRequestAspectRatioX7a47f180 = when (value) {
      _11.value -> _11
      _12.value -> _12
      _14.value -> _14
      _18.value -> _18
      _21.value -> _21
      _23.value -> _23
      _32.value -> _32
      _34.value -> _34
      _41.value -> _41
      _43.value -> _43
      _45.value -> _45
      _54.value -> _54
      _81.value -> _81
      _916.value -> _916
      _169.value -> _169
      _9195.value -> _9195
      _1959.value -> _1959
      _920.value -> _920
      _209.value -> _209
      _921.value -> _921
      _219.value -> _219
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationRequestAspectRatioX7a47f180> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImageGenerationRequestAspectRatioX7a47f180", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenerationRequestAspectRatioX7a47f180 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationRequestAspectRatioX7a47f180) {
      encoder.encodeString(value.value)
    }
  }
}
