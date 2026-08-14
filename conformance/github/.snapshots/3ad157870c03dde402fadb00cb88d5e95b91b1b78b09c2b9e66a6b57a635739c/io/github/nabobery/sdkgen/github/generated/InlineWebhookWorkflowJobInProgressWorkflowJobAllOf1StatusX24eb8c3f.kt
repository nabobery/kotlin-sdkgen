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
 * The current status of the job. Can be `queued`, `in_progress`, or `completed`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/0/pro
 * perties/status
 */
@Serializable(with = InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StatusX24eb8c3f.Serializer::class)
public sealed class InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StatusX24eb8c3f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StatusX24eb8c3f() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StatusX24eb8c3f() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StatusX24eb8c3f() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StatusX24eb8c3f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StatusX24eb8c3f = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StatusX24eb8c3f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StatusX24eb8c3f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StatusX24eb8c3f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StatusX24eb8c3f) {
      encoder.encodeString(value.value)
    }
  }
}
