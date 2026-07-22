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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/base/properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestRe8fbbPullRequestBaseRepoMergeCommitTitleXd0166fce.Serializer::class)
public sealed class InlineWebhookPullRequestRe8fbbPullRequestBaseRepoMergeCommitTitleXd0166fce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestRe8fbbPullRequestBaseRepoMergeCommitTitleXd0166fce() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestRe8fbbPullRequestBaseRepoMergeCommitTitleXd0166fce() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe8fbbPullRequestBaseRepoMergeCommitTitleXd0166fce()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe8fbbPullRequestBaseRepoMergeCommitTitleXd0166fce = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestRe8fbbPullRequestBaseRepoMergeCommitTitleXd0166fce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe8fbbPullRequestBaseRepoMergeCommitTitleXd0166fce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe8fbbPullRequestBaseRepoMergeCommitTitleXd0166fce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe8fbbPullRequestBaseRepoMergeCommitTitleXd0166fce) {
      encoder.encodeString(value.value)
    }
  }
}
