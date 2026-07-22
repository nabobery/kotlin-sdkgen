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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/action
 */
@Serializable(with = InlineWebhookWorkflowJobCompletedActionXcbbb212d.Serializer::class)
public sealed class InlineWebhookWorkflowJobCompletedActionXcbbb212d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookWorkflowJobCompletedActionXcbbb212d() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowJobCompletedActionXcbbb212d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowJobCompletedActionXcbbb212d = when (value) {
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowJobCompletedActionXcbbb212d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowJobCompletedActionXcbbb212d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobCompletedActionXcbbb212d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobCompletedActionXcbbb212d) {
      encoder.encodeString(value.value)
    }
  }
}
