package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/VideoGenerationResponse/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/VideoGenerationResponse/properties/status
 */
@Serializable(with = InlineVideoGenerationResponseStatusX878ec74f.Serializer::class)
public sealed class InlineVideoGenerationResponseStatusX878ec74f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineVideoGenerationResponseStatusX878ec74f() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineVideoGenerationResponseStatusX878ec74f() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineVideoGenerationResponseStatusX878ec74f() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineVideoGenerationResponseStatusX878ec74f() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineVideoGenerationResponseStatusX878ec74f() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineVideoGenerationResponseStatusX878ec74f() {
    public override val `value`: String = "expired"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineVideoGenerationResponseStatusX878ec74f()

  public companion object {
    public fun fromValue(`value`: String): InlineVideoGenerationResponseStatusX878ec74f = when (value) {
      Pending.value -> Pending
      InProgress.value -> InProgress
      Completed.value -> Completed
      Failed.value -> Failed
      Cancelled.value -> Cancelled
      Expired.value -> Expired
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineVideoGenerationResponseStatusX878ec74f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineVideoGenerationResponseStatusX878ec74f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineVideoGenerationResponseStatusX878ec74f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineVideoGenerationResponseStatusX878ec74f) {
      encoder.encodeString(value.value)
    }
  }
}
