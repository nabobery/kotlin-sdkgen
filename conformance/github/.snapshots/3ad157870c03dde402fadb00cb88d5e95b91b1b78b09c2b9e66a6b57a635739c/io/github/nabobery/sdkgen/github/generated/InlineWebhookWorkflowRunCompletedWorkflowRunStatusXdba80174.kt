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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/st
 * atus.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/st
 * atus
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174.Serializer::class)
public sealed class InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174() {
    public override val `value`: String = "waiting"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174 = when (value) {
      Requested.value -> Requested
      InProgress.value -> InProgress
      Completed.value -> Completed
      Queued.value -> Queued
      Pending.value -> Pending
      Waiting.value -> Waiting
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174) {
      encoder.encodeString(value.value)
    }
  }
}
