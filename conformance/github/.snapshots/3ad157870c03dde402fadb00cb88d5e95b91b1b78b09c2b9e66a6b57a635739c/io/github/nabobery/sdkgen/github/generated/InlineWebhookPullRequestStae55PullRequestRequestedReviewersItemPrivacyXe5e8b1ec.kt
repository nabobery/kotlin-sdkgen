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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/requ
 * ested_reviewers/items/oneOf/1/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/requ
 * ested_reviewers/items/oneOf/1/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyXe5e8b1ec.Serializer::class)
public sealed class InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyXe5e8b1ec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyXe5e8b1ec() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyXe5e8b1ec() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyXe5e8b1ec() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyXe5e8b1ec()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyXe5e8b1ec = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyXe5e8b1ec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyXe5e8b1ec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyXe5e8b1ec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemPrivacyXe5e8b1ec) {
      encoder.encodeString(value.value)
    }
  }
}
