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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/action
 */
@Serializable(with = InlineWebhookPullRequestDequeuedActionXbd9084f1.Serializer::class)
public sealed class InlineWebhookPullRequestDequeuedActionXbd9084f1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dequeued`.
   */
  public data object Dequeued : InlineWebhookPullRequestDequeuedActionXbd9084f1() {
    public override val `value`: String = "dequeued"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDequeuedActionXbd9084f1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDequeuedActionXbd9084f1 = when (value) {
      Dequeued.value -> Dequeued
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedActionXbd9084f1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDequeuedActionXbd9084f1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedActionXbd9084f1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedActionXbd9084f1) {
      encoder.encodeString(value.value)
    }
  }
}
