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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/head/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/head/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentCreatedPullRequestHeadUserTypeXf5f14626.Serializer::class)
public sealed class InlineWebhookPullRequestReviewCommentCreatedPullRequestHeadUserTypeXf5f14626 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewCommentCreatedPullRequestHeadUserTypeXf5f14626() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewCommentCreatedPullRequestHeadUserTypeXf5f14626() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewCommentCreatedPullRequestHeadUserTypeXf5f14626() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewCommentCreatedPullRequestHeadUserTypeXf5f14626()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewCommentCreatedPullRequestHeadUserTypeXf5f14626 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentCreatedPullRequestHeadUserTypeXf5f14626> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewCommentCreatedPullRequestHeadUserTypeXf5f14626", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentCreatedPullRequestHeadUserTypeXf5f14626 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentCreatedPullRequestHeadUserTypeXf5f14626) {
      encoder.encodeString(value.value)
    }
  }
}
