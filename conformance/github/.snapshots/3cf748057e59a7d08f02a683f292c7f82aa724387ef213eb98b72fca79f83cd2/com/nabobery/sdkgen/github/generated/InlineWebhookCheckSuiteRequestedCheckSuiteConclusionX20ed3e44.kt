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
 * The summary conclusion for all check runs that are part of the check suite. This value will be `null` until the check
 * run has completed.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/conc
 * lusion
 */
@Serializable(with = InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44.Serializer::class)
public sealed class InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44() {
    public override val `value`: String = "skipped"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44 = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      Neutral.value -> Neutral
      Cancelled.value -> Cancelled
      TimedOut.value -> TimedOut
      ActionRequired.value -> ActionRequired
      Stale.value -> Stale
      Skipped.value -> Skipped
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRequestedCheckSuiteConclusionX20ed3e44) {
      encoder.encodeString(value.value)
    }
  }
}
