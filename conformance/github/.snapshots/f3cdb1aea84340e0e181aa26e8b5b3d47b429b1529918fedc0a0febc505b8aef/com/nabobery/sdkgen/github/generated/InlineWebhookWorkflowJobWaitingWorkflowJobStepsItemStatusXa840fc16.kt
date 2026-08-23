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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-waiting/properties/workflow_job/properties/step
 * s/items/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-waiting/properties/workflow_job/properties/step
 * s/items/properties/status
 */
@Serializable(with = InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16.Serializer::class)
public sealed class InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16() {
    public override val `value`: String = "waiting"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16 = when (value) {
      Completed.value -> Completed
      InProgress.value -> InProgress
      Queued.value -> Queued
      Pending.value -> Pending
      Waiting.value -> Waiting
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemStatusXa840fc16) {
      encoder.encodeString(value.value)
    }
  }
}
