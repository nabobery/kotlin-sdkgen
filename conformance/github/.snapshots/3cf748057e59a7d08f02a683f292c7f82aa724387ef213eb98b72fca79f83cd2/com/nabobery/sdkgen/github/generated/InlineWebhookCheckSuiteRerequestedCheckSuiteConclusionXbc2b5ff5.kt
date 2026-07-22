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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/co
 * nclusion
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5.Serializer::class)
public sealed class InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5() {
    public override val `value`: String = "stale"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5 = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      Neutral.value -> Neutral
      Cancelled.value -> Cancelled
      TimedOut.value -> TimedOut
      ActionRequired.value -> ActionRequired
      Stale.value -> Stale
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5) {
      encoder.encodeString(value.value)
    }
  }
}
