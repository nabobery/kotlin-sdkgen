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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/status
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/status
 */
@Serializable(with = InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441.Serializer::class)
public sealed class InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441() {
    public override val `value`: String = "waiting"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441 = when (value) {
      Requested.value -> Requested
      InProgress.value -> InProgress
      Completed.value -> Completed
      Queued.value -> Queued
      Waiting.value -> Waiting
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedWorkflowRunStatusX4fde9441) {
      encoder.encodeString(value.value)
    }
  }
}
