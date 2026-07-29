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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/requ
 * ested_reviewers/items/oneOf/1/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/requ
 * ested_reviewers/items/oneOf/1/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyX158d7d0a.Serializer::class)
public sealed class InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyX158d7d0a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyX158d7d0a() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyX158d7d0a() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyX158d7d0a() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyX158d7d0a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyX158d7d0a = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyX158d7d0a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyX158d7d0a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyX158d7d0a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyX158d7d0a) {
      encoder.encodeString(value.value)
    }
  }
}
