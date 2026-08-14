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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/requested_reviewers/items/oneOf/1/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/requested_reviewers/items/oneOf/1/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestAu1a35PullRequestRequestedReviewersItemPrivacyXc0086b5e.Serializer::class)
public sealed class InlineWebhookPullRequestAu1a35PullRequestRequestedReviewersItemPrivacyXc0086b5e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestAu1a35PullRequestRequestedReviewersItemPrivacyXc0086b5e() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestAu1a35PullRequestRequestedReviewersItemPrivacyXc0086b5e() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestAu1a35PullRequestRequestedReviewersItemPrivacyXc0086b5e() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAu1a35PullRequestRequestedReviewersItemPrivacyXc0086b5e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAu1a35PullRequestRequestedReviewersItemPrivacyXc0086b5e = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAu1a35PullRequestRequestedReviewersItemPrivacyXc0086b5e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAu1a35PullRequestRequestedReviewersItemPrivacyXc0086b5e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAu1a35PullRequestRequestedReviewersItemPrivacyXc0086b5e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAu1a35PullRequestRequestedReviewersItemPrivacyXc0086b5e) {
      encoder.encodeString(value.value)
    }
  }
}
