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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/status
 */
@Serializable(with = InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607.Serializer::class)
public sealed class InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607() {
    public override val `value`: String = "waiting"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607 = when (value) {
      Requested.value -> Requested
      InProgress.value -> InProgress
      Completed.value -> Completed
      Queued.value -> Queued
      Waiting.value -> Waiting
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607) {
      encoder.encodeString(value.value)
    }
  }
}
