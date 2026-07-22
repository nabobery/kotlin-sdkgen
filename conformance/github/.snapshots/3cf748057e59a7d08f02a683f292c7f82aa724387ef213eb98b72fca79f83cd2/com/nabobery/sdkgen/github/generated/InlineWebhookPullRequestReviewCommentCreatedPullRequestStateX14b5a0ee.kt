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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/state.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/state
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentCreatedPullRequestStateX14b5a0ee.Serializer::class)
public sealed class InlineWebhookPullRequestReviewCommentCreatedPullRequestStateX14b5a0ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReviewCommentCreatedPullRequestStateX14b5a0ee() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReviewCommentCreatedPullRequestStateX14b5a0ee() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewCommentCreatedPullRequestStateX14b5a0ee()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewCommentCreatedPullRequestStateX14b5a0ee = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentCreatedPullRequestStateX14b5a0ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewCommentCreatedPullRequestStateX14b5a0ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentCreatedPullRequestStateX14b5a0ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentCreatedPullRequestStateX14b5a0ee) {
      encoder.encodeString(value.value)
    }
  }
}
