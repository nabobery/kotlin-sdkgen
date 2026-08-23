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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/active_lock_reason.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/active_lock_reason
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684.Serializer::class)
public sealed class InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684 = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684) {
      encoder.encodeString(value.value)
    }
  }
}
