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
 * perties/conclusion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/0/pro
 * perties/conclusion
 */
@Serializable(with = InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1.Serializer::class)
public sealed class InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1() {
    public override val `value`: String = "neutral"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1 = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      Cancelled.value -> Cancelled
      Neutral.value -> Neutral
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1ConclusionXe17f02b1) {
      encoder.encodeString(value.value)
    }
  }
}
