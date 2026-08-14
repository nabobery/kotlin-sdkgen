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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/base/properties/repo/properties/squash_merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestRe8581PullRequestBaseRepoSquashMergeCommitTitleXe85cea37.Serializer::class)
public sealed class InlineWebhookPullRequestRe8581PullRequestBaseRepoSquashMergeCommitTitleXe85cea37 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestRe8581PullRequestBaseRepoSquashMergeCommitTitleXe85cea37() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhookPullRequestRe8581PullRequestBaseRepoSquashMergeCommitTitleXe85cea37() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe8581PullRequestBaseRepoSquashMergeCommitTitleXe85cea37()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe8581PullRequestBaseRepoSquashMergeCommitTitleXe85cea37 = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe8581PullRequestBaseRepoSquashMergeCommitTitleXe85cea37> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe8581PullRequestBaseRepoSquashMergeCommitTitleXe85cea37", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe8581PullRequestBaseRepoSquashMergeCommitTitleXe85cea37 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe8581PullRequestBaseRepoSquashMergeCommitTitleXe85cea37) {
      encoder.encodeString(value.value)
    }
  }
}
