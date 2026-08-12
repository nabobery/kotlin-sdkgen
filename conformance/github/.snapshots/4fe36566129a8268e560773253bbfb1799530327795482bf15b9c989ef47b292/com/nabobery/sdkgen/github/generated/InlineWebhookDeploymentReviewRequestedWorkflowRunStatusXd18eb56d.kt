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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/workflow_run/properti
 * es/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/workflow_run/properti
 * es/status
 */
@Serializable(with = InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d.Serializer::class)
public sealed class InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d() {
    public override val `value`: String = "waiting"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d = when (value) {
      Requested.value -> Requested
      InProgress.value -> InProgress
      Completed.value -> Completed
      Queued.value -> Queued
      Waiting.value -> Waiting
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRequestedWorkflowRunStatusXd18eb56d) {
      encoder.encodeString(value.value)
    }
  }
}
