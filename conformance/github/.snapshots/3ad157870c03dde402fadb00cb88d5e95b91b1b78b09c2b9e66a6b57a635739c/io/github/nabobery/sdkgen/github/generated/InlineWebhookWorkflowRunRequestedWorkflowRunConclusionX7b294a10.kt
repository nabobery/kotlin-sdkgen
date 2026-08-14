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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/co
 * nclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/co
 * nclusion
 */
@Serializable(with = InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10.Serializer::class)
public sealed class InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `startup_failure`.
   */
  public data object StartupFailure : InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10() {
    public override val `value`: String = "startup_failure"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10 = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunRequestedWorkflowRunConclusionX7b294a10) {
      encoder.encodeString(value.value)
    }
  }
}
