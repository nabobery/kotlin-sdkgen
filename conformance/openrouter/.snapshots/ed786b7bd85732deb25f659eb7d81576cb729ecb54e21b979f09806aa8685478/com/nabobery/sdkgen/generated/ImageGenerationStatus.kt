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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationStatus.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationStatus
 */
@Serializable(with = ImageGenerationStatus.Serializer::class)
public sealed class ImageGenerationStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : ImageGenerationStatus() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : ImageGenerationStatus() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `generating`.
   */
  public data object Generating : ImageGenerationStatus() {
    public override val `value`: String = "generating"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : ImageGenerationStatus() {
    public override val `value`: String = "failed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ImageGenerationStatus()

  public companion object {
    public fun fromValue(`value`: String): ImageGenerationStatus = when (value) {
      InProgress.value -> InProgress
      Completed.value -> Completed
      Generating.value -> Generating
      Failed.value -> Failed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ImageGenerationStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ImageGenerationStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ImageGenerationStatus = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ImageGenerationStatus) {
      encoder.encodeString(value.value)
    }
  }
}
