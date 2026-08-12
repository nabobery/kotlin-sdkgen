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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/state.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/state
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentDeletedPullRequestStateXfe54d4e4.Serializer::class)
public sealed class InlineWebhookPullRequestReviewCommentDeletedPullRequestStateXfe54d4e4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReviewCommentDeletedPullRequestStateXfe54d4e4() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReviewCommentDeletedPullRequestStateXfe54d4e4() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewCommentDeletedPullRequestStateXfe54d4e4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewCommentDeletedPullRequestStateXfe54d4e4 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentDeletedPullRequestStateXfe54d4e4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewCommentDeletedPullRequestStateXfe54d4e4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentDeletedPullRequestStateXfe54d4e4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentDeletedPullRequestStateXfe54d4e4) {
      encoder.encodeString(value.value)
    }
  }
}
