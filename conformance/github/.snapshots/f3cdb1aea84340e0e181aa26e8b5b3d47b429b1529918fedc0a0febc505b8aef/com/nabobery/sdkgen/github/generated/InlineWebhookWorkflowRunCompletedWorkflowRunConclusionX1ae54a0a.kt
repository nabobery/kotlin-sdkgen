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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/co
 * nclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/co
 * nclusion
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a.Serializer::class)
public sealed class InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `startup_failure`.
   */
  public data object StartupFailure : InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a() {
    public override val `value`: String = "startup_failure"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a = when (value) {
      ActionRequired.value -> ActionRequired
      Cancelled.value -> Cancelled
      Failure.value -> Failure
      Neutral.value -> Neutral
      Skipped.value -> Skipped
      Stale.value -> Stale
      Success.value -> Success
      TimedOut.value -> TimedOut
      StartupFailure.value -> StartupFailure
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a) {
      encoder.encodeString(value.value)
    }
  }
}
