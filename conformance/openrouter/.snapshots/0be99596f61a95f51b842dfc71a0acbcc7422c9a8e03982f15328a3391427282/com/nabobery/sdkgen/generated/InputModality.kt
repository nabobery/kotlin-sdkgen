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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputModality.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputModality
 */
@Serializable(with = InputModality.Serializer::class)
public sealed class InputModality {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InputModality() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InputModality() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InputModality() {
    public override val `value`: String = "file"
  }

  /**
   * Documented value. Wire value: `audio`.
   */
  public data object Audio : InputModality() {
    public override val `value`: String = "audio"
  }

  /**
   * Documented value. Wire value: `video`.
   */
  public data object Video : InputModality() {
    public override val `value`: String = "video"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InputModality()

  public companion object {
    public fun fromValue(`value`: String): InputModality = when (value) {
      Text.value -> Text
      Image.value -> Image
      File.value -> File
      Audio.value -> Audio
      Video.value -> Video
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InputModality> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InputModality", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InputModality = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InputModality) {
      encoder.encodeString(value.value)
    }
  }
}
