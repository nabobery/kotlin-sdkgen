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
 * s/conclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/conclusion
 */
@Serializable(with = InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9.Serializer::class)
public sealed class InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9() {
    public override val `value`: String = "stale"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9 = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      Neutral.value -> Neutral
      Cancelled.value -> Cancelled
      TimedOut.value -> TimedOut
      ActionRequired.value -> ActionRequired
      Stale.value -> Stale
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9) {
      encoder.encodeString(value.value)
    }
  }
}
