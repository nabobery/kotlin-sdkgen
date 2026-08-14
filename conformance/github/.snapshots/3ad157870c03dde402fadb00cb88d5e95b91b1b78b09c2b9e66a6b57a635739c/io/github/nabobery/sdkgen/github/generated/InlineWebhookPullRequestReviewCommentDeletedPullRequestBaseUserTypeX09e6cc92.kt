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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/base/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/base/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentDeletedPullRequestBaseUserTypeX09e6cc92.Serializer::class)
public sealed class InlineWebhookPullRequestReviewCommentDeletedPullRequestBaseUserTypeX09e6cc92 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewCommentDeletedPullRequestBaseUserTypeX09e6cc92() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewCommentDeletedPullRequestBaseUserTypeX09e6cc92() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewCommentDeletedPullRequestBaseUserTypeX09e6cc92() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewCommentDeletedPullRequestBaseUserTypeX09e6cc92()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewCommentDeletedPullRequestBaseUserTypeX09e6cc92 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentDeletedPullRequestBaseUserTypeX09e6cc92> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewCommentDeletedPullRequestBaseUserTypeX09e6cc92", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentDeletedPullRequestBaseUserTypeX09e6cc92 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentDeletedPullRequestBaseUserTypeX09e6cc92) {
      encoder.encodeString(value.value)
    }
  }
}
