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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/workflow_job/allOf/0/prope
 * rties/conclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/workflow_job/allOf/0/prope
 * rties/conclusion
 */
@Serializable(with = InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6.Serializer::class)
public sealed class InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6() {
    public override val `value`: String = "timed_out"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6 = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      Skipped.value -> Skipped
      Cancelled.value -> Cancelled
      ActionRequired.value -> ActionRequired
      Neutral.value -> Neutral
      TimedOut.value -> TimedOut
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1ConclusionXde769fe6) {
      encoder.encodeString(value.value)
    }
  }
}
