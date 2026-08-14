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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/status
 */
@Serializable(with = InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa.Serializer::class)
public sealed class InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa() {
    public override val `value`: String = "waiting"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa = when (value) {
      Requested.value -> Requested
      InProgress.value -> InProgress
      Completed.value -> Completed
      Queued.value -> Queued
      Waiting.value -> Waiting
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRejectedWorkflowRunStatusXa251a9fa) {
      encoder.encodeString(value.value)
    }
  }
}
