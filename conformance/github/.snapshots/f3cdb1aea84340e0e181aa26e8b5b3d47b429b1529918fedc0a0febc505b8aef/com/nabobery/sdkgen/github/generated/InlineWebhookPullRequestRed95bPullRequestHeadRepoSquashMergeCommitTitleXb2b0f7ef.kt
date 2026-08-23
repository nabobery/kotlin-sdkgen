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
 * The default value for a squash merge commit title:
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
 * than one commit).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/head/properties/repo/properties/squash_merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestRed95bPullRequestHeadRepoSquashMergeCommitTitleXb2b0f7ef.Serializer::class)
public sealed class InlineWebhookPullRequestRed95bPullRequestHeadRepoSquashMergeCommitTitleXb2b0f7ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestRed95bPullRequestHeadRepoSquashMergeCommitTitleXb2b0f7ef() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhookPullRequestRed95bPullRequestHeadRepoSquashMergeCommitTitleXb2b0f7ef() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRed95bPullRequestHeadRepoSquashMergeCommitTitleXb2b0f7ef()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRed95bPullRequestHeadRepoSquashMergeCommitTitleXb2b0f7ef = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRed95bPullRequestHeadRepoSquashMergeCommitTitleXb2b0f7ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRed95bPullRequestHeadRepoSquashMergeCommitTitleXb2b0f7ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRed95bPullRequestHeadRepoSquashMergeCommitTitleXb2b0f7ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRed95bPullRequestHeadRepoSquashMergeCommitTitleXb2b0f7ef) {
      encoder.encodeString(value.value)
    }
  }
}
