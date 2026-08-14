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
 * properties/assignee/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/assignee/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb.Serializer::class)
public sealed class InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentCreatedPullRequestAssigneeTypeXa7acabbb) {
      encoder.encodeString(value.value)
    }
  }
}
