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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/ba
 * se/properties/repo/properties/squash_merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestUn950ePullRequestBaseRepoSquashMergeCommitTitleX317d5a25.Serializer::class)
public sealed class InlineWebhookPullRequestUn950ePullRequestBaseRepoSquashMergeCommitTitleX317d5a25 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestUn950ePullRequestBaseRepoSquashMergeCommitTitleX317d5a25() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhookPullRequestUn950ePullRequestBaseRepoSquashMergeCommitTitleX317d5a25() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUn950ePullRequestBaseRepoSquashMergeCommitTitleX317d5a25()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUn950ePullRequestBaseRepoSquashMergeCommitTitleX317d5a25 = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUn950ePullRequestBaseRepoSquashMergeCommitTitleX317d5a25> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUn950ePullRequestBaseRepoSquashMergeCommitTitleX317d5a25", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUn950ePullRequestBaseRepoSquashMergeCommitTitleX317d5a25 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUn950ePullRequestBaseRepoSquashMergeCommitTitleX317d5a25) {
      encoder.encodeString(value.value)
    }
  }
}
