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
 * State of this Pull Request. Either `open` or `closed`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/sta
 * te
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestStateXf92ec319.Serializer::class)
public sealed class InlineWebhookPullRequestDequeuedPullRequestStateXf92ec319 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestDequeuedPullRequestStateXf92ec319() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestDequeuedPullRequestStateXf92ec319() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDequeuedPullRequestStateXf92ec319()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDequeuedPullRequestStateXf92ec319 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestStateXf92ec319> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDequeuedPullRequestStateXf92ec319", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestStateXf92ec319 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestStateXf92ec319) {
      encoder.encodeString(value.value)
    }
  }
}
