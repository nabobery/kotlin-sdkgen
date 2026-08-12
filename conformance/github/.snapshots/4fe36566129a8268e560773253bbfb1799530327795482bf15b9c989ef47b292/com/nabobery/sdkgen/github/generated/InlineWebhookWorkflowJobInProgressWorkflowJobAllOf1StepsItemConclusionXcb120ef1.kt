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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/0/pro
 * perties/steps/items/properties/conclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/0/pro
 * perties/steps/items/properties/conclusion
 */
@Serializable(with = InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1.Serializer::class)
public sealed class InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1() {
    public override val `value`: String = "cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1 = when (value) {
      Failure.value -> Failure
      Skipped.value -> Skipped
      Success.value -> Success
      Cancelled.value -> Cancelled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1) {
      encoder.encodeString(value.value)
    }
  }
}
