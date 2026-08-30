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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/workflow_job/allOf/1/prope
 * rties/conclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/workflow_job/allOf/1/prope
 * rties/conclusion
 */
@Serializable(with = InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f.Serializer::class)
public sealed class InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f() {
    public override val `value`: String = "timed_out"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f) {
      encoder.encodeString(value.value)
    }
  }
}
