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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/workflow_job/allOf/0/prope
 * rties/steps/items/properties/conclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/workflow_job/allOf/0/prope
 * rties/steps/items/properties/conclusion
 */
@Serializable(with = InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a.Serializer::class)
public sealed class InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a() {
    public override val `value`: String = "cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a = when (value) {
      Failure.value -> Failure
      Skipped.value -> Skipped
      Success.value -> Success
      Cancelled.value -> Cancelled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobCompletedWorkflowJobAllOf1StepsItemConclusionXa700e98a) {
      encoder.encodeString(value.value)
    }
  }
}
