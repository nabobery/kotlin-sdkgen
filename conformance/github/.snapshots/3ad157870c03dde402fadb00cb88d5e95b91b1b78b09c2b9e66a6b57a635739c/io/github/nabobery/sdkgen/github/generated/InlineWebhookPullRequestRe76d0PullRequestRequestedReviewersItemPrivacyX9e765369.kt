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
 * s/requested_reviewers/items/oneOf/1/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/requested_reviewers/items/oneOf/1/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemPrivacyX9e765369.Serializer::class)
public sealed class InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemPrivacyX9e765369 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemPrivacyX9e765369() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemPrivacyX9e765369() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemPrivacyX9e765369() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemPrivacyX9e765369()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemPrivacyX9e765369 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemPrivacyX9e765369> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemPrivacyX9e765369", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemPrivacyX9e765369 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe76d0PullRequestRequestedReviewersItemPrivacyX9e765369) {
      encoder.encodeString(value.value)
    }
  }
}
