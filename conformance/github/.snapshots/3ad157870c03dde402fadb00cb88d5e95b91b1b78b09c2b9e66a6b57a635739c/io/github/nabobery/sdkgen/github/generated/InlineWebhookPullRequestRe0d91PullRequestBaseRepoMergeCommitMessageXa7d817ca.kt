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
 * The default value for a merge commit message.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `PR_BODY` - default to the pull request's body.
 * - `BLANK` - default to a blank commit message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/base/properties/repo/properties/merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestRe0d91PullRequestBaseRepoMergeCommitMessageXa7d817ca.Serializer::class)
public sealed class InlineWebhookPullRequestRe0d91PullRequestBaseRepoMergeCommitMessageXa7d817ca {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestRe0d91PullRequestBaseRepoMergeCommitMessageXa7d817ca() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestRe0d91PullRequestBaseRepoMergeCommitMessageXa7d817ca() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestRe0d91PullRequestBaseRepoMergeCommitMessageXa7d817ca() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe0d91PullRequestBaseRepoMergeCommitMessageXa7d817ca()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe0d91PullRequestBaseRepoMergeCommitMessageXa7d817ca = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0d91PullRequestBaseRepoMergeCommitMessageXa7d817ca> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe0d91PullRequestBaseRepoMergeCommitMessageXa7d817ca", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0d91PullRequestBaseRepoMergeCommitMessageXa7d817ca = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0d91PullRequestBaseRepoMergeCommitMessageXa7d817ca) {
      encoder.encodeString(value.value)
    }
  }
}
