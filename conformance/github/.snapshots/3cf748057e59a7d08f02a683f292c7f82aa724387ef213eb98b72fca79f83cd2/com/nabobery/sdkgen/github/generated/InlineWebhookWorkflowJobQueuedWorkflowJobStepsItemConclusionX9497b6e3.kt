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
 * /items/properties/conclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-queued/properties/workflow_job/properties/steps
 * /items/properties/conclusion
 */
@Serializable(with = InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3.Serializer::class)
public sealed class InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3() {
    public override val `value`: String = "cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3 = when (value) {
      Failure.value -> Failure
      Skipped.value -> Skipped
      Success.value -> Success
      Cancelled.value -> Cancelled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobQueuedWorkflowJobStepsItemConclusionX9497b6e3) {
      encoder.encodeString(value.value)
    }
  }
}
