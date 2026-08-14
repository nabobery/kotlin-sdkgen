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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-waiting/properties/workflow_job/properties/step
 * s/items/properties/conclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-waiting/properties/workflow_job/properties/step
 * s/items/properties/conclusion
 */
@Serializable(with = InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8.Serializer::class)
public sealed class InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8() {
    public override val `value`: String = "cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8 = when (value) {
      Failure.value -> Failure
      Skipped.value -> Skipped
      Success.value -> Success
      Cancelled.value -> Cancelled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemConclusionXd38932a8) {
      encoder.encodeString(value.value)
    }
  }
}
