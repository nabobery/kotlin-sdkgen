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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/action
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedActionX14c13c2a.Serializer::class)
public sealed class InlineWebhookWorkflowRunCompletedActionX14c13c2a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowRunCompletedActionX14c13c2a() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunCompletedActionX14c13c2a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunCompletedActionX14c13c2a = when (value) {
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedActionX14c13c2a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunCompletedActionX14c13c2a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedActionX14c13c2a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedActionX14c13c2a) {
      encoder.encodeString(value.value)
    }
  }
}
