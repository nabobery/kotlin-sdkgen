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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * conclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * conclusion
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc.Serializer::class)
public sealed class InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc() {
    public override val `value`: String = "timed_out"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc = when (value) {
      ActionRequired.value -> ActionRequired
      Cancelled.value -> Cancelled
      Failure.value -> Failure
      Neutral.value -> Neutral
      Skipped.value -> Skipped
      Stale.value -> Stale
      Success.value -> Success
      TimedOut.value -> TimedOut
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressWorkflowRunConclusionX85e9f8dc) {
      encoder.encodeString(value.value)
    }
  }
}
