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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-waiting/properties/workflow_job/properties/stat
 * us.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-waiting/properties/workflow_job/properties/stat
 * us
 */
@Serializable(with = InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179.Serializer::class)
public sealed class InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179() {
    public override val `value`: String = "waiting"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179 = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Waiting.value -> Waiting
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179) {
      encoder.encodeString(value.value)
    }
  }
}
