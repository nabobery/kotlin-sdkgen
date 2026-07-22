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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/pull_
 * request/properties/state
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestStateX48d1d321.Serializer::class)
public sealed class InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestStateX48d1d321 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestStateX48d1d321() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestStateX48d1d321() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestStateX48d1d321()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestStateX48d1d321 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestStateX48d1d321> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestStateX48d1d321", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestStateX48d1d321 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestStateX48d1d321) {
      encoder.encodeString(value.value)
    }
  }
}
