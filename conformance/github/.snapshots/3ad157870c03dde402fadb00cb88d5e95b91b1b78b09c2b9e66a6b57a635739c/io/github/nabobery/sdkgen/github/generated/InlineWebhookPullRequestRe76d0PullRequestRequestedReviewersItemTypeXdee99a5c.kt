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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/requested_reviewers/items/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/requested_reviewers/items/oneOf/0/properties/type
 */
@Serializable(with = InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c.Serializer::class)
public sealed class InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemTypeXdee99a5c) {
      encoder.encodeString(value.value)
    }
  }
}
