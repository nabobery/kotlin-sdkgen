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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/head/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/head/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoVisibilityXe8c0fca6.Serializer::class)
public sealed class InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoVisibilityXe8c0fca6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoVisibilityXe8c0fca6() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoVisibilityXe8c0fca6() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoVisibilityXe8c0fca6() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoVisibilityXe8c0fca6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoVisibilityXe8c0fca6 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoVisibilityXe8c0fca6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoVisibilityXe8c0fca6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoVisibilityXe8c0fca6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedPullRequestHeadRepoVisibilityXe8c0fca6) {
      encoder.encodeString(value.value)
    }
  }
}
