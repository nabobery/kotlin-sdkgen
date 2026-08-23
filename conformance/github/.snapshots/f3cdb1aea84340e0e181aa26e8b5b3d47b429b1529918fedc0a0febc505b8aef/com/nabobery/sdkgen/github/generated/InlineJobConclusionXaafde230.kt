package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The outcome of the job.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/job/properties/conclusion
 */
@Serializable(with = InlineJobConclusionXaafde230.Serializer::class)
public sealed class InlineJobConclusionXaafde230 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineJobConclusionXaafde230() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineJobConclusionXaafde230() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineJobConclusionXaafde230() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineJobConclusionXaafde230() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineJobConclusionXaafde230() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineJobConclusionXaafde230() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineJobConclusionXaafde230() {
    public override val `value`: String = "action_required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineJobConclusionXaafde230()

  public companion object {
    public fun fromValue(`value`: String): InlineJobConclusionXaafde230 = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      Neutral.value -> Neutral
      Cancelled.value -> Cancelled
      Skipped.value -> Skipped
      TimedOut.value -> TimedOut
      ActionRequired.value -> ActionRequired
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineJobConclusionXaafde230> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineJobConclusionXaafde230", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineJobConclusionXaafde230 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineJobConclusionXaafde230) {
      encoder.encodeString(value.value)
    }
  }
}
