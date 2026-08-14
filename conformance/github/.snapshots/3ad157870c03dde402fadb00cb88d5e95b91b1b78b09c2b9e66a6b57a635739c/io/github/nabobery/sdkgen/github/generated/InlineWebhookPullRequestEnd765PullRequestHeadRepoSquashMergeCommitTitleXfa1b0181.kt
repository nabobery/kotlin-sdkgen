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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/hea
 * d/properties/repo/properties/squash_merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestEnd765PullRequestHeadRepoSquashMergeCommitTitleXfa1b0181.Serializer::class)
public sealed class InlineWebhookPullRequestEnd765PullRequestHeadRepoSquashMergeCommitTitleXfa1b0181 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestEnd765PullRequestHeadRepoSquashMergeCommitTitleXfa1b0181() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhookPullRequestEnd765PullRequestHeadRepoSquashMergeCommitTitleXfa1b0181() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestEnd765PullRequestHeadRepoSquashMergeCommitTitleXfa1b0181()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestEnd765PullRequestHeadRepoSquashMergeCommitTitleXfa1b0181 = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnd765PullRequestHeadRepoSquashMergeCommitTitleXfa1b0181> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestEnd765PullRequestHeadRepoSquashMergeCommitTitleXfa1b0181", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnd765PullRequestHeadRepoSquashMergeCommitTitleXfa1b0181 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnd765PullRequestHeadRepoSquashMergeCommitTitleXfa1b0181) {
      encoder.encodeString(value.value)
    }
  }
}
