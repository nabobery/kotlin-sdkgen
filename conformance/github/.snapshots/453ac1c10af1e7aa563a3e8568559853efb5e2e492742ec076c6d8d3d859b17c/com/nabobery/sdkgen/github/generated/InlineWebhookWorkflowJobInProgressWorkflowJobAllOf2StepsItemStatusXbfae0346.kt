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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/1/pro
 * perties/steps/items/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/1/pro
 * perties/steps/items/properties/status
 */
@Serializable(with = InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346.Serializer::class)
public sealed class InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346() {
    public override val `value`: String = "queued"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346 = when (value) {
      InProgress.value -> InProgress
      Completed.value -> Completed
      Pending.value -> Pending
      Queued.value -> Queued
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346) {
      encoder.encodeString(value.value)
    }
  }
}
