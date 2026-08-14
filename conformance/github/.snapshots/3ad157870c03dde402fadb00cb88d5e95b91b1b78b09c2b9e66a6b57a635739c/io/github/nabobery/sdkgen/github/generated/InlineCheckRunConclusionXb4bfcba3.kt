package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/check-run/properties/conclusion.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-run/properties/conclusion
 */
@Serializable(with = InlineCheckRunConclusionXb4bfcba3.Serializer::class)
public sealed class InlineCheckRunConclusionXb4bfcba3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineCheckRunConclusionXb4bfcba3() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineCheckRunConclusionXb4bfcba3() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineCheckRunConclusionXb4bfcba3() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineCheckRunConclusionXb4bfcba3() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineCheckRunConclusionXb4bfcba3() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineCheckRunConclusionXb4bfcba3() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineCheckRunConclusionXb4bfcba3() {
    public override val `value`: String = "action_required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckRunConclusionXb4bfcba3()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckRunConclusionXb4bfcba3 = when (value) {
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

  internal object Serializer : KSerializer<InlineCheckRunConclusionXb4bfcba3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCheckRunConclusionXb4bfcba3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckRunConclusionXb4bfcba3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckRunConclusionXb4bfcba3) {
      encoder.encodeString(value.value)
    }
  }
}
