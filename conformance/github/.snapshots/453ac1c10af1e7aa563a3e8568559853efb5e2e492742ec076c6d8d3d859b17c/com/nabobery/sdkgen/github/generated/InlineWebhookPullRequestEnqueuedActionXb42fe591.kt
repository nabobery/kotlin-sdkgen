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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/action
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedActionXb42fe591.Serializer::class)
public sealed class InlineWebhookPullRequestEnqueuedActionXb42fe591 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enqueued`.
   */
  public data object Enqueued : InlineWebhookPullRequestEnqueuedActionXb42fe591() {
    public override val `value`: String = "enqueued"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestEnqueuedActionXb42fe591()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestEnqueuedActionXb42fe591 = when (value) {
      Enqueued.value -> Enqueued
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedActionXb42fe591> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestEnqueuedActionXb42fe591", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedActionXb42fe591 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedActionXb42fe591) {
      encoder.encodeString(value.value)
    }
  }
}
