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
 * rties/steps/items/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/workflow_job/allOf/0/prope
 * rties/steps/items/properties/status
 */
@Serializable(with = InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemStatusXd1d755c8.Serializer::class)
public sealed class InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemStatusXd1d755c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemStatusXd1d755c8() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemStatusXd1d755c8() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemStatusXd1d755c8() {
    public override val `value`: String = "queued"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemStatusXd1d755c8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemStatusXd1d755c8 = when (value) {
      InProgress.value -> InProgress
      Completed.value -> Completed
      Queued.value -> Queued
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemStatusXd1d755c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemStatusXd1d755c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemStatusXd1d755c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemStatusXd1d755c8) {
      encoder.encodeString(value.value)
    }
  }
}
