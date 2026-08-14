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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/head/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/head/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestRe8fbbPullRequestHeadRepoVisibilityXc4c43f38.Serializer::class)
public sealed class InlineWebhookPullRequestRe8fbbPullRequestHeadRepoVisibilityXc4c43f38 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestRe8fbbPullRequestHeadRepoVisibilityXc4c43f38() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestRe8fbbPullRequestHeadRepoVisibilityXc4c43f38() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestRe8fbbPullRequestHeadRepoVisibilityXc4c43f38() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe8fbbPullRequestHeadRepoVisibilityXc4c43f38()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe8fbbPullRequestHeadRepoVisibilityXc4c43f38 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe8fbbPullRequestHeadRepoVisibilityXc4c43f38> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe8fbbPullRequestHeadRepoVisibilityXc4c43f38", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe8fbbPullRequestHeadRepoVisibilityXc4c43f38 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe8fbbPullRequestHeadRepoVisibilityXc4c43f38) {
      encoder.encodeString(value.value)
    }
  }
}
