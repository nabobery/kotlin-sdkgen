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
 * The current status of the job. Can be `queued`, `in_progress`, `waiting`, or `completed`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/workflow_job/allOf/0/prope
 * rties/status
 */
@Serializable(with = InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc.Serializer::class)
public sealed class InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc() {
    public override val `value`: String = "waiting"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Waiting.value -> Waiting
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StatusX1ef639bc) {
      encoder.encodeString(value.value)
    }
  }
}
