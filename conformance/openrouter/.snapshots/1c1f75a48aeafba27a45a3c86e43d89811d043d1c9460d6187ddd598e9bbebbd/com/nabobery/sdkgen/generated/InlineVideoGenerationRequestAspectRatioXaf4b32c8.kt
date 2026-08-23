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
 * Aspect ratio of the generated video
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/VideoGenerationRequest/properties/aspect_ratio
 */
@Serializable(with = InlineVideoGenerationRequestAspectRatioXaf4b32c8.Serializer::class)
public sealed class InlineVideoGenerationRequestAspectRatioXaf4b32c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `16:9`.
   */
  public data object _169 : InlineVideoGenerationRequestAspectRatioXaf4b32c8() {
    public override val `value`: String = "16:9"
  }

  /**
   * Documented value. Wire value: `9:16`.
   */
  public data object _916 : InlineVideoGenerationRequestAspectRatioXaf4b32c8() {
    public override val `value`: String = "9:16"
  }

  /**
   * Documented value. Wire value: `1:1`.
   */
  public data object _11 : InlineVideoGenerationRequestAspectRatioXaf4b32c8() {
    public override val `value`: String = "1:1"
  }

  /**
   * Documented value. Wire value: `4:3`.
   */
  public data object _43 : InlineVideoGenerationRequestAspectRatioXaf4b32c8() {
    public override val `value`: String = "4:3"
  }

  /**
   * Documented value. Wire value: `3:4`.
   */
  public data object _34 : InlineVideoGenerationRequestAspectRatioXaf4b32c8() {
    public override val `value`: String = "3:4"
  }

  /**
   * Documented value. Wire value: `3:2`.
   */
  public data object _32 : InlineVideoGenerationRequestAspectRatioXaf4b32c8() {
    public override val `value`: String = "3:2"
  }

  /**
   * Documented value. Wire value: `2:3`.
   */
  public data object _23 : InlineVideoGenerationRequestAspectRatioXaf4b32c8() {
    public override val `value`: String = "2:3"
  }

  /**
   * Documented value. Wire value: `21:9`.
   */
  public data object _219 : InlineVideoGenerationRequestAspectRatioXaf4b32c8() {
    public override val `value`: String = "21:9"
  }

  /**
   * Documented value. Wire value: `9:21`.
   */
  public data object _921 : InlineVideoGenerationRequestAspectRatioXaf4b32c8() {
    public override val `value`: String = "9:21"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineVideoGenerationRequestAspectRatioXaf4b32c8()

  public companion object {
    public fun fromValue(`value`: String): InlineVideoGenerationRequestAspectRatioXaf4b32c8 = when (value) {
      _169.value -> _169
      _916.value -> _916
      _11.value -> _11
      _43.value -> _43
      _34.value -> _34
      _32.value -> _32
      _23.value -> _23
      _219.value -> _219
      _921.value -> _921
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineVideoGenerationRequestAspectRatioXaf4b32c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineVideoGenerationRequestAspectRatioXaf4b32c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineVideoGenerationRequestAspectRatioXaf4b32c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineVideoGenerationRequestAspectRatioXaf4b32c8) {
      encoder.encodeString(value.value)
    }
  }
}
