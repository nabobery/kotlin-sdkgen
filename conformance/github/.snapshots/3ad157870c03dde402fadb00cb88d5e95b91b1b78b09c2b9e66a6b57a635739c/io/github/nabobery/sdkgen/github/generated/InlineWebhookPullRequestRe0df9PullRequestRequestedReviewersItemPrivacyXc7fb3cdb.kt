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
 * properties/requested_reviewers/items/oneOf/1/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/requested_reviewers/items/oneOf/1/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemPrivacyXc7fb3cdb.Serializer::class)
public sealed class InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemPrivacyXc7fb3cdb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemPrivacyXc7fb3cdb() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemPrivacyXc7fb3cdb() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemPrivacyXc7fb3cdb() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemPrivacyXc7fb3cdb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemPrivacyXc7fb3cdb = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemPrivacyXc7fb3cdb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemPrivacyXc7fb3cdb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemPrivacyXc7fb3cdb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0df9PullRequestRequestedReviewersItemPrivacyXc7fb3cdb) {
      encoder.encodeString(value.value)
    }
  }
}
