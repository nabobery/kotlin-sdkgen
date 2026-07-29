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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-queued/properties/workflow_job/properties/steps
 * /items/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-queued/properties/workflow_job/properties/steps
 * /items/properties/status
 */
@Serializable(with = InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433.Serializer::class)
public sealed class InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433 = when (value) {
      Completed.value -> Completed
      InProgress.value -> InProgress
      Queued.value -> Queued
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemStatusXcba22433) {
      encoder.encodeString(value.value)
    }
  }
}
