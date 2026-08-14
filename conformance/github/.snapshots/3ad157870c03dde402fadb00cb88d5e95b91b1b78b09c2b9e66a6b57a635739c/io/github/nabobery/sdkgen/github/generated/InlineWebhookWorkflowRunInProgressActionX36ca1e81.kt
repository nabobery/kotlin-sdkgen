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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/action
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressActionX36ca1e81.Serializer::class)
public sealed class InlineWebhookWorkflowRunInProgressActionX36ca1e81 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookWorkflowRunInProgressActionX36ca1e81() {
    public override val `value`: String = "in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunInProgressActionX36ca1e81()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunInProgressActionX36ca1e81 = when (value) {
      InProgress.value -> InProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressActionX36ca1e81> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunInProgressActionX36ca1e81", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressActionX36ca1e81 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressActionX36ca1e81) {
      encoder.encodeString(value.value)
    }
  }
}
