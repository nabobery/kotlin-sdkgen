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
 * roperties/assignees/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/assignees/items/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemTypeX2eca94d5.Serializer::class)
public sealed class InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemTypeX2eca94d5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemTypeX2eca94d5() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemTypeX2eca94d5() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemTypeX2eca94d5() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemTypeX2eca94d5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemTypeX2eca94d5 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemTypeX2eca94d5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemTypeX2eca94d5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemTypeX2eca94d5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemTypeX2eca94d5) {
      encoder.encodeString(value.value)
    }
  }
}
