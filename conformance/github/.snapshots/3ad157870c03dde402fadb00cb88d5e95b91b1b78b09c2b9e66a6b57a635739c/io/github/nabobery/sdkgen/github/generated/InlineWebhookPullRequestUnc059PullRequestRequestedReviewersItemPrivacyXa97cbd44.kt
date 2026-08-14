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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/req
 * uested_reviewers/items/oneOf/1/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/req
 * uested_reviewers/items/oneOf/1/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestUnc059PullRequestRequestedReviewersItemPrivacyXa97cbd44.Serializer::class)
public sealed class InlineWebhookPullRequestUnc059PullRequestRequestedReviewersItemPrivacyXa97cbd44 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestUnc059PullRequestRequestedReviewersItemPrivacyXa97cbd44() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestUnc059PullRequestRequestedReviewersItemPrivacyXa97cbd44() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestUnc059PullRequestRequestedReviewersItemPrivacyXa97cbd44() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnc059PullRequestRequestedReviewersItemPrivacyXa97cbd44()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnc059PullRequestRequestedReviewersItemPrivacyXa97cbd44 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnc059PullRequestRequestedReviewersItemPrivacyXa97cbd44> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnc059PullRequestRequestedReviewersItemPrivacyXa97cbd44", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnc059PullRequestRequestedReviewersItemPrivacyXa97cbd44 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnc059PullRequestRequestedReviewersItemPrivacyXa97cbd44) {
      encoder.encodeString(value.value)
    }
  }
}
