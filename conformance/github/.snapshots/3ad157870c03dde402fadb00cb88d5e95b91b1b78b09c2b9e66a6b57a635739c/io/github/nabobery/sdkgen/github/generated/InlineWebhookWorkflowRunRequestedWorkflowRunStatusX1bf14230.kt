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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/st
 * atus.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/st
 * atus
 */
@Serializable(with = InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230.Serializer::class)
public sealed class InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230() {
    public override val `value`: String = "waiting"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230 = when (value) {
      Requested.value -> Requested
      InProgress.value -> InProgress
      Completed.value -> Completed
      Queued.value -> Queued
      Pending.value -> Pending
      Waiting.value -> Waiting
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunRequestedWorkflowRunStatusX1bf14230) {
      encoder.encodeString(value.value)
    }
  }
}
