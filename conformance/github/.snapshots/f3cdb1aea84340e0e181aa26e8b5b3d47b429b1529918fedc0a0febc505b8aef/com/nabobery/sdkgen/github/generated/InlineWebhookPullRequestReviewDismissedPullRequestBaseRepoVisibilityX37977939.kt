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
 * ties/base/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/base/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedPullRequestBaseRepoVisibilityX37977939.Serializer::class)
public sealed class InlineWebhookPullRequestReviewDismissedPullRequestBaseRepoVisibilityX37977939 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestReviewDismissedPullRequestBaseRepoVisibilityX37977939() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestReviewDismissedPullRequestBaseRepoVisibilityX37977939() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestReviewDismissedPullRequestBaseRepoVisibilityX37977939() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewDismissedPullRequestBaseRepoVisibilityX37977939()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewDismissedPullRequestBaseRepoVisibilityX37977939 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedPullRequestBaseRepoVisibilityX37977939> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewDismissedPullRequestBaseRepoVisibilityX37977939", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedPullRequestBaseRepoVisibilityX37977939 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedPullRequestBaseRepoVisibilityX37977939) {
      encoder.encodeString(value.value)
    }
  }
}
