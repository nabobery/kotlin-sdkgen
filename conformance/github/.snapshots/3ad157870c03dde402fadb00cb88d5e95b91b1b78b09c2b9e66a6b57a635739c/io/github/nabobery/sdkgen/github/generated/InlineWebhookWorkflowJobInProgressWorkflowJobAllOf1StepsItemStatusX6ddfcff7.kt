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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/0/pro
 * perties/steps/items/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/0/pro
 * perties/steps/items/properties/status
 */
@Serializable(with = InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7.Serializer::class)
public sealed class InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7 = when (value) {
      InProgress.value -> InProgress
      Completed.value -> Completed
      Queued.value -> Queued
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7) {
      encoder.encodeString(value.value)
    }
  }
}
