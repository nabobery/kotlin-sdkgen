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
 */
@Serializable(with = InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio.Serializer::class)
public sealed class InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `1:1`.
   */
  public data object _11 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "1:1"
  }

  /**
   * Documented value. Wire value: `1:2`.
   */
  public data object _12 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "1:2"
  }

  /**
   * Documented value. Wire value: `1:4`.
   */
  public data object _14 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "1:4"
  }

  /**
   * Documented value. Wire value: `1:8`.
   */
  public data object _18 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "1:8"
  }

  /**
   * Documented value. Wire value: `2:1`.
   */
  public data object _21 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "2:1"
  }

  /**
   * Documented value. Wire value: `2:3`.
   */
  public data object _23 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "2:3"
  }

  /**
   * Documented value. Wire value: `3:2`.
   */
  public data object _32 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "3:2"
  }

  /**
   * Documented value. Wire value: `3:4`.
   */
  public data object _34 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "3:4"
  }

  /**
   * Documented value. Wire value: `4:1`.
   */
  public data object _41 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "4:1"
  }

  /**
   * Documented value. Wire value: `4:3`.
   */
  public data object _43 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "4:3"
  }

  /**
   * Documented value. Wire value: `4:5`.
   */
  public data object _45 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "4:5"
  }

  /**
   * Documented value. Wire value: `5:4`.
   */
  public data object _54 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "5:4"
  }

  /**
   * Documented value. Wire value: `8:1`.
   */
  public data object _81 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "8:1"
  }

  /**
   * Documented value. Wire value: `9:16`.
   */
  public data object _916 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "9:16"
  }

  /**
   * Documented value. Wire value: `16:9`.
   */
  public data object _169 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "16:9"
  }

  /**
   * Documented value. Wire value: `9:19.5`.
   */
  public data object _9195 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "9:19.5"
  }

  /**
   * Documented value. Wire value: `19.5:9`.
   */
  public data object _1959 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "19.5:9"
  }

  /**
   * Documented value. Wire value: `9:20`.
   */
  public data object _920 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "9:20"
  }

  /**
   * Documented value. Wire value: `20:9`.
   */
  public data object _209 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "20:9"
  }

  /**
   * Documented value. Wire value: `9:21`.
   */
  public data object _921 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "9:21"
  }

  /**
   * Documented value. Wire value: `21:9`.
   */
  public data object _219 : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "21:9"
  }

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio =
      when (value) {
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

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationRequestPropertiesAspectRatio) {
      encoder.encodeString(value.value)
    }
  }
}
