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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/head/properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/head/properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoOwnerTypeX2b4ef0ba.Serializer::class)
public sealed class InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoOwnerTypeX2b4ef0ba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoOwnerTypeX2b4ef0ba() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoOwnerTypeX2b4ef0ba() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoOwnerTypeX2b4ef0ba() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoOwnerTypeX2b4ef0ba()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoOwnerTypeX2b4ef0ba = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoOwnerTypeX2b4ef0ba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoOwnerTypeX2b4ef0ba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoOwnerTypeX2b4ef0ba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoOwnerTypeX2b4ef0ba) {
      encoder.encodeString(value.value)
    }
  }
}
