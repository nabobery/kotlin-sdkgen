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
 * The default value for a merge commit title.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
 * branch-name).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/head/properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestRe0d91PullRequestHeadRepoMergeCommitTitleXa0b29558.Serializer::class)
public sealed class InlineWebhookPullRequestRe0d91PullRequestHeadRepoMergeCommitTitleXa0b29558 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestRe0d91PullRequestHeadRepoMergeCommitTitleXa0b29558() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestRe0d91PullRequestHeadRepoMergeCommitTitleXa0b29558() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe0d91PullRequestHeadRepoMergeCommitTitleXa0b29558()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe0d91PullRequestHeadRepoMergeCommitTitleXa0b29558 = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0d91PullRequestHeadRepoMergeCommitTitleXa0b29558> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe0d91PullRequestHeadRepoMergeCommitTitleXa0b29558", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0d91PullRequestHeadRepoMergeCommitTitleXa0b29558 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0d91PullRequestHeadRepoMergeCommitTitleXa0b29558) {
      encoder.encodeString(value.value)
    }
  }
}
