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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-completed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-completed/properties/action
 */
@Serializable(with = InlineWebhookCheckRunCompletedActionX04e8d74c.Serializer::class)
public sealed class InlineWebhookCheckRunCompletedActionX04e8d74c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookCheckRunCompletedActionX04e8d74c() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckRunCompletedActionX04e8d74c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckRunCompletedActionX04e8d74c = when (value) {
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckRunCompletedActionX04e8d74c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCheckRunCompletedActionX04e8d74c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckRunCompletedActionX04e8d74c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckRunCompletedActionX04e8d74c) {
      encoder.encodeString(value.value)
    }
  }
}
