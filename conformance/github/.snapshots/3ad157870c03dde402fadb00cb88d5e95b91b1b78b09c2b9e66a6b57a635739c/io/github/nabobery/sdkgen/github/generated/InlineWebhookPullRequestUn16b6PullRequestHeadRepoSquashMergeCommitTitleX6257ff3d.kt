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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/h
 * ead/properties/repo/properties/squash_merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestUn16b6PullRequestHeadRepoSquashMergeCommitTitleX6257ff3d.Serializer::class)
public sealed class InlineWebhookPullRequestUn16b6PullRequestHeadRepoSquashMergeCommitTitleX6257ff3d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestUn16b6PullRequestHeadRepoSquashMergeCommitTitleX6257ff3d() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhookPullRequestUn16b6PullRequestHeadRepoSquashMergeCommitTitleX6257ff3d() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUn16b6PullRequestHeadRepoSquashMergeCommitTitleX6257ff3d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUn16b6PullRequestHeadRepoSquashMergeCommitTitleX6257ff3d = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUn16b6PullRequestHeadRepoSquashMergeCommitTitleX6257ff3d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUn16b6PullRequestHeadRepoSquashMergeCommitTitleX6257ff3d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUn16b6PullRequestHeadRepoSquashMergeCommitTitleX6257ff3d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUn16b6PullRequestHeadRepoSquashMergeCommitTitleX6257ff3d) {
      encoder.encodeString(value.value)
    }
  }
}
