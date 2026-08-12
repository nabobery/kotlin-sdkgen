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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/req
 * uested_reviewers/items/oneOf/1/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/req
 * uested_reviewers/items/oneOf/1/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemPrivacyXd4490efb.Serializer::class)
public sealed class InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemPrivacyXd4490efb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemPrivacyXd4490efb() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemPrivacyXd4490efb() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemPrivacyXd4490efb() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemPrivacyXd4490efb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemPrivacyXd4490efb = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemPrivacyXd4490efb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemPrivacyXd4490efb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemPrivacyXd4490efb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemPrivacyXd4490efb) {
      encoder.encodeString(value.value)
    }
  }
}
