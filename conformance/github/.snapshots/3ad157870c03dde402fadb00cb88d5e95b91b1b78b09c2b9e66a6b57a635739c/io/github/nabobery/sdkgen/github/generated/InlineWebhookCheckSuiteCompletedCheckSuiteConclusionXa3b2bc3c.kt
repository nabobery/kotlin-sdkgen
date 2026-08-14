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
 * The summary conclusion for all check runs that are part of the check suite. This value will be `null` until the check
 * run has `completed`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/conc
 * lusion
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c.Serializer::class)
public sealed class InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `startup_failure`.
   */
  public data object StartupFailure : InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c() {
    public override val `value`: String = "startup_failure"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      Neutral.value -> Neutral
      Cancelled.value -> Cancelled
      TimedOut.value -> TimedOut
      ActionRequired.value -> ActionRequired
      Stale.value -> Stale
      Skipped.value -> Skipped
      StartupFailure.value -> StartupFailure
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c) {
      encoder.encodeString(value.value)
    }
  }
}
