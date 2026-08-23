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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/action
 */
@Serializable(with = InlineWebhookWorkflowRunRequestedActionX04f0b670.Serializer::class)
public sealed class InlineWebhookWorkflowRunRequestedActionX04f0b670 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWebhookWorkflowRunRequestedActionX04f0b670() {
    public override val `value`: String = "requested"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunRequestedActionX04f0b670()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunRequestedActionX04f0b670 = when (value) {
      Requested.value -> Requested
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunRequestedActionX04f0b670> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunRequestedActionX04f0b670", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunRequestedActionX04f0b670 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunRequestedActionX04f0b670) {
      encoder.encodeString(value.value)
    }
  }
}
