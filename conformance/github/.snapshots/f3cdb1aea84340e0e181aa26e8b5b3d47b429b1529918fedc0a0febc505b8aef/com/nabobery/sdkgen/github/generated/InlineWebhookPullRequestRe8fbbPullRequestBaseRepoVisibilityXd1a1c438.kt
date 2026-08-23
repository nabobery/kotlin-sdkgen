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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/base/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/base/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestRe8fbbPullRequestBaseRepoVisibilityXd1a1c438.Serializer::class)
public sealed class InlineWebhookPullRequestRe8fbbPullRequestBaseRepoVisibilityXd1a1c438 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestRe8fbbPullRequestBaseRepoVisibilityXd1a1c438() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestRe8fbbPullRequestBaseRepoVisibilityXd1a1c438() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestRe8fbbPullRequestBaseRepoVisibilityXd1a1c438() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe8fbbPullRequestBaseRepoVisibilityXd1a1c438()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe8fbbPullRequestBaseRepoVisibilityXd1a1c438 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe8fbbPullRequestBaseRepoVisibilityXd1a1c438> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe8fbbPullRequestBaseRepoVisibilityXd1a1c438", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe8fbbPullRequestBaseRepoVisibilityXd1a1c438 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe8fbbPullRequestBaseRepoVisibilityXd1a1c438) {
      encoder.encodeString(value.value)
    }
  }
}
