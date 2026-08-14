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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-queued/properties/workflow_job/properties/statu
 * s.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-queued/properties/workflow_job/properties/statu
 * s
 */
@Serializable(with = InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74.Serializer::class)
public sealed class InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74() {
    public override val `value`: String = "waiting"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74 = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Waiting.value -> Waiting
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobQueuedWorkflowJobStatusX07e4ac74) {
      encoder.encodeString(value.value)
    }
  }
}
