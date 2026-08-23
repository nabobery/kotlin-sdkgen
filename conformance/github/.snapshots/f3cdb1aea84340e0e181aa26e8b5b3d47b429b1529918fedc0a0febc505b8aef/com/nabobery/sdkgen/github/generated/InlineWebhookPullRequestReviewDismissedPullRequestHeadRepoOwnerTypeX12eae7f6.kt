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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/head/properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/head/properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoOwnerTypeX12eae7f6.Serializer::class)
public sealed class InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoOwnerTypeX12eae7f6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoOwnerTypeX12eae7f6() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoOwnerTypeX12eae7f6() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoOwnerTypeX12eae7f6() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoOwnerTypeX12eae7f6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoOwnerTypeX12eae7f6 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoOwnerTypeX12eae7f6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoOwnerTypeX12eae7f6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoOwnerTypeX12eae7f6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoOwnerTypeX12eae7f6) {
      encoder.encodeString(value.value)
    }
  }
}
