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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/check-run-with-simple-check-suite/properties/conclusion.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-run-with-simple-check-suite/properties/conclusion
 */
@Serializable(with = InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5.Serializer::class)
public sealed class InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5() {
    public override val `value`: String = "waiting"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `startup_failure`.
   */
  public data object StartupFailure : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5() {
    public override val `value`: String = "startup_failure"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5() {
    public override val `value`: String = "action_required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5 = when (value) {
      Waiting.value -> Waiting
      Pending.value -> Pending
      StartupFailure.value -> StartupFailure
      Stale.value -> Stale
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

  internal object Serializer : KSerializer<InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5) {
      encoder.encodeString(value.value)
    }
  }
}
