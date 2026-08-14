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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/requested_reviewers/items/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/requested_reviewers/items/oneOf/0/properties/type
 */
@Serializable(with = InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03.Serializer::class)
public sealed class InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemTypeXebb84b03) {
      encoder.encodeString(value.value)
    }
  }
}
