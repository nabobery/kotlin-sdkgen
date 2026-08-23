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
 * properties/active_lock_reason.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/active_lock_reason
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390.Serializer::class)
public sealed class InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390 = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentDeletedPullRequestActiveLockReasonX644a1390) {
      encoder.encodeString(value.value)
    }
  }
}
