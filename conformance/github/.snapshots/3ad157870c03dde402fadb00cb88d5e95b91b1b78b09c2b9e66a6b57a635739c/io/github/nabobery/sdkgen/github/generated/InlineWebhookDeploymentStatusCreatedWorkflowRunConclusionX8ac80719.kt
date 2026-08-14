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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /conclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /conclusion
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719.Serializer::class)
public sealed class InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `startup_failure`.
   */
  public data object StartupFailure : InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719() {
    public override val `value`: String = "startup_failure"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719 = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      Neutral.value -> Neutral
      Cancelled.value -> Cancelled
      TimedOut.value -> TimedOut
      ActionRequired.value -> ActionRequired
      Stale.value -> Stale
      StartupFailure.value -> StartupFailure
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedWorkflowRunConclusionX8ac80719) {
      encoder.encodeString(value.value)
    }
  }
}
