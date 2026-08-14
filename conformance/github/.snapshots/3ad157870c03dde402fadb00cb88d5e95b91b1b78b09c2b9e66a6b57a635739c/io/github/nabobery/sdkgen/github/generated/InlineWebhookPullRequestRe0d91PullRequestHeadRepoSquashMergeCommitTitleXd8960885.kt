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
 * The default value for a squash merge commit title:
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
 * than one commit).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/head/properties/repo/properties/squash_merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestRe0d91PullRequestHeadRepoSquashMergeCommitTitleXd8960885.Serializer::class)
public sealed class InlineWebhookPullRequestRe0d91PullRequestHeadRepoSquashMergeCommitTitleXd8960885 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestRe0d91PullRequestHeadRepoSquashMergeCommitTitleXd8960885() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhookPullRequestRe0d91PullRequestHeadRepoSquashMergeCommitTitleXd8960885() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe0d91PullRequestHeadRepoSquashMergeCommitTitleXd8960885()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe0d91PullRequestHeadRepoSquashMergeCommitTitleXd8960885 = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0d91PullRequestHeadRepoSquashMergeCommitTitleXd8960885> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe0d91PullRequestHeadRepoSquashMergeCommitTitleXd8960885", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0d91PullRequestHeadRepoSquashMergeCommitTitleXd8960885 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0d91PullRequestHeadRepoSquashMergeCommitTitleXd8960885) {
      encoder.encodeString(value.value)
    }
  }
}
