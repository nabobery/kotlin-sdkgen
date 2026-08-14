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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/hea
 * d/properties/repo/properties/squash_merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestUnc059PullRequestHeadRepoSquashMergeCommitTitleXa69e5a79.Serializer::class)
public sealed class InlineWebhookPullRequestUnc059PullRequestHeadRepoSquashMergeCommitTitleXa69e5a79 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestUnc059PullRequestHeadRepoSquashMergeCommitTitleXa69e5a79() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhookPullRequestUnc059PullRequestHeadRepoSquashMergeCommitTitleXa69e5a79() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnc059PullRequestHeadRepoSquashMergeCommitTitleXa69e5a79()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnc059PullRequestHeadRepoSquashMergeCommitTitleXa69e5a79 = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnc059PullRequestHeadRepoSquashMergeCommitTitleXa69e5a79> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnc059PullRequestHeadRepoSquashMergeCommitTitleXa69e5a79", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnc059PullRequestHeadRepoSquashMergeCommitTitleXa69e5a79 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnc059PullRequestHeadRepoSquashMergeCommitTitleXa69e5a79) {
      encoder.encodeString(value.value)
    }
  }
}
