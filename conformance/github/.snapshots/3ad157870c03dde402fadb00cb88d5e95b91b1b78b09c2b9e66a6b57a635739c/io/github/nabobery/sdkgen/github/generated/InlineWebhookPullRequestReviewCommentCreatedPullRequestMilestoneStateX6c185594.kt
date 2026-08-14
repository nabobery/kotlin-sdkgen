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
 * The state of the milestone.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/milestone/properties/state
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentCreatedPullRequestMilestoneStateX6c185594.Serializer::class)
public sealed class InlineWebhookPullRequestReviewCommentCreatedPullRequestMilestoneStateX6c185594 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReviewCommentCreatedPullRequestMilestoneStateX6c185594() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReviewCommentCreatedPullRequestMilestoneStateX6c185594() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewCommentCreatedPullRequestMilestoneStateX6c185594()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewCommentCreatedPullRequestMilestoneStateX6c185594 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentCreatedPullRequestMilestoneStateX6c185594> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewCommentCreatedPullRequestMilestoneStateX6c185594", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentCreatedPullRequestMilestoneStateX6c185594 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentCreatedPullRequestMilestoneStateX6c185594) {
      encoder.encodeString(value.value)
    }
  }
}
