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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-queued/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-queued/properties/action
 */
@Serializable(with = InlineWebhookWorkflowJobQueuedActionX095382c5.Serializer::class)
public sealed class InlineWebhookWorkflowJobQueuedActionX095382c5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookWorkflowJobQueuedActionX095382c5() {
    public override val `value`: String = "queued"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobQueuedActionX095382c5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobQueuedActionX095382c5 = when (value) {
      Queued.value -> Queued
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobQueuedActionX095382c5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobQueuedActionX095382c5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobQueuedActionX095382c5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobQueuedActionX095382c5) {
      encoder.encodeString(value.value)
    }
  }
}
